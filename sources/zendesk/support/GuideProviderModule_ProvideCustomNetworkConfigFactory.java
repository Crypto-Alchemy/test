package zendesk.support;

public final class GuideProviderModule_ProvideCustomNetworkConfigFactory implements ry1<HelpCenterCachingNetworkConfig> {
    private final ky4<HelpCenterCachingInterceptor> helpCenterCachingInterceptorProvider;

    public GuideProviderModule_ProvideCustomNetworkConfigFactory(ky4<HelpCenterCachingInterceptor> ky4) {
        this.helpCenterCachingInterceptorProvider = ky4;
    }

    public static GuideProviderModule_ProvideCustomNetworkConfigFactory create(ky4<HelpCenterCachingInterceptor> ky4) {
        return new GuideProviderModule_ProvideCustomNetworkConfigFactory(ky4);
    }

    public static HelpCenterCachingNetworkConfig provideCustomNetworkConfig(Object obj) {
        return (HelpCenterCachingNetworkConfig) fu4.m44415f(GuideProviderModule.provideCustomNetworkConfig((HelpCenterCachingInterceptor) obj));
    }

    public HelpCenterCachingNetworkConfig get() {
        return provideCustomNetworkConfig(this.helpCenterCachingInterceptorProvider.get());
    }
}
