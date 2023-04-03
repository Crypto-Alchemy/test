package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;

/* renamed from: lh3 */
/* compiled from: LinearDrawingDelegate */
public final class lh3 extends fk1<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    public float f31319c = 300.0f;

    /* renamed from: d */
    public float f31320d;

    /* renamed from: e */
    public float f31321e;

    public lh3(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: h */
    public static void m47815h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = f;
        float f5 = f2;
        canvas.save();
        float f6 = f3;
        canvas.translate(f3, Utils.FLOAT_EPSILON);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f7 = ((-f4) / 2.0f) + f5;
        float f8 = (f4 / 2.0f) - f5;
        Canvas canvas3 = canvas;
        Paint paint2 = paint;
        canvas3.drawRect(-f5, f7, Utils.FLOAT_EPSILON, f8, paint2);
        canvas.save();
        canvas.translate(Utils.FLOAT_EPSILON, f7);
        RectF rectF2 = rectF;
        canvas3.drawArc(rectF2, 180.0f, 90.0f, true, paint2);
        canvas.restore();
        canvas.translate(Utils.FLOAT_EPSILON, f8);
        canvas3.drawArc(rectF2, 180.0f, -90.0f, true, paint2);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo42603a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f31319c = (float) clipBounds.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f28889a).f29758a;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(Utils.FLOAT_EPSILON, ((float) (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f28889a).f29758a)) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f28889a).f24190i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f28890b.mo42567j() && ((LinearProgressIndicatorSpec) this.f28889a).f29762e == 1) || (this.f28890b.mo42565i() && ((LinearProgressIndicatorSpec) this.f28889a).f29763f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f28890b.mo42567j() || this.f28890b.mo42565i()) {
            canvas.translate(Utils.FLOAT_EPSILON, (((float) ((LinearProgressIndicatorSpec) this.f28889a).f29758a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f31319c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f28889a;
        this.f31320d = ((float) ((LinearProgressIndicatorSpec) s).f29758a) * f;
        this.f31321e = ((float) ((LinearProgressIndicatorSpec) s).f29759b) * f;
    }

    /* renamed from: b */
    public void mo42604b(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            float f3 = this.f31319c;
            float f4 = this.f31321e;
            float f5 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f);
            float f6 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f2);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.f31320d;
            canvas.drawRect(f5, (-f7) / 2.0f, f6, f7 / 2.0f, paint);
            float f8 = this.f31321e;
            RectF rectF = new RectF(-f8, -f8, f8, f8);
            Canvas canvas2 = canvas;
            Paint paint3 = paint;
            float f9 = f5;
            RectF rectF2 = rectF;
            m47815h(canvas2, paint3, this.f31320d, this.f31321e, f9, true, rectF2);
            m47815h(canvas2, paint3, this.f31320d, this.f31321e, f6, false, rectF2);
        }
    }

    /* renamed from: c */
    public void mo42605c(Canvas canvas, Paint paint) {
        int a = ro3.m51195a(((LinearProgressIndicatorSpec) this.f28889a).f29761d, this.f28890b.getAlpha());
        float f = ((-this.f31319c) / 2.0f) + this.f31321e;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f3 = this.f31320d;
        canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.f31321e;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        m47815h(canvas, paint, this.f31320d, this.f31321e, f, true, rectF);
        m47815h(canvas, paint, this.f31320d, this.f31321e, f2, false, rectF);
    }

    /* renamed from: d */
    public int mo42606d() {
        return ((LinearProgressIndicatorSpec) this.f28889a).f29758a;
    }

    /* renamed from: e */
    public int mo42607e() {
        return -1;
    }
}
