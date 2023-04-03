package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Ldb0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "Lr37;", "a", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "reorderBarrierMethod", "c", "inorderBarrierMethod", "d", "Z", "orderMethodsFetched", "<init>", "()V", "ui-graphics_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: db0 */
/* compiled from: CanvasUtils.android.kt */
public final class db0 {

    /* renamed from: a */
    public static final db0 f10584a = new db0();

    /* renamed from: b */
    public static Method f10585b;

    /* renamed from: c */
    public static Method f10586c;

    /* renamed from: d */
    public static boolean f10587d;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: a */
    public final void mo18646a(Canvas canvas, boolean z) {
        Method method;
        vx2.m53591g(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            gb0.f12260a.mo20492a(canvas, z);
            return;
        }
        if (!f10587d) {
            if (i == 28) {
                Class<Class> cls = Class.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f10585b = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    f10586c = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f10585b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f10586c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f10585b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f10586c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f10587d = true;
        }
        if (z) {
            try {
                Method method4 = f10585b;
                if (method4 != null) {
                    vx2.m53588d(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f10586c) != null) {
            vx2.m53588d(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
