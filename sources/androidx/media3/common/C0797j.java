package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.j */
/* compiled from: HeartRating */
public final class C0797j extends C0828p {

    /* renamed from: g */
    public static final C0785d.C0786a<C0797j> f4238g = new ul2();

    /* renamed from: d */
    public final boolean f4239d;

    /* renamed from: e */
    public final boolean f4240e;

    public C0797j() {
        this.f4239d = false;
        this.f4240e = false;
    }

    /* renamed from: c */
    public static String m5500c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static C0797j m5502e(Bundle bundle) {
        boolean z;
        if (bundle.getInt(m5500c(0), -1) == 0) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (bundle.getBoolean(m5500c(1), false)) {
            return new C0797j(bundle.getBoolean(m5500c(2), false));
        }
        return new C0797j();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0797j)) {
            return false;
        }
        C0797j jVar = (C0797j) obj;
        if (this.f4240e == jVar.f4240e && this.f4239d == jVar.f4239d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return jf4.m46497b(Boolean.valueOf(this.f4239d), Boolean.valueOf(this.f4240e));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5500c(0), 0);
        bundle.putBoolean(m5500c(1), this.f4239d);
        bundle.putBoolean(m5500c(2), this.f4240e);
        return bundle;
    }

    public C0797j(boolean z) {
        this.f4239d = true;
        this.f4240e = z;
    }
}
