package zendesk.support;

public final class GuideModule_ProvidesSettingsProviderFactory implements ry1<HelpCenterSettingsProvider> {
    private final GuideModule module;

    public GuideModule_ProvidesSettingsProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesSettingsProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesSettingsProviderFactory(guideModule);
    }

    public static HelpCenterSettingsProvider providesSettingsProvider(GuideModule guideModule) {
        return (HelpCenterSettingsProvider) fu4.m44415f(guideModule.providesSettingsProvider());
    }

    public HelpCenterSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
