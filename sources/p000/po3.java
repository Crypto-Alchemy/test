package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* renamed from: po3 */
/* compiled from: MaterialButtonHelper */
public class po3 {

    /* renamed from: t */
    public static final boolean f32756t = true;

    /* renamed from: a */
    public final MaterialButton f32757a;

    /* renamed from: b */
    public rz5 f32758b;

    /* renamed from: c */
    public int f32759c;

    /* renamed from: d */
    public int f32760d;

    /* renamed from: e */
    public int f32761e;

    /* renamed from: f */
    public int f32762f;

    /* renamed from: g */
    public int f32763g;

    /* renamed from: h */
    public int f32764h;

    /* renamed from: i */
    public PorterDuff.Mode f32765i;

    /* renamed from: j */
    public ColorStateList f32766j;

    /* renamed from: k */
    public ColorStateList f32767k;

    /* renamed from: l */
    public ColorStateList f32768l;

    /* renamed from: m */
    public Drawable f32769m;

    /* renamed from: n */
    public boolean f32770n = false;

    /* renamed from: o */
    public boolean f32771o = false;

    /* renamed from: p */
    public boolean f32772p = false;

    /* renamed from: q */
    public boolean f32773q;

    /* renamed from: r */
    public LayerDrawable f32774r;

    /* renamed from: s */
    public int f32775s;

    public po3(MaterialButton materialButton, rz5 rz5) {
        this.f32757a = materialButton;
        this.f32758b = rz5;
    }

    /* renamed from: A */
    public void mo46795A(ColorStateList colorStateList) {
        if (this.f32767k != colorStateList) {
            this.f32767k = colorStateList;
            mo46802H();
        }
    }

    /* renamed from: B */
    public void mo46796B(int i) {
        if (this.f32764h != i) {
            this.f32764h = i;
            mo46802H();
        }
    }

    /* renamed from: C */
    public void mo46797C(ColorStateList colorStateList) {
        if (this.f32766j != colorStateList) {
            this.f32766j = colorStateList;
            if (mo46809f() != null) {
                ij1.m19656o(mo46809f(), this.f32766j);
            }
        }
    }

    /* renamed from: D */
    public void mo46798D(PorterDuff.Mode mode) {
        if (this.f32765i != mode) {
            this.f32765i = mode;
            if (mo46809f() != null && this.f32765i != null) {
                ij1.m19657p(mo46809f(), this.f32765i);
            }
        }
    }

    /* renamed from: E */
    public final void mo46799E(int i, int i2) {
        int G = ga7.m17725G(this.f32757a);
        int paddingTop = this.f32757a.getPaddingTop();
        int F = ga7.m17723F(this.f32757a);
        int paddingBottom = this.f32757a.getPaddingBottom();
        int i3 = this.f32761e;
        int i4 = this.f32762f;
        this.f32762f = i2;
        this.f32761e = i;
        if (!this.f32771o) {
            mo46800F();
        }
        ga7.m17722E0(this.f32757a, G, (paddingTop + i) - i3, F, (paddingBottom + i2) - i4);
    }

    /* renamed from: F */
    public final void mo46800F() {
        this.f32757a.setInternalBackground(mo46804a());
        uo3 f = mo46809f();
        if (f != null) {
            f.mo48439Z((float) this.f32775s);
        }
    }

    /* renamed from: G */
    public final void mo46801G(rz5 rz5) {
        if (mo46809f() != null) {
            mo46809f().setShapeAppearanceModel(rz5);
        }
        if (mo46817n() != null) {
            mo46817n().setShapeAppearanceModel(rz5);
        }
        if (mo46808e() != null) {
            mo46808e().setShapeAppearanceModel(rz5);
        }
    }

    /* renamed from: H */
    public final void mo46802H() {
        int i;
        uo3 f = mo46809f();
        uo3 n = mo46817n();
        if (f != null) {
            f.mo48458j0((float) this.f32764h, this.f32767k);
            if (n != null) {
                float f2 = (float) this.f32764h;
                if (this.f32770n) {
                    i = ro3.m51198d(this.f32757a, j15.colorSurface);
                } else {
                    i = 0;
                }
                n.mo48455i0(f2, i);
            }
        }
    }

