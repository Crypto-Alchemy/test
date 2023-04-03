package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.alexvasilkov.gestures.GestureController;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p000.td7;

/* renamed from: sd7 */
/* compiled from: ViewPositionAnimator */
public class sd7 {

    /* renamed from: K */
    public static final Matrix f17614K = new Matrix();

    /* renamed from: L */
    public static final float[] f17615L = new float[2];

    /* renamed from: M */
    public static final Point f17616M = new Point();

    /* renamed from: A */
    public float f17617A;

    /* renamed from: B */
    public boolean f17618B;

    /* renamed from: C */
    public boolean f17619C;

    /* renamed from: D */
    public boolean f17620D;

    /* renamed from: E */
    public boolean f17621E;

    /* renamed from: F */
    public boolean f17622F;

    /* renamed from: G */
    public boolean f17623G;

    /* renamed from: H */
    public final td7 f17624H;

    /* renamed from: I */
    public final td7 f17625I;

    /* renamed from: J */
    public final td7.C3356b f17626J;

    /* renamed from: a */
    public final List<C3267e> f17627a = new ArrayList();

    /* renamed from: b */
    public final List<C3267e> f17628b = new ArrayList();

    /* renamed from: c */
    public boolean f17629c;

    /* renamed from: d */
    public final t42 f17630d = new t42();

    /* renamed from: e */
    public final C3683yk f17631e;

    /* renamed from: f */
    public final GestureController f17632f;

    /* renamed from: g */
    public final xg0 f17633g;

    /* renamed from: h */
    public final ug0 f17634h;

    /* renamed from: i */
    public final p86 f17635i = new p86();

    /* renamed from: j */
    public final p86 f17636j = new p86();

    /* renamed from: k */
    public float f17637k;

    /* renamed from: l */
    public float f17638l;

    /* renamed from: m */
    public float f17639m;

    /* renamed from: n */
    public float f17640n;

    /* renamed from: o */
    public final Rect f17641o;

    /* renamed from: p */
    public final RectF f17642p;

    /* renamed from: q */
    public final RectF f17643q;

    /* renamed from: r */
    public final RectF f17644r;

    /* renamed from: s */
    public final RectF f17645s;

    /* renamed from: t */
    public final RectF f17646t;

    /* renamed from: u */
    public qd7 f17647u;

    /* renamed from: v */
    public qd7 f17648v;

    /* renamed from: w */
    public boolean f17649w;

    /* renamed from: x */
    public View f17650x;

    /* renamed from: y */
    public boolean f17651y;

    /* renamed from: z */
    public float f17652z;

    /* renamed from: sd7$a */
    /* compiled from: ViewPositionAnimator */
    public class C3263a implements td7.C3356b {
        public C3263a() {
        }

        /* renamed from: a */
        public void mo25763a(qd7 qd7) {
            if (of2.m23785a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("'From' view position updated: ");
                sb.append(qd7.mo25074g());
            }
            qd7 unused = sd7.this.f17647u = qd7;
            sd7.this.mo25743A();
            sd7.this.mo25752n();
        }
    }

    /* renamed from: sd7$b */
    /* compiled from: ViewPositionAnimator */
    public class C3264b implements GestureController.C1704e {
        public C3264b() {
        }

        /* renamed from: a */
        public void mo12232a(p86 p86) {
            sd7.this.f17632f.mo12199p().mo25662c(sd7.this.f17635i);
            sd7.this.f17632f.mo12199p().mo25662c(sd7.this.f17636j);
        }

        /* renamed from: b */
        public void mo12233b(p86 p86, p86 p862) {
            if (sd7.this.f17651y) {
                if (of2.m23785a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State reset in listener: ");
                    sb.append(p862);
                }
                sd7.this.mo25746D(p862, 1.0f);
                sd7.this.mo25752n();
            }
        }
    }

    /* renamed from: sd7$c */
    /* compiled from: ViewPositionAnimator */
    public class C3265c implements td7.C3356b {
        public C3265c() {
        }

