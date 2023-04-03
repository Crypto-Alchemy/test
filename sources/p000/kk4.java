package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: kk4 */
/* compiled from: PackageManagerHelper */
public class kk4 {

    /* renamed from: a */
    public static final String f14140a = qk3.m25728f("PackageManagerHelper");

    /* renamed from: a */
    public static void m20801a(Context context, Class<?> cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            qk3 c = qk3.m25726c();
            String str3 = f14140a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.mo25135a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            qk3 c2 = qk3.m25726c();
            String str4 = f14140a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.mo25135a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
