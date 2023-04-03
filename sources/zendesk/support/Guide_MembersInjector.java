package zendesk.support;

public final class Guide_MembersInjector implements ts3<Guide> {
    private final ky4<HelpCenterBlipsProvider> blipsProvider;
    private final ky4<GuideModule> guideModuleProvider;

    public Guide_MembersInjector(ky4<GuideModule> ky4, ky4<HelpCenterBlipsProvider> ky42) {
        this.guideModuleProvider = ky4;
        this.blipsProvider = ky42;
    }

    public static ts3<Guide> create(ky4<GuideModule> ky4, ky4<HelpCenterBlipsProvider> ky42) {
        return new Guide_MembersInjector(ky4, ky42);
    }

    public static void injectBlipsProvider(Guide guide, HelpCenterBlipsProvider helpCenterBlipsProvider) {
        guide.blipsProvider = helpCenterBlipsProvider;
    }

    public static void injectGuideModule(Guide guide, GuideModule guideModule) {
        guide.guideModule = guideModule;
    }

    public void injectMembers(Guide guide) {
        injectGuideModule(guide, this.guideModuleProvider.get());
        injectBlipsProvider(guide, this.blipsProvider.get());
    }
}
