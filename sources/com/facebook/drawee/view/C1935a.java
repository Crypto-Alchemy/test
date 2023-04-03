package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facebook.drawee.view.a */
/* compiled from: AspectRatioMeasure */
public class C1935a {

    /* renamed from: com.facebook.drawee.view.a$a */
    /* compiled from: AspectRatioMeasure */
    public static class C1936a {

        /* renamed from: a */
        public int f9583a;

        /* renamed from: b */
        public int f9584b;
    }

    /* renamed from: a */
    public static boolean m13427a(int i) {
        return i == 0 || i == -2;
    }

    /* renamed from: b */
    public static void m13428b(C1936a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f > Utils.FLOAT_EPSILON && layoutParams != null) {
            if (m13427a(layoutParams.height)) {
                aVar.f9584b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f9583a) - i)) / f) + ((float) i2)), aVar.f9584b), 1073741824);
            } else if (m13427a(layoutParams.width)) {
                aVar.f9583a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.f9584b) - i2)) * f) + ((float) i)), aVar.f9583a), 1073741824);
            }
        }
    }
}
