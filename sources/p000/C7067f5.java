package p000;

import java.io.IOException;

/* renamed from: f5 */
public abstract class C7067f5 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f37725d = new C7068a(C7067f5.class, 28);

    /* renamed from: e */
    public static final char[] f37726e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final byte[] f37727a;

    /* renamed from: f5$a */
    public static class C7068a extends C7119g5 {
        public C7068a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7067f5.m57604H(yz0.mo65418M());
        }
    }

    public C7067f5(byte[] bArr, boolean z) {
        this.f37727a = z ? C9367tq.m72422f(bArr) : bArr;
    }

    /* renamed from: H */
    public static C7067f5 m57604H(byte[] bArr) {
        return new h01(bArr, false);
    }

    /* renamed from: J */
    public static void m57605J(StringBuffer stringBuffer, int i) {
        char[] cArr = f37726e;
        stringBuffer.append(cArr[(i >>> 4) & 15]);
        stringBuffer.append(cArr[i & 15]);
    }

    /* renamed from: L */
    public static void m57606L(StringBuffer stringBuffer, int i) {
        if (i < 128) {
            m57605J(stringBuffer, i);
            return;
        }
        byte[] bArr = new byte[5];
        int i2 = 5;
        do {
            i2--;
            bArr[i2] = (byte) i;
            i >>>= 8;
        } while (i != 0);
        int i3 = 5 - i2;
        int i4 = i2 - 1;
        bArr[i4] = (byte) (i3 | 128);
        while (true) {
            int i5 = i4 + 1;
            m57605J(stringBuffer, bArr[i4]);
            if (i5 < 5) {
                i4 = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37727a.length);
    }

    /* renamed from: M */
    public final String mo51600M() {
        StringBuffer stringBuffer = new StringBuffer(((C9302s4.m71858f(r0) + r0) * 2) + 3);
        stringBuffer.append("#1C");
        m57606L(stringBuffer, r0);
        for (byte J : this.f37727a) {
            m57605J(stringBuffer, J);
        }
        return stringBuffer.toString();
    }

    public final int hashCode() {
        return C9367tq.m72437u(this.f37727a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7067f5)) {
            return false;
        }
        return C9367tq.m72417a(this.f37727a, ((C7067f5) t4Var).f37727a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 28, this.f37727a);
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo51600M();
    }
}
