package net.safemoon.androidwallet.views.zoomImage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;
import com.google.mlkit.common.MlKitException;

public class ZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: A */
    public float f43413A = 8.0f;

    /* renamed from: B */
    public final RectF f43414B = new RectF();

    /* renamed from: C */
    public boolean f43415C;

    /* renamed from: H */
    public boolean f43416H;

    /* renamed from: I */
    public boolean f43417I;

    /* renamed from: L */
    public boolean f43418L;

    /* renamed from: M */
    public boolean f43419M;

    /* renamed from: P */
    public boolean f43420P;

    /* renamed from: Q */
    public float f43421Q;

    /* renamed from: U */
    public int f43422U;

    /* renamed from: a */
    public final int f43423a = MlKitException.CODE_SCANNER_UNAVAILABLE;

    /* renamed from: b1 */
    public float f43424b1 = 1.0f;

    /* renamed from: d */
    public ImageView.ScaleType f43425d;

    /* renamed from: e */
    public Matrix f43426e = new Matrix();

    /* renamed from: e0 */
    public PointF f43427e0 = new PointF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);

    /* renamed from: e1 */
    public int f43428e1 = 1;

    /* renamed from: g */
    public Matrix f43429g = new Matrix();

    /* renamed from: k */
    public float[] f43430k = new float[9];

    /* renamed from: k0 */
    public float f43431k0 = 1.0f;

    /* renamed from: o1 */
    public int f43432o1 = 0;

    /* renamed from: p1 */
    public ScaleGestureDetector f43433p1;

    /* renamed from: q1 */
    public ValueAnimator f43434q1;

    /* renamed from: r */
    public float[] f43435r = null;

    /* renamed from: r1 */
    public GestureDetector f43436r1;

    /* renamed from: s */
    public float f43437s = 0.6f;

    /* renamed from: s1 */
    public boolean f43438s1 = false;

    /* renamed from: t1 */
    public boolean f43439t1 = false;

    /* renamed from: u1 */
    public final GestureDetector.OnGestureListener f43440u1 = new C8976d();

    /* renamed from: v0 */
    public float f43441v0 = 1.0f;

    /* renamed from: x */
    public float f43442x = 8.0f;

    /* renamed from: y */
    public float f43443y = 0.6f;

    /* renamed from: net.safemoon.androidwallet.views.zoomImage.ZoomageView$a */
    public class C8973a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final Matrix f43444a;

        /* renamed from: d */
        public final float[] f43445d = new float[9];

        /* renamed from: e */
        public final /* synthetic */ Matrix f43446e;

        /* renamed from: g */
        public final /* synthetic */ float f43447g;

        /* renamed from: k */
        public final /* synthetic */ float f43448k;

        /* renamed from: r */
        public final /* synthetic */ float f43449r;

        /* renamed from: s */
        public final /* synthetic */ float f43450s;

        public C8973a(Matrix matrix, float f, float f2, float f3, float f4) {
            this.f43446e = matrix;
            this.f43447g = f;
            this.f43448k = f2;
            this.f43449r = f3;
            this.f43450s = f4;
            this.f43444a = new Matrix(ZoomageView.this.getImageMatrix());
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f43444a.set(this.f43446e);
            this.f43444a.getValues(this.f43445d);
            float[] fArr = this.f43445d;
            fArr[2] = fArr[2] + (this.f43447g * floatValue);
            fArr[5] = fArr[5] + (this.f43448k * floatValue);
            fArr[0] = fArr[0] + (this.f43449r * floatValue);
            fArr[4] = fArr[4] + (this.f43450s * floatValue);
            this.f43444a.setValues(fArr);
            ZoomageView.this.setImageMatrix(this.f43444a);
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.zoomImage.ZoomageView$b */
    public class C8974b extends C8977e {

        /* renamed from: d */
        public final /* synthetic */ Matrix f43452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8974b(Matrix matrix) {
            super();
            this.f43452d = matrix;
        }

        public void onAnimationEnd(Animator animator) {
            ZoomageView.this.setImageMatrix(this.f43452d);
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.zoomImage.ZoomageView$c */
    public class C8975c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final float[] f43454a = new float[9];

        /* renamed from: d */
        public Matrix f43455d = new Matrix();

        /* renamed from: e */
        public final /* synthetic */ int f43456e;

        public C8975c(int i) {
            this.f43456e = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f43455d.set(ZoomageView.this.getImageMatrix());
            this.f43455d.getValues(this.f43454a);
            this.f43454a[this.f43456e] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f43455d.setValues(this.f43454a);
            ZoomageView.this.setImageMatrix(this.f43455d);
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.zoomImage.ZoomageView$d */
    public class C8976d extends GestureDetector.SimpleOnGestureListener {
        public C8976d() {
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                ZoomageView.this.f43438s1 = true;
            }
            ZoomageView.this.f43439t1 = false;
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            ZoomageView.this.f43439t1 = false;
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ZoomageView.this.f43439t1 = true;
            return false;
        }
    }

    /* renamed from: net.safemoon.androidwallet.views.zoomImage.ZoomageView$e */
    public class C8977e implements Animator.AnimatorListener {
        public C8977e() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public ZoomageView(Context context) {
        super(context);
        mo62323r(context, (AttributeSet) null);
    }

    private float getCurrentDisplayedHeight() {
        if (getDrawable() != null) {
            return ((float) getDrawable().getIntrinsicHeight()) * this.f43430k[4];
        }
        return Utils.FLOAT_EPSILON;
    }

    private float getCurrentDisplayedWidth() {
        if (getDrawable() != null) {
            return ((float) getDrawable().getIntrinsicWidth()) * this.f43430k[0];
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: e */
    public boolean mo62299e(MotionEvent motionEvent) {
        if (!this.f43415C || this.f43424b1 <= 1.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo62300f(MotionEvent motionEvent) {
        return this.f43416H;
    }

    /* renamed from: g */
    public final void mo62301g(int i, float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f43430k[i], f});
        ofFloat.addUpdateListener(new C8975c(i));
        ofFloat.setDuration(200);
        ofFloat.start();
    }

    public boolean getAnimateOnReset() {
        return this.f43419M;
    }

    public boolean getAutoCenter() {
        return this.f43420P;
    }

    public int getAutoResetMode() {
        return this.f43422U;
    }

    public float getCurrentScaleFactor() {
        return this.f43424b1;
    }

    public boolean getDoubleTapToZoom() {
        return this.f43417I;
    }

    public float getDoubleTapToZoomScaleFactor() {
        return this.f43421Q;
    }

    public boolean getRestrictBounds() {
        return this.f43418L;
    }

    /* renamed from: h */
    public final void mo62309h(Matrix matrix, int i) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        matrix2.getValues(this.f43430k);
        float f = fArr[0];
        float[] fArr2 = this.f43430k;
        float f2 = f - fArr2[0];
        float f3 = fArr[4] - fArr2[4];
        float f4 = fArr[2] - fArr2[2];
        float f5 = fArr[5] - fArr2[5];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f43434q1 = ofFloat;
        ofFloat.addUpdateListener(new C8973a(matrix2, f4, f5, f2, f3));
        this.f43434q1.addListener(new C8974b(matrix));
        this.f43434q1.setDuration((long) i);
        this.f43434q1.start();
    }

    /* renamed from: i */
    public final void mo62310i() {
        mo62309h(this.f43429g, MlKitException.CODE_SCANNER_UNAVAILABLE);
    }

    /* renamed from: j */
    public final void mo62311j() {
        if (getCurrentDisplayedWidth() > ((float) getWidth())) {
            RectF rectF = this.f43414B;
            if (rectF.left > Utils.FLOAT_EPSILON) {
                mo62301g(2, Utils.FLOAT_EPSILON);
            } else if (rectF.right < ((float) getWidth())) {
                mo62301g(2, (this.f43414B.left + ((float) getWidth())) - this.f43414B.right);
            }
        } else {
            RectF rectF2 = this.f43414B;
            if (rectF2.left < Utils.FLOAT_EPSILON) {
                mo62301g(2, Utils.FLOAT_EPSILON);
            } else if (rectF2.right > ((float) getWidth())) {
                mo62301g(2, (this.f43414B.left + ((float) getWidth())) - this.f43414B.right);
            }
        }
    }

    /* renamed from: k */
    public final void mo62312k() {
        if (getCurrentDisplayedHeight() > ((float) getHeight())) {
            RectF rectF = this.f43414B;
            if (rectF.top > Utils.FLOAT_EPSILON) {
                mo62301g(5, Utils.FLOAT_EPSILON);
            } else if (rectF.bottom < ((float) getHeight())) {
                mo62301g(5, (this.f43414B.top + ((float) getHeight())) - this.f43414B.bottom);
            }
        } else {
            RectF rectF2 = this.f43414B;
            if (rectF2.top < Utils.FLOAT_EPSILON) {
                mo62301g(5, Utils.FLOAT_EPSILON);
            } else if (rectF2.bottom > ((float) getHeight())) {
                mo62301g(5, (this.f43414B.top + ((float) getHeight())) - this.f43414B.bottom);
            }
        }
    }

    /* renamed from: l */
    public final void mo62313l() {
        if (this.f43420P) {
            mo62311j();
            mo62312k();
        }
    }

    /* renamed from: m */
    public boolean mo62314m(MotionEvent motionEvent) {
        if (this.f43432o1 > 1 || this.f43424b1 > 1.0f || mo62324s()) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final float mo62315n(float f) {
        float f2;
        float f3;
        if (getCurrentDisplayedWidth() >= ((float) getWidth())) {
            float f4 = this.f43414B.left;
            if (f4 <= Utils.FLOAT_EPSILON && f4 + f > Utils.FLOAT_EPSILON && !this.f43433p1.isInProgress()) {
                return -this.f43414B.left;
            }
            if (this.f43414B.right < ((float) getWidth()) || this.f43414B.right + f >= ((float) getWidth()) || this.f43433p1.isInProgress()) {
                return f;
            }
            f2 = (float) getWidth();
            f3 = this.f43414B.right;
        } else if (this.f43433p1.isInProgress()) {
            return f;
        } else {
            RectF rectF = this.f43414B;
            float f5 = rectF.left;
            if (f5 >= Utils.FLOAT_EPSILON && f5 + f < Utils.FLOAT_EPSILON) {
                return -f5;
            }
            if (rectF.right > ((float) getWidth()) || this.f43414B.right + f <= ((float) getWidth())) {
                return f;
            }
            f2 = (float) getWidth();
            f3 = this.f43414B.right;
        }
        return f2 - f3;
    }

    /* renamed from: o */
    public final float mo62316o(float f) {
        float f2;
        float f3;
        if (getCurrentDisplayedHeight() >= ((float) getHeight())) {
            float f4 = this.f43414B.top;
            if (f4 <= Utils.FLOAT_EPSILON && f4 + f > Utils.FLOAT_EPSILON && !this.f43433p1.isInProgress()) {
                return -this.f43414B.top;
            }
            if (this.f43414B.bottom < ((float) getHeight()) || this.f43414B.bottom + f >= ((float) getHeight()) || this.f43433p1.isInProgress()) {
                return f;
            }
            f2 = (float) getHeight();
            f3 = this.f43414B.bottom;
        } else if (this.f43433p1.isInProgress()) {
            return f;
        } else {
            RectF rectF = this.f43414B;
            float f5 = rectF.top;
            if (f5 >= Utils.FLOAT_EPSILON && f5 + f < Utils.FLOAT_EPSILON) {
                return -f5;
            }
            if (rectF.bottom > ((float) getHeight()) || this.f43414B.bottom + f <= ((float) getHeight())) {
                return f;
            }
            f2 = (float) getHeight();
            f3 = this.f43414B.bottom;
        }
        return f2 - f3;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = this.f43431k0 * scaleGestureDetector.getScaleFactor();
        float f = this.f43430k[0];
        float f2 = scaleFactor / f;
        this.f43441v0 = f2;
        float f3 = f2 * f;
        float f4 = this.f43443y;
        if (f3 < f4) {
            this.f43441v0 = f4 / f;
        } else {
            float f5 = this.f43413A;
            if (f3 > f5) {
                this.f43441v0 = f5 / f;
            }
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f43431k0 = this.f43430k[0];
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f43441v0 = 1.0f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isClickable() || !isEnabled() || (!this.f43416H && !this.f43415C)) {
            return super.onTouchEvent(motionEvent);
        }
        ImageView.ScaleType scaleType = getScaleType();
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType != scaleType2) {
            super.setScaleType(scaleType2);
        }
        if (this.f43435r == null) {
            mo62339w();
        }
        this.f43432o1 = motionEvent.getPointerCount();
        this.f43426e.set(getImageMatrix());
        this.f43426e.getValues(this.f43430k);
        mo62340x(this.f43430k);
        this.f43433p1.onTouchEvent(motionEvent);
        this.f43436r1.onTouchEvent(motionEvent);
        if (!this.f43417I || !this.f43438s1) {
            if (!this.f43439t1) {
                if (motionEvent.getActionMasked() == 0 || this.f43432o1 != this.f43428e1) {
                    this.f43427e0.set(this.f43433p1.getFocusX(), this.f43433p1.getFocusY());
                } else if (motionEvent.getActionMasked() == 2) {
                    float focusX = this.f43433p1.getFocusX();
                    float focusY = this.f43433p1.getFocusY();
                    if (mo62299e(motionEvent)) {
                        this.f43426e.postTranslate(mo62321p(focusX, this.f43427e0.x), mo62322q(focusY, this.f43427e0.y));
                    }
                    if (mo62300f(motionEvent)) {
                        Matrix matrix = this.f43426e;
                        float f = this.f43441v0;
                        matrix.postScale(f, f, focusX, focusY);
                        this.f43424b1 = this.f43430k[0] / this.f43435r[0];
                    }
                    setImageMatrix(this.f43426e);
                    this.f43427e0.set(focusX, focusY);
                }
                if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                    this.f43441v0 = 1.0f;
                    mo62338v();
                }
            }
            getParent().requestDisallowInterceptTouchEvent(mo62314m(motionEvent));
            this.f43428e1 = this.f43432o1;
            return true;
        }
        this.f43438s1 = false;
        this.f43439t1 = false;
        if (this.f43430k[0] != this.f43435r[0]) {
            mo62336t();
        } else {
            Matrix matrix2 = new Matrix(this.f43426e);
            float f2 = this.f43421Q;
            matrix2.postScale(f2, f2, this.f43433p1.getFocusX(), this.f43433p1.getFocusY());
            mo62309h(matrix2, MlKitException.CODE_SCANNER_UNAVAILABLE);
        }
        return true;
    }

    /* renamed from: p */
    public final float mo62321p(float f, float f2) {
        float f3 = f - f2;
        if (this.f43418L) {
            f3 = mo62315n(f3);
        }
        RectF rectF = this.f43414B;
        float f4 = rectF.right;
        if (f4 + f3 < Utils.FLOAT_EPSILON) {
            return -f4;
        }
        if (rectF.left + f3 > ((float) getWidth())) {
            return ((float) getWidth()) - this.f43414B.left;
        }
        return f3;
    }

    /* renamed from: q */
    public final float mo62322q(float f, float f2) {
        float f3 = f - f2;
        if (this.f43418L) {
            f3 = mo62316o(f3);
        }
        RectF rectF = this.f43414B;
        float f4 = rectF.bottom;
        if (f4 + f3 < Utils.FLOAT_EPSILON) {
            return -f4;
        }
        if (rectF.top + f3 > ((float) getHeight())) {
            return ((float) getHeight()) - this.f43414B.top;
        }
        return f3;
    }

    /* renamed from: r */
    public final void mo62323r(Context context, AttributeSet attributeSet) {
        this.f43433p1 = new ScaleGestureDetector(context, this);
        this.f43436r1 = new GestureDetector(context, this.f43440u1);
        tl5.m27815a(this.f43433p1, false);
        this.f43425d = getScaleType();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y55.ZoomageView);
        this.f43416H = obtainStyledAttributes.getBoolean(9, true);
        this.f43415C = obtainStyledAttributes.getBoolean(8, true);
        this.f43419M = obtainStyledAttributes.getBoolean(0, true);
        this.f43420P = obtainStyledAttributes.getBoolean(1, true);
        this.f43418L = obtainStyledAttributes.getBoolean(7, false);
        this.f43417I = obtainStyledAttributes.getBoolean(3, true);
        this.f43437s = obtainStyledAttributes.getFloat(6, 0.6f);
        this.f43442x = obtainStyledAttributes.getFloat(5, 8.0f);
        this.f43421Q = obtainStyledAttributes.getFloat(4, 3.0f);
        this.f43422U = C9561wt.m73744a(obtainStyledAttributes.getInt(2, 0));
        mo62341y();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: s */
    public final boolean mo62324s() {
        ValueAnimator valueAnimator = this.f43434q1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return false;
        }
        return true;
    }

    public void setAnimateOnReset(boolean z) {
        this.f43419M = z;
    }

    public void setAutoCenter(boolean z) {
        this.f43420P = z;
    }

    public void setAutoResetMode(int i) {
        this.f43422U = i;
    }

    public void setDoubleTapToZoom(boolean z) {
        this.f43417I = z;
    }

    public void setDoubleTapToZoomScaleFactor(float f) {
        this.f43421Q = f;
        mo62341y();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            setScaleType(this.f43425d);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.f43425d);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.f43425d);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        setScaleType(this.f43425d);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.f43425d);
    }

    public void setRestrictBounds(boolean z) {
        this.f43418L = z;
    }

    public void setScaleRange(float f, float f2) {
        this.f43437s = f;
        this.f43442x = f2;
        this.f43435r = null;
        mo62341y();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.f43425d = scaleType;
            this.f43435r = null;
        }
    }

    public void setTranslatable(boolean z) {
        this.f43415C = z;
    }

    public void setZoomable(boolean z) {
        this.f43416H = z;
    }

    /* renamed from: t */
    public void mo62336t() {
        mo62337u(this.f43419M);
    }

    /* renamed from: u */
    public void mo62337u(boolean z) {
        if (z) {
            mo62310i();
        } else {
            setImageMatrix(this.f43429g);
        }
    }

    /* renamed from: v */
    public final void mo62338v() {
        int i = this.f43422U;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    mo62336t();
                } else if (i == 3) {
                    mo62313l();
                }
            } else if (this.f43430k[0] >= this.f43435r[0]) {
                mo62336t();
            } else {
                mo62313l();
            }
        } else if (this.f43430k[0] <= this.f43435r[0]) {
            mo62336t();
        } else {
            mo62313l();
        }
    }

    /* renamed from: w */
    public final void mo62339w() {
        this.f43435r = new float[9];
        Matrix matrix = new Matrix(getImageMatrix());
        this.f43429g = matrix;
        matrix.getValues(this.f43435r);
        float f = this.f43437s;
        float f2 = this.f43435r[0];
        this.f43443y = f * f2;
        this.f43413A = this.f43442x * f2;
    }

    /* renamed from: x */
    public final void mo62340x(float[] fArr) {
        if (getDrawable() != null) {
            this.f43414B.set(fArr[2], fArr[5], (((float) getDrawable().getIntrinsicWidth()) * fArr[0]) + fArr[2], (((float) getDrawable().getIntrinsicHeight()) * fArr[4]) + fArr[5]);
        }
    }

    /* renamed from: y */
    public final void mo62341y() {
        float f = this.f43437s;
        float f2 = this.f43442x;
        if (f >= f2) {
            throw new IllegalStateException("minScale must be less than maxScale");
        } else if (f < Utils.FLOAT_EPSILON) {
            throw new IllegalStateException("minScale must be greater than 0");
        } else if (f2 >= Utils.FLOAT_EPSILON) {
            if (this.f43421Q > f2) {
                this.f43421Q = f2;
            }
            if (this.f43421Q < f) {
                this.f43421Q = f;
            }
        } else {
            throw new IllegalStateException("maxScale must be greater than 0");
        }
    }

    public ZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62323r(context, attributeSet);
    }

    public ZoomageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62323r(context, attributeSet);
    }
}
