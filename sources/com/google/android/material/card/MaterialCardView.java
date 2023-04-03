package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class MaterialCardView extends CardView implements Checkable, vz5 {

    /* renamed from: L */
    public static final int[] f23573L = {16842911};

    /* renamed from: M */
    public static final int[] f23574M = {16842912};

    /* renamed from: P */
    public static final int[] f23575P = {j15.state_dragged};

    /* renamed from: Q */
    public static final int f23576Q = e55.Widget_MaterialComponents_CardView;

    /* renamed from: A */
    public final qo3 f23577A;

    /* renamed from: B */
    public boolean f23578B;

    /* renamed from: C */
    public boolean f23579C;

    /* renamed from: H */
    public boolean f23580H;

    /* renamed from: I */
    public C4233a f23581I;

    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public interface C4233a {
        /* renamed from: a */
        void mo32076a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f23577A.mo47199k().getBounds());
        return rectF;
    }

    /* renamed from: g */
    public final void mo32032g() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f23577A.mo47198j();
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.f23577A.mo47200l();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f23577A.mo47201m();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f23577A.mo47202n();
    }

    public int getCheckedIconMargin() {
        return this.f23577A.mo47203o();
    }

    public int getCheckedIconSize() {
        return this.f23577A.mo47204p();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f23577A.mo47205q();
    }

    public int getContentPaddingBottom() {
        return this.f23577A.mo47159A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f23577A.mo47159A().left;
    }

    public int getContentPaddingRight() {
        return this.f23577A.mo47159A().right;
    }

    public int getContentPaddingTop() {
        return this.f23577A.mo47159A().top;
    }

    public float getProgress() {
        return this.f23577A.mo47209u();
    }

    public float getRadius() {
        return this.f23577A.mo47207s();
    }

    public ColorStateList getRippleColor() {
        return this.f23577A.mo47210v();
    }

    public rz5 getShapeAppearanceModel() {
        return this.f23577A.mo47211w();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f23577A.mo47212x();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f23577A.mo47213y();
    }

    public int getStrokeWidth() {
        return this.f23577A.mo47214z();
    }

    /* renamed from: h */
    public boolean mo32045h() {
        qo3 qo3 = this.f23577A;
        if (qo3 == null || !qo3.mo47162D()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo32046i() {
        return this.f23580H;
    }

    public boolean isChecked() {
        return this.f23579C;
    }

    /* renamed from: j */
    public void mo32048j(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53444f(this, this.f23577A.mo47199k());
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo32045h()) {
            View.mergeDrawableStates(onCreateDrawableState, f23573L);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f23574M);
        }
        if (mo32046i()) {
            View.mergeDrawableStates(onCreateDrawableState, f23575P);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo32045h());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f23577A.mo47164F(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f23578B) {
            if (!this.f23577A.mo47161C()) {
                this.f23577A.mo47165G(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i) {
        this.f23577A.mo47166H(ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f23577A.mo47184Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f23577A.mo47167I(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f23577A.mo47168J(z);
    }

    public void setChecked(boolean z) {
        if (this.f23579C != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f23577A.mo47169K(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.f23577A.mo47170L(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f23577A.mo47170L(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(int i) {
        this.f23577A.mo47169K(C2554in.m19714b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f23577A.mo47171M(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f23577A.mo47171M(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f23577A.mo47172N(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        qo3 qo3 = this.f23577A;
        if (qo3 != null) {
            qo3.mo47182X();
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f23577A.mo47179U(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f23580H != z) {
            this.f23580H = z;
            refreshDrawableState();
            mo32032g();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f23577A.mo47188b0();
    }

    public void setOnCheckedChangeListener(C4233a aVar) {
        this.f23581I = aVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f23577A.mo47188b0();
        this.f23577A.mo47183Y();
    }

    public void setProgress(float f) {
        this.f23577A.mo47174P(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f23577A.mo47173O(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f23577A.mo47175Q(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.f23577A.mo47175Q(C2554in.m19713a(getContext(), i));
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        setClipToOutline(rz5.mo47584u(getBoundsAsRectF()));
        this.f23577A.mo47176R(rz5);
    }

    public void setStrokeColor(int i) {
        this.f23577A.mo47177S(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.f23577A.mo47178T(i);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f23577A.mo47188b0();
        this.f23577A.mo47183Y();
    }

    public void toggle() {
        if (mo32045h() && isEnabled()) {
            this.f23579C = !this.f23579C;
            refreshDrawableState();
            mo32032g();
            C4233a aVar = this.f23581I;
            if (aVar != null) {
                aVar.mo32076a(this, this.f23579C);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.materialCardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f23577A.mo47166H(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f23577A.mo47177S(colorStateList);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f23576Q
            android.content.Context r8 = p000.xo3.m54461c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f23579C = r8
            r7.f23580H = r8
            r0 = 1
            r7.f23578B = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = p000.u55.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            qo3 r0 = new qo3
            r0.<init>(r7, r9, r10, r6)
            r7.f23577A = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo47166H(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo47179U(r9, r10, r1, r2)
            r0.mo47163E(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
