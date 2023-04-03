package p000;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: cu7 */
public final class cu7 {

    /* renamed from: a */
    public static aq7 f27952a;

    /* renamed from: a */
    public static String m43229a(List<File> list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        for (File fileInputStream : list) {
            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
            do {
                try {
                    read = fileInputStream2.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    mt7.m48481a(th, th);
                }
            } while (read != -1);
            fileInputStream2.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }

    /* renamed from: b */
    public static long m43230b(byte[] bArr, int i) {
        return ((long) ((m43231c(bArr, i + 2) << 16) | m43231c(bArr, i))) & 4294967295L;
    }

    /* renamed from: c */
    public static int m43231c(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: d */
    public static boolean m43232d(int i) {
        return i == 1 || i == 7 || i == 2 || i == 3;
    }

    /* renamed from: e */
    public static boolean m43233e(int i) {
        return i == 5 || i == 6 || i == 4;
    }

    /* renamed from: f */
    public static boolean m43234f(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: g */
    public static boolean m43235g(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6 && i2 != 6 && i2 != 5) {
            return true;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: h */
    public static synchronized aq7 m43236h(Context context) {
        aq7 aq7;
        synchronized (cu7.class) {
            if (f27952a == null) {
                ks7 ks7 = new ks7((byte[]) null);
                ks7.mo45277b(new aw7(lw7.m47962c(context)));
                f27952a = ks7.mo45276a();
            }
            aq7 = f27952a;
        }
        return aq7;
    }
}
