package p000;

import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.List;

/* renamed from: s68 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class s68 implements r88 {

    /* renamed from: a */
    public final boolean f33756a;

    public s68(Boolean bool) {
        if (bool == null) {
            this.f33756a = false;
        } else {
            this.f33756a = bool.booleanValue();
        }
    }

    /* renamed from: b */
    public final Double mo29499b() {
        double d;
        if (true != this.f33756a) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: c */
    public final Boolean mo29500c() {
        return Boolean.valueOf(this.f33756a);
    }

    /* renamed from: e */
    public final Iterator<r88> mo29501e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s68) && this.f33756a == ((s68) obj).f33756a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f33756a).hashCode();
    }

    /* renamed from: n */
    public final r88 mo29505n() {
        return new s68(Boolean.valueOf(this.f33756a));
    }

    /* renamed from: o */
    public final r88 mo29506o(String str, ps8 ps8, List<r88> list) {
        if ("toString".equals(str)) {
            return new b98(Boolean.toString(this.f33756a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f33756a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f33756a);
    }

    public final String zzc() {
        return Boolean.toString(this.f33756a);
    }
}
