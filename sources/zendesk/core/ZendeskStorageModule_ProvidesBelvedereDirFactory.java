package zendesk.core;

import android.content.Context;
import java.io.File;

public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements ry1<File> {
    private final ky4<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(ky4<Context> ky4) {
        this.contextProvider = ky4;
    }

    public static ZendeskStorageModule_ProvidesBelvedereDirFactory create(ky4<Context> ky4) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(ky4);
    }

    public static File providesBelvedereDir(Context context) {
        return (File) fu4.m44415f(ZendeskStorageModule.providesBelvedereDir(context));
    }

    public File get() {
        return providesBelvedereDir(this.contextProvider.get());
    }
}
