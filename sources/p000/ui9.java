package p000;

/* renamed from: ui9 */
/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
public final class ui9 {
    /* renamed from: a */
    public static Object[] m52825a(Object[] objArr, int i) {
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
