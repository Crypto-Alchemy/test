package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import p000.bc7;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: A */
    public int f6945A;

    /* renamed from: B */
    public boolean f6946B;

    /* renamed from: C */
    public int f6947C;

    /* renamed from: H */
    public float f6948H;

    /* renamed from: I */
    public float f6949I;

    /* renamed from: L */
    public C1387d f6950L;

    /* renamed from: M */
    public final bc7 f6951M;

    /* renamed from: P */
    public boolean f6952P;

    /* renamed from: Q */
    public boolean f6953Q;

    /* renamed from: U */
    public final Rect f6954U;

    /* renamed from: a */
    public int f6955a;

    /* renamed from: d */
    public int f6956d;

    /* renamed from: e */
    public Drawable f6957e;

    /* renamed from: e0 */
    public final ArrayList<C1385b> f6958e0;

    /* renamed from: g */
    public Drawable f6959g;

    /* renamed from: k */
    public final int f6960k;

    /* renamed from: r */
    public boolean f6961r;

    /* renamed from: s */
    public View f6962s;

    /* renamed from: x */
    public float f6963x;

    /* renamed from: y */
    public float f6964y;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1383a();

        /* renamed from: e */
        public boolean f6970e;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$a */
        public static class C1383a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f6970e ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6970e = parcel.readInt() != 0;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C1384a extends C3715z7 {

        /* renamed from: d */
        public final Rect f6971d = new Rect();

        public C1384a() {
        }

        /* renamed from: f */
        public void mo5478f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo5478f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: g */
        public void mo5479g(View view, C3335t8 t8Var) {
            C3335t8 S = C3335t8.m27494S(t8Var);
            super.mo5479g(view, S);
            mo10265n(t8Var, S);
            S.mo26222V();
            t8Var.mo26239f0(SlidingPaneLayout.class.getName());
            t8Var.mo26205J0(view);
            ViewParent H = ga7.m17727H(view);
            if (H instanceof View) {
                t8Var.mo26187A0((View) H);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo10266o(childAt) && childAt.getVisibility() == 0) {
                    ga7.m17714A0(childAt, 1);
                    t8Var.mo26231c(childAt);
                }
            }
        }

        /* renamed from: i */
        public boolean mo5575i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo10266o(view)) {
                return super.mo5575i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo10265n(C3335t8 t8Var, C3335t8 t8Var2) {
            Rect rect = this.f6971d;
            t8Var2.mo26252m(rect);
            t8Var.mo26228a0(rect);
            t8Var2.mo26254n(rect);
            t8Var.mo26230b0(rect);
            t8Var.mo26219Q0(t8Var2.mo26218Q());
            t8Var.mo26277y0(t8Var2.mo26272w());
            t8Var.mo26239f0(t8Var2.mo26258p());
            t8Var.mo26247j0(t8Var2.mo26261r());
            t8Var.mo26255n0(t8Var2.mo26202I());
            t8Var.mo26241g0(t8Var2.mo26200H());
            t8Var.mo26259p0(t8Var2.mo26204J());
            t8Var.mo26260q0(t8Var2.mo26206K());
            t8Var.mo26225Y(t8Var2.mo26194E());
            t8Var.mo26201H0(t8Var2.mo26214O());
            t8Var.mo26271v0(t8Var2.mo26208L());
            t8Var.mo26227a(t8Var2.mo26248k());
            t8Var.mo26275x0(t8Var2.mo26268u());
        }

        /* renamed from: o */
        public boolean mo10266o(View view) {
            return SlidingPaneLayout.this.mo10228h(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C1385b implements Runnable {

        /* renamed from: a */
        public final View f6973a;

        public C1385b(View view) {
            this.f6973a = view;
        }

        public void run() {
            if (this.f6973a.getParent() == SlidingPaneLayout.this) {
                this.f6973a.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.mo10221g(this.f6973a);
            }
            SlidingPaneLayout.this.f6958e0.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C1386c extends bc7.C1622c {
        public C1386c() {
        }

        /* renamed from: a */
        public int mo5582a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f6962s.getLayoutParams();
            if (SlidingPaneLayout.this.mo10229i()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f6962s.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f6945A);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f6945A + paddingLeft);
        }

        /* renamed from: b */
        public int mo5583b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo5584d(View view) {
            return SlidingPaneLayout.this.f6945A;
        }

        /* renamed from: f */
        public void mo5585f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f6951M.mo11508c(slidingPaneLayout.f6962s, i2);
        }

        /* renamed from: i */
        public void mo5588i(View view, int i) {
            SlidingPaneLayout.this.mo10245p();
        }

        /* renamed from: j */
        public void mo5589j(int i) {
            if (SlidingPaneLayout.this.f6951M.mo11488B() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f6963x == Utils.FLOAT_EPSILON) {
                    slidingPaneLayout.mo10247r(slidingPaneLayout.f6962s);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.mo10216d(slidingPaneLayout2.f6962s);
                    SlidingPaneLayout.this.f6952P = false;
                    return;
                }
                slidingPaneLayout.mo10219e(slidingPaneLayout.f6962s);
                SlidingPaneLayout.this.f6952P = true;
            }
        }

        /* renamed from: k */
        public void mo5590k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo10232l(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo5591l(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo10229i()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < Utils.FLOAT_EPSILON || (f == Utils.FLOAT_EPSILON && SlidingPaneLayout.this.f6963x > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f6945A;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f6962s.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f6963x > 0.5f)) {
                    i += SlidingPaneLayout.this.f6945A;
                }
            }
            SlidingPaneLayout.this.f6951M.mo11502P(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo5592m(View view, int i) {
            if (SlidingPaneLayout.this.f6946B) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f6967b;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C1387d {
        /* renamed from: a */
        void mo10268a(View view);

        /* renamed from: b */
        void mo10269b(View view);

        /* renamed from: c */
        void mo10270c(View view, float f);
    }

    public SlidingPaneLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: s */
    public static boolean m9872s(View view) {
        if (view.isOpaque()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo10211a() {
        return mo10212b(this.f6962s, 0);
    }

    /* renamed from: b */
    public final boolean mo10212b(View view, int i) {
        if (!this.f6953Q && !mo10246q(Utils.FLOAT_EPSILON, i)) {
            return false;
        }
        this.f6952P = false;
        return true;
    }

    /* renamed from: c */
    public final void mo10213c(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > Utils.FLOAT_EPSILON && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & 16777215);
            if (layoutParams.f6969d == null) {
                layoutParams.f6969d = new Paint();
            }
            layoutParams.f6969d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f6969d);
            }
            mo10221g(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f6969d;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            C1385b bVar = new C1385b(view);
            this.f6958e0.add(bVar);
            ga7.m17769h0(this, bVar);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public void computeScroll() {
        if (!this.f6951M.mo11519n(true)) {
            return;
        }
        if (!this.f6961r) {
            this.f6951M.mo11506a();
        } else {
            ga7.m17767g0(this);
        }
    }

    /* renamed from: d */
    public void mo10216d(View view) {
        C1387d dVar = this.f6950L;
        if (dVar != null) {
            dVar.mo10269b(view);
        }
        sendAccessibilityEvent(32);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (mo10229i()) {
            drawable = this.f6959g;
        } else {
            drawable = this.f6957e;
        }
        if (getChildCount() > 1) {
            view = getChildAt(1);
        } else {
            view = null;
        }
        if (view != null && drawable != null) {
            int top = view.getTop();
            int bottom = view.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo10229i()) {
                i2 = view.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = view.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f6961r && !layoutParams.f6967b && this.f6962s != null) {
            canvas.getClipBounds(this.f6954U);
            if (mo10229i()) {
                Rect rect = this.f6954U;
                rect.left = Math.max(rect.left, this.f6962s.getRight());
            } else {
                Rect rect2 = this.f6954U;
                rect2.right = Math.min(rect2.right, this.f6962s.getLeft());
            }
            canvas.clipRect(this.f6954U);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public void mo10219e(View view) {
        C1387d dVar = this.f6950L;
        if (dVar != null) {
            dVar.mo10268a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: f */
    public void mo10220f(View view) {
        C1387d dVar = this.f6950L;
        if (dVar != null) {
            dVar.mo10270c(view, this.f6963x);
        }
    }

    /* renamed from: g */
    public void mo10221g(View view) {
        ga7.m17718C0(view, ((LayoutParams) view.getLayoutParams()).f6969d);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f6956d;
    }

    public int getParallaxDistance() {
        return this.f6947C;
    }

    public int getSliderFadeColor() {
        return this.f6955a;
    }

    /* renamed from: h */
    public boolean mo10228h(View view) {
        if (view == null) {
            return false;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!this.f6961r || !layoutParams.f6968c || this.f6963x <= Utils.FLOAT_EPSILON) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo10229i() {
        if (ga7.m17715B(this) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo10230j() {
        if (!this.f6961r || this.f6963x == 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo10231k() {
        return this.f6961r;
    }

    /* renamed from: l */
    public void mo10232l(int i) {
        int i2;
        int i3;
        if (this.f6962s == null) {
            this.f6963x = Utils.FLOAT_EPSILON;
            return;
        }
        boolean i4 = mo10229i();
        LayoutParams layoutParams = (LayoutParams) this.f6962s.getLayoutParams();
        int width = this.f6962s.getWidth();
        if (i4) {
            i = (getWidth() - i) - width;
        }
        if (i4) {
            i2 = getPaddingRight();
        } else {
            i2 = getPaddingLeft();
        }
        if (i4) {
            i3 = layoutParams.rightMargin;
        } else {
            i3 = layoutParams.leftMargin;
        }
        float f = ((float) (i - (i2 + i3))) / ((float) this.f6945A);
        this.f6963x = f;
        if (this.f6947C != 0) {
            mo10235o(f);
        }
        if (layoutParams.f6968c) {
            mo10213c(this.f6962s, this.f6963x, this.f6955a);
        }
        mo10220f(this.f6962s);
    }

    /* renamed from: m */
    public boolean mo10233m() {
        return mo10234n(this.f6962s, 0);
    }

    /* renamed from: n */
    public final boolean mo10234n(View view, int i) {
        if (!this.f6953Q && !mo10246q(1.0f, i)) {
            return false;
        }
        this.f6952P = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10235o(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo10229i()
            android.view.View r1 = r9.f6962s
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f6968c
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0057
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f6962s
            if (r4 != r5) goto L_0x002c
            goto L_0x0054
        L_0x002c:
            float r5 = r9.f6964y
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f6947C
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f6964y = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0042
            int r5 = -r5
        L_0x0042:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0054
            float r5 = r9.f6964y
            if (r0 == 0) goto L_0x004d
            float r5 = r5 - r6
            goto L_0x004f
        L_0x004d:
            float r5 = r6 - r5
        L_0x004f:
            int r6 = r9.f6956d
            r9.mo10213c(r4, r5, r6)
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.mo10235o(float):void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6953Q = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6953Q = true;
        int size = this.f6958e0.size();
        for (int i = 0; i < size; i++) {
            this.f6958e0.get(i).run();
        }
        this.f6958e0.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f6961r && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f6952P = !this.f6951M.mo11492F(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f6961r || (this.f6946B && actionMasked != 0)) {
            this.f6951M.mo11507b();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f6951M.mo11507b();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f6946B = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f6948H = x;
                this.f6949I = y;
                if (this.f6951M.mo11492F(this.f6962s, (int) x, (int) y) && mo10228h(this.f6962s)) {
                    z = true;
                    if (this.f6951M.mo11503Q(motionEvent) && !z) {
                        return false;
                    }
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f6948H);
                float abs2 = Math.abs(y2 - this.f6949I);
                if (abs > ((float) this.f6951M.mo11487A()) && abs2 > abs) {
                    this.f6951M.mo11507b();
                    this.f6946B = true;
                    return false;
                }
            }
            z = false;
            return this.f6951M.mo11503Q(motionEvent) ? true : true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z2;
        float f;
        boolean i12 = mo10229i();
        if (i12) {
            this.f6951M.mo11500N(2);
        } else {
            this.f6951M.mo11500N(1);
        }
        int i13 = i3 - i;
        if (i12) {
            i5 = getPaddingRight();
        } else {
            i5 = getPaddingLeft();
        }
        if (i12) {
            i6 = getPaddingLeft();
        } else {
            i6 = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f6953Q) {
            if (!this.f6961r || !this.f6952P) {
                f = Utils.FLOAT_EPSILON;
            } else {
                f = 1.0f;
            }
            this.f6963x = f;
        }
        int i14 = i5;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f6967b) {
                    int i16 = i13 - i6;
                    int min = (Math.min(i5, i16 - this.f6960k) - i14) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f6945A = min;
                    if (i12) {
                        i11 = layoutParams.rightMargin;
                    } else {
                        i11 = layoutParams.leftMargin;
                    }
                    if (i14 + i11 + min + (measuredWidth / 2) > i16) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    layoutParams.f6968c = z2;
                    int i17 = (int) (((float) min) * this.f6963x);
                    i14 += i11 + i17;
                    this.f6963x = ((float) i17) / ((float) min);
                    i7 = 0;
                } else if (!this.f6961r || (i10 = this.f6947C) == 0) {
                    i14 = i5;
                    i7 = 0;
                } else {
                    i7 = (int) ((1.0f - this.f6963x) * ((float) i10));
                    i14 = i5;
                }
                if (i12) {
                    i8 = (i13 - i14) + i7;
                    i9 = i8 - measuredWidth;
                } else {
                    i9 = i14 - i7;
                    i8 = i9 + measuredWidth;
                }
                childAt.layout(i9, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                i5 += childAt.getWidth();
            }
        }
        if (this.f6953Q) {
            if (this.f6961r) {
                if (this.f6947C != 0) {
                    mo10235o(this.f6963x);
                }
                if (((LayoutParams) this.f6962s.getLayoutParams()).f6968c) {
                    mo10213c(this.f6962s, this.f6963x, this.f6955a);
                }
            } else {
                for (int i18 = 0; i18 < childCount; i18++) {
                    mo10213c(getChildAt(i18), Utils.FLOAT_EPSILON, this.f6955a);
                }
            }
            mo10247r(this.f6962s);
        }
        this.f6953Q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x002f
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0027
            if (r1 != r6) goto L_0x0023
            goto L_0x0044
        L_0x0023:
            if (r1 != 0) goto L_0x0044
            r2 = r5
            goto L_0x0044
        L_0x0027:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x002f:
            if (r3 != 0) goto L_0x0044
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003c
            if (r3 != 0) goto L_0x0044
            r4 = r5
            r3 = r6
            goto L_0x0044
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            r1 = 0
            if (r3 == r6) goto L_0x0057
            if (r3 == r7) goto L_0x004c
            r4 = r1
        L_0x004a:
            r5 = r4
            goto L_0x0063
        L_0x004c:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            goto L_0x004a
        L_0x0057:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = r1
        L_0x0063:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 0
            r0.f6962s = r10
            r11 = r1
            r12 = r11
            r14 = r8
            r13 = 0
        L_0x0079:
            r15 = 8
            r16 = 1
            if (r11 >= r9) goto L_0x0118
            android.view.View r6 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r17 = r6.getLayoutParams()
            r7 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0095
            r7.f6968c = r1
            goto L_0x010f
        L_0x0095:
            float r10 = r7.f6966a
            r15 = 0
            int r18 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x00a3
            float r13 = r13 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00a3
            goto L_0x010f
        L_0x00a3:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00bb
            int r10 = r8 - r10
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r22 = r13
            r13 = r15
            r1 = -1
        L_0x00b9:
            r15 = r10
            goto L_0x00d1
        L_0x00bb:
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto L_0x00cb
            int r10 = r8 - r10
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            goto L_0x00b9
        L_0x00cb:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00d1:
            int r10 = r7.height
            r1 = -2
            if (r10 != r1) goto L_0x00db
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            goto L_0x00ec
        L_0x00db:
            r1 = -1
            if (r10 != r1) goto L_0x00e5
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L_0x00eb
        L_0x00e5:
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
        L_0x00eb:
            r1 = r10
        L_0x00ec:
            r6.measure(r15, r1)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            if (r3 != r13) goto L_0x00ff
            if (r10 <= r4) goto L_0x00ff
            int r4 = java.lang.Math.min(r10, r5)
        L_0x00ff:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x0105
            r1 = r16
            goto L_0x0106
        L_0x0105:
            r1 = 0
        L_0x0106:
            r7.f6967b = r1
            r12 = r12 | r1
            if (r1 == 0) goto L_0x010d
            r0.f6962s = r6
        L_0x010d:
            r13 = r22
        L_0x010f:
            int r11 = r11 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0079
        L_0x0118:
            if (r12 != 0) goto L_0x011f
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x020c
        L_0x011f:
            int r1 = r0.f6960k
            int r1 = r8 - r1
            r3 = 0
        L_0x0124:
            if (r3 >= r9) goto L_0x020c
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 != r15) goto L_0x0137
        L_0x0130:
            r19 = r1
        L_0x0132:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0204
        L_0x0137:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0144
            goto L_0x0130
        L_0x0144:
            int r10 = r7.width
            if (r10 != 0) goto L_0x0152
            float r10 = r7.f6966a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0152
            r10 = r16
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            if (r10 == 0) goto L_0x0157
            r11 = 0
            goto L_0x015b
        L_0x0157:
            int r11 = r6.getMeasuredWidth()
        L_0x015b:
            if (r12 == 0) goto L_0x01a1
            android.view.View r15 = r0.f6962s
            if (r6 == r15) goto L_0x01a1
            int r15 = r7.width
            if (r15 >= 0) goto L_0x0130
            if (r11 > r1) goto L_0x016e
            float r11 = r7.f6966a
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x0130
        L_0x016e:
            if (r10 == 0) goto L_0x018f
            int r7 = r7.height
            r10 = -2
            if (r7 != r10) goto L_0x017e
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x0199
        L_0x017e:
            r10 = -1
            if (r7 != r10) goto L_0x0188
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x0199
        L_0x0188:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            goto L_0x0199
        L_0x018f:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
        L_0x0199:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r6.measure(r11, r7)
            goto L_0x0130
        L_0x01a1:
            float r10 = r7.f6966a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0130
            int r10 = r7.width
            if (r10 != 0) goto L_0x01cb
            int r10 = r7.height
            r15 = -2
            if (r10 != r15) goto L_0x01ba
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d5
        L_0x01ba:
            r15 = -1
            if (r10 != r15) goto L_0x01c4
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            goto L_0x01d5
        L_0x01c4:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            goto L_0x01d5
        L_0x01cb:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = r6.getMeasuredHeight()
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x01d5:
            if (r12 == 0) goto L_0x01ed
            int r15 = r7.leftMargin
            int r7 = r7.rightMargin
            int r15 = r15 + r7
            int r7 = r8 - r15
            r19 = r1
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            if (r11 == r7) goto L_0x0132
            r6.measure(r1, r10)
            goto L_0x0132
        L_0x01ed:
            r19 = r1
            r1 = 0
            int r15 = java.lang.Math.max(r1, r14)
            float r7 = r7.f6966a
            float r15 = (float) r15
            float r7 = r7 * r15
            float r7 = r7 / r13
            int r7 = (int) r7
            int r11 = r11 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r7)
            r6.measure(r11, r10)
        L_0x0204:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x0124
        L_0x020c:
            int r1 = r20.getPaddingTop()
            int r4 = r4 + r1
            int r1 = r20.getPaddingBottom()
            int r4 = r4 + r1
            r0.setMeasuredDimension(r2, r4)
            r0.f6961r = r12
            bc7 r1 = r0.f6951M
            int r1 = r1.mo11488B()
            if (r1 == 0) goto L_0x022a
            if (r12 != 0) goto L_0x022a
            bc7 r1 = r0.f6951M
            r1.mo11506a()
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo5481a());
        if (savedState.f6970e) {
            mo10233m();
        } else {
            mo10211a();
        }
        this.f6952P = savedState.f6970e;
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (mo10231k()) {
            z = mo10230j();
        } else {
            z = this.f6952P;
        }
        savedState.f6970e = z;
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f6953Q = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6961r) {
            return super.onTouchEvent(motionEvent);
        }
        this.f6951M.mo11493G(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f6948H = x;
            this.f6949I = y;
        } else if (actionMasked == 1 && mo10228h(this.f6962s)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f6948H;
            float f2 = y2 - this.f6949I;
            int A = this.f6951M.mo11487A();
            if ((f * f) + (f2 * f2) < ((float) (A * A)) && this.f6951M.mo11492F(this.f6962s, (int) x2, (int) y2)) {
                mo10212b(this.f6962s, 0);
            }
        }
        return true;
    }

    /* renamed from: p */
    public void mo10245p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* renamed from: q */
    public boolean mo10246q(float f, int i) {
        int i2;
        if (!this.f6961r) {
            return false;
        }
        boolean i3 = mo10229i();
        LayoutParams layoutParams = (LayoutParams) this.f6962s.getLayoutParams();
        if (i3) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f6945A))) + ((float) this.f6962s.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f6945A)));
        }
        bc7 bc7 = this.f6951M;
        View view = this.f6962s;
        if (!bc7.mo11504R(view, i2, view.getTop())) {
            return false;
        }
        mo10245p();
        ga7.m17767g0(this);
        return true;
    }

    /* renamed from: r */
    public void mo10247r(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View childAt;
        boolean z;
        int i7;
        int i8;
        int i9;
        View view2 = view;
        boolean i10 = mo10229i();
        if (i10) {
            i = getWidth() - getPaddingRight();
        } else {
            i = getPaddingLeft();
        }
        if (i10) {
            i2 = getPaddingLeft();
        } else {
            i2 = getWidth() - getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m9872s(view)) {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i6 = view.getLeft();
            i5 = view.getRight();
            i4 = view.getTop();
            i3 = view.getBottom();
        }
        int childCount = getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 < childCount && (childAt = getChildAt(i11)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = i10;
                } else {
                    if (i10) {
                        i7 = i2;
                    } else {
                        i7 = i;
                    }
                    int max = Math.max(i7, childAt.getLeft());
                    int max2 = Math.max(paddingTop, childAt.getTop());
                    z = i10;
                    if (i10) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    int min = Math.min(i8, childAt.getRight());
                    int min2 = Math.min(height, childAt.getBottom());
                    if (max < i6 || max2 < i4 || min > i5 || min2 > i3) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    childAt.setVisibility(i9);
                }
                i11++;
                view2 = view;
                i10 = z;
            } else {
                return;
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        boolean z;
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f6961r) {
            if (view == this.f6962s) {
                z = true;
            } else {
                z = false;
            }
            this.f6952P = z;
        }
    }

    public void setCoveredFadeColor(int i) {
        this.f6956d = i;
    }

    public void setPanelSlideListener(C1387d dVar) {
        this.f6950L = dVar;
    }

    public void setParallaxDistance(int i) {
        this.f6947C = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f6957e = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f6959g = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(zr0.m31442e(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(zr0.m31442e(getContext(), i));
    }

    public void setSliderFadeColor(int i) {
        this.f6955a = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        public static final int[] f6965e = {16843137};

        /* renamed from: a */
        public float f6966a = Utils.FLOAT_EPSILON;

        /* renamed from: b */
        public boolean f6967b;

        /* renamed from: c */
        public boolean f6968c;

        /* renamed from: d */
        public Paint f6969d;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6965e);
            this.f6966a = obtainStyledAttributes.getFloat(0, Utils.FLOAT_EPSILON);
            obtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6955a = -858993460;
        this.f6953Q = true;
        this.f6954U = new Rect();
        this.f6958e0 = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f6960k = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        ga7.m17785p0(this, new C1384a());
        ga7.m17714A0(this, 1);
        bc7 o = bc7.m11209o(this, 0.5f, new C1386c());
        this.f6951M = o;
        o.mo11501O(f * 400.0f);
    }
}
