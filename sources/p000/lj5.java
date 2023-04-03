package p000;

/* renamed from: lj5 */
public class lj5 extends C7926n4 {

    /* renamed from: a */
    public final C7333k4 f40629a;

    /* renamed from: d */
    public final C6825af f40630d;

    public lj5(C6825af afVar) {
        this.f40629a = new C7333k4(0);
        this.f40630d = afVar;
    }

    public lj5(C9480w4 w4Var) {
        this.f40629a = C7333k4.m59688L(w4Var.mo52675M(0));
        this.f40630d = C6825af.m55483s(w4Var.mo52675M(1));
    }

    /* renamed from: r */
    public static final lj5 m63846r(Object obj) {
        if (obj instanceof lj5) {
            return (lj5) obj;
        }
        if (obj != null) {
            return new lj5(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(this.f40629a);
        c4Var.mo50805a(this.f40630d);
        return new c01(c4Var);
    }

    /* renamed from: s */
    public C6825af mo55912s() {
        return this.f40630d;
    }
}
