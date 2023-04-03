package p000;

import java.io.IOException;
import java.math.BigInteger;

/* renamed from: k4 */
public class C7333k4 extends C9326t4 {

    /* renamed from: e */
    public static final C7119g5 f38858e = new C7334a(C7333k4.class, 2);

    /* renamed from: a */
    public final byte[] f38859a;

    /* renamed from: d */
    public final int f38860d;

    /* renamed from: k4$a */
    public static class C7334a extends C7119g5 {
        public C7334a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C7333k4.m59686H(yz0.mo65418M());
        }
    }

    public C7333k4(long j) {
        this.f38859a = BigInteger.valueOf(j).toByteArray();
        this.f38860d = 0;
    }

    public C7333k4(BigInteger bigInteger) {
        this.f38859a = bigInteger.toByteArray();
        this.f38860d = 0;
    }

    public C7333k4(byte[] bArr, boolean z) {
        if (!m59690R(bArr)) {
            this.f38859a = z ? C9367tq.m72422f(bArr) : bArr;
            this.f38860d = m59692U(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }

    /* renamed from: H */
    public static C7333k4 m59686H(byte[] bArr) {
        return new C7333k4(bArr, false);
    }

    /* renamed from: J */
    public static C7333k4 m59687J(C6848b5 b5Var, boolean z) {
        return (C7333k4) f38858e.mo51869e(b5Var, z);
    }

    /* renamed from: L */
    public static C7333k4 m59688L(Object obj) {
        if (obj == null || (obj instanceof C7333k4)) {
            return (C7333k4) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C7333k4) f38858e.mo51868b((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException("encoding error in getInstance: " + e.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    /* renamed from: O */
    public static int m59689O(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 4);
        byte b = i2 & bArr[max];
        while (true) {
            max++;
            if (max >= length) {
                return b;
            }
            b = (b << 8) | (bArr[max] & 255);
        }
    }

    /* renamed from: R */
    public static boolean m59690R(byte[] bArr) {
        int length = bArr.length;
        if (length == 0) {
            return true;
        }
        if (length != 1) {
            return bArr[0] == (bArr[1] >> 7) && !bx4.m56192b("org.bouncycastle.asn1.allow_unsafe_integer");
        }
        return false;
    }

    /* renamed from: S */
    public static long m59691S(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int max = Math.max(i, length - 8);
        long j = (long) (i2 & bArr[max]);
        while (true) {
            max++;
            if (max >= length) {
                return j;
            }
            j = (j << 8) | ((long) (bArr[max] & 255));
        }
    }

    /* renamed from: U */
    public static int m59692U(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, this.f38859a.length);
    }

    /* renamed from: M */
    public BigInteger mo52858M() {
        return new BigInteger(this.f38859a);
    }

    /* renamed from: N */
    public boolean mo52859N(int i) {
        byte[] bArr = this.f38859a;
        int length = bArr.length;
        int i2 = this.f38860d;
        return length - i2 <= 4 && m59689O(bArr, i2, -1) == i;
    }

    /* renamed from: Q */
    public int mo52860Q() {
        byte[] bArr = this.f38859a;
        int length = bArr.length;
        int i = this.f38860d;
        if (length - i <= 4) {
            return m59689O(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    /* renamed from: T */
    public long mo52861T() {
        byte[] bArr = this.f38859a;
        int length = bArr.length;
        int i = this.f38860d;
        if (length - i <= 8) {
            return m59691S(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of long range");
    }

    public int hashCode() {
        return C9367tq.m72437u(this.f38859a);
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (!(t4Var instanceof C7333k4)) {
            return false;
        }
        return C9367tq.m72417a(this.f38859a, ((C7333k4) t4Var).f38859a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 2, this.f38859a);
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo52858M().toString();
    }
}
