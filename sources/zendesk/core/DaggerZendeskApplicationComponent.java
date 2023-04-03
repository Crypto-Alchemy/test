package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.gson.Gson;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

final class DaggerZendeskApplicationComponent implements ZendeskApplicationComponent {
    private ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private ky4<AcceptLanguageHeaderInterceptor> provideAcceptLanguageHeaderInterceptorProvider;
    private ky4<ZendeskAccessInterceptor> provideAccessInterceptorProvider;
    private ky4<AccessProvider> provideAccessProvider;
    private ky4<AccessService> provideAccessServiceProvider;
    private ky4<BaseStorage> provideAdditionalSdkBaseStorageProvider;
    private ky4<ApplicationConfiguration> provideApplicationConfigurationProvider;
    private ky4<Context> provideApplicationContextProvider;
    private ky4<ZendeskAuthHeaderInterceptor> provideAuthHeaderInterceptorProvider;
    private ky4<AuthenticationProvider> provideAuthProvider;
    private ky4<Serializer> provideBase64SerializerProvider;
    private ky4<OkHttpClient> provideBaseOkHttpClientProvider;
    private ky4<BlipsService> provideBlipsServiceProvider;
    private ky4<Cache> provideCacheProvider;
    private ky4<CachingInterceptor> provideCachingInterceptorProvider;
    private ky4<OkHttpClient> provideCoreOkHttpClientProvider;
    private ky4<og5> provideCoreRetrofitProvider;
    private ky4<CoreModule> provideCoreSdkModuleProvider;
    private ky4<CoreSettingsStorage> provideCoreSettingsStorageProvider;
    private ky4<DeviceInfo> provideDeviceInfoProvider;
    private ky4<ScheduledExecutorService> provideExecutorProvider;
    private ky4<ExecutorService> provideExecutorServiceProvider;
    private ky4<Gson> provideGsonProvider;
    private ky4<HttpLoggingInterceptor> provideHttpLoggingInterceptorProvider;
    private ky4<BaseStorage> provideIdentityBaseStorageProvider;
    private ky4<IdentityManager> provideIdentityManagerProvider;
    private ky4<IdentityStorage> provideIdentityStorageProvider;
    private ky4<SharedPreferencesStorage> provideLegacyIdentityBaseStorageProvider;
    private ky4<LegacyIdentityMigrator> provideLegacyIdentityStorageProvider;
    private ky4<SharedPreferencesStorage> provideLegacyPushBaseStorageProvider;
    private ky4<MachineIdStorage> provideMachineIdStorageProvider;
    private ky4<OkHttpClient> provideMediaOkHttpClientProvider;
    private ky4<MemoryCache> provideMemoryCacheProvider;
    private ky4<OkHttpClient> provideOkHttpClientProvider;
    private ky4<ProviderStore> provideProviderStoreProvider;
    private ky4<PushDeviceIdStorage> providePushDeviceIdStorageProvider;
    private ky4<ZendeskPushInterceptor> providePushInterceptorProvider;
    private ky4<og5> providePushProviderRetrofitProvider;
    private ky4<PushRegistrationProvider> providePushRegistrationProvider;
    private ky4<PushRegistrationProviderInternal> providePushRegistrationProviderInternalProvider;
    private ky4<PushRegistrationService> providePushRegistrationServiceProvider;
    private ky4<RestServiceProvider> provideRestServiceProvider;
    private ky4<og5> provideRetrofitProvider;
    private ky4<BaseStorage> provideSdkBaseStorageProvider;
    private ky4<SettingsProvider> provideSdkSettingsProvider;
    private ky4<SdkSettingsProviderInternal> provideSdkSettingsProviderInternalProvider;
    private ky4<SdkSettingsService> provideSdkSettingsServiceProvider;
    private ky4<Storage> provideSdkStorageProvider;
    private ky4<Serializer> provideSerializerProvider;
    private ky4<SessionStorage> provideSessionStorageProvider;
    private ky4<BaseStorage> provideSettingsBaseStorageProvider;
    private ky4<ZendeskSettingsInterceptor> provideSettingsInterceptorProvider;
    private ky4<SettingsStorage> provideSettingsStorageProvider;
    private ky4<UserProvider> provideUserProvider;
    private ky4<UserService> provideUserServiceProvider;
    private ky4<ZendeskOauthIdHeaderInterceptor> provideZendeskBasicHeadersInterceptorProvider;
    private ky4<ZendeskLocaleConverter> provideZendeskLocaleConverterProvider;
    private ky4<ZendeskShadow> provideZendeskProvider;
    private ky4<ZendeskSettingsProvider> provideZendeskSdkSettingsProvider;
    private ky4<ZendeskUnauthorizedInterceptor> provideZendeskUnauthorizedInterceptorProvider;
    private ky4<BlipsCoreProvider> providerBlipsCoreProvider;
    private ky4<BlipsProvider> providerBlipsProvider;
    private ky4<ConnectivityManager> providerConnectivityManagerProvider;
    private ky4<NetworkInfoProvider> providerNetworkInfoProvider;
    private ky4<ZendeskBlipsProvider> providerZendeskBlipsProvider;
    private ky4<AcceptHeaderInterceptor> providesAcceptHeaderInterceptorProvider;
    private ky4<File> providesBelvedereDirProvider;
    private ky4<File> providesCacheDirProvider;
    private ky4<File> providesDataDirProvider;
    private ky4<BaseStorage> providesDiskLruStorageProvider;
    private ky4<UserAgentAndClientHeadersInterceptor> providesUserAgentHeaderInterceptorProvider;
    private final DaggerZendeskApplicationComponent zendeskApplicationComponent;

