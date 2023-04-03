package zendesk.core;

public final class ZendeskStorageModule_ProvideSdkStorageFactory implements ry1<Storage> {
    private final ky4<MemoryCache> memoryCacheProvider;
    private final ky4<BaseStorage> sdkBaseStorageProvider;
    private final ky4<SessionStorage> sessionStorageProvider;
    private final ky4<SettingsStorage> settingsStorageProvider;

    public ZendeskStorageModule_ProvideSdkStorageFactory(ky4<SettingsStorage> ky4, ky4<SessionStorage> ky42, ky4<BaseStorage> ky43, ky4<MemoryCache> ky44) {
        this.settingsStorageProvider = ky4;
        this.sessionStorageProvider = ky42;
        this.sdkBaseStorageProvider = ky43;
        this.memoryCacheProvider = ky44;
    }

    public static ZendeskStorageModule_ProvideSdkStorageFactory create(ky4<SettingsStorage> ky4, ky4<SessionStorage> ky42, ky4<BaseStorage> ky43, ky4<MemoryCache> ky44) {
        return new ZendeskStorageModule_ProvideSdkStorageFactory(ky4, ky42, ky43, ky44);
    }

    public static Storage provideSdkStorage(Object obj, SessionStorage sessionStorage, BaseStorage baseStorage, MemoryCache memoryCache) {
        return (Storage) fu4.m44415f(ZendeskStorageModule.provideSdkStorage((SettingsStorage) obj, sessionStorage, baseStorage, memoryCache));
    }

    public Storage get() {
        return provideSdkStorage(this.settingsStorageProvider.get(), this.sessionStorageProvider.get(), this.sdkBaseStorageProvider.get(), this.memoryCacheProvider.get());
    }
}
