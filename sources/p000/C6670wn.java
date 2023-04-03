package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: wn */
/* compiled from: AppData */
public class C6670wn {

    /* renamed from: a */
    public final String f35391a;

    /* renamed from: b */
    public final String f35392b;

    /* renamed from: c */
    public final String f35393c;

    /* renamed from: d */
    public final String f35394d;

    /* renamed from: e */
    public final String f35395e;

    /* renamed from: f */
    public final String f35396f;

    /* renamed from: g */
    public final y37 f35397g;

    public C6670wn(String str, String str2, String str3, String str4, String str5, String str6, y37 y37) {
        this.f35391a = str;
        this.f35392b = str2;
        this.f35393c = str3;
        this.f35394d = str4;
        this.f35395e = str5;
        this.f35396f = str6;
        this.f35397g = y37;
    }

    /* renamed from: a */
    public static C6670wn m53989a(Context context, zp2 zp2, String str, String str2, y37 y37) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = zp2.mo49898g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C6670wn(str, str2, g, packageName, num, str3, y37);
    }
}
