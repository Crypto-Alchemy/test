package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.github.mikephil.charting.utils.Utils;

public class MotionLabel extends View implements r42 {

    /* renamed from: A */
    public float f3001A = 48.0f;

    /* renamed from: A1 */
    public float f3002A1 = Utils.FLOAT_EPSILON;

    /* renamed from: B */
    public float f3003B = Float.NaN;

    /* renamed from: B1 */
    public float f3004B1 = Utils.FLOAT_EPSILON;

    /* renamed from: C */
    public int f3005C;

    /* renamed from: C1 */
    public Paint f3006C1 = new Paint();

    /* renamed from: D1 */
    public int f3007D1 = 0;

    /* renamed from: E1 */
    public Rect f3008E1;

    /* renamed from: F1 */
    public Paint f3009F1;

    /* renamed from: G1 */
    public float f3010G1;

    /* renamed from: H */
    public int f3011H;

    /* renamed from: H1 */
    public float f3012H1 = Float.NaN;

    /* renamed from: I */
    public float f3013I = Utils.FLOAT_EPSILON;

    /* renamed from: I1 */
    public float f3014I1 = Float.NaN;

    /* renamed from: J1 */
    public float f3015J1 = Float.NaN;

    /* renamed from: K1 */
    public float f3016K1 = Float.NaN;

    /* renamed from: L */
    public String f3017L = "Hello World";

    /* renamed from: M */
    public boolean f3018M = true;

    /* renamed from: P */
    public Rect f3019P = new Rect();

    /* renamed from: Q */
    public int f3020Q = 1;

    /* renamed from: U */
    public int f3021U = 1;

    /* renamed from: a */
    public TextPaint f3022a = new TextPaint();

    /* renamed from: b1 */
    public Layout f3023b1;

    /* renamed from: d */
    public Path f3024d = new Path();

    /* renamed from: e */
    public int f3025e = 65535;

    /* renamed from: e0 */
    public int f3026e0 = 1;

    /* renamed from: e1 */
    public int f3027e1 = 8388659;

    /* renamed from: g */
    public int f3028g = 65535;

    /* renamed from: k */
    public boolean f3029k = false;

    /* renamed from: k0 */
    public int f3030k0 = 1;

    /* renamed from: o1 */
    public int f3031o1 = 0;

    /* renamed from: p1 */
    public boolean f3032p1 = false;

    /* renamed from: q1 */
    public float f3033q1;

    /* renamed from: r */
    public float f3034r = Utils.FLOAT_EPSILON;

    /* renamed from: r1 */
    public float f3035r1;

    /* renamed from: s */
    public float f3036s = Float.NaN;

    /* renamed from: s1 */
    public float f3037s1;

    /* renamed from: t1 */
    public Drawable f3038t1;

    /* renamed from: u1 */
    public Matrix f3039u1;

    /* renamed from: v0 */
    public String f3040v0;

    /* renamed from: v1 */
    public Bitmap f3041v1;

    /* renamed from: w1 */
    public BitmapShader f3042w1;

    /* renamed from: x */
    public ViewOutlineProvider f3043x;

    /* renamed from: x1 */
    public Matrix f3044x1;

    /* renamed from: y */
    public RectF f3045y;

    /* renamed from: y1 */
    public float f3046y1 = Float.NaN;

