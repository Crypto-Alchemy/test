package zendesk.core;

public final class ZendeskNetworkModule_ProvideSettingsInterceptorFactory implements ry1<ZendeskSettingsInterceptor> {
    private final ky4<SdkSettingsProviderInternal> sdkSettingsProvider;
    private final ky4<SettingsStorage> settingsStorageProvider;

    public ZendeskNetworkModule_ProvideSettingsInterceptorFactory(ky4<SdkSettingsProviderInternal> ky4, ky4<SettingsStorage> ky42) {
        this.sdkSettingsProvider = ky4;
        this.settingsStorageProvider = ky42;
    }

    public static ZendeskNetworkModule_ProvideSettingsInterceptorFactory create(ky4<SdkSettingsProviderInternal> ky4, ky4<SettingsStorage> ky42) {
        return new ZendeskNetworkModule_ProvideSettingsInterceptorFactory(ky4, ky42);
    }

    public static ZendeskSettingsInterceptor provideSettingsInterceptor(Object obj, Object obj2) {
        return (ZendeskSettingsInterceptor) fu4.m44415f(ZendeskNetworkModule.provideSettingsInterceptor((SdkSettingsProviderInternal) obj, (SettingsStorage) obj2));
    }

    public ZendeskSettingsInterceptor get() {
        return provideSettingsInterceptor(this.sdkSettingsProvider.get(), this.settingsStorageProvider.get());
    }
}
