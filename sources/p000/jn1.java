package p000;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: jn1 */
/* compiled from: EdgeEffectCompat */
public final class jn1 {

    /* renamed from: jn1$a */
    /* compiled from: EdgeEffectCompat */
    public static class C2615a {
        /* renamed from: a */
        public static void m20241a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: jn1$b */
    /* compiled from: EdgeEffectCompat */
    public static class C2616b {
        /* renamed from: a */
        public static EdgeEffect m20242a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m20243b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return Utils.FLOAT_EPSILON;
            }
        }

        /* renamed from: c */
        public static float m20244c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return Utils.FLOAT_EPSILON;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m20237a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2616b.m20242a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m20238b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2616b.m20243b(edgeEffect);
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: c */
    public static void m20239c(EdgeEffect edgeEffect, float f, float f2) {
        C2615a.m20241a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m20240d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2616b.m20244c(edgeEffect, f, f2);
        }
        m20239c(edgeEffect, f, f2);
        return f;
    }
}
