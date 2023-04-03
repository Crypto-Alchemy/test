package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.media3.common.m */
/* compiled from: PercentageRating */
public final class C0819m extends C0828p {

    /* renamed from: e */
    public static final C0785d.C0786a<C0819m> f4402e = new in4();

    /* renamed from: d */
    public final float f4403d;

    public C0819m() {
        this.f4403d = -1.0f;
    }

    /* renamed from: c */
    public static String m5650c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static C0819m m5652e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m5650c(0), -1) == 1) {
            z = true;
        }
        C2725kr.m20981a(z);
        float f = bundle.getFloat(m5650c(1), -1.0f);
        if (f == -1.0f) {
            return new C0819m();
        }
        return new C0819m(f);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C0819m) && this.f4403d == ((C0819m) obj).f4403d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return jf4.m46497b(Float.valueOf(this.f4403d));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5650c(0), 1);
        bundle.putFloat(m5650c(1), this.f4403d);
        return bundle;
    }

    public C0819m(float f) {
        C2725kr.m20982b(f >= Utils.FLOAT_EPSILON && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.f4403d = f;
    }
}
