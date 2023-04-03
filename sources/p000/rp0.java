package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: rp0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class rp0 {

    /* renamed from: b */
    public static final Object f33556b = new Object();

    /* renamed from: c */
    public static volatile rp0 f33557c;

    /* renamed from: a */
    public ConcurrentHashMap f33558a = new ConcurrentHashMap();

    /* renamed from: b */
    public static rp0 m51209b() {
        if (f33557c == null) {
            synchronized (f33556b) {
                if (f33557c == null) {
                    f33557c = new rp0();
                }
            }
        }
        rp0 rp0 = f33557c;
        cu4.m43221k(rp0);
        return rp0;
    }

    /* renamed from: e */
    public static void m51210e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m51211g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ei9)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m51212h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (!xp4.m54485j() || executor == null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return context.bindService(intent, i, executor, serviceConnection);
    }

    /* renamed from: a */
    public boolean mo47466a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo47469f(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    /* renamed from: c */
    public void mo47467c(Context context, ServiceConnection serviceConnection) {
        if (!m51211g(serviceConnection) || !this.f33558a.containsKey(serviceConnection)) {
            m51210e(context, serviceConnection);
            return;
        }
        try {
            m51210e(context, (ServiceConnection) this.f33558a.get(serviceConnection));
        } finally {
            this.f33558a.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean mo47468d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return mo47469f(context, str, intent, serviceConnection, i, true, executor);
    }

    /* renamed from: f */
    public final boolean mo47469f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((tn7.m52384a(context).mo45809c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m51211g(serviceConnection)) {
            return m51212h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f33558a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()});
        }
        try {
            boolean h = m51212h(context, intent, serviceConnection, i, executor);
            if (h) {
                return h;
            }
            return false;
        } finally {
            this.f33558a.remove(serviceConnection, serviceConnection);
        }
    }
}
