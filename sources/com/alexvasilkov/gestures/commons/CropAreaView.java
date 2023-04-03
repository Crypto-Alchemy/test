package com.alexvasilkov.gestures.commons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.github.mikephil.charting.utils.Utils;

public class CropAreaView extends View {

    /* renamed from: e0 */
    public static final int f8604e0 = Color.argb(160, 0, 0, 0);

    /* renamed from: k0 */
    public static final Rect f8605k0 = new Rect();

    /* renamed from: v0 */
    public static final RectF f8606v0 = new RectF();

    /* renamed from: A */
    public final t42 f8607A;

    /* renamed from: B */
    public final C3683yk f8608B;

    /* renamed from: C */
    public int f8609C;

    /* renamed from: H */
    public int f8610H;

    /* renamed from: I */
    public float f8611I;

    /* renamed from: L */
    public int f8612L;

    /* renamed from: M */
    public int f8613M;

    /* renamed from: P */
    public float f8614P;

    /* renamed from: Q */
    public float f8615Q;

    /* renamed from: U */
    public GestureImageView f8616U;

    /* renamed from: a */
    public final RectF f8617a;

    /* renamed from: d */
    public float f8618d;

    /* renamed from: e */
    public final RectF f8619e;

    /* renamed from: g */
    public final RectF f8620g;

    /* renamed from: k */
    public final RectF f8621k;

    /* renamed from: r */
    public float f8622r;

    /* renamed from: s */
    public float f8623s;

    /* renamed from: x */
    public final Paint f8624x;

    /* renamed from: y */
    public final Paint f8625y;

    /* renamed from: com.alexvasilkov.gestures.commons.CropAreaView$a */
    public class C1706a extends C3683yk {
        public C1706a() {
            super(CropAreaView.this);
        }

        /* renamed from: a */
        public boolean mo12225a() {
            if (CropAreaView.this.f8607A.mo26051e()) {
                return false;
            }
            CropAreaView.this.f8607A.mo26048a();
            float c = CropAreaView.this.f8607A.mo26050c();
            cp3.m14355d(CropAreaView.this.f8617a, CropAreaView.this.f8620g, CropAreaView.this.f8621k, c);
            float b = cp3.m14353b(CropAreaView.this.f8622r, CropAreaView.this.f8623s, c);
            CropAreaView cropAreaView = CropAreaView.this;
            cropAreaView.mo12280l(cropAreaView.f8617a, b);
            return true;
        }
    }

    public CropAreaView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: h */
    public final void mo12276h(Canvas canvas) {
        this.f8624x.setStyle(Paint.Style.STROKE);
        this.f8624x.setColor(this.f8610H);
        Paint paint = this.f8624x;
        float f = this.f8614P;
        if (f == Utils.FLOAT_EPSILON) {
            f = this.f8611I * 0.5f;
        }
        paint.setStrokeWidth(f);
        float width = this.f8618d * 0.5f * this.f8617a.width();
        float height = this.f8618d * 0.5f * this.f8617a.height();
        int i = 0;
        int i2 = 0;
        while (i2 < this.f8613M) {
            RectF rectF = this.f8617a;
            i2++;
            float width2 = rectF.left + (((float) i2) * (rectF.width() / ((float) (this.f8613M + 1))));
            RectF rectF2 = this.f8617a;
            float k = mo12279k(width2, width, height, rectF2.left, rectF2.right);
            RectF rectF3 = this.f8617a;
            canvas.drawLine(width2, rectF3.top + k, width2, rectF3.bottom - k, this.f8624x);
        }
        while (i < this.f8612L) {
            RectF rectF4 = this.f8617a;
            i++;
            float height2 = rectF4.top + (((float) i) * (rectF4.height() / ((float) (this.f8612L + 1))));
            RectF rectF5 = this.f8617a;
            float k2 = mo12279k(height2, height, width, rectF5.top, rectF5.bottom);
            RectF rectF6 = this.f8617a;
            canvas.drawLine(rectF6.left + k2, height2, rectF6.right - k2, height2, this.f8624x);
        }
        this.f8624x.setStyle(Paint.Style.STROKE);
        this.f8624x.setColor(this.f8610H);
        this.f8624x.setStrokeWidth(this.f8611I);
        canvas.drawRoundRect(this.f8619e, width, height, this.f8624x);
    }

