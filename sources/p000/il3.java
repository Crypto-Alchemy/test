package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: il3 */
/* compiled from: LongSummaryStatistics */
public class il3 implements dl3, jw2 {

    /* renamed from: a */
    public long f29953a;

    /* renamed from: b */
    public long f29954b;

    /* renamed from: c */
    public long f29955c = Long.MAX_VALUE;

    /* renamed from: d */
    public long f29956d = Long.MIN_VALUE;

    /* renamed from: a */
    public final double mo43638a() {
        if (mo43639b() > 0) {
            return ((double) mo43642e()) / ((double) mo43639b());
        }
        return Utils.DOUBLE_EPSILON;
    }

    /* renamed from: b */
    public final long mo43639b() {
        return this.f29953a;
    }

    /* renamed from: c */
    public final long mo43640c() {
        return this.f29956d;
    }

    /* renamed from: d */
    public final long mo43641d() {
        return this.f29955c;
    }

    /* renamed from: e */
    public final long mo43642e() {
        return this.f29954b;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", new Object[]{getClass().getSimpleName(), Long.valueOf(mo43639b()), Long.valueOf(mo43642e()), Long.valueOf(mo43641d()), Double.valueOf(mo43638a()), Long.valueOf(mo43640c())});
    }
}
