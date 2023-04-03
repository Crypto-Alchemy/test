package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import com.onesignal.C5179a;
import com.onesignal.OSFocusHandler;

/* renamed from: ka */
/* compiled from: ActivityLifecycleListener */
public class C6139ka implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static C6139ka f30755a;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static C5179a f30756d;

    /* renamed from: e */
    public static ComponentCallbacks f30757e;

    /* renamed from: ka$a */
    /* compiled from: ActivityLifecycleListener */
    public class C6140a implements ComponentCallbacks {
        public void onConfigurationChanged(Configuration configuration) {
            C6139ka.f30756d.mo38664o(configuration, C6139ka.f30756d.mo38653d());
        }

        public void onLowMemory() {
        }
    }

    /* renamed from: b */
    public static C5179a m46938b() {
        return f30756d;
    }

    /* renamed from: c */
    public static void m46939c(Application application) {
        if (f30755a == null) {
            C6139ka kaVar = new C6139ka();
            f30755a = kaVar;
            application.registerActivityLifecycleCallbacks(kaVar);
        }
        if (f30756d == null) {
            f30756d = new C5179a(new OSFocusHandler());
        }
        if (f30757e == null) {
            C6140a aVar = new C6140a();
            f30757e = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38658i(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38659j(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38660k(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38661l(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38662m(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        C5179a aVar = f30756d;
        if (aVar != null) {
            aVar.mo38663n(activity);
        }
    }
}
