package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0184j;
import androidx.media3.common.PlaybackException;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C4184a;
import p000.C3335t8;

public abstract class NavigationBarItemView extends FrameLayout implements C0184j.C0185a {

    /* renamed from: P */
    public static final int[] f24092P = {16842912};

    /* renamed from: A */
    public final TextView f24093A;

    /* renamed from: B */
    public int f24094B = -1;

    /* renamed from: C */
    public C0177g f24095C;

    /* renamed from: H */
    public ColorStateList f24096H;

    /* renamed from: I */
    public Drawable f24097I;

    /* renamed from: L */
    public Drawable f24098L;

    /* renamed from: M */
    public BadgeDrawable f24099M;

    /* renamed from: a */
    public final int f24100a;

    /* renamed from: d */
    public float f24101d;

    /* renamed from: e */
    public float f24102e;

    /* renamed from: g */
    public float f24103g;

    /* renamed from: k */
    public int f24104k;

    /* renamed from: r */
    public boolean f24105r;

    /* renamed from: s */
    public ImageView f24106s;

    /* renamed from: x */
    public final ViewGroup f24107x;

    /* renamed from: y */
    public final TextView f24108y;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    public class C4335a implements View.OnLayoutChangeListener {
        public C4335a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f24106s.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.mo33105m(navigationBarItemView.f24106s);
            }
        }
    }

    public NavigationBarItemView(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f24106s = (ImageView) findViewById(g35.navigation_bar_item_icon_view);
        ViewGroup viewGroup = (ViewGroup) findViewById(g35.navigation_bar_item_labels_group);
        this.f24107x = viewGroup;
        TextView textView = (TextView) findViewById(g35.navigation_bar_item_small_label_view);
        this.f24108y = textView;
        TextView textView2 = (TextView) findViewById(g35.navigation_bar_item_large_label_view);
        this.f24093A = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f24100a = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        viewGroup.setTag(g35.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        ga7.m17714A0(textView, 2);
        ga7.m17714A0(textView2, 2);
        setFocusable(true);
        mo33094e(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f24106s;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C4335a());
        }
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        int i;
        BadgeDrawable badgeDrawable = this.f24099M;
        if (badgeDrawable != null) {
            i = badgeDrawable.getMinimumHeight() / 2;
        } else {
            i = 0;
        }
        return Math.max(i, ((FrameLayout.LayoutParams) this.f24106s.getLayoutParams()).topMargin) + this.f24106s.getMeasuredWidth() + i;
    }

    private int getSuggestedIconWidth() {
        int i;
        BadgeDrawable badgeDrawable = this.f24099M;
        if (badgeDrawable == null) {
            i = 0;
        } else {
            i = badgeDrawable.getMinimumWidth() - this.f24099M.mo31735j();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24106s.getLayoutParams();
        return Math.max(i, layoutParams.leftMargin) + this.f24106s.getMeasuredWidth() + Math.max(i, layoutParams.rightMargin);
    }

    /* renamed from: i */
    public static void m35691i(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: j */
    public static void m35692j(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: n */
    public static void m35693n(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    /* renamed from: c */
    public void mo1260c(C0177g gVar, int i) {
        CharSequence charSequence;
        int i2;
        this.f24095C = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitle());
        setId(gVar.getItemId());
        if (!TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(gVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(gVar.getTooltipText())) {
            charSequence = gVar.getTooltipText();
        } else {
            charSequence = gVar.getTitle();
        }
        if (Build.VERSION.SDK_INT > 23) {
            xr6.m30294a(this, charSequence);
        }
        if (gVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    /* renamed from: d */
    public boolean mo1261d() {
        return false;
    }

    /* renamed from: e */
    public final void mo33094e(float f, float f2) {
        this.f24101d = f - f2;
        this.f24102e = (f2 * 1.0f) / f;
        this.f24103g = (f * 1.0f) / f2;
    }

    /* renamed from: f */
    public final FrameLayout mo33095f(View view) {
        ImageView imageView = this.f24106s;
        if (view != imageView || !C4184a.f23376a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: g */
    public final boolean mo33096g() {
        if (this.f24099M != null) {
            return true;
        }
        return false;
    }

    public BadgeDrawable getBadge() {
        return this.f24099M;
    }

    public int getItemBackgroundResId() {
        return s25.mtrl_navigation_bar_item_background;
    }

    public C0177g getItemData() {
        return this.f24095C;
    }

    public int getItemDefaultMarginResId() {
        return k25.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f24094B;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24107x.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f24107x.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24107x.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f24107x.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: h */
    public void mo33102h() {
        mo33104l(this.f24106s);
    }

    /* renamed from: k */
    public final void mo33103k(View view) {
        if (mo33096g() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C4184a.m34695a(this.f24099M, view, mo33095f(view));
        }
    }

    /* renamed from: l */
    public final void mo33104l(View view) {
        if (mo33096g()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C4184a.m34698d(this.f24099M, view);
            }
            this.f24099M = null;
        }
    }

    /* renamed from: m */
    public final void mo33105m(View view) {
        if (mo33096g()) {
            C4184a.m34699e(this.f24099M, view, mo33095f(view));
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0177g gVar = this.f24095C;
        if (gVar != null && gVar.isCheckable() && this.f24095C.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f24092P);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.f24099M;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence title = this.f24095C.getTitle();
            if (!TextUtils.isEmpty(this.f24095C.getContentDescription())) {
                title = this.f24095C.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f24099M.mo31732h());
        }
        C3335t8 S0 = C3335t8.m27495S0(accessibilityNodeInfo);
        S0.mo26246i0(C3335t8.C3338c.m27596a(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            S0.mo26241g0(false);
            S0.mo26223W(C3335t8.C3336a.f18008i);
        }
        S0.mo26195E0(getResources().getString(y45.item_view_role_description));
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.f24099M = badgeDrawable;
        ImageView imageView = this.f24106s;
        if (imageView != null) {
            mo33103k(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f24093A;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f24093A;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f24108y;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f24108y;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f24104k;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m35691i(this.f24106s, this.f24100a, 49);
                    ViewGroup viewGroup = this.f24107x;
                    m35693n(viewGroup, ((Integer) viewGroup.getTag(g35.mtrl_view_tag_bottom_padding)).intValue());
                    this.f24093A.setVisibility(0);
                } else {
                    m35691i(this.f24106s, this.f24100a, 17);
                    m35693n(this.f24107x, 0);
                    this.f24093A.setVisibility(4);
                }
                this.f24108y.setVisibility(4);
            } else if (i == 1) {
                ViewGroup viewGroup2 = this.f24107x;
                m35693n(viewGroup2, ((Integer) viewGroup2.getTag(g35.mtrl_view_tag_bottom_padding)).intValue());
                if (z) {
                    m35691i(this.f24106s, (int) (((float) this.f24100a) + this.f24101d), 49);
                    m35692j(this.f24093A, 1.0f, 1.0f, 0);
                    TextView textView5 = this.f24108y;
                    float f = this.f24102e;
                    m35692j(textView5, f, f, 4);
                } else {
                    m35691i(this.f24106s, this.f24100a, 49);
                    TextView textView6 = this.f24093A;
                    float f2 = this.f24103g;
                    m35692j(textView6, f2, f2, 4);
                    m35692j(this.f24108y, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                m35691i(this.f24106s, this.f24100a, 17);
                this.f24093A.setVisibility(8);
                this.f24108y.setVisibility(8);
            }
        } else if (this.f24105r) {
            if (z) {
                m35691i(this.f24106s, this.f24100a, 49);
                ViewGroup viewGroup3 = this.f24107x;
                m35693n(viewGroup3, ((Integer) viewGroup3.getTag(g35.mtrl_view_tag_bottom_padding)).intValue());
                this.f24093A.setVisibility(0);
            } else {
                m35691i(this.f24106s, this.f24100a, 17);
                m35693n(this.f24107x, 0);
                this.f24093A.setVisibility(4);
            }
            this.f24108y.setVisibility(4);
        } else {
            ViewGroup viewGroup4 = this.f24107x;
            m35693n(viewGroup4, ((Integer) viewGroup4.getTag(g35.mtrl_view_tag_bottom_padding)).intValue());
            if (z) {
                m35691i(this.f24106s, (int) (((float) this.f24100a) + this.f24101d), 49);
                m35692j(this.f24093A, 1.0f, 1.0f, 0);
                TextView textView7 = this.f24108y;
                float f3 = this.f24102e;
                m35692j(textView7, f3, f3, 4);
            } else {
                m35691i(this.f24106s, this.f24100a, 49);
                TextView textView8 = this.f24093A;
                float f4 = this.f24103g;
                m35692j(textView8, f4, f4, 4);
                m35692j(this.f24108y, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f24108y.setEnabled(z);
        this.f24093A.setEnabled(z);
        this.f24106s.setEnabled(z);
        if (z) {
            ga7.m17724F0(this, kr4.m21020b(getContext(), PlaybackException.ERROR_CODE_BEHIND_LIVE_WINDOW));
        } else {
            ga7.m17724F0(this, (kr4) null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.f24097I) {
            this.f24097I = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = ij1.m19659r(drawable).mutate();
                this.f24098L = drawable;
                ColorStateList colorStateList = this.f24096H;
                if (colorStateList != null) {
                    ij1.m19656o(drawable, colorStateList);
                }
            }
            this.f24106s.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24106s.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f24106s.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f24096H = colorStateList;
        if (this.f24095C != null && (drawable = this.f24098L) != null) {
            ij1.m19656o(drawable, colorStateList);
            this.f24098L.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : zr0.m31442e(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f24094B = i;
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.f24104k != i) {
            this.f24104k = i;
            C0177g gVar = this.f24095C;
            if (gVar != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        boolean z2;
        if (this.f24105r != z) {
            this.f24105r = z;
            C0177g gVar = this.f24095C;
            if (gVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setChecked(gVar.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        lo6.m21661o(this.f24093A, i);
        mo33094e(this.f24108y.getTextSize(), this.f24093A.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        lo6.m21661o(this.f24108y, i);
        mo33094e(this.f24108y.getTextSize(), this.f24093A.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24108y.setTextColor(colorStateList);
            this.f24093A.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f24108y.setText(charSequence);
        this.f24093A.setText(charSequence);
        C0177g gVar = this.f24095C;
        if (gVar == null || TextUtils.isEmpty(gVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0177g gVar2 = this.f24095C;
        if (gVar2 != null && !TextUtils.isEmpty(gVar2.getTooltipText())) {
            charSequence = this.f24095C.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            xr6.m30294a(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        ga7.m17793t0(this, drawable);
    }
}
