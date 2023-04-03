package zendesk.support;

public final class SupportModule_ProvidesRequestProviderFactory implements ry1<RequestProvider> {
    private final SupportModule module;

    public SupportModule_ProvidesRequestProviderFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesRequestProviderFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesRequestProviderFactory(supportModule);
    }

    public static RequestProvider providesRequestProvider(SupportModule supportModule) {
        return (RequestProvider) fu4.m44415f(supportModule.providesRequestProvider());
    }

    public RequestProvider get() {
        return providesRequestProvider(this.module);
    }
}
