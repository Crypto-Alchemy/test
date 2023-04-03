package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import p000.jn6;

/* renamed from: bs6 */
/* compiled from: TooltipDrawable */
public class bs6 extends uo3 implements jn6.C6117b {

    /* renamed from: C1 */
    public static final int f21445C1 = e55.Widget_MaterialComponents_Tooltip;

    /* renamed from: D1 */
    public static final int f21446D1 = j15.tooltipStyle;

    /* renamed from: A1 */
    public float f21447A1;

    /* renamed from: B1 */
    public float f21448B1;

    /* renamed from: b1 */
    public final Context f21449b1;

    /* renamed from: e1 */
    public final Paint.FontMetrics f21450e1 = new Paint.FontMetrics();

    /* renamed from: o1 */
    public final jn6 f21451o1;

    /* renamed from: p1 */
    public final View.OnLayoutChangeListener f21452p1;

    /* renamed from: q1 */
    public final Rect f21453q1;

    /* renamed from: r1 */
    public int f21454r1;

    /* renamed from: s1 */
    public int f21455s1;

    /* renamed from: t1 */
    public int f21456t1;

    /* renamed from: u1 */
    public int f21457u1;

    /* renamed from: v0 */
    public CharSequence f21458v0;

    /* renamed from: v1 */
    public int f21459v1;

    /* renamed from: w1 */
    public int f21460w1;

    /* renamed from: x1 */
    public float f21461x1;

    /* renamed from: y1 */
    public float f21462y1;

    /* renamed from: z1 */
    public final float f21463z1;

