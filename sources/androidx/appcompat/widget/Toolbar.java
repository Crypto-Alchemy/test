package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0189l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toolbar extends ViewGroup implements it3 {

    /* renamed from: A */
    public Context f1228A;

    /* renamed from: A1 */
    public C0274a f1229A1;

    /* renamed from: B */
    public int f1230B;

    /* renamed from: B1 */
    public ActionMenuPresenter f1231B1;

    /* renamed from: C */
    public int f1232C;

    /* renamed from: C1 */
    public C0271d f1233C1;

    /* renamed from: D1 */
    public C0182i.C0183a f1234D1;

    /* renamed from: E1 */
    public C0173e.C0174a f1235E1;

    /* renamed from: F1 */
    public boolean f1236F1;

    /* renamed from: G1 */
    public final Runnable f1237G1;

    /* renamed from: H */
    public int f1238H;

    /* renamed from: I */
    public int f1239I;

    /* renamed from: L */
    public int f1240L;

    /* renamed from: M */
    public int f1241M;

    /* renamed from: P */
    public int f1242P;

    /* renamed from: Q */
    public int f1243Q;

    /* renamed from: U */
    public int f1244U;

    /* renamed from: a */
    public ActionMenuView f1245a;

    /* renamed from: b1 */
    public int f1246b1;

    /* renamed from: d */
    public TextView f1247d;

    /* renamed from: e */
    public TextView f1248e;

    /* renamed from: e0 */
    public ii5 f1249e0;

    /* renamed from: e1 */
    public CharSequence f1250e1;

    /* renamed from: g */
    public ImageButton f1251g;

    /* renamed from: k */
    public ImageView f1252k;

    /* renamed from: k0 */
    public int f1253k0;

    /* renamed from: o1 */
    public CharSequence f1254o1;

    /* renamed from: p1 */
    public ColorStateList f1255p1;

    /* renamed from: q1 */
    public ColorStateList f1256q1;

    /* renamed from: r */
    public Drawable f1257r;

    /* renamed from: r1 */
    public boolean f1258r1;

    /* renamed from: s */
    public CharSequence f1259s;

    /* renamed from: s1 */
    public boolean f1260s1;

    /* renamed from: t1 */
    public final ArrayList<View> f1261t1;

    /* renamed from: u1 */
    public final ArrayList<View> f1262u1;

    /* renamed from: v0 */
    public int f1263v0;

    /* renamed from: v1 */
    public final int[] f1264v1;

    /* renamed from: w1 */
    public final lt3 f1265w1;

    /* renamed from: x */
    public ImageButton f1266x;

    /* renamed from: x1 */
    public ArrayList<MenuItem> f1267x1;

    /* renamed from: y */
    public View f1268y;

    /* renamed from: y1 */
    public C0272e f1269y1;

    /* renamed from: z1 */
    public final ActionMenuView.C0207d f1270z1;

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0268a implements ActionMenuView.C0207d {
        public C0268a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1265w1.mo22972j(menuItem)) {
                return true;
            }
            C0272e eVar = Toolbar.this.f1269y1;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    public class C0269b implements Runnable {
        public C0269b() {
        }

        public void run() {
            Toolbar.this.mo2449L();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    public class C0270c implements View.OnClickListener {
        public C0270c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo2455e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0271d implements C0182i {

        /* renamed from: a */
        public C0173e f1277a;

        /* renamed from: d */
        public C0177g f1278d;

        public C0271d() {
        }

        /* renamed from: b */
        public void mo1304b(C0173e eVar, boolean z) {
        }

        /* renamed from: d */
        public boolean mo1306d(C0173e eVar, C0177g gVar) {
            Toolbar.this.mo2457g();
            ViewParent parent = Toolbar.this.f1266x.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1266x);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1266x);
            }
            Toolbar.this.f1268y = gVar.getActionView();
            this.f1278d = gVar;
            ViewParent parent2 = Toolbar.this.f1268y.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1268y);
                }
                LayoutParams m = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m.f400a = 8388611 | (toolbar4.f1239I & 112);
                m.f1271b = 2;
                toolbar4.f1268y.setLayoutParams(m);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1268y);
            }
            Toolbar.this.mo2446I();
            Toolbar.this.requestLayout();
            gVar.mo1508r(true);
            View view = Toolbar.this.f1268y;
            if (view instanceof fi0) {
                ((fi0) view).onActionViewExpanded();
            }
            return true;
        }

        /* renamed from: f */
        public void mo1331f(Parcelable parcelable) {
        }

        /* renamed from: g */
        public boolean mo1308g(C0189l lVar) {
            return false;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: h */
        public Parcelable mo1332h() {
            return null;
        }

        /* renamed from: i */
        public void mo1310i(boolean z) {
            if (this.f1278d != null) {
                C0173e eVar = this.f1277a;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1277a.getItem(i) == this.f1278d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1311k(this.f1277a, this.f1278d);
                }
            }
        }

        /* renamed from: j */
        public boolean mo1333j() {
            return false;
        }

        /* renamed from: k */
        public boolean mo1311k(C0173e eVar, C0177g gVar) {
            View view = Toolbar.this.f1268y;
            if (view instanceof fi0) {
                ((fi0) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1268y);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1266x);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1268y = null;
            toolbar3.mo2450a();
            this.f1278d = null;
            Toolbar.this.requestLayout();
            gVar.mo1508r(false);
            return true;
        }

        /* renamed from: l */
        public void mo1312l(Context context, C0173e eVar) {
            C0177g gVar;
            C0173e eVar2 = this.f1277a;
            if (!(eVar2 == null || (gVar = this.f1278d) == null)) {
                eVar2.mo1421f(gVar);
            }
            this.f1277a = eVar;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public interface C0272e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new yd6(getContext());
    }

    /* renamed from: A */
    public boolean mo2438A() {
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView == null || !actionMenuView.mo1730l()) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    public boolean mo2439B() {
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView == null || !actionMenuView.mo1731m()) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final int mo2440C(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = mo2509q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: D */
    public final int mo2441D(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = mo2509q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: E */
    public final int mo2442E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    public final void mo2443F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    public final void mo2444G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1265w1.mo22970h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1267x1 = currentMenuItems2;
        this.f1265w1.mo22973k(menu);
    }

    /* renamed from: H */
    public final void mo2445H() {
        removeCallbacks(this.f1237G1);
        post(this.f1237G1);
    }

    /* renamed from: I */
    public void mo2446I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1271b == 2 || childAt == this.f1245a)) {
                removeViewAt(childCount);
                this.f1262u1.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public final boolean mo2447J() {
        if (!this.f1236F1) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo2448K(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: K */
    public final boolean mo2448K(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public boolean mo2449L() {
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView == null || !actionMenuView.mo1739r()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo2450a() {
        for (int size = this.f1262u1.size() - 1; size >= 0; size--) {
            addView(this.f1262u1.get(size));
        }
        this.f1262u1.clear();
    }

    public void addMenuProvider(eu3 eu3) {
        this.f1265w1.mo22967c(eu3);
    }

    /* renamed from: b */
    public final void mo2451b(List<View> list, int i) {
        boolean z;
        if (ga7.m17715B(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int b = pj2.m24971b(i, ga7.m17715B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1271b == 0 && mo2448K(childAt) && mo2508p(layoutParams.f400a) == b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1271b == 0 && mo2448K(childAt2) && mo2508p(layoutParams2.f400a) == b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void mo2452c(View view, boolean z) {
        LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1271b = 1;
        if (!z || this.f1268y == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1262u1.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean mo2454d() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.f1245a) == null || !actionMenuView.mo1732n()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo2455e() {
        C0177g gVar;
        C0271d dVar = this.f1233C1;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f1278d;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public void mo2456f() {
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView != null) {
            actionMenuView.mo1716e();
        }
    }

    /* renamed from: g */
    public void mo2457g() {
        if (this.f1266x == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, m15.toolbarNavigationButtonStyle);
            this.f1266x = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f1257r);
            this.f1266x.setContentDescription(this.f1259s);
            LayoutParams m = generateDefaultLayoutParams();
            m.f400a = 8388611 | (this.f1239I & 112);
            m.f1271b = 2;
            this.f1266x.setLayoutParams(m);
            this.f1266x.setOnClickListener(new C0270c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1266x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1266x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        ii5 ii5 = this.f1249e0;
        if (ii5 != null) {
            return ii5.mo21542a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1263v0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ii5 ii5 = this.f1249e0;
        if (ii5 != null) {
            return ii5.mo21543b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        ii5 ii5 = this.f1249e0;
        if (ii5 != null) {
            return ii5.mo21544c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        ii5 ii5 = this.f1249e0;
        if (ii5 != null) {
            return ii5.mo21545d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1253k0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0173e q;
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView == null || (q = actionMenuView.mo1738q()) == null || !q.hasVisibleItems()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1263v0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (ga7.m17715B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ga7.m17715B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1253k0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1252k;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1252k;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        mo2494j();
        return this.f1245a.getMenu();
    }

    public View getNavButtonView() {
        return this.f1251g;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1251g;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1251g;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1231B1;
    }

    public Drawable getOverflowIcon() {
        mo2494j();
        return this.f1245a.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f1228A;
    }

    public int getPopupTheme() {
        return this.f1230B;
    }

    public CharSequence getSubtitle() {
        return this.f1254o1;
    }

    public final TextView getSubtitleTextView() {
        return this.f1248e;
    }

    public CharSequence getTitle() {
        return this.f1250e1;
    }

    public int getTitleMarginBottom() {
        return this.f1244U;
    }

    public int getTitleMarginEnd() {
        return this.f1242P;
    }

    public int getTitleMarginStart() {
        return this.f1241M;
    }

    public int getTitleMarginTop() {
        return this.f1243Q;
    }

    public final TextView getTitleTextView() {
        return this.f1247d;
    }

    public r31 getWrapper() {
        if (this.f1229A1 == null) {
            this.f1229A1 = new C0274a(this, true);
        }
        return this.f1229A1;
    }

    /* renamed from: h */
    public final void mo2492h() {
        if (this.f1249e0 == null) {
            this.f1249e0 = new ii5();
        }
    }

    /* renamed from: i */
    public final void mo2493i() {
        if (this.f1252k == null) {
            this.f1252k = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: j */
    public final void mo2494j() {
        mo2495k();
        if (this.f1245a.mo1738q() == null) {
            C0173e eVar = (C0173e) this.f1245a.getMenu();
            if (this.f1233C1 == null) {
                this.f1233C1 = new C0271d();
            }
            this.f1245a.setExpandedActionViewsExclusive(true);
            eVar.mo1412c(this.f1233C1, this.f1228A);
        }
    }

    /* renamed from: k */
    public final void mo2495k() {
        if (this.f1245a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1245a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1230B);
            this.f1245a.setOnMenuItemClickListener(this.f1270z1);
            this.f1245a.setMenuCallbacks(this.f1234D1, this.f1235E1);
            LayoutParams m = generateDefaultLayoutParams();
            m.f400a = 8388613 | (this.f1239I & 112);
            this.f1245a.setLayoutParams(m);
            mo2452c(this.f1245a, false);
        }
    }

    /* renamed from: l */
    public final void mo2496l() {
        if (this.f1251g == null) {
            this.f1251g = new AppCompatImageButton(getContext(), (AttributeSet) null, m15.toolbarNavigationButtonStyle);
            LayoutParams m = generateDefaultLayoutParams();
            m.f400a = 8388611 | (this.f1239I & 112);
            this.f1251g.setLayoutParams(m);
        }
    }

    /* renamed from: m */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: n */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: o */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ActionBar.LayoutParams) {
            return new LayoutParams((ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1237G1);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1260s1 = false;
        }
        if (!this.f1260s1) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1260s1 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1260s1 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fa A[LOOP:2: B:112:0x02f8->B:113:0x02fa, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = p000.ga7.m17715B(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = r2
            goto L_0x000d
        L_0x000c:
            r1 = r3
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1264v1
            r11[r2] = r3
            r11[r3] = r3
            int r12 = p000.ga7.m17717C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r3
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1251g
            boolean r13 = r0.mo2448K(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1251g
            int r13 = r0.mo2441D(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1251g
            int r13 = r0.mo2440C(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1266x
            boolean r15 = r0.mo2448K(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1266x
            int r14 = r0.mo2441D(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1266x
            int r13 = r0.mo2440C(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1245a
            boolean r15 = r0.mo2448K(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1245a
            int r13 = r0.mo2440C(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1245a
            int r14 = r0.mo2441D(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1268y
            boolean r13 = r0.mo2448K(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1268y
            int r10 = r0.mo2441D(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1268y
            int r2 = r0.mo2440C(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1252k
            boolean r13 = r0.mo2448K(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1252k
            int r10 = r0.mo2441D(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1252k
            int r2 = r0.mo2440C(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1247d
            boolean r13 = r0.mo2448K(r13)
            android.widget.TextView r14 = r0.f1248e
            boolean r14 = r0.mo2448K(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1247d
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1247d
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1248e
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1248e
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r18 = r6
            r22 = r12
        L_0x0128:
            r1 = 0
            goto L_0x0290
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1247d
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1248e
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1248e
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1247d
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1247d
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015c
            android.widget.TextView r15 = r0.f1248e
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015c
        L_0x0159:
            r17 = 1
            goto L_0x015e
        L_0x015c:
            r17 = 0
        L_0x015e:
            int r15 = r0.f1246b1
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a6
            r6 = 80
            if (r15 == r6) goto L_0x0198
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f1243Q
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0181
            int r6 = r15 + r12
            goto L_0x0196
        L_0x0181:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1244U
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0196
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0196:
            int r8 = r8 + r6
            goto L_0x01b5
        L_0x0198:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1244U
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b5
        L_0x01a6:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1243Q
            int r8 = r2 + r3
        L_0x01b5:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f1241M
            goto L_0x01bd
        L_0x01bc:
            r1 = 0
        L_0x01bd:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f1247d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1247d
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1247d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1247d
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1242P
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f1248e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f1248e
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f1248e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1248e
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f1242P
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r2 = r24
            goto L_0x0128
        L_0x0227:
            if (r17 == 0) goto L_0x022d
            int r7 = r0.f1241M
            r1 = 0
            goto L_0x022f
        L_0x022d:
            r1 = 0
            r7 = 0
        L_0x022f:
            r2 = r11[r1]
            int r7 = r7 - r2
            int r2 = java.lang.Math.max(r1, r7)
            int r2 = r24 + r2
            int r3 = -r7
            int r3 = java.lang.Math.max(r1, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x0264
            android.widget.TextView r3 = r0.f1247d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            android.widget.TextView r4 = r0.f1247d
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1247d
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1247d
            r6.layout(r2, r8, r4, r5)
            int r6 = r0.f1242P
            int r4 = r4 + r6
            int r3 = r3.bottomMargin
            int r8 = r5 + r3
            goto L_0x0265
        L_0x0264:
            r4 = r2
        L_0x0265:
            if (r14 == 0) goto L_0x0289
            android.widget.TextView r3 = r0.f1248e
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r3 = r3.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1248e
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r5 = r0.f1248e
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1248e
            r6.layout(r2, r8, r3, r5)
            int r5 = r0.f1242P
            int r3 = r3 + r5
            goto L_0x028a
        L_0x0289:
            r3 = r2
        L_0x028a:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r4, r3)
        L_0x0290:
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            r4 = 3
            r0.mo2451b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            int r3 = r3.size()
            r7 = r1
        L_0x029d:
            if (r7 >= r3) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.f1261t1
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r2 = r0.mo2440C(r4, r2, r11, r12)
            int r7 = r7 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            r4 = 5
            r0.mo2451b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            int r3 = r3.size()
            r7 = r1
        L_0x02bf:
            if (r7 >= r3) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.f1261t1
            java.lang.Object r4 = r4.get(r7)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.mo2441D(r4, r10, r11, r12)
            int r7 = r7 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            r4 = 1
            r0.mo2451b(r3, r4)
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            int r3 = r0.mo2551u(r3, r11)
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r18 + r4
            int r4 = r3 / 2
            int r6 = r6 - r4
            int r3 = r3 + r6
            if (r6 >= r2) goto L_0x02eb
            goto L_0x02f2
        L_0x02eb:
            if (r3 <= r10) goto L_0x02f1
            int r3 = r3 - r10
            int r2 = r6 - r3
            goto L_0x02f2
        L_0x02f1:
            r2 = r6
        L_0x02f2:
            java.util.ArrayList<android.view.View> r3 = r0.f1261t1
            int r3 = r3.size()
        L_0x02f8:
            if (r1 >= r3) goto L_0x0309
            java.util.ArrayList<android.view.View> r4 = r0.f1261t1
            java.lang.Object r4 = r4.get(r1)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.mo2440C(r4, r2, r11, r12)
            int r1 = r1 + 1
            goto L_0x02f8
        L_0x0309:
            java.util.ArrayList<android.view.View> r1 = r0.f1261t1
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1264v1;
        char b = re7.m26176b(this);
        int i10 = 0;
        char c = b ^ 1;
        if (mo2448K(this.f1251g)) {
            mo2443F(this.f1251g, i, 0, i2, 0, this.f1240L);
            i5 = this.f1251g.getMeasuredWidth() + mo2511s(this.f1251g);
            i4 = Math.max(0, this.f1251g.getMeasuredHeight() + mo2550t(this.f1251g));
            i3 = View.combineMeasuredStates(0, this.f1251g.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (mo2448K(this.f1266x)) {
            mo2443F(this.f1266x, i, 0, i2, 0, this.f1240L);
            i5 = this.f1266x.getMeasuredWidth() + mo2511s(this.f1266x);
            i4 = Math.max(i4, this.f1266x.getMeasuredHeight() + mo2550t(this.f1266x));
            i3 = View.combineMeasuredStates(i3, this.f1266x.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[b] = Math.max(0, currentContentInsetStart - i5);
        if (mo2448K(this.f1245a)) {
            mo2443F(this.f1245a, i, max, i2, 0, this.f1240L);
            i6 = this.f1245a.getMeasuredWidth() + mo2511s(this.f1245a);
            i4 = Math.max(i4, this.f1245a.getMeasuredHeight() + mo2550t(this.f1245a));
            i3 = View.combineMeasuredStates(i3, this.f1245a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (mo2448K(this.f1268y)) {
            max2 += mo2442E(this.f1268y, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1268y.getMeasuredHeight() + mo2550t(this.f1268y));
            i3 = View.combineMeasuredStates(i3, this.f1268y.getMeasuredState());
        }
        if (mo2448K(this.f1252k)) {
            max2 += mo2442E(this.f1252k, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1252k.getMeasuredHeight() + mo2550t(this.f1252k));
            i3 = View.combineMeasuredStates(i3, this.f1252k.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((LayoutParams) childAt.getLayoutParams()).f1271b == 0 && mo2448K(childAt)) {
                max2 += mo2442E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + mo2550t(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1243Q + this.f1244U;
        int i13 = this.f1241M + this.f1242P;
        if (mo2448K(this.f1247d)) {
            mo2442E(this.f1247d, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1247d.getMeasuredWidth() + mo2511s(this.f1247d);
            i7 = this.f1247d.getMeasuredHeight() + mo2550t(this.f1247d);
            i9 = View.combineMeasuredStates(i3, this.f1247d.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (mo2448K(this.f1248e)) {
            i8 = Math.max(i8, mo2442E(this.f1248e, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1248e.getMeasuredHeight() + mo2550t(this.f1248e);
            i9 = View.combineMeasuredStates(i9, this.f1248e.getMeasuredState());
        } else {
            int i14 = i9;
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (!mo2447J()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C0173e eVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView != null) {
            eVar = actionMenuView.mo1738q();
        } else {
            eVar = null;
        }
        int i = savedState.f1272e;
        if (!(i == 0 || this.f1233C1 == null || eVar == null || (findItem = eVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1273g) {
            mo2445H();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        mo2492h();
        ii5 ii5 = this.f1249e0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        ii5.mo21547f(z);
    }

    public Parcelable onSaveInstanceState() {
        C0177g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0271d dVar = this.f1233C1;
        if (!(dVar == null || (gVar = dVar.f1278d) == null)) {
            savedState.f1272e = gVar.getItemId();
        }
        savedState.f1273g = mo2439B();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1258r1 = false;
        }
        if (!this.f1258r1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1258r1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1258r1 = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo2508p(int i) {
        int B = ga7.m17715B(this);
        int b = pj2.m24971b(i, B) & 7;
        if (b == 1 || b == 3 || b == 5) {
            return b;
        }
        if (B == 1) {
            return 5;
        }
        return 3;
    }

    /* renamed from: q */
    public final int mo2509q(View view, int i) {
        int i2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int r = mo2510r(layoutParams.f400a);
        if (r == 48) {
            return getPaddingTop() - i2;
        }
        if (r == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = layoutParams.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = layoutParams.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: r */
    public final int mo2510r(int i) {
        int i2 = i & 112;
        if (i2 == 16 || i2 == 48 || i2 == 80) {
            return i2;
        }
        return this.f1246b1 & 112;
    }

    public void removeMenuProvider(eu3 eu3) {
        this.f1265w1.mo22974l(eu3);
    }

    /* renamed from: s */
    public final int mo2511s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return do3.m15248b(marginLayoutParams) + do3.m15247a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C2554in.m19714b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1236F1 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1263v0) {
            this.f1263v0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1253k0) {
            this.f1253k0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        mo2492h();
        this.f1249e0.mo21546e(i, i2);
    }

    public void setContentInsetsRelative(int i, int i2) {
        mo2492h();
        this.f1249e0.mo21548g(i, i2);
    }

    public void setLogo(int i) {
        setLogo(C2554in.m19714b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setMenu(C0173e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar != null || this.f1245a != null) {
            mo2495k();
            C0173e q = this.f1245a.mo1738q();
            if (q != eVar) {
                if (q != null) {
                    q.mo1389Q(this.f1231B1);
                    q.mo1389Q(this.f1233C1);
                }
                if (this.f1233C1 == null) {
                    this.f1233C1 = new C0271d();
                }
                actionMenuPresenter.mo1698J(true);
                if (eVar != null) {
                    eVar.mo1412c(actionMenuPresenter, this.f1228A);
                    eVar.mo1412c(this.f1233C1, this.f1228A);
                } else {
                    actionMenuPresenter.mo1312l(this.f1228A, (C0173e) null);
                    this.f1233C1.mo1312l(this.f1228A, (C0173e) null);
                    actionMenuPresenter.mo1310i(true);
                    this.f1233C1.mo1310i(true);
                }
                this.f1245a.setPopupTheme(this.f1230B);
                this.f1245a.setPresenter(actionMenuPresenter);
                this.f1231B1 = actionMenuPresenter;
            }
        }
    }

    public void setMenuCallbacks(C0182i.C0183a aVar, C0173e.C0174a aVar2) {
        this.f1234D1 = aVar;
        this.f1235E1 = aVar2;
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C2554in.m19714b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        mo2496l();
        this.f1251g.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0272e eVar) {
        this.f1269y1 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        mo2494j();
        this.f1245a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1230B != i) {
            this.f1230B = i;
            if (i == 0) {
                this.f1228A = getContext();
            } else {
                this.f1228A = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f1238H = i;
        TextView textView = this.f1248e;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f1241M = i;
        this.f1243Q = i2;
        this.f1242P = i3;
        this.f1244U = i4;
        requestLayout();
    }

    public void setTitleMarginBottom(int i) {
        this.f1244U = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1242P = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1241M = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1243Q = i;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f1232C = i;
        TextView textView = this.f1247d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final int mo2550t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int mo2551u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i5 = layoutParams.leftMargin - i;
            int i6 = layoutParams.rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: v */
    public boolean mo2552v() {
        C0271d dVar = this.f1233C1;
        if (dVar == null || dVar.f1278d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public boolean mo2553w() {
        ActionMenuView actionMenuView = this.f1245a;
        if (actionMenuView == null || !actionMenuView.mo1729k()) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public void mo2554x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void mo2555y() {
        Iterator<MenuItem> it = this.f1267x1.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        mo2444G();
    }

    /* renamed from: z */
    public final boolean mo2556z(View view) {
        if (view.getParent() == this || this.f1262u1.contains(view)) {
            return true;
        }
        return false;
    }

    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b */
        public int f1271b = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public void mo2557a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f400a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f1271b = layoutParams.f1271b;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            mo2557a(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.toolbarStyle);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2457g();
        }
        ImageButton imageButton = this.f1266x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo2457g();
            this.f1266x.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1266x;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1257r);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo2493i();
            if (!mo2556z(this.f1252k)) {
                mo2452c(this.f1252k, true);
            }
        } else {
            ImageView imageView = this.f1252k;
            if (imageView != null && mo2556z(imageView)) {
                removeView(this.f1252k);
                this.f1262u1.remove(this.f1252k);
            }
        }
        ImageView imageView2 = this.f1252k;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2493i();
        }
        ImageView imageView = this.f1252k;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2496l();
        }
        ImageButton imageButton = this.f1251g;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            xr6.m30294a(this.f1251g, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            mo2496l();
            if (!mo2556z(this.f1251g)) {
                mo2452c(this.f1251g, true);
            }
        } else {
            ImageButton imageButton = this.f1251g;
            if (imageButton != null && mo2556z(imageButton)) {
                removeView(this.f1251g);
                this.f1262u1.remove(this.f1251g);
            }
        }
        ImageButton imageButton2 = this.f1251g;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1248e == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1248e = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1248e.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1238H;
                if (i != 0) {
                    this.f1248e.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1256q1;
                if (colorStateList != null) {
                    this.f1248e.setTextColor(colorStateList);
                }
            }
            if (!mo2556z(this.f1248e)) {
                mo2452c(this.f1248e, true);
            }
        } else {
            TextView textView = this.f1248e;
            if (textView != null && mo2556z(textView)) {
                removeView(this.f1248e);
                this.f1262u1.remove(this.f1248e);
            }
        }
        TextView textView2 = this.f1248e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1254o1 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1256q1 = colorStateList;
        TextView textView = this.f1248e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1247d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1247d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1247d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1232C;
                if (i != 0) {
                    this.f1247d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1255p1;
                if (colorStateList != null) {
                    this.f1247d.setTextColor(colorStateList);
                }
            }
            if (!mo2556z(this.f1247d)) {
                mo2452c(this.f1247d, true);
            }
        } else {
            TextView textView = this.f1247d;
            if (textView != null && mo2556z(textView)) {
                removeView(this.f1247d);
                this.f1262u1.remove(this.f1247d);
            }
        }
        TextView textView2 = this.f1247d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1250e1 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1255p1 = colorStateList;
        TextView textView = this.f1247d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0267a();

        /* renamed from: e */
        public int f1272e;

        /* renamed from: g */
        public boolean f1273g;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        public class C0267a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f1272e = parcel.readInt();
            this.f1273g = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1272e);
            parcel.writeInt(this.f1273g ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1246b1 = 8388627;
        this.f1261t1 = new ArrayList<>();
        this.f1262u1 = new ArrayList<>();
        this.f1264v1 = new int[2];
        this.f1265w1 = new lt3(new rr6(this));
        this.f1267x1 = new ArrayList<>();
        this.f1270z1 = new C0268a();
        this.f1237G1 = new C0269b();
        Context context2 = getContext();
        int[] iArr = j65.Toolbar;
        yq6 v = yq6.m30733v(context2, attributeSet, iArr, i, 0);
        ga7.m17781n0(this, context, iArr, attributeSet, v.mo28192r(), i, 0);
        this.f1232C = v.mo28188n(j65.Toolbar_titleTextAppearance, 0);
        this.f1238H = v.mo28188n(j65.Toolbar_subtitleTextAppearance, 0);
        this.f1246b1 = v.mo28186l(j65.Toolbar_android_gravity, this.f1246b1);
        this.f1239I = v.mo28186l(j65.Toolbar_buttonGravity, 48);
        int e = v.mo28179e(j65.Toolbar_titleMargin, 0);
        int i2 = j65.Toolbar_titleMargins;
        e = v.mo28193s(i2) ? v.mo28179e(i2, e) : e;
        this.f1244U = e;
        this.f1243Q = e;
        this.f1242P = e;
        this.f1241M = e;
        int e2 = v.mo28179e(j65.Toolbar_titleMarginStart, -1);
        if (e2 >= 0) {
            this.f1241M = e2;
        }
        int e3 = v.mo28179e(j65.Toolbar_titleMarginEnd, -1);
        if (e3 >= 0) {
            this.f1242P = e3;
        }
        int e4 = v.mo28179e(j65.Toolbar_titleMarginTop, -1);
        if (e4 >= 0) {
            this.f1243Q = e4;
        }
        int e5 = v.mo28179e(j65.Toolbar_titleMarginBottom, -1);
        if (e5 >= 0) {
            this.f1244U = e5;
        }
        this.f1240L = v.mo28180f(j65.Toolbar_maxButtonHeight, -1);
        int e6 = v.mo28179e(j65.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e7 = v.mo28179e(j65.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f = v.mo28180f(j65.Toolbar_contentInsetLeft, 0);
        int f2 = v.mo28180f(j65.Toolbar_contentInsetRight, 0);
        mo2492h();
        this.f1249e0.mo21546e(f, f2);
        if (!(e6 == Integer.MIN_VALUE && e7 == Integer.MIN_VALUE)) {
            this.f1249e0.mo21548g(e6, e7);
        }
        this.f1253k0 = v.mo28179e(j65.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1263v0 = v.mo28179e(j65.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1257r = v.mo28181g(j65.Toolbar_collapseIcon);
        this.f1259s = v.mo28190p(j65.Toolbar_collapseContentDescription);
        CharSequence p = v.mo28190p(j65.Toolbar_title);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.mo28190p(j65.Toolbar_subtitle);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.f1228A = getContext();
        setPopupTheme(v.mo28188n(j65.Toolbar_popupTheme, 0));
        Drawable g = v.mo28181g(j65.Toolbar_navigationIcon);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.mo28190p(j65.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.mo28181g(j65.Toolbar_logo);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.mo28190p(j65.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = j65.Toolbar_titleTextColor;
        if (v.mo28193s(i3)) {
            setTitleTextColor(v.mo28177c(i3));
        }
        int i4 = j65.Toolbar_subtitleTextColor;
        if (v.mo28193s(i4)) {
            setSubtitleTextColor(v.mo28177c(i4));
        }
        int i5 = j65.Toolbar_menu;
        if (v.mo28193s(i5)) {
            mo2554x(v.mo28188n(i5, 0));
        }
        v.mo28194w();
    }
}
