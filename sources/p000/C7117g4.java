package p000;

import java.io.IOException;

/* renamed from: g4 */
public class C7117g4 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f37971d = new C7118a(C7117g4.class, 24);

    /* renamed from: a */
    public final byte[] f37972a;

    /* renamed from: g4$a */
    public static class C7118a extends C7119g5 {
        public C7118a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7117g4.m58041H(yz0.mo65418M());
        }
    }

    public C7117g4(byte[] bArr) {
        if (bArr.length >= 4) {
            this.f37972a = bArr;
            if (!mo51865N(0) || !mo51865N(1) || !mo51865N(2) || !mo51865N(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    /* renamed from: H */
    public static C7117g4 m58041H(byte[] bArr) {
        return new C7117g4(bArr);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37972a.length);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return new tz0(this.f37972a);
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return new tz0(this.f37972a);
    }

    /* renamed from: J */
    public boolean mo51862J() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f37972a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: L */
    public boolean mo51863L() {
        return mo51865N(10) && mo51865N(11);
    }

    /* renamed from: M */
    public boolean mo51864M() {
        return mo51865N(12) && mo51865N(13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r3 = r0[r3];
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51865N(int r3) {
        /*
            r2 = this;
            byte[] r0 = r2.f37972a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7117g4.mo51865N(int):boolean");
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f37972a);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7117g4)) {
            return false;
        }
        return C9367tq.m72417a(this.f37972a, ((C7117g4) t4Var).f37972a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 24, this.f37972a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }
}
