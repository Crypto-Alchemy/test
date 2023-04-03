package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: wo6 */
/* compiled from: ThemeEnforcement */
public final class wo6 {

    /* renamed from: a */
    public static final int[] f35402a = {j15.colorPrimary};

    /* renamed from: b */
    public static final int[] f35403b = {j15.colorPrimaryVariant};

    /* renamed from: a */
    public static void m53997a(Context context) {
        m54001e(context, f35402a, "Theme.AppCompat");
    }

    /* renamed from: b */
    public static void m53998b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(u55.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(j15.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m53999c(context);
            }
        }
        m53997a(context);
    }

    /* renamed from: c */
    public static void m53999c(Context context) {
        m54001e(context, f35403b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    public static void m54000d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(u55.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(u55.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m54002f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m54001e(Context context, int[] iArr, String str) {
        if (!m54003g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static boolean m54002f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    public static boolean m54003g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m54004h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m53998b(context, attributeSet, i, i2);
        m54000d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static yq6 m54005i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m53998b(context, attributeSet, i, i2);
        m54000d(context, attributeSet, iArr, i, i2, iArr2);
        return yq6.m30733v(context, attributeSet, iArr, i, i2);
    }
}
