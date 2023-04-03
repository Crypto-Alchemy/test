package p000;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: i10 */
public final class i10 {

    /* renamed from: a */
    public static final BigInteger f38310a = BigInteger.valueOf(0);

    /* renamed from: b */
    public static final BigInteger f38311b = BigInteger.valueOf(1);

    /* renamed from: c */
    public static final BigInteger f38312c = BigInteger.valueOf(2);

    /* renamed from: d */
    public static final BigInteger f38313d = BigInteger.valueOf(3);

    /* renamed from: e */
    public static final BigInteger f38314e = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* renamed from: f */
    public static final int f38315f = BigInteger.valueOf(743).bitLength();

    /* renamed from: a */
    public static byte[] m58761a(int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length <= i) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, i2, bArr, i - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    /* renamed from: b */
    public static byte[] m58762b(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m58763c(int i, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i >= 1) {
            int i2 = (i + 7) / 8;
            byte[] bArr = new byte[i2];
            secureRandom.nextBytes(bArr);
            bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
            return bArr;
        }
        throw new IllegalArgumentException("bitLength must be at least 1");
    }

    /* renamed from: d */
    public static BigInteger m58764d(int i, SecureRandom secureRandom) {
        return new BigInteger(1, m58763c(i, secureRandom));
    }

    /* renamed from: e */
    public static BigInteger m58765e(byte[] bArr, int i, int i2) {
        if (!(i == 0 && i2 == bArr.length)) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: f */
    public static int m58766f(BigInteger bigInteger) {
        if (bigInteger.equals(f38310a)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    /* renamed from: g */
    public static BigInteger m58767g(BigInteger bigInteger, BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("'M' must be odd");
        } else if (bigInteger.signum() == 1) {
            if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
                bigInteger2 = bigInteger2.mod(bigInteger);
            }
            int bitLength = bigInteger.bitLength();
            int[] q = p34.m70893q(bitLength, bigInteger);
            int[] q2 = p34.m70893q(bitLength, bigInteger2);
            int length = q.length;
            int[] j = p34.m70886j(length);
            if (hw3.m58717k(q, q2, j) != 0) {
                return p34.m70874R(length, j);
            }
            throw new ArithmeticException("BigInteger not invertible.");
        } else {
            throw new ArithmeticException("BigInteger: modulus not positive");
        }
    }
}
