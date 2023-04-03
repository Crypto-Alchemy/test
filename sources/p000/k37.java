package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import com.zendesk.logger.Logger;
import java.util.Locale;

/* renamed from: k37 */
/* compiled from: UiUtils */
public class k37 {
    /* renamed from: a */
    public static CharSequence m75277a(String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: b */
    public static int m75278b(int i, Context context) {
        return zr0.m31440c(context, i);
    }

    /* renamed from: c */
    public static void m75279c(int i, Drawable drawable, View view) {
        if (drawable == null) {
            Logger.m43081e("UiUtils", "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        ij1.m19655n(ij1.m19659r(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: d */
    public static void m75280d(View view, int i) {
        if (view == null) {
            Logger.m43087k("UiUtils", "View is null and can't change visibility", new Object[0]);
        } else {
            view.setVisibility(i);
        }
    }

    /* renamed from: e */
    public static int m75281e(int i, Context context, int i2) {
        if (i == 0 || context == null || i2 == 0) {
            Logger.m43078b("UiUtils", "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
            return -16777216;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            Logger.m43081e("UiUtils", String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", new Object[]{Integer.valueOf(i)}), new Object[0]);
            return m75278b(i2, context);
        }
        int i3 = typedValue.resourceId;
        if (i3 == 0) {
            return typedValue.data;
        }
        return m75278b(i3, context);
    }
}
