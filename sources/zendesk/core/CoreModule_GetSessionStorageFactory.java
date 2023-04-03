package zendesk.core;

public final class CoreModule_GetSessionStorageFactory implements ry1<SessionStorage> {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSessionStorageFactory create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public static SessionStorage getSessionStorage(CoreModule coreModule) {
        return (SessionStorage) fu4.m44415f(coreModule.getSessionStorage());
    }

    public SessionStorage get() {
        return getSessionStorage(this.module);
    }
}
