package p000;

import java.io.IOException;

/* renamed from: qw */
public class C9222qw extends C6848b5 {
    public C9222qw(int i, int i2, int i3, C6843b4 b4Var) {
        super(i, i2, i3, b4Var);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        C9326t4 n = this.f36685g.mo50158n();
        boolean W = mo50481W();
        int A = n.mo50761A(W);
        if (W) {
            A += 3;
        }
        return A + (z ? C9302s4.m71860h(this.f36684e) : 0);
    }

    /* renamed from: X */
    public C9480w4 mo50482X(C9326t4 t4Var) {
        return new C7915mw((C6843b4) t4Var);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        C9326t4 n = this.f36685g.mo50158n();
        boolean W = mo50481W();
        if (z) {
            int i = this.f36683d;
            if (W || n.mo51124t()) {
                i |= 32;
            }
            s4Var.mo65817t(true, i, this.f36684e);
        }
        if (W) {
            s4Var.mo65807i(128);
            n.mo50767s(s4Var, true);
            s4Var.mo65807i(0);
            s4Var.mo65807i(0);
            return;
        }
        n.mo50767s(s4Var, false);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return mo50481W() || this.f36685g.mo50158n().mo51124t();
    }
}
