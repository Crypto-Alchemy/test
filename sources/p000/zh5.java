package p000;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: zh5 */
/* compiled from: RoundRectDrawable */
public class zh5 extends Drawable {

    /* renamed from: a */
    public float f20547a;

    /* renamed from: b */
    public final Paint f20548b;

    /* renamed from: c */
    public final RectF f20549c;

    /* renamed from: d */
    public final Rect f20550d;

    /* renamed from: e */
    public float f20551e;

    /* renamed from: f */
    public boolean f20552f = false;

    /* renamed from: g */
    public boolean f20553g = true;

    /* renamed from: h */
    public ColorStateList f20554h;

    /* renamed from: i */
    public PorterDuffColorFilter f20555i;

    /* renamed from: j */
    public ColorStateList f20556j;

    /* renamed from: k */
    public PorterDuff.Mode f20557k = PorterDuff.Mode.SRC_IN;

    public zh5(ColorStateList colorStateList, float f) {
        this.f20547a = f;
        this.f20548b = new Paint(5);
        mo28436e(colorStateList);
        this.f20549c = new RectF();
        this.f20550d = new Rect();
    }

    /* renamed from: a */
    public final PorterDuffColorFilter mo28431a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: b */
    public ColorStateList mo28432b() {
        return this.f20554h;
    }

    /* renamed from: c */
    public float mo28433c() {
        return this.f20551e;
    }

    /* renamed from: d */
    public float mo28434d() {
        return this.f20547a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f20548b;
        if (this.f20555i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f20555i);
            z = true;
        }
        RectF rectF = this.f20549c;
        float f = this.f20547a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: e */
    public final void mo28436e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f20554h = colorStateList;
        this.f20548b.setColor(colorStateList.getColorForState(getState(), this.f20554h.getDefaultColor()));
    }

    /* renamed from: f */
    public void mo28437f(ColorStateList colorStateList) {
        mo28436e(colorStateList);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo28438g(float f, boolean z, boolean z2) {
        if (f != this.f20551e || this.f20552f != z || this.f20553g != z2) {
            this.f20551e = f;
            this.f20552f = z;
            this.f20553g = z2;
            mo28442i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f20550d, this.f20547a);
    }

    /* renamed from: h */
    public void mo28441h(float f) {
        if (f != this.f20547a) {
            this.f20547a = f;
            mo28442i((Rect) null);
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public final void mo28442i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f20549c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f20550d.set(rect);
        if (this.f20552f) {
            float b = ai5.m318b(this.f20551e, this.f20547a, this.f20553g);
            this.f20550d.inset((int) Math.ceil((double) ai5.m317a(this.f20551e, this.f20547a, this.f20553g)), (int) Math.ceil((double) b));
            this.f20549c.set(this.f20550d);
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f20556j;
        if ((colorStateList2 == null || !colorStateList2.isStateful()) && (((colorStateList = this.f20554h) == null || !colorStateList.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo28442i(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f20554h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState != this.f20548b.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f20548b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f20556j;
        if (colorStateList2 == null || (mode = this.f20557k) == null) {
            return z;
        }
        this.f20555i = mo28431a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f20548b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f20548b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f20556j = colorStateList;
        this.f20555i = mo28431a(colorStateList, this.f20557k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f20557k = mode;
        this.f20555i = mo28431a(this.f20556j, mode);
        invalidateSelf();
    }
}
