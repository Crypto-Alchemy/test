package p000;

import android.util.SparseIntArray;

/* renamed from: e81 */
/* compiled from: DefaultFlexByteArrayPoolParams */
public class e81 {

    /* renamed from: a */
    public static final int f11091a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static SparseIntArray m15976a(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }

    /* renamed from: b */
    public static ms4 m15977b() {
        int i = f11091a;
        return new ms4(4194304, i * 4194304, m15976a(131072, 4194304, i), 131072, 4194304, i);
    }
}
