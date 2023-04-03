package zendesk.support;

public final class SupportModule_ProvidesUploadProviderFactory implements ry1<UploadProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesUploadProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesUploadProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesUploadProviderFactory(supportModule);
    }

    public static UploadProvider providesUploadProvider(SupportModule supportModule) {
        return (UploadProvider) fu4.m44415f(supportModule.providesUploadProvider());
    }

    public UploadProvider get() {
        return providesUploadProvider(this.module);
    }
}
