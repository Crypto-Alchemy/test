package p000;

import java.math.BigInteger;
import p000.nm1;
import p000.ul1;

/* renamed from: ar6 */
public class ar6 {

    /* renamed from: a */
    public static final BigInteger f36546a;

    /* renamed from: b */
    public static final BigInteger f36547b = tl1.f44773c.negate();

    /* renamed from: c */
    public static final BigInteger f36548c;

    /* renamed from: d */
    public static final np7[] f36549d;

    /* renamed from: e */
    public static final byte[][] f36550e = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};

    /* renamed from: f */
    public static final np7[] f36551f;

    /* renamed from: g */
    public static final byte[][] f36552g = {null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};

    static {
        BigInteger bigInteger = tl1.f44772b;
        BigInteger negate = bigInteger.negate();
        f36546a = negate;
        BigInteger negate2 = tl1.f44774d.negate();
        f36548c = negate2;
        BigInteger bigInteger2 = tl1.f44771a;
        f36549d = new np7[]{null, new np7(bigInteger, bigInteger2), null, new np7(negate2, negate), null, new np7(negate, negate), null, new np7(bigInteger, negate), null};
        f36551f = new np7[]{null, new np7(bigInteger, bigInteger2), null, new np7(negate2, bigInteger), null, new np7(negate, bigInteger), null, new np7(bigInteger, bigInteger), null};
    }

    /* renamed from: a */
    public static a26 m55655a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        int i3 = ((i + 5) / 2) + i2;
        BigInteger multiply = bigInteger2.multiply(bigInteger.shiftRight(((i - i3) - 2) + b));
        BigInteger add = multiply.add(bigInteger3.multiply(multiply.shiftRight(i)));
        int i4 = i3 - i2;
        BigInteger shiftRight = add.shiftRight(i4);
        if (add.testBit(i4 - 1)) {
            shiftRight = shiftRight.add(tl1.f44772b);
        }
        return new a26(shiftRight, i2);
    }

    /* renamed from: b */
    public static BigInteger[] m55656b(byte b, int i, boolean z) {
        BigInteger bigInteger;
        BigInteger bigInteger2;
        if (b == 1 || b == -1) {
            if (z) {
                bigInteger = tl1.f44773c;
                bigInteger2 = BigInteger.valueOf((long) b);
            } else {
                bigInteger = tl1.f44771a;
                bigInteger2 = tl1.f44772b;
            }
            int i2 = 1;
            while (i2 < i) {
                i2++;
                BigInteger bigInteger3 = bigInteger2;
                bigInteger2 = (b == 1 ? bigInteger2 : bigInteger2.negate()).subtract(bigInteger.shiftLeft(1));
                bigInteger = bigInteger3;
            }
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        throw new IllegalArgumentException("mu must be 1 or -1");
    }

    /* renamed from: c */
    public static byte m55657c(int i) {
        return (byte) (i == 0 ? -1 : 1);
    }

    /* renamed from: d */
    public static nm1.C8993b[] m55658d(nm1.C8993b bVar, byte b) {
        byte[][] bArr = b == 0 ? f36550e : f36552g;
        nm1.C8993b[] bVarArr = new nm1.C8993b[((bArr.length + 1) >>> 1)];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            bVarArr[i >>> 1] = m55662h(bVar, bArr[i]);
        }
        bVar.mo62740i().mo66325y(bVarArr);
        return bVarArr;
    }

    /* renamed from: e */
    public static int m55659e(BigInteger bigInteger) {
        if (bigInteger != null) {
            if (bigInteger.equals(tl1.f44773c)) {
                return 1;
            }
            if (bigInteger.equals(tl1.f44775e)) {
                return 2;
            }
        }
        throw new IllegalArgumentException("h (Cofactor) must be 2 or 4");
    }

    /* renamed from: f */
    public static BigInteger[] m55660f(ul1.C9406b bVar) {
        if (bVar.mo50699H()) {
            int t = bVar.mo50667t();
            int intValue = bVar.mo66316n().mo50994t().intValue();
            byte c = m55657c(intValue);
            int e = m55659e(bVar.mo66318p());
            BigInteger[] b = m55656b(c, (t + 3) - intValue, false);
            if (c == 1) {
                b[0] = b[0].negate();
                b[1] = b[1].negate();
            }
            BigInteger bigInteger = tl1.f44772b;
            return new BigInteger[]{bigInteger.add(b[1]).shiftRight(e), bigInteger.add(b[0]).shiftRight(e).negate()};
        }
        throw new IllegalArgumentException("si is defined for Koblitz curves only");
    }

    /* renamed from: g */
    public static BigInteger m55661g(byte b, int i) {
        if (i == 4) {
            return b == 1 ? BigInteger.valueOf(6) : BigInteger.valueOf(10);
        }
        BigInteger[] b2 = m55656b(b, i, false);
        BigInteger bit = tl1.f44771a.setBit(i);
        return tl1.f44773c.multiply(b2[0]).multiply(b2[1].modInverse(bit)).mod(bit);
    }

    /* renamed from: h */
    public static nm1.C8993b m55662h(nm1.C8993b bVar, byte[] bArr) {
        nm1.C8993b bVar2 = (nm1.C8993b) bVar.mo62740i().mo50668u();
        nm1.C8993b bVar3 = (nm1.C8993b) bVar.mo50278z();
        int i = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i++;
            byte b = bArr[length];
            if (b != 0) {
                bVar2 = (nm1.C8993b) bVar2.mo62756L(i).mo50276a(b > 0 ? bVar : bVar3);
                i = 0;
            }
        }
        return i > 0 ? bVar2.mo62756L(i) : bVar2;
    }

    /* renamed from: i */
    public static BigInteger m55663i(byte b, np7 np7) {
        BigInteger subtract;
        BigInteger bigInteger = np7.f43535a;
        BigInteger multiply = bigInteger.multiply(bigInteger);
        BigInteger multiply2 = np7.f43535a.multiply(np7.f43536b);
        BigInteger bigInteger2 = np7.f43536b;
        BigInteger shiftLeft = bigInteger2.multiply(bigInteger2).shiftLeft(1);
        if (b == 1) {
            subtract = multiply.add(multiply2);
        } else if (b == -1) {
            subtract = multiply.subtract(multiply2);
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
        return subtract.add(shiftLeft);
    }

    /* renamed from: j */
    public static np7 m55664j(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        byte b4 = b2;
        BigInteger add = b4 == 1 ? bigIntegerArr[0].add(bigIntegerArr[1]) : bigIntegerArr[0].subtract(bigIntegerArr[1]);
        int i2 = i;
        BigInteger bigInteger2 = bigInteger;
        BigInteger bigInteger3 = m55656b(b4, i, true)[1];
        byte b5 = b;
        int i3 = i;
        byte b6 = b3;
        np7 k = m55665k(m55655a(bigInteger2, bigIntegerArr[0], bigInteger3, b5, i3, b6), m55655a(bigInteger2, bigIntegerArr[1], bigInteger3, b5, i3, b6), b4);
        BigInteger bigInteger4 = bigInteger;
        return new np7(bigInteger.subtract(add.multiply(k.f43535a)).subtract(BigInteger.valueOf(2).multiply(bigIntegerArr[1]).multiply(k.f43536b)), bigIntegerArr[1].multiply(k.f43535a).subtract(bigIntegerArr[0].multiply(k.f43536b)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5.mo50057d(f36546a) < 0) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (r5.mo50057d(r9) >= 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r8.mo50057d(f36547b) < 0) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.np7 m55665k(p000.a26 r8, p000.a26 r9, byte r10) {
        /*
            int r0 = r8.mo50060f()
            int r1 = r9.mo50060f()
            if (r1 != r0) goto L_0x00a7
            r0 = -1
            r1 = 1
            if (r10 == r1) goto L_0x0019
            if (r10 != r0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "mu must be 1 or -1"
            r8.<init>(r9)
            throw r8
        L_0x0019:
            java.math.BigInteger r2 = r8.mo50062h()
            java.math.BigInteger r3 = r9.mo50062h()
            a26 r8 = r8.mo50065j(r2)
            a26 r9 = r9.mo50065j(r3)
            a26 r4 = r8.mo50054a(r8)
            if (r10 != r1) goto L_0x0034
            a26 r4 = r4.mo50054a(r9)
            goto L_0x0038
        L_0x0034:
            a26 r4 = r4.mo50064i(r9)
        L_0x0038:
            a26 r5 = r9.mo50054a(r9)
            a26 r5 = r5.mo50054a(r9)
            a26 r9 = r5.mo50054a(r9)
            if (r10 != r1) goto L_0x004f
            a26 r5 = r8.mo50064i(r5)
            a26 r8 = r8.mo50054a(r9)
            goto L_0x0057
        L_0x004f:
            a26 r5 = r8.mo50054a(r5)
            a26 r8 = r8.mo50064i(r9)
        L_0x0057:
            java.math.BigInteger r9 = p000.tl1.f44772b
            int r6 = r4.mo50057d(r9)
            r7 = 0
            if (r6 < 0) goto L_0x0069
            java.math.BigInteger r6 = f36546a
            int r6 = r5.mo50057d(r6)
            if (r6 >= 0) goto L_0x0075
            goto L_0x0071
        L_0x0069:
            java.math.BigInteger r1 = p000.tl1.f44773c
            int r1 = r8.mo50057d(r1)
            if (r1 < 0) goto L_0x0074
        L_0x0071:
            r1 = r7
            r7 = r10
            goto L_0x0075
        L_0x0074:
            r1 = r7
        L_0x0075:
            java.math.BigInteger r6 = f36546a
            int r4 = r4.mo50057d(r6)
            if (r4 >= 0) goto L_0x0084
            int r8 = r5.mo50057d(r9)
            if (r8 < 0) goto L_0x008f
            goto L_0x008c
        L_0x0084:
            java.math.BigInteger r9 = f36547b
            int r8 = r8.mo50057d(r9)
            if (r8 >= 0) goto L_0x008e
        L_0x008c:
            int r8 = -r10
            byte r7 = (byte) r8
        L_0x008e:
            r0 = r1
        L_0x008f:
            long r8 = (long) r0
            java.math.BigInteger r8 = java.math.BigInteger.valueOf(r8)
            java.math.BigInteger r8 = r2.add(r8)
            long r9 = (long) r7
            java.math.BigInteger r9 = java.math.BigInteger.valueOf(r9)
            java.math.BigInteger r9 = r3.add(r9)
            np7 r10 = new np7
            r10.<init>(r8, r9)
            return r10
        L_0x00a7:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "lambda0 and lambda1 do not have same scale"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ar6.m55665k(a26, a26, byte):np7");
    }

    /* renamed from: l */
    public static byte[] m55666l(byte b, np7 np7, byte b2, BigInteger bigInteger, BigInteger bigInteger2, np7[] np7Arr) {
        boolean z;
        if (b == 1 || b == -1) {
            int bitLength = m55663i(b, np7).bitLength();
            byte[] bArr = new byte[(bitLength > 30 ? bitLength + 4 + b2 : b2 + 34)];
            BigInteger shiftRight = bigInteger.shiftRight(1);
            BigInteger bigInteger3 = np7.f43535a;
            BigInteger bigInteger4 = np7.f43536b;
            int i = 0;
            while (true) {
                BigInteger bigInteger5 = tl1.f44771a;
                if (bigInteger3.equals(bigInteger5) && bigInteger4.equals(bigInteger5)) {
                    return bArr;
                }
                if (bigInteger3.testBit(0)) {
                    BigInteger mod = bigInteger3.add(bigInteger4.multiply(bigInteger2)).mod(bigInteger);
                    if (mod.compareTo(shiftRight) >= 0) {
                        mod = mod.subtract(bigInteger);
                    }
                    byte intValue = (byte) mod.intValue();
                    bArr[i] = intValue;
                    if (intValue < 0) {
                        intValue = (byte) (-intValue);
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        bigInteger3 = bigInteger3.subtract(np7Arr[intValue].f43535a);
                        bigInteger4 = bigInteger4.subtract(np7Arr[intValue].f43536b);
                    } else {
                        bigInteger3 = bigInteger3.add(np7Arr[intValue].f43535a);
                        bigInteger4 = bigInteger4.add(np7Arr[intValue].f43536b);
                    }
                } else {
                    bArr[i] = 0;
                }
                BigInteger shiftRight2 = bigInteger3.shiftRight(1);
                BigInteger add = b == 1 ? bigInteger4.add(shiftRight2) : bigInteger4.subtract(shiftRight2);
                i++;
                BigInteger negate = bigInteger3.shiftRight(1).negate();
                bigInteger3 = add;
                bigInteger4 = negate;
            }
        } else {
            throw new IllegalArgumentException("mu must be 1 or -1");
        }
    }
}
