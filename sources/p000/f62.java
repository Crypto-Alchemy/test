package p000;

import androidx.media3.extractor.flv.C1034a;
import androidx.media3.extractor.flv.C1035b;
import java.io.IOException;
import net.sqlcipher.database.SQLiteDatabase;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.xs5;

/* renamed from: f62 */
/* compiled from: FlvExtractor */
public final class f62 implements hy1 {

    /* renamed from: q */
    public static final ny1 f11538q = new e62();

    /* renamed from: a */
    public final gm4 f11539a = new gm4(4);

    /* renamed from: b */
    public final gm4 f11540b = new gm4(9);

    /* renamed from: c */
    public final gm4 f11541c = new gm4(11);

    /* renamed from: d */
    public final gm4 f11542d = new gm4();

    /* renamed from: e */
    public final qn5 f11543e = new qn5();

    /* renamed from: f */
    public jy1 f11544f;

    /* renamed from: g */
    public int f11545g = 1;

    /* renamed from: h */
    public boolean f11546h;

    /* renamed from: i */
    public long f11547i;

    /* renamed from: j */
    public int f11548j;

    /* renamed from: k */
    public int f11549k;

    /* renamed from: l */
    public int f11550l;

    /* renamed from: m */
    public long f11551m;

    /* renamed from: n */
    public boolean f11552n;

    /* renamed from: o */
    public C1034a f11553o;

    /* renamed from: p */
    public C1035b f11554p;

