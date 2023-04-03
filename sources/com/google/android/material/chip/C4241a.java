package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p000.jn6;

/* renamed from: com.google.android.material.chip.a */
/* compiled from: ChipDrawable */
public class C4241a extends uo3 implements Drawable.Callback, jn6.C6117b {

    /* renamed from: v2 */
    public static final int[] f23622v2 = {16842910};

    /* renamed from: w2 */
    public static final ShapeDrawable f23623w2 = new ShapeDrawable(new OvalShape());

    /* renamed from: A1 */
    public Drawable f23624A1;

    /* renamed from: B1 */
    public ColorStateList f23625B1;

    /* renamed from: C1 */
    public float f23626C1;

    /* renamed from: D1 */
    public CharSequence f23627D1;

    /* renamed from: E1 */
    public boolean f23628E1;

    /* renamed from: F1 */
    public boolean f23629F1;

    /* renamed from: G1 */
    public Drawable f23630G1;

    /* renamed from: H1 */
    public ColorStateList f23631H1;

    /* renamed from: I1 */
    public vy3 f23632I1;

    /* renamed from: J1 */
    public vy3 f23633J1;

    /* renamed from: K1 */
    public float f23634K1;

    /* renamed from: L1 */
    public float f23635L1;

    /* renamed from: M1 */
    public float f23636M1;

    /* renamed from: N1 */
    public float f23637N1;

    /* renamed from: O1 */
    public float f23638O1;

    /* renamed from: P1 */
    public float f23639P1;

    /* renamed from: Q1 */
    public float f23640Q1;

    /* renamed from: R1 */
    public float f23641R1;

    /* renamed from: S1 */
    public final Context f23642S1;

    /* renamed from: T1 */
    public final Paint f23643T1 = new Paint(1);

    /* renamed from: U1 */
    public final Paint f23644U1;

    /* renamed from: V1 */
    public final Paint.FontMetrics f23645V1 = new Paint.FontMetrics();

    /* renamed from: W1 */
    public final RectF f23646W1 = new RectF();

    /* renamed from: X1 */
    public final PointF f23647X1 = new PointF();

    /* renamed from: Y1 */
    public final Path f23648Y1 = new Path();

    /* renamed from: Z1 */
    public final jn6 f23649Z1;

    /* renamed from: a2 */
    public int f23650a2;

    /* renamed from: b1 */
    public ColorStateList f23651b1;

    /* renamed from: b2 */
    public int f23652b2;

    /* renamed from: c2 */
    public int f23653c2;

    /* renamed from: d2 */
    public int f23654d2;

    /* renamed from: e1 */
    public float f23655e1;

    /* renamed from: e2 */
    public int f23656e2;

    /* renamed from: f2 */
    public int f23657f2;

    /* renamed from: g2 */
    public boolean f23658g2;

    /* renamed from: h2 */
    public int f23659h2;

    /* renamed from: i2 */
    public int f23660i2 = 255;

    /* renamed from: j2 */
    public ColorFilter f23661j2;

    /* renamed from: k2 */
    public PorterDuffColorFilter f23662k2;

    /* renamed from: l2 */
    public ColorStateList f23663l2;

    /* renamed from: m2 */
    public PorterDuff.Mode f23664m2 = PorterDuff.Mode.SRC_IN;

    /* renamed from: n2 */
    public int[] f23665n2;

    /* renamed from: o1 */
    public float f23666o1 = -1.0f;

    /* renamed from: o2 */
    public boolean f23667o2;

    /* renamed from: p1 */
    public ColorStateList f23668p1;

    /* renamed from: p2 */
    public ColorStateList f23669p2;

    /* renamed from: q1 */
    public float f23670q1;

    /* renamed from: q2 */
    public WeakReference<C4242a> f23671q2 = new WeakReference<>((Object) null);

    /* renamed from: r1 */
    public ColorStateList f23672r1;

    /* renamed from: r2 */
    public TextUtils.TruncateAt f23673r2;

    /* renamed from: s1 */
    public CharSequence f23674s1;

    /* renamed from: s2 */
    public boolean f23675s2;

    /* renamed from: t1 */
    public boolean f23676t1;

    /* renamed from: t2 */
    public int f23677t2;

    /* renamed from: u1 */
    public Drawable f23678u1;

    /* renamed from: u2 */
    public boolean f23679u2;

    /* renamed from: v0 */
    public ColorStateList f23680v0;

    /* renamed from: v1 */
    public ColorStateList f23681v1;

    /* renamed from: w1 */
    public float f23682w1;

    /* renamed from: x1 */
    public boolean f23683x1;

    /* renamed from: y1 */
    public boolean f23684y1;

    /* renamed from: z1 */
    public Drawable f23685z1;

    /* renamed from: com.google.android.material.chip.a$a */
    /* compiled from: ChipDrawable */
    public interface C4242a {
        /* renamed from: a */
        void mo32082a();
    }

