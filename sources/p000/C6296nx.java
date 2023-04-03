package p000;

import java.util.Arrays;

/* renamed from: nx */
/* compiled from: Base58 */
public class C6296nx {

    /* renamed from: a */
    public static final char[] f32207a;

    /* renamed from: b */
    public static final char f32208b;

    /* renamed from: c */
    public static final int[] f32209c;

    static {
        char[] charArray = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();
        f32207a = charArray;
        int i = 0;
        f32208b = charArray[0];
        int[] iArr = new int[128];
        f32209c = iArr;
        Arrays.fill(iArr, -1);
        while (true) {
            char[] cArr = f32207a;
            if (i < cArr.length) {
                f32209c[cArr[i]] = i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static byte[] m49063a(String str) {
        int i;
        int i2 = 0;
        if (str.length() == 0) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        int i3 = 0;
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                i = f32209c[charAt];
            } else {
                i = -1;
            }
            if (i >= 0) {
                bArr[i3] = (byte) i;
                i3++;
            } else {
                throw new IllegalStateException("InvalidCharacter in base 58");
            }
        }
        while (i2 < length && bArr[i2] == 0) {
            i2++;
        }
        int length2 = str.length();
        byte[] bArr2 = new byte[length2];
        int i4 = length2;
        int i5 = i2;
        while (i5 < length) {
            i4--;
            bArr2[i4] = m49064b(bArr, i5, 58, 256);
            if (bArr[i5] == 0) {
                i5++;
            }
        }
        while (i4 < length2 && bArr2[i4] == 0) {
            i4++;
        }
        return Arrays.copyOfRange(bArr2, i4 - i2, length2);
    }

    /* renamed from: b */
    public static byte m49064b(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < bArr.length) {
            int i5 = (i4 * i2) + (bArr[i] & 255);
            bArr[i] = (byte) (i5 / i3);
            i4 = i5 % i3;
            i++;
        }
        return (byte) i4;
    }

    /* renamed from: c */
    public static String m49065c(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        int length = copyOf.length * 2;
        char[] cArr = new char[length];
        int i2 = i;
        int i3 = length;
        while (i2 < copyOf.length) {
            i3--;
            cArr[i3] = f32207a[m49064b(copyOf, i2, 256, 58)];
            if (copyOf[i2] == 0) {
                i2++;
            }
        }
        while (i3 < length && cArr[i3] == f32208b) {
            i3++;
        }
        while (true) {
            i--;
            if (i < 0) {
                return new String(cArr, i3, length - i3);
            }
            i3--;
            cArr[i3] = f32208b;
        }
    }
}
