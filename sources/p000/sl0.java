package p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: sl0 */
/* compiled from: com.google.mlkit:common@@18.5.0 */
public class sl0 {

    /* renamed from: a */
    public static final lh2 f33930a = new lh2("CommonUtils", "");

    /* renamed from: a */
    public static String m51827a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            f33930a.mo45434c("CommonUtils", "Exception thrown when trying to get app version ".concat(e.toString()));
            return "";
        }
    }
}
