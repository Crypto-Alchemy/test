package zendesk.core;

import okhttp3.Cache;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideOkHttpClientFactory implements ry1<OkHttpClient> {
    private final ky4<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final ky4<ZendeskAccessInterceptor> accessInterceptorProvider;
    private final ky4<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final ky4<Cache> cacheProvider;
    private final ZendeskNetworkModule module;
    private final ky4<OkHttpClient> okHttpClientProvider;
    private final ky4<ZendeskPushInterceptor> pushInterceptorProvider;
    private final ky4<ZendeskSettingsInterceptor> settingsInterceptorProvider;
    private final ky4<ZendeskUnauthorizedInterceptor> unauthorizedInterceptorProvider;

    public ZendeskNetworkModule_ProvideOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<ZendeskAccessInterceptor> ky42, ky4<ZendeskUnauthorizedInterceptor> ky43, ky4<ZendeskAuthHeaderInterceptor> ky44, ky4<ZendeskSettingsInterceptor> ky45, ky4<AcceptHeaderInterceptor> ky46, ky4<ZendeskPushInterceptor> ky47, ky4<Cache> ky48) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = ky4;
        this.accessInterceptorProvider = ky42;
        this.unauthorizedInterceptorProvider = ky43;
        this.authHeaderInterceptorProvider = ky44;
        this.settingsInterceptorProvider = ky45;
        this.acceptHeaderInterceptorProvider = ky46;
        this.pushInterceptorProvider = ky47;
        this.cacheProvider = ky48;
    }

    public static ZendeskNetworkModule_ProvideOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<ZendeskAccessInterceptor> ky42, ky4<ZendeskUnauthorizedInterceptor> ky43, ky4<ZendeskAuthHeaderInterceptor> ky44, ky4<ZendeskSettingsInterceptor> ky45, ky4<AcceptHeaderInterceptor> ky46, ky4<ZendeskPushInterceptor> ky47, ky4<Cache> ky48) {
        return new ZendeskNetworkModule_ProvideOkHttpClientFactory(zendeskNetworkModule, ky4, ky42, ky43, ky44, ky45, ky46, ky47, ky48);
    }

    public static OkHttpClient provideOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Cache cache) {
        return (OkHttpClient) fu4.m44415f(zendeskNetworkModule.provideOkHttpClient(okHttpClient, (ZendeskAccessInterceptor) obj, (ZendeskUnauthorizedInterceptor) obj2, (ZendeskAuthHeaderInterceptor) obj3, (ZendeskSettingsInterceptor) obj4, (AcceptHeaderInterceptor) obj5, (ZendeskPushInterceptor) obj6, cache));
    }

    public OkHttpClient get() {
        return provideOkHttpClient(this.module, this.okHttpClientProvider.get(), this.accessInterceptorProvider.get(), this.unauthorizedInterceptorProvider.get(), this.authHeaderInterceptorProvider.get(), this.settingsInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get(), this.pushInterceptorProvider.get(), this.cacheProvider.get());
    }
}
