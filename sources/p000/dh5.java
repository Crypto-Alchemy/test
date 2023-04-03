package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: dh5 */
/* compiled from: RlpEncoder */
public class dh5 {
    private static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length + bArr2.length);
        System.arraycopy(bArr2, 0, copyOf, bArr.length, bArr2.length);
        return copyOf;
    }

    public static byte[] encode(gh5 gh5) {
        if (gh5 instanceof fh5) {
            return encodeString((fh5) gh5);
        }
        return encodeList((eh5) gh5);
    }

    public static byte[] encodeList(eh5 eh5) {
        List<gh5> values = eh5.getValues();
        if (values.isEmpty()) {
            return encode(new byte[0], ch5.OFFSET_SHORT_LIST);
        }
        byte[] bArr = new byte[0];
        for (gh5 encode : values) {
            bArr = concat(bArr, encode(encode));
        }
        return encode(bArr, ch5.OFFSET_SHORT_LIST);
    }

    public static byte[] encodeString(fh5 fh5) {
        return encode(fh5.getBytes(), ch5.OFFSET_SHORT_STRING);
    }

    private static byte[] toByteArray(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    private static byte[] toMinimalByteArray(int i) {
        byte[] byteArray = toByteArray(i);
        for (int i2 = 0; i2 < byteArray.length; i2++) {
            if (byteArray[i2] != 0) {
                return Arrays.copyOfRange(byteArray, i2, byteArray.length);
            }
        }
        return new byte[0];
    }

    private static byte[] encode(byte[] bArr, int i) {
        byte b;
        if (bArr.length == 1 && i == ch5.OFFSET_SHORT_STRING && (b = bArr[0]) >= 0 && b <= Byte.MAX_VALUE) {
            return bArr;
        }
        if (bArr.length <= 55) {
            byte[] bArr2 = new byte[(bArr.length + 1)];
            bArr2[0] = (byte) (i + bArr.length);
            System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
            return bArr2;
        }
        byte[] minimalByteArray = toMinimalByteArray(bArr.length);
        byte[] bArr3 = new byte[(bArr.length + minimalByteArray.length + 1)];
        bArr3[0] = (byte) (i + 55 + minimalByteArray.length);
        System.arraycopy(minimalByteArray, 0, bArr3, 1, minimalByteArray.length);
        System.arraycopy(bArr, 0, bArr3, minimalByteArray.length + 1, bArr.length);
        return bArr3;
    }
}
