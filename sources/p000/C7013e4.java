package p000;

import java.io.IOException;

/* renamed from: e4 */
public abstract class C7013e4 extends C9326t4 {

    /* renamed from: r */
    public static final C7119g5 f37453r = new C7014a(C7013e4.class, 8);

    /* renamed from: a */
    public C9156p4 f37454a;

    /* renamed from: d */
    public C7333k4 f37455d;

    /* renamed from: e */
    public C9326t4 f37456e;

    /* renamed from: g */
    public int f37457g;

    /* renamed from: k */
    public C9326t4 f37458k;

    /* renamed from: e4$a */
    public static class C7014a extends C7119g5 {
        public C7014a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return w4Var.mo50763Q();
        }
    }

    public C7013e4(C9156p4 p4Var, C7333k4 k4Var, C9326t4 t4Var, int i, C9326t4 t4Var2) {
        this.f37454a = p4Var;
        this.f37455d = k4Var;
        this.f37456e = t4Var;
        this.f37457g = m57152J(i);
        this.f37458k = m57153L(i, t4Var2);
    }

    public C7013e4(C9480w4 w4Var) {
        int i = 0;
        C9326t4 N = m57155N(w4Var, 0);
        if (N instanceof C9156p4) {
            this.f37454a = (C9156p4) N;
            N = m57155N(w4Var, 1);
            i = 1;
        }
        if (N instanceof C7333k4) {
            this.f37455d = (C7333k4) N;
            i++;
            N = m57155N(w4Var, i);
        }
        if (!(N instanceof C6848b5)) {
            this.f37456e = N;
            i++;
            N = m57155N(w4Var, i);
        }
        if (w4Var.size() != i + 1) {
            throw new IllegalArgumentException("input sequence too large");
        } else if (N instanceof C6848b5) {
            C6848b5 b5Var = (C6848b5) N;
            this.f37457g = m57152J(b5Var.mo50479U());
            this.f37458k = m57154M(b5Var);
        } else {
            throw new IllegalArgumentException("No tagged object found in sequence. Structure doesn't seem to be of type External");
        }
    }

    /* renamed from: J */
    public static int m57152J(int i) {
        if (i >= 0 && i <= 2) {
            return i;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i);
    }

    /* renamed from: L */
    public static C9326t4 m57153L(int i, C9326t4 t4Var) {
        C7119g5 g5Var;
        if (i == 1) {
            g5Var = C9203q4.f44151d;
        } else if (i != 2) {
            return t4Var;
        } else {
            g5Var = C9584x3.f45840d;
        }
        return g5Var.mo51867a(t4Var);
    }

    /* renamed from: M */
    public static C9326t4 m57154M(C6848b5 b5Var) {
        int T = b5Var.mo50478T();
        int U = b5Var.mo50479U();
        if (128 != T) {
            throw new IllegalArgumentException("invalid tag: " + C7207i5.m58862a(T, U));
        } else if (U == 0) {
            return b5Var.mo50476Q().mo50158n();
        } else {
            if (U == 1) {
                return C9203q4.m71175J(b5Var, false);
            }
            if (U == 2) {
                return C9584x3.m73851L(b5Var, false);
            }
            throw new IllegalArgumentException("invalid tag: " + C7207i5.m58862a(T, U));
        }
    }

    /* renamed from: N */
    public static C9326t4 m57155N(C9480w4 w4Var, int i) {
        if (w4Var.size() > i) {
            return w4Var.mo52675M(i).mo50158n();
        }
        throw new IllegalArgumentException("too few objects in input sequence");
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        return mo51360H().mo50761A(z);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new qz0(this.f37454a, this.f37455d, this.f37456e, this.f37457g, this.f37458k);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new q01(this.f37454a, this.f37455d, this.f37456e, this.f37457g, this.f37458k);
    }

    /* renamed from: H */
    public abstract C9480w4 mo51360H();

    public int hashCode() {
        return (((lf4.m63828b(this.f37454a) ^ lf4.m63828b(this.f37455d)) ^ lf4.m63828b(this.f37456e)) ^ this.f37457g) ^ this.f37458k.hashCode();
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (this == t4Var) {
            return true;
        }
        if (!(t4Var instanceof C7013e4)) {
            return false;
        }
        C7013e4 e4Var = (C7013e4) t4Var;
        return lf4.m63827a(this.f37454a, e4Var.f37454a) && lf4.m63827a(this.f37455d, e4Var.f37455d) && lf4.m63827a(this.f37456e, e4Var.f37456e) && this.f37457g == e4Var.f37457g && this.f37458k.mo65963B(e4Var.f37458k);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65816s(z, 40);
        mo51360H().mo50767s(s4Var, false);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return true;
    }
}
