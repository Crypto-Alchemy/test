package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0173e;
import androidx.appcompat.view.menu.C0177g;
import androidx.appcompat.view.menu.C0182i;
import androidx.appcompat.view.menu.C0184j;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.github.mikephil.charting.utils.Utils;

public class ActionMenuView extends LinearLayoutCompat implements C0173e.C0175b, C0184j {

    /* renamed from: A */
    public int f956A;

    /* renamed from: B */
    public int f957B;

    /* renamed from: C */
    public C0207d f958C;

    /* renamed from: a */
    public C0173e f959a;

    /* renamed from: d */
    public Context f960d;

    /* renamed from: e */
    public int f961e;

    /* renamed from: g */
    public boolean f962g;

    /* renamed from: k */
    public ActionMenuPresenter f963k;

    /* renamed from: r */
    public C0182i.C0183a f964r;

    /* renamed from: s */
    public C0173e.C0174a f965s;

    /* renamed from: x */
    public boolean f966x;

    /* renamed from: y */
    public int f967y;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f968a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f969b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f970c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f971d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f972e;

        /* renamed from: f */
        public boolean f973f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f968a = layoutParams.f968a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f968a = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0204a {
        /* renamed from: a */
        boolean mo1258a();

        /* renamed from: b */
        boolean mo1259b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0205b implements C0182i.C0183a {
        /* renamed from: b */
        public void mo1168b(C0173e eVar, boolean z) {
        }

        /* renamed from: c */
        public boolean mo1169c(C0173e eVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C0206c implements C0173e.C0174a {
        public C0206c() {
        }

        /* renamed from: a */
        public boolean mo1098a(C0173e eVar, MenuItem menuItem) {
            C0207d dVar = ActionMenuView.this.f958C;
            if (dVar == null || !dVar.onMenuItemClick(menuItem)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo1100b(C0173e eVar) {
            C0173e.C0174a aVar = ActionMenuView.this.f965s;
            if (aVar != null) {
                aVar.mo1100b(eVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface C0207d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    public static int m1306o(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo1262e()) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f968a || !z) {
            z2 = false;
        }
        layoutParams.f971d = z2;
        layoutParams.f969b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* renamed from: a */
    public void mo1284a(C0173e eVar) {
        this.f959a = eVar;
    }

    /* renamed from: b */
    public boolean mo1285b(C0177g gVar) {
        return this.f959a.mo1386N(gVar, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: e */
    public void mo1716e() {
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1690B();
        }
    }

    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    /* renamed from: g */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f959a == null) {
            Context context = getContext();
            C0173e eVar = new C0173e(context);
            this.f959a = eVar;
            eVar.mo1394V(new C0206c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f963k = actionMenuPresenter;
            actionMenuPresenter.mo1701M(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f963k;
            C0182i.C0183a aVar = this.f964r;
            if (aVar == null) {
                aVar = new C0205b();
            }
            actionMenuPresenter2.mo1307e(aVar);
            this.f959a.mo1412c(this.f963k, this.f960d);
            this.f963k.mo1699K(this);
        }
        return this.f959a;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f963k.mo1692D();
    }

    public int getPopupTheme() {
        return this.f961e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: h */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.gravity <= 0) {
            layoutParams2.gravity = 16;
        }
        return layoutParams2;
    }

    /* renamed from: i */
    public LayoutParams mo1727i() {
        LayoutParams f = generateDefaultLayoutParams();
        f.f968a = true;
        return f;
    }

    /* renamed from: j */
    public boolean mo1728j(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0204a)) {
            z = false | ((C0204a) childAt).mo1258a();
        }
        if (i <= 0 || !(childAt2 instanceof C0204a)) {
            return z;
        }
        return z | ((C0204a) childAt2).mo1259b();
    }

    /* renamed from: k */
    public boolean mo1729k() {
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1693E()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1730l() {
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1695G()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean mo1731m() {
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1696H()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo1732n() {
        return this.f962g;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1310i(false);
            if (this.f963k.mo1696H()) {
                this.f963k.mo1693E();
                this.f963k.mo1702N();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1716e();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f966x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b = re7.m26176b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f968a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1728j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i6 = getPaddingLeft() + layoutParams.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1728j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (b) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f968a) {
                    int i18 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f968a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        C0173e eVar;
        boolean z2 = this.f966x;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f966x = z;
        if (z2 != z) {
            this.f967y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f966x || (eVar = this.f959a) == null || size == this.f967y)) {
            this.f967y = size;
            eVar.mo1385M(true);
        }
        int childCount = getChildCount();
        if (!this.f966x || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        mo1737p(i, i2);
    }

    /* renamed from: p */
    public final void mo1737p(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f956A;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z9) {
                    int i23 = this.f957B;
                    i9 = i22;
                    z6 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i9 = i22;
                    z6 = false;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f973f = z6;
                layoutParams.f970c = z6 ? 1 : 0;
                layoutParams.f969b = z6;
                layoutParams.f971d = z6;
                layoutParams.leftMargin = z6;
                layoutParams.rightMargin = z6;
                if (!z9 || !((ActionMenuItemView) childAt).mo1262e()) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                layoutParams.f972e = z7;
                if (layoutParams.f968a) {
                    i10 = 1;
                } else {
                    i10 = i13;
                }
                int o = m1306o(childAt, i15, i10, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, o);
                if (layoutParams.f971d) {
                    i20++;
                }
                if (layoutParams.f968a) {
                    z8 = true;
                }
                i13 -= o;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (o == 1) {
                    j |= (long) (1 << i17);
                    i16 = i16;
                } else {
                    int i24 = i16;
                }
                i18 = i9;
            }
            i17++;
            size2 = i21;
        }
        int i25 = size2;
        if (!z8 || i18 != 2) {
            z = false;
        } else {
            z = true;
        }
        boolean z10 = false;
        while (true) {
            if (i20 <= 0 || i13 <= 0) {
                i5 = mode;
                i3 = i11;
                z2 = z10;
                i4 = i16;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j2 = 0;
                while (i28 < childCount) {
                    boolean z11 = z10;
                    LayoutParams layoutParams2 = (LayoutParams) getChildAt(i28).getLayoutParams();
                    int i29 = i16;
                    if (layoutParams2.f971d) {
                        int i30 = layoutParams2.f969b;
                        if (i30 < i26) {
                            j2 = 1 << i28;
                            i26 = i30;
                            i27 = 1;
                        } else if (i30 == i26) {
                            i27++;
                            j2 |= 1 << i28;
                        }
                    }
                    i28++;
                    i16 = i29;
                    z10 = z11;
                }
                z2 = z10;
                i4 = i16;
                j |= j2;
                if (i27 > i13) {
                    i5 = mode;
                    i3 = i11;
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount) {
                    View childAt2 = getChildAt(i32);
                    LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                    int i33 = i11;
                    int i34 = mode;
                    long j3 = (long) (1 << i32);
                    if ((j2 & j3) == 0) {
                        if (layoutParams3.f969b == i31) {
                            j |= j3;
                        }
                        z5 = z;
                    } else {
                        if (!z || !layoutParams3.f972e || i13 != 1) {
                            z5 = z;
                        } else {
                            int i35 = this.f957B;
                            z5 = z;
                            childAt2.setPadding(i35 + i15, 0, i35, 0);
                        }
                        layoutParams3.f969b++;
                        layoutParams3.f973f = true;
                        i13--;
                    }
                    i32++;
                    mode = i34;
                    i11 = i33;
                    z = z5;
                }
                i16 = i4;
                z10 = true;
            }
        }
        if (z8 || i18 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i13 <= 0 || j == 0 || (i13 >= i18 - 1 && !z3 && i19 <= 1)) {
            i6 = 0;
            z4 = z2;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z3) {
                i6 = 0;
                if ((j & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f972e) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j & ((long) (1 << i36))) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).f972e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            if (bitCount > Utils.FLOAT_EPSILON) {
                i8 = (int) (((float) (i13 * i15)) / bitCount);
            } else {
                i8 = i6;
            }
            z4 = z2;
            for (int i37 = i6; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f970c = i8;
                        layoutParams4.f973f = true;
                        if (i37 == 0 && !layoutParams4.f972e) {
                            layoutParams4.leftMargin = (-i8) / 2;
                        }
                        z4 = true;
                    } else if (layoutParams4.f968a) {
                        layoutParams4.f970c = i8;
                        layoutParams4.f973f = true;
                        layoutParams4.rightMargin = (-i8) / 2;
                        z4 = true;
                    } else {
                        if (i37 != 0) {
                            layoutParams4.leftMargin = i8 / 2;
                        }
                        if (i37 != childCount - 1) {
                            layoutParams4.rightMargin = i8 / 2;
                        }
                    }
                }
            }
        }
        if (z4) {
            for (int i38 = i6; i38 < childCount; i38++) {
                View childAt4 = getChildAt(i38);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f973f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f969b * i15) + layoutParams5.f970c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i5 != 1073741824) {
            i7 = i4;
        } else {
            i7 = i25;
        }
        setMeasuredDimension(i3, i7);
    }

    /* renamed from: q */
    public C0173e mo1738q() {
        return this.f959a;
    }

    /* renamed from: r */
    public boolean mo1739r() {
        ActionMenuPresenter actionMenuPresenter = this.f963k;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1702N()) {
            return false;
        }
        return true;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f963k.mo1698J(z);
    }

    public void setMenuCallbacks(C0182i.C0183a aVar, C0173e.C0174a aVar2) {
        this.f964r = aVar;
        this.f965s = aVar2;
    }

    public void setOnMenuItemClickListener(C0207d dVar) {
        this.f958C = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f963k.mo1700L(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f962g = z;
    }

    public void setPopupTheme(int i) {
        if (this.f961e != i) {
            this.f961e = i;
            if (i == 0) {
                this.f960d = getContext();
            } else {
                this.f960d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f963k = actionMenuPresenter;
        actionMenuPresenter.mo1699K(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f956A = (int) (56.0f * f);
        this.f957B = (int) (f * 4.0f);
        this.f960d = context;
        this.f961e = 0;
    }
}
