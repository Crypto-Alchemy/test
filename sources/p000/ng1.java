package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: ng1 */
/* compiled from: DigestUtils */
public class ng1 {
    /* renamed from: a */
    public static byte[] m48764a(String str, String str2) {
        if (!kb6.m46949b(str) || !kb6.m46949b(str2)) {
            return new byte[0];
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(str2.getBytes());
            return instance.digest();
        } catch (NoSuchAlgorithmException unused) {
            return new byte[0];
        }
    }

    /* renamed from: b */
    public static String m48765b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", new Object[]{Integer.valueOf(b & 255)}));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m48766c(String str) {
        if (kb6.m46949b(str)) {
            return m48765b(m48764a("SHA-1", str));
        }
        return "";
    }
}
