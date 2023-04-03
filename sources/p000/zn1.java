package p000;

import android.content.Context;
import android.graphics.Color;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: zn1 */
/* compiled from: ElevationOverlayProvider */
public class zn1 {

    /* renamed from: a */
    public final boolean f36195a;

    /* renamed from: b */
    public final int f36196b;

    /* renamed from: c */
    public final int f36197c;

    /* renamed from: d */
    public final float f36198d;

    public zn1(Context context) {
        this.f36195a = oo3.m49371b(context, j15.elevationOverlayEnabled, false);
        this.f36196b = ro3.m51196b(context, j15.elevationOverlayColor, 0);
        this.f36197c = ro3.m51196b(context, j15.colorSurface, 0);
        this.f36198d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public float mo49882a(float f) {
        float f2 = this.f36198d;
        if (f2 <= Utils.FLOAT_EPSILON || f <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int mo49883b(int i, float f) {
        float a = mo49882a(f);
        return gl0.m18169j(ro3.m51202h(gl0.m18169j(i, 255), this.f36196b, a), Color.alpha(i));
    }

    /* renamed from: c */
    public int mo49884c(int i, float f) {
        if (!this.f36195a || !mo49887f(i)) {
            return i;
        }
        return mo49883b(i, f);
    }

    /* renamed from: d */
    public int mo49885d(float f) {
        return mo49884c(this.f36197c, f);
    }

    /* renamed from: e */
    public boolean mo49886e() {
        return this.f36195a;
    }

    /* renamed from: f */
    public final boolean mo49887f(int i) {
        if (gl0.m18169j(i, 255) == this.f36197c) {
            return true;
        }
        return false;
    }
}
