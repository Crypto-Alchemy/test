package p000;

import com.google.common.collect.C4627f;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: ve4 */
/* compiled from: ObjectArrays */
public final class ve4 {
    @CanIgnoreReturnValue
    /* renamed from: a */
    public static Object m53363a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static Object[] m53364b(Object... objArr) {
        m53365c(objArr, objArr.length);
        return objArr;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public static Object[] m53365c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m53363a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m53366d(T[] tArr, int i) {
        return C4627f.m37018b(tArr, i);
    }

    /* renamed from: e */
    public static <T> T[] m53367e(Object[] objArr, int i, int i2, T[] tArr) {
        du4.m43695o(i, i + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = m53366d(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, i, tArr, 0, i2);
        return tArr;
    }
}
