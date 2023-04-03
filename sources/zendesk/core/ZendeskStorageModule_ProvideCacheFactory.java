package zendesk.core;

import java.io.File;
import okhttp3.Cache;

public final class ZendeskStorageModule_ProvideCacheFactory implements ry1<Cache> {
    private final ky4<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(ky4<File> ky4) {
        this.fileProvider = ky4;
    }

    public static ZendeskStorageModule_ProvideCacheFactory create(ky4<File> ky4) {
        return new ZendeskStorageModule_ProvideCacheFactory(ky4);
    }

    public static Cache provideCache(File file) {
        return (Cache) fu4.m44415f(ZendeskStorageModule.provideCache(file));
    }

    public Cache get() {
        return provideCache(this.fileProvider.get());
    }
}
