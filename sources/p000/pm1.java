package p000;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: pm1 */
public class pm1 extends C7926n4 {

    /* renamed from: a */
    public C9480w4 f44065a;

    public pm1(int i, BigInteger bigInteger, C6843b4 b4Var) {
        this(i, bigInteger, (C9584x3) null, b4Var);
    }

    public pm1(int i, BigInteger bigInteger, C9584x3 x3Var, C6843b4 b4Var) {
        byte[] a = i10.m58761a((i + 7) / 8, bigInteger);
        C6923c4 c4Var = new C6923c4(4);
        c4Var.mo50805a(new C7333k4(1));
        c4Var.mo50805a(new yz0(a));
        if (b4Var != null) {
            c4Var.mo50805a(new f01(true, 0, b4Var));
        }
        if (x3Var != null) {
            c4Var.mo50805a(new f01(true, 1, x3Var));
        }
        this.f44065a = new c01(c4Var);
    }

    public pm1(C9480w4 w4Var) {
        this.f44065a = w4Var;
    }

    /* renamed from: r */
    public static pm1 m71016r(Object obj) {
        if (obj instanceof pm1) {
            return (pm1) obj;
        }
        if (obj != null) {
            return new pm1(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        return this.f44065a;
    }

    /* renamed from: s */
    public BigInteger mo65316s() {
        return new BigInteger(1, ((C9203q4) this.f44065a.mo52675M(1)).mo65418M());
    }

    /* renamed from: t */
    public final C7926n4 mo65317t(int i, int i2) {
        Enumeration N = this.f44065a.mo52676N();
        while (N.hasMoreElements()) {
            C6843b4 b4Var = (C6843b4) N.nextElement();
            if (b4Var instanceof C6848b5) {
                C6848b5 b5Var = (C6848b5) b4Var;
                if (b5Var.mo50480V(i)) {
                    return i2 < 0 ? b5Var.mo50476Q().mo50158n() : b5Var.mo50474N(true, i2);
                }
            }
        }
        return null;
    }

    /* renamed from: u */
    public C9584x3 mo65318u() {
        return (C9584x3) mo65317t(1, 3);
    }
}
