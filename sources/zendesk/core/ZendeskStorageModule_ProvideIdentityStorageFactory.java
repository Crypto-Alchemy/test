package zendesk.core;

public final class ZendeskStorageModule_ProvideIdentityStorageFactory implements ry1<IdentityStorage> {
    private final ky4<BaseStorage> baseStorageProvider;

    public ZendeskStorageModule_ProvideIdentityStorageFactory(ky4<BaseStorage> ky4) {
        this.baseStorageProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideIdentityStorageFactory create(ky4<BaseStorage> ky4) {
        return new ZendeskStorageModule_ProvideIdentityStorageFactory(ky4);
    }

    public static IdentityStorage provideIdentityStorage(BaseStorage baseStorage) {
        return (IdentityStorage) fu4.m44415f(ZendeskStorageModule.provideIdentityStorage(baseStorage));
    }

    public IdentityStorage get() {
        return provideIdentityStorage(this.baseStorageProvider.get());
    }
}
