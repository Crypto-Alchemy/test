package zendesk.support;

public final class StorageModule_ProvideRequestSessionCacheFactory implements ry1<RequestSessionCache> {
    private final StorageModule module;

    public StorageModule_ProvideRequestSessionCacheFactory(StorageModule storageModule) {
        this.module = storageModule;
    }

    public static StorageModule_ProvideRequestSessionCacheFactory create(StorageModule storageModule) {
        return new StorageModule_ProvideRequestSessionCacheFactory(storageModule);
    }

    public static RequestSessionCache provideRequestSessionCache(StorageModule storageModule) {
        return (RequestSessionCache) fu4.m44415f(storageModule.provideRequestSessionCache());
    }

    public RequestSessionCache get() {
        return provideRequestSessionCache(this.module);
    }
}
