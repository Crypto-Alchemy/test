package p000;

/* renamed from: c98 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class c98 {
    /* renamed from: a */
    public static Object[] m32875a(Object[] objArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException("at index " + i2);
            }
        }
        return objArr;
    }
}
