package p000;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p000.iy6;
import p000.xs5;

/* renamed from: ry4 */
/* compiled from: PsExtractor */
public final class ry4 implements hy1 {

    /* renamed from: l */
    public static final ny1 f17391l = new qy4();

    /* renamed from: a */
    public final sq6 f17392a;

    /* renamed from: b */
    public final SparseArray<C3231a> f17393b;

    /* renamed from: c */
    public final gm4 f17394c;

    /* renamed from: d */
    public final py4 f17395d;

    /* renamed from: e */
    public boolean f17396e;

    /* renamed from: f */
    public boolean f17397f;

    /* renamed from: g */
    public boolean f17398g;

    /* renamed from: h */
    public long f17399h;

    /* renamed from: i */
    public oy4 f17400i;

    /* renamed from: j */
    public jy1 f17401j;

    /* renamed from: k */
    public boolean f17402k;

    /* renamed from: ry4$a */
    /* compiled from: PsExtractor */
    public static final class C3231a {

        /* renamed from: a */
        public final yn1 f17403a;

        /* renamed from: b */
        public final sq6 f17404b;

        /* renamed from: c */
        public final fm4 f17405c = new fm4(new byte[64]);

        /* renamed from: d */
        public boolean f17406d;

        /* renamed from: e */
        public boolean f17407e;

        /* renamed from: f */
        public boolean f17408f;

        /* renamed from: g */
        public int f17409g;

        /* renamed from: h */
        public long f17410h;

        public C3231a(yn1 yn1, sq6 sq6) {
            this.f17403a = yn1;
            this.f17404b = sq6;
        }

        /* renamed from: a */
        public void mo25564a(gm4 gm4) throws ParserException {
            gm4.mo20685j(this.f17405c.f11939a, 0, 3);
            this.f17405c.mo20012p(0);
            mo25565b();
            gm4.mo20685j(this.f17405c.f11939a, 0, this.f17409g);
            this.f17405c.mo20012p(0);
            mo25566c();
            this.f17403a.mo18802f(this.f17410h, 4);
            this.f17403a.mo18798a(gm4);
            this.f17403a.mo18801e();
        }

        /* renamed from: b */
        public final void mo25565b() {
            this.f17405c.mo20014r(8);
            this.f17406d = this.f17405c.mo20003g();
            this.f17407e = this.f17405c.mo20003g();
            this.f17405c.mo20014r(6);
            this.f17409g = this.f17405c.mo20004h(8);
        }

        /* renamed from: c */
        public final void mo25566c() {
            this.f17410h = 0;
            if (this.f17406d) {
                this.f17405c.mo20014r(4);
                this.f17405c.mo20014r(1);
                this.f17405c.mo20014r(1);
                long h = (((long) this.f17405c.mo20004h(3)) << 30) | ((long) (this.f17405c.mo20004h(15) << 15)) | ((long) this.f17405c.mo20004h(15));
                this.f17405c.mo20014r(1);
                if (!this.f17408f && this.f17407e) {
                    this.f17405c.mo20014r(4);
                    this.f17405c.mo20014r(1);
                    this.f17405c.mo20014r(1);
                    this.f17405c.mo20014r(1);
                    this.f17404b.mo25933b((((long) this.f17405c.mo20004h(3)) << 30) | ((long) (this.f17405c.mo20004h(15) << 15)) | ((long) this.f17405c.mo20004h(15)));
                    this.f17408f = true;
                }
                this.f17410h = this.f17404b.mo25933b(h);
            }
        }

        /* renamed from: d */
        public void mo25567d() {
            this.f17408f = false;
            this.f17403a.mo18799c();
        }
    }

    public ry4() {
        this(new sq6(0));
    }

    /* renamed from: f */
    public static /* synthetic */ hy1[] m26457f() {
        return new hy1[]{new ry4()};
    }

