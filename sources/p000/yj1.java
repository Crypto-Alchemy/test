package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: yj1 */
/* compiled from: DrawableWrapper */
public class yj1 extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public Drawable f20245a;

    public yj1(Drawable drawable) {
        mo28107a(drawable);
    }

    /* renamed from: a */
    public void mo28107a(Drawable drawable) {
        Drawable drawable2 = this.f20245a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f20245a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f20245a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f20245a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f20245a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f20245a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f20245a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f20245a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f20245a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f20245a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f20245a.getPadding(rect);
    }

    public int[] getState() {
        return this.f20245a.getState();
    }

    public Region getTransparentRegion() {
        return this.f20245a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return ij1.m19649h(this.f20245a);
    }

    public boolean isStateful() {
        return this.f20245a.isStateful();
    }

    public void jumpToCurrentState() {
        this.f20245a.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f20245a.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f20245a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f20245a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        ij1.m19651j(this.f20245a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f20245a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f20245a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f20245a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f20245a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        ij1.m19652k(this.f20245a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        ij1.m19653l(this.f20245a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f20245a.setState(iArr);
    }

    public void setTint(int i) {
        ij1.m19655n(this.f20245a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        ij1.m19656o(this.f20245a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        ij1.m19657p(this.f20245a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f20245a.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
