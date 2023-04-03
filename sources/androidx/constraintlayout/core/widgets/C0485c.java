package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.widgets.c */
/* compiled from: ChainHead */
public class C0485c {

    /* renamed from: a */
    public ConstraintWidget f2497a;

    /* renamed from: b */
    public ConstraintWidget f2498b;

    /* renamed from: c */
    public ConstraintWidget f2499c;

    /* renamed from: d */
    public ConstraintWidget f2500d;

    /* renamed from: e */
    public ConstraintWidget f2501e;

    /* renamed from: f */
    public ConstraintWidget f2502f;

    /* renamed from: g */
    public ConstraintWidget f2503g;

    /* renamed from: h */
    public ArrayList<ConstraintWidget> f2504h;

    /* renamed from: i */
    public int f2505i;

    /* renamed from: j */
    public int f2506j;

    /* renamed from: k */
    public float f2507k = Utils.FLOAT_EPSILON;

    /* renamed from: l */
    public int f2508l;

    /* renamed from: m */
    public int f2509m;

    /* renamed from: n */
    public int f2510n;

    /* renamed from: o */
    public boolean f2511o;

    /* renamed from: p */
    public int f2512p;

    /* renamed from: q */
    public boolean f2513q;

    /* renamed from: r */
    public boolean f2514r;

    /* renamed from: s */
    public boolean f2515s;

    /* renamed from: t */
    public boolean f2516t;

    /* renamed from: u */
    public boolean f2517u;

    /* renamed from: v */
    public boolean f2518v;

    public C0485c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2497a = constraintWidget;
        this.f2512p = i;
        this.f2513q = z;
    }

    /* renamed from: c */
    public static boolean m3631c(ConstraintWidget constraintWidget, int i) {
        int i2;
        if (constraintWidget.mo4367U() != 8 && constraintWidget.f2408a0[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && ((i2 = constraintWidget.f2453x[i]) == 0 || i2 == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo4472a() {
        if (!this.f2518v) {
            mo4473b();
        }
        this.f2518v = true;
    }

    /* renamed from: b */
    public final void mo4473b() {
        int i = this.f2512p * 2;
        ConstraintWidget constraintWidget = this.f2497a;
        boolean z = true;
        this.f2511o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f2505i++;
            ConstraintWidget[] constraintWidgetArr = constraintWidget.f2391O0;
            int i2 = this.f2512p;
            ConstraintWidget constraintWidget3 = null;
            constraintWidgetArr[i2] = null;
            constraintWidget.f2389N0[i2] = null;
            if (constraintWidget.mo4367U() != 8) {
                this.f2508l++;
                ConstraintWidget.DimensionBehaviour w = constraintWidget.mo4435w(this.f2512p);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (w != dimensionBehaviour) {
                    this.f2509m += constraintWidget.mo4339G(this.f2512p);
                }
                int f = this.f2509m + constraintWidget.f2404X[i].mo4310f();
                this.f2509m = f;
                int i3 = i + 1;
                this.f2509m = f + constraintWidget.f2404X[i3].mo4310f();
                int f2 = this.f2510n + constraintWidget.f2404X[i].mo4310f();
                this.f2510n = f2;
                this.f2510n = f2 + constraintWidget.f2404X[i3].mo4310f();
                if (this.f2498b == null) {
                    this.f2498b = constraintWidget;
                }
                this.f2500d = constraintWidget;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f2408a0;
                int i4 = this.f2512p;
                if (dimensionBehaviourArr[i4] == dimensionBehaviour) {
                    int i5 = constraintWidget.f2453x[i4];
                    if (i5 == 0 || i5 == 3 || i5 == 2) {
                        this.f2506j++;
                        float f3 = constraintWidget.f2387M0[i4];
                        if (f3 > Utils.FLOAT_EPSILON) {
                            this.f2507k += f3;
                        }
                        if (m3631c(constraintWidget, i4)) {
                            if (f3 < Utils.FLOAT_EPSILON) {
                                this.f2514r = true;
                            } else {
                                this.f2515s = true;
                            }
                            if (this.f2504h == null) {
                                this.f2504h = new ArrayList<>();
                            }
                            this.f2504h.add(constraintWidget);
                        }
                        if (this.f2502f == null) {
                            this.f2502f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f2503g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.f2389N0[this.f2512p] = constraintWidget;
                        }
                        this.f2503g = constraintWidget;
                    }
                    if (this.f2512p == 0) {
                        if (constraintWidget.f2449v != 0) {
                            this.f2511o = false;
                        } else if (!(constraintWidget.f2455y == 0 && constraintWidget.f2457z == 0)) {
                            this.f2511o = false;
                        }
                    } else if (constraintWidget.f2451w != 0) {
                        this.f2511o = false;
                    } else if (!(constraintWidget.f2364B == 0 && constraintWidget.f2366C == 0)) {
                        this.f2511o = false;
                    }
                    if (constraintWidget.f2416e0 != Utils.FLOAT_EPSILON) {
                        this.f2511o = false;
                        this.f2517u = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.f2391O0[this.f2512p] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f2404X[i + 1].f2355f;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f2353d;
                ConstraintAnchor constraintAnchor2 = constraintWidget5.f2404X[i].f2355f;
                if (constraintAnchor2 != null && constraintAnchor2.f2353d == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f2498b;
        if (constraintWidget6 != null) {
            this.f2509m -= constraintWidget6.f2404X[i].mo4310f();
        }
        ConstraintWidget constraintWidget7 = this.f2500d;
        if (constraintWidget7 != null) {
            this.f2509m -= constraintWidget7.f2404X[i + 1].mo4310f();
        }
        this.f2499c = constraintWidget;
        if (this.f2512p != 0 || !this.f2513q) {
            this.f2501e = this.f2497a;
        } else {
            this.f2501e = constraintWidget;
        }
        if (!this.f2515s || !this.f2514r) {
            z = false;
        }
        this.f2516t = z;
    }
}
