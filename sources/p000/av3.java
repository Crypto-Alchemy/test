package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: av3 */
/* compiled from: MetadataBackendRegistry */
public class av3 implements C6584uw {

    /* renamed from: a */
    public final C3865a f21049a;

    /* renamed from: b */
    public final xv0 f21050b;

    /* renamed from: c */
    public final Map<String, gx6> f21051c;

    /* renamed from: av3$a */
    /* compiled from: MetadataBackendRegistry */
    public static class C3865a {

        /* renamed from: a */
        public final Context f21052a;

        /* renamed from: b */
        public Map<String, String> f21053b = null;

        public C3865a(Context context) {
            this.f21052a = context;
        }

        /* renamed from: d */
        public static Bundle m32265d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final Map<String, String> mo29367a(Context context) {
            Bundle d = m32265d(context);
            if (d == null) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String next : d.keySet()) {
                Object obj = d.get(next);
                if ((obj instanceof String) && next.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, next.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: b */
        public C6553tw mo29368b(String str) {
            String str2 = mo29369c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (C6553tw) Class.forName(str2).asSubclass(C6553tw.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", new Object[]{str2});
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", new Object[]{str2});
                return null;
            }
        }

        /* renamed from: c */
        public final Map<String, String> mo29369c() {
            if (this.f21053b == null) {
                this.f21053b = mo29367a(this.f21052a);
            }
            return this.f21053b;
        }
    }

    public av3(Context context, xv0 xv0) {
        this(new C3865a(context), xv0);
    }

    public synchronized gx6 get(String str) {
        if (this.f21051c.containsKey(str)) {
            return this.f21051c.get(str);
        }
        C6553tw b = this.f21049a.mo29368b(str);
        if (b == null) {
            return null;
        }
        gx6 create = b.create(this.f21050b.mo49557a(str));
        this.f21051c.put(str, create);
        return create;
    }

    public av3(C3865a aVar, xv0 xv0) {
        this.f21051c = new HashMap();
        this.f21049a = aVar;
        this.f21050b = xv0;
    }
}