    public static final class Builder {
        private ZendeskApplicationModule zendeskApplicationModule;
        private ZendeskNetworkModule zendeskNetworkModule;

        public ZendeskApplicationComponent build() {
            fu4.m44410a(this.zendeskApplicationModule, ZendeskApplicationModule.class);
            if (this.zendeskNetworkModule == null) {
                this.zendeskNetworkModule = new ZendeskNetworkModule();
            }
            return new DaggerZendeskApplicationComponent(this.zendeskApplicationModule, this.zendeskNetworkModule);
        }

        public Builder zendeskApplicationModule(ZendeskApplicationModule zendeskApplicationModule2) {
            this.zendeskApplicationModule = (ZendeskApplicationModule) fu4.m44411b(zendeskApplicationModule2);
            return this;
        }

        public Builder zendeskNetworkModule(ZendeskNetworkModule zendeskNetworkModule2) {
            this.zendeskNetworkModule = (ZendeskNetworkModule) fu4.m44411b(zendeskNetworkModule2);
            return this;
        }

        @Deprecated
        public Builder zendeskProvidersModule(ZendeskProvidersModule zendeskProvidersModule) {
            fu4.m44411b(zendeskProvidersModule);
            return this;
        }

        @Deprecated
        public Builder zendeskStorageModule(ZendeskStorageModule zendeskStorageModule) {
            fu4.m44411b(zendeskStorageModule);
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.provideApplicationContextProvider = li1.m47821a(ZendeskApplicationModule_ProvideApplicationContextFactory.create(zendeskApplicationModule));
        ky4<Gson> a = i36.m45457a(ZendeskApplicationModule_ProvideGsonFactory.create());
        this.provideGsonProvider = a;
        ky4<Serializer> a2 = li1.m47821a(ZendeskStorageModule_ProvideSerializerFactory.create(a));
        this.provideSerializerProvider = a2;
        ky4<BaseStorage> a3 = li1.m47821a(ZendeskStorageModule_ProvideSettingsBaseStorageFactory.create(this.provideApplicationContextProvider, a2));
        this.provideSettingsBaseStorageProvider = a3;
        this.provideSettingsStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideSettingsStorageFactory.create(a3));
        ky4<BaseStorage> a4 = li1.m47821a(ZendeskStorageModule_ProvideIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityBaseStorageProvider = a4;
        this.provideIdentityStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideIdentityStorageFactory.create(a4));
        this.provideAdditionalSdkBaseStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        ky4<File> a5 = li1.m47821a(ZendeskStorageModule_ProvidesCacheDirFactory.create(this.provideApplicationContextProvider));
        this.providesCacheDirProvider = a5;
        this.providesDiskLruStorageProvider = li1.m47821a(ZendeskStorageModule_ProvidesDiskLruStorageFactory.create(a5, this.provideSerializerProvider));
        this.provideCacheProvider = li1.m47821a(ZendeskStorageModule_ProvideCacheFactory.create(this.providesCacheDirProvider));
        this.providesDataDirProvider = li1.m47821a(ZendeskStorageModule_ProvidesDataDirFactory.create(this.provideApplicationContextProvider));
        ky4<File> a6 = li1.m47821a(ZendeskStorageModule_ProvidesBelvedereDirFactory.create(this.provideApplicationContextProvider));
        this.providesBelvedereDirProvider = a6;
        this.provideSessionStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideSessionStorageFactory.create(this.provideIdentityStorageProvider, this.provideAdditionalSdkBaseStorageProvider, this.providesDiskLruStorageProvider, this.provideCacheProvider, this.providesCacheDirProvider, this.providesDataDirProvider, a6));
        this.provideSdkBaseStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideSdkBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        ky4<MemoryCache> a7 = li1.m47821a(ZendeskStorageModule_ProvideMemoryCacheFactory.create());
        this.provideMemoryCacheProvider = a7;
        this.provideSdkStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideSdkStorageFactory.create(this.provideSettingsStorageProvider, this.provideSessionStorageProvider, this.provideSdkBaseStorageProvider, a7));
        this.provideLegacyIdentityBaseStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideLegacyPushBaseStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory.create(this.provideApplicationContextProvider, this.provideSerializerProvider));
        this.provideIdentityManagerProvider = li1.m47821a(ZendeskStorageModule_ProvideIdentityManagerFactory.create(this.provideIdentityStorageProvider));
        ky4<PushDeviceIdStorage> a8 = li1.m47821a(ZendeskStorageModule_ProvidePushDeviceIdStorageFactory.create(this.provideAdditionalSdkBaseStorageProvider));
        this.providePushDeviceIdStorageProvider = a8;
        this.provideLegacyIdentityStorageProvider = li1.m47821a(ZendeskStorageModule_ProvideLegacyIdentityStorageFactory.create(this.provideLegacyIdentityBaseStorageProvider, this.provideLegacyPushBaseStorageProvider, this.provideIdentityStorageProvider, this.provideIdentityManagerProvider, a8));
        this.provideApplicationConfigurationProvider = li1.m47821a(ZendeskApplicationModule_ProvideApplicationConfigurationFactory.create(zendeskApplicationModule));
        this.provideHttpLoggingInterceptorProvider = i36.m45457a(ZendeskApplicationModule_ProvideHttpLoggingInterceptorFactory.create());
        this.provideZendeskBasicHeadersInterceptorProvider = i36.m45457a(C9863x2dd20439.create(zendeskNetworkModule, this.provideApplicationConfigurationProvider));
        this.providesUserAgentHeaderInterceptorProvider = i36.m45457a(ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory.create(zendeskNetworkModule));
        ky4<ScheduledExecutorService> a9 = li1.m47821a(ZendeskApplicationModule_ProvideExecutorFactory.create());
        this.provideExecutorProvider = a9;
        ky4<ExecutorService> a10 = li1.m47821a(ZendeskApplicationModule_ProvideExecutorServiceFactory.create(a9));
        this.provideExecutorServiceProvider = a10;
        this.provideBaseOkHttpClientProvider = li1.m47821a(ZendeskNetworkModule_ProvideBaseOkHttpClientFactory.create(zendeskNetworkModule, this.provideHttpLoggingInterceptorProvider, this.provideZendeskBasicHeadersInterceptorProvider, this.providesUserAgentHeaderInterceptorProvider, a10));
        this.provideAcceptLanguageHeaderInterceptorProvider = i36.m45457a(C9862x23150492.create(this.provideApplicationContextProvider));
        ky4<AcceptHeaderInterceptor> a11 = i36.m45457a(ZendeskNetworkModule_ProvidesAcceptHeaderInterceptorFactory.create());
        this.providesAcceptHeaderInterceptorProvider = a11;
        ky4<OkHttpClient> a12 = li1.m47821a(ZendeskNetworkModule_ProvideCoreOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAcceptLanguageHeaderInterceptorProvider, a11));
        this.provideCoreOkHttpClientProvider = a12;
        ky4<og5> a13 = li1.m47821a(ZendeskNetworkModule_ProvideCoreRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, a12));
        this.provideCoreRetrofitProvider = a13;
        this.provideBlipsServiceProvider = li1.m47821a(ZendeskProvidersModule_ProvideBlipsServiceFactory.create(a13));
        this.provideDeviceInfoProvider = li1.m47821a(ZendeskApplicationModule_ProvideDeviceInfoFactory.create(this.provideApplicationContextProvider));
        this.provideBase64SerializerProvider = i36.m45457a(ZendeskApplicationModule_ProvideBase64SerializerFactory.create(zendeskApplicationModule, this.provideSerializerProvider));
        ky4<CoreSettingsStorage> a14 = li1.m47821a(ZendeskStorageModule_ProvideCoreSettingsStorageFactory.create(this.provideSettingsStorageProvider));
        this.provideCoreSettingsStorageProvider = a14;
        ky4<ZendeskBlipsProvider> a15 = li1.m47821a(ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory.create(this.provideBlipsServiceProvider, this.provideDeviceInfoProvider, this.provideBase64SerializerProvider, this.provideIdentityManagerProvider, this.provideApplicationConfigurationProvider, a14, this.provideExecutorServiceProvider));
        this.providerZendeskBlipsProvider = a15;
        this.providerBlipsCoreProvider = li1.m47821a(ZendeskProvidersModule_ProviderBlipsCoreProviderFactory.create(a15));
        ky4<ZendeskAuthHeaderInterceptor> a16 = i36.m45457a(ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory.create(this.provideIdentityManagerProvider));
        this.provideAuthHeaderInterceptorProvider = a16;
        ky4<og5> a17 = li1.m47821a(ZendeskNetworkModule_ProvidePushProviderRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, this.provideCoreOkHttpClientProvider, a16));
        this.providePushProviderRetrofitProvider = a17;
        this.providePushRegistrationServiceProvider = i36.m45457a(ZendeskProvidersModule_ProvidePushRegistrationServiceFactory.create(a17));
        this.provideSdkSettingsServiceProvider = i36.m45457a(ZendeskProvidersModule_ProvideSdkSettingsServiceFactory.create(this.provideCoreRetrofitProvider));
        this.actionHandlerRegistryProvider = li1.m47821a(ZendeskProvidersModule_ActionHandlerRegistryFactory.create());
        ky4<ZendeskLocaleConverter> a18 = li1.m47821a(ZendeskApplicationModule_ProvideZendeskLocaleConverterFactory.create(zendeskApplicationModule));
        this.provideZendeskLocaleConverterProvider = a18;
        ky4<ZendeskSettingsProvider> a19 = li1.m47821a(ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory.create(this.provideSdkSettingsServiceProvider, this.provideSettingsStorageProvider, this.provideCoreSettingsStorageProvider, this.actionHandlerRegistryProvider, this.provideSerializerProvider, a18, this.provideApplicationConfigurationProvider, this.provideApplicationContextProvider));
        this.provideZendeskSdkSettingsProvider = a19;
        ky4<SettingsProvider> a20 = li1.m47821a(ZendeskProvidersModule_ProvideSdkSettingsProviderFactory.create(a19));
        this.provideSdkSettingsProvider = a20;
        this.providePushRegistrationProvider = li1.m47821a(ZendeskProvidersModule_ProvidePushRegistrationProviderFactory.create(this.providePushRegistrationServiceProvider, this.provideIdentityManagerProvider, a20, this.providerBlipsCoreProvider, this.providePushDeviceIdStorageProvider, this.provideApplicationContextProvider));
        ky4<AccessService> a21 = i36.m45457a(ZendeskProvidersModule_ProvideAccessServiceFactory.create(this.provideCoreRetrofitProvider));
        this.provideAccessServiceProvider = a21;
        ky4<AccessProvider> a22 = li1.m47821a(ZendeskProvidersModule_ProvideAccessProviderFactory.create(this.provideIdentityManagerProvider, a21));
        this.provideAccessProvider = a22;
        this.provideAccessInterceptorProvider = i36.m45457a(ZendeskNetworkModule_ProvideAccessInterceptorFactory.create(this.provideIdentityManagerProvider, a22, this.provideSdkStorageProvider, this.provideCoreSettingsStorageProvider));
        this.provideZendeskUnauthorizedInterceptorProvider = i36.m45457a(C9864x5893b2b5.create(this.provideSessionStorageProvider, this.provideIdentityManagerProvider));
        ky4<SdkSettingsProviderInternal> a23 = li1.m47821a(ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory.create(this.provideZendeskSdkSettingsProvider));
        this.provideSdkSettingsProviderInternalProvider = a23;
        this.provideSettingsInterceptorProvider = i36.m45457a(ZendeskNetworkModule_ProvideSettingsInterceptorFactory.create(a23, this.provideSettingsStorageProvider));
        ky4<PushRegistrationProviderInternal> a24 = li1.m47821a(C9865xb2419e95.create(this.providePushRegistrationProvider));
        this.providePushRegistrationProviderInternalProvider = a24;
        ky4<ZendeskPushInterceptor> a25 = i36.m45457a(ZendeskNetworkModule_ProvidePushInterceptorFactory.create(a24, this.providePushDeviceIdStorageProvider, this.provideIdentityStorageProvider));
        this.providePushInterceptorProvider = a25;
        ky4<OkHttpClient> a26 = li1.m47821a(ZendeskNetworkModule_ProvideOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideZendeskUnauthorizedInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, this.providesAcceptHeaderInterceptorProvider, a25, this.provideCacheProvider));
        this.provideOkHttpClientProvider = a26;
        this.provideRetrofitProvider = li1.m47821a(ZendeskNetworkModule_ProvideRetrofitFactory.create(this.provideApplicationConfigurationProvider, this.provideGsonProvider, a26));
        ky4<CachingInterceptor> a27 = i36.m45457a(ZendeskNetworkModule_ProvideCachingInterceptorFactory.create(this.providesDiskLruStorageProvider));
        this.provideCachingInterceptorProvider = a27;
        ky4<OkHttpClient> a28 = li1.m47821a(ZendeskNetworkModule_ProvideMediaOkHttpClientFactory.create(zendeskNetworkModule, this.provideBaseOkHttpClientProvider, this.provideAccessInterceptorProvider, this.provideAuthHeaderInterceptorProvider, this.provideSettingsInterceptorProvider, a27, this.provideZendeskUnauthorizedInterceptorProvider));
        this.provideMediaOkHttpClientProvider = a28;
        this.provideRestServiceProvider = li1.m47821a(ZendeskNetworkModule_ProvideRestServiceProviderFactory.create(zendeskNetworkModule, this.provideRetrofitProvider, a28, this.provideOkHttpClientProvider, this.provideCoreOkHttpClientProvider));
        this.providerBlipsProvider = li1.m47821a(ZendeskProvidersModule_ProviderBlipsProviderFactory.create(this.providerZendeskBlipsProvider));
        ky4<ConnectivityManager> a29 = li1.m47821a(ZendeskProvidersModule_ProviderConnectivityManagerFactory.create(this.provideApplicationContextProvider));
        this.providerConnectivityManagerProvider = a29;
        this.providerNetworkInfoProvider = li1.m47821a(ZendeskProvidersModule_ProviderNetworkInfoProviderFactory.create(a29));
        this.provideAuthProvider = li1.m47821a(ZendeskStorageModule_ProvideAuthProviderFactory.create(this.provideIdentityManagerProvider));
        ky4<MachineIdStorage> a30 = li1.m47821a(ZendeskStorageModule_ProvideMachineIdStorageFactory.create(this.provideApplicationContextProvider));
        this.provideMachineIdStorageProvider = a30;
        this.provideCoreSdkModuleProvider = i36.m45457a(ZendeskProvidersModule_ProvideCoreSdkModuleFactory.create(this.provideSdkSettingsProvider, this.provideRestServiceProvider, this.providerBlipsProvider, this.provideSessionStorageProvider, this.providerNetworkInfoProvider, this.provideMemoryCacheProvider, this.actionHandlerRegistryProvider, this.provideExecutorProvider, this.provideApplicationContextProvider, this.provideAuthProvider, this.provideApplicationConfigurationProvider, this.providePushRegistrationProvider, a30));
        ky4<UserService> a31 = i36.m45457a(ZendeskProvidersModule_ProvideUserServiceFactory.create(this.provideRetrofitProvider));
        this.provideUserServiceProvider = a31;
        ky4<UserProvider> a32 = li1.m47821a(ZendeskProvidersModule_ProvideUserProviderFactory.create(a31));
        this.provideUserProvider = a32;
        ky4<ProviderStore> a33 = li1.m47821a(ZendeskProvidersModule_ProvideProviderStoreFactory.create(a32, this.providePushRegistrationProvider));
        this.provideProviderStoreProvider = a33;
        this.provideZendeskProvider = li1.m47821a(ZendeskApplicationModule_ProvideZendeskFactory.create(this.provideSdkStorageProvider, this.provideLegacyIdentityStorageProvider, this.provideIdentityManagerProvider, this.providerBlipsCoreProvider, this.providePushRegistrationProvider, this.provideCoreSdkModuleProvider, a33));
    }

    public ZendeskShadow zendeskShadow() {
        return this.provideZendeskProvider.get();
    }

    private DaggerZendeskApplicationComponent(ZendeskApplicationModule zendeskApplicationModule, ZendeskNetworkModule zendeskNetworkModule) {
        this.zendeskApplicationComponent = this;
        initialize(zendeskApplicationModule, zendeskNetworkModule);
    }
}
