package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: ye0 */
/* compiled from: CircleImageView */
public class ye0 extends ImageView {

    /* renamed from: a */
    public Animation.AnimationListener f20187a;

    /* renamed from: d */
    public int f20188d;

    /* renamed from: e */
    public int f20189e;

    /* renamed from: ye0$a */
    /* compiled from: CircleImageView */
    public static class C3673a extends OvalShape {

        /* renamed from: a */
        public Paint f20190a = new Paint();

        /* renamed from: d */
        public int f20191d;

        /* renamed from: e */
        public ye0 f20192e;

        public C3673a(ye0 ye0, int i) {
            this.f20192e = ye0;
            this.f20191d = i;
            mo28051a((int) rect().width());
        }

        /* renamed from: a */
        public final void mo28051a(int i) {
            float f = (float) (i / 2);
            this.f20190a.setShader(new RadialGradient(f, f, (float) this.f20191d, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f20192e.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f20192e.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f20190a);
            canvas.drawCircle(f, height, (float) (width - this.f20191d), paint);
        }

        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            mo28051a((int) f);
        }
    }

    public ye0(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (Utils.FLOAT_EPSILON * f);
        this.f20188d = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(l55.SwipeRefreshLayout);
        this.f20189e = obtainStyledAttributes.getColor(l55.f14420xaa980688, -328966);
        obtainStyledAttributes.recycle();
        if (mo28045a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ga7.m17801x0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C3673a(this, this.f20188d));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f20188d, (float) i2, (float) i, 503316480);
            int i3 = this.f20188d;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f20189e);
        ga7.m17793t0(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean mo28045a() {
        return true;
    }

    /* renamed from: b */
    public void mo28046b(Animation.AnimationListener animationListener) {
        this.f20187a = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f20187a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f20187a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!mo28045a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f20188d * 2), getMeasuredHeight() + (this.f20188d * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f20189e = i;
        }
    }
}
