package p000;

/* renamed from: af */
public class C6825af extends C7926n4 {

    /* renamed from: a */
    public C9156p4 f36449a;

    /* renamed from: d */
    public C6843b4 f36450d;

    public C6825af(C9156p4 p4Var) {
        this.f36449a = p4Var;
    }

    public C6825af(C9156p4 p4Var, C6843b4 b4Var) {
        this.f36449a = p4Var;
        this.f36450d = b4Var;
    }

    public C6825af(C9480w4 w4Var) {
        if (w4Var.size() < 1 || w4Var.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + w4Var.size());
        }
        this.f36449a = C9156p4.m70910O(w4Var.mo52675M(0));
        this.f36450d = w4Var.size() == 2 ? w4Var.mo52675M(1) : null;
    }

    /* renamed from: s */
    public static C6825af m55483s(Object obj) {
        if (obj instanceof C6825af) {
            return (C6825af) obj;
        }
        if (obj != null) {
            return new C6825af(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4(2);
        c4Var.mo50805a(this.f36449a);
        C6843b4 b4Var = this.f36450d;
        if (b4Var != null) {
            c4Var.mo50805a(b4Var);
        }
        return new c01(c4Var);
    }

    /* renamed from: r */
    public C9156p4 mo50159r() {
        return this.f36449a;
    }

    /* renamed from: t */
    public C6843b4 mo50160t() {
        return this.f36450d;
    }
}
