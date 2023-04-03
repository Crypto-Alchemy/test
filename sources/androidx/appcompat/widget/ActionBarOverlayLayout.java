package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0182i;
import com.github.mikephil.charting.utils.Utils;
import p000.hl7;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements q31, h54, i54 {

    /* renamed from: v1 */
    public static final int[] f891v1 = {m15.actionBarSize, 16842841};

    /* renamed from: A */
    public boolean f892A;

    /* renamed from: B */
    public boolean f893B;

    /* renamed from: C */
    public int f894C;

    /* renamed from: H */
    public int f895H;

    /* renamed from: I */
    public final Rect f896I;

    /* renamed from: L */
    public final Rect f897L;

    /* renamed from: M */
    public final Rect f898M;

    /* renamed from: P */
    public final Rect f899P;

    /* renamed from: Q */
    public final Rect f900Q;

    /* renamed from: U */
    public final Rect f901U;

    /* renamed from: a */
    public int f902a;

    /* renamed from: b1 */
    public hl7 f903b1;

    /* renamed from: d */
    public int f904d;

    /* renamed from: e */
    public ContentFrameLayout f905e;

    /* renamed from: e0 */
    public final Rect f906e0;

    /* renamed from: e1 */
    public hl7 f907e1;

    /* renamed from: g */
    public ActionBarContainer f908g;

    /* renamed from: k */
    public r31 f909k;

    /* renamed from: k0 */
    public hl7 f910k0;

    /* renamed from: o1 */
    public C0195d f911o1;

    /* renamed from: p1 */
    public OverScroller f912p1;

    /* renamed from: q1 */
    public ViewPropertyAnimator f913q1;

    /* renamed from: r */
    public Drawable f914r;

    /* renamed from: r1 */
    public final AnimatorListenerAdapter f915r1;

    /* renamed from: s */
    public boolean f916s;

    /* renamed from: s1 */
    public final Runnable f917s1;

    /* renamed from: t1 */
    public final Runnable f918t1;

    /* renamed from: u1 */
    public final j54 f919u1;

    /* renamed from: v0 */
    public hl7 f920v0;

    /* renamed from: x */
    public boolean f921x;

    /* renamed from: y */
    public boolean f922y;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0192a extends AnimatorListenerAdapter {
        public C0192a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f913q1 = null;
            actionBarOverlayLayout.f893B = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f913q1 = null;
            actionBarOverlayLayout.f893B = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0193b implements Runnable {
        public C0193b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1643m();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f913q1 = actionBarOverlayLayout.f908g.animate().translationY(Utils.FLOAT_EPSILON).setListener(ActionBarOverlayLayout.this.f915r1);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0194c implements Runnable {
        public C0194c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1643m();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f913q1 = actionBarOverlayLayout.f908g.animate().translationY((float) (-ActionBarOverlayLayout.this.f908g.getHeight())).setListener(ActionBarOverlayLayout.this.f915r1);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0195d {
        /* renamed from: a */
        void mo1236a();

        /* renamed from: b */
        void mo1237b(int i);

        /* renamed from: c */
        void mo1238c();

        /* renamed from: d */
        void mo1239d(boolean z);

        /* renamed from: e */
        void mo1240e();

        /* renamed from: f */
        void mo1241f();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public boolean mo1622a() {
        mo1668r();
        return this.f909k.mo2585a();
    }

    /* renamed from: b */
    public boolean mo1623b() {
        mo1668r();
        return this.f909k.mo2586b();
    }

    /* renamed from: c */
    public boolean mo1624c() {
        mo1668r();
        return this.f909k.mo2587c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo1626d() {
        mo1668r();
        return this.f909k.mo2589d();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f914r != null && !this.f916s) {
            if (this.f908g.getVisibility() == 0) {
                i = (int) (((float) this.f908g.getBottom()) + this.f908g.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f914r.setBounds(0, i, getWidth(), this.f914r.getIntrinsicHeight() + i);
            this.f914r.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1628e() {
        mo1668r();
        return this.f909k.mo2590e();
    }

    /* renamed from: f */
    public void mo1629f(int i) {
        mo1668r();
        if (i == 2) {
            this.f909k.mo2601n();
        } else if (i == 5) {
            this.f909k.mo2616u();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public void mo1631g() {
        mo1668r();
        this.f909k.mo2603p();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f908g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f919u1.mo21726a();
    }

    public CharSequence getTitle() {
        mo1668r();
        return this.f909k.getTitle();
    }

    /* renamed from: h */
    public final void mo1638h() {
        mo1643m();
        this.f918t1.run();
    }

    /* renamed from: i */
    public final boolean mo1639i(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    /* renamed from: j */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: k */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: l */
    public final r31 mo1642l(View view) {
        if (view instanceof r31) {
            return (r31) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: m */
    public void mo1643m() {
        removeCallbacks(this.f917s1);
        removeCallbacks(this.f918t1);
        ViewPropertyAnimator viewPropertyAnimator = this.f913q1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: n */
    public final void mo1644n(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f891v1);
        boolean z2 = false;
        this.f902a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f914r = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f916s = z2;
        this.f912p1 = new OverScroller(context);
    }

    /* renamed from: o */
    public boolean mo1645o() {
        return this.f921x;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1668r();
        hl7 y = hl7.m18976y(windowInsets, this);
        boolean i = mo1639i(this.f908g, new Rect(y.mo21238k(), y.mo21240m(), y.mo21239l(), y.mo21237j()), true, true, false, true);
        ga7.m17764f(this, y, this.f896I);
        Rect rect = this.f896I;
        hl7 o = y.mo21242o(rect.left, rect.top, rect.right, rect.bottom);
        this.f910k0 = o;
        boolean z = true;
        if (!this.f920v0.equals(o)) {
            this.f920v0 = this.f910k0;
            i = true;
        }
        if (!this.f897L.equals(this.f896I)) {
            this.f897L.set(this.f896I);
        } else {
            z = i;
        }
        if (z) {
            requestLayout();
        }
        return y.mo21226a().mo21228c().mo21227b().mo21249w();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1644n(getContext());
        ga7.m17779m0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1643m();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        mo1668r();
        measureChildWithMargins(this.f908g, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f908g.getLayoutParams();
        int max = Math.max(0, this.f908g.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f908g.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f908g.getMeasuredState());
        if ((ga7.m17737M(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f902a;
            if (this.f922y && this.f908g.getTabContainer() != null) {
                i3 += this.f902a;
            }
        } else {
            i3 = this.f908g.getVisibility() != 8 ? this.f908g.getMeasuredHeight() : 0;
        }
        this.f898M.set(this.f896I);
        hl7 hl7 = this.f910k0;
        this.f903b1 = hl7;
        if (this.f921x || z) {
            this.f903b1 = new hl7.C2481b(this.f903b1).mo21252c(qv2.m25931b(hl7.mo21238k(), this.f903b1.mo21240m() + i3, this.f903b1.mo21239l(), this.f903b1.mo21237j() + 0)).mo21250a();
        } else {
            Rect rect = this.f898M;
            rect.top += i3;
            rect.bottom += 0;
            this.f903b1 = hl7.mo21242o(0, i3, 0, 0);
        }
        mo1639i(this.f905e, this.f898M, true, true, true, true);
        if (!this.f907e1.equals(this.f903b1)) {
            hl7 hl72 = this.f903b1;
            this.f907e1 = hl72;
            ga7.m17766g(this.f905e, hl72);
        }
        measureChildWithMargins(this.f905e, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f905e.getLayoutParams();
        int max3 = Math.max(max, this.f905e.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f905e.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f905e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f892A || !z) {
            return false;
        }
        if (mo1685t(f2)) {
            mo1638h();
        } else {
            mo1669s();
        }
        this.f893B = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        mo1668r();
        int i2 = this.f895H ^ i;
        this.f895H = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        }
        C0195d dVar = this.f911o1;
        if (dVar != null) {
            dVar.mo1239d(!z2);
            if (z || !z2) {
                this.f911o1.mo1236a();
            } else {
                this.f911o1.mo1240e();
            }
        }
        if ((i2 & 256) != 0 && this.f911o1 != null) {
            ga7.m17779m0(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f904d = i;
        C0195d dVar = this.f911o1;
        if (dVar != null) {
            dVar.mo1237b(i);
        }
    }

    /* renamed from: p */
    public final void mo1666p() {
        mo1643m();
        postDelayed(this.f918t1, 600);
    }

    /* renamed from: q */
    public final void mo1667q() {
        mo1643m();
        postDelayed(this.f917s1, 600);
    }

    /* renamed from: r */
    public void mo1668r() {
        if (this.f905e == null) {
            this.f905e = (ContentFrameLayout) findViewById(j35.action_bar_activity_content);
            this.f908g = (ActionBarContainer) findViewById(j35.action_bar_container);
            this.f909k = mo1642l(findViewById(j35.action_bar));
        }
    }

    /* renamed from: s */
    public final void mo1669s() {
        mo1643m();
        this.f917s1.run();
    }

    public void setActionBarHideOffset(int i) {
        mo1643m();
        this.f908g.setTranslationY((float) (-Math.max(0, Math.min(i, this.f908g.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0195d dVar) {
        this.f911o1 = dVar;
        if (getWindowToken() != null) {
            this.f911o1.mo1237b(this.f904d);
            int i = this.f895H;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ga7.m17779m0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f922y = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f892A) {
            this.f892A = z;
            if (!z) {
                mo1643m();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1668r();
        this.f909k.setIcon(i);
    }

    public void setLogo(int i) {
        mo1668r();
        this.f909k.mo2605r(i);
    }

    public void setMenu(Menu menu, C0182i.C0183a aVar) {
        mo1668r();
        this.f909k.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        mo1668r();
        this.f909k.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f921x = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f916s = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1668r();
        this.f909k.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1668r();
        this.f909k.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo1685t(float f) {
        this.f912p1.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f912p1.getFinalY() > this.f908g.getHeight()) {
            return true;
        }
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f904d = 0;
        this.f896I = new Rect();
        this.f897L = new Rect();
        this.f898M = new Rect();
        this.f899P = new Rect();
        this.f900Q = new Rect();
        this.f901U = new Rect();
        this.f906e0 = new Rect();
        hl7 hl7 = hl7.f12927b;
        this.f910k0 = hl7;
        this.f920v0 = hl7;
        this.f903b1 = hl7;
        this.f907e1 = hl7;
        this.f915r1 = new C0192a();
        this.f917s1 = new C0193b();
        this.f918t1 = new C0194c();
        mo1644n(context);
        this.f919u1 = new j54(this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f919u1.mo21727b(view, view2, i);
        this.f894C = getActionBarHideOffset();
        mo1643m();
        C0195d dVar = this.f911o1;
        if (dVar != null) {
            dVar.mo1241f();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f908g.getVisibility() != 0) {
            return false;
        }
        return this.f892A;
    }

    public void onStopNestedScroll(View view) {
        if (this.f892A && !this.f893B) {
            if (this.f894C <= this.f908g.getHeight()) {
                mo1667q();
            } else {
                mo1666p();
            }
        }
        C0195d dVar = this.f911o1;
        if (dVar != null) {
            dVar.mo1238c();
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f894C + i2;
        this.f894C = i5;
        setActionBarHideOffset(i5);
    }

    public void setIcon(Drawable drawable) {
        mo1668r();
        this.f909k.setIcon(drawable);
    }
}
