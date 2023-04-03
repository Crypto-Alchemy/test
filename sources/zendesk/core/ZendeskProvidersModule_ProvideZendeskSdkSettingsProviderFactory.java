package zendesk.core;

import android.content.Context;

public final class ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory implements ry1<ZendeskSettingsProvider> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<ApplicationConfiguration> configurationProvider;
    private final ky4<Context> contextProvider;
    private final ky4<CoreSettingsStorage> coreSettingsStorageProvider;
    private final ky4<SdkSettingsService> sdkSettingsServiceProvider;
    private final ky4<Serializer> serializerProvider;
    private final ky4<SettingsStorage> settingsStorageProvider;
    private final ky4<ZendeskLocaleConverter> zendeskLocaleConverterProvider;

    public ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(ky4<SdkSettingsService> ky4, ky4<SettingsStorage> ky42, ky4<CoreSettingsStorage> ky43, ky4<ActionHandlerRegistry> ky44, ky4<Serializer> ky45, ky4<ZendeskLocaleConverter> ky46, ky4<ApplicationConfiguration> ky47, ky4<Context> ky48) {
        this.sdkSettingsServiceProvider = ky4;
        this.settingsStorageProvider = ky42;
        this.coreSettingsStorageProvider = ky43;
        this.actionHandlerRegistryProvider = ky44;
        this.serializerProvider = ky45;
        this.zendeskLocaleConverterProvider = ky46;
        this.configurationProvider = ky47;
        this.contextProvider = ky48;
    }

    public static ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory create(ky4<SdkSettingsService> ky4, ky4<SettingsStorage> ky42, ky4<CoreSettingsStorage> ky43, ky4<ActionHandlerRegistry> ky44, ky4<Serializer> ky45, ky4<ZendeskLocaleConverter> ky46, ky4<ApplicationConfiguration> ky47, ky4<Context> ky48) {
        return new ZendeskProvidersModule_ProvideZendeskSdkSettingsProviderFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(Object obj, Object obj2, Object obj3, ActionHandlerRegistry actionHandlerRegistry, Object obj4, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return (ZendeskSettingsProvider) fu4.m44415f(ZendeskProvidersModule.provideZendeskSdkSettingsProvider((SdkSettingsService) obj, (SettingsStorage) obj2, (CoreSettingsStorage) obj3, actionHandlerRegistry, (Serializer) obj4, zendeskLocaleConverter, applicationConfiguration, context));
    }

    public ZendeskSettingsProvider get() {
        return provideZendeskSdkSettingsProvider(this.sdkSettingsServiceProvider.get(), this.settingsStorageProvider.get(), this.coreSettingsStorageProvider.get(), this.actionHandlerRegistryProvider.get(), this.serializerProvider.get(), this.zendeskLocaleConverterProvider.get(), this.configurationProvider.get(), this.contextProvider.get());
    }
}
