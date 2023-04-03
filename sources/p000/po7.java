package p000;

/* renamed from: po7 */
public class po7 extends C7926n4 {

    /* renamed from: a */
    public final C7333k4 f44083a;

    /* renamed from: d */
    public final int f44084d;

    /* renamed from: e */
    public final C6825af f44085e;

    public po7(int i, C6825af afVar) {
        this.f44083a = new C7333k4(0);
        this.f44084d = i;
        this.f44085e = afVar;
    }

    public po7(C9480w4 w4Var) {
        this.f44083a = C7333k4.m59688L(w4Var.mo52675M(0));
        this.f44084d = C7333k4.m59688L(w4Var.mo52675M(1)).mo52860Q();
        this.f44085e = C6825af.m55483s(w4Var.mo52675M(2));
    }

    /* renamed from: s */
    public static po7 m71049s(Object obj) {
        if (obj instanceof po7) {
            return (po7) obj;
        }
        if (obj != null) {
            return new po7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(this.f44083a);
        c4Var.mo50805a(new C7333k4((long) this.f44084d));
        c4Var.mo50805a(this.f44085e);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public int mo65329r() {
        return this.f44084d;
    }

    /* renamed from: t */
    public C6825af mo65330t() {
        return this.f44085e;
    }
}
