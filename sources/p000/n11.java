package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* renamed from: n11 */
/* compiled from: DataCollectionConfigStorage */
public class n11 {

    /* renamed from: a */
    public final Context f31939a;

    /* renamed from: b */
    public final SharedPreferences f31940b;

    /* renamed from: c */
    public final wy4 f31941c;

    /* renamed from: d */
    public boolean f31942d = mo45945c();

    public n11(Context context, String str, wy4 wy4) {
        Context a = m48584a(context);
        this.f31939a = a;
        this.f31940b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f31941c = wy4;
    }

    /* renamed from: a */
    public static Context m48584a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return zr0.m31439b(context);
    }

    /* renamed from: b */
    public synchronized boolean mo45944b() {
        return this.f31942d;
    }

    /* renamed from: c */
    public final boolean mo45945c() {
        if (this.f31940b.contains("firebase_data_collection_default_enabled")) {
            return this.f31940b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return mo45946d();
    }

    /* renamed from: d */
    public final boolean mo45946d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f31939a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f31939a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
