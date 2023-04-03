package zendesk.support;

import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

public final class ProviderModule_ProvideSdkSettingsProviderFactory implements ry1<SupportSettingsProvider> {
    private final ky4<ZendeskLocaleConverter> helpCenterLocaleConverterProvider;
    private final ky4<Locale> localeProvider;
    private final ProviderModule module;
    private final ky4<SettingsProvider> sdkSettingsProvider;

    public ProviderModule_ProvideSdkSettingsProviderFactory(ProviderModule providerModule, ky4<SettingsProvider> ky4, ky4<Locale> ky42, ky4<ZendeskLocaleConverter> ky43) {
        this.module = providerModule;
        this.sdkSettingsProvider = ky4;
        this.localeProvider = ky42;
        this.helpCenterLocaleConverterProvider = ky43;
    }

    public static ProviderModule_ProvideSdkSettingsProviderFactory create(ProviderModule providerModule, ky4<SettingsProvider> ky4, ky4<Locale> ky42, ky4<ZendeskLocaleConverter> ky43) {
        return new ProviderModule_ProvideSdkSettingsProviderFactory(providerModule, ky4, ky42, ky43);
    }

    public static SupportSettingsProvider provideSdkSettingsProvider(ProviderModule providerModule, SettingsProvider settingsProvider, Locale locale, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (SupportSettingsProvider) fu4.m44415f(providerModule.provideSdkSettingsProvider(settingsProvider, locale, zendeskLocaleConverter));
    }

    public SupportSettingsProvider get() {
        return provideSdkSettingsProvider(this.module, this.sdkSettingsProvider.get(), this.localeProvider.get(), this.helpCenterLocaleConverterProvider.get());
    }
}
