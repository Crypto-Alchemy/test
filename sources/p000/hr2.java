package p000;

import android.graphics.Rect;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hr2 */
/* compiled from: ImagePerfMonitor */
public class hr2 implements ir2 {

    /* renamed from: a */
    public final ro4 f12999a;

    /* renamed from: b */
    public final vx3 f13000b;

    /* renamed from: c */
    public final kr2 f13001c = new kr2();

    /* renamed from: d */
    public final td6<Boolean> f13002d;

    /* renamed from: e */
    public br2 f13003e;

    /* renamed from: f */
    public ar2 f13004f;

    /* renamed from: g */
    public jr2 f13005g;

    /* renamed from: h */
    public dr2 f13006h;

    /* renamed from: i */
    public o82 f13007i;

    /* renamed from: j */
    public List<fr2> f13008j;

    /* renamed from: k */
    public boolean f13009k;

    public hr2(vx3 vx3, ro4 ro4, td6<Boolean> td6) {
        this.f13000b = vx3;
        this.f12999a = ro4;
        this.f13002d = td6;
    }

    /* renamed from: a */
    public void mo21337a(kr2 kr2, int i) {
        List<fr2> list;
        if (this.f13009k && (list = this.f13008j) != null && !list.isEmpty()) {
            er2 B = kr2.mo22489B();
            for (fr2 a : this.f13008j) {
                a.mo20066a(B, i);
            }
        }
    }

    /* renamed from: b */
    public void mo21338b(kr2 kr2, int i) {
        List<fr2> list;
        kr2.mo22504o(i);
        if (this.f13009k && (list = this.f13008j) != null && !list.isEmpty()) {
            if (i == 3) {
                mo21340d();
            }
            er2 B = kr2.mo22489B();
            for (fr2 b : this.f13008j) {
                b.mo20067b(B, i);
            }
        }
    }

    /* renamed from: c */
    public void mo21339c(fr2 fr2) {
        if (fr2 != null) {
            if (this.f13008j == null) {
                this.f13008j = new CopyOnWriteArrayList();
            }
            this.f13008j.add(fr2);
        }
    }

    /* renamed from: d */
    public void mo21340d() {
        bk1 g = this.f12999a.mo346g();
        if (g != null && g.mo11692d() != null) {
            Rect bounds = g.mo11692d().getBounds();
            this.f13001c.mo22511v(bounds.width());
            this.f13001c.mo22510u(bounds.height());
        }
    }

    /* renamed from: e */
    public void mo21341e() {
        List<fr2> list = this.f13008j;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: f */
    public void mo21342f() {
        mo21341e();
        mo21343g(false);
        this.f13001c.mo22491b();
    }

    /* renamed from: g */
    public void mo21343g(boolean z) {
        this.f13009k = z;
        if (z) {
            mo21344h();
            ar2 ar2 = this.f13004f;
            if (ar2 != null) {
                this.f12999a.mo25474i0(ar2);
            }
            dr2 dr2 = this.f13006h;
            if (dr2 != null) {
                this.f12999a.mo11399m(dr2);
            }
            o82 o82 = this.f13007i;
            if (o82 != null) {
                this.f12999a.mo25475j0(o82);
                return;
            }
            return;
        }
        ar2 ar22 = this.f13004f;
        if (ar22 != null) {
            this.f12999a.mo25490y0(ar22);
        }
        dr2 dr22 = this.f13006h;
        if (dr22 != null) {
            this.f12999a.mo11381S(dr22);
        }
        o82 o822 = this.f13007i;
        if (o822 != null) {
            this.f12999a.mo25491z0(o822);
        }
    }

    /* renamed from: h */
    public final void mo21344h() {
        if (this.f13006h == null) {
            this.f13006h = new dr2(this.f13000b, this.f13001c, this, this.f13002d, ud6.f18435b);
        }
        if (this.f13005g == null) {
            this.f13005g = new jr2(this.f13000b, this.f13001c);
        }
        if (this.f13004f == null) {
            this.f13004f = new gr2(this.f13001c, this);
        }
        br2 br2 = this.f13003e;
        if (br2 == null) {
            this.f13003e = new br2(this.f12999a.mo11411x(), this.f13004f);
        } else {
            br2.mo11787l(this.f12999a.mo11411x());
        }
        if (this.f13007i == null) {
            this.f13007i = new o82(this.f13005g, this.f13003e);
        }
    }

    /* renamed from: i */
    public void mo21345i(AbstractDraweeControllerBuilder<so4, ImageRequest, nh0<kh0>, vq2> abstractDraweeControllerBuilder) {
        this.f13001c.mo22498i(abstractDraweeControllerBuilder.mo13234n(), abstractDraweeControllerBuilder.mo13235o(), (ImageRequest[]) abstractDraweeControllerBuilder.mo13233m());
    }
}
