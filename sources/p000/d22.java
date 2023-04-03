package p000;

import java.math.BigInteger;

/* renamed from: d22 */
public abstract class d22 {

    /* renamed from: a */
    public static final c22 f37227a = new yu4(BigInteger.valueOf(2));

    /* renamed from: b */
    public static final c22 f37228b = new yu4(BigInteger.valueOf(3));

    /* renamed from: a */
    public static es4 m56620a(int[] iArr) {
        if (iArr[0] == 0) {
            int i = 1;
            while (i < iArr.length) {
                if (iArr[i] > iArr[i - 1]) {
                    i++;
                } else {
                    throw new IllegalArgumentException("Polynomial exponents must be monotonically increasing");
                }
            }
            return new kf2(f37227a, new ne2(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    /* renamed from: b */
    public static c22 m56621b(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return f37227a;
            }
            if (intValue == 3) {
                return f37228b;
            }
        }
        return new yu4(bigInteger);
    }
}