        /* renamed from: a */
        public void mo25763a(qd7 qd7) {
            if (of2.m23785a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("'To' view position updated: ");
                sb.append(qd7.mo25074g());
            }
            qd7 unused = sd7.this.f17648v = qd7;
            sd7.this.mo25744B();
            sd7.this.mo25743A();
            sd7.this.mo25752n();
        }
    }

    /* renamed from: sd7$d */
    /* compiled from: ViewPositionAnimator */
    public class C3266d extends C3683yk {
        public C3266d(View view) {
            super(view);
        }

        /* renamed from: a */
        public boolean mo12225a() {
            if (sd7.this.f17630d.mo26051e()) {
                return false;
            }
            sd7.this.f17630d.mo26048a();
            sd7 sd7 = sd7.this;
            float unused = sd7.f17617A = sd7.f17630d.mo26050c();
            sd7.this.mo25752n();
            if (!sd7.this.f17630d.mo26051e()) {
                return true;
            }
            sd7.this.mo25762z();
            return true;
        }
    }

    /* renamed from: sd7$e */
    /* compiled from: ViewPositionAnimator */
    public interface C3267e {
        /* renamed from: a */
        void mo12300a(float f, boolean z);
    }

    public sd7(rf2 rf2) {
        xg0 xg0;
        Rect rect = new Rect();
        this.f17641o = rect;
        this.f17642p = new RectF();
        this.f17643q = new RectF();
        this.f17644r = new RectF();
        this.f17645s = new RectF();
        this.f17646t = new RectF();
        this.f17651y = false;
        this.f17652z = 1.0f;
        this.f17617A = Utils.FLOAT_EPSILON;
        this.f17618B = true;
        this.f17619C = false;
        td7 td7 = new td7();
        this.f17624H = td7;
        td7 td72 = new td7();
        this.f17625I = td72;
        this.f17626J = new C3263a();
        if (rf2 instanceof View) {
            View view = (View) rf2;
            ug0 ug0 = null;
            if (rf2 instanceof xg0) {
                xg0 = (xg0) rf2;
            } else {
                xg0 = null;
            }
            this.f17633g = xg0;
            this.f17634h = rf2 instanceof ug0 ? (ug0) rf2 : ug0;
            this.f17631e = new C3266d(view);
            m26863t(view.getContext(), rect);
            GestureController controller = rf2.getController();
            this.f17632f = controller;
            controller.mo12192j(new C3264b());
            td72.mo26411c(view, new C3265c());
            td7.mo26413g(true);
            td72.mo26413g(true);
            return;
        }
        throw new IllegalArgumentException("Argument 'to' should be an instance of View");
    }

    /* renamed from: s */
    public static Activity m26862s(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        throw new IllegalArgumentException("Illegal context");
    }

    /* renamed from: t */
    public static void m26863t(Context context, Rect rect) {
        WindowManager windowManager = m26862s(context).getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            context.getDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        }
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: A */
    public final void mo25743A() {
        this.f17622F = false;
    }

    /* renamed from: B */
    public final void mo25744B() {
        this.f17623G = false;
    }

    /* renamed from: C */
    public void mo25745C(float f, boolean z, boolean z2) {
        if (this.f17651y) {
            mo25748F();
            if (f < Utils.FLOAT_EPSILON) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.f17617A = f;
            this.f17618B = z;
            if (z2) {
                mo25747E();
            }
            mo25752n();
            return;
        }
        throw new IllegalStateException("You should call enter(...) before calling setState(...)");
    }

    /* renamed from: D */
    public void mo25746D(p86 p86, float f) {
        if (f <= Utils.FLOAT_EPSILON) {
            throw new IllegalArgumentException("'To' position cannot be <= 0");
        } else if (f <= 1.0f) {
            if (of2.m23785a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("State reset: ");
                sb.append(p86);
                sb.append(" at ");
                sb.append(f);
            }
            this.f17652z = f;
            this.f17636j.mo24490m(p86);
            mo25744B();
            mo25743A();
        } else {
            throw new IllegalArgumentException("'To' position cannot be > 1");
        }
    }

