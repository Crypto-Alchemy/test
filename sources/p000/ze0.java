package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* renamed from: ze0 */
/* compiled from: CircularDrawingDelegate */
public final class ze0 extends fk1<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    public int f36127c = 1;

    /* renamed from: d */
    public float f36128d;

    /* renamed from: e */
    public float f36129e;

    /* renamed from: f */
    public float f36130f;

    public ze0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: a */
    public void mo42603a(Canvas canvas, float f) {
        int i;
        S s = this.f28889a;
        float f2 = (((float) ((CircularProgressIndicatorSpec) s).f24184g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f24185h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f28889a;
        if (((CircularProgressIndicatorSpec) s2).f24186i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f36127c = i;
        this.f36128d = ((float) ((CircularProgressIndicatorSpec) s2).f29758a) * f;
        this.f36129e = ((float) ((CircularProgressIndicatorSpec) s2).f29759b) * f;
        this.f36130f = ((float) (((CircularProgressIndicatorSpec) s2).f24184g - ((CircularProgressIndicatorSpec) s2).f29758a)) / 2.0f;
        if ((this.f28890b.mo42567j() && ((CircularProgressIndicatorSpec) this.f28889a).f29762e == 2) || (this.f28890b.mo42565i() && ((CircularProgressIndicatorSpec) this.f28889a).f29763f == 1)) {
            this.f36130f += ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f28889a).f29758a)) / 2.0f;
        } else if ((this.f28890b.mo42567j() && ((CircularProgressIndicatorSpec) this.f28889a).f29762e == 1) || (this.f28890b.mo42565i() && ((CircularProgressIndicatorSpec) this.f28889a).f29763f == 2)) {
            this.f36130f -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f28889a).f29758a)) / 2.0f;
        }
    }

    /* renamed from: b */
    public void mo42604b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f36128d);
            int i2 = this.f36127c;
            float f4 = f * 360.0f * ((float) i2);
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (f2 + 1.0f) - f;
            }
            float f5 = f3 * 360.0f * ((float) i2);
            float f6 = this.f36130f;
            canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
            if (this.f36129e > Utils.FLOAT_EPSILON && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f7 = this.f36129e;
                RectF rectF = new RectF(-f7, -f7, f7, f7);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                RectF rectF2 = rectF;
                mo49827h(canvas2, paint3, this.f36128d, this.f36129e, f4, true, rectF2);
                mo49827h(canvas2, paint3, this.f36128d, this.f36129e, f4 + f5, false, rectF2);
            }
        }
    }

    /* renamed from: c */
    public void mo42605c(Canvas canvas, Paint paint) {
        int a = ro3.m51195a(((CircularProgressIndicatorSpec) this.f28889a).f29761d, this.f28890b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f36128d);
        float f = this.f36130f;
        canvas.drawArc(new RectF(-f, -f, f, f), Utils.FLOAT_EPSILON, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo42606d() {
        return mo49828i();
    }

    /* renamed from: e */
    public int mo42607e() {
        return mo49828i();
    }

    /* renamed from: h */
    public final void mo49827h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        float f4;
        Canvas canvas2 = canvas;
        if (z) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        float f5 = f4;
        canvas.save();
        canvas.rotate(f3);
        float f6 = f / 2.0f;
        float f7 = (this.f36130f - f6) + f2;
        float f8 = f5 * f2;
        float max = Math.max(Utils.FLOAT_EPSILON, f8 * ((float) this.f36127c));
        Paint paint2 = paint;
        canvas.drawRect(f7, Math.min(Utils.FLOAT_EPSILON, ((float) this.f36127c) * f8), (this.f36130f + f6) - f2, max, paint2);
        canvas.translate((this.f36130f - f6) + f2, Utils.FLOAT_EPSILON);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f5) * 90.0f * ((float) this.f36127c), true, paint2);
        canvas.translate(f - (f2 * 2.0f), Utils.FLOAT_EPSILON);
        canvas.drawArc(rectF2, Utils.FLOAT_EPSILON, f5 * 90.0f * ((float) this.f36127c), true, paint2);
        canvas.restore();
    }

    /* renamed from: i */
    public final int mo49828i() {
        S s = this.f28889a;
        return ((CircularProgressIndicatorSpec) s).f24184g + (((CircularProgressIndicatorSpec) s).f24185h * 2);
    }
}
