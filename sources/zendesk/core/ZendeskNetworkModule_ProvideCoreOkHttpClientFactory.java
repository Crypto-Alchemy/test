package zendesk.core;

import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideCoreOkHttpClientFactory implements ry1<OkHttpClient> {
    private final ky4<AcceptHeaderInterceptor> acceptHeaderInterceptorProvider;
    private final ky4<AcceptLanguageHeaderInterceptor> acceptLanguageHeaderInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final ky4<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<AcceptLanguageHeaderInterceptor> ky42, ky4<AcceptHeaderInterceptor> ky43) {
        this.module = zendeskNetworkModule;
        this.okHttpClientProvider = ky4;
        this.acceptLanguageHeaderInterceptorProvider = ky42;
        this.acceptHeaderInterceptorProvider = ky43;
    }

    public static ZendeskNetworkModule_ProvideCoreOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, ky4<OkHttpClient> ky4, ky4<AcceptLanguageHeaderInterceptor> ky42, ky4<AcceptHeaderInterceptor> ky43) {
        return new ZendeskNetworkModule_ProvideCoreOkHttpClientFactory(zendeskNetworkModule, ky4, ky42, ky43);
    }

    public static OkHttpClient provideCoreOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, OkHttpClient okHttpClient, Object obj, Object obj2) {
        return (OkHttpClient) fu4.m44415f(zendeskNetworkModule.provideCoreOkHttpClient(okHttpClient, (AcceptLanguageHeaderInterceptor) obj, (AcceptHeaderInterceptor) obj2));
    }

    public OkHttpClient get() {
        return provideCoreOkHttpClient(this.module, this.okHttpClientProvider.get(), this.acceptLanguageHeaderInterceptorProvider.get(), this.acceptHeaderInterceptorProvider.get());
    }
}
