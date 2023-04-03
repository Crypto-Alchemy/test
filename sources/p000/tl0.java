package p000;

import java.util.Arrays;

/* renamed from: tl0 */
/* compiled from: CompactHashing */
public final class tl0 {
    /* renamed from: a */
    public static Object m52344a(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("must be power of 2 between 2^1 and 2^30: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    /* renamed from: b */
    public static int m52345b(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: c */
    public static int m52346c(int i, int i2) {
        return i & i2;
    }

    /* renamed from: d */
    public static int m52347d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* renamed from: e */
    public static int m52348e(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* renamed from: f */
    public static int m52349f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int c = ml2.m48362c(obj);
        int i4 = c & i;
        int h = m52351h(obj3, i4);
        if (h == 0) {
            return -1;
        }
        int b = m52345b(c, i);
        int i5 = -1;
        while (true) {
            i2 = h - 1;
            i3 = iArr[i2];
            if (m52345b(i3, i) != b || !jf4.m46496a(obj, objArr[i2]) || (objArr2 != null && !jf4.m46496a(obj2, objArr2[i2]))) {
                int c2 = m52346c(i3, i);
                if (c2 == 0) {
                    return -1;
                }
                int i6 = c2;
                i5 = i2;
                h = i6;
            }
        }
        int c3 = m52346c(i3, i);
        if (i5 == -1) {
            m52352i(obj3, i4, c3);
        } else {
            iArr[i5] = m52347d(iArr[i5], c3, i);
        }
        return i2;
    }

    /* renamed from: g */
    public static void m52350g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m52351h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* renamed from: i */
    public static void m52352i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* renamed from: j */
    public static int m52353j(int i) {
        return Math.max(4, ml2.m48360a(i + 1, 1.0d));
    }
}
