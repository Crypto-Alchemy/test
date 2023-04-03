package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;

/* renamed from: androidx.media3.common.f */
/* compiled from: DeviceInfo */
public final class C0788f implements C0785d {

    /* renamed from: g */
    public static final C0788f f4163g = new C0788f(0, 0, 0);

    /* renamed from: k */
    public static final C0785d.C0786a<C0788f> f4164k = new je1();

    /* renamed from: a */
    public final int f4165a;

    /* renamed from: d */
    public final int f4166d;

    /* renamed from: e */
    public final int f4167e;

    public C0788f(int i, int i2, int i3) {
        this.f4165a = i;
        this.f4166d = i2;
        this.f4167e = i3;
    }

    /* renamed from: b */
    public static String m5335b(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: c */
    public static /* synthetic */ C0788f m5336c(Bundle bundle) {
        return new C0788f(bundle.getInt(m5335b(0), 0), bundle.getInt(m5335b(1), 0), bundle.getInt(m5335b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0788f)) {
            return false;
        }
        C0788f fVar = (C0788f) obj;
        if (this.f4165a == fVar.f4165a && this.f4166d == fVar.f4166d && this.f4167e == fVar.f4167e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f4165a) * 31) + this.f4166d) * 31) + this.f4167e;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5335b(0), this.f4165a);
        bundle.putInt(m5335b(1), this.f4166d);
        bundle.putInt(m5335b(2), this.f4167e);
        return bundle;
    }
}
