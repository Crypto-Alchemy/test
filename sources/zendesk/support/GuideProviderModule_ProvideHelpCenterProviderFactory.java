package zendesk.support;

public final class GuideProviderModule_ProvideHelpCenterProviderFactory implements ry1<HelpCenterProvider> {
    private final ky4<HelpCenterBlipsProvider> blipsProvider;
    private final ky4<ZendeskHelpCenterService> helpCenterServiceProvider;
    private final ky4<HelpCenterSessionCache> helpCenterSessionCacheProvider;
    private final GuideProviderModule module;
    private final ky4<HelpCenterSettingsProvider> settingsProvider;

    public GuideProviderModule_ProvideHelpCenterProviderFactory(GuideProviderModule guideProviderModule, ky4<HelpCenterSettingsProvider> ky4, ky4<HelpCenterBlipsProvider> ky42, ky4<ZendeskHelpCenterService> ky43, ky4<HelpCenterSessionCache> ky44) {
        this.module = guideProviderModule;
        this.settingsProvider = ky4;
        this.blipsProvider = ky42;
        this.helpCenterServiceProvider = ky43;
        this.helpCenterSessionCacheProvider = ky44;
    }

    public static GuideProviderModule_ProvideHelpCenterProviderFactory create(GuideProviderModule guideProviderModule, ky4<HelpCenterSettingsProvider> ky4, ky4<HelpCenterBlipsProvider> ky42, ky4<ZendeskHelpCenterService> ky43, ky4<HelpCenterSessionCache> ky44) {
        return new GuideProviderModule_ProvideHelpCenterProviderFactory(guideProviderModule, ky4, ky42, ky43, ky44);
    }

    public static HelpCenterProvider provideHelpCenterProvider(GuideProviderModule guideProviderModule, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, Object obj, Object obj2) {
        return (HelpCenterProvider) fu4.m44415f(guideProviderModule.provideHelpCenterProvider(helpCenterSettingsProvider, helpCenterBlipsProvider, (ZendeskHelpCenterService) obj, (HelpCenterSessionCache) obj2));
    }

    public HelpCenterProvider get() {
        return provideHelpCenterProvider(this.module, this.settingsProvider.get(), this.blipsProvider.get(), this.helpCenterServiceProvider.get(), this.helpCenterSessionCacheProvider.get());
    }
}
