package zendesk.core;

public final class ZendeskNetworkModule_ProvideAccessInterceptorFactory implements ry1<ZendeskAccessInterceptor> {
    private final ky4<AccessProvider> accessProvider;
    private final ky4<CoreSettingsStorage> coreSettingsStorageProvider;
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<Storage> storageProvider;

    public ZendeskNetworkModule_ProvideAccessInterceptorFactory(ky4<IdentityManager> ky4, ky4<AccessProvider> ky42, ky4<Storage> ky43, ky4<CoreSettingsStorage> ky44) {
        this.identityManagerProvider = ky4;
        this.accessProvider = ky42;
        this.storageProvider = ky43;
        this.coreSettingsStorageProvider = ky44;
    }

    public static ZendeskNetworkModule_ProvideAccessInterceptorFactory create(ky4<IdentityManager> ky4, ky4<AccessProvider> ky42, ky4<Storage> ky43, ky4<CoreSettingsStorage> ky44) {
        return new ZendeskNetworkModule_ProvideAccessInterceptorFactory(ky4, ky42, ky43, ky44);
    }

    public static ZendeskAccessInterceptor provideAccessInterceptor(Object obj, Object obj2, Object obj3, Object obj4) {
        return (ZendeskAccessInterceptor) fu4.m44415f(ZendeskNetworkModule.provideAccessInterceptor((IdentityManager) obj, (AccessProvider) obj2, (Storage) obj3, (CoreSettingsStorage) obj4));
    }

    public ZendeskAccessInterceptor get() {
        return provideAccessInterceptor(this.identityManagerProvider.get(), this.accessProvider.get(), this.storageProvider.get(), this.coreSettingsStorageProvider.get());
    }
}
