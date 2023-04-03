package zendesk.core;

public final class CoreModule_GetPushRegistrationProviderFactory implements ry1<PushRegistrationProvider> {
    private final CoreModule module;

    public CoreModule_GetPushRegistrationProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetPushRegistrationProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetPushRegistrationProviderFactory(coreModule);
    }

    public static PushRegistrationProvider getPushRegistrationProvider(CoreModule coreModule) {
        return (PushRegistrationProvider) fu4.m44415f(coreModule.getPushRegistrationProvider());
    }

    public PushRegistrationProvider get() {
        return getPushRegistrationProvider(this.module);
    }
}
