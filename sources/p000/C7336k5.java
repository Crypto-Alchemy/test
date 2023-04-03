package p000;

import java.io.IOException;

/* renamed from: k5 */
public abstract class C7336k5 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f38865d = new C7337a(C7336k5.class, 26);

    /* renamed from: a */
    public final byte[] f38866a;

    /* renamed from: k5$a */
    public static class C7337a extends C7119g5 {
        public C7337a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7336k5.m59712H(yz0.mo65418M());
        }
    }

    public C7336k5(byte[] bArr, boolean z) {
        this.f38866a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7336k5 m59712H(byte[] bArr) {
        return new j01(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f38866a.length);
    }

    /* renamed from: J */
    public final String mo52866J() {
        return ob6.m70223b(this.f38866a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f38866a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7336k5)) {
            return false;
        }
        return C9367tq.m72417a(this.f38866a, ((C7336k5) t4Var).f38866a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 26, this.f38866a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo52866J();
    }
}