    /* renamed from: E */
    public final void mo25747E() {
        float f;
        float f2;
        long e = this.f17632f.mo12196n().mo12254e();
        float f3 = this.f17652z;
        float f4 = 1.0f;
        if (f3 != 1.0f) {
            if (this.f17618B) {
                f2 = this.f17617A;
            } else {
                f2 = 1.0f - this.f17617A;
                f3 = 1.0f - f3;
            }
            f = f2 / f3;
        } else if (this.f17618B) {
            f = this.f17617A;
        } else {
            f = 1.0f - this.f17617A;
        }
        this.f17630d.mo26052f((long) (((float) e) * f));
        t42 t42 = this.f17630d;
        float f5 = this.f17617A;
        if (this.f17618B) {
            f4 = Utils.FLOAT_EPSILON;
        }
        t42.mo26053g(f5, f4);
        this.f17631e.mo28137c();
        mo25761y();
    }

    /* renamed from: F */
    public void mo25748F() {
        this.f17630d.mo26049b();
        mo25762z();
    }

    /* renamed from: G */
    public final void mo25749G() {
        Settings settings;
        float f;
        if (!this.f17622F) {
            GestureController gestureController = this.f17632f;
            if (gestureController == null) {
                settings = null;
            } else {
                settings = gestureController.mo12196n();
            }
            if (!(!this.f17649w || settings == null || this.f17648v == null)) {
                qd7 qd7 = this.f17647u;
                if (qd7 == null) {
                    qd7 = qd7.m25607f();
                }
                this.f17647u = qd7;
                Point point = f17616M;
                qj2.m25708a(settings, point);
                Rect rect = this.f17648v.f16922a;
                point.offset(rect.left, rect.top);
                qd7.m25603a(this.f17647u, point);
            }
            if (this.f17648v != null && this.f17647u != null && settings != null && settings.mo12271v()) {
                this.f17637k = (float) (this.f17647u.f16925d.centerX() - this.f17648v.f16923b.left);
                this.f17638l = (float) (this.f17647u.f16925d.centerY() - this.f17648v.f16923b.top);
                float l = (float) settings.mo12261l();
                float k = (float) settings.mo12260k();
                float f2 = 1.0f;
                if (l == Utils.FLOAT_EPSILON) {
                    f = 1.0f;
                } else {
                    f = ((float) this.f17647u.f16925d.width()) / l;
                }
                if (k != Utils.FLOAT_EPSILON) {
                    f2 = ((float) this.f17647u.f16925d.height()) / k;
                }
                float max = Math.max(f, f2);
                this.f17635i.mo24489l((((float) this.f17647u.f16925d.centerX()) - ((l * 0.5f) * max)) - ((float) this.f17648v.f16923b.left), (((float) this.f17647u.f16925d.centerY()) - ((k * 0.5f) * max)) - ((float) this.f17648v.f16923b.top), max, Utils.FLOAT_EPSILON);
                this.f17642p.set(this.f17647u.f16923b);
                RectF rectF = this.f17642p;
                Rect rect2 = this.f17648v.f16922a;
                rectF.offset((float) (-rect2.left), (float) (-rect2.top));
                RectF rectF2 = this.f17644r;
                Rect rect3 = this.f17641o;
                int i = rect3.left;
                Rect rect4 = this.f17648v.f16922a;
                int i2 = rect4.left;
                int i3 = rect3.top;
                int i4 = rect4.top;
                rectF2.set((float) (i - i2), (float) (i3 - i4), (float) (rect3.right - i2), (float) (rect3.bottom - i4));
                RectF rectF3 = this.f17644r;
                float f3 = rectF3.left;
                qd7 qd72 = this.f17647u;
                rectF3.left = mo25754p(f3, qd72.f16922a.left, qd72.f16924c.left, this.f17648v.f16922a.left);
                RectF rectF4 = this.f17644r;
                float f4 = rectF4.top;
                qd7 qd73 = this.f17647u;
                rectF4.top = mo25754p(f4, qd73.f16922a.top, qd73.f16924c.top, this.f17648v.f16922a.top);
                RectF rectF5 = this.f17644r;
                float f5 = rectF5.right;
                qd7 qd74 = this.f17647u;
                rectF5.right = mo25754p(f5, qd74.f16922a.right, qd74.f16924c.right, this.f17648v.f16922a.left);
                RectF rectF6 = this.f17644r;
                float f6 = rectF6.bottom;
                qd7 qd75 = this.f17647u;
                rectF6.bottom = mo25754p(f6, qd75.f16922a.bottom, qd75.f16924c.bottom, this.f17648v.f16922a.top);
                this.f17622F = true;
                of2.m23785a();
            }
        }
    }

