package com.alexvasilkov.gestures.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alexvasilkov.gestures.GestureController;

public class GestureFrameLayout extends FrameLayout implements rf2, C2764ll {

    /* renamed from: a */
    public final nf2 f8638a;

    /* renamed from: d */
    public sd7 f8639d;

    /* renamed from: e */
    public final Matrix f8640e;

    /* renamed from: g */
    public final Matrix f8641g;

    /* renamed from: k */
    public final RectF f8642k;

    /* renamed from: r */
    public final float[] f8643r;

    /* renamed from: s */
    public MotionEvent f8644s;

    /* renamed from: com.alexvasilkov.gestures.views.GestureFrameLayout$a */
    public class C1708a implements GestureController.C1704e {
        public C1708a() {
        }

        /* renamed from: a */
        public void mo12232a(p86 p86) {
            GestureFrameLayout.this.mo12314c(p86);
        }

        /* renamed from: b */
        public void mo12233b(p86 p86, p86 p862) {
            GestureFrameLayout.this.mo12314c(p862);
        }
    }

    public GestureFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: d */
    public static int m12177d(int i, int i2, int i3) {
        if (i3 == -2) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
        }
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: a */
    public final MotionEvent mo12311a(MotionEvent motionEvent, Matrix matrix) {
        this.f8643r[0] = motionEvent.getX();
        this.f8643r[1] = motionEvent.getY();
        matrix.mapPoints(this.f8643r);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float[] fArr = this.f8643r;
        obtain.setLocation(fArr[0], fArr[1]);
        return obtain;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalArgumentException("GestureFrameLayout can contain only one child");
    }

    /* renamed from: b */
    public final void mo12313b(Rect rect, Matrix matrix) {
        this.f8642k.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        matrix.mapRect(this.f8642k);
        rect.set(Math.round(this.f8642k.left), Math.round(this.f8642k.top), Math.round(this.f8642k.right), Math.round(this.f8642k.bottom));
    }

    /* renamed from: c */
    public void mo12314c(p86 p86) {
        p86.mo24480d(this.f8640e);
        this.f8640e.invert(this.f8641g);
        invalidate();
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(this.f8640e);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (of2.m23787c()) {
            x21.m29838a(this, canvas);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f8644s = motionEvent;
        MotionEvent a = mo12311a(motionEvent, this.f8641g);
        try {
            return super.dispatchTouchEvent(a);
        } finally {
            a.recycle();
        }
    }

    public sd7 getPositionAnimator() {
        if (this.f8639d == null) {
            this.f8639d = new sd7(this);
        }
        return this.f8639d;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        mo12313b(rect, this.f8640e);
        return super.invalidateChildInParent(iArr, rect);
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(m12177d(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), m12177d(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f8638a.mo12172C(this, this.f8644s);
    }

    public void onMeasure(int i, int i2) {
        View view;
        super.onMeasure(i, i2);
        if (getChildCount() == 0) {
            view = null;
        } else {
            view = getChildAt(0);
        }
        if (view != null) {
            this.f8638a.mo12196n().mo12247M(view.getMeasuredWidth(), view.getMeasuredHeight());
            this.f8638a.mo12191V();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8638a.mo12196n().mo12249O((i - getPaddingLeft()) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom());
        this.f8638a.mo12191V();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f8638a.onTouch(this, this.f8644s);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            MotionEvent obtain = MotionEvent.obtain(this.f8644s);
            obtain.setAction(3);
            this.f8638a.mo12172C(this, obtain);
            obtain.recycle();
        }
    }

    public GestureFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nf2 getController() {
        return this.f8638a;
    }

    public GestureFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8640e = new Matrix();
        this.f8641g = new Matrix();
        this.f8642k = new RectF();
        this.f8643r = new float[2];
        nf2 nf2 = new nf2(this);
        this.f8638a = nf2;
        nf2.mo12196n().mo12273x(context, attributeSet);
        nf2.mo12192j(new C1708a());
    }
}
