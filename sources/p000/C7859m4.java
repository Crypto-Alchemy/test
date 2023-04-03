package p000;

import java.io.IOException;

/* renamed from: m4 */
public abstract class C7859m4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f40750d = new C7860a(C7859m4.class, 18);

    /* renamed from: a */
    public final byte[] f40751a;

    /* renamed from: m4$a */
    public static class C7860a extends C7119g5 {
        public C7860a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7859m4.m64068H(yz0.mo65418M());
        }
    }

    public C7859m4(byte[] bArr, boolean z) {
        this.f40751a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7859m4 m64068H(byte[] bArr) {
        return new xz0(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f40751a.length);
    }

    /* renamed from: J */
    public final String mo56016J() {
        return ob6.m70223b(this.f40751a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f40751a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7859m4)) {
            return false;
        }
        return C9367tq.m72417a(this.f40751a, ((C7859m4) t4Var).f40751a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 18, this.f40751a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo56016J();
    }
}
