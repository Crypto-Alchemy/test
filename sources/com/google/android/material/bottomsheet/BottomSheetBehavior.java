package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.github.mikephil.charting.utils.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.C3335t8;
import p000.C3658y8;
import p000.bc7;
import p000.pe7;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: Y */
    public static final int f23453Y = e55.Widget_Design_BottomSheet_Modal;

    /* renamed from: A */
    public float f23454A = 0.5f;

    /* renamed from: B */
    public int f23455B;

    /* renamed from: C */
    public float f23456C = -1.0f;

    /* renamed from: D */
    public boolean f23457D;

    /* renamed from: E */
    public boolean f23458E;

    /* renamed from: F */
    public boolean f23459F = true;

    /* renamed from: G */
    public int f23460G = 4;

    /* renamed from: H */
    public bc7 f23461H;

    /* renamed from: I */
    public boolean f23462I;

    /* renamed from: J */
    public int f23463J;

    /* renamed from: K */
    public boolean f23464K;

    /* renamed from: L */
    public int f23465L;

    /* renamed from: M */
    public int f23466M;

    /* renamed from: N */
    public int f23467N;

    /* renamed from: O */
    public WeakReference<V> f23468O;

    /* renamed from: P */
    public WeakReference<View> f23469P;

    /* renamed from: Q */
    public final ArrayList<C4212g> f23470Q = new ArrayList<>();

    /* renamed from: R */
    public VelocityTracker f23471R;

    /* renamed from: S */
    public int f23472S;

    /* renamed from: T */
    public int f23473T;

    /* renamed from: U */
    public boolean f23474U;

    /* renamed from: V */
    public Map<View, Integer> f23475V;

    /* renamed from: W */
    public int f23476W = -1;

    /* renamed from: X */
    public final bc7.C1622c f23477X = new C4210e();

    /* renamed from: a */
    public int f23478a = 0;

    /* renamed from: b */
    public boolean f23479b = true;

    /* renamed from: c */
    public boolean f23480c = false;

    /* renamed from: d */
    public float f23481d;

    /* renamed from: e */
    public int f23482e;

    /* renamed from: f */
    public boolean f23483f;

    /* renamed from: g */
    public int f23484g;

    /* renamed from: h */
    public int f23485h;

    /* renamed from: i */
    public boolean f23486i;

    /* renamed from: j */
    public uo3 f23487j;

    /* renamed from: k */
    public int f23488k = -1;

    /* renamed from: l */
    public int f23489l;

    /* renamed from: m */
    public boolean f23490m;

    /* renamed from: n */
    public boolean f23491n;

    /* renamed from: o */
    public boolean f23492o;

    /* renamed from: p */
    public boolean f23493p;

    /* renamed from: q */
    public boolean f23494q;

    /* renamed from: r */
    public int f23495r;

    /* renamed from: s */
    public int f23496s;

    /* renamed from: t */
    public rz5 f23497t;

    /* renamed from: u */
    public boolean f23498u;

    /* renamed from: v */
    public BottomSheetBehavior<V>.C7152h f23499v = null;

    /* renamed from: w */
    public ValueAnimator f23500w;

    /* renamed from: x */
    public int f23501x;

    /* renamed from: y */
    public int f23502y;

    /* renamed from: z */
    public int f23503z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C4206a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f23509a;

        /* renamed from: d */
        public final /* synthetic */ ViewGroup.LayoutParams f23510d;

        public C4206a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f23509a = view;
            this.f23510d = layoutParams;
        }

        public void run() {
            this.f23509a.setLayoutParams(this.f23510d);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C4207b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ View f23512a;

        /* renamed from: d */
        public final /* synthetic */ int f23513d;

        public C4207b(View view, int i) {
            this.f23512a = view;
            this.f23513d = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo31879Y(this.f23512a, this.f23513d);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C4208c implements ValueAnimator.AnimatorUpdateListener {
        public C4208c() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f23487j != null) {
                BottomSheetBehavior.this.f23487j.mo48441b0(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C4209d implements pe7.C6355e {

        /* renamed from: a */
        public final /* synthetic */ boolean f23516a;

        public C4209d(boolean z) {
            this.f23516a = z;
        }

        /* renamed from: a */
        public hl7 mo31828a(View view, hl7 hl7, pe7.C6356f fVar) {
            int i;
            int i2;
            int unused = BottomSheetBehavior.this.f23496s = hl7.mo21240m();
            boolean h = pe7.m49902h(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f23491n) {
                int unused2 = BottomSheetBehavior.this.f23495r = hl7.mo21237j();
                paddingBottom = fVar.f32687d + BottomSheetBehavior.this.f23495r;
            }
            if (BottomSheetBehavior.this.f23492o) {
                if (h) {
                    i2 = fVar.f32686c;
                } else {
                    i2 = fVar.f32684a;
                }
                paddingLeft = i2 + hl7.mo21238k();
            }
            if (BottomSheetBehavior.this.f23493p) {
                if (h) {
                    i = fVar.f32684a;
                } else {
                    i = fVar.f32686c;
                }
                paddingRight = i + hl7.mo21239l();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f23516a) {
                int unused3 = BottomSheetBehavior.this.f23489l = hl7.mo21233g().f17077d;
            }
            if (BottomSheetBehavior.this.f23491n || this.f23516a) {
                BottomSheetBehavior.this.mo31886f0(false);
            }
            return hl7;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C4210e extends bc7.C1622c {
        public C4210e() {
        }

        /* renamed from: a */
        public int mo5582a(View view, int i, int i2) {
            return view.getLeft();
        }

        /* renamed from: b */
        public int mo5583b(View view, int i, int i2) {
            int i3;
            int z = BottomSheetBehavior.this.mo31898z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f23457D) {
                i3 = bottomSheetBehavior.f23467N;
            } else {
                i3 = bottomSheetBehavior.f23455B;
            }
            return ep3.m16274b(i, z, i3);
        }

        /* renamed from: e */
        public int mo11533e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f23457D) {
                return bottomSheetBehavior.f23467N;
            }
            return bottomSheetBehavior.f23455B;
        }

        /* renamed from: j */
        public void mo5589j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f23459F) {
                BottomSheetBehavior.this.mo31877W(1);
            }
        }

        /* renamed from: k */
        public void mo5590k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo31896w(i2);
        }

        /* renamed from: l */
        public void mo5591l(View view, float f, float f2) {
            int i;
            int i2;
            int i3 = 4;
            if (f2 >= Utils.FLOAT_EPSILON) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.f23457D || !bottomSheetBehavior.mo31881a0(view, f2)) {
                    if (f2 == Utils.FLOAT_EPSILON || Math.abs(f) > Math.abs(f2)) {
                        int top = view.getTop();
                        if (!BottomSheetBehavior.this.f23479b) {
                            BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                            int i4 = bottomSheetBehavior2.f23503z;
                            if (top < i4) {
                                if (top < Math.abs(top - bottomSheetBehavior2.f23455B)) {
                                    i = BottomSheetBehavior.this.mo31898z();
                                } else {
                                    i2 = BottomSheetBehavior.this.f23503z;
                                }
                            } else if (Math.abs(top - i4) < Math.abs(top - BottomSheetBehavior.this.f23455B)) {
                                i2 = BottomSheetBehavior.this.f23503z;
                            } else {
                                i = BottomSheetBehavior.this.f23455B;
                                BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                            }
                            i3 = 6;
                            BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                        } else if (Math.abs(top - BottomSheetBehavior.this.f23502y) < Math.abs(top - BottomSheetBehavior.this.f23455B)) {
                            i = BottomSheetBehavior.this.f23502y;
                        } else {
                            i = BottomSheetBehavior.this.f23455B;
                            BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                        }
                    } else {
                        if (BottomSheetBehavior.this.f23479b) {
                            i = BottomSheetBehavior.this.f23455B;
                        } else {
                            int top2 = view.getTop();
                            if (Math.abs(top2 - BottomSheetBehavior.this.f23503z) < Math.abs(top2 - BottomSheetBehavior.this.f23455B)) {
                                i2 = BottomSheetBehavior.this.f23503z;
                                i3 = 6;
                            } else {
                                i = BottomSheetBehavior.this.f23455B;
                            }
                        }
                        BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                    }
                } else if ((Math.abs(f) < Math.abs(f2) && f2 > 500.0f) || mo31908n(view)) {
                    i = BottomSheetBehavior.this.f23467N;
                    i3 = 5;
                    BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                } else if (BottomSheetBehavior.this.f23479b) {
                    i = BottomSheetBehavior.this.f23502y;
                } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.mo31898z()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f23503z)) {
                    i = BottomSheetBehavior.this.mo31898z();
                } else {
                    i2 = BottomSheetBehavior.this.f23503z;
                    i3 = 6;
                    BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                }
            } else if (BottomSheetBehavior.this.f23479b) {
                i = BottomSheetBehavior.this.f23502y;
            } else {
                int top3 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior3.f23503z;
                if (top3 > i5) {
                    i2 = i5;
                    i3 = 6;
                    BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
                }
                i = bottomSheetBehavior3.mo31898z();
            }
            i3 = 3;
            BottomSheetBehavior.this.mo31882b0(view, i3, i, true);
        }

        /* renamed from: m */
        public boolean mo5592m(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f23460G;
            if (i2 == 1 || bottomSheetBehavior.f23474U) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f23472S == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f23469P;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f23468O;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }

        /* renamed from: n */
        public final boolean mo31908n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.f23467N + bottomSheetBehavior.mo31898z()) / 2) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public class C4211f implements C3658y8 {

        /* renamed from: a */
        public final /* synthetic */ int f23519a;

        public C4211f(int i) {
            this.f23519a = i;
        }

        /* renamed from: a */
        public boolean mo5572a(View view, C3658y8.C3659a aVar) {
            BottomSheetBehavior.this.mo31876V(this.f23519a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public static abstract class C4212g {
        /* renamed from: a */
        public abstract void mo31909a(View view, float f);

        /* renamed from: b */
        public abstract void mo31910b(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    public class C4213h implements Runnable {

        /* renamed from: a */
        public final View f23521a;

        /* renamed from: d */
        public boolean f23522d;

        /* renamed from: e */
        public int f23523e;

        public C4213h(View view, int i) {
            this.f23521a = view;
            this.f23523e = i;
        }

        public void run() {
            bc7 bc7 = BottomSheetBehavior.this.f23461H;
            if (bc7 == null || !bc7.mo11519n(true)) {
                BottomSheetBehavior.this.mo31877W(this.f23523e);
            } else {
                ga7.m17769h0(this.f23521a, this);
            }
            this.f23522d = false;
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: y */
    public static <V extends View> BottomSheetBehavior<V> m34816y(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0546e) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0546e) layoutParams).mo5294f();
            if (f instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: A */
    public uo3 mo31855A() {
        return this.f23487j;
    }

    /* renamed from: B */
    public int mo31856B() {
        if (this.f23483f) {
            return -1;
        }
        return this.f23482e;
    }

    /* renamed from: C */
    public int mo31857C() {
        return this.f23460G;
    }

    /* renamed from: D */
    public final float mo31858D() {
        VelocityTracker velocityTracker = this.f23471R;
        if (velocityTracker == null) {
            return Utils.FLOAT_EPSILON;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f23481d);
        return this.f23471R.getYVelocity(this.f23472S);
    }

    /* renamed from: E */
    public boolean mo31859E() {
        return this.f23490m;
    }

    /* renamed from: F */
    public boolean mo31860F() {
        return this.f23457D;
    }

    /* renamed from: G */
    public void mo31861G(C4212g gVar) {
        this.f23470Q.remove(gVar);
    }

    /* renamed from: H */
    public final void mo31862H(V v, C3335t8.C3336a aVar, int i) {
        ga7.m17777l0(v, aVar, (CharSequence) null, mo31892s(i));
    }

    /* renamed from: I */
    public final void mo31863I() {
        this.f23472S = -1;
        VelocityTracker velocityTracker = this.f23471R;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23471R = null;
        }
    }

    /* renamed from: J */
    public final void mo31864J(SavedState savedState) {
        int i = this.f23478a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f23482e = savedState.f23505g;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f23479b = savedState.f23506k;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f23457D = savedState.f23507r;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f23458E = savedState.f23508s;
            }
        }
    }

    /* renamed from: K */
    public void mo31865K(boolean z) {
        this.f23459F = z;
    }

    /* renamed from: L */
    public void mo31866L(int i) {
        if (i >= 0) {
            this.f23501x = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: M */
    public void mo31867M(boolean z) {
        int i;
        if (this.f23479b != z) {
            this.f23479b = z;
            if (this.f23468O != null) {
                mo31889p();
            }
            if (!this.f23479b || this.f23460G != 6) {
                i = this.f23460G;
            } else {
                i = 3;
            }
            mo31877W(i);
            mo31883c0();
        }
    }

    /* renamed from: N */
    public void mo31868N(boolean z) {
        this.f23490m = z;
    }

    /* renamed from: O */
    public void mo31869O(float f) {
        if (f <= Utils.FLOAT_EPSILON || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f23454A = f;
        if (this.f23468O != null) {
            mo31890q();
        }
    }

    /* renamed from: P */
    public void mo31870P(boolean z) {
        if (this.f23457D != z) {
            this.f23457D = z;
            if (!z && this.f23460G == 5) {
                mo31876V(4);
            }
            mo31883c0();
        }
    }

    /* renamed from: Q */
    public void mo31871Q(int i) {
        this.f23488k = i;
    }

    /* renamed from: R */
    public void mo31872R(int i) {
        mo31873S(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31873S(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f23483f
            if (r4 != 0) goto L_0x0015
            r3.f23483f = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.f23483f
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f23482e
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r3.f23483f = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.f23482e = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.mo31886f0(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo31873S(int, boolean):void");
    }

    /* renamed from: T */
    public void mo31874T(int i) {
        this.f23478a = i;
    }

    /* renamed from: U */
    public void mo31875U(boolean z) {
        this.f23458E = z;
    }

    /* renamed from: V */
    public void mo31876V(int i) {
        if (i != this.f23460G) {
            if (this.f23468O != null) {
                mo31880Z(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.f23457D && i == 5)) {
                this.f23460G = i;
            }
        }
    }

    /* renamed from: W */
    public void mo31877W(int i) {
        View view;
        if (this.f23460G != i) {
            this.f23460G = i;
            WeakReference<V> weakReference = this.f23468O;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    mo31885e0(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    mo31885e0(false);
                }
                mo31884d0(i);
                for (int i2 = 0; i2 < this.f23470Q.size(); i2++) {
                    this.f23470Q.get(i2).mo31910b(view, i);
                }
                mo31883c0();
            }
        }
    }

    /* renamed from: X */
    public final void mo31878X(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT < 29 || mo31859E() || this.f23483f) {
            z = false;
        } else {
            z = true;
        }
        if (this.f23491n || this.f23492o || this.f23493p || z) {
            pe7.m49895a(view, new C4209d(z));
        }
    }

    /* renamed from: Y */
    public void mo31879Y(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.f23455B;
        } else if (i == 6) {
            int i4 = this.f23503z;
            if (!this.f23479b || i4 > (i3 = this.f23502y)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = mo31898z();
        } else if (!this.f23457D || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f23467N;
        }
        mo31882b0(view, i, i2, false);
    }

    /* renamed from: Z */
    public final void mo31880Z(int i) {
        View view = (View) this.f23468O.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !parent.isLayoutRequested() || !ga7.m17746S(view)) {
                mo31879Y(view, i);
            } else {
                view.post(new C4207b(view, i));
            }
        }
    }

    /* renamed from: a0 */
    public boolean mo31881a0(View view, float f) {
        if (this.f23458E) {
            return true;
        }
        if (view.getTop() < this.f23455B) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f23455B)) / ((float) mo31891r()) > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public void mo31882b0(View view, int i, int i2, boolean z) {
        boolean z2;
        bc7 bc7 = this.f23461H;
        if (bc7 == null || (!z ? !bc7.mo11504R(view, view.getLeft(), i2) : !bc7.mo11502P(view.getLeft(), i2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            mo31877W(2);
            mo31884d0(i);
            if (this.f23499v == null) {
                this.f23499v = new C4213h(view, i);
            }
            if (!this.f23499v.f23522d) {
                BottomSheetBehavior<V>.C7152h hVar = this.f23499v;
                hVar.f23523e = i;
                ga7.m17769h0(view, hVar);
                boolean unused = this.f23499v.f23522d = true;
                return;
            }
            this.f23499v.f23523e = i;
            return;
        }
        mo31877W(i);
    }

    /* renamed from: c0 */
    public final void mo31883c0() {
        View view;
        WeakReference<V> weakReference = this.f23468O;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ga7.m17773j0(view, 524288);
            ga7.m17773j0(view, 262144);
            ga7.m17773j0(view, 1048576);
            int i = this.f23476W;
            if (i != -1) {
                ga7.m17773j0(view, i);
            }
            int i2 = 6;
            if (!this.f23479b && this.f23460G != 6) {
                this.f23476W = mo31887n(view, y45.bottomsheet_action_expand_halfway, 6);
            }
            if (this.f23457D && this.f23460G != 5) {
                mo31862H(view, C3335t8.C3336a.f18024y, 5);
            }
            int i3 = this.f23460G;
            if (i3 == 3) {
                if (this.f23479b) {
                    i2 = 4;
                }
                mo31862H(view, C3335t8.C3336a.f18023x, i2);
            } else if (i3 == 4) {
                if (this.f23479b) {
                    i2 = 3;
                }
                mo31862H(view, C3335t8.C3336a.f18022w, i2);
            } else if (i3 == 6) {
                mo31862H(view, C3335t8.C3336a.f18023x, 4);
                mo31862H(view, C3335t8.C3336a.f18022w, 3);
            }
        }
    }

    /* renamed from: d0 */
    public final void mo31884d0(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i != 2) {
            if (i == 3) {
                z = true;
            } else {
                z = false;
            }
            if (this.f23498u != z) {
                this.f23498u = z;
                if (this.f23487j != null && (valueAnimator = this.f23500w) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f23500w.reverse();
                        return;
                    }
                    if (z) {
                        f = Utils.FLOAT_EPSILON;
                    } else {
                        f = 1.0f;
                    }
                    this.f23500w.setFloatValues(new float[]{1.0f - f, f});
                    this.f23500w.start();
                }
            }
        }
    }

    /* renamed from: e0 */
    public final void mo31885e0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f23468O;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.f23475V == null) {
                        this.f23475V = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f23468O.get()) {
                        if (z) {
                            this.f23475V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.f23480c) {
                                ga7.m17714A0(childAt, 4);
                            }
                        } else if (this.f23480c && (map = this.f23475V) != null && map.containsKey(childAt)) {
                            ga7.m17714A0(childAt, this.f23475V.get(childAt).intValue());
                        }
                    }
                }
                if (!z) {
                    this.f23475V = null;
                } else if (this.f23480c) {
                    ((View) this.f23468O.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* renamed from: f0 */
    public final void mo31886f0(boolean z) {
        View view;
        if (this.f23468O != null) {
            mo31889p();
            if (this.f23460G == 4 && (view = (View) this.f23468O.get()) != null) {
                if (z) {
                    mo31880Z(this.f23460G);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    /* renamed from: n */
    public final int mo31887n(V v, int i, int i2) {
        return ga7.m17758c(v, v.getResources().getString(i), mo31892s(i2));
    }

    /* renamed from: o */
    public void mo31888o(C4212g gVar) {
        if (!this.f23470Q.contains(gVar)) {
            this.f23470Q.add(gVar);
        }
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.C0546e eVar) {
        super.onAttachedToLayoutParams(eVar);
        this.f23468O = null;
        this.f23461H = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f23468O = null;
        this.f23461H = null;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        bc7 bc7;
        boolean z;
        View view;
        if (!v.isShown() || !this.f23459F) {
            this.f23462I = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo31863I();
        }
        if (this.f23471R == null) {
            this.f23471R = VelocityTracker.obtain();
        }
        this.f23471R.addMovement(motionEvent);
        View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f23473T = (int) motionEvent.getY();
            if (this.f23460G != 2) {
                WeakReference<View> weakReference = this.f23469P;
                if (weakReference != null) {
                    view = weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.f23473T)) {
                    this.f23472S = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f23474U = true;
                }
            }
            if (this.f23472S != -1 || coordinatorLayout.isPointInChildBounds(v, x, this.f23473T)) {
                z = false;
            } else {
                z = true;
            }
            this.f23462I = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f23474U = false;
            this.f23472S = -1;
            if (this.f23462I) {
                this.f23462I = false;
                return false;
            }
        }
        if (!this.f23462I && (bc7 = this.f23461H) != null && bc7.mo11503Q(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f23469P;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.f23462I || this.f23460G == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f23461H == null || Math.abs(((float) this.f23473T) - motionEvent.getY()) <= ((float) this.f23461H.mo11487A())) {
            return false;
        }
        return true;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean z;
        float f;
        uo3 uo3;
        if (ga7.m17802y(coordinatorLayout) && !ga7.m17802y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f23468O == null) {
            this.f23484g = coordinatorLayout.getResources().getDimensionPixelSize(k25.design_bottom_sheet_peek_height_min);
            mo31878X(v);
            this.f23468O = new WeakReference<>(v);
            if (this.f23486i && (uo3 = this.f23487j) != null) {
                ga7.m17793t0(v, uo3);
            }
            uo3 uo32 = this.f23487j;
            if (uo32 != null) {
                float f2 = this.f23456C;
                if (f2 == -1.0f) {
                    f2 = ga7.m17798w(v);
                }
                uo32.mo48439Z(f2);
                if (this.f23460G == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f23498u = z;
                uo3 uo33 = this.f23487j;
                if (z) {
                    f = Utils.FLOAT_EPSILON;
                } else {
                    f = 1.0f;
                }
                uo33.mo48441b0(f);
            }
            mo31883c0();
            if (ga7.m17804z(v) == 0) {
                ga7.m17714A0(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i2 = this.f23488k;
            if (measuredWidth > i2 && i2 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.f23488k;
                v.post(new C4206a(v, layoutParams));
            }
        }
        if (this.f23461H == null) {
            this.f23461H = bc7.m11210p(coordinatorLayout, this.f23477X);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.f23466M = coordinatorLayout.getWidth();
        this.f23467N = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f23465L = height;
        int i3 = this.f23467N;
        int i4 = i3 - height;
        int i5 = this.f23496s;
        if (i4 < i5) {
            if (this.f23494q) {
                this.f23465L = i3;
            } else {
                this.f23465L = i3 - i5;
            }
        }
        this.f23502y = Math.max(0, i3 - this.f23465L);
        mo31890q();
        mo31889p();
        int i6 = this.f23460G;
        if (i6 == 3) {
            ga7.m17755a0(v, mo31898z());
        } else if (i6 == 6) {
            ga7.m17755a0(v, this.f23503z);
        } else if (this.f23457D && i6 == 5) {
            ga7.m17755a0(v, this.f23467N);
        } else if (i6 == 4) {
            ga7.m17755a0(v, this.f23455B);
        } else if (i6 == 1 || i6 == 2) {
            ga7.m17755a0(v, top - v.getTop());
        }
        this.f23469P = new WeakReference<>(mo31897x(v));
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.f23469P;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.f23460G != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2)) {
            return true;
        }
        return false;
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 != 1) {
            WeakReference<View> weakReference = this.f23469P;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < mo31898z()) {
                        int z = top - mo31898z();
                        iArr[1] = z;
                        ga7.m17755a0(v, -z);
                        mo31877W(3);
                    } else if (this.f23459F) {
                        iArr[1] = i2;
                        ga7.m17755a0(v, -i2);
                        mo31877W(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i5 = this.f23455B;
                    if (i4 > i5 && !this.f23457D) {
                        int i6 = top - i5;
                        iArr[1] = i6;
                        ga7.m17755a0(v, -i6);
                        mo31877W(4);
                    } else if (this.f23459F) {
                        iArr[1] = i2;
                        ga7.m17755a0(v, -i2);
                        mo31877W(1);
                    } else {
                        return;
                    }
                }
                mo31896w(v.getTop());
                this.f23463J = i2;
                this.f23464K = true;
            }
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.mo5481a());
        mo31864J(savedState);
        int i = savedState.f23504e;
        if (i == 1 || i == 2) {
            this.f23460G = 4;
        } else {
            this.f23460G = i;
        }
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f23463J = 0;
        this.f23464K = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == mo31898z()) {
            mo31877W(3);
            return;
        }
        WeakReference<View> weakReference = this.f23469P;
        if (weakReference != null && view == weakReference.get() && this.f23464K) {
            if (this.f23463J > 0) {
                if (this.f23479b) {
                    i2 = this.f23502y;
                } else {
                    int top = v.getTop();
                    int i5 = this.f23503z;
                    if (top > i5) {
                        i2 = i5;
                    } else {
                        i2 = mo31898z();
                    }
                }
                mo31882b0(v, i4, i2, false);
                this.f23464K = false;
            } else if (!this.f23457D || !mo31881a0(v, mo31858D())) {
                if (this.f23463J == 0) {
                    int top2 = v.getTop();
                    if (!this.f23479b) {
                        int i6 = this.f23503z;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.f23455B)) {
                                i2 = mo31898z();
                                mo31882b0(v, i4, i2, false);
                                this.f23464K = false;
                            }
                            i2 = this.f23503z;
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.f23455B)) {
                            i2 = this.f23503z;
                        } else {
                            i3 = this.f23455B;
                        }
                    } else if (Math.abs(top2 - this.f23502y) < Math.abs(top2 - this.f23455B)) {
                        i2 = this.f23502y;
                        mo31882b0(v, i4, i2, false);
                        this.f23464K = false;
                    } else {
                        i3 = this.f23455B;
                    }
                } else if (this.f23479b) {
                    i3 = this.f23455B;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.f23503z) < Math.abs(top3 - this.f23455B)) {
                        i2 = this.f23503z;
                    } else {
                        i3 = this.f23455B;
                    }
                }
                i4 = 4;
                mo31882b0(v, i4, i2, false);
                this.f23464K = false;
            } else {
                i2 = this.f23467N;
                i4 = 5;
                mo31882b0(v, i4, i2, false);
                this.f23464K = false;
            }
            i4 = 6;
            mo31882b0(v, i4, i2, false);
            this.f23464K = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f23460G == 1 && actionMasked == 0) {
            return true;
        }
        bc7 bc7 = this.f23461H;
        if (bc7 != null) {
            bc7.mo11493G(motionEvent);
        }
        if (actionMasked == 0) {
            mo31863I();
        }
        if (this.f23471R == null) {
            this.f23471R = VelocityTracker.obtain();
        }
        this.f23471R.addMovement(motionEvent);
        if (this.f23461H != null && actionMasked == 2 && !this.f23462I && Math.abs(((float) this.f23473T) - motionEvent.getY()) > ((float) this.f23461H.mo11487A())) {
            this.f23461H.mo11508c(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f23462I;
    }

    /* renamed from: p */
    public final void mo31889p() {
        int r = mo31891r();
        if (this.f23479b) {
            this.f23455B = Math.max(this.f23467N - r, this.f23502y);
        } else {
            this.f23455B = this.f23467N - r;
        }
    }

    /* renamed from: q */
    public final void mo31890q() {
        this.f23503z = (int) (((float) this.f23467N) * (1.0f - this.f23454A));
    }

    /* renamed from: r */
    public final int mo31891r() {
        int i;
        if (this.f23483f) {
            return Math.min(Math.max(this.f23484g, this.f23467N - ((this.f23466M * 9) / 16)), this.f23465L) + this.f23495r;
        }
        if (this.f23490m || this.f23491n || (i = this.f23489l) <= 0) {
            return this.f23482e + this.f23495r;
        }
        return Math.max(this.f23482e, i + this.f23485h);
    }

    /* renamed from: s */
    public final C3658y8 mo31892s(int i) {
        return new C4211f(i);
    }

    /* renamed from: t */
    public final void mo31893t(Context context, AttributeSet attributeSet, boolean z) {
        mo31894u(context, attributeSet, z, (ColorStateList) null);
    }

    /* renamed from: u */
    public final void mo31894u(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.f23486i) {
            this.f23497t = rz5.m51450e(context, attributeSet, j15.bottomSheetStyle, f23453Y).mo47599m();
            uo3 uo3 = new uo3(this.f23497t);
            this.f23487j = uo3;
            uo3.mo48430P(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f23487j.setTint(typedValue.data);
                return;
            }
            this.f23487j.mo48440a0(colorStateList);
        }
    }

    /* renamed from: v */
    public final void mo31895v() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f23500w = ofFloat;
        ofFloat.setDuration(500);
        this.f23500w.addUpdateListener(new C4208c());
    }

    /* renamed from: w */
    public void mo31896w(int i) {
        float f;
        float f2;
        View view = (View) this.f23468O.get();
        if (view != null && !this.f23470Q.isEmpty()) {
            int i2 = this.f23455B;
            if (i > i2 || i2 == mo31898z()) {
                int i3 = this.f23455B;
                f = (float) (i3 - i);
                f2 = (float) (this.f23467N - i3);
            } else {
                int i4 = this.f23455B;
                f = (float) (i4 - i);
                f2 = (float) (i4 - mo31898z());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f23470Q.size(); i5++) {
                this.f23470Q.get(i5).mo31909a(view, f3);
            }
        }
    }

    /* renamed from: x */
    public View mo31897x(View view) {
        if (ga7.m17748U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View x = mo31897x(viewGroup.getChildAt(i));
            if (x != null) {
                return x;
            }
        }
        return null;
    }

    /* renamed from: z */
    public int mo31898z() {
        int i;
        if (this.f23479b) {
            return this.f23502y;
        }
        int i2 = this.f23501x;
        if (this.f23494q) {
            i = 0;
        } else {
            i = this.f23496s;
        }
        return Math.max(i2, i);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4205a();

        /* renamed from: e */
        public final int f23504e;

        /* renamed from: g */
        public int f23505g;

        /* renamed from: k */
        public boolean f23506k;

        /* renamed from: r */
        public boolean f23507r;

        /* renamed from: s */
        public boolean f23508s;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public static class C4205a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f23504e = parcel.readInt();
            this.f23505g = parcel.readInt();
            boolean z = false;
            this.f23506k = parcel.readInt() == 1;
            this.f23507r = parcel.readInt() == 1;
            this.f23508s = parcel.readInt() == 1 ? true : z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f23504e);
            parcel.writeInt(this.f23505g);
            parcel.writeInt(this.f23506k ? 1 : 0);
            parcel.writeInt(this.f23507r ? 1 : 0);
            parcel.writeInt(this.f23508s ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f23504e = bottomSheetBehavior.f23460G;
            this.f23505g = bottomSheetBehavior.f23482e;
            this.f23506k = bottomSheetBehavior.f23479b;
            this.f23507r = bottomSheetBehavior.f23457D;
            this.f23508s = bottomSheetBehavior.f23458E;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f23485h = context.getResources().getDimensionPixelSize(k25.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u55.BottomSheetBehavior_Layout);
        this.f23486i = obtainStyledAttributes.hasValue(u55.BottomSheetBehavior_Layout_shapeAppearance);
        int i2 = u55.BottomSheetBehavior_Layout_backgroundTint;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        if (hasValue) {
            mo31894u(context, attributeSet, hasValue, to3.m52391b(context, obtainStyledAttributes, i2));
        } else {
            mo31893t(context, attributeSet, hasValue);
        }
        mo31895v();
        this.f23456C = obtainStyledAttributes.getDimension(u55.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = u55.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            mo31871Q(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = u55.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i4);
        if (peekValue == null || (i = peekValue.data) != -1) {
            mo31872R(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        } else {
            mo31872R(i);
        }
        mo31870P(obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo31868N(obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        mo31867M(obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo31875U(obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        mo31865K(obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_behavior_draggable, true));
        mo31874T(obtainStyledAttributes.getInt(u55.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        mo31869O(obtainStyledAttributes.getFloat(u55.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        int i5 = u55.BottomSheetBehavior_Layout_behavior_expandedOffset;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i5);
        if (peekValue2 == null || peekValue2.type != 16) {
            mo31866L(obtainStyledAttributes.getDimensionPixelOffset(i5, 0));
        } else {
            mo31866L(peekValue2.data);
        }
        this.f23491n = obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.f23492o = obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.f23493p = obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.f23494q = obtainStyledAttributes.getBoolean(u55.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.f23481d = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
