package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.ScrimInsetsFrameLayout;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: H */
    public static final int[] f24148H = {16842912};

    /* renamed from: I */
    public static final int[] f24149I = {-16842910};

    /* renamed from: L */
    public static final int f24150L = e55.Widget_Design_NavigationView;

    /* renamed from: A */
    public final int[] f24151A;

    /* renamed from: B */
    public MenuInflater f24152B;

    /* renamed from: C */
    public ViewTreeObserver.OnGlobalLayoutListener f24153C;

    /* renamed from: r */
    public final w44 f24154r;

    /* renamed from: s */
    public final x44 f24155s;

    /* renamed from: x */
    public C4346c f24156x;

    /* renamed from: y */
    public final int f24157y;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C4344a implements C0173e.C0174a {
        public C4344a() {
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            C4346c cVar = NavigationView.this.f24156x;
            if (cVar == null || !cVar.mo33251a(menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class C4345b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C4345b() {
        }

        public void onGlobalLayout() {
            boolean z;
            boolean z2;
            boolean z3;
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f24151A);
            boolean z4 = true;
            if (NavigationView.this.f24151A[1] == 0) {
                z = true;
            } else {
                z = false;
            }
            NavigationView.this.f24155s.mo49371x(z);
            NavigationView.this.setDrawTopInsetForeground(z);
            Activity a = is0.m45933a(NavigationView.this.getContext());
            if (a != null) {
                if (a.findViewById(16908290).getHeight() == NavigationView.this.getHeight()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Color.alpha(a.getWindow().getNavigationBarColor()) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                NavigationView navigationView2 = NavigationView.this;
                if (!z2 || !z3) {
                    z4 = false;
                }
                navigationView2.setDrawBottomInsetForeground(z4);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C4346c {
        /* renamed from: a */
        boolean mo33251a(MenuItem menuItem);
    }

    public NavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f24152B == null) {
            this.f24152B = new yd6(getContext());
        }
        return this.f24152B;
    }

    /* renamed from: a */
    public void mo32998a(hl7 hl7) {
        this.f24155s.mo49360m(hl7);
    }

    /* renamed from: d */
    public final ColorStateList mo33210d(int i) {
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
        int[] iArr = f24149I;
        return new ColorStateList(new int[][]{iArr, f24148H, FrameLayout.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: e */
    public final Drawable mo33211e(yq6 yq6) {
        uo3 uo3 = new uo3(rz5.m51447b(getContext(), yq6.mo28188n(u55.NavigationView_itemShapeAppearance, 0), yq6.mo28188n(u55.NavigationView_itemShapeAppearanceOverlay, 0)).mo47599m());
        uo3.mo48440a0(to3.m52390a(getContext(), yq6, u55.NavigationView_itemShapeFillColor));
        return new InsetDrawable(uo3, yq6.mo28180f(u55.NavigationView_itemShapeInsetStart, 0), yq6.mo28180f(u55.NavigationView_itemShapeInsetTop, 0), yq6.mo28180f(u55.NavigationView_itemShapeInsetEnd, 0), yq6.mo28180f(u55.NavigationView_itemShapeInsetBottom, 0));
    }

    /* renamed from: f */
    public final boolean mo33212f(yq6 yq6) {
        if (yq6.mo28193s(u55.NavigationView_itemShapeAppearance) || yq6.mo28193s(u55.NavigationView_itemShapeAppearanceOverlay)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public View mo33213g(int i) {
        return this.f24155s.mo49370w(i);
    }

    public MenuItem getCheckedItem() {
        return this.f24155s.mo49361n();
    }

    public int getHeaderCount() {
        return this.f24155s.mo49362o();
    }

    public Drawable getItemBackground() {
        return this.f24155s.mo49363p();
    }

    public int getItemHorizontalPadding() {
        return this.f24155s.mo49364q();
    }

    public int getItemIconPadding() {
        return this.f24155s.mo49365r();
    }

    public ColorStateList getItemIconTintList() {
        return this.f24155s.mo49368u();
    }

    public int getItemMaxLines() {
        return this.f24155s.mo49366s();
    }

    public ColorStateList getItemTextColor() {
        return this.f24155s.mo49367t();
    }

    public Menu getMenu() {
        return this.f24154r;
    }

    /* renamed from: h */
    public void mo33223h(int i) {
        this.f24155s.mo49357J(true);
        getMenuInflater().inflate(i, this.f24154r);
        this.f24155s.mo49357J(false);
        this.f24155s.mo1310i(false);
    }

    /* renamed from: i */
    public final void mo33224i() {
        this.f24153C = new C4345b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f24153C);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53443e(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f24153C);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.f24157y), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.f24157y, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        this.f24154r.mo1391S(savedState.f24158e);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f24158e = bundle;
        this.f24154r.mo1393U(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f24154r.findItem(i);
        if (findItem != null) {
            this.f24155s.mo49372y((C0177g) findItem);
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        vo3.m53442d(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f24155s.mo49348A(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(zr0.m31442e(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f24155s.mo49349B(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f24155s.mo49349B(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f24155s.mo49350C(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f24155s.mo49350C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f24155s.mo49351D(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f24155s.mo49352E(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f24155s.mo49353F(i);
    }

    public void setItemTextAppearance(int i) {
        this.f24155s.mo49354G(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f24155s.mo49355H(colorStateList);
    }

    public void setNavigationItemSelectedListener(C4346c cVar) {
        this.f24156x = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        x44 x44 = this.f24155s;
        if (x44 != null) {
            x44.mo49356I(i);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4343a();

        /* renamed from: e */
        public Bundle f24158e;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        public static class C4343a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24158e = parcel.readBundle(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f24158e);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f24150L
            android.content.Context r11 = p000.xo3.m54461c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            x44 r11 = new x44
            r11.<init>()
            r10.f24155s = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.f24151A = r0
            android.content.Context r7 = r10.getContext()
            w44 r8 = new w44
            r8.<init>(r7)
            r10.f24154r = r8
            int[] r2 = p000.u55.NavigationView
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            yq6 r0 = p000.wo6.m54005i(r0, r1, r2, r3, r4, r5)
            int r1 = p000.u55.NavigationView_android_background
            boolean r2 = r0.mo28193s(r1)
            if (r2 == 0) goto L_0x003c
            android.graphics.drawable.Drawable r1 = r0.mo28181g(r1)
            p000.ga7.m17793t0(r10, r1)
        L_0x003c:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L_0x0072
        L_0x004a:
            rz5$b r12 = p000.rz5.m51450e(r7, r12, r13, r6)
            rz5 r12 = r12.mo47599m()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            uo3 r1 = new uo3
            r1.<init>((p000.rz5) r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006c
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.mo48440a0(r12)
        L_0x006c:
            r1.mo48430P(r7)
            p000.ga7.m17793t0(r10, r1)
        L_0x0072:
            int r12 = p000.u55.NavigationView_elevation
            boolean r13 = r0.mo28193s(r12)
            if (r13 == 0) goto L_0x0082
            int r12 = r0.mo28180f(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L_0x0082:
            int r12 = p000.u55.NavigationView_android_fitsSystemWindows
            boolean r12 = r0.mo28175a(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = p000.u55.NavigationView_android_maxWidth
            int r12 = r0.mo28180f(r12, r9)
            r10.f24157y = r12
            int r12 = p000.u55.NavigationView_itemIconTint
            boolean r13 = r0.mo28193s(r12)
            if (r13 == 0) goto L_0x00a0
            android.content.res.ColorStateList r12 = r0.mo28177c(r12)
            goto L_0x00a7
        L_0x00a0:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.mo33210d(r12)
        L_0x00a7:
            int r13 = p000.u55.NavigationView_itemTextAppearance
            boolean r1 = r0.mo28193s(r13)
            r2 = 1
            if (r1 == 0) goto L_0x00b6
            int r13 = r0.mo28188n(r13, r9)
            r1 = r2
            goto L_0x00b8
        L_0x00b6:
            r13 = r9
            r1 = r13
        L_0x00b8:
            int r3 = p000.u55.NavigationView_itemIconSize
            boolean r4 = r0.mo28193s(r3)
            if (r4 == 0) goto L_0x00c7
            int r3 = r0.mo28180f(r3, r9)
            r10.setItemIconSize(r3)
        L_0x00c7:
            r3 = 0
            int r4 = p000.u55.NavigationView_itemTextColor
            boolean r5 = r0.mo28193s(r4)
            if (r5 == 0) goto L_0x00d4
            android.content.res.ColorStateList r3 = r0.mo28177c(r4)
        L_0x00d4:
            if (r1 != 0) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.mo33210d(r3)
        L_0x00df:
            int r4 = p000.u55.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.mo28181g(r4)
            if (r4 != 0) goto L_0x00f1
            boolean r5 = r10.mo33212f(r0)
            if (r5 == 0) goto L_0x00f1
            android.graphics.drawable.Drawable r4 = r10.mo33211e(r0)
        L_0x00f1:
            int r5 = p000.u55.NavigationView_itemHorizontalPadding
            boolean r6 = r0.mo28193s(r5)
            if (r6 == 0) goto L_0x0100
            int r5 = r0.mo28180f(r5, r9)
            r11.mo49349B(r5)
        L_0x0100:
            int r5 = p000.u55.NavigationView_itemIconPadding
            int r5 = r0.mo28180f(r5, r9)
            int r6 = p000.u55.NavigationView_itemMaxLines
            int r6 = r0.mo28185k(r6, r2)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$a r6 = new com.google.android.material.navigation.NavigationView$a
            r6.<init>()
            r8.mo1394V(r6)
            r11.mo49373z(r2)
            r11.mo1312l(r7, r8)
            r11.mo49352E(r12)
            int r12 = r10.getOverScrollMode()
            r11.mo49356I(r12)
            if (r1 == 0) goto L_0x012c
            r11.mo49354G(r13)
        L_0x012c:
            r11.mo49355H(r3)
            r11.mo49348A(r4)
            r11.mo49350C(r5)
            r8.mo1410b(r11)
            androidx.appcompat.view.menu.j r11 = r11.mo49369v(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = p000.u55.NavigationView_menu
            boolean r12 = r0.mo28193s(r11)
            if (r12 == 0) goto L_0x0150
            int r11 = r0.mo28188n(r11, r9)
            r10.mo33223h(r11)
        L_0x0150:
            int r11 = p000.u55.NavigationView_headerLayout
            boolean r12 = r0.mo28193s(r11)
            if (r12 == 0) goto L_0x015f
            int r11 = r0.mo28188n(r11, r9)
            r10.mo33213g(r11)
        L_0x015f:
            r0.mo28194w()
            r10.mo33224i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f24154r.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f24155s.mo49372y((C0177g) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
