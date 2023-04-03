package p000;

import java.io.IOException;
import p000.m10;

/* renamed from: ey6 */
/* compiled from: TsBinarySearchSeeker */
public final class ey6 extends m10 {

    /* renamed from: ey6$a */
    /* compiled from: TsBinarySearchSeeker */
    public static final class C2257a implements m10.C2802f {

        /* renamed from: a */
        public final sq6 f11462a;

        /* renamed from: b */
        public final gm4 f11463b = new gm4();

        /* renamed from: c */
        public final int f11464c;

        /* renamed from: d */
        public final int f11465d;

        public C2257a(int i, sq6 sq6, int i2) {
            this.f11464c = i;
            this.f11462a = sq6;
            this.f11465d = i2;
        }

        /* renamed from: a */
        public m10.C2801e mo19561a(iy1 iy1, long j) throws IOException {
            long position = iy1.getPosition();
            int min = (int) Math.min((long) this.f11465d, iy1.getLength() - position);
            this.f11463b.mo20670L(min);
            iy1.mo94n(this.f11463b.mo20679d(), 0, min);
            return mo19563c(this.f11463b, j, position);
        }

        /* renamed from: b */
        public void mo19562b() {
            this.f11463b.mo20671M(w67.f19026f);
        }

        /* renamed from: c */
        public final m10.C2801e mo19563c(gm4 gm4, long j, long j2) {
            int a;
            int i;
            gm4 gm42 = gm4;
            long j3 = j2;
            int f = gm4.mo20681f();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (gm4.mo20676a() >= 188 && (i = a + 188) <= f) {
                long c = jy6.m20478c(gm42, (a = jy6.m20476a(gm4.mo20679d(), gm4.mo20680e(), f)), this.f11464c);
                if (c != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    long b = this.f11462a.mo25933b(c);
                    if (b > j) {
                        if (j6 == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                            return m10.C2801e.m21970d(b, j3);
                        }
                        return m10.C2801e.m21971e(j3 + j5);
                    } else if (100000 + b > j) {
                        return m10.C2801e.m21971e(j3 + ((long) a));
                    } else {
                        j5 = (long) a;
                        j6 = b;
                    }
                }
                gm42.mo20674P(i);
                j4 = (long) i;
            }
            if (j6 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                return m10.C2801e.m21972f(j6, j3 + j4);
            }
            return m10.C2801e.f14787d;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ey6(p000.sq6 r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            m10$b r1 = new m10$b
            r1.<init>()
            ey6$a r2 = new ey6$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ey6.<init>(sq6, long, long, int, int):void");
    }
}
