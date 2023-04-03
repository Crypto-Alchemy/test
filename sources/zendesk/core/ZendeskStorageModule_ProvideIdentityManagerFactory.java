package zendesk.core;

public final class ZendeskStorageModule_ProvideIdentityManagerFactory implements ry1<IdentityManager> {
    private final ky4<IdentityStorage> identityStorageProvider;

    public ZendeskStorageModule_ProvideIdentityManagerFactory(ky4<IdentityStorage> ky4) {
        this.identityStorageProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideIdentityManagerFactory create(ky4<IdentityStorage> ky4) {
        return new ZendeskStorageModule_ProvideIdentityManagerFactory(ky4);
    }

    public static IdentityManager provideIdentityManager(Object obj) {
        return (IdentityManager) fu4.m44415f(ZendeskStorageModule.provideIdentityManager((IdentityStorage) obj));
    }

    public IdentityManager get() {
        return provideIdentityManager(this.identityStorageProvider.get());
    }
}