    /* renamed from: H */
    public final void mo25750H() {
        Settings settings;
        if (!this.f17623G) {
            GestureController gestureController = this.f17632f;
            if (gestureController == null) {
                settings = null;
            } else {
                settings = gestureController.mo12196n();
            }
            if (this.f17648v != null && settings != null && settings.mo12271v()) {
                p86 p86 = this.f17636j;
                Matrix matrix = f17614K;
                p86.mo24480d(matrix);
                this.f17643q.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) settings.mo12261l(), (float) settings.mo12260k());
                float[] fArr = f17615L;
                fArr[0] = this.f17643q.centerX();
                fArr[1] = this.f17643q.centerY();
                matrix.mapPoints(fArr);
                this.f17639m = fArr[0];
                this.f17640n = fArr[1];
                matrix.postRotate(-this.f17636j.mo24481e(), this.f17639m, this.f17640n);
                matrix.mapRect(this.f17643q);
                RectF rectF = this.f17643q;
                qd7 qd7 = this.f17648v;
                Rect rect = qd7.f16923b;
                int i = rect.left;
                Rect rect2 = qd7.f16922a;
                rectF.offset((float) (i - rect2.left), (float) (rect.top - rect2.top));
                this.f17645s.set(this.f17641o);
                RectF rectF2 = this.f17645s;
                Rect rect3 = this.f17648v.f16922a;
                rectF2.offset((float) (-rect3.left), (float) (-rect3.top));
                this.f17623G = true;
                of2.m23785a();
            }
        }
    }

    /* renamed from: m */
    public void mo25751m(C3267e eVar) {
        this.f17627a.add(eVar);
        this.f17628b.remove(eVar);
    }

    /* renamed from: n */
    public final void mo25752n() {
        boolean z;
        boolean z2;
        boolean z3;
        RectF rectF;
        if (this.f17651y) {
            if (this.f17620D) {
                this.f17621E = true;
                return;
            }
            this.f17620D = true;
            if (!this.f17618B ? this.f17617A != 1.0f : this.f17617A != Utils.FLOAT_EPSILON) {
                z = false;
            } else {
                z = true;
            }
            this.f17624H.mo26413g(z);
            this.f17625I.mo26413g(z);
            if (!this.f17623G) {
                mo25750H();
            }
            if (!this.f17622F) {
                mo25749G();
            }
            if (of2.m23785a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Applying state: ");
                sb.append(this.f17617A);
                sb.append(" / ");
                sb.append(this.f17618B);
                sb.append(", 'to' ready = ");
                sb.append(this.f17623G);
                sb.append(", 'from' ready = ");
                sb.append(this.f17622F);
            }
            float f = this.f17617A;
            float f2 = this.f17652z;
            if (f < f2 || (this.f17619C && f == f2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f17623G && this.f17622F && z2) {
                p86 o = this.f17632f.mo12197o();
                cp3.m14354c(o, this.f17635i, this.f17637k, this.f17638l, this.f17636j, this.f17639m, this.f17640n, this.f17617A / this.f17652z);
                this.f17632f.mo12191V();
                float f3 = this.f17617A;
                float f4 = this.f17652z;
                if (f3 >= f4 || (f3 == Utils.FLOAT_EPSILON && this.f17618B)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                float f5 = f3 / f4;
                RectF rectF2 = null;
                if (this.f17633g != null) {
                    cp3.m14355d(this.f17646t, this.f17642p, this.f17643q, f5);
                    xg0 xg0 = this.f17633g;
                    if (z3) {
                        rectF = null;
                    } else {
                        rectF = this.f17646t;
                    }
                    xg0.mo12292b(rectF, o.mo24481e());
                }
                if (this.f17634h != null) {
                    cp3.m14355d(this.f17646t, this.f17644r, this.f17645s, f5);
                    ug0 ug0 = this.f17634h;
                    if (!z3) {
                        rectF2 = this.f17646t;
                    }
                    ug0.mo12326a(rectF2);
                }
            }
            this.f17629c = true;
            int size = this.f17627a.size();
            for (int i = 0; i < size && !this.f17621E; i++) {
                this.f17627a.get(i).mo12300a(this.f17617A, this.f17618B);
            }
            this.f17629c = false;
            mo25755q();
            if (this.f17617A == Utils.FLOAT_EPSILON && this.f17618B) {
                mo25753o();
                this.f17651y = false;
                this.f17632f.mo12186Q();
            }
            this.f17620D = false;
            if (this.f17621E) {
                this.f17621E = false;
                mo25752n();
            }
        }
    }

    /* renamed from: o */
    public final void mo25753o() {
        of2.m23785a();
        View view = this.f17650x;
        if (view != null) {
            view.setVisibility(0);
        }
        xg0 xg0 = this.f17633g;
        if (xg0 != null) {
            xg0.mo12292b((RectF) null, Utils.FLOAT_EPSILON);
        }
        this.f17624H.mo26410b();
        this.f17650x = null;
        this.f17647u = null;
        this.f17649w = false;
        this.f17623G = false;
        this.f17622F = false;
    }

    /* renamed from: p */
    public final float mo25754p(float f, int i, int i2, int i3) {
        int i4 = i - i2;
        return (-1 > i4 || i4 > 1) ? (float) (i2 - i3) : f;
    }

    /* renamed from: q */
    public final void mo25755q() {
        this.f17627a.removeAll(this.f17628b);
        this.f17628b.clear();
    }

    /* renamed from: r */
    public void mo25756r(boolean z) {
        if (of2.m23785a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Exiting, with animation = ");
            sb.append(z);
        }
        if (this.f17651y) {
            boolean z2 = this.f17619C;
            float f = Utils.FLOAT_EPSILON;
            if ((!z2 || this.f17617A > this.f17652z) && this.f17617A > Utils.FLOAT_EPSILON) {
                mo25746D(this.f17632f.mo12197o(), this.f17617A);
            }
            if (z) {
                f = this.f17617A;
            }
            mo25745C(f, true, z);
            return;
        }
        throw new IllegalStateException("You should call enter(...) before calling exit(...)");
    }

    /* renamed from: u */
    public float mo25757u() {
        return this.f17617A;
    }

    /* renamed from: v */
    public float mo25758v() {
        return this.f17652z;
    }

    /* renamed from: w */
    public boolean mo25759w() {
        return this.f17619C;
    }

    /* renamed from: x */
    public boolean mo25760x() {
        return this.f17618B;
    }

    /* renamed from: y */
    public final void mo25761y() {
        if (!this.f17619C) {
            this.f17619C = true;
            of2.m23785a();
            this.f17632f.mo12196n().mo12250a().mo12251b();
            this.f17632f.mo12188S();
            GestureController gestureController = this.f17632f;
            if (gestureController instanceof nf2) {
                ((nf2) gestureController).mo23666Y(true);
            }
        }
    }

    /* renamed from: z */
    public final void mo25762z() {
        if (this.f17619C) {
            this.f17619C = false;
            of2.m23785a();
            this.f17632f.mo12196n().mo12252c().mo12253d();
            GestureController gestureController = this.f17632f;
            if (gestureController instanceof nf2) {
                ((nf2) gestureController).mo23666Y(false);
            }
            this.f17632f.mo12193k();
        }
    }
}
