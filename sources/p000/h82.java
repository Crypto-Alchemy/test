package p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: h82 */
/* compiled from: ForwardingDrawable */
public class h82 extends Drawable implements Drawable.Callback, hw6, gw6, nj1 {

    /* renamed from: g */
    public static final Matrix f12767g = new Matrix();

    /* renamed from: a */
    public Drawable f12768a;

    /* renamed from: d */
    public final oj1 f12769d = new oj1();

    /* renamed from: e */
    public hw6 f12770e;

    public h82(Drawable drawable) {
        this.f12768a = drawable;
        uj1.m28304d(drawable, this, this);
    }

    /* renamed from: c */
    public void mo11676c(Matrix matrix) {
        mo20992m(matrix);
    }

    /* renamed from: d */
    public Drawable mo20786d(Drawable drawable) {
        return mo20994n(drawable);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    /* renamed from: f */
    public void mo20589f(hw6 hw6) {
        this.f12770e = hw6;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    public Drawable getCurrent() {
        return this.f12768a;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    /* renamed from: i */
    public void mo20771i(RectF rectF) {
        hw6 hw6 = this.f12770e;
        if (hw6 != null) {
            hw6.mo20771i(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    /* renamed from: j */
    public Drawable mo20787j() {
        return getCurrent();
    }

    /* renamed from: m */
    public void mo20992m(Matrix matrix) {
        hw6 hw6 = this.f12770e;
        if (hw6 != null) {
            hw6.mo11676c(matrix);
        } else {
            matrix.reset();
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: n */
    public Drawable mo20994n(Drawable drawable) {
        Drawable o = mo20995o(drawable);
        invalidateSelf();
        return o;
    }

    /* renamed from: o */
    public Drawable mo20995o(Drawable drawable) {
        Drawable drawable2 = this.f12768a;
        uj1.m28304d(drawable2, (Drawable.Callback) null, (hw6) null);
        uj1.m28304d(drawable, (Drawable.Callback) null, (hw6) null);
        uj1.m28305e(drawable, this.f12769d);
        uj1.m28301a(drawable, this);
        uj1.m28304d(drawable, this, this);
        this.f12768a = drawable;
        return drawable2;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.onLevelChange(i);
        }
        return drawable.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f12769d.mo23961b(i);
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12769d.mo23962c(colorFilter);
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public void setDither(boolean z) {
        this.f12769d.mo23963d(z);
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f12769d.mo23964e(z);
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f12768a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f12768a;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
