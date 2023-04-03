package zendesk.core;

import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideMediaOkHttpClientFactory implements ry1<OkHttpClient> {
    private final ky4<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final ky4<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final ky4<CachingInterceptor> cachingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final ky4<OkHttpClient> okHttpClientProvider;
    private final ky4<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final ky4<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<ZendeskAccessInterceptor> ky42, ky4<ZendeskAuthHeaderInterceptor> ky43, ky4<ZendeskSettingsInterceptor> ky44, ky4<CachingInterceptor> ky45, ky4<ZendeskUnauthorizedInterceptor> ky46) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = ky4;
        this.accessInterceptorProvider = ky42;
        this.authHeaderInterceptorProvider = ky43;
        this.settingsInterceptorProvider = ky44;
        this.cachingInterceptorProvider = ky45;
        this.unauthorizedInterceptorProvider = ky46;
    }

    public static ZendeskNetworkModule_ProvideMediaOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<ZendeskAccessInterceptor> ky42, ky4<ZendeskAuthHeaderInterceptor> ky43, ky4<ZendeskSettingsInterceptor> ky44, ky4<CachingInterceptor> ky45, ky4<ZendeskUnauthorizedInterceptor> ky46) {
        return new ZendeskNetworkModule_ProvideMediaOkHttpClientFactory(zendeskNetworkModule, ky4, ky42, ky43, ky44, ky45, ky46);
    }

    public static OkHttpClient provideMediaOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return (OkHttpClient) fu4.m44415f(zendeskNetworkModule.provideMediaOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskAuthHeaderInterceptor) obj2, (ZendeskSettingsInterceptor) obj3, (CachingInterceptor) obj4, (ZendeskUnauthorizedInterceptor) obj5));
    }

    public OkHttpClient get() {
        return provideMediaOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.cachingInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get());
    }
}
