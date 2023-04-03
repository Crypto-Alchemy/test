package zendesk.core;

/* renamed from: zendesk.core.ZendeskNetworkModule_ProvideZendeskUnauthorizedInterceptorFactory */
public final class C9864x5893b2b5 implements ry1<ZendeskUnauthorizedInterceptor> {
    private final ky4<IdentityManager> identityManagerProvider;
    private final ky4<SessionStorage> sessionStorageProvider;

    public C9864x5893b2b5(ky4<SessionStorage> ky4, ky4<IdentityManager> ky42) {
        this.sessionStorageProvider = ky4;
        this.identityManagerProvider = ky42;
    }

    public static C9864x5893b2b5 create(ky4<SessionStorage> ky4, ky4<IdentityManager> ky42) {
        return new C9864x5893b2b5(ky4, ky42);
    }

    public static ZendeskUnauthorizedInterceptor provideZendeskUnauthorizedInterceptor(SessionStorage sessionStorage, Object obj) {
        return (ZendeskUnauthorizedInterceptor) fu4.m44415f(ZendeskNetworkModule.provideZendeskUnauthorizedInterceptor(sessionStorage, (IdentityManager) obj));
    }

    public ZendeskUnauthorizedInterceptor get() {
        return provideZendeskUnauthorizedInterceptor(this.sessionStorageProvider.get(), this.identityManagerProvider.get());
    }
}
