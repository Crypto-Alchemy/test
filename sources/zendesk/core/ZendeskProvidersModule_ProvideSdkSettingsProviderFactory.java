package zendesk.core;

public final class ZendeskProvidersModule_ProvideSdkSettingsProviderFactory implements ry1<SettingsProvider> {
    private final ky4<ZendeskSettingsProvider> sdkSettingsProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(ky4<ZendeskSettingsProvider> ky4) {
        this.sdkSettingsProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsProviderFactory create(ky4<ZendeskSettingsProvider> ky4) {
        return new ZendeskProvidersModule_ProvideSdkSettingsProviderFactory(ky4);
    }

    public static SettingsProvider provideSdkSettingsProvider(Object obj) {
        return (SettingsProvider) fu4.m44415f(ZendeskProvidersModule.provideSdkSettingsProvider((ZendeskSettingsProvider) obj));
    }

    public SettingsProvider get() {
        return provideSdkSettingsProvider(this.sdkSettingsProvider.get());
    }
}
