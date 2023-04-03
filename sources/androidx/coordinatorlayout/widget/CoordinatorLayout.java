package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements h54, i54 {
    public static final Class<?>[] CONSTRUCTOR_PARAMS = {Context.class, AttributeSet.class};
    public static final Comparator<View> TOP_SORTED_CHILDREN_COMPARATOR = new C0548g();
    public static final String WIDGET_PACKAGE_NAME;
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> sConstructors = new ThreadLocal<>();
    private static final ys4<Rect> sRectPool = new ct4(12);
    private xg4 mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private View mBehaviorTouchView;
    private final qg1<View> mChildDag;
    private final List<View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private hl7 mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final j54 mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    public ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private C0547f mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List<View> mTempDependenciesList;
    private final List<View> mTempList1;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public static Object getTag(View view) {
            return ((C0546e) view.getLayoutParams()).f3366r;
        }

        public static void setTag(View view, Object obj) {
            ((C0546e) view.getLayoutParams()).f3366r = obj;
        }

        public boolean blocksInteractionBelow(CoordinatorLayout coordinatorLayout, V v) {
            if (getScrimOpacity(coordinatorLayout, v) > Utils.FLOAT_EPSILON) {
                return true;
            }
            return false;
        }

        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public int getScrimColor(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        public float getScrimOpacity(CoordinatorLayout coordinatorLayout, V v) {
            return Utils.FLOAT_EPSILON;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public hl7 onApplyWindowInsets(CoordinatorLayout coordinatorLayout, V v, hl7 hl7) {
            return hl7;
        }

        public void onAttachedToLayoutParams(C0546e eVar) {
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                onNestedPreScroll(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        @Deprecated
        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        public void onNestedScrollAccepted(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                onNestedScrollAccepted(coordinatorLayout, v, view, view2, i);
            }
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return onStartNestedScroll(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                onStopNestedScroll(coordinatorLayout, v, view);
            }
        }

        public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            onNestedScroll(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0542a implements xg4 {
        public C0542a() {
        }

        /* renamed from: a */
        public hl7 mo1158a(View view, hl7 hl7) {
            return CoordinatorLayout.this.setWindowInsets(hl7);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0543b {
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C0544c {
        Class<? extends Behavior> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public class C0545d implements ViewGroup.OnHierarchyChangeListener {
        public C0545d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.mOnHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public class C0547f implements ViewTreeObserver.OnPreDrawListener {
        public C0547f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public static class C0548g implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float N = ga7.m17739N(view);
            float N2 = ga7.m17739N(view2);
            if (N > N2) {
                return -1;
            }
            if (N < N2) {
                return 1;
            }
            return 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            WIDGET_PACKAGE_NAME = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            TOP_SORTED_CHILDREN_COMPARATOR = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            sConstructors = r0
            ct4 r0 = new ct4
            r1 = 12
            r0.<init>(r1)
            sRectPool = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private static Rect acquireTempRect() {
        Rect b = sRectPool.mo11139b();
        if (b == null) {
            return new Rect();
        }
        return b;
    }

    private static int clamp(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    private void constrainChildRect(C0546e eVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - eVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private hl7 dispatchApplyWindowInsetsToBehaviors(hl7 hl7) {
        Behavior f;
        if (hl7.mo21243q()) {
            return hl7;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (ga7.m17802y(childAt) && (f = ((C0546e) childAt.getLayoutParams()).mo5294f()) != null) {
                hl7 = f.onApplyWindowInsets(this, childAt, hl7);
                if (hl7.mo21243q()) {
                    break;
                }
            }
        }
        return hl7;
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect2, C0546e eVar, int i2, int i3) {
        int i4;
        int i5;
        int b = pj2.m24971b(resolveAnchoredChildGravity(eVar.f3351c), i);
        int b2 = pj2.m24971b(resolveGravity(eVar.f3352d), i);
        int i6 = b & 7;
        int i7 = b & 112;
        int i8 = b2 & 7;
        int i9 = b2 & 112;
        if (i8 == 1) {
            i4 = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            i4 = rect.left;
        } else {
            i4 = rect.right;
        }
        if (i9 == 16) {
            i5 = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            i5 = rect.top;
        } else {
            i5 = rect.bottom;
        }
        if (i6 == 1) {
            i4 -= i2 / 2;
        } else if (i6 != 5) {
            i4 -= i2;
        }
        if (i7 == 16) {
            i5 -= i3 / 2;
        } else if (i7 != 80) {
            i5 -= i3;
        }
        rect2.set(i4, i5, i2 + i4, i3 + i5);
    }

    private int getKeyline(int i) {
        int[] iArr = this.mKeylines;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            return 0;
        }
    }

    private void getTopSortedChildren(List<View> list) {
        int i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (isChildrenDrawingOrderEnabled) {
                i = getChildDrawingOrder(childCount, i2);
            } else {
                i = i2;
            }
            list.add(getChildAt(i));
        }
        Comparator<View> comparator = TOP_SORTED_CHILDREN_COMPARATOR;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean hasDependencies(View view) {
        return this.mChildDag.mo25103j(view);
    }

    private void layoutChild(View view, int i) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        Rect acquireTempRect = acquireTempRect();
        acquireTempRect.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.mLastInsets != null && ga7.m17802y(this) && !ga7.m17802y(view)) {
            acquireTempRect.left += this.mLastInsets.mo21238k();
            acquireTempRect.top += this.mLastInsets.mo21240m();
            acquireTempRect.right -= this.mLastInsets.mo21239l();
            acquireTempRect.bottom -= this.mLastInsets.mo21237j();
        }
        Rect acquireTempRect2 = acquireTempRect();
        pj2.m24970a(resolveGravity(eVar.f3351c), view.getMeasuredWidth(), view.getMeasuredHeight(), acquireTempRect, acquireTempRect2, i);
        view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
    }

    private void layoutChildWithAnchor(View view, View view2, int i) {
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        try {
            getDescendantRect(view2, acquireTempRect);
            getDesiredAnchoredChildRect(view, i, acquireTempRect, acquireTempRect2);
            view.layout(acquireTempRect2.left, acquireTempRect2.top, acquireTempRect2.right, acquireTempRect2.bottom);
        } finally {
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
        }
    }

    private void layoutChildWithKeyline(View view, int i, int i2) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        int b = pj2.m24971b(resolveKeylineGravity(eVar.f3351c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int keyline = getKeyline(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            keyline += measuredWidth / 2;
        } else if (i3 == 5) {
            keyline += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(keyline, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void offsetChildByInset(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (ga7.m17747T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0546e eVar = (C0546e) view.getLayoutParams();
            Behavior f = eVar.mo5294f();
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            acquireTempRect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.getInsetDodgeRect(this, view, acquireTempRect)) {
                acquireTempRect.set(acquireTempRect2);
            } else if (!acquireTempRect2.contains(acquireTempRect)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + acquireTempRect.toShortString() + " | Bounds:" + acquireTempRect2.toShortString());
            }
            releaseTempRect(acquireTempRect2);
            if (acquireTempRect.isEmpty()) {
                releaseTempRect(acquireTempRect);
                return;
            }
            int b = pj2.m24971b(eVar.f3356h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (acquireTempRect.top - eVar.topMargin) - eVar.f3358j) >= (i7 = rect.top)) {
                z = false;
            } else {
                setInsetOffsetY(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - acquireTempRect.bottom) - eVar.bottomMargin) + eVar.f3358j) < (i5 = rect.bottom)) {
                setInsetOffsetY(view, height - i5);
                z = true;
            }
            if (!z) {
                setInsetOffsetY(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (acquireTempRect.left - eVar.leftMargin) - eVar.f3357i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                setInsetOffsetX(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - acquireTempRect.right) - eVar.rightMargin) + eVar.f3357i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                setInsetOffsetX(view, width - i2);
            }
            if (!z3) {
                setInsetOffsetX(view, 0);
            }
            releaseTempRect(acquireTempRect);
        }
    }

    public static Behavior parseBehavior(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = WIDGET_PACKAGE_NAME;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = sConstructors;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    private boolean performIntercept(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.mTempList1;
        getTopSortedChildren(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0546e eVar = (C0546e) view.getLayoutParams();
            Behavior f = eVar.mo5294f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.onInterceptTouchEvent(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.onTouchEvent(this, view, motionEvent2);
                    }
                    if (z) {
                        this.mBehaviorTouchView = view;
                    }
                }
                boolean c = eVar.mo5291c();
                boolean i4 = eVar.mo5297i(this, view);
                if (!i4 || c) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i4 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                }
                if (i2 == 0) {
                    f.onInterceptTouchEvent(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.onTouchEvent(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.mo25096c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0546e resolvedLayoutParams = getResolvedLayoutParams(childAt);
            resolvedLayoutParams.mo5292d(this, childAt);
            this.mChildDag.mo25095b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (resolvedLayoutParams.mo5290b(this, childAt, childAt2)) {
                        if (!this.mChildDag.mo25097d(childAt2)) {
                            this.mChildDag.mo25095b(childAt2);
                        }
                        this.mChildDag.mo25094a(childAt2, childAt);
                    }
                }
            }
        }
        this.mDependencySortedChildren.addAll(this.mChildDag.mo25102i());
        Collections.reverse(this.mDependencySortedChildren);
    }

    private static void releaseTempRect(Rect rect) {
        rect.setEmpty();
        sRectPool.mo11138a(rect);
    }

    private void resetTouchBehaviors(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior f = ((C0546e) childAt.getLayoutParams()).mo5294f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                if (z) {
                    f.onInterceptTouchEvent(this, childAt, obtain);
                } else {
                    f.onTouchEvent(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0546e) getChildAt(i2).getLayoutParams()).mo5301m();
        }
        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    private static int resolveGravity(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int resolveKeylineGravity(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private void setInsetOffsetX(View view, int i) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        int i2 = eVar.f3357i;
        if (i2 != i) {
            ga7.m17753Z(view, i - i2);
            eVar.f3357i = i;
        }
    }

    private void setInsetOffsetY(View view, int i) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        int i2 = eVar.f3358j;
        if (i2 != i) {
            ga7.m17755a0(view, i - i2);
            eVar.f3358j = i;
        }
    }

    private void setupForInsets() {
        if (ga7.m17802y(this)) {
            if (this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new C0542a();
            }
            ga7.m17720D0(this, this.mApplyWindowInsetsListener);
            setSystemUiVisibility(1280);
            return;
        }
        ga7.m17720D0(this, (xg4) null);
    }

    public void addPreDrawListener() {
        if (this.mIsAttachedToWindow) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new C0547f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C0546e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void dispatchDependentViewsChanged(View view) {
        List g = this.mChildDag.mo25100g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                Behavior f = ((C0546e) view2.getLayoutParams()).mo5294f();
                if (f != null) {
                    f.onDependentViewChanged(this, view2, view);
                }
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        Behavior behavior = eVar.f3349a;
        if (behavior != null) {
            float scrimOpacity = behavior.getScrimOpacity(this, view);
            if (scrimOpacity > Utils.FLOAT_EPSILON) {
                if (this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }
                this.mScrimPaint.setColor(eVar.f3349a.getScrimColor(this, view));
                this.mScrimPaint.setAlpha(clamp(Math.round(scrimOpacity * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.mScrimPaint);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mStatusBarBackground;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void ensurePreDrawListener() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (hasDependencies(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.mNeedsPreDrawListener) {
            return;
        }
        if (z) {
            addPreDrawListener();
        } else {
            removePreDrawListener();
        }
    }

    public void getChildRect(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            getDescendantRect(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> getDependencies(View view) {
        List<View> h = this.mChildDag.mo25101h(view);
        this.mTempDependenciesList.clear();
        if (h != null) {
            this.mTempDependenciesList.addAll(h);
        }
        return this.mTempDependenciesList;
    }

    public final List<View> getDependencySortedChildren() {
        prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    public List<View> getDependents(View view) {
        List g = this.mChildDag.mo25100g(view);
        this.mTempDependenciesList.clear();
        if (g != null) {
            this.mTempDependenciesList.addAll(g);
        }
        return this.mTempDependenciesList;
    }

    public void getDescendantRect(View view, Rect rect) {
        jc7.m20081a(this, view, rect);
    }

    public void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect2) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, eVar, measuredWidth, measuredHeight);
        constrainChildRect(eVar, rect2, measuredWidth, measuredHeight);
    }

    public void getLastChildRect(View view, Rect rect) {
        rect.set(((C0546e) view.getLayoutParams()).mo5296h());
    }

    public final hl7 getLastWindowInsets() {
        return this.mLastInsets;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.mo21726a();
    }

    public C0546e getResolvedLayoutParams(View view) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        if (!eVar.f3350b) {
            if (view instanceof C0543b) {
                eVar.mo5303o(((C0543b) view).getBehavior());
                eVar.f3350b = true;
            } else {
                C0544c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0544c) cls.getAnnotation(C0544c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.mo5303o((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(cVar.value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                    }
                }
                eVar.f3350b = true;
            }
        }
        return eVar;
    }

    public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public boolean isPointInChildBounds(View view, int i, int i2) {
        Rect acquireTempRect = acquireTempRect();
        getDescendantRect(view, acquireTempRect);
        try {
            return acquireTempRect.contains(i, i2);
        } finally {
            releaseTempRect(acquireTempRect);
        }
    }

    public void offsetChildToAnchor(View view, int i) {
        Behavior f;
        View view2 = view;
        C0546e eVar = (C0546e) view.getLayoutParams();
        if (eVar.f3359k != null) {
            Rect acquireTempRect = acquireTempRect();
            Rect acquireTempRect2 = acquireTempRect();
            Rect acquireTempRect3 = acquireTempRect();
            getDescendantRect(eVar.f3359k, acquireTempRect);
            boolean z = false;
            getChildRect(view2, false, acquireTempRect2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            getDesiredAnchoredChildRectWithoutConstraints(view, i, acquireTempRect, acquireTempRect3, eVar, measuredWidth, measuredHeight);
            if (!(acquireTempRect3.left == acquireTempRect2.left && acquireTempRect3.top == acquireTempRect2.top)) {
                z = true;
            }
            constrainChildRect(eVar, acquireTempRect3, measuredWidth, i2);
            int i3 = acquireTempRect3.left - acquireTempRect2.left;
            int i4 = acquireTempRect3.top - acquireTempRect2.top;
            if (i3 != 0) {
                ga7.m17753Z(view2, i3);
            }
            if (i4 != 0) {
                ga7.m17755a0(view2, i4);
            }
            if (z && (f = eVar.mo5294f()) != null) {
                f.onDependentViewChanged(this, view2, eVar.f3359k);
            }
            releaseTempRect(acquireTempRect);
            releaseTempRect(acquireTempRect2);
            releaseTempRect(acquireTempRect3);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener) {
            if (this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new C0547f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }
        if (this.mLastInsets == null && ga7.m17802y(this)) {
            ga7.m17779m0(this);
        }
        this.mIsAttachedToWindow = true;
    }

    public final void onChildViewsChanged(int i) {
        boolean z;
        int i2 = i;
        int B = ga7.m17715B(this);
        int size = this.mDependencySortedChildren.size();
        Rect acquireTempRect = acquireTempRect();
        Rect acquireTempRect2 = acquireTempRect();
        Rect acquireTempRect3 = acquireTempRect();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.mDependencySortedChildren.get(i3);
            C0546e eVar = (C0546e) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (eVar.f3360l == this.mDependencySortedChildren.get(i4)) {
                        offsetChildToAnchor(view, B);
                    }
                }
                getChildRect(view, true, acquireTempRect2);
                if (eVar.f3355g != 0 && !acquireTempRect2.isEmpty()) {
                    int b = pj2.m24971b(eVar.f3355g, B);
                    int i5 = b & 112;
                    if (i5 == 48) {
                        acquireTempRect.top = Math.max(acquireTempRect.top, acquireTempRect2.bottom);
                    } else if (i5 == 80) {
                        acquireTempRect.bottom = Math.max(acquireTempRect.bottom, getHeight() - acquireTempRect2.top);
                    }
                    int i6 = b & 7;
                    if (i6 == 3) {
                        acquireTempRect.left = Math.max(acquireTempRect.left, acquireTempRect2.right);
                    } else if (i6 == 5) {
                        acquireTempRect.right = Math.max(acquireTempRect.right, getWidth() - acquireTempRect2.left);
                    }
                }
                if (eVar.f3356h != 0 && view.getVisibility() == 0) {
                    offsetChildByInset(view, acquireTempRect, B);
                }
                if (i2 != 2) {
                    getLastChildRect(view, acquireTempRect3);
                    if (!acquireTempRect3.equals(acquireTempRect2)) {
                        recordLastChildRect(view, acquireTempRect2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.mDependencySortedChildren.get(i7);
                    C0546e eVar2 = (C0546e) view2.getLayoutParams();
                    Behavior f = eVar2.mo5294f();
                    if (f != null && f.layoutDependsOn(this, view2, view)) {
                        if (i2 != 0 || !eVar2.mo5295g()) {
                            if (i2 != 2) {
                                z = f.onDependentViewChanged(this, view2, view);
                            } else {
                                f.onDependentViewRemoved(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                eVar2.mo5304p(z);
                            }
                        } else {
                            eVar2.mo5299k();
                        }
                    }
                }
            }
        }
        releaseTempRect(acquireTempRect);
        releaseTempRect(acquireTempRect2);
        releaseTempRect(acquireTempRect3);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        resetTouchBehaviors(false);
        if (this.mNeedsPreDrawListener && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        View view = this.mNestedScrollingTarget;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.mIsAttachedToWindow = false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            hl7 hl7 = this.mLastInsets;
            if (hl7 != null) {
                i = hl7.mo21240m();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            resetTouchBehaviors(true);
        }
        boolean performIntercept = performIntercept(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            resetTouchBehaviors(true);
        }
        return performIntercept;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior f;
        int B = ga7.m17715B(this);
        int size = this.mDependencySortedChildren.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mDependencySortedChildren.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0546e) view.getLayoutParams()).mo5294f()) == null || !f.onLayoutChild(this, view, B))) {
                onLayoutChild(view, B);
            }
        }
    }

    public void onLayoutChild(View view, int i) {
        C0546e eVar = (C0546e) view.getLayoutParams();
        if (!eVar.mo5289a()) {
            View view2 = eVar.f3359k;
            if (view2 != null) {
                layoutChildWithAnchor(view, view2, i);
                return;
            }
            int i2 = eVar.f3353e;
            if (i2 >= 0) {
                layoutChildWithKeyline(view, i2, i);
            } else {
                layoutChild(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.onMeasureChild(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.prepareChildren()
            r30.ensurePreDrawListener()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = p000.ga7.m17715B(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            hl7 r3 = r7.mLastInsets
            if (r3 == 0) goto L_0x004b
            boolean r3 = p000.ga7.m17802y(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.mDependencySortedChildren
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0546e) r1
            int r0 = r1.f3353e
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.getKeyline(r0)
            int r11 = r1.f3351c
            int r11 = resolveKeylineGravity(r11)
            int r11 = p000.pj2.m24971b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = r11
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = p000.ga7.m17802y(r20)
            if (r0 != 0) goto L_0x00f1
            hl7 r0 = r7.mLastInsets
            int r0 = r0.mo21238k()
            hl7 r2 = r7.mLastInsets
            int r2 = r2.mo21239l()
            int r0 = r0 + r2
            hl7 r2 = r7.mLastInsets
            int r2 = r2.mo21240m()
            hl7 r11 = r7.mLastInsets
            int r11 = r11.mo21237j()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mo5294f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.onMeasureChild(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public void onMeasureChild(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0546e eVar = (C0546e) childAt.getLayoutParams();
                if (eVar.mo5298j(0) && (f3 = eVar.mo5294f()) != null) {
                    z2 |= f3.onNestedFling(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            onChildViewsChanged(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0546e eVar = (C0546e) childAt.getLayoutParams();
                if (eVar.mo5298j(0) && (f3 = eVar.mo5294f()) != null) {
                    z |= f3.onNestedPreFling(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        SparseArray<Parcelable> sparseArray = savedState.f3346e;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = getResolvedLayoutParams(childAt).mo5294f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = ((C0546e) childAt.getLayoutParams()).mo5294f();
            if (!(id == -1 || f == null || (onSaveInstanceState = f.onSaveInstanceState(this, childAt)) == null)) {
                sparseArray.append(id, onSaveInstanceState);
            }
        }
        savedState.f3346e = sparseArray;
        return savedState;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.mBehaviorTouchView
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.performIntercept(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = r5
        L_0x0016:
            android.view.View r6 = r0.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0546e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.mo5294f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.mBehaviorTouchView
            boolean r6 = r6.onTouchEvent(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = r5
        L_0x002c:
            android.view.View r7 = r0.mBehaviorTouchView
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.resetTouchBehaviors(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void recordLastChildRect(View view, Rect rect) {
        ((C0546e) view.getLayoutParams()).mo5305q(rect);
    }

    public void removePreDrawListener() {
        if (this.mIsAttachedToWindow && this.mOnPreDrawListener != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }
        this.mNeedsPreDrawListener = false;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior f = ((C0546e) view.getLayoutParams()).mo5294f();
        if (f == null || !f.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.mDisallowInterceptReset) {
            resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        setupForInsets();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.mOnHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.mStatusBarBackground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.mStatusBarBackground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.mStatusBarBackground.setState(getDrawableState());
                }
                ij1.m19654m(this.mStatusBarBackground, ga7.m17715B(this));
                Drawable drawable4 = this.mStatusBarBackground;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.mStatusBarBackground.setCallback(this);
            }
            ga7.m17767g0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = zr0.m31442e(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.mStatusBarBackground;
        if (drawable != null && drawable.isVisible() != z) {
            this.mStatusBarBackground.setVisible(z, false);
        }
    }

    public final hl7 setWindowInsets(hl7 hl7) {
        boolean z;
        if (mf4.m22283a(this.mLastInsets, hl7)) {
            return hl7;
        }
        this.mLastInsets = hl7;
        boolean z2 = true;
        if (hl7 == null || hl7.mo21240m() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.mDrawStatusBarBackground = z;
        if (z || getBackground() != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        hl7 dispatchApplyWindowInsetsToBehaviors = dispatchApplyWindowInsetsToBehaviors(hl7);
        requestLayout();
        return dispatchApplyWindowInsetsToBehaviors;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mStatusBarBackground) {
            return true;
        }
        return false;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f15.coordinatorLayoutStyle);
    }

    public C0546e generateDefaultLayoutParams() {
        return new C0546e(-2, -2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        Behavior f;
        int i4;
        int i5;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i3;
            } else {
                C0546e eVar = (C0546e) childAt.getLayoutParams();
                if (eVar.mo5298j(i3) && (f = eVar.mo5294f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.onNestedPreScroll(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.mBehaviorConsumed;
                    if (i > 0) {
                        i4 = Math.max(i6, iArr3[0]);
                    } else {
                        i4 = Math.min(i6, iArr3[0]);
                    }
                    i6 = i4;
                    int[] iArr4 = this.mBehaviorConsumed;
                    if (i2 > 0) {
                        i5 = Math.max(i7, iArr4[1]);
                    } else {
                        i5 = Math.min(i7, iArr4[1]);
                    }
                    i7 = i5;
                    z = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z) {
            onChildViewsChanged(1);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.mNestedScrollingV2ConsumedCompat);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        Behavior f;
        this.mNestedScrollingParentHelper.mo21728c(view, view2, i, i2);
        this.mNestedScrollingTarget = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0546e eVar = (C0546e) childAt.getLayoutParams();
            if (eVar.mo5298j(i2) && (f = eVar.mo5294f()) != null) {
                f.onNestedScrollAccepted(this, childAt, view, view2, i, i2);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0546e eVar = (C0546e) childAt.getLayoutParams();
                Behavior f = eVar.mo5294f();
                if (f != null) {
                    boolean onStartNestedScroll = f.onStartNestedScroll(this, childAt, view, view2, i, i2);
                    z |= onStartNestedScroll;
                    eVar.mo5306r(i3, onStartNestedScroll);
                } else {
                    eVar.mo5306r(i3, false);
                }
            }
        }
        return z;
    }

    public void onStopNestedScroll(View view, int i) {
        this.mNestedScrollingParentHelper.mo21730e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0546e eVar = (C0546e) childAt.getLayoutParams();
            if (eVar.mo5298j(i)) {
                Behavior f = eVar.mo5294f();
                if (f != null) {
                    f.onStopNestedScroll(this, childAt, view, i);
                }
                eVar.mo5300l(i);
                eVar.mo5299k();
            }
        }
        this.mNestedScrollingTarget = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new qg1<>();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mBehaviorConsumed = new int[2];
        this.mNestedScrollingV2ConsumedCompat = new int[2];
        this.mNestedScrollingParentHelper = new j54(this);
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, d65.CoordinatorLayout, 0, c55.Widget_Support_CoordinatorLayout);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, d65.CoordinatorLayout, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, d65.CoordinatorLayout, attributeSet, typedArray, 0, c55.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, d65.CoordinatorLayout, attributeSet, typedArray, i, 0);
            }
        }
        int resourceId = typedArray.getResourceId(d65.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.mKeylines = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.mKeylines.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.mKeylines;
                iArr[i2] = (int) (((float) iArr[i2]) * f);
            }
        }
        this.mStatusBarBackground = typedArray.getDrawable(d65.CoordinatorLayout_statusBarBackground);
        typedArray.recycle();
        setupForInsets();
        super.setOnHierarchyChangeListener(new C0545d());
        if (ga7.m17804z(this) == 0) {
            ga7.m17714A0(this, 1);
        }
    }

    public C0546e generateLayoutParams(AttributeSet attributeSet) {
        return new C0546e(getContext(), attributeSet);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior f;
        int i6;
        boolean z;
        int i7;
        int childCount = getChildCount();
        boolean z2 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0546e eVar = (C0546e) childAt.getLayoutParams();
                if (eVar.mo5298j(i5) && (f = eVar.mo5294f()) != null) {
                    int[] iArr2 = this.mBehaviorConsumed;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.onNestedScroll(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.mBehaviorConsumed;
                    if (i3 > 0) {
                        i6 = Math.max(i8, iArr3[0]);
                    } else {
                        i6 = Math.min(i8, iArr3[0]);
                    }
                    i8 = i6;
                    if (i4 > 0) {
                        z = true;
                        i7 = Math.max(i9, this.mBehaviorConsumed[1]);
                    } else {
                        z = true;
                        i7 = Math.min(i9, this.mBehaviorConsumed[1]);
                    }
                    i9 = i7;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z2) {
            onChildViewsChanged(1);
        }
    }

    public C0546e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0546e) {
            return new C0546e((C0546e) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0546e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0546e(layoutParams);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0541a();

        /* renamed from: e */
        public SparseArray<Parcelable> f3346e;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$a */
        public static class C0541a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3346e = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3346e.append(iArr[i], readParcelableArray[i]);
            }
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3346e;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f3346e.keyAt(i3);
                parcelableArr[i3] = this.f3346e.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public static class C0546e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public Behavior f3349a;

        /* renamed from: b */
        public boolean f3350b = false;

        /* renamed from: c */
        public int f3351c = 0;

        /* renamed from: d */
        public int f3352d = 0;

        /* renamed from: e */
        public int f3353e = -1;

        /* renamed from: f */
        public int f3354f = -1;

        /* renamed from: g */
        public int f3355g = 0;

        /* renamed from: h */
        public int f3356h = 0;

        /* renamed from: i */
        public int f3357i;

        /* renamed from: j */
        public int f3358j;

        /* renamed from: k */
        public View f3359k;

        /* renamed from: l */
        public View f3360l;

        /* renamed from: m */
        public boolean f3361m;

        /* renamed from: n */
        public boolean f3362n;

        /* renamed from: o */
        public boolean f3363o;

        /* renamed from: p */
        public boolean f3364p;

        /* renamed from: q */
        public final Rect f3365q = new Rect();

        /* renamed from: r */
        public Object f3366r;

        public C0546e(int i, int i2) {
            super(i, i2);
        }

        /* renamed from: a */
        public boolean mo5289a() {
            if (this.f3359k != null || this.f3354f == -1) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo5290b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Behavior behavior;
            if (view2 == this.f3360l || mo5307s(view2, ga7.m17715B(coordinatorLayout)) || ((behavior = this.f3349a) != null && behavior.layoutDependsOn(coordinatorLayout, view, view2))) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public boolean mo5291c() {
            if (this.f3349a == null) {
                this.f3361m = false;
            }
            return this.f3361m;
        }

        /* renamed from: d */
        public View mo5292d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3354f == -1) {
                this.f3360l = null;
                this.f3359k = null;
                return null;
            }
            if (this.f3359k == null || !mo5308t(view, coordinatorLayout)) {
                mo5302n(view, coordinatorLayout);
            }
            return this.f3359k;
        }

        /* renamed from: e */
        public int mo5293e() {
            return this.f3354f;
        }

        /* renamed from: f */
        public Behavior mo5294f() {
            return this.f3349a;
        }

        /* renamed from: g */
        public boolean mo5295g() {
            return this.f3364p;
        }

        /* renamed from: h */
        public Rect mo5296h() {
            return this.f3365q;
        }

        /* renamed from: i */
        public boolean mo5297i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z;
            boolean z2 = this.f3361m;
            if (z2) {
                return true;
            }
            Behavior behavior = this.f3349a;
            if (behavior != null) {
                z = behavior.blocksInteractionBelow(coordinatorLayout, view);
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            this.f3361m = z3;
            return z3;
        }

        /* renamed from: j */
        public boolean mo5298j(int i) {
            if (i == 0) {
                return this.f3362n;
            }
            if (i != 1) {
                return false;
            }
            return this.f3363o;
        }

        /* renamed from: k */
        public void mo5299k() {
            this.f3364p = false;
        }

        /* renamed from: l */
        public void mo5300l(int i) {
            mo5306r(i, false);
        }

        /* renamed from: m */
        public void mo5301m() {
            this.f3361m = false;
        }

        /* renamed from: n */
        public final void mo5302n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3354f);
            this.f3359k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f3360l = null;
                            this.f3359k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3360l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f3360l = null;
                    this.f3359k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f3360l = null;
                this.f3359k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3354f) + " to anchor view " + view);
            }
        }

        /* renamed from: o */
        public void mo5303o(Behavior behavior) {
            Behavior behavior2 = this.f3349a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.onDetachedFromLayoutParams();
                }
                this.f3349a = behavior;
                this.f3366r = null;
                this.f3350b = true;
                if (behavior != null) {
                    behavior.onAttachedToLayoutParams(this);
                }
            }
        }

        /* renamed from: p */
        public void mo5304p(boolean z) {
            this.f3364p = z;
        }

        /* renamed from: q */
        public void mo5305q(Rect rect) {
            this.f3365q.set(rect);
        }

        /* renamed from: r */
        public void mo5306r(int i, boolean z) {
            if (i == 0) {
                this.f3362n = z;
            } else if (i == 1) {
                this.f3363o = z;
            }
        }

        /* renamed from: s */
        public final boolean mo5307s(View view, int i) {
            int b = pj2.m24971b(((C0546e) view.getLayoutParams()).f3355g, i);
            if (b == 0 || (pj2.m24971b(this.f3356h, i) & b) != b) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        public final boolean mo5308t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3359k.getId() != this.f3354f) {
                return false;
            }
            View view2 = this.f3359k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3360l = null;
                    this.f3359k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3360l = view2;
            return true;
        }

        public C0546e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d65.CoordinatorLayout_Layout);
            this.f3351c = obtainStyledAttributes.getInteger(d65.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f3354f = obtainStyledAttributes.getResourceId(d65.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f3352d = obtainStyledAttributes.getInteger(d65.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f3353e = obtainStyledAttributes.getInteger(d65.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f3355g = obtainStyledAttributes.getInt(d65.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f3356h = obtainStyledAttributes.getInt(d65.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = d65.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3350b = hasValue;
            if (hasValue) {
                this.f3349a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f3349a;
            if (behavior != null) {
                behavior.onAttachedToLayoutParams(this);
            }
        }

        public C0546e(C0546e eVar) {
            super(eVar);
        }

        public C0546e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0546e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
