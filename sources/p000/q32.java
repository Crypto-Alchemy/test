package p000;

import java.io.IOException;
import p000.m10;
import p000.t32;

/* renamed from: q32 */
/* compiled from: FlacBinarySearchSeeker */
public final class q32 extends m10 {

    /* renamed from: q32$b */
    /* compiled from: FlacBinarySearchSeeker */
    public static final class C3112b implements m10.C2802f {

        /* renamed from: a */
        public final x32 f16756a;

        /* renamed from: b */
        public final int f16757b;

        /* renamed from: c */
        public final t32.C3323a f16758c;

        /* renamed from: a */
        public m10.C2801e mo19561a(iy1 iy1, long j) throws IOException {
            long position = iy1.getPosition();
            long c = mo24907c(iy1);
            long h = iy1.mo89h();
            iy1.mo90i(Math.max(6, this.f16756a.f19299c));
            long c2 = mo24907c(iy1);
            long h2 = iy1.mo89h();
            if (c <= j && c2 > j) {
                return m10.C2801e.m21971e(h);
            }
            if (c2 <= j) {
                return m10.C2801e.m21972f(c2, h2);
            }
            return m10.C2801e.m21970d(c, position);
        }

        /* renamed from: b */
        public /* synthetic */ void mo19562b() {
            n10.m22732a(this);
        }

        /* renamed from: c */
        public final long mo24907c(iy1 iy1) throws IOException {
            while (iy1.mo89h() < iy1.getLength() - 6 && !t32.m27263h(iy1, this.f16756a, this.f16757b, this.f16758c)) {
                iy1.mo90i(1);
            }
            if (iy1.mo89h() < iy1.getLength() - 6) {
                return this.f16758c.f17884a;
            }
            iy1.mo90i((int) (iy1.getLength() - iy1.mo89h()));
            return this.f16756a.f19306j;
        }

        public C3112b(x32 x32, int i) {
            this.f16756a = x32;
            this.f16757b = i;
            this.f16758c = new t32.C3323a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q32(p000.x32 r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            p32 r1 = new p32
            r1.<init>(r0)
            q32$b r2 = new q32$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.mo27666f()
            long r7 = r0.f19306j
            long r13 = r17.mo27665d()
            int r0 = r0.f19299c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.q32.<init>(x32, int, long, long):void");
    }
}
