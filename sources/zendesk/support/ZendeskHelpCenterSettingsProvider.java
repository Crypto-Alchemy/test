package zendesk.support;

import com.zendesk.logger.Logger;
import java.util.Locale;
import zendesk.core.SettingsPack;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

class ZendeskHelpCenterSettingsProvider implements HelpCenterSettingsProvider {
    private static final String HELP_CENTER_KEY = "help_center";
    private static final String LOG_TAG = "HelpCenterSettingsProvider";
    private final Locale deviceLocale;
    private final ZendeskLocaleConverter localeConverter;
    private final SettingsProvider sdkSettingsProvider;

    public ZendeskHelpCenterSettingsProvider(SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        this.sdkSettingsProvider = settingsProvider;
        this.localeConverter = zendeskLocaleConverter;
        this.deviceLocale = locale;
    }

    /* access modifiers changed from: private */
    public void logIfLocaleNotAvailable(HelpCenterSettings helpCenterSettings) {
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            String locale = helpCenterSettings.getLocale();
            String helpCenterLocaleString = this.localeConverter.toHelpCenterLocaleString(this.deviceLocale);
            if (!helpCenterLocaleString.equals(locale)) {
                Logger.m43087k(LOG_TAG, "No support for %s, Help Center is %s in your application settings", helpCenterLocaleString, Boolean.valueOf(helpCenterSettings.isEnabled()));
            }
        }
    }

    public void getSettings(final op7<HelpCenterSettings> op7) {
        this.sdkSettingsProvider.getSettingsForSdk(HELP_CENTER_KEY, HelpCenterSettings.class, new op7<SettingsPack<HelpCenterSettings>>() {
            public void onError(hr1 hr1) {
                if (op7 != null) {
                    Logger.m43078b(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Returning default Help Center Settings.", new Object[0]);
                    op7.onSuccess(HelpCenterSettings.defaultSettings());
                }
            }

            public void onSuccess(SettingsPack<HelpCenterSettings> settingsPack) {
                ZendeskHelpCenterSettingsProvider.this.logIfLocaleNotAvailable(settingsPack.getSettings());
                Logger.m43078b(ZendeskHelpCenterSettingsProvider.LOG_TAG, "Successfully retrieved Help Center Settings", new Object[0]);
                op7 op7 = op7;
                if (op7 != null) {
                    op7.onSuccess(settingsPack.getSettings());
                }
            }
        });
    }
}
