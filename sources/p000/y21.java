package p000;

import android.util.SparseIntArray;

/* renamed from: y21 */
/* compiled from: DebugOverlayImageOriginColor */
public class y21 {

    /* renamed from: a */
    public static final SparseIntArray f20022a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(7);
        f20022a = sparseIntArray;
        sparseIntArray.append(1, -7829368);
        sparseIntArray.append(2, -65536);
        sparseIntArray.append(3, -256);
        sparseIntArray.append(4, -256);
        sparseIntArray.append(5, -16711936);
        sparseIntArray.append(6, -16711936);
        sparseIntArray.append(7, -16711936);
    }

    /* renamed from: a */
    public static int m30378a(int i) {
        return f20022a.get(i, -1);
    }
}
