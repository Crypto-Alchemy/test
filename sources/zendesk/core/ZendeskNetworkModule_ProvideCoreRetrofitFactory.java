package zendesk.core;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;

public final class ZendeskNetworkModule_ProvideCoreRetrofitFactory implements ry1<og5> {
    private final ky4<ApplicationConfiguration> configurationProvider;
    private final ky4<Gson> gsonProvider;
    private final ky4<OkHttpClient> okHttpClientProvider;

    public ZendeskNetworkModule_ProvideCoreRetrofitFactory(ky4<ApplicationConfiguration> ky4, ky4<Gson> ky42, ky4<OkHttpClient> ky43) {
        this.configurationProvider = ky4;
        this.gsonProvider = ky42;
        this.okHttpClientProvider = ky43;
    }

    public static ZendeskNetworkModule_ProvideCoreRetrofitFactory create(ky4<ApplicationConfiguration> ky4, ky4<Gson> ky42, ky4<OkHttpClient> ky43) {
        return new ZendeskNetworkModule_ProvideCoreRetrofitFactory(ky4, ky42, ky43);
    }

    public static og5 provideCoreRetrofit(ApplicationConfiguration applicationConfiguration, Gson gson, OkHttpClient okHttpClient) {
        return (og5) fu4.m44415f(ZendeskNetworkModule.provideCoreRetrofit(applicationConfiguration, gson, okHttpClient));
    }

    public og5 get() {
        return provideCoreRetrofit(this.configurationProvider.get(), this.gsonProvider.get(), this.okHttpClientProvider.get());
    }
}
