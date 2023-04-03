package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: oo3 */
/* compiled from: MaterialAttributes */
public class oo3 {
    /* renamed from: a */
    public static TypedValue m49370a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m49371b(Context context, int i, boolean z) {
        TypedValue a = m49370a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        if (a.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m49372c(Context context, int i, String str) {
        TypedValue a = m49370a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: d */
    public static int m49373d(View view, int i) {
        return m49372c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
