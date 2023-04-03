package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.x */
/* compiled from: VideoSize */
public final class C0844x implements C0785d {

    /* renamed from: k */
    public static final C0844x f4554k = new C0844x(0, 0);

    /* renamed from: r */
    public static final C0785d.C0786a<C0844x> f4555r = new aa7();

    /* renamed from: a */
    public final int f4556a;

    /* renamed from: d */
    public final int f4557d;

    /* renamed from: e */
    public final int f4558e;

    /* renamed from: g */
    public final float f4559g;

    public C0844x(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    /* renamed from: b */
    public static String m5937b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    public static /* synthetic */ C0844x m5938c(Bundle bundle) {
        return new C0844x(bundle.getInt(m5937b(0), 0), bundle.getInt(m5937b(1), 0), bundle.getInt(m5937b(2), 0), bundle.getFloat(m5937b(3), 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0844x)) {
            return false;
        }
        C0844x xVar = (C0844x) obj;
        if (this.f4556a == xVar.f4556a && this.f4557d == xVar.f4557d && this.f4558e == xVar.f4558e && this.f4559g == xVar.f4559g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((217 + this.f4556a) * 31) + this.f4557d) * 31) + this.f4558e) * 31) + Float.floatToRawIntBits(this.f4559g);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5937b(0), this.f4556a);
        bundle.putInt(m5937b(1), this.f4557d);
        bundle.putInt(m5937b(2), this.f4558e);
        bundle.putFloat(m5937b(3), this.f4559g);
        return bundle;
    }

    public C0844x(int i, int i2, int i3, float f) {
        this.f4556a = i;
        this.f4557d = i2;
        this.f4558e = i3;
        this.f4559g = f;
    }
}
