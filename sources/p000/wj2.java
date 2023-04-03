package p000;

import java.lang.reflect.Array;

/* renamed from: wj2 */
/* compiled from: GrowingArrayUtils */
public final class wj2 {
    /* renamed from: a */
    public static int[] m29605a(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[m29607c(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    /* renamed from: b */
    public static <T> T[] m29606b(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), m29607c(i));
            System.arraycopy(tArr, 0, tArr2, 0, i);
            tArr = tArr2;
        }
        tArr[i] = t;
        return tArr;
    }

    /* renamed from: c */
    public static int m29607c(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }
}
