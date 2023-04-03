package p000;

import java.io.IOException;

/* renamed from: f4 */
public abstract class C7065f4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f37722d = new C7066a(C7065f4.class, 27);

    /* renamed from: a */
    public final byte[] f37723a;

    /* renamed from: f4$a */
    public static class C7066a extends C7119g5 {
        public C7066a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7065f4.m57587H(yz0.mo65418M());
        }
    }

    public C7065f4(byte[] bArr, boolean z) {
        this.f37723a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7065f4 m57587H(byte[] bArr) {
        return new sz0(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37723a.length);
    }

    /* renamed from: J */
    public final String mo51593J() {
        return ob6.m70223b(this.f37723a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f37723a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7065f4)) {
            return false;
        }
        return C9367tq.m72417a(this.f37723a, ((C7065f4) t4Var).f37723a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 27, this.f37723a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo51593J();
    }
}
