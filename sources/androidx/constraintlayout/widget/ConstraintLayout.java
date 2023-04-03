package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.C0486d;
import androidx.constraintlayout.core.widgets.C0489f;
import androidx.constraintlayout.core.widgets.C0491g;
import androidx.constraintlayout.core.widgets.C0493i;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import p000.a00;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: e1 */
    public static C0539b f3079e1;

    /* renamed from: A */
    public C0532a f3080A = null;

    /* renamed from: B */
    public jq0 f3081B = null;

    /* renamed from: C */
    public int f3082C = -1;

    /* renamed from: H */
    public HashMap<String, Integer> f3083H = new HashMap<>();

    /* renamed from: I */
    public int f3084I = -1;

    /* renamed from: L */
    public int f3085L = -1;

    /* renamed from: M */
    public int f3086M = -1;

    /* renamed from: P */
    public int f3087P = -1;

    /* renamed from: Q */
    public int f3088Q = 0;

    /* renamed from: U */
    public int f3089U = 0;

    /* renamed from: a */
    public SparseArray<View> f3090a = new SparseArray<>();

    /* renamed from: b1 */
    public int f3091b1 = 0;

    /* renamed from: d */
    public ArrayList<ConstraintHelper> f3092d = new ArrayList<>(4);

    /* renamed from: e */
    public C0486d f3093e = new C0486d();

    /* renamed from: e0 */
    public SparseArray<ConstraintWidget> f3094e0 = new SparseArray<>();

    /* renamed from: g */
    public int f3095g = 0;

    /* renamed from: k */
    public int f3096k = 0;

    /* renamed from: k0 */
    public C0531b f3097k0 = new C0531b(this);

    /* renamed from: r */
    public int f3098r = Integer.MAX_VALUE;

    /* renamed from: s */
    public int f3099s = Integer.MAX_VALUE;

    /* renamed from: v0 */
    public int f3100v0 = 0;

    /* renamed from: x */
    public boolean f3101x = true;

    /* renamed from: y */
    public int f3102y = 257;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C0530a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3178a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3178a = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3178a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3178a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3178a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0530a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0531b implements a00.C0001b {

        /* renamed from: a */
        public ConstraintLayout f3179a;

        /* renamed from: b */
        public int f3180b;

        /* renamed from: c */
        public int f3181c;

        /* renamed from: d */
        public int f3182d;

        /* renamed from: e */
        public int f3183e;

        /* renamed from: f */
        public int f3184f;

        /* renamed from: g */
        public int f3185g;

        public C0531b(ConstraintLayout constraintLayout) {
            this.f3179a = constraintLayout;
        }

        /* renamed from: a */
        public final void mo8a() {
            int childCount = this.f3179a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f3179a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo5122b(this.f3179a);
                }
            }
            int size = this.f3179a.f3092d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f3179a.f3092d.get(i2)).mo5056s(this.f3179a);
                }
            }
        }

        @SuppressLint({"WrongCall"})
        /* renamed from: b */
        public final void mo9b(ConstraintWidget constraintWidget, a00.C0000a aVar) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z7;
            boolean z8;
            int i7;
            int i8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            ConstraintWidget constraintWidget2 = constraintWidget;
            a00.C0000a aVar2 = aVar;
            if (constraintWidget2 != null) {
                if (constraintWidget.mo4367U() == 8 && !constraintWidget.mo4401i0()) {
                    aVar2.f13e = 0;
                    aVar2.f14f = 0;
                    aVar2.f15g = 0;
                } else if (constraintWidget.mo4351M() != null) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f9a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f10b;
                    int i9 = aVar2.f11c;
                    int i10 = aVar2.f12d;
                    int i11 = this.f3180b + this.f3181c;
                    int i12 = this.f3182d;
                    View view = (View) constraintWidget.mo4431u();
                    int[] iArr = C0530a.f3178a;
                    int i13 = iArr[dimensionBehaviour.ordinal()];
                    if (i13 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i13 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f3184f, i12, -2);
                    } else if (i13 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f3184f, i12 + constraintWidget.mo4333D(), -1);
                    } else if (i13 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f3184f, i12, -2);
                        if (constraintWidget2.f2449v == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i14 = aVar2.f18j;
                        if (i14 == a00.C0000a.f7l || i14 == a00.C0000a.f8m) {
                            if (view.getMeasuredHeight() == constraintWidget.mo4441z()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (aVar2.f18j == a00.C0000a.f8m || !z13 || ((z13 && z14) || (view instanceof Placeholder) || constraintWidget.mo4413m0())) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo4369V(), 1073741824);
                            }
                        }
                    }
                    int i15 = iArr[dimensionBehaviour2.ordinal()];
                    if (i15 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else if (i15 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f3185g, i11, -2);
                    } else if (i15 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f3185g, i11 + constraintWidget.mo4365T(), -1);
                    } else if (i15 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f3185g, i11, -2);
                        if (constraintWidget2.f2451w == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i16 = aVar2.f18j;
                        if (i16 == a00.C0000a.f7l || i16 == a00.C0000a.f8m) {
                            if (view.getMeasuredWidth() == constraintWidget.mo4369V()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (aVar2.f18j == a00.C0000a.f8m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || constraintWidget.mo4416n0())) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo4441z(), 1073741824);
                            }
                        }
                    }
                    C0486d dVar = (C0486d) constraintWidget.mo4351M();
                    if (dVar != null && C0491g.m3746b(ConstraintLayout.this.f3102y, 256) && view.getMeasuredWidth() == constraintWidget.mo4369V() && view.getMeasuredWidth() < dVar.mo4369V() && view.getMeasuredHeight() == constraintWidget.mo4441z() && view.getMeasuredHeight() < dVar.mo4441z() && view.getBaseline() == constraintWidget.mo4424r() && !constraintWidget.mo4410l0()) {
                        if (!mo5104d(constraintWidget.mo4335E(), i, constraintWidget.mo4369V()) || !mo5104d(constraintWidget.mo4337F(), i2, constraintWidget.mo4441z())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVar2.f13e = constraintWidget.mo4369V();
                            aVar2.f14f = constraintWidget.mo4441z();
                            aVar2.f15g = constraintWidget.mo4424r();
                            return;
                        }
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if (dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z || constraintWidget2.f2416e0 <= Utils.FLOAT_EPSILON) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z2 || constraintWidget2.f2416e0 <= Utils.FLOAT_EPSILON) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view != null) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        int i17 = aVar2.f18j;
                        if (i17 == a00.C0000a.f7l || i17 == a00.C0000a.f8m || !z || constraintWidget2.f2449v != 0 || !z2 || constraintWidget2.f2451w != 0) {
                            if (!(view instanceof VirtualLayout) || !(constraintWidget2 instanceof C0493i)) {
                                view.measure(i, i2);
                            } else {
                                ((VirtualLayout) view).mo4625x((C0493i) constraintWidget2, i, i2);
                            }
                            constraintWidget2.mo4364S0(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i4 = view.getBaseline();
                            int i18 = constraintWidget2.f2455y;
                            if (i18 > 0) {
                                i3 = Math.max(i18, measuredWidth);
                            } else {
                                i3 = measuredWidth;
                            }
                            int i19 = constraintWidget2.f2457z;
                            if (i19 > 0) {
                                i3 = Math.min(i19, i3);
                            }
                            int i20 = constraintWidget2.f2364B;
                            if (i20 > 0) {
                                i5 = Math.max(i20, measuredHeight);
                                i7 = i;
                            } else {
                                i7 = i;
                                i5 = measuredHeight;
                            }
                            int i21 = constraintWidget2.f2366C;
                            if (i21 > 0) {
                                i5 = Math.min(i21, i5);
                            }
                            if (!C0491g.m3746b(ConstraintLayout.this.f3102y, 1)) {
                                if (z5 && z3) {
                                    i3 = (int) ((((float) i5) * constraintWidget2.f2416e0) + 0.5f);
                                } else if (z6 && z4) {
                                    i5 = (int) ((((float) i3) / constraintWidget2.f2416e0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i3 && measuredHeight == i5)) {
                                if (measuredWidth != i3) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = i7;
                                }
                                if (measuredHeight != i5) {
                                    i2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(i8, i2);
                                constraintWidget2.mo4364S0(i8, i2);
                                i3 = view.getMeasuredWidth();
                                i5 = view.getMeasuredHeight();
                                i4 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        if (i4 != i6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i3 == aVar2.f11c && i5 == aVar2.f12d) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        aVar2.f17i = z8;
                        if (layoutParams.f3140f0) {
                            z7 = true;
                        }
                        if (!(!z7 || i4 == -1 || constraintWidget.mo4424r() == i4)) {
                            aVar2.f17i = true;
                        }
                        aVar2.f13e = i3;
                        aVar2.f14f = i5;
                        aVar2.f16h = z7;
                        aVar2.f15g = i4;
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo5103c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f3180b = i3;
            this.f3181c = i4;
            this.f3182d = i5;
            this.f3183e = i6;
            this.f3184f = i;
            this.f3185g = i2;
        }

        /* renamed from: d */
        public final boolean mo5104d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        mo5080k((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C0539b getSharedValues() {
        if (f3079e1 == null) {
            f3079e1 = new C0539b();
        }
        return f3079e1;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void mo5064d(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        int i;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        View view2 = view;
        ConstraintWidget constraintWidget6 = constraintWidget;
        LayoutParams layoutParams2 = layoutParams;
        SparseArray<ConstraintWidget> sparseArray2 = sparseArray;
        layoutParams.mo5101c();
        layoutParams2.f3172v0 = false;
        constraintWidget6.mo4396g1(view.getVisibility());
        if (layoutParams2.f3146i0) {
            constraintWidget6.mo4360Q0(true);
            constraintWidget6.mo4396g1(8);
        }
        constraintWidget6.mo4440y0(view2);
        if (view2 instanceof ConstraintHelper) {
            ((ConstraintHelper) view2).mo4600q(constraintWidget6, this.f3093e.mo4486M1());
        }
        if (layoutParams2.f3142g0) {
            C0489f fVar = (C0489f) constraintWidget6;
            int i2 = layoutParams2.f3164r0;
            int i3 = layoutParams2.f3166s0;
            float f = layoutParams2.f3168t0;
            if (f != -1.0f) {
                fVar.mo4550w1(f);
            } else if (i2 != -1) {
                fVar.mo4548u1(i2);
            } else if (i3 != -1) {
                fVar.mo4549v1(i3);
            }
        } else {
            int i4 = layoutParams2.f3150k0;
            int i5 = layoutParams2.f3152l0;
            int i6 = layoutParams2.f3154m0;
            int i7 = layoutParams2.f3156n0;
            int i8 = layoutParams2.f3158o0;
            int i9 = layoutParams2.f3160p0;
            float f2 = layoutParams2.f3162q0;
            int i10 = layoutParams2.f3157o;
            if (i10 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray2.get(i10);
                if (constraintWidget7 != null) {
                    constraintWidget6.mo4412m(constraintWidget7, layoutParams2.f3161q, layoutParams2.f3159p);
                }
            } else {
                if (i4 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray2.get(i4);
                    if (constraintWidget8 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        constraintWidget.mo4386d0(type, constraintWidget8, type, layoutParams2.leftMargin, i8);
                    }
                } else if (!(i5 == -1 || (constraintWidget5 = sparseArray2.get(i5)) == null)) {
                    constraintWidget.mo4386d0(ConstraintAnchor.Type.LEFT, constraintWidget5, ConstraintAnchor.Type.RIGHT, layoutParams2.leftMargin, i8);
                }
                if (i6 != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray2.get(i6);
                    if (constraintWidget9 != null) {
                        constraintWidget.mo4386d0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, layoutParams2.rightMargin, i9);
                    }
                } else if (!(i7 == -1 || (constraintWidget4 = sparseArray2.get(i7)) == null)) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.mo4386d0(type2, constraintWidget4, type2, layoutParams2.rightMargin, i9);
                }
                int i11 = layoutParams2.f3143h;
                if (i11 != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray2.get(i11);
                    if (constraintWidget10 != null) {
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.TOP;
                        constraintWidget.mo4386d0(type3, constraintWidget10, type3, layoutParams2.topMargin, layoutParams2.f3173w);
                    }
                } else {
                    int i12 = layoutParams2.f3145i;
                    if (!(i12 == -1 || (constraintWidget3 = sparseArray2.get(i12)) == null)) {
                        constraintWidget.mo4386d0(ConstraintAnchor.Type.TOP, constraintWidget3, ConstraintAnchor.Type.BOTTOM, layoutParams2.topMargin, layoutParams2.f3173w);
                    }
                }
                int i13 = layoutParams2.f3147j;
                if (i13 != -1) {
                    ConstraintWidget constraintWidget11 = sparseArray2.get(i13);
                    if (constraintWidget11 != null) {
                        constraintWidget.mo4386d0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.TOP, layoutParams2.bottomMargin, layoutParams2.f3175y);
                    }
                } else {
                    int i14 = layoutParams2.f3149k;
                    if (!(i14 == -1 || (constraintWidget2 = sparseArray2.get(i14)) == null)) {
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                        constraintWidget.mo4386d0(type4, constraintWidget2, type4, layoutParams2.bottomMargin, layoutParams2.f3175y);
                    }
                }
                int i15 = layoutParams2.f3151l;
                if (i15 != -1) {
                    mo5087s(constraintWidget, layoutParams, sparseArray, i15, ConstraintAnchor.Type.BASELINE);
                } else {
                    int i16 = layoutParams2.f3153m;
                    if (i16 != -1) {
                        mo5087s(constraintWidget, layoutParams, sparseArray, i16, ConstraintAnchor.Type.TOP);
                    } else {
                        int i17 = layoutParams2.f3155n;
                        if (i17 != -1) {
                            mo5087s(constraintWidget, layoutParams, sparseArray, i17, ConstraintAnchor.Type.BOTTOM);
                        }
                    }
                }
                if (f2 >= Utils.FLOAT_EPSILON) {
                    constraintWidget6.mo4346J0(f2);
                }
                float f3 = layoutParams2.f3109G;
                if (f3 >= Utils.FLOAT_EPSILON) {
                    constraintWidget6.mo4380a1(f3);
                }
            }
            if (z && !((i = layoutParams2.f3125W) == -1 && layoutParams2.f3126X == -1)) {
                constraintWidget6.mo4376Y0(i, layoutParams2.f3126X);
            }
            if (layoutParams2.f3136d0) {
                constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.mo4399h1(layoutParams2.width);
                if (layoutParams2.width == -2) {
                    constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams2.width == -1) {
                if (layoutParams2.f3128Z) {
                    constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.mo4422q(ConstraintAnchor.Type.LEFT).f2356g = layoutParams2.leftMargin;
                constraintWidget6.mo4422q(ConstraintAnchor.Type.RIGHT).f2356g = layoutParams2.rightMargin;
            } else {
                constraintWidget6.mo4352M0(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.mo4399h1(0);
            }
            if (layoutParams2.f3138e0) {
                constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.mo4344I0(layoutParams2.height);
                if (layoutParams2.height == -2) {
                    constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (layoutParams2.height == -1) {
                if (layoutParams2.f3130a0) {
                    constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.mo4422q(ConstraintAnchor.Type.TOP).f2356g = layoutParams2.topMargin;
                constraintWidget6.mo4422q(ConstraintAnchor.Type.BOTTOM).f2356g = layoutParams2.bottomMargin;
            } else {
                constraintWidget6.mo4387d1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.mo4344I0(0);
            }
            constraintWidget6.mo4328A0(layoutParams2.f3110H);
            constraintWidget6.mo4356O0(layoutParams2.f3113K);
            constraintWidget6.mo4393f1(layoutParams2.f3114L);
            constraintWidget6.mo4348K0(layoutParams2.f3115M);
            constraintWidget6.mo4382b1(layoutParams2.f3116N);
            constraintWidget6.mo4402i1(layoutParams2.f3134c0);
            constraintWidget6.mo4354N0(layoutParams2.f3117O, layoutParams2.f3119Q, layoutParams2.f3121S, layoutParams2.f3123U);
            constraintWidget6.mo4390e1(layoutParams2.f3118P, layoutParams2.f3120R, layoutParams2.f3122T, layoutParams2.f3124V);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f3092d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f3092d.get(i).mo4637t(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: f */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void forceLayout() {
        mo5082m();
        super.forceLayout();
    }

    /* renamed from: g */
    public Object mo5068g(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f3083H;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f3083H.get(str);
    }

    public int getMaxHeight() {
        return this.f3099s;
    }

    public int getMaxWidth() {
        return this.f3098r;
    }

    public int getMinHeight() {
        return this.f3096k;
    }

    public int getMinWidth() {
        return this.f3095g;
    }

    public int getOptimizationLevel() {
        return this.f3093e.mo4480G1();
    }

    /* renamed from: h */
    public final ConstraintWidget mo5077h(int i) {
        if (i == 0) {
            return this.f3093e;
        }
        View view = this.f3090a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f3093e;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3170u0;
    }

    /* renamed from: i */
    public View mo5078i(int i) {
        return this.f3090a.get(i);
    }

    /* renamed from: j */
    public final ConstraintWidget mo5079j(View view) {
        if (view == this) {
            return this.f3093e;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f3170u0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f3170u0;
        }
        return null;
    }

    /* renamed from: k */
    public final void mo5080k(AttributeSet attributeSet, int i, int i2) {
        this.f3093e.mo4440y0(this);
        this.f3093e.mo4491S1(this.f3097k0);
        this.f3090a.put(getId(), this);
        this.f3080A = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == c65.ConstraintLayout_Layout_android_minWidth) {
                    this.f3095g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3095g);
                } else if (index == c65.ConstraintLayout_Layout_android_minHeight) {
                    this.f3096k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3096k);
                } else if (index == c65.ConstraintLayout_Layout_android_maxWidth) {
                    this.f3098r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3098r);
                } else if (index == c65.ConstraintLayout_Layout_android_maxHeight) {
                    this.f3099s = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3099s);
                } else if (index == c65.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f3102y = obtainStyledAttributes.getInt(index, this.f3102y);
                } else if (index == c65.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo4695n(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3081B = null;
                        }
                    }
                } else if (index == c65.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0532a aVar = new C0532a();
                        this.f3080A = aVar;
                        aVar.mo5146D(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3080A = null;
                    }
                    this.f3082C = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3093e.mo4492T1(this.f3102y);
    }

    /* renamed from: l */
    public boolean mo5081l() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void mo5082m() {
        this.f3101x = true;
        this.f3084I = -1;
        this.f3085L = -1;
        this.f3086M = -1;
        this.f3087P = -1;
        this.f3088Q = 0;
        this.f3089U = 0;
    }

    /* renamed from: n */
    public void mo4695n(int i) {
        this.f3081B = new jq0(getContext(), this, i);
    }

    /* renamed from: o */
    public void mo5083o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0531b bVar = this.f3097k0;
        int i5 = bVar.f3183e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + bVar.f3182d, i, 0);
        int min = Math.min(this.f3098r, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f3099s, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.f3084I = min;
        this.f3085L = min2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f3170u0;
            if ((childAt.getVisibility() != 8 || layoutParams.f3142g0 || layoutParams.f3144h0 || layoutParams.f3148j0 || isInEditMode) && !layoutParams.f3146i0) {
                int W = constraintWidget.mo4371W();
                int X = constraintWidget.mo4373X();
                int V = constraintWidget.mo4369V() + W;
                int z2 = constraintWidget.mo4441z() + X;
                childAt.layout(W, X, V, z2);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(W, X, V, z2);
                }
            }
        }
        int size = this.f3092d.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f3092d.get(i6).mo4627r(this);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f3100v0 == i) {
            int i3 = this.f3091b1;
        }
        if (!this.f3101x) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.f3101x = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.f3101x;
        this.f3100v0 = i;
        this.f3091b1 = i2;
        this.f3093e.mo4494V1(mo5081l());
        if (this.f3101x) {
            this.f3101x = false;
            if (mo5098t()) {
                this.f3093e.mo4496X1();
            }
        }
        mo5084p(this.f3093e, this.f3102y, i, i2);
        mo5083o(i, i2, this.f3093e.mo4369V(), this.f3093e.mo4441z(), this.f3093e.mo4487N1(), this.f3093e.mo4485L1());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget j = mo5079j(view);
        if ((view instanceof Guideline) && !(j instanceof C0489f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C0489f fVar = new C0489f();
            layoutParams.f3170u0 = fVar;
            layoutParams.f3142g0 = true;
            fVar.mo4551x1(layoutParams.f3127Y);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo5062w();
            ((LayoutParams) view.getLayoutParams()).f3144h0 = true;
            if (!this.f3092d.contains(constraintHelper)) {
                this.f3092d.add(constraintHelper);
            }
        }
        this.f3090a.put(view.getId(), view);
        this.f3101x = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3090a.remove(view.getId());
        this.f3093e.mo27207q1(mo5079j(view));
        this.f3092d.remove(view);
        this.f3101x = true;
    }

    /* renamed from: p */
    public void mo5084p(C0486d dVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f3097k0.mo5103c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (mo5081l()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo5086r(dVar, mode, i6, mode2, i7);
        dVar.mo4488O1(i, mode, i6, mode2, i7, this.f3084I, this.f3085L, i4, max);
    }

    /* renamed from: q */
    public final void mo5085q() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget j = mo5079j(getChildAt(i));
            if (j != null) {
                j.mo4427s0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo5077h(childAt.getId()).mo4442z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f3082C != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f3082C && (childAt2 instanceof Constraints)) {
                    this.f3080A = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C0532a aVar = this.f3080A;
        if (aVar != null) {
            aVar.mo5157k(this, true);
        }
        this.f3093e.mo27208r1();
        int size = this.f3092d.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f3092d.get(i4).mo5061v(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo5123c(this);
            }
        }
        this.f3094e0.clear();
        this.f3094e0.put(0, this.f3093e);
        this.f3094e0.put(getId(), this.f3093e);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f3094e0.put(childAt4.getId(), mo5079j(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget j2 = mo5079j(childAt5);
            if (j2 != null) {
                this.f3093e.mo27205a(j2);
                mo5064d(isInEditMode, childAt5, j2, (LayoutParams) childAt5.getLayoutParams(), this.f3094e0);
            }
        }
    }

    /* renamed from: r */
    public void mo5086r(C0486d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        C0531b bVar = this.f3097k0;
        int i5 = bVar.f3183e;
        int i6 = bVar.f3182d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f3095g);
                }
            } else if (i != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i2 = Math.min(this.f3098r - i6, i2);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f3095g);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.f3096k);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.f3099s - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f3096k);
            }
        }
        if (!(i2 == dVar.mo4369V() && i4 == dVar.mo4441z())) {
            dVar.mo4484K1();
        }
        dVar.mo4405j1(0);
        dVar.mo4408k1(0);
        dVar.mo4368U0(this.f3098r - i6);
        dVar.mo4366T0(this.f3099s - i5);
        dVar.mo4374X0(0);
        dVar.mo4372W0(0);
        dVar.mo4352M0(dimensionBehaviour);
        dVar.mo4399h1(i2);
        dVar.mo4387d1(dimensionBehaviour2);
        dVar.mo4344I0(i4);
        dVar.mo4374X0(this.f3095g - i6);
        dVar.mo4372W0(this.f3096k - i5);
    }

    public void requestLayout() {
        mo5082m();
        super.requestLayout();
    }

    /* renamed from: s */
    public final void mo5087s(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.f3090a.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f3140f0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f3140f0 = true;
                layoutParams2.f3170u0.mo4342H0(true);
            }
            constraintWidget.mo4422q(type2).mo4306b(constraintWidget2.mo4422q(type), layoutParams.f3105C, layoutParams.f3104B, true);
            constraintWidget.mo4342H0(true);
            constraintWidget.mo4422q(ConstraintAnchor.Type.TOP).mo4321q();
            constraintWidget.mo4422q(ConstraintAnchor.Type.BOTTOM).mo4321q();
        }
    }

    public void setConstraintSet(C0532a aVar) {
        this.f3080A = aVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3083H == null) {
                this.f3083H = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f3083H.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.f3090a.remove(getId());
        super.setId(i);
        this.f3090a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f3099s) {
            this.f3099s = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f3098r) {
            this.f3098r = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f3096k) {
            this.f3096k = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f3095g) {
            this.f3095g = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(oq0 oq0) {
        jq0 jq0 = this.f3081B;
        if (jq0 != null) {
            jq0.mo22037c(oq0);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f3102y = i;
        this.f3093e.mo4492T1(i);
    }

    public void setState(int i, int i2, int i3) {
        jq0 jq0 = this.f3081B;
        if (jq0 != null) {
            jq0.mo22038d(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo5098t() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo5085q();
        }
        return z;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5080k(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5080k(attributeSet, i, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f3103A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f3104B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f3105C = 0;

        /* renamed from: D */
        public boolean f3106D = true;

        /* renamed from: E */
        public boolean f3107E = true;

        /* renamed from: F */
        public float f3108F = 0.5f;

        /* renamed from: G */
        public float f3109G = 0.5f;

        /* renamed from: H */
        public String f3110H = null;

        /* renamed from: I */
        public float f3111I = Utils.FLOAT_EPSILON;

        /* renamed from: J */
        public int f3112J = 1;

        /* renamed from: K */
        public float f3113K = -1.0f;

        /* renamed from: L */
        public float f3114L = -1.0f;

        /* renamed from: M */
        public int f3115M = 0;

        /* renamed from: N */
        public int f3116N = 0;

        /* renamed from: O */
        public int f3117O = 0;

        /* renamed from: P */
        public int f3118P = 0;

        /* renamed from: Q */
        public int f3119Q = 0;

        /* renamed from: R */
        public int f3120R = 0;

        /* renamed from: S */
        public int f3121S = 0;

        /* renamed from: T */
        public int f3122T = 0;

        /* renamed from: U */
        public float f3123U = 1.0f;

        /* renamed from: V */
        public float f3124V = 1.0f;

        /* renamed from: W */
        public int f3125W = -1;

        /* renamed from: X */
        public int f3126X = -1;

        /* renamed from: Y */
        public int f3127Y = -1;

        /* renamed from: Z */
        public boolean f3128Z = false;

        /* renamed from: a */
        public int f3129a = -1;

        /* renamed from: a0 */
        public boolean f3130a0 = false;

        /* renamed from: b */
        public int f3131b = -1;

        /* renamed from: b0 */
        public String f3132b0 = null;

        /* renamed from: c */
        public float f3133c = -1.0f;

        /* renamed from: c0 */
        public int f3134c0 = 0;

        /* renamed from: d */
        public int f3135d = -1;

        /* renamed from: d0 */
        public boolean f3136d0 = true;

        /* renamed from: e */
        public int f3137e = -1;

        /* renamed from: e0 */
        public boolean f3138e0 = true;

        /* renamed from: f */
        public int f3139f = -1;

        /* renamed from: f0 */
        public boolean f3140f0 = false;

        /* renamed from: g */
        public int f3141g = -1;

        /* renamed from: g0 */
        public boolean f3142g0 = false;

        /* renamed from: h */
        public int f3143h = -1;

        /* renamed from: h0 */
        public boolean f3144h0 = false;

        /* renamed from: i */
        public int f3145i = -1;

        /* renamed from: i0 */
        public boolean f3146i0 = false;

        /* renamed from: j */
        public int f3147j = -1;

        /* renamed from: j0 */
        public boolean f3148j0 = false;

        /* renamed from: k */
        public int f3149k = -1;

        /* renamed from: k0 */
        public int f3150k0 = -1;

        /* renamed from: l */
        public int f3151l = -1;

        /* renamed from: l0 */
        public int f3152l0 = -1;

        /* renamed from: m */
        public int f3153m = -1;

        /* renamed from: m0 */
        public int f3154m0 = -1;

        /* renamed from: n */
        public int f3155n = -1;

        /* renamed from: n0 */
        public int f3156n0 = -1;

        /* renamed from: o */
        public int f3157o = -1;

        /* renamed from: o0 */
        public int f3158o0 = Integer.MIN_VALUE;

        /* renamed from: p */
        public int f3159p = 0;

        /* renamed from: p0 */
        public int f3160p0 = Integer.MIN_VALUE;

        /* renamed from: q */
        public float f3161q = Utils.FLOAT_EPSILON;

        /* renamed from: q0 */
        public float f3162q0 = 0.5f;

        /* renamed from: r */
        public int f3163r = -1;

        /* renamed from: r0 */
        public int f3164r0;

        /* renamed from: s */
        public int f3165s = -1;

        /* renamed from: s0 */
        public int f3166s0;

        /* renamed from: t */
        public int f3167t = -1;

        /* renamed from: t0 */
        public float f3168t0;

        /* renamed from: u */
        public int f3169u = -1;

        /* renamed from: u0 */
        public ConstraintWidget f3170u0 = new ConstraintWidget();

        /* renamed from: v */
        public int f3171v = Integer.MIN_VALUE;

        /* renamed from: v0 */
        public boolean f3172v0 = false;

        /* renamed from: w */
        public int f3173w = Integer.MIN_VALUE;

        /* renamed from: x */
        public int f3174x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f3175y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f3176z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C0529a {

            /* renamed from: a */
            public static final SparseIntArray f3177a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3177a = sparseIntArray;
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(c65.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(c65.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c65.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0529a.f3177a.get(index);
                switch (i2) {
                    case 1:
                        this.f3127Y = obtainStyledAttributes.getInt(index, this.f3127Y);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3157o);
                        this.f3157o = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f3157o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f3159p = obtainStyledAttributes.getDimensionPixelSize(index, this.f3159p);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f3161q) % 360.0f;
                        this.f3161q = f;
                        if (f >= Utils.FLOAT_EPSILON) {
                            break;
                        } else {
                            this.f3161q = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f3129a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3129a);
                        break;
                    case 6:
                        this.f3131b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3131b);
                        break;
                    case 7:
                        this.f3133c = obtainStyledAttributes.getFloat(index, this.f3133c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3135d);
                        this.f3135d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f3135d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3137e);
                        this.f3137e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f3137e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3139f);
                        this.f3139f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f3139f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3141g);
                        this.f3141g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f3141g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3143h);
                        this.f3143h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f3143h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3145i);
                        this.f3145i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f3145i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3147j);
                        this.f3147j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f3147j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3149k);
                        this.f3149k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f3149k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3151l);
                        this.f3151l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f3151l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3163r);
                        this.f3163r = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f3163r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3165s);
                        this.f3165s = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f3165s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3167t);
                        this.f3167t = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f3167t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3169u);
                        this.f3169u = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f3169u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f3171v = obtainStyledAttributes.getDimensionPixelSize(index, this.f3171v);
                        break;
                    case 22:
                        this.f3173w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3173w);
                        break;
                    case 23:
                        this.f3174x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3174x);
                        break;
                    case 24:
                        this.f3175y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3175y);
                        break;
                    case 25:
                        this.f3176z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3176z);
                        break;
                    case 26:
                        this.f3103A = obtainStyledAttributes.getDimensionPixelSize(index, this.f3103A);
                        break;
                    case 27:
                        this.f3128Z = obtainStyledAttributes.getBoolean(index, this.f3128Z);
                        break;
                    case 28:
                        this.f3130a0 = obtainStyledAttributes.getBoolean(index, this.f3130a0);
                        break;
                    case 29:
                        this.f3108F = obtainStyledAttributes.getFloat(index, this.f3108F);
                        break;
                    case 30:
                        this.f3109G = obtainStyledAttributes.getFloat(index, this.f3109G);
                        break;
                    case 31:
                        this.f3117O = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f3118P = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f3119Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3119Q);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f3119Q) != -2) {
                                break;
                            } else {
                                this.f3119Q = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f3121S = obtainStyledAttributes.getDimensionPixelSize(index, this.f3121S);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f3121S) != -2) {
                                break;
                            } else {
                                this.f3121S = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f3123U = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.f3123U));
                        this.f3117O = 2;
                        break;
                    case 36:
                        try {
                            this.f3120R = obtainStyledAttributes.getDimensionPixelSize(index, this.f3120R);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f3120R) != -2) {
                                break;
                            } else {
                                this.f3120R = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f3122T = obtainStyledAttributes.getDimensionPixelSize(index, this.f3122T);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f3122T) != -2) {
                                break;
                            } else {
                                this.f3122T = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f3124V = Math.max(Utils.FLOAT_EPSILON, obtainStyledAttributes.getFloat(index, this.f3124V));
                        this.f3118P = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C0532a.m4191I(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f3113K = obtainStyledAttributes.getFloat(index, this.f3113K);
                                break;
                            case 46:
                                this.f3114L = obtainStyledAttributes.getFloat(index, this.f3114L);
                                break;
                            case 47:
                                this.f3115M = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f3116N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f3125W = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3125W);
                                break;
                            case 50:
                                this.f3126X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3126X);
                                break;
                            case 51:
                                this.f3132b0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f3153m);
                                this.f3153m = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f3153m = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f3155n);
                                this.f3155n = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f3155n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f3105C = obtainStyledAttributes.getDimensionPixelSize(index, this.f3105C);
                                break;
                            case 55:
                                this.f3104B = obtainStyledAttributes.getDimensionPixelSize(index, this.f3104B);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0532a.m4189G(this, obtainStyledAttributes, index, 0);
                                        this.f3106D = true;
                                        break;
                                    case 65:
                                        C0532a.m4189G(this, obtainStyledAttributes, index, 1);
                                        this.f3107E = true;
                                        break;
                                    case 66:
                                        this.f3134c0 = obtainStyledAttributes.getInt(index, this.f3134c0);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo5101c();
        }

        /* renamed from: a */
        public String mo5099a() {
            return this.f3132b0;
        }

        /* renamed from: b */
        public ConstraintWidget mo5100b() {
            return this.f3170u0;
        }

        /* renamed from: c */
        public void mo5101c() {
            this.f3142g0 = false;
            this.f3136d0 = true;
            this.f3138e0 = true;
            int i = this.width;
            if (i == -2 && this.f3128Z) {
                this.f3136d0 = false;
                if (this.f3117O == 0) {
                    this.f3117O = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f3130a0) {
                this.f3138e0 = false;
                if (this.f3118P == 0) {
                    this.f3118P = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f3136d0 = false;
                if (i == 0 && this.f3117O == 1) {
                    this.width = -2;
                    this.f3128Z = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f3138e0 = false;
                if (i2 == 0 && this.f3118P == 1) {
                    this.height = -2;
                    this.f3130a0 = true;
                }
            }
            if (this.f3133c != -1.0f || this.f3129a != -1 || this.f3131b != -1) {
                this.f3142g0 = true;
                this.f3136d0 = true;
                this.f3138e0 = true;
                if (!(this.f3170u0 instanceof C0489f)) {
                    this.f3170u0 = new C0489f();
                }
                ((C0489f) this.f3170u0).mo4551x1(this.f3127Y);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f3154m0 = r4
                r10.f3156n0 = r4
                r10.f3150k0 = r4
                r10.f3152l0 = r4
                int r5 = r10.f3171v
                r10.f3158o0 = r5
                int r5 = r10.f3174x
                r10.f3160p0 = r5
                float r5 = r10.f3108F
                r10.f3162q0 = r5
                int r6 = r10.f3129a
                r10.f3164r0 = r6
                int r7 = r10.f3131b
                r10.f3166s0 = r7
                float r8 = r10.f3133c
                r10.f3168t0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0090
                int r11 = r10.f3163r
                if (r11 == r4) goto L_0x003f
                r10.f3154m0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f3165s
                if (r11 == r4) goto L_0x0046
                r10.f3156n0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f3167t
                if (r11 == r4) goto L_0x004d
                r10.f3152l0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f3169u
                if (r11 == r4) goto L_0x0054
                r10.f3150k0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f3176z
                if (r11 == r9) goto L_0x005a
                r10.f3160p0 = r11
            L_0x005a:
                int r11 = r10.f3103A
                if (r11 == r9) goto L_0x0060
                r10.f3158o0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f3162q0 = r2
            L_0x0068:
                boolean r2 = r10.f3142g0
                if (r2 == 0) goto L_0x00b4
                int r2 = r10.f3127Y
                if (r2 != r3) goto L_0x00b4
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007e
                float r11 = r11 - r8
                r10.f3168t0 = r11
                r10.f3164r0 = r4
                r10.f3166s0 = r4
                goto L_0x00b4
            L_0x007e:
                if (r6 == r4) goto L_0x0087
                r10.f3166s0 = r6
                r10.f3164r0 = r4
                r10.f3168t0 = r2
                goto L_0x00b4
            L_0x0087:
                if (r7 == r4) goto L_0x00b4
                r10.f3164r0 = r7
                r10.f3166s0 = r4
                r10.f3168t0 = r2
                goto L_0x00b4
            L_0x0090:
                int r11 = r10.f3163r
                if (r11 == r4) goto L_0x0096
                r10.f3152l0 = r11
            L_0x0096:
                int r11 = r10.f3165s
                if (r11 == r4) goto L_0x009c
                r10.f3150k0 = r11
            L_0x009c:
                int r11 = r10.f3167t
                if (r11 == r4) goto L_0x00a2
                r10.f3154m0 = r11
            L_0x00a2:
                int r11 = r10.f3169u
                if (r11 == r4) goto L_0x00a8
                r10.f3156n0 = r11
            L_0x00a8:
                int r11 = r10.f3176z
                if (r11 == r9) goto L_0x00ae
                r10.f3158o0 = r11
            L_0x00ae:
                int r11 = r10.f3103A
                if (r11 == r9) goto L_0x00b4
                r10.f3160p0 = r11
            L_0x00b4:
                int r11 = r10.f3167t
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f3169u
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f3165s
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f3163r
                if (r11 != r4) goto L_0x00fe
                int r11 = r10.f3139f
                if (r11 == r4) goto L_0x00d3
                r10.f3154m0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e1
                if (r1 <= 0) goto L_0x00e1
                r10.rightMargin = r1
                goto L_0x00e1
            L_0x00d3:
                int r11 = r10.f3141g
                if (r11 == r4) goto L_0x00e1
                r10.f3156n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e1
                if (r1 <= 0) goto L_0x00e1
                r10.rightMargin = r1
            L_0x00e1:
                int r11 = r10.f3135d
                if (r11 == r4) goto L_0x00f0
                r10.f3150k0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                r10.leftMargin = r0
                goto L_0x00fe
            L_0x00f0:
                int r11 = r10.f3137e
                if (r11 == r4) goto L_0x00fe
                r10.f3152l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x00fe
                if (r0 <= 0) goto L_0x00fe
                r10.leftMargin = r0
            L_0x00fe:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
