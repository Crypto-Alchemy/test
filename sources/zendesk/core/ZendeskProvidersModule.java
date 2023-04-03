package zendesk.core;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

class ZendeskProvidersModule {
    public static ActionHandlerRegistry actionHandlerRegistry() {
        return Zendesk.INSTANCE.actionHandlerRegistry();
    }

    public static AccessProvider provideAccessProvider(IdentityManager identityManager, AccessService accessService) {
        return new ZendeskAccessProvider(identityManager, accessService);
    }

    public static AccessService provideAccessService(og5 og5) {
        return (AccessService) og5.mo62909b(AccessService.class);
    }

    public static BlipsService provideBlipsService(og5 og5) {
        return (BlipsService) og5.mo62909b(BlipsService.class);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider, RestServiceProvider restServiceProvider, BlipsProvider blipsProvider, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider, MachineIdStorage machineIdStorage) {
        return new CoreModule(settingsProvider, restServiceProvider, blipsProvider, sessionStorage, networkInfoProvider, context, actionHandlerRegistry, memoryCache, scheduledExecutorService, authenticationProvider, applicationConfiguration, pushRegistrationProvider, machineIdStorage);
    }

    public static ProviderStore provideProviderStore(UserProvider userProvider, PushRegistrationProvider pushRegistrationProvider) {
        return new ZendeskProviderStore(userProvider, pushRegistrationProvider);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(PushRegistrationService pushRegistrationService, IdentityManager identityManager, SettingsProvider settingsProvider, BlipsCoreProvider blipsCoreProvider, PushDeviceIdStorage pushDeviceIdStorage, Context context) {
        return new ZendeskPushRegistrationProvider(pushRegistrationService, identityManager, settingsProvider, blipsCoreProvider, pushDeviceIdStorage, DeviceInfo.getCurrentLocale(context));
    }

    public static PushRegistrationProviderInternal providePushRegistrationProviderInternal(PushRegistrationProvider pushRegistrationProvider) {
        return (ZendeskPushRegistrationProvider) pushRegistrationProvider;
    }

    public static PushRegistrationService providePushRegistrationService(og5 og5) {
        return (PushRegistrationService) og5.mo62909b(PushRegistrationService.class);
    }

    public static SettingsProvider provideSdkSettingsProvider(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    public static SdkSettingsProviderInternal provideSdkSettingsProviderInternal(ZendeskSettingsProvider zendeskSettingsProvider) {
        return zendeskSettingsProvider;
    }

    public static SdkSettingsService provideSdkSettingsService(og5 og5) {
        return (SdkSettingsService) og5.mo62909b(SdkSettingsService.class);
    }

    public static UserProvider provideUserProvider(UserService userService) {
        return new ZendeskUserProvider(userService);
    }

    public static UserService provideUserService(og5 og5) {
        return (UserService) og5.mo62909b(UserService.class);
    }

    public static ZendeskSettingsProvider provideZendeskSdkSettingsProvider(SdkSettingsService sdkSettingsService, SettingsStorage settingsStorage, CoreSettingsStorage coreSettingsStorage, ActionHandlerRegistry actionHandlerRegistry, Serializer serializer, ZendeskLocaleConverter zendeskLocaleConverter, ApplicationConfiguration applicationConfiguration, Context context) {
        return new ZendeskSettingsProvider(sdkSettingsService, settingsStorage, coreSettingsStorage, actionHandlerRegistry, serializer, zendeskLocaleConverter, applicationConfiguration.getApplicationId(), context);
    }

    public static BlipsCoreProvider providerBlipsCoreProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    public static BlipsProvider providerBlipsProvider(ZendeskBlipsProvider zendeskBlipsProvider) {
        return zendeskBlipsProvider;
    }

    public static ConnectivityManager providerConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static NetworkInfoProvider providerNetworkInfoProvider(ConnectivityManager connectivityManager) {
        return new ZendeskNetworkInfoProvider(connectivityManager);
    }

    public static ZendeskBlipsProvider providerZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, ApplicationConfiguration applicationConfiguration, CoreSettingsStorage coreSettingsStorage, ExecutorService executorService) {
        return new ZendeskBlipsProvider(blipsService, deviceInfo, serializer, identityManager, applicationConfiguration.getApplicationId(), coreSettingsStorage, executorService);
    }
}
