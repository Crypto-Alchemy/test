package p000;

import java.math.BigInteger;

/* renamed from: mx */
/* compiled from: Base36 */
public class C6266mx {
    /* renamed from: a */
    public static String m48524a(byte[] bArr) {
        String bigInteger = new BigInteger(1, bArr).toString(36);
        int b = m48525b(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            sb.append("0");
        }
        sb.append(bigInteger);
        return sb.toString();
    }

    /* renamed from: b */
    public static int m48525b(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != 0) {
                return i;
            }
        }
        return bArr.length;
    }
}
