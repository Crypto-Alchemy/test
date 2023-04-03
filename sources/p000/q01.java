package p000;

/* renamed from: q01 */
public class q01 extends C7013e4 {
    public q01(C6923c4 c4Var) {
        this(r01.m71419a(c4Var));
    }

    public q01(C9156p4 p4Var, C7333k4 k4Var, C9326t4 t4Var, int i, C9326t4 t4Var2) {
        super(p4Var, k4Var, t4Var, i, t4Var2);
    }

    public q01(t01 t01) {
        super(t01);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: H */
    public C9480w4 mo51360H() {
        C6923c4 c4Var = new C6923c4(4);
        C9156p4 p4Var = this.f37454a;
        if (p4Var != null) {
            c4Var.mo50805a(p4Var);
        }
        C7333k4 k4Var = this.f37455d;
        if (k4Var != null) {
            c4Var.mo50805a(k4Var);
        }
        C9326t4 t4Var = this.f37456e;
        if (t4Var != null) {
            c4Var.mo50805a(t4Var.mo50473F());
        }
        int i = this.f37457g;
        c4Var.mo50805a(new x01(i == 0, i, this.f37458k));
        return new t01(c4Var);
    }
}
