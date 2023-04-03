package p000;

import java.io.IOException;

/* renamed from: h4 */
public abstract class C7159h4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f38158d = new C7160a(C7159h4.class, 25);

    /* renamed from: a */
    public final byte[] f38159a;

    /* renamed from: h4$a */
    public static class C7160a extends C7119g5 {
        public C7160a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7159h4.m58466H(yz0.mo65418M());
        }
    }

    public C7159h4(byte[] bArr, boolean z) {
        if (bArr != null) {
            this.f38159a = z ? C9367tq.m72422f(bArr) : bArr;
            return;
        }
        throw new NullPointerException("'contents' cannot be null");
    }

    /* renamed from: H */
    public static C7159h4 m58466H(byte[] bArr) {
        return new uz0(bArr, false);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f38159a.length);
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f38159a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7159h4)) {
            return false;
        }
        return C9367tq.m72417a(this.f38159a, ((C7159h4) t4Var).f38159a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 25, this.f38159a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }
}
