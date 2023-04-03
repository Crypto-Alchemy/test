package p000;

import androidx.media3.common.Metadata;
import java.io.IOException;
import p000.t32;
import p000.u32;
import p000.xs5;
import p000.zs6;

/* renamed from: s32 */
/* compiled from: FlacExtractor */
public final class s32 implements hy1 {

    /* renamed from: o */
    public static final ny1 f17448o = new r32();

    /* renamed from: a */
    public final byte[] f17449a;

    /* renamed from: b */
    public final gm4 f17450b;

    /* renamed from: c */
    public final boolean f17451c;

    /* renamed from: d */
    public final t32.C3323a f17452d;

    /* renamed from: e */
    public jy1 f17453e;

    /* renamed from: f */
    public zs6 f17454f;

    /* renamed from: g */
    public int f17455g;

    /* renamed from: h */
    public Metadata f17456h;

    /* renamed from: i */
    public x32 f17457i;

    /* renamed from: j */
    public int f17458j;

    /* renamed from: k */
    public int f17459k;

    /* renamed from: l */
    public q32 f17460l;

    /* renamed from: m */
    public int f17461m;

    /* renamed from: n */
    public long f17462n;

    public s32() {
        this(0);
    }

    /* renamed from: k */
    public static /* synthetic */ hy1[] m26563k() {
        return new hy1[]{new s32()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f17455g = 0;
        } else {
            q32 q32 = this.f17460l;
            if (q32 != null) {
                q32.mo23006h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.f17462n = j3;
        this.f17461m = 0;
        this.f17450b.mo20670L(0);
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        int i = this.f17455g;
        if (i == 0) {
            mo25631n(iy1);
            return 0;
        } else if (i == 1) {
            mo25628i(iy1);
            return 0;
        } else if (i == 2) {
            mo25633p(iy1);
            return 0;
        } else if (i == 3) {
            mo25632o(iy1);
            return 0;
        } else if (i == 4) {
            mo25626g(iy1);
            return 0;
        } else if (i == 5) {
            return mo25630m(iy1, mt4);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        u32.m28047c(iy1, false);
        return u32.m28045a(iy1);
    }

    /* renamed from: f */
    public final long mo25625f(gm4 gm4, boolean z) {
        boolean z2;
        C2725kr.m20985e(this.f17457i);
        int e = gm4.mo20680e();
        while (e <= gm4.mo20681f() - 16) {
            gm4.mo20674P(e);
            if (t32.m27259d(gm4, this.f17457i, this.f17459k, this.f17452d)) {
                gm4.mo20674P(e);
                return this.f17452d.f17884a;
            }
            e++;
        }
        if (z) {
            while (e <= gm4.mo20681f() - this.f17458j) {
                gm4.mo20674P(e);
                boolean z3 = false;
                try {
                    z2 = t32.m27259d(gm4, this.f17457i, this.f17459k, this.f17452d);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (gm4.mo20680e() <= gm4.mo20681f()) {
                    z3 = z2;
                }
                if (z3) {
                    gm4.mo20674P(e);
                    return this.f17452d.f17884a;
                }
                e++;
            }
            gm4.mo20674P(gm4.mo20681f());
            return -1;
        }
        gm4.mo20674P(e);
        return -1;
    }

    /* renamed from: g */
    public final void mo25626g(iy1 iy1) throws IOException {
        this.f17459k = u32.m28046b(iy1);
        ((jy1) w67.m29360j(this.f17453e)).mo7715g(mo25627h(iy1.getPosition(), iy1.getLength()));
        this.f17455g = 5;
    }

    /* renamed from: h */
    public final xs5 mo25627h(long j, long j2) {
        C2725kr.m20985e(this.f17457i);
        x32 x32 = this.f17457i;
        if (x32.f19307k != null) {
            return new w32(x32, j);
        }
        if (j2 == -1 || x32.f19306j <= 0) {
            return new xs5.C3642b(x32.mo27666f());
        }
        q32 q32 = new q32(x32, this.f17459k, j, j2);
        this.f17460l = q32;
        return q32.mo23000b();
    }

    /* renamed from: i */
    public final void mo25628i(iy1 iy1) throws IOException {
        byte[] bArr = this.f17449a;
        iy1.mo94n(bArr, 0, bArr.length);
        iy1.mo85e();
        this.f17455g = 2;
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f17453e = jy1;
        this.f17454f = jy1.mo7713f(0, 1);
        jy1.mo7722p();
    }

    /* renamed from: l */
    public final void mo25629l() {
        ((zs6) w67.m29360j(this.f17454f)).mo7301b((this.f17462n * 1000000) / ((long) ((x32) w67.m29360j(this.f17457i)).f19301e), 1, this.f17461m, 0, (zs6.C3758a) null);
    }

    /* renamed from: m */
    public final int mo25630m(iy1 iy1, mt4 mt4) throws IOException {
        boolean z;
        C2725kr.m20985e(this.f17454f);
        C2725kr.m20985e(this.f17457i);
        q32 q32 = this.f17460l;
        if (q32 != null && q32.mo23002d()) {
            return this.f17460l.mo23001c(iy1, mt4);
        }
        if (this.f17462n == -1) {
            this.f17462n = t32.m27264i(iy1, this.f17457i);
            return 0;
        }
        int f = this.f17450b.mo20681f();
        if (f < 32768) {
            int read = iy1.read(this.f17450b.mo20679d(), f, 32768 - f);
            if (read == -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f17450b.mo20673O(f + read);
            } else if (this.f17450b.mo20676a() == 0) {
                mo25629l();
                return -1;
            }
        } else {
            z = false;
        }
        int e = this.f17450b.mo20680e();
        int i = this.f17461m;
        int i2 = this.f17458j;
        if (i < i2) {
            gm4 gm4 = this.f17450b;
            gm4.mo20675Q(Math.min(i2 - i, gm4.mo20676a()));
        }
        long f2 = mo25625f(this.f17450b, z);
        int e2 = this.f17450b.mo20680e() - e;
        this.f17450b.mo20674P(e);
        this.f17454f.mo7300a(this.f17450b, e2);
        this.f17461m += e2;
        if (f2 != -1) {
            mo25629l();
            this.f17461m = 0;
            this.f17462n = f2;
        }
        if (this.f17450b.mo20676a() < 16) {
            int a = this.f17450b.mo20676a();
            System.arraycopy(this.f17450b.mo20679d(), this.f17450b.mo20680e(), this.f17450b.mo20679d(), 0, a);
            this.f17450b.mo20674P(0);
            this.f17450b.mo20673O(a);
        }
        return 0;
    }

    /* renamed from: n */
    public final void mo25631n(iy1 iy1) throws IOException {
        this.f17456h = u32.m28048d(iy1, !this.f17451c);
        this.f17455g = 1;
    }

    /* renamed from: o */
    public final void mo25632o(iy1 iy1) throws IOException {
        u32.C3393a aVar = new u32.C3393a(this.f17457i);
        boolean z = false;
        while (!z) {
            z = u32.m28049e(iy1, aVar);
            this.f17457i = (x32) w67.m29360j(aVar.f18366a);
        }
        C2725kr.m20985e(this.f17457i);
        this.f17458j = Math.max(this.f17457i.f19299c, 6);
        ((zs6) w67.m29360j(this.f17454f)).mo7303d(this.f17457i.mo27667g(this.f17449a, this.f17456h));
        this.f17455g = 4;
    }

    /* renamed from: p */
    public final void mo25633p(iy1 iy1) throws IOException {
        u32.m28053i(iy1);
        this.f17455g = 3;
    }

    public s32(int i) {
        this.f17449a = new byte[42];
        this.f17450b = new gm4(new byte[32768], 0);
        this.f17451c = (i & 1) == 0 ? false : true;
        this.f17452d = new t32.C3323a();
        this.f17455g = 0;
    }
}
