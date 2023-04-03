package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: in3 */
/* compiled from: ManifestParser */
public final class in3 {

    /* renamed from: a */
    public final Context f13323a;

    public in3(Context context) {
        this.f13323a = context;
    }

    /* renamed from: b */
    public static xg2 m19715b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                m19716c(cls, e);
            } catch (IllegalAccessException e2) {
                m19716c(cls, e2);
            } catch (NoSuchMethodException e3) {
                m19716c(cls, e3);
            } catch (InvocationTargetException e4) {
                m19716c(cls, e4);
            }
            if (obj instanceof xg2) {
                return (xg2) obj;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + obj);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* renamed from: c */
    public static void m19716c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    /* renamed from: a */
    public List<xg2> mo21575a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f13323a.getPackageManager().getApplicationInfo(this.f13323a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Got app info metadata: ");
                sb.append(applicationInfo.metaData);
            }
            for (String next : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(next))) {
                    arrayList.add(m19715b(next));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Loaded Glide module: ");
                        sb2.append(next);
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
