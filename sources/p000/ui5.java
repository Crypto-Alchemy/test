package p000;

/* renamed from: ui5 */
public class ui5 {
    /* renamed from: a */
    public static void m72792a(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = i * 2; i4 > 0; i4--) {
            m72799h(iArr2, iArr, i2, iArr3);
            uk5.m72812l(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }

    /* renamed from: b */
    public static void m72793b(byte[] bArr) {
        if (bArr != null) {
            C9367tq.m72432p(bArr, (byte) 0);
        }
    }

    /* renamed from: c */
    public static void m72794c(int[] iArr) {
        if (iArr != null) {
            C9367tq.m72434r(iArr, 0);
        }
    }

    /* renamed from: d */
    public static void m72795d(int[][] iArr) {
        for (int[] c : iArr) {
            m72794c(c);
        }
    }

    /* renamed from: e */
    public static byte[] m72796e(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        int i5 = i2 * 128;
        byte[] g = m72798g(bArr, bArr2, i3 * i5);
        int[] iArr = null;
        try {
            int length = g.length >>> 2;
            iArr = new int[length];
            ek4.m57387g(g, 0, iArr);
            int i6 = i * i2;
            int i7 = 0;
            while (i - i7 > 2 && i6 > 1024) {
                i7++;
                i6 >>>= 1;
            }
            int i8 = i5 >>> 2;
            for (int i9 = 0; i9 < length; i9 += i8) {
                m72797f(iArr, i9, i, i7, i2);
            }
            ek4.m57385e(iArr, g, 0);
            return m72798g(bArr, g, i4);
        } finally {
            m72793b(g);
            m72794c(iArr);
        }
    }

    /* renamed from: f */
    public static void m72797f(int[] iArr, int i, int i2, int i3, int i4) {
        int[] iArr2 = iArr;
        int i5 = i;
        int i6 = i2;
        int i7 = i4;
        int i8 = i6 >>> i3;
        int i9 = 1 << i3;
        int i10 = i8 - 1;
        int b = gx2.m58282b(i2) - i3;
        int i11 = i7 * 32;
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[i11];
        int[] iArr6 = new int[i11];
        int[][] iArr7 = new int[i9][];
        try {
            System.arraycopy(iArr2, i5, iArr6, 0, i11);
            int i12 = 0;
            while (i12 < i9) {
                int[] iArr8 = new int[(i8 * i11)];
                iArr7[i12] = iArr8;
                int i13 = i9;
                int i14 = 0;
                int i15 = 0;
                while (i15 < i8) {
                    System.arraycopy(iArr6, 0, iArr8, i14, i11);
                    int i16 = i14 + i11;
                    m72792a(iArr6, iArr3, iArr4, iArr5, i7);
                    System.arraycopy(iArr5, 0, iArr8, i16, i11);
                    i14 = i16 + i11;
                    m72792a(iArr5, iArr3, iArr4, iArr6, i7);
                    i15 += 2;
                    i8 = i8;
                }
                int i17 = i8;
                i12++;
                int[] iArr9 = iArr;
                i9 = i13;
            }
            int i18 = i6 - 1;
            for (int i19 = 0; i19 < i6; i19++) {
                int i20 = iArr6[i11 - 16] & i18;
                System.arraycopy(iArr7[i20 >>> b], (i20 & i10) * i11, iArr5, 0, i11);
                m72799h(iArr5, iArr6, 0, iArr5);
                m72792a(iArr5, iArr3, iArr4, iArr6, i7);
            }
            System.arraycopy(iArr6, 0, iArr, i5, i11);
            m72795d(iArr7);
            m72795d(new int[][]{iArr6, iArr3, iArr4, iArr5});
        } catch (Throwable th) {
            m72795d(iArr7);
            m72795d(new int[][]{iArr6, iArr3, iArr4, iArr5});
            throw th;
        }
    }

    /* renamed from: g */
    public static byte[] m72798g(byte[] bArr, byte[] bArr2, int i) {
        vj4 vj4 = new vj4(new bj5());
        vj4.mo65867b(bArr, bArr2, 1);
        return ((va3) vj4.mo65866a(i * 8)).mo66464a();
    }

    /* renamed from: h */
    public static void m72799h(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    /* renamed from: i */
    public static byte[] m72800i(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        } else if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        } else if (i <= 1 || !m72801j(i)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        } else if (i2 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        } else if (i2 >= 1) {
            int i5 = Integer.MAX_VALUE / ((i2 * 128) * 8);
            if (i3 < 1 || i3 > i5) {
                throw new IllegalArgumentException("Parallelisation parameter p must be >= 1 and <= " + i5 + " (based on block size r of " + i2 + ")");
            } else if (i4 >= 1) {
                return m72796e(bArr, bArr2, i, i2, i3, i4);
            } else {
                throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
            }
        } else {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
    }

    /* renamed from: j */
    public static boolean m72801j(int i) {
        return (i & (i + -1)) == 0;
    }
}
