package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* renamed from: q02 */
/* compiled from: FileDescriptorAssetPathFetcher */
public class q02 extends C3099pr<AssetFileDescriptor> {
    public q02(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    public Class<AssetFileDescriptor> mo11939a() {
        return AssetFileDescriptor.class;
    }

    /* renamed from: g */
    public void mo22713c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* renamed from: h */
    public AssetFileDescriptor mo22714f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