    /* renamed from: z1 */
    public float f3047z1 = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    public class C0526a extends ViewOutlineProvider {
        public C0526a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f3034r) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    public class C0527b extends ViewOutlineProvider {
        public C0527b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f3036s);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        mo4984g(context, (AttributeSet) null);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f3003B)) {
            f = 1.0f;
        } else {
            f = this.f3001A / this.f3003B;
        }
        TextPaint textPaint = this.f3022a;
        String str = this.f3017L;
        float measureText = f * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.f3035r1)) {
            f2 = (float) getMeasuredWidth();
        } else {
            f2 = this.f3035r1;
        }
        return ((((f2 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - measureText) * (this.f3002A1 + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f3003B)) {
            f = 1.0f;
        } else {
            f = this.f3001A / this.f3003B;
        }
        Paint.FontMetrics fontMetrics = this.f3022a.getFontMetrics();
        if (Float.isNaN(this.f3037s1)) {
            f2 = (float) getMeasuredHeight();
        } else {
            f2 = this.f3037s1;
        }
        float paddingTop = (f2 - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((paddingTop - ((f3 - f4) * f)) * (1.0f - this.f3004B1)) / 2.0f) - (f * f4);
    }

    /* renamed from: a */
    public void mo4980a(float f, float f2, float f3, float f4) {
        float f5;
        int i = (int) (f + 0.5f);
        this.f3033q1 = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f6 = f3 - f;
        this.f3035r1 = f6;
        float f7 = f4 - f2;
        this.f3037s1 = f7;
        mo4981d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f3032p1) {
            if (this.f3008E1 == null) {
                this.f3009F1 = new Paint();
                this.f3008E1 = new Rect();
                this.f3009F1.set(this.f3022a);
                this.f3010G1 = this.f3009F1.getTextSize();
            }
            this.f3035r1 = f6;
            this.f3037s1 = f7;
            Paint paint = this.f3009F1;
            String str = this.f3017L;
            paint.getTextBounds(str, 0, str.length(), this.f3008E1);
            int width = this.f3008E1.width();
            float height = ((float) this.f3008E1.height()) * 1.3f;
            float f8 = (f6 - ((float) this.f3021U)) - ((float) this.f3020Q);
            float f9 = (f7 - ((float) this.f3030k0)) - ((float) this.f3026e0);
            float f10 = (float) width;
            if (f10 * f9 > height * f8) {
                this.f3022a.setTextSize((this.f3010G1 * f8) / f10);
            } else {
                this.f3022a.setTextSize((this.f3010G1 * f9) / height);
            }
            if (this.f3029k || !Float.isNaN(this.f3003B)) {
                if (Float.isNaN(this.f3003B)) {
                    f5 = 1.0f;
                } else {
                    f5 = this.f3001A / this.f3003B;
                }
                mo4983f(f5);
            }
        }
    }

    /* renamed from: d */
    public final void mo4981d(float f, float f2, float f3, float f4) {
        if (this.f3044x1 != null) {
            this.f3035r1 = f3 - f;
            this.f3037s1 = f4 - f2;
            mo5002l();
        }
    }

    /* renamed from: e */
    public Bitmap mo4982e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: f */
    public void mo4983f(float f) {
        if (this.f3029k || f != 1.0f) {
            this.f3024d.reset();
            String str = this.f3017L;
            int length = str.length();
            this.f3022a.getTextBounds(str, 0, length, this.f3019P);
            this.f3022a.getTextPath(str, 0, length, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, this.f3024d);
            if (f != 1.0f) {
                StringBuilder sb = new StringBuilder();
                sb.append(t21.m27243a());
                sb.append(" scale ");
                sb.append(f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f3024d.transform(matrix);
            }
            Rect rect = this.f3019P;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f3018M = false;
        }
    }

    /* renamed from: g */
    public final void mo4984g(Context context, AttributeSet attributeSet) {
        mo4999i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == c65.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == c65.MotionLabel_android_fontFamily) {
                    this.f3040v0 = obtainStyledAttributes.getString(index);
                } else if (index == c65.MotionLabel_scaleFromTextSize) {
                    this.f3003B = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f3003B);
                } else if (index == c65.MotionLabel_android_textSize) {
                    this.f3001A = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f3001A);
                } else if (index == c65.MotionLabel_android_textStyle) {
                    this.f3005C = obtainStyledAttributes.getInt(index, this.f3005C);
                } else if (index == c65.MotionLabel_android_typeface) {
                    this.f3011H = obtainStyledAttributes.getInt(index, this.f3011H);
                } else if (index == c65.MotionLabel_android_textColor) {
                    this.f3025e = obtainStyledAttributes.getColor(index, this.f3025e);
                } else if (index == c65.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f3036s);
                    this.f3036s = dimension;
                    setRound(dimension);
                } else if (index == c65.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f3034r);
                    this.f3034r = f;
                    setRoundPercent(f);
                } else if (index == c65.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == c65.MotionLabel_android_autoSizeTextType) {
                    this.f3031o1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == c65.MotionLabel_textOutlineColor) {
                    this.f3028g = obtainStyledAttributes.getInt(index, this.f3028g);
                    this.f3029k = true;
                } else if (index == c65.MotionLabel_textOutlineThickness) {
                    this.f3013I = obtainStyledAttributes.getDimension(index, this.f3013I);
                    this.f3029k = true;
                } else if (index == c65.MotionLabel_textBackground) {
                    this.f3038t1 = obtainStyledAttributes.getDrawable(index);
                    this.f3029k = true;
                } else if (index == c65.MotionLabel_textBackgroundPanX) {
                    this.f3012H1 = obtainStyledAttributes.getFloat(index, this.f3012H1);
                } else if (index == c65.MotionLabel_textBackgroundPanY) {
                    this.f3014I1 = obtainStyledAttributes.getFloat(index, this.f3014I1);
                } else if (index == c65.MotionLabel_textPanX) {
                    this.f3002A1 = obtainStyledAttributes.getFloat(index, this.f3002A1);
                } else if (index == c65.MotionLabel_textPanY) {
                    this.f3004B1 = obtainStyledAttributes.getFloat(index, this.f3004B1);
                } else if (index == c65.MotionLabel_textBackgroundRotate) {
                    this.f3016K1 = obtainStyledAttributes.getFloat(index, this.f3016K1);
                } else if (index == c65.MotionLabel_textBackgroundZoom) {
                    this.f3015J1 = obtainStyledAttributes.getFloat(index, this.f3015J1);
                } else if (index == c65.MotionLabel_textureHeight) {
                    this.f3046y1 = obtainStyledAttributes.getDimension(index, this.f3046y1);
                } else if (index == c65.MotionLabel_textureWidth) {
                    this.f3047z1 = obtainStyledAttributes.getDimension(index, this.f3047z1);
                } else if (index == c65.MotionLabel_textureEffect) {
                    this.f3007D1 = obtainStyledAttributes.getInt(index, this.f3007D1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        mo5001k();
        mo5000j();
    }

    public float getRound() {
        return this.f3036s;
    }

    public float getRoundPercent() {
        return this.f3034r;
    }

    public float getScaleFromTextSize() {
        return this.f3003B;
    }

    public float getTextBackgroundPanX() {
        return this.f3012H1;
    }

    public float getTextBackgroundPanY() {
        return this.f3014I1;
    }

    public float getTextBackgroundRotate() {
        return this.f3016K1;
    }

    public float getTextBackgroundZoom() {
        return this.f3015J1;
    }

    public int getTextOutlineColor() {
        return this.f3028g;
    }

    public float getTextPanX() {
        return this.f3002A1;
    }

    public float getTextPanY() {
        return this.f3004B1;
    }

    public float getTextureHeight() {
        return this.f3046y1;
    }

    public float getTextureWidth() {
        return this.f3047z1;
    }

    public Typeface getTypeface() {
        return this.f3022a.getTypeface();
    }

    /* renamed from: h */
    public final void mo4998h(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        int i3;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = Utils.FLOAT_EPSILON;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i3 = typeface2.getStyle();
            } else {
                i3 = 0;
            }
            int i4 = (~i3) & i2;
            TextPaint textPaint = this.f3022a;
            if ((i4 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f3022a;
            if ((i4 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f3022a.setFakeBoldText(false);
        this.f3022a.setTextSkewX(Utils.FLOAT_EPSILON);
        setTypeface(typeface);
    }

    /* renamed from: i */
    public final void mo4999i(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(m15.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f3022a;
        int i = typedValue.data;
        this.f3025e = i;
        textPaint.setColor(i);
    }

    /* renamed from: j */
    public void mo5000j() {
        this.f3020Q = getPaddingLeft();
        this.f3021U = getPaddingRight();
        this.f3026e0 = getPaddingTop();
        this.f3030k0 = getPaddingBottom();
        mo4998h(this.f3040v0, this.f3011H, this.f3005C);
        this.f3022a.setColor(this.f3025e);
        this.f3022a.setStrokeWidth(this.f3013I);
        this.f3022a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f3022a.setFlags(128);
        setTextSize(this.f3001A);
        this.f3022a.setAntiAlias(true);
    }

    /* renamed from: k */
    public final void mo5001k() {
        if (this.f3038t1 != null) {
            this.f3044x1 = new Matrix();
            int intrinsicWidth = this.f3038t1.getIntrinsicWidth();
            int intrinsicHeight = this.f3038t1.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f3047z1)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.f3047z1;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f3046y1)) {
                    i = (int) this.f3046y1;
                }
                intrinsicHeight = i;
            }
            if (this.f3007D1 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f3041v1 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f3041v1);
            this.f3038t1.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f3038t1.setFilterBitmap(true);
            this.f3038t1.draw(canvas);
            if (this.f3007D1 != 0) {
                this.f3041v1 = mo4982e(this.f3041v1, 4);
            }
            Bitmap bitmap = this.f3041v1;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f3042w1 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: l */
    public final void mo5002l() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean isNaN = Float.isNaN(this.f3012H1);
        float f7 = Utils.FLOAT_EPSILON;
        if (isNaN) {
            f = 0.0f;
        } else {
            f = this.f3012H1;
        }
        if (Float.isNaN(this.f3014I1)) {
            f2 = 0.0f;
        } else {
            f2 = this.f3014I1;
        }
        if (Float.isNaN(this.f3015J1)) {
            f3 = 1.0f;
        } else {
            f3 = this.f3015J1;
        }
        if (!Float.isNaN(this.f3016K1)) {
            f7 = this.f3016K1;
        }
        this.f3044x1.reset();
        float width = (float) this.f3041v1.getWidth();
        float height = (float) this.f3041v1.getHeight();
        if (Float.isNaN(this.f3047z1)) {
            f4 = this.f3035r1;
        } else {
            f4 = this.f3047z1;
        }
        if (Float.isNaN(this.f3046y1)) {
            f5 = this.f3037s1;
        } else {
            f5 = this.f3046y1;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f3044x1.postScale(f8, f8);
        float f9 = width * f8;
        float f10 = f4 - f9;
        float f11 = f8 * height;
        float f12 = f5 - f11;
        if (!Float.isNaN(this.f3046y1)) {
            f12 = this.f3046y1 / 2.0f;
        }
        if (!Float.isNaN(this.f3047z1)) {
            f10 = this.f3047z1 / 2.0f;
        }
        this.f3044x1.postTranslate((((f * f10) + f4) - f9) * 0.5f, (((f2 * f12) + f5) - f11) * 0.5f);
        this.f3044x1.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f3042w1.setLocalMatrix(this.f3044x1);
    }

    public void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f3003B);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f3001A / this.f3003B;
        }
        this.f3035r1 = (float) (i3 - i);
        this.f3037s1 = (float) (i4 - i2);
        if (this.f3032p1) {
            if (this.f3008E1 == null) {
                this.f3009F1 = new Paint();
                this.f3008E1 = new Rect();
                this.f3009F1.set(this.f3022a);
                this.f3010G1 = this.f3009F1.getTextSize();
            }
            Paint paint = this.f3009F1;
            String str = this.f3017L;
            paint.getTextBounds(str, 0, str.length(), this.f3008E1);
            int width = this.f3008E1.width();
            int height = (int) (((float) this.f3008E1.height()) * 1.3f);
            float f2 = (this.f3035r1 - ((float) this.f3021U)) - ((float) this.f3020Q);
            float f3 = (this.f3037s1 - ((float) this.f3030k0)) - ((float) this.f3026e0);
            if (isNaN) {
                float f4 = (float) width;
                float f5 = (float) height;
                if (f4 * f3 > f5 * f2) {
                    this.f3022a.setTextSize((this.f3010G1 * f2) / f4);
                } else {
                    this.f3022a.setTextSize((this.f3010G1 * f3) / f5);
                }
            } else {
                float f6 = (float) width;
                float f7 = (float) height;
                if (f6 * f3 > f7 * f2) {
                    f = f2 / f6;
                } else {
                    f = f3 / f7;
                }
            }
        }
        if (this.f3029k || !isNaN) {
            mo4981d((float) i, (float) i2, (float) i3, (float) i4);
            mo4983f(f);
        }
    }

    public void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f3003B)) {
            f = 1.0f;
        } else {
            f = this.f3001A / this.f3003B;
        }
        super.onDraw(canvas);
        if (this.f3029k || f != 1.0f) {
            if (this.f3018M) {
                mo4983f(f);
            }
            if (this.f3039u1 == null) {
                this.f3039u1 = new Matrix();
            }
            if (this.f3029k) {
                this.f3006C1.set(this.f3022a);
                this.f3039u1.reset();
                float horizontalOffset = ((float) this.f3020Q) + getHorizontalOffset();
                float verticalOffset = ((float) this.f3026e0) + getVerticalOffset();
                this.f3039u1.postTranslate(horizontalOffset, verticalOffset);
                this.f3039u1.preScale(f, f);
                this.f3024d.transform(this.f3039u1);
                if (this.f3042w1 != null) {
                    this.f3022a.setFilterBitmap(true);
                    this.f3022a.setShader(this.f3042w1);
                } else {
                    this.f3022a.setColor(this.f3025e);
                }
                this.f3022a.setStyle(Paint.Style.FILL);
                this.f3022a.setStrokeWidth(this.f3013I);
                canvas.drawPath(this.f3024d, this.f3022a);
                if (this.f3042w1 != null) {
                    this.f3022a.setShader((Shader) null);
                }
                this.f3022a.setColor(this.f3028g);
                this.f3022a.setStyle(Paint.Style.STROKE);
                this.f3022a.setStrokeWidth(this.f3013I);
                canvas.drawPath(this.f3024d, this.f3022a);
                this.f3039u1.reset();
                this.f3039u1.postTranslate(-horizontalOffset, -verticalOffset);
                this.f3024d.transform(this.f3039u1);
                this.f3022a.set(this.f3006C1);
                return;
            }
            float horizontalOffset2 = ((float) this.f3020Q) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.f3026e0) + getVerticalOffset();
            this.f3039u1.reset();
            this.f3039u1.preTranslate(horizontalOffset2, verticalOffset2);
            this.f3024d.transform(this.f3039u1);
            this.f3022a.setColor(this.f3025e);
            this.f3022a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f3022a.setStrokeWidth(this.f3013I);
            canvas.drawPath(this.f3024d, this.f3022a);
            this.f3039u1.reset();
            this.f3039u1.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f3024d.transform(this.f3039u1);
            return;
        }
        canvas.drawText(this.f3017L, this.f3033q1 + ((float) this.f3020Q) + getHorizontalOffset(), ((float) this.f3026e0) + getVerticalOffset(), this.f3022a);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f3032p1 = false;
        this.f3020Q = getPaddingLeft();
        this.f3021U = getPaddingRight();
        this.f3026e0 = getPaddingTop();
        this.f3030k0 = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f3022a;
            String str = this.f3017L;
            textPaint.getTextBounds(str, 0, str.length(), this.f3019P);
            if (mode != 1073741824) {
                size = (int) (((float) this.f3019P.width()) + 0.99999f);
            }
            size += this.f3020Q + this.f3021U;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f3022a.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f3026e0 + this.f3030k0 + fontMetricsInt;
            }
        } else if (this.f3031o1 != 0) {
            this.f3032p1 = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f3027e1) {
            invalidate();
        }
        this.f3027e1 = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f3004B1 = -1.0f;
        } else if (i2 != 80) {
            this.f3004B1 = Utils.FLOAT_EPSILON;
        } else {
            this.f3004B1 = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f3002A1 = Utils.FLOAT_EPSILON;
                        return;
                    }
                }
            }
            this.f3002A1 = 1.0f;
            return;
        }
        this.f3002A1 = -1.0f;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f3036s = f;
            float f2 = this.f3034r;
            this.f3034r = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f3036s != f) {
            z = true;
        } else {
            z = false;
        }
        this.f3036s = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f3024d == null) {
                this.f3024d = new Path();
            }
            if (this.f3045y == null) {
                this.f3045y = new RectF();
            }
            if (this.f3043x == null) {
                C0527b bVar = new C0527b();
                this.f3043x = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f3045y.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) getWidth(), (float) getHeight());
            this.f3024d.reset();
            Path path = this.f3024d;
            RectF rectF = this.f3045y;
            float f3 = this.f3036s;
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
        if (this.f3034r != f) {
            z = true;
        } else {
            z = false;
        }
        this.f3034r = f;
        if (f != Utils.FLOAT_EPSILON) {
            if (this.f3024d == null) {
                this.f3024d = new Path();
            }
            if (this.f3045y == null) {
                this.f3045y = new RectF();
            }
            if (this.f3043x == null) {
                C0526a aVar = new C0526a();
                this.f3043x = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f3034r) / 2.0f;
            this.f3045y.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) width, (float) height);
            this.f3024d.reset();
            this.f3024d.addRoundRect(this.f3045y, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f3003B = f;
    }

    public void setText(CharSequence charSequence) {
        this.f3017L = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f3012H1 = f;
        mo5002l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f3014I1 = f;
        mo5002l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f3016K1 = f;
        mo5002l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f3015J1 = f;
        mo5002l();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f3025e = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f3028g = i;
        this.f3029k = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f3013I = f;
        this.f3029k = true;
        if (Float.isNaN(f)) {
            this.f3013I = 1.0f;
            this.f3029k = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f3002A1 = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f3004B1 = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f3001A = f;
        StringBuilder sb = new StringBuilder();
        sb.append(t21.m27243a());
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(this.f3003B);
        TextPaint textPaint = this.f3022a;
        if (!Float.isNaN(this.f3003B)) {
            f = this.f3003B;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f3003B)) {
            f2 = 1.0f;
        } else {
            f2 = this.f3001A / this.f3003B;
        }
        mo4983f(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f3046y1 = f;
        mo5002l();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f3047z1 = f;
        mo5002l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f3022a.getTypeface() != typeface) {
            this.f3022a.setTypeface(typeface);
            if (this.f3023b1 != null) {
                this.f3023b1 = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo4984g(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo4984g(context, attributeSet);
    }
}
