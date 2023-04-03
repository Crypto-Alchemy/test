package p000;

import java.io.IOException;

/* renamed from: j5 */
public abstract class C7245j5 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f38593d = new C7246a(C7245j5.class, 21);

    /* renamed from: a */
    public final byte[] f38594a;

    /* renamed from: j5$a */
    public static class C7246a extends C7119g5 {
        public C7246a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7245j5.m59258H(yz0.mo65418M());
        }
    }

    public C7245j5(byte[] bArr, boolean z) {
        this.f38594a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7245j5 m59258H(byte[] bArr) {
        return new i01(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f38594a.length);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f38594a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7245j5)) {
            return false;
        }
        return C9367tq.m72417a(this.f38594a, ((C7245j5) t4Var).f38594a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 21, this.f38594a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }
}
