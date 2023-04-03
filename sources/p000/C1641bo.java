package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bo */
/* compiled from: AppInitializer */
public final class C1641bo {

    /* renamed from: d */
    public static volatile C1641bo f8191d;

    /* renamed from: e */
    public static final Object f8192e = new Object();

    /* renamed from: a */
    public final Map<Class<?>, Object> f8193a = new HashMap();

    /* renamed from: b */
    public final Set<Class<? extends fu2<?>>> f8194b = new HashSet();

    /* renamed from: c */
    public final Context f8195c;

    public C1641bo(Context context) {
        this.f8195c = context.getApplicationContext();
    }

    /* renamed from: e */
    public static C1641bo m11483e(Context context) {
        if (f8191d == null) {
            synchronized (f8192e) {
                if (f8191d == null) {
                    f8191d = new C1641bo(context);
                }
            }
        }
        return f8191d;
    }

    /* renamed from: a */
    public void mo11730a() {
        try {
            ls6.m21841a("Startup");
            mo11731b(this.f8195c.getPackageManager().getProviderInfo(new ComponentName(this.f8195c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            ls6.m21842b();
        } catch (PackageManager.NameNotFoundException e) {
            throw new StartupException((Throwable) e);
        } catch (Throwable th) {
            ls6.m21842b();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo11731b(Bundle bundle) {
        String string = this.f8195c.getString(v45.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String next : bundle.keySet()) {
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (fu2.class.isAssignableFrom(cls)) {
                            this.f8194b.add(cls);
                        }
                    }
                }
                for (Class<? extends fu2<?>> d : this.f8194b) {
                    mo11733d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException((Throwable) e);
            }
        }
    }

    /* renamed from: c */
    public <T> T mo11732c(Class<? extends fu2<?>> cls) {
        T t;
        synchronized (f8192e) {
            t = this.f8193a.get(cls);
            if (t == null) {
                t = mo11733d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: d */
    public final <T> T mo11733d(Class<? extends fu2<?>> cls, Set<Class<?>> set) {
        T t;
        if (ls6.m21844d()) {
            try {
                ls6.m21841a(cls.getSimpleName());
            } catch (Throwable th) {
                ls6.m21842b();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f8193a.containsKey(cls)) {
                set.add(cls);
                fu2 fu2 = (fu2) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends fu2<?>>> a = fu2.mo5598a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f8193a.containsKey(next)) {
                            mo11733d(next, set);
                        }
                    }
                }
                t = fu2.mo5599b(this.f8195c);
                set.remove(cls);
                this.f8193a.put(cls, t);
            } else {
                t = this.f8193a.get(cls);
            }
            ls6.m21842b();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: f */
    public <T> T mo11734f(Class<? extends fu2<T>> cls) {
        return mo11732c(cls);
    }

    /* renamed from: g */
    public boolean mo11735g(Class<? extends fu2<?>> cls) {
        return this.f8194b.contains(cls);
    }
}
