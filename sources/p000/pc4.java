package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.exceptions.MessageDecodingException;
import org.web3j.exceptions.MessageEncodingException;

/* renamed from: pc4 */
/* compiled from: Numeric */
public final class pc4 {
    private static final char[] HEX_CHAR_MAP = "0123456789abcdef".toCharArray();
    private static final String HEX_PREFIX = "0x";

    private pc4() {
    }

    public static byte asByte(int i, int i2) {
        return (byte) ((i << 4) | i2);
    }

    public static String cleanHexPrefix(String str) {
        if (containsHexPrefix(str)) {
            return str.substring(2);
        }
        return str;
    }

    public static boolean containsHexPrefix(String str) {
        if (pb6.isEmpty(str) || str.length() <= 1 || str.charAt(0) != '0' || str.charAt(1) != 'x') {
            return false;
        }
        return true;
    }

    public static BigInteger decodeQuantity(String str) {
        if (isLongValue(str)) {
            return BigInteger.valueOf(Long.parseLong(str));
        }
        if (isValidHexQuantity(str)) {
            try {
                return parsePaddedNumberHex(str);
            } catch (NumberFormatException e) {
                throw new MessageDecodingException("Negative ", e);
            }
        } else {
            throw new MessageDecodingException("Value must be in format 0x[1-9]+[0-9]* or 0x0");
        }
    }

    public static String encodeQuantity(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return HEX_PREFIX + bigInteger.toString(16);
        }
        throw new MessageEncodingException("Negative values are not supported");
    }

    public static byte[] hexStringToByteArray(String str) {
        byte[] bArr;
        String cleanHexPrefix = cleanHexPrefix(str);
        int length = cleanHexPrefix.length();
        int i = 0;
        if (length == 0) {
            return new byte[0];
        }
        if (length % 2 != 0) {
            bArr = new byte[((length / 2) + 1)];
            bArr[0] = (byte) Character.digit(cleanHexPrefix.charAt(0), 16);
            i = 1;
        } else {
            bArr = new byte[(length / 2)];
        }
        while (i < length) {
            int i2 = i + 1;
            bArr[i2 / 2] = (byte) ((Character.digit(cleanHexPrefix.charAt(i), 16) << 4) + Character.digit(cleanHexPrefix.charAt(i2), 16));
            i += 2;
        }
        return bArr;
    }

    public static boolean isIntegerValue(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0 || bigDecimal.scale() <= 0 || bigDecimal.stripTrailingZeros().scale() <= 0) {
            return true;
        }
        return false;
    }

    private static boolean isLongValue(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean isValidHexQuantity(String str) {
        if (str != null && str.length() >= 3 && str.startsWith(HEX_PREFIX)) {
            return str.matches("0[xX][0-9a-fA-F]+");
        }
        return false;
    }

    public static BigInteger parsePaddedNumberHex(String str) {
        return new BigInteger(cleanHexPrefix(str).replaceFirst("^0+(?!$)", ""), 16);
    }

    public static String prependHexPrefix(String str) {
        if (containsHexPrefix(str)) {
            return str;
        }
        return HEX_PREFIX + str;
    }

    public static String removeDoubleQuotes(String str) {
        if (str != null) {
            return str.replace("\"", "");
        }
        return null;
    }

    public static BigInteger toBigInt(byte[] bArr, int i, int i2) {
        return toBigInt(Arrays.copyOfRange(bArr, i, i2 + i));
    }

    public static BigInteger toBigIntNoPrefix(String str) {
        return new BigInteger(str, 16);
    }

    public static byte[] toBytesPadded(BigInteger bigInteger, int i) {
        int i2;
        byte[] bArr = new byte[i];
        byte[] byteArray = bigInteger.toByteArray();
        int i3 = 1;
        if (byteArray[0] == 0) {
            i2 = byteArray.length - 1;
        } else {
            i3 = 0;
            i2 = byteArray.length;
        }
        if (i2 <= i) {
            System.arraycopy(byteArray, i3, bArr, i - i2, i2);
            return bArr;
        }
        throw new RuntimeException("Input is too large to put in byte array of size " + i);
    }

    private static char[] toHexCharArray(byte[] bArr, int i, int i2, boolean z) {
        char[] cArr = new char[(i2 << 1)];
        int i3 = 0;
        while (i < i2) {
            byte b = bArr[i] & 255;
            int i4 = i3 + 1;
            char[] cArr2 = HEX_CHAR_MAP;
            cArr[i3] = cArr2[b >>> 4];
            cArr[i4] = cArr2[b & 15];
            i++;
            i3 = i4 + 1;
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr, int i, int i2, boolean z) {
        String str = new String(toHexCharArray(bArr, i, i2, z));
        if (!z) {
            return str;
        }
        return HEX_PREFIX + str;
    }

    public static String toHexStringNoPrefix(BigInteger bigInteger) {
        return bigInteger.toString(16);
    }

    public static String toHexStringNoPrefixZeroPadded(BigInteger bigInteger, int i) {
        return toHexStringZeroPadded(bigInteger, i, false);
    }

    public static String toHexStringWithPrefix(BigInteger bigInteger) {
        return HEX_PREFIX + bigInteger.toString(16);
    }

    @Deprecated
    public static String toHexStringWithPrefixSafe(BigInteger bigInteger) {
        String hexStringNoPrefix = toHexStringNoPrefix(bigInteger);
        if (hexStringNoPrefix.length() < 2) {
            hexStringNoPrefix = pb6.zeros(1) + hexStringNoPrefix;
        }
        return HEX_PREFIX + hexStringNoPrefix;
    }

    public static String toHexStringWithPrefixZeroPadded(BigInteger bigInteger, int i) {
        return toHexStringZeroPadded(bigInteger, i, true);
    }

    private static String toHexStringZeroPadded(BigInteger bigInteger, int i, boolean z) {
        String hexStringNoPrefix = toHexStringNoPrefix(bigInteger);
        int length = hexStringNoPrefix.length();
        if (length > i) {
            throw new UnsupportedOperationException("Value " + hexStringNoPrefix + "is larger then length " + i);
        } else if (bigInteger.signum() >= 0) {
            if (length < i) {
                hexStringNoPrefix = pb6.zeros(i - length) + hexStringNoPrefix;
            }
            if (!z) {
                return hexStringNoPrefix;
            }
            return HEX_PREFIX + hexStringNoPrefix;
        } else {
            throw new UnsupportedOperationException("Value cannot be negative");
        }
    }

    public static BigInteger toBigInt(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static String toHexStringNoPrefix(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length, false);
    }

    public static BigInteger toBigInt(String str) {
        return toBigIntNoPrefix(cleanHexPrefix(str));
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length, true);
    }
}
