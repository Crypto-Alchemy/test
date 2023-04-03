package p000;

import java.io.IOException;

/* renamed from: d5 */
public class C6963d5 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f37245d = new C6964a(C6963d5.class, 23);

    /* renamed from: a */
    public final byte[] f37246a;

    /* renamed from: d5$a */
    public static class C6964a extends C7119g5 {
        public C6964a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C6963d5.m56740H(yz0.mo65418M());
        }
    }

    public C6963d5(byte[] bArr) {
        if (bArr.length >= 2) {
            this.f37246a = bArr;
            if (!mo51127J(0) || !mo51127J(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    /* renamed from: H */
    public static C6963d5 m56740H(byte[] bArr) {
        return new C6963d5(bArr);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37246a.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51127J(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f37246a
            int r1 = r0.length
            if (r1 <= r3) goto L_0x0011
            byte r3 = r0[r3]
            r0 = 48
            if (r3 < r0) goto L_0x0011
            r0 = 57
            if (r3 > r0) goto L_0x0011
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6963d5.mo51127J(int):boolean");
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f37246a);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C6963d5)) {
            return false;
        }
        return C9367tq.m72417a(this.f37246a, ((C6963d5) t4Var).f37246a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 23, this.f37246a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return ob6.m70223b(this.f37246a);
    }
}
