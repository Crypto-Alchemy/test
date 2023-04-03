package p000;

import java.io.IOException;

/* renamed from: py4 */
/* compiled from: PsDurationReader */
public final class py4 {

    /* renamed from: a */
    public final sq6 f16669a = new sq6(0);

    /* renamed from: b */
    public final gm4 f16670b = new gm4();

    /* renamed from: c */
    public boolean f16671c;

    /* renamed from: d */
    public boolean f16672d;

    /* renamed from: e */
    public boolean f16673e;

    /* renamed from: f */
    public long f16674f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: g */
    public long f16675g = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: h */
    public long f16676h = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;

    /* renamed from: a */
    public static boolean m25225a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static long m25226l(gm4 gm4) {
        int e = gm4.mo20680e();
        if (gm4.mo20676a() < 9) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        byte[] bArr = new byte[9];
        gm4.mo20685j(bArr, 0, 9);
        gm4.mo20674P(e);
        if (!m25225a(bArr)) {
            return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return m25227m(bArr);
    }

    /* renamed from: m */
    public static long m25227m(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[2];
        return (((((long) b) & 56) >> 3) << 30) | ((((long) b) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) b2) & 248) >> 3) << 15) | ((((long) b2) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* renamed from: b */
    public final int mo24810b(iy1 iy1) {
        this.f16670b.mo20671M(w67.f19026f);
        this.f16671c = true;
        iy1.mo85e();
        return 0;
    }

    /* renamed from: c */
    public long mo24811c() {
        return this.f16676h;
    }

    /* renamed from: d */
    public sq6 mo24812d() {
        return this.f16669a;
    }

    /* renamed from: e */
    public boolean mo24813e() {
        return this.f16671c;
    }

    /* renamed from: f */
    public final int mo24814f(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: g */
    public int mo24815g(iy1 iy1, mt4 mt4) throws IOException {
        if (!this.f16673e) {
            return mo24818j(iy1, mt4);
        }
        if (this.f16675g == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return mo24810b(iy1);
        }
        if (!this.f16672d) {
            return mo24816h(iy1, mt4);
        }
        long j = this.f16674f;
        if (j == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return mo24810b(iy1);
        }
        long b = this.f16669a.mo25933b(this.f16675g) - this.f16669a.mo25933b(j);
        this.f16676h = b;
        if (b < 0) {
            gk3.m18132i("PsDurationReader", "Invalid duration: " + this.f16676h + ". Using TIME_UNSET instead.");
            this.f16676h = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        return mo24810b(iy1);
    }

    /* renamed from: h */
    public final int mo24816h(iy1 iy1, mt4 mt4) throws IOException {
        int min = (int) Math.min(20000, iy1.getLength());
        long j = (long) 0;
        if (iy1.getPosition() != j) {
            mt4.f15249a = j;
            return 1;
        }
        this.f16670b.mo20670L(min);
        iy1.mo85e();
        iy1.mo94n(this.f16670b.mo20679d(), 0, min);
        this.f16674f = mo24817i(this.f16670b);
        this.f16672d = true;
        return 0;
    }

    /* renamed from: i */
    public final long mo24817i(gm4 gm4) {
        int f = gm4.mo20681f();
        for (int e = gm4.mo20680e(); e < f - 3; e++) {
            if (mo24814f(gm4.mo20679d(), e) == 442) {
                gm4.mo20674P(e + 4);
                long l = m25226l(gm4);
                if (l != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    return l;
                }
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }

    /* renamed from: j */
    public final int mo24818j(iy1 iy1, mt4 mt4) throws IOException {
        long length = iy1.getLength();
        int min = (int) Math.min(20000, length);
        long j = length - ((long) min);
        if (iy1.getPosition() != j) {
            mt4.f15249a = j;
            return 1;
        }
        this.f16670b.mo20670L(min);
        iy1.mo85e();
        iy1.mo94n(this.f16670b.mo20679d(), 0, min);
        this.f16675g = mo24819k(this.f16670b);
        this.f16673e = true;
        return 0;
    }

    /* renamed from: k */
    public final long mo24819k(gm4 gm4) {
        int e = gm4.mo20680e();
        for (int f = gm4.mo20681f() - 4; f >= e; f--) {
            if (mo24814f(gm4.mo20679d(), f) == 442) {
                gm4.mo20674P(f + 4);
                long l = m25226l(gm4);
                if (l != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    return l;
                }
            }
        }
        return CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
    }
}
