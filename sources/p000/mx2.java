package p000;

import android.content.Context;
import java.io.File;
import p000.dh1;

/* renamed from: mx2 */
/* compiled from: InternalCacheDiskCacheFactory */
public final class mx2 extends dh1 {

    /* renamed from: mx2$a */
    /* compiled from: InternalCacheDiskCacheFactory */
    public class C2855a implements dh1.C2166a {

        /* renamed from: a */
        public final /* synthetic */ Context f15268a;

        /* renamed from: b */
        public final /* synthetic */ String f15269b;

        public C2855a(Context context, String str) {
            this.f15268a = context;
            this.f15269b = str;
        }

        /* renamed from: a */
        public File mo18774a() {
            File cacheDir = this.f15268a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            if (this.f15269b != null) {
                return new File(cacheDir, this.f15269b);
            }
            return cacheDir;
        }
    }

    public mx2(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public mx2(Context context, String str, long j) {
        super(new C2855a(context, str), j);
    }
}
