package zendesk.core;

public final class ZendeskNetworkModule_ProvideCachingInterceptorFactory implements ry1<CachingInterceptor> {
    private final ky4<BaseStorage> mediaCacheProvider;

    public ZendeskNetworkModule_ProvideCachingInterceptorFactory(ky4<BaseStorage> ky4) {
        this.mediaCacheProvider = ky4;
    }

    public static ZendeskNetworkModule_ProvideCachingInterceptorFactory create(ky4<BaseStorage> ky4) {
        return new ZendeskNetworkModule_ProvideCachingInterceptorFactory(ky4);
    }

    public static CachingInterceptor provideCachingInterceptor(BaseStorage baseStorage) {
        return (CachingInterceptor) fu4.m44415f(ZendeskNetworkModule.provideCachingInterceptor(baseStorage));
    }

    public CachingInterceptor get() {
        return provideCachingInterceptor(this.mediaCacheProvider.get());
    }
}
