package zendesk.core;

import android.content.Context;
import java.io.File;

public final class ZendeskStorageModule_ProvidesDataDirFactory implements ry1<File> {
    private final ky4<Context> contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskStorageModule_ProvidesDataDirFactory create(ky4<Context> ky4) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(ky4);
    }

    public static File providesDataDir(Context context) {
        return (File) fu4.m44415f(ZendeskStorageModule.providesDataDir(context));
    }

    public File get() {
        return providesDataDir(this.contextProvider.get());
    }
}
