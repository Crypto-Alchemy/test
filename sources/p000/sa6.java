package p000;

import androidx.media3.common.C0792h;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.xs5;
import p000.zs6;

/* renamed from: sa6 */
/* compiled from: StreamReader */
public abstract class sa6 {

    /* renamed from: a */
    public final zf4 f17539a = new zf4();

    /* renamed from: b */
    public zs6 f17540b;

    /* renamed from: c */
    public jy1 f17541c;

    /* renamed from: d */
    public bg4 f17542d;

    /* renamed from: e */
    public long f17543e;

    /* renamed from: f */
    public long f17544f;

    /* renamed from: g */
    public long f17545g;

    /* renamed from: h */
    public int f17546h;

    /* renamed from: i */
    public int f17547i;

    /* renamed from: j */
    public C3258b f17548j = new C3258b();

    /* renamed from: k */
    public long f17549k;

    /* renamed from: l */
    public boolean f17550l;

    /* renamed from: m */
    public boolean f17551m;

    /* renamed from: sa6$b */
    /* compiled from: StreamReader */
    public static class C3258b {

        /* renamed from: a */
        public C0792h f17552a;

        /* renamed from: b */
        public bg4 f17553b;
    }

    /* renamed from: sa6$c */
    /* compiled from: StreamReader */
    public static final class C3259c implements bg4 {
        public C3259c() {
        }

        /* renamed from: a */
        public xs5 mo11645a() {
            return new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        }

        /* renamed from: b */
        public long mo11646b(iy1 iy1) {
            return -1;
        }

        /* renamed from: c */
        public void mo11647c(long j) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* renamed from: a */
    public final void mo25700a() {
        C2725kr.m20989i(this.f17540b);
        w67.m29360j(this.f17541c);
    }

    /* renamed from: b */
    public long mo25701b(long j) {
        return (j * 1000000) / ((long) this.f17547i);
    }

    /* renamed from: c */
    public long mo25702c(long j) {
        return (((long) this.f17547i) * j) / 1000000;
    }

    /* renamed from: d */
    public void mo25703d(jy1 jy1, zs6 zs6) {
        this.f17541c = jy1;
        this.f17540b = zs6;
        mo23946l(true);
    }

    /* renamed from: e */
    public void mo23943e(long j) {
        this.f17545g = j;
    }

    /* renamed from: f */
    public abstract long mo23944f(gm4 gm4);

    /* renamed from: g */
    public final int mo25704g(iy1 iy1, mt4 mt4) throws IOException {
        mo25700a();
        int i = this.f17546h;
        if (i == 0) {
            return mo25706j(iy1);
        }
        if (i == 1) {
            iy1.mo92k((int) this.f17544f);
            this.f17546h = 2;
            return 0;
        } else if (i == 2) {
            w67.m29360j(this.f17542d);
            return mo25707k(iy1, mt4);
        } else if (i == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* renamed from: h */
    public final boolean mo25705h(iy1 iy1) throws IOException {
        while (this.f17539a.mo28425d(iy1)) {
            this.f17549k = iy1.getPosition() - this.f17544f;
            if (!mo23945i(this.f17539a.mo28424c(), this.f17544f, this.f17548j)) {
                return true;
            }
            this.f17544f = iy1.getPosition();
        }
        this.f17546h = 3;
        return false;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: i */
    public abstract boolean mo23945i(gm4 gm4, long j, C3258b bVar) throws IOException;

    @RequiresNonNull({"trackOutput"})
    /* renamed from: j */
    public final int mo25706j(iy1 iy1) throws IOException {
        boolean z;
        if (!mo25705h(iy1)) {
            return -1;
        }
        C0792h hVar = this.f17548j.f17552a;
        this.f17547i = hVar.f4187b1;
        if (!this.f17551m) {
            this.f17540b.mo7303d(hVar);
            this.f17551m = true;
        }
        bg4 bg4 = this.f17548j.f17553b;
        if (bg4 != null) {
            this.f17542d = bg4;
        } else if (iy1.getLength() == -1) {
            this.f17542d = new C3259c();
        } else {
            ag4 b = this.f17539a.mo28423b();
            if ((b.f129b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f17542d = new h91(this, this.f17544f, iy1.getLength(), (long) (b.f135h + b.f136i), b.f130c, z);
        }
        this.f17546h = 2;
        this.f17539a.mo28427f();
        return 0;
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    /* renamed from: k */
    public final int mo25707k(iy1 iy1, mt4 mt4) throws IOException {
        iy1 iy12 = iy1;
        long b = this.f17542d.mo11646b(iy12);
        if (b >= 0) {
            mt4.f15249a = b;
            return 1;
        }
        if (b < -1) {
            mo23943e(-(b + 2));
        }
        if (!this.f17550l) {
            this.f17541c.mo7715g((xs5) C2725kr.m20989i(this.f17542d.mo11645a()));
            this.f17550l = true;
        }
        if (this.f17549k > 0 || this.f17539a.mo28425d(iy12)) {
            this.f17549k = 0;
            gm4 c = this.f17539a.mo28424c();
            long f = mo23944f(c);
            if (f >= 0) {
                long j = this.f17545g;
                if (j + f >= this.f17543e) {
                    long b2 = mo25701b(j);
                    this.f17540b.mo7300a(c, c.mo20681f());
                    this.f17540b.mo7301b(b2, 1, c.mo20681f(), 0, (zs6.C3758a) null);
                    this.f17543e = -1;
                }
            }
            this.f17545g += f;
            return 0;
        }
        this.f17546h = 3;
        return -1;
    }

    /* renamed from: l */
    public void mo23946l(boolean z) {
        if (z) {
            this.f17548j = new C3258b();
            this.f17544f = 0;
            this.f17546h = 0;
        } else {
            this.f17546h = 1;
        }
        this.f17543e = -1;
        this.f17545g = 0;
    }

    /* renamed from: m */
    public final void mo25708m(long j, long j2) {
        this.f17539a.mo28426e();
        if (j == 0) {
            mo23946l(!this.f17550l);
        } else if (this.f17546h != 0) {
            this.f17543e = mo25702c(j2);
            ((bg4) w67.m29360j(this.f17542d)).mo11647c(this.f17543e);
            this.f17546h = 2;
        }
    }
}
