package p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: t30 */
/* compiled from: BorderDrawable */
public class t30 extends Drawable {

    /* renamed from: a */
    public final sz5 f34093a = sz5.m52000k();

    /* renamed from: b */
    public final Paint f34094b;

    /* renamed from: c */
    public final Path f34095c = new Path();

    /* renamed from: d */
    public final Rect f34096d = new Rect();

    /* renamed from: e */
    public final RectF f34097e = new RectF();

    /* renamed from: f */
    public final RectF f34098f = new RectF();

    /* renamed from: g */
    public final C6512b f34099g = new C6512b();

    /* renamed from: h */
    public float f34100h;

    /* renamed from: i */
    public int f34101i;

    /* renamed from: j */
    public int f34102j;

    /* renamed from: k */
    public int f34103k;

    /* renamed from: l */
    public int f34104l;

    /* renamed from: m */
    public int f34105m;

    /* renamed from: n */
    public boolean f34106n = true;

    /* renamed from: o */
    public rz5 f34107o;

    /* renamed from: p */
    public ColorStateList f34108p;

    /* renamed from: t30$b */
    /* compiled from: BorderDrawable */
    public class C6512b extends Drawable.ConstantState {
        public C6512b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return t30.this;
        }
    }

    public t30(rz5 rz5) {
        this.f34107o = rz5;
        Paint paint = new Paint(1);
        this.f34094b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public final Shader mo47961a() {
        Rect rect = this.f34096d;
        copyBounds(rect);
        float height = this.f34100h / ((float) rect.height());
        return new LinearGradient(Utils.FLOAT_EPSILON, (float) rect.top, Utils.FLOAT_EPSILON, (float) rect.bottom, new int[]{gl0.m18165f(this.f34101i, this.f34105m), gl0.m18165f(this.f34102j, this.f34105m), gl0.m18165f(gl0.m18169j(this.f34102j, 0), this.f34105m), gl0.m18165f(gl0.m18169j(this.f34104l, 0), this.f34105m), gl0.m18165f(this.f34104l, this.f34105m), gl0.m18165f(this.f34103k, this.f34105m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    public RectF mo47962b() {
        this.f34098f.set(getBounds());
        return this.f34098f;
    }

    /* renamed from: c */
    public void mo47963c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f34105m = colorStateList.getColorForState(getState(), this.f34105m);
        }
        this.f34108p = colorStateList;
        this.f34106n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo47964d(float f) {
        if (this.f34100h != f) {
            this.f34100h = f;
            this.f34094b.setStrokeWidth(f * 1.3333f);
            this.f34106n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f34106n) {
            this.f34094b.setShader(mo47961a());
            this.f34106n = false;
        }
        float strokeWidth = this.f34094b.getStrokeWidth() / 2.0f;
        copyBounds(this.f34096d);
        this.f34097e.set(this.f34096d);
        float min = Math.min(this.f34107o.mo47581r().mo29529a(mo47962b()), this.f34097e.width() / 2.0f);
        if (this.f34107o.mo47584u(mo47962b())) {
            this.f34097e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f34097e, min, min, this.f34094b);
        }
    }

    /* renamed from: e */
    public void mo47966e(int i, int i2, int i3, int i4) {
        this.f34101i = i;
        this.f34102j = i2;
        this.f34103k = i3;
        this.f34104l = i4;
    }

    /* renamed from: f */
    public void mo47967f(rz5 rz5) {
        this.f34107o = rz5;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f34099g;
    }

    public int getOpacity() {
        if (this.f34100h > Utils.FLOAT_EPSILON) {
            return -3;
        }
        return -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f34107o.mo47584u(mo47962b())) {
            outline.setRoundRect(getBounds(), this.f34107o.mo47581r().mo29529a(mo47962b()));
            return;
        }
        copyBounds(this.f34096d);
        this.f34097e.set(this.f34096d);
        this.f34093a.mo47940e(this.f34107o, 1.0f, this.f34097e, this.f34095c);
        if (this.f34095c.isConvex()) {
            outline.setConvexPath(this.f34095c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.f34107o.mo47584u(mo47962b())) {
            return true;
        }
        int round = Math.round(this.f34100h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f34108p;
        if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful()) {
            return false;
        }
        return true;
    }

    public void onBoundsChange(Rect rect) {
        this.f34106n = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f34108p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f34105m)) == this.f34105m)) {
            this.f34106n = true;
            this.f34105m = colorForState;
        }
        if (this.f34106n) {
            invalidateSelf();
        }
        return this.f34106n;
    }

    public void setAlpha(int i) {
        this.f34094b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f34094b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
