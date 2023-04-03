package p000;

import java.security.SecureRandom;
import net.sqlcipher.database.SQLiteDatabase;
import p000.xn7;

/* renamed from: dn1 */
public abstract class dn1 {

    /* renamed from: a */
    public static final byte[] f37323a = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};

    /* renamed from: b */
    public static final int[] f37324b = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: c */
    public static final int[] f37325c = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, SQLiteDatabase.CREATE_IF_NECESSARY};

    /* renamed from: d */
    public static final int[] f37326d = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};

    /* renamed from: e */
    public static final int[] f37327e = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};

    /* renamed from: f */
    public static final int[] f37328f = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};

    /* renamed from: g */
    public static final int[] f37329g = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};

    /* renamed from: h */
    public static final int[] f37330h = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};

    /* renamed from: i */
    public static final Object f37331i = new Object();

    /* renamed from: j */
    public static C6989c[] f37332j = null;

    /* renamed from: k */
    public static int[] f37333k = null;

    /* renamed from: dn1$b */
    public static class C6988b {

        /* renamed from: a */
        public int[] f37334a;

        /* renamed from: b */
        public int[] f37335b;

        /* renamed from: c */
        public int[] f37336c;

        /* renamed from: d */
        public int[] f37337d;

        /* renamed from: e */
        public int[] f37338e;

        public C6988b() {
            this.f37334a = yn7.m74510h();
            this.f37335b = yn7.m74510h();
            this.f37336c = yn7.m74510h();
            this.f37337d = yn7.m74510h();
            this.f37338e = yn7.m74510h();
        }
    }

    /* renamed from: dn1$c */
    public static class C6989c {

        /* renamed from: a */
        public int[] f37339a;

        /* renamed from: b */
        public int[] f37340b;

        /* renamed from: c */
        public int[] f37341c;

        /* renamed from: d */
        public int[] f37342d;

        public C6989c() {
            this.f37339a = yn7.m74510h();
            this.f37340b = yn7.m74510h();
            this.f37341c = yn7.m74510h();
            this.f37342d = yn7.m74510h();
        }
    }

    /* renamed from: dn1$d */
    public static class C6990d {

        /* renamed from: a */
        public int[] f37343a;

        /* renamed from: b */
        public int[] f37344b;

        /* renamed from: c */
        public int[] f37345c;

        public C6990d() {
            this.f37343a = yn7.m74510h();
            this.f37344b = yn7.m74510h();
            this.f37345c = yn7.m74510h();
        }
    }

    /* renamed from: A */
    public static void m56916A(int i, int i2, C6990d dVar) {
        int i3 = i * 8 * 3 * 10;
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            yn7.m74507e(i5, f37333k, i3, dVar.f37343a, 0);
            int i6 = i3 + 10;
            yn7.m74507e(i5, f37333k, i6, dVar.f37344b, 0);
            int i7 = i6 + 10;
            yn7.m74507e(i5, f37333k, i7, dVar.f37345c, 0);
            i3 = i7 + 10;
        }
    }

    /* renamed from: B */
    public static C6989c[] m56917B(C6989c cVar, int i) {
        C6989c cVar2 = new C6989c();
        m56948t(false, cVar, cVar, cVar2);
        C6989c[] cVarArr = new C6989c[i];
        cVarArr[0] = m56950v(cVar);
        for (int i2 = 1; i2 < i; i2++) {
            C6989c cVar3 = cVarArr[i2 - 1];
            C6989c cVar4 = new C6989c();
            cVarArr[i2] = cVar4;
            m56948t(false, cVar3, cVar2, cVar4);
        }
        return cVarArr;
    }

    /* renamed from: C */
    public static void m56918C(C6988b bVar) {
        yn7.m74502E(bVar.f37334a);
        yn7.m74498A(bVar.f37335b);
        yn7.m74498A(bVar.f37336c);
        yn7.m74502E(bVar.f37337d);
        yn7.m74498A(bVar.f37338e);
    }

    /* renamed from: D */
    public static void m56919D(C6989c cVar) {
        yn7.m74502E(cVar.f37339a);
        yn7.m74498A(cVar.f37340b);
        yn7.m74498A(cVar.f37341c);
        yn7.m74502E(cVar.f37342d);
    }

    /* renamed from: E */
    public static void m56920E() {
        int i;
        synchronized (f37331i) {
            if (f37333k == null) {
                C6989c cVar = new C6989c();
                int[] iArr = f37326d;
                yn7.m74509g(iArr, 0, cVar.f37339a, 0);
                int[] iArr2 = f37327e;
                yn7.m74509g(iArr2, 0, cVar.f37340b, 0);
                m56954z(cVar);
                f37332j = m56917B(cVar, 32);
                C6988b bVar = new C6988b();
                yn7.m74509g(iArr, 0, bVar.f37334a, 0);
                yn7.m74509g(iArr2, 0, bVar.f37335b, 0);
                m56953y(bVar);
                f37333k = yn7.m74511i(192);
                int i2 = 0;
                for (int i3 = 0; i3 < 8; i3++) {
                    C6989c[] cVarArr = new C6989c[4];
                    C6989c cVar2 = new C6989c();
                    m56919D(cVar2);
                    int i4 = 0;
                    while (true) {
                        i = 1;
                        if (i4 >= 4) {
                            break;
                        }
                        m56948t(true, cVar2, m56949u(bVar), cVar2);
                        m56952x(bVar);
                        cVarArr[i4] = m56949u(bVar);
                        if (i3 + i4 != 10) {
                            while (i < 8) {
                                m56952x(bVar);
                                i++;
                            }
                        }
                        i4++;
                    }
                    C6989c[] cVarArr2 = new C6989c[8];
                    cVarArr2[0] = cVar2;
                    int i5 = 0;
                    int i6 = 1;
                    while (i5 < 3) {
                        int i7 = i << i5;
                        int i8 = 0;
                        while (i8 < i7) {
                            C6989c cVar3 = cVarArr2[i6 - i7];
                            C6989c cVar4 = cVarArr[i5];
                            C6989c cVar5 = new C6989c();
                            cVarArr2[i6] = cVar5;
                            m56948t(false, cVar3, cVar4, cVar5);
                            i8++;
                            i6++;
                        }
                        i5++;
                        i = 1;
                    }
                    int[] i9 = yn7.m74511i(8);
                    int[] h = yn7.m74510h();
                    yn7.m74509g(cVarArr2[0].f37341c, 0, h, 0);
                    yn7.m74509g(h, 0, i9, 0);
                    int i10 = 0;
                    while (true) {
                        i10++;
                        if (i10 >= 8) {
                            break;
                        }
                        yn7.m74527y(h, cVarArr2[i10].f37341c, h);
                        yn7.m74509g(h, 0, i9, i10 * 10);
                    }
                    yn7.m74503a(h, h, h);
                    yn7.m74524v(h, h);
                    int i11 = i10 - 1;
                    int[] h2 = yn7.m74510h();
                    while (i11 > 0) {
                        int i12 = i11 - 1;
                        yn7.m74509g(i9, i12 * 10, h2, 0);
                        yn7.m74527y(h2, h, h2);
                        yn7.m74509g(h2, 0, i9, i11 * 10);
                        yn7.m74527y(h, cVarArr2[i11].f37341c, h);
                        i11 = i12;
                    }
                    yn7.m74509g(h, 0, i9, 0);
                    for (int i13 = 0; i13 < 8; i13++) {
                        C6989c cVar6 = cVarArr2[i13];
                        int[] h3 = yn7.m74510h();
                        int[] h4 = yn7.m74510h();
                        yn7.m74509g(i9, i13 * 10, h4, 0);
                        yn7.m74527y(cVar6.f37339a, h4, h3);
                        yn7.m74527y(cVar6.f37340b, h4, h4);
                        C6990d dVar = new C6990d();
                        yn7.m74505c(h4, h3, dVar.f37343a, dVar.f37344b);
                        yn7.m74527y(h3, h4, dVar.f37345c);
                        int[] iArr3 = dVar.f37345c;
                        yn7.m74527y(iArr3, f37330h, iArr3);
                        yn7.m74528z(dVar.f37343a);
                        yn7.m74528z(dVar.f37344b);
                        yn7.m74509g(dVar.f37343a, 0, f37333k, i2);
                        int i14 = i2 + 10;
                        yn7.m74509g(dVar.f37344b, 0, f37333k, i14);
                        int i15 = i14 + 10;
                        yn7.m74509g(dVar.f37345c, 0, f37333k, i15);
                        i2 = i15 + 10;
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public static void m56921F(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b = (byte) (bArr2[31] & Byte.MAX_VALUE);
        bArr2[31] = b;
        bArr2[31] = (byte) (b | 64);
    }

    /* renamed from: G */
    public static byte[] m56922G(byte[] bArr) {
        byte[] bArr2 = bArr;
        long f = ((long) (m56934f(bArr2, 4) << 4)) & 4294967295L;
        long g = ((long) m56935g(bArr2, 7)) & 4294967295L;
        long f2 = ((long) (m56934f(bArr2, 11) << 4)) & 4294967295L;
        long g2 = ((long) m56935g(bArr2, 14)) & 4294967295L;
        long f3 = ((long) (m56934f(bArr2, 18) << 4)) & 4294967295L;
        long g3 = ((long) m56935g(bArr2, 21)) & 4294967295L;
        long f4 = ((long) (m56934f(bArr2, 25) << 4)) & 4294967295L;
        long g4 = ((long) m56935g(bArr2, 28)) & 4294967295L;
        long g5 = ((long) m56935g(bArr2, 49)) & 4294967295L;
        long f5 = ((long) (m56934f(bArr2, 53) << 4)) & 4294967295L;
        long g6 = ((long) m56935g(bArr2, 56)) & 4294967295L;
        long f6 = ((long) (m56934f(bArr2, 60) << 4)) & 4294967295L;
        long j = ((long) bArr2[63]) & 255;
        long f7 = (((long) (m56934f(bArr2, 46) << 4)) & 4294967295L) - (j * 5343);
        long j2 = f6 + (g6 >> 28);
        long j3 = g6 & 268435455;
        long j4 = g4 - (j2 * -50998291);
        long f8 = ((((long) (m56934f(bArr2, 32) << 4)) & 4294967295L) - (j * -50998291)) - (j2 * 19280294);
        long g7 = ((((long) m56935g(bArr2, 35)) & 4294967295L) - (j * 19280294)) - (j2 * 127719000);
        long g8 = ((((long) m56935g(bArr2, 42)) & 4294967295L) - (j * -6428113)) - (j2 * 5343);
        long j5 = f4 - (j3 * -50998291);
        long f9 = (((((long) (m56934f(bArr2, 39) << 4)) & 4294967295L) - (j * 127719000)) - (j2 * -6428113)) - (j3 * 5343);
        long j6 = f5 + (g5 >> 28);
        long j7 = g5 & 268435455;
        long j8 = (g7 - (j3 * -6428113)) - (j6 * 5343);
        long j9 = ((f8 - (j3 * 127719000)) - (j6 * -6428113)) - (j7 * 5343);
        long j10 = f7 + (g8 >> 28);
        long j11 = (g8 & 268435455) + (f9 >> 28);
        long j12 = f2 - (j11 * -50998291);
        long j13 = (g2 - (j10 * -50998291)) - (j11 * 19280294);
        long j14 = ((f3 - (j7 * -50998291)) - (j10 * 19280294)) - (j11 * 127719000);
        long j15 = (((j5 - (j6 * 19280294)) - (j7 * 127719000)) - (j10 * -6428113)) - (j11 * 5343);
        long j16 = (f9 & 268435455) + (j8 >> 28);
        long j17 = j8 & 268435455;
        long j18 = g - (j16 * -50998291);
        long j19 = j12 - (j16 * 19280294);
        long j20 = j13 - (j16 * 127719000);
        long j21 = ((((g3 - (j6 * -50998291)) - (j7 * 19280294)) - (j10 * 127719000)) - (j11 * -6428113)) - (j16 * 5343);
        long j22 = j17 + (j9 >> 28);
        long j23 = j18 - (j22 * 19280294);
        long j24 = j19 - (j22 * 127719000);
        long j25 = j20 - (j22 * -6428113);
        long j26 = (j14 - (j16 * -6428113)) - (j22 * 5343);
        long j27 = ((((j4 - (j3 * 19280294)) - (j6 * 127719000)) - (j7 * -6428113)) - (j10 * 5343)) + (j15 >> 28);
        long j28 = j27 & 268435455;
        long j29 = j28 >>> 27;
        long j30 = (j9 & 268435455) + (j27 >> 28) + j29;
        long g9 = (((long) m56935g(bArr2, 0)) & 4294967295L) - (j30 * -50998291);
        long j31 = ((f - (j22 * -50998291)) - (j30 * 19280294)) + (g9 >> 28);
        long j32 = g9 & 268435455;
        long j33 = (j23 - (j30 * 127719000)) + (j31 >> 28);
        long j34 = (j24 - (j30 * -6428113)) + (j33 >> 28);
        long j35 = (j25 - (j30 * 5343)) + (j34 >> 28);
        long j36 = j26 + (j35 >> 28);
        long j37 = j35 & 268435455;
        long j38 = j21 + (j36 >> 28);
        long j39 = (j15 & 268435455) + (j38 >> 28);
        long j40 = j28 + (j39 >> 28);
        long j41 = (j40 >> 28) - j29;
        long j42 = j32 + (j41 & -50998291);
        long j43 = (j31 & 268435455) + (j41 & 19280294) + (j42 >> 28);
        long j44 = (j33 & 268435455) + (j41 & 127719000) + (j43 >> 28);
        long j45 = (j34 & 268435455) + (j41 & -6428113) + (j44 >> 28);
        long j46 = j37 + (j41 & 5343) + (j45 >> 28);
        long j47 = (j36 & 268435455) + (j46 >> 28);
        long j48 = (j38 & 268435455) + (j47 >> 28);
        long j49 = (j39 & 268435455) + (j48 >> 28);
        byte[] bArr3 = new byte[32];
        m56941m((j42 & 268435455) | ((j43 & 268435455) << 28), bArr3, 0);
        m56941m(((j45 & 268435455) << 28) | (j44 & 268435455), bArr3, 7);
        m56941m((j46 & 268435455) | ((j47 & 268435455) << 28), bArr3, 14);
        m56941m((j48 & 268435455) | ((j49 & 268435455) << 28), bArr3, 21);
        m56940l((int) ((j40 & 268435455) + (j49 >> 28)), bArr3, 28);
        return bArr3;
    }

    /* renamed from: H */
    public static void m56923H(byte[] bArr, C6988b bVar) {
        m56920E();
        int[] iArr = new int[8];
        m56937i(bArr, 0, iArr);
        p34.m70884h(8, (~iArr[0]) & 1, iArr, f37325c, iArr);
        p34.m70860D(8, iArr, 1);
        for (int i = 0; i < 8; i++) {
            iArr[i] = jx2.m59604e(iArr[i]);
        }
        C6990d dVar = new C6990d();
        m56918C(bVar);
        int i2 = 28;
        while (true) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = iArr[i3] >>> i2;
                int i5 = (i4 >>> 3) & 1;
                m56916A(i3, (i4 ^ (-i5)) & 7, dVar);
                yn7.m74512j(i5, dVar.f37343a, dVar.f37344b);
                yn7.m74508f(i5, dVar.f37345c);
                m56947s(dVar, bVar);
            }
            i2 -= 4;
            if (i2 >= 0) {
                m56952x(bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: I */
    public static void m56924I(byte[] bArr, byte[] bArr2, int i) {
        C6988b bVar = new C6988b();
        m56923H(bArr, bVar);
        if (m56942n(bVar, bArr2, i) == 0) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: J */
    public static void m56925J(xn7.C9603a aVar, byte[] bArr, int i, int[] iArr, int[] iArr2) {
        if (aVar != null) {
            byte[] bArr2 = new byte[32];
            m56921F(bArr, i, bArr2);
            C6988b bVar = new C6988b();
            m56923H(bArr2, bVar);
            if (m56932d(bVar.f37334a, bVar.f37335b, bVar.f37336c) != 0) {
                yn7.m74509g(bVar.f37335b, 0, iArr, 0);
                yn7.m74509g(bVar.f37336c, 0, iArr2, 0);
                return;
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("This method is only for use by X25519");
    }

    /* renamed from: K */
    public static void m56926K(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, byte[] bArr4, int i5) {
        m56946r(bArr, i, bArr2, i2, (byte[]) null, (byte) 0, bArr3, i3, i4, bArr4, i5);
    }

    /* renamed from: L */
    public static void m56927L(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        m56946r(bArr, i, bArr2, i2, bArr3, (byte) 0, bArr4, i3, i4, bArr5, i5);
    }

    /* renamed from: M */
    public static void m56928M(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5, int i4) {
        m56946r(bArr, i, bArr2, i2, bArr3, (byte) 1, bArr4, i3, 64, bArr5, i4);
    }

    /* renamed from: a */
    public static byte[] m56929a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        m56937i(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        m56937i(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        m56937i(bArr3, 0, iArr3);
        j34.m59207C(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i = 0; i < 16; i++) {
            m56940l(iArr[i], bArr4, i * 4);
        }
        return m56922G(bArr4);
    }

    /* renamed from: b */
    public static boolean m56930b(byte[] bArr, byte b) {
        return (bArr == null && b == 0) || (bArr != null && bArr.length < 256);
    }

    /* renamed from: c */
    public static int m56931c(int[] iArr, int[] iArr2) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        int[] h3 = yn7.m74510h();
        yn7.m74500C(iArr, h2);
        yn7.m74500C(iArr2, h3);
        yn7.m74527y(h2, h3, h);
        yn7.m74501D(h3, h2, h3);
        yn7.m74527y(h, f37328f, h);
        yn7.m74504b(h);
        yn7.m74501D(h, h3, h);
        yn7.m74528z(h);
        return yn7.m74525w(h);
    }

    /* renamed from: d */
    public static int m56932d(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        int[] h3 = yn7.m74510h();
        int[] h4 = yn7.m74510h();
        yn7.m74500C(iArr, h2);
        yn7.m74500C(iArr2, h3);
        yn7.m74500C(iArr3, h4);
        yn7.m74527y(h2, h3, h);
        yn7.m74501D(h3, h2, h3);
        yn7.m74527y(h3, h4, h3);
        yn7.m74500C(h4, h4);
        yn7.m74527y(h, f37328f, h);
        yn7.m74503a(h, h4, h);
        yn7.m74501D(h, h3, h);
        yn7.m74528z(h);
        return yn7.m74525w(h);
    }

    /* renamed from: e */
    public static ig1 m56933e() {
        return new fj5();
    }

    /* renamed from: f */
    public static int m56934f(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    /* renamed from: g */
    public static int m56935g(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: h */
    public static void m56936h(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = m56935g(bArr, (i4 * 4) + i);
        }
    }

    /* renamed from: i */
    public static void m56937i(byte[] bArr, int i, int[] iArr) {
        m56936h(bArr, i, iArr, 0, 8);
    }

    /* renamed from: j */
    public static void m56938j(ig1 ig1, byte b, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = f37323a;
            int length = bArr2.length;
            int i = length + 2;
            int length2 = bArr.length + i;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i, bArr.length);
            ig1.update(bArr3, 0, length2);
        }
    }

    /* renamed from: k */
    public static void m56939k(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) (i >>> 16);
    }

    /* renamed from: l */
    public static void m56940l(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    /* renamed from: m */
    public static void m56941m(long j, byte[] bArr, int i) {
        m56940l((int) j, bArr, i);
        m56939k((int) (j >>> 32), bArr, i + 4);
    }

    /* renamed from: n */
    public static int m56942n(C6988b bVar, byte[] bArr, int i) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        yn7.m74523u(bVar.f37336c, h2);
        yn7.m74527y(bVar.f37334a, h2, h);
        yn7.m74527y(bVar.f37335b, h2, h2);
        yn7.m74528z(h);
        yn7.m74528z(h2);
        int c = m56931c(h, h2);
        yn7.m74518p(h2, bArr, i);
        int i2 = (i + 32) - 1;
        bArr[i2] = (byte) (((h[0] & 1) << 7) | bArr[i2]);
        return c;
    }

    /* renamed from: o */
    public static void m56943o(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    /* renamed from: p */
    public static void m56944p(byte[] bArr, int i, byte[] bArr2, int i2) {
        ig1 e = m56933e();
        byte[] bArr3 = new byte[e.mo50202e()];
        e.update(bArr, i, 32);
        e.mo50198a(bArr3, 0);
        byte[] bArr4 = new byte[32];
        m56921F(bArr3, 0, bArr4);
        m56924I(bArr4, bArr2, i2);
    }

    /* renamed from: q */
    public static void m56945q(ig1 ig1, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        m56938j(ig1, b, bArr4);
        ig1.update(bArr, 32, 32);
        ig1.update(bArr5, i2, i3);
        ig1.mo50198a(bArr, 0);
        byte[] G = m56922G(bArr);
        byte[] bArr7 = new byte[32];
        m56924I(G, bArr7, 0);
        m56938j(ig1, b, bArr4);
        ig1.update(bArr7, 0, 32);
        ig1.update(bArr3, i, 32);
        ig1.update(bArr5, i2, i3);
        ig1.mo50198a(bArr, 0);
        byte[] a = m56929a(G, m56922G(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 32);
        System.arraycopy(a, 0, bArr6, i4 + 32, 32);
    }

    /* renamed from: r */
    public static void m56946r(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte b, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (m56930b(bArr3, b)) {
            ig1 e = m56933e();
            byte[] bArr6 = new byte[e.mo50202e()];
            byte[] bArr7 = bArr;
            int i6 = i;
            e.update(bArr, i, 32);
            e.mo50198a(bArr6, 0);
            byte[] bArr8 = new byte[32];
            m56921F(bArr6, 0, bArr8);
            m56945q(e, bArr6, bArr8, bArr2, i2, bArr3, b, bArr4, i3, i4, bArr5, i5);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    /* renamed from: s */
    public static void m56947s(C6990d dVar, C6988b bVar) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        int[] h3 = yn7.m74510h();
        int[] iArr = bVar.f37337d;
        int[] h4 = yn7.m74510h();
        int[] h5 = yn7.m74510h();
        int[] iArr2 = bVar.f37338e;
        yn7.m74505c(bVar.f37335b, bVar.f37334a, h2, h);
        yn7.m74527y(h, dVar.f37344b, h);
        yn7.m74527y(h2, dVar.f37343a, h2);
        yn7.m74527y(bVar.f37337d, bVar.f37338e, h3);
        yn7.m74527y(h3, dVar.f37345c, h3);
        yn7.m74505c(h2, h, iArr2, iArr);
        yn7.m74505c(bVar.f37336c, h3, h5, h4);
        yn7.m74506d(h5);
        yn7.m74527y(iArr, h4, bVar.f37334a);
        yn7.m74527y(h5, iArr2, bVar.f37335b);
        yn7.m74527y(h4, h5, bVar.f37336c);
    }

    /* renamed from: t */
    public static void m56948t(boolean z, C6989c cVar, C6989c cVar2, C6989c cVar3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        C6989c cVar4 = cVar;
        C6989c cVar5 = cVar2;
        C6989c cVar6 = cVar3;
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        int[] h3 = yn7.m74510h();
        int[] h4 = yn7.m74510h();
        int[] h5 = yn7.m74510h();
        int[] h6 = yn7.m74510h();
        int[] h7 = yn7.m74510h();
        int[] h8 = yn7.m74510h();
        if (z) {
            iArr4 = h3;
            iArr3 = h4;
            iArr2 = h6;
            iArr = h7;
        } else {
            iArr3 = h3;
            iArr4 = h4;
            iArr = h6;
            iArr2 = h7;
        }
        yn7.m74505c(cVar4.f37340b, cVar4.f37339a, h2, h);
        yn7.m74505c(cVar5.f37340b, cVar5.f37339a, iArr4, iArr3);
        yn7.m74527y(h, h3, h);
        yn7.m74527y(h2, h4, h2);
        yn7.m74527y(cVar4.f37342d, cVar5.f37342d, h3);
        yn7.m74527y(h3, f37329g, h3);
        yn7.m74527y(cVar4.f37341c, cVar5.f37341c, h4);
        yn7.m74503a(h4, h4, h4);
        yn7.m74505c(h2, h, h8, h5);
        yn7.m74505c(h4, h3, iArr2, iArr);
        yn7.m74506d(iArr2);
        yn7.m74527y(h5, h6, cVar6.f37339a);
        int[] iArr5 = h7;
        yn7.m74527y(iArr5, h8, cVar6.f37340b);
        yn7.m74527y(h6, iArr5, cVar6.f37341c);
        yn7.m74527y(h5, h8, cVar6.f37342d);
    }

    /* renamed from: u */
    public static C6989c m56949u(C6988b bVar) {
        C6989c cVar = new C6989c();
        yn7.m74509g(bVar.f37334a, 0, cVar.f37339a, 0);
        yn7.m74509g(bVar.f37335b, 0, cVar.f37340b, 0);
        yn7.m74509g(bVar.f37336c, 0, cVar.f37341c, 0);
        yn7.m74527y(bVar.f37337d, bVar.f37338e, cVar.f37342d);
        return cVar;
    }

    /* renamed from: v */
    public static C6989c m56950v(C6989c cVar) {
        C6989c cVar2 = new C6989c();
        m56951w(cVar, cVar2);
        return cVar2;
    }

    /* renamed from: w */
    public static void m56951w(C6989c cVar, C6989c cVar2) {
        yn7.m74509g(cVar.f37339a, 0, cVar2.f37339a, 0);
        yn7.m74509g(cVar.f37340b, 0, cVar2.f37340b, 0);
        yn7.m74509g(cVar.f37341c, 0, cVar2.f37341c, 0);
        yn7.m74509g(cVar.f37342d, 0, cVar2.f37342d, 0);
    }

    /* renamed from: x */
    public static void m56952x(C6988b bVar) {
        int[] h = yn7.m74510h();
        int[] h2 = yn7.m74510h();
        int[] h3 = yn7.m74510h();
        int[] iArr = bVar.f37337d;
        int[] h4 = yn7.m74510h();
        int[] h5 = yn7.m74510h();
        int[] iArr2 = bVar.f37338e;
        yn7.m74500C(bVar.f37334a, h);
        yn7.m74500C(bVar.f37335b, h2);
        yn7.m74500C(bVar.f37336c, h3);
        yn7.m74503a(h3, h3, h3);
        yn7.m74505c(h, h2, iArr2, h5);
        yn7.m74503a(bVar.f37334a, bVar.f37335b, iArr);
        yn7.m74500C(iArr, iArr);
        yn7.m74501D(iArr2, iArr, iArr);
        yn7.m74503a(h3, h5, h4);
        yn7.m74506d(h4);
        yn7.m74527y(iArr, h4, bVar.f37334a);
        yn7.m74527y(h5, iArr2, bVar.f37335b);
        yn7.m74527y(h4, h5, bVar.f37336c);
    }

    /* renamed from: y */
    public static void m56953y(C6988b bVar) {
        yn7.m74498A(bVar.f37336c);
        yn7.m74509g(bVar.f37334a, 0, bVar.f37337d, 0);
        yn7.m74509g(bVar.f37335b, 0, bVar.f37338e, 0);
    }

    /* renamed from: z */
    public static void m56954z(C6989c cVar) {
        yn7.m74498A(cVar.f37341c);
        yn7.m74527y(cVar.f37339a, cVar.f37340b, cVar.f37342d);
    }
}
