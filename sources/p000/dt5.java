package p000;

import androidx.media3.common.C0792h;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* renamed from: dt5 */
/* compiled from: SegmentBase */
public abstract class dt5 {

    /* renamed from: a */
    public final b75 f10855a;

    /* renamed from: b */
    public final long f10856b;

    /* renamed from: c */
    public final long f10857c;

    /* renamed from: dt5$a */
    /* compiled from: SegmentBase */
    public static abstract class C2197a extends dt5 {

        /* renamed from: d */
        public final long f10858d;

        /* renamed from: e */
        public final long f10859e;

        /* renamed from: f */
        public final List<C2200d> f10860f;

        /* renamed from: g */
        public final long f10861g;

        /* renamed from: h */
        public final long f10862h;

        /* renamed from: i */
        public final long f10863i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2197a(b75 b75, long j, long j2, long j3, long j4, List<C2200d> list, long j5, long j6, long j7) {
            super(b75, j, j2);
            this.f10858d = j3;
            this.f10859e = j4;
            this.f10860f = list;
            this.f10863i = j5;
            this.f10861g = j6;
            this.f10862h = j7;
        }

        /* renamed from: c */
        public long mo18931c(long j, long j2) {
            long g = mo18935g(j);
            if (g != -1) {
                return g;
            }
            return (long) ((int) (mo18937i((j2 - this.f10862h) + this.f10863i, j) - mo18932d(j, j2)));
        }

        /* renamed from: d */
        public long mo18932d(long j, long j2) {
            if (mo18935g(j) == -1) {
                long j3 = this.f10861g;
                if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    return Math.max(mo18933e(), mo18937i((j2 - this.f10862h) - j3, j));
                }
            }
            return mo18933e();
        }

        /* renamed from: e */
        public long mo18933e() {
            return this.f10858d;
        }

        /* renamed from: f */
        public long mo18934f(long j, long j2) {
            if (this.f10860f != null) {
                return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
            }
            long d = mo18932d(j, j2) + mo18931c(j, j2);
            return (mo18938j(d) + mo18936h(d, j)) - this.f10863i;
        }

        /* renamed from: g */
        public abstract long mo18935g(long j);

        /* renamed from: h */
        public final long mo18936h(long j, long j2) {
            List<C2200d> list = this.f10860f;
            if (list != null) {
                return (list.get((int) (j - this.f10858d)).f10869b * 1000000) / this.f10856b;
            }
            long g = mo18935g(j2);
            if (g == -1 || j != (mo18933e() + g) - 1) {
                return (this.f10859e * 1000000) / this.f10856b;
            }
            return j2 - mo18938j(j);
        }

