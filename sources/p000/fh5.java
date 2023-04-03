package p000;

import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: fh5 */
/* compiled from: RlpString */
public class fh5 implements gh5 {
    private static final byte[] EMPTY = new byte[0];
    private final byte[] value;

    private fh5(byte[] bArr) {
        this.value = bArr;
    }

    public static fh5 create(byte[] bArr) {
        return new fh5(bArr);
    }

    public BigInteger asPositiveBigInteger() {
        if (this.value.length == 0) {
            return BigInteger.ZERO;
        }
        return new BigInteger(1, this.value);
    }

    public String asString() {
        return pc4.toHexString(this.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.value, ((fh5) obj).value);
    }

    public byte[] getBytes() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(this.value);
    }

    public static fh5 create(byte b) {
        return new fh5(new byte[]{b});
    }

    public static fh5 create(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 1) {
            return new fh5(EMPTY);
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] == 0) {
            return new fh5(Arrays.copyOfRange(byteArray, 1, byteArray.length));
        }
        return new fh5(byteArray);
    }

    public static fh5 create(long j) {
        return create(BigInteger.valueOf(j));
    }

    public static fh5 create(String str) {
        return new fh5(str.getBytes());
    }
}
