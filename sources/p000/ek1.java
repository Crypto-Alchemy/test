package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ek1 */
/* compiled from: DrawerArrowDrawable */
public class ek1 extends Drawable {

    /* renamed from: m */
    public static final float f11196m = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public final Paint f11197a;

    /* renamed from: b */
    public float f11198b;

    /* renamed from: c */
    public float f11199c;

    /* renamed from: d */
    public float f11200d;

    /* renamed from: e */
    public float f11201e;

    /* renamed from: f */
    public boolean f11202f;

    /* renamed from: g */
    public final Path f11203g = new Path();

    /* renamed from: h */
    public final int f11204h;

    /* renamed from: i */
    public boolean f11205i = false;

    /* renamed from: j */
    public float f11206j;

    /* renamed from: k */
    public float f11207k;

    /* renamed from: l */
    public int f11208l = 2;

    public ek1(Context context) {
        Paint paint = new Paint();
        this.f11197a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, j65.DrawerArrowToggle, m15.drawerArrowStyle, h55.Base_Widget_AppCompat_DrawerArrowToggle);
        mo19272d(obtainStyledAttributes.getColor(j65.DrawerArrowToggle_color, 0));
        mo19271c(obtainStyledAttributes.getDimension(j65.DrawerArrowToggle_thickness, Utils.FLOAT_EPSILON));
        mo19275f(obtainStyledAttributes.getBoolean(j65.DrawerArrowToggle_spinBars, true));
        mo19274e((float) Math.round(obtainStyledAttributes.getDimension(j65.DrawerArrowToggle_gapBetweenBars, Utils.FLOAT_EPSILON)));
        this.f11204h = obtainStyledAttributes.getDimensionPixelSize(j65.DrawerArrowToggle_drawableSize, 0);
        this.f11199c = (float) Math.round(obtainStyledAttributes.getDimension(j65.DrawerArrowToggle_barLength, Utils.FLOAT_EPSILON));
        this.f11198b = (float) Math.round(obtainStyledAttributes.getDimension(j65.DrawerArrowToggle_arrowHeadLength, Utils.FLOAT_EPSILON));
        this.f11200d = obtainStyledAttributes.getDimension(j65.DrawerArrowToggle_arrowShaftLength, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static float m16141b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public float mo19270a() {
        return this.f11206j;
    }

    /* renamed from: c */
    public void mo19271c(float f) {
        if (this.f11197a.getStrokeWidth() != f) {
            this.f11197a.setStrokeWidth(f);
            this.f11207k = (float) (((double) (f / 2.0f)) * Math.cos((double) f11196m));
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public void mo19272d(int i) {
        if (i != this.f11197a.getColor()) {
            this.f11197a.setColor(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i2 = this.f11208l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? ij1.m19647f(this) == 0 : ij1.m19647f(this) == 1))) {
            z = true;
        }
        float f3 = this.f11198b;
        float b = m16141b(this.f11199c, (float) Math.sqrt((double) (f3 * f3 * 2.0f)), this.f11206j);
        float b2 = m16141b(this.f11199c, this.f11200d, this.f11206j);
        float round = (float) Math.round(m16141b(Utils.FLOAT_EPSILON, this.f11207k, this.f11206j));
        float b3 = m16141b(Utils.FLOAT_EPSILON, f11196m, this.f11206j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float b4 = m16141b(f, f2, this.f11206j);
        double d = (double) b;
        float f4 = b4;
        double d2 = (double) b3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f11203g.rewind();
        float b5 = m16141b(this.f11201e + this.f11197a.getStrokeWidth(), -this.f11207k, this.f11206j);
        float f5 = (-b2) / 2.0f;
        this.f11203g.moveTo(f5 + round, Utils.FLOAT_EPSILON);
        this.f11203g.rLineTo(b2 - (round * 2.0f), Utils.FLOAT_EPSILON);
        this.f11203g.moveTo(f5, b5);
        this.f11203g.rLineTo(round2, round3);
        this.f11203g.moveTo(f5, -b5);
        this.f11203g.rLineTo(round2, -round3);
        this.f11203g.close();
        canvas.save();
        float strokeWidth = this.f11197a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f6 = this.f11201e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f6))) / 4) * 2)) + (strokeWidth * 1.5f) + f6);
        if (this.f11202f) {
            if (this.f11205i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas2.rotate(f4 * ((float) i));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f11203g, this.f11197a);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo19274e(float f) {
        if (f != this.f11201e) {
            this.f11201e = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo19275f(boolean z) {
        if (this.f11202f != z) {
            this.f11202f = z;
            invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.f11204h;
    }

    public int getIntrinsicWidth() {
        return this.f11204h;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        if (i != this.f11197a.getAlpha()) {
            this.f11197a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11197a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.f11206j != f) {
            this.f11206j = f;
            invalidateSelf();
        }
    }
}
