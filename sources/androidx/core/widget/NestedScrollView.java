package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import net.sqlcipher.database.SQLiteDatabase;
import p000.C3335t8;

public class NestedScrollView extends FrameLayout implements i54, f54 {

    /* renamed from: r1 */
    public static final float f3428r1 = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: s1 */
    public static final C0569a f3429s1 = new C0569a();

    /* renamed from: t1 */
    public static final int[] f3430t1 = {16843130};

    /* renamed from: A */
    public View f3431A;

    /* renamed from: B */
    public boolean f3432B;

    /* renamed from: C */
    public VelocityTracker f3433C;

    /* renamed from: H */
    public boolean f3434H;

    /* renamed from: I */
    public boolean f3435I;

    /* renamed from: L */
    public int f3436L;

    /* renamed from: M */
    public int f3437M;

    /* renamed from: P */
    public int f3438P;

    /* renamed from: Q */
    public int f3439Q;

    /* renamed from: U */
    public final int[] f3440U;

    /* renamed from: a */
    public final float f3441a;

    /* renamed from: b1 */
    public SavedState f3442b1;

    /* renamed from: d */
    public long f3443d;

    /* renamed from: e */
    public final Rect f3444e;

    /* renamed from: e0 */
    public final int[] f3445e0;

    /* renamed from: e1 */
    public final j54 f3446e1;

    /* renamed from: g */
    public OverScroller f3447g;

    /* renamed from: k */
    public EdgeEffect f3448k;

    /* renamed from: k0 */
    public int f3449k0;

    /* renamed from: o1 */
    public final g54 f3450o1;

    /* renamed from: p1 */
    public float f3451p1;

    /* renamed from: q1 */
    public C0571c f3452q1;

    /* renamed from: r */
    public EdgeEffect f3453r;

    /* renamed from: s */
    public int f3454s;

    /* renamed from: v0 */
    public int f3455v0;

    /* renamed from: x */
    public boolean f3456x;

    /* renamed from: y */
    public boolean f3457y;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0568a();