        /* renamed from: i */
        public long mo18937i(long j, long j2) {
            long e = mo18933e();
            long g = mo18935g(j2);
            if (g == 0) {
                return e;
            }
            if (this.f10860f == null) {
                long j3 = this.f10858d + (j / ((this.f10859e * 1000000) / this.f10856b));
                if (j3 < e) {
                    return e;
                }
                if (g == -1) {
                    return j3;
                }
                return Math.min(j3, (e + g) - 1);
            }
            long j4 = (g + e) - 1;
            long j5 = e;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (mo18938j(j6) > j ? 1 : (mo18938j(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i <= 0) {
                    return j6;
                } else {
                    j4 = j6 - 1;
                }
            }
            if (j5 == e) {
                return j5;
            }
            return j4;
        }

        /* renamed from: j */
        public final long mo18938j(long j) {
            long j2;
            List<C2200d> list = this.f10860f;
            if (list != null) {
                j2 = list.get((int) (j - this.f10858d)).f10868a - this.f10857c;
            } else {
                j2 = (j - this.f10858d) * this.f10859e;
            }
            return w67.m29313J0(j2, 1000000, this.f10856b);
        }

        /* renamed from: k */
        public abstract b75 mo18939k(xd5 xd5, long j);

        /* renamed from: l */
        public boolean mo18940l() {
            if (this.f10860f != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: dt5$b */
    /* compiled from: SegmentBase */
    public static final class C2198b extends C2197a {

        /* renamed from: j */
        public final List<b75> f10864j;

        public C2198b(b75 b75, long j, long j2, long j3, long j4, List<C2200d> list, long j5, List<b75> list2, long j6, long j7) {
            super(b75, j, j2, j3, j4, list, j5, j6, j7);
            this.f10864j = list2;
        }

        /* renamed from: g */
        public long mo18935g(long j) {
            return (long) this.f10864j.size();
        }

        /* renamed from: k */
        public b75 mo18939k(xd5 xd5, long j) {
            return this.f10864j.get((int) (j - this.f10858d));
        }

        /* renamed from: l */
        public boolean mo18940l() {
            return true;
        }
    }

    /* renamed from: dt5$c */
    /* compiled from: SegmentBase */
    public static final class C2199c extends C2197a {

        /* renamed from: j */
        public final o57 f10865j;

        /* renamed from: k */
        public final o57 f10866k;

        /* renamed from: l */
        public final long f10867l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2199c(b75 b75, long j, long j2, long j3, long j4, long j5, List<C2200d> list, long j6, o57 o57, o57 o572, long j7, long j8) {
            super(b75, j, j2, j3, j5, list, j6, j7, j8);
            this.f10865j = o57;
            this.f10866k = o572;
            this.f10867l = j4;
        }

        /* renamed from: a */
        public b75 mo18929a(xd5 xd5) {
            o57 o57 = this.f10865j;
            if (o57 == null) {
                return dt5.super.mo18929a(xd5);
            }
            C0792h hVar = xd5.f19810b;
            return new b75(o57.mo23907a(hVar.f4186a, 0, hVar.f4203x, 0), 0, -1);
        }

        /* renamed from: g */
        public long mo18935g(long j) {
            List<C2200d> list = this.f10860f;
            if (list != null) {
                return (long) list.size();
            }
            long j2 = this.f10867l;
            if (j2 != -1) {
                return (j2 - this.f10858d) + 1;
            }
            if (j != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return h10.m45007a(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f10856b)), BigInteger.valueOf(this.f10859e).multiply(BigInteger.valueOf(1000000)), RoundingMode.CEILING).longValue();
            }
            return -1;
        }

        /* renamed from: k */
        public b75 mo18939k(xd5 xd5, long j) {
            long j2;
            List<C2200d> list = this.f10860f;
            if (list != null) {
                j2 = list.get((int) (j - this.f10858d)).f10868a;
            } else {
                j2 = (j - this.f10858d) * this.f10859e;
            }
            long j3 = j2;
            o57 o57 = this.f10866k;
            C0792h hVar = xd5.f19810b;
            return new b75(o57.mo23907a(hVar.f4186a, j, hVar.f4203x, j3), 0, -1);
        }
    }

    /* renamed from: dt5$d */
    /* compiled from: SegmentBase */
    public static final class C2200d {

        /* renamed from: a */
        public final long f10868a;

        /* renamed from: b */
        public final long f10869b;

        public C2200d(long j, long j2) {
            this.f10868a = j;
            this.f10869b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2200d.class != obj.getClass()) {
                return false;
            }
            C2200d dVar = (C2200d) obj;
            if (this.f10868a == dVar.f10868a && this.f10869b == dVar.f10869b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f10868a) * 31) + ((int) this.f10869b);
        }
    }

    public dt5(b75 b75, long j, long j2) {
        this.f10855a = b75;
        this.f10856b = j;
        this.f10857c = j2;
    }

    /* renamed from: a */
    public b75 mo18929a(xd5 xd5) {
        return this.f10855a;
    }

    /* renamed from: b */
    public long mo18930b() {
        return w67.m29313J0(this.f10857c, 1000000, this.f10856b);
    }

    /* renamed from: dt5$e */
    /* compiled from: SegmentBase */
    public static class C2201e extends dt5 {

        /* renamed from: d */
        public final long f10870d;

        /* renamed from: e */
        public final long f10871e;

        public C2201e(b75 b75, long j, long j2, long j3, long j4) {
            super(b75, j, j2);
            this.f10870d = j3;
            this.f10871e = j4;
        }

        /* renamed from: c */
        public b75 mo18943c() {
            long j = this.f10871e;
            if (j <= 0) {
                return null;
            }
            return new b75((String) null, this.f10870d, j);
        }

        public C2201e() {
            this((b75) null, 1, 0, 0, 0);
        }
    }
}
