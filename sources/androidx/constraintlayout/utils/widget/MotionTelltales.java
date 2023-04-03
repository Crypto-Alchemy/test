package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;

public class MotionTelltales extends MockView {

    /* renamed from: C */
    public Paint f3050C = new Paint();

    /* renamed from: H */
    public MotionLayout f3051H;

    /* renamed from: I */
    public float[] f3052I = new float[2];

    /* renamed from: L */
    public Matrix f3053L = new Matrix();

    /* renamed from: M */
    public int f3054M = 0;

    /* renamed from: P */
    public int f3055P = -65281;

    /* renamed from: Q */
    public float f3056Q = 0.25f;

    public MotionTelltales(Context context) {
        super(context);
        m4113a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m4113a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.MotionTelltales_telltales_tailColor) {
                    this.f3055P = obtainStyledAttributes.getColor(index, this.f3055P);
                } else if (index == c65.MotionTelltales_telltales_velocityMode) {
                    this.f3054M = obtainStyledAttributes.getInt(index, this.f3054M);
                } else if (index == c65.MotionTelltales_telltales_tailScale) {
                    this.f3056Q = obtainStyledAttributes.getFloat(index, this.f3056Q);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3050C.setColor(this.f3055P);
        this.f3050C.setStrokeWidth(5.0f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f3053L);
        if (this.f3051H == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f3051H = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f3051H.mo4689i0(this, f2, f, this.f3052I, this.f3054M);
                this.f3053L.mapVectors(this.f3052I);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f3052I;
                float f5 = fArr2[0];
                float f6 = this.f3056Q;
                float f7 = f4 - (fArr2[1] * f6);
                this.f3053L.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f3050C);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2990r = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4113a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4113a(context, attributeSet);
    }
}
