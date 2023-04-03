package p000;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ka3 */
/* compiled from: KeyEventDispatcher */
public class ka3 {

    /* renamed from: a */
    public static boolean f14020a = false;

    /* renamed from: b */
    public static Method f14021b = null;

    /* renamed from: c */
    public static boolean f14022c = false;

    /* renamed from: d */
    public static Field f14023d;

    /* renamed from: ka3$a */
    /* compiled from: KeyEventDispatcher */
    public interface C2650a {
        boolean superDispatchKeyEvent(KeyEvent keyEvent);
    }

    /* renamed from: a */
    public static boolean m20604a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f14020a) {
            try {
                f14021b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f14020a = true;
        }
        Method method = f14021b;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, new Object[]{keyEvent});
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m20605b(Activity activity, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m20604a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ga7.m17768h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(activity, dispatcherState, activity);
    }

    /* renamed from: c */
    public static boolean m20606c(Dialog dialog, KeyEvent keyEvent) {
        KeyEvent.DispatcherState dispatcherState;
        DialogInterface.OnKeyListener f = m20609f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (ga7.m17768h(decorView, keyEvent)) {
            return true;
        }
        if (decorView != null) {
            dispatcherState = decorView.getKeyDispatcherState();
        } else {
            dispatcherState = null;
        }
        return keyEvent.dispatch(dialog, dispatcherState, dialog);
    }

    /* renamed from: d */
    public static boolean m20607d(View view, KeyEvent keyEvent) {
        return ga7.m17770i(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public static boolean m20608e(C2650a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            return m20605b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m20606c((Dialog) callback, keyEvent);
        }
        if ((view == null || !ga7.m17768h(view, keyEvent)) && !aVar.superDispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static DialogInterface.OnKeyListener m20609f(Dialog dialog) {
        if (!f14022c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f14023d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f14022c = true;
        }
        Field field = f14023d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