    /* renamed from: bs6$a */
    /* compiled from: TooltipDrawable */
    public class C3907a implements View.OnLayoutChangeListener {
        public C3907a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            bs6.this.mo29712D0(view);
        }
    }

    public bs6(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        jn6 jn6 = new jn6(this);
        this.f21451o1 = jn6;
        this.f21452p1 = new C3907a();
        this.f21453q1 = new Rect();
        this.f21461x1 = 1.0f;
        this.f21462y1 = 1.0f;
        this.f21463z1 = 0.5f;
        this.f21447A1 = 0.5f;
        this.f21448B1 = 1.0f;
        this.f21449b1 = context;
        jn6.mo44537e().density = context.getResources().getDisplayMetrics().density;
        jn6.mo44537e().setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: t0 */
    public static bs6 m32704t0(Context context, AttributeSet attributeSet, int i, int i2) {
        bs6 bs6 = new bs6(context, attributeSet, i, i2);
        bs6.mo29726y0(attributeSet, i, i2);
        return bs6;
    }

    /* renamed from: A0 */
    public void mo29709A0(float f) {
        this.f21447A1 = 1.2f;
        this.f21461x1 = f;
        this.f21462y1 = f;
        this.f21448B1 = C5807el.m43987b(Utils.FLOAT_EPSILON, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    /* renamed from: B0 */
    public void mo29710B0(CharSequence charSequence) {
        if (!TextUtils.equals(this.f21458v0, charSequence)) {
            this.f21458v0 = charSequence;
            this.f21451o1.mo44541i(true);
            invalidateSelf();
        }
    }

    /* renamed from: C0 */
    public void mo29711C0(bn6 bn6) {
        this.f21451o1.mo44540h(bn6, this.f21449b1);
    }

    /* renamed from: D0 */
    public final void mo29712D0(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f21460w1 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.f21453q1);
    }

    /* renamed from: a */
    public void mo29713a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(this.f21461x1, this.f21462y1, ((float) getBounds().left) + (((float) getBounds().width()) * 0.5f), ((float) getBounds().top) + (((float) getBounds().height()) * this.f21447A1));
        canvas.translate(mo29719q0(), (float) (-((((double) this.f21459v1) * Math.sqrt(2.0d)) - ((double) this.f21459v1))));
        super.draw(canvas);
        mo29724w0(canvas);
        canvas.restore();
    }

    public int getIntrinsicHeight() {
        return (int) Math.max(this.f21451o1.mo44537e().getTextSize(), (float) this.f21456t1);
    }

    public int getIntrinsicWidth() {
        return (int) Math.max(((float) (this.f21454r1 * 2)) + mo29725x0(), (float) this.f21455s1);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(mo48418D().mo47585v().mo47604s(mo29722u0()).mo47599m());
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: q0 */
    public final float mo29719q0() {
        int i;
        if (((this.f21453q1.right - getBounds().right) - this.f21460w1) - this.f21457u1 < 0) {
            i = ((this.f21453q1.right - getBounds().right) - this.f21460w1) - this.f21457u1;
        } else if (((this.f21453q1.left - getBounds().left) - this.f21460w1) + this.f21457u1 <= 0) {
            return Utils.FLOAT_EPSILON;
        } else {
            i = ((this.f21453q1.left - getBounds().left) - this.f21460w1) + this.f21457u1;
        }
        return (float) i;
    }

    /* renamed from: r0 */
    public final float mo29720r0() {
        this.f21451o1.mo44537e().getFontMetrics(this.f21450e1);
        Paint.FontMetrics fontMetrics = this.f21450e1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: s0 */
    public final float mo29721s0(Rect rect) {
        return ((float) rect.centerY()) - mo29720r0();
    }

    /* renamed from: u0 */
    public final mn1 mo29722u0() {
        float width = ((float) (((double) getBounds().width()) - (((double) this.f21459v1) * Math.sqrt(2.0d)))) / 2.0f;
        return new vf4(new go3((float) this.f21459v1), Math.min(Math.max(-mo29719q0(), -width), width));
    }

    /* renamed from: v0 */
    public void mo29723v0(View view) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f21452p1);
        }
    }

    /* renamed from: w0 */
    public final void mo29724w0(Canvas canvas) {
        if (this.f21458v0 != null) {
            Rect bounds = getBounds();
            int s0 = (int) mo29721s0(bounds);
            if (this.f21451o1.mo44536d() != null) {
                this.f21451o1.mo44537e().drawableState = getState();
                this.f21451o1.mo44542j(this.f21449b1);
                this.f21451o1.mo44537e().setAlpha((int) (this.f21448B1 * 255.0f));
            }
            CharSequence charSequence = this.f21458v0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) s0, this.f21451o1.mo44537e());
        }
    }

    /* renamed from: x0 */
    public final float mo29725x0() {
        CharSequence charSequence = this.f21458v0;
        if (charSequence == null) {
            return Utils.FLOAT_EPSILON;
        }
        return this.f21451o1.mo44538f(charSequence.toString());
    }

    /* renamed from: y0 */
    public final void mo29726y0(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = wo6.m54004h(this.f21449b1, attributeSet, u55.Tooltip, i, i2, new int[0]);
        this.f21459v1 = this.f21449b1.getResources().getDimensionPixelSize(k25.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(mo48418D().mo47585v().mo47604s(mo29722u0()).mo47599m());
        mo29710B0(h.getText(u55.Tooltip_android_text));
        mo29711C0(to3.m52395f(this.f21449b1, h, u55.Tooltip_android_textAppearance));
        mo48440a0(ColorStateList.valueOf(h.getColor(u55.Tooltip_backgroundTint, ro3.m51201g(gl0.m18169j(ro3.m51197c(this.f21449b1, 16842801, bs6.class.getCanonicalName()), 229), gl0.m18169j(ro3.m51197c(this.f21449b1, j15.colorOnBackground, bs6.class.getCanonicalName()), 153)))));
        mo48460k0(ColorStateList.valueOf(ro3.m51197c(this.f21449b1, j15.colorSurface, bs6.class.getCanonicalName())));
        this.f21454r1 = h.getDimensionPixelSize(u55.Tooltip_android_padding, 0);
        this.f21455s1 = h.getDimensionPixelSize(u55.Tooltip_android_minWidth, 0);
        this.f21456t1 = h.getDimensionPixelSize(u55.Tooltip_android_minHeight, 0);
        this.f21457u1 = h.getDimensionPixelSize(u55.Tooltip_android_layout_margin, 0);
        h.recycle();
    }

    /* renamed from: z0 */
    public void mo29727z0(View view) {
        if (view != null) {
            mo29712D0(view);
            view.addOnLayoutChangeListener(this.f21452p1);
        }
    }
}
