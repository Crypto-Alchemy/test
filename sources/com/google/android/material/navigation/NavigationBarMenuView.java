package com.google.android.material.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0184j;
import androidx.transition.AutoTransition;
import androidx.transition.C1460c;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import java.util.HashSet;
import p000.C3335t8;

public abstract class NavigationBarMenuView extends ViewGroup implements C0184j {

    /* renamed from: e0 */
    public static final int[] f24110e0 = {16842912};

    /* renamed from: k0 */
    public static final int[] f24111k0 = {-16842910};

    /* renamed from: A */
    public int f24112A;

    /* renamed from: B */
    public ColorStateList f24113B;

    /* renamed from: C */
    public final ColorStateList f24114C = mo33127e(16842808);

    /* renamed from: H */
    public int f24115H;

    /* renamed from: I */
    public int f24116I;

    /* renamed from: L */
    public Drawable f24117L;

    /* renamed from: M */
    public int f24118M;

    /* renamed from: P */
    public SparseArray<BadgeDrawable> f24119P = new SparseArray<>(5);

    /* renamed from: Q */
    public NavigationBarPresenter f24120Q;

    /* renamed from: U */
    public C0173e f24121U;

    /* renamed from: a */
    public final TransitionSet f24122a;

    /* renamed from: d */
    public final View.OnClickListener f24123d;

    /* renamed from: e */
    public final ys4<NavigationBarItemView> f24124e = new ct4(5);

    /* renamed from: g */
    public final SparseArray<View.OnTouchListener> f24125g = new SparseArray<>(5);

    /* renamed from: k */
    public int f24126k;

    /* renamed from: r */
    public NavigationBarItemView[] f24127r;

    /* renamed from: s */
    public int f24128s = 0;

    /* renamed from: x */
    public int f24129x = 0;

    /* renamed from: y */
    public ColorStateList f24130y;

    /* renamed from: com.google.android.material.navigation.NavigationBarMenuView$a */
    public class C4336a implements View.OnClickListener {
        public C4336a() {
        }

