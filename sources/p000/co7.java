package p000;

import java.math.BigInteger;

/* renamed from: co7 */
public class co7 extends C7926n4 implements io7 {

    /* renamed from: s */
    public static final BigInteger f37168s = BigInteger.valueOf(1);

    /* renamed from: a */
    public go7 f37169a;

    /* renamed from: d */
    public ul1 f37170d;

    /* renamed from: e */
    public eo7 f37171e;

    /* renamed from: g */
    public BigInteger f37172g;

    /* renamed from: k */
    public BigInteger f37173k;

    /* renamed from: r */
    public byte[] f37174r;

    public co7(ul1 ul1, eo7 eo7, BigInteger bigInteger, BigInteger bigInteger2) {
        this(ul1, eo7, bigInteger, bigInteger2, (byte[]) null);
    }

    public co7(ul1 ul1, eo7 eo7, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        go7 go7;
        this.f37170d = ul1;
        this.f37171e = eo7;
        this.f37172g = bigInteger;
        this.f37173k = bigInteger2;
        this.f37174r = C9367tq.m72422f(bArr);
        if (sl1.m71974m(ul1)) {
            go7 = new go7(ul1.mo66321s().mo50779b());
        } else if (sl1.m71972k(ul1)) {
            int[] a = ((es4) ul1.mo66321s()).mo51541c().mo51279a();
            if (a.length == 3) {
                go7 = new go7(a[2], a[1]);
            } else if (a.length == 5) {
                go7 = new go7(a[4], a[1], a[2], a[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        this.f37169a = go7;
    }

    public co7(C9480w4 w4Var) {
        if (!(w4Var.mo52675M(0) instanceof C7333k4) || !((C7333k4) w4Var.mo52675M(0)).mo52859N(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f37172g = ((C7333k4) w4Var.mo52675M(4)).mo52858M();
        if (w4Var.size() == 6) {
            this.f37173k = ((C7333k4) w4Var.mo52675M(5)).mo52858M();
        }
        bo7 bo7 = new bo7(go7.m58169s(w4Var.mo52675M(1)), this.f37172g, this.f37173k, C9480w4.m73427L(w4Var.mo52675M(2)));
        this.f37170d = bo7.mo50673r();
        C6843b4 M = w4Var.mo52675M(3);
        if (M instanceof eo7) {
            this.f37171e = (eo7) M;
        } else {
            this.f37171e = new eo7(this.f37170d, (C9203q4) M);
        }
        this.f37174r = bo7.mo50674s();
    }

    /* renamed from: u */
    public static co7 m56481u(Object obj) {
        if (obj instanceof co7) {
            return (co7) obj;
        }
        if (obj != null) {
            return new co7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: A */
    public byte[] mo50928A() {
        return C9367tq.m72422f(this.f37174r);
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(6);
        c4Var.mo50805a(new C7333k4(f37168s));
        c4Var.mo50805a(this.f37169a);
        c4Var.mo50805a(new bo7(this.f37170d, this.f37174r));
        c4Var.mo50805a(this.f37171e);
        c4Var.mo50805a(new C7333k4(this.f37172g));
        if (this.f37173k != null) {
            c4Var.mo50805a(new C7333k4(this.f37173k));
        }
        return new c01(c4Var);
    }

    /* renamed from: r */
    public ul1 mo50929r() {
        return this.f37170d;
    }

    /* renamed from: s */
    public nm1 mo50930s() {
        return this.f37171e.mo51515r();
    }

    /* renamed from: t */
    public BigInteger mo50931t() {
        return this.f37173k;
    }

    /* renamed from: w */
    public BigInteger mo50932w() {
        return this.f37172g;
    }
}