    /* renamed from: i */
    public final void mo12277i(Canvas canvas) {
        this.f8624x.setStyle(Paint.Style.FILL);
        this.f8624x.setColor(this.f8609C);
        RectF rectF = f8606v0;
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), this.f8617a.top);
        canvas.drawRect(rectF, this.f8624x);
        rectF.set(Utils.FLOAT_EPSILON, this.f8617a.bottom, (float) canvas.getWidth(), (float) canvas.getHeight());
        canvas.drawRect(rectF, this.f8624x);
        RectF rectF2 = this.f8617a;
        rectF.set(Utils.FLOAT_EPSILON, rectF2.top, rectF2.left, rectF2.bottom);
        canvas.drawRect(rectF, this.f8624x);
        RectF rectF3 = this.f8617a;
        rectF.set(rectF3.right, rectF3.top, (float) canvas.getWidth(), this.f8617a.bottom);
        canvas.drawRect(rectF, this.f8624x);
    }

    /* renamed from: j */
    public final void mo12278j(Canvas canvas) {
        this.f8624x.setStyle(Paint.Style.FILL);
        this.f8624x.setColor(this.f8609C);
        canvas.saveLayer(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
        canvas.drawPaint(this.f8624x);
        canvas.drawRoundRect(this.f8617a, this.f8618d * 0.5f * this.f8617a.width(), this.f8618d * 0.5f * this.f8617a.height(), this.f8625y);
        canvas.restore();
    }

    /* renamed from: k */
    public final float mo12279k(float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (f - f4 < f2) {
            f6 = (f4 + f2) - f;
        } else if (f5 - f < f2) {
            f6 = (f - f5) + f2;
        } else {
            f6 = 0.0f;
        }
        if (f2 == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        return f3 * (1.0f - ((float) Math.sqrt((double) (1.0f - (((f6 * f6) / f2) / f2)))));
    }

    /* renamed from: l */
    public final void mo12280l(RectF rectF, float f) {
        this.f8617a.set(rectF);
        this.f8618d = f;
        this.f8619e.set(rectF);
        float f2 = -(this.f8611I * 0.5f);
        this.f8619e.inset(f2, f2);
        invalidate();
    }

    /* renamed from: m */
    public void mo12281m(boolean z) {
        Settings settings;
        GestureImageView gestureImageView = this.f8616U;
        if (gestureImageView == null) {
            settings = null;
        } else {
            settings = gestureImageView.getController().mo12196n();
        }
        if (settings != null && getWidth() > 0 && getHeight() > 0) {
            float f = this.f8615Q;
            if (f > Utils.FLOAT_EPSILON || f == -1.0f) {
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                float f2 = this.f8615Q;
                if (f2 == -1.0f) {
                    f2 = ((float) settings.mo12261l()) / ((float) settings.mo12260k());
                }
                float f3 = (float) width;
                float f4 = (float) height;
                if (f2 > f3 / f4) {
                    settings.mo12248N(width, (int) (f3 / f2));
                } else {
                    settings.mo12248N((int) (f4 * f2), height);
                }
                if (z) {
                    this.f8616U.getController().mo12193k();
                } else {
                    this.f8616U.getController().mo12191V();
                }
            }
            this.f8620g.set(this.f8617a);
            Rect rect = f8605k0;
            qj2.m25711d(settings, rect);
            this.f8621k.set(rect);
            this.f8607A.mo26049b();
            if (z) {
                this.f8607A.mo26052f(settings.mo12254e());
                this.f8607A.mo26053g(Utils.FLOAT_EPSILON, 1.0f);
                this.f8608B.mo28137c();
                return;
            }
            mo12280l(this.f8621k, this.f8623s);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f8618d == Utils.FLOAT_EPSILON || isInEditMode()) {
            mo12277i(canvas);
        } else {
            mo12278j(canvas);
        }
        mo12276h(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo12281m(false);
        GestureImageView gestureImageView = this.f8616U;
        if (gestureImageView != null) {
            gestureImageView.getController().mo12186Q();
        }
        if (isInEditMode()) {
            float paddingLeft = (float) ((i - getPaddingLeft()) - getPaddingRight());
            float paddingTop = (float) ((i2 - getPaddingTop()) - getPaddingBottom());
            float f = this.f8615Q;
            if (f <= Utils.FLOAT_EPSILON) {
                paddingLeft = (float) i;
                paddingTop = (float) i2;
            } else if (f > paddingLeft / paddingTop) {
                paddingTop = paddingLeft / f;
            } else {
                paddingLeft = paddingTop * f;
            }
            float f2 = (float) i;
            float f3 = (float) i2;
            this.f8617a.set((f2 - paddingLeft) * 0.5f, (f3 - paddingTop) * 0.5f, (f2 + paddingLeft) * 0.5f, (f3 + paddingTop) * 0.5f);
            this.f8619e.set(this.f8617a);
        }
    }

    public void setAspect(float f) {
        this.f8615Q = f;
    }

    public void setBackColor(int i) {
        this.f8609C = i;
        invalidate();
    }

    public void setBorderColor(int i) {
        this.f8610H = i;
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.f8611I = f;
        invalidate();
    }

    public void setImageView(GestureImageView gestureImageView) {
        this.f8616U = gestureImageView;
        gestureImageView.getController().mo12196n().mo12245K(Settings.Fit.OUTSIDE).mo12244J(true).mo12246L(false);
        mo12281m(false);
    }

    public void setRounded(boolean z) {
        float f;
        this.f8622r = this.f8618d;
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        this.f8623s = f;
    }

    public void setRulesCount(int i, int i2) {
        this.f8612L = i;
        this.f8613M = i2;
        invalidate();
    }

    public void setRulesWidth(float f) {
        this.f8614P = f;
        invalidate();
    }

    public CropAreaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8617a = new RectF();
        this.f8619e = new RectF();
        this.f8620g = new RectF();
        this.f8621k = new RectF();
        Paint paint = new Paint();
        this.f8624x = paint;
        Paint paint2 = new Paint();
        this.f8625y = paint2;
        this.f8607A = new t42();
        this.f8608B = new C1706a();
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint2.setAntiAlias(true);
        paint.setAntiAlias(true);
        float b = x37.m29871b(getContext(), 1, 2.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n55.CropAreaView);
        this.f8609C = obtainStyledAttributes.getColor(n55.CropAreaView_gest_backgroundColor, f8604e0);
        this.f8610H = obtainStyledAttributes.getColor(n55.CropAreaView_gest_borderColor, -1);
        this.f8611I = obtainStyledAttributes.getDimension(n55.CropAreaView_gest_borderWidth, b);
        this.f8612L = obtainStyledAttributes.getInt(n55.CropAreaView_gest_rulesHorizontal, 0);
        this.f8613M = obtainStyledAttributes.getInt(n55.CropAreaView_gest_rulesVertical, 0);
        int i = n55.CropAreaView_gest_rulesWidth;
        float f = Utils.FLOAT_EPSILON;
        this.f8614P = obtainStyledAttributes.getDimension(i, Utils.FLOAT_EPSILON);
        boolean z = obtainStyledAttributes.getBoolean(n55.CropAreaView_gest_rounded, false);
        this.f8615Q = obtainStyledAttributes.getFloat(n55.CropAreaView_gest_aspect, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
        f = z ? 1.0f : f;
        this.f8623s = f;
        this.f8618d = f;
    }
}
