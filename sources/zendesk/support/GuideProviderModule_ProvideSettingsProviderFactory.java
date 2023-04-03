package zendesk.support;

import java.util.Locale;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

public final class GuideProviderModule_ProvideSettingsProviderFactory implements ry1<HelpCenterSettingsProvider> {
    private final ky4<ZendeskLocaleConverter> localeConverterProvider;
    private final ky4<Locale> localeProvider;
    private final GuideProviderModule module;
    private final ky4<SettingsProvider> sdkSettingsProvider;

    public GuideProviderModule_ProvideSettingsProviderFactory(GuideProviderModule guideProviderModule, ky4<SettingsProvider> ky4, ky4<ZendeskLocaleConverter> ky42, ky4<Locale> ky43) {
        this.module = guideProviderModule;
        this.sdkSettingsProvider = ky4;
        this.localeConverterProvider = ky42;
        this.localeProvider = ky43;
    }

    public static GuideProviderModule_ProvideSettingsProviderFactory create(GuideProviderModule guideProviderModule, ky4<SettingsProvider> ky4, ky4<ZendeskLocaleConverter> ky42, ky4<Locale> ky43) {
        return new GuideProviderModule_ProvideSettingsProviderFactory(guideProviderModule, ky4, ky42, ky43);
    }

    public static HelpCenterSettingsProvider provideSettingsProvider(GuideProviderModule guideProviderModule, SettingsProvider settingsProvider, ZendeskLocaleConverter zendeskLocaleConverter, Locale locale) {
        return (HelpCenterSettingsProvider) fu4.m44415f(guideProviderModule.provideSettingsProvider(settingsProvider, zendeskLocaleConverter, locale));
    }

    public HelpCenterSettingsProvider get() {
        return provideSettingsProvider(this.module, this.sdkSettingsProvider.get(), this.localeConverterProvider.get(), this.localeProvider.get());
    }
}
