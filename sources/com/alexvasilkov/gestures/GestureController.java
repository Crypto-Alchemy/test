package com.alexvasilkov.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p000.wh5;

public class GestureController implements View.OnTouchListener {

    /* renamed from: w1 */
    public static final PointF f8532w1 = new PointF();

    /* renamed from: x1 */
    public static final Point f8533x1 = new Point();

    /* renamed from: y1 */
    public static final RectF f8534y1 = new RectF();

    /* renamed from: z1 */
    public static final float[] f8535z1 = new float[2];

    /* renamed from: A */
    public final wh5 f8536A;

    /* renamed from: B */
    public boolean f8537B;

    /* renamed from: C */
    public boolean f8538C;

    /* renamed from: H */
    public boolean f8539H;

    /* renamed from: I */
    public boolean f8540I;

    /* renamed from: L */
    public boolean f8541L;

    /* renamed from: M */
    public float f8542M = Float.NaN;

    /* renamed from: P */
    public float f8543P = Float.NaN;

    /* renamed from: Q */
    public float f8544Q = Float.NaN;

    /* renamed from: U */
    public float f8545U = Float.NaN;

    /* renamed from: X */
    public boolean f8546X;

    /* renamed from: Y */
    public boolean f8547Y;

    /* renamed from: Z */
    public boolean f8548Z;

    /* renamed from: a */
    public final int f8549a;

    /* renamed from: b1 */
    public final t42 f8550b1;

    /* renamed from: d */
    public final int f8551d;

    /* renamed from: e */
    public final int f8552e;

    /* renamed from: e0 */
    public boolean f8553e0;

    /* renamed from: e1 */
    public final az3 f8554e1;

    /* renamed from: g */
    public C1703d f8555g;

    /* renamed from: k */
    public C1705f f8556k;

    /* renamed from: k0 */
    public StateSource f8557k0 = StateSource.NONE;

    /* renamed from: o1 */
    public final p86 f8558o1 = new p86();

    /* renamed from: p1 */
    public final p86 f8559p1 = new p86();

    /* renamed from: q1 */
    public final View f8560q1;

    /* renamed from: r */
    public final List<C1704e> f8561r = new ArrayList();

    /* renamed from: r1 */
    public final Settings f8562r1;

    /* renamed from: s */
    public final C3683yk f8563s;

    /* renamed from: s1 */
    public final p86 f8564s1 = new p86();

    /* renamed from: t1 */
    public final p86 f8565t1 = new p86();

    /* renamed from: u1 */
    public final s86 f8566u1;

    /* renamed from: v0 */
    public final OverScroller f8567v0;

    /* renamed from: v1 */
    public final fv1 f8568v1;

    /* renamed from: x */
    public final GestureDetector f8569x;

    /* renamed from: y */
    public final ScaleGestureDetector f8570y;

    public enum StateSource {
        NONE,
        USER,
        ANIMATION
    }

    /* renamed from: com.alexvasilkov.gestures.GestureController$b */
    public class C1701b implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, wh5.C3550a {
        public C1701b() {
        }

        /* renamed from: a */
        public boolean mo12210a(wh5 wh5) {
            return GestureController.this.mo12175F(wh5);
        }

        /* renamed from: b */
        public void mo12211b(wh5 wh5) {
            GestureController.this.mo12176G(wh5);
        }

