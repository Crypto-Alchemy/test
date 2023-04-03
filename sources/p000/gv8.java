package p000;

import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.internal.measurement.zzbl;
import java.util.List;

/* renamed from: gv8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class gv8 {
    /* renamed from: a */
    public static void m44946a(String str, int i, List<r88> list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: b */
    public static void m44947b(String str, int i, List<r88> list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: c */
    public static void m44948c(String str, int i, List<r88> list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    /* renamed from: d */
    public static boolean m44949d(r88 r88) {
        if (r88 == null) {
            return false;
        }
        Double b = r88.mo29499b();
        if (b.isNaN() || b.doubleValue() < Utils.DOUBLE_EPSILON || !b.equals(Double.valueOf(Math.floor(b.doubleValue())))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static zzbl m44950e(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.zza(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", new Object[]{str}));
    }

    /* renamed from: f */
    public static boolean m44951f(r88 r88, r88 r882) {
        if (!r88.getClass().equals(r882.getClass())) {
            return false;
        }
        if ((r88 instanceof f98) || (r88 instanceof i88)) {
            return true;
        }
        if (r88 instanceof e78) {
            if (Double.isNaN(r88.mo29499b().doubleValue()) || Double.isNaN(r882.mo29499b().doubleValue())) {
                return false;
            }
            return r88.mo29499b().equals(r882.mo29499b());
        } else if (r88 instanceof b98) {
            return r88.zzc().equals(r882.zzc());
        } else {
            if (r88 instanceof s68) {
                return r88.mo29500c().equals(r882.mo29500c());
            }
            if (r88 == r882) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public static int m44952g(double d) {
        int i;
        int i2;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == Utils.DOUBLE_EPSILON) {
            return 0;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return (int) ((long) ((((double) i2) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    /* renamed from: h */
    public static long m44953h(double d) {
        return ((long) m44952g(d)) & 4294967295L;
    }

    /* renamed from: i */
    public static double m44954i(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return Utils.DOUBLE_EPSILON;
        }
        if (Double.isInfinite(d) || d == Utils.DOUBLE_EPSILON || i == 0) {
            return d;
        }
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        return ((double) i2) * Math.floor(Math.abs(d));
    }

    /* renamed from: j */
    public static Object m44955j(r88 r88) {
        if (r88.f33331h1.equals(r88)) {
            return null;
        }
        if (r88.f33330g1.equals(r88)) {
            return "";
        }
        if (!r88.mo29499b().isNaN()) {
            return r88.mo29499b();
        }
        return r88.zzc();
    }

    /* renamed from: k */
    public static int m44956k(ps8 ps8) {
        int g = m44952g(ps8.mo46872h("runtime.counter").mo29499b().doubleValue() + 1.0d);
        if (g <= 1000000) {
            ps8.mo46869e("runtime.counter", new e78(Double.valueOf((double) g)));
            return g;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
}
