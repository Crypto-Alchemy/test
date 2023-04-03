package p000;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.random.Random;
import p000.pw2;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0004\u001a\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0004\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0004\u001a\u0012\u0010\f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003\u001a\u0012\u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\u000b\u001a\u00020\r\u001a\u0012\u0010\u0010\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f\u001a\u0012\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\r\u001a\u0012\u0010\u0014\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u001a\u0010\u0015\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003\u001a\u001a\u0010\u0016\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u001a\u001a\u0010\u0018\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0017\u001a1\u0010\u001d\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0019*\u00028\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0018\u0010 \u001a\u00020\u0003*\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f¨\u0006!"}, mo44877d2 = {"Lrw2;", "Lkotlin/random/Random;", "random", "", "o", "to", "Lpw2;", "n", "step", "p", "q", "minimumValue", "d", "", "e", "", "c", "maximumValue", "g", "h", "f", "k", "j", "", "i", "", "T", "Luh0;", "range", "m", "(Ljava/lang/Comparable;Luh0;)Ljava/lang/Comparable;", "Lvh0;", "l", "kotlin-stdlib"}, mo44878k = 5, mo44879mv = {1, 7, 1}, mo44882xs = "kotlin/ranges/RangesKt")
/* renamed from: d75 */
/* compiled from: _Ranges.kt */
public class d75 extends c75 {
    /* renamed from: c */
    public static final float m43381c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: d */
    public static final int m43382d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: e */
    public static final long m43383e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: f */
    public static final float m43384f(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: g */
    public static final int m43385g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: h */
    public static final long m43386h(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: i */
    public static final double m43387i(double d, double d2, double d3) {
        if (d2 > d3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
        } else if (d < d2) {
            return d2;
        } else {
            if (d > d3) {
                return d3;
            }
            return d;
        }
    }

    /* renamed from: j */
    public static final float m43388j(float f, float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
        } else if (f < f2) {
            return f2;
        } else {
            if (f > f3) {
                return f3;
            }
            return f;
        }
    }

    /* renamed from: k */
    public static final int m43389k(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
        } else if (i < i2) {
            return i2;
        } else {
            if (i > i3) {
                return i3;
            }
            return i;
        }
    }

    /* renamed from: l */
    public static final int m43390l(int i, vh0<Integer> vh0) {
        vx2.m53591g(vh0, "range");
        if (vh0 instanceof uh0) {
            return ((Number) m43391m(Integer.valueOf(i), (uh0) vh0)).intValue();
        }
        if (vh0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + vh0 + '.');
        } else if (i < vh0.mo47512e().intValue()) {
            return vh0.mo47512e().intValue();
        } else {
            if (i > vh0.mo47513k().intValue()) {
                return vh0.mo47513k().intValue();
            }
            return i;
        }
    }

    /* renamed from: m */
    public static final <T extends Comparable<? super T>> T m43391m(T t, uh0<T> uh0) {
        vx2.m53591g(t, "<this>");
        vx2.m53591g(uh0, "range");
        if (uh0.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + uh0 + '.');
        } else if (uh0.mo48120j(t, uh0.mo47512e()) && !uh0.mo48120j(uh0.mo47512e(), t)) {
            return uh0.mo47512e();
        } else {
            if (!uh0.mo48120j(uh0.mo47513k(), t) || uh0.mo48120j(t, uh0.mo47513k())) {
                return t;
            }
            return uh0.mo47513k();
        }
    }

    /* renamed from: n */
    public static final pw2 m43392n(int i, int i2) {
        return pw2.f32851g.mo46915a(i, i2, -1);
    }

    /* renamed from: o */
    public static final int m43393o(rw2 rw2, Random random) {
        vx2.m53591g(rw2, "<this>");
        vx2.m53591g(random, "random");
        try {
            return a75.m31740f(random, rw2);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    /* renamed from: p */
    public static final pw2 m43394p(pw2 pw2, int i) {
        boolean z;
        vx2.m53591g(pw2, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        c75.m32860a(z, Integer.valueOf(i));
        pw2.C6378a aVar = pw2.f32851g;
        int n = pw2.mo46910n();
        int q = pw2.mo46911q();
        if (pw2.mo46912r() <= 0) {
            i = -i;
        }
        return aVar.mo46915a(n, q, i);
    }

    /* renamed from: q */
    public static final rw2 m43395q(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return rw2.f33621k.mo47516a();
        }
        return new rw2(i, i2 - 1);
    }
}
