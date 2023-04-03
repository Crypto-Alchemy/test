package p000;

import java.math.BigInteger;
import p000.ul1;

/* renamed from: sl1 */
public class sl1 {
    /* renamed from: a */
    public static nm1 m71962a(nm1 nm1) {
        if (nm1.mo62754x()) {
            return nm1;
        }
        throw new IllegalStateException("Invalid result");
    }

    /* renamed from: b */
    public static nm1 m71963b(nm1 nm1, BigInteger bigInteger, nm1 nm12, BigInteger bigInteger2) {
        nm1 a;
        nm1 b;
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        ul1 i = nm1.mo62740i();
        int a2 = m32.m64055a(i);
        if (bigInteger.bitLength() > a2 || bigInteger2.bitLength() > a2) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        l32 b2 = m32.m64056b(nm1);
        l32 b3 = m32.m64056b(nm12);
        fm1 a3 = b2.mo55813a();
        fm1 a4 = b3.mo55813a();
        int c = b2.mo55815c();
        if (c != b3.mo55815c()) {
            k32 k32 = new k32();
            a = k32.mo51129a(nm1, bigInteger3);
            b = k32.mo51129a(nm12, bigInteger4);
        } else {
            int i2 = ((a2 + c) - 1) / c;
            nm1 u = i.mo50668u();
            int i3 = c * i2;
            int[] q = p34.m70893q(i3, bigInteger3);
            int[] q2 = p34.m70893q(i3, bigInteger4);
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 0;
                int i7 = 0;
                for (int i8 = i4 - i5; i8 >= 0; i8 -= i2) {
                    int i9 = i8 >>> 5;
                    int i10 = i8 & 31;
                    int i11 = q[i9] >>> i10;
                    i6 = ((i6 ^ (i11 >>> 1)) << 1) ^ i11;
                    int i12 = q2[i9] >>> i10;
                    i7 = ((i7 ^ (i12 >>> 1)) << 1) ^ i12;
                }
                u = u.mo50275K(a3.mo50670b(i6).mo50276a(a4.mo50670b(i7)));
            }
            a = u.mo50276a(b2.mo55814b());
            b = b3.mo55814b();
        }
        return a.mo50276a(b);
    }

    /* renamed from: c */
    public static nm1 m71964c(yl1 yl1, nm1 nm1, BigInteger bigInteger, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        uf7 k = vf7.m73227k(nm1, vf7.m73225i(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
        uf7 l = vf7.m73228l(zp1.m75181c(yl1, nm1), yl1.mo65637b(), k, true);
        return m71966e(z2 ? k.mo66271d() : k.mo66270c(), z2 ? k.mo66270c() : k.mo66271d(), vf7.m73223g(Math.min(8, k.mo66274g()), abs), z ? l.mo66271d() : l.mo66270c(), z ? l.mo66270c() : l.mo66271d(), vf7.m73223g(Math.min(8, l.mo66274g()), abs2));
    }

    /* renamed from: d */
    public static nm1 m71965d(nm1 nm1, BigInteger bigInteger, nm1 nm12, BigInteger bigInteger2) {
        boolean z = false;
        boolean z2 = bigInteger.signum() < 0;
        if (bigInteger2.signum() < 0) {
            z = true;
        }
        BigInteger abs = bigInteger.abs();
        BigInteger abs2 = bigInteger2.abs();
        int i = vf7.m73225i(abs.bitLength(), 8);
        int i2 = vf7.m73225i(abs2.bitLength(), 8);
        uf7 k = vf7.m73227k(nm1, i, true);
        uf7 k2 = vf7.m73227k(nm12, i2, true);
        int a = m32.m64055a(nm1.mo62740i());
        if (!z2 && !z && bigInteger.bitLength() <= a && bigInteger2.bitLength() <= a && k.mo66275h() && k2.mo66275h()) {
            return m71963b(nm1, bigInteger, nm12, bigInteger2);
        }
        return m71966e(z2 ? k.mo66271d() : k.mo66270c(), z2 ? k.mo66270c() : k.mo66271d(), vf7.m73223g(Math.min(8, k.mo66274g()), abs), z ? k2.mo66271d() : k2.mo66270c(), z ? k2.mo66270c() : k2.mo66271d(), vf7.m73223g(Math.min(8, k2.mo66274g()), abs2));
    }

    /* renamed from: e */
    public static nm1 m71966e(nm1[] nm1Arr, nm1[] nm1Arr2, byte[] bArr, nm1[] nm1Arr3, nm1[] nm1Arr4, byte[] bArr2) {
        nm1 nm1;
        int max = Math.max(bArr.length, bArr2.length);
        nm1 u = nm1Arr[0].mo62740i().mo50668u();
        int i = max - 1;
        int i2 = 0;
        nm1 nm12 = u;
        while (i >= 0) {
            byte b = i < bArr.length ? bArr[i] : 0;
            byte b2 = i < bArr2.length ? bArr2[i] : 0;
            if ((b | b2) == 0) {
                i2++;
            } else {
                if (b != 0) {
                    nm1 = u.mo50276a((b < 0 ? nm1Arr2 : nm1Arr)[Math.abs(b) >>> 1]);
                } else {
                    nm1 = u;
                }
                if (b2 != 0) {
                    nm1 = nm1.mo50276a((b2 < 0 ? nm1Arr4 : nm1Arr3)[Math.abs(b2) >>> 1]);
                }
                if (i2 > 0) {
                    nm12 = nm12.mo62732I(i2);
                    i2 = 0;
                }
                nm12 = nm12.mo50275K(nm1);
            }
            i--;
        }
        return i2 > 0 ? nm12.mo62732I(i2) : nm12;
    }

    /* renamed from: f */
    public static nm1 m71967f(yl1 yl1, nm1[] nm1Arr, BigInteger[] bigIntegerArr) {
        nm1[] nm1Arr2 = nm1Arr;
        int length = nm1Arr2.length;
        int i = length << 1;
        boolean[] zArr = new boolean[i];
        uf7[] uf7Arr = new uf7[i];
        byte[][] bArr = new byte[i][];
        om1 b = yl1.mo65637b();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 << 1;
            int i4 = i3 + 1;
            BigInteger bigInteger = bigIntegerArr[i3];
            zArr[i3] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            BigInteger bigInteger2 = bigIntegerArr[i4];
            zArr[i4] = bigInteger2.signum() < 0;
            BigInteger abs2 = bigInteger2.abs();
            int i5 = vf7.m73225i(Math.max(abs.bitLength(), abs2.bitLength()), 8);
            nm1 nm1 = nm1Arr2[i2];
            uf7 k = vf7.m73227k(nm1, i5, true);
            uf7 l = vf7.m73228l(zp1.m75181c(yl1, nm1), b, k, true);
            int min = Math.min(8, k.mo66274g());
            int min2 = Math.min(8, l.mo66274g());
            uf7Arr[i3] = k;
            uf7Arr[i4] = l;
            bArr[i3] = vf7.m73223g(min, abs);
            bArr[i4] = vf7.m73223g(min2, abs2);
            i2++;
            nm1Arr2 = nm1Arr;
        }
        return m71969h(zArr, uf7Arr, bArr);
    }

    /* renamed from: g */
    public static nm1 m71968g(nm1[] nm1Arr, BigInteger[] bigIntegerArr) {
        int length = nm1Arr.length;
        boolean[] zArr = new boolean[length];
        uf7[] uf7Arr = new uf7[length];
        byte[][] bArr = new byte[length][];
        for (int i = 0; i < length; i++) {
            BigInteger bigInteger = bigIntegerArr[i];
            zArr[i] = bigInteger.signum() < 0;
            BigInteger abs = bigInteger.abs();
            uf7 k = vf7.m73227k(nm1Arr[i], vf7.m73225i(abs.bitLength(), 8), true);
            int min = Math.min(8, k.mo66274g());
            uf7Arr[i] = k;
            bArr[i] = vf7.m73223g(min, abs);
        }
        return m71969h(zArr, uf7Arr, bArr);
    }

    /* renamed from: h */
    public static nm1 m71969h(boolean[] zArr, uf7[] uf7Arr, byte[][] bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i = Math.max(i, length.length);
        }
        nm1 u = uf7Arr[0].mo66270c()[0].mo62740i().mo50668u();
        int i2 = i - 1;
        int i3 = 0;
        nm1 nm1 = u;
        while (i2 >= 0) {
            nm1 nm12 = u;
            for (int i4 = 0; i4 < r0; i4++) {
                byte[] bArr2 = bArr[i4];
                byte b = i2 < bArr2.length ? bArr2[i2] : 0;
                if (b != 0) {
                    int abs = Math.abs(b);
                    uf7 uf7 = uf7Arr[i4];
                    nm12 = nm12.mo50276a(((b < 0) == zArr[i4] ? uf7.mo66270c() : uf7.mo66271d())[abs >>> 1]);
                }
            }
            if (nm12 == u) {
                i3++;
            } else {
                if (i3 > 0) {
                    nm1 = nm1.mo62732I(i3);
                    i3 = 0;
                }
                nm1 = nm1.mo50275K(nm12);
            }
            i2--;
        }
        return i3 > 0 ? nm1.mo62732I(i3) : nm1;
    }

    /* renamed from: i */
    public static nm1 m71970i(nm1[] nm1Arr, BigInteger[] bigIntegerArr, pe2 pe2) {
        BigInteger w = nm1Arr[0].mo62740i().mo66323w();
        int i = r2 << 1;
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < r2; i3++) {
            BigInteger[] c = pe2.mo65295c(bigIntegerArr[i3].mod(w));
            int i4 = i2 + 1;
            bigIntegerArr2[i2] = c[0];
            i2 = i4 + 1;
            bigIntegerArr2[i4] = c[1];
        }
        if (pe2.mo65636a()) {
            return m71967f(pe2, nm1Arr, bigIntegerArr2);
        }
        nm1[] nm1Arr2 = new nm1[i];
        int i5 = 0;
        for (nm1 nm1 : nm1Arr) {
            nm1 c2 = zp1.m75181c(pe2, nm1);
            int i6 = i5 + 1;
            nm1Arr2[i5] = nm1;
            i5 = i6 + 1;
            nm1Arr2[i6] = c2;
        }
        return m71968g(nm1Arr2, bigIntegerArr2);
    }

    /* renamed from: j */
    public static nm1 m71971j(ul1 ul1, nm1 nm1) {
        if (ul1.mo66315l(nm1.mo62740i())) {
            return ul1.mo66324x(nm1);
        }
        throw new IllegalArgumentException("Point must be on the same curve");
    }

    /* renamed from: k */
    public static boolean m71972k(ul1 ul1) {
        return m71973l(ul1.mo66321s());
    }

    /* renamed from: l */
    public static boolean m71973l(c22 c22) {
        return c22.mo50778a() > 1 && c22.mo50779b().equals(tl1.f44773c) && (c22 instanceof es4);
    }

    /* renamed from: m */
    public static boolean m71974m(ul1 ul1) {
        return m71975n(ul1.mo66321s());
    }

    /* renamed from: n */
    public static boolean m71975n(c22 c22) {
        return c22.mo50778a() == 1;
    }

    /* renamed from: o */
    public static void m71976o(zl1[] zl1Arr, int i, int i2, zl1 zl1) {
        zl1[] zl1Arr2 = new zl1[i2];
        int i3 = 0;
        zl1Arr2[0] = zl1Arr[i];
        while (true) {
            i3++;
            if (i3 >= i2) {
                break;
            }
            zl1Arr2[i3] = zl1Arr2[i3 - 1].mo50984j(zl1Arr[i + i3]);
        }
        int i4 = i3 - 1;
        if (zl1 != null) {
            zl1Arr2[i4] = zl1Arr2[i4].mo50984j(zl1);
        }
        zl1 g = zl1Arr2[i4].mo50980g();
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = i4 + i;
            zl1 zl12 = zl1Arr[i6];
            zl1Arr[i6] = zl1Arr2[i5].mo50984j(g);
            g = g.mo50984j(zl12);
            i4 = i5;
        }
        zl1Arr[i] = g;
    }

    /* renamed from: p */
    public static nm1 m71977p(nm1 nm1, BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        nm1 u = nm1.mo62740i().mo50668u();
        int bitLength = abs.bitLength();
        if (bitLength > 0) {
            if (abs.testBit(0)) {
                u = nm1;
            }
            for (int i = 1; i < bitLength; i++) {
                nm1 = nm1.mo50274J();
                if (abs.testBit(i)) {
                    u = u.mo50276a(nm1);
                }
            }
        }
        return bigInteger.signum() < 0 ? u.mo50278z() : u;
    }

    /* renamed from: q */
    public static nm1 m71978q(nm1 nm1, BigInteger bigInteger, nm1 nm12, BigInteger bigInteger2) {
        nm1 d;
        ul1 i = nm1.mo62740i();
        nm1 j = m71971j(i, nm12);
        if (!(i instanceof ul1.C9406b) || !((ul1.C9406b) i).mo50699H()) {
            yl1 r = i.mo66320r();
            if (r instanceof pe2) {
                d = m71970i(new nm1[]{nm1, j}, new BigInteger[]{bigInteger, bigInteger2}, (pe2) r);
            } else {
                d = m71965d(nm1, bigInteger, j, bigInteger2);
            }
        } else {
            d = nm1.mo62755y(bigInteger).mo50276a(j.mo62755y(bigInteger2));
        }
        return m71962a(d);
    }
}
