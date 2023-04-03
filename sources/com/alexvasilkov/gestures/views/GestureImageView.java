package com.alexvasilkov.gestures.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.alexvasilkov.gestures.GestureController;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

public class GestureImageView extends ImageView implements rf2, xg0, ug0, C2764ll {

    /* renamed from: a */
    public nf2 f8646a;

    /* renamed from: d */
    public final vg0 f8647d;

    /* renamed from: e */
    public final vg0 f8648e;

    /* renamed from: g */
    public final Matrix f8649g;

    /* renamed from: k */
    public sd7 f8650k;

    /* renamed from: com.alexvasilkov.gestures.views.GestureImageView$a */
    public class C1709a implements GestureController.C1704e {
        public C1709a() {
        }

        /* renamed from: a */
        public void mo12232a(p86 p86) {
            GestureImageView.this.mo12327c(p86);
        }

        /* renamed from: b */
        public void mo12233b(p86 p86, p86 p862) {
            GestureImageView.this.mo12327c(p862);
        }
    }

    public GestureImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: e */
    public static Drawable m12183e(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: a */
    public void mo12326a(RectF rectF) {
        this.f8648e.mo12292b(rectF, Utils.FLOAT_EPSILON);
    }

    /* renamed from: b */
    public void mo12292b(RectF rectF, float f) {
        this.f8647d.mo12292b(rectF, f);
    }

    /* renamed from: c */
    public void mo12327c(p86 p86) {
        p86.mo24480d(this.f8649g);
        setImageMatrix(this.f8649g);
    }

    /* renamed from: d */
    public final void mo12328d() {
        if (this.f8646a == null) {
            this.f8646a = new nf2(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f8648e.mo27131c(canvas);
        this.f8647d.mo27131c(canvas);
        super.draw(canvas);
        this.f8647d.mo27130a(canvas);
        this.f8648e.mo27130a(canvas);
        if (of2.m23787c()) {
            x21.m29838a(this, canvas);
        }
    }

    public sd7 getPositionAnimator() {
        if (this.f8650k == null) {
            this.f8650k = new sd7(this);
        }
        return this.f8650k;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8646a.mo12196n().mo12249O((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom());
        this.f8646a.mo12186Q();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f8646a.onTouch(this, motionEvent);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mo12328d();
        Settings n = this.f8646a.mo12196n();
        float l = (float) n.mo12261l();
        float k = (float) n.mo12260k();
        if (drawable == null) {
            n.mo12247M(0, 0);
        } else if (drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            n.mo12247M(n.mo12265p(), n.mo12264o());
        } else {
            n.mo12247M(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        float l2 = (float) n.mo12261l();
        float k2 = (float) n.mo12260k();
        if (l2 <= Utils.FLOAT_EPSILON || k2 <= Utils.FLOAT_EPSILON || l <= Utils.FLOAT_EPSILON || k <= Utils.FLOAT_EPSILON) {
            this.f8646a.mo12186Q();
            return;
        }
        this.f8646a.mo12199p().mo25670k(Math.min(l / l2, k / k2));
        this.f8646a.mo12191V();
        this.f8646a.mo12199p().mo25670k(Utils.FLOAT_EPSILON);
    }

    public void setImageResource(int i) {
        setImageDrawable(m12183e(getContext(), i));
    }

    public GestureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nf2 getController() {
        return this.f8646a;
    }

    public GestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8647d = new vg0(this);
        this.f8648e = new vg0(this);
        this.f8649g = new Matrix();
        mo12328d();
        this.f8646a.mo12196n().mo12273x(context, attributeSet);
        this.f8646a.mo12192j(new C1709a());
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
