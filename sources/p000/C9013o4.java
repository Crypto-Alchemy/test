package p000;

import java.io.IOException;

/* renamed from: o4 */
public final class C9013o4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f43584d = new C9014a(C9013o4.class, 7);

    /* renamed from: a */
    public final C7159h4 f43585a;

    /* renamed from: o4$a */
    public static class C9014a extends C7119g5 {
        public C9014a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: c */
        public C9326t4 mo51361c(C9480w4 w4Var) {
            return new C9013o4((C7159h4) C7159h4.f38158d.mo51361c(w4Var));
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return new C9013o4((C7159h4) C7159h4.f38158d.mo51125d(yz0));
        }
    }

    public C9013o4(C7159h4 h4Var) {
        if (h4Var != null) {
            this.f43585a = h4Var;
            return;
        }
        throw new NullPointerException("'baseGraphicString' cannot be null");
    }

    /* renamed from: H */
    public static C9013o4 m70136H(byte[] bArr) {
        return new C9013o4(C7159h4.m58466H(bArr));
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return this.f43585a.mo50761A(z);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        C7159h4 h4Var = (C7159h4) this.f43585a.mo50472E();
        return h4Var == this.f43585a ? this : new C9013o4(h4Var);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        C7159h4 h4Var = (C7159h4) this.f43585a.mo50473F();
        return h4Var == this.f43585a ? this : new C9013o4(h4Var);
    }

    public int hashCode() {
        return ~this.f43585a.hashCode();
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9013o4)) {
            return false;
        }
        return this.f43585a.mo50485r(((C9013o4) t4Var).f43585a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65816s(z, 7);
        this.f43585a.mo50767s(s4Var, false);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }
}
