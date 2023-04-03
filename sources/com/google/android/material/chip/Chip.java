package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.media3.common.PlaybackException;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.chip.C4241a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p000.C3335t8;

public class Chip extends AppCompatCheckBox implements C4241a.C4242a, vz5 {

    /* renamed from: b1 */
    public static final int[] f23586b1 = {16842913};

    /* renamed from: e1 */
    public static final int[] f23587e1 = {16842911};

    /* renamed from: k0 */
    public static final int f23588k0 = e55.Widget_MaterialComponents_Chip_Action;

    /* renamed from: v0 */
    public static final Rect f23589v0 = new Rect();

    /* renamed from: A */
    public boolean f23590A;

    /* renamed from: B */
    public boolean f23591B;

    /* renamed from: C */
    public boolean f23592C;

    /* renamed from: H */
    public boolean f23593H;

    /* renamed from: I */
    public boolean f23594I;

    /* renamed from: L */
    public int f23595L;

    /* renamed from: M */
    public int f23596M;

    /* renamed from: P */
    public final C4236c f23597P;

    /* renamed from: Q */
    public final Rect f23598Q;

    /* renamed from: U */
    public final RectF f23599U;

    /* renamed from: e0 */
    public final dn6 f23600e0;

    /* renamed from: k */
    public C4241a f23601k;

    /* renamed from: r */
    public InsetDrawable f23602r;

    /* renamed from: s */
    public RippleDrawable f23603s;

    /* renamed from: x */
    public View.OnClickListener f23604x;

