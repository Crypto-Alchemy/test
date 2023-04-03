package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: gi5 */
/* compiled from: RoundedDrawable */
public abstract class gi5 extends Drawable implements ci5, gw6 {

    /* renamed from: A */
    public final float[] f12324A = new float[8];

    /* renamed from: B */
    public float[] f12325B;

    /* renamed from: C */
    public final RectF f12326C = new RectF();

    /* renamed from: H */
    public final RectF f12327H = new RectF();

    /* renamed from: I */
    public final RectF f12328I = new RectF();

    /* renamed from: L */
    public final RectF f12329L = new RectF();

    /* renamed from: M */
    public RectF f12330M;

    /* renamed from: P */
    public final Matrix f12331P = new Matrix();

    /* renamed from: Q */
    public final Matrix f12332Q = new Matrix();

    /* renamed from: U */
    public final Matrix f12333U = new Matrix();

    /* renamed from: X */
    public final Matrix f12334X = new Matrix();

    /* renamed from: Y */
    public final Matrix f12335Y = new Matrix();

    /* renamed from: Z */
    public Matrix f12336Z;

    /* renamed from: a */
    public final Drawable f12337a;

    /* renamed from: b1 */
    public boolean f12338b1 = false;

    /* renamed from: d */
    public boolean f12339d = false;

    /* renamed from: e */
    public boolean f12340e = false;

    /* renamed from: e0 */
    public Matrix f12341e0;

    /* renamed from: e1 */
    public boolean f12342e1 = false;

    /* renamed from: g */
    public float f12343g = Utils.FLOAT_EPSILON;

    /* renamed from: k */
    public final Path f12344k = new Path();

    /* renamed from: k0 */
    public final Matrix f12345k0 = new Matrix();

    /* renamed from: o1 */
    public boolean f12346o1 = true;

    /* renamed from: p1 */
    public hw6 f12347p1;

    /* renamed from: r */
    public boolean f12348r = true;

    /* renamed from: s */
    public int f12349s = 0;

    /* renamed from: v0 */
    public float f12350v0 = Utils.FLOAT_EPSILON;

    /* renamed from: x */
    public final Path f12351x = new Path();

    /* renamed from: y */
    public final float[] f12352y = new float[8];

    public gi5(Drawable drawable) {
        this.f12337a = drawable;
    }

