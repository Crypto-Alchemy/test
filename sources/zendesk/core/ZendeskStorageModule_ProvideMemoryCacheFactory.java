package zendesk.core;

public final class ZendeskStorageModule_ProvideMemoryCacheFactory implements ry1<MemoryCache> {

    public static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final ZendeskStorageModule_ProvideMemoryCacheFactory INSTANCE = new ZendeskStorageModule_ProvideMemoryCacheFactory();

        private InstanceHolder() {
        }
    }

    public static ZendeskStorageModule_ProvideMemoryCacheFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MemoryCache provideMemoryCache() {
        return (MemoryCache) fu4.m44415f(ZendeskStorageModule.provideMemoryCache());
    }

    public MemoryCache get() {
        return provideMemoryCache();
    }
}
