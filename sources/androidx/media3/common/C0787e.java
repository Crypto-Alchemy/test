package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.C0785d;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* renamed from: androidx.media3.common.e */
/* compiled from: ColorInfo */
public final class C0787e implements C0785d {

    /* renamed from: r */
    public static final C0785d.C0786a<C0787e> f4157r = new yk0();

    /* renamed from: a */
    public final int f4158a;

    /* renamed from: d */
    public final int f4159d;

    /* renamed from: e */
    public final int f4160e;

    /* renamed from: g */
    public final byte[] f4161g;

    /* renamed from: k */
    public int f4162k;

    public C0787e(int i, int i2, int i3, byte[] bArr) {
        this.f4158a = i;
        this.f4159d = i2;
        this.f4160e = i3;
        this.f4161g = bArr;
    }

    @Pure
    /* renamed from: b */
    public static int m5330b(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* renamed from: c */
    public static int m5331c(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: d */
    public static String m5332d(int i) {
        return Integer.toString(i, 36);
    }

    /* renamed from: e */
    public static /* synthetic */ C0787e m5333e(Bundle bundle) {
        return new C0787e(bundle.getInt(m5332d(0), -1), bundle.getInt(m5332d(1), -1), bundle.getInt(m5332d(2), -1), bundle.getByteArray(m5332d(3)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0787e.class != obj.getClass()) {
            return false;
        }
        C0787e eVar = (C0787e) obj;
        if (this.f4158a == eVar.f4158a && this.f4159d == eVar.f4159d && this.f4160e == eVar.f4160e && Arrays.equals(this.f4161g, eVar.f4161g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f4162k == 0) {
            this.f4162k = ((((((527 + this.f4158a) * 31) + this.f4159d) * 31) + this.f4160e) * 31) + Arrays.hashCode(this.f4161g);
        }
        return this.f4162k;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5332d(0), this.f4158a);
        bundle.putInt(m5332d(1), this.f4159d);
        bundle.putInt(m5332d(2), this.f4160e);
        bundle.putByteArray(m5332d(3), this.f4161g);
        return bundle;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f4158a);
        sb.append(", ");
        sb.append(this.f4159d);
        sb.append(", ");
        sb.append(this.f4160e);
        sb.append(", ");
        if (this.f4161g != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
