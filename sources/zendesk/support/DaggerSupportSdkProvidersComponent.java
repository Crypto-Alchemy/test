package zendesk.support;

import android.content.Context;
import java.util.Locale;
import zendesk.core.AuthenticationProvider;
import zendesk.core.BlipsProvider;
import zendesk.core.CoreModule;
import zendesk.core.CoreModule_ActionHandlerRegistryFactory;
import zendesk.core.CoreModule_GetApplicationContextFactory;
import zendesk.core.CoreModule_GetAuthenticationProviderFactory;
import zendesk.core.CoreModule_GetBlipsProviderFactory;
import zendesk.core.CoreModule_GetMemoryCacheFactory;
import zendesk.core.CoreModule_GetRestServiceProviderFactory;
import zendesk.core.CoreModule_GetSessionStorageFactory;
import zendesk.core.CoreModule_GetSettingsProviderFactory;
import zendesk.core.MemoryCache;
import zendesk.core.RestServiceProvider;
import zendesk.core.SessionStorage;
import zendesk.core.SettingsProvider;
import zendesk.core.ZendeskLocaleConverter;

final class DaggerSupportSdkProvidersComponent implements SupportSdkProvidersComponent {
    private final CoreModule coreModule;
    private ky4<Context> getApplicationContextProvider;
    private ky4<AuthenticationProvider> getAuthenticationProvider;
    private ky4<BlipsProvider> getBlipsProvider;
    private ky4<MemoryCache> getMemoryCacheProvider;
    private ky4<RestServiceProvider> getRestServiceProvider;
    private ky4<SessionStorage> getSessionStorageProvider;
    private ky4<SettingsProvider> getSettingsProvider;
    private ky4<Locale> provideLocaleProvider;
    private ky4<SupportSdkMetadata> provideMetadataProvider;
    private ky4<ProviderStore> provideProviderStoreProvider;
    private ky4<RequestMigrator> provideRequestMigratorProvider;
    private ky4<RequestProvider> provideRequestProvider;
    private ky4<RequestSessionCache> provideRequestSessionCacheProvider;
    private ky4<RequestStorage> provideRequestStorageProvider;
    private ky4<SupportSettingsProvider> provideSdkSettingsProvider;
    private ky4<SupportBlipsProvider> provideSupportBlipsProvider;
    private ky4<SupportModule> provideSupportModuleProvider;
    private ky4<UploadProvider> provideUploadProvider;
    private ky4<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private ky4<ZendeskRequestService> provideZendeskRequestServiceProvider;
    private ky4<ZendeskUploadService> provideZendeskUploadServiceProvider;
    private ky4<ArticleVoteStorage> providesArticleVoteStorageProvider;
    private ky4<HelpCenterProvider> providesHelpCenterProvider;
    private ky4<RequestService> providesRequestServiceProvider;
    private ky4<UploadService> providesUploadServiceProvider;
    private ky4<ZendeskTracker> providesZendeskTrackerProvider;
    private final DaggerSupportSdkProvidersComponent supportSdkProvidersComponent;

    public static final class Builder {
        private CoreModule coreModule;
        private GuideModule guideModule;
        private ProviderModule providerModule;
        private StorageModule storageModule;
        private SupportApplicationModule supportApplicationModule;

        public SupportSdkProvidersComponent build() {
            fu4.m44410a(this.supportApplicationModule, SupportApplicationModule.class);
            fu4.m44410a(this.coreModule, CoreModule.class);
            if (this.providerModule == null) {
                this.providerModule = new ProviderModule();
            }
            fu4.m44410a(this.guideModule, GuideModule.class);
            if (this.storageModule == null) {
                this.storageModule = new StorageModule();
            }
            return new DaggerSupportSdkProvidersComponent(this.supportApplicationModule, this.coreModule, this.providerModule, this.guideModule, this.storageModule);
        }

        public Builder coreModule(CoreModule coreModule2) {
            this.coreModule = (CoreModule) fu4.m44411b(coreModule2);
            return this;
        }

        public Builder guideModule(GuideModule guideModule2) {
            this.guideModule = (GuideModule) fu4.m44411b(guideModule2);
            return this;
        }

        public Builder providerModule(ProviderModule providerModule2) {
            this.providerModule = (ProviderModule) fu4.m44411b(providerModule2);
            return this;
        }

        @Deprecated
        public Builder serviceModule(ServiceModule serviceModule) {
            fu4.m44411b(serviceModule);
            return this;
        }

        public Builder storageModule(StorageModule storageModule2) {
            this.storageModule = (StorageModule) fu4.m44411b(storageModule2);
            return this;
        }

