package p000;

import java.io.IOException;
import p000.xs5;

/* renamed from: m10 */
/* compiled from: BinarySearchSeeker */
public abstract class m10 {

    /* renamed from: a */
    public final C2797a f14768a;

    /* renamed from: b */
    public final C2802f f14769b;

    /* renamed from: c */
    public C2799c f14770c;

    /* renamed from: d */
    public final int f14771d;

    /* renamed from: m10$a */
    /* compiled from: BinarySearchSeeker */
    public static class C2797a implements xs5 {

        /* renamed from: a */
        public final C2800d f14772a;

        /* renamed from: b */
        public final long f14773b;

        /* renamed from: c */
        public final long f14774c;

        /* renamed from: d */
        public final long f14775d;

        /* renamed from: e */
        public final long f14776e;

        /* renamed from: f */
        public final long f14777f;

        /* renamed from: g */
        public final long f14778g;

        public C2797a(C2800d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f14772a = dVar;
            this.f14773b = j;
            this.f14774c = j2;
            this.f14775d = j3;
            this.f14776e = j4;
            this.f14777f = j5;
            this.f14778g = j6;
        }

        /* renamed from: f */
        public xs5.C3641a mo11155f(long j) {
            return new xs5.C3641a(new zs5(j, C2799c.m21957h(this.f14772a.mo23009a(j), this.f14774c, this.f14775d, this.f14776e, this.f14777f, this.f14778g)));
        }

        /* renamed from: h */
        public boolean mo11156h() {
            return true;
        }

        /* renamed from: i */
        public long mo11157i() {
            return this.f14773b;
        }

        /* renamed from: k */
        public long mo23008k(long j) {
            return this.f14772a.mo23009a(j);
        }
    }

    /* renamed from: m10$b */
    /* compiled from: BinarySearchSeeker */
    public static final class C2798b implements C2800d {
        /* renamed from: a */
        public long mo23009a(long j) {
            return j;
        }
    }

    /* renamed from: m10$c */
    /* compiled from: BinarySearchSeeker */
    public static class C2799c {

        /* renamed from: a */
        public final long f14779a;

        /* renamed from: b */
        public final long f14780b;

        /* renamed from: c */
        public final long f14781c;

        /* renamed from: d */
        public long f14782d;

        /* renamed from: e */
        public long f14783e;

        /* renamed from: f */
        public long f14784f;

        /* renamed from: g */
        public long f14785g;

        /* renamed from: h */
        public long f14786h;

        public C2799c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f14779a = j;
            this.f14780b = j2;
            this.f14782d = j3;
            this.f14783e = j4;
            this.f14784f = j5;
            this.f14785g = j6;
            this.f14781c = j7;
            this.f14786h = m21957h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        public static long m21957h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return w67.m29376r(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* renamed from: i */
        public final long mo23010i() {
            return this.f14785g;
        }

        /* renamed from: j */
        public final long mo23011j() {
            return this.f14784f;
        }

        /* renamed from: k */
        public final long mo23012k() {
            return this.f14786h;
        }

        /* renamed from: l */
        public final long mo23013l() {
            return this.f14779a;
        }

        /* renamed from: m */
        public final long mo23014m() {
            return this.f14780b;
        }

        /* renamed from: n */
        public final void mo23015n() {
            this.f14786h = m21957h(this.f14780b, this.f14782d, this.f14783e, this.f14784f, this.f14785g, this.f14781c);
        }

        /* renamed from: o */
        public final void mo23016o(long j, long j2) {
            this.f14783e = j;
            this.f14785g = j2;
            mo23015n();
        }

        /* renamed from: p */
        public final void mo23017p(long j, long j2) {
            this.f14782d = j;
            this.f14784f = j2;
            mo23015n();
        }
    }

    /* renamed from: m10$d */
    /* compiled from: BinarySearchSeeker */
    public interface C2800d {
        /* renamed from: a */
        long mo23009a(long j);
    }

