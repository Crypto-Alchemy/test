package p000;

import java.lang.reflect.Array;

/* renamed from: o23 */
/* compiled from: JavaUtills */
public class o23 {
    /* renamed from: a */
    public static <T> T[] m70123a(T[] tArr, int i, int i2, T... tArr2) {
        if (i < 0) {
            i += tArr.length;
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), (tArr.length - i2) + tArr2.length);
        if (i != 0) {
            System.arraycopy(tArr, 0, tArr3, 0, i);
        }
        if (tArr2.length > 0) {
            System.arraycopy(tArr2, 0, tArr3, i, tArr2.length);
        }
        int i3 = i + i2;
        if (i3 != tArr.length) {
            System.arraycopy(tArr, i3, tArr3, tArr2.length + i, (tArr.length - i) - i2);
        }
        return tArr3;
    }
}