    public C4241a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo48430P(context);
        this.f23642S1 = context;
        jn6 jn6 = new jn6(this);
        this.f23649Z1 = jn6;
        this.f23674s1 = "";
        jn6.mo44537e().density = context.getResources().getDisplayMetrics().density;
        this.f23644U1 = null;
        int[] iArr = f23622v2;
        setState(iArr);
        mo32394q2(iArr);
        this.f23675s2 = true;
        if (bh5.f21304a) {
            f23623w2.setTint(-1);
        }
    }

    /* renamed from: A0 */
    public static C4241a m35006A0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4241a aVar = new C4241a(context, attributeSet, i, i2);
        aVar.mo32423z1(attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: s1 */
    public static boolean m35007s1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w1 */
    public static boolean m35008w1(bn6 bn6) {
        ColorStateList colorStateList;
        if (bn6 == null || (colorStateList = bn6.f21403a) == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: x1 */
    public static boolean m35009x1(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: y1 */
    public static boolean m35010y1(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    /* renamed from: A1 */
    public void mo32275A1() {
        C4242a aVar = this.f23671q2.get();
        if (aVar != null) {
            aVar.mo32082a();
        }
    }

    /* renamed from: A2 */
    public void mo32276A2(float f) {
        if (this.f23635L1 != f) {
            float r0 = mo32395r0();
            this.f23635L1 = f;
            float r02 = mo32395r0();
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: B0 */
    public final void mo32277B0(Canvas canvas, Rect rect) {
        if (mo32327R2()) {
            mo32392q0(rect, this.f23646W1);
            RectF rectF = this.f23646W1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f23630G1.setBounds(0, 0, (int) this.f23646W1.width(), (int) this.f23646W1.height());
            this.f23630G1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: B1 */
    public final boolean mo32278B1(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f23680v0;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f23650a2);
        } else {
            i = 0;
        }
        int l = mo48461l(i);
        boolean z5 = true;
        if (this.f23650a2 != l) {
            this.f23650a2 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f23651b1;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f23652b2);
        } else {
            i2 = 0;
        }
        int l2 = mo48461l(i2);
        if (this.f23652b2 != l2) {
            this.f23652b2 = l2;
            onStateChange = true;
        }
        int g = ro3.m51201g(l, l2);
        if (this.f23653c2 != g) {
            z = true;
        } else {
            z = false;
        }
        if (mo48478x() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            this.f23653c2 = g;
            mo48440a0(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f23668p1;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f23654d2);
        } else {
            i3 = 0;
        }
        if (this.f23654d2 != i3) {
            this.f23654d2 = i3;
            onStateChange = true;
        }
        if (this.f23669p2 == null || !bh5.m32534e(iArr)) {
            i4 = 0;
        } else {
            i4 = this.f23669p2.getColorForState(iArr, this.f23656e2);
        }
        if (this.f23656e2 != i4) {
            this.f23656e2 = i4;
            if (this.f23667o2) {
                onStateChange = true;
            }
        }
        if (this.f23649Z1.mo44536d() == null || this.f23649Z1.mo44536d().f21403a == null) {
            i5 = 0;
        } else {
            i5 = this.f23649Z1.mo44536d().f21403a.getColorForState(iArr, this.f23657f2);
        }
        if (this.f23657f2 != i5) {
            this.f23657f2 = i5;
            onStateChange = true;
        }
        if (!m35007s1(getState(), 16842912) || !this.f23628E1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f23658g2 == z3 || this.f23630G1 == null) {
            z4 = false;
        } else {
            float r0 = mo32395r0();
            this.f23658g2 = z3;
            if (r0 != mo32395r0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f23663l2;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f23659h2);
        } else {
            i6 = 0;
        }
        if (this.f23659h2 != i6) {
            this.f23659h2 = i6;
            this.f23662k2 = vj1.m53414b(this, this.f23663l2, this.f23664m2);
        } else {
            z5 = onStateChange;
        }
        if (m35010y1(this.f23678u1)) {
            z5 |= this.f23678u1.setState(iArr);
        }
        if (m35010y1(this.f23630G1)) {
            z5 |= this.f23630G1.setState(iArr);
        }
        if (m35010y1(this.f23685z1)) {
            int[] iArr3 = new int[(iArr.length + iArr2.length)];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f23685z1.setState(iArr3);
        }
        if (bh5.f21304a && m35010y1(this.f23624A1)) {
            z5 |= this.f23624A1.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            mo32275A1();
        }
        return z5;
    }

    /* renamed from: B2 */
    public void mo32279B2(int i) {
        mo32276A2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: C0 */
    public final void mo32280C0(Canvas canvas, Rect rect) {
        if (!this.f23679u2) {
            this.f23643T1.setColor(this.f23652b2);
            this.f23643T1.setStyle(Paint.Style.FILL);
            this.f23643T1.setColorFilter(mo32393q1());
            this.f23646W1.set(rect);
            canvas.drawRoundRect(this.f23646W1, mo32313N0(), mo32313N0(), this.f23643T1);
        }
    }

    /* renamed from: C1 */
    public void mo32281C1(boolean z) {
        if (this.f23628E1 != z) {
            this.f23628E1 = z;
            float r0 = mo32395r0();
            if (!z && this.f23658g2) {
                this.f23658g2 = false;
            }
            float r02 = mo32395r0();
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: C2 */
    public void mo32282C2(int i) {
        this.f23677t2 = i;
    }

    /* renamed from: D0 */
    public final void mo32283D0(Canvas canvas, Rect rect) {
        if (mo32330S2()) {
            mo32392q0(rect, this.f23646W1);
            RectF rectF = this.f23646W1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f23678u1.setBounds(0, 0, (int) this.f23646W1.width(), (int) this.f23646W1.height());
            this.f23678u1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: D1 */
    public void mo32284D1(int i) {
        mo32281C1(this.f23642S1.getResources().getBoolean(i));
    }

    /* renamed from: D2 */
    public void mo32285D2(ColorStateList colorStateList) {
        if (this.f23672r1 != colorStateList) {
            this.f23672r1 = colorStateList;
            mo32339V2();
            onStateChange(getState());
        }
    }

    /* renamed from: E0 */
    public final void mo32286E0(Canvas canvas, Rect rect) {
        if (this.f23670q1 > Utils.FLOAT_EPSILON && !this.f23679u2) {
            this.f23643T1.setColor(this.f23654d2);
            this.f23643T1.setStyle(Paint.Style.STROKE);
            if (!this.f23679u2) {
                this.f23643T1.setColorFilter(mo32393q1());
            }
            RectF rectF = this.f23646W1;
            float f = this.f23670q1;
            rectF.set(((float) rect.left) + (f / 2.0f), ((float) rect.top) + (f / 2.0f), ((float) rect.right) - (f / 2.0f), ((float) rect.bottom) - (f / 2.0f));
            float f2 = this.f23666o1 - (this.f23670q1 / 2.0f);
            canvas.drawRoundRect(this.f23646W1, f2, f2, this.f23643T1);
        }
    }

    /* renamed from: E1 */
    public void mo32287E1(Drawable drawable) {
        if (this.f23630G1 != drawable) {
            float r0 = mo32395r0();
            this.f23630G1 = drawable;
            float r02 = mo32395r0();
            mo32336U2(this.f23630G1);
            mo32389p0(this.f23630G1);
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: E2 */
    public void mo32288E2(int i) {
        mo32285D2(C2554in.m19713a(this.f23642S1, i));
    }

    /* renamed from: F0 */
    public final void mo32289F0(Canvas canvas, Rect rect) {
        if (!this.f23679u2) {
            this.f23643T1.setColor(this.f23650a2);
            this.f23643T1.setStyle(Paint.Style.FILL);
            this.f23646W1.set(rect);
            canvas.drawRoundRect(this.f23646W1, mo32313N0(), mo32313N0(), this.f23643T1);
        }
    }

    /* renamed from: F1 */
    public void mo32290F1(int i) {
        mo32287E1(C2554in.m19714b(this.f23642S1, i));
    }

    /* renamed from: F2 */
    public void mo32291F2(boolean z) {
        this.f23675s2 = z;
    }

    /* renamed from: G0 */
    public final void mo32292G0(Canvas canvas, Rect rect) {
        if (mo32333T2()) {
            mo32406t0(rect, this.f23646W1);
            RectF rectF = this.f23646W1;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f23685z1.setBounds(0, 0, (int) this.f23646W1.width(), (int) this.f23646W1.height());
            if (bh5.f21304a) {
                this.f23624A1.setBounds(this.f23685z1.getBounds());
                this.f23624A1.jumpToCurrentState();
                this.f23624A1.draw(canvas);
            } else {
                this.f23685z1.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: G1 */
    public void mo32293G1(ColorStateList colorStateList) {
        if (this.f23631H1 != colorStateList) {
            this.f23631H1 = colorStateList;
            if (mo32422z0()) {
                ij1.m19656o(this.f23630G1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: G2 */
    public void mo32294G2(vy3 vy3) {
        this.f23632I1 = vy3;
    }

    /* renamed from: H0 */
    public final void mo32295H0(Canvas canvas, Rect rect) {
        this.f23643T1.setColor(this.f23656e2);
        this.f23643T1.setStyle(Paint.Style.FILL);
        this.f23646W1.set(rect);
        if (!this.f23679u2) {
            canvas.drawRoundRect(this.f23646W1, mo32313N0(), mo32313N0(), this.f23643T1);
            return;
        }
        mo48452h(new RectF(rect), this.f23648Y1);
        super.mo48470q(canvas, this.f23643T1, this.f23648Y1, mo48475u());
    }

    /* renamed from: H1 */
    public void mo32296H1(int i) {
        mo32293G1(C2554in.m19713a(this.f23642S1, i));
    }

    /* renamed from: H2 */
    public void mo32297H2(int i) {
        mo32294G2(vy3.m53611d(this.f23642S1, i));
    }

    /* renamed from: I0 */
    public final void mo32298I0(Canvas canvas, Rect rect) {
        Paint paint = this.f23644U1;
        if (paint != null) {
            paint.setColor(gl0.m18169j(-16777216, 127));
            canvas.drawRect(rect, this.f23644U1);
            if (mo32330S2() || mo32327R2()) {
                mo32392q0(rect, this.f23646W1);
                canvas.drawRect(this.f23646W1, this.f23644U1);
            }
            if (this.f23674s1 != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.f23644U1);
            }
            if (mo32333T2()) {
                mo32406t0(rect, this.f23646W1);
                canvas.drawRect(this.f23646W1, this.f23644U1);
            }
            this.f23644U1.setColor(gl0.m18169j(-65536, 127));
            mo32398s0(rect, this.f23646W1);
            canvas.drawRect(this.f23646W1, this.f23644U1);
            this.f23644U1.setColor(gl0.m18169j(-16711936, 127));
            mo32409u0(rect, this.f23646W1);
            canvas.drawRect(this.f23646W1, this.f23644U1);
        }
    }

    /* renamed from: I1 */
    public void mo32299I1(int i) {
        mo32302J1(this.f23642S1.getResources().getBoolean(i));
    }

    /* renamed from: I2 */
    public void mo32300I2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f23674s1, charSequence)) {
            this.f23674s1 = charSequence;
            this.f23649Z1.mo44541i(true);
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: J0 */
    public final void mo32301J0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f23674s1 != null) {
            Paint.Align y0 = mo32420y0(rect, this.f23647X1);
            mo32416w0(rect, this.f23646W1);
            if (this.f23649Z1.mo44536d() != null) {
                this.f23649Z1.mo44537e().drawableState = getState();
                this.f23649Z1.mo44542j(this.f23642S1);
            }
            this.f23649Z1.mo44537e().setTextAlign(y0);
            int i = 0;
            if (Math.round(this.f23649Z1.mo44538f(mo32381m1().toString())) > Math.round(this.f23646W1.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f23646W1);
            }
            CharSequence charSequence = this.f23674s1;
            if (z && this.f23673r2 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f23649Z1.mo44537e(), this.f23646W1.width(), this.f23673r2);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f23647X1;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f23649Z1.mo44537e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: J1 */
    public void mo32302J1(boolean z) {
        boolean z2;
        if (this.f23629F1 != z) {
            boolean R2 = mo32327R2();
            this.f23629F1 = z;
            boolean R22 = mo32327R2();
            if (R2 != R22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (R22) {
                    mo32389p0(this.f23630G1);
                } else {
                    mo32336U2(this.f23630G1);
                }
                invalidateSelf();
                mo32275A1();
            }
        }
    }

    /* renamed from: J2 */
    public void mo32303J2(bn6 bn6) {
        this.f23649Z1.mo44540h(bn6, this.f23642S1);
    }

    /* renamed from: K0 */
    public Drawable mo32304K0() {
        return this.f23630G1;
    }

    /* renamed from: K1 */
    public void mo32305K1(ColorStateList colorStateList) {
        if (this.f23651b1 != colorStateList) {
            this.f23651b1 = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: K2 */
    public void mo32306K2(int i) {
        mo32303J2(new bn6(this.f23642S1, i));
    }

    /* renamed from: L0 */
    public ColorStateList mo32307L0() {
        return this.f23631H1;
    }

    /* renamed from: L1 */
    public void mo32308L1(int i) {
        mo32305K1(C2554in.m19713a(this.f23642S1, i));
    }

    /* renamed from: L2 */
    public void mo32309L2(float f) {
        if (this.f23638O1 != f) {
            this.f23638O1 = f;
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: M0 */
    public ColorStateList mo32310M0() {
        return this.f23651b1;
    }

    @Deprecated
    /* renamed from: M1 */
    public void mo32311M1(float f) {
        if (this.f23666o1 != f) {
            this.f23666o1 = f;
            setShapeAppearanceModel(mo48418D().mo47586w(f));
        }
    }

    /* renamed from: M2 */
    public void mo32312M2(int i) {
        mo32309L2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: N0 */
    public float mo32313N0() {
        if (this.f23679u2) {
            return mo48423I();
        }
        return this.f23666o1;
    }

    @Deprecated
    /* renamed from: N1 */
    public void mo32314N1(int i) {
        mo32311M1(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: N2 */
    public void mo32315N2(float f) {
        if (this.f23637N1 != f) {
            this.f23637N1 = f;
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: O0 */
    public float mo32316O0() {
        return this.f23641R1;
    }

    /* renamed from: O1 */
    public void mo32317O1(float f) {
        if (this.f23641R1 != f) {
            this.f23641R1 = f;
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: O2 */
    public void mo32318O2(int i) {
        mo32315N2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: P0 */
    public Drawable mo32319P0() {
        Drawable drawable = this.f23678u1;
        if (drawable != null) {
            return ij1.m19658q(drawable);
        }
        return null;
    }

    /* renamed from: P1 */
    public void mo32320P1(int i) {
        mo32317O1(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: P2 */
    public void mo32321P2(boolean z) {
        if (this.f23667o2 != z) {
            this.f23667o2 = z;
            mo32339V2();
            onStateChange(getState());
        }
    }

    /* renamed from: Q0 */
    public float mo32322Q0() {
        return this.f23682w1;
    }

    /* renamed from: Q1 */
    public void mo32323Q1(Drawable drawable) {
        Drawable drawable2;
        Drawable P0 = mo32319P0();
        if (P0 != drawable) {
            float r0 = mo32395r0();
            if (drawable != null) {
                drawable2 = ij1.m19659r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f23678u1 = drawable2;
            float r02 = mo32395r0();
            mo32336U2(P0);
            if (mo32330S2()) {
                mo32389p0(this.f23678u1);
            }
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: Q2 */
    public boolean mo32324Q2() {
        return this.f23675s2;
    }

    /* renamed from: R0 */
    public ColorStateList mo32325R0() {
        return this.f23681v1;
    }

    /* renamed from: R1 */
    public void mo32326R1(int i) {
        mo32323Q1(C2554in.m19714b(this.f23642S1, i));
    }

    /* renamed from: R2 */
    public final boolean mo32327R2() {
        if (!this.f23629F1 || this.f23630G1 == null || !this.f23658g2) {
            return false;
        }
        return true;
    }

    /* renamed from: S0 */
    public float mo32328S0() {
        return this.f23655e1;
    }

    /* renamed from: S1 */
    public void mo32329S1(float f) {
        if (this.f23682w1 != f) {
            float r0 = mo32395r0();
            this.f23682w1 = f;
            float r02 = mo32395r0();
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: S2 */
    public final boolean mo32330S2() {
        if (!this.f23676t1 || this.f23678u1 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: T0 */
    public float mo32331T0() {
        return this.f23634K1;
    }

    /* renamed from: T1 */
    public void mo32332T1(int i) {
        mo32329S1(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: T2 */
    public final boolean mo32333T2() {
        if (!this.f23684y1 || this.f23685z1 == null) {
            return false;
        }
        return true;
    }

    /* renamed from: U0 */
    public ColorStateList mo32334U0() {
        return this.f23668p1;
    }

    /* renamed from: U1 */
    public void mo32335U1(ColorStateList colorStateList) {
        this.f23683x1 = true;
        if (this.f23681v1 != colorStateList) {
            this.f23681v1 = colorStateList;
            if (mo32330S2()) {
                ij1.m19656o(this.f23678u1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: U2 */
    public final void mo32336U2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    /* renamed from: V0 */
    public float mo32337V0() {
        return this.f23670q1;
    }

    /* renamed from: V1 */
    public void mo32338V1(int i) {
        mo32335U1(C2554in.m19713a(this.f23642S1, i));
    }

    /* renamed from: V2 */
    public final void mo32339V2() {
        ColorStateList colorStateList;
        if (this.f23667o2) {
            colorStateList = bh5.m32533d(this.f23672r1);
        } else {
            colorStateList = null;
        }
        this.f23669p2 = colorStateList;
    }

    /* renamed from: W0 */
    public Drawable mo32340W0() {
        Drawable drawable = this.f23685z1;
        if (drawable != null) {
            return ij1.m19658q(drawable);
        }
        return null;
    }

    /* renamed from: W1 */
    public void mo32341W1(int i) {
        mo32344X1(this.f23642S1.getResources().getBoolean(i));
    }

    @TargetApi(21)
    /* renamed from: W2 */
    public final void mo32342W2() {
        this.f23624A1 = new RippleDrawable(bh5.m32533d(mo32377k1()), this.f23685z1, f23623w2);
    }

    /* renamed from: X0 */
    public CharSequence mo32343X0() {
        return this.f23627D1;
    }

    /* renamed from: X1 */
    public void mo32344X1(boolean z) {
        boolean z2;
        if (this.f23676t1 != z) {
            boolean S2 = mo32330S2();
            this.f23676t1 = z;
            boolean S22 = mo32330S2();
            if (S2 != S22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (S22) {
                    mo32389p0(this.f23678u1);
                } else {
                    mo32336U2(this.f23678u1);
                }
                invalidateSelf();
                mo32275A1();
            }
        }
    }

    /* renamed from: Y0 */
    public float mo32345Y0() {
        return this.f23640Q1;
    }

    /* renamed from: Y1 */
    public void mo32346Y1(float f) {
        if (this.f23655e1 != f) {
            this.f23655e1 = f;
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: Z0 */
    public float mo32347Z0() {
        return this.f23626C1;
    }

    /* renamed from: Z1 */
    public void mo32348Z1(int i) {
        mo32346Y1(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: a */
    public void mo29713a() {
        mo32275A1();
        invalidateSelf();
    }

    /* renamed from: a1 */
    public float mo32349a1() {
        return this.f23639P1;
    }

    /* renamed from: a2 */
    public void mo32350a2(float f) {
        if (this.f23634K1 != f) {
            this.f23634K1 = f;
            invalidateSelf();
            mo32275A1();
        }
    }

    /* renamed from: b1 */
    public int[] mo32351b1() {
        return this.f23665n2;
    }

    /* renamed from: b2 */
    public void mo32352b2(int i) {
        mo32350a2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: c1 */
    public ColorStateList mo32353c1() {
        return this.f23625B1;
    }

    /* renamed from: c2 */
    public void mo32354c2(ColorStateList colorStateList) {
        if (this.f23668p1 != colorStateList) {
            this.f23668p1 = colorStateList;
            if (this.f23679u2) {
                mo48460k0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: d1 */
    public void mo32355d1(RectF rectF) {
        mo32409u0(getBounds(), rectF);
    }

    /* renamed from: d2 */
    public void mo32356d2(int i) {
        mo32354c2(C2554in.m19713a(this.f23642S1, i));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            int i2 = this.f23660i2;
            if (i2 < 255) {
                i = ya0.m54665a(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            }
            mo32289F0(canvas, bounds);
            mo32280C0(canvas, bounds);
            if (this.f23679u2) {
                super.draw(canvas);
            }
            mo32286E0(canvas, bounds);
            mo32295H0(canvas, bounds);
            mo32283D0(canvas, bounds);
            mo32277B0(canvas, bounds);
            if (this.f23675s2) {
                mo32301J0(canvas, bounds);
            }
            mo32292G0(canvas, bounds);
            mo32298I0(canvas, bounds);
            if (this.f23660i2 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public final float mo32357e1() {
        Drawable drawable;
        if (this.f23658g2) {
            drawable = this.f23630G1;
        } else {
            drawable = this.f23678u1;
        }
        float f = this.f23682w1;
        if (f <= Utils.FLOAT_EPSILON && drawable != null) {
            f = (float) Math.ceil((double) pe7.m49897c(this.f23642S1, 24));
            if (((float) drawable.getIntrinsicHeight()) <= f) {
                return (float) drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: e2 */
    public void mo32358e2(float f) {
        if (this.f23670q1 != f) {
            this.f23670q1 = f;
            this.f23643T1.setStrokeWidth(f);
            if (this.f23679u2) {
                super.mo48462l0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: f1 */
    public final float mo32359f1() {
        Drawable drawable;
        if (this.f23658g2) {
            drawable = this.f23630G1;
        } else {
            drawable = this.f23678u1;
        }
        float f = this.f23682w1;
        if (f > Utils.FLOAT_EPSILON || drawable == null) {
            return f;
        }
        return (float) drawable.getIntrinsicWidth();
    }

    /* renamed from: f2 */
    public void mo32360f2(int i) {
        mo32358e2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: g1 */
    public TextUtils.TruncateAt mo32361g1() {
        return this.f23673r2;
    }

    /* renamed from: g2 */
    public final void mo32362g2(ColorStateList colorStateList) {
        if (this.f23680v0 != colorStateList) {
            this.f23680v0 = colorStateList;
            onStateChange(getState());
        }
    }

    public int getAlpha() {
        return this.f23660i2;
    }

    public ColorFilter getColorFilter() {
        return this.f23661j2;
    }

    public int getIntrinsicHeight() {
        return (int) this.f23655e1;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f23634K1 + mo32395r0() + this.f23637N1 + this.f23649Z1.mo44538f(mo32381m1().toString()) + this.f23638O1 + mo32413v0() + this.f23641R1), this.f23677t2);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f23679u2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f23666o1);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f23666o1);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    /* renamed from: h1 */
    public vy3 mo32369h1() {
        return this.f23633J1;
    }

    /* renamed from: h2 */
    public void mo32370h2(Drawable drawable) {
        Drawable drawable2;
        Drawable W0 = mo32340W0();
        if (W0 != drawable) {
            float v0 = mo32413v0();
            if (drawable != null) {
                drawable2 = ij1.m19659r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f23685z1 = drawable2;
            if (bh5.f21304a) {
                mo32342W2();
            }
            float v02 = mo32413v0();
            mo32336U2(W0);
            if (mo32333T2()) {
                mo32389p0(this.f23685z1);
            }
            invalidateSelf();
            if (v0 != v02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: i1 */
    public float mo32371i1() {
        return this.f23636M1;
    }

    /* renamed from: i2 */
    public void mo32372i2(CharSequence charSequence) {
        if (this.f23627D1 != charSequence) {
            this.f23627D1 = f10.m16439c().mo19570h(charSequence);
            invalidateSelf();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isStateful() {
        if (m35009x1(this.f23680v0) || m35009x1(this.f23651b1) || m35009x1(this.f23668p1) || ((this.f23667o2 && m35009x1(this.f23669p2)) || m35008w1(this.f23649Z1.mo44536d()) || mo32422z0() || m35010y1(this.f23678u1) || m35010y1(this.f23630G1) || m35009x1(this.f23663l2))) {
            return true;
        }
        return false;
    }

    /* renamed from: j1 */
    public float mo32375j1() {
        return this.f23635L1;
    }

    /* renamed from: j2 */
    public void mo32376j2(float f) {
        if (this.f23640Q1 != f) {
            this.f23640Q1 = f;
            invalidateSelf();
            if (mo32333T2()) {
                mo32275A1();
            }
        }
    }

    /* renamed from: k1 */
    public ColorStateList mo32377k1() {
        return this.f23672r1;
    }

    /* renamed from: k2 */
    public void mo32378k2(int i) {
        mo32376j2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: l1 */
    public vy3 mo32379l1() {
        return this.f23632I1;
    }

    /* renamed from: l2 */
    public void mo32380l2(int i) {
        mo32370h2(C2554in.m19714b(this.f23642S1, i));
    }

    /* renamed from: m1 */
    public CharSequence mo32381m1() {
        return this.f23674s1;
    }

    /* renamed from: m2 */
    public void mo32382m2(float f) {
        if (this.f23626C1 != f) {
            this.f23626C1 = f;
            invalidateSelf();
            if (mo32333T2()) {
                mo32275A1();
            }
        }
    }

    /* renamed from: n1 */
    public bn6 mo32383n1() {
        return this.f23649Z1.mo44536d();
    }

    /* renamed from: n2 */
    public void mo32384n2(int i) {
        mo32382m2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: o1 */
    public float mo32385o1() {
        return this.f23638O1;
    }

    /* renamed from: o2 */
    public void mo32386o2(float f) {
        if (this.f23639P1 != f) {
            this.f23639P1 = f;
            invalidateSelf();
            if (mo32333T2()) {
                mo32275A1();
            }
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (mo32330S2()) {
            onLayoutDirectionChanged |= ij1.m19654m(this.f23678u1, i);
        }
        if (mo32327R2()) {
            onLayoutDirectionChanged |= ij1.m19654m(this.f23630G1, i);
        }
        if (mo32333T2()) {
            onLayoutDirectionChanged |= ij1.m19654m(this.f23685z1, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (mo32330S2()) {
            onLevelChange |= this.f23678u1.setLevel(i);
        }
        if (mo32327R2()) {
            onLevelChange |= this.f23630G1.setLevel(i);
        }
        if (mo32333T2()) {
            onLevelChange |= this.f23685z1.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.f23679u2) {
            super.onStateChange(iArr);
        }
        return mo32278B1(iArr, mo32351b1());
    }

    /* renamed from: p0 */
    public final void mo32389p0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            ij1.m19654m(drawable, ij1.m19647f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f23685z1) {
                if (drawable.isStateful()) {
                    drawable.setState(mo32351b1());
                }
                ij1.m19656o(drawable, this.f23625B1);
                return;
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
            Drawable drawable2 = this.f23678u1;
            if (drawable == drawable2 && this.f23683x1) {
                ij1.m19656o(drawable2, this.f23681v1);
            }
        }
    }

    /* renamed from: p1 */
    public float mo32390p1() {
        return this.f23637N1;
    }

    /* renamed from: p2 */
    public void mo32391p2(int i) {
        mo32386o2(this.f23642S1.getResources().getDimension(i));
    }

    /* renamed from: q0 */
    public final void mo32392q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo32330S2() || mo32327R2()) {
            float f = this.f23634K1 + this.f23635L1;
            float f1 = mo32359f1();
            if (ij1.m19647f(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + f1;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - f1;
            }
            float e1 = mo32357e1();
            float exactCenterY = rect.exactCenterY() - (e1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + e1;
        }
    }

    /* renamed from: q1 */
    public final ColorFilter mo32393q1() {
        ColorFilter colorFilter = this.f23661j2;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.f23662k2;
    }

    /* renamed from: q2 */
    public boolean mo32394q2(int[] iArr) {
        if (Arrays.equals(this.f23665n2, iArr)) {
            return false;
        }
        this.f23665n2 = iArr;
        if (mo32333T2()) {
            return mo32278B1(getState(), iArr);
        }
        return false;
    }

    /* renamed from: r0 */
    public float mo32395r0() {
        if (mo32330S2() || mo32327R2()) {
            return this.f23635L1 + mo32359f1() + this.f23636M1;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: r1 */
    public boolean mo32396r1() {
        return this.f23667o2;
    }

    /* renamed from: r2 */
    public void mo32397r2(ColorStateList colorStateList) {
        if (this.f23625B1 != colorStateList) {
            this.f23625B1 = colorStateList;
            if (mo32333T2()) {
                ij1.m19656o(this.f23685z1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: s0 */
    public final void mo32398s0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (mo32333T2()) {
            float f = this.f23641R1 + this.f23640Q1 + this.f23626C1 + this.f23639P1 + this.f23638O1;
            if (ij1.m19647f(this) == 0) {
                rectF.right = ((float) rect.right) - f;
            } else {
                rectF.left = ((float) rect.left) + f;
            }
        }
    }

    /* renamed from: s2 */
    public void mo32399s2(int i) {
        mo32397r2(C2554in.m19713a(this.f23642S1, i));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.f23660i2 != i) {
            this.f23660i2 = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f23661j2 != colorFilter) {
            this.f23661j2 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f23663l2 != colorStateList) {
            this.f23663l2 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f23664m2 != mode) {
            this.f23664m2 = mode;
            this.f23662k2 = vj1.m53414b(this, this.f23663l2, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (mo32330S2()) {
            visible |= this.f23678u1.setVisible(z, z2);
        }
        if (mo32327R2()) {
            visible |= this.f23630G1.setVisible(z, z2);
        }
        if (mo32333T2()) {
            visible |= this.f23685z1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t0 */
    public final void mo32406t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo32333T2()) {
            float f = this.f23641R1 + this.f23640Q1;
            if (ij1.m19647f(this) == 0) {
                float f2 = ((float) rect.right) - f;
                rectF.right = f2;
                rectF.left = f2 - this.f23626C1;
            } else {
                float f3 = ((float) rect.left) + f;
                rectF.left = f3;
                rectF.right = f3 + this.f23626C1;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f23626C1;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: t1 */
    public boolean mo32407t1() {
        return this.f23628E1;
    }

    /* renamed from: t2 */
    public void mo32408t2(boolean z) {
        boolean z2;
        if (this.f23684y1 != z) {
            boolean T2 = mo32333T2();
            this.f23684y1 = z;
            boolean T22 = mo32333T2();
            if (T2 != T22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (T22) {
                    mo32389p0(this.f23685z1);
                } else {
                    mo32336U2(this.f23685z1);
                }
                invalidateSelf();
                mo32275A1();
            }
        }
    }

    /* renamed from: u0 */
    public final void mo32409u0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (mo32333T2()) {
            float f = this.f23641R1 + this.f23640Q1 + this.f23626C1 + this.f23639P1 + this.f23638O1;
            if (ij1.m19647f(this) == 0) {
                float f2 = (float) rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = (float) i;
                rectF.right = ((float) i) + f;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: u1 */
    public boolean mo32410u1() {
        return m35010y1(this.f23685z1);
    }

    /* renamed from: u2 */
    public void mo32411u2(C4242a aVar) {
        this.f23671q2 = new WeakReference<>(aVar);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v0 */
    public float mo32413v0() {
        if (mo32333T2()) {
            return this.f23639P1 + this.f23626C1 + this.f23640Q1;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: v1 */
    public boolean mo32414v1() {
        return this.f23684y1;
    }

    /* renamed from: v2 */
    public void mo32415v2(TextUtils.TruncateAt truncateAt) {
        this.f23673r2 = truncateAt;
    }

    /* renamed from: w0 */
    public final void mo32416w0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f23674s1 != null) {
            float r0 = this.f23634K1 + mo32395r0() + this.f23637N1;
            float v0 = this.f23641R1 + mo32413v0() + this.f23638O1;
            if (ij1.m19647f(this) == 0) {
                rectF.left = ((float) rect.left) + r0;
                rectF.right = ((float) rect.right) - v0;
            } else {
                rectF.left = ((float) rect.left) + v0;
                rectF.right = ((float) rect.right) - r0;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    /* renamed from: w2 */
    public void mo32417w2(vy3 vy3) {
        this.f23633J1 = vy3;
    }

    /* renamed from: x0 */
    public final float mo32418x0() {
        this.f23649Z1.mo44537e().getFontMetrics(this.f23645V1);
        Paint.FontMetrics fontMetrics = this.f23645V1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: x2 */
    public void mo32419x2(int i) {
        mo32417w2(vy3.m53611d(this.f23642S1, i));
    }

    /* renamed from: y0 */
    public Paint.Align mo32420y0(Rect rect, PointF pointF) {
        pointF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f23674s1 != null) {
            float r0 = this.f23634K1 + mo32395r0() + this.f23637N1;
            if (ij1.m19647f(this) == 0) {
                pointF.x = ((float) rect.left) + r0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = ((float) rect.right) - r0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = ((float) rect.centerY()) - mo32418x0();
        }
        return align;
    }

    /* renamed from: y2 */
    public void mo32421y2(float f) {
        if (this.f23636M1 != f) {
            float r0 = mo32395r0();
            this.f23636M1 = f;
            float r02 = mo32395r0();
            invalidateSelf();
            if (r0 != r02) {
                mo32275A1();
            }
        }
    }

    /* renamed from: z0 */
    public final boolean mo32422z0() {
        if (!this.f23629F1 || this.f23630G1 == null || !this.f23628E1) {
            return false;
        }
        return true;
    }

    /* renamed from: z1 */
    public final void mo32423z1(AttributeSet attributeSet, int i, int i2) {
        TypedArray h = wo6.m54004h(this.f23642S1, attributeSet, u55.Chip, i, i2, new int[0]);
        this.f23679u2 = h.hasValue(u55.Chip_shapeAppearance);
        mo32362g2(to3.m52391b(this.f23642S1, h, u55.Chip_chipSurfaceColor));
        mo32305K1(to3.m52391b(this.f23642S1, h, u55.Chip_chipBackgroundColor));
        mo32346Y1(h.getDimension(u55.Chip_chipMinHeight, Utils.FLOAT_EPSILON));
        int i3 = u55.Chip_chipCornerRadius;
        if (h.hasValue(i3)) {
            mo32311M1(h.getDimension(i3, Utils.FLOAT_EPSILON));
        }
        mo32354c2(to3.m52391b(this.f23642S1, h, u55.Chip_chipStrokeColor));
        mo32358e2(h.getDimension(u55.Chip_chipStrokeWidth, Utils.FLOAT_EPSILON));
        mo32285D2(to3.m52391b(this.f23642S1, h, u55.Chip_rippleColor));
        mo32300I2(h.getText(u55.Chip_android_text));
        bn6 f = to3.m52395f(this.f23642S1, h, u55.Chip_android_textAppearance);
        f.f21416n = h.getDimension(u55.Chip_android_textSize, f.f21416n);
        mo32303J2(f);
        int i4 = h.getInt(u55.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            mo32415v2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            mo32415v2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            mo32415v2(TextUtils.TruncateAt.END);
        }
        mo32344X1(h.getBoolean(u55.Chip_chipIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            mo32344X1(h.getBoolean(u55.Chip_chipIconEnabled, false));
        }
        mo32323Q1(to3.m52393d(this.f23642S1, h, u55.Chip_chipIcon));
        int i5 = u55.Chip_chipIconTint;
        if (h.hasValue(i5)) {
            mo32335U1(to3.m52391b(this.f23642S1, h, i5));
        }
        mo32329S1(h.getDimension(u55.Chip_chipIconSize, -1.0f));
        mo32408t2(h.getBoolean(u55.Chip_closeIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            mo32408t2(h.getBoolean(u55.Chip_closeIconEnabled, false));
        }
        mo32370h2(to3.m52393d(this.f23642S1, h, u55.Chip_closeIcon));
        mo32397r2(to3.m52391b(this.f23642S1, h, u55.Chip_closeIconTint));
        mo32382m2(h.getDimension(u55.Chip_closeIconSize, Utils.FLOAT_EPSILON));
        mo32281C1(h.getBoolean(u55.Chip_android_checkable, false));
        mo32302J1(h.getBoolean(u55.Chip_checkedIconVisible, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            mo32302J1(h.getBoolean(u55.Chip_checkedIconEnabled, false));
        }
        mo32287E1(to3.m52393d(this.f23642S1, h, u55.Chip_checkedIcon));
        int i6 = u55.Chip_checkedIconTint;
        if (h.hasValue(i6)) {
            mo32293G1(to3.m52391b(this.f23642S1, h, i6));
        }
        mo32294G2(vy3.m53610c(this.f23642S1, h, u55.Chip_showMotionSpec));
        mo32417w2(vy3.m53610c(this.f23642S1, h, u55.Chip_hideMotionSpec));
        mo32350a2(h.getDimension(u55.Chip_chipStartPadding, Utils.FLOAT_EPSILON));
        mo32276A2(h.getDimension(u55.Chip_iconStartPadding, Utils.FLOAT_EPSILON));
        mo32421y2(h.getDimension(u55.Chip_iconEndPadding, Utils.FLOAT_EPSILON));
        mo32315N2(h.getDimension(u55.Chip_textStartPadding, Utils.FLOAT_EPSILON));
        mo32309L2(h.getDimension(u55.Chip_textEndPadding, Utils.FLOAT_EPSILON));
        mo32386o2(h.getDimension(u55.Chip_closeIconStartPadding, Utils.FLOAT_EPSILON));
        mo32376j2(h.getDimension(u55.Chip_closeIconEndPadding, Utils.FLOAT_EPSILON));
        mo32317O1(h.getDimension(u55.Chip_chipEndPadding, Utils.FLOAT_EPSILON));
        mo32282C2(h.getDimensionPixelSize(u55.Chip_android_maxWidth, Integer.MAX_VALUE));
        h.recycle();
    }

    /* renamed from: z2 */
    public void mo32424z2(int i) {
        mo32421y2(this.f23642S1.getResources().getDimension(i));
    }
}
