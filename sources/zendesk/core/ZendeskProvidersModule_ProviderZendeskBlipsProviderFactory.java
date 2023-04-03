package zendesk.core;

import java.util.concurrent.ExecutorService;

public final class ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory implements ry1<ZendeskBlipsProvider> {
    private final ky4<ApplicationConfiguration> applicationConfigurationProvider;
    private final ky4<BlipsService> blipsServiceProvider;
    private final ky4<CoreSettingsStorage> coreSettingsStorageProvider;
    private final ky4<DeviceInfo> deviceInfoProvider;
    private final ky4<ExecutorService> executorProvider;
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<Serializer> serializerProvider;

    public ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(ky4<BlipsService> ky4, ky4<DeviceInfo> ky42, ky4<Serializer> ky43, ky4<IdentityManager> ky44, ky4<ApplicationConfiguration> ky45, ky4<CoreSettingsStorage> ky46, ky4<ExecutorService> ky47) {
        this.blipsServiceProvider = ky4;
        this.deviceInfoProvider = ky42;
        this.serializerProvider = ky43;
        this.identityManagerProvider = ky44;
        this.applicationConfigurationProvider = ky45;
        this.coreSettingsStorageProvider = ky46;
        this.executorProvider = ky47;
    }

    public static ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory create(ky4<BlipsService> ky4, ky4<DeviceInfo> ky42, ky4<Serializer> ky43, ky4<IdentityManager> ky44, ky4<ApplicationConfiguration> ky45, ky4<CoreSettingsStorage> ky46, ky4<ExecutorService> ky47) {
        return new ZendeskProvidersModule_ProviderZendeskBlipsProviderFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(Object obj, Object obj2, Object obj3, Object obj4, ApplicationConfiguration applicationConfiguration, Object obj5, ExecutorService executorService) {
        return (ZendeskBlipsProvider) fu4.m44415f(ZendeskProvidersModule.providerZendeskBlipsProvider((BlipsService) obj, (DeviceInfo) obj2, (Serializer) obj3, (IdentityManager) obj4, applicationConfiguration, (CoreSettingsStorage) obj5, executorService));
    }

    public ZendeskBlipsProvider get() {
        return providerZendeskBlipsProvider(this.blipsServiceProvider.get(), this.deviceInfoProvider.get(), this.serializerProvider.get(), this.identityManagerProvider.get(), this.applicationConfigurationProvider.get(), this.coreSettingsStorageProvider.get(), this.executorProvider.get());
    }
}
