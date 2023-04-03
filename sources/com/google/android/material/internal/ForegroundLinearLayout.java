package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a */
    public Drawable f23988a;

    /* renamed from: d */
    public final Rect f23989d;

    /* renamed from: e */
    public final Rect f23990e;

    /* renamed from: g */
    public int f23991g;

    /* renamed from: k */
    public boolean f23992k;

    /* renamed from: r */
    public boolean f23993r;

    public ForegroundLinearLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f23988a;
        if (drawable != null) {
            if (this.f23993r) {
                this.f23993r = false;
                Rect rect = this.f23989d;
                Rect rect2 = this.f23990e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f23992k) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f23991g, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f23988a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f23988a;
        if (drawable != null && drawable.isStateful()) {
            this.f23988a.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f23988a;
    }

    public int getForegroundGravity() {
        return this.f23991g;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f23988a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f23993r = z | this.f23993r;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f23993r = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f23988a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f23988a);
            }
            this.f23988a = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f23991g == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.f23991g != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f23991g = i;
            if (i == 119 && this.f23988a != null) {
                this.f23988a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f23988a) {
            return true;
        }
        return false;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23989d = new Rect();
        this.f23990e = new Rect();
        this.f23991g = 119;
        this.f23992k = true;
        this.f23993r = false;
        TypedArray h = wo6.m54004h(context, attributeSet, u55.ForegroundLinearLayout, i, 0, new int[0]);
        this.f23991g = h.getInt(u55.ForegroundLinearLayout_android_foregroundGravity, this.f23991g);
        Drawable drawable = h.getDrawable(u55.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f23992k = h.getBoolean(u55.ForegroundLinearLayout_foregroundInsidePadding, true);
        h.recycle();
    }
}
