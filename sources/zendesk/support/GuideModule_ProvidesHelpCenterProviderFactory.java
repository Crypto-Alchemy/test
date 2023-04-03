package zendesk.support;

public final class GuideModule_ProvidesHelpCenterProviderFactory implements ry1<HelpCenterProvider> {
    private final GuideModule module;

    public GuideModule_ProvidesHelpCenterProviderFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesHelpCenterProviderFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesHelpCenterProviderFactory(guideModule);
    }

    public static HelpCenterProvider providesHelpCenterProvider(GuideModule guideModule) {
        return (HelpCenterProvider) fu4.m44415f(guideModule.providesHelpCenterProvider());
    }

    public HelpCenterProvider get() {
        return providesHelpCenterProvider(this.module);
    }
}
