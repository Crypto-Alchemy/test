package p000;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

@SuppressLint({"ViewConstructor"})
/* renamed from: fg2 */
/* compiled from: GhostViewPort */
public class fg2 extends ViewGroup implements cg2 {

    /* renamed from: a */
    public ViewGroup f11825a;

    /* renamed from: d */
    public View f11826d;

    /* renamed from: e */
    public final View f11827e;

    /* renamed from: g */
    public int f11828g;

    /* renamed from: k */
    public Matrix f11829k;

    /* renamed from: r */
    public final ViewTreeObserver.OnPreDrawListener f11830r = new C2291a();

    /* renamed from: fg2$a */
    /* compiled from: GhostViewPort */
    public class C2291a implements ViewTreeObserver.OnPreDrawListener {
        public C2291a() {
        }

        public boolean onPreDraw() {
            View view;
            ga7.m17767g0(fg2.this);
            fg2 fg2 = fg2.this;
            ViewGroup viewGroup = fg2.f11825a;
            if (viewGroup == null || (view = fg2.f11826d) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            ga7.m17767g0(fg2.this.f11825a);
            fg2 fg22 = fg2.this;
            fg22.f11825a = null;
            fg22.f11826d = null;
            return true;
        }
    }

    public fg2(View view) {
        super(view.getContext());
        this.f11827e = view;
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
    }

    /* renamed from: b */
    public static fg2 m16982b(View view, ViewGroup viewGroup, Matrix matrix) {
        dg2 dg2;
        if (view.getParent() instanceof ViewGroup) {
            dg2 b = dg2.m15101b(viewGroup);
            fg2 e = m16985e(view);
            int i = 0;
            if (!(e == null || (dg2 = (dg2) e.getParent()) == b)) {
                i = e.f11828g;
                dg2.removeView(e);
                e = null;
            }
            if (e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m16983c(view, viewGroup, matrix);
                }
                e = new fg2(view);
                e.mo19906h(matrix);
                if (b == null) {
                    b = new dg2(viewGroup);
                } else {
                    b.mo18763g();
                }
                m16984d(viewGroup, b);
                m16984d(viewGroup, e);
                b.mo18761a(e);
                e.f11828g = i;
            } else if (matrix != null) {
                e.mo19906h(matrix);
            }
            e.f11828g++;
            return e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    public static void m16983c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        qe7.m25634j(viewGroup2, matrix);
        matrix.preTranslate((float) (-viewGroup2.getScrollX()), (float) (-viewGroup2.getScrollY()));
        qe7.m25635k(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m16984d(View view, View view2) {
        qe7.m25631g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static fg2 m16985e(View view) {
        return (fg2) view.getTag(e35.ghost_view);
    }

    /* renamed from: f */
    public static void m16986f(View view) {
        fg2 e = m16985e(view);
        if (e != null) {
            int i = e.f11828g - 1;
            e.f11828g = i;
            if (i <= 0) {
                ((dg2) e.getParent()).removeView(e);
            }
        }
    }

    /* renamed from: g */
    public static void m16987g(View view, fg2 fg2) {
        view.setTag(e35.ghost_view, fg2);
    }

    /* renamed from: a */
    public void mo12059a(ViewGroup viewGroup, View view) {
        this.f11825a = viewGroup;
        this.f11826d = view;
    }

    /* renamed from: h */
    public void mo19906h(Matrix matrix) {
        this.f11829k = matrix;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m16987g(this.f11827e, this);
        this.f11827e.getViewTreeObserver().addOnPreDrawListener(this.f11830r);
        qe7.m25633i(this.f11827e, 4);
        if (this.f11827e.getParent() != null) {
            ((View) this.f11827e.getParent()).invalidate();
        }
    }

    public void onDetachedFromWindow() {
        this.f11827e.getViewTreeObserver().removeOnPreDrawListener(this.f11830r);
        qe7.m25633i(this.f11827e, 0);
        m16987g(this.f11827e, (fg2) null);
        if (this.f11827e.getParent() != null) {
            ((View) this.f11827e.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        cb0.m11820a(canvas, true);
        canvas.setMatrix(this.f11829k);
        qe7.m25633i(this.f11827e, 0);
        this.f11827e.invalidate();
        qe7.m25633i(this.f11827e, 4);
        drawChild(canvas, this.f11827e, getDrawingTime());
        cb0.m11820a(canvas, false);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m16985e(this.f11827e) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            qe7.m25633i(this.f11827e, i2);
        }
    }
}
