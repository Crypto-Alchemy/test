package p000;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: pa */
/* compiled from: ActivityRecreator */
public final class C3045pa {

    /* renamed from: a */
    public static final Class<?> f16365a;

    /* renamed from: b */
    public static final Field f16366b = m24774b();

    /* renamed from: c */
    public static final Field f16367c = m24778f();

    /* renamed from: d */
    public static final Method f16368d;

    /* renamed from: e */
    public static final Method f16369e;

    /* renamed from: f */
    public static final Method f16370f;

    /* renamed from: g */
    public static final Handler f16371g = new Handler(Looper.getMainLooper());

    /* renamed from: pa$a */
    /* compiled from: ActivityRecreator */
    public class C3046a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C3049d f16372a;

        /* renamed from: d */
        public final /* synthetic */ Object f16373d;

        public C3046a(C3049d dVar, Object obj) {
            this.f16372a = dVar;
            this.f16373d = obj;
        }

        public void run() {
            this.f16372a.f16378a = this.f16373d;
        }
    }

    /* renamed from: pa$b */
    /* compiled from: ActivityRecreator */
    public class C3047b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f16374a;

        /* renamed from: d */
        public final /* synthetic */ C3049d f16375d;

        public C3047b(Application application, C3049d dVar) {
            this.f16374a = application;
            this.f16375d = dVar;
        }

        public void run() {
            this.f16374a.unregisterActivityLifecycleCallbacks(this.f16375d);
        }
    }

    /* renamed from: pa$c */
    /* compiled from: ActivityRecreator */
    public class C3048c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f16376a;

        /* renamed from: d */
        public final /* synthetic */ Object f16377d;

        public C3048c(Object obj, Object obj2) {
            this.f16376a = obj;
            this.f16377d = obj2;
        }

        public void run() {
            try {
                Method method = C3045pa.f16368d;
                if (method != null) {
                    method.invoke(this.f16376a, new Object[]{this.f16377d, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                C3045pa.f16369e.invoke(this.f16376a, new Object[]{this.f16377d, Boolean.FALSE});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: pa$d */
    /* compiled from: ActivityRecreator */
    public static final class C3049d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f16378a;

        /* renamed from: d */
        public Activity f16379d;

        /* renamed from: e */
        public final int f16380e;

        /* renamed from: g */
        public boolean f16381g = false;

        /* renamed from: k */
        public boolean f16382k = false;

        /* renamed from: r */
        public boolean f16383r = false;

        public C3049d(Activity activity) {
            this.f16379d = activity;
            this.f16380e = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f16379d == activity) {
                this.f16379d = null;
                this.f16382k = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f16382k && !this.f16383r && !this.f16381g && C3045pa.m24780h(this.f16378a, this.f16380e, activity)) {
                this.f16383r = true;
                this.f16378a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f16379d == activity) {
                this.f16381g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a = m24773a();
        f16365a = a;
        f16368d = m24776d(a);
        f16369e = m24775c(a);
        f16370f = m24777e(a);
    }

    /* renamed from: a */
    public static Class<?> m24773a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m24774b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m24775c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m24776d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m24777e(Class<?> cls) {
        if (m24779g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m24778f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m24779g() {
        int i = Build.VERSION.SDK_INT;
        if (i == 26 || i == 27) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m24780h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f16367c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i) {
                    f16371g.postAtFrontOfQueue(new C3048c(f16366b.get(activity), obj2));
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m24781i(Activity activity) {
        Object obj;
        Application application;
        C3049d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m24779g() && f16370f == null) {
            return false;
        } else {
            if (f16369e == null && f16368d == null) {
                return false;
            }
            try {
                Object obj2 = f16367c.get(activity);
                if (obj2 == null || (obj = f16366b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C3049d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f16371g;
                handler.post(new C3046a(dVar, obj2));
                if (m24779g()) {
                    Method method = f16370f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new C3047b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
