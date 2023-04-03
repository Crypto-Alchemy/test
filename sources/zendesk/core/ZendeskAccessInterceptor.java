package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

class ZendeskAccessInterceptor implements Interceptor {
    private static final String EMPTY_JSON = "{}";
    private static final String LOG_TAG = "ZendeskAccessInterceptor";
    private static final int RETRY_LIMIT = 3;
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private int retryCounter;
    private Storage storage;

    public ZendeskAccessInterceptor(IdentityManager identityManager2, AccessProvider accessProvider2, Storage storage2, CoreSettingsStorage coreSettingsStorage2) {
        this.identityManager = identityManager2;
        this.accessProvider = accessProvider2;
        this.storage = storage2;
        this.coreSettingsStorage = coreSettingsStorage2;
    }

    private Response errorResponse(Interceptor.Chain chain, String str) {
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(400).message(str).body(ResponseBody.create(MediaType.parse(Constants.TEXT_JSON), EMPTY_JSON)).build();
    }

    public static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb = new StringBuilder(160);
        sb.append("The expected type of authentication is ");
        if (authenticationType == null) {
            sb.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            sb.append("jwt.");
        }
        sb.append(10);
        sb.append("The local identity is");
        if (identity == null) {
            sb.append(" not");
        }
        sb.append(" present.\n");
        if (identity != null) {
            sb.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                sb.append("jwt.");
            } else {
                sb.append("unknown.");
            }
        }
        return sb.toString();
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        bg5<AuthenticationResponse> bg5;
        Identity identity = this.identityManager.getIdentity();
        AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
        if (UrlHelper.isGuideRequest(chain.request().url().toString()) && (identity instanceof AnonymousIdentity)) {
            Logger.m43078b(LOG_TAG, "Anonymous Guide request, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        } else if (this.identityManager.getStoredAccessTokenAsBearerToken() != null) {
            Logger.m43078b(LOG_TAG, "Access token present, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        } else {
            Logger.m43078b(LOG_TAG, "Access token is required, intercepting.", new Object[0]);
            if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
                Logger.m43078b(LOG_TAG, "Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
                bg5 = this.accessProvider.getAuthTokenViaAnonymous((AnonymousIdentity) identity);
            } else if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                Logger.m43081e(LOG_TAG, errorLogMessage, new Object[0]);
                return errorResponse(chain, errorLogMessage);
            } else {
                Logger.m43078b(LOG_TAG, "JWT Identity found. Requesting and storing auth token.", new Object[0]);
                bg5 = this.accessProvider.getAuthTokenViaJwt((JwtIdentity) identity);
            }
            if (bg5 == null) {
                return errorResponse(chain, "Response was null, failed to auth user.");
            }
            if (bg5.mo50579b() == 409) {
                int i = this.retryCounter;
                if (i >= 3) {
                    return errorResponse(chain, "Response was 409, failed to auth user.");
                }
                this.retryCounter = i + 1;
                return intercept(chain);
            } else if (bg5.mo50578a() == null) {
                return errorResponse(chain, "Response body was null, failed to auth user.");
            } else {
                AccessToken authentication2 = bg5.mo50578a().getAuthentication();
                if (authentication2 != null) {
                    this.identityManager.storeAccessToken(authentication2);
                }
                this.retryCounter = 0;
                return chain.proceed(chain.request());
            }
        }
    }
}
