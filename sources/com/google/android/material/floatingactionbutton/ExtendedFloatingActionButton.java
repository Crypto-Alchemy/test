package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0543b {

    /* renamed from: A1 */
    public static final Property<View, Float> f23841A1;

    /* renamed from: B1 */
    public static final Property<View, Float> f23842B1;

    /* renamed from: x1 */
    public static final int f23843x1 = e55.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: y1 */
    public static final Property<View, Float> f23844y1;

    /* renamed from: z1 */
    public static final Property<View, Float> f23845z1;

    /* renamed from: b1 */
    public final C4323b f23846b1;

    /* renamed from: e0 */
    public int f23847e0;

    /* renamed from: e1 */
    public final C4323b f23848e1;

    /* renamed from: k0 */
    public final C6109jl f23849k0;

    /* renamed from: o1 */
    public final C4323b f23850o1;

    /* renamed from: p1 */
    public final int f23851p1;

    /* renamed from: q1 */
    public int f23852q1;

    /* renamed from: r1 */
    public int f23853r1;

    /* renamed from: s1 */
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f23854s1;

    /* renamed from: t1 */
    public boolean f23855t1;

    /* renamed from: u1 */
    public boolean f23856u1;

    /* renamed from: v0 */
    public final C4323b f23857v0;

    /* renamed from: v1 */
    public boolean f23858v1;

    /* renamed from: w1 */
    public ColorStateList f23859w1;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C4294a implements C4305l {
        public C4294a() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo32684a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.f23853r1;
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.f23852q1;
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f23852q1 + ExtendedFloatingActionButton.this.f23853r1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C4295b implements C4305l {
        public C4295b() {
        }

        /* renamed from: a */
        public ViewGroup.LayoutParams mo32684a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C4296c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f23865a;

        /* renamed from: d */
        public final /* synthetic */ C4323b f23866d;

        public C4296c(C4323b bVar, C4303j jVar) {
            this.f23866d = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f23865a = true;
            this.f23866d.mo32715e();
        }

        public void onAnimationEnd(Animator animator) {
            this.f23866d.mo32711g();
            if (!this.f23865a) {
                this.f23866d.mo32713j((C4303j) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f23866d.onAnimationStart(animator);
            this.f23865a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public static class C4297d extends Property<View, Float> {
        public C4297d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static class C4298e extends Property<View, Float> {
        public C4298e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    public static class C4299f extends Property<View, Float> {
        public C4299f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ga7.m17725G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ga7.m17722E0(view, f.intValue(), view.getPaddingTop(), ga7.m17723F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    public static class C4300g extends Property<View, Float> {
        public C4300g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) ga7.m17723F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            ga7.m17722E0(view, ga7.m17725G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    public class C4301h extends C6780zy {

        /* renamed from: g */
        public final C4305l f23868g;

        /* renamed from: h */
        public final boolean f23869h;

        public C4301h(C6109jl jlVar, C4305l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, jlVar);
            this.f23868g = lVar;
            this.f23869h = z;
        }

        /* renamed from: a */
        public void mo32708a() {
            boolean unused = ExtendedFloatingActionButton.this.f23855t1 = this.f23869h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f23868g.mo32684a().width;
                layoutParams.height = this.f23868g.mo32684a().height;
                ga7.m17722E0(ExtendedFloatingActionButton.this, this.f23868g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f23868g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: c */
        public boolean mo32709c() {
            if (this.f23869h == ExtendedFloatingActionButton.this.f23855t1 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public int mo32710f() {
            if (this.f23869h) {
                return y05.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return y05.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: g */
        public void mo32711g() {
            super.mo32711g();
            boolean unused = ExtendedFloatingActionButton.this.f23856u1 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f23868g.mo32684a().width;
                layoutParams.height = this.f23868g.mo32684a().height;
            }
        }

        /* renamed from: h */
        public AnimatorSet mo32712h() {
            float f;
            vy3 m = mo49992m();
            if (m.mo48855j("width")) {
                PropertyValuesHolder[] g = m.mo48851g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f23868g.getWidth()});
                m.mo48857l("width", g);
            }
            if (m.mo48855j("height")) {
                PropertyValuesHolder[] g2 = m.mo48851g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f23868g.getHeight()});
                m.mo48857l("height", g2);
            }
            if (m.mo48855j("paddingStart")) {
                PropertyValuesHolder[] g3 = m.mo48851g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) ga7.m17725G(ExtendedFloatingActionButton.this), (float) this.f23868g.getPaddingStart()});
                m.mo48857l("paddingStart", g3);
            }
            if (m.mo48855j("paddingEnd")) {
                PropertyValuesHolder[] g4 = m.mo48851g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) ga7.m17723F(ExtendedFloatingActionButton.this), (float) this.f23868g.getPaddingEnd()});
                m.mo48857l("paddingEnd", g4);
            }
            if (m.mo48855j("labelOpacity")) {
                PropertyValuesHolder[] g5 = m.mo48851g("labelOpacity");
                boolean z = this.f23869h;
                float f2 = Utils.FLOAT_EPSILON;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (z) {
                    f2 = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f, f2});
                m.mo48857l("labelOpacity", g5);
            }
            return super.mo49991l(m);
        }

        /* renamed from: j */
        public void mo32713j(C4303j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f23855t1 = this.f23869h;
            boolean unused2 = ExtendedFloatingActionButton.this.f23856u1 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    public class C4302i extends C6780zy {

        /* renamed from: g */
        public boolean f23871g;

        public C4302i(C6109jl jlVar) {
            super(ExtendedFloatingActionButton.this, jlVar);
        }

        /* renamed from: a */
        public void mo32708a() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: c */
        public boolean mo32709c() {
            return ExtendedFloatingActionButton.this.mo32674y();
        }

        /* renamed from: e */
        public void mo32715e() {
            super.mo32715e();
            this.f23871g = true;
        }

        /* renamed from: f */
        public int mo32710f() {
            return y05.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: g */
        public void mo32711g() {
            super.mo32711g();
            int unused = ExtendedFloatingActionButton.this.f23847e0 = 0;
            if (!this.f23871g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: j */
        public void mo32713j(C4303j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f23871g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f23847e0 = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C4303j {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    public class C4304k extends C6780zy {
        public C4304k(C6109jl jlVar) {
            super(ExtendedFloatingActionButton.this, jlVar);
        }

        /* renamed from: a */
        public void mo32708a() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: c */
        public boolean mo32709c() {
            return ExtendedFloatingActionButton.this.mo32675z();
        }

        /* renamed from: f */
        public int mo32710f() {
            return y05.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: g */
        public void mo32711g() {
            super.mo32711g();
            int unused = ExtendedFloatingActionButton.this.f23847e0 = 0;
        }

        /* renamed from: j */
        public void mo32713j(C4303j jVar) {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f23847e0 = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    public interface C4305l {
        /* renamed from: a */
        ViewGroup.LayoutParams mo32684a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f23844y1 = new C4297d(cls, "width");
        f23845z1 = new C4298e(cls, "height");
        f23841A1 = new C4299f(cls, "paddingStart");
        f23842B1 = new C4300g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public final void mo32650A(C4323b bVar, C4303j jVar) {
        if (!bVar.mo32709c()) {
            if (!mo32652C()) {
                bVar.mo32708a();
                bVar.mo32713j(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet h = bVar.mo32712h();
            h.addListener(new C4296c(bVar, jVar));
            for (Animator.AnimatorListener addListener : bVar.mo32886i()) {
                h.addListener(addListener);
            }
            h.start();
        }
    }

    /* renamed from: B */
    public final void mo32651B() {
        this.f23859w1 = getTextColors();
    }

    /* renamed from: C */
    public final boolean mo32652C() {
        if ((ga7.m17747T(this) || (!mo32675z() && this.f23858v1)) && !isInEditMode()) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public void mo32653D(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f23854s1;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i = this.f23851p1;
        if (i < 0) {
            return (Math.min(ga7.m17725G(this), ga7.m17723F(this)) * 2) + getIconSize();
        }
        return i;
    }

    public vy3 getExtendMotionSpec() {
        return this.f23846b1.mo32884b();
    }

    public vy3 getHideMotionSpec() {
        return this.f23850o1.mo32884b();
    }

    public vy3 getShowMotionSpec() {
        return this.f23848e1.mo32884b();
    }

    public vy3 getShrinkMotionSpec() {
        return this.f23857v0.mo32884b();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23855t1 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f23855t1 = false;
            this.f23857v0.mo32708a();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f23858v1 = z;
    }

    public void setExtendMotionSpec(vy3 vy3) {
        this.f23846b1.mo32885d(vy3);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setExtended(boolean z) {
        C4323b bVar;
        if (this.f23855t1 != z) {
            if (z) {
                bVar = this.f23846b1;
            } else {
                bVar = this.f23857v0;
            }
            if (!bVar.mo32709c()) {
                bVar.mo32708a();
            }
        }
    }

    public void setHideMotionSpec(vy3 vy3) {
        this.f23850o1.mo32885d(vy3);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f23855t1 && !this.f23856u1) {
            this.f23852q1 = ga7.m17725G(this);
            this.f23853r1 = ga7.m17723F(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f23855t1 && !this.f23856u1) {
            this.f23852q1 = i;
            this.f23853r1 = i3;
        }
    }

    public void setShowMotionSpec(vy3 vy3) {
        this.f23848e1.mo32885d(vy3);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setShrinkMotionSpec(vy3 vy3) {
        this.f23857v0.mo32885d(vy3);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(vy3.m53611d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        mo32651B();
    }

    /* renamed from: y */
    public final boolean mo32674y() {
        if (getVisibility() == 0) {
            if (this.f23847e0 == 1) {
                return true;
            }
            return false;
        } else if (this.f23847e0 != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z */
    public final boolean mo32675z() {
        if (getVisibility() != 0) {
            if (this.f23847e0 == 2) {
                return true;
            }
            return false;
        } else if (this.f23847e0 != 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.extendedFloatingActionButtonStyle);
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        public Rect f23860a;

        /* renamed from: b */
        public boolean f23861b;

        /* renamed from: c */
        public boolean f23862c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f23861b = false;
            this.f23862c = true;
        }

        /* renamed from: c */
        public static boolean m35400c(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0546e) {
                return ((CoordinatorLayout.C0546e) layoutParams).mo5294f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: a */
        public void mo32676a(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C4323b bVar;
            if (this.f23862c) {
                bVar = extendedFloatingActionButton.f23846b1;
            } else {
                bVar = extendedFloatingActionButton.f23848e1;
            }
            extendedFloatingActionButton.mo32650A(bVar, (C4303j) null);
        }

        /* renamed from: b */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: d */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo32682h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m35400c(view)) {
                return false;
            } else {
                mo32683i(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: e */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(extendedFloatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m35400c(view) && mo32683i(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (mo32682h(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(extendedFloatingActionButton, i);
            return true;
        }

        /* renamed from: f */
        public final boolean mo32680f(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0546e eVar = (CoordinatorLayout.C0546e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f23861b || this.f23862c) && eVar.mo5293e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public void mo32681g(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C4323b bVar;
            if (this.f23862c) {
                bVar = extendedFloatingActionButton.f23857v0;
            } else {
                bVar = extendedFloatingActionButton.f23850o1;
            }
            extendedFloatingActionButton.mo32650A(bVar, (C4303j) null);
        }

        /* renamed from: h */
        public final boolean mo32682h(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo32680f(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f23860a == null) {
                this.f23860a = new Rect();
            }
            Rect rect = this.f23860a;
            rc1.m51059a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo32681g(extendedFloatingActionButton);
                return true;
            }
            mo32676a(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: i */
        public final boolean mo32683i(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!mo32680f(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0546e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo32681g(extendedFloatingActionButton);
                return true;
            }
            mo32676a(extendedFloatingActionButton);
            return true;
        }

        public void onAttachedToLayoutParams(CoordinatorLayout.C0546e eVar) {
            if (eVar.f3356h == 0) {
                eVar.f3356h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ExtendedFloatingActionButton_Behavior_Layout);
            this.f23861b = obtainStyledAttributes.getBoolean(u55.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f23862c = obtainStyledAttributes.getBoolean(u55.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f23843x1
            r1 = r17
            android.content.Context r1 = p000.xo3.m54461c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f23847e0 = r10
            jl r1 = new jl
            r1.<init>()
            r0.f23849k0 = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f23848e1 = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f23850o1 = r12
            r13 = 1
            r0.f23855t1 = r13
            r0.f23856u1 = r10
            r0.f23858v1 = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f23854s1 = r1
            int[] r3 = p000.u55.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = p000.wo6.m54004h(r1, r2, r3, r4, r5, r6)
            int r2 = p000.u55.ExtendedFloatingActionButton_showMotionSpec
            vy3 r2 = p000.vy3.m53610c(r14, r1, r2)
            int r3 = p000.u55.ExtendedFloatingActionButton_hideMotionSpec
            vy3 r3 = p000.vy3.m53610c(r14, r1, r3)
            int r4 = p000.u55.ExtendedFloatingActionButton_extendMotionSpec
            vy3 r4 = p000.vy3.m53610c(r14, r1, r4)
            int r5 = p000.u55.ExtendedFloatingActionButton_shrinkMotionSpec
            vy3 r5 = p000.vy3.m53610c(r14, r1, r5)
            int r6 = p000.u55.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f23851p1 = r6
            int r6 = p000.ga7.m17725G(r16)
            r0.f23852q1 = r6
            int r6 = p000.ga7.m17723F(r16)
            r0.f23853r1 = r6
            jl r6 = new jl
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f23846b1 = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f23857v0 = r10
            r11.mo32885d(r2)
            r12.mo32885d(r3)
            r15.mo32885d(r4)
            r10.mo32885d(r5)
            r1.recycle()
            du0 r1 = p000.rz5.f33675m
            r2 = r18
            rz5$b r1 = p000.rz5.m51452g(r14, r2, r8, r9, r1)
            rz5 r1 = r1.mo47599m()
            r0.setShapeAppearanceModel(r1)
            r16.mo32651B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        mo32651B();
    }
}
