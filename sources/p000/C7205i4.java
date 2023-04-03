package p000;

import java.io.IOException;

/* renamed from: i4 */
public abstract class C7205i4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f38329d = new C7206a(C7205i4.class, 22);

    /* renamed from: a */
    public final byte[] f38330a;

    /* renamed from: i4$a */
    public static class C7206a extends C7119g5 {
        public C7206a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7205i4.m58846H(yz0.mo65418M());
        }
    }

    public C7205i4(byte[] bArr, boolean z) {
        this.f38330a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7205i4 m58846H(byte[] bArr) {
        return new vz0(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f38330a.length);
    }

    /* renamed from: J */
    public final String mo52396J() {
        return ob6.m70223b(this.f38330a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f38330a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7205i4)) {
            return false;
        }
        return C9367tq.m72417a(this.f38330a, ((C7205i4) t4Var).f38330a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 22, this.f38330a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo52396J();
    }
}
