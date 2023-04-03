package p000;

import java.math.BigInteger;

/* renamed from: k32 */
public class k32 extends C6965d6 {
    /* renamed from: c */
    public nm1 mo51131c(nm1 nm1, BigInteger bigInteger) {
        ul1 i = nm1.mo62740i();
        int a = m32.m64055a(i);
        if (bigInteger.bitLength() <= a) {
            l32 b = m32.m64056b(nm1);
            fm1 a2 = b.mo55813a();
            int c = b.mo55815c();
            int i2 = ((a + c) - 1) / c;
            nm1 u = i.mo50668u();
            int i3 = c * i2;
            int[] q = p34.m70893q(i3, bigInteger);
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 0;
                for (int i7 = i4 - i5; i7 >= 0; i7 -= i2) {
                    int i8 = q[i7 >>> 5] >>> (i7 & 31);
                    i6 = ((i6 ^ (i8 >>> 1)) << 1) ^ i8;
                }
                u = u.mo50275K(a2.mo50669a(i6));
            }
            return u.mo50276a(b.mo55814b());
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
