package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Method;
import org.web3j.abi.datatypes.Bool;

/* renamed from: wb7 */
/* compiled from: ViewConfigurationCompat */
public final class wb7 {

    /* renamed from: a */
    public static Method f19061a;

    /* renamed from: wb7$a */
    /* compiled from: ViewConfigurationCompat */
    public static class C3531a {
        /* renamed from: a */
        public static float m29443a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: b */
        public static float m29444b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* renamed from: wb7$b */
    /* compiled from: ViewConfigurationCompat */
    public static class C3532b {
        /* renamed from: a */
        public static int m29445a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: b */
        public static boolean m29446b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f19061a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m29438a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f19061a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: b */
    public static float m29439b(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3531a.m29443a(viewConfiguration);
        }
        return m29438a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m29440c(ViewConfiguration viewConfiguration) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3532b.m29445a(viewConfiguration);
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m29441d(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3531a.m29444b(viewConfiguration);
        }
        return m29438a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m29442e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C3532b.m29446b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", Bool.TYPE_NAME, "android");
        if (identifier == 0 || !resources.getBoolean(identifier)) {
            return false;
        }
        return true;
    }
}
