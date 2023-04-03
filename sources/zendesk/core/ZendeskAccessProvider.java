package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;

class ZendeskAccessProvider implements AccessProvider {
    private static final String LOG_TAG = "ZendeskAccessProvider";
    private final AccessService accessService;
    private final IdentityManager identityManager;

    public ZendeskAccessProvider(IdentityManager identityManager2, AccessService accessService2) {
        this.identityManager = identityManager2;
        this.accessService = accessService2;
    }

    public bg5<AuthenticationResponse> getAuthTokenViaAnonymous(AnonymousIdentity anonymousIdentity) {
        Logger.m43078b(LOG_TAG, "Requesting an access token for anonymous identity.", new Object[0]);
        try {
            return this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).execute();
        } catch (IOException e) {
            Logger.m43080d(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }

    public bg5<AuthenticationResponse> getAuthTokenViaJwt(JwtIdentity jwtIdentity) {
        Logger.m43078b(LOG_TAG, "Requesting an access token for jwt identity.", new Object[0]);
        if (kb6.m46951d(jwtIdentity.getJwtUserIdentifier())) {
            Logger.m43081e(LOG_TAG, AccessProvider.NO_JWT_ERROR_MESSAGE, new Object[0]);
            return null;
        }
        try {
            return this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).execute();
        } catch (IOException e) {
            Logger.m43080d(LOG_TAG, e.getMessage(), e, new Object[0]);
            return null;
        }
    }
}
