package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.widgets.C0476a;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0487e;
import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.C0492h;
import androidx.constraintlayout.core.widgets.C0493i;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.C0507a;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0532a;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements i54 {

    /* renamed from: P2 */
    public static boolean f2682P2;

    /* renamed from: A1 */
    public float f2683A1 = 1.0f;

    /* renamed from: A2 */
    public boolean f2684A2 = false;

    /* renamed from: B1 */
    public float f2685B1 = Utils.FLOAT_EPSILON;

    /* renamed from: B2 */
    public int f2686B2 = 0;

    /* renamed from: C1 */
    public float f2687C1 = Utils.FLOAT_EPSILON;

    /* renamed from: C2 */
    public HashMap<View, ee7> f2688C2 = new HashMap<>();

    /* renamed from: D1 */
    public long f2689D1;

    /* renamed from: D2 */
    public int f2690D2;

    /* renamed from: E1 */
    public float f2691E1 = Utils.FLOAT_EPSILON;

    /* renamed from: E2 */
    public int f2692E2;

    /* renamed from: F1 */
    public boolean f2693F1;

    /* renamed from: F2 */
    public int f2694F2;

    /* renamed from: G1 */
    public boolean f2695G1 = false;

    /* renamed from: G2 */
    public Rect f2696G2 = new Rect();

    /* renamed from: H1 */
    public boolean f2697H1 = false;

    /* renamed from: H2 */
    public boolean f2698H2 = false;

    /* renamed from: I1 */
    public C0506j f2699I1;

    /* renamed from: I2 */
    public TransitionState f2700I2 = TransitionState.UNDEFINED;

    /* renamed from: J1 */
    public float f2701J1;

    /* renamed from: J2 */
    public C0502f f2702J2 = new C0502f();

    /* renamed from: K1 */
    public float f2703K1;

    /* renamed from: K2 */
    public boolean f2704K2 = false;

    /* renamed from: L1 */
    public int f2705L1 = 0;

    /* renamed from: L2 */
    public RectF f2706L2 = new RectF();

    /* renamed from: M1 */
    public C0501e f2707M1;

    /* renamed from: M2 */
    public View f2708M2 = null;

    /* renamed from: N1 */
    public boolean f2709N1 = false;

    /* renamed from: N2 */
    public Matrix f2710N2 = null;

    /* renamed from: O1 */
    public x96 f2711O1 = new x96();

    /* renamed from: O2 */
    public ArrayList<Integer> f2712O2 = new ArrayList<>();

    /* renamed from: P1 */
    public C0500d f2713P1 = new C0500d();

    /* renamed from: Q1 */
    public ce1 f2714Q1;

    /* renamed from: R1 */
    public boolean f2715R1 = true;

    /* renamed from: S1 */
    public int f2716S1;

    /* renamed from: T1 */
    public int f2717T1;

    /* renamed from: U1 */
    public int f2718U1;

    /* renamed from: V1 */
    public int f2719V1;

    /* renamed from: W1 */
    public boolean f2720W1 = false;

    /* renamed from: X1 */
    public float f2721X1;

    /* renamed from: Y1 */
    public float f2722Y1;

    /* renamed from: Z1 */
    public long f2723Z1;

    /* renamed from: a2 */
    public float f2724a2;

    /* renamed from: b2 */
    public boolean f2725b2 = false;

    /* renamed from: c2 */
    public ArrayList<MotionHelper> f2726c2 = null;

    /* renamed from: d2 */
    public ArrayList<MotionHelper> f2727d2 = null;

    /* renamed from: e2 */
    public ArrayList<MotionHelper> f2728e2 = null;

    /* renamed from: f2 */
    public CopyOnWriteArrayList<C0506j> f2729f2 = null;

    /* renamed from: g2 */
    public int f2730g2 = 0;

    /* renamed from: h2 */
    public long f2731h2 = -1;

    /* renamed from: i2 */
    public float f2732i2 = Utils.FLOAT_EPSILON;

    /* renamed from: j2 */
    public int f2733j2 = 0;

    /* renamed from: k2 */
    public float f2734k2 = Utils.FLOAT_EPSILON;

    /* renamed from: l2 */
    public boolean f2735l2 = false;

    /* renamed from: m2 */
    public boolean f2736m2 = false;

    /* renamed from: n2 */
    public int f2737n2;

    /* renamed from: o1 */
    public C0507a f2738o1;

    /* renamed from: o2 */
    public int f2739o2;

    /* renamed from: p1 */
    public Interpolator f2740p1;

    /* renamed from: p2 */
    public int f2741p2;

    /* renamed from: q1 */
    public Interpolator f2742q1 = null;

    /* renamed from: q2 */
    public int f2743q2;

    /* renamed from: r1 */
    public float f2744r1 = Utils.FLOAT_EPSILON;

    /* renamed from: r2 */
    public int f2745r2;

    /* renamed from: s1 */
    public int f2746s1 = -1;

    /* renamed from: s2 */
    public int f2747s2;

    /* renamed from: t1 */
    public int f2748t1 = -1;

    /* renamed from: t2 */
    public float f2749t2;

    /* renamed from: u1 */
    public int f2750u1 = -1;

    /* renamed from: u2 */
    public da3 f2751u2 = new da3();

    /* renamed from: v1 */
    public int f2752v1 = 0;

    /* renamed from: v2 */
    public boolean f2753v2 = false;

    /* renamed from: w1 */
    public int f2754w1 = 0;

    /* renamed from: w2 */
    public C0505i f2755w2;

    /* renamed from: x1 */
    public boolean f2756x1 = true;

    /* renamed from: x2 */
    public Runnable f2757x2 = null;

    /* renamed from: y1 */
    public HashMap<View, jy3> f2758y1 = new HashMap<>();

    /* renamed from: y2 */
    public int[] f2759y2 = null;

    /* renamed from: z1 */
    public long f2760z1 = 0;

    /* renamed from: z2 */
    public int f2761z2 = 0;

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    public class C0497a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f2763a;

        public C0497a(View view) {
            this.f2763a = view;
        }

        public void run() {
            this.f2763a.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    public class C0498b implements Runnable {
        public C0498b() {
        }

        public void run() {
            MotionLayout.this.f2755w2.mo4771a();
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    public static /* synthetic */ class C0499c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2766a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2766a = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2766a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0499c.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$d */
    public class C0500d extends sy3 {

        /* renamed from: a */
        public float f2767a = Utils.FLOAT_EPSILON;

        /* renamed from: b */
        public float f2768b = Utils.FLOAT_EPSILON;

        /* renamed from: c */
        public float f2769c;

        public C0500d() {
        }

        /* renamed from: a */
        public float mo4741a() {
            return MotionLayout.this.f2744r1;
        }

        /* renamed from: b */
        public void mo4742b(float f, float f2, float f3) {
            this.f2767a = f;
            this.f2768b = f2;
            this.f2769c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f2767a;
            if (f4 > Utils.FLOAT_EPSILON) {
                float f5 = this.f2769c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f2744r1 = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.f2768b;
            } else {
                float f6 = this.f2769c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.f2744r1 = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.f2768b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$e */
    public class C0501e {

        /* renamed from: a */
        public float[] f2771a;

        /* renamed from: b */
        public int[] f2772b;

        /* renamed from: c */
        public float[] f2773c;

        /* renamed from: d */
        public Path f2774d;

        /* renamed from: e */
        public Paint f2775e;

        /* renamed from: f */
        public Paint f2776f;

        /* renamed from: g */
        public Paint f2777g;

        /* renamed from: h */
        public Paint f2778h;

        /* renamed from: i */
        public Paint f2779i;

        /* renamed from: j */
        public float[] f2780j;

        /* renamed from: k */
        public final int f2781k = -21965;

        /* renamed from: l */
        public final int f2782l = -2067046;

        /* renamed from: m */
        public final int f2783m = -13391360;

        /* renamed from: n */
        public final int f2784n = 1996488704;

        /* renamed from: o */
        public final int f2785o = 10;

        /* renamed from: p */
        public DashPathEffect f2786p;

        /* renamed from: q */
        public int f2787q;

        /* renamed from: r */
        public Rect f2788r = new Rect();

        /* renamed from: s */
        public boolean f2789s = false;

        /* renamed from: t */
        public int f2790t = 1;

        public C0501e() {
            Paint paint = new Paint();
            this.f2775e = paint;
            paint.setAntiAlias(true);
            this.f2775e.setColor(-21965);
            this.f2775e.setStrokeWidth(2.0f);
            this.f2775e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2776f = paint2;
            paint2.setAntiAlias(true);
            this.f2776f.setColor(-2067046);
            this.f2776f.setStrokeWidth(2.0f);
            this.f2776f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f2777g = paint3;
            paint3.setAntiAlias(true);
            this.f2777g.setColor(-13391360);
            this.f2777g.setStrokeWidth(2.0f);
            this.f2777g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2778h = paint4;
            paint4.setAntiAlias(true);
            this.f2778h.setColor(-13391360);
            this.f2778h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2780j = new float[8];
            Paint paint5 = new Paint();
            this.f2779i = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, Utils.FLOAT_EPSILON);
            this.f2786p = dashPathEffect;
            this.f2777g.setPathEffect(dashPathEffect);
            this.f2773c = new float[100];
            this.f2772b = new int[50];
            if (this.f2789s) {
                this.f2775e.setStrokeWidth(8.0f);
                this.f2779i.setStrokeWidth(8.0f);
                this.f2776f.setStrokeWidth(8.0f);
                this.f2790t = 4;
            }
        }

        /* renamed from: a */
        public void mo4744a(Canvas canvas, HashMap<View, jy3> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f2750u1) + ":" + MotionLayout.this.getProgress();
                    canvas.drawText(str, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f2778h);
                    canvas.drawText(str, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f2775e);
                }
                for (jy3 next : hashMap.values()) {
                    int m = next.mo22124m();
                    if (i2 > 0 && m == 0) {
                        m = 1;
                    }
                    if (m != 0) {
                        this.f2787q = next.mo22114c(this.f2773c, this.f2772b);
                        if (m >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f2771a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f2771a = new float[(i3 * 2)];
                                this.f2774d = new Path();
                            }
                            int i4 = this.f2790t;
                            canvas.translate((float) i4, (float) i4);
                            this.f2775e.setColor(1996488704);
                            this.f2779i.setColor(1996488704);
                            this.f2776f.setColor(1996488704);
                            this.f2777g.setColor(1996488704);
                            next.mo22115d(this.f2771a, i3);
                            mo4745b(canvas, m, this.f2787q, next);
                            this.f2775e.setColor(-21965);
                            this.f2776f.setColor(-2067046);
                            this.f2779i.setColor(-2067046);
                            this.f2777g.setColor(-13391360);
                            int i5 = this.f2790t;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo4745b(canvas, m, this.f2787q, next);
                            if (m == 5) {
                                mo4753j(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        public void mo4745b(Canvas canvas, int i, int i2, jy3 jy3) {
            if (i == 4) {
                mo4747d(canvas);
            }
            if (i == 2) {
                mo4750g(canvas);
            }
            if (i == 3) {
                mo4748e(canvas);
            }
            mo4746c(canvas);
            mo4754k(canvas, i, i2, jy3);
        }

        /* renamed from: c */
        public final void mo4746c(Canvas canvas) {
            canvas.drawLines(this.f2771a, this.f2775e);
        }

        /* renamed from: d */
        public final void mo4747d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f2787q; i++) {
                int i2 = this.f2772b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                mo4750g(canvas);
            }
            if (z2) {
                mo4748e(canvas);
            }
        }

        /* renamed from: e */
        public final void mo4748e(Canvas canvas) {
            float[] fArr = this.f2771a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f2777g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f2777g);
        }

        /* renamed from: f */
        public final void mo4749f(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f2771a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            mo4755l(str, this.f2778h);
            canvas2.drawText(str, ((min2 / 2.0f) - ((float) (this.f2788r.width() / 2))) + min, f2 - 20.0f, this.f2778h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f2777g);
            String str2 = "" + (((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            mo4755l(str2, this.f2778h);
            canvas2.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f2788r.height() / 2))), this.f2778h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f2777g);
        }

        /* renamed from: g */
        public final void mo4750g(Canvas canvas) {
            float[] fArr = this.f2771a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f2777g);
        }

        /* renamed from: h */
        public final void mo4751h(Canvas canvas, float f, float f2) {
            float[] fArr = this.f2771a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            String str = "" + (((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            mo4755l(str, this.f2778h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - ((float) (this.f2788r.width() / 2)), -20.0f, this.f2778h);
            canvas.drawLine(f, f2, f10, f11, this.f2777g);
        }

        /* renamed from: i */
        public final void mo4752i(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            String str = "" + (((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            mo4755l(str, this.f2778h);
            canvas2.drawText(str, ((f / 2.0f) - ((float) (this.f2788r.width() / 2))) + Utils.FLOAT_EPSILON, f2 - 20.0f, this.f2778h);
            canvas.drawLine(f, f2, Math.min(Utils.FLOAT_EPSILON, 1.0f), f2, this.f2777g);
            String str2 = "" + (((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            mo4755l(str2, this.f2778h);
            canvas2.drawText(str2, f + 5.0f, Utils.FLOAT_EPSILON - ((f2 / 2.0f) - ((float) (this.f2788r.height() / 2))), this.f2778h);
            canvas.drawLine(f, f2, f, Math.max(Utils.FLOAT_EPSILON, 1.0f), this.f2777g);
        }

        /* renamed from: j */
        public final void mo4753j(Canvas canvas, jy3 jy3) {
            this.f2774d.reset();
            for (int i = 0; i <= 50; i++) {
                jy3.mo22116e(((float) i) / ((float) 50), this.f2780j, 0);
                Path path = this.f2774d;
                float[] fArr = this.f2780j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2774d;
                float[] fArr2 = this.f2780j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2774d;
                float[] fArr3 = this.f2780j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2774d;
                float[] fArr4 = this.f2780j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2774d.close();
            }
            this.f2775e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2774d, this.f2775e);
            canvas.translate(-2.0f, -2.0f);
            this.f2775e.setColor(-65536);
            canvas.drawPath(this.f2774d, this.f2775e);
        }

        /* renamed from: k */
        public final void mo4754k(Canvas canvas, int i, int i2, jy3 jy3) {
            int i3;
            int i4;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i5 = i;
            jy3 jy32 = jy3;
            View view = jy32.f13914b;
            if (view != null) {
                i4 = view.getWidth();
                i3 = jy32.f13914b.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.f2772b[i6 - 1] != 0) {
                    float[] fArr = this.f2773c;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.f2774d.reset();
                    this.f2774d.moveTo(f3, f4 + 10.0f);
                    this.f2774d.lineTo(f3 + 10.0f, f4);
                    this.f2774d.lineTo(f3, f4 - 10.0f);
                    this.f2774d.lineTo(f3 - 10.0f, f4);
                    this.f2774d.close();
                    int i8 = i6 - 1;
                    jy32.mo22127q(i8);
                    if (i5 == 4) {
                        int i9 = this.f2772b[i8];
                        if (i9 == 1) {
                            mo4751h(canvas2, f3 - Utils.FLOAT_EPSILON, f4 - Utils.FLOAT_EPSILON);
                        } else if (i9 == 0) {
                            mo4749f(canvas2, f3 - Utils.FLOAT_EPSILON, f4 - Utils.FLOAT_EPSILON);
                        } else if (i9 == 2) {
                            f2 = f4;
                            f = f3;
                            mo4752i(canvas, f3 - Utils.FLOAT_EPSILON, f4 - Utils.FLOAT_EPSILON, i4, i3);
                            canvas2.drawPath(this.f2774d, this.f2779i);
                        }
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.f2774d, this.f2779i);
                    } else {
                        f2 = f4;
                        f = f3;
                    }
                    if (i5 == 2) {
                        mo4751h(canvas2, f - Utils.FLOAT_EPSILON, f2 - Utils.FLOAT_EPSILON);
                    }
                    if (i5 == 3) {
                        mo4749f(canvas2, f - Utils.FLOAT_EPSILON, f2 - Utils.FLOAT_EPSILON);
                    }
                    if (i5 == 6) {
                        mo4752i(canvas, f - Utils.FLOAT_EPSILON, f2 - Utils.FLOAT_EPSILON, i4, i3);
                    }
                    canvas2.drawPath(this.f2774d, this.f2779i);
                }
            }
            float[] fArr2 = this.f2771a;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2776f);
                float[] fArr3 = this.f2771a;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2776f);
            }
        }

        /* renamed from: l */
        public void mo4755l(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f2788r);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$f */
    public class C0502f {

        /* renamed from: a */
        public C0486d f2792a = new C0486d();

        /* renamed from: b */
        public C0486d f2793b = new C0486d();

        /* renamed from: c */
        public C0532a f2794c = null;

        /* renamed from: d */
        public C0532a f2795d = null;

        /* renamed from: e */
        public int f2796e;

        /* renamed from: f */
        public int f2797f;

        public C0502f() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0123 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4756a() {
            /*
                r17 = this;
                r0 = r17
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, jy3> r2 = r2.f2758y1
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                jy3 r7 = new jy3
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, jy3> r8 = r8.f2758y1
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0127
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, jy3> r7 = r7.f2758y1
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                jy3 r13 = (p000.jy3) r13
                if (r13 != 0) goto L_0x004f
                goto L_0x0123
            L_0x004f:
                androidx.constraintlayout.widget.a r7 = r0.f2794c
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                if (r7 == 0) goto L_0x00a7
                androidx.constraintlayout.core.widgets.d r7 = r0.f2792a
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.mo4759d(r7, r6)
                if (r7 == 0) goto L_0x0079
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.mo4710r0(r7)
                androidx.constraintlayout.widget.a r8 = r0.f2794c
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.mo22108F(r7, r8, r9, r10)
                goto L_0x00d1
            L_0x0079:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f2705L1
                if (r7 == 0) goto L_0x00d1
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = p000.t21.m27244b()
                r7.append(r8)
                r7.append(r12)
                java.lang.String r8 = p000.t21.m27246d(r6)
                r7.append(r8)
                r7.append(r15)
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getName()
                r7.append(r8)
                r7.append(r14)
                goto L_0x00d1
            L_0x00a7:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r7 = r7.f2684A2
                if (r7 == 0) goto L_0x00d1
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, ee7> r7 = r7.f2688C2
                java.lang.Object r7 = r7.get(r6)
                r8 = r7
                ee7 r8 = (p000.ee7) r8
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r7.f2686B2
                int r11 = r7.f2690D2
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r16 = r7.f2692E2
                r7 = r13
                r9 = r6
                r4 = r12
                r12 = r16
                r7.mo22107E(r8, r9, r10, r11, r12)
                goto L_0x00d2
            L_0x00d1:
                r4 = r12
            L_0x00d2:
                androidx.constraintlayout.widget.a r7 = r0.f2795d
                if (r7 == 0) goto L_0x0123
                androidx.constraintlayout.core.widgets.d r7 = r0.f2793b
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.mo4759d(r7, r6)
                if (r7 == 0) goto L_0x00f6
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r4 = r4.mo4710r0(r7)
                androidx.constraintlayout.widget.a r6 = r0.f2795d
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r8 = r8.getHeight()
                r13.mo22104B(r4, r6, r7, r8)
                goto L_0x0123
            L_0x00f6:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.f2705L1
                if (r7 == 0) goto L_0x0123
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = p000.t21.m27244b()
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = p000.t21.m27246d(r6)
                r7.append(r4)
                r7.append(r15)
                java.lang.Class r4 = r6.getClass()
                java.lang.String r4 = r4.getName()
                r7.append(r4)
                r7.append(r14)
            L_0x0123:
                int r5 = r5 + 1
                goto L_0x0038
            L_0x0127:
                r4 = 0
            L_0x0128:
                if (r4 >= r1) goto L_0x0145
                r5 = r3[r4]
                java.lang.Object r5 = r2.get(r5)
                jy3 r5 = (p000.jy3) r5
                int r6 = r5.mo22119h()
                r7 = -1
                if (r6 == r7) goto L_0x0142
                java.lang.Object r6 = r2.get(r6)
                jy3 r6 = (p000.jy3) r6
                r5.mo22111I(r6)
            L_0x0142:
                int r4 = r4 + 1
                goto L_0x0128
            L_0x0145:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0502f.mo4756a():void");
        }

        /* renamed from: b */
        public final void mo4757b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f2748t1 == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C0486d dVar = this.f2793b;
                C0532a aVar = this.f2795d;
                if (aVar == null || aVar.f3216d == 0) {
                    i6 = i;
                } else {
                    i6 = i2;
                }
                if (aVar == null || aVar.f3216d == 0) {
                    i7 = i2;
                } else {
                    i7 = i;
                }
                motionLayout2.mo5084p(dVar, optimizationLevel, i6, i7);
                C0532a aVar2 = this.f2794c;
                if (aVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C0486d dVar2 = this.f2792a;
                    int i9 = aVar2.f3216d;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    motionLayout3.mo5084p(dVar2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            C0532a aVar3 = this.f2794c;
            if (aVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C0486d dVar3 = this.f2792a;
                int i10 = aVar3.f3216d;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                motionLayout4.mo5084p(dVar3, optimizationLevel, i4, i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C0486d dVar4 = this.f2793b;
            C0532a aVar4 = this.f2795d;
            if (aVar4 == null || aVar4.f3216d == 0) {
                i3 = i;
            } else {
                i3 = i2;
            }
            if (aVar4 == null || aVar4.f3216d == 0) {
                i = i2;
            }
            motionLayout5.mo5084p(dVar4, optimizationLevel, i3, i);
        }

        /* renamed from: c */
        public void mo4758c(C0486d dVar, C0486d dVar2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> o1 = dVar.mo27206o1();
            HashMap hashMap = new HashMap();
            hashMap.put(dVar, dVar2);
            dVar2.mo27206o1().clear();
            dVar2.mo4415n(dVar, hashMap);
            Iterator<ConstraintWidget> it = o1.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof C0476a) {
                    constraintWidget = new C0476a();
                } else if (next instanceof C0489f) {
                    constraintWidget = new C0489f();
                } else if (next instanceof C0487e) {
                    constraintWidget = new C0487e();
                } else if (next instanceof C0492h) {
                    constraintWidget = new C0492h();
                } else if (next instanceof vl2) {
                    constraintWidget = new wl2();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                dVar2.mo27205a(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = o1.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).mo4415n(next2, hashMap);
            }
        }

        /* renamed from: d */
        public ConstraintWidget mo4759d(C0486d dVar, View view) {
            if (dVar.mo4431u() == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> o1 = dVar.mo27206o1();
            int size = o1.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = o1.get(i);
                if (constraintWidget.mo4431u() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* renamed from: e */
        public void mo4760e(C0486d dVar, C0532a aVar, C0532a aVar2) {
            this.f2794c = aVar;
            this.f2795d = aVar2;
            this.f2792a = new C0486d();
            this.f2793b = new C0486d();
            this.f2792a.mo4491S1(MotionLayout.this.f3093e.mo4479F1());
            this.f2793b.mo4491S1(MotionLayout.this.f3093e.mo4479F1());
            this.f2792a.mo27208r1();
            this.f2793b.mo27208r1();
            mo4758c(MotionLayout.this.f3093e, this.f2792a);
            mo4758c(MotionLayout.this.f3093e, this.f2793b);
            if (((double) MotionLayout.this.f2687C1) > 0.5d) {
                if (aVar != null) {
                    mo4765j(this.f2792a, aVar);
                }
                mo4765j(this.f2793b, aVar2);
            } else {
                mo4765j(this.f2793b, aVar2);
                if (aVar != null) {
                    mo4765j(this.f2792a, aVar);
                }
            }
            this.f2792a.mo4494V1(MotionLayout.this.mo5081l());
            this.f2792a.mo4496X1();
            this.f2793b.mo4494V1(MotionLayout.this.mo5081l());
            this.f2793b.mo4496X1();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C0486d dVar2 = this.f2792a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar2.mo4352M0(dimensionBehaviour);
                    this.f2793b.mo4352M0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    C0486d dVar3 = this.f2792a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar3.mo4387d1(dimensionBehaviour2);
                    this.f2793b.mo4387d1(dimensionBehaviour2);
                }
            }
        }

        /* renamed from: f */
        public boolean mo4761f(int i, int i2) {
            if (i == this.f2796e && i2 == this.f2797f) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public void mo4762g(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.f2745r2 = mode;
            motionLayout.f2747s2 = mode2;
            motionLayout.getOptimizationLevel();
            mo4757b(i, i2);
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo4757b(i, i2);
                MotionLayout.this.f2737n2 = this.f2792a.mo4369V();
                MotionLayout.this.f2739o2 = this.f2792a.mo4441z();
                MotionLayout.this.f2741p2 = this.f2793b.mo4369V();
                MotionLayout.this.f2743q2 = this.f2793b.mo4441z();
                MotionLayout motionLayout2 = MotionLayout.this;
                if (motionLayout2.f2737n2 == motionLayout2.f2741p2 && motionLayout2.f2739o2 == motionLayout2.f2743q2) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                motionLayout2.f2736m2 = z4;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.f2737n2;
            int i4 = motionLayout3.f2739o2;
            int i5 = motionLayout3.f2745r2;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout3.f2749t2 * ((float) (motionLayout3.f2741p2 - i3))));
            }
            int i6 = i3;
            int i7 = motionLayout3.f2747s2;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (((float) i4) + (motionLayout3.f2749t2 * ((float) (motionLayout3.f2743q2 - i4))));
            }
            int i8 = i4;
            if (this.f2792a.mo4487N1() || this.f2793b.mo4487N1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f2792a.mo4485L1() || this.f2793b.mo4485L1()) {
                z3 = true;
            } else {
                z3 = false;
            }
            MotionLayout.this.mo5083o(i, i2, i6, i8, z2, z3);
        }

        /* renamed from: h */
        public void mo4763h() {
            mo4762g(MotionLayout.this.f2752v1, MotionLayout.this.f2754w1);
            MotionLayout.this.mo4709q0();
        }

        /* renamed from: i */
        public void mo4764i(int i, int i2) {
            this.f2796e = i;
            this.f2797f = i2;
        }

        /* renamed from: j */
        public final void mo4765j(C0486d dVar, C0532a aVar) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, dVar);
            sparseArray.put(MotionLayout.this.getId(), dVar);
            if (!(aVar == null || aVar.f3216d == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.mo5084p(this.f2793b, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = dVar.mo27206o1().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.mo4431u()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.mo27206o1().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.mo4431u();
                aVar.mo5158l(view.getId(), layoutParams);
                next2.mo4399h1(aVar.mo5145C(view.getId()));
                next2.mo4344I0(aVar.mo5169x(view.getId()));
                if (view instanceof ConstraintHelper) {
                    aVar.mo5156j((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo5062w();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.mo5064d(false, view, next2, layoutParams, sparseArray);
                if (aVar.mo5144B(view.getId()) == 1) {
                    next2.mo4396g1(view.getVisibility());
                } else {
                    next2.mo4396g1(aVar.mo5143A(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.mo27206o1().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof C0493i) {
                    vl2 vl2 = (vl2) next3;
                    ((ConstraintHelper) next3.mo4431u()).mo4644u(dVar, vl2, sparseArray);
                    ((C0493i) vl2).mo4566r1();
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    public interface C0503g {
        /* renamed from: a */
        void mo4766a();

        /* renamed from: b */
        void mo4767b(MotionEvent motionEvent);

        /* renamed from: c */
        float mo4768c();

        /* renamed from: d */
        float mo4769d();

        /* renamed from: e */
        void mo4770e(int i);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$h */
    public static class C0504h implements C0503g {

        /* renamed from: b */
        public static C0504h f2799b = new C0504h();

        /* renamed from: a */
        public VelocityTracker f2800a;

        /* renamed from: f */
        public static C0504h m3916f() {
            f2799b.f2800a = VelocityTracker.obtain();
            return f2799b;
        }

        /* renamed from: a */
        public void mo4766a() {
            VelocityTracker velocityTracker = this.f2800a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2800a = null;
            }
        }

        /* renamed from: b */
        public void mo4767b(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f2800a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        /* renamed from: c */
        public float mo4768c() {
            VelocityTracker velocityTracker = this.f2800a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: d */
        public float mo4769d() {
            VelocityTracker velocityTracker = this.f2800a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return Utils.FLOAT_EPSILON;
        }

        /* renamed from: e */
        public void mo4770e(int i) {
            VelocityTracker velocityTracker = this.f2800a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$i */
    public class C0505i {

        /* renamed from: a */
        public float f2801a = Float.NaN;

        /* renamed from: b */
        public float f2802b = Float.NaN;

        /* renamed from: c */
        public int f2803c = -1;

        /* renamed from: d */
        public int f2804d = -1;

        /* renamed from: e */
        public final String f2805e = "motion.progress";

        /* renamed from: f */
        public final String f2806f = "motion.velocity";

        /* renamed from: g */
        public final String f2807g = "motion.StartState";

        /* renamed from: h */
        public final String f2808h = "motion.EndState";

        public C0505i() {
        }

        /* renamed from: a */
        public void mo4771a() {
            int i = this.f2803c;
            if (!(i == -1 && this.f2804d == -1)) {
                if (i == -1) {
                    MotionLayout.this.mo4735w0(this.f2804d);
                } else {
                    int i2 = this.f2804d;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.f2802b)) {
                MotionLayout.this.setProgress(this.f2801a, this.f2802b);
                this.f2801a = Float.NaN;
                this.f2802b = Float.NaN;
                this.f2803c = -1;
                this.f2804d = -1;
            } else if (!Float.isNaN(this.f2801a)) {
                MotionLayout.this.setProgress(this.f2801a);
            }
        }

        /* renamed from: b */
        public Bundle mo4772b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2801a);
            bundle.putFloat("motion.velocity", this.f2802b);
            bundle.putInt("motion.StartState", this.f2803c);
            bundle.putInt("motion.EndState", this.f2804d);
            return bundle;
        }

        /* renamed from: c */
        public void mo4773c() {
            this.f2804d = MotionLayout.this.f2750u1;
            this.f2803c = MotionLayout.this.f2746s1;
            this.f2802b = MotionLayout.this.getVelocity();
            this.f2801a = MotionLayout.this.getProgress();
        }

        /* renamed from: d */
        public void mo4774d(int i) {
            this.f2804d = i;
        }

        /* renamed from: e */
        public void mo4775e(float f) {
            this.f2801a = f;
        }

        /* renamed from: f */
        public void mo4776f(int i) {
            this.f2803c = i;
        }

        /* renamed from: g */
        public void mo4777g(Bundle bundle) {
            this.f2801a = bundle.getFloat("motion.progress");
            this.f2802b = bundle.getFloat("motion.velocity");
            this.f2803c = bundle.getInt("motion.StartState");
            this.f2804d = bundle.getInt("motion.EndState");
        }

        /* renamed from: h */
        public void mo4778h(float f) {
            this.f2802b = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$j */
    public interface C0506j {
        /* renamed from: a */
        void mo4579a(MotionLayout motionLayout, int i, int i2, float f);

        /* renamed from: b */
        void mo4580b(MotionLayout motionLayout, int i);

        /* renamed from: c */
        void mo4648c(MotionLayout motionLayout, int i, int i2);

        /* renamed from: d */
        void mo4649d(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public MotionLayout(Context context) {
        super(context);
        mo4692k0((AttributeSet) null);
    }

    /* renamed from: D0 */
    public static boolean m3828D0(float f, float f2, float f3) {
        if (f > Utils.FLOAT_EPSILON) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < Utils.FLOAT_EPSILON;
    }

    /* renamed from: A0 */
    public void mo4655A0() {
        this.f2702J2.mo4760e(this.f3093e, this.f2738o1.mo4813l(this.f2746s1), this.f2738o1.mo4813l(this.f2750u1));
        mo4708p0();
    }

    /* renamed from: B0 */
    public void mo4656B0(int i, C0532a aVar) {
        C0507a aVar2 = this.f2738o1;
        if (aVar2 != null) {
            aVar2.mo4799U(i, aVar);
        }
        mo4655A0();
        if (this.f2748t1 == i) {
            aVar.mo5155i(this);
        }
    }

    /* renamed from: C0 */
    public void mo4657C0(int i, View... viewArr) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            aVar.mo4806c0(i, viewArr);
        }
    }

    /* renamed from: R */
    public void mo4658R(float f) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            float f2 = this.f2687C1;
            float f3 = this.f2685B1;
            if (f2 != f3 && this.f2693F1) {
                this.f2687C1 = f3;
            }
            float f4 = this.f2687C1;
            if (f4 != f) {
                this.f2709N1 = false;
                this.f2691E1 = f;
                this.f2683A1 = ((float) aVar.mo4817p()) / 1000.0f;
                setProgress(this.f2691E1);
                this.f2740p1 = null;
                this.f2742q1 = this.f2738o1.mo4820s();
                this.f2693F1 = false;
                this.f2760z1 = getNanoTime();
                this.f2695G1 = true;
                this.f2685B1 = f4;
                this.f2687C1 = f4;
                invalidate();
            }
        }
    }

    /* renamed from: S */
    public boolean mo4659S(int i, jy3 jy3) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            return aVar.mo4808g(i, jy3);
        }
        return false;
    }

    /* renamed from: T */
    public final boolean mo4660T(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.f2710N2 == null) {
            this.f2710N2 = new Matrix();
        }
        matrix.invert(this.f2710N2);
        obtain.transform(this.f2710N2);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    /* renamed from: U */
    public final void mo4661U() {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            int F = aVar.mo4784F();
            C0507a aVar2 = this.f2738o1;
            mo4662V(F, aVar2.mo4813l(aVar2.mo4784F()));
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<C0507a.C0509b> it = this.f2738o1.mo4816o().iterator();
            while (it.hasNext()) {
                C0507a.C0509b next = it.next();
                C0507a.C0509b bVar = this.f2738o1.f2812c;
                mo4663W(next);
                int A = next.mo4829A();
                int y = next.mo4843y();
                String c = t21.m27245c(getContext(), A);
                String c2 = t21.m27245c(getContext(), y);
                if (sparseIntArray.get(A) == y) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CHECK: two transitions with the same start and end ");
                    sb.append(c);
                    sb.append("->");
                    sb.append(c2);
                }
                if (sparseIntArray2.get(y) == A) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CHECK: you can't have reverse transitions");
                    sb2.append(c);
                    sb2.append("->");
                    sb2.append(c2);
                }
                sparseIntArray.put(A, y);
                sparseIntArray2.put(y, A);
                if (this.f2738o1.mo4813l(A) == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" no such constraintSetStart ");
                    sb3.append(c);
                }
                if (this.f2738o1.mo4813l(y) == null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(" no such constraintSetEnd ");
                    sb4.append(c);
                }
            }
        }
    }

    /* renamed from: V */
    public final void mo4662V(int i, C0532a aVar) {
        String c = t21.m27245c(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("CHECK: ");
                sb.append(c);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(childAt.getClass().getName());
                sb.append(" does not!");
            }
            if (aVar.mo5168w(id) == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(c);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(t21.m27246d(childAt));
            }
        }
        int[] y = aVar.mo5170y();
        for (int i3 = 0; i3 < y.length; i3++) {
            int i4 = y[i3];
            String c2 = t21.m27245c(getContext(), i4);
            if (findViewById(y[i3]) == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(c);
                sb3.append(" NO View matches id ");
                sb3.append(c2);
            }
            if (aVar.mo5169x(i4) == -1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(c);
                sb4.append("(");
                sb4.append(c2);
                sb4.append(") no LAYOUT_HEIGHT");
            }
            if (aVar.mo5145C(i4) == -1) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(c);
                sb5.append("(");
                sb5.append(c2);
                sb5.append(") no LAYOUT_HEIGHT");
            }
        }
    }

    /* renamed from: W */
    public final void mo4663W(C0507a.C0509b bVar) {
        bVar.mo4829A();
        bVar.mo4843y();
    }

    /* renamed from: X */
    public final void mo4664X() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            jy3 jy3 = this.f2758y1.get(childAt);
            if (jy3 != null) {
                jy3.mo22106D(childAt);
            }
        }
    }

    /* renamed from: Y */
    public void mo4665Y(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            jy3 jy3 = this.f2758y1.get(getChildAt(i));
            if (jy3 != null) {
                jy3.mo22117f(z);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016f  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4666Z(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.f2689D1
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.f2689D1 = r1
        L_0x0010:
            float r1 = r0.f2687C1
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L_0x0020
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0020
            r0.f2748t1 = r4
        L_0x0020:
            boolean r3 = r0.f2725b2
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L_0x0032
            boolean r3 = r0.f2695G1
            if (r3 == 0) goto L_0x023f
            if (r24 != 0) goto L_0x0032
            float r3 = r0.f2691E1
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x023f
        L_0x0032:
            float r3 = r0.f2691E1
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r3 = r0.f2740p1
            boolean r10 = r3 instanceof p000.sy3
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0051
            long r12 = r0.f2689D1
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.f2683A1
            float r10 = r10 / r12
            goto L_0x0052
        L_0x0051:
            r10 = r2
        L_0x0052:
            float r12 = r0.f2687C1
            float r12 = r12 + r10
            boolean r13 = r0.f2693F1
            if (r13 == 0) goto L_0x005b
            float r12 = r0.f2691E1
        L_0x005b:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0065
            float r14 = r0.f2691E1
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x006f
        L_0x0065:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
            float r14 = r0.f2691E1
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0075
        L_0x006f:
            float r12 = r0.f2691E1
            r0.f2695G1 = r7
            r14 = r6
            goto L_0x0076
        L_0x0075:
            r14 = r7
        L_0x0076:
            r0.f2687C1 = r12
            r0.f2685B1 = r12
            r0.f2689D1 = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto L_0x0103
            if (r14 != 0) goto L_0x0103
            boolean r14 = r0.f2709N1
            if (r14 == 0) goto L_0x00e4
            long r4 = r0.f2760z1
            long r4 = r8 - r4
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3.getInterpolation(r4)
            android.view.animation.Interpolator r4 = r0.f2740p1
            x96 r5 = r0.f2711O1
            if (r4 != r5) goto L_0x00a2
            boolean r4 = r5.mo27713c()
            if (r4 == 0) goto L_0x00a0
            r4 = r15
            goto L_0x00a3
        L_0x00a0:
            r4 = r6
            goto L_0x00a3
        L_0x00a2:
            r4 = r7
        L_0x00a3:
            r0.f2687C1 = r3
            r0.f2689D1 = r8
            android.view.animation.Interpolator r5 = r0.f2740p1
            boolean r8 = r5 instanceof p000.sy3
            if (r8 == 0) goto L_0x00e2
            sy3 r5 = (p000.sy3) r5
            float r5 = r5.mo4741a()
            r0.f2744r1 = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.f2683A1
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c4
            if (r4 != r15) goto L_0x00c4
            r0.f2695G1 = r7
        L_0x00c4:
            int r8 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d4
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d4
            r0.f2687C1 = r8
            r0.f2695G1 = r7
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x00d4:
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e2
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x00e2
            r0.f2687C1 = r2
            r0.f2695G1 = r7
            r12 = r2
            goto L_0x0106
        L_0x00e2:
            r12 = r3
            goto L_0x0106
        L_0x00e4:
            float r3 = r3.getInterpolation(r12)
            android.view.animation.Interpolator r4 = r0.f2740p1
            boolean r5 = r4 instanceof p000.sy3
            if (r5 == 0) goto L_0x00f7
            sy3 r4 = (p000.sy3) r4
            float r4 = r4.mo4741a()
            r0.f2744r1 = r4
            goto L_0x0101
        L_0x00f7:
            float r12 = r12 + r10
            float r4 = r4.getInterpolation(r12)
            float r4 = r4 - r3
            float r4 = r4 * r1
            float r4 = r4 / r10
            r0.f2744r1 = r4
        L_0x0101:
            r12 = r3
            goto L_0x0105
        L_0x0103:
            r0.f2744r1 = r10
        L_0x0105:
            r4 = r7
        L_0x0106:
            float r3 = r0.f2744r1
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x0115
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r3)
        L_0x0115:
            if (r4 == r6) goto L_0x013e
            if (r13 <= 0) goto L_0x011f
            float r3 = r0.f2691E1
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0129
        L_0x011f:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x012d
            float r3 = r0.f2691E1
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x012d
        L_0x0129:
            float r12 = r0.f2691E1
            r0.f2695G1 = r7
        L_0x012d:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x0137
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x013e
        L_0x0137:
            r0.f2695G1 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x013e:
            int r3 = r23.getChildCount()
            r0.f2725b2 = r7
            long r4 = r23.getNanoTime()
            r0.f2749t2 = r12
            android.view.animation.Interpolator r8 = r0.f2742q1
            if (r8 != 0) goto L_0x0150
            r8 = r12
            goto L_0x0154
        L_0x0150:
            float r8 = r8.getInterpolation(r12)
        L_0x0154:
            android.view.animation.Interpolator r9 = r0.f2742q1
            if (r9 == 0) goto L_0x016c
            float r10 = r0.f2683A1
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r9 = r9.getInterpolation(r10)
            r0.f2744r1 = r9
            android.view.animation.Interpolator r10 = r0.f2742q1
            float r10 = r10.getInterpolation(r12)
            float r9 = r9 - r10
            r0.f2744r1 = r9
        L_0x016c:
            r9 = r7
        L_0x016d:
            if (r9 >= r3) goto L_0x0195
            android.view.View r10 = r0.getChildAt(r9)
            java.util.HashMap<android.view.View, jy3> r11 = r0.f2758y1
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            jy3 r17 = (p000.jy3) r17
            if (r17 == 0) goto L_0x0192
            boolean r11 = r0.f2725b2
            da3 r15 = r0.f2751u2
            r18 = r10
            r19 = r8
            r20 = r4
            r22 = r15
            boolean r10 = r17.mo22135x(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.f2725b2 = r10
        L_0x0192:
            int r9 = r9 + 1
            goto L_0x016d
        L_0x0195:
            if (r13 <= 0) goto L_0x019d
            float r3 = r0.f2691E1
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a7
        L_0x019d:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01a9
            float r3 = r0.f2691E1
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x01a9
        L_0x01a7:
            r3 = r6
            goto L_0x01aa
        L_0x01a9:
            r3 = r7
        L_0x01aa:
            boolean r4 = r0.f2725b2
            if (r4 != 0) goto L_0x01b9
            boolean r4 = r0.f2695G1
            if (r4 != 0) goto L_0x01b9
            if (r3 == 0) goto L_0x01b9
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r4 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r4)
        L_0x01b9:
            boolean r4 = r0.f2736m2
            if (r4 == 0) goto L_0x01c0
            r23.requestLayout()
        L_0x01c0:
            boolean r4 = r0.f2725b2
            r3 = r3 ^ r6
            r3 = r3 | r4
            r0.f2725b2 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x01e4
            int r3 = r0.f2746s1
            r4 = -1
            if (r3 == r4) goto L_0x01e4
            int r4 = r0.f2748t1
            if (r4 == r3) goto L_0x01e4
            r0.f2748t1 = r3
            androidx.constraintlayout.motion.widget.a r4 = r0.f2738o1
            androidx.constraintlayout.widget.a r3 = r4.mo4813l(r3)
            r3.mo5153g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x01e4:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0202
            int r3 = r0.f2748t1
            int r4 = r0.f2750u1
            if (r3 == r4) goto L_0x0202
            r0.f2748t1 = r4
            androidx.constraintlayout.motion.widget.a r3 = r0.f2738o1
            androidx.constraintlayout.widget.a r3 = r3.mo4813l(r4)
            r3.mo5153g(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            r7 = r6
        L_0x0202:
            boolean r3 = r0.f2725b2
            if (r3 != 0) goto L_0x0221
            boolean r3 = r0.f2695G1
            if (r3 == 0) goto L_0x020b
            goto L_0x0221
        L_0x020b:
            if (r13 <= 0) goto L_0x0213
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x021b
        L_0x0213:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0224
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x0224
        L_0x021b:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
            goto L_0x0224
        L_0x0221:
            r23.invalidate()
        L_0x0224:
            boolean r3 = r0.f2725b2
            if (r3 != 0) goto L_0x023f
            boolean r3 = r0.f2695G1
            if (r3 != 0) goto L_0x023f
            if (r13 <= 0) goto L_0x0234
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x023c
        L_0x0234:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x023f
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x023f
        L_0x023c:
            r23.mo4696n0()
        L_0x023f:
            float r1 = r0.f2687C1
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0253
            int r1 = r0.f2748t1
            int r2 = r0.f2750u1
            if (r1 == r2) goto L_0x024e
            goto L_0x024f
        L_0x024e:
            r6 = r7
        L_0x024f:
            r0.f2748t1 = r2
        L_0x0251:
            r7 = r6
            goto L_0x0262
        L_0x0253:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0262
            int r1 = r0.f2748t1
            int r2 = r0.f2746s1
            if (r1 == r2) goto L_0x025e
            goto L_0x025f
        L_0x025e:
            r6 = r7
        L_0x025f:
            r0.f2748t1 = r2
            goto L_0x0251
        L_0x0262:
            boolean r1 = r0.f2704K2
            r1 = r1 | r7
            r0.f2704K2 = r1
            if (r7 == 0) goto L_0x0270
            boolean r1 = r0.f2753v2
            if (r1 != 0) goto L_0x0270
            r23.requestLayout()
        L_0x0270:
            float r1 = r0.f2687C1
            r0.f2685B1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo4666Z(boolean):void");
    }

    /* renamed from: a0 */
    public final void mo4667a0() {
        float f;
        boolean z;
        float signum = Math.signum(this.f2691E1 - this.f2687C1);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f2740p1;
        if (!(interpolator instanceof x96)) {
            f = ((((float) (nanoTime - this.f2689D1)) * signum) * 1.0E-9f) / this.f2683A1;
        } else {
            f = 0.0f;
        }
        float f2 = this.f2687C1 + f;
        if (this.f2693F1) {
            f2 = this.f2691E1;
        }
        int i = (signum > Utils.FLOAT_EPSILON ? 1 : (signum == Utils.FLOAT_EPSILON ? 0 : -1));
        if ((i <= 0 || f2 < this.f2691E1) && (signum > Utils.FLOAT_EPSILON || f2 > this.f2691E1)) {
            z = false;
        } else {
            f2 = this.f2691E1;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.f2709N1) {
                f2 = interpolator.getInterpolation(((float) (nanoTime - this.f2760z1)) * 1.0E-9f);
            } else {
                f2 = interpolator.getInterpolation(f2);
            }
        }
        if ((i > 0 && f2 >= this.f2691E1) || (signum <= Utils.FLOAT_EPSILON && f2 <= this.f2691E1)) {
            f2 = this.f2691E1;
        }
        this.f2749t2 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.f2742q1;
        if (interpolator2 != null) {
            f2 = interpolator2.getInterpolation(f2);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            jy3 jy3 = this.f2758y1.get(childAt);
            if (jy3 != null) {
                jy3.mo22135x(childAt, f2, nanoTime2, this.f2751u2);
            }
        }
        if (this.f2736m2) {
            requestLayout();
        }
    }

    /* renamed from: b0 */
    public final void mo4668b0() {
        CopyOnWriteArrayList<C0506j> copyOnWriteArrayList;
        if ((this.f2699I1 != null || ((copyOnWriteArrayList = this.f2729f2) != null && !copyOnWriteArrayList.isEmpty())) && this.f2734k2 != this.f2685B1) {
            if (this.f2733j2 != -1) {
                C0506j jVar = this.f2699I1;
                if (jVar != null) {
                    jVar.mo4648c(this, this.f2746s1, this.f2750u1);
                }
                CopyOnWriteArrayList<C0506j> copyOnWriteArrayList2 = this.f2729f2;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0506j> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().mo4648c(this, this.f2746s1, this.f2750u1);
                    }
                }
                this.f2735l2 = true;
            }
            this.f2733j2 = -1;
            float f = this.f2685B1;
            this.f2734k2 = f;
            C0506j jVar2 = this.f2699I1;
            if (jVar2 != null) {
                jVar2.mo4579a(this, this.f2746s1, this.f2750u1, f);
            }
            CopyOnWriteArrayList<C0506j> copyOnWriteArrayList3 = this.f2729f2;
            if (copyOnWriteArrayList3 != null) {
                Iterator<C0506j> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4579a(this, this.f2746s1, this.f2750u1, this.f2685B1);
                }
            }
            this.f2735l2 = true;
        }
    }

    /* renamed from: c0 */
    public void mo4669c0() {
        int i;
        CopyOnWriteArrayList<C0506j> copyOnWriteArrayList;
        if ((this.f2699I1 != null || ((copyOnWriteArrayList = this.f2729f2) != null && !copyOnWriteArrayList.isEmpty())) && this.f2733j2 == -1) {
            this.f2733j2 = this.f2748t1;
            if (!this.f2712O2.isEmpty()) {
                ArrayList<Integer> arrayList = this.f2712O2;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.f2748t1;
            if (!(i == i2 || i2 == -1)) {
                this.f2712O2.add(Integer.valueOf(i2));
            }
        }
        mo4697o0();
        Runnable runnable = this.f2757x2;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.f2759y2;
        if (iArr != null && this.f2761z2 > 0) {
            mo4735w0(iArr[0]);
            int[] iArr2 = this.f2759y2;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.f2761z2--;
        }
    }

    /* renamed from: d0 */
    public void mo4670d0(int i, boolean z, float f) {
        C0506j jVar = this.f2699I1;
        if (jVar != null) {
            jVar.mo4649d(this, i, z, f);
        }
        CopyOnWriteArrayList<C0506j> copyOnWriteArrayList = this.f2729f2;
        if (copyOnWriteArrayList != null) {
            Iterator<C0506j> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4649d(this, i, z, f);
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        String str;
        C0517d dVar;
        ArrayList<MotionHelper> arrayList = this.f2728e2;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo4647C(canvas);
            }
        }
        mo4666Z(false);
        C0507a aVar = this.f2738o1;
        if (!(aVar == null || (dVar = aVar.f2828s) == null)) {
            dVar.mo4899c();
        }
        super.dispatchDraw(canvas);
        if (this.f2738o1 != null) {
            if ((this.f2705L1 & 1) == 1 && !isInEditMode()) {
                this.f2730g2++;
                long nanoTime = getNanoTime();
                long j = this.f2731h2;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f2732i2 = ((float) ((int) ((((float) this.f2730g2) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f2730g2 = 0;
                        this.f2731h2 = nanoTime;
                    }
                } else {
                    this.f2731h2 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2732i2 + " fps " + t21.m27247e(this, this.f2746s1) + " -> ");
                sb.append(t21.m27247e(this, this.f2750u1));
                sb.append(" (progress: ");
                sb.append(((float) ((int) (getProgress() * 1000.0f))) / 10.0f);
                sb.append(" ) state=");
                int i = this.f2748t1;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = t21.m27247e(this, i);
                }
                sb.append(str);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f2705L1 > 1) {
                if (this.f2707M1 == null) {
                    this.f2707M1 = new C0501e();
                }
                this.f2707M1.mo4744a(canvas, this.f2758y1, this.f2738o1.mo4817p(), this.f2705L1);
            }
            ArrayList<MotionHelper> arrayList2 = this.f2728e2;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().mo4646B(canvas);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo4672e0(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, jy3> hashMap = this.f2758y1;
        View i2 = mo5078i(i);
        jy3 jy3 = hashMap.get(i2);
        if (jy3 != null) {
            jy3.mo22123l(f, f2, f3, fArr);
            float y = i2.getY();
            this.f2701J1 = f;
            this.f2703K1 = y;
            return;
        }
        if (i2 == null) {
            str = "" + i;
        } else {
            str = i2.getContext().getResources().getResourceName(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("WARNING could not find view id ");
        sb.append(str);
    }

    /* renamed from: f0 */
    public C0532a mo4673f0(int i) {
        C0507a aVar = this.f2738o1;
        if (aVar == null) {
            return null;
        }
        return aVar.mo4813l(i);
    }

    /* renamed from: g0 */
    public jy3 mo4674g0(int i) {
        return this.f2758y1.get(findViewById(i));
    }

    public int[] getConstraintSetIds() {
        C0507a aVar = this.f2738o1;
        if (aVar == null) {
            return null;
        }
        return aVar.mo4815n();
    }

    public int getCurrentState() {
        return this.f2748t1;
    }

    public ArrayList<C0507a.C0509b> getDefinedTransitions() {
        C0507a aVar = this.f2738o1;
        if (aVar == null) {
            return null;
        }
        return aVar.mo4816o();
    }

    public ce1 getDesignTool() {
        if (this.f2714Q1 == null) {
            this.f2714Q1 = new ce1(this);
        }
        return this.f2714Q1;
    }

    public int getEndState() {
        return this.f2750u1;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2687C1;
    }

    public C0507a getScene() {
        return this.f2738o1;
    }

    public int getStartState() {
        return this.f2746s1;
    }

    public float getTargetPosition() {
        return this.f2691E1;
    }

    public Bundle getTransitionState() {
        if (this.f2755w2 == null) {
            this.f2755w2 = new C0505i();
        }
        this.f2755w2.mo4773c();
        return this.f2755w2.mo4772b();
    }

    public long getTransitionTimeMs() {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            this.f2683A1 = ((float) aVar.mo4817p()) / 1000.0f;
        }
        return (long) (this.f2683A1 * 1000.0f);
    }

    public float getVelocity() {
        return this.f2744r1;
    }

    /* renamed from: h0 */
    public C0507a.C0509b mo4688h0(int i) {
        return this.f2738o1.mo4785G(i);
    }

    /* renamed from: i0 */
    public void mo4689i0(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f2744r1;
        float f5 = this.f2687C1;
        if (this.f2740p1 != null) {
            float signum = Math.signum(this.f2691E1 - f5);
            float interpolation = this.f2740p1.getInterpolation(this.f2687C1 + 1.0E-5f);
            float interpolation2 = this.f2740p1.getInterpolation(this.f2687C1);
            f4 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.f2683A1;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f2740p1;
        if (interpolator instanceof sy3) {
            f4 = ((sy3) interpolator).mo4741a();
        }
        jy3 jy3 = this.f2758y1.get(view);
        if ((i & 1) == 0) {
            jy3.mo22128r(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            jy3.mo22123l(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4691j0(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.mo4691j0(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.f2706L2
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.f2706L2
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.mo4660T(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo4691j0(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: k0 */
    public final void mo4692k0(AttributeSet attributeSet) {
        C0507a aVar;
        int i;
        f2682P2 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == c65.MotionLayout_layoutDescription) {
                    this.f2738o1 = new C0507a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == c65.MotionLayout_currentState) {
                    this.f2748t1 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == c65.MotionLayout_motionProgress) {
                    this.f2691E1 = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
                    this.f2695G1 = true;
                } else if (index == c65.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == c65.MotionLayout_showPaths) {
                    if (this.f2705L1 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        this.f2705L1 = i;
                    }
                } else if (index == c65.MotionLayout_motionDebug) {
                    this.f2705L1 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f2738o1 = null;
            }
        }
        if (this.f2705L1 != 0) {
            mo4661U();
        }
        if (this.f2748t1 == -1 && (aVar = this.f2738o1) != null) {
            this.f2748t1 = aVar.mo4784F();
            this.f2746s1 = this.f2738o1.mo4784F();
            this.f2750u1 = this.f2738o1.mo4818q();
        }
    }

    /* renamed from: l0 */
    public boolean mo4693l0() {
        return this.f2756x1;
    }

    /* renamed from: m0 */
    public C0503g mo4694m0() {
        return C0504h.m3916f();
    }

    /* renamed from: n */
    public void mo4695n(int i) {
        this.f3081B = null;
    }

    /* renamed from: n0 */
    public void mo4696n0() {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            if (aVar.mo4809h(this, this.f2748t1)) {
                requestLayout();
                return;
            }
            int i = this.f2748t1;
            if (i != -1) {
                this.f2738o1.mo4807f(this, i);
            }
            if (this.f2738o1.mo4805b0()) {
                this.f2738o1.mo4804Z();
            }
        }
    }

    /* renamed from: o0 */
    public final void mo4697o0() {
        CopyOnWriteArrayList<C0506j> copyOnWriteArrayList;
        if (this.f2699I1 != null || ((copyOnWriteArrayList = this.f2729f2) != null && !copyOnWriteArrayList.isEmpty())) {
            this.f2735l2 = false;
            Iterator<Integer> it = this.f2712O2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                C0506j jVar = this.f2699I1;
                if (jVar != null) {
                    jVar.mo4580b(this, next.intValue());
                }
                CopyOnWriteArrayList<C0506j> copyOnWriteArrayList2 = this.f2729f2;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<C0506j> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo4580b(this, next.intValue());
                    }
                }
            }
            this.f2712O2.clear();
        }
    }

    public void onAttachedToWindow() {
        C0507a.C0509b bVar;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f2694F2 = display.getRotation();
        }
        C0507a aVar = this.f2738o1;
        if (!(aVar == null || (i = this.f2748t1) == -1)) {
            C0532a l = aVar.mo4813l(i);
            this.f2738o1.mo4798T(this);
            ArrayList<MotionHelper> arrayList = this.f2728e2;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo4645A(this);
                }
            }
            if (l != null) {
                l.mo5155i(this);
            }
            this.f2746s1 = this.f2748t1;
        }
        mo4696n0();
        C0505i iVar = this.f2755w2;
        if (iVar == null) {
            C0507a aVar2 = this.f2738o1;
            if (aVar2 != null && (bVar = aVar2.f2812c) != null && bVar.mo4842x() == 4) {
                mo4731t0();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.f2698H2) {
            post(new C0498b());
        } else {
            iVar.mo4771a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0511b B;
        int q;
        RectF p;
        C0507a aVar = this.f2738o1;
        if (aVar != null && this.f2756x1) {
            C0517d dVar = aVar.f2828s;
            if (dVar != null) {
                dVar.mo4904h(motionEvent);
            }
            C0507a.C0509b bVar = this.f2738o1.f2812c;
            if (bVar != null && bVar.mo4831C() && (B = bVar.mo4830B()) != null && ((motionEvent.getAction() != 0 || (p = B.mo4864p(this, new RectF())) == null || p.contains(motionEvent.getX(), motionEvent.getY())) && (q = B.mo4865q()) != -1)) {
                View view = this.f2708M2;
                if (view == null || view.getId() != q) {
                    this.f2708M2 = findViewById(q);
                }
                View view2 = this.f2708M2;
                if (view2 != null) {
                    this.f2706L2.set((float) view2.getLeft(), (float) this.f2708M2.getTop(), (float) this.f2708M2.getRight(), (float) this.f2708M2.getBottom());
                    if (this.f2706L2.contains(motionEvent.getX(), motionEvent.getY()) && !mo4691j0((float) this.f2708M2.getLeft(), (float) this.f2708M2.getTop(), this.f2708M2, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2753v2 = true;
        try {
            if (this.f2738o1 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.f2718U1 == i5 && this.f2719V1 == i6)) {
                mo4708p0();
                mo4666Z(true);
            }
            this.f2718U1 = i5;
            this.f2719V1 = i6;
            this.f2716S1 = i5;
            this.f2717T1 = i6;
            this.f2753v2 = false;
        } finally {
            this.f2753v2 = false;
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        if (this.f2738o1 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = false;
        if (this.f2752v1 == i && this.f2754w1 == i2) {
            z = false;
        } else {
            z = true;
        }
        if (this.f2704K2) {
            this.f2704K2 = false;
            mo4696n0();
            mo4697o0();
            z = true;
        }
        if (this.f3101x) {
            z = true;
        }
        this.f2752v1 = i;
        this.f2754w1 = i2;
        int F = this.f2738o1.mo4784F();
        int q = this.f2738o1.mo4818q();
        if ((z || this.f2702J2.mo4761f(F, q)) && this.f2746s1 != -1) {
            super.onMeasure(i, i2);
            this.f2702J2.mo4760e(this.f3093e, this.f2738o1.mo4813l(F), this.f2738o1.mo4813l(q));
            this.f2702J2.mo4763h();
            this.f2702J2.mo4764i(F, q);
        } else {
            if (z) {
                super.onMeasure(i, i2);
            }
            z2 = true;
        }
        if (this.f2736m2 || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int V = this.f3093e.mo4369V() + getPaddingLeft() + getPaddingRight();
            int z3 = this.f3093e.mo4441z() + paddingTop;
            int i3 = this.f2745r2;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f2737n2;
                V = (int) (((float) i4) + (this.f2749t2 * ((float) (this.f2741p2 - i4))));
                requestLayout();
            }
            int i5 = this.f2747s2;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f2739o2;
                z3 = (int) (((float) i6) + (this.f2749t2 * ((float) (this.f2743q2 - i6))));
                requestLayout();
            }
            setMeasuredDimension(V, z3);
        }
        mo4667a0();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C0507a.C0509b bVar;
        C0511b B;
        int q;
        C0507a aVar = this.f2738o1;
        if (aVar != null && (bVar = aVar.f2812c) != null && bVar.mo4831C()) {
            int i4 = -1;
            if (!bVar.mo4831C() || (B = bVar.mo4830B()) == null || (q = B.mo4865q()) == -1 || view.getId() == q) {
                if (aVar.mo4824w()) {
                    C0511b B2 = bVar.mo4830B();
                    if (!(B2 == null || (B2.mo4853e() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f = this.f2685B1;
                    if ((f == 1.0f || f == Utils.FLOAT_EPSILON) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(bVar.mo4830B() == null || (bVar.mo4830B().mo4853e() & 1) == 0)) {
                    float x = aVar.mo4825x((float) i, (float) i2);
                    float f2 = this.f2687C1;
                    if ((f2 <= Utils.FLOAT_EPSILON && x < Utils.FLOAT_EPSILON) || (f2 >= 1.0f && x > Utils.FLOAT_EPSILON)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new C0497a(view));
                        return;
                    }
                }
                float f3 = this.f2685B1;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.f2721X1 = f4;
                float f5 = (float) i2;
                this.f2722Y1 = f5;
                this.f2724a2 = (float) (((double) (nanoTime - this.f2723Z1)) * 1.0E-9d);
                this.f2723Z1 = nanoTime;
                aVar.mo4794P(f4, f5);
                if (f3 != this.f2685B1) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo4666Z(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.f2720W1 = true;
                }
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.f2720W1 && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f2720W1 = false;
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f2723Z1 = getNanoTime();
        this.f2724a2 = Utils.FLOAT_EPSILON;
        this.f2721X1 = Utils.FLOAT_EPSILON;
        this.f2722Y1 = Utils.FLOAT_EPSILON;
    }

    public void onRtlPropertiesChanged(int i) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            aVar.mo4801W(mo5081l());
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C0507a.C0509b bVar;
        C0507a aVar = this.f2738o1;
        if (aVar == null || (bVar = aVar.f2812c) == null || bVar.mo4830B() == null || (this.f2738o1.f2812c.mo4830B().mo4853e() & 2) != 0) {
            return false;
        }
        return true;
    }

    public void onStopNestedScroll(View view, int i) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            float f = this.f2724a2;
            if (f != Utils.FLOAT_EPSILON) {
                aVar.mo4795Q(this.f2721X1 / f, this.f2722Y1 / f);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0507a aVar = this.f2738o1;
        if (aVar == null || !this.f2756x1 || !aVar.mo4805b0()) {
            return super.onTouchEvent(motionEvent);
        }
        C0507a.C0509b bVar = this.f2738o1.f2812c;
        if (bVar != null && !bVar.mo4831C()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f2738o1.mo4796R(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f2729f2 == null) {
                this.f2729f2 = new CopyOnWriteArrayList<>();
            }
            this.f2729f2.add(motionHelper);
            if (motionHelper.mo4654z()) {
                if (this.f2726c2 == null) {
                    this.f2726c2 = new ArrayList<>();
                }
                this.f2726c2.add(motionHelper);
            }
            if (motionHelper.mo4653y()) {
                if (this.f2727d2 == null) {
                    this.f2727d2 = new ArrayList<>();
                }
                this.f2727d2.add(motionHelper);
            }
            if (motionHelper.mo4643x()) {
                if (this.f2728e2 == null) {
                    this.f2728e2 = new ArrayList<>();
                }
                this.f2728e2.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f2726c2;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f2727d2;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: p0 */
    public void mo4708p0() {
        this.f2702J2.mo4763h();
        invalidate();
    }

    /* renamed from: q0 */
    public final void mo4709q0() {
        boolean z;
        float f;
        float f2;
        int childCount = getChildCount();
        this.f2702J2.mo4756a();
        boolean z2 = true;
        this.f2695G1 = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.f2758y1.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int j = this.f2738o1.mo4811j();
        if (j != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                jy3 jy3 = this.f2758y1.get(getChildAt(i3));
                if (jy3 != null) {
                    jy3.mo22105C(j);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.f2758y1.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            jy3 jy32 = this.f2758y1.get(getChildAt(i5));
            if (jy32.mo22119h() != -1) {
                sparseBooleanArray.put(jy32.mo22119h(), true);
                iArr[i4] = jy32.mo22119h();
                i4++;
            }
        }
        if (this.f2728e2 != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                jy3 jy33 = this.f2758y1.get(findViewById(iArr[i6]));
                if (jy33 != null) {
                    this.f2738o1.mo4821t(jy33);
                }
            }
            Iterator<MotionHelper> it = this.f2728e2.iterator();
            while (it.hasNext()) {
                it.next().mo4641D(this, this.f2758y1);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                jy3 jy34 = this.f2758y1.get(findViewById(iArr[i7]));
                if (jy34 != null) {
                    jy34.mo22110H(width, height, this.f2683A1, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                jy3 jy35 = this.f2758y1.get(findViewById(iArr[i8]));
                if (jy35 != null) {
                    this.f2738o1.mo4821t(jy35);
                    jy35.mo22110H(width, height, this.f2683A1, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            jy3 jy36 = this.f2758y1.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && jy36 != null) {
                this.f2738o1.mo4821t(jy36);
                jy36.mo22110H(width, height, this.f2683A1, getNanoTime());
            }
        }
        float E = this.f2738o1.mo4783E();
        if (E != Utils.FLOAT_EPSILON) {
            if (((double) E) < Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            float abs = Math.abs(E);
            float f3 = -3.4028235E38f;
            float f4 = Float.MAX_VALUE;
            int i10 = 0;
            float f5 = -3.4028235E38f;
            float f6 = Float.MAX_VALUE;
            while (true) {
                if (i10 >= childCount) {
                    z2 = false;
                    break;
                }
                jy3 jy37 = this.f2758y1.get(getChildAt(i10));
                if (!Float.isNaN(jy37.f13924l)) {
                    break;
                }
                float n = jy37.mo22125n();
                float o = jy37.mo22126o();
                if (z) {
                    f2 = o - n;
                } else {
                    f2 = o + n;
                }
                f6 = Math.min(f6, f2);
                f5 = Math.max(f5, f2);
                i10++;
            }
            if (z2) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    jy3 jy38 = this.f2758y1.get(getChildAt(i11));
                    if (!Float.isNaN(jy38.f13924l)) {
                        f4 = Math.min(f4, jy38.f13924l);
                        f3 = Math.max(f3, jy38.f13924l);
                    }
                }
                while (i < childCount) {
                    jy3 jy39 = this.f2758y1.get(getChildAt(i));
                    if (!Float.isNaN(jy39.f13924l)) {
                        jy39.f13926n = 1.0f / (1.0f - abs);
                        if (z) {
                            jy39.f13925m = abs - (((f3 - jy39.f13924l) / (f3 - f4)) * abs);
                        } else {
                            jy39.f13925m = abs - (((jy39.f13924l - f4) * abs) / (f3 - f4));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                jy3 jy310 = this.f2758y1.get(getChildAt(i));
                float n2 = jy310.mo22125n();
                float o2 = jy310.mo22126o();
                if (z) {
                    f = o2 - n2;
                } else {
                    f = o2 + n2;
                }
                jy310.f13926n = 1.0f / (1.0f - abs);
                jy310.f13925m = abs - (((f - f6) * abs) / (f5 - f6));
                i++;
            }
        }
    }

    /* renamed from: r0 */
    public final Rect mo4710r0(ConstraintWidget constraintWidget) {
        this.f2696G2.top = constraintWidget.mo4373X();
        this.f2696G2.left = constraintWidget.mo4371W();
        Rect rect = this.f2696G2;
        int V = constraintWidget.mo4369V();
        Rect rect2 = this.f2696G2;
        rect.right = V + rect2.left;
        int z = constraintWidget.mo4441z();
        Rect rect3 = this.f2696G2;
        rect2.bottom = z + rect3.top;
        return rect3;
    }

    public void requestLayout() {
        C0507a aVar;
        C0507a.C0509b bVar;
        if (this.f2736m2 || this.f2748t1 != -1 || (aVar = this.f2738o1) == null || (bVar = aVar.f2812c) == null || bVar.mo4844z() != 0) {
            super.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4712s0(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.a r0 = r9.f2738o1
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.f2687C1
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.f2709N1 = r0
            long r1 = r9.getNanoTime()
            r9.f2760z1 = r1
            androidx.constraintlayout.motion.widget.a r1 = r9.f2738o1
            int r1 = r1.mo4817p()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.f2683A1 = r1
            r9.f2691E1 = r11
            r9.f2695G1 = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.f2687C1
            androidx.constraintlayout.motion.widget.a r0 = r9.f2738o1
            float r0 = r0.mo4822u()
            boolean r10 = m3828D0(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f2713P1
            float r11 = r9.f2687C1
            androidx.constraintlayout.motion.widget.a r0 = r9.f2738o1
            float r0 = r0.mo4822u()
            r10.mo4742b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f2713P1
            r9.f2740p1 = r10
            goto L_0x00f1
        L_0x005c:
            x96 r2 = r9.f2711O1
            float r3 = r9.f2687C1
            float r6 = r9.f2683A1
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r7 = r10.mo4822u()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r8 = r10.mo4823v()
            r4 = r11
            r5 = r12
            r2.mo27712b(r3, r4, r5, r6, r7, r8)
            r9.f2744r1 = r1
            int r10 = r9.f2748t1
            r9.f2691E1 = r11
            r9.f2748t1 = r10
            x96 r10 = r9.f2711O1
            r9.f2740p1 = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f2713P1
            float r11 = r9.f2687C1
            androidx.constraintlayout.motion.widget.a r0 = r9.f2738o1
            float r0 = r0.mo4822u()
            r10.mo4742b(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$d r10 = r9.f2713P1
            r9.f2740p1 = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = r1
        L_0x00a0:
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            int r10 = r10.mo4812k()
            if (r10 != 0) goto L_0x00c0
            x96 r0 = r9.f2711O1
            float r1 = r9.f2687C1
            float r4 = r9.f2683A1
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r5 = r10.mo4822u()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r6 = r10.mo4823v()
            r2 = r11
            r3 = r12
            r0.mo27712b(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            x96 r0 = r9.f2711O1
            float r1 = r9.f2687C1
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r4 = r10.mo4780B()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r5 = r10.mo4781C()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r6 = r10.mo4779A()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            float r7 = r10.mo4782D()
            androidx.constraintlayout.motion.widget.a r10 = r9.f2738o1
            int r8 = r10.mo4827z()
            r2 = r11
            r3 = r12
            r0.mo27714d(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.f2748t1
            r9.f2691E1 = r11
            r9.f2748t1 = r10
            x96 r10 = r9.f2711O1
            r9.f2740p1 = r10
        L_0x00f1:
            r10 = 0
            r9.f2693F1 = r10
            long r10 = r9.getNanoTime()
            r9.f2760z1 = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.mo4712s0(int, float, float):void");
    }

    public void setDebugMode(int i) {
        this.f2705L1 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f2698H2 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f2756x1 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f2738o1 != null) {
            setState(TransitionState.MOVING);
            Interpolator s = this.f2738o1.mo4820s();
            if (s != null) {
                setProgress(s.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f2727d2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2727d2.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f2726c2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f2726c2.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4775e(f);
            this.f2755w2.mo4778h(f2);
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.f2744r1 = f2;
        mo4658R(1.0f);
    }

    public void setScene(C0507a aVar) {
        this.f2738o1 = aVar;
        aVar.mo4801W(mo5081l());
        mo4708p0();
    }

    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4776f(i);
            this.f2755w2.mo4774d(i);
            return;
        }
        this.f2748t1 = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.f2748t1 != -1) {
            TransitionState transitionState3 = this.f2700I2;
            this.f2700I2 = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                mo4668b0();
            }
            int i = C0499c.f2766a[transitionState3.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == transitionState4) {
                    mo4668b0();
                }
                if (transitionState == transitionState2) {
                    mo4669c0();
                }
            } else if (i == 3 && transitionState == transitionState2) {
                mo4669c0();
            }
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4776f(i);
            this.f2755w2.mo4774d(i2);
            return;
        }
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            this.f2746s1 = i;
            this.f2750u1 = i2;
            aVar.mo4802X(i, i2);
            this.f2702J2.mo4760e(this.f3093e, this.f2738o1.mo4813l(i), this.f2738o1.mo4813l(i2));
            mo4708p0();
            this.f2687C1 = Utils.FLOAT_EPSILON;
            mo4734v0();
        }
    }

    public void setTransitionDuration(int i) {
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            aVar.mo4800V(i);
        }
    }

    public void setTransitionListener(C0506j jVar) {
        this.f2699I1 = jVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f2755w2 == null) {
            this.f2755w2 = new C0505i();
        }
        this.f2755w2.mo4777g(bundle);
        if (isAttachedToWindow()) {
            this.f2755w2.mo4771a();
        }
    }

    /* renamed from: t0 */
    public void mo4731t0() {
        mo4658R(1.0f);
        this.f2757x2 = null;
    }

    public String toString() {
        Context context = getContext();
        return t21.m27245c(context, this.f2746s1) + "->" + t21.m27245c(context, this.f2750u1) + " (pos:" + this.f2687C1 + " Dpos/Dt:" + this.f2744r1;
    }

    /* renamed from: u0 */
    public void mo4733u0(Runnable runnable) {
        mo4658R(1.0f);
        this.f2757x2 = runnable;
    }

    /* renamed from: v0 */
    public void mo4734v0() {
        mo4658R(Utils.FLOAT_EPSILON);
    }

    /* renamed from: w0 */
    public void mo4735w0(int i) {
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4774d(i);
            return;
        }
        mo4737y0(i, -1, -1);
    }

    /* renamed from: x0 */
    public void mo4736x0(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4774d(i);
            return;
        }
        mo4738z0(i, -1, -1, i2);
    }

    /* renamed from: y0 */
    public void mo4737y0(int i, int i2, int i3) {
        mo4738z0(i, i2, i3, -1);
    }

    /* renamed from: z0 */
    public void mo4738z0(int i, int i2, int i3, int i4) {
        b96 b96;
        int a;
        C0507a aVar = this.f2738o1;
        if (!(aVar == null || (b96 = aVar.f2811b) == null || (a = b96.mo11453a(this.f2748t1, i, (float) i2, (float) i3)) == -1)) {
            i = a;
        }
        int i5 = this.f2748t1;
        if (i5 != i) {
            if (this.f2746s1 == i) {
                mo4658R(Utils.FLOAT_EPSILON);
                if (i4 > 0) {
                    this.f2683A1 = ((float) i4) / 1000.0f;
                }
            } else if (this.f2750u1 == i) {
                mo4658R(1.0f);
                if (i4 > 0) {
                    this.f2683A1 = ((float) i4) / 1000.0f;
                }
            } else {
                this.f2750u1 = i;
                if (i5 != -1) {
                    setTransition(i5, i);
                    mo4658R(1.0f);
                    this.f2687C1 = Utils.FLOAT_EPSILON;
                    mo4731t0();
                    if (i4 > 0) {
                        this.f2683A1 = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.f2709N1 = false;
                this.f2691E1 = 1.0f;
                this.f2685B1 = Utils.FLOAT_EPSILON;
                this.f2687C1 = Utils.FLOAT_EPSILON;
                this.f2689D1 = getNanoTime();
                this.f2760z1 = getNanoTime();
                this.f2693F1 = false;
                this.f2740p1 = null;
                if (i4 == -1) {
                    this.f2683A1 = ((float) this.f2738o1.mo4817p()) / 1000.0f;
                }
                this.f2746s1 = -1;
                this.f2738o1.mo4802X(-1, this.f2750u1);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.f2683A1 = ((float) this.f2738o1.mo4817p()) / 1000.0f;
                } else if (i4 > 0) {
                    this.f2683A1 = ((float) i4) / 1000.0f;
                }
                int childCount = getChildCount();
                this.f2758y1.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.f2758y1.put(childAt, new jy3(childAt));
                    sparseArray.put(childAt.getId(), this.f2758y1.get(childAt));
                }
                this.f2695G1 = true;
                this.f2702J2.mo4760e(this.f3093e, (C0532a) null, this.f2738o1.mo4813l(i));
                mo4708p0();
                this.f2702J2.mo4756a();
                mo4664X();
                int width = getWidth();
                int height = getHeight();
                if (this.f2728e2 != null) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        jy3 jy3 = this.f2758y1.get(getChildAt(i7));
                        if (jy3 != null) {
                            this.f2738o1.mo4821t(jy3);
                        }
                    }
                    Iterator<MotionHelper> it = this.f2728e2.iterator();
                    while (it.hasNext()) {
                        it.next().mo4641D(this, this.f2758y1);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        jy3 jy32 = this.f2758y1.get(getChildAt(i8));
                        if (jy32 != null) {
                            jy32.mo22110H(width, height, this.f2683A1, getNanoTime());
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        jy3 jy33 = this.f2758y1.get(getChildAt(i9));
                        if (jy33 != null) {
                            this.f2738o1.mo4821t(jy33);
                            jy33.mo22110H(width, height, this.f2683A1, getNanoTime());
                        }
                    }
                }
                float E = this.f2738o1.mo4783E();
                if (E != Utils.FLOAT_EPSILON) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        jy3 jy34 = this.f2758y1.get(getChildAt(i10));
                        float o = jy34.mo22126o() + jy34.mo22125n();
                        f = Math.min(f, o);
                        f2 = Math.max(f2, o);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        jy3 jy35 = this.f2758y1.get(getChildAt(i11));
                        float n = jy35.mo22125n();
                        float o2 = jy35.mo22126o();
                        jy35.f13926n = 1.0f / (1.0f - E);
                        jy35.f13925m = E - ((((n + o2) - f) * E) / (f2 - f));
                    }
                }
                this.f2685B1 = Utils.FLOAT_EPSILON;
                this.f2687C1 = Utils.FLOAT_EPSILON;
                this.f2695G1 = true;
                invalidate();
            }
        }
    }

    public void setProgress(float f) {
        int i = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i >= 0) {
            int i2 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.f2755w2 == null) {
                this.f2755w2 = new C0505i();
            }
            this.f2755w2.mo4775e(f);
            return;
        }
        if (i <= 0) {
            if (this.f2687C1 == 1.0f && this.f2748t1 == this.f2750u1) {
                setState(TransitionState.MOVING);
            }
            this.f2748t1 = this.f2746s1;
            if (this.f2687C1 == Utils.FLOAT_EPSILON) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f2687C1 == Utils.FLOAT_EPSILON && this.f2748t1 == this.f2746s1) {
                setState(TransitionState.MOVING);
            }
            this.f2748t1 = this.f2750u1;
            if (this.f2687C1 == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.f2748t1 = -1;
            setState(TransitionState.MOVING);
        }
        if (this.f2738o1 != null) {
            this.f2693F1 = true;
            this.f2691E1 = f;
            this.f2685B1 = f;
            this.f2689D1 = -1;
            this.f2760z1 = -1;
            this.f2740p1 = null;
            this.f2695G1 = true;
            invalidate();
        }
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.f2748t1 = i;
        this.f2746s1 = -1;
        this.f2750u1 = -1;
        jq0 jq0 = this.f3081B;
        if (jq0 != null) {
            jq0.mo22038d(i, (float) i2, (float) i3);
            return;
        }
        C0507a aVar = this.f2738o1;
        if (aVar != null) {
            aVar.mo4813l(i).mo5155i(this);
        }
    }

    public void setTransition(int i) {
        if (this.f2738o1 != null) {
            C0507a.C0509b h0 = mo4688h0(i);
            this.f2746s1 = h0.mo4829A();
            this.f2750u1 = h0.mo4843y();
            if (!isAttachedToWindow()) {
                if (this.f2755w2 == null) {
                    this.f2755w2 = new C0505i();
                }
                this.f2755w2.mo4776f(this.f2746s1);
                this.f2755w2.mo4774d(this.f2750u1);
                return;
            }
            float f = Float.NaN;
            int i2 = this.f2748t1;
            int i3 = this.f2746s1;
            float f2 = Utils.FLOAT_EPSILON;
            if (i2 == i3) {
                f = 0.0f;
            } else if (i2 == this.f2750u1) {
                f = 1.0f;
            }
            this.f2738o1.mo4803Y(h0);
            this.f2702J2.mo4760e(this.f3093e, this.f2738o1.mo4813l(this.f2746s1), this.f2738o1.mo4813l(this.f2750u1));
            mo4708p0();
            if (this.f2687C1 != f) {
                if (f == Utils.FLOAT_EPSILON) {
                    mo4665Y(true);
                    this.f2738o1.mo4813l(this.f2746s1).mo5155i(this);
                } else if (f == 1.0f) {
                    mo4665Y(false);
                    this.f2738o1.mo4813l(this.f2750u1).mo5155i(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.f2687C1 = f2;
            if (Float.isNaN(f)) {
                StringBuilder sb = new StringBuilder();
                sb.append(t21.m27244b());
                sb.append(" transitionToStart ");
                mo4734v0();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(C0507a.C0509b bVar) {
        this.f2738o1.mo4803Y(bVar);
        setState(TransitionState.SETUP);
        if (this.f2748t1 == this.f2738o1.mo4818q()) {
            this.f2687C1 = 1.0f;
            this.f2685B1 = 1.0f;
            this.f2691E1 = 1.0f;
        } else {
            this.f2687C1 = Utils.FLOAT_EPSILON;
            this.f2685B1 = Utils.FLOAT_EPSILON;
            this.f2691E1 = Utils.FLOAT_EPSILON;
        }
        this.f2689D1 = bVar.mo4832D(1) ? -1 : getNanoTime();
        int F = this.f2738o1.mo4784F();
        int q = this.f2738o1.mo4818q();
        if (F != this.f2746s1 || q != this.f2750u1) {
            this.f2746s1 = F;
            this.f2750u1 = q;
            this.f2738o1.mo4802X(F, q);
            this.f2702J2.mo4760e(this.f3093e, this.f2738o1.mo4813l(this.f2746s1), this.f2738o1.mo4813l(this.f2750u1));
            this.f2702J2.mo4764i(this.f2746s1, this.f2750u1);
            this.f2702J2.mo4763h();
            mo4708p0();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4692k0(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4692k0(attributeSet);
    }
}
