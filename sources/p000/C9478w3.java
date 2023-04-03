package p000;

import java.io.IOException;

/* renamed from: w3 */
public abstract class C9478w3 extends C9326t4 {

    /* renamed from: d */
    public static final C7119g5 f45420d = new C9479a(C9478w3.class, 30);

    /* renamed from: a */
    public final char[] f45421a;

    /* renamed from: w3$a */
    public static class C9479a extends C7119g5 {
        public C9479a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9478w3.m73415H(yz0.mo65418M());
        }
    }

    public C9478w3(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if ((length & 1) == 0) {
                int i = length / 2;
                char[] cArr = new char[i];
                for (int i2 = 0; i2 != i; i2++) {
                    int i3 = i2 * 2;
                    cArr[i2] = (char) ((bArr[i3 + 1] & 255) | (bArr[i3] << 8));
                }
                this.f45421a = cArr;
                return;
            }
            throw new IllegalArgumentException("malformed BMPString encoding encountered");
        }
        throw new NullPointerException("'string' cannot be null");
    }

    public C9478w3(char[] cArr) {
        if (cArr != null) {
            this.f45421a = cArr;
            return;
        }
        throw new NullPointerException("'string' cannot be null");
    }

    /* renamed from: H */
    public static C9478w3 m73415H(byte[] bArr) {
        return new oz0(bArr);
    }

    /* renamed from: J */
    public static C9478w3 m73416J(char[] cArr) {
        return new oz0(cArr);
    }

    /* renamed from: A */
    public final int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f45421a.length * 2);
    }

    /* renamed from: L */
    public final String mo66611L() {
        return new String(this.f45421a);
    }

    public final int hashCode() {
        return C9367tq.m72439w(this.f45421a);
    }

    /* renamed from: r */
    public final boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C9478w3)) {
            return false;
        }
        return C9367tq.m72418b(this.f45421a, ((C9478w3) t4Var).f45421a);
    }

    /* renamed from: s */
    public final void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        int length = this.f45421a.length;
        s4Var.mo65816s(z, 30);
        s4Var.mo65809k(length * 2);
        byte[] bArr = new byte[8];
        int i = length & -4;
        int i2 = 0;
        while (i2 < i) {
            char[] cArr = this.f45421a;
            char c = cArr[i2];
            char c2 = cArr[i2 + 1];
            char c3 = cArr[i2 + 2];
            char c4 = cArr[i2 + 3];
            i2 += 4;
            bArr[0] = (byte) (c >> 8);
            bArr[1] = (byte) c;
            bArr[2] = (byte) (c2 >> 8);
            bArr[3] = (byte) c2;
            bArr[4] = (byte) (c3 >> 8);
            bArr[5] = (byte) c3;
            bArr[6] = (byte) (c4 >> 8);
            bArr[7] = (byte) c4;
            s4Var.mo65808j(bArr, 0, 8);
        }
        if (i2 < length) {
            int i3 = 0;
            do {
                char c5 = this.f45421a[i2];
                i2++;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (c5 >> 8);
                i3 = i4 + 1;
                bArr[i4] = (byte) c5;
            } while (i2 < length);
            s4Var.mo65808j(bArr, 0, i3);
        }
    }

    /* renamed from: t */
    public final boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo66611L();
    }
}
