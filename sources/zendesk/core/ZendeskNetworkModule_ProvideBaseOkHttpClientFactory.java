package zendesk.core;

import java.util.concurrent.ExecutorService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public final class ZendeskNetworkModule_ProvideBaseOkHttpClientFactory implements ry1<OkHttpClient> {
    private final ky4<ExecutorService> executorServiceProvider;
    private final ky4<HttpLoggingInterceptor> loggingInterceptorProvider;
    private final ZendeskNetworkModule module;
    private final ky4<ZendeskOauthIdHeaderInterceptor> oauthIdHeaderInterceptorProvider;
    private final ky4<UserAgentAndClientHeadersInterceptor> userAgentAndClientHeadersInterceptorProvider;

    public ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(ZendeskNetworkModule zendeskNetworkModule, ky4<HttpLoggingInterceptor> ky4, ky4<ZendeskOauthIdHeaderInterceptor> ky42, ky4<UserAgentAndClientHeadersInterceptor> ky43, ky4<ExecutorService> ky44) {
        this.module = zendeskNetworkModule;
        this.loggingInterceptorProvider = ky4;
        this.oauthIdHeaderInterceptorProvider = ky42;
        this.userAgentAndClientHeadersInterceptorProvider = ky43;
        this.executorServiceProvider = ky44;
    }

    public static ZendeskNetworkModule_ProvideBaseOkHttpClientFactory create(ZendeskNetworkModule zendeskNetworkModule, ky4<HttpLoggingInterceptor> ky4, ky4<ZendeskOauthIdHeaderInterceptor> ky42, ky4<UserAgentAndClientHeadersInterceptor> ky43, ky4<ExecutorService> ky44) {
        return new ZendeskNetworkModule_ProvideBaseOkHttpClientFactory(zendeskNetworkModule, ky4, ky42, ky43, ky44);
    }

    public static OkHttpClient provideBaseOkHttpClient(ZendeskNetworkModule zendeskNetworkModule, HttpLoggingInterceptor httpLoggingInterceptor, Object obj, Object obj2, ExecutorService executorService) {
        return (OkHttpClient) fu4.m44415f(zendeskNetworkModule.provideBaseOkHttpClient(httpLoggingInterceptor, (ZendeskOauthIdHeaderInterceptor) obj, (UserAgentAndClientHeadersInterceptor) obj2, executorService));
    }

    public OkHttpClient get() {
        return provideBaseOkHttpClient(this.module, this.loggingInterceptorProvider.get(), this.oauthIdHeaderInterceptorProvider.get(), this.userAgentAndClientHeadersInterceptorProvider.get(), this.executorServiceProvider.get());
    }
}
