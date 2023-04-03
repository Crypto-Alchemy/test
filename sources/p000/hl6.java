package p000;

import androidx.media3.common.PlaybackException;
import java.lang.reflect.UndeclaredThrowableException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: hl6 */
/* compiled from: TOTP */
public final class hl6 {
    /* renamed from: a */
    public static String m58570a(long j, String str) {
        String upperCase = Long.toHexString(j).toUpperCase();
        while (upperCase.length() < 16) {
            upperCase = "0" + upperCase;
        }
        byte[] e = m58574e(m58573d(str), m58573d(upperCase));
        byte b = e[e.length - 1] & 15;
        String num = Integer.toString(((e[b + 3] & 255) | ((((e[b] & Byte.MAX_VALUE) << 24) | ((e[b + 1] & 255) << 16)) | ((e[b + 2] & 255) << 8))) % PlaybackException.CUSTOM_ERROR_CODE_BASE);
        while (num.length() < 6) {
            num = "0" + num;
        }
        return num;
    }

    /* renamed from: b */
    public static String m58571b(String str) {
        return m58570a(m58572c(), ol0.m70356e0(C7810kx.m63632a(str), false));
    }

    /* renamed from: c */
    public static long m58572c() {
        return System.currentTimeMillis() / 30000;
    }

    /* renamed from: d */
    public static byte[] m58573d(String str) {
        byte[] byteArray = new BigInteger("10" + str, 16).toByteArray();
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    /* renamed from: e */
    public static byte[] m58574e(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(new SecretKeySpec(bArr, "RAW"));
            return instance.doFinal(bArr2);
        } catch (GeneralSecurityException e) {
            throw new UndeclaredThrowableException(e);
        }
    }
}
