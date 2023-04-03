package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@CheckReturnValue
/* renamed from: ni2 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ni2 {

    /* renamed from: c */
    public static ni2 f32133c;

    /* renamed from: a */
    public final Context f32134a;

    /* renamed from: b */
    public volatile String f32135b;

    public ni2(Context context) {
        this.f32134a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static ni2 m48801a(Context context) {
        cu4.m43221k(context);
        synchronized (ni2.class) {
            if (f32133c == null) {
                hb9.m45107d(context);
                f32133c = new ni2(context);
            }
        }
        return f32133c;
    }

    /* renamed from: d */
    public static final y09 m48802d(PackageInfo packageInfo, y09... y09Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        y39 y39 = new y39(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < y09Arr.length; i++) {
            if (y09Arr[i].equals(y39)) {
                return y09Arr[i];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m48803e(PackageInfo packageInfo, boolean z) {
        y09 y09;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                y09 = m48802d(packageInfo, b99.f21194a);
            } else {
                y09 = m48802d(packageInfo, b99.f21194a[0]);
            }
            if (y09 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo46096b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m48803e(packageInfo, false)) {
            return true;
        }
        if (!m48803e(packageInfo, true) || !mi2.m48311f(this.f32134a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo46097c(int i) {
        wj9 wj9;
        int length;
        String[] packagesForUid = this.f32134a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            wj9 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    cu4.m43221k(wj9);
                    break;
                }
                wj9 = mo46098f(packagesForUid[i2], false, false);
                if (wj9.f35365a) {
                    break;
                }
                i2++;
            }
        } else {
            wj9 = wj9.m53932c("no pkgs");
        }
        wj9.mo49216e();
        return wj9.f35365a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* renamed from: f */
    public final wj9 mo46098f(String str, boolean z, boolean z2) {
        wj9 wj9;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return wj9.m53932c("null pkg");
        }
        if (str.equals(this.f32135b)) {
            return wj9.m53931b();
        }
        if (hb9.m45108e()) {
            wj9 = hb9.m45105b(str, mi2.m48311f(this.f32134a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f32134a.getPackageManager().getPackageInfo(str, 64);
                boolean f = mi2.m48311f(this.f32134a);
                if (packageInfo == null) {
                    wj9 = wj9.m53932c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        wj9 = wj9.m53932c("single cert required");
                    } else {
                        y39 y39 = new y39(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        wj9 a = hb9.m45104a(str2, y39, f, false);
                        if (!a.f35365a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !hb9.m45104a(str2, y39, false, true).f35365a) {
                            wj9 = a;
                        } else {
                            wj9 = wj9.m53932c("debuggable release cert app rejected");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return wj9.m53933d("no pkg ".concat(str), e);
            }
        }
        if (wj9.f35365a) {
            this.f32135b = str;
        }
        return wj9;
    }
}
