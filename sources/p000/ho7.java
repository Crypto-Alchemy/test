package p000;

import java.math.BigInteger;

/* renamed from: ho7 */
public class ho7 {
    /* renamed from: a */
    public int mo52293a(ul1 ul1) {
        return (ul1.mo50667t() + 7) / 8;
    }

    /* renamed from: b */
    public int mo52294b(zl1 zl1) {
        return (zl1.mo50979f() + 7) / 8;
    }

    /* renamed from: c */
    public byte[] mo52295c(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        } else if (i <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return bArr2;
        }
    }
}
