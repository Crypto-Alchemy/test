package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: A */
    public RectF f2958A;

    /* renamed from: B */
    public Drawable[] f2959B = new Drawable[2];

    /* renamed from: C */
    public LayerDrawable f2960C;

    /* renamed from: H */
    public float f2961H = Float.NaN;

    /* renamed from: I */
    public float f2962I = Float.NaN;

    /* renamed from: L */
    public float f2963L = Float.NaN;

    /* renamed from: M */
    public float f2964M = Float.NaN;

    /* renamed from: a */
    public C0523c f2965a = new C0523c();

    /* renamed from: d */
    public boolean f2966d = true;

    /* renamed from: e */
    public Drawable f2967e = null;

    /* renamed from: g */
    public Drawable f2968g = null;

    /* renamed from: k */
    public float f2969k = Utils.FLOAT_EPSILON;

    /* renamed from: r */
    public float f2970r = Utils.FLOAT_EPSILON;

    /* renamed from: s */
    public float f2971s = Float.NaN;

    /* renamed from: x */
    public Path f2972x;

    /* renamed from: y */
    public ViewOutlineProvider f2973y;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C0521a extends ViewOutlineProvider {
        public C0521a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2970r) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C0522b extends ViewOutlineProvider {
        public C0522b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2971s);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C0523c {

        /* renamed from: a */
        public float[] f2976a = new float[20];

        /* renamed from: b */
        public ColorMatrix f2977b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f2978c = new ColorMatrix();

        /* renamed from: d */
        public float f2979d = 1.0f;

        /* renamed from: e */
        public float f2980e = 1.0f;

        /* renamed from: f */
        public float f2981f = 1.0f;

        /* renamed from: g */
        public float f2982g = 1.0f;

        /* renamed from: a */
        public final void mo4966a(float f) {
            float[] fArr = this.f2976a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void mo4967b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2976a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void mo4968c(ImageView imageView) {
            boolean z;
            this.f2977b.reset();
            float f = this.f2980e;
            boolean z2 = true;
            if (f != 1.0f) {
                mo4967b(f);
                this.f2977b.set(this.f2976a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f2981f;
            if (f2 != 1.0f) {
                this.f2978c.setScale(f2, f2, f2, 1.0f);
                this.f2977b.postConcat(this.f2978c);
                z = true;
            }
            float f3 = this.f2982g;
            if (f3 != 1.0f) {
                mo4969d(f3);
                this.f2978c.set(this.f2976a);
                this.f2977b.postConcat(this.f2978c);
                z = true;
            }
            float f4 = this.f2979d;
            if (f4 != 1.0f) {
                mo4966a(f4);
                this.f2978c.set(this.f2976a);
                this.f2977b.postConcat(this.f2978c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2977b));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void mo4969d(float f) {
            float f2;
            float f3;
            float f4;
            if (f <= Utils.FLOAT_EPSILON) {
                f = 0.01f;
            }
            float f5 = (5000.0f / f) / 100.0f;
            if (f5 > 66.0f) {
                double d = (double) (f5 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f5)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            if (f5 >= 66.0f) {
                f4 = 255.0f;
            } else if (f5 > 19.0f) {
                f4 = (((float) Math.log((double) (f5 - 10.0f))) * 138.51773f) - 305.0448f;
            } else {
                f4 = 0.0f;
            }
            float min = Math.min(255.0f, Math.max(f3, Utils.FLOAT_EPSILON));
            float min2 = Math.min(255.0f, Math.max(f2, Utils.FLOAT_EPSILON));
            float min3 = Math.min(255.0f, Math.max(f4, Utils.FLOAT_EPSILON));
            float min4 = Math.min(255.0f, Math.max(255.0f, Utils.FLOAT_EPSILON));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, Utils.FLOAT_EPSILON));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, Utils.FLOAT_EPSILON));
            float[] fArr = this.f2976a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        mo4937e(context, (AttributeSet) null);
    }

    private void setOverlay(boolean z) {
        this.f2966d = z;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo4937e(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2967e = obtainStyledAttributes.getDrawable(c65.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.ImageFilterView_crossfade) {
                    this.f2969k = obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON);
                } else if (index == c65.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, Utils.FLOAT_EPSILON));
                } else if (index == c65.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2966d));
                } else if (index == c65.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2961H));
                } else if (index == c65.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2962I));
                } else if (index == c65.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2964M));
                } else if (index == c65.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2963L));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2968g = drawable;
            if (this.f2967e == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2968g = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2959B;
                    Drawable mutate = drawable2.mutate();
                    this.f2968g = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2959B;
            Drawable mutate2 = getDrawable().mutate();
            this.f2968g = mutate2;
            drawableArr2[0] = mutate2;
            this.f2959B[1] = this.f2967e.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2959B);
            this.f2960C = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2969k * 255.0f));
            if (!this.f2966d) {
                this.f2960C.getDrawable(0).setAlpha((int) ((1.0f - this.f2969k) * 255.0f));
            }
            super.setImageDrawable(this.f2960C);
        }
    }

    /* renamed from: f */
    public final void mo4938f() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f2961H) || !Float.isNaN(this.f2962I) || !Float.isNaN(this.f2963L) || !Float.isNaN(this.f2964M)) {
            boolean isNaN = Float.isNaN(this.f2961H);
            float f5 = Utils.FLOAT_EPSILON;
            if (isNaN) {
                f = 0.0f;
            } else {
                f = this.f2961H;
            }
            if (Float.isNaN(this.f2962I)) {
                f2 = 0.0f;
            } else {
                f2 = this.f2962I;
            }
            if (Float.isNaN(this.f2963L)) {
                f3 = 1.0f;
            } else {
                f3 = this.f2963L;
            }
            if (!Float.isNaN(this.f2964M)) {
                f5 = this.f2964M;
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

    /* renamed from: g */
    public final void mo4939g() {
        if (!Float.isNaN(this.f2961H) || !Float.isNaN(this.f2962I) || !Float.isNaN(this.f2963L) || !Float.isNaN(this.f2964M)) {
            mo4938f();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getBrightness() {
        return this.f2965a.f2979d;
    }

    public float getContrast() {
        return this.f2965a.f2981f;
    }

    public float getCrossfade() {
        return this.f2969k;
    }

    public float getImagePanX() {
        return this.f2961H;
    }

    public float getImagePanY() {
        return this.f2962I;
    }

    public float getImageRotate() {
        return this.f2964M;
    }

    public float getImageZoom() {
        return this.f2963L;
    }

    public float getRound() {
        return this.f2971s;
    }

    public float getRoundPercent() {
        return this.f2970r;
    }

    public float getSaturation() {
        return this.f2965a.f2980e;
    }

    public float getWarmth() {
        return this.f2965a.f2982g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo4938f();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C2554in.m19714b(getContext(), i).mutate();
        this.f2967e = mutate;
        Drawable[] drawableArr = this.f2959B;
        drawableArr[0] = this.f2968g;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2959B);
        this.f2960C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2969k);
    }

    public void setBrightness(float f) {
        C0523c cVar = this.f2965a;
        cVar.f2979d = f;
        cVar.mo4968c(this);
    }

    public void setContrast(float f) {
        C0523c cVar = this.f2965a;
        cVar.f2981f = f;
        cVar.mo4968c(this);
    }

    public void setCrossfade(float f) {
        this.f2969k = f;
        if (this.f2959B != null) {
            if (!this.f2966d) {
                this.f2960C.getDrawable(0).setAlpha((int) ((1.0f - this.f2969k) * 255.0f));
            }
            this.f2960C.getDrawable(1).setAlpha((int) (this.f2969k * 255.0f));
            super.setImageDrawable(this.f2960C);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2967e == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2968g = mutate;
        Drawable[] drawableArr = this.f2959B;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2967e;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2959B);
        this.f2960C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2969k);
    }

    public void setImagePanX(float f) {
        this.f2961H = f;
        mo4939g();
    }

    public void setImagePanY(float f) {
        this.f2962I = f;
        mo4939g();
    }

    public void setImageResource(int i) {
        if (this.f2967e != null) {
            Drawable mutate = C2554in.m19714b(getContext(), i).mutate();
            this.f2968g = mutate;
            Drawable[] drawableArr = this.f2959B;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2967e;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2959B);
            this.f2960C = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2969k);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2964M = f;
        mo4939g();
    }

    public void setImageZoom(float f) {
        this.f2963L = f;
        mo4939g();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2971s = f;
            float f2 = this.f2970r;
            this.f2970r = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2971s != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2971s = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2972x == null) {
                this.f2972x = new Path();
            }
            if (this.f2958A == null) {
                this.f2958A = new RectF();
            }
            if (this.f2973y == null) {
                C0522b bVar = new C0522b();
                this.f2973y = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2958A.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.f2972x.reset();
            Path path = this.f2972x;
            RectF rectF = this.f2958A;
            float f3 = this.f2971s;
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
        if (this.f2970r != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2970r = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f2972x == null) {
                this.f2972x = new Path();
            }
            if (this.f2958A == null) {
                this.f2958A = new RectF();
            }
            if (this.f2973y == null) {
                C0521a aVar = new C0521a();
                this.f2973y = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2970r) / 2.0f;
            this.f2958A.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.f2972x.reset();
            this.f2972x.addRoundRect(this.f2958A, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0523c cVar = this.f2965a;
        cVar.f2980e = f;
        cVar.mo4968c(this);
    }

    public void setWarmth(float f) {
        C0523c cVar = this.f2965a;
        cVar.f2982g = f;
        cVar.mo4968c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4937e(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4937e(context, attributeSet);
    }
}
