package zendesk.core;

public final class CoreModule_GetApplicationConfigurationFactory implements ry1<ApplicationConfiguration> {
    private final CoreModule module;

    public CoreModule_GetApplicationConfigurationFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetApplicationConfigurationFactory create(CoreModule coreModule) {
        return new CoreModule_GetApplicationConfigurationFactory(coreModule);
    }

    public static ApplicationConfiguration getApplicationConfiguration(CoreModule coreModule) {
        return (ApplicationConfiguration) fu4.m44415f(coreModule.getApplicationConfiguration());
    }

    public ApplicationConfiguration get() {
        return getApplicationConfiguration(this.module);
    }
}
