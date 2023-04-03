package p000;

import java.io.IOException;

/* renamed from: u4 */
public abstract class C9385u4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f44882d = new C9386a(C9385u4.class, 19);

    /* renamed from: a */
    public final byte[] f44883a;

    /* renamed from: u4$a */
    public static class C9386a extends C7119g5 {
        public C9386a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9385u4.m72584H(yz0.mo65418M());
        }
    }

    public C9385u4(byte[] bArr, boolean z) {
        this.f44883a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C9385u4 m72584H(byte[] bArr) {
        return new b01(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f44883a.length);
    }

    /* renamed from: J */
    public final String mo66173J() {
        return ob6.m70223b(this.f44883a);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f44883a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9385u4)) {
            return false;
        }
        return C9367tq.m72417a(this.f44883a, ((C9385u4) t4Var).f44883a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 19, this.f44883a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo66173J();
    }
}
