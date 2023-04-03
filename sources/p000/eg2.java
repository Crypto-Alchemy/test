package p000;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: eg2 */
/* compiled from: GhostViewPlatform */
public class eg2 implements cg2 {

    /* renamed from: d */
    public static Class<?> f11147d;

    /* renamed from: e */
    public static boolean f11148e;

    /* renamed from: g */
    public static Method f11149g;

    /* renamed from: k */
    public static boolean f11150k;

    /* renamed from: r */
    public static Method f11151r;

    /* renamed from: s */
    public static boolean f11152s;

    /* renamed from: a */
    public final View f11153a;

    public eg2(View view) {
        this.f11153a = view;
    }

    /* renamed from: b */
    public static cg2 m16088b(View view, ViewGroup viewGroup, Matrix matrix) {
        m16089c();
        Method method = f11149g;
        if (method != null) {
            try {
                return new eg2((View) method.invoke((Object) null, new Object[]{view, viewGroup, matrix}));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m16089c() {
        if (!f11150k) {
            try {
                m16090d();
                Method declaredMethod = f11147d.getDeclaredMethod("addGhost", new Class[]{View.class, ViewGroup.class, Matrix.class});
                f11149g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f11150k = true;
        }
    }

    /* renamed from: d */
    public static void m16090d() {
        if (!f11148e) {
            try {
                f11147d = Class.forName("android.view.GhostView");
            } catch (ClassNotFoundException unused) {
            }
            f11148e = true;
        }
    }

    /* renamed from: e */
    public static void m16091e() {
        if (!f11152s) {
            try {
                m16090d();
                Method declaredMethod = f11147d.getDeclaredMethod("removeGhost", new Class[]{View.class});
                f11151r = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f11152s = true;
        }
    }

    /* renamed from: f */
    public static void m16092f(View view) {
        m16091e();
        Method method = f11151r;
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[]{view});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    public void mo12059a(ViewGroup viewGroup, View view) {
    }

    public void setVisibility(int i) {
        this.f11153a.setVisibility(i);
    }
}
