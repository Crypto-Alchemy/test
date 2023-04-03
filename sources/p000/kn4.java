package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Process;

/* renamed from: kn4 */
/* compiled from: PermissionChecker */
public final class kn4 {
    /* renamed from: a */
    public static int m20928a(Context context, String str) {
        String str2;
        if (Binder.getCallingPid() == Process.myPid()) {
            str2 = context.getPackageName();
        } else {
            str2 = null;
        }
        return m20929b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: b */
    public static int m20929b(Context context, String str, int i, int i2, String str2) {
        boolean z;
        int i3;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String c = C2185do.m15237c(str);
        if (c == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid != i2 || !mf4.m22283a(packageName, str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i3 = C2185do.m15235a(context, i2, c, str2);
        } else {
            i3 = C2185do.m15236b(context, c, str2);
        }
        if (i3 == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: c */
    public static int m20930c(Context context, String str) {
        return m20929b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
