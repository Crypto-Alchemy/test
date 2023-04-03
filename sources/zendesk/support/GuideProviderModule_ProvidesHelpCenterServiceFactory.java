package zendesk.support;

import zendesk.core.RestServiceProvider;

public final class GuideProviderModule_ProvidesHelpCenterServiceFactory implements ry1<HelpCenterService> {
    private final ky4<HelpCenterCachingNetworkConfig> helpCenterCachingNetworkConfigProvider;
    private final ky4<RestServiceProvider> restServiceProvider;

    public GuideProviderModule_ProvidesHelpCenterServiceFactory(ky4<RestServiceProvider> ky4, ky4<HelpCenterCachingNetworkConfig> ky42) {
        this.restServiceProvider = ky4;
        this.helpCenterCachingNetworkConfigProvider = ky42;
    }

    public static GuideProviderModule_ProvidesHelpCenterServiceFactory create(ky4<RestServiceProvider> ky4, ky4<HelpCenterCachingNetworkConfig> ky42) {
        return new GuideProviderModule_ProvidesHelpCenterServiceFactory(ky4, ky42);
    }

    public static HelpCenterService providesHelpCenterService(RestServiceProvider restServiceProvider2, Object obj) {
        return (HelpCenterService) fu4.m44415f(GuideProviderModule.providesHelpCenterService(restServiceProvider2, (HelpCenterCachingNetworkConfig) obj));
    }

    public HelpCenterService get() {
        return providesHelpCenterService(this.restServiceProvider.get(), this.helpCenterCachingNetworkConfigProvider.get());
    }
}