    /* renamed from: a */
    public void mo12062a(int i, float f) {
        if (this.f12349s != i || this.f12343g != f) {
            this.f12349s = i;
            this.f12343g = f;
            this.f12346o1 = true;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo12063b(boolean z) {
        this.f12339d = z;
        this.f12346o1 = true;
        invalidateSelf();
    }

    /* renamed from: c */
    public boolean mo20587c() {
        return this.f12342e1;
    }

    public void clearColorFilter() {
        this.f12337a.clearColorFilter();
    }

    /* renamed from: d */
    public boolean mo18783d() {
        if (this.f12339d || this.f12340e || this.f12343g > Utils.FLOAT_EPSILON) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        if (lc2.m21369d()) {
            lc2.m21366a("RoundedDrawable#draw");
        }
        this.f12337a.draw(canvas);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: e */
    public void mo12064e(float f) {
        if (this.f12350v0 != f) {
            this.f12350v0 = f;
            this.f12346o1 = true;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo20589f(hw6 hw6) {
        this.f12347p1 = hw6;
    }

    /* renamed from: g */
    public void mo12065g(boolean z) {
        if (this.f12342e1 != z) {
            this.f12342e1 = z;
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.f12337a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f12337a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f12337a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f12337a.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f12337a.getOpacity();
    }

    /* renamed from: h */
    public void mo12066h(boolean z) {
        if (this.f12338b1 != z) {
            this.f12338b1 = z;
            this.f12346o1 = true;
            invalidateSelf();
        }
    }

    /* renamed from: i */
    public void mo20595i() {
        float f;
        float[] fArr;
        if (this.f12346o1) {
            this.f12351x.reset();
            RectF rectF = this.f12326C;
            float f2 = this.f12343g;
            rectF.inset(f2 / 2.0f, f2 / 2.0f);
            if (this.f12339d) {
                this.f12351x.addCircle(this.f12326C.centerX(), this.f12326C.centerY(), Math.min(this.f12326C.width(), this.f12326C.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f12324A;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.f12352y[i] + this.f12350v0) - (this.f12343g / 2.0f);
                    i++;
                }
                this.f12351x.addRoundRect(this.f12326C, fArr, Path.Direction.CW);
            }
            RectF rectF2 = this.f12326C;
            float f3 = this.f12343g;
            rectF2.inset((-f3) / 2.0f, (-f3) / 2.0f);
            this.f12344k.reset();
            float f4 = this.f12350v0;
            if (this.f12338b1) {
                f = this.f12343g;
            } else {
                f = Utils.FLOAT_EPSILON;
            }
            float f5 = f4 + f;
            this.f12326C.inset(f5, f5);
            if (this.f12339d) {
                this.f12344k.addCircle(this.f12326C.centerX(), this.f12326C.centerY(), Math.min(this.f12326C.width(), this.f12326C.height()) / 2.0f, Path.Direction.CW);
            } else if (this.f12338b1) {
                if (this.f12325B == null) {
                    this.f12325B = new float[8];
                }
                for (int i2 = 0; i2 < this.f12324A.length; i2++) {
                    this.f12325B[i2] = this.f12352y[i2] - this.f12343g;
                }
                this.f12344k.addRoundRect(this.f12326C, this.f12325B, Path.Direction.CW);
            } else {
                this.f12344k.addRoundRect(this.f12326C, this.f12352y, Path.Direction.CW);
            }
            float f6 = -f5;
            this.f12326C.inset(f6, f6);
            this.f12344k.setFillType(Path.FillType.WINDING);
            this.f12346o1 = false;
        }
    }

    /* renamed from: j */
    public void mo20596j() {
        Matrix matrix;
        hw6 hw6 = this.f12347p1;
        if (hw6 != null) {
            hw6.mo11676c(this.f12333U);
            this.f12347p1.mo20771i(this.f12326C);
        } else {
            this.f12333U.reset();
            this.f12326C.set(getBounds());
        }
        this.f12328I.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f12329L.set(this.f12337a.getBounds());
        this.f12331P.setRectToRect(this.f12328I, this.f12329L, Matrix.ScaleToFit.FILL);
        if (this.f12338b1) {
            RectF rectF = this.f12330M;
            if (rectF == null) {
                this.f12330M = new RectF(this.f12326C);
            } else {
                rectF.set(this.f12326C);
            }
            RectF rectF2 = this.f12330M;
            float f = this.f12343g;
            rectF2.inset(f, f);
            if (this.f12336Z == null) {
                this.f12336Z = new Matrix();
            }
            this.f12336Z.setRectToRect(this.f12326C, this.f12330M, Matrix.ScaleToFit.FILL);
        } else {
            Matrix matrix2 = this.f12336Z;
            if (matrix2 != null) {
                matrix2.reset();
            }
        }
        if (!this.f12333U.equals(this.f12334X) || !this.f12331P.equals(this.f12332Q) || ((matrix = this.f12336Z) != null && !matrix.equals(this.f12341e0))) {
            this.f12348r = true;
            this.f12333U.invert(this.f12335Y);
            this.f12345k0.set(this.f12333U);
            if (this.f12338b1) {
                this.f12345k0.postConcat(this.f12336Z);
            }
            this.f12345k0.preConcat(this.f12331P);
            this.f12334X.set(this.f12333U);
            this.f12332Q.set(this.f12331P);
            if (this.f12338b1) {
                Matrix matrix3 = this.f12341e0;
                if (matrix3 == null) {
                    this.f12341e0 = new Matrix(this.f12336Z);
                } else {
                    matrix3.set(this.f12336Z);
                }
            } else {
                Matrix matrix4 = this.f12341e0;
                if (matrix4 != null) {
                    matrix4.reset();
                }
            }
        }
        if (!this.f12326C.equals(this.f12327H)) {
            this.f12346o1 = true;
            this.f12327H.set(this.f12326C);
        }
    }

    /* renamed from: l */
    public void mo12067l(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f12352y, Utils.FLOAT_EPSILON);
            this.f12340e = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            au4.m10788c(z, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f12352y, 0, 8);
            this.f12340e = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.f12340e;
                if (fArr[i] > Utils.FLOAT_EPSILON) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f12340e = z3 | z2;
            }
        }
        this.f12346o1 = true;
        invalidateSelf();
    }

    public void onBoundsChange(Rect rect) {
        this.f12337a.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f12337a.setAlpha(i);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f12337a.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12337a.setColorFilter(colorFilter);
    }
}
