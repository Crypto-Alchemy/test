package zendesk.support;

public final class SupportModule_ProvidesSettingsProviderFactory implements ry1<SupportSettingsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesSettingsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesSettingsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesSettingsProviderFactory(supportModule);
    }

    public static SupportSettingsProvider providesSettingsProvider(SupportModule supportModule) {
        return (SupportSettingsProvider) fu4.m44415f(supportModule.providesSettingsProvider());
    }

    public SupportSettingsProvider get() {
        return providesSettingsProvider(this.module);
    }
}
