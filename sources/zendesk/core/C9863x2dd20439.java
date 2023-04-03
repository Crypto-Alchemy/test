package zendesk.core;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskBasicHeadersInterceptorFactory */
public final class C9863x2dd20439 implements ry1<ZendeskOauthIdHeaderInterceptor> {
    private final ky4<ApplicationConfiguration> configurationProvider;
    private final ZendeskNetworkModule module;

    public C9863x2dd20439(ZendeskNetworkModule zendeskNetworkModule, ky4<ApplicationConfiguration> ky4) {
        this.module = zendeskNetworkModule;
        this.configurationProvider = ky4;
    }

    public static C9863x2dd20439 create(ZendeskNetworkModule zendeskNetworkModule, ky4<ApplicationConfiguration> ky4) {
        return new C9863x2dd20439(zendeskNetworkModule, ky4);
    }

    public static ZendeskOauthIdHeaderInterceptor provideZendeskBasicHeadersInterceptor(ZendeskNetworkModule zendeskNetworkModule, ApplicationConfiguration applicationConfiguration) {
        return (ZendeskOauthIdHeaderInterceptor) fu4.m44415f(zendeskNetworkModule.provideZendeskBasicHeadersInterceptor(applicationConfiguration));
    }

    public ZendeskOauthIdHeaderInterceptor get() {
        return provideZendeskBasicHeadersInterceptor(this.module, this.configurationProvider.get());
    }
}
