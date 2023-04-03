package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.card.MaterialCardView;
import p000.rz5;

/* renamed from: qo3 */
/* compiled from: MaterialCardViewHelper */
public class qo3 {

    /* renamed from: t */
    public static final int[] f33187t = {16842912};

    /* renamed from: u */
    public static final double f33188u = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public final MaterialCardView f33189a;

    /* renamed from: b */
    public final Rect f33190b = new Rect();

    /* renamed from: c */
    public final uo3 f33191c;

    /* renamed from: d */
    public final uo3 f33192d;

    /* renamed from: e */
    public int f33193e;

    /* renamed from: f */
    public int f33194f;

    /* renamed from: g */
    public int f33195g;

    /* renamed from: h */
    public Drawable f33196h;

    /* renamed from: i */
    public Drawable f33197i;

    /* renamed from: j */
    public ColorStateList f33198j;

    /* renamed from: k */
    public ColorStateList f33199k;

    /* renamed from: l */
    public rz5 f33200l;

    /* renamed from: m */
    public ColorStateList f33201m;

    /* renamed from: n */
    public Drawable f33202n;

    /* renamed from: o */
    public LayerDrawable f33203o;

    /* renamed from: p */
    public uo3 f33204p;

    /* renamed from: q */
    public uo3 f33205q;

    /* renamed from: r */
    public boolean f33206r = false;

    /* renamed from: s */
    public boolean f33207s;

    /* renamed from: qo3$a */
    /* compiled from: MaterialCardViewHelper */
    public class C6418a extends InsetDrawable {
        public C6418a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public qo3(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.f33189a = materialCardView;
        uo3 uo3 = new uo3(materialCardView.getContext(), attributeSet, i, i2);
        this.f33191c = uo3;
        uo3.mo48430P(materialCardView.getContext());
        uo3.mo48448g0(-12303292);
        rz5.C6470b v = uo3.mo48418D().mo47585v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, u55.CardView, i, e55.CardView);
        int i3 = u55.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo47600o(obtainStyledAttributes.getDimension(i3, Utils.FLOAT_EPSILON));
        }
        this.f33192d = new uo3();
        mo47176R(v.mo47599m());
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public Rect mo47159A() {
        return this.f33190b;
    }

    /* renamed from: B */
    public final Drawable mo47160B(Drawable drawable) {
        int i;
        int i2;
        if (this.f33189a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) mo47191d());
            i2 = (int) Math.ceil((double) mo47189c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C6418a(drawable, i2, i, i2, i);
    }

    /* renamed from: C */
    public boolean mo47161C() {
        return this.f33206r;
    }

    /* renamed from: D */
    public boolean mo47162D() {
        return this.f33207s;
    }

