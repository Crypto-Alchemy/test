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
import android.view.View;
import android.widget.ImageView;

public class CircleImageView extends ImageView {

    /* renamed from: g */
    public static final Matrix f8634g = new Matrix();

    /* renamed from: a */
    public Paint f8635a;

    /* renamed from: d */
    public RectF f8636d;

    /* renamed from: e */
    public boolean f8637e;

    public CircleImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public Bitmap mo12301a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        throw new RuntimeException("For better performance only BitmapDrawables are supported, but you can override getBitmapFromDrawable() and build bitmap on your own");
    }

    /* renamed from: b */
    public final void mo12302b() {
        if (this.f8635a == null) {
            this.f8635a = new Paint(3);
            this.f8636d = new RectF();
            this.f8637e = true;
        }
    }

    /* renamed from: c */
    public final void mo12303c() {
        Bitmap bitmap;
        mo12302b();
        if (this.f8637e) {
            bitmap = mo12301a(getDrawable());
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            Matrix matrix = f8634g;
            matrix.set(getImageMatrix());
            matrix.postTranslate((float) getPaddingLeft(), (float) getPaddingTop());
            bitmapShader.setLocalMatrix(matrix);
            this.f8635a.setShader(bitmapShader);
        } else {
            this.f8635a.setShader((Shader) null);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        mo12302b();
        if (this.f8635a.getShader() == null) {
            super.onDraw(canvas);
            return;
        }
        canvas.drawRoundRect(this.f8636d, this.f8636d.width() * 0.5f, this.f8636d.height() * 0.5f, this.f8635a);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
    }

    public void setCircle(boolean z) {
        this.f8637e = z;
        mo12303c();
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        this.f8636d.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
        mo12303c();
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        mo12303c();
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        mo12303c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        mo12303c();
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo12302b();
    }
}
