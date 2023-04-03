package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import p000.C5943hz;

public abstract class BaseProgressIndicator<S extends C5943hz> extends ProgressBar {

    /* renamed from: L */
    public static final int f24164L = e55.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: A */
    public int f24165A = 4;

    /* renamed from: B */
    public final Runnable f24166B = new C4347a();

    /* renamed from: C */
    public final Runnable f24167C = new C4348b();

    /* renamed from: H */
    public final C3681yj f24168H = new C4349c();

    /* renamed from: I */
    public final C3681yj f24169I = new C4350d();

    /* renamed from: a */
    public S f24170a;

    /* renamed from: d */
    public int f24171d;

    /* renamed from: e */
    public boolean f24172e;

    /* renamed from: g */
    public boolean f24173g;

    /* renamed from: k */
    public final int f24174k;

    /* renamed from: r */
    public final int f24175r;

    /* renamed from: s */
    public long f24176s = -1;

    /* renamed from: x */
    public C5865gl f24177x;

    /* renamed from: y */
    public boolean f24178y = false;

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$a */
    public class C4347a implements Runnable {
        public C4347a() {
        }

        public void run() {
            BaseProgressIndicator.this.mo33285k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$b */
    public class C4348b implements Runnable {
        public C4348b() {
        }

        public void run() {
            BaseProgressIndicator.this.mo33284j();
            long unused = BaseProgressIndicator.this.f24176s = -1;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$c */
    public class C4349c extends C3681yj {
        public C4349c() {
        }

        public void onAnimationEnd(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator.this.setProgressCompat(0, false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f24171d, BaseProgressIndicator.this.f24172e);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.BaseProgressIndicator$d */
    public class C4350d extends C3681yj {
        public C4350d() {
        }

        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            if (!BaseProgressIndicator.this.f24178y) {
                BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
                baseProgressIndicator.setVisibility(baseProgressIndicator.f24165A);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(xo3.m54461c(context, attributeSet, i, f24164L), attributeSet, i);
        Context context2 = getContext();
        this.f24170a = mo33282i(context2, attributeSet);
        TypedArray h = wo6.m54004h(context2, attributeSet, u55.BaseProgressIndicator, i, i2, new int[0]);
        this.f24174k = h.getInt(u55.BaseProgressIndicator_showDelay, -1);
        this.f24175r = Math.min(h.getInt(u55.BaseProgressIndicator_minHideDelay, -1), 1000);
        h.recycle();
        this.f24177x = new C5865gl();
        this.f24173g = true;
    }

    private fk1<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().mo47864v();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().mo42579w();
        }
    }

    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f24170a.f29763f;
    }

    public int[] getIndicatorColor() {
        return this.f24170a.f29760c;
    }

    public int getShowAnimationBehavior() {
        return this.f24170a.f29762e;
    }

    public int getTrackColor() {
        return this.f24170a.f29761d;
    }

    public int getTrackCornerRadius() {
        return this.f24170a.f29759b;
    }

    public int getTrackThickness() {
        return this.f24170a.f29758a;
    }

    /* renamed from: h */
    public void mo33281h(boolean z) {
        if (this.f24173g) {
            ((wj1) getCurrentDrawable()).mo42571p(mo33296p(), false, z);
        }
    }

    /* renamed from: i */
    public abstract S mo33282i(Context context, AttributeSet attributeSet);

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: j */
    public final void mo33284j() {
        ((wj1) getCurrentDrawable()).mo42571p(false, false, true);
        if (mo33287m()) {
            setVisibility(4);
        }
    }

    /* renamed from: k */
    public final void mo33285k() {
        if (this.f24175r > 0) {
            this.f24176s = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: l */
    public boolean mo33286l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo33287m() {
        if ((getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible())) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo33288n() {
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().mo47863u().mo28934d(this.f24168H);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo42569l(this.f24169I);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo42569l(this.f24169I);
        }
    }

    /* renamed from: o */
    public final void mo33289o() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo42573r(this.f24169I);
            getIndeterminateDrawable().mo47863u().mo28937h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo42573r(this.f24169I);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo33288n();
        if (mo33296p()) {
            mo33285k();
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f24167C);
        removeCallbacks(this.f24166B);
        ((wj1) getCurrentDrawable()).mo42564h();
        mo33289o();
        super.onDetachedFromWindow();
    }

    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        fk1 currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            int e = currentDrawingDelegate.mo42607e();
            int d = currentDrawingDelegate.mo42606d();
            if (e < 0) {
                i3 = getMeasuredWidth();
            } else {
                i3 = e + getPaddingLeft() + getPaddingRight();
            }
            if (d < 0) {
                i4 = getMeasuredHeight();
            } else {
                i4 = d + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i3, i4);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        mo33281h(z);
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        mo33281h(false);
    }

    /* renamed from: p */
    public boolean mo33296p() {
        if (!ga7.m17746S(this) || getWindowVisibility() != 0 || !mo33286l()) {
            return false;
        }
        return true;
    }

    public void setAnimatorDurationScaleProvider(C5865gl glVar) {
        this.f24177x = glVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f35354e = glVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f35354e = glVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f24170a.f29763f = i;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            if (mo33296p()) {
                if (z) {
                    throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
                }
            }
            wj1 wj1 = (wj1) getCurrentDrawable();
            if (wj1 != null) {
                wj1.mo42564h();
            }
            super.setIndeterminate(z);
            wj1 wj12 = (wj1) getCurrentDrawable();
            if (wj12 != null) {
                wj12.mo42571p(mo33296p(), false, false);
            }
            this.f24178y = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof st2) {
            ((wj1) drawable).mo42564h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{ro3.m51196b(getContext(), j15.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f24170a.f29760c = iArr;
            getIndeterminateDrawable().mo47863u().mo28933c();
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            setProgressCompat(i, false);
        }
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null && !z) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f24171d = i;
            this.f24172e = z;
            this.f24178y = true;
            if (!getIndeterminateDrawable().isVisible() || this.f24177x.mo42905a(getContext().getContentResolver()) == Utils.FLOAT_EPSILON) {
                this.f24168H.onAnimationEnd(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().mo47863u().mo28935f();
            }
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof fe1) {
            fe1 fe1 = (fe1) drawable;
            fe1.mo42564h();
            super.setProgressDrawable(fe1);
            fe1.mo42558A(((float) getProgress()) / ((float) getMax()));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f24170a.f29762e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f24170a;
        if (s.f29761d != i) {
            s.f29761d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f24170a;
        if (s.f29759b != i) {
            s.f29759b = Math.min(i, s.f29758a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f24170a;
        if (s.f29758a != i) {
            s.f29758a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.f24165A = i;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public st2<S> getIndeterminateDrawable() {
        return (st2) super.getIndeterminateDrawable();
    }

    public fe1<S> getProgressDrawable() {
        return (fe1) super.getProgressDrawable();
    }
}
