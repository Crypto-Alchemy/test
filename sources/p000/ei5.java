package p000;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: ei5 */
/* compiled from: RoundedColorDrawable */
public class ei5 extends Drawable implements ci5 {

    /* renamed from: A */
    public boolean f11159A = false;

    /* renamed from: B */
    public final Path f11160B = new Path();

    /* renamed from: C */
    public final Path f11161C = new Path();

    /* renamed from: H */
    public int f11162H = 0;

    /* renamed from: I */
    public final RectF f11163I = new RectF();

    /* renamed from: L */
    public int f11164L = 255;

    /* renamed from: a */
    public final float[] f11165a = new float[8];

    /* renamed from: d */
    public final float[] f11166d = new float[8];

    /* renamed from: e */
    public float[] f11167e;

    /* renamed from: g */
    public final Paint f11168g = new Paint(1);

    /* renamed from: k */
    public boolean f11169k = false;

    /* renamed from: r */
    public float f11170r = Utils.FLOAT_EPSILON;

    /* renamed from: s */
    public float f11171s = Utils.FLOAT_EPSILON;

    /* renamed from: x */
    public int f11172x = 0;

    /* renamed from: y */
    public boolean f11173y = false;

    public ei5(int i) {
        mo19248f(i);
    }

    @TargetApi(11)
    /* renamed from: c */
    public static ei5 m16105c(ColorDrawable colorDrawable) {
        return new ei5(colorDrawable.getColor());
    }

    /* renamed from: a */
    public void mo12062a(int i, float f) {
        if (this.f11172x != i) {
            this.f11172x = i;
            invalidateSelf();
        }
        if (this.f11170r != f) {
            this.f11170r = f;
            mo19251i();
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo12063b(boolean z) {
        this.f11169k = z;
        mo19251i();
        invalidateSelf();
    }

    /* renamed from: d */
    public boolean mo19246d() {
        return this.f11159A;
    }

    public void draw(Canvas canvas) {
        this.f11168g.setColor(uj1.m28303c(this.f11162H, this.f11164L));
        this.f11168g.setStyle(Paint.Style.FILL);
        this.f11168g.setFilterBitmap(mo19246d());
        canvas.drawPath(this.f11160B, this.f11168g);
        if (this.f11170r != Utils.FLOAT_EPSILON) {
            this.f11168g.setColor(uj1.m28303c(this.f11172x, this.f11164L));
            this.f11168g.setStyle(Paint.Style.STROKE);
            this.f11168g.setStrokeWidth(this.f11170r);
            canvas.drawPath(this.f11161C, this.f11168g);
        }
    }

    /* renamed from: e */
    public void mo12064e(float f) {
        if (this.f11171s != f) {
            this.f11171s = f;
            mo19251i();
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo19248f(int i) {
        if (this.f11162H != i) {
            this.f11162H = i;
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public void mo12065g(boolean z) {
        if (this.f11159A != z) {
            this.f11159A = z;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f11164L;
    }

    public int getOpacity() {
        return uj1.m28302b(uj1.m28303c(this.f11162H, this.f11164L));
    }

    /* renamed from: h */
    public void mo12066h(boolean z) {
        if (this.f11173y != z) {
            this.f11173y = z;
            mo19251i();
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public final void mo19251i() {
        float f;
        float[] fArr;
        float[] fArr2;
        this.f11160B.reset();
        this.f11161C.reset();
        this.f11163I.set(getBounds());
        RectF rectF = this.f11163I;
        float f2 = this.f11170r;
        rectF.inset(f2 / 2.0f, f2 / 2.0f);
        int i = 0;
        if (this.f11169k) {
            this.f11161C.addCircle(this.f11163I.centerX(), this.f11163I.centerY(), Math.min(this.f11163I.width(), this.f11163I.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.f11166d;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (this.f11165a[i2] + this.f11171s) - (this.f11170r / 2.0f);
                i2++;
            }
            this.f11161C.addRoundRect(this.f11163I, fArr2, Path.Direction.CW);
        }
        RectF rectF2 = this.f11163I;
        float f3 = this.f11170r;
        rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
        float f4 = this.f11171s;
        if (this.f11173y) {
            f = this.f11170r;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        float f5 = f4 + f;
        this.f11163I.inset(f5, f5);
        if (this.f11169k) {
            this.f11160B.addCircle(this.f11163I.centerX(), this.f11163I.centerY(), Math.min(this.f11163I.width(), this.f11163I.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f11173y) {
            if (this.f11167e == null) {
                this.f11167e = new float[8];
            }
            while (true) {
                fArr = this.f11167e;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = this.f11165a[i] - this.f11170r;
                i++;
            }
            this.f11160B.addRoundRect(this.f11163I, fArr, Path.Direction.CW);
        } else {
            this.f11160B.addRoundRect(this.f11163I, this.f11165a, Path.Direction.CW);
        }
        float f6 = -f5;
        this.f11163I.inset(f6, f6);
    }

    /* renamed from: l */
    public void mo12067l(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f11165a, Utils.FLOAT_EPSILON);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            au4.m10788c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f11165a, 0, 8);
        }
        mo19251i();
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo19251i();
    }

    public void setAlpha(int i) {
        if (i != this.f11164L) {
            this.f11164L = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
