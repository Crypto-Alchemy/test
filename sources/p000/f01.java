package p000;

import java.io.IOException;

/* renamed from: f01 */
public class f01 extends C6848b5 {
    public f01(int i, int i2, int i3, C6843b4 b4Var) {
        super(i, i2, i3, b4Var);
    }

    public f01(boolean z, int i, C6843b4 b4Var) {
        super(z, i, b4Var);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        C9326t4 E = this.f36685g.mo50158n().mo50472E();
        boolean W = mo50481W();
        int A = E.mo50761A(W);
        if (W) {
            A += C9302s4.m71858f(A);
        }
        return A + (z ? C9302s4.m71860h(this.f36684e) : 0);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this;
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: X */
    public C9480w4 mo50482X(C9326t4 t4Var) {
        return new c01((C6843b4) t4Var);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        C9326t4 E = this.f36685g.mo50158n().mo50472E();
        boolean W = mo50481W();
        if (z) {
            int i = this.f36683d;
            if (W || E.mo51124t()) {
                i |= 32;
            }
            s4Var.mo65817t(true, i, this.f36684e);
        }
        if (W) {
            s4Var.mo65809k(E.mo50761A(true));
        }
        E.mo50767s(s4Var.mo50014d(), W);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return mo50481W() || this.f36685g.mo50158n().mo50472E().mo51124t();
    }
}