    /* renamed from: E */
    public void mo47163E(TypedArray typedArray) {
        Drawable drawable;
        ColorStateList b = to3.m52391b(this.f33189a.getContext(), typedArray, u55.MaterialCardView_strokeColor);
        this.f33201m = b;
        if (b == null) {
            this.f33201m = ColorStateList.valueOf(-1);
        }
        this.f33195g = typedArray.getDimensionPixelSize(u55.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(u55.MaterialCardView_android_checkable, false);
        this.f33207s = z;
        this.f33189a.setLongClickable(z);
        this.f33199k = to3.m52391b(this.f33189a.getContext(), typedArray, u55.MaterialCardView_checkedIconTint);
        mo47169K(to3.m52393d(this.f33189a.getContext(), typedArray, u55.MaterialCardView_checkedIcon));
        mo47171M(typedArray.getDimensionPixelSize(u55.MaterialCardView_checkedIconSize, 0));
        mo47170L(typedArray.getDimensionPixelSize(u55.MaterialCardView_checkedIconMargin, 0));
        ColorStateList b2 = to3.m52391b(this.f33189a.getContext(), typedArray, u55.MaterialCardView_rippleColor);
        this.f33198j = b2;
        if (b2 == null) {
            this.f33198j = ColorStateList.valueOf(ro3.m51198d(this.f33189a, j15.colorControlHighlight));
        }
        mo47167I(to3.m52391b(this.f33189a.getContext(), typedArray, u55.MaterialCardView_cardForegroundColor));
        mo47190c0();
        mo47184Z();
        mo47192d0();
        this.f33189a.setBackgroundInternal(mo47160B(this.f33191c));
        if (this.f33189a.isClickable()) {
            drawable = mo47206r();
        } else {
            drawable = this.f33192d;
        }
        this.f33196h = drawable;
        this.f33189a.setForeground(mo47160B(drawable));
    }

    /* renamed from: F */
    public void mo47164F(int i, int i2) {
        int i3;
        int i4;
        if (this.f33203o != null) {
            int i5 = this.f33193e;
            int i6 = this.f33194f;
            int i7 = (i - i5) - i6;
            int i8 = (i2 - i5) - i6;
            if (this.f33189a.getUseCompatPadding()) {
                i8 -= (int) Math.ceil((double) (mo47191d() * 2.0f));
                i7 -= (int) Math.ceil((double) (mo47189c() * 2.0f));
            }
            int i9 = i8;
            int i10 = this.f33193e;
            if (ga7.m17715B(this.f33189a) == 1) {
                i3 = i7;
                i4 = i10;
            } else {
                i4 = i7;
                i3 = i10;
            }
            this.f33203o.setLayerInset(2, i4, this.f33193e, i3, i9);
        }
    }

    /* renamed from: G */
    public void mo47165G(boolean z) {
        this.f33206r = z;
    }

    /* renamed from: H */
    public void mo47166H(ColorStateList colorStateList) {
        this.f33191c.mo48440a0(colorStateList);
    }

    /* renamed from: I */
    public void mo47167I(ColorStateList colorStateList) {
        uo3 uo3 = this.f33192d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        uo3.mo48440a0(colorStateList);
    }

    /* renamed from: J */
    public void mo47168J(boolean z) {
        this.f33207s = z;
    }

    /* renamed from: K */
    public void mo47169K(Drawable drawable) {
        this.f33197i = drawable;
        if (drawable != null) {
            Drawable r = ij1.m19659r(drawable.mutate());
            this.f33197i = r;
            ij1.m19656o(r, this.f33199k);
        }
        if (this.f33203o != null) {
            this.f33203o.setDrawableByLayerId(g35.mtrl_card_checked_layer_id, mo47194f());
        }
    }

    /* renamed from: L */
    public void mo47170L(int i) {
        this.f33193e = i;
    }

    /* renamed from: M */
    public void mo47171M(int i) {
        this.f33194f = i;
    }

    /* renamed from: N */
    public void mo47172N(ColorStateList colorStateList) {
        this.f33199k = colorStateList;
        Drawable drawable = this.f33197i;
        if (drawable != null) {
            ij1.m19656o(drawable, colorStateList);
        }
    }

    /* renamed from: O */
    public void mo47173O(float f) {
        mo47176R(this.f33200l.mo47586w(f));
        this.f33196h.invalidateSelf();
        if (mo47181W() || mo47180V()) {
            mo47183Y();
        }
        if (mo47181W()) {
            mo47188b0();
        }
    }

    /* renamed from: P */
    public void mo47174P(float f) {
        this.f33191c.mo48441b0(f);
        uo3 uo3 = this.f33192d;
        if (uo3 != null) {
            uo3.mo48441b0(f);
        }
        uo3 uo32 = this.f33205q;
        if (uo32 != null) {
            uo32.mo48441b0(f);
        }
    }

    /* renamed from: Q */
    public void mo47175Q(ColorStateList colorStateList) {
        this.f33198j = colorStateList;
        mo47190c0();
    }

    /* renamed from: R */
    public void mo47176R(rz5 rz5) {
        this.f33200l = rz5;
        this.f33191c.setShapeAppearanceModel(rz5);
        uo3 uo3 = this.f33191c;
        uo3.mo48446f0(!uo3.mo48433S());
        uo3 uo32 = this.f33192d;
        if (uo32 != null) {
            uo32.setShapeAppearanceModel(rz5);
        }
        uo3 uo33 = this.f33205q;
        if (uo33 != null) {
            uo33.setShapeAppearanceModel(rz5);
        }
        uo3 uo34 = this.f33204p;
        if (uo34 != null) {
            uo34.setShapeAppearanceModel(rz5);
        }
    }

    /* renamed from: S */
    public void mo47177S(ColorStateList colorStateList) {
        if (this.f33201m != colorStateList) {
            this.f33201m = colorStateList;
            mo47192d0();
        }
    }

    /* renamed from: T */
    public void mo47178T(int i) {
        if (i != this.f33195g) {
            this.f33195g = i;
            mo47192d0();
        }
    }

    /* renamed from: U */
    public void mo47179U(int i, int i2, int i3, int i4) {
        this.f33190b.set(i, i2, i3, i4);
        mo47183Y();
    }

    /* renamed from: V */
    public final boolean mo47180V() {
        if (!this.f33189a.getPreventCornerOverlap() || mo47193e()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public final boolean mo47181W() {
        if (!this.f33189a.getPreventCornerOverlap() || !mo47193e() || !this.f33189a.getUseCompatPadding()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public void mo47182X() {
        Drawable drawable;
        Drawable drawable2 = this.f33196h;
        if (this.f33189a.isClickable()) {
            drawable = mo47206r();
        } else {
            drawable = this.f33192d;
        }
        this.f33196h = drawable;
        if (drawable2 != drawable) {
            mo47186a0(drawable);
        }
    }

    /* renamed from: Y */
    public void mo47183Y() {
        boolean z;
        float f;
        if (mo47180V() || mo47181W()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = mo47185a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        int t = (int) (f - mo47208t());
        MaterialCardView materialCardView = this.f33189a;
        Rect rect = this.f33190b;
        materialCardView.mo32048j(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    /* renamed from: Z */
    public void mo47184Z() {
        this.f33191c.mo48439Z(this.f33189a.getCardElevation());
    }

    /* renamed from: a */
    public final float mo47185a() {
        return Math.max(Math.max(mo47187b(this.f33200l.mo47580q(), this.f33191c.mo48423I()), mo47187b(this.f33200l.mo47582s(), this.f33191c.mo48424J())), Math.max(mo47187b(this.f33200l.mo47575k(), this.f33191c.mo48474t()), mo47187b(this.f33200l.mo47573i(), this.f33191c.mo48472s())));
    }

    /* renamed from: a0 */
    public final void mo47186a0(Drawable drawable) {
        if (this.f33189a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f33189a.getForeground()).setDrawable(drawable);
        } else {
            this.f33189a.setForeground(mo47160B(drawable));
        }
    }

    /* renamed from: b */
    public final float mo47187b(eu0 eu0, float f) {
        if (eu0 instanceof fi5) {
            return (float) ((1.0d - f33188u) * ((double) f));
        }
        if (eu0 instanceof az0) {
            return f / 2.0f;
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: b0 */
    public void mo47188b0() {
        if (!mo47161C()) {
            this.f33189a.setBackgroundInternal(mo47160B(this.f33191c));
        }
        this.f33189a.setForeground(mo47160B(this.f33196h));
    }

    /* renamed from: c */
    public final float mo47189c() {
        float f;
        float maxCardElevation = this.f33189a.getMaxCardElevation();
        if (mo47181W()) {
            f = mo47185a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return maxCardElevation + f;
    }

    /* renamed from: c0 */
    public final void mo47190c0() {
        Drawable drawable;
        if (!bh5.f21304a || (drawable = this.f33202n) == null) {
            uo3 uo3 = this.f33204p;
            if (uo3 != null) {
                uo3.mo48440a0(this.f33198j);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f33198j);
    }

    /* renamed from: d */
    public final float mo47191d() {
        float f;
        float maxCardElevation = this.f33189a.getMaxCardElevation() * 1.5f;
        if (mo47181W()) {
            f = mo47185a();
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        return maxCardElevation + f;
    }

    /* renamed from: d0 */
    public void mo47192d0() {
        this.f33192d.mo48458j0((float) this.f33195g, this.f33201m);
    }

    /* renamed from: e */
    public final boolean mo47193e() {
        if (this.f33191c.mo48433S()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Drawable mo47194f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable drawable = this.f33197i;
        if (drawable != null) {
            stateListDrawable.addState(f33187t, drawable);
        }
        return stateListDrawable;
    }

    /* renamed from: g */
    public final Drawable mo47195g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        uo3 i = mo47197i();
        this.f33204p = i;
        i.mo48440a0(this.f33198j);
        stateListDrawable.addState(new int[]{16842919}, this.f33204p);
        return stateListDrawable;
    }

    /* renamed from: h */
    public final Drawable mo47196h() {
        if (!bh5.f21304a) {
            return mo47195g();
        }
        this.f33205q = mo47197i();
        return new RippleDrawable(this.f33198j, (Drawable) null, this.f33205q);
    }

    /* renamed from: i */
    public final uo3 mo47197i() {
        return new uo3(this.f33200l);
    }

    /* renamed from: j */
    public void mo47198j() {
        Drawable drawable = this.f33202n;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f33202n.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f33202n.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    /* renamed from: k */
    public uo3 mo47199k() {
        return this.f33191c;
    }

    /* renamed from: l */
    public ColorStateList mo47200l() {
        return this.f33191c.mo48478x();
    }

    /* renamed from: m */
    public ColorStateList mo47201m() {
        return this.f33192d.mo48478x();
    }

    /* renamed from: n */
    public Drawable mo47202n() {
        return this.f33197i;
    }

    /* renamed from: o */
    public int mo47203o() {
        return this.f33193e;
    }

    /* renamed from: p */
    public int mo47204p() {
        return this.f33194f;
    }

    /* renamed from: q */
    public ColorStateList mo47205q() {
        return this.f33199k;
    }

    /* renamed from: r */
    public final Drawable mo47206r() {
        if (this.f33202n == null) {
            this.f33202n = mo47196h();
        }
        if (this.f33203o == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f33202n, this.f33192d, mo47194f()});
            this.f33203o = layerDrawable;
            layerDrawable.setId(2, g35.mtrl_card_checked_layer_id);
        }
        return this.f33203o;
    }

    /* renamed from: s */
    public float mo47207s() {
        return this.f33191c.mo48423I();
    }

    /* renamed from: t */
    public final float mo47208t() {
        if (!this.f33189a.getPreventCornerOverlap() || !this.f33189a.getUseCompatPadding()) {
            return Utils.FLOAT_EPSILON;
        }
        return (float) ((1.0d - f33188u) * ((double) this.f33189a.getCardViewRadius()));
    }

    /* renamed from: u */
    public float mo47209u() {
        return this.f33191c.mo48479y();
    }

    /* renamed from: v */
    public ColorStateList mo47210v() {
        return this.f33198j;
    }

    /* renamed from: w */
    public rz5 mo47211w() {
        return this.f33200l;
    }

    /* renamed from: x */
    public int mo47212x() {
        ColorStateList colorStateList = this.f33201m;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: y */
    public ColorStateList mo47213y() {
        return this.f33201m;
    }

    /* renamed from: z */
    public int mo47214z() {
        return this.f33195g;
    }
}
