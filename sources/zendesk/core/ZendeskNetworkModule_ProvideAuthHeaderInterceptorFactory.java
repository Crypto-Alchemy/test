package zendesk.core;

public final class ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory implements ry1<ZendeskAuthHeaderInterceptor> {
    private final ky4<IdentityManager> identityManagerProvider;

    public ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(ky4<IdentityManager> ky4) {
        this.identityManagerProvider = ky4;
    }

    public static ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory create(ky4<IdentityManager> ky4) {
        return new ZendeskNetworkModule_ProvideAuthHeaderInterceptorFactory(ky4);
    }

    public static ZendeskAuthHeaderInterceptor provideAuthHeaderInterceptor(Object obj) {
        return (ZendeskAuthHeaderInterceptor) fu4.m44415f(ZendeskNetworkModule.provideAuthHeaderInterceptor((IdentityManager) obj));
    }

    public ZendeskAuthHeaderInterceptor get() {
        return provideAuthHeaderInterceptor(this.identityManagerProvider.get());
    }
}
