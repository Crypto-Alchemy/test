package zendesk.support;

import okhttp3.OkHttpClient;

public final class SupportModule_ProvidesOkHttpClientFactory implements ry1<OkHttpClient> {
    private final SupportModule module;

    public SupportModule_ProvidesOkHttpClientFactory(SupportModule supportModule) {
        this.module = supportModule;
    }

    public static SupportModule_ProvidesOkHttpClientFactory create(SupportModule supportModule) {
        return new SupportModule_ProvidesOkHttpClientFactory(supportModule);
    }

    public static OkHttpClient providesOkHttpClient(SupportModule supportModule) {
        return (OkHttpClient) fu4.m44415f(supportModule.providesOkHttpClient());
    }

    public OkHttpClient get() {
        return providesOkHttpClient(this.module);
    }
}
