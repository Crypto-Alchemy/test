package zendesk.support;

import zendesk.core.MemoryCache;
import zendesk.core.SessionStorage;

public final class StorageModule_ProvideRequestStorageFactory implements ry1<RequestStorage> {
    private final ky4<SessionStorage> baseStorageProvider;
    private final ky4<MemoryCache> memoryCacheProvider;
    private final StorageModule module;
    private final ky4<RequestMigrator> requestMigratorProvider;

    public StorageModule_ProvideRequestStorageFactory(StorageModule storageModule, ky4<SessionStorage> ky4, ky4<RequestMigrator> ky42, ky4<MemoryCache> ky43) {
        this.module = storageModule;
        this.baseStorageProvider = ky4;
        this.requestMigratorProvider = ky42;
        this.memoryCacheProvider = ky43;
    }

    public static StorageModule_ProvideRequestStorageFactory create(StorageModule storageModule, ky4<SessionStorage> ky4, ky4<RequestMigrator> ky42, ky4<MemoryCache> ky43) {
        return new StorageModule_ProvideRequestStorageFactory(storageModule, ky4, ky42, ky43);
    }

    public static RequestStorage provideRequestStorage(StorageModule storageModule, SessionStorage sessionStorage, Object obj, MemoryCache memoryCache) {
        return (RequestStorage) fu4.m44415f(storageModule.provideRequestStorage(sessionStorage, (RequestMigrator) obj, memoryCache));
    }

    public RequestStorage get() {
        return provideRequestStorage(this.module, this.baseStorageProvider.get(), this.requestMigratorProvider.get(), this.memoryCacheProvider.get());
    }
}
