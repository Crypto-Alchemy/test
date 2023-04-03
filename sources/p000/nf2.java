package p000;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import com.alexvasilkov.gestures.GestureController;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: nf2 */
/* compiled from: GestureControllerForPager */
public class nf2 extends GestureController {

    /* renamed from: J1 */
    public static final Matrix f15524J1 = new Matrix();

    /* renamed from: K1 */
    public static final RectF f15525K1 = new RectF();

    /* renamed from: L1 */
    public static final View.OnTouchListener f15526L1 = new C2893a();

    /* renamed from: A1 */
    public final int f15527A1;

    /* renamed from: B1 */
    public ViewPager f15528B1;

    /* renamed from: C1 */
    public boolean f15529C1;

    /* renamed from: D1 */
    public boolean f15530D1;

    /* renamed from: E1 */
    public boolean f15531E1;

    /* renamed from: F1 */
    public int f15532F1;

    /* renamed from: G1 */
    public float f15533G1;

    /* renamed from: H1 */
    public boolean f15534H1;

    /* renamed from: I1 */
    public float f15535I1;

    /* renamed from: nf2$a */
    /* compiled from: GestureControllerForPager */
    public class C2893a implements View.OnTouchListener {

        /* renamed from: a */
        public boolean f15536a;

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f15536a || motionEvent.getActionMasked() != 0) {
                nf2.m23142f0((ViewPager) view, motionEvent);
                return true;
            }
            this.f15536a = true;
            view.dispatchTouchEvent(motionEvent);
            this.f15536a = false;
            return true;
        }
    }

    public nf2(View view) {
        super(view);
        this.f15527A1 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    /* renamed from: b0 */
    public static MotionEvent m23141b0(MotionEvent motionEvent) {
        return MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    /* renamed from: f0 */
    public static void m23142f0(ViewPager viewPager, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            try {
                viewPager.mo10680e();
                if (viewPager.mo10732z()) {
                    viewPager.mo10711q();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: i0 */
    public static void m23143i0(Matrix matrix, View view, ViewPager viewPager) {
        if (view.getParent() instanceof View) {
            View view2 = (View) view.getParent();
            if (view2 != viewPager) {
                m23143i0(matrix, view2, viewPager);
            }
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: j0 */
    public static void m23144j0(MotionEvent motionEvent, View view, ViewPager viewPager) {
        Matrix matrix = f15524J1;
        matrix.reset();
        m23143i0(matrix, view, viewPager);
        motionEvent.transform(matrix);
    }

    /* renamed from: F */
    public boolean mo12175F(wh5 wh5) {
        if (mo23668a0() || !super.mo12175F(wh5)) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo12178I(ScaleGestureDetector scaleGestureDetector) {
        if (mo23668a0() || !super.mo12178I(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public boolean mo12180K(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f15528B1 == null) {
            return super.mo12180K(motionEvent, motionEvent2, f, f2);
        }
        if (!this.f15530D1) {
            this.f15530D1 = true;
            return true;
        }
        float f3 = -mo23671e0(motionEvent2, -f);
        if (mo23668a0()) {
            f2 = Utils.FLOAT_EPSILON;
        }
        return super.mo12180K(motionEvent, motionEvent2, f3, f2);
    }

    /* renamed from: O */
    public boolean mo12184O(View view, MotionEvent motionEvent) {
        if (this.f15528B1 == null) {
            return super.mo12184O(view, motionEvent);
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        m23144j0(obtain, view, this.f15528B1);
        mo23667Z(obtain);
        boolean O = super.mo12184O(view, obtain);
        obtain.recycle();
        return O;
    }

    /* renamed from: P */
    public void mo12185P(MotionEvent motionEvent) {
        mo23669c0(motionEvent);
        super.mo12185P(motionEvent);
    }

    /* renamed from: R */
    public boolean mo12187R(MotionEvent motionEvent) {
        if (this.f15528B1 != null || super.mo12187R(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final int mo23665X(MotionEvent motionEvent) {
        int scrollX = this.f15528B1.getScrollX();
        int width = this.f15528B1.getWidth() + this.f15528B1.getPageMargin();
        while (scrollX < 0) {
            scrollX += width;
        }
        return (width * ((int) ((((float) scrollX) + motionEvent.getX()) / ((float) width)))) - scrollX;
    }

    /* renamed from: Y */
    public void mo23666Y(boolean z) {
        this.f15529C1 = z;
    }

    /* renamed from: Z */
    public final void mo23667Z(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 5 && motionEvent.getPointerCount() == 2) {
            this.f15531E1 = !mo23668a0();
        }
    }

    /* renamed from: a0 */
    public final boolean mo23668a0() {
        int i = this.f15532F1;
        if (i < -1 || i > 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public final void mo23669c0(MotionEvent motionEvent) {
        if (this.f15528B1 != null) {
            MotionEvent b0 = m23141b0(motionEvent);
            b0.setLocation(this.f15535I1, Utils.FLOAT_EPSILON);
            if (this.f15534H1) {
                this.f15528B1.onTouchEvent(b0);
            } else {
                this.f15534H1 = this.f15528B1.onInterceptTouchEvent(b0);
            }
            if (!this.f15534H1 && mo23668a0()) {
                m23142f0(this.f15528B1, motionEvent);
            }
            try {
                ViewPager viewPager = this.f15528B1;
                if (viewPager != null && viewPager.mo10732z()) {
                    this.f15528B1.mo10711q();
                }
            } catch (Exception unused) {
            }
            b0.recycle();
        }
    }

    /* renamed from: d0 */
    public final int mo23670d0(MotionEvent motionEvent, float f) {
        int scrollX = this.f15528B1.getScrollX();
        this.f15535I1 += f;
        mo23669c0(motionEvent);
        return scrollX - this.f15528B1.getScrollX();
    }

    /* renamed from: e0 */
    public final float mo23671e0(MotionEvent motionEvent, float f) {
        boolean z;
        if (this.f15531E1 || this.f15529C1) {
            return f;
        }
        p86 o = mo12197o();
        s86 p = mo12199p();
        RectF rectF = f15525K1;
        p.mo25666g(o, rectF);
        float g0 = mo23672g0(mo23673h0(f, o, rectF), o, rectF);
        float f2 = f - g0;
        if (!this.f15534H1 || this.f15532F1 != 0) {
            z = false;
        } else {
            z = true;
        }
        int d0 = mo23670d0(motionEvent, g0);
        this.f15532F1 += d0;
        if (z) {
            return f2 + ((float) (Math.round(g0) - d0));
        }
        return f2;
    }

    /* renamed from: g0 */
    public final float mo23672g0(float f, p86 p86, RectF rectF) {
        float f2;
        float f3;
        float r = mo12196n().mo12267r() * 4.0f;
        float g = p86.mo24484g();
        float f4 = rectF.top;
        if (g < f4) {
            f2 = (f4 - p86.mo24484g()) / r;
        } else if (p86.mo24484g() > rectF.bottom) {
            f2 = (p86.mo24484g() - rectF.bottom) / r;
        } else {
            f2 = 0.0f;
        }
        float e = mo12199p().mo25664e(p86);
        if (e == Utils.FLOAT_EPSILON) {
            f3 = 0.0f;
        } else {
            f3 = (p86.mo24485h() / e) - 1.0f;
        }
        float sqrt = ((float) Math.sqrt((double) Math.max(Utils.FLOAT_EPSILON, Math.min(Math.max(f2, f3), 1.0f)))) * ((float) this.f15527A1) * 15.0f;
        if (this.f15533G1 * f < Utils.FLOAT_EPSILON && this.f15532F1 == 0) {
            this.f15533G1 = Utils.FLOAT_EPSILON;
        }
        if (mo23668a0()) {
            this.f15533G1 = Math.signum((float) this.f15532F1) * sqrt;
        }
        if (Math.abs(this.f15533G1) < sqrt) {
            float f5 = this.f15533G1;
            if (f * f5 >= Utils.FLOAT_EPSILON) {
                float f6 = f5 + f;
                this.f15533G1 = f6;
                float max = Math.max(Utils.FLOAT_EPSILON, Math.abs(f6) - sqrt) * Math.signum(f);
                this.f15533G1 -= max;
                return max;
            }
        }
        return f;
    }

    /* renamed from: h0 */
    public final float mo23673h0(float f, p86 p86, RectF rectF) {
        float f2;
        float f3;
        if (!mo12196n().mo12239E()) {
            return f;
        }
        float signum = Math.signum(f);
        float abs = Math.abs(f);
        float f4 = p86.mo24483f();
        float f5 = Utils.FLOAT_EPSILON;
        if (signum < Utils.FLOAT_EPSILON) {
            f2 = f4 - rectF.left;
        } else {
            f2 = rectF.right - f4;
        }
        int i = this.f15532F1;
        if (((float) i) * signum < Utils.FLOAT_EPSILON) {
            f3 = (float) Math.abs(i);
        } else {
            f3 = 0.0f;
        }
        if (f2 >= Utils.FLOAT_EPSILON) {
            f5 = f2;
        }
        if (f3 < abs) {
            if (f5 + f3 >= abs) {
                abs = f3;
            } else {
                abs -= f5;
            }
        }
        return abs * signum;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouch = super.onTouch(view, motionEvent);
        if (this.f15528B1 != null || onTouch) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public boolean mo12207x(MotionEvent motionEvent) {
        if (mo23668a0() || !super.mo12207x(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public boolean mo12208y(MotionEvent motionEvent) {
        if (this.f15528B1 == null) {
            return super.mo12208y(motionEvent);
        }
        this.f15531E1 = false;
        this.f15534H1 = false;
        this.f15530D1 = false;
        this.f15532F1 = mo23665X(motionEvent);
        this.f15535I1 = motionEvent.getX();
        this.f15533G1 = Utils.FLOAT_EPSILON;
        mo23669c0(motionEvent);
        return super.mo12208y(motionEvent);
    }

    /* renamed from: z */
    public boolean mo12209z(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (mo23668a0() || !super.mo12209z(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }
}
