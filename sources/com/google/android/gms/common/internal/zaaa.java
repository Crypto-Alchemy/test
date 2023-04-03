package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    public static final int m33759b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException("Unknown color scheme: " + i);
    }

    /* renamed from: a */
    public final void mo30663a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = r25.common_google_signin_btn_icon_dark;
        int i5 = r25.common_google_signin_btn_icon_light;
        int b = m33759b(i2, i4, i5, i5);
        int i6 = r25.common_google_signin_btn_text_dark;
        int i7 = r25.common_google_signin_btn_text_light;
        int b2 = m33759b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        Drawable r = ij1.m19659r(resources.getDrawable(b));
        ij1.m19656o(r, resources.getColorStateList(v15.common_google_signin_btn_tint));
        ij1.m19657p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = v15.common_google_signin_btn_text_dark;
        int i9 = v15.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) cu4.m43221k(resources.getColorStateList(m33759b(i2, i8, i9, i9))));
        if (i == 0) {
            setText(resources.getString(w45.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(w45.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            throw new IllegalStateException("Unknown button size: " + i);
        }
        setTransformationMethod((TransformationMethod) null);
        if (le1.m47791c(getContext())) {
            setGravity(19);
        }
    }
}
