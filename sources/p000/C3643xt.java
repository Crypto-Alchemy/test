package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: xt */
/* compiled from: AutoRotateDrawable */
public class C3643xt extends h82 implements Runnable {

    /* renamed from: k */
    public int f19972k;

    /* renamed from: r */
    public boolean f19973r;

    /* renamed from: s */
    public float f19974s;

    /* renamed from: x */
    public boolean f19975x;

    public C3643xt(Drawable drawable, int i) {
        this(drawable, i, true);
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right;
        int i2 = bounds.left;
        int i3 = i - i2;
        int i4 = bounds.bottom;
        int i5 = bounds.top;
        int i6 = i4 - i5;
        float f = this.f19974s;
        if (!this.f19973r) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (float) (i2 + (i3 / 2)), (float) (i5 + (i6 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        mo27879q();
    }

    /* renamed from: p */
    public final int mo27878p() {
        return (int) ((20.0f / ((float) this.f19972k)) * 360.0f);
    }

    /* renamed from: q */
    public final void mo27879q() {
        if (!this.f19975x) {
            this.f19975x = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public void run() {
        this.f19975x = false;
        this.f19974s += (float) mo27878p();
        invalidateSelf();
    }

    public C3643xt(Drawable drawable, int i, boolean z) {
        super((Drawable) au4.m10792g(drawable));
        this.f19974s = Utils.FLOAT_EPSILON;
        this.f19975x = false;
        this.f19972k = i;
        this.f19973r = z;
    }
}
