package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.github.mikephil.charting.utils.Utils;

public class SwipeRefreshLayout extends ViewGroup implements i54, h54, f54 {

    /* renamed from: G1 */
    public static final String f7013G1 = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: H1 */
    public static final int[] f7014H1 = {16842766};

    /* renamed from: A */
    public final int[] f7015A;

    /* renamed from: A1 */
    public boolean f7016A1;

    /* renamed from: B */
    public final int[] f7017B;

    /* renamed from: B1 */
    public C1407i f7018B1;

    /* renamed from: C */
    public boolean f7019C;

    /* renamed from: C1 */
    public boolean f7020C1;

    /* renamed from: D1 */
    public Animation.AnimationListener f7021D1;

    /* renamed from: E1 */
    public final Animation f7022E1;

    /* renamed from: F1 */
    public final Animation f7023F1;

    /* renamed from: H */
    public int f7024H;

    /* renamed from: I */
    public int f7025I;

    /* renamed from: L */
    public float f7026L;

    /* renamed from: M */
    public float f7027M;

    /* renamed from: P */
    public boolean f7028P;

    /* renamed from: Q */
    public int f7029Q;

    /* renamed from: U */
    public boolean f7030U;

    /* renamed from: a */
    public View f7031a;

    /* renamed from: b1 */
    public int f7032b1;

    /* renamed from: d */
    public C1408j f7033d;

    /* renamed from: e */
    public boolean f7034e;

    /* renamed from: e0 */
    public boolean f7035e0;

    /* renamed from: e1 */
    public int f7036e1;

    /* renamed from: g */
    public int f7037g;

    /* renamed from: k */
    public float f7038k;

    /* renamed from: k0 */
    public final DecelerateInterpolator f7039k0;

    /* renamed from: o1 */
    public float f7040o1;

    /* renamed from: p1 */
    public int f7041p1;

    /* renamed from: q1 */
    public int f7042q1;

    /* renamed from: r */
    public float f7043r;

    /* renamed from: r1 */
    public int f7044r1;

    /* renamed from: s */
    public final j54 f7045s;

    /* renamed from: s1 */
    public bf0 f7046s1;

    /* renamed from: t1 */
    public Animation f7047t1;

    /* renamed from: u1 */
    public Animation f7048u1;

    /* renamed from: v0 */
    public ye0 f7049v0;

    /* renamed from: v1 */
    public Animation f7050v1;

    /* renamed from: w1 */
    public Animation f7051w1;

    /* renamed from: x */
    public final g54 f7052x;

    /* renamed from: x1 */
    public Animation f7053x1;

    /* renamed from: y */
    public final int[] f7054y;

    /* renamed from: y1 */
    public boolean f7055y1;

