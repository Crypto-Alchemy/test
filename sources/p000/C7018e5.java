package p000;

import java.io.IOException;

/* renamed from: e5 */
public abstract class C7018e5 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f37474d = new C7019a(C7018e5.class, 12);

    /* renamed from: a */
    public final byte[] f37475a;

    /* renamed from: e5$a */
    public static class C7019a extends C7119g5 {
        public C7019a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7018e5.m57179H(yz0.mo65418M());
        }
    }

    public C7018e5(byte[] bArr, boolean z) {
        this.f37475a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7018e5 m57179H(byte[] bArr) {
        return new g01(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37475a.length);
    }

    /* renamed from: J */
    public final String mo51393J() {
        return ob6.m70224c(this.f37475a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f37475a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7018e5)) {
            return false;
        }
        return C9367tq.m72417a(this.f37475a, ((C7018e5) t4Var).f37475a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 12, this.f37475a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo51393J();
    }
}
