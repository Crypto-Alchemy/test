package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ww */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C6676ww implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: k */
    public static final C6676ww f35452k = new C6676ww();

    /* renamed from: a */
    public final AtomicBoolean f35453a = new AtomicBoolean();

    /* renamed from: d */
    public final AtomicBoolean f35454d = new AtomicBoolean();

    /* renamed from: e */
    public final ArrayList f35455e = new ArrayList();

    /* renamed from: g */
    public boolean f35456g = false;

    /* renamed from: ww$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface C6677a {
        /* renamed from: a */
        void mo42496a(boolean z);
    }

    /* renamed from: b */
    public static C6676ww m54079b() {
        return f35452k;
    }

    /* renamed from: c */
    public static void m54080c(Application application) {
        C6676ww wwVar = f35452k;
        synchronized (wwVar) {
            if (!wwVar.f35456g) {
                application.registerActivityLifecycleCallbacks(wwVar);
                application.registerComponentCallbacks(wwVar);
                wwVar.f35456g = true;
            }
        }
    }

    /* renamed from: a */
    public void mo49286a(C6677a aVar) {
        synchronized (f35452k) {
            this.f35455e.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo49287d() {
        return this.f35453a.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean mo49288e(boolean z) {
        if (!this.f35454d.get()) {
            if (!xp4.m54477b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f35454d.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f35453a.set(true);
            }
        }
        return mo49287d();
    }

    /* renamed from: f */
    public final void mo49289f(boolean z) {
        synchronized (f35452k) {
            Iterator it = this.f35455e.iterator();
            while (it.hasNext()) {
                ((C6677a) it.next()).mo42496a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f35453a.compareAndSet(true, false);
        this.f35454d.set(true);
        if (compareAndSet) {
            mo49289f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f35453a.compareAndSet(true, false);
        this.f35454d.set(true);
        if (compareAndSet) {
            mo49289f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f35453a.compareAndSet(false, true)) {
            this.f35454d.set(true);
            mo49289f(true);
        }
    }
}
