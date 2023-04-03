package p000;

/* renamed from: so7 */
public class so7 extends C7926n4 {

    /* renamed from: a */
    public final C7333k4 f44585a;

    /* renamed from: d */
    public final int f44586d;

    /* renamed from: e */
    public final int f44587e;

    /* renamed from: g */
    public final C6825af f44588g;

    public so7(int i, int i2, C6825af afVar) {
        this.f44585a = new C7333k4(0);
        this.f44586d = i;
        this.f44587e = i2;
        this.f44588g = afVar;
    }

    public so7(C9480w4 w4Var) {
        this.f44585a = C7333k4.m59688L(w4Var.mo52675M(0));
        this.f44586d = C7333k4.m59688L(w4Var.mo52675M(1)).mo52860Q();
        this.f44587e = C7333k4.m59688L(w4Var.mo52675M(2)).mo52860Q();
        this.f44588g = C6825af.m55483s(w4Var.mo52675M(3));
    }

    /* renamed from: s */
    public static so7 m71990s(Object obj) {
        if (obj instanceof so7) {
            return (so7) obj;
        }
        if (obj != null) {
            return new so7(C9480w4.m73427L(obj));
        }
        return null;
    }

    /* renamed from: n */
    public C9326t4 mo50158n() {
        C6923c4 c4Var = new C6923c4();
        c4Var.mo50805a(this.f44585a);
        c4Var.mo50805a(new C7333k4((long) this.f44586d));
        c4Var.mo50805a(new C7333k4((long) this.f44587e));
        c4Var.mo50805a(this.f44588g);
        return new c01(c4Var);
    }

    /* renamed from: r */
    public int mo65880r() {
        return this.f44586d;
    }

    /* renamed from: t */
    public int mo65881t() {
        return this.f44587e;
    }

    /* renamed from: u */
    public C6825af mo65882u() {
        return this.f44588g;
    }
}
