package online.osslab;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;

public class CircleProgressBar extends View {

    /* renamed from: a */
    public float f43743a = Utils.FLOAT_EPSILON;

    /* renamed from: d */
    public float f43744d = getResources().getDimension(c25.default_stroke_width);

    /* renamed from: e */
    public float f43745e = getResources().getDimension(c25.default_background_stroke_width);

    /* renamed from: g */
    public int f43746g = -16777216;

    /* renamed from: k */
    public int f43747k = -7829368;

    /* renamed from: r */
    public int f43748r = -90;

    /* renamed from: s */
    public RectF f43749s;

    /* renamed from: x */
    public Paint f43750x;

    /* renamed from: y */
    public Paint f43751y;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo64508a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo64508a(Context context, AttributeSet attributeSet) {
        this.f43749s = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a65.CircleProgressBar, 0, 0);
        try {
            this.f43743a = obtainStyledAttributes.getFloat(a65.CircleProgressBar_progress_value, this.f43743a);
            this.f43744d = obtainStyledAttributes.getDimension(a65.CircleProgressBar_progress_width, this.f43744d);
            this.f43745e = obtainStyledAttributes.getDimension(a65.CircleProgressBar_background_width, this.f43745e);
            this.f43746g = obtainStyledAttributes.getInt(a65.CircleProgressBar_progress_color, this.f43746g);
            this.f43747k = obtainStyledAttributes.getInt(a65.CircleProgressBar_background_color, this.f43747k);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f43750x = paint;
            paint.setColor(this.f43747k);
            this.f43750x.setStyle(Paint.Style.STROKE);
            this.f43750x.setStrokeWidth(this.f43745e);
            Paint paint2 = new Paint(1);
            this.f43751y = paint2;
            paint2.setColor(this.f43746g);
            this.f43751y.setStyle(Paint.Style.STROKE);
            this.f43751y.setStrokeWidth(this.f43744d);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public int getBackgroundColor() {
        return this.f43747k;
    }

    public float getBackgroundProgressBarWidth() {
        return this.f43745e;
    }

    public int getColor() {
        return this.f43746g;
    }

    public float getProgress() {
        return this.f43743a;
    }

    public float getProgressBarWidth() {
        return this.f43744d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f43749s, this.f43750x);
        Canvas canvas2 = canvas;
        canvas2.drawArc(this.f43749s, (float) this.f43748r, (this.f43743a * 360.0f) / 100.0f, false, this.f43751y);
    }

    public void onMeasure(int i, int i2) {
        int min = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
        float f = this.f43744d;
        float f2 = this.f43745e;
        if (f <= f2) {
            f = f2;
        }
        RectF rectF = this.f43749s;
        float f3 = f / 2.0f;
        float f4 = Utils.FLOAT_EPSILON + f3;
        float f5 = ((float) min) - f3;
        rectF.set(f4, f4, f5, f5);
    }

    public void setBackgroundColor(int i) {
        this.f43747k = i;
        this.f43750x.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setBackgroundProgressBarWidth(float f) {
        this.f43745e = f;
        this.f43750x.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public void setColor(int i) {
        this.f43746g = i;
        this.f43751y.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setProgress(float f) {
        if (f > 100.0f) {
            f = 100.0f;
        }
        this.f43743a = f;
        invalidate();
    }

    public void setProgressBarWidth(float f) {
        this.f43744d = f;
        this.f43751y.setStrokeWidth(f);
        requestLayout();
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        setProgressWithAnimation(f, 1500);
    }

    public void setProgressWithAnimation(float f, int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", new float[]{f});
        ofFloat.setDuration((long) i);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.start();
    }
}
