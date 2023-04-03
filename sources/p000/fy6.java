package p000;

import java.io.IOException;

/* renamed from: fy6 */
/* compiled from: TsDurationReader */
public final class fy6 {

    /* renamed from: a */
    public final int f12106a;

    /* renamed from: b */
    public final sq6 f12107b = new sq6(0);

    /* renamed from: c */
    public final gm4 f12108c = new gm4();

    /* renamed from: d */
    public boolean f12109d;

    /* renamed from: e */
    public boolean f12110e;

    /* renamed from: f */
    public boolean f12111f;

    /* renamed from: g */
    public long f12112g = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: h */
    public long f12113h = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: i */
    public long f12114i = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    public fy6(int i) {
        this.f12106a = i;
    }

    /* renamed from: a */
    public final int mo20266a(iy1 iy1) {
        this.f12108c.mo20671M(w67.f19026f);
        this.f12109d = true;
        iy1.mo85e();
        return 0;
    }

    /* renamed from: b */
    public long mo20267b() {
        return this.f12114i;
    }

    /* renamed from: c */
    public sq6 mo20268c() {
        return this.f12107b;
    }

    /* renamed from: d */
    public boolean mo20269d() {
        return this.f12109d;
    }

    /* renamed from: e */
    public int mo20270e(iy1 iy1, mt4 mt4, int i) throws IOException {
        if (i <= 0) {
            return mo20266a(iy1);
        }
        if (!this.f12111f) {
            return mo20273h(iy1, mt4, i);
        }
        if (this.f12113h == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return mo20266a(iy1);
        }
        if (!this.f12110e) {
            return mo20271f(iy1, mt4, i);
        }
        long j = this.f12112g;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return mo20266a(iy1);
        }
        long b = this.f12107b.mo25933b(this.f12113h) - this.f12107b.mo25933b(j);
        this.f12114i = b;
        if (b < 0) {
            gk3.m18132i("TsDurationReader", "Invalid duration: " + this.f12114i + ". Using TIME_UNSET instead.");
            this.f12114i = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return mo20266a(iy1);
    }

    /* renamed from: f */
    public final int mo20271f(iy1 iy1, mt4 mt4, int i) throws IOException {
        int min = (int) Math.min((long) this.f12106a, iy1.getLength());
        long j = (long) 0;
        if (iy1.getPosition() != j) {
            mt4.f15249a = j;
            return 1;
        }
        this.f12108c.mo20670L(min);
        iy1.mo85e();
        iy1.mo94n(this.f12108c.mo20679d(), 0, min);
        this.f12112g = mo20272g(this.f12108c, i);
        this.f12110e = true;
        return 0;
    }

    /* renamed from: g */
    public final long mo20272g(gm4 gm4, int i) {
        int f = gm4.mo20681f();
        for (int e = gm4.mo20680e(); e < f; e++) {
            if (gm4.mo20679d()[e] == 71) {
                long c = jy6.m20478c(gm4, e, i);
                if (c != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    return c;
                }
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: h */
    public final int mo20273h(iy1 iy1, mt4 mt4, int i) throws IOException {
        long length = iy1.getLength();
        int min = (int) Math.min((long) this.f12106a, length);
        long j = length - ((long) min);
        if (iy1.getPosition() != j) {
            mt4.f15249a = j;
            return 1;
        }
        this.f12108c.mo20670L(min);
        iy1.mo85e();
        iy1.mo94n(this.f12108c.mo20679d(), 0, min);
        this.f12113h = mo20274i(this.f12108c, i);
        this.f12111f = true;
        return 0;
    }

    /* renamed from: i */
    public final long mo20274i(gm4 gm4, int i) {
        int e = gm4.mo20680e();
        int f = gm4.mo20681f();
        for (int i2 = f - 188; i2 >= e; i2--) {
            if (jy6.m20477b(gm4.mo20679d(), e, f, i2)) {
                long c = jy6.m20478c(gm4, i2, i);
                if (c != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    return c;
                }
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
