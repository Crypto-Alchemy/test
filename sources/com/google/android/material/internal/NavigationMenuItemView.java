package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.widget.LinearLayoutCompat;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0184j.C0185a {

    /* renamed from: P */
    public static final int[] f23994P = {16842912};

    /* renamed from: A */
    public final CheckedTextView f23995A;

    /* renamed from: B */
    public FrameLayout f23996B;

    /* renamed from: C */
    public C0177g f23997C;

    /* renamed from: H */
    public ColorStateList f23998H;

    /* renamed from: I */
    public boolean f23999I;

    /* renamed from: L */
    public Drawable f24000L;

    /* renamed from: M */
    public final C3715z7 f24001M;

    /* renamed from: s */
    public int f24002s;

    /* renamed from: x */
    public boolean f24003x;

    /* renamed from: y */
    public boolean f24004y;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C4327a extends C3715z7 {
        public C4327a() {
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            super.mo5479g(view, t8Var);
            t8Var.mo26234d0(NavigationMenuItemView.this.f24004y);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f23996B == null) {
                this.f23996B = (FrameLayout) ((ViewStub) findViewById(g35.design_menu_item_action_area_stub)).inflate();
            }
            this.f23996B.removeAllViews();
            this.f23996B.addView(view);
        }
    }

    /* renamed from: c */
    public void mo1260c(C0177g gVar, int i) {
        int i2;
        this.f23997C = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            ga7.m17793t0(this, mo32960f());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        xr6.m30294a(this, gVar.getTooltipText());
        mo32959e();
    }

    /* renamed from: d */
    public boolean mo1261d() {
        return false;
    }

    /* renamed from: e */
    public final void mo32959e() {
        if (mo32962h()) {
            this.f23995A.setVisibility(8);
            FrameLayout frameLayout = this.f23996B;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f23996B.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f23995A.setVisibility(0);
        FrameLayout frameLayout2 = this.f23996B;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f23996B.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: f */
    public final StateListDrawable mo32960f() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(m15.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f23994P, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: g */
    public void mo32961g() {
        FrameLayout frameLayout = this.f23996B;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f23995A.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public C0177g getItemData() {
        return this.f23997C;
    }

    /* renamed from: h */
    public final boolean mo32962h() {
        if (this.f23997C.getTitle() == null && this.f23997C.getIcon() == null && this.f23997C.getActionView() != null) {
            return true;
        }
        return false;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0177g gVar = this.f23997C;
        if (gVar != null && gVar.isCheckable() && this.f23997C.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f23994P);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f24004y != z) {
            this.f24004y = z;
            this.f24001M.mo9958l(this.f23995A, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f23995A.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f23999I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = ij1.m19659r(drawable).mutate();
                ij1.m19656o(drawable, this.f23998H);
            }
            int i = this.f24002s;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f24003x) {
            if (this.f24000L == null) {
                Drawable f = uf5.m28223f(getResources(), s25.navigation_empty_icon, getContext().getTheme());
                this.f24000L = f;
                if (f != null) {
                    int i2 = this.f24002s;
                    f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f24000L;
        }
        lo6.m21656j(this.f23995A, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f23995A.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f24002s = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f23998H = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f23999I = z;
        C0177g gVar = this.f23997C;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f23995A.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f24003x = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        lo6.m21661o(this.f23995A, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f23995A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f23995A.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4327a aVar = new C4327a();
        this.f24001M = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(c45.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(k25.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(g35.design_menu_item_text);
        this.f23995A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ga7.m17785p0(checkedTextView, aVar);
    }
}
