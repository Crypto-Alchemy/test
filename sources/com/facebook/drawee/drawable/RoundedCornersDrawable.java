package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

public class RoundedCornersDrawable extends h82 implements ci5 {

    /* renamed from: A */
    public final float[] f9545A = new float[8];

    /* renamed from: B */
    public final Paint f9546B = new Paint(1);

    /* renamed from: C */
    public boolean f9547C = false;

    /* renamed from: H */
    public float f9548H = Utils.FLOAT_EPSILON;

    /* renamed from: I */
    public int f9549I = 0;

    /* renamed from: L */
    public int f9550L = 0;

    /* renamed from: M */
    public float f9551M = Utils.FLOAT_EPSILON;

    /* renamed from: P */
    public boolean f9552P = false;

    /* renamed from: Q */
    public boolean f9553Q = false;

    /* renamed from: U */
    public final Path f9554U = new Path();

    /* renamed from: X */
    public final Path f9555X = new Path();

    /* renamed from: Y */
    public final RectF f9556Y = new RectF();

    /* renamed from: k */
    public Type f9557k = Type.OVERLAY_COLOR;

    /* renamed from: r */
    public final RectF f9558r = new RectF();

    /* renamed from: s */
    public RectF f9559s;

    /* renamed from: x */
    public Matrix f9560x;

    /* renamed from: y */
    public final float[] f9561y = new float[8];

    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$a */
    public static /* synthetic */ class C1933a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9563a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type[] r0 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9563a = r0
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type r1 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.CLIPPING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9563a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.drawee.drawable.RoundedCornersDrawable$Type r1 = com.facebook.drawee.drawable.RoundedCornersDrawable.Type.OVERLAY_COLOR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.drawable.RoundedCornersDrawable.C1933a.<clinit>():void");
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) au4.m10792g(drawable));
    }

    /* renamed from: a */
    public void mo12062a(int i, float f) {
        this.f9549I = i;
        this.f9548H = f;
        mo13252r();
        invalidateSelf();
    }

    /* renamed from: b */
    public void mo12063b(boolean z) {
        this.f9547C = z;
        mo13252r();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f9558r.set(getBounds());
        int i = C1933a.f9563a[this.f9557k.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            canvas.clipPath(this.f9554U);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.f9552P) {
                RectF rectF = this.f9559s;
                if (rectF == null) {
                    this.f9559s = new RectF(this.f9558r);
                    this.f9560x = new Matrix();
                } else {
                    rectF.set(this.f9558r);
                }
                RectF rectF2 = this.f9559s;
                float f = this.f9548H;
                rectF2.inset(f, f);
                this.f9560x.setRectToRect(this.f9558r, this.f9559s, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.f9558r);
                canvas.concat(this.f9560x);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.f9546B.setStyle(Paint.Style.FILL);
            this.f9546B.setColor(this.f9550L);
            this.f9546B.setStrokeWidth(Utils.FLOAT_EPSILON);
            this.f9546B.setFilterBitmap(mo13250p());
            this.f9554U.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f9554U, this.f9546B);
            if (this.f9547C) {
                float width = ((this.f9558r.width() - this.f9558r.height()) + this.f9548H) / 2.0f;
                float height = ((this.f9558r.height() - this.f9558r.width()) + this.f9548H) / 2.0f;
                if (width > Utils.FLOAT_EPSILON) {
                    RectF rectF3 = this.f9558r;
                    float f2 = rectF3.left;
                    Canvas canvas2 = canvas;
                    canvas2.drawRect(f2, rectF3.top, f2 + width, rectF3.bottom, this.f9546B);
                    RectF rectF4 = this.f9558r;
                    float f3 = rectF4.right;
                    canvas2.drawRect(f3 - width, rectF4.top, f3, rectF4.bottom, this.f9546B);
                }
                if (height > Utils.FLOAT_EPSILON) {
                    RectF rectF5 = this.f9558r;
                    float f4 = rectF5.left;
                    float f5 = rectF5.top;
                    Canvas canvas3 = canvas;
                    canvas3.drawRect(f4, f5, rectF5.right, f5 + height, this.f9546B);
                    RectF rectF6 = this.f9558r;
                    float f6 = rectF6.left;
                    float f7 = rectF6.bottom;
                    canvas3.drawRect(f6, f7 - height, rectF6.right, f7, this.f9546B);
                }
            }
        }
        if (this.f9549I != 0) {
            this.f9546B.setStyle(Paint.Style.STROKE);
            this.f9546B.setColor(this.f9549I);
            this.f9546B.setStrokeWidth(this.f9548H);
            this.f9554U.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.f9555X, this.f9546B);
        }
    }

    /* renamed from: e */
    public void mo12064e(float f) {
        this.f9551M = f;
        mo13252r();
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo12065g(boolean z) {
        if (this.f9553Q != z) {
            this.f9553Q = z;
            invalidateSelf();
        }
    }

    /* renamed from: h */
    public void mo12066h(boolean z) {
        this.f9552P = z;
        mo13252r();
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo12067l(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f9561y, Utils.FLOAT_EPSILON);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            au4.m10788c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f9561y, 0, 8);
        }
        mo13252r();
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo13252r();
    }

    /* renamed from: p */
    public boolean mo13250p() {
        return this.f9553Q;
    }

    /* renamed from: q */
    public void mo13251q(int i) {
        this.f9550L = i;
        invalidateSelf();
    }

    /* renamed from: r */
    public final void mo13252r() {
        float[] fArr;
        this.f9554U.reset();
        this.f9555X.reset();
        this.f9556Y.set(getBounds());
        RectF rectF = this.f9556Y;
        float f = this.f9551M;
        rectF.inset(f, f);
        if (this.f9557k == Type.OVERLAY_COLOR) {
            this.f9554U.addRect(this.f9556Y, Path.Direction.CW);
        }
        if (this.f9547C) {
            this.f9554U.addCircle(this.f9556Y.centerX(), this.f9556Y.centerY(), Math.min(this.f9556Y.width(), this.f9556Y.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.f9554U.addRoundRect(this.f9556Y, this.f9561y, Path.Direction.CW);
        }
        RectF rectF2 = this.f9556Y;
        float f2 = this.f9551M;
        rectF2.inset(-f2, -f2);
        RectF rectF3 = this.f9556Y;
        float f3 = this.f9548H;
        rectF3.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f9547C) {
            this.f9555X.addCircle(this.f9556Y.centerX(), this.f9556Y.centerY(), Math.min(this.f9556Y.width(), this.f9556Y.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f9545A;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.f9561y[i] + this.f9551M) - (this.f9548H / 2.0f);
                i++;
            }
            this.f9555X.addRoundRect(this.f9556Y, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.f9556Y;
        float f4 = this.f9548H;
        rectF4.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }
}
