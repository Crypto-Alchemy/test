package zendesk.core;

import android.content.Context;
import com.zendesk.logger.Logger;

public enum Zendesk {
    INSTANCE;
    
    private static final String LOG_TAG = "Zendesk";
    private ActionHandlerRegistry actionHandlerRegistry;
    private ZendeskShadow zendeskShadow;

    public static boolean checkConfig(Context context, String str, String str2, String str3) {
        if (context != null) {
            if (kb6.m46950c(str, str2, str3)) {
                return true;
            }
        }
        Logger.m43081e(LOG_TAG, String.format("Invalid zendesk configuration provided | Context: %b | Url: %b | Application Id: %b | OauthClientId: %b", new Object[]{context, Boolean.valueOf(kb6.m46949b(str)), Boolean.valueOf(kb6.m46949b(str2)), Boolean.valueOf(kb6.m46949b(str3))}), new Object[0]);
        return false;
    }

    public ActionHandlerRegistry actionHandlerRegistry() {
        return this.actionHandlerRegistry;
    }

    public CoreModule coreModule() {
        if (isInitialized()) {
            return this.zendeskShadow.coreModule();
        }
        Logger.m43081e(LOG_TAG, "Cannot get CoreModule before SDK has been initialized. init() must be called before coreModule().", new Object[0]);
        return null;
    }

    public Identity getIdentity() {
        if (!isInitialized()) {
            return null;
        }
        return this.zendeskShadow.getIdentity();
    }

    public void init(Context context, String str, String str2, String str3) {
        checkConfig(context, str, str2, str3);
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration(str2, str, str3);
        init(DaggerZendeskApplicationComponent.builder().zendeskApplicationModule(new ZendeskApplicationModule(context, applicationConfiguration)).build(), applicationConfiguration);
    }

    public boolean isInitialized() {
        if (this.zendeskShadow != null) {
            return true;
        }
        return false;
    }

    public ProviderStore provider() {
        if (!isInitialized()) {
            Logger.m43081e(LOG_TAG, "Cannot get ProviderStore before SDK has been initialized. init() must be called before provider().", new Object[0]);
            return null;
        } else if (getIdentity() != null) {
            return this.zendeskShadow.providers();
        } else {
            Logger.m43081e(LOG_TAG, "Cannot get ProviderStore before an identity has been set. Zendesk.INSTANCE.setIdentity() must be called before provider().", new Object[0]);
            return null;
        }
    }

    public void reset() {
        if (isInitialized()) {
            this.zendeskShadow.reset();
            this.zendeskShadow = null;
            Logger.m43083g(LOG_TAG, "Tearing down Zendesk", new Object[0]);
            return;
        }
        Logger.m43083g(LOG_TAG, "Cant reset, Zendesk is uninitialized", new Object[0]);
    }

    public void setIdentity(Identity identity) {
        if (!isInitialized()) {
            Logger.m43081e(LOG_TAG, "Cannot get set identity before SDK has been initialized. init() must be called before setIdentity(...).", new Object[0]);
        } else {
            this.zendeskShadow.setIdentity(identity);
        }
    }

    public void init(ZendeskApplicationComponent zendeskApplicationComponent, ApplicationConfiguration applicationConfiguration) {
        ZendeskShadow zendeskShadow2 = this.zendeskShadow;
        boolean z = zendeskShadow2 != null;
        if (z) {
            zendeskShadow2.cleanupIfNewConfig(applicationConfiguration);
        }
        ZendeskShadow zendeskShadow3 = zendeskApplicationComponent.zendeskShadow();
        zendeskShadow3.init(applicationConfiguration, z);
        this.zendeskShadow = zendeskShadow3;
    }
}
