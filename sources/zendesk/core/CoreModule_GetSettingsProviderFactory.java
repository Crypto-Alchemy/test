package zendesk.core;

public final class CoreModule_GetSettingsProviderFactory implements ry1<SettingsProvider> {
    private final CoreModule module;

    public CoreModule_GetSettingsProviderFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static CoreModule_GetSettingsProviderFactory create(CoreModule coreModule) {
        return new CoreModule_GetSettingsProviderFactory(coreModule);
    }

    public static SettingsProvider getSettingsProvider(CoreModule coreModule) {
        return (SettingsProvider) fu4.m44415f(coreModule.getSettingsProvider());
    }

    public SettingsProvider get() {
        return getSettingsProvider(this.module);
    }
}
