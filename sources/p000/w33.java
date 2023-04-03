package p000;

import androidx.media3.common.C0792h;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import p000.xs5;

/* renamed from: w33 */
/* compiled from: JpegExtractor */
public final class w33 implements hy1 {

    /* renamed from: a */
    public final gm4 f18980a = new gm4(6);

    /* renamed from: b */
    public jy1 f18981b;

    /* renamed from: c */
    public int f18982c;

    /* renamed from: d */
    public int f18983d;

    /* renamed from: e */
    public int f18984e;

    /* renamed from: f */
    public long f18985f = -1;

    /* renamed from: g */
    public MotionPhotoMetadata f18986g;

    /* renamed from: h */
    public iy1 f18987h;

    /* renamed from: i */
    public h86 f18988i;

    /* renamed from: j */
    public gz3 f18989j;

    /* renamed from: g */
    public static MotionPhotoMetadata m29242g(String str, long j) throws IOException {
        uy3 a;
        if (j == -1 || (a = gp7.m18319a(str)) == null) {
            return null;
        }
        return a.mo26944a(j);
    }

    /* renamed from: a */
    public void mo151a() {
        gz3 gz3 = this.f18989j;
        if (gz3 != null) {
            gz3.mo151a();
        }
    }

    /* renamed from: b */
    public void mo152b(long j, long j2) {
        if (j == 0) {
            this.f18982c = 0;
            this.f18989j = null;
        } else if (this.f18982c == 5) {
            ((gz3) C2725kr.m20985e(this.f18989j)).mo152b(j, j2);
        }
    }

    /* renamed from: c */
    public final void mo27418c(iy1 iy1) throws IOException {
        this.f18980a.mo20670L(2);
        iy1.mo94n(this.f18980a.mo20679d(), 0, 2);
        iy1.mo90i(this.f18980a.mo20668J() - 2);
    }

    /* renamed from: d */
    public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
        int i = this.f18982c;
        if (i == 0) {
            mo27422k(iy1);
            return 0;
        } else if (i == 1) {
            mo27424m(iy1);
            return 0;
        } else if (i == 2) {
            mo27423l(iy1);
            return 0;
        } else if (i == 4) {
            long position = iy1.getPosition();
            long j = this.f18985f;
            if (position != j) {
                mt4.f15249a = j;
                return 1;
            }
            mo27425n(iy1);
            return 0;
        } else if (i == 5) {
            if (this.f18988i == null || iy1 != this.f18987h) {
                this.f18987h = iy1;
                this.f18988i = new h86(iy1, this.f18985f);
            }
            int d = ((gz3) C2725kr.m20985e(this.f18989j)).mo154d(this.f18988i, mt4);
            if (d == 1) {
                mt4.f15249a += this.f18985f;
            }
            return d;
        } else if (i == 6) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public boolean mo155e(iy1 iy1) throws IOException {
        if (mo27421i(iy1) != 65496) {
            return false;
        }
        int i = mo27421i(iy1);
        this.f18983d = i;
        if (i == 65504) {
            mo27418c(iy1);
            this.f18983d = mo27421i(iy1);
        }
        if (this.f18983d != 65505) {
            return false;
        }
        iy1.mo90i(2);
        this.f18980a.mo20670L(6);
        iy1.mo94n(this.f18980a.mo20679d(), 0, 6);
        if (this.f18980a.mo20664F() == 1165519206 && this.f18980a.mo20668J() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo27419f() {
        mo27420h(new Metadata.Entry[0]);
        ((jy1) C2725kr.m20985e(this.f18981b)).mo7722p();
        this.f18981b.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
        this.f18982c = 6;
    }

    /* renamed from: h */
    public final void mo27420h(Metadata.Entry... entryArr) {
        ((jy1) C2725kr.m20985e(this.f18981b)).mo7713f(RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE, 4).mo7303d(new C0792h.C0794b().mo6650K("image/jpeg").mo6663X(new Metadata(entryArr)).mo6644E());
    }

    /* renamed from: i */
    public final int mo27421i(iy1 iy1) throws IOException {
        this.f18980a.mo20670L(2);
        iy1.mo94n(this.f18980a.mo20679d(), 0, 2);
        return this.f18980a.mo20668J();
    }

    /* renamed from: j */
    public void mo159j(jy1 jy1) {
        this.f18981b = jy1;
    }

    /* renamed from: k */
    public final void mo27422k(iy1 iy1) throws IOException {
        this.f18980a.mo20670L(2);
        iy1.readFully(this.f18980a.mo20679d(), 0, 2);
        int J = this.f18980a.mo20668J();
        this.f18983d = J;
        if (J == 65498) {
            if (this.f18985f != -1) {
                this.f18982c = 4;
            } else {
                mo27419f();
            }
        } else if ((J < 65488 || J > 65497) && J != 65281) {
            this.f18982c = 1;
        }
    }

    /* renamed from: l */
    public final void mo27423l(iy1 iy1) throws IOException {
        String x;
        if (this.f18983d == 65505) {
            gm4 gm4 = new gm4(this.f18984e);
            iy1.readFully(gm4.mo20679d(), 0, this.f18984e);
            if (this.f18986g == null && "http://ns.adobe.com/xap/1.0/".equals(gm4.mo20699x()) && (x = gm4.mo20699x()) != null) {
                MotionPhotoMetadata g = m29242g(x, iy1.getLength());
                this.f18986g = g;
                if (g != null) {
                    this.f18985f = g.f5631g;
                }
            }
        } else {
            iy1.mo92k(this.f18984e);
        }
        this.f18982c = 0;
    }

    /* renamed from: m */
    public final void mo27424m(iy1 iy1) throws IOException {
        this.f18980a.mo20670L(2);
        iy1.readFully(this.f18980a.mo20679d(), 0, 2);
        this.f18984e = this.f18980a.mo20668J() - 2;
        this.f18982c = 2;
    }

    /* renamed from: n */
    public final void mo27425n(iy1 iy1) throws IOException {
        if (!iy1.mo84c(this.f18980a.mo20679d(), 0, 1, true)) {
            mo27419f();
            return;
        }
        iy1.mo85e();
        if (this.f18989j == null) {
            this.f18989j = new gz3();
        }
        h86 h86 = new h86(iy1, this.f18985f);
        this.f18988i = h86;
        if (this.f18989j.mo155e(h86)) {
            this.f18989j.mo159j(new i86(this.f18985f, (jy1) C2725kr.m20985e(this.f18981b)));
            mo27426o();
            return;
        }
        mo27419f();
    }

    /* renamed from: o */
    public final void mo27426o() {
        mo27420h((Metadata.Entry) C2725kr.m20985e(this.f18986g));
        this.f18982c = 5;
    }
}
