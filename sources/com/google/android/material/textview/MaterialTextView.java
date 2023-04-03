package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    public static boolean m36242f(Context context) {
        return oo3.m49371b(context, j15.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: g */
    public static int m36243g(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, u55.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(u55.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: h */
    public static int m36244h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = to3.m52392c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: i */
    public static boolean m36245i(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, u55.MaterialTextView, i, i2);
        int h = m36244h(context, obtainStyledAttributes, u55.MaterialTextView_android_lineHeight, u55.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (h != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo34035e(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, u55.MaterialTextAppearance);
        int h = m36244h(getContext(), obtainStyledAttributes, u55.MaterialTextAppearance_android_lineHeight, u55.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (h >= 0) {
            setLineHeight(h);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m36242f(context)) {
            mo34035e(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(xo3.m54461c(context, attributeSet, i, i2), attributeSet, i);
        int g;
        Context context2 = getContext();
        if (m36242f(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m36245i(context2, theme, attributeSet, i, i2) && (g = m36243g(theme, attributeSet, i, i2)) != -1) {
                mo34035e(theme, g);
            }
        }
    }
}
