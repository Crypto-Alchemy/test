package p000;

import java.io.IOException;

/* renamed from: z4 */
public abstract class C9665z4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f46331d = new C9666a(C9665z4.class, 20);

    /* renamed from: a */
    public final byte[] f46332a;

    /* renamed from: z4$a */
    public static class C9666a extends C7119g5 {
        public C9666a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9665z4.m74745H(yz0.mo65418M());
        }
    }

    public C9665z4(byte[] bArr, boolean z) {
        this.f46332a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C9665z4 m74745H(byte[] bArr) {
        return new e01(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f46332a.length);
    }

    /* renamed from: J */
    public final String mo67218J() {
        return ob6.m70223b(this.f46332a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f46332a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9665z4)) {
            return false;
        }
        return C9367tq.m72417a(this.f46332a, ((C9665z4) t4Var).f46332a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 20, this.f46332a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo67218J();
    }
}