    /* renamed from: h */
    public static /* synthetic */ hy1[] m16614h() {
        return new hy1[]{new f62()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        if (j == 0) {
            this.f11545g = 1;
            this.f11546h = false;
        } else {
            this.f11545g = 3;
        }
        this.f11548j = 0;
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        C2725kr.m20989i(this.f11544f);
        while (true) {
            int i = this.f11545g;
            if (i != 1) {
                if (i == 2) {
                    mo19705n(iy1);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    } else if (mo19703l(iy1)) {
                        return 0;
                    }
                } else if (!mo19704m(iy1)) {
                    return -1;
                }
            } else if (!mo19702k(iy1)) {
                return -1;
            }
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        iy1.mo94n(this.f11539a.mo20679d(), 0, 3);
        this.f11539a.mo20674P(0);
        if (this.f11539a.mo20665G() != 4607062) {
            return false;
        }
        iy1.mo94n(this.f11539a.mo20679d(), 0, 2);
        this.f11539a.mo20674P(0);
        if ((this.f11539a.mo20668J() & SQLiteDatabase.MAX_SQL_CACHE_SIZE) != 0) {
            return false;
        }
        iy1.mo94n(this.f11539a.mo20679d(), 0, 4);
        this.f11539a.mo20674P(0);
        int n = this.f11539a.mo20689n();
        iy1.mo85e();
        iy1.mo90i(n);
        iy1.mo94n(this.f11539a.mo20679d(), 0, 4);
        this.f11539a.mo20674P(0);
        if (this.f11539a.mo20689n() == 0) {
            return true;
        }
        return false;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: f */
    public final void mo19699f() {
        if (!this.f11552n) {
            this.f11544f.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
            this.f11552n = true;
        }
    }

    /* renamed from: g */
    public final long mo19700g() {
        if (this.f11546h) {
            return this.f11547i + this.f11551m;
        }
        if (this.f11543e.mo25178d() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            return 0;
        }
        return this.f11551m;
    }

    /* renamed from: i */
    public final gm4 mo19701i(iy1 iy1) throws IOException {
        if (this.f11550l > this.f11542d.mo20677b()) {
            gm4 gm4 = this.f11542d;
            gm4.mo20672N(new byte[Math.max(gm4.mo20677b() * 2, this.f11550l)], 0);
        } else {
            this.f11542d.mo20674P(0);
        }
        this.f11542d.mo20673O(this.f11550l);
        iy1.readFully(this.f11542d.mo20679d(), 0, this.f11550l);
        return this.f11542d;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f11544f = jy1;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: k */
    public final boolean mo19702k(iy1 iy1) throws IOException {
        boolean z;
        boolean z2 = false;
        if (!iy1.mo86f(this.f11540b.mo20679d(), 0, 9, true)) {
            return false;
        }
        this.f11540b.mo20674P(0);
        this.f11540b.mo20675Q(4);
        int D = this.f11540b.mo20662D();
        if ((D & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((D & 1) != 0) {
            z2 = true;
        }
        if (z && this.f11553o == null) {
            this.f11553o = new C1034a(this.f11544f.mo7713f(8, 1));
        }
        if (z2 && this.f11554p == null) {
            this.f11554p = new C1035b(this.f11544f.mo7713f(9, 2));
        }
        this.f11544f.mo7722p();
        this.f11548j = (this.f11540b.mo20689n() - 9) + 4;
        this.f11545g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19703l(p000.iy1 r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.mo19700g()
            int r2 = r9.f11549k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L_0x0024
            androidx.media3.extractor.flv.a r7 = r9.f11553o
            if (r7 == 0) goto L_0x0024
            r9.mo19699f()
            androidx.media3.extractor.flv.a r2 = r9.f11553o
            gm4 r10 = r9.mo19701i(r10)
            boolean r5 = r2.mo7879a(r10, r0)
        L_0x0022:
            r10 = r6
            goto L_0x0075
        L_0x0024:
            r7 = 9
            if (r2 != r7) goto L_0x003a
            androidx.media3.extractor.flv.b r7 = r9.f11554p
            if (r7 == 0) goto L_0x003a
            r9.mo19699f()
            androidx.media3.extractor.flv.b r2 = r9.f11554p
            gm4 r10 = r9.mo19701i(r10)
            boolean r5 = r2.mo7879a(r10, r0)
            goto L_0x0022
        L_0x003a:
            r7 = 18
            if (r2 != r7) goto L_0x006f
            boolean r2 = r9.f11552n
            if (r2 != 0) goto L_0x006f
            qn5 r2 = r9.f11543e
            gm4 r10 = r9.mo19701i(r10)
            boolean r5 = r2.mo7879a(r10, r0)
            qn5 r10 = r9.f11543e
            long r0 = r10.mo25178d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L_0x0022
            jy1 r10 = r9.f11544f
            tt2 r2 = new tt2
            qn5 r7 = r9.f11543e
            long[] r7 = r7.mo25179e()
            qn5 r8 = r9.f11543e
            long[] r8 = r8.mo25180f()
            r2.<init>(r7, r8, r0)
            r10.mo7715g(r2)
            r9.f11552n = r6
            goto L_0x0022
        L_0x006f:
            int r0 = r9.f11550l
            r10.mo92k(r0)
            r10 = r5
        L_0x0075:
            boolean r0 = r9.f11546h
            if (r0 != 0) goto L_0x008f
            if (r5 == 0) goto L_0x008f
            r9.f11546h = r6
            qn5 r0 = r9.f11543e
            long r0 = r0.mo25178d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x008b
            long r0 = r9.f11551m
            long r0 = -r0
            goto L_0x008d
        L_0x008b:
            r0 = 0
        L_0x008d:
            r9.f11547i = r0
        L_0x008f:
            r0 = 4
            r9.f11548j = r0
            r0 = 2
            r9.f11545g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f62.mo19703l(iy1):boolean");
    }

    /* renamed from: m */
    public final boolean mo19704m(iy1 iy1) throws IOException {
        if (!iy1.mo86f(this.f11541c.mo20679d(), 0, 11, true)) {
            return false;
        }
        this.f11541c.mo20674P(0);
        this.f11549k = this.f11541c.mo20662D();
        this.f11550l = this.f11541c.mo20665G();
        this.f11551m = (long) this.f11541c.mo20665G();
        this.f11551m = (((long) (this.f11541c.mo20662D() << 24)) | this.f11551m) * 1000;
        this.f11541c.mo20675Q(3);
        this.f11545g = 4;
        return true;
    }

    /* renamed from: n */
    public final void mo19705n(iy1 iy1) throws IOException {
        iy1.mo92k(this.f11548j);
        this.f11548j = 0;
        this.f11545g = 3;
    }
}