        public Builder supportApplicationModule(SupportApplicationModule supportApplicationModule2) {
            this.supportApplicationModule = (SupportApplicationModule) fu4.m44411b(supportApplicationModule2);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(SupportApplicationModule supportApplicationModule, CoreModule coreModule2, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.providesHelpCenterProvider = GuideModule_ProvidesHelpCenterProviderFactory.create(guideModule);
        this.getSettingsProvider = CoreModule_GetSettingsProviderFactory.create(coreModule2);
        this.provideLocaleProvider = li1.m47821a(SupportApplicationModule_ProvideLocaleFactory.create(supportApplicationModule));
        ky4<ZendeskLocaleConverter> a = li1.m47821a(ProviderModule_ProvideZendeskLocaleConverterFactory.create(providerModule));
        this.provideZendeskLocaleConverterProvider = a;
        this.provideSdkSettingsProvider = li1.m47821a(ProviderModule_ProvideSdkSettingsProviderFactory.create(providerModule, this.getSettingsProvider, this.provideLocaleProvider, a));
        this.getAuthenticationProvider = CoreModule_GetAuthenticationProviderFactory.create(coreModule2);
        CoreModule_GetRestServiceProviderFactory create = CoreModule_GetRestServiceProviderFactory.create(coreModule2);
        this.getRestServiceProvider = create;
        ky4<RequestService> a2 = li1.m47821a(ServiceModule_ProvidesRequestServiceFactory.create(create));
        this.providesRequestServiceProvider = a2;
        this.provideZendeskRequestServiceProvider = li1.m47821a(ServiceModule_ProvideZendeskRequestServiceFactory.create(a2));
        this.getSessionStorageProvider = CoreModule_GetSessionStorageFactory.create(coreModule2);
        CoreModule_GetApplicationContextFactory create2 = CoreModule_GetApplicationContextFactory.create(coreModule2);
        this.getApplicationContextProvider = create2;
        this.provideRequestMigratorProvider = li1.m47821a(StorageModule_ProvideRequestMigratorFactory.create(storageModule, create2));
        CoreModule_GetMemoryCacheFactory create3 = CoreModule_GetMemoryCacheFactory.create(coreModule2);
        this.getMemoryCacheProvider = create3;
        this.provideRequestStorageProvider = li1.m47821a(StorageModule_ProvideRequestStorageFactory.create(storageModule, this.getSessionStorageProvider, this.provideRequestMigratorProvider, create3));
        this.provideRequestSessionCacheProvider = li1.m47821a(StorageModule_ProvideRequestSessionCacheFactory.create(storageModule));
        this.providesZendeskTrackerProvider = li1.m47821a(SupportApplicationModule_ProvidesZendeskTrackerFactory.create(supportApplicationModule));
        this.provideMetadataProvider = li1.m47821a(SupportApplicationModule_ProvideMetadataFactory.create(supportApplicationModule, this.getApplicationContextProvider));
        CoreModule_GetBlipsProviderFactory create4 = CoreModule_GetBlipsProviderFactory.create(coreModule2);
        this.getBlipsProvider = create4;
        ky4<SupportBlipsProvider> a3 = li1.m47821a(ProviderModule_ProvideSupportBlipsProviderFactory.create(providerModule, create4));
        this.provideSupportBlipsProvider = a3;
        ProviderModule providerModule2 = providerModule;
        this.provideRequestProvider = li1.m47821a(ProviderModule_ProvideRequestProviderFactory.create(providerModule2, this.provideSdkSettingsProvider, this.getAuthenticationProvider, this.provideZendeskRequestServiceProvider, this.provideRequestStorageProvider, this.provideRequestSessionCacheProvider, this.providesZendeskTrackerProvider, this.provideMetadataProvider, a3));
        ky4<UploadService> a4 = li1.m47821a(ServiceModule_ProvidesUploadServiceFactory.create(this.getRestServiceProvider));
        this.providesUploadServiceProvider = a4;
        ky4<ZendeskUploadService> a5 = li1.m47821a(ServiceModule_ProvideZendeskUploadServiceFactory.create(a4));
        this.provideZendeskUploadServiceProvider = a5;
        ky4<UploadProvider> a6 = li1.m47821a(ProviderModule_ProvideUploadProviderFactory.create(providerModule, a5));
        this.provideUploadProvider = a6;
        this.provideProviderStoreProvider = li1.m47821a(ProviderModule_ProvideProviderStoreFactory.create(providerModule, this.providesHelpCenterProvider, this.provideRequestProvider, a6));
        GuideModule_ProvidesArticleVoteStorageFactory create5 = GuideModule_ProvidesArticleVoteStorageFactory.create(guideModule);
        this.providesArticleVoteStorageProvider = create5;
        this.provideSupportModuleProvider = li1.m47821a(ProviderModule_ProvideSupportModuleFactory.create(providerModule2, this.provideRequestProvider, this.provideUploadProvider, this.providesHelpCenterProvider, this.provideSdkSettingsProvider, this.getRestServiceProvider, this.provideSupportBlipsProvider, this.providesZendeskTrackerProvider, create5));
    }

    private Support injectSupport(Support support) {
        Support_MembersInjector.injectProviderStore(support, this.provideProviderStoreProvider.get());
        Support_MembersInjector.injectSupportModule(support, this.provideSupportModuleProvider.get());
        Support_MembersInjector.injectRequestMigrator(support, this.provideRequestMigratorProvider.get());
        Support_MembersInjector.injectBlipsProvider(support, this.provideSupportBlipsProvider.get());
        Support_MembersInjector.injectActionHandlerRegistry(support, CoreModule_ActionHandlerRegistryFactory.actionHandlerRegistry(this.coreModule));
        Support_MembersInjector.injectRequestProvider(support, this.provideRequestProvider.get());
        Support_MembersInjector.injectAuthenticationProvider(support, CoreModule_GetAuthenticationProviderFactory.getAuthenticationProvider(this.coreModule));
        return support;
    }

    public Support inject(Support support) {
        return injectSupport(support);
    }

    private DaggerSupportSdkProvidersComponent(SupportApplicationModule supportApplicationModule, CoreModule coreModule2, ProviderModule providerModule, GuideModule guideModule, StorageModule storageModule) {
        this.supportSdkProvidersComponent = this;
        this.coreModule = coreModule2;
        initialize(supportApplicationModule, coreModule2, providerModule, guideModule, storageModule);
    }
}