    /* renamed from: m10$e */
    /* compiled from: BinarySearchSeeker */
    public static final class C2801e {

        /* renamed from: d */
        public static final C2801e f14787d = new C2801e(-3, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, -1);

        /* renamed from: a */
        public final int f14788a;

        /* renamed from: b */
        public final long f14789b;

        /* renamed from: c */
        public final long f14790c;

        public C2801e(int i, long j, long j2) {
            this.f14788a = i;
            this.f14789b = j;
            this.f14790c = j2;
        }

        /* renamed from: d */
        public static C2801e m21970d(long j, long j2) {
            return new C2801e(-1, j, j2);
        }

        /* renamed from: e */
        public static C2801e m21971e(long j) {
            return new C2801e(0, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED, j);
        }

        /* renamed from: f */
        public static C2801e m21972f(long j, long j2) {
            return new C2801e(-2, j, j2);
        }
    }

    /* renamed from: m10$f */
    /* compiled from: BinarySearchSeeker */
    public interface C2802f {
        /* renamed from: a */
        C2801e mo19561a(iy1 iy1, long j) throws IOException;

        /* renamed from: b */
        void mo19562b();
    }

    public m10(C2800d dVar, C2802f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f14769b = fVar;
        this.f14771d = i;
        this.f14768a = new C2797a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public C2799c mo22999a(long j) {
        long j2 = j;
        return new C2799c(j2, this.f14768a.mo23008k(j2), this.f14768a.f14774c, this.f14768a.f14775d, this.f14768a.f14776e, this.f14768a.f14777f, this.f14768a.f14778g);
    }

    /* renamed from: b */
    public final xs5 mo23000b() {
        return this.f14768a;
    }

    /* renamed from: c */
    public int mo23001c(iy1 iy1, mt4 mt4) throws IOException {
        while (true) {
            C2799c cVar = (C2799c) C2725kr.m20989i(this.f14770c);
            long b = cVar.mo23011j();
            long c = cVar.mo23010i();
            long d = cVar.mo23012k();
            if (c - b <= ((long) this.f14771d)) {
                mo23003e(false, b);
                return mo23005g(iy1, b, mt4);
            } else if (!mo23007i(iy1, d)) {
                return mo23005g(iy1, d, mt4);
            } else {
                iy1.mo85e();
                C2801e a = this.f14769b.mo19561a(iy1, cVar.mo23014m());
                int a2 = a.f14788a;
                if (a2 == -3) {
                    mo23003e(false, d);
                    return mo23005g(iy1, d, mt4);
                } else if (a2 == -2) {
                    cVar.mo23017p(a.f14789b, a.f14790c);
                } else if (a2 == -1) {
                    cVar.mo23016o(a.f14789b, a.f14790c);
                } else if (a2 == 0) {
                    mo23007i(iy1, a.f14790c);
                    mo23003e(true, a.f14790c);
                    return mo23005g(iy1, a.f14790c, mt4);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* renamed from: d */
    public final boolean mo23002d() {
        if (this.f14770c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo23003e(boolean z, long j) {
        this.f14770c = null;
        this.f14769b.mo19562b();
        mo23004f(z, j);
    }

    /* renamed from: f */
    public void mo23004f(boolean z, long j) {
    }

    /* renamed from: g */
    public final int mo23005g(iy1 iy1, long j, mt4 mt4) {
        if (j == iy1.getPosition()) {
            return 0;
        }
        mt4.f15249a = j;
        return 1;
    }

    /* renamed from: h */
    public final void mo23006h(long j) {
        C2799c cVar = this.f14770c;
        if (cVar == null || cVar.mo23013l() != j) {
            this.f14770c = mo22999a(j);
        }
    }

    /* renamed from: i */
    public final boolean mo23007i(iy1 iy1, long j) throws IOException {
        long position = j - iy1.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        iy1.mo92k((int) position);
        return true;
    }
}
