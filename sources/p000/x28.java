package p000;

import android.os.Build;

/* renamed from: x28 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class x28 {
    /* renamed from: a */
    public static boolean m54170a() {
        if (Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T') {
            return true;
        }
        return false;
    }
}
