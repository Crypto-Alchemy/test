package p000;

/* renamed from: j11 */
/* compiled from: DashWrappingSegmentIndex */
public final class j11 implements h11 {

    /* renamed from: a */
    public final se0 f13476a;

    /* renamed from: b */
    public final long f13477b;

    public j11(se0 se0, long j) {
        this.f13476a = se0;
        this.f13477b = j;
    }

    /* renamed from: c */
    public long mo20916c(long j) {
        return this.f13476a.f17661e[(int) j] - this.f13477b;
    }

    /* renamed from: d */
    public long mo20917d(long j, long j2) {
        return this.f13476a.f17660d[(int) j];
    }

    /* renamed from: e */
    public long mo20918e(long j, long j2) {
        return 0;
    }

    /* renamed from: f */
    public long mo20919f(long j, long j2) {
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: g */
    public b75 mo20920g(long j) {
        se0 se0 = this.f13476a;
        int i = (int) j;
        return new b75((String) null, se0.f17659c[i], (long) se0.f17658b[i]);
    }

    /* renamed from: h */
    public long mo20921h(long j, long j2) {
        return (long) this.f13476a.mo25764a(j + this.f13477b);
    }

    /* renamed from: i */
    public long mo20922i(long j) {
        return (long) this.f13476a.f17657a;
    }

    /* renamed from: j */
    public boolean mo20923j() {
        return true;
    }

    /* renamed from: k */
    public long mo20924k() {
        return 0;
    }

    /* renamed from: l */
    public long mo20925l(long j, long j2) {
        return (long) this.f13476a.f17657a;
    }
}
