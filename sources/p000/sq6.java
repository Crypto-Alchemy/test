package p000;

/* renamed from: sq6 */
/* compiled from: TimestampAdjuster */
public final class sq6 {

    /* renamed from: a */
    public long f17775a;

    /* renamed from: b */
    public long f17776b;

    /* renamed from: c */
    public long f17777c;

    /* renamed from: d */
    public final ThreadLocal<Long> f17778d = new ThreadLocal<>();

    public sq6(long j) {
        mo25937g(j);
    }

    /* renamed from: f */
    public static long m27073f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: h */
    public static long m27074h(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public synchronized long mo25932a(long j) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        if (this.f17776b == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            long j2 = this.f17775a;
            if (j2 == 9223372036854775806L) {
                j2 = ((Long) C2725kr.m20985e(this.f17778d.get())).longValue();
            }
            this.f17776b = j2 - j;
            notifyAll();
        }
        this.f17777c = j;
        return j + this.f17776b;
    }

    /* renamed from: b */
    public synchronized long mo25933b(long j) {
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        long j2 = this.f17777c;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            long h = m27074h(j2);
            long j3 = (4294967296L + h) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - h) < Math.abs(j - h)) {
                j = j4;
            }
        }
        return mo25932a(m27073f(j));
    }

    /* renamed from: c */
    public synchronized long mo25934c() {
        long j;
        j = this.f17775a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return j;
    }

    /* renamed from: d */
    public synchronized long mo25935d() {
        long j;
        long j2 = this.f17777c;
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = j2 + this.f17776b;
        } else {
            j = mo25934c();
        }
        return j;
    }

    /* renamed from: e */
    public synchronized long mo25936e() {
        return this.f17776b;
    }

    /* renamed from: g */
    public synchronized void mo25937g(long j) {
        long j2;
        this.f17775a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f17776b = j2;
        this.f17777c = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