    /* renamed from: I */
    public final InsetDrawable mo46803I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f32759c, this.f32761e, this.f32760d, this.f32762f);
    }

    /* renamed from: a */
    public final Drawable mo46804a() {
        int i;
        uo3 uo3 = new uo3(this.f32758b);
        uo3.mo48430P(this.f32757a.getContext());
        ij1.m19656o(uo3, this.f32766j);
        PorterDuff.Mode mode = this.f32765i;
        if (mode != null) {
            ij1.m19657p(uo3, mode);
        }
        uo3.mo48458j0((float) this.f32764h, this.f32767k);
        uo3 uo32 = new uo3(this.f32758b);
        uo32.setTint(0);
        float f = (float) this.f32764h;
        if (this.f32770n) {
            i = ro3.m51198d(this.f32757a, j15.colorSurface);
        } else {
            i = 0;
        }
        uo32.mo48455i0(f, i);
        if (f32756t) {
            uo3 uo33 = new uo3(this.f32758b);
            this.f32769m = uo33;
            ij1.m19655n(uo33, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(bh5.m32533d(this.f32768l), mo46803I(new LayerDrawable(new Drawable[]{uo32, uo3})), this.f32769m);
            this.f32774r = rippleDrawable;
            return rippleDrawable;
        }
        yg5 yg5 = new yg5(this.f32758b);
        this.f32769m = yg5;
        ij1.m19656o(yg5, bh5.m32533d(this.f32768l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{uo32, uo3, this.f32769m});
        this.f32774r = layerDrawable;
        return mo46803I(layerDrawable);
    }

    /* renamed from: b */
    public int mo46805b() {
        return this.f32763g;
    }

    /* renamed from: c */
    public int mo46806c() {
        return this.f32762f;
    }

    /* renamed from: d */
    public int mo46807d() {
        return this.f32761e;
    }

    /* renamed from: e */
    public vz5 mo46808e() {
        LayerDrawable layerDrawable = this.f32774r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f32774r.getNumberOfLayers() > 2) {
            return (vz5) this.f32774r.getDrawable(2);
        }
        return (vz5) this.f32774r.getDrawable(1);
    }

    /* renamed from: f */
    public uo3 mo46809f() {
        return mo46810g(false);
    }

    /* renamed from: g */
    public final uo3 mo46810g(boolean z) {
        LayerDrawable layerDrawable = this.f32774r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f32756t) {
            return (uo3) ((LayerDrawable) ((InsetDrawable) this.f32774r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (uo3) this.f32774r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: h */
    public ColorStateList mo46811h() {
        return this.f32768l;
    }

    /* renamed from: i */
    public rz5 mo46812i() {
        return this.f32758b;
    }

    /* renamed from: j */
    public ColorStateList mo46813j() {
        return this.f32767k;
    }

    /* renamed from: k */
    public int mo46814k() {
        return this.f32764h;
    }

    /* renamed from: l */
    public ColorStateList mo46815l() {
        return this.f32766j;
    }

    /* renamed from: m */
    public PorterDuff.Mode mo46816m() {
        return this.f32765i;
    }

    /* renamed from: n */
    public final uo3 mo46817n() {
        return mo46810g(true);
    }

    /* renamed from: o */
    public boolean mo46818o() {
        return this.f32771o;
    }

    /* renamed from: p */
    public boolean mo46819p() {
        return this.f32773q;
    }

    /* renamed from: q */
    public void mo46820q(TypedArray typedArray) {
        this.f32759c = typedArray.getDimensionPixelOffset(u55.MaterialButton_android_insetLeft, 0);
        this.f32760d = typedArray.getDimensionPixelOffset(u55.MaterialButton_android_insetRight, 0);
        this.f32761e = typedArray.getDimensionPixelOffset(u55.MaterialButton_android_insetTop, 0);
        this.f32762f = typedArray.getDimensionPixelOffset(u55.MaterialButton_android_insetBottom, 0);
        int i = u55.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.f32763g = dimensionPixelSize;
            mo46828y(this.f32758b.mo47586w((float) dimensionPixelSize));
            this.f32772p = true;
        }
        this.f32764h = typedArray.getDimensionPixelSize(u55.MaterialButton_strokeWidth, 0);
        this.f32765i = pe7.m49903i(typedArray.getInt(u55.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f32766j = to3.m52391b(this.f32757a.getContext(), typedArray, u55.MaterialButton_backgroundTint);
        this.f32767k = to3.m52391b(this.f32757a.getContext(), typedArray, u55.MaterialButton_strokeColor);
        this.f32768l = to3.m52391b(this.f32757a.getContext(), typedArray, u55.MaterialButton_rippleColor);
        this.f32773q = typedArray.getBoolean(u55.MaterialButton_android_checkable, false);
        this.f32775s = typedArray.getDimensionPixelSize(u55.MaterialButton_elevation, 0);
        int G = ga7.m17725G(this.f32757a);
        int paddingTop = this.f32757a.getPaddingTop();
        int F = ga7.m17723F(this.f32757a);
        int paddingBottom = this.f32757a.getPaddingBottom();
        if (typedArray.hasValue(u55.MaterialButton_android_background)) {
            mo46822s();
        } else {
            mo46800F();
        }
        ga7.m17722E0(this.f32757a, G + this.f32759c, paddingTop + this.f32761e, F + this.f32760d, paddingBottom + this.f32762f);
    }

    /* renamed from: r */
    public void mo46821r(int i) {
        if (mo46809f() != null) {
            mo46809f().setTint(i);
        }
    }

    /* renamed from: s */
    public void mo46822s() {
        this.f32771o = true;
        this.f32757a.setSupportBackgroundTintList(this.f32766j);
        this.f32757a.setSupportBackgroundTintMode(this.f32765i);
    }

    /* renamed from: t */
    public void mo46823t(boolean z) {
        this.f32773q = z;
    }

    /* renamed from: u */
    public void mo46824u(int i) {
        if (!this.f32772p || this.f32763g != i) {
            this.f32763g = i;
            this.f32772p = true;
            mo46828y(this.f32758b.mo47586w((float) i));
        }
    }

    /* renamed from: v */
    public void mo46825v(int i) {
        mo46799E(this.f32761e, i);
    }

    /* renamed from: w */
    public void mo46826w(int i) {
        mo46799E(i, this.f32762f);
    }

    /* renamed from: x */
    public void mo46827x(ColorStateList colorStateList) {
        if (this.f32768l != colorStateList) {
            this.f32768l = colorStateList;
            boolean z = f32756t;
            if (z && (this.f32757a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f32757a.getBackground()).setColor(bh5.m32533d(colorStateList));
            } else if (!z && (this.f32757a.getBackground() instanceof yg5)) {
                ((yg5) this.f32757a.getBackground()).setTintList(bh5.m32533d(colorStateList));
            }
        }
    }

    /* renamed from: y */
    public void mo46828y(rz5 rz5) {
        this.f32758b = rz5;
        mo46801G(rz5);
    }

    /* renamed from: z */
    public void mo46829z(boolean z) {
        this.f32770n = z;
        mo46802H();
    }
}