        public void onClick(View view) {
            C0177g itemData = ((NavigationBarItemView) view).getItemData();
            if (!NavigationBarMenuView.this.f24121U.mo1387O(itemData, NavigationBarMenuView.this.f24120Q, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        AutoTransition autoTransition = new AutoTransition();
        this.f24122a = autoTransition;
        autoTransition.mo10556H0(0);
        autoTransition.mo10525k0(115);
        autoTransition.mo10528m0(new bz1());
        autoTransition.mo10562w0(new do6());
        this.f24123d = new C4336a();
        ga7.m17714A0(this, 1);
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView b = this.f24124e.mo11139b();
        if (b == null) {
            return mo31843f(getContext());
        }
        return b;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (mo33142h(id) && (badgeDrawable = this.f24119P.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    /* renamed from: a */
    public void mo1284a(C0173e eVar) {
        this.f24121U = eVar;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: d */
    public void mo33126d() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f24124e.mo11138a(navigationBarItemView);
                    navigationBarItemView.mo33102h();
                }
            }
        }
        if (this.f24121U.size() == 0) {
            this.f24128s = 0;
            this.f24129x = 0;
            this.f24127r = null;
            return;
        }
        mo33143i();
        this.f24127r = new NavigationBarItemView[this.f24121U.size()];
        boolean g = mo33128g(this.f24126k, this.f24121U.mo1379G().size());
        for (int i = 0; i < this.f24121U.size(); i++) {
            this.f24120Q.mo33161m(true);
            this.f24121U.getItem(i).setCheckable(true);
            this.f24120Q.mo33161m(false);
            NavigationBarItemView newItem = getNewItem();
            this.f24127r[i] = newItem;
            newItem.setIconTintList(this.f24130y);
            newItem.setIconSize(this.f24112A);
            newItem.setTextColor(this.f24114C);
            newItem.setTextAppearanceInactive(this.f24115H);
            newItem.setTextAppearanceActive(this.f24116I);
            newItem.setTextColor(this.f24113B);
            Drawable drawable = this.f24117L;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f24118M);
            }
            newItem.setShifting(g);
            newItem.setLabelVisibilityMode(this.f24126k);
            C0177g gVar = (C0177g) this.f24121U.getItem(i);
            newItem.mo1260c(gVar, 0);
            newItem.setItemPosition(i);
            int itemId = gVar.getItemId();
            newItem.setOnTouchListener(this.f24125g.get(itemId));
            newItem.setOnClickListener(this.f24123d);
            int i2 = this.f24128s;
            if (i2 != 0 && itemId == i2) {
                this.f24129x = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f24121U.size() - 1, this.f24129x);
        this.f24129x = min;
        this.f24121U.getItem(min).setChecked(true);
    }

    /* renamed from: e */
    public ColorStateList mo33127e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C2554in.m19713a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(m15.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f24111k0;
        return new ColorStateList(new int[][]{iArr, f24110e0, ViewGroup.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: f */
    public abstract NavigationBarItemView mo31843f(Context context);

    /* renamed from: g */
    public boolean mo33128g(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f24119P;
    }

    public ColorStateList getIconTintList() {
        return this.f24130y;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) {
            return this.f24117L;
        }
        return navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f24118M;
    }

    public int getItemIconSize() {
        return this.f24112A;
    }

    public int getItemTextAppearanceActive() {
        return this.f24116I;
    }

    public int getItemTextAppearanceInactive() {
        return this.f24115H;
    }

    public ColorStateList getItemTextColor() {
        return this.f24113B;
    }

    public int getLabelVisibilityMode() {
        return this.f24126k;
    }

    public C0173e getMenu() {
        return this.f24121U;
    }

    public int getSelectedItemId() {
        return this.f24128s;
    }

    public int getSelectedItemPosition() {
        return this.f24129x;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public final boolean mo33142h(int i) {
        return i != -1;
    }

    /* renamed from: i */
    public final void mo33143i() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f24121U.size(); i++) {
            hashSet.add(Integer.valueOf(this.f24121U.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f24119P.size(); i2++) {
            int keyAt = this.f24119P.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f24119P.delete(keyAt);
            }
        }
    }

    /* renamed from: j */
    public void mo33144j(int i) {
        int size = this.f24121U.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f24121U.getItem(i2);
            if (i == item.getItemId()) {
                this.f24128s = i;
                this.f24129x = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* renamed from: k */
    public void mo33145k() {
        C0173e eVar = this.f24121U;
        if (eVar != null && this.f24127r != null) {
            int size = eVar.size();
            if (size != this.f24127r.length) {
                mo33126d();
                return;
            }
            int i = this.f24128s;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f24121U.getItem(i2);
                if (item.isChecked()) {
                    this.f24128s = item.getItemId();
                    this.f24129x = i2;
                }
            }
            if (i != this.f24128s) {
                C1460c.m10211a(this, this.f24122a);
            }
            boolean g = mo33128g(this.f24126k, this.f24121U.mo1379G().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f24120Q.mo33161m(true);
                this.f24127r[i3].setLabelVisibilityMode(this.f24126k);
                this.f24127r[i3].setShifting(g);
                this.f24127r[i3].mo1260c((C0177g) this.f24121U.getItem(i3), 0);
                this.f24120Q.mo33161m(false);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3335t8.m27495S0(accessibilityNodeInfo).mo26243h0(C3335t8.C3337b.m27595b(1, this.f24121U.mo1379G().size(), false, 1));
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f24119P = sparseArray;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(sparseArray.get(navigationBarItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f24130y = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconTintList : navigationBarItemViewArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f24117L = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f24118M = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView itemBackground : navigationBarItemViewArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.f24112A = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView iconSize : navigationBarItemViewArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f24125g.remove(i);
        } else {
            this.f24125g.put(i, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f24116I = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f24113B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f24115H = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f24113B;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f24113B = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.f24127r;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView textColor : navigationBarItemViewArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f24126k = i;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.f24120Q = navigationBarPresenter;
    }
}
