package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: ww2 */
/* compiled from: IntSummaryStatistics */
public class ww2 implements jw2 {

    /* renamed from: a */
    public long f35457a;

    /* renamed from: b */
    public long f35458b;

    /* renamed from: c */
    public int f35459c = Integer.MAX_VALUE;

    /* renamed from: d */
    public int f35460d = Integer.MIN_VALUE;

    /* renamed from: a */
    public final double mo49300a() {
        if (mo49301b() > 0) {
            return ((double) mo49304e()) / ((double) mo49301b());
        }
        return Utils.DOUBLE_EPSILON;
    }

    /* renamed from: b */
    public final long mo49301b() {
        return this.f35457a;
    }

    /* renamed from: c */
    public final int mo49302c() {
        return this.f35460d;
    }

    /* renamed from: d */
    public final int mo49303d() {
        return this.f35459c;
    }

    /* renamed from: e */
    public final long mo49304e() {
        return this.f35458b;
    }

    public String toString() {
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", new Object[]{getClass().getSimpleName(), Long.valueOf(mo49301b()), Long.valueOf(mo49304e()), Integer.valueOf(mo49303d()), Double.valueOf(mo49300a()), Integer.valueOf(mo49302c())});
    }
}
