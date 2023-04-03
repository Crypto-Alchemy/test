package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0184j;
import androidx.customview.view.AbsSavedState;
import p000.pe7;

public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: a */
    public final u44 f24138a;

    /* renamed from: d */
    public final NavigationBarMenuView f24139d;

    /* renamed from: e */
    public final NavigationBarPresenter f24140e;

    /* renamed from: g */
    public ColorStateList f24141g;

    /* renamed from: k */
    public MenuInflater f24142k;

    /* renamed from: r */
    public C4342d f24143r;

    /* renamed from: s */
    public C4341c f24144s;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4338a();

        /* renamed from: e */
        public Bundle f24145e;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$a */
        public static class C4338a implements Parcelable.ClassLoaderCreator<SavedState> {
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
        public final void mo33202b(Parcel parcel, ClassLoader classLoader) {
            this.f24145e = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f24145e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            mo33202b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$a */
    public class C4339a implements C0173e.C0174a {
        public C4339a() {
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            if (NavigationBarView.this.f24144s != null && menuItem.getItemId() == NavigationBarView.this.getSelectedItemId()) {
                NavigationBarView.this.f24144s.mo33209a(menuItem);
                return true;
            } else if (NavigationBarView.this.f24143r == null || NavigationBarView.this.f24143r.mo37a(menuItem)) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$b */
    public class C4340b implements pe7.C6355e {
        public C4340b() {
        }

        /* renamed from: a */
        public hl7 mo31828a(View view, hl7 hl7, pe7.C6356f fVar) {
            int i;
            fVar.f32687d += hl7.mo21237j();
            boolean z = true;
            if (ga7.m17715B(view) != 1) {
                z = false;
            }
            int k = hl7.mo21238k();
            int l = hl7.mo21239l();
            int i2 = fVar.f32684a;
            if (z) {
                i = l;
            } else {
                i = k;
            }
            fVar.f32684a = i2 + i;
            int i3 = fVar.f32686c;
            if (!z) {
                k = l;
            }
            fVar.f32686c = i3 + k;
            fVar.mo46721a(view);
            return hl7;
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$c */
    public interface C4341c {
        /* renamed from: a */
        void mo33209a(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarView$d */
    public interface C4342d {
        /* renamed from: a */
        boolean mo37a(MenuItem menuItem);
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(xo3.m54461c(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.f24140e = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = u55.NavigationBarView;
        int i3 = u55.NavigationBarView_itemTextAppearanceInactive;
        int i4 = u55.NavigationBarView_itemTextAppearanceActive;
        yq6 i5 = wo6.m54005i(context2, attributeSet, iArr, i, i2, i3, i4);
        u44 u44 = new u44(context2, getClass(), getMaxItemCount());
        this.f24138a = u44;
        NavigationBarMenuView e = mo31848e(context2);
        this.f24139d = e;
        navigationBarPresenter.mo33160c(e);
        navigationBarPresenter.mo33159a(1);
        e.setPresenter(navigationBarPresenter);
        u44.mo1410b(navigationBarPresenter);
        navigationBarPresenter.mo1312l(getContext(), u44);
        int i6 = u55.NavigationBarView_itemIconTint;
        if (i5.mo28193s(i6)) {
            e.setIconTintList(i5.mo28177c(i6));
        } else {
            e.setIconTintList(e.mo33127e(16842808));
        }
        setItemIconSize(i5.mo28180f(u55.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(k25.mtrl_navigation_bar_item_default_icon_size)));
        if (i5.mo28193s(i3)) {
            setItemTextAppearanceInactive(i5.mo28188n(i3, 0));
        }
        if (i5.mo28193s(i4)) {
            setItemTextAppearanceActive(i5.mo28188n(i4, 0));
        }
        int i7 = u55.NavigationBarView_itemTextColor;
        if (i5.mo28193s(i7)) {
            setItemTextColor(i5.mo28177c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ga7.m17793t0(this, mo33169d(context2));
        }
        int i8 = u55.NavigationBarView_elevation;
        if (i5.mo28193s(i8)) {
            setElevation((float) i5.mo28180f(i8, 0));
        }
        ij1.m19656o(getBackground().mutate(), to3.m52390a(context2, i5, u55.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(i5.mo28186l(u55.NavigationBarView_labelVisibilityMode, -1));
        int n = i5.mo28188n(u55.NavigationBarView_itemBackground, 0);
        if (n != 0) {
            e.setItemBackgroundRes(n);
        } else {
            setItemRippleColor(to3.m52390a(context2, i5, u55.NavigationBarView_itemRippleColor));
        }
        int i9 = u55.NavigationBarView_menu;
        if (i5.mo28193s(i9)) {
            mo33170f(i5.mo28188n(i9, 0));
        }
        i5.mo28194w();
        addView(e);
        u44.mo1394V(new C4339a());
        mo33168c();
    }

    private MenuInflater getMenuInflater() {
        if (this.f24142k == null) {
            this.f24142k = new yd6(getContext());
        }
        return this.f24142k;
    }

    /* renamed from: c */
    public final void mo33168c() {
        pe7.m49895a(this, new C4340b());
    }

    /* renamed from: d */
    public final uo3 mo33169d(Context context) {
        uo3 uo3 = new uo3();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            uo3.mo48440a0(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        uo3.mo48430P(context);
        return uo3;
    }

    /* renamed from: e */
    public abstract NavigationBarMenuView mo31848e(Context context);

    /* renamed from: f */
    public void mo33170f(int i) {
        this.f24140e.mo33161m(true);
        getMenuInflater().inflate(i, this.f24138a);
        this.f24140e.mo33161m(false);
        this.f24140e.mo1310i(true);
    }

    public Drawable getItemBackground() {
        return this.f24139d.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f24139d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f24139d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f24139d.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f24141g;
    }

    public int getItemTextAppearanceActive() {
        return this.f24139d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f24139d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f24139d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f24139d.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f24138a;
    }

    public C0184j getMenuView() {
        return this.f24139d;
    }

    public NavigationBarPresenter getPresenter() {
        return this.f24140e;
    }

    public int getSelectedItemId() {
        return this.f24139d.getSelectedItemId();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53443e(this);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        this.f24138a.mo1391S(savedState.f24145e);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f24145e = bundle;
        this.f24138a.mo1393U(bundle);
        return savedState;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        vo3.m53442d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f24139d.setItemBackground(drawable);
        this.f24141g = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f24139d.setItemBackgroundRes(i);
        this.f24141g = null;
    }

    public void setItemIconSize(int i) {
        this.f24139d.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f24139d.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        this.f24139d.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f24141g != colorStateList) {
            this.f24141g = colorStateList;
            if (colorStateList == null) {
                this.f24139d.setItemBackground((Drawable) null);
                return;
            }
            this.f24139d.setItemBackground(new RippleDrawable(bh5.m32530a(colorStateList), (Drawable) null, (Drawable) null));
        } else if (colorStateList == null && this.f24139d.getItemBackground() != null) {
            this.f24139d.setItemBackground((Drawable) null);
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f24139d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f24139d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f24139d.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f24139d.getLabelVisibilityMode() != i) {
            this.f24139d.setLabelVisibilityMode(i);
            this.f24140e.mo1310i(false);
        }
    }

    public void setOnItemReselectedListener(C4341c cVar) {
        this.f24144s = cVar;
    }

    public void setOnItemSelectedListener(C4342d dVar) {
        this.f24143r = dVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f24138a.findItem(i);
        if (findItem != null && !this.f24138a.mo1387O(findItem, this.f24140e, 0)) {
            findItem.setChecked(true);
        }
    }
}
