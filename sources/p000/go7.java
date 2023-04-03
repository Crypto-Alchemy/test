package p000;

import java.math.BigInteger;

/* renamed from: go7 */
public class go7 extends C7926n4 implements io7 {

    /* renamed from: a */
    public C9156p4 f38048a;

    /* renamed from: d */
    public C9326t4 f38049d;

    public go7(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public go7(int i, int i2, int i3, int i4) {
        this.f38048a = io7.f38434D;
        C6923c4 c4Var = new C6923c4(3);
        c4Var.mo50805a(new C7333k4((long) i));
        if (i3 == 0) {
            if (i4 == 0) {
                c4Var.mo50805a(io7.f38438F);
                c4Var.mo50805a(new C7333k4((long) i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            c4Var.mo50805a(io7.f38440G);
            C6923c4 c4Var2 = new C6923c4(3);
            c4Var2.mo50805a(new C7333k4((long) i2));
            c4Var2.mo50805a(new C7333k4((long) i3));
            c4Var2.mo50805a(new C7333k4((long) i4));
            c4Var.mo50805a(new c01(c4Var2));
        }
        this.f38049d = new c01(c4Var);
    }

    public go7(BigInteger bigInteger) {
        this.f38048a = io7.f38496z;
        this.f38049d = new C7333k4(bigInteger);
    }

    public go7(C9480w4 w4Var) {
        this.f38048a = C9156p4.m70910O(w4Var.mo52675M(0));
        this.f38049d = w4Var.mo52675M(1).mo50158n();
    }

    /* renamed from: s */
    public static go7 m58169s(Object obj) {
        if (obj instanceof go7) {
            return (go7) obj;
        }
        if (obj != null) {
            return new go7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(2);
        c4Var.mo50805a(this.f38048a);
        c4Var.mo50805a(this.f38049d);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C9156p4 mo51951r() {
        return this.f38048a;
    }

    /* renamed from: t */
    public C9326t4 mo51952t() {
        return this.f38049d;
    }
}
