package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

/* renamed from: v4 */
public class C9436v4 extends C9326t4 {

    /* renamed from: e */
    public static final C7119g5 f45214e = new C9437a(C9436v4.class, 13);

    /* renamed from: a */
    public final String f45215a;

    /* renamed from: d */
    public byte[] f45216d;

    /* renamed from: v4$a */
    public static class C9437a extends C7119g5 {
        public C9437a(Class cls, int i) {
            super(cls, i);
        }

        /* renamed from: d */
        public C9326t4 mo51125d(yz0 yz0) {
            return C9436v4.m73054H(yz0.mo65418M(), false);
        }
    }

    public C9436v4(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i] & 255;
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (b & Byte.MAX_VALUE)));
                if ((b & 128) == 0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('.');
                    }
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.f45215a = stringBuffer.toString();
        this.f45216d = z ? C9367tq.m72422f(bArr) : bArr2;
    }

    /* renamed from: H */
    public static C9436v4 m73054H(byte[] bArr, boolean z) {
        return new C9436v4(bArr, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 <= 1) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L_0x0005;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73055N(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L_0x0005:
            r2 = r1
        L_0x0006:
            int r0 = r0 + -1
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L_0x002c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L_0x0022
            if (r2 == 0) goto L_0x0021
            if (r2 <= r4) goto L_0x0005
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L_0x0005
        L_0x0021:
            return r1
        L_0x0022:
            if (r3 > r5) goto L_0x002b
            r3 = 57
            if (r5 > r3) goto L_0x002b
            int r2 = r2 + 1
            goto L_0x0006
        L_0x002b:
            return r1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            if (r2 <= r4) goto L_0x0038
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            return r4
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9436v4.m73055N(java.lang.String, int):boolean");
    }

    /* renamed from: O */
    public static void m73056O(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) (((int) j) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    /* renamed from: Q */
    public static void m73057Q(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    /* renamed from: A */
    public int mo50761A(boolean z) {
        return C9302s4.m71859g(z, mo66401L().length);
    }

    /* renamed from: J */
    public final void mo66400J(ByteArrayOutputStream byteArrayOutputStream) {
        qc4 qc4 = new qc4(this.f45215a);
        while (qc4.mo65439a()) {
            String b = qc4.mo65440b();
            if (b.length() <= 18) {
                m73056O(byteArrayOutputStream, Long.parseLong(b));
            } else {
                m73057Q(byteArrayOutputStream, new BigInteger(b));
            }
        }
    }

    /* renamed from: L */
    public final synchronized byte[] mo66401L() {
        if (this.f45216d == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            mo66400J(byteArrayOutputStream);
            this.f45216d = byteArrayOutputStream.toByteArray();
        }
        return this.f45216d;
    }

    /* renamed from: M */
    public String mo66402M() {
        return this.f45215a;
    }

    public int hashCode() {
        return this.f45215a.hashCode();
    }

    /* renamed from: r */
    public boolean mo50485r(C9326t4 t4Var) {
        if (this == t4Var) {
            return true;
        }
        if (!(t4Var instanceof C9436v4)) {
            return false;
        }
        return this.f45215a.equals(((C9436v4) t4Var).f45215a);
    }

    /* renamed from: s */
    public void mo50767s(C9302s4 s4Var, boolean z) throws IOException {
        s4Var.mo65812o(z, 13, mo66401L());
    }

    /* renamed from: t */
    public boolean mo51124t() {
        return false;
    }

    public String toString() {
        return mo66402M();
    }
}
