package p000;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: re7 */
/* compiled from: ViewUtils */
public class re7 {

    /* renamed from: a */
    public static Method f17230a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f17230a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f17230a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: a */
    public static void m26175a(View view, Rect rect, Rect rect2) {
        Method method = f17230a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m26176b(View view) {
        if (ga7.m17715B(view) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m26177c(View view) {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
