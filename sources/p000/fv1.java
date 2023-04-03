package p000;

import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import com.alexvasilkov.gestures.GestureController;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: fv1 */
/* compiled from: ExitController */
public class fv1 {

    /* renamed from: q */
    public static final RectF f12068q = new RectF();

    /* renamed from: r */
    public static final Point f12069r = new Point();

    /* renamed from: a */
    public final float f12070a;

    /* renamed from: b */
    public final GestureController f12071b;

    /* renamed from: c */
    public final C2764ll f12072c;

    /* renamed from: d */
    public float f12073d = 1.0f;

    /* renamed from: e */
    public boolean f12074e;

    /* renamed from: f */
    public boolean f12075f;

    /* renamed from: g */
    public boolean f12076g;

    /* renamed from: h */
    public boolean f12077h;

    /* renamed from: i */
    public boolean f12078i;

    /* renamed from: j */
    public boolean f12079j;

    /* renamed from: k */
    public float f12080k;

    /* renamed from: l */
    public float f12081l;

    /* renamed from: m */
    public float f12082m = 1.0f;

    /* renamed from: n */
    public float f12083n;

    /* renamed from: o */
    public float f12084o;

    /* renamed from: p */
    public float f12085p;

    public fv1(View view, GestureController gestureController) {
        C2764ll llVar;
        this.f12071b = gestureController;
        if (view instanceof C2764ll) {
            llVar = (C2764ll) view;
        } else {
            llVar = null;
        }
        this.f12072c = llVar;
        this.f12070a = x37.m29870a(view.getContext(), 30.0f);
    }

    /* renamed from: a */
    public void mo20213a() {
        this.f12085p = this.f12071b.mo12199p().mo25661b(this.f12085p);
    }

