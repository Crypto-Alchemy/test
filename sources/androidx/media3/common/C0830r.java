package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.r */
/* compiled from: ThumbRating */
public final class C0830r extends C0828p {

    /* renamed from: g */
    public static final C0785d.C0786a<C0830r> f4430g = new up6();

    /* renamed from: d */
    public final boolean f4431d;

    /* renamed from: e */
    public final boolean f4432e;

    public C0830r() {
        this.f4431d = false;
        this.f4432e = false;
    }

    /* renamed from: c */
    public static String m5766c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static C0830r m5768e(Bundle bundle) {
        boolean z;
        if (bundle.getInt(m5766c(0), -1) == 3) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20981a(z);
        if (bundle.getBoolean(m5766c(1), false)) {
            return new C0830r(bundle.getBoolean(m5766c(2), false));
        }
        return new C0830r();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0830r)) {
            return false;
        }
        C0830r rVar = (C0830r) obj;
        if (this.f4432e == rVar.f4432e && this.f4431d == rVar.f4431d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return jf4.m46497b(Boolean.valueOf(this.f4431d), Boolean.valueOf(this.f4432e));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5766c(0), 3);
        bundle.putBoolean(m5766c(1), this.f4431d);
        bundle.putBoolean(m5766c(2), this.f4432e);
        return bundle;
    }

    public C0830r(boolean z) {
        this.f4431d = true;
        this.f4432e = z;
    }
}
