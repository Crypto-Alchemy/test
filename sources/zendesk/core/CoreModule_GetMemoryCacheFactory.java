package zendesk.core;

public final class CoreModule_GetMemoryCacheFactory implements ry1<MemoryCache> {
    private final CoreModule module;

    public CoreModule_GetMemoryCacheFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetMemoryCacheFactory create(CoreModule coreModule) {
        return new CoreModule_GetMemoryCacheFactory(coreModule);
    }

    public static MemoryCache getMemoryCache(CoreModule coreModule) {
        return (MemoryCache) fu4.m44415f(coreModule.getMemoryCache());
    }

    public MemoryCache get() {
        return getMemoryCache(this.module);
    }
}
