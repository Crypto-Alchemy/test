package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: A */
    public final Paint f24618A;

    /* renamed from: B */
    public final RectF f24619B;

    /* renamed from: C */
    public final int f24620C;

    /* renamed from: H */
    public float f24621H;

    /* renamed from: I */
    public boolean f24622I;

    /* renamed from: L */
    public C4448c f24623L;

    /* renamed from: M */
    public double f24624M;

    /* renamed from: P */
    public int f24625P;

    /* renamed from: a */
    public ValueAnimator f24626a;

    /* renamed from: d */
    public boolean f24627d;

    /* renamed from: e */
    public float f24628e;

    /* renamed from: g */
    public float f24629g;

    /* renamed from: k */
    public boolean f24630k;

    /* renamed from: r */
    public int f24631r;

    /* renamed from: s */
    public final List<C4449d> f24632s;

    /* renamed from: x */
    public final int f24633x;

    /* renamed from: y */
    public final float f24634y;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C4446a implements ValueAnimator.AnimatorUpdateListener {
        public C4446a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.mo34063m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C4447b extends AnimatorListenerAdapter {
        public C4447b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C4448c {
        /* renamed from: a */
        void mo34069a(float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C4449d {
        /* renamed from: a */
        void mo34048a(float f, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.materialClockStyle);
    }

    /* renamed from: b */
    public void mo34052b(C4449d dVar) {
        this.f24632s.add(dVar);
    }

    /* renamed from: c */
    public final void mo34053c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f24618A.setStrokeWidth(Utils.FLOAT_EPSILON);
        canvas.drawCircle((((float) this.f24625P) * ((float) Math.cos(this.f24624M))) + f, (((float) this.f24625P) * ((float) Math.sin(this.f24624M))) + f2, (float) this.f24633x, this.f24618A);
        double sin = Math.sin(this.f24624M);
        double cos = Math.cos(this.f24624M);
        double d = (double) ((float) (this.f24625P - this.f24633x));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f24618A.setStrokeWidth((float) this.f24620C);
        canvas.drawLine(f, f2, f3, f4, this.f24618A);
        canvas.drawCircle(f, f2, this.f24634y, this.f24618A);
    }

    /* renamed from: d */
    public RectF mo34054d() {
        return this.f24619B;
    }

    /* renamed from: e */
    public final int mo34055e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        if (degrees < 0) {
            return degrees + 360;
        }
        return degrees;
    }

    /* renamed from: f */
    public float mo34056f() {
        return this.f24621H;
    }

    /* renamed from: g */
    public int mo34057g() {
        return this.f24633x;
    }

    /* renamed from: h */
    public final Pair<Float, Float> mo34058h(float f) {
        float f2 = mo34056f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    public final boolean mo34059i(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float e = (float) mo34055e(f, f2);
        boolean z5 = false;
        if (mo34056f() != e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.f24627d) {
            z5 = true;
        }
        mo34062l(e, z5);
        return true;
    }

    /* renamed from: j */
    public void mo34060j(int i) {
        this.f24625P = i;
        invalidate();
    }

    /* renamed from: k */
    public void mo34061k(float f) {
        mo34062l(f, false);
    }

    /* renamed from: l */
    public void mo34062l(float f, boolean z) {
        ValueAnimator valueAnimator = this.f24626a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            mo34063m(f, false);
            return;
        }
        Pair<Float, Float> h = mo34058h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f24626a = ofFloat;
        ofFloat.setDuration(200);
        this.f24626a.addUpdateListener(new C4446a());
        this.f24626a.addListener(new C4447b());
        this.f24626a.start();
    }

    /* renamed from: m */
    public final void mo34063m(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f24621H = f2;
        this.f24624M = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f24625P) * ((float) Math.cos(this.f24624M)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f24625P) * ((float) Math.sin(this.f24624M)));
        RectF rectF = this.f24619B;
        int i = this.f24633x;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C4449d a : this.f24632s) {
            a.mo34048a(f2, z);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo34053c(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo34061k(mo34056f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C4448c cVar;
        boolean z4;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f24628e = x;
            this.f24629g = y;
            this.f24630k = true;
            this.f24622I = false;
            z3 = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f24628e);
            int i2 = (int) (y - this.f24629g);
            if ((i * i) + (i2 * i2) > this.f24631r) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f24630k = z4;
            boolean z5 = this.f24622I;
            if (actionMasked == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            z = false;
            z2 = z5;
        } else {
            z3 = false;
            z2 = false;
            z = false;
        }
        boolean i3 = mo34059i(x, y, z2, z, z3) | this.f24622I;
        this.f24622I = i3;
        if (i3 && z3 && (cVar = this.f24623L) != null) {
            cVar.mo34069a((float) mo34055e(x, y), this.f24630k);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24632s = new ArrayList();
        Paint paint = new Paint();
        this.f24618A = paint;
        this.f24619B = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ClockHandView, i, e55.Widget_MaterialComponents_TimePicker_Clock);
        this.f24625P = obtainStyledAttributes.getDimensionPixelSize(u55.ClockHandView_materialCircleRadius, 0);
        this.f24633x = obtainStyledAttributes.getDimensionPixelSize(u55.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f24620C = resources.getDimensionPixelSize(k25.material_clock_hand_stroke_width);
        this.f24634y = (float) resources.getDimensionPixelSize(k25.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(u55.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo34061k(Utils.FLOAT_EPSILON);
        this.f24631r = ViewConfiguration.get(context).getScaledTouchSlop();
        ga7.m17714A0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
