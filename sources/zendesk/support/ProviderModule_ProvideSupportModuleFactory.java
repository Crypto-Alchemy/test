package zendesk.support;

import zendesk.core.RestServiceProvider;

public final class ProviderModule_ProvideSupportModuleFactory implements ry1<SupportModule> {
    private final ky4<ArticleVoteStorage> articleVoteStorageProvider;
    private final ky4<SupportBlipsProvider> blipsProvider;
    private final ky4<HelpCenterProvider> helpCenterProvider;
    private final ProviderModule module;
    private final ky4<RequestProvider> requestProvider;
    private final ky4<RestServiceProvider> restServiceProvider;
    private final ky4<SupportSettingsProvider> settingsProvider;
    private final ky4<UploadProvider> uploadProvider;
    private final ky4<ZendeskTracker> zendeskTrackerProvider;

    public ProviderModule_ProvideSupportModuleFactory(ProviderModule providerModule, ky4<RequestProvider> ky4, ky4<UploadProvider> ky42, ky4<HelpCenterProvider> ky43, ky4<SupportSettingsProvider> ky44, ky4<RestServiceProvider> ky45, ky4<SupportBlipsProvider> ky46, ky4<ZendeskTracker> ky47, ky4<ArticleVoteStorage> ky48) {
        this.module = providerModule;
        this.requestProvider = ky4;
        this.uploadProvider = ky42;
        this.helpCenterProvider = ky43;
        this.settingsProvider = ky44;
        this.restServiceProvider = ky45;
        this.blipsProvider = ky46;
        this.zendeskTrackerProvider = ky47;
        this.articleVoteStorageProvider = ky48;
    }

    public static ProviderModule_ProvideSupportModuleFactory create(ProviderModule providerModule, ky4<RequestProvider> ky4, ky4<UploadProvider> ky42, ky4<HelpCenterProvider> ky43, ky4<SupportSettingsProvider> ky44, ky4<RestServiceProvider> ky45, ky4<SupportBlipsProvider> ky46, ky4<ZendeskTracker> ky47, ky4<ArticleVoteStorage> ky48) {
        return new ProviderModule_ProvideSupportModuleFactory(providerModule, ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48);
    }

    public static SupportModule provideSupportModule(ProviderModule providerModule, RequestProvider requestProvider2, UploadProvider uploadProvider2, HelpCenterProvider helpCenterProvider2, SupportSettingsProvider supportSettingsProvider, RestServiceProvider restServiceProvider2, SupportBlipsProvider supportBlipsProvider, Object obj, ArticleVoteStorage articleVoteStorage) {
        return (SupportModule) fu4.m44415f(providerModule.provideSupportModule(requestProvider2, uploadProvider2, helpCenterProvider2, supportSettingsProvider, restServiceProvider2, supportBlipsProvider, (ZendeskTracker) obj, articleVoteStorage));
    }

    public SupportModule get() {
        return provideSupportModule(this.module, this.requestProvider.get(), this.uploadProvider.get(), this.helpCenterProvider.get(), this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.zendeskTrackerProvider.get(), this.articleVoteStorageProvider.get());
    }
}
