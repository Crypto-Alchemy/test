package p000;

import android.util.Base64;

/* renamed from: ux */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6585ux {
    /* renamed from: a */
    public static String m53029a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    /* renamed from: b */
    public static String m53030b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    /* renamed from: c */
    public static String m53031c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
