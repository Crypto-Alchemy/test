package p000;

import java.io.IOException;

/* renamed from: d4 */
public class C6961d4 extends C9326t4 {

    /* renamed from: e */
    public static final C7119g5 f37239e = new C6962a(C6961d4.class, 10);

    /* renamed from: g */
    public static final C6961d4[] f37240g = new C6961d4[12];

    /* renamed from: a */
    public final byte[] f37241a;

    /* renamed from: d */
    public final int f37242d;

    /* renamed from: d4$a */
    public static class C6962a extends C7119g5 {
        public C6962a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C6961d4.m56734H(yz0.mo65418M(), false);
        }
    }

    public C6961d4(byte[] bArr, boolean z) {
        if (C7333k4.m59690R(bArr)) {
            throw new IllegalArgumentException("malformed enumerated");
        } else if ((bArr[0] & 128) == 0) {
            this.f37241a = z ? C9367tq.m72422f(bArr) : bArr;
            this.f37242d = C7333k4.m59692U(bArr);
        } else {
            throw new IllegalArgumentException("enumerated must be non-negative");
        }
    }

    /* renamed from: H */
    public static C6961d4 m56734H(byte[] bArr, boolean z) {
        if (bArr.length > 1) {
            return new C6961d4(bArr, z);
        }
        if (bArr.length != 0) {
            byte b = bArr[0] & 255;
            C6961d4[] d4VarArr = f37240g;
            if (b >= d4VarArr.length) {
                return new C6961d4(bArr, z);
            }
            C6961d4 d4Var = d4VarArr[b];
            if (d4Var != null) {
                return d4Var;
            }
            C6961d4 d4Var2 = new C6961d4(bArr, z);
            d4VarArr[b] = d4Var2;
            return d4Var2;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f37241a.length);
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f37241a);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C6961d4)) {
            return false;
        }
        return C9367tq.m72417a(this.f37241a, ((C6961d4) t4Var).f37241a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 10, this.f37241a);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }
}
