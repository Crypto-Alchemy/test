package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: bj4 */
/* compiled from: OrientedDrawable */
public class bj4 extends h82 {

    /* renamed from: k */
    public final Matrix f8168k = new Matrix();

    /* renamed from: r */
    public int f8169r;

    /* renamed from: s */
    public int f8170s;

    /* renamed from: x */
    public final Matrix f8171x = new Matrix();

    /* renamed from: y */
    public final RectF f8172y = new RectF();

    public bj4(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f8169r = i - (i % 90);
        this.f8170s = (i2 < 0 || i2 > 8) ? 0 : i2;
    }

    /* renamed from: c */
    public void mo11676c(Matrix matrix) {
        mo20992m(matrix);
        if (!this.f8168k.isIdentity()) {
            matrix.preConcat(this.f8168k);
        }
    }

    public void draw(Canvas canvas) {
        int i;
        if (this.f8169r > 0 || !((i = this.f8170s) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.f8168k);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public int getIntrinsicHeight() {
        int i = this.f8170s;
        if (i == 5 || i == 7 || this.f8169r % 180 != 0) {
            return super.getIntrinsicWidth();
        }
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        int i = this.f8170s;
        if (i == 5 || i == 7 || this.f8169r % 180 != 0) {
            return super.getIntrinsicHeight();
        }
        return super.getIntrinsicWidth();
    }

    public void onBoundsChange(Rect rect) {
        int i;
        Drawable current = getCurrent();
        int i2 = this.f8169r;
        if (i2 > 0 || !((i = this.f8170s) == 0 || i == 1)) {
            int i3 = this.f8170s;
            if (i3 == 2) {
                this.f8168k.setScale(-1.0f, 1.0f);
            } else if (i3 == 7) {
                this.f8168k.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f8168k.postScale(-1.0f, 1.0f);
            } else if (i3 == 4) {
                this.f8168k.setScale(1.0f, -1.0f);
            } else if (i3 != 5) {
                this.f8168k.setRotate((float) i2, (float) rect.centerX(), (float) rect.centerY());
            } else {
                this.f8168k.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                this.f8168k.postScale(1.0f, -1.0f);
            }
            this.f8171x.reset();
            this.f8168k.invert(this.f8171x);
            this.f8172y.set(rect);
            this.f8171x.mapRect(this.f8172y);
            RectF rectF = this.f8172y;
            current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            return;
        }
        current.setBounds(rect);
    }
}
