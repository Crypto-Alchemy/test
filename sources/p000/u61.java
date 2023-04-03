package p000;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: u61 */
/* compiled from: DefaultBitmapMemoryCacheParamsSupplier */
public class u61 implements td6<zs3> {

    /* renamed from: b */
    public static final long f18387b = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    public final ActivityManager f18388a;

    public u61(ActivityManager activityManager) {
        this.f18388a = activityManager;
    }

    /* renamed from: a */
    public zs3 get() {
        return new zs3(mo26657b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f18387b);
    }

    /* renamed from: b */
    public final int mo26657b() {
        int min = Math.min(this.f18388a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            return 4194304;
        }
        if (min < 67108864) {
            return 6291456;
        }
        return min / 4;
    }
}
