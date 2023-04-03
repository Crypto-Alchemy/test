package zendesk.support;

import java.util.Locale;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

final class DaggerGuideSdkProvidersComponent implements GuideSdkProvidersComponent {
    private ky4<BlipsProvider> getBlipsProvider;
    private ky4<RestServiceProvider> getRestServiceProvider;
    private ky4<SessionStorage> getSessionStorageProvider;
    private ky4<SettingsProvider> getSettingsProvider;
    private final DaggerGuideSdkProvidersComponent guideSdkProvidersComponent;
    private ky4<ArticleVoteStorage> provideArticleVoteStorageProvider;
    private ky4<HelpCenterCachingNetworkConfig> provideCustomNetworkConfigProvider;
    private ky4<Locale> provideDeviceLocaleProvider;
    private ky4<GuideModule> provideGuideModuleProvider;
    private ky4<HelpCenterCachingInterceptor> provideHelpCenterCachingInterceptorProvider;
    private ky4<HelpCenterProvider> provideHelpCenterProvider;
    private ky4<HelpCenterSessionCache> provideHelpCenterSessionCacheProvider;
    private ky4<HelpCenterSettingsProvider> provideSettingsProvider;
    private ky4<ZendeskHelpCenterService> provideZendeskHelpCenterServiceProvider;
    private ky4<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private ky4<HelpCenterBlipsProvider> providesHelpCenterBlipsProvider;
    private ky4<HelpCenterService> providesHelpCenterServiceProvider;

    public static final class Builder {
        private CoreModule coreModule;
        private GuideProviderModule guideProviderModule;

        public GuideSdkProvidersComponent build() {
            fu4.m44410a(this.coreModule, CoreModule.class);
            fu4.m44410a(this.guideProviderModule, GuideProviderModule.class);
            return new DaggerGuideSdkProvidersComponent(this.coreModule, this.guideProviderModule);
        }

        public Builder coreModule(CoreModule coreModule2) {
            this.coreModule = (CoreModule) fu4.m44411b(coreModule2);
            return this;
        }

        public Builder guideProviderModule(GuideProviderModule guideProviderModule2) {
            this.guideProviderModule = (GuideProviderModule) fu4.m44411b(guideProviderModule2);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule);
        this.provideZendeskLocaleConverterProvider = li1.m47821a(GuideProviderModule_ProvideZendeskLocaleConverterFactory.create());
        ky4<Locale> a = li1.m47821a(GuideProviderModule_ProvideDeviceLocaleFactory.create(guideProviderModule));
        this.provideDeviceLocaleProvider = a;
        this.provideSettingsProvider = li1.m47821a(GuideProviderModule_ProvideSettingsProviderFactory.create(guideProviderModule, this.getSettingsProvider, this.provideZendeskLocaleConverterProvider, a));
        CoreModule_GetBlipsProviderFactory create = CoreModule_GetBlipsProviderFactory.create(coreModule);
        this.getBlipsProvider = create;
        this.providesHelpCenterBlipsProvider = li1.m47821a(GuideProviderModule_ProvidesHelpCenterBlipsProviderFactory.create(guideProviderModule, create, this.provideDeviceLocaleProvider));
        this.getRestServiceProvider = CoreModule_GetRestServiceProviderFactory.create(coreModule);
        ky4<HelpCenterCachingInterceptor> a2 = i36.m45457a(GuideProviderModule_ProvideHelpCenterCachingInterceptorFactory.create());
        this.provideHelpCenterCachingInterceptorProvider = a2;
        ky4<HelpCenterCachingNetworkConfig> a3 = i36.m45457a(GuideProviderModule_ProvideCustomNetworkConfigFactory.create(a2));
        this.provideCustomNetworkConfigProvider = a3;
        ky4<HelpCenterService> a4 = li1.m47821a(GuideProviderModule_ProvidesHelpCenterServiceFactory.create(this.getRestServiceProvider, a3));
        this.providesHelpCenterServiceProvider = a4;
        this.provideZendeskHelpCenterServiceProvider = li1.m47821a(GuideProviderModule_ProvideZendeskHelpCenterServiceFactory.create(a4, this.provideZendeskLocaleConverterProvider));
        ky4<HelpCenterSessionCache> a5 = li1.m47821a(GuideProviderModule_ProvideHelpCenterSessionCacheFactory.create());
        this.provideHelpCenterSessionCacheProvider = a5;
        this.provideHelpCenterProvider = li1.m47821a(GuideProviderModule_ProvideHelpCenterProviderFactory.create(guideProviderModule, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, this.provideZendeskHelpCenterServiceProvider, a5));
        CoreModule_GetSessionStorageFactory create2 = CoreModule_GetSessionStorageFactory.create(coreModule);
        this.getSessionStorageProvider = create2;
        ky4<ArticleVoteStorage> a6 = li1.m47821a(GuideProviderModule_ProvideArticleVoteStorageFactory.create(create2));
        this.provideArticleVoteStorageProvider = a6;
        this.provideGuideModuleProvider = li1.m47821a(GuideProviderModule_ProvideGuideModuleFactory.create(guideProviderModule, this.provideHelpCenterProvider, this.provideSettingsProvider, this.providesHelpCenterBlipsProvider, a6, this.getRestServiceProvider));
    }

    private Guide injectGuide(Guide guide) {
        Guide_MembersInjector.injectGuideModule(guide, this.provideGuideModuleProvider.get());
        Guide_MembersInjector.injectBlipsProvider(guide, this.providesHelpCenterBlipsProvider.get());
        return guide;
    }

    public Guide inject(Guide guide) {
        return injectGuide(guide);
    }

    private DaggerGuideSdkProvidersComponent(CoreModule coreModule, GuideProviderModule guideProviderModule) {
        this.guideSdkProvidersComponent = this;
        initialize(coreModule, guideProviderModule);
    }
}
