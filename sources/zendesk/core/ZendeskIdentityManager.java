package zendesk.core;

import com.zendesk.logger.Logger;
import java.util.Locale;

class ZendeskIdentityManager implements IdentityManager {
    private static final String LOG_TAG = "ZendeskIdentityManager";
    private final IdentityStorage identityStorage;

    public ZendeskIdentityManager(IdentityStorage identityStorage2) {
        this.identityStorage = identityStorage2;
    }

    public String getBlipsUuid() {
        String blipsUuid = this.identityStorage.getBlipsUuid();
        if (kb6.m46951d(blipsUuid)) {
            return this.identityStorage.updateBlipsUuid();
        }
        return blipsUuid;
    }

    public Identity getIdentity() {
        Identity identity = this.identityStorage.getIdentity();
        if (!(identity instanceof AnonymousIdentity)) {
            return identity;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) identity;
        anonymousIdentity.setSdkGuid(getSdkGuid());
        return anonymousIdentity;
    }

    public String getSdkGuid() {
        String uuid = this.identityStorage.getUuid();
        if (kb6.m46951d(uuid)) {
            return this.identityStorage.updateSdkGuid();
        }
        return uuid;
    }

    public String getStoredAccessTokenAsBearerToken() {
        AccessToken storedAccessToken = this.identityStorage.getStoredAccessToken();
        if (storedAccessToken != null) {
            return String.format(Locale.US, Constants.AUTHORIZATION_BEARER_FORMAT, new Object[]{storedAccessToken.getAccessToken()});
        }
        Logger.m43087k(LOG_TAG, "There is no stored access token, have you initialised an identity and requested an access token?", new Object[0]);
        return null;
    }

    public Long getUserId() {
        return this.identityStorage.getUserId();
    }

    public boolean identityIsDifferent(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null || identity == null || !identity2.equals(identity)) {
            return true;
        }
        return false;
    }

    public void storeAccessToken(AccessToken accessToken) {
        if (accessToken == null) {
            Logger.m43087k(LOG_TAG, "Access Token object was null, cannot store.", new Object[0]);
            return;
        }
        if (!kb6.m46951d(accessToken.getAccessToken())) {
            this.identityStorage.storeAccessToken(accessToken);
        } else {
            Logger.m43087k(LOG_TAG, "Access token String was null or empty, cannot store.", new Object[0]);
        }
        String userId = accessToken.getUserId();
        if (kb6.m46952e(userId)) {
            this.identityStorage.storeUserId(Long.valueOf(userId));
        } else {
            Logger.m43087k(LOG_TAG, "User ID String was null or empty, cannot store.", new Object[0]);
        }
    }

    public Identity updateAndPersistIdentity(Identity identity) {
        Identity identity2 = this.identityStorage.getIdentity();
        if (identity2 == null) {
            Logger.m43078b(LOG_TAG, "No previous identity set, storing identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        } else if (identity == null || !identityIsDifferent(identity)) {
            return identity2;
        } else {
            Logger.m43078b(LOG_TAG, "Identity has changed, storing new identity", new Object[0]);
            this.identityStorage.storeIdentity(identity);
            return identity;
        }
    }
}
