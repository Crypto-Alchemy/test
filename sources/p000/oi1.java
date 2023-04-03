package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: oi1 */
/* compiled from: DoubleSummaryStatistics */
public class oi1 implements ni1 {

    /* renamed from: a */
    public long f32386a;

    /* renamed from: b */
    public double f32387b;

    /* renamed from: c */
    public double f32388c;

    /* renamed from: d */
    public double f32389d;

    /* renamed from: e */
    public double f32390e = Double.POSITIVE_INFINITY;

    /* renamed from: f */
    public double f32391f = Double.NEGATIVE_INFINITY;

    /* renamed from: a */
    public final double mo46413a() {
        if (mo46414b() > 0) {
            return mo46417e() / ((double) mo46414b());
        }
        return Utils.DOUBLE_EPSILON;
    }

    /* renamed from: b */
    public final long mo46414b() {
        return this.f32386a;
    }

    /* renamed from: c */
    public final double mo46415c() {
        return this.f32391f;
    }

    /* renamed from: d */
    public final double mo46416d() {
        return this.f32390e;
    }

    /* renamed from: e */
    public final double mo46417e() {
        double d = this.f32387b + this.f32388c;
        if (!Double.isNaN(d) || !Double.isInfinite(this.f32389d)) {
            return d;
        }
        return this.f32389d;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", new Object[]{getClass().getSimpleName(), Long.valueOf(mo46414b()), Double.valueOf(mo46417e()), Double.valueOf(mo46416d()), Double.valueOf(mo46413a()), Double.valueOf(mo46415c())});
    }
}
