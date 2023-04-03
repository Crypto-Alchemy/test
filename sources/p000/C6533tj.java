package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: tj */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C6533tj {
    @Deprecated
    /* renamed from: a */
    public static byte[] m52320a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo e = tn7.m52384a(context).mo45811e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m52321b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m52321b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
