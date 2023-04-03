package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.media3.common.q */
/* compiled from: StarRating */
public final class C0829q extends C0828p {

    /* renamed from: g */
    public static final C0785d.C0786a<C0829q> f4427g = new g86();

    /* renamed from: d */
    public final int f4428d;

    /* renamed from: e */
    public final float f4429e;

    public C0829q(int i) {
        C2725kr.m20982b(i > 0, "maxStars must be a positive integer");
        this.f4428d = i;
        this.f4429e = -1.0f;
    }

    /* renamed from: c */
    public static String m5763c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static C0829q m5765e(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(m5763c(0), -1) == 2) {
            z = true;
        }
        C2725kr.m20981a(z);
        int i = bundle.getInt(m5763c(1), 5);
        float f = bundle.getFloat(m5763c(2), -1.0f);
        if (f == -1.0f) {
            return new C0829q(i);
        }
        return new C0829q(i, f);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0829q)) {
            return false;
        }
        C0829q qVar = (C0829q) obj;
        if (this.f4428d == qVar.f4428d && this.f4429e == qVar.f4429e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return jf4.m46497b(Integer.valueOf(this.f4428d), Float.valueOf(this.f4429e));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5763c(0), 2);
        bundle.putInt(m5763c(1), this.f4428d);
        bundle.putFloat(m5763c(2), this.f4429e);
        return bundle;
    }

    public C0829q(int i, float f) {
        boolean z = true;
        C2725kr.m20982b(i > 0, "maxStars must be a positive integer");
        C2725kr.m20982b((f < Utils.FLOAT_EPSILON || f > ((float) i)) ? false : z, "starRating is out of range [0, maxStars]");
        this.f4428d = i;
        this.f4429e = f;
    }
}