    /* renamed from: b */
    public final boolean mo20214b() {
        C2764ll llVar;
        if (!this.f12071b.mo12196n().mo12235A() || (llVar = this.f12072c) == null || llVar.getPositionAnimator().mo25760x()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo20215c() {
        Settings.ExitType h = this.f12071b.mo12196n().mo12257h();
        if ((h == Settings.ExitType.ALL || h == Settings.ExitType.SCROLL) && !this.f12074e && !this.f12075f && mo20220h()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo20216d() {
        Settings.ExitType h = this.f12071b.mo12196n().mo12257h();
        if ((h == Settings.ExitType.ALL || h == Settings.ExitType.ZOOM) && !this.f12075f && mo20220h()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo20217e(float f) {
        if (!this.f12071b.mo12196n().mo12240F()) {
            return true;
        }
        p86 o = this.f12071b.mo12197o();
        s86 p = this.f12071b.mo12199p();
        RectF rectF = f12068q;
        p.mo25666g(o, rectF);
        if (f > Utils.FLOAT_EPSILON && ((float) p86.m24754a(o.mo24484g(), rectF.bottom)) < Utils.FLOAT_EPSILON) {
            return true;
        }
        if (f >= Utils.FLOAT_EPSILON || ((float) p86.m24754a(o.mo24484g(), rectF.top)) <= Utils.FLOAT_EPSILON) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo20218f() {
        boolean z;
        boolean z2;
        boolean z3;
        if (mo20219g()) {
            GestureController gestureController = this.f12071b;
            if (gestureController instanceof nf2) {
                ((nf2) gestureController).mo23666Y(false);
            }
            this.f12071b.mo12196n().mo12252c();
            sd7 positionAnimator = this.f12072c.getPositionAnimator();
            if (!positionAnimator.mo25759w() && mo20214b()) {
                float u = positionAnimator.mo25757u();
                if (u < 0.75f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    positionAnimator.mo25756r(true);
                } else {
                    float g = this.f12071b.mo12197o().mo24484g();
                    float h = this.f12071b.mo12197o().mo24485h();
                    if (!this.f12078i || !p86.m24755c(g, this.f12084o)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!this.f12079j || !p86.m24755c(h, this.f12085p)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (u < 1.0f) {
                        positionAnimator.mo25745C(u, false, true);
                        if (!z2 && !z3) {
                            this.f12071b.mo12196n().mo12252c();
                            this.f12071b.mo12193k();
                            this.f12071b.mo12196n().mo12250a();
                        }
                    }
                }
            }
        }
        this.f12078i = false;
        this.f12079j = false;
        this.f12076g = false;
        this.f12073d = 1.0f;
        this.f12083n = Utils.FLOAT_EPSILON;
        this.f12080k = Utils.FLOAT_EPSILON;
        this.f12081l = Utils.FLOAT_EPSILON;
        this.f12082m = 1.0f;
    }

    /* renamed from: g */
    public boolean mo20219g() {
        if (this.f12078i || this.f12079j) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo20220h() {
        p86 o = this.f12071b.mo12197o();
        if (p86.m24754a(o.mo24485h(), this.f12071b.mo12199p().mo25665f(o)) <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo20221i() {
        return mo20219g();
    }

    /* renamed from: j */
    public boolean mo20222j() {
        return mo20219g();
    }

    /* renamed from: k */
    public void mo20223k() {
        this.f12075f = true;
    }

    /* renamed from: l */
    public void mo20224l() {
        this.f12075f = false;
    }

    /* renamed from: m */
    public boolean mo20225m(float f) {
        if (!mo20216d()) {
            this.f12077h = true;
        }
        if (!this.f12077h && !mo20219g() && mo20214b() && f < 1.0f) {
            float f2 = this.f12082m * f;
            this.f12082m = f2;
            if (f2 < 0.75f) {
                this.f12079j = true;
                this.f12085p = this.f12071b.mo12197o().mo24485h();
                mo20230r();
            }
        }
        if (this.f12079j) {
            float h = (this.f12071b.mo12197o().mo24485h() * f) / this.f12085p;
            this.f12073d = h;
            this.f12073d = cp3.m14357f(h, 0.01f, 1.0f);
            Settings n = this.f12071b.mo12196n();
            Point point = f12069r;
            qj2.m25708a(n, point);
            if (this.f12073d == 1.0f) {
                this.f12071b.mo12197o().mo24495r(this.f12085p, (float) point.x, (float) point.y);
            } else {
                this.f12071b.mo12197o().mo24494q(((f - 1.0f) * 0.75f) + 1.0f, (float) point.x, (float) point.y);
            }
            mo20232t();
            if (this.f12073d == 1.0f) {
                mo20218f();
                return true;
            }
        }
        return mo20219g();
    }

    /* renamed from: n */
    public void mo20226n() {
        this.f12074e = true;
    }

    /* renamed from: o */
    public void mo20227o() {
        this.f12074e = false;
        this.f12077h = false;
        if (this.f12079j) {
            mo20218f();
        }
    }

    /* renamed from: p */
    public boolean mo20228p(float f, float f2) {
        if (!this.f12076g && !mo20219g() && mo20214b() && mo20215c() && !mo20217e(f2)) {
            this.f12080k += f;
            float f3 = this.f12081l + f2;
            this.f12081l = f3;
            if (Math.abs(f3) > this.f12070a) {
                this.f12078i = true;
                this.f12084o = this.f12071b.mo12197o().mo24484g();
                mo20230r();
            } else if (Math.abs(this.f12080k) > this.f12070a) {
                this.f12076g = true;
            }
        }
        if (!this.f12078i) {
            return mo20219g();
        }
        if (this.f12083n == Utils.FLOAT_EPSILON) {
            this.f12083n = Math.signum(f2);
        }
        if (this.f12073d < 0.75f && Math.signum(f2) == this.f12083n) {
            f2 *= this.f12073d / 0.75f;
        }
        float g = 1.0f - (((this.f12071b.mo12197o().mo24484g() + f2) - this.f12084o) / ((this.f12083n * 0.5f) * ((float) Math.max(this.f12071b.mo12196n().mo12265p(), this.f12071b.mo12196n().mo12264o()))));
        this.f12073d = g;
        float f4 = cp3.m14357f(g, 0.01f, 1.0f);
        this.f12073d = f4;
        if (f4 == 1.0f) {
            this.f12071b.mo12197o().mo24492o(this.f12071b.mo12197o().mo24483f(), this.f12084o);
        } else {
            this.f12071b.mo12197o().mo24491n(Utils.FLOAT_EPSILON, f2);
        }
        mo20232t();
        if (this.f12073d == 1.0f) {
            mo20218f();
        }
        return true;
    }

    /* renamed from: q */
    public void mo20229q() {
        mo20218f();
    }

    /* renamed from: r */
    public final void mo20230r() {
        this.f12071b.mo12196n().mo12250a();
        GestureController gestureController = this.f12071b;
        if (gestureController instanceof nf2) {
            ((nf2) gestureController).mo23666Y(true);
        }
    }

    /* renamed from: s */
    public void mo20231s() {
        if (mo20219g()) {
            this.f12073d = 1.0f;
            mo20232t();
            mo20218f();
        }
    }

    /* renamed from: t */
    public final void mo20232t() {
        if (mo20214b()) {
            this.f12072c.getPositionAnimator().mo25746D(this.f12071b.mo12197o(), this.f12073d);
            this.f12072c.getPositionAnimator().mo25745C(this.f12073d, false, false);
        }
    }
}
