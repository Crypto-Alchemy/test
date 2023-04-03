package p000;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.generic.C1934a;
import com.facebook.drawee.generic.RoundingParams;
import p000.xl5;

/* renamed from: gf2 */
/* compiled from: GenericDraweeHierarchy */
public class gf2 implements qy5 {

    /* renamed from: a */
    public final Drawable f12306a;

    /* renamed from: b */
    public final Resources f12307b;

    /* renamed from: c */
    public RoundingParams f12308c;

    /* renamed from: d */
    public final ph5 f12309d;

    /* renamed from: e */
    public final vy1 f12310e;

    /* renamed from: f */
    public final h82 f12311f;

    public gf2(hf2 hf2) {
        int i;
        int i2;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f12306a = colorDrawable;
        if (lc2.m21369d()) {
            lc2.m21366a("GenericDraweeHierarchy()");
        }
        this.f12307b = hf2.mo21146p();
        this.f12308c = hf2.mo21149s();
        h82 h82 = new h82(colorDrawable);
        this.f12311f = h82;
        int i3 = 1;
        if (hf2.mo21140j() != null) {
            i = hf2.mo21140j().size();
        } else {
            i = 1;
        }
        i = i == 0 ? 1 : i;
        if (hf2.mo21143m() != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        Drawable[] drawableArr = new Drawable[(i4 + 6)];
        drawableArr[0] = mo20549h(hf2.mo21135e(), (xl5.C3616b) null);
        drawableArr[1] = mo20549h(hf2.mo21141k(), hf2.mo21142l());
        drawableArr[2] = mo20548g(h82, hf2.mo21134d(), hf2.mo21133c(), hf2.mo21132b());
        drawableArr[3] = mo20549h(hf2.mo21144n(), hf2.mo21145o());
        drawableArr[4] = mo20549h(hf2.mo21147q(), hf2.mo21148r());
        drawableArr[5] = mo20549h(hf2.mo21138h(), hf2.mo21139i());
        if (i4 > 0) {
            if (hf2.mo21140j() != null) {
                i3 = 0;
                for (Drawable h : hf2.mo21140j()) {
                    drawableArr[i3 + 6] = mo20549h(h, (xl5.C3616b) null);
                    i3++;
                }
            }
            if (hf2.mo21143m() != null) {
                drawableArr[i3 + 6] = mo20549h(hf2.mo21143m(), (xl5.C3616b) null);
            }
        }
        vy1 vy1 = new vy1(drawableArr, false, 2);
        this.f12310e = vy1;
        vy1.mo27392v(hf2.mo21137g());
        ph5 ph5 = new ph5(C1934a.m13414e(vy1, this.f12308c));
        this.f12309d = ph5;
        ph5.mutate();
        mo20559r();
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: a */
    public void mo20543a(Throwable th) {
        this.f12310e.mo27378h();
        mo20551j();
        if (this.f12310e.mo20762b(4) != null) {
            mo20550i(4);
        } else {
            mo20550i(1);
        }
        this.f12310e.mo27381k();
    }

    /* renamed from: b */
    public void mo20544b(Throwable th) {
        this.f12310e.mo27378h();
        mo20551j();
        if (this.f12310e.mo20762b(5) != null) {
            mo20550i(5);
        } else {
            mo20550i(1);
        }
        this.f12310e.mo27381k();
    }

    /* renamed from: c */
    public void mo20545c(float f, boolean z) {
        if (this.f12310e.mo20762b(3) != null) {
            this.f12310e.mo27378h();
            mo20562t(f);
            if (z) {
                this.f12310e.mo27385o();
            }
            this.f12310e.mo27381k();
        }
    }

    /* renamed from: d */
    public Drawable mo11692d() {
        return this.f12309d;
    }

    /* renamed from: e */
    public void mo20546e(Drawable drawable, float f, boolean z) {
        Drawable d = C1934a.m13413d(drawable, this.f12308c, this.f12307b);
        d.mutate();
        this.f12311f.mo20786d(d);
        this.f12310e.mo27378h();
        mo20551j();
        mo20550i(2);
        mo20562t(f);
        if (z) {
            this.f12310e.mo27385o();
        }
        this.f12310e.mo27381k();
    }

    /* renamed from: f */
    public void mo20547f(Drawable drawable) {
        this.f12309d.mo24603p(drawable);
    }

    /* renamed from: g */
    public final Drawable mo20548g(Drawable drawable, xl5.C3616b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C1934a.m13416g(drawable, bVar, pointF);
    }

    public Rect getBounds() {
        return this.f12309d.getBounds();
    }

    /* renamed from: h */
    public final Drawable mo20549h(Drawable drawable, xl5.C3616b bVar) {
        return C1934a.m13415f(C1934a.m13413d(drawable, this.f12308c, this.f12307b), bVar);
    }

    /* renamed from: i */
    public final void mo20550i(int i) {
        if (i >= 0) {
            this.f12310e.mo27383m(i);
        }
    }

    /* renamed from: j */
    public final void mo20551j() {
        mo20552k(1);
        mo20552k(2);
        mo20552k(3);
        mo20552k(4);
        mo20552k(5);
    }

    /* renamed from: k */
    public final void mo20552k(int i) {
        if (i >= 0) {
            this.f12310e.mo27384n(i);
        }
    }

    /* renamed from: l */
    public PointF mo20553l() {
        if (!mo20557p(2)) {
            return null;
        }
        return mo20556o(2).mo27213r();
    }

    /* renamed from: m */
    public xl5.C3616b mo20554m() {
        if (!mo20557p(2)) {
            return null;
        }
        return mo20556o(2).mo27214s();
    }

    /* renamed from: n */
    public final nj1 mo20555n(int i) {
        nj1 d = this.f12310e.mo20763d(i);
        if (d.mo20787j() instanceof hp3) {
            d = (hp3) d.mo20787j();
        }
        if (d.mo20787j() instanceof vl5) {
            return (vl5) d.mo20787j();
        }
        return d;
    }

    /* renamed from: o */
    public final vl5 mo20556o(int i) {
        nj1 n = mo20555n(i);
        if (n instanceof vl5) {
            return (vl5) n;
        }
        return C1934a.m13417h(n, xl5.C3616b.f19893a);
    }

    /* renamed from: p */
    public final boolean mo20557p(int i) {
        return mo20555n(i) instanceof vl5;
    }

    /* renamed from: q */
    public final void mo20558q() {
        this.f12311f.mo20786d(this.f12306a);
    }

    /* renamed from: r */
    public final void mo20559r() {
        vy1 vy1 = this.f12310e;
        if (vy1 != null) {
            vy1.mo27378h();
            this.f12310e.mo27382l();
            mo20551j();
            mo20550i(1);
            this.f12310e.mo27385o();
            this.f12310e.mo27381k();
        }
    }

    public void reset() {
        mo20558q();
        mo20559r();
    }

    /* renamed from: s */
    public void mo20561s(fh4 fh4) {
        this.f12310e.mo27391u(fh4);
    }

    /* renamed from: t */
    public final void mo20562t(float f) {
        Drawable b = this.f12310e.mo20762b(3);
        if (b != null) {
            if (f >= 0.999f) {
                if (b instanceof Animatable) {
                    ((Animatable) b).stop();
                }
                mo20552k(3);
            } else {
                if (b instanceof Animatable) {
                    ((Animatable) b).start();
                }
                mo20550i(3);
            }
            b.setLevel(Math.round(f * 10000.0f));
        }
    }
}
