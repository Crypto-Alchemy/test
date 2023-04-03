package zendesk.support;

import zendesk.core.SessionStorage;

public final class SupportSdkModule_ProvidesRequestDiskLruCacheFactory implements ry1<ch1> {
    private final SupportSdkModule module;
    private final ky4<SessionStorage> sessionStorageProvider;

    public SupportSdkModule_ProvidesRequestDiskLruCacheFactory(SupportSdkModule supportSdkModule, ky4<SessionStorage> ky4) {
        this.module = supportSdkModule;
        this.sessionStorageProvider = ky4;
    }

    public static SupportSdkModule_ProvidesRequestDiskLruCacheFactory create(SupportSdkModule supportSdkModule, ky4<SessionStorage> ky4) {
        return new SupportSdkModule_ProvidesRequestDiskLruCacheFactory(supportSdkModule, ky4);
    }

    public static ch1 providesRequestDiskLruCache(SupportSdkModule supportSdkModule, SessionStorage sessionStorage) {
        return (ch1) fu4.m44415f(supportSdkModule.providesRequestDiskLruCache(sessionStorage));
    }

    public ch1 get() {
        return providesRequestDiskLruCache(this.module, this.sessionStorageProvider.get());
    }
}
