package zendesk.support;

import zendesk.core.RestServiceProvider;

public final class GuideProviderModule_ProvideGuideModuleFactory implements ry1<GuideModule> {
    private final ky4<ArticleVoteStorage> articleVoteStorageProvider;
    private final ky4<HelpCenterBlipsProvider> blipsProvider;
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final GuideProviderModule module;
    private final ky4<RestServiceProvider> restServiceProvider;
    private final ky4<HelpCenterSettingsProvider> settingsProvider;

    public GuideProviderModule_ProvideGuideModuleFactory(GuideProviderModule guideProviderModule, ky4<HelpCenterProvider> ky4, ky4<HelpCenterSettingsProvider> ky42, ky4<HelpCenterBlipsProvider> ky43, ky4<ArticleVoteStorage> ky44, ky4<RestServiceProvider> ky45) {
        this.module = guideProviderModule;
        this.helpCenterProvider = ky4;
        this.settingsProvider = ky42;
        this.blipsProvider = ky43;
        this.articleVoteStorageProvider = ky44;
        this.restServiceProvider = ky45;
    }

    public static GuideProviderModule_ProvideGuideModuleFactory create(GuideProviderModule guideProviderModule, ky4<HelpCenterProvider> ky4, ky4<HelpCenterSettingsProvider> ky42, ky4<HelpCenterBlipsProvider> ky43, ky4<ArticleVoteStorage> ky44, ky4<RestServiceProvider> ky45) {
        return new GuideProviderModule_ProvideGuideModuleFactory(guideProviderModule, ky4, ky42, ky43, ky44, ky45);
    }

    public static GuideModule provideGuideModule(GuideProviderModule guideProviderModule, HelpCenterProvider helpCenterProvider2, HelpCenterSettingsProvider helpCenterSettingsProvider, HelpCenterBlipsProvider helpCenterBlipsProvider, ArticleVoteStorage articleVoteStorage, RestServiceProvider restServiceProvider2) {
        return (GuideModule) fu4.m44415f(guideProviderModule.provideGuideModule(helpCenterProvider2, helpCenterSettingsProvider, helpCenterBlipsProvider, articleVoteStorage, restServiceProvider2));
    }

    public GuideModule get() {
        return provideGuideModule(this.module, this.helpCenterProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.articleVoteStorageProvider.get(), this.restServiceProvider.get());
    }
}
