package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: bf0 */
/* compiled from: CircularProgressDrawable */
public class bf0 extends Drawable implements Animatable {

    /* renamed from: s */
    public static final Interpolator f8090s = new LinearInterpolator();

    /* renamed from: x */
    public static final Interpolator f8091x = new bz1();

    /* renamed from: y */
    public static final int[] f8092y = {-16777216};

    /* renamed from: a */
    public final C1627c f8093a;

    /* renamed from: d */
    public float f8094d;

    /* renamed from: e */
    public Resources f8095e;

    /* renamed from: g */
    public Animator f8096g;

    /* renamed from: k */
    public float f8097k;

    /* renamed from: r */
    public boolean f8098r;

    /* renamed from: bf0$a */
    /* compiled from: CircularProgressDrawable */
    public class C1625a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C1627c f8099a;

        public C1625a(C1627c cVar) {
            this.f8099a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            bf0.this.mo11590n(floatValue, this.f8099a);
            bf0.this.mo11574b(floatValue, this.f8099a, false);
            bf0.this.invalidateSelf();
        }
    }

    /* renamed from: bf0$b */
    /* compiled from: CircularProgressDrawable */
    public class C1626b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C1627c f8101a;

        public C1626b(C1627c cVar) {
            this.f8101a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            bf0.this.mo11574b(1.0f, this.f8101a, true);
            this.f8101a.mo11600A();
            this.f8101a.mo11612l();
            bf0 bf0 = bf0.this;
            if (bf0.f8098r) {
                bf0.f8098r = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f8101a.mo11624x(false);
                return;
            }
            bf0.f8097k += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            bf0.this.f8097k = Utils.FLOAT_EPSILON;
        }
    }

    /* renamed from: bf0$c */
    /* compiled from: CircularProgressDrawable */
    public static class C1627c {

        /* renamed from: a */
        public final RectF f8103a = new RectF();

        /* renamed from: b */
        public final Paint f8104b;

        /* renamed from: c */
        public final Paint f8105c;

        /* renamed from: d */
        public final Paint f8106d;

        /* renamed from: e */
        public float f8107e;

        /* renamed from: f */
        public float f8108f;

        /* renamed from: g */
        public float f8109g;

        /* renamed from: h */
        public float f8110h;

        /* renamed from: i */
        public int[] f8111i;

        /* renamed from: j */
        public int f8112j;

        /* renamed from: k */
        public float f8113k;

        /* renamed from: l */
        public float f8114l;

        /* renamed from: m */
        public float f8115m;

        /* renamed from: n */
        public boolean f8116n;

        /* renamed from: o */
        public Path f8117o;

        /* renamed from: p */
        public float f8118p;

        /* renamed from: q */
        public float f8119q;

        /* renamed from: r */
        public int f8120r;

        /* renamed from: s */
        public int f8121s;

        /* renamed from: t */
        public int f8122t;

        /* renamed from: u */
        public int f8123u;

        public C1627c() {
            Paint paint = new Paint();
            this.f8104b = paint;
            Paint paint2 = new Paint();
            this.f8105c = paint2;
            Paint paint3 = new Paint();
            this.f8106d = paint3;
            this.f8107e = Utils.FLOAT_EPSILON;
            this.f8108f = Utils.FLOAT_EPSILON;
            this.f8109g = Utils.FLOAT_EPSILON;
            this.f8110h = 5.0f;
            this.f8118p = 1.0f;
            this.f8122t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void mo11600A() {
            this.f8113k = this.f8107e;
            this.f8114l = this.f8108f;
            this.f8115m = this.f8109g;
        }

        /* renamed from: a */
        public void mo11601a(Canvas canvas, Rect rect) {
            RectF rectF = this.f8103a;
            float f = this.f8119q;
            float f2 = (this.f8110h / 2.0f) + f;
            if (f <= Utils.FLOAT_EPSILON) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f8120r) * this.f8118p) / 2.0f, this.f8110h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f8107e;
            float f4 = this.f8109g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f8108f + f4) * 360.0f) - f5;
            this.f8104b.setColor(this.f8123u);
            this.f8104b.setAlpha(this.f8122t);
            float f7 = this.f8110h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f8106d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f8104b);
            mo11602b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void mo11602b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f8116n) {
                Path path = this.f8117o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f8117o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f8117o.moveTo(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                this.f8117o.lineTo(((float) this.f8120r) * this.f8118p, Utils.FLOAT_EPSILON);
                Path path3 = this.f8117o;
                float f3 = this.f8118p;
                path3.lineTo((((float) this.f8120r) * f3) / 2.0f, ((float) this.f8121s) * f3);
                this.f8117o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f8120r) * this.f8118p) / 2.0f), rectF.centerY() + (this.f8110h / 2.0f));
                this.f8117o.close();
                this.f8105c.setColor(this.f8123u);
                this.f8105c.setAlpha(this.f8122t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f8117o, this.f8105c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int mo11603c() {
            return this.f8122t;
        }

        /* renamed from: d */
        public float mo11604d() {
            return this.f8108f;
        }

        /* renamed from: e */
        public int mo11605e() {
            return this.f8111i[mo11606f()];
        }

        /* renamed from: f */
        public int mo11606f() {
            return (this.f8112j + 1) % this.f8111i.length;
        }

        /* renamed from: g */
        public float mo11607g() {
            return this.f8107e;
        }

        /* renamed from: h */
        public int mo11608h() {
            return this.f8111i[this.f8112j];
        }

        /* renamed from: i */
        public float mo11609i() {
            return this.f8114l;
        }

        /* renamed from: j */
        public float mo11610j() {
            return this.f8115m;
        }

        /* renamed from: k */
        public float mo11611k() {
            return this.f8113k;
        }

        /* renamed from: l */
        public void mo11612l() {
            mo11620t(mo11606f());
        }

        /* renamed from: m */
        public void mo11613m() {
            this.f8113k = Utils.FLOAT_EPSILON;
            this.f8114l = Utils.FLOAT_EPSILON;
            this.f8115m = Utils.FLOAT_EPSILON;
            mo11625y(Utils.FLOAT_EPSILON);
            mo11622v(Utils.FLOAT_EPSILON);
            mo11623w(Utils.FLOAT_EPSILON);
        }

        /* renamed from: n */
        public void mo11614n(int i) {
            this.f8122t = i;
        }

        /* renamed from: o */
        public void mo11615o(float f, float f2) {
            this.f8120r = (int) f;
            this.f8121s = (int) f2;
        }

        /* renamed from: p */
        public void mo11616p(float f) {
            if (f != this.f8118p) {
                this.f8118p = f;
            }
        }

        /* renamed from: q */
        public void mo11617q(float f) {
            this.f8119q = f;
        }

        /* renamed from: r */
        public void mo11618r(int i) {
            this.f8123u = i;
        }

        /* renamed from: s */
        public void mo11619s(ColorFilter colorFilter) {
            this.f8104b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        public void mo11620t(int i) {
            this.f8112j = i;
            this.f8123u = this.f8111i[i];
        }

        /* renamed from: u */
        public void mo11621u(int[] iArr) {
            this.f8111i = iArr;
            mo11620t(0);
        }

        /* renamed from: v */
        public void mo11622v(float f) {
            this.f8108f = f;
        }

        /* renamed from: w */
        public void mo11623w(float f) {
            this.f8109g = f;
        }

        /* renamed from: x */
        public void mo11624x(boolean z) {
            if (this.f8116n != z) {
                this.f8116n = z;
            }
        }

        /* renamed from: y */
        public void mo11625y(float f) {
            this.f8107e = f;
        }

        /* renamed from: z */
        public void mo11626z(float f) {
            this.f8110h = f;
            this.f8104b.setStrokeWidth(f);
        }
    }

    public bf0(Context context) {
        this.f8095e = ((Context) gu4.m18428f(context)).getResources();
        C1627c cVar = new C1627c();
        this.f8093a = cVar;
        cVar.mo11621u(f8092y);
        mo11587k(2.5f);
        mo11589m();
    }

    /* renamed from: a */
    public final void mo11573a(float f, C1627c cVar) {
        mo11590n(f, cVar);
        cVar.mo11625y(cVar.mo11611k() + (((cVar.mo11609i() - 0.01f) - cVar.mo11611k()) * f));
        cVar.mo11622v(cVar.mo11609i());
        cVar.mo11623w(cVar.mo11610j() + ((((float) (Math.floor((double) (cVar.mo11610j() / 0.8f)) + 1.0d)) - cVar.mo11610j()) * f));
    }

    /* renamed from: b */
    public void mo11574b(float f, C1627c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f8098r) {
            mo11573a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo11610j();
            if (f < 0.5f) {
                f2 = cVar.mo11611k();
                f3 = (f8091x.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo11611k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f8091x.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo11625y(f2);
            cVar.mo11622v(f3);
            cVar.mo11623w(j + (0.20999998f * f));
            mo11583h((f + this.f8097k) * 216.0f);
        }
    }

    /* renamed from: c */
    public final int mo11575c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: d */
    public void mo11576d(boolean z) {
        this.f8093a.mo11624x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f8094d, bounds.exactCenterX(), bounds.exactCenterY());
        this.f8093a.mo11601a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo11578e(float f) {
        this.f8093a.mo11616p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo11579f(int... iArr) {
        this.f8093a.mo11621u(iArr);
        this.f8093a.mo11620t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo11580g(float f) {
        this.f8093a.mo11623w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f8093a.mo11603c();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo11583h(float f) {
        this.f8094d = f;
    }

    /* renamed from: i */
    public final void mo11584i(float f, float f2, float f3, float f4) {
        C1627c cVar = this.f8093a;
        float f5 = this.f8095e.getDisplayMetrics().density;
        cVar.mo11626z(f2 * f5);
        cVar.mo11617q(f * f5);
        cVar.mo11620t(0);
        cVar.mo11615o(f3 * f5, f4 * f5);
    }

    public boolean isRunning() {
        return this.f8096g.isRunning();
    }

    /* renamed from: j */
    public void mo11586j(float f, float f2) {
        this.f8093a.mo11625y(f);
        this.f8093a.mo11622v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo11587k(float f) {
        this.f8093a.mo11626z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo11588l(int i) {
        if (i == 0) {
            mo11584i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            mo11584i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* renamed from: m */
    public final void mo11589m() {
        C1627c cVar = this.f8093a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.addUpdateListener(new C1625a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f8090s);
        ofFloat.addListener(new C1626b(cVar));
        this.f8096g = ofFloat;
    }

    /* renamed from: n */
    public void mo11590n(float f, C1627c cVar) {
        if (f > 0.75f) {
            cVar.mo11618r(mo11575c((f - 0.75f) / 0.25f, cVar.mo11608h(), cVar.mo11605e()));
        } else {
            cVar.mo11618r(cVar.mo11608h());
        }
    }

    public void setAlpha(int i) {
        this.f8093a.mo11614n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f8093a.mo11619s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f8096g.cancel();
        this.f8093a.mo11600A();
        if (this.f8093a.mo11604d() != this.f8093a.mo11607g()) {
            this.f8098r = true;
            this.f8096g.setDuration(666);
            this.f8096g.start();
            return;
        }
        this.f8093a.mo11620t(0);
        this.f8093a.mo11613m();
        this.f8096g.setDuration(1332);
        this.f8096g.start();
    }

    public void stop() {
        this.f8096g.cancel();
        mo11583h(Utils.FLOAT_EPSILON);
        this.f8093a.mo11624x(false);
        this.f8093a.mo11620t(0);
        this.f8093a.mo11613m();
        invalidateSelf();
    }
}
