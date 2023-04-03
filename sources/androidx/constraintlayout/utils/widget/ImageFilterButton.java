package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.github.mikephil.charting.utils.Utils;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: A */
    public RectF f2940A;

    /* renamed from: B */
    public Drawable[] f2941B = new Drawable[2];

    /* renamed from: C */
    public LayerDrawable f2942C;

    /* renamed from: H */
    public boolean f2943H = true;

    /* renamed from: I */
    public Drawable f2944I = null;

    /* renamed from: L */
    public Drawable f2945L = null;

    /* renamed from: M */
    public float f2946M = Float.NaN;

    /* renamed from: P */
    public float f2947P = Float.NaN;

    /* renamed from: Q */
    public float f2948Q = Float.NaN;

    /* renamed from: U */
    public float f2949U = Float.NaN;

    /* renamed from: g */
    public ImageFilterView.C0523c f2950g = new ImageFilterView.C0523c();

    /* renamed from: k */
    public float f2951k = Utils.FLOAT_EPSILON;

    /* renamed from: r */
    public float f2952r = Utils.FLOAT_EPSILON;

    /* renamed from: s */
    public float f2953s = Float.NaN;

    /* renamed from: x */
    public Path f2954x;

    /* renamed from: y */
    public ViewOutlineProvider f2955y;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    public class C0519a extends ViewOutlineProvider {
        public C0519a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2952r) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    public class C0520b extends ViewOutlineProvider {
        public C0520b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2953s);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        mo4907c(context, (AttributeSet) null);
    }

    private void setOverlay(boolean z) {
        this.f2943H = z;
    }

    /* renamed from: c */
    public final void mo4907c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2944I = obtainStyledAttributes.getDrawable(c65.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ImageFilterView_crossfade) {
                    this.f2951k = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
                } else if (index == c65.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2943H));
                } else if (index == c65.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2946M));
                } else if (index == c65.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2947P));
                } else if (index == c65.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2949U));
                } else if (index == c65.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2948Q));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2945L = drawable;
            if (this.f2944I == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2945L = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2941B;
                    Drawable mutate = drawable2.mutate();
                    this.f2945L = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2941B;
            Drawable mutate2 = getDrawable().mutate();
            this.f2945L = mutate2;
            drawableArr2[0] = mutate2;
            this.f2941B[1] = this.f2944I.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2941B);
            this.f2942C = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2951k * 255.0f));
            if (!this.f2943H) {
                this.f2942C.getDrawable(0).setAlpha((int) ((1.0f - this.f2951k) * 255.0f));
            }
            super.setImageDrawable(this.f2942C);
        }
    }

    /* renamed from: d */
    public final void mo4908d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f2946M) || !Float.isNaN(this.f2947P) || !Float.isNaN(this.f2948Q) || !Float.isNaN(this.f2949U)) {
            boolean isNaN = Float.isNaN(this.f2946M);
            float f5 = Utils.FLOAT_EPSILON;
            if (isNaN) {
                f = 0.0f;
            } else {
                f = this.f2946M;
            }
            if (Float.isNaN(this.f2947P)) {
                f2 = 0.0f;
            } else {
                f2 = this.f2947P;
            }
            if (Float.isNaN(this.f2948Q)) {
                f3 = 1.0f;
            } else {
                f3 = this.f2948Q;
            }
            if (!Float.isNaN(this.f2949U)) {
                f5 = this.f2949U;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f4 = width / intrinsicWidth;
            } else {
                f4 = height / intrinsicHeight;
            }
            float f6 = f3 * f4;
            matrix.postScale(f6, f6);
            float f7 = intrinsicWidth * f6;
            float f8 = f6 * intrinsicHeight;
            matrix.postTranslate((((f * (width - f7)) + width) - f7) * 0.5f, (((f2 * (height - f8)) + height) - f8) * 0.5f);
            matrix.postRotate(f5, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo4910e() {
        if (!Float.isNaN(this.f2946M) || !Float.isNaN(this.f2947P) || !Float.isNaN(this.f2948Q) || !Float.isNaN(this.f2949U)) {
            mo4908d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getContrast() {
        return this.f2950g.f2981f;
    }

    public float getCrossfade() {
        return this.f2951k;
    }

    public float getImagePanX() {
        return this.f2946M;
    }

    public float getImagePanY() {
        return this.f2947P;
    }

    public float getImageRotate() {
        return this.f2949U;
    }

    public float getImageZoom() {
        return this.f2948Q;
    }

    public float getRound() {
        return this.f2953s;
    }

    public float getRoundPercent() {
        return this.f2952r;
    }

    public float getSaturation() {
        return this.f2950g.f2980e;
    }

    public float getWarmth() {
        return this.f2950g.f2982g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo4908d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C2554in.m19714b(getContext(), i).mutate();
        this.f2944I = mutate;
        Drawable[] drawableArr = this.f2941B;
        drawableArr[0] = this.f2945L;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2941B);
        this.f2942C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2951k);
    }

    public void setBrightness(float f) {
        ImageFilterView.C0523c cVar = this.f2950g;
        cVar.f2979d = f;
        cVar.mo4968c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0523c cVar = this.f2950g;
        cVar.f2981f = f;
        cVar.mo4968c(this);
    }

    public void setCrossfade(float f) {
        this.f2951k = f;
        if (this.f2941B != null) {
            if (!this.f2943H) {
                this.f2942C.getDrawable(0).setAlpha((int) ((1.0f - this.f2951k) * 255.0f));
            }
            this.f2942C.getDrawable(1).setAlpha((int) (this.f2951k * 255.0f));
            super.setImageDrawable(this.f2942C);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2944I == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2945L = mutate;
        Drawable[] drawableArr = this.f2941B;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2944I;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2941B);
        this.f2942C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2951k);
    }

    public void setImagePanX(float f) {
        this.f2946M = f;
        mo4910e();
    }

    public void setImagePanY(float f) {
        this.f2947P = f;
        mo4910e();
    }

    public void setImageResource(int i) {
        if (this.f2944I != null) {
            Drawable mutate = C2554in.m19714b(getContext(), i).mutate();
            this.f2945L = mutate;
            Drawable[] drawableArr = this.f2941B;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2944I;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2941B);
            this.f2942C = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2951k);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2949U = f;
        mo4910e();
    }

    public void setImageZoom(float f) {
        this.f2948Q = f;
        mo4910e();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2953s = f;
            float f2 = this.f2952r;
            this.f2952r = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2953s != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2953s = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2954x == null) {
                this.f2954x = new Path();
            }
            if (this.f2940A == null) {
                this.f2940A = new RectF();
            }
            if (this.f2955y == null) {
                C0520b bVar = new C0520b();
                this.f2955y = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2940A.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.f2954x.reset();
            Path path = this.f2954x;
            RectF rectF = this.f2940A;
            float f3 = this.f2953s;
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
        if (this.f2952r != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2952r = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2954x == null) {
                this.f2954x = new Path();
            }
            if (this.f2940A == null) {
                this.f2940A = new RectF();
            }
            if (this.f2955y == null) {
                C0519a aVar = new C0519a();
                this.f2955y = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2952r) / 2.0f;
            this.f2940A.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.f2954x.reset();
            this.f2954x.addRoundRect(this.f2940A, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C0523c cVar = this.f2950g;
        cVar.f2980e = f;
        cVar.mo4968c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0523c cVar = this.f2950g;
        cVar.f2982g = f;
        cVar.mo4968c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4907c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4907c(context, attributeSet);
    }
}
