package p000;

import android.util.SparseIntArray;

/* renamed from: v61 */
/* compiled from: DefaultBitmapPoolParams */
public class v61 {

    /* renamed from: a */
    public static final SparseIntArray f18685a = new SparseIntArray(0);

    /* renamed from: a */
    public static ms4 m28647a() {
        return new ms4(0, m28648b(), f18685a);
    }

    /* renamed from: b */
    public static int m28648b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }
}
