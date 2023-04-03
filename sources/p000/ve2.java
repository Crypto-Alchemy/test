package p000;

/* renamed from: ve2 */
public class ve2 extends C7926n4 {

    /* renamed from: a */
    public C9156p4 f45278a;

    /* renamed from: d */
    public C9156p4 f45279d;

    /* renamed from: e */
    public C9156p4 f45280e;

    public ve2(C9480w4 w4Var) {
        this.f45278a = (C9156p4) w4Var.mo52675M(0);
        this.f45279d = (C9156p4) w4Var.mo52675M(1);
        if (w4Var.size() > 2) {
            this.f45280e = (C9156p4) w4Var.mo52675M(2);
        }
    }

    /* renamed from: r */
    public static ve2 m73201r(Object obj) {
        if (obj instanceof ve2) {
            return (ve2) obj;
        }
        if (obj != null) {
            return new ve2(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(3);
        c4Var.mo50805a(this.f45278a);
        c4Var.mo50805a(this.f45279d);
        C9156p4 p4Var = this.f45280e;
        if (p4Var != null) {
            c4Var.mo50805a(p4Var);
        }
        return new c01(c4Var);
    }

    /* renamed from: s */
    public C9156p4 mo66491s() {
        return this.f45278a;
    }
}
