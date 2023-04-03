package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/* renamed from: to3 */
/* compiled from: MaterialResources */
public class to3 {
    /* renamed from: a */
    public static ColorStateList m52390a(Context context, yq6 yq6, int i) {
        int n;
        ColorStateList a;
        if (!yq6.mo28193s(i) || (n = yq6.mo28188n(i, 0)) == 0 || (a = C2554in.m19713a(context, n)) == null) {
            return yq6.mo28177c(i);
        }
        return a;
    }

    /* renamed from: b */
    public static ColorStateList m52391b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C2554in.m19713a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: c */
    public static int m52392c(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m52393d(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C2554in.m19714b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }

    /* renamed from: e */
    public static int m52394e(TypedArray typedArray, int i, int i2) {
        if (typedArray.hasValue(i)) {
            return i;
        }
        return i2;
    }

    /* renamed from: f */
    public static bn6 m52395f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new bn6(context, resourceId);
    }

    /* renamed from: g */
    public static boolean m52396g(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m52397h(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 2.0f) {
            return true;
        }
        return false;
    }
}