    /* renamed from: a */
    public void mo151a() {
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (this.f17392a.mo25936e() == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long c = this.f17392a.mo25934c();
            if (c == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED || c == 0 || c == j2) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            this.f17392a.mo25937g(j2);
        }
        oy4 oy4 = this.f17400i;
        if (oy4 != null) {
            oy4.mo23006h(j2);
        }
        for (int i = 0; i < this.f17393b.size(); i++) {
            this.f17393b.valueAt(i).mo25567d();
        }
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        boolean z;
        long j;
        long j2;
        C2725kr.m20989i(this.f17401j);
        long length = iy1.getLength();
        int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.f17395d.mo24813e()) {
            return this.f17395d.mo24815g(iy1, mt4);
        }
        mo25563g(length);
        oy4 oy4 = this.f17400i;
        if (oy4 != null && oy4.mo23002d()) {
            return this.f17400i.mo23001c(iy1, mt4);
        }
        iy1.mo85e();
        if (i != 0) {
            j = length - iy1.mo89h();
        } else {
            j = -1;
        }
        if ((j != -1 && j < 4) || !iy1.mo84c(this.f17394c.mo20679d(), 0, 4, true)) {
            return -1;
        }
        this.f17394c.mo20674P(0);
        int n = this.f17394c.mo20689n();
        if (n == 441) {
            return -1;
        }
        if (n == 442) {
            iy1.mo94n(this.f17394c.mo20679d(), 0, 10);
            this.f17394c.mo20674P(9);
            iy1.mo92k((this.f17394c.mo20662D() & 7) + 14);
            return 0;
        } else if (n == 443) {
            iy1.mo94n(this.f17394c.mo20679d(), 0, 2);
            this.f17394c.mo20674P(0);
            iy1.mo92k(this.f17394c.mo20668J() + 6);
            return 0;
        } else if (((n & -256) >> 8) != 1) {
            iy1.mo92k(1);
            return 0;
        } else {
            int i2 = n & 255;
            C3231a aVar = this.f17393b.get(i2);
            if (!this.f17396e) {
                if (aVar == null) {
                    yn1 yn1 = null;
                    if (i2 == 189) {
                        yn1 = new C3131q7();
                        this.f17397f = true;
                        this.f17399h = iy1.getPosition();
                    } else if ((i2 & 224) == 192) {
                        yn1 = new jz3();
                        this.f17397f = true;
                        this.f17399h = iy1.getPosition();
                    } else if ((i2 & 240) == 224) {
                        yn1 = new dk2();
                        this.f17398g = true;
                        this.f17399h = iy1.getPosition();
                    }
                    if (yn1 != null) {
                        yn1.mo18800d(this.f17401j, new iy6.C2579d(i2, 256));
                        aVar = new C3231a(yn1, this.f17392a);
                        this.f17393b.put(i2, aVar);
                    }
                }
                if (!this.f17397f || !this.f17398g) {
                    j2 = 1048576;
                } else {
                    j2 = this.f17399h + 8192;
                }
                if (iy1.getPosition() > j2) {
                    this.f17396e = true;
                    this.f17401j.mo7722p();
                }
            }
            iy1.mo94n(this.f17394c.mo20679d(), 0, 2);
            this.f17394c.mo20674P(0);
            int J = this.f17394c.mo20668J() + 6;
            if (aVar == null) {
                iy1.mo92k(J);
            } else {
                this.f17394c.mo20670L(J);
                iy1.readFully(this.f17394c.mo20679d(), 0, J);
                this.f17394c.mo20674P(6);
                aVar.mo25564a(this.f17394c);
                gm4 gm4 = this.f17394c;
                gm4.mo20673O(gm4.mo20677b());
            }
            return 0;
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        byte[] bArr = new byte[14];
        iy1.mo94n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        iy1.mo90i(bArr[13] & 7);
        iy1.mo94n(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    @RequiresNonNull({"output"})
    /* renamed from: g */
    public final void mo25563g(long j) {
        if (!this.f17402k) {
            this.f17402k = true;
            if (this.f17395d.mo24811c() != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                oy4 oy4 = new oy4(this.f17395d.mo24812d(), this.f17395d.mo24811c(), j);
                this.f17400i = oy4;
                this.f17401j.mo7715g(oy4.mo23000b());
                return;
            }
            this.f17401j.mo7715g(new xs5.C3642b(this.f17395d.mo24811c()));
        }
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f17401j = jy1;
    }

    public ry4(sq6 sq6) {
        this.f17392a = sq6;
        this.f17394c = new gm4(4096);
        this.f17393b = new SparseArray<>();
        this.f17395d = new py4();
    }
}
