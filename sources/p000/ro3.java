package p000;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* renamed from: ro3 */
/* compiled from: MaterialColors */
public class ro3 {
    /* renamed from: a */
    public static int m51195a(int i, int i2) {
        return gl0.m18169j(i, (Color.alpha(i) * i2) / 255);
    }

    /* renamed from: b */
    public static int m51196b(Context context, int i, int i2) {
        TypedValue a = oo3.m49370a(context, i);
        if (a != null) {
            return a.data;
        }
        return i2;
    }

    /* renamed from: c */
    public static int m51197c(Context context, int i, String str) {
        return oo3.m49372c(context, i, str);
    }

    /* renamed from: d */
    public static int m51198d(View view, int i) {
        return oo3.m49373d(view, i);
    }

    /* renamed from: e */
    public static int m51199e(View view, int i, int i2) {
        return m51196b(view.getContext(), i, i2);
    }

    /* renamed from: f */
    public static boolean m51200f(int i) {
        if (i == 0 || gl0.m18162c(i) <= 0.5d) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static int m51201g(int i, int i2) {
        return gl0.m18165f(i2, i);
    }

    /* renamed from: h */
    public static int m51202h(int i, int i2, float f) {
        return m51201g(i, gl0.m18169j(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: i */
    public static int m51203i(View view, int i, int i2, float f) {
        return m51202h(m51198d(view, i), m51198d(view, i2), f);
    }
}
