package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p000.xl5;

/* renamed from: vl5 */
/* compiled from: ScaleTypeDrawable */
public class vl5 extends h82 {

    /* renamed from: A */
    public Matrix f18833A;

    /* renamed from: B */
    public Matrix f18834B = new Matrix();

    /* renamed from: k */
    public xl5.C3616b f18835k;

    /* renamed from: r */
    public Object f18836r;

    /* renamed from: s */
    public PointF f18837s = null;

    /* renamed from: x */
    public int f18838x = 0;

    /* renamed from: y */
    public int f18839y = 0;

    public vl5(Drawable drawable, xl5.C3616b bVar) {
        super(drawable);
        this.f18835k = bVar;
    }

    /* renamed from: c */
    public void mo11676c(Matrix matrix) {
        mo20992m(matrix);
        mo27212q();
        Matrix matrix2 = this.f18833A;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    public void draw(Canvas canvas) {
        mo27212q();
        if (this.f18833A != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f18833A);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    /* renamed from: n */
    public Drawable mo20994n(Drawable drawable) {
        Drawable n = super.mo20994n(drawable);
        mo27211p();
        return n;
    }

    public void onBoundsChange(Rect rect) {
        mo27211p();
    }

    /* renamed from: p */
    public void mo27211p() {
        float f;
        float f2;
        Drawable current = getCurrent();
        if (current == null) {
            this.f18839y = 0;
            this.f18838x = 0;
            this.f18833A = null;
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f18838x = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f18839y = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f18833A = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f18833A = null;
        } else if (this.f18835k == xl5.C3616b.f19893a) {
            current.setBounds(bounds);
            this.f18833A = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            xl5.C3616b bVar = this.f18835k;
            Matrix matrix = this.f18834B;
            PointF pointF = this.f18837s;
            if (pointF != null) {
                f = pointF.x;
            } else {
                f = 0.5f;
            }
            if (pointF != null) {
                f2 = pointF.y;
            } else {
                f2 = 0.5f;
            }
            bVar.mo27804a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
            this.f18833A = this.f18834B;
        }
    }

    /* renamed from: q */
    public final void mo27212q() {
        boolean z;
        xl5.C3616b bVar = this.f18835k;
        boolean z2 = true;
        if (bVar instanceof xl5.C3628n) {
            Object state = ((xl5.C3628n) bVar).getState();
            if (state == null || !state.equals(this.f18836r)) {
                z = true;
            } else {
                z = false;
            }
            this.f18836r = state;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            if (this.f18838x == current.getIntrinsicWidth() && this.f18839y == current.getIntrinsicHeight()) {
                z2 = false;
            }
            if (z2 || z) {
                mo27211p();
            }
        }
    }

    /* renamed from: r */
    public PointF mo27213r() {
        return this.f18837s;
    }

    /* renamed from: s */
    public xl5.C3616b mo27214s() {
        return this.f18835k;
    }

    /* renamed from: t */
    public void mo27215t(PointF pointF) {
        if (!hf4.m18860a(this.f18837s, pointF)) {
            if (pointF == null) {
                this.f18837s = null;
            } else {
                if (this.f18837s == null) {
                    this.f18837s = new PointF();
                }
                this.f18837s.set(pointF);
            }
            mo27211p();
            invalidateSelf();
        }
    }
}
