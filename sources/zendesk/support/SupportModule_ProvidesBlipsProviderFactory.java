package zendesk.support;

public final class SupportModule_ProvidesBlipsProviderFactory implements ry1<SupportBlipsProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesBlipsProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesBlipsProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesBlipsProviderFactory(supportModule);
    }

    public static SupportBlipsProvider providesBlipsProvider(SupportModule supportModule) {
        return (SupportBlipsProvider) fu4.m44415f(supportModule.providesBlipsProvider());
    }

    public SupportBlipsProvider get() {
        return providesBlipsProvider(this.module);
    }
}
