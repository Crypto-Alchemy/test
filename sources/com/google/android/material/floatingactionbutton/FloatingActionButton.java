package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C4310a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements fx1, vz5, CoordinatorLayout.C0543b {

    /* renamed from: Q */
    public static final int f23874Q = e55.Widget_Design_FloatingActionButton;

    /* renamed from: A */
    public int f23875A;

    /* renamed from: B */
    public int f23876B;

    /* renamed from: C */
    public boolean f23877C;

    /* renamed from: H */
    public final Rect f23878H;

    /* renamed from: I */
    public final Rect f23879I;

    /* renamed from: L */
    public final C2183dn f23880L;

    /* renamed from: M */
    public final gx1 f23881M;

    /* renamed from: P */
    public C4310a f23882P;

    /* renamed from: d */
    public ColorStateList f23883d;

    /* renamed from: e */
    public PorterDuff.Mode f23884e;

    /* renamed from: g */
    public ColorStateList f23885g;

    /* renamed from: k */
    public PorterDuff.Mode f23886k;

    /* renamed from: r */
    public ColorStateList f23887r;

    /* renamed from: s */
    public int f23888s;

    /* renamed from: x */
    public int f23889x;

    /* renamed from: y */
    public int f23890y;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo32799a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ boolean mo32801d(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo32802e(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i);
        }

        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.C0546e eVar) {
            super.onAttachedToLayoutParams(eVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C4306a implements C4310a.C4320j {

        /* renamed from: a */
        public final /* synthetic */ C4307b f23894a;

        public C4306a(C4307b bVar) {
            this.f23894a = bVar;
        }

        /* renamed from: a */
        public void mo32806a() {
            this.f23894a.mo31832b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo32807b() {
            this.f23894a.mo31831a(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C4307b {
        /* renamed from: a */
        public void mo31831a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo31832b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C4308c implements pz5 {
        public C4308c() {
        }

        /* renamed from: a */
        public void mo32808a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f23878H.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f23875A, i2 + FloatingActionButton.this.f23875A, i3 + FloatingActionButton.this.f23875A, i4 + FloatingActionButton.this.f23875A);
        }

        /* renamed from: b */
        public void mo32809b(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo32810c() {
            return FloatingActionButton.this.f23877C;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public class C4309d<T extends FloatingActionButton> implements C4310a.C4319i {

        /* renamed from: a */
        public final nw6<T> f23897a;

        public C4309d(nw6<T> nw6) {
            this.f23897a = nw6;
        }

        /* renamed from: a */
        public void mo32811a() {
            this.f23897a.mo31825b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo32812b() {
            this.f23897a.mo31824a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C4309d) || !((C4309d) obj).f23897a.equals(this.f23897a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f23897a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private C4310a getImpl() {
        if (this.f23882P == null) {
            this.f23882P = mo32741h();
        }
        return this.f23882P;
    }

    /* renamed from: s */
    public static int m35439s(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public boolean mo32716a() {
        return this.f23881M.mo43021c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo32818D(getDrawableState());
    }

    /* renamed from: e */
    public void mo32718e(Animator.AnimatorListener animatorListener) {
        getImpl().mo32844d(animatorListener);
    }

    /* renamed from: f */
    public void mo32719f(Animator.AnimatorListener animatorListener) {
        getImpl().mo32846e(animatorListener);
    }

    /* renamed from: g */
    public void mo32720g(nw6<? extends FloatingActionButton> nw6) {
        getImpl().mo32848f(new C4309d(nw6));
    }

    public ColorStateList getBackgroundTintList() {
        return this.f23883d;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f23884e;
    }

    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo32857m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo32860p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo32863s();
    }

    public Drawable getContentBackground() {
        return getImpl().mo32854j();
    }

    public int getCustomSize() {
        return this.f23890y;
    }

    public int getExpandedComponentIdHint() {
        return this.f23881M.mo43020b();
    }

    public vy3 getHideMotionSpec() {
        return getImpl().mo32859o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f23887r;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f23887r;
    }

    public rz5 getShapeAppearanceModel() {
        return (rz5) gu4.m18428f(getImpl().mo32864t());
    }

    public vy3 getShowMotionSpec() {
        return getImpl().mo32865u();
    }

    public int getSize() {
        return this.f23889x;
    }

    public int getSizeDimension() {
        return mo32745k(this.f23889x);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f23885g;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f23886k;
    }

    public boolean getUseCompatPadding() {
        return this.f23877C;
    }

    /* renamed from: h */
    public final C4310a mo32741h() {
        return new v42(this, new C4308c());
    }

    @Deprecated
    /* renamed from: i */
    public boolean mo32742i(Rect rect) {
        if (!ga7.m17747T(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo32757q(rect);
        return true;
    }

    /* renamed from: j */
    public void mo32743j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        mo32757q(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo32870z();
    }

    /* renamed from: k */
    public final int mo32745k(int i) {
        int i2 = this.f23890y;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(k25.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(k25.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return mo32745k(1);
        } else {
            return mo32745k(0);
        }
    }

    /* renamed from: l */
    public void mo32746l() {
        mo32747m((C4307b) null);
    }

    /* renamed from: m */
    public void mo32747m(C4307b bVar) {
        mo32748n(bVar, true);
    }

    /* renamed from: n */
    public void mo32748n(C4307b bVar, boolean z) {
        getImpl().mo32866v(mo32798w(bVar), z);
    }

    /* renamed from: o */
    public boolean mo32749o() {
        return getImpl().mo32868x();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo32815A();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo32817C();
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f23875A = (sizeDimension - this.f23876B) / 2;
        getImpl().mo32847e0();
        int min = Math.min(m35439s(sizeDimension, i), m35439s(sizeDimension, i2));
        Rect rect = this.f23878H;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.mo5481a());
        this.f23881M.mo43022d((Bundle) gu4.m18428f(extendableSavedState.f24342e.get("expandableWidgetHelper")));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(onSaveInstanceState);
        extendableSavedState.f24342e.put("expandableWidgetHelper", this.f23881M.mo43023e());
        return extendableSavedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo32742i(this.f23879I) || this.f23879I.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo32756p() {
        return getImpl().mo32869y();
    }

    /* renamed from: q */
    public final void mo32757q(Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f23878H;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    /* renamed from: r */
    public final void mo32758r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f23885g;
            if (colorStateList == null) {
                ij1.m19644c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f23886k;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C3743zm.m31369e(colorForState, mode));
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f23883d != colorStateList) {
            this.f23883d = colorStateList;
            getImpl().mo32825K(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f23884e != mode) {
            this.f23884e = mode;
            getImpl().mo32826L(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo32827M(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo32830P(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo32834T(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f23890y) {
            this.f23890y = i;
            requestLayout();
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo32849f0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo32858n()) {
            getImpl().mo32828N(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f23881M.mo43024f(i);
    }

    public void setHideMotionSpec(vy3 vy3) {
        getImpl().mo32829O(vy3);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo32845d0();
            if (this.f23885g != null) {
                mo32758r();
            }
        }
    }

    public void setImageResource(int i) {
        this.f23880L.mo18859i(i);
        mo32758r();
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo32822H();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo32822H();
    }

    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo32836V(z);
    }

    public void setShapeAppearanceModel(rz5 rz5) {
        getImpl().mo32837W(rz5);
    }

    public void setShowMotionSpec(vy3 vy3) {
        getImpl().mo32838X(vy3);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setSize(int i) {
        this.f23890y = 0;
        if (i != this.f23889x) {
            this.f23889x = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f23885g != colorStateList) {
            this.f23885g = colorStateList;
            mo32758r();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f23886k != mode) {
            this.f23886k = mode;
            mo32758r();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo32823I();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo32823I();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo32823I();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f23877C != z) {
            this.f23877C = z;
            getImpl().mo32816B();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public void mo32795t() {
        mo32796u((C4307b) null);
    }

    /* renamed from: u */
    public void mo32796u(C4307b bVar) {
        mo32797v(bVar, true);
    }

    /* renamed from: v */
    public void mo32797v(C4307b bVar, boolean z) {
        getImpl().mo32842b0(mo32798w(bVar), z);
    }

    /* renamed from: w */
    public final C4310a.C4320j mo32798w(C4307b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C4306a(bVar);
    }

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f23891a;

        /* renamed from: b */
        public C4307b f23892b;

        /* renamed from: c */
        public boolean f23893c;

        public BaseBehavior() {
            this.f23893c = true;
        }

        /* renamed from: b */
        public static boolean m35459b(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0546e) {
                return ((CoordinatorLayout.C0546e) layoutParams).mo5294f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f23878H;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: c */
        public final void mo32800c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.f23878H;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) floatingActionButton.getLayoutParams();
                int i2 = 0;
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - eVar.rightMargin) {
                    i = rect.right;
                } else if (floatingActionButton.getLeft() <= eVar.leftMargin) {
                    i = -rect.left;
                } else {
                    i = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - eVar.bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= eVar.topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    ga7.m17755a0(floatingActionButton, i2);
                }
                if (i != 0) {
                    ga7.m17753Z(floatingActionButton, i);
                }
            }
        }

        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo32804g(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m35459b(view)) {
                return false;
            } else {
                mo32805h(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: e */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m35459b(view) && mo32805h(view, floatingActionButton)) {
                        break;
                    }
                } else if (mo32804g(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            mo32800c(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: f */
        public final boolean mo32803f(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) floatingActionButton.getLayoutParams();
            if (this.f23893c && eVar.mo5293e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public final boolean mo32804g(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!mo32803f(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f23891a == null) {
                this.f23891a = new Rect();
            }
            Rect rect = this.f23891a;
            rc1.m51059a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo32748n(this.f23892b, false);
                return true;
            }
            floatingActionButton.mo32797v(this.f23892b, false);
            return true;
        }

        /* renamed from: h */
        public final boolean mo32805h(View view, FloatingActionButton floatingActionButton) {
            if (!mo32803f(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0546e) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo32748n(this.f23892b, false);
                return true;
            }
            floatingActionButton.mo32797v(this.f23892b, false);
            return true;
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.C0546e eVar) {
            if (eVar.f3356h == 0) {
                eVar.f3356h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.FloatingActionButton_Behavior_Layout);
            this.f23893c = obtainStyledAttributes.getBoolean(u55.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f23887r != colorStateList) {
            this.f23887r = colorStateList;
            getImpl().mo32835U(this.f23887r);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f23874Q
            android.content.Context r11 = p000.xo3.m54461c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f23878H = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f23879I = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = p000.u55.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r1 = p000.u55.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = p000.to3.m52391b(r11, r0, r1)
            r10.f23883d = r1
            int r1 = p000.u55.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = p000.pe7.m49903i(r1, r3)
            r10.f23884e = r1
            int r1 = p000.u55.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = p000.to3.m52391b(r11, r0, r1)
            r10.f23887r = r1
            int r1 = p000.u55.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f23889x = r1
            int r1 = p000.u55.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f23890y = r1
            int r1 = p000.u55.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f23888s = r1
            int r1 = p000.u55.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = p000.u55.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = p000.u55.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = p000.u55.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f23877C = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = p000.k25.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = p000.u55.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.f23876B = r5
            int r5 = p000.u55.FloatingActionButton_showMotionSpec
            vy3 r5 = p000.vy3.m53610c(r11, r0, r5)
            int r8 = p000.u55.FloatingActionButton_hideMotionSpec
            vy3 r8 = p000.vy3.m53610c(r11, r0, r8)
            du0 r9 = p000.rz5.f33675m
            rz5$b r11 = p000.rz5.m51452g(r11, r12, r13, r6, r9)
            rz5 r11 = r11.mo47599m()
            int r6 = p000.u55.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = p000.u55.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            dn r0 = new dn
            r0.<init>(r10)
            r10.f23880L = r0
            r0.mo18857g(r12, r13)
            gx1 r12 = new gx1
            r12.<init>(r10)
            r10.f23881M = r12
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.mo32837W(r11)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f23883d
            android.graphics.PorterDuff$Mode r13 = r10.f23884e
            android.content.res.ColorStateList r0 = r10.f23887r
            int r7 = r10.f23888s
            r11.mo32867w(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32833S(r4)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32827M(r1)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32830P(r3)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32834T(r2)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            int r12 = r10.f23876B
            r11.mo32832R(r12)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32838X(r5)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32829O(r8)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo32828N(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