        /* renamed from: c */
        public boolean mo12212c(wh5 wh5) {
            return GestureController.this.mo12174E(wh5);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return GestureController.this.mo12207x(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            return GestureController.this.mo12208y(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return GestureController.this.mo12209z(motionEvent, motionEvent2, f, f2);
        }

        public void onLongPress(MotionEvent motionEvent) {
            GestureController.this.mo12173D(motionEvent);
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            return GestureController.this.mo12177H(scaleGestureDetector);
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return GestureController.this.mo12178I(scaleGestureDetector);
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            GestureController.this.mo12179J(scaleGestureDetector);
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return GestureController.this.mo12180K(motionEvent, motionEvent2, f, f2);
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return GestureController.this.mo12181L(motionEvent);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return GestureController.this.mo12182M(motionEvent);
        }
    }

    /* renamed from: com.alexvasilkov.gestures.GestureController$c */
    public class C1702c extends C3683yk {
        public C1702c(View view) {
            super(view);
        }

        /* renamed from: a */
        public boolean mo12225a() {
            boolean z;
            boolean z2 = true;
            if (GestureController.this.mo12201r()) {
                int currX = GestureController.this.f8567v0.getCurrX();
                int currY = GestureController.this.f8567v0.getCurrY();
                if (GestureController.this.f8567v0.computeScrollOffset()) {
                    if (!GestureController.this.mo12171B(GestureController.this.f8567v0.getCurrX() - currX, GestureController.this.f8567v0.getCurrY() - currY)) {
                        GestureController.this.mo12189T();
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (!GestureController.this.mo12201r()) {
                    GestureController.this.mo12170A(false);
                }
            } else {
                z = false;
            }
            if (GestureController.this.mo12202s()) {
                GestureController.this.f8550b1.mo26048a();
                cp3.m14354c(GestureController.this.f8564s1, GestureController.this.f8558o1, GestureController.this.f8542M, GestureController.this.f8543P, GestureController.this.f8559p1, GestureController.this.f8544Q, GestureController.this.f8545U, GestureController.this.f8550b1.mo26050c());
                if (!GestureController.this.mo12202s()) {
                    GestureController.this.mo12183N(false);
                }
            } else {
                z2 = z;
            }
            if (z2) {
                GestureController.this.mo12206w();
            }
            return z2;
        }
    }

    /* renamed from: com.alexvasilkov.gestures.GestureController$d */
    public interface C1703d {
        /* renamed from: a */
        void mo12226a(MotionEvent motionEvent);

        boolean onDoubleTap(MotionEvent motionEvent);

        void onDown(MotionEvent motionEvent);

        void onLongPress(MotionEvent motionEvent);

        boolean onSingleTapConfirmed(MotionEvent motionEvent);

        boolean onSingleTapUp(MotionEvent motionEvent);
    }

    /* renamed from: com.alexvasilkov.gestures.GestureController$e */
    public interface C1704e {
        /* renamed from: a */
        void mo12232a(p86 p86);

        /* renamed from: b */
        void mo12233b(p86 p86, p86 p862);
    }

    /* renamed from: com.alexvasilkov.gestures.GestureController$f */
    public interface C1705f {
        /* renamed from: a */
        void mo12234a(StateSource stateSource);
    }

    public GestureController(View view) {
        Context context = view.getContext();
        this.f8560q1 = view;
        Settings settings = new Settings();
        this.f8562r1 = settings;
        this.f8566u1 = new s86(settings);
        this.f8563s = new C1702c(view);
        C1701b bVar = new C1701b();
        this.f8569x = new GestureDetector(context, bVar);
        this.f8570y = new ul5(context, bVar);
        this.f8536A = new wh5(context, bVar);
        this.f8568v1 = new fv1(view, this);
        this.f8567v0 = new OverScroller(context);
        this.f8550b1 = new t42();
        this.f8554e1 = new az3(settings);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8549a = viewConfiguration.getScaledTouchSlop();
        this.f8551d = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8552e = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: A */
    public void mo12170A(boolean z) {
        if (!z) {
            mo12193k();
        }
        mo12205v();
    }

    /* renamed from: B */
    public boolean mo12171B(int i, int i2) {
        float f = this.f8564s1.mo24483f();
        float g = this.f8564s1.mo24484g();
        float f2 = ((float) i) + f;
        float f3 = ((float) i2) + g;
        if (this.f8562r1.mo12240F()) {
            az3 az3 = this.f8554e1;
            PointF pointF = f8532w1;
            az3.mo11310h(f2, f3, pointF);
            f2 = pointF.x;
            f3 = pointF.y;
        }
        this.f8564s1.mo24492o(f2, f3);
        if (!p86.m24755c(f, f2) || !p86.m24755c(g, f3)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo12172C(View view, MotionEvent motionEvent) {
        this.f8537B = true;
        return mo12184O(view, motionEvent);
    }

    /* renamed from: D */
    public void mo12173D(MotionEvent motionEvent) {
        if (this.f8562r1.mo12275z()) {
            this.f8560q1.performLongClick();
            C1703d dVar = this.f8555g;
            if (dVar != null) {
                dVar.onLongPress(motionEvent);
            }
        }
    }

    /* renamed from: E */
    public boolean mo12174E(wh5 wh5) {
        if (!this.f8562r1.mo12242H() || mo12202s()) {
            return false;
        }
        if (this.f8568v1.mo20222j()) {
            return true;
        }
        this.f8542M = wh5.mo27539c();
        this.f8543P = wh5.mo27540d();
        this.f8564s1.mo24487j(wh5.mo27541e(), this.f8542M, this.f8543P);
        this.f8546X = true;
        return true;
    }

    /* renamed from: F */
    public boolean mo12175F(wh5 wh5) {
        boolean H = this.f8562r1.mo12242H();
        this.f8541L = H;
        if (H) {
            this.f8568v1.mo20223k();
        }
        return this.f8541L;
    }

    /* renamed from: G */
    public void mo12176G(wh5 wh5) {
        if (this.f8541L) {
            this.f8568v1.mo20224l();
        }
        this.f8541L = false;
        this.f8548Z = true;
    }

    /* renamed from: H */
    public boolean mo12177H(ScaleGestureDetector scaleGestureDetector) {
        if (this.f8562r1.mo12243I() && !mo12202s()) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (!Float.isNaN(scaleFactor) && !Float.isNaN(scaleGestureDetector.getFocusX()) && !Float.isNaN(scaleGestureDetector.getFocusY())) {
                if (this.f8568v1.mo20225m(scaleFactor)) {
                    return true;
                }
                this.f8542M = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                this.f8543P = focusY;
                this.f8564s1.mo24494q(scaleFactor, this.f8542M, focusY);
                this.f8546X = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo12178I(ScaleGestureDetector scaleGestureDetector) {
        boolean I = this.f8562r1.mo12243I();
        this.f8540I = I;
        if (I) {
            this.f8568v1.mo20226n();
        }
        return this.f8540I;
    }

    /* renamed from: J */
    public void mo12179J(ScaleGestureDetector scaleGestureDetector) {
        if (this.f8540I) {
            this.f8568v1.mo20227o();
        }
        this.f8540I = false;
        this.f8547Y = true;
    }

    /* renamed from: K */
    public boolean mo12180K(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        if (!this.f8562r1.mo12239E() || mo12202s() || Float.isNaN(f) || Float.isNaN(f2)) {
            return false;
        }
        float f3 = -f;
        float f4 = -f2;
        if (this.f8568v1.mo20228p(f3, f4)) {
            return true;
        }
        if (!this.f8539H) {
            if (Math.abs(motionEvent2.getX() - motionEvent.getX()) > ((float) this.f8549a) || Math.abs(motionEvent2.getY() - motionEvent.getY()) > ((float) this.f8549a)) {
                z = true;
            } else {
                z = false;
            }
            this.f8539H = z;
            if (z) {
                return false;
            }
        }
        if (this.f8539H) {
            this.f8564s1.mo24491n(f3, f4);
            this.f8546X = true;
        }
        return this.f8539H;
    }

    /* renamed from: L */
    public boolean mo12181L(MotionEvent motionEvent) {
        if (this.f8562r1.mo12274y()) {
            this.f8560q1.performClick();
        }
        C1703d dVar = this.f8555g;
        if (dVar == null || !dVar.onSingleTapConfirmed(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public boolean mo12182M(MotionEvent motionEvent) {
        if (!this.f8562r1.mo12274y()) {
            this.f8560q1.performClick();
        }
        C1703d dVar = this.f8555g;
        if (dVar == null || !dVar.onSingleTapUp(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public void mo12183N(boolean z) {
        this.f8553e0 = false;
        this.f8542M = Float.NaN;
        this.f8543P = Float.NaN;
        this.f8544Q = Float.NaN;
        this.f8545U = Float.NaN;
        mo12205v();
    }

    /* renamed from: O */
    public boolean mo12184O(View view, MotionEvent motionEvent) {
        boolean z;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (-view.getPaddingLeft()), (float) (-view.getPaddingTop()));
        this.f8569x.setIsLongpressEnabled(view.isLongClickable());
        boolean onTouchEvent = this.f8569x.onTouchEvent(obtain);
        this.f8570y.onTouchEvent(obtain);
        this.f8536A.mo27542f(obtain);
        if (onTouchEvent || this.f8540I || this.f8541L) {
            z = true;
        } else {
            z = false;
        }
        mo12205v();
        if (this.f8568v1.mo20219g() && !this.f8564s1.equals(this.f8565t1)) {
            mo12206w();
        }
        if (this.f8546X) {
            this.f8546X = false;
            this.f8566u1.mo25668i(this.f8564s1, this.f8565t1, this.f8542M, this.f8543P, true, true, false);
            if (!this.f8564s1.equals(this.f8565t1)) {
                mo12206w();
            }
        }
        if (this.f8547Y || this.f8548Z) {
            this.f8547Y = false;
            this.f8548Z = false;
            if (!this.f8568v1.mo20219g()) {
                mo12195m(this.f8566u1.mo25669j(this.f8564s1, this.f8565t1, this.f8542M, this.f8543P, true, false, true), false);
            }
        }
        if (obtain.getActionMasked() == 1 || obtain.getActionMasked() == 3) {
            mo12185P(obtain);
            mo12205v();
        }
        if (!this.f8538C && mo12187R(obtain)) {
            this.f8538C = true;
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        obtain.recycle();
        return z;
    }

    /* renamed from: P */
    public void mo12185P(MotionEvent motionEvent) {
        this.f8539H = false;
        this.f8540I = false;
        this.f8541L = false;
        this.f8568v1.mo20229q();
        if (!mo12201r() && !this.f8553e0) {
            mo12193k();
        }
        C1703d dVar = this.f8555g;
        if (dVar != null) {
            dVar.mo12226a(motionEvent);
        }
    }

    /* renamed from: Q */
    public void mo12186Q() {
        mo12188S();
        if (this.f8566u1.mo25667h(this.f8564s1)) {
            mo12204u();
        } else {
            mo12206w();
        }
    }

    /* renamed from: R */
    public boolean mo12187R(MotionEvent motionEvent) {
        boolean z;
        if (this.f8568v1.mo20219g()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            s86 s86 = this.f8566u1;
            p86 p86 = this.f8564s1;
            RectF rectF = f8534y1;
            s86.mo25666g(p86, rectF);
            if (p86.m24754a(rectF.width(), Utils.FLOAT_EPSILON) > 0 || p86.m24754a(rectF.height(), Utils.FLOAT_EPSILON) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!this.f8562r1.mo12239E() || (!z && this.f8562r1.mo12240F())) {
                return false;
            }
            return true;
        } else if (actionMasked == 5) {
            if (this.f8562r1.mo12243I() || this.f8562r1.mo12242H()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: S */
    public void mo12188S() {
        mo12190U();
        mo12189T();
    }

    /* renamed from: T */
    public void mo12189T() {
        if (mo12201r()) {
            this.f8567v0.forceFinished(true);
            mo12170A(true);
        }
    }

    /* renamed from: U */
    public void mo12190U() {
        if (mo12202s()) {
            this.f8550b1.mo26049b();
            mo12183N(true);
        }
    }

    /* renamed from: V */
    public void mo12191V() {
        this.f8566u1.mo25662c(this.f8564s1);
        this.f8566u1.mo25662c(this.f8565t1);
        this.f8566u1.mo25662c(this.f8558o1);
        this.f8566u1.mo25662c(this.f8559p1);
        this.f8568v1.mo20213a();
        if (this.f8566u1.mo25672m(this.f8564s1)) {
            mo12204u();
        } else {
            mo12206w();
        }
    }

    /* renamed from: j */
    public void mo12192j(C1704e eVar) {
        this.f8561r.add(eVar);
    }

    /* renamed from: k */
    public boolean mo12193k() {
        return mo12195m(this.f8564s1, true);
    }

    /* renamed from: l */
    public boolean mo12194l(p86 p86) {
        return mo12195m(p86, true);
    }

    /* renamed from: m */
    public final boolean mo12195m(p86 p86, boolean z) {
        if (p86 == null) {
            return false;
        }
        mo12188S();
        if (Float.isNaN(this.f8542M) || Float.isNaN(this.f8543P)) {
            Settings settings = this.f8562r1;
            Point point = f8533x1;
            qj2.m25708a(settings, point);
            this.f8542M = (float) point.x;
            this.f8543P = (float) point.y;
        }
        p86 p862 = null;
        if (z) {
            p862 = this.f8566u1.mo25669j(p86, this.f8565t1, this.f8542M, this.f8543P, false, false, true);
        }
        if (p862 != null) {
            p86 = p862;
        }
        if (p86.equals(this.f8564s1)) {
            return false;
        }
        this.f8553e0 = z;
        this.f8558o1.mo24490m(this.f8564s1);
        this.f8559p1.mo24490m(p86);
        float[] fArr = f8535z1;
        fArr[0] = this.f8542M;
        fArr[1] = this.f8543P;
        cp3.m14352a(fArr, this.f8558o1, this.f8559p1);
        this.f8544Q = fArr[0];
        this.f8545U = fArr[1];
        this.f8550b1.mo26052f(this.f8562r1.mo12254e());
        this.f8550b1.mo26053g(Utils.FLOAT_EPSILON, 1.0f);
        this.f8563s.mo28137c();
        mo12205v();
        return true;
    }

    /* renamed from: n */
    public Settings mo12196n() {
        return this.f8562r1;
    }

    /* renamed from: o */
    public p86 mo12197o() {
        return this.f8564s1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f8537B) {
            mo12184O(view, motionEvent);
        }
        this.f8537B = false;
        return this.f8562r1.mo12275z();
    }

    /* renamed from: p */
    public s86 mo12199p() {
        return this.f8566u1;
    }

    /* renamed from: q */
    public boolean mo12200q() {
        if (mo12202s() || mo12201r()) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo12201r() {
        return !this.f8567v0.isFinished();
    }

    /* renamed from: s */
    public boolean mo12202s() {
        return !this.f8550b1.mo26051e();
    }

    /* renamed from: t */
    public final int mo12203t(float f) {
        if (Math.abs(f) < ((float) this.f8551d)) {
            return 0;
        }
        if (Math.abs(f) >= ((float) this.f8552e)) {
            return ((int) Math.signum(f)) * this.f8552e;
        }
        return Math.round(f);
    }

    /* renamed from: u */
    public void mo12204u() {
        this.f8568v1.mo20231s();
        for (C1704e b : this.f8561r) {
            b.mo12233b(this.f8565t1, this.f8564s1);
        }
        mo12206w();
    }

    /* renamed from: v */
    public final void mo12205v() {
        StateSource stateSource = StateSource.NONE;
        if (mo12200q()) {
            stateSource = StateSource.ANIMATION;
        } else if (this.f8539H || this.f8540I || this.f8541L) {
            stateSource = StateSource.USER;
        }
        if (this.f8557k0 != stateSource) {
            this.f8557k0 = stateSource;
            C1705f fVar = this.f8556k;
            if (fVar != null) {
                fVar.mo12234a(stateSource);
            }
        }
    }

    /* renamed from: w */
    public void mo12206w() {
        this.f8565t1.mo24490m(this.f8564s1);
        for (C1704e a : this.f8561r) {
            a.mo12232a(this.f8564s1);
        }
    }

    /* renamed from: x */
    public boolean mo12207x(MotionEvent motionEvent) {
        if (!this.f8562r1.mo12274y() || motionEvent.getActionMasked() != 1 || this.f8540I) {
            return false;
        }
        C1703d dVar = this.f8555g;
        if (dVar != null && dVar.onDoubleTap(motionEvent)) {
            return true;
        }
        mo12194l(this.f8566u1.mo25671l(this.f8564s1, motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    /* renamed from: y */
    public boolean mo12208y(MotionEvent motionEvent) {
        this.f8538C = false;
        mo12189T();
        C1703d dVar = this.f8555g;
        if (dVar != null) {
            dVar.onDown(motionEvent);
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo12209z(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f8562r1.mo12239E() || !this.f8562r1.mo12237C() || mo12202s()) {
            return false;
        }
        if (this.f8568v1.mo20221i()) {
            return true;
        }
        mo12189T();
        this.f8554e1.mo11311i(this.f8564s1).mo11307e(this.f8564s1.mo24483f(), this.f8564s1.mo24484g());
        this.f8567v0.fling(Math.round(this.f8564s1.mo24483f()), Math.round(this.f8564s1.mo24484g()), mo12203t(f * 0.9f), mo12203t(f2 * 0.9f), Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f8563s.mo28137c();
        mo12205v();
        return true;
    }
}
