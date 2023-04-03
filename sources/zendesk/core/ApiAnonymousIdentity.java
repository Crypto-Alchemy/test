package zendesk.core;

import com.zendesk.logger.Logger;

class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    public ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (kb6.m46951d(str)) {
            this.sdkGuid = "";
            Logger.m43087k(LOG_TAG, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            Logger.m43087k(LOG_TAG, "Identity is null.", new Object[0]);
            return;
        }
        this.email = anonymousIdentity.getEmail();
        this.name = anonymousIdentity.getName();
    }
}
