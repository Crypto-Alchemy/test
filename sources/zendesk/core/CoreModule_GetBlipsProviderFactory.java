package zendesk.core;

public final class CoreModule_GetBlipsProviderFactory implements ry1<BlipsProvider> {
    private final CoreModule module;

    public CoreModule_GetBlipsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetBlipsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetBlipsProviderFactory(coreModule);
    }

    public static BlipsProvider getBlipsProvider(CoreModule coreModule) {
        return (BlipsProvider) fu4.m44415f(coreModule.getBlipsProvider());
    }

    public BlipsProvider get() {
        return getBlipsProvider(this.module);
    }
}
