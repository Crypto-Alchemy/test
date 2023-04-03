package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.github.mikephil.charting.utils.Utils;

public class MotionButton extends AppCompatButton {

    /* renamed from: g */
    public float f2994g = Utils.FLOAT_EPSILON;

    /* renamed from: k */
    public float f2995k = Float.NaN;

    /* renamed from: r */
    public Path f2996r;

    /* renamed from: s */
    public ViewOutlineProvider f2997s;

    /* renamed from: x */
    public RectF f2998x;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    public class C0524a extends ViewOutlineProvider {
        public C0524a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f2994g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    public class C0525b extends ViewOutlineProvider {
        public C0525b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2995k);
        }
    }

    public MotionButton(Context context) {
        super(context);
        mo4972c(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public final void mo4972c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2995k;
    }

    public float getRoundPercent() {
        return this.f2994g;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2995k = f;
            float f2 = this.f2994g;
            this.f2994g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2995k != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2995k = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2996r == null) {
                this.f2996r = new Path();
            }
            if (this.f2998x == null) {
                this.f2998x = new RectF();
            }
            if (this.f2997s == null) {
                C0525b bVar = new C0525b();
                this.f2997s = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2998x.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.f2996r.reset();
            Path path = this.f2996r;
            RectF rectF = this.f2998x;
            float f3 = this.f2995k;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f2994g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2994g = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2996r == null) {
                this.f2996r = new Path();
            }
            if (this.f2998x == null) {
                this.f2998x = new RectF();
            }
            if (this.f2997s == null) {
                C0524a aVar = new C0524a();
                this.f2997s = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2994g) / 2.0f;
            this.f2998x.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.f2996r.reset();
            this.f2996r.addRoundRect(this.f2998x, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4972c(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4972c(context, attributeSet);
    }
}
