package zendesk.core;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class ZendeskProvidersModule_ProvideCoreSdkModuleFactory implements ry1<CoreModule> {
    private final ky4<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final ky4<AuthenticationProvider> authenticationProvider;
    private final ky4<BlipsProvider> blipsProvider;
    private final ky4<Context> contextProvider;
    private final ky4<ScheduledExecutorService> executorProvider;
    private final ky4<MachineIdStorage> machineIdStorageProvider;
    private final ky4<MemoryCache> memoryCacheProvider;
    private final ky4<NetworkInfoProvider> networkInfoProvider;
    private final ky4<PushRegistrationProvider> pushRegistrationProvider;
    private final ky4<RestServiceProvider> restServiceProvider;
    private final ky4<SessionStorage> sessionStorageProvider;
    private final ky4<SettingsProvider> settingsProvider;
    private final ky4<ApplicationConfiguration> zendeskConfigurationProvider;

    public ZendeskProvidersModule_ProvideCoreSdkModuleFactory(ky4<SettingsProvider> ky4, ky4<RestServiceProvider> ky42, ky4<BlipsProvider> ky43, ky4<SessionStorage> ky44, ky4<NetworkInfoProvider> ky45, ky4<MemoryCache> ky46, ky4<ActionHandlerRegistry> ky47, ky4<ScheduledExecutorService> ky48, ky4<Context> ky49, ky4<AuthenticationProvider> ky410, ky4<ApplicationConfiguration> ky411, ky4<PushRegistrationProvider> ky412, ky4<MachineIdStorage> ky413) {
        this.settingsProvider = ky4;
        this.restServiceProvider = ky42;
        this.blipsProvider = ky43;
        this.sessionStorageProvider = ky44;
        this.networkInfoProvider = ky45;
        this.memoryCacheProvider = ky46;
        this.actionHandlerRegistryProvider = ky47;
        this.executorProvider = ky48;
        this.contextProvider = ky49;
        this.authenticationProvider = ky410;
        this.zendeskConfigurationProvider = ky411;
        this.pushRegistrationProvider = ky412;
        this.machineIdStorageProvider = ky413;
    }

    public static ZendeskProvidersModule_ProvideCoreSdkModuleFactory create(ky4<SettingsProvider> ky4, ky4<RestServiceProvider> ky42, ky4<BlipsProvider> ky43, ky4<SessionStorage> ky44, ky4<NetworkInfoProvider> ky45, ky4<MemoryCache> ky46, ky4<ActionHandlerRegistry> ky47, ky4<ScheduledExecutorService> ky48, ky4<Context> ky49, ky4<AuthenticationProvider> ky410, ky4<ApplicationConfiguration> ky411, ky4<PushRegistrationProvider> ky412, ky4<MachineIdStorage> ky413) {
        return new ZendeskProvidersModule_ProvideCoreSdkModuleFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48, ky49, ky410, ky411, ky412, ky413);
    }

    public static CoreModule provideCoreSdkModule(SettingsProvider settingsProvider2, RestServiceProvider restServiceProvider2, BlipsProvider blipsProvider2, SessionStorage sessionStorage, NetworkInfoProvider networkInfoProvider2, MemoryCache memoryCache, ActionHandlerRegistry actionHandlerRegistry, ScheduledExecutorService scheduledExecutorService, Context context, AuthenticationProvider authenticationProvider2, ApplicationConfiguration applicationConfiguration, PushRegistrationProvider pushRegistrationProvider2, MachineIdStorage machineIdStorage) {
        return (CoreModule) fu4.m44415f(ZendeskProvidersModule.provideCoreSdkModule(settingsProvider2, restServiceProvider2, blipsProvider2, sessionStorage, networkInfoProvider2, memoryCache, actionHandlerRegistry, scheduledExecutorService, context, authenticationProvider2, applicationConfiguration, pushRegistrationProvider2, machineIdStorage));
    }

    public CoreModule get() {
        return provideCoreSdkModule(this.settingsProvider.get(), this.restServiceProvider.get(), this.blipsProvider.get(), this.sessionStorageProvider.get(), this.networkInfoProvider.get(), this.memoryCacheProvider.get(), this.actionHandlerRegistryProvider.get(), this.executorProvider.get(), this.contextProvider.get(), this.authenticationProvider.get(), this.zendeskConfigurationProvider.get(), this.pushRegistrationProvider.get(), this.machineIdStorageProvider.get());
    }
}
