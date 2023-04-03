package p000;

import java.io.IOException;
import p000.m10;

/* renamed from: oy4 */
/* compiled from: PsBinarySearchSeeker */
public final class oy4 extends m10 {

    /* renamed from: oy4$b */
    /* compiled from: PsBinarySearchSeeker */
    public static final class C3017b implements m10.C2802f {

        /* renamed from: a */
        public final sq6 f16252a;

        /* renamed from: b */
        public final gm4 f16253b;

        /* renamed from: d */
        public static void m24443d(gm4 gm4) {
            int f = gm4.mo20681f();
            if (gm4.mo20676a() < 10) {
                gm4.mo20674P(f);
                return;
            }
            gm4.mo20675Q(9);
            int D = gm4.mo20662D() & 7;
            if (gm4.mo20676a() < D) {
                gm4.mo20674P(f);
                return;
            }
            gm4.mo20675Q(D);
            if (gm4.mo20676a() < 4) {
                gm4.mo20674P(f);
                return;
            }
            if (oy4.m24442k(gm4.mo20679d(), gm4.mo20680e()) == 443) {
                gm4.mo20675Q(4);
                int J = gm4.mo20668J();
                if (gm4.mo20676a() < J) {
                    gm4.mo20674P(f);
                    return;
                }
                gm4.mo20675Q(J);
            }
            while (gm4.mo20676a() >= 4 && (r1 = oy4.m24442k(gm4.mo20679d(), gm4.mo20680e())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                gm4.mo20675Q(4);
                if (gm4.mo20676a() < 2) {
                    gm4.mo20674P(f);
                    return;
                } else {
                    gm4.mo20674P(Math.min(gm4.mo20681f(), gm4.mo20680e() + gm4.mo20668J()));
                }
            }
        }

        /* renamed from: a */
        public m10.C2801e mo19561a(iy1 iy1, long j) throws IOException {
            long position = iy1.getPosition();
            int min = (int) Math.min(20000, iy1.getLength() - position);
            this.f16253b.mo20670L(min);
            iy1.mo94n(this.f16253b.mo20679d(), 0, min);
            return mo24298c(this.f16253b, j, position);
        }

        /* renamed from: b */
        public void mo19562b() {
            this.f16253b.mo20671M(w67.f19026f);
        }

        /* renamed from: c */
        public final m10.C2801e mo24298c(gm4 gm4, long j, long j2) {
            int i = -1;
            int i2 = -1;
            long j3 = -9223372036854775807L;
            while (gm4.mo20676a() >= 4) {
                if (oy4.m24442k(gm4.mo20679d(), gm4.mo20680e()) != 442) {
                    gm4.mo20675Q(1);
                } else {
                    gm4.mo20675Q(4);
                    long l = py4.m25226l(gm4);
                    if (l != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                        long b = this.f16252a.mo25933b(l);
                        if (b > j) {
                            if (j3 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                                return m10.C2801e.m21970d(b, j2);
                            }
                            return m10.C2801e.m21971e(j2 + ((long) i2));
                        } else if (100000 + b > j) {
                            return m10.C2801e.m21971e(j2 + ((long) gm4.mo20680e()));
                        } else {
                            i2 = gm4.mo20680e();
                            j3 = b;
                        }
                    }
                    m24443d(gm4);
                    i = gm4.mo20680e();
                }
            }
            if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return m10.C2801e.m21972f(j3, j2 + ((long) i));
            }
            return m10.C2801e.f14787d;
        }

        public C3017b(sq6 sq6) {
            this.f16252a = sq6;
            this.f16253b = new gm4();
        }
    }

    public oy4(sq6 sq6, long j, long j2) {
        super(new m10.C2798b(), new C3017b(sq6), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* renamed from: k */
    public static int m24442k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
