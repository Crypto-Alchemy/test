package zendesk.core;

import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideRestServiceProviderFactory implements ry1<RestServiceProvider> {
    private final ky4<OkHttpClient> coreOkHttpClientProvider;
    private final ky4<OkHttpClient> mediaOkHttpClientProvider;
    private final ZendeskNetworkModule module;
    private final ky4<og5> retrofitProvider;
    private final ky4<OkHttpClient> standardOkHttpClientProvider;

    public ZendeskNetworkModule_ProvideRestServiceProviderFactory(ZendeskNetworkModule zendeskNetworkModule, ky4<og5> ky4, ky4<OkHttpClient> ky42, ky4<OkHttpClient> ky43, ky4<OkHttpClient> ky44) {
        this.module = zendeskNetworkModule;
        this.retrofitProvider = ky4;
        this.mediaOkHttpClientProvider = ky42;
        this.standardOkHttpClientProvider = ky43;
        this.coreOkHttpClientProvider = ky44;
    }

    public static ZendeskNetworkModule_ProvideRestServiceProviderFactory create(ZendeskNetworkModule zendeskNetworkModule, ky4<og5> ky4, ky4<OkHttpClient> ky42, ky4<OkHttpClient> ky43, ky4<OkHttpClient> ky44) {
        return new ZendeskNetworkModule_ProvideRestServiceProviderFactory(zendeskNetworkModule, ky4, ky42, ky43, ky44);
    }

    public static RestServiceProvider provideRestServiceProvider(ZendeskNetworkModule zendeskNetworkModule, og5 og5, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        return (RestServiceProvider) fu4.m44415f(zendeskNetworkModule.provideRestServiceProvider(og5, okHttpClient, okHttpClient2, okHttpClient3));
    }

    public RestServiceProvider get() {
        return provideRestServiceProvider(this.module, this.retrofitProvider.get(), this.mediaOkHttpClientProvider.get(), this.standardOkHttpClientProvider.get(), this.coreOkHttpClientProvider.get());
    }
}
