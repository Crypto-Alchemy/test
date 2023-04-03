package p000;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bn0 */
/* compiled from: ComponentDiscovery */
public final class bn0<T> {

    /* renamed from: a */
    public final T f21397a;

    /* renamed from: b */
    public final C3902c<T> f21398b;

    /* renamed from: bn0$b */
    /* compiled from: ComponentDiscovery */
    public static class C3901b implements C3902c<Context> {

        /* renamed from: a */
        public final Class<? extends Service> f21399a;

        /* renamed from: b */
        public final Bundle mo29655b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f21399a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.f21399a);
                sb.append(" has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo29654a(Context context) {
            Bundle b = mo29655b(context);
            if (b == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String next : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            return arrayList;
        }

        public C3901b(Class<? extends Service> cls) {
            this.f21399a = cls;
        }
    }

    /* renamed from: bn0$c */
    /* compiled from: ComponentDiscovery */
    public interface C3902c<T> {
        /* renamed from: a */
        List<String> mo29654a(T t);
    }

    public bn0(T t, C3902c<T> cVar) {
        this.f21397a = t;
        this.f21398b = cVar;
    }

    /* renamed from: c */
    public static bn0<Context> m32633c(Context context, Class<? extends Service> cls) {
        return new bn0<>(context, new C3901b(cls));
    }

    /* renamed from: d */
    public static en0 m32634d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (en0.class.isAssignableFrom(cls)) {
                return (en0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", new Object[]{str});
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: b */
    public List<ly4<en0>> mo29653b() {
        ArrayList arrayList = new ArrayList();
        for (String an0 : this.f21398b.mo29654a(this.f21397a)) {
            arrayList.add(new an0(an0));
        }
        return arrayList;
    }
}
