package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: cb0 */
/* compiled from: CanvasUtils */
public class cb0 {

    /* renamed from: a */
    public static Method f8402a;

    /* renamed from: b */
    public static Method f8403b;

    /* renamed from: c */
    public static boolean f8404c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public static void m11820a(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            if (z) {
                canvas.enableZ();
            } else {
                canvas.disableZ();
            }
        } else if (i != 28) {
            if (!f8404c) {
                try {
                    Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f8402a = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    f8403b = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f8404c = true;
            }
            if (z) {
                try {
                    Method method2 = f8402a;
                    if (method2 != null) {
                        method2.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException unused2) {
                    return;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
            if (!z && (method = f8403b) != null) {
                method.invoke(canvas, new Object[0]);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
