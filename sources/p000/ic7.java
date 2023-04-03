package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ic7 */
/* compiled from: ViewGroupUtils */
public class ic7 {

    /* renamed from: a */
    public static boolean f13248a = true;

    /* renamed from: b */
    public static Method f13249b;

    /* renamed from: c */
    public static boolean f13250c;

    /* renamed from: a */
    public static int m19555a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!f13250c) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("getChildDrawingOrder", new Class[]{cls2, cls2});
                f13249b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f13250c = true;
        }
        Method method = f13249b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, new Object[]{Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i)})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static fc7 m19556b(ViewGroup viewGroup) {
        return new ec7(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m19557c(ViewGroup viewGroup, boolean z) {
        if (f13248a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f13248a = false;
            }
        }
    }

    /* renamed from: d */
    public static void m19558d(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            m19557c(viewGroup, z);
        }
    }
}
