package p000;

/* renamed from: ml2 */
/* compiled from: Hashing */
public final class ml2 {
    /* renamed from: a */
    public static int m48360a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m48361b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: c */
    public static int m48362c(Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return m48361b(i);
    }
}
