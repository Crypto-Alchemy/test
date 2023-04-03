package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: xo6 */
/* compiled from: ThemeUtils */
public class xo6 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f19933a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f19934b = {-16842910};

    /* renamed from: c */
    public static final int[] f19935c = {16842908};

    /* renamed from: d */
    public static final int[] f19936d = {16843518};

    /* renamed from: e */
    public static final int[] f19937e = {16842919};

    /* renamed from: f */
    public static final int[] f19938f = {16842912};

    /* renamed from: g */
    public static final int[] f19939g = {16842913};

    /* renamed from: h */
    public static final int[] f19940h = {-16842919, -16842908};

    /* renamed from: i */
    public static final int[] f19941i = new int[0];

    /* renamed from: j */
    public static final int[] f19942j = new int[1];

    /* renamed from: a */
    public static void m30262a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j65.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(j65.AppCompatTheme_windowActionBar)) {
                StringBuilder sb = new StringBuilder();
                sb.append("View ");
                sb.append(view.getClass());
                sb.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m30263b(Context context, int i) {
        ColorStateList e = m30266e(context, i);
        if (e != null && e.isStateful()) {
            return e.getColorForState(f19934b, e.getDefaultColor());
        }
        TypedValue f = m30267f();
        context.getTheme().resolveAttribute(16842803, f, true);
        return m30265d(context, i, f.getFloat());
    }

    /* renamed from: c */
    public static int m30264c(Context context, int i) {
        int[] iArr = f19942j;
        iArr[0] = i;
        yq6 u = yq6.m30732u(context, (AttributeSet) null, iArr);
        try {
            return u.mo28176b(0, 0);
        } finally {
            u.mo28194w();
        }
    }

    /* renamed from: d */
    public static int m30265d(Context context, int i, float f) {
        int c = m30264c(context, i);
        return gl0.m18169j(c, Math.round(((float) Color.alpha(c)) * f));
    }

    /* renamed from: e */
    public static ColorStateList m30266e(Context context, int i) {
        int[] iArr = f19942j;
        iArr[0] = i;
        yq6 u = yq6.m30732u(context, (AttributeSet) null, iArr);
        try {
            return u.mo28177c(0);
        } finally {
            u.mo28194w();
        }
    }

    /* renamed from: f */
    public static TypedValue m30267f() {
        ThreadLocal<TypedValue> threadLocal = f19933a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
