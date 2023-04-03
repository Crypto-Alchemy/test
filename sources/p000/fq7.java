package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fq7 */
public final class fq7 {

    /* renamed from: c */
    public static final pq7 f28945c = new pq7("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f28946a;

    /* renamed from: b */
    public final PackageManager f28947b;

    public fq7(Context context, PackageManager packageManager) {
        this.f28946a = context;
        this.f28947b = packageManager;
    }

    /* renamed from: a */
    public final boolean mo42644a() {
        for (ComponentInfo next : mo42648e()) {
            if (this.f28947b.getComponentEnabledSetting(new ComponentName(next.packageName, next.name)) != 2) {
                f28945c.mo46852a("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f28945c.mo46852a("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* renamed from: b */
    public final void mo42645b() {
        f28945c.mo46855d("Disabling all non-activity components", new Object[0]);
        mo42647d(mo42648e(), 2);
    }

    /* renamed from: c */
    public final void mo42646c() {
        f28945c.mo46855d("Resetting enabled state of all non-activity components", new Object[0]);
        mo42647d(mo42648e(), 0);
    }

    /* renamed from: d */
    public final void mo42647d(List<ComponentInfo> list, int i) {
        for (ComponentInfo next : list) {
            this.f28947b.setComponentEnabledSetting(new ComponentName(next.packageName, next.name), i, 1);
        }
    }

    /* renamed from: e */
    public final List<ComponentInfo> mo42648e() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f28947b.getPackageInfo(this.f28946a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f28945c.mo46856e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }
}
