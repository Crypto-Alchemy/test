package zendesk.core;

import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import p000.og5;

class ZendeskRestServiceProvider implements RestServiceProvider {
    private final OkHttpClient coreOkHttpClient;
    private final OkHttpClient mediaHttpClient;
    public final og5 retrofit;
    public final OkHttpClient standardOkHttpClient;

    public ZendeskRestServiceProvider(og5 og5, OkHttpClient okHttpClient, OkHttpClient okHttpClient2, OkHttpClient okHttpClient3) {
        this.retrofit = og5;
        this.mediaHttpClient = okHttpClient;
        this.standardOkHttpClient = okHttpClient2;
        this.coreOkHttpClient = okHttpClient3;
    }

    private OkHttpClient.Builder createNonAuthenticatedOkHttpClient() {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        Iterator<Interceptor> it = newBuilder.interceptors().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ZendeskAuthHeaderInterceptor) {
                it.remove();
            }
        }
        return newBuilder;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2) {
        return this.retrofit.mo62911d().mo62925f(this.standardOkHttpClient.newBuilder().addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2)).build()).mo62923d().mo62909b(cls);
    }

    public <E> E createUnauthenticatedRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder createNonAuthenticatedOkHttpClient = createNonAuthenticatedOkHttpClient();
        customNetworkConfig.configureOkHttpClient(createNonAuthenticatedOkHttpClient);
        createNonAuthenticatedOkHttpClient.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        og5.C9026b d = this.retrofit.mo62911d();
        customNetworkConfig.configureRetrofit(d);
        return d.mo62925f(createNonAuthenticatedOkHttpClient.build()).mo62923d().mo62909b(cls);
    }

    public OkHttpClient getCoreOkHttpClient() {
        return this.coreOkHttpClient;
    }

    public OkHttpClient getMediaOkHttpClient() {
        return this.mediaHttpClient;
    }

    public <E> E createRestService(Class<E> cls, String str, String str2, CustomNetworkConfig customNetworkConfig) {
        OkHttpClient.Builder newBuilder = this.standardOkHttpClient.newBuilder();
        customNetworkConfig.configureOkHttpClient(newBuilder);
        newBuilder.addInterceptor(new UserAgentAndClientHeadersInterceptor(str, str2));
        og5.C9026b d = this.retrofit.mo62911d();
        customNetworkConfig.configureRetrofit(d);
        return d.mo62925f(newBuilder.build()).mo62923d().mo62909b(cls);
    }
}
