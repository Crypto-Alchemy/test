package zendesk.core;

public final class CoreModule_GetRestServiceProviderFactory implements ry1<RestServiceProvider> {
    private final CoreModule module;

    public CoreModule_GetRestServiceProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetRestServiceProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetRestServiceProviderFactory(coreModule);
    }

    public static RestServiceProvider getRestServiceProvider(CoreModule coreModule) {
        return (RestServiceProvider) fu4.m44415f(coreModule.getRestServiceProvider());
    }

    public RestServiceProvider get() {
        return getRestServiceProvider(this.module);
    }
}
