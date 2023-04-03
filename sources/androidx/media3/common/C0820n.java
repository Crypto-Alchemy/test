package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.media3.common.n */
/* compiled from: PlaybackParameters */
public final class C0820n implements C0785d {

    /* renamed from: g */
    public static final C0820n f4404g = new C0820n(1.0f);

    /* renamed from: k */
    public static final C0785d.C0786a<C0820n> f4405k = new aq4();

    /* renamed from: a */
    public final float f4406a;

    /* renamed from: d */
    public final float f4407d;

    /* renamed from: e */
    public final int f4408e;

    public C0820n(float f) {
        this(f, 1.0f);
    }

    /* renamed from: c */
    public static String m5654c(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: d */
    public static /* synthetic */ C0820n m5655d(Bundle bundle) {
        return new C0820n(bundle.getFloat(m5654c(0), 1.0f), bundle.getFloat(m5654c(1), 1.0f));
    }

    /* renamed from: b */
    public long mo6837b(long j) {
        return j * ((long) this.f4408e);
    }

    /* renamed from: e */
    public C0820n mo6838e(float f) {
        return new C0820n(f, this.f4407d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0820n.class != obj.getClass()) {
            return false;
        }
        C0820n nVar = (C0820n) obj;
        if (this.f4406a == nVar.f4406a && this.f4407d == nVar.f4407d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f4406a)) * 31) + Float.floatToRawIntBits(this.f4407d);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(m5654c(0), this.f4406a);
        bundle.putFloat(m5654c(1), this.f4407d);
        return bundle;
    }

    public String toString() {
        return w67.m29294A("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f4406a), Float.valueOf(this.f4407d));
    }

    public C0820n(float f, float f2) {
        boolean z = true;
        C2725kr.m20981a(f > Utils.FLOAT_EPSILON);
        C2725kr.m20981a(f2 <= Utils.FLOAT_EPSILON ? false : z);
        this.f4406a = f;
        this.f4407d = f2;
        this.f4408e = Math.round(f * 1000.0f);
    }
}
