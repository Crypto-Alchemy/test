package zendesk.core;

public final class ZendeskStorageModule_ProvideLegacyIdentityStorageFactory implements ry1<LegacyIdentityMigrator> {
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<IdentityStorage> identityStorageProvider;
    private final ky4<SharedPreferencesStorage> legacyIdentityBaseStorageProvider;
    private final ky4<SharedPreferencesStorage> legacyPushBaseStorageProvider;
    private final ky4<PushDeviceIdStorage> pushDeviceIdStorageProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(ky4<SharedPreferencesStorage> ky4, ky4<SharedPreferencesStorage> ky42, ky4<IdentityStorage> ky43, ky4<IdentityManager> ky44, ky4<PushDeviceIdStorage> ky45) {
        this.legacyIdentityBaseStorageProvider = ky4;
        this.legacyPushBaseStorageProvider = ky42;
        this.identityStorageProvider = ky43;
        this.identityManagerProvider = ky44;
        this.pushDeviceIdStorageProvider = ky45;
    }

    public static ZendeskStorageModule_ProvideLegacyIdentityStorageFactory create(ky4<SharedPreferencesStorage> ky4, ky4<SharedPreferencesStorage> ky42, ky4<IdentityStorage> ky43, ky4<IdentityManager> ky44, ky4<PushDeviceIdStorage> ky45) {
        return new ZendeskStorageModule_ProvideLegacyIdentityStorageFactory(ky4, ky42, ky43, ky44, ky45);
    }

    public static LegacyIdentityMigrator provideLegacyIdentityStorage(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (LegacyIdentityMigrator) fu4.m44415f(ZendeskStorageModule.provideLegacyIdentityStorage((SharedPreferencesStorage) obj, (SharedPreferencesStorage) obj2, (IdentityStorage) obj3, (IdentityManager) obj4, (PushDeviceIdStorage) obj5));
    }

    public LegacyIdentityMigrator get() {
        return provideLegacyIdentityStorage(this.legacyIdentityBaseStorageProvider.get(), this.legacyPushBaseStorageProvider.get(), this.identityStorageProvider.get(), this.identityManagerProvider.get(), this.pushDeviceIdStorageProvider.get());
    }
}
