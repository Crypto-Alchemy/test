package p000;

import java.io.EOFException;
import java.io.IOException;
import p000.xs5;

/* renamed from: h91 */
/* compiled from: DefaultOggSeeker */
public final class h91 implements bg4 {

    /* renamed from: a */
    public final ag4 f12786a;

    /* renamed from: b */
    public final long f12787b;

    /* renamed from: c */
    public final long f12788c;

    /* renamed from: d */
    public final sa6 f12789d;

    /* renamed from: e */
    public int f12790e;

    /* renamed from: f */
    public long f12791f;

    /* renamed from: g */
    public long f12792g;

    /* renamed from: h */
    public long f12793h;

    /* renamed from: i */
    public long f12794i;

    /* renamed from: j */
    public long f12795j;

    /* renamed from: k */
    public long f12796k;

    /* renamed from: l */
    public long f12797l;

    /* renamed from: h91$b */
    /* compiled from: DefaultOggSeeker */
    public final class C2458b implements xs5 {
        public C2458b() {
        }

        /* renamed from: f */
        public xs5.C3641a mo11155f(long j) {
            return new xs5.C3641a(new zs5(j, w67.m29376r((h91.this.f12787b + ((h91.this.f12789d.mo25702c(j) * (h91.this.f12788c - h91.this.f12787b)) / h91.this.f12791f)) - 30000, h91.this.f12787b, h91.this.f12788c - 1)));
        }

        /* renamed from: h */
        public boolean mo11156h() {
            return true;
        }

        /* renamed from: i */
        public long mo11157i() {
            return h91.this.f12789d.mo25701b(h91.this.f12791f);
        }
    }

    public h91(sa6 sa6, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j < 0 || j2 <= j) {
            z2 = false;
        } else {
            z2 = true;
        }
        C2725kr.m20981a(z2);
        this.f12789d = sa6;
        this.f12787b = j;
        this.f12788c = j2;
        if (j3 == j2 - j || z) {
            this.f12791f = j4;
            this.f12790e = 4;
        } else {
            this.f12790e = 0;
        }
        this.f12786a = new ag4();
    }

    /* renamed from: b */
    public long mo11646b(iy1 iy1) throws IOException {
        int i = this.f12790e;
        if (i == 0) {
            long position = iy1.getPosition();
            this.f12792g = position;
            this.f12790e = 1;
            long j = this.f12788c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = mo21074i(iy1);
                if (i2 != -1) {
                    return i2;
                }
                this.f12790e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            mo21076k(iy1);
            this.f12790e = 4;
            return -(this.f12796k + 2);
        }
        this.f12791f = mo21075j(iy1);
        this.f12790e = 4;
        return this.f12792g;
    }

    /* renamed from: c */
    public void mo11647c(long j) {
        this.f12793h = w67.m29376r(j, 0, this.f12791f - 1);
        this.f12790e = 2;
        this.f12794i = this.f12787b;
        this.f12795j = this.f12788c;
        this.f12796k = 0;
        this.f12797l = this.f12791f;
    }

    /* renamed from: h */
    public C2458b mo11645a() {
        if (this.f12791f != 0) {
            return new C2458b();
        }
        return null;
    }

    /* renamed from: i */
    public final long mo21074i(iy1 iy1) throws IOException {
        long j;
        iy1 iy12 = iy1;
        if (this.f12794i == this.f12795j) {
            return -1;
        }
        long position = iy1.getPosition();
        if (!this.f12786a.mo307d(iy12, this.f12795j)) {
            long j2 = this.f12794i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f12786a.mo304a(iy12, false);
        iy1.mo85e();
        long j3 = this.f12793h;
        ag4 ag4 = this.f12786a;
        long j4 = ag4.f130c;
        long j5 = j3 - j4;
        int i = ag4.f135h + ag4.f136i;
        if (0 <= j5 && j5 < 72000) {
            return -1;
        }
        int i2 = (j5 > 0 ? 1 : (j5 == 0 ? 0 : -1));
        if (i2 < 0) {
            this.f12795j = position;
            this.f12797l = j4;
        } else {
            this.f12794i = iy1.getPosition() + ((long) i);
            this.f12796k = this.f12786a.f130c;
        }
        long j6 = this.f12795j;
        long j7 = this.f12794i;
        if (j6 - j7 < 100000) {
            this.f12795j = j7;
            return j7;
        }
        long j8 = (long) i;
        if (i2 <= 0) {
            j = 2;
        } else {
            j = 1;
        }
        long position2 = iy1.getPosition() - (j8 * j);
        long j9 = this.f12795j;
        long j10 = this.f12794i;
        return w67.m29376r(position2 + ((j5 * (j9 - j10)) / (this.f12797l - this.f12796k)), j10, j9 - 1);
    }

    /* renamed from: j */
    public long mo21075j(iy1 iy1) throws IOException {
        this.f12786a.mo305b();
        if (this.f12786a.mo306c(iy1)) {
            this.f12786a.mo304a(iy1, false);
            ag4 ag4 = this.f12786a;
            iy1.mo92k(ag4.f135h + ag4.f136i);
            long j = this.f12786a.f130c;
            while (true) {
                ag4 ag42 = this.f12786a;
                if ((ag42.f129b & 4) == 4 || !ag42.mo306c(iy1) || iy1.getPosition() >= this.f12788c || !this.f12786a.mo304a(iy1, true)) {
                    break;
                }
                ag4 ag43 = this.f12786a;
                if (!ky1.m21103e(iy1, ag43.f135h + ag43.f136i)) {
                    break;
                }
                j = this.f12786a.f130c;
            }
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: k */
    public final void mo21076k(iy1 iy1) throws IOException {
        while (true) {
            this.f12786a.mo306c(iy1);
            this.f12786a.mo304a(iy1, false);
            ag4 ag4 = this.f12786a;
            if (ag4.f130c > this.f12793h) {
                iy1.mo85e();
                return;
            }
            iy1.mo92k(ag4.f135h + ag4.f136i);
            this.f12794i = iy1.getPosition();
            this.f12796k = this.f12786a.f130c;
        }
    }
}
