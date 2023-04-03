package p000;

import java.io.IOException;

/* renamed from: v3 */
public abstract class C9435v3 extends C9326t4 implements ct2 {

    /* renamed from: a */
    public final C6848b5 f45213a;

    public C9435v3(C6848b5 b5Var) {
        m73046H(b5Var.mo50478T());
        this.f45213a = b5Var;
    }

    /* renamed from: H */
    public static int m73046H(int i) {
        if (64 == i) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: A */
    public int mo50761A(boolean z) throws IOException {
        return this.f45213a.mo50761A(z);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new nz0((C6848b5) this.f45213a.mo50472E());
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new n01((C6848b5) this.f45213a.mo50473F());
    }

    public int hashCode() {
        return this.f45213a.hashCode();
    }

    /* renamed from: k */
    public final C9326t4 mo50484k() {
        return this;
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        C6848b5 b5Var;
        if (t4Var instanceof C9435v3) {
            b5Var = ((C9435v3) t4Var).f45213a;
        } else if (!(t4Var instanceof C6848b5)) {
            return false;
        } else {
            b5Var = (C6848b5) t4Var;
        }
        return this.f45213a.mo65963B(b5Var);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        this.f45213a.mo50767s(s4Var, z);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return this.f45213a.mo51124t();
    }
}
