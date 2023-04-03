package zendesk.core;

import android.content.Context;

public final class ZendeskProvidersModule_ProvidePushRegistrationProviderFactory implements ry1<PushRegistrationProvider> {
    private final ky4<BlipsCoreProvider> blipsProvider;
    private final ky4<Context> contextProvider;
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<PushDeviceIdStorage> pushDeviceIdStorageProvider;
    private final ky4<PushRegistrationService> pushRegistrationServiceProvider;
    private final ky4<SettingsProvider> settingsProvider;

    public ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(ky4<PushRegistrationService> ky4, ky4<IdentityManager> ky42, ky4<SettingsProvider> ky43, ky4<BlipsCoreProvider> ky44, ky4<PushDeviceIdStorage> ky45, ky4<Context> ky46) {
        this.pushRegistrationServiceProvider = ky4;
        this.identityManagerProvider = ky42;
        this.settingsProvider = ky43;
        this.blipsProvider = ky44;
        this.pushDeviceIdStorageProvider = ky45;
        this.contextProvider = ky46;
    }

    public static ZendeskProvidersModule_ProvidePushRegistrationProviderFactory create(ky4<PushRegistrationService> ky4, ky4<IdentityManager> ky42, ky4<SettingsProvider> ky43, ky4<BlipsCoreProvider> ky44, ky4<PushDeviceIdStorage> ky45, ky4<Context> ky46) {
        return new ZendeskProvidersModule_ProvidePushRegistrationProviderFactory(ky4, ky42, ky43, ky44, ky45, ky46);
    }

    public static PushRegistrationProvider providePushRegistrationProvider(Object obj, Object obj2, SettingsProvider settingsProvider2, Object obj3, Object obj4, Context context) {
        return (PushRegistrationProvider) fu4.m44415f(ZendeskProvidersModule.providePushRegistrationProvider((PushRegistrationService) obj, (IdentityManager) obj2, settingsProvider2, (BlipsCoreProvider) obj3, (PushDeviceIdStorage) obj4, context));
    }

    public PushRegistrationProvider get() {
        return providePushRegistrationProvider(this.pushRegistrationServiceProvider.get(), this.identityManagerProvider.get(), this.settingsProvider.get(), this.blipsProvider.get(), this.pushDeviceIdStorageProvider.get(), this.contextProvider.get());
    }
}
