package zendesk.core;

public final class ZendeskProvidersModule_ProvideSdkSettingsServiceFactory implements ry1<SdkSettingsService> {
    private final ky4<og5> retrofitProvider;

    public ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(ky4<og5> ky4) {
        this.retrofitProvider = ky4;
    }

    public static ZendeskProvidersModule_ProvideSdkSettingsServiceFactory create(ky4<og5> ky4) {
        return new ZendeskProvidersModule_ProvideSdkSettingsServiceFactory(ky4);
    }

    public static SdkSettingsService provideSdkSettingsService(og5 og5) {
        return (SdkSettingsService) fu4.m44415f(ZendeskProvidersModule.provideSdkSettingsService(og5));
    }

    public SdkSettingsService get() {
        return provideSdkSettingsService(this.retrofitProvider.get());
    }
}
