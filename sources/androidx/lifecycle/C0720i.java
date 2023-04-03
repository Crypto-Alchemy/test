package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

/* renamed from: androidx.lifecycle.i */
/* compiled from: ProcessLifecycleOwner */
public class C0720i implements ug3 {

    /* renamed from: y */
    public static final C0720i f3966y = new C0720i();

    /* renamed from: a */
    public int f3967a = 0;

    /* renamed from: d */
    public int f3968d = 0;

    /* renamed from: e */
    public boolean f3969e = true;

    /* renamed from: g */
    public boolean f3970g = true;

    /* renamed from: k */
    public Handler f3971k;

    /* renamed from: r */
    public final C0716f f3972r = new C0716f(this);

    /* renamed from: s */
    public Runnable f3973s = new C0721a();

    /* renamed from: x */
    public ReportFragment.C0703a f3974x = new C0722b();

    /* renamed from: androidx.lifecycle.i$a */
    /* compiled from: ProcessLifecycleOwner */
    public class C0721a implements Runnable {
        public C0721a() {
        }

        public void run() {
            C0720i.this.mo6404f();
            C0720i.this.mo6405g();
        }
    }

    /* renamed from: androidx.lifecycle.i$b */
    /* compiled from: ProcessLifecycleOwner */
    public class C0722b implements ReportFragment.C0703a {
        public C0722b() {
        }

        /* renamed from: a */
        public void mo6347a() {
        }

        /* renamed from: b */
        public void mo6348b() {
            C0720i.this.mo6401c();
        }

        /* renamed from: c */
        public void mo6349c() {
            C0720i.this.mo6400b();
        }
    }

    /* renamed from: androidx.lifecycle.i$c */
    /* compiled from: ProcessLifecycleOwner */
    public class C0723c extends oo1 {

        /* renamed from: androidx.lifecycle.i$c$a */
        /* compiled from: ProcessLifecycleOwner */
        public class C0724a extends oo1 {
            public C0724a() {
            }

            public void onActivityPostResumed(Activity activity) {
                C0720i.this.mo6400b();
            }

            public void onActivityPostStarted(Activity activity) {
                C0720i.this.mo6401c();
            }
        }

        public C0723c() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.m5058f(activity).mo6340h(C0720i.this.f3974x);
            }
        }

        public void onActivityPaused(Activity activity) {
            C0720i.this.mo6399a();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C0725d.m5135a(activity, new C0724a());
        }

        public void onActivityStopped(Activity activity) {
            C0720i.this.mo6402d();
        }
    }

    /* renamed from: androidx.lifecycle.i$d */
    /* compiled from: ProcessLifecycleOwner */
    public static class C0725d {
        /* renamed from: a */
        public static void m5135a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: h */
    public static ug3 m5123h() {
        return f3966y;
    }

    /* renamed from: i */
    public static void m5124i(Context context) {
        f3966y.mo6403e(context);
    }

    /* renamed from: a */
    public void mo6399a() {
        int i = this.f3968d - 1;
        this.f3968d = i;
        if (i == 0) {
            this.f3971k.postDelayed(this.f3973s, 700);
        }
    }

    /* renamed from: b */
    public void mo6400b() {
        int i = this.f3968d + 1;
        this.f3968d = i;
        if (i != 1) {
            return;
        }
        if (this.f3969e) {
            this.f3972r.mo6389h(Lifecycle.Event.ON_RESUME);
            this.f3969e = false;
            return;
        }
        this.f3971k.removeCallbacks(this.f3973s);
    }

    /* renamed from: c */
    public void mo6401c() {
        int i = this.f3967a + 1;
        this.f3967a = i;
        if (i == 1 && this.f3970g) {
            this.f3972r.mo6389h(Lifecycle.Event.ON_START);
            this.f3970g = false;
        }
    }

    /* renamed from: d */
    public void mo6402d() {
        this.f3967a--;
        mo6405g();
    }

    /* renamed from: e */
    public void mo6403e(Context context) {
        this.f3971k = new Handler();
        this.f3972r.mo6389h(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0723c());
    }

    /* renamed from: f */
    public void mo6404f() {
        if (this.f3968d == 0) {
            this.f3969e = true;
            this.f3972r.mo6389h(Lifecycle.Event.ON_PAUSE);
        }
    }

    /* renamed from: g */
    public void mo6405g() {
        if (this.f3967a == 0 && this.f3969e) {
            this.f3972r.mo6389h(Lifecycle.Event.ON_STOP);
            this.f3970g = true;
        }
    }

    public Lifecycle getLifecycle() {
        return this.f3972r;
    }
}
