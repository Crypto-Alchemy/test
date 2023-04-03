package zendesk.support;

import okhttp3.OkHttpClient;

public final class SupportSdkModule_OkHttp3DownloaderFactory implements ry1<ig4> {
    private final SupportSdkModule module;
    private final ky4<OkHttpClient> okHttpClientProvider;

    public SupportSdkModule_OkHttp3DownloaderFactory(SupportSdkModule supportSdkModule, ky4<OkHttpClient> ky4) {
        this.module = supportSdkModule;
        this.okHttpClientProvider = ky4;
    }

    public static SupportSdkModule_OkHttp3DownloaderFactory create(SupportSdkModule supportSdkModule, ky4<OkHttpClient> ky4) {
        return new SupportSdkModule_OkHttp3DownloaderFactory(supportSdkModule, ky4);
    }

    public static ig4 okHttp3Downloader(SupportSdkModule supportSdkModule, OkHttpClient okHttpClient) {
        return (ig4) fu4.m44415f(supportSdkModule.okHttp3Downloader(okHttpClient));
    }

    public ig4 get() {
        return okHttp3Downloader(this.module, this.okHttpClientProvider.get());
    }
}
