package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: hp3 */
/* compiled from: MatrixDrawable */
public class hp3 extends h82 {

    /* renamed from: k */
    public Matrix f12987k;

    /* renamed from: r */
    public Matrix f12988r;

    /* renamed from: s */
    public int f12989s;

    /* renamed from: x */
    public int f12990x;

    /* renamed from: c */
    public void mo11676c(Matrix matrix) {
        super.mo11676c(matrix);
        Matrix matrix2 = this.f12988r;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public void draw(Canvas canvas) {
        mo21332q();
        if (this.f12988r != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f12988r);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: n */
    public Drawable mo20994n(Drawable drawable) {
        Drawable n = super.mo20994n(drawable);
        mo21331p();
        return n;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo21331p();
    }

    /* renamed from: p */
    public final void mo21331p() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f12989s = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f12990x = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f12988r = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f12988r = this.f12987k;
    }

    /* renamed from: q */
    public final void mo21332q() {
        if (this.f12989s != getCurrent().getIntrinsicWidth() || this.f12990x != getCurrent().getIntrinsicHeight()) {
            mo21331p();
        }
    }
}
