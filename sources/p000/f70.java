package p000;

import java.util.Arrays;

/* renamed from: f70 */
/* compiled from: Bytes */
public class f70 {
    private f70() {
    }

    public static byte[] trimLeadingBytes(byte[] bArr, byte b) {
        int i = 0;
        while (i < bArr.length - 1 && bArr[i] == b) {
            i++;
        }
        return Arrays.copyOfRange(bArr, i, bArr.length);
    }

    public static byte[] trimLeadingZeroes(byte[] bArr) {
        return trimLeadingBytes(bArr, (byte) 0);
    }
}
