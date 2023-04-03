package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* renamed from: m11 */
/* compiled from: DataCollectionArbiter */
public class m11 {

    /* renamed from: a */
    public final SharedPreferences f31473a;

    /* renamed from: b */
    public final f22 f31474b;

    /* renamed from: c */
    public final Object f31475c;

    /* renamed from: d */
    public xl6<Void> f31476d = new xl6<>();

    /* renamed from: e */
    public boolean f31477e = false;

    /* renamed from: f */
    public boolean f31478f = false;

    /* renamed from: g */
    public Boolean f31479g;

    /* renamed from: h */
    public final xl6<Void> f31480h = new xl6<>();

    public m11(f22 f22) {
        Object obj = new Object();
        this.f31475c = obj;
        Context h = f22.mo42485h();
        this.f31474b = f22;
        this.f31473a = CommonUtils.m38415r(h);
        Boolean b = mo45597b();
        this.f31479g = b == null ? mo45596a(h) : b;
        synchronized (obj) {
            if (mo45599d()) {
                this.f31476d.mo49507e(null);
                this.f31477e = true;
            }
        }
    }

    /* renamed from: f */
    public static Boolean m48025f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            rk3.m51112f().mo47426e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: a */
    public final Boolean mo45596a(Context context) {
        Boolean f = m48025f(context);
        if (f == null) {
            this.f31478f = false;
            return null;
        }
        this.f31478f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    /* renamed from: b */
    public final Boolean mo45597b() {
        if (!this.f31473a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f31478f = false;
        return Boolean.valueOf(this.f31473a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: c */
    public void mo45598c(boolean z) {
        if (z) {
            this.f31480h.mo49507e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo45599d() {
        boolean z;
        Boolean bool = this.f31479g;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f31474b.mo42491q();
        }
        mo45600e(z);
        return z;
    }

    /* renamed from: e */
    public final void mo45600e(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f31479g == null) {
            str2 = "global Firebase setting";
        } else if (this.f31478f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        rk3.m51112f().mo47423b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str, str2}));
    }

    /* renamed from: g */
    public tl6<Void> mo45601g() {
        tl6<Void> a;
        synchronized (this.f31475c) {
            a = this.f31476d.mo49503a();
        }
        return a;
    }

    /* renamed from: h */
    public tl6<Void> mo45602h() {
        return o77.m49179e(this.f31480h.mo49503a(), mo45601g());
    }
}
