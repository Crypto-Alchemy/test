package p000;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.File;
import java.util.Set;

/* renamed from: gq7 */
public final class gq7 {

    /* renamed from: a */
    public final ot7 f29323a;

    public gq7(ot7 ot7) {
        this.f29323a = ot7;
    }

    /* renamed from: b */
    public static final int m44835b(AssetManager assetManager, File file) {
        int intValue = ((Integer) ns7.m48994a(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        StringBuilder sb = new StringBuilder(39);
        sb.append("addAssetPath completed with ");
        sb.append(intValue);
        return intValue;
    }

    /* renamed from: a */
    public final synchronized void mo42950a(Context context, Set<File> set) {
        AssetManager assets = context.getAssets();
        for (File b : set) {
            m44835b(assets, b);
        }
    }
}
