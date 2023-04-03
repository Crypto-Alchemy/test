package zendesk.core;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvidePushProviderRetrofitFactory implements ry1<og5> {
    private final ky4<ZendeskAuthHeaderInterceptor> authHeaderInterceptorProvider;
    private final ky4<ApplicationConfiguration> configurationProvider;
    private final ky4<Gson> gsonProvider;
    private final ky4<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(ky4<ApplicationConfiguration> ky4, ky4<Gson> ky42, ky4<OkHttpClient> ky43, ky4<ZendeskAuthHeaderInterceptor> ky44) {
        this.configurationProvider = ky4;
        this.gsonProvider = ky42;
        this.okHttpClientProvider = ky43;
        this.authHeaderInterceptorProvider = ky44;
    }

    public static ZendeskNetworkModule_ProvidePushProviderRetrofitFactory create(ky4<ApplicationConfiguration> ky4, ky4<Gson> ky42, ky4<OkHttpClient> ky43, ky4<ZendeskAuthHeaderInterceptor> ky44) {
        return new ZendeskNetworkModule_ProvidePushProviderRetrofitFactory(ky4, ky42, ky43, ky44);
    }

    public static og5 providePushProviderRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient, Object obj) {
        return (og5) fu4.m44415f(ZendeskNetworkModule.providePushProviderRetrofit(applicationConfiguration, gson, okHttpClient, (ZendeskAuthHeaderInterceptor) obj));
    }

    public og5 get() {
        return providePushProviderRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get(), this.authHeaderInterceptorProvider.get());
    }
}
