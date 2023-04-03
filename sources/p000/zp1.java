package p000;

import java.math.BigInteger;

/* renamed from: zp1 */
public abstract class zp1 {

    /* renamed from: zp1$a */
    public static class C9707a implements ut4 {

        /* renamed from: a */
        public final /* synthetic */ yl1 f46468a;

        /* renamed from: b */
        public final /* synthetic */ nm1 f46469b;

        public C9707a(yl1 yl1, nm1 nm1) {
            this.f46468a = yl1;
            this.f46469b = nm1;
        }

        /* renamed from: a */
        public vt4 mo56012a(vt4 vt4) {
            yp1 yp1 = vt4 instanceof yp1 ? (yp1) vt4 : null;
            if (mo67375b(yp1, this.f46468a)) {
                return yp1;
            }
            nm1 a = this.f46468a.mo65637b().mo64495a(this.f46469b);
            yp1 yp12 = new yp1();
            yp12.mo67138c(this.f46468a);
            yp12.mo67139d(a);
            return yp12;
        }

        /* renamed from: b */
        public final boolean mo67375b(yp1 yp1, yl1 yl1) {
            return (yp1 == null || yp1.mo67136a() != yl1 || yp1.mo67137b() == null) ? false : true;
        }
    }

    /* renamed from: a */
    public static BigInteger m75179a(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        boolean z = bigInteger2.signum() < 0;
        BigInteger multiply = bigInteger.multiply(bigInteger2.abs());
        boolean testBit = multiply.testBit(i - 1);
        BigInteger shiftRight = multiply.shiftRight(i);
        if (testBit) {
            shiftRight = shiftRight.add(tl1.f44772b);
        }
        return z ? shiftRight.negate() : shiftRight;
    }

    /* renamed from: b */
    public static BigInteger[] m75180b(nl5 nl5, BigInteger bigInteger) {
        int b = nl5.mo62718b();
        BigInteger a = m75179a(bigInteger, nl5.mo62719c(), b);
        BigInteger a2 = m75179a(bigInteger, nl5.mo62720d(), b);
        return new BigInteger[]{bigInteger.subtract(a.multiply(nl5.mo62721e()).add(a2.multiply(nl5.mo62723g()))), a.multiply(nl5.mo62722f()).add(a2.multiply(nl5.mo62724h())).negate()};
    }

    /* renamed from: c */
    public static nm1 m75181c(yl1 yl1, nm1 nm1) {
        return ((yp1) nm1.mo62740i().mo66305A(nm1, "bc_endo", new C9707a(yl1, nm1))).mo67137b();
    }
}
