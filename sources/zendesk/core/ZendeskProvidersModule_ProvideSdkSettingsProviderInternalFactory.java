package zendesk.core;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory implements ry1<SdkSettingsProviderInternal> {
    private final ky4<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(ky4<ZendeskSettingsProvider> ky4) {
        this.sdkSettingsProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory create(ky4<ZendeskSettingsProvider> ky4) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderInternalFactory(ky4);
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(Object obj) {
        return (SdkSettingsProviderInternal) fu4.m44415f(ZendeskProvidersModule.provideSdkSettingsProviderInternal((ZendeskSettingsProvider) obj));
    }

    public SdkSettingsProviderInternal get() {
        return provideSdkSettingsProviderInternal(this.sdkSettingsProvider.get());
    }
}