    /* renamed from: z1 */
    public int f7056z1;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class C1399a implements Animation.AnimationListener {
        public C1399a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1408j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f7034e) {
                swipeRefreshLayout.f7046s1.setAlpha(255);
                SwipeRefreshLayout.this.f7046s1.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f7055y1 && (jVar = swipeRefreshLayout2.f7033d) != null) {
                    jVar.onRefresh();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f7025I = swipeRefreshLayout3.f7049v0.getTop();
                return;
            }
            swipeRefreshLayout.mo10335m();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C1400b extends Animation {
        public C1400b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C1401c extends Animation {
        public C1401c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C1402d extends Animation {

        /* renamed from: a */
        public final /* synthetic */ int f7061a;

        /* renamed from: d */
        public final /* synthetic */ int f7062d;

        public C1402d(int i, int i2) {
            this.f7061a = i;
            this.f7062d = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            bf0 bf0 = SwipeRefreshLayout.this.f7046s1;
            int i = this.f7061a;
            bf0.setAlpha((int) (((float) i) + (((float) (this.f7062d - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C1403e implements Animation.AnimationListener {
        public C1403e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7030U) {
                swipeRefreshLayout.mo10356s((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C1404f extends Animation {
        public C1404f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7016A1) {
                i = swipeRefreshLayout.f7042q1 - Math.abs(swipeRefreshLayout.f7041p1);
            } else {
                i = swipeRefreshLayout.f7042q1;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f7036e1;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f7049v0.getTop());
            SwipeRefreshLayout.this.f7046s1.mo11578e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C1405g extends Animation {
        public C1405g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo10333k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C1406h extends Animation {
        public C1406h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f7040o1;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo10333k(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1407i {
        /* renamed from: a */
        boolean mo10397a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1408j {
        void onRefresh();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setColorViewAlpha(int i) {
        this.f7049v0.getBackground().setAlpha(i);
        this.f7046s1.setAlpha(i);
    }

    /* renamed from: a */
    public final void mo10312a(int i, Animation.AnimationListener animationListener) {
        this.f7036e1 = i;
        this.f7022E1.reset();
        this.f7022E1.setDuration(200);
        this.f7022E1.setInterpolator(this.f7039k0);
        if (animationListener != null) {
            this.f7049v0.mo28046b(animationListener);
        }
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(this.f7022E1);
    }

    /* renamed from: b */
    public final void mo10313b(int i, Animation.AnimationListener animationListener) {
        if (this.f7030U) {
            mo10378t(i, animationListener);
            return;
        }
        this.f7036e1 = i;
        this.f7023F1.reset();
        this.f7023F1.setDuration(200);
        this.f7023F1.setInterpolator(this.f7039k0);
        if (animationListener != null) {
            this.f7049v0.mo28046b(animationListener);
        }
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(this.f7023F1);
    }

    /* renamed from: c */
    public boolean mo10314c() {
        C1407i iVar = this.f7018B1;
        if (iVar != null) {
            return iVar.mo10397a(this, this.f7031a);
        }
        View view = this.f7031a;
        if (view instanceof ListView) {
            return gi3.m18070a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: d */
    public final void mo10315d() {
        this.f7049v0 = new ye0(getContext());
        bf0 bf0 = new bf0(getContext());
        this.f7046s1 = bf0;
        bf0.mo11588l(1);
        this.f7049v0.setImageDrawable(this.f7046s1);
        this.f7049v0.setVisibility(8);
        addView(this.f7049v0);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f7052x.mo20368a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f7052x.mo20369b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f7052x.mo20370c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f7052x.mo20373f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void mo10320e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f7052x.mo20372e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* renamed from: f */
    public final void mo10321f() {
        if (this.f7031a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f7049v0)) {
                    this.f7031a = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo10322g(float f) {
        if (f > this.f7038k) {
            mo10336n(true, true);
            return;
        }
        this.f7034e = false;
        this.f7046s1.mo11586j(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
        C1403e eVar = null;
        if (!this.f7030U) {
            eVar = new C1403e();
        }
        mo10313b(this.f7025I, eVar);
        this.f7046s1.mo11576d(false);
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f7032b1;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f7045s.mo21726a();
    }

    public int getProgressCircleDiameter() {
        return this.f7056z1;
    }

    public int getProgressViewEndOffset() {
        return this.f7042q1;
    }

    public int getProgressViewStartOffset() {
        return this.f7041p1;
    }

    /* renamed from: h */
    public final boolean mo10328h(Animation animation) {
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    public boolean hasNestedScrollingParent() {
        return this.f7052x.mo20377j();
    }

    /* renamed from: i */
    public boolean mo10330i() {
        return this.f7034e;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f7052x.mo20379l();
    }

    /* renamed from: j */
    public final void mo10332j(float f) {
        this.f7046s1.mo11576d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f7038k));
        float max = (((float) Math.max(((double) min) - 0.4d, Utils.DOUBLE_EPSILON)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f7038k;
        int i = this.f7044r1;
        if (i <= 0) {
            if (this.f7016A1) {
                i = this.f7042q1 - this.f7041p1;
            } else {
                i = this.f7042q1;
            }
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(Utils.FLOAT_EPSILON, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f7041p1 + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f7049v0.getVisibility() != 0) {
            this.f7049v0.setVisibility(0);
        }
        if (!this.f7030U) {
            this.f7049v0.setScaleX(1.0f);
            this.f7049v0.setScaleY(1.0f);
        }
        if (this.f7030U) {
            setAnimationProgress(Math.min(1.0f, f / this.f7038k));
        }
        if (f < this.f7038k) {
            if (this.f7046s1.getAlpha() > 76 && !mo10328h(this.f7050v1)) {
                mo10354r();
            }
        } else if (this.f7046s1.getAlpha() < 255 && !mo10328h(this.f7051w1)) {
            mo10353q();
        }
        this.f7046s1.mo11586j(Utils.FLOAT_EPSILON, Math.min(0.8f, max * 0.8f));
        this.f7046s1.mo11578e(Math.min(1.0f, max));
        this.f7046s1.mo11580g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f7025I);
    }

    /* renamed from: k */
    public void mo10333k(float f) {
        int i = this.f7036e1;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f7041p1 - i)) * f))) - this.f7049v0.getTop());
    }

    /* renamed from: l */
    public final void mo10334l(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7029Q) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f7029Q = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: m */
    public void mo10335m() {
        this.f7049v0.clearAnimation();
        this.f7046s1.stop();
        this.f7049v0.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f7030U) {
            setAnimationProgress(Utils.FLOAT_EPSILON);
        } else {
            setTargetOffsetTopAndBottom(this.f7041p1 - this.f7025I);
        }
        this.f7025I = this.f7049v0.getTop();
    }

    /* renamed from: n */
    public final void mo10336n(boolean z, boolean z2) {
        if (this.f7034e != z) {
            this.f7055y1 = z2;
            mo10321f();
            this.f7034e = z;
            if (z) {
                mo10312a(this.f7025I, this.f7021D1);
            } else {
                mo10356s(this.f7021D1);
            }
        }
    }

    /* renamed from: o */
    public final Animation mo10337o(int i, int i2) {
        C1402d dVar = new C1402d(i, i2);
        dVar.setDuration(300);
        this.f7049v0.mo28046b((Animation.AnimationListener) null);
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(dVar);
        return dVar;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo10335m();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        mo10321f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7035e0 && actionMasked == 0) {
            this.f7035e0 = false;
        }
        if (!isEnabled() || this.f7035e0 || mo10314c() || this.f7034e || this.f7019C) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f7029Q;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    mo10352p(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        mo10334l(motionEvent);
                    }
                }
            }
            this.f7028P = false;
            this.f7029Q = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f7041p1 - this.f7049v0.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f7029Q = pointerId;
            this.f7028P = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f7027M = motionEvent.getY(findPointerIndex2);
        }
        return this.f7028P;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f7031a == null) {
                mo10321f();
            }
            View view = this.f7031a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f7049v0.getMeasuredWidth();
                int measuredHeight2 = this.f7049v0.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f7025I;
                this.f7049v0.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f7031a == null) {
            mo10321f();
        }
        View view = this.f7031a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f7049v0.measure(View.MeasureSpec.makeMeasureSpec(this.f7056z1, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f7056z1, 1073741824));
            this.f7032b1 = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f7049v0) {
                    this.f7032b1 = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            mo10320e(i, i2, i3, i4, this.f7015A, i5, iArr);
            int i7 = i4 - (iArr[1] - i6);
            int i8 = i7 == 0 ? i4 + this.f7015A[1] : i7;
            if (i8 < 0 && !mo10314c()) {
                float abs = this.f7043r + ((float) Math.abs(i8));
                this.f7043r = abs;
                mo10332j(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f7057a);
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f7034e);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7035e0 && actionMasked == 0) {
            this.f7035e0 = false;
        }
        if (!isEnabled() || this.f7035e0 || mo10314c() || this.f7034e || this.f7019C) {
            return false;
        }
        if (actionMasked == 0) {
            this.f7029Q = motionEvent.getPointerId(0);
            this.f7028P = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f7029Q);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f7028P) {
                this.f7028P = false;
                mo10322g((motionEvent.getY(findPointerIndex) - this.f7026L) * 0.5f);
            }
            this.f7029Q = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f7029Q);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            mo10352p(y);
            if (this.f7028P) {
                float f = (y - this.f7026L) * 0.5f;
                if (f <= Utils.FLOAT_EPSILON) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                mo10332j(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f7029Q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mo10334l(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final void mo10352p(float f) {
        float f2 = this.f7027M;
        int i = this.f7037g;
        if (f - f2 > ((float) i) && !this.f7028P) {
            this.f7026L = f2 + ((float) i);
            this.f7028P = true;
            this.f7046s1.setAlpha(76);
        }
    }

    /* renamed from: q */
    public final void mo10353q() {
        this.f7051w1 = mo10337o(this.f7046s1.getAlpha(), 255);
    }

    /* renamed from: r */
    public final void mo10354r() {
        this.f7050v1 = mo10337o(this.f7046s1.getAlpha(), 76);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view = this.f7031a;
        if (view == null || ga7.m17748U(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (!this.f7020C1 && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public void mo10356s(Animation.AnimationListener animationListener) {
        C1401c cVar = new C1401c();
        this.f7048u1 = cVar;
        cVar.setDuration(150);
        this.f7049v0.mo28046b(animationListener);
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(this.f7048u1);
    }

    public void setAnimationProgress(float f) {
        this.f7049v0.setScaleX(f);
        this.f7049v0.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        mo10321f();
        this.f7046s1.mo11579f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = zr0.m31440c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f7038k = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo10335m();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f7020C1 = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f7052x.mo20380m(z);
    }

    public void setOnChildScrollUpCallback(C1407i iVar) {
        this.f7018B1 = iVar;
    }

    public void setOnRefreshListener(C1408j jVar) {
        this.f7033d = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f7049v0.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(zr0.m31440c(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f7042q1 = i;
        this.f7030U = z;
        this.f7049v0.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f7030U = z;
        this.f7041p1 = i;
        this.f7042q1 = i2;
        this.f7016A1 = true;
        mo10335m();
        this.f7034e = false;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f7034e == z) {
            mo10336n(z, false);
            return;
        }
        this.f7034e = z;
        if (!this.f7016A1) {
            i = this.f7042q1 + this.f7041p1;
        } else {
            i = this.f7042q1;
        }
        setTargetOffsetTopAndBottom(i - this.f7025I);
        this.f7055y1 = false;
        mo10379u(this.f7021D1);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f7056z1 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f7056z1 = (int) (displayMetrics.density * 40.0f);
            }
            this.f7049v0.setImageDrawable((Drawable) null);
            this.f7046s1.mo11588l(i);
            this.f7049v0.setImageDrawable(this.f7046s1);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f7044r1 = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f7049v0.bringToFront();
        ga7.m17755a0(this.f7049v0, i);
        this.f7025I = this.f7049v0.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f7052x.mo20382o(i);
    }

    public void stopNestedScroll() {
        this.f7052x.mo20384q();
    }

    /* renamed from: t */
    public final void mo10378t(int i, Animation.AnimationListener animationListener) {
        this.f7036e1 = i;
        this.f7040o1 = this.f7049v0.getScaleX();
        C1406h hVar = new C1406h();
        this.f7053x1 = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f7049v0.mo28046b(animationListener);
        }
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(this.f7053x1);
    }

    /* renamed from: u */
    public final void mo10379u(Animation.AnimationListener animationListener) {
        this.f7049v0.setVisibility(0);
        this.f7046s1.setAlpha(255);
        C1400b bVar = new C1400b();
        this.f7047t1 = bVar;
        bVar.setDuration((long) this.f7024H);
        if (animationListener != null) {
            this.f7049v0.mo28046b(animationListener);
        }
        this.f7049v0.clearAnimation();
        this.f7049v0.startAnimation(this.f7047t1);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1398a();

        /* renamed from: a */
        public final boolean f7057a;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        public class C1398a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f7057a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f7057a ? (byte) 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7057a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7034e = false;
        this.f7038k = -1.0f;
        this.f7054y = new int[2];
        this.f7015A = new int[2];
        this.f7017B = new int[2];
        this.f7029Q = -1;
        this.f7032b1 = -1;
        this.f7021D1 = new C1399a();
        this.f7022E1 = new C1404f();
        this.f7023F1 = new C1405g();
        this.f7037g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7024H = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f7039k0 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f7056z1 = (int) (displayMetrics.density * 40.0f);
        mo10315d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f7042q1 = i;
        this.f7038k = (float) i;
        this.f7045s = new j54(this);
        this.f7052x = new g54(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f7056z1;
        this.f7025I = i2;
        this.f7041p1 = i2;
        mo10333k(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7014H1);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f7043r;
            if (f > Utils.FLOAT_EPSILON) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f7043r = Utils.FLOAT_EPSILON;
                } else {
                    this.f7043r = f - f2;
                    iArr[1] = i2;
                }
                mo10332j(this.f7043r);
            }
        }
        if (this.f7016A1 && i2 > 0 && this.f7043r == Utils.FLOAT_EPSILON && Math.abs(i2 - iArr[1]) > 0) {
            this.f7049v0.setVisibility(8);
        }
        int[] iArr2 = this.f7054y;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f7045s.mo21727b(view, view2, i);
        startNestedScroll(i & 2);
        this.f7043r = Utils.FLOAT_EPSILON;
        this.f7019C = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f7035e0 && !this.f7034e && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f7045s.mo21729d(view);
        this.f7019C = false;
        float f = this.f7043r;
        if (f > Utils.FLOAT_EPSILON) {
            mo10322g(f);
            this.f7043r = Utils.FLOAT_EPSILON;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i, i2, i3, i4, i5, this.f7017B);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScroll(view, i, i2, i3, i4, 0, this.f7017B);
    }
}
