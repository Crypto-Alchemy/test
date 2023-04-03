package p000;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a60 */
/* compiled from: BundleUtil */
public final class a60 {

    /* renamed from: a */
    public static Method f49a;

    /* renamed from: b */
    public static Method f50b;

    /* renamed from: a */
    public static IBinder m80a(Bundle bundle, String str) {
        if (w67.f19021a >= 18) {
            return bundle.getBinder(str);
        }
        return m81b(bundle, str);
    }

    /* renamed from: b */
    public static IBinder m81b(Bundle bundle, String str) {
        Method method = f49a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f49a = method2;
                method2.setAccessible(true);
                method = f49a;
            } catch (NoSuchMethodException e) {
                gk3.m18130g("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            gk3.m18130g("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    /* renamed from: c */
    public static void m82c(Bundle bundle, String str, IBinder iBinder) {
        if (w67.f19021a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m83d(bundle, str, iBinder);
        }
    }

    /* renamed from: d */
    public static void m83d(Bundle bundle, String str, IBinder iBinder) {
        Method method = f50b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                f50b = method2;
                method2.setAccessible(true);
                method = f50b;
            } catch (NoSuchMethodException e) {
                gk3.m18130g("BundleUtil", "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, new Object[]{str, iBinder});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            gk3.m18130g("BundleUtil", "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
