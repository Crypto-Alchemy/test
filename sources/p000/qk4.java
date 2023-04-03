package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: qk4 */
/* compiled from: PackageUtils */
public class qk4 {

    /* renamed from: qk4$a */
    /* compiled from: PackageUtils */
    public static class C3152a {
        /* renamed from: a */
        public static boolean m25740a(PackageManager packageManager) {
            return packageManager.hasSystemFeature("android.hardware.fingerprint");
        }
    }

    /* renamed from: a */
    public static boolean m25739a(Context context) {
        if (context == null || context.getPackageManager() == null || !C3152a.m25740a(context.getPackageManager())) {
            return false;
        }
        return true;
    }
}
