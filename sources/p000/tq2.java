package p000;

import java.io.UnsupportedEncodingException;

/* renamed from: tq2 */
/* compiled from: ImageFormatCheckerUtils */
public class tq2 {
    /* renamed from: a */
    public static byte[] m27882a(String str) {
        au4.m10792g(str);
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    /* renamed from: b */
    public static boolean m27883b(byte[] bArr, byte[] bArr2, int i) {
        au4.m10792g(bArr);
        au4.m10792g(bArr2);
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m27884c(byte[] bArr, byte[] bArr2) {
        return m27883b(bArr, bArr2, 0);
    }
}