    /* renamed from: y */
    public CompoundButton.OnCheckedChangeListener f23605y;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C4234a extends dn6 {
        public C4234a() {
        }

        /* renamed from: a */
        public void mo29667a(int i) {
        }

        /* renamed from: b */
        public void mo29668b(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            if (chip.f23601k.mo32324Q2()) {
                charSequence = Chip.this.f23601k.mo32381m1();
            } else {
                charSequence = Chip.this.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C4235b extends ViewOutlineProvider {
        public C4235b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f23601k != null) {
                Chip.this.f23601k.getOutline(outline);
            } else {
                outline.setAlpha(Utils.FLOAT_EPSILON);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C4236c extends ox1 {
        public C4236c(Chip chip) {
            super(chip);
        }

        /* renamed from: B */
        public int mo24223B(float f, float f2) {
            if (!Chip.this.mo32121n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) {
                return 0;
            }
            return 1;
        }

        /* renamed from: C */
        public void mo24224C(List<Integer> list) {
            list.add(0);
            if (Chip.this.mo32121n() && Chip.this.mo32134s() && Chip.this.f23604x != null) {
                list.add(1);
            }
        }

        /* renamed from: L */
        public boolean mo24231L(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo32227t();
            }
            return false;
        }

        /* renamed from: O */
        public void mo24234O(C3335t8 t8Var) {
            String str;
            t8Var.mo26234d0(Chip.this.mo32133r());
            t8Var.mo26241g0(Chip.this.isClickable());
            if (Chip.this.mo32133r() || Chip.this.isClickable()) {
                if (Chip.this.mo32133r()) {
                    str = "android.widget.CompoundButton";
                } else {
                    str = "android.widget.Button";
                }
                t8Var.mo26239f0(str);
            } else {
                t8Var.mo26239f0("android.view.View");
            }
            t8Var.mo26211M0(Chip.this.getText());
        }

        /* renamed from: P */
        public void mo24235P(int i, C3335t8 t8Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    t8Var.mo26247j0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = y45.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    t8Var.mo26247j0(context.getString(i2, objArr).trim());
                }
                t8Var.mo26228a0(Chip.this.getCloseIconTouchBoundsInt());
                t8Var.mo26229b(C3335t8.C3336a.f18008i);
                t8Var.mo26255n0(Chip.this.isEnabled());
                return;
            }
            t8Var.mo26247j0(charSequence);
            t8Var.mo26228a0(Chip.f23589v0);
        }

        /* renamed from: Q */
        public void mo24236Q(int i, boolean z) {
            if (i == 1) {
                boolean unused = Chip.this.f23593H = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f23599U.setEmpty();
        if (mo32121n() && this.f23604x != null) {
            this.f23601k.mo32355d1(this.f23599U);
        }
        return this.f23599U;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f23598Q.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f23598Q;
    }

    private bn6 getTextAppearance() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32383n1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f23592C != z) {
            this.f23592C = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f23591B != z) {
            this.f23591B = z;
            refreshDrawableState();
        }
    }

    /* renamed from: A */
    public final void mo32079A() {
        C4241a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f23601k) != null) {
            int O0 = (int) (aVar.mo32316O0() + this.f23601k.mo32385o1() + this.f23601k.mo32413v0());
            int T0 = (int) (this.f23601k.mo32331T0() + this.f23601k.mo32390p1() + this.f23601k.mo32395r0());
            if (this.f23602r != null) {
                Rect rect = new Rect();
                this.f23602r.getPadding(rect);
                T0 += rect.left;
                O0 += rect.right;
            }
            ga7.m17722E0(this, T0, getPaddingTop(), O0, getPaddingBottom());
        }
    }

    /* renamed from: B */
    public final void mo32080B() {
        TextPaint paint = getPaint();
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        bn6 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo29664j(getContext(), paint, this.f23600e0);
        }
    }

    /* renamed from: C */
    public final void mo32081C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
    }

    /* renamed from: a */
    public void mo32082a() {
        mo32118k(this.f23596M);
        requestLayout();
        invalidateOutline();
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (mo32120m(motionEvent) || this.f23597P.mo24252v(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f23597P.mo24253w(keyEvent) || this.f23597P.mo24222A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        C4241a aVar = this.f23601k;
        if (aVar == null || !aVar.mo32410u1()) {
            z = false;
        } else {
            z = this.f23601k.mo32394q2(mo32117j());
        }
        if (z) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f23602r;
        if (insetDrawable == null) {
            return this.f23601k;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32304K0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32307L0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32310M0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return Math.max(Utils.FLOAT_EPSILON, aVar.mo32313N0());
        }
        return Utils.FLOAT_EPSILON;
    }

    public Drawable getChipDrawable() {
        return this.f23601k;
    }

    public float getChipEndPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32316O0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public Drawable getChipIcon() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32319P0();
        }
        return null;
    }

    public float getChipIconSize() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32322Q0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipIconTint() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32325R0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32328S0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public float getChipStartPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32331T0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public ColorStateList getChipStrokeColor() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32334U0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32337V0();
        }
        return Utils.FLOAT_EPSILON;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32340W0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32343X0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32345Y0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public float getCloseIconSize() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32347Z0();
        }
        return Utils.FLOAT_EPSILON;
    }

    public float getCloseIconStartPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32349a1();
        }
        return Utils.FLOAT_EPSILON;
    }

    public ColorStateList getCloseIconTint() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32353c1();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32361g1();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f23597P.mo24222A() == 1 || this.f23597P.mo24254x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public vy3 getHideMotionSpec() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32369h1();
        }
        return null;
    }

    public float getIconEndPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32371i1();
        }
        return Utils.FLOAT_EPSILON;
    }

    public float getIconStartPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32375j1();
        }
        return Utils.FLOAT_EPSILON;
    }

    public ColorStateList getRippleColor() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32377k1();
        }
        return null;
    }

    public rz5 getShapeAppearanceModel() {
        return this.f23601k.mo48418D();
    }

    public vy3 getShowMotionSpec() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32379l1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32385o1();
        }
        return Utils.FLOAT_EPSILON;
    }

    public float getTextStartPadding() {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            return aVar.mo32390p1();
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: i */
    public final void mo32116i(C4241a aVar) {
        aVar.mo32411u2(this);
    }

    /* renamed from: j */
    public final int[] mo32117j() {
        int isEnabled = isEnabled();
        if (this.f23593H) {
            isEnabled++;
        }
        if (this.f23592C) {
            isEnabled++;
        }
        if (this.f23591B) {
            isEnabled++;
        }
        if (isChecked()) {
            isEnabled++;
        }
        int[] iArr = new int[isEnabled];
        int i = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f23593H) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f23592C) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f23591B) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean mo32118k(int i) {
        int i2;
        this.f23596M = i;
        int i3 = 0;
        if (!mo32229v()) {
            if (this.f23602r != null) {
                mo32228u();
            } else {
                mo32232y();
            }
            return false;
        }
        int max = Math.max(0, i - this.f23601k.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f23601k.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            if (max2 > 0) {
                i2 = max2 / 2;
            } else {
                i2 = 0;
            }
            if (max > 0) {
                i3 = max / 2;
            }
            if (this.f23602r != null) {
                Rect rect = new Rect();
                this.f23602r.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    mo32232y();
                    return true;
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            mo32132q(i2, i3, i2, i3);
            mo32232y();
            return true;
        }
        if (this.f23602r != null) {
            mo32228u();
        } else {
            mo32232y();
        }
        return false;
    }

    /* renamed from: l */
    public final void mo32119l() {
        if (getBackgroundDrawable() == this.f23602r && this.f23601k.getCallback() == null) {
            this.f23601k.setCallback(this.f23602r);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    public final boolean mo32120m(MotionEvent motionEvent) {
        Class<ox1> cls = ox1.class;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f23597P)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("X", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f23597P, new Object[]{Integer.MIN_VALUE});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo32121n() {
        C4241a aVar = this.f23601k;
        if (aVar == null || aVar.mo32340W0() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final void mo32122o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = wo6.m54004h(context, attributeSet, u55.Chip, i, f23588k0, new int[0]);
        this.f23594I = h.getBoolean(u55.Chip_ensureMinTouchTargetSize, false);
        this.f23596M = (int) Math.ceil((double) h.getDimension(u55.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) pe7.m49897c(getContext(), 48))));
        h.recycle();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53444f(this, this.f23601k);
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f23586b1);
        }
        if (mo32133r()) {
            View.mergeDrawableStates(onCreateDrawableState, f23587e1);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f23597P.mo24230K(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo32133r() || isClickable()) {
            if (mo32133r()) {
                str = "android.widget.CompoundButton";
            } else {
                str = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName(str);
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo32133r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
            if (chipGroup.mo32236c()) {
                i = chipGroup.mo32247o(this);
            } else {
                i = -1;
            }
            S0.mo26246i0(C3335t8.C3338c.m27596a(chipGroup.mo32940b(this), 1, i, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f23595L != i) {
            this.f23595L = i;
            mo32079A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f23591B
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f23591B
            if (r0 == 0) goto L_0x0034
            r5.mo32227t()
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo32131p() {
        setOutlineProvider(new C4235b());
    }

    /* renamed from: q */
    public final void mo32132q(int i, int i2, int i3, int i4) {
        this.f23602r = new InsetDrawable(this.f23601k, i, i2, i3, i4);
    }

    /* renamed from: r */
    public boolean mo32133r() {
        C4241a aVar = this.f23601k;
        if (aVar == null || !aVar.mo32407t1()) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean mo32134s() {
        C4241a aVar = this.f23601k;
        if (aVar == null || !aVar.mo32414v1()) {
            return false;
        }
        return true;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f23603s) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f23603s) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32281C1(z);
        }
    }

    public void setCheckableResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32284D1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C4241a aVar = this.f23601k;
        if (aVar == null) {
            this.f23590A = z;
        } else if (aVar.mo32407t1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f23605y) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32287E1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32290F1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32293G1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32296H1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32299I1(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32305K1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32308L1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32311M1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32314N1(i);
        }
    }

    public void setChipDrawable(C4241a aVar) {
        C4241a aVar2 = this.f23601k;
        if (aVar2 != aVar) {
            mo32230w(aVar2);
            this.f23601k = aVar;
            aVar.mo32291F2(false);
            mo32116i(this.f23601k);
            mo32118k(this.f23596M);
        }
    }

    public void setChipEndPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32317O1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32320P1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32323Q1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32326R1(i);
        }
    }

    public void setChipIconSize(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32329S1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32332T1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32335U1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32338V1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32341W1(i);
        }
    }

    public void setChipMinHeight(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32346Y1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32348Z1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32350a2(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32352b2(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32354c2(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32356d2(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32358e2(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32360f2(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32370h2(drawable);
        }
        mo32231x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32372i2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32376j2(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32378k2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32380l2(i);
        }
        mo32231x();
    }

    public void setCloseIconSize(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32382m2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32384n2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32386o2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32391p2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32397r2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32399s2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo48439Z(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f23601k != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C4241a aVar = this.f23601k;
                if (aVar != null) {
                    aVar.mo32415v2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f23594I = z;
        mo32118k(this.f23596M);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(vy3 vy3) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32417w2(vy3);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32419x2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32421y2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32424z2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32276A2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32279B2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f23601k != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32282C2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f23605y = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f23604x = onClickListener;
        mo32231x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32285D2(colorStateList);
        }
        if (!this.f23601k.mo32396r1()) {
            mo32233z();
        }
    }

    public void setRippleColorResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32288E2(i);
            if (!this.f23601k.mo32396r1()) {
                mo32233z();
            }
        }
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        this.f23601k.setShapeAppearanceModel(rz5);
    }

    public void setShowMotionSpec(vy3 vy3) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32294G2(vy3);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32297H2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.mo32324Q2()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C4241a aVar2 = this.f23601k;
            if (aVar2 != null) {
                aVar2.mo32300I2(charSequence);
            }
        }
    }

    public void setTextAppearance(bn6 bn6) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32303J2(bn6);
        }
        mo32080B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32309L2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32312M2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32315N2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32318O2(i);
        }
    }

    /* renamed from: t */
    public boolean mo32227t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f23604x;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f23597P.mo24242W(1, 1);
        return z;
    }

    /* renamed from: u */
    public final void mo32228u() {
        if (this.f23602r != null) {
            this.f23602r = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            mo32232y();
        }
    }

    /* renamed from: v */
    public boolean mo32229v() {
        return this.f23594I;
    }

    /* renamed from: w */
    public final void mo32230w(C4241a aVar) {
        if (aVar != null) {
            aVar.mo32411u2((C4241a.C4242a) null);
        }
    }

    /* renamed from: x */
    public final void mo32231x() {
        if (!mo32121n() || !mo32134s() || this.f23604x == null) {
            ga7.m17785p0(this, (C3715z7) null);
        } else {
            ga7.m17785p0(this, this.f23597P);
        }
    }

    /* renamed from: y */
    public final void mo32232y() {
        if (bh5.f21304a) {
            mo32233z();
            return;
        }
        this.f23601k.mo32321P2(true);
        ga7.m17793t0(this, getBackgroundDrawable());
        mo32079A();
        mo32119l();
    }

    /* renamed from: z */
    public final void mo32233z() {
        this.f23603s = new RippleDrawable(bh5.m32533d(this.f23601k.mo32377k1()), getBackgroundDrawable(), (Drawable) null);
        this.f23601k.mo32321P2(false);
        ga7.m17793t0(this, this.f23603s);
        mo32079A();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32408t2(z);
        }
        mo32231x();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f23588k0
            android.content.Context r7 = p000.xo3.m54461c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f23598Q = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f23599U = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f23600e0 = r7
            android.content.Context r0 = r6.getContext()
            r6.mo32081C(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.C4241a.m35006A0(r0, r8, r9, r4)
            r6.mo32122o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = p000.ga7.m17798w(r6)
            r7.mo48439Z(r1)
            int[] r2 = p000.u55.Chip
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r9 = p000.u55.Chip_shapeAppearance
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f23597P = r8
            r6.mo32231x()
            if (r9 != 0) goto L_0x0059
            r6.mo32131p()
        L_0x0059:
            boolean r8 = r6.f23590A
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.mo32381m1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.mo32361g1()
            r6.setEllipsize(r7)
            r6.mo32080B()
            com.google.android.material.chip.a r7 = r6.f23601k
            boolean r7 = r7.mo32324Q2()
            if (r7 != 0) goto L_0x007e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L_0x007e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.mo32079A()
            boolean r7 = r6.mo32229v()
            if (r7 == 0) goto L_0x0092
            int r7 = r6.f23596M
            r6.setMinHeight(r7)
        L_0x0092:
            int r7 = p000.ga7.m17715B(r6)
            r6.f23595L = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedIconVisible(boolean z) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32302J1(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32344X1(z);
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32306K2(i);
        }
        mo32080B();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C4241a aVar = this.f23601k;
        if (aVar != null) {
            aVar.mo32306K2(i);
        }
        mo32080B();
    }
}
