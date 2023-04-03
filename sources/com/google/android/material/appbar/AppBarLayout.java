package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000.C3335t8;
import p000.C3658y8;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0543b {

    /* renamed from: Q */
    public static final int f23247Q = e55.Widget_Design_AppBarLayout;

    /* renamed from: A */
    public boolean f23248A;

    /* renamed from: B */
    public boolean f23249B;

    /* renamed from: C */
    public boolean f23250C;

    /* renamed from: H */
    public int f23251H;

    /* renamed from: I */
    public WeakReference<View> f23252I;

    /* renamed from: L */
    public ValueAnimator f23253L;

    /* renamed from: M */
    public int[] f23254M;

    /* renamed from: P */
    public Drawable f23255P;

    /* renamed from: a */
    public int f23256a;

    /* renamed from: d */
    public int f23257d;

    /* renamed from: e */
    public int f23258e;

    /* renamed from: g */
    public int f23259g;

    /* renamed from: k */
    public boolean f23260k;

    /* renamed from: r */
    public int f23261r;

    /* renamed from: s */
    public hl7 f23262s;

    /* renamed from: x */
    public List<C4176c> f23263x;

    /* renamed from: y */
    public boolean f23264y;

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class C4173a extends BaseBehavior.C4172d<AppBarLayout> {
        }

        public Behavior() {
        }

        /* renamed from: A */
        public /* bridge */ /* synthetic */ boolean mo31549A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: B */
        public /* bridge */ /* synthetic */ void mo31550B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: C */
        public /* bridge */ /* synthetic */ void mo31551C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ void mo31552D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ Parcelable mo31553E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ boolean mo31554F(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ void mo31555G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ void mo31556H(BaseBehavior.C4172d dVar) {
            super.mo31556H(dVar);
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        /* renamed from: z */
        public /* bridge */ /* synthetic */ boolean mo31580z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        private static int getAppBarLayoutOffset(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0546e) appBarLayout.getLayoutParams()).mo5294f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo31565f();
            }
            return 0;
        }

        private void offsetChildAsNeeded(View view, View view2) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0546e) view2.getLayoutParams()).mo5294f();
            if (f instanceof BaseBehavior) {
                ga7.m17755a0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f23265h) + getVerticalLayoutGap()) - getOverlapPixelsForOffset(view2));
            }
        }

        private void updateLiftedStateIfNeeded(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo31518l()) {
                    appBarLayout.mo31542t(appBarLayout.mo31544v(view));
                }
            }
        }

        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public float getOverlapRatioForOffset(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int appBarLayoutOffset = getAppBarLayoutOffset(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + appBarLayoutOffset > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) appBarLayoutOffset) / ((float) i)) + 1.0f;
                }
            }
            return Utils.FLOAT_EPSILON;
        }

        public int getScrollRange(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.getScrollRange(view);
        }

        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            offsetChildAsNeeded(view, view2);
            updateLiftedStateIfNeeded(view, view2);
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ga7.m17773j0(coordinatorLayout, C3335t8.C3336a.f18016q.mo26281b());
                ga7.m17773j0(coordinatorLayout, C3335t8.C3336a.f18017r.mo26281b());
            }
        }

        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout findFirstDependency = findFirstDependency((List) coordinatorLayout.getDependencies(view));
            if (findFirstDependency != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.tempRect1;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    findFirstDependency.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.ScrollingViewBehavior_Layout);
            setOverlayTop(obtainStyledAttributes.getDimensionPixelSize(u55.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        public AppBarLayout findFirstDependency(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C4174a implements xg4 {
        public C4174a() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            return AppBarLayout.this.mo31520n(hl7);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public class C4175b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ uo3 f23290a;

        public C4175b(uo3 uo3) {
            this.f23290a = uo3;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f23290a.mo48439Z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C4176c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo31605a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public interface C4177d extends C4176c<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo31491a(C4176c cVar) {
        if (this.f23263x == null) {
            this.f23263x = new ArrayList();
        }
        if (cVar != null && !this.f23263x.contains(cVar)) {
            this.f23263x.add(cVar);
        }
    }

    /* renamed from: b */
    public void mo31492b(C4177d dVar) {
        mo31491a(dVar);
    }

    /* renamed from: c */
    public final void mo31493c() {
        WeakReference<View> weakReference = this.f23252I;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23252I = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final View mo31495d(View view) {
        int i;
        View view2;
        if (this.f23252I == null && (i = this.f23251H) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f23251H);
            }
            if (view2 != null) {
                this.f23252I = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f23252I;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (mo31543u()) {
            int save = canvas.save();
            canvas.translate(Utils.FLOAT_EPSILON, (float) (-this.f23256a));
            this.f23255P.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23255P;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: g */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int C;
        int i2 = this.f23258e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f23287a;
            if ((i4 & 5) == 5) {
                int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    C = ga7.m17717C(childAt);
                } else if ((i4 & 2) != 0) {
                    C = measuredHeight - ga7.m17717C(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && ga7.m17802y(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + C;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f23258e = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f23259g;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f23287a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ga7.m17717C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f23259g = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f23251H;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int C = ga7.m17717C(this);
        if (C == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                C = ga7.m17717C(getChildAt(childCount - 1));
            } else {
                C = 0;
            }
            if (C == 0) {
                return getHeight() / 3;
            }
        }
        return (C * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f23261r;
    }

    public Drawable getStatusBarForeground() {
        return this.f23255P;
    }

    @Deprecated
    public float getTargetElevation() {
        return Utils.FLOAT_EPSILON;
    }

    public final int getTopInset() {
        hl7 hl7 = this.f23262s;
        if (hl7 != null) {
            return hl7.mo21240m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f23257d;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f23287a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i2 == 0 && ga7.m17802y(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= ga7.m17717C(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f23257d = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* renamed from: h */
    public boolean mo31514h() {
        return this.f23260k;
    }

    /* renamed from: i */
    public final boolean mo31515i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo31599c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo31516j() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo31517k() {
        this.f23257d = -1;
        this.f23258e = -1;
        this.f23259g = -1;
    }

    /* renamed from: l */
    public boolean mo31518l() {
        return this.f23250C;
    }

    /* renamed from: m */
    public void mo31519m(int i) {
        this.f23256a = i;
        if (!willNotDraw()) {
            ga7.m17767g0(this);
        }
        List<C4176c> list = this.f23263x;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C4176c cVar = this.f23263x.get(i2);
                if (cVar != null) {
                    cVar.mo31605a(this, i);
                }
            }
        }
    }

    /* renamed from: n */
    public hl7 mo31520n(hl7 hl7) {
        hl7 hl72;
        if (ga7.m17802y(this)) {
            hl72 = hl7;
        } else {
            hl72 = null;
        }
        if (!mf4.m22283a(this.f23262s, hl72)) {
            this.f23262s = hl72;
            mo31548y();
            requestLayout();
        }
        return hl7;
    }

    /* renamed from: o */
    public void mo31521o(C4176c cVar) {
        List<C4176c> list = this.f23263x;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        vo3.m53443e(this);
    }

    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.f23254M == null) {
            this.f23254M = new int[4];
        }
        int[] iArr = this.f23254M;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f23248A;
        int i4 = j15.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (!z || !this.f23249B) {
            i2 = -j15.state_lifted;
        } else {
            i2 = j15.state_lifted;
        }
        iArr[1] = i2;
        int i5 = j15.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (!z || !this.f23249B) {
            i3 = -j15.state_collapsed;
        } else {
            i3 = j15.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo31493c();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ga7.m17802y(this) && mo31546w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ga7.m17755a0(getChildAt(childCount), topInset);
            }
        }
        mo31517k();
        this.f23260k = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo31598b() != null) {
                this.f23260k = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f23255P;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f23264y) {
            if (!this.f23250C && !mo31515i()) {
                z2 = false;
            }
            mo31530s(z2);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ga7.m17802y(this) && mo31546w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = ep3.m16274b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        mo31517k();
    }

    /* renamed from: p */
    public void mo31527p(C4177d dVar) {
        mo31521o(dVar);
    }

    /* renamed from: q */
    public void mo31528q() {
        this.f23261r = 0;
    }

    /* renamed from: r */
    public final void mo31529r(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.f23261r = i4 | i3;
        requestLayout();
    }

    /* renamed from: s */
    public final boolean mo31530s(boolean z) {
        if (this.f23248A == z) {
            return false;
        }
        this.f23248A = z;
        refreshDrawableState();
        return true;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        vo3.m53442d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, ga7.m17747T(this));
    }

    public void setLiftOnScroll(boolean z) {
        this.f23250C = z;
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.f23251H = i;
        mo31493c();
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f23255P;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f23255P = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f23255P.setState(getDrawableState());
                }
                ij1.m19654m(this.f23255P, ga7.m17715B(this));
                Drawable drawable4 = this.f23255P;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.f23255P.setCallback(this);
            }
            mo31548y();
            ga7.m17767g0(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C2554in.m19714b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        ef7.m43965b(this, f);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.f23255P;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public boolean mo31542t(boolean z) {
        if (this.f23249B == z) {
            return false;
        }
        this.f23249B = z;
        refreshDrawableState();
        if (!this.f23250C || !(getBackground() instanceof uo3)) {
            return true;
        }
        mo31547x((uo3) getBackground(), z);
        return true;
    }

    /* renamed from: u */
    public final boolean mo31543u() {
        if (this.f23255P == null || getTopInset() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public boolean mo31544v(View view) {
        View d = mo31495d(view);
        if (d != null) {
            view = d;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f23255P) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final boolean mo31546w() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ga7.m17802y(childAt)) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final void mo31547x(uo3 uo3, boolean z) {
        float f;
        float dimension = getResources().getDimension(k25.design_appbar_elevation);
        if (z) {
            f = 0.0f;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f23253L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f23253L = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(w35.app_bar_elevation_anim_duration));
        this.f23253L.setInterpolator(C5807el.f28628a);
        this.f23253L.addUpdateListener(new C4175b(uo3));
        this.f23253L.start();
    }

    /* renamed from: y */
    public final void mo31548y() {
        setWillNotDraw(!mo31543u());
    }

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: h */
        public int f23265h;

        /* renamed from: i */
        public int f23266i;

        /* renamed from: j */
        public ValueAnimator f23267j;

        /* renamed from: k */
        public int f23268k = -1;

        /* renamed from: l */
        public boolean f23269l;

        /* renamed from: m */
        public float f23270m;

        /* renamed from: n */
        public WeakReference<View> f23271n;

        /* renamed from: o */
        public C4172d f23272o;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C4169a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f23276a;

            /* renamed from: d */
            public final /* synthetic */ AppBarLayout f23277d;

            public C4169a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f23276a = coordinatorLayout;
                this.f23277d = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.mo31699i(this.f23276a, this.f23277d, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C4170b implements C3658y8 {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f23279a;

            /* renamed from: b */
            public final /* synthetic */ AppBarLayout f23280b;

            /* renamed from: c */
            public final /* synthetic */ View f23281c;

            /* renamed from: d */
            public final /* synthetic */ int f23282d;

            public C4170b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f23279a = coordinatorLayout;
                this.f23280b = appBarLayout;
                this.f23281c = view;
                this.f23282d = i;
            }

            /* renamed from: a */
            public boolean mo5572a(View view, C3658y8.C3659a aVar) {
                BaseBehavior.this.onNestedPreScroll(this.f23279a, this.f23280b, this.f23281c, 0, this.f23282d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        public class C4171c implements C3658y8 {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f23284a;

            /* renamed from: b */
            public final /* synthetic */ boolean f23285b;

            public C4171c(AppBarLayout appBarLayout, boolean z) {
                this.f23284a = appBarLayout;
                this.f23285b = z;
            }

            /* renamed from: a */
            public boolean mo5572a(View view, C3658y8.C3659a aVar) {
                this.f23284a.setExpanded(this.f23285b);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public static abstract class C4172d<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo31588a(T t);
        }

        public BaseBehavior() {
        }

        /* renamed from: r */
        public static boolean m34539r(int i, int i2) {
            return (i & i2) == i2;
        }

        /* renamed from: t */
        public static View m34540t(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: A */
        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0546e) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.onMeasureChild(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: B */
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i5 = -t.getTotalScrollRange();
                    i4 = t.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                int i6 = i5;
                int i7 = i4;
                if (i6 != i7) {
                    iArr[1] = mo31698h(coordinatorLayout, t, i2, i6, i7);
                }
            }
            if (t.mo31518l()) {
                t.mo31542t(t.mo31544v(view));
            }
        }

        /* renamed from: C */
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo31698h(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo31560L(coordinatorLayout, t);
            }
        }

        /* renamed from: D */
        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, t, savedState.mo5481a());
                this.f23268k = savedState.f23273e;
                this.f23270m = savedState.f23274g;
                this.f23269l = savedState.f23275k;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, t, parcelable);
            this.f23268k = -1;
        }

        /* renamed from: E */
        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, t);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset > 0 || bottom < 0) {
                    i++;
                } else {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f23273e = i;
                    if (bottom == ga7.m17717C(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f23275k = z;
                    savedState.f23274g = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        /* renamed from: F */
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) == 0 || (!t.mo31518l() && !mo31573q(coordinatorLayout, t, view))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (valueAnimator = this.f23267j) != null) {
                valueAnimator.cancel();
            }
            this.f23271n = null;
            this.f23266i = i2;
            return z;
        }

        /* renamed from: G */
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.f23266i == 0 || i == 1) {
                mo31559K(coordinatorLayout, t);
                if (t.mo31518l()) {
                    t.mo31542t(t.mo31544v(view));
                }
            }
            this.f23271n = new WeakReference<>(view);
        }

        /* renamed from: H */
        public void mo31556H(C4172d dVar) {
            this.f23272o = dVar;
        }

        /* renamed from: I */
        public int mo31567j(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int i5;
            int f = mo31565f();
            int i6 = 0;
            if (i2 == 0 || f < i2 || f > i3) {
                this.f23265h = 0;
            } else {
                int b = ep3.m16274b(i, i2, i3);
                if (f != b) {
                    if (t.mo31514h()) {
                        i4 = mo31578x(t, b);
                    } else {
                        i4 = b;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(i4);
                    i6 = f - b;
                    this.f23265h = b - i4;
                    if (!topAndBottomOffset && t.mo31514h()) {
                        coordinatorLayout.dispatchDependentViewsChanged(t);
                    }
                    t.mo31519m(getTopAndBottomOffset());
                    if (b < f) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    mo31561M(coordinatorLayout, t, b, i5, false);
                }
            }
            mo31560L(coordinatorLayout, t);
            return i6;
        }

        /* renamed from: J */
        public final boolean mo31558J(CoordinatorLayout coordinatorLayout, T t) {
            List<View> dependents = coordinatorLayout.getDependents(t);
            int size = dependents.size();
            int i = 0;
            while (i < size) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0546e) dependents.get(i).getLayoutParams()).mo5294f();
                if (!(f instanceof ScrollingViewBehavior)) {
                    i++;
                } else if (((ScrollingViewBehavior) f).getOverlayTop() != 0) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }

        /* renamed from: K */
        public final void mo31559K(CoordinatorLayout coordinatorLayout, T t) {
            int f = mo31565f();
            int u = mo31575u(t, f);
            if (u >= 0) {
                View childAt = t.getChildAt(u);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a = layoutParams.mo31597a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (u == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (m34539r(a, 2)) {
                        i2 += ga7.m17717C(childAt);
                    } else if (m34539r(a, 5)) {
                        int C = ga7.m17717C(childAt) + i2;
                        if (f < C) {
                            i = C;
                        } else {
                            i2 = C;
                        }
                    }
                    if (m34539r(a, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (f < (i2 + i) / 2) {
                        i = i2;
                    }
                    mo31570n(coordinatorLayout, t, ep3.m16274b(i, -t.getTotalScrollRange(), 0), Utils.FLOAT_EPSILON);
                }
            }
        }

        /* renamed from: L */
        public final void mo31560L(CoordinatorLayout coordinatorLayout, T t) {
            ga7.m17773j0(coordinatorLayout, C3335t8.C3336a.f18016q.mo26281b());
            ga7.m17773j0(coordinatorLayout, C3335t8.C3336a.f18017r.mo26281b());
            View s = mo31574s(coordinatorLayout);
            if (s != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.C0546e) s.getLayoutParams()).mo5294f() instanceof ScrollingViewBehavior)) {
                mo31568l(coordinatorLayout, t, s);
            }
        }

        /* renamed from: M */
        public final void mo31561M(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View t2 = m34540t(t, i);
            if (t2 != null) {
                int a = ((LayoutParams) t2.getLayoutParams()).mo31597a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int C = ga7.m17717C(t2);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (t2.getBottom() - C) - t.getTopInset()) : (-i) >= (t2.getBottom() - C) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.mo31518l()) {
                    z2 = t.mo31544v(mo31574s(coordinatorLayout));
                }
                boolean t3 = t.mo31542t(z2);
                if (z || (t3 && mo31558J(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* renamed from: f */
        public int mo31565f() {
            return getTopAndBottomOffset() + this.f23265h;
        }

        /* renamed from: l */
        public final void mo31568l(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (mo31565f() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                mo31569m(coordinatorLayout, t, C3335t8.C3336a.f18016q, false);
            }
            if (mo31565f() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    ga7.m17777l0(coordinatorLayout, C3335t8.C3336a.f18017r, (CharSequence) null, new C4170b(coordinatorLayout, t, view, i));
                    return;
                }
                return;
            }
            mo31569m(coordinatorLayout, t, C3335t8.C3336a.f18017r, true);
        }

        /* renamed from: m */
        public final void mo31569m(CoordinatorLayout coordinatorLayout, T t, C3335t8.C3336a aVar, boolean z) {
            ga7.m17777l0(coordinatorLayout, aVar, (CharSequence) null, new C4171c(t, z));
        }

        /* renamed from: n */
        public final void mo31570n(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(mo31565f() - i);
            float abs2 = Math.abs(f);
            if (abs2 > Utils.FLOAT_EPSILON) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            mo31571o(coordinatorLayout, t, i, i2);
        }

        /* renamed from: o */
        public final void mo31571o(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int f = mo31565f();
            if (f == i) {
                ValueAnimator valueAnimator = this.f23267j;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f23267j.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f23267j;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f23267j = valueAnimator3;
                valueAnimator3.setInterpolator(C5807el.f28632e);
                this.f23267j.addUpdateListener(new C4169a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f23267j.setDuration((long) Math.min(i2, 600));
            this.f23267j.setIntValues(new int[]{f, i});
            this.f23267j.start();
        }

        /* renamed from: p */
        public boolean mo31562a(T t) {
            C4172d dVar = this.f23272o;
            if (dVar != null) {
                return dVar.mo31588a(t);
            }
            WeakReference<View> weakReference = this.f23271n;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        /* renamed from: q */
        public final boolean mo31573q(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (!t.mo31516j() || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()) {
                return false;
            }
            return true;
        }

        /* renamed from: s */
        public final View mo31574s(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof f54) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: u */
        public final int mo31575u(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m34539r(layoutParams.mo31597a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        /* renamed from: v */
        public int mo31563d(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: w */
        public int mo31564e(T t) {
            return t.getTotalScrollRange();
        }

        /* renamed from: x */
        public final int mo31578x(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.mo31598b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = layoutParams.mo31597a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= ga7.m17717C(childAt);
                        }
                    }
                    if (ga7.m17802y(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        /* renamed from: y */
        public void mo31566g(CoordinatorLayout coordinatorLayout, T t) {
            mo31559K(coordinatorLayout, t);
            if (t.mo31518l()) {
                t.mo31542t(t.mo31544v(mo31574s(coordinatorLayout)));
            }
        }

        /* renamed from: z */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean z;
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.f23268k;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f23269l) {
                    i2 = ga7.m17717C(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.f23270m);
                }
                mo31699i(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        mo31570n(coordinatorLayout, t, i5, Utils.FLOAT_EPSILON);
                    } else {
                        mo31699i(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        mo31570n(coordinatorLayout, t, 0, Utils.FLOAT_EPSILON);
                    } else {
                        mo31699i(coordinatorLayout, t, 0);
                    }
                }
            }
            t.mo31528q();
            this.f23268k = -1;
            setTopAndBottomOffset(ep3.m16274b(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            mo31561M(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.mo31519m(getTopAndBottomOffset());
            mo31560L(coordinatorLayout, t);
            return onLayoutChild;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new C4168a();

            /* renamed from: e */
            public int f23273e;

            /* renamed from: g */
            public float f23274g;

            /* renamed from: k */
            public boolean f23275k;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a */
            public static class C4168a implements Parcelable.ClassLoaderCreator<SavedState> {
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
                this.f23273e = parcel.readInt();
                this.f23274g = parcel.readFloat();
                this.f23275k = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f23273e);
                parcel.writeFloat(this.f23274g);
                parcel.writeByte(this.f23275k ? (byte) 1 : 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, j15.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        mo31529r(z, z2, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f23247Q
            android.content.Context r10 = p000.xo3.m54461c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f23257d = r10
            r9.f23258e = r10
            r9.f23259g = r10
            r6 = 0
            r9.f23261r = r6
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            p000.ef7.m43964a(r9)
            p000.ef7.m43966c(r9, r11, r12, r4)
            int[] r2 = p000.u55.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = p000.wo6.m54004h(r0, r1, r2, r3, r4, r5)
            int r12 = p000.u55.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            p000.ga7.m17793t0(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            uo3 r0 = new uo3
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.mo48440a0(r12)
            r0.mo48430P(r7)
            p000.ga7.m17793t0(r9, r0)
        L_0x005b:
            int r12 = p000.u55.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x006a
            boolean r12 = r11.getBoolean(r12, r6)
            r9.mo31529r(r12, r6, r6)
        L_0x006a:
            int r12 = p000.u55.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x007a
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            p000.ef7.m43965b(r9, r12)
        L_0x007a:
            r12 = 26
            if (r8 < r12) goto L_0x009c
            int r12 = p000.u55.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x008d
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x008d:
            int r12 = p000.u55.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x009c:
            int r12 = p000.u55.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f23250C = r12
            int r12 = p000.u55.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f23251H = r10
            int r10 = p000.u55.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            p000.ga7.m17720D0(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f23287a = 1;

        /* renamed from: b */
        public Interpolator f23288b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.AppBarLayout_Layout);
            this.f23287a = obtainStyledAttributes.getInt(u55.AppBarLayout_Layout_layout_scrollFlags, 0);
            int i = u55.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f23288b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public int mo31597a() {
            return this.f23287a;
        }

        /* renamed from: b */
        public Interpolator mo31598b() {
            return this.f23288b;
        }

        /* renamed from: c */
        public boolean mo31599c() {
            int i = this.f23287a;
            if ((i & 1) != 1 || (i & 10) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: d */
        public void mo31600d(int i) {
            this.f23287a = i;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
