package zendesk.core;

public final class ZendeskApplicationModule_ProvideZendeskFactory implements ry1<ZendeskShadow> {
    private final ky4<BlipsCoreProvider> blipsCoreProvider;
    private final ky4<CoreModule> coreModuleProvider;
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<LegacyIdentityMigrator> legacyIdentityMigratorProvider;
    private final ky4<ProviderStore> providerStoreProvider;
    private final ky4<PushRegistrationProvider> pushRegistrationProvider;
    private final ky4<Storage> storageProvider;

    public ZendeskApplicationModule_ProvideZendeskFactory(ky4<Storage> ky4, ky4<LegacyIdentityMigrator> ky42, ky4<IdentityManager> ky43, ky4<BlipsCoreProvider> ky44, ky4<PushRegistrationProvider> ky45, ky4<CoreModule> ky46, ky4<ProviderStore> ky47) {
        this.storageProvider = ky4;
        this.legacyIdentityMigratorProvider = ky42;
        this.identityManagerProvider = ky43;
        this.blipsCoreProvider = ky44;
        this.pushRegistrationProvider = ky45;
        this.coreModuleProvider = ky46;
        this.providerStoreProvider = ky47;
    }

    public static ZendeskApplicationModule_ProvideZendeskFactory create(ky4<Storage> ky4, ky4<LegacyIdentityMigrator> ky42, ky4<IdentityManager> ky43, ky4<BlipsCoreProvider> ky44, ky4<PushRegistrationProvider> ky45, ky4<CoreModule> ky46, ky4<ProviderStore> ky47) {
        return new ZendeskApplicationModule_ProvideZendeskFactory(ky4, ky42, ky43, ky44, ky45, ky46, ky47);
    }

    public static ZendeskShadow provideZendesk(Object obj, Object obj2, Object obj3, Object obj4, PushRegistrationProvider pushRegistrationProvider2, CoreModule coreModule, ProviderStore providerStore) {
        return (ZendeskShadow) fu4.m44415f(ZendeskApplicationModule.provideZendesk((Storage) obj, (LegacyIdentityMigrator) obj2, (IdentityManager) obj3, (BlipsCoreProvider) obj4, pushRegistrationProvider2, coreModule, providerStore));
    }

    public ZendeskShadow get() {
        return provideZendesk(this.storageProvider.get(), this.legacyIdentityMigratorProvider.get(), this.identityManagerProvider.get(), this.blipsCoreProvider.get(), this.pushRegistrationProvider.get(), this.coreModuleProvider.get(), this.providerStoreProvider.get());
    }
}
