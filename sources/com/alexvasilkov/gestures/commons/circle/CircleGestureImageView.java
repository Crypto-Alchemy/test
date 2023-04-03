package com.alexvasilkov.gestures.commons.circle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.github.mikephil.charting.utils.Utils;
import p000.sd7;

public class CircleGestureImageView extends GestureImageView {

    /* renamed from: B */
    public static final Matrix f8627B = new Matrix();

    /* renamed from: A */
    public float f8628A;

    /* renamed from: r */
    public final Paint f8629r;

    /* renamed from: s */
    public final RectF f8630s;

    /* renamed from: x */
    public float f8631x;

    /* renamed from: y */
    public boolean f8632y;

    /* renamed from: com.alexvasilkov.gestures.commons.circle.CircleGestureImageView$a */
    public class C1707a implements sd7.C3267e {
        public C1707a() {
        }

        /* renamed from: a */
        public void mo12300a(float f, boolean z) {
            float unused = CircleGestureImageView.this.f8628A = cp3.m14357f(f / CircleGestureImageView.this.getPositionAnimator().mo25758v(), Utils.FLOAT_EPSILON, 1.0f);
        }
    }

    public CircleGestureImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: b */
    public void mo12292b(RectF rectF, float f) {
        if (rectF == null) {
            this.f8630s.setEmpty();
        } else {
            this.f8630s.set(rectF);
        }
        this.f8631x = f;
        mo12296i();
        super.mo12292b(rectF, f);
    }

    public void draw(Canvas canvas) {
        if (this.f8628A == 1.0f || this.f8630s.isEmpty() || this.f8629r.getShader() == null) {
            super.draw(canvas);
            return;
        }
        float width = this.f8630s.width() * 0.5f * (1.0f - this.f8628A);
        float height = this.f8630s.height() * 0.5f * (1.0f - this.f8628A);
        canvas.rotate(this.f8631x, this.f8630s.centerX(), this.f8630s.centerY());
        canvas.drawRoundRect(this.f8630s, width, height, this.f8629r);
        canvas.rotate(-this.f8631x, this.f8630s.centerX(), this.f8630s.centerY());
        if (of2.m23787c()) {
            x21.m29838a(this, canvas);
        }
    }

    /* renamed from: g */
    public Bitmap mo12294g(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        throw new RuntimeException("For better performance only BitmapDrawables are supported, but you can override getBitmapFromDrawable() and build bitmap on your own");
    }

    /* renamed from: h */
    public final void mo12295h() {
        Bitmap bitmap;
        if (this.f8632y) {
            bitmap = mo12294g(getDrawable());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            Paint paint = this.f8629r;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            mo12296i();
        } else {
            this.f8629r.setShader((Shader) null);
        }
        invalidate();
    }

    /* renamed from: i */
    public final void mo12296i() {
        if (!this.f8630s.isEmpty() && this.f8629r.getShader() != null) {
            p86 o = getController().mo12197o();
            Matrix matrix = f8627B;
            o.mo24480d(matrix);
            matrix.postTranslate((float) getPaddingLeft(), (float) getPaddingTop());
            matrix.postRotate(-this.f8631x, this.f8630s.centerX(), this.f8630s.centerY());
            this.f8629r.getShader().setLocalMatrix(matrix);
        }
    }

    public void setCircle(boolean z) {
        this.f8632y = z;
        mo12295h();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mo12295h();
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        mo12296i();
    }

    public CircleGestureImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleGestureImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8629r = new Paint(3);
        this.f8630s = new RectF();
        this.f8632y = true;
        getPositionAnimator().mo25751m(new C1707a());
    }
}
