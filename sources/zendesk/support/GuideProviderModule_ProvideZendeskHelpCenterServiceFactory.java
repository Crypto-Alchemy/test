package zendesk.support;

import zendesk.core.ZendeskLocaleConverter;

public final class GuideProviderModule_ProvideZendeskHelpCenterServiceFactory implements ry1<ZendeskHelpCenterService> {
    private final ky4<HelpCenterService> helpCenterServiceProvider;
    private final ky4<ZendeskLocaleConverter> localeConverterProvider;

    public GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(ky4<HelpCenterService> ky4, ky4<ZendeskLocaleConverter> ky42) {
        this.helpCenterServiceProvider = ky4;
        this.localeConverterProvider = ky42;
    }

    public static GuideProviderModule_ProvideZendeskHelpCenterServiceFactory create(ky4<HelpCenterService> ky4, ky4<ZendeskLocaleConverter> ky42) {
        return new GuideProviderModule_ProvideZendeskHelpCenterServiceFactory(ky4, ky42);
    }

    public static ZendeskHelpCenterService provideZendeskHelpCenterService(Object obj, ZendeskLocaleConverter zendeskLocaleConverter) {
        return (ZendeskHelpCenterService) fu4.m44415f(GuideProviderModule.provideZendeskHelpCenterService((HelpCenterService) obj, zendeskLocaleConverter));
    }

    public ZendeskHelpCenterService get() {
        return provideZendeskHelpCenterService(this.helpCenterServiceProvider.get(), this.localeConverterProvider.get());
    }
}
