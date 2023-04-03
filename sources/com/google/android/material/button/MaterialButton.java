package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, vz5 {

    /* renamed from: P */
    public static final int[] f23535P = {16842911};

    /* renamed from: Q */
    public static final int[] f23536Q = {16842912};

    /* renamed from: U */
    public static final int f23537U = e55.Widget_MaterialComponents_Button;

    /* renamed from: A */
    public int f23538A;

    /* renamed from: B */
    public int f23539B;

    /* renamed from: C */
    public int f23540C;

    /* renamed from: H */
    public int f23541H;

    /* renamed from: I */
    public boolean f23542I;

    /* renamed from: L */
    public boolean f23543L;

    /* renamed from: M */
    public int f23544M;

    /* renamed from: g */
    public final po3 f23545g;

    /* renamed from: k */
    public final LinkedHashSet<C4225a> f23546k;

    /* renamed from: r */
    public C4226b f23547r;

    /* renamed from: s */
    public PorterDuff.Mode f23548s;

    /* renamed from: x */
    public ColorStateList f23549x;

    /* renamed from: y */
    public Drawable f23550y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4224a();

        /* renamed from: e */
        public boolean f23551e;

        /* renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public static class C4224a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void mo31991b(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f23551e = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23551e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            mo31991b(parcel);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface C4225a {
        /* renamed from: a */
        void mo31998a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    public interface C4226b {
        /* renamed from: a */
        void mo31999a(MaterialButton materialButton, boolean z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: f */
    private boolean m34895f() {
        if (ga7.m17715B(this) == 1) {
            return true;
        }
        return false;
    }

    private String getA11yClassName() {
        Class cls;
        if (mo31929b()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: a */
    public void mo31928a(C4225a aVar) {
        this.f23546k.add(aVar);
    }

    /* renamed from: b */
    public boolean mo31929b() {
        po3 po3 = this.f23545g;
        if (po3 == null || !po3.mo46819p()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo31930c() {
        int i = this.f23544M;
        if (i == 3 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo31931d() {
        int i = this.f23544M;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo31932e() {
        int i = this.f23544M;
        if (i == 16 || i == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo31933g() {
        po3 po3 = this.f23545g;
        if (po3 == null || po3.mo46818o()) {
            return false;
        }
        return true;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (mo31933g()) {
            return this.f23545g.mo46805b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f23550y;
    }

    public int getIconGravity() {
        return this.f23544M;
    }

    public int getIconPadding() {
        return this.f23541H;
    }

    public int getIconSize() {
        return this.f23538A;
    }

    public ColorStateList getIconTint() {
        return this.f23549x;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f23548s;
    }

    public int getInsetBottom() {
        return this.f23545g.mo46806c();
    }

    public int getInsetTop() {
        return this.f23545g.mo46807d();
    }

    public ColorStateList getRippleColor() {
        if (mo31933g()) {
            return this.f23545g.mo46811h();
        }
        return null;
    }

    public rz5 getShapeAppearanceModel() {
        if (mo31933g()) {
            return this.f23545g.mo46812i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (mo31933g()) {
            return this.f23545g.mo46813j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (mo31933g()) {
            return this.f23545g.mo46814k();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (mo31933g()) {
            return this.f23545g.mo46815l();
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (mo31933g()) {
            return this.f23545g.mo46816m();
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: h */
    public void mo31949h(C4225a aVar) {
        this.f23546k.remove(aVar);
    }

    /* renamed from: i */
    public final void mo31950i() {
        if (mo31931d()) {
            lo6.m21656j(this, this.f23550y, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (mo31930c()) {
            lo6.m21656j(this, (Drawable) null, (Drawable) null, this.f23550y, (Drawable) null);
        } else if (mo31932e()) {
            lo6.m21656j(this, (Drawable) null, this.f23550y, (Drawable) null, (Drawable) null);
        }
    }

    public boolean isChecked() {
        return this.f23542I;
    }

    /* renamed from: j */
    public final void mo31952j(boolean z) {
        Drawable drawable = this.f23550y;
        if (drawable != null) {
            Drawable mutate = ij1.m19659r(drawable).mutate();
            this.f23550y = mutate;
            ij1.m19656o(mutate, this.f23549x);
            PorterDuff.Mode mode = this.f23548s;
            if (mode != null) {
                ij1.m19657p(this.f23550y, mode);
            }
            int i = this.f23538A;
            if (i == 0) {
                i = this.f23550y.getIntrinsicWidth();
            }
            int i2 = this.f23538A;
            if (i2 == 0) {
                i2 = this.f23550y.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f23550y;
            int i3 = this.f23539B;
            int i4 = this.f23540C;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
        }
        if (z) {
            mo31950i();
            return;
        }
        Drawable[] a = lo6.m21647a(this);
        boolean z2 = false;
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[1];
        Drawable drawable5 = a[2];
        if ((mo31931d() && drawable3 != this.f23550y) || ((mo31930c() && drawable5 != this.f23550y) || (mo31932e() && drawable4 != this.f23550y))) {
            z2 = true;
        }
        if (z2) {
            mo31950i();
        }
    }

    /* renamed from: k */
    public final void mo31953k(int i, int i2) {
        if (this.f23550y != null && getLayout() != null) {
            if (mo31931d() || mo31930c()) {
                this.f23540C = 0;
                int i3 = this.f23544M;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.f23539B = 0;
                    mo31952j(false);
                    return;
                }
                int i4 = this.f23538A;
                if (i4 == 0) {
                    i4 = this.f23550y.getIntrinsicWidth();
                }
                int textWidth = (((((i - getTextWidth()) - ga7.m17723F(this)) - i4) - this.f23541H) - ga7.m17725G(this)) / 2;
                boolean f = m34895f();
                if (this.f23544M != 4) {
                    z = false;
                }
                if (f != z) {
                    textWidth = -textWidth;
                }
                if (this.f23539B != textWidth) {
                    this.f23539B = textWidth;
                    mo31952j(false);
                }
            } else if (mo31932e()) {
                this.f23539B = 0;
                if (this.f23544M == 16) {
                    this.f23540C = 0;
                    mo31952j(false);
                    return;
                }
                int i5 = this.f23538A;
                if (i5 == 0) {
                    i5 = this.f23550y.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.f23541H) - getPaddingBottom()) / 2;
                if (this.f23540C != textHeight) {
                    this.f23540C = textHeight;
                    mo31952j(false);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (mo31933g()) {
            vo3.m53444f(this, this.f23545g.mo46809f());
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo31929b()) {
            View.mergeDrawableStates(onCreateDrawableState, f23535P);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f23536Q);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo31929b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        setChecked(savedState.f23551e);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23551e = this.f23542I;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo31953k(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mo31953k(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (mo31933g()) {
            this.f23545g.mo46821r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!mo31933g()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            this.f23545g.mo46822s();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C2554in.m19714b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (mo31933g()) {
            this.f23545g.mo46823t(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo31929b() && isEnabled() && this.f23542I != z) {
            this.f23542I = z;
            refreshDrawableState();
            if (!this.f23543L) {
                this.f23543L = true;
                Iterator<C4225a> it = this.f23546k.iterator();
                while (it.hasNext()) {
                    it.next().mo31998a(this, this.f23542I);
                }
                this.f23543L = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (mo31933g()) {
            this.f23545g.mo46824u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (mo31933g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (mo31933g()) {
            this.f23545g.mo46809f().mo48439Z(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f23550y != drawable) {
            this.f23550y = drawable;
            mo31952j(true);
            mo31953k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f23544M != i) {
            this.f23544M = i;
            mo31953k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f23541H != i) {
            this.f23541H = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C2554in.m19714b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f23538A != i) {
            this.f23538A = i;
            mo31952j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f23549x != colorStateList) {
            this.f23549x = colorStateList;
            mo31952j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f23548s != mode) {
            this.f23548s = mode;
            mo31952j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C2554in.m19713a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f23545g.mo46825v(i);
    }

    public void setInsetTop(int i) {
        this.f23545g.mo46826w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C4226b bVar) {
        this.f23547r = bVar;
    }

    public void setPressed(boolean z) {
        C4226b bVar = this.f23547r;
        if (bVar != null) {
            bVar.mo31999a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (mo31933g()) {
            this.f23545g.mo46827x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (mo31933g()) {
            setRippleColor(C2554in.m19713a(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        if (mo31933g()) {
            this.f23545g.mo46828y(rz5);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (mo31933g()) {
            this.f23545g.mo46829z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (mo31933g()) {
            this.f23545g.mo46795A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (mo31933g()) {
            setStrokeColor(C2554in.m19713a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (mo31933g()) {
            this.f23545g.mo46796B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (mo31933g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (mo31933g()) {
            this.f23545g.mo46797C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (mo31933g()) {
            this.f23545g.mo46798D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f23542I);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = f23537U
            android.content.Context r9 = p000.xo3.m54461c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f23546k = r9
            r9 = 0
            r8.f23542I = r9
            r8.f23543L = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p000.u55.MaterialButton
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r1 = p000.u55.MaterialButton_iconPadding
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f23541H = r1
            int r1 = p000.u55.MaterialButton_iconTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = p000.pe7.m49903i(r1, r2)
            r8.f23548s = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p000.u55.MaterialButton_iconTint
            android.content.res.ColorStateList r1 = p000.to3.m52391b(r1, r0, r2)
            r8.f23549x = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p000.u55.MaterialButton_icon
            android.graphics.drawable.Drawable r1 = p000.to3.m52393d(r1, r0, r2)
            r8.f23550y = r1
            int r1 = p000.u55.MaterialButton_iconGravity
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f23544M = r1
            int r1 = p000.u55.MaterialButton_iconSize
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f23538A = r1
            rz5$b r10 = p000.rz5.m51450e(r7, r10, r11, r6)
            rz5 r10 = r10.mo47599m()
            po3 r11 = new po3
            r11.<init>(r8, r10)
            r8.f23545g = r11
            r11.mo46820q(r0)
            r0.recycle()
            int r10 = r8.f23541H
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f23550y
            if (r10 == 0) goto L_0x0084
            r9 = r2
        L_0x0084:
            r8.mo31952j(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
