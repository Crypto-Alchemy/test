package p000;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* renamed from: mk4 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class mk4 {

    /* renamed from: a */
    public final Context f31721a;

    public mk4(Context context) {
        this.f31721a = context;
    }

    /* renamed from: a */
    public int mo45807a(String str) {
        return this.f31721a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int mo45808b(String str, String str2) {
        return this.f31721a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo mo45809c(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f31721a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: d */
    public CharSequence mo45810d(String str) throws PackageManager.NameNotFoundException {
        return this.f31721a.getPackageManager().getApplicationLabel(this.f31721a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo mo45811e(String str, int i) throws PackageManager.NameNotFoundException {
        return this.f31721a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: f */
    public boolean mo45812f() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return dw2.m43717a(this.f31721a);
        }
        if (!xp4.m54483h() || (nameForUid = this.f31721a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f31721a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    /* renamed from: g */
    public final boolean mo45813g(int i, String str) {
        if (xp4.m54479d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f31721a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f31721a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
