package p000;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: tq */
public final class C9367tq {

    /* renamed from: tq$a */
    public static class C9368a<T> implements Iterator<T> {

        /* renamed from: a */
        public final T[] f44804a;

        /* renamed from: d */
        public int f44805d = 0;

        public C9368a(T[] tArr) {
            this.f44804a = tArr;
        }

        public boolean hasNext() {
            return this.f44805d < this.f44804a.length;
        }

        public T next() {
            int i = this.f44805d;
            T[] tArr = this.f44804a;
            if (i != tArr.length) {
                this.f44805d = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.f44805d);
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    /* renamed from: A */
    public static int m72412A(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    /* renamed from: B */
    public static int m72413B(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m72412A(sArr[i2]);
        }
        return i;
    }

    /* renamed from: C */
    public static int m72414C(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + m72413B(sArr[i2]);
        }
        return i;
    }

    /* renamed from: D */
    public static byte[] m72415D(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }

    /* renamed from: E */
    public static int[] m72416E(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length - 1;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[length];
            iArr[length] = i2;
            length--;
        }
        return iArr;
    }

    /* renamed from: a */
    public static boolean m72417a(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    /* renamed from: b */
    public static boolean m72418b(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    /* renamed from: c */
    public static boolean m72419c(int[] iArr, int[] iArr2) {
        return Arrays.equals(iArr, iArr2);
    }

    /* renamed from: d */
    public static boolean m72420d(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    /* renamed from: e */
    public static void m72421e(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    /* renamed from: f */
    public static byte[] m72422f(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    /* renamed from: g */
    public static int[] m72423g(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    /* renamed from: h */
    public static long[] m72424h(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return (long[]) jArr.clone();
    }

    /* renamed from: i */
    public static short[] m72425i(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return (short[]) sArr.clone();
    }

    /* renamed from: j */
    public static byte[] m72426j(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return m72422f(bArr2);
        }
        if (bArr2 == null) {
            return m72422f(bArr);
        }
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: k */
    public static byte[] m72427k(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return m72426j(bArr2, bArr3);
        }
        if (bArr2 == null) {
            return m72426j(bArr, bArr3);
        }
        if (bArr3 == null) {
            return m72426j(bArr, bArr2);
        }
        byte[] bArr4 = new byte[(bArr.length + bArr2.length + bArr3.length)];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr4, length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, length + bArr2.length, bArr3.length);
        return bArr4;
    }

    /* renamed from: l */
    public static byte[] m72428l(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null) {
            return m72427k(bArr2, bArr3, bArr4);
        }
        if (bArr2 == null) {
            return m72427k(bArr, bArr3, bArr4);
        }
        if (bArr3 == null) {
            return m72427k(bArr, bArr2, bArr4);
        }
        if (bArr4 == null) {
            return m72427k(bArr, bArr2, bArr3);
        }
        byte[] bArr5 = new byte[(bArr.length + bArr2.length + bArr3.length + bArr4.length)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        int length = bArr.length + 0;
        System.arraycopy(bArr2, 0, bArr5, length, bArr2.length);
        int length2 = length + bArr2.length;
        System.arraycopy(bArr3, 0, bArr5, length2, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, length2 + bArr3.length, bArr4.length);
        return bArr5;
    }

    /* renamed from: m */
    public static boolean m72429m(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (bArr == null) {
            throw new NullPointerException("'a' cannot be null");
        } else if (bArr2 == null) {
            throw new NullPointerException("'b' cannot be null");
        } else if (i < 0) {
            throw new IllegalArgumentException("'len' cannot be negative");
        } else if (i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException("'aOff' value invalid for specified length");
        } else if (i3 <= bArr2.length - i) {
            byte b = 0;
            for (int i4 = 0; i4 < i; i4++) {
                b |= bArr[i2 + i4] ^ bArr2[i3 + i4];
            }
            return b == 0;
        } else {
            throw new IndexOutOfBoundsException("'bOff' value invalid for specified length");
        }
    }

    /* renamed from: n */
    public static byte[] m72430n(byte[] bArr, int i, int i2) {
        int t = m72436t(i, i2);
        byte[] bArr2 = new byte[t];
        System.arraycopy(bArr, i, bArr2, 0, Math.min(bArr.length - i, t));
        return bArr2;
    }

    /* renamed from: o */
    public static int[] m72431o(int[] iArr, int i, int i2) {
        int t = m72436t(i, i2);
        int[] iArr2 = new int[t];
        System.arraycopy(iArr, i, iArr2, 0, Math.min(iArr.length - i, t));
        return iArr2;
    }

    /* renamed from: p */
    public static void m72432p(byte[] bArr, byte b) {
        Arrays.fill(bArr, b);
    }

    /* renamed from: q */
    public static void m72433q(byte[] bArr, int i, int i2, byte b) {
        Arrays.fill(bArr, i, i2, b);
    }

    /* renamed from: r */
    public static void m72434r(int[] iArr, int i) {
        Arrays.fill(iArr, i);
    }

    /* renamed from: s */
    public static void m72435s(long[] jArr, long j) {
        Arrays.fill(jArr, j);
    }

    /* renamed from: t */
    public static int m72436t(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    /* renamed from: u */
    public static int m72437u(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    /* renamed from: v */
    public static int m72438v(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[i + i2];
        }
    }

    /* renamed from: w */
    public static int m72439w(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    /* renamed from: x */
    public static int m72440x(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    /* renamed from: y */
    public static int m72441y(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ iArr[i + i2];
        }
    }

    /* renamed from: z */
    public static int m72442z(long[] jArr, int i, int i2) {
        if (jArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            long j = jArr[i + i2];
            i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }
}
