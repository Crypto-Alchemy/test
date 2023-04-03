package zendesk.core;

import android.content.Context;
import java.io.File;

public final class ZendeskStorageModule_ProvidesCacheDirFactory implements ry1<File> {
    private final ky4<Context> contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskStorageModule_ProvidesCacheDirFactory create(ky4<Context> ky4) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(ky4);
    }

    public static File providesCacheDir(Context context) {
        return (File) fu4.m44415f(ZendeskStorageModule.providesCacheDir(context));
    }

    public File get() {
        return providesCacheDir(this.contextProvider.get());
    }
}
