package p000;

import android.content.Context;

/* renamed from: wv2 */
/* compiled from: InstallerPackageNameProvider */
public class wv2 {

    /* renamed from: a */
    public String f35446a;

    /* renamed from: b */
    public static String m54075b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName == null) {
            return "";
        }
        return installerPackageName;
    }

    /* renamed from: a */
    public synchronized String mo49284a(Context context) {
        String str;
        if (this.f35446a == null) {
            this.f35446a = m54075b(context);
        }
        if ("".equals(this.f35446a)) {
            str = null;
        } else {
            str = this.f35446a;
        }
        return str;
    }
}
