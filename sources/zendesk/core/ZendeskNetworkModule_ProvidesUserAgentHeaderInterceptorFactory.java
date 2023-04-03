package zendesk.core;

public final class ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory implements ry1<UserAgentAndClientHeadersInterceptor> {
    private final ZendeskNetworkModule module;

    public ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(ZendeskNetworkModule zendeskNetworkModule) {
        this.module = zendeskNetworkModule;
    }

    public static ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory create(ZendeskNetworkModule zendeskNetworkModule) {
        return new ZendeskNetworkModule_ProvidesUserAgentHeaderInterceptorFactory(zendeskNetworkModule);
    }

    public static UserAgentAndClientHeadersInterceptor providesUserAgentHeaderInterceptor(ZendeskNetworkModule zendeskNetworkModule) {
        return (UserAgentAndClientHeadersInterceptor) fu4.m44415f(zendeskNetworkModule.providesUserAgentHeaderInterceptor());
    }

    public UserAgentAndClientHeadersInterceptor get() {
        return providesUserAgentHeaderInterceptor(this.module);
    }
}