        /* renamed from: a */
        public int f3458a;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        public class C0568a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3458a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3458a);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f3458a = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0569a extends C3715z7 {
        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.mo5478f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3576x8.m29927a(accessibilityEvent, nestedScrollView.getScrollX());
            C3576x8.m29928b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            int scrollRange;
            super.mo5479g(view, t8Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            t8Var.mo26239f0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                t8Var.mo26199G0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    t8Var.mo26229b(C3335t8.C3336a.f18017r);
                    t8Var.mo26229b(C3335t8.C3336a.f17985C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    t8Var.mo26229b(C3335t8.C3336a.f18016q);
                    t8Var.mo26229b(C3335t8.C3336a.f17987E);
                }
            }
        }

        /* renamed from: j */
        public boolean mo5480j(View view, int i, Bundle bundle) {
            if (super.mo5480j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo5387N(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo5387N(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0570b {
        /* renamed from: a */
        public static boolean m4404a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0571c {
        /* renamed from: a */
        void mo4877a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: e */
    public static int m4356e(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3451p1 == Utils.FLOAT_EPSILON) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3451p1 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3451p1;
    }

    /* renamed from: x */
    public static boolean m4357x(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m4357x((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final void mo5374A(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3439Q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f3454s = (int) motionEvent.getY(i);
            this.f3439Q = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3433C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: B */
    public boolean mo5375B(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        boolean z6;
        boolean z7;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (overScrollMode == 0 || (overScrollMode == 1 && z3)) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = i3 + i;
        if (!z4) {
            i9 = 0;
        } else {
            i9 = i7;
        }
        int i12 = i4 + i2;
        if (!z5) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        int i13 = -i9;
        int i14 = i9 + i5;
        int i15 = -i10;
        int i16 = i10 + i6;
        if (i11 > i14) {
            i11 = i14;
            z6 = true;
        } else if (i11 < i13) {
            z6 = true;
            i11 = i13;
        } else {
            z6 = false;
        }
        if (i12 > i16) {
            i12 = i16;
            z7 = true;
        } else if (i12 < i15) {
            z7 = true;
            i12 = i15;
        } else {
            z7 = false;
        }
        if (z7 && !mo5452r(1)) {
            this.f3447g.springBack(i11, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i12, z6, z7);
        if (z6 || z7) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean mo5376C(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.f3444e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3444e;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3444e.top = getScrollY() - height;
            Rect rect2 = this.f3444e;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3444e;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return mo5380G(i, i2, i3);
    }

    /* renamed from: D */
    public final void mo5377D() {
        VelocityTracker velocityTracker = this.f3433C;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3433C = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo5378E(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3448k
            float r0 = p000.jn1.m20238b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f3448k
            float r4 = -r4
            float r4 = p000.jn1.m20240d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3448k
            float r5 = p000.jn1.m20238b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3448k
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f3453r
            float r0 = p000.jn1.m20238b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f3453r
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = p000.jn1.m20240d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3453r
            float r5 = p000.jn1.m20238b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3453r
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo5378E(int, float):int");
    }

    /* renamed from: F */
    public final void mo5379F(boolean z) {
        if (z) {
            mo5388O(2, 1);
        } else {
            mo5390Q(1);
        }
        this.f3455v0 = getScrollY();
        ga7.m17767g0(this);
    }

    /* renamed from: G */
    public final boolean mo5380G(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View n = mo5429n(z, i2, i3);
        if (n == null) {
            n = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            mo5423j(i4);
            z2 = true;
        }
        if (n != findFocus()) {
            n.requestFocus(i);
        }
        return z2;
    }

    /* renamed from: H */
    public final void mo5381H(View view) {
        view.getDrawingRect(this.f3444e);
        offsetDescendantRectToMyCoords(view, this.f3444e);
        int f = mo5412f(this.f3444e);
        if (f != 0) {
            scrollBy(0, f);
        }
    }

    /* renamed from: I */
    public final boolean mo5382I(Rect rect, boolean z) {
        boolean z2;
        int f = mo5412f(rect);
        if (f != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, f);
            } else {
                mo5384K(0, f);
            }
        }
        return z2;
    }

    /* renamed from: J */
    public final boolean mo5383J(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (mo5451q(-i) < jn1.m20238b(edgeEffect) * ((float) getHeight())) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final void mo5384K(int i, int i2) {
        mo5385L(i, i2, SQLiteDatabase.MAX_SQL_CACHE_SIZE, false);
    }

    /* renamed from: L */
    public final void mo5385L(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3443d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3447g;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo5379F(z);
            } else {
                if (!this.f3447g.isFinished()) {
                    mo5391a();
                }
                scrollBy(i, i2);
            }
            this.f3443d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: M */
    public void mo5386M(int i, int i2, int i3, boolean z) {
        mo5385L(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: N */
    public void mo5387N(int i, int i2, boolean z) {
        mo5386M(i, i2, SQLiteDatabase.MAX_SQL_CACHE_SIZE, z);
    }

    /* renamed from: O */
    public boolean mo5388O(int i, int i2) {
        return this.f3450o1.mo20383p(i, i2);
    }

    /* renamed from: P */
    public final boolean mo5389P(MotionEvent motionEvent) {
        boolean z;
        if (jn1.m20238b(this.f3448k) != Utils.FLOAT_EPSILON) {
            jn1.m20240d(this.f3448k, Utils.FLOAT_EPSILON, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (jn1.m20238b(this.f3453r) == Utils.FLOAT_EPSILON) {
            return z;
        }
        jn1.m20240d(this.f3453r, Utils.FLOAT_EPSILON, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: Q */
    public void mo5390Q(int i) {
        this.f3450o1.mo20385r(i);
    }

    /* renamed from: a */
    public final void mo5391a() {
        this.f3447g.abortAnimation();
        mo5390Q(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public boolean mo5396b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo5470y(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo5423j(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3444e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3444e);
            mo5423j(mo5412f(this.f3444e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !mo5469w(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    /* renamed from: c */
    public final boolean mo5397c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0) {
            return true;
        }
        if (overScrollMode != 1 || getScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f3447g.isFinished()) {
            this.f3447g.computeScrollOffset();
            int currY = this.f3447g.getCurrY();
            int g = mo5413g(currY - this.f3455v0);
            this.f3455v0 = currY;
            int[] iArr = this.f3445e0;
            boolean z = false;
            iArr[1] = 0;
            mo5419h(0, g, iArr, (int[]) null, 1);
            int i = g - this.f3445e0[1];
            int scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                mo5375B(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i2 = i - scrollY2;
                int[] iArr2 = this.f3445e0;
                iArr2[1] = 0;
                mo5421i(0, scrollY2, 0, i2, this.f3440U, 1, iArr2);
                i = i2 - this.f3445e0[1];
            }
            if (i != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i < 0) {
                        if (this.f3448k.isFinished()) {
                            this.f3448k.onAbsorb((int) this.f3447g.getCurrVelocity());
                        }
                    } else if (this.f3453r.isFinished()) {
                        this.f3453r.onAbsorb((int) this.f3447g.getCurrVelocity());
                    }
                }
                mo5391a();
            }
            if (!this.f3447g.isFinished()) {
                ga7.m17767g0(this);
            } else {
                mo5390Q(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    /* renamed from: d */
    public final boolean mo5405d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo5426m(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3450o1.mo20368a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3450o1.mo20369b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return mo5419h(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3450o1.mo20373f(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f3448k.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0570b.m4404a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C0570b.m4404a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f3448k.setSize(width, height);
            if (this.f3448k.draw(canvas)) {
                ga7.m17767g0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3453r.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C0570b.m4404a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C0570b.m4404a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, Utils.FLOAT_EPSILON);
            this.f3453r.setSize(width2, height2);
            if (this.f3453r.draw(canvas)) {
                ga7.m17767g0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: f */
    public int mo5412f(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i5 >= i) {
            return 0;
        } else {
            if (rect.height() > height) {
                i2 = 0 - (i - rect.bottom);
            } else {
                i2 = 0 - (scrollY - rect.top);
            }
            return Math.max(i2, -getScrollY());
        }
    }

    /* renamed from: g */
    public int mo5413g(int i) {
        int height = getHeight();
        if (i > 0 && jn1.m20238b(this.f3448k) != Utils.FLOAT_EPSILON) {
            int round = Math.round((((float) (-height)) / 4.0f) * jn1.m20240d(this.f3448k, (((float) (-i)) * 4.0f) / ((float) height), 0.5f));
            if (round != i) {
                this.f3448k.finish();
            }
            return i - round;
        } else if (i >= 0 || jn1.m20238b(this.f3453r) == Utils.FLOAT_EPSILON) {
            return i;
        } else {
            float f = (float) height;
            int round2 = Math.round((f / 4.0f) * jn1.m20240d(this.f3453r, (((float) i) * 4.0f) / f, 0.5f));
            if (round2 != i) {
                this.f3453r.finish();
            }
            return i - round2;
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return Utils.FLOAT_EPSILON;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f3446e1.mo21726a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return Utils.FLOAT_EPSILON;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean mo5419h(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f3450o1.mo20371d(i, i2, iArr, iArr2, i3);
    }

    public boolean hasNestedScrollingParent() {
        return mo5452r(0);
    }

    /* renamed from: i */
    public void mo5421i(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f3450o1.mo20372e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3450o1.mo20379l();
    }

    /* renamed from: j */
    public final void mo5423j(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3435I) {
            mo5384K(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: k */
    public final boolean mo5424k(int i) {
        if (jn1.m20238b(this.f3448k) != Utils.FLOAT_EPSILON) {
            if (mo5383J(this.f3448k, i)) {
                this.f3448k.onAbsorb(i);
            } else {
                mo5430o(-i);
            }
        } else if (jn1.m20238b(this.f3453r) == Utils.FLOAT_EPSILON) {
            return false;
        } else {
            int i2 = -i;
            if (mo5383J(this.f3453r, i2)) {
                this.f3453r.onAbsorb(i2);
            } else {
                mo5430o(i2);
            }
        }
        return true;
    }

    /* renamed from: l */
    public final void mo5425l() {
        this.f3432B = false;
        mo5377D();
        mo5390Q(0);
        this.f3448k.onRelease();
        this.f3453r.onRelease();
    }

    /* renamed from: m */
    public boolean mo5426m(KeyEvent keyEvent) {
        this.f3444e.setEmpty();
        int i = 130;
        if (!mo5405d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        return false;
                    }
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    mo5376C(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return mo5396b(130);
                } else {
                    return mo5450p(130);
                }
            } else if (!keyEvent.isAltPressed()) {
                return mo5396b(33);
            } else {
                return mo5450p(33);
            }
        }
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final View mo5429n(boolean z, int i, int i2) {
        boolean z2;
        boolean z3;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                if (i >= top || bottom >= i2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (view == null) {
                    view = view2;
                    z4 = z2;
                } else {
                    if ((!z || top >= view.getTop()) && (z || bottom <= view.getBottom())) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z4) {
                        if (z2) {
                            if (!z3) {
                            }
                        }
                    } else if (z2) {
                        view = view2;
                        z4 = true;
                    } else if (!z3) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: o */
    public void mo5430o(int i) {
        if (getChildCount() > 0) {
            this.f3447g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo5379F(true);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3457y = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00aa
            boolean r0 = r8.f3432B
            if (r0 != 0) goto L_0x00aa
            r0 = 2
            boolean r0 = p000.oy3.m24440a(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = p000.oy3.m24440a(r9, r0)
            if (r0 == 0) goto L_0x002b
            r0 = 26
            float r0 = r9.getAxisValue(r0)
            goto L_0x002c
        L_0x002b:
            r0 = r2
        L_0x002c:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00aa
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x0071
            boolean r2 = r8.mo5397c()
            if (r2 == 0) goto L_0x0055
            boolean r9 = p000.oy3.m24440a(r9, r5)
            if (r9 != 0) goto L_0x0055
            r9 = r6
            goto L_0x0056
        L_0x0055:
            r9 = r1
        L_0x0056:
            if (r9 == 0) goto L_0x006f
            android.widget.EdgeEffect r9 = r8.f3448k
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            p000.jn1.m20240d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3448k
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto L_0x009f
        L_0x006f:
            r9 = r1
            goto L_0x009f
        L_0x0071:
            if (r0 <= r2) goto L_0x009d
            boolean r7 = r8.mo5397c()
            if (r7 == 0) goto L_0x0081
            boolean r9 = p000.oy3.m24440a(r9, r5)
            if (r9 != 0) goto L_0x0081
            r9 = r6
            goto L_0x0082
        L_0x0081:
            r9 = r1
        L_0x0082:
            if (r9 == 0) goto L_0x009a
            android.widget.EdgeEffect r9 = r8.f3453r
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            p000.jn1.m20240d(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3453r
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        L_0x009a:
            r9 = r1
            r1 = r2
            goto L_0x009f
        L_0x009d:
            r9 = r1
            r1 = r0
        L_0x009f:
            if (r1 == r3) goto L_0x00a9
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a9:
            return r9
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3432B) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3439Q;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3454s) > this.f3436L && (2 & getNestedScrollAxes()) == 0) {
                                this.f3432B = true;
                                this.f3454s = y;
                                mo5468v();
                                this.f3433C.addMovement(motionEvent);
                                this.f3449k0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        mo5374A(motionEvent);
                    }
                }
            }
            this.f3432B = false;
            this.f3439Q = -1;
            mo5377D();
            if (this.f3447g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ga7.m17767g0(this);
            }
            mo5390Q(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!mo5457s((int) motionEvent.getX(), y2)) {
                if (!mo5389P(motionEvent) && this.f3447g.isFinished()) {
                    z = false;
                }
                this.f3432B = z;
                mo5377D();
            } else {
                this.f3454s = y2;
                this.f3439Q = motionEvent.getPointerId(0);
                mo5466t();
                this.f3433C.addMovement(motionEvent);
                this.f3447g.computeScrollOffset();
                if (!mo5389P(motionEvent) && this.f3447g.isFinished()) {
                    z = false;
                }
                this.f3432B = z;
                mo5388O(2, 0);
            }
        }
        return this.f3432B;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3456x = false;
        View view = this.f3431A;
        if (view != null && m4357x(view, this)) {
            mo5381H(this.f3431A);
        }
        this.f3431A = null;
        if (!this.f3457y) {
            if (this.f3442b1 != null) {
                scrollTo(getScrollX(), this.f3442b1.f3458a);
                this.f3442b1 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e = m4356e(scrollY, paddingTop, i5);
            if (e != scrollY) {
                scrollTo(getScrollX(), e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3457y = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3434H && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(Utils.FLOAT_EPSILON, f2, true);
        mo5430o((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        mo5419h(i, i2, iArr, (int[]) null, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo5471z(i4, i5, iArr);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f3446e1.mo21728c(view, view2, i, i2);
        mo5388O(2, i2);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, (View) null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !mo5469w(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f3442b1 = savedState;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3458a = getScrollY();
        return savedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0571c cVar = this.f3452q1;
        if (cVar != null) {
            cVar.mo4877a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo5470y(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3444e);
            offsetDescendantRectToMyCoords(findFocus, this.f3444e);
            mo5423j(mo5412f(this.f3444e));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f3446e1.mo21730e(view, i);
        mo5390Q(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.mo5468v()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f3449k0 = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f3449k0
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0225
            r3 = -1
            if (r0 == r14) goto L_0x01d4
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0254
        L_0x002f:
            r23.mo5374A(r24)
            int r0 = r10.f3439Q
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f3454s = r0
            goto L_0x0254
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f3454s = r1
            int r0 = r11.getPointerId(r0)
            r10.f3439Q = r0
            goto L_0x0254
        L_0x0054:
            boolean r0 = r10.f3432B
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f3447g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            p000.ga7.m17767g0(r23)
        L_0x007b:
            r10.f3439Q = r3
            r23.mo5425l()
            goto L_0x0254
        L_0x0082:
            int r0 = r10.f3439Q
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f3439Q
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            goto L_0x0254
        L_0x00a0:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f3454s
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.mo5378E(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f3432B
            if (r1 != 0) goto L_0x00d1
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f3436L
            if (r1 <= r2) goto L_0x00d1
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00c6
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00c6:
            r10.f3432B = r14
            if (r0 <= 0) goto L_0x00ce
            int r1 = r10.f3436L
            int r0 = r0 - r1
            goto L_0x00d1
        L_0x00ce:
            int r1 = r10.f3436L
            int r0 = r0 + r1
        L_0x00d1:
            r7 = r0
            boolean r0 = r10.f3432B
            if (r0 == 0) goto L_0x0254
            r1 = 0
            int[] r3 = r10.f3445e0
            int[] r4 = r10.f3440U
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo5419h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00f3
            int[] r0 = r10.f3445e0
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f3449k0
            int[] r1 = r10.f3440U
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f3449k0 = r0
        L_0x00f3:
            r16 = r7
            int[] r0 = r10.f3440U
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f3454s = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0112
            if (r0 != r14) goto L_0x010f
            if (r9 <= 0) goto L_0x010f
            goto L_0x0112
        L_0x010f:
            r18 = r12
            goto L_0x0114
        L_0x0112:
            r18 = r14
        L_0x0114:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo5375B(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0136
            boolean r0 = r10.mo5452r(r12)
            if (r0 != 0) goto L_0x0136
            r8 = r14
            goto L_0x0137
        L_0x0136:
            r8 = r12
        L_0x0137:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f3445e0
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f3440U
            r6 = 0
            r0 = r23
            r0.mo5421i(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f3454s
            int[] r1 = r10.f3440U
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.f3454s = r0
            int r0 = r10.f3449k0
            int r0 = r0 + r1
            r10.f3449k0 = r0
            if (r18 == 0) goto L_0x01ca
            int[] r0 = r10.f3445e0
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x018c
            android.widget.EdgeEffect r1 = r10.f3448k
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            p000.jn1.m20240d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3453r
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b6
            android.widget.EdgeEffect r0 = r10.f3453r
            r0.onRelease()
            goto L_0x01b6
        L_0x018c:
            r2 = r22
            if (r1 <= r2) goto L_0x01b6
            android.widget.EdgeEffect r1 = r10.f3453r
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            p000.jn1.m20240d(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3448k
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01b6
            android.widget.EdgeEffect r0 = r10.f3448k
            r0.onRelease()
        L_0x01b6:
            android.widget.EdgeEffect r0 = r10.f3448k
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01c6
            android.widget.EdgeEffect r0 = r10.f3453r
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01ca
        L_0x01c6:
            p000.ga7.m17767g0(r23)
            goto L_0x01cb
        L_0x01ca:
            r12 = r8
        L_0x01cb:
            if (r12 == 0) goto L_0x0254
            android.view.VelocityTracker r0 = r10.f3433C
            r0.clear()
            goto L_0x0254
        L_0x01d4:
            android.view.VelocityTracker r0 = r10.f3433C
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f3438P
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f3439Q
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f3437M
            if (r1 < r4) goto L_0x0202
            boolean r1 = r10.mo5424k(r0)
            if (r1 != 0) goto L_0x021f
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x021f
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo5430o(r0)
            goto L_0x021f
        L_0x0202:
            android.widget.OverScroller r15 = r10.f3447g
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x021f
            p000.ga7.m17767g0(r23)
        L_0x021f:
            r10.f3439Q = r3
            r23.mo5425l()
            goto L_0x0254
        L_0x0225:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022c
            return r12
        L_0x022c:
            boolean r0 = r10.f3432B
            if (r0 == 0) goto L_0x0239
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x0239
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0239:
            android.widget.OverScroller r0 = r10.f3447g
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0244
            r23.mo5391a()
        L_0x0244:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f3454s = r0
            int r0 = r11.getPointerId(r12)
            r10.f3439Q = r0
            r10.mo5388O(r1, r12)
        L_0x0254:
            android.view.VelocityTracker r0 = r10.f3433C
            if (r0 == 0) goto L_0x025b
            r0.addMovement(r13)
        L_0x025b:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean mo5450p(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.f3444e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3444e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3444e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3444e;
        return mo5380G(i, rect3.top, rect3.bottom);
    }

    /* renamed from: q */
    public final float mo5451q(int i) {
        double log = Math.log((double) ((((float) Math.abs(i)) * 0.35f) / (this.f3441a * 0.015f)));
        float f = f3428r1;
        return (float) (((double) (this.f3441a * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * log));
    }

    /* renamed from: r */
    public boolean mo5452r(int i) {
        return this.f3450o1.mo20378k(i);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3456x) {
            mo5381H(view2);
        } else {
            this.f3431A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return mo5382I(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo5377D();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f3456x = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean mo5457s(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int e = m4356e(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int e2 = m4356e(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (e != getScrollX() || e2 != getScrollY()) {
                super.scrollTo(e, e2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3434H) {
            this.f3434H = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3450o1.mo20380m(z);
    }

    public void setOnScrollChangeListener(C0571c cVar) {
        this.f3452q1 = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3435I = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo5388O(i, 0);
    }

    public void stopNestedScroll() {
        mo5390Q(0);
    }

    /* renamed from: t */
    public final void mo5466t() {
        VelocityTracker velocityTracker = this.f3433C;
        if (velocityTracker == null) {
            this.f3433C = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: u */
    public final void mo5467u() {
        this.f3447g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3436L = viewConfiguration.getScaledTouchSlop();
        this.f3437M = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3438P = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: v */
    public final void mo5468v() {
        if (this.f3433C == null) {
            this.f3433C = VelocityTracker.obtain();
        }
    }

    /* renamed from: w */
    public final boolean mo5469w(View view) {
        return !mo5470y(view, 0, getHeight());
    }

    /* renamed from: y */
    public final boolean mo5470y(View view, int i, int i2) {
        view.getDrawingRect(this.f3444e);
        offsetDescendantRectToMyCoords(view, this.f3444e);
        if (this.f3444e.bottom + i < getScrollY() || this.f3444e.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void mo5471z(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3450o1.mo20372e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g15.nestedScrollViewStyle);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        mo5471z(i4, i5, (int[]) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3444e = new Rect();
        this.f3456x = true;
        this.f3457y = false;
        this.f3431A = null;
        this.f3432B = false;
        this.f3435I = true;
        this.f3439Q = -1;
        this.f3440U = new int[2];
        this.f3445e0 = new int[2];
        this.f3448k = jn1.m20237a(context, attributeSet);
        this.f3453r = jn1.m20237a(context, attributeSet);
        this.f3441a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        mo5467u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3430t1, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3446e1 = new j54(this);
        this.f3450o1 = new g54(this);
        setNestedScrollingEnabled(true);
        ga7.m17785p0(this, f3429s1);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo5471z(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
