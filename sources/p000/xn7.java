package p000;

import java.security.SecureRandom;

/* renamed from: xn7 */
public abstract class xn7 {

    /* renamed from: xn7$a */
    public static class C9603a {

        /* renamed from: a */
        public static final C9603a f45981a = new C9603a();
    }

    /* renamed from: a */
    public static int m74020a(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: b */
    public static void m74021b(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = m74020a(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & -8;
        int i3 = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = i3;
        iArr[7] = i3 | 1073741824;
    }

    /* renamed from: c */
    public static void m74022c(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & 248);
        byte b = (byte) (bArr[31] & Byte.MAX_VALUE);
        bArr[31] = b;
        bArr[31] = (byte) (b | 64);
    }

    /* renamed from: d */
    public static void m74023d(byte[] bArr, int i, byte[] bArr2, int i2) {
        m74026g(bArr, i, bArr2, i2);
    }

    /* renamed from: e */
    public static void m74024e(int[] iArr, int[] iArr2) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        yn7.m74505c(iArr, iArr2, h, h2);
        yn7.m74500C(h, h);
        yn7.m74500C(h2, h2);
        yn7.m74527y(h, h2, iArr);
        yn7.m74501D(h, h2, h);
        yn7.m74526x(h, 121666, iArr2);
        yn7.m74503a(iArr2, h2, iArr2);
        yn7.m74527y(iArr2, h, iArr2);
    }

    /* renamed from: f */
    public static void m74025f(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        m74021b(bArr, i, iArr);
        int[] h = yn7.m74510h();
        yn7.m74513k(bArr2, i2, h);
        int[] h2 = yn7.m74510h();
        yn7.m74509g(h, 0, h2, 0);
        int[] h3 = yn7.m74510h();
        h3[0] = 1;
        int[] h4 = yn7.m74510h();
        h4[0] = 1;
        int[] h5 = yn7.m74510h();
        int[] h6 = yn7.m74510h();
        int[] h7 = yn7.m74510h();
        int i4 = 254;
        int i5 = 1;
        while (true) {
            yn7.m74505c(h4, h5, h6, h4);
            yn7.m74505c(h2, h3, h5, h2);
            yn7.m74527y(h6, h2, h6);
            yn7.m74527y(h4, h5, h4);
            yn7.m74500C(h5, h5);
            yn7.m74500C(h2, h2);
            yn7.m74501D(h5, h2, h7);
            yn7.m74526x(h7, 121666, h3);
            yn7.m74503a(h3, h2, h3);
            yn7.m74527y(h3, h7, h3);
            yn7.m74527y(h2, h5, h2);
            yn7.m74505c(h6, h4, h4, h5);
            yn7.m74500C(h4, h4);
            yn7.m74500C(h5, h5);
            yn7.m74527y(h5, h, h5);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            yn7.m74512j(i7, h2, h4);
            yn7.m74512j(i7, h3, h5);
            if (i4 < 3) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 3; i8++) {
            m74024e(h2, h3);
        }
        yn7.m74523u(h3, h3);
        yn7.m74527y(h2, h3, h2);
        yn7.m74528z(h2);
        yn7.m74518p(h2, bArr3, i3);
    }

    /* renamed from: g */
    public static void m74026g(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        dn1.m56925J(C9603a.f45981a, bArr, i, h, h2);
        yn7.m74505c(h2, h, h, h2);
        yn7.m74523u(h2, h2);
        yn7.m74527y(h, h2, h);
        yn7.m74528z(h);
        yn7.m74518p(h, bArr2, i2);
    }
}
