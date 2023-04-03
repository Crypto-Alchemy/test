package p000;

import java.io.IOException;

/* renamed from: pz0 */
public class pz0 extends C9584x3 {
    public pz0(C6843b4 b4Var) throws IOException {
        super(b4Var.mo50158n().mo56353q("DER"), 0);
    }

    public pz0(byte[] bArr) {
        this(bArr, 0);
    }

    public pz0(byte[] bArr, int i) {
        super(bArr, i);
    }

    public pz0(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    /* renamed from: Q */
    public static pz0 m71123Q(C9584x3 x3Var) {
        return (pz0) x3Var.mo50472E();
    }

    /* renamed from: R */
    public static pz0 m71124R(C9203q4 q4Var) {
        return new pz0(q4Var.mo65418M(), true);
    }

    /* renamed from: S */
    public static pz0 m71125S(C6848b5 b5Var, boolean z) {
        C9326t4 S = b5Var.mo50477S();
        return (z || (S instanceof pz0)) ? m71126T(S) : m71124R(C9203q4.m71176L(S));
    }

    /* renamed from: T */
    public static pz0 m71126T(Object obj) {
        if (obj == null || (obj instanceof pz0)) {
            return (pz0) obj;
        }
        if (obj instanceof C9584x3) {
            return m71123Q((C9584x3) obj);
        }
        if (obj instanceof byte[]) {
            try {
                return m71123Q((C9584x3) C9326t4.m72150D((byte[]) obj));
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f45842a.length);
    }

    /* renamed from: E */
    public C9326t4 mo50472E() {
        return this;
    }

    /* renamed from: F */
    public C9326t4 mo50473F() {
        return this;
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        byte[] bArr = this.f45842a;
        int length = bArr.length - 1;
        byte b = bArr[length];
        byte b2 = (byte) ((255 << (bArr[0] & 255)) & b);
        if (b == b2) {
            s4Var.mo65812o(z, 3, bArr);
        } else {
            s4Var.mo65814q(z, 3, bArr, 0, length, b2);
        }
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }
}
