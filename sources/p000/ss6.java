package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.C5211d0;
import com.onesignal.C5259i0;
import com.onesignal.OneSignal;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ss6 */
/* compiled from: TrackFirebaseAnalytics */
public class ss6 {

    /* renamed from: c */
    public static Class<?> f33990c;

    /* renamed from: d */
    public static AtomicLong f33991d;

    /* renamed from: e */
    public static AtomicLong f33992e;

    /* renamed from: f */
    public static C5211d0 f33993f;

    /* renamed from: a */
    public Object f33994a;

    /* renamed from: b */
    public Context f33995b;

    public ss6(Context context) {
        this.f33995b = context;
    }

    /* renamed from: a */
    public static boolean m51895a() {
        try {
            f33990c = FirebaseAnalytics.class;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static Method m51896d(Class cls) {
        try {
            return cls.getMethod("getInstance", new Class[]{Context.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static Method m51897e(Class cls) {
        try {
            return cls.getMethod("logEvent", new Class[]{String.class, Bundle.class});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo47854b(C5211d0 d0Var) {
        if (!d0Var.mo38749j().isEmpty() && !d0Var.mo38748i().isEmpty()) {
            return d0Var.mo38749j() + " - " + d0Var.mo38748i();
        } else if (d0Var.mo38750k() != null) {
            return d0Var.mo38750k().substring(0, Math.min(10, d0Var.mo38750k().length()));
        } else {
            return "";
        }
    }

    /* renamed from: c */
    public final Object mo47855c(Context context) {
        if (this.f33994a == null) {
            try {
                this.f33994a = m51896d(f33990c).invoke((Object) null, new Object[]{context});
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f33994a;
    }

    /* renamed from: f */
    public void mo47856f() {
        if (f33991d != null && f33993f != null) {
            long a = OneSignal.m40443w0().mo46064a();
            if (a - f33991d.get() <= 120000) {
                AtomicLong atomicLong = f33992e;
                if (atomicLong == null || a - atomicLong.get() >= 30000) {
                    try {
                        Object c = mo47855c(this.f33995b);
                        Method e = m51897e(f33990c);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "OneSignal");
                        bundle.putString("medium", "notification");
                        bundle.putString("notification_id", f33993f.mo38746g());
                        bundle.putString("campaign", mo47854b(f33993f));
                        e.invoke(c, new Object[]{"os_notification_influence_open", bundle});
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo47857g(C5259i0 i0Var) {
        if (f33992e == null) {
            f33992e = new AtomicLong();
        }
        f33992e.set(OneSignal.m40443w0().mo46064a());
        try {
            Object c = mo47855c(this.f33995b);
            Method e = m51897e(f33990c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", i0Var.mo38882d().mo38746g());
            bundle.putString("campaign", mo47854b(i0Var.mo38882d()));
            e.invoke(c, new Object[]{"os_notification_opened", bundle});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo47858h(C5259i0 i0Var) {
        try {
            Object c = mo47855c(this.f33995b);
            Method e = m51897e(f33990c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", "notification");
            bundle.putString("notification_id", i0Var.mo38882d().mo38746g());
            bundle.putString("campaign", mo47854b(i0Var.mo38882d()));
            e.invoke(c, new Object[]{"os_notification_received", bundle});
            if (f33991d == null) {
                f33991d = new AtomicLong();
            }
            f33991d.set(OneSignal.m40443w0().mo46064a());
            f33993f = i0Var.mo38882d();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
