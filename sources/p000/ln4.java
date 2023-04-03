package p000;

import android.content.Context;

/* renamed from: ln4 */
/* compiled from: PermissionUtil */
public class ln4 {
    /* renamed from: a */
    public static boolean m75282a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equals : strArr) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m75283b(Context context, String str) {
        if (zr0.m31438a(context, str) == 0) {
            return true;
        }
        return false;
    }
}
