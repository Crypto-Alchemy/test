package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0467c;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.C0480c;
import androidx.constraintlayout.core.widgets.analyzer.C0482d;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {

    /* renamed from: T0 */
    public static float f2361T0 = 0.5f;

    /* renamed from: A */
    public float f2362A = 1.0f;

    /* renamed from: A0 */
    public int f2363A0;

    /* renamed from: B */
    public int f2364B = 0;

    /* renamed from: B0 */
    public boolean f2365B0;

    /* renamed from: C */
    public int f2366C = 0;

    /* renamed from: C0 */
    public boolean f2367C0;

    /* renamed from: D */
    public float f2368D = 1.0f;

    /* renamed from: D0 */
    public boolean f2369D0;

    /* renamed from: E */
    public boolean f2370E;

    /* renamed from: E0 */
    public boolean f2371E0;

    /* renamed from: F */
    public boolean f2372F;

    /* renamed from: F0 */
    public boolean f2373F0;

    /* renamed from: G */
    public int f2374G = -1;

    /* renamed from: G0 */
    public boolean f2375G0;

    /* renamed from: H */
    public float f2376H = 1.0f;

    /* renamed from: H0 */
    public boolean f2377H0;

    /* renamed from: I */
    public int[] f2378I = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: I0 */
    public int f2379I0;

    /* renamed from: J */
    public float f2380J = Utils.FLOAT_EPSILON;

    /* renamed from: J0 */
    public int f2381J0;

    /* renamed from: K */
    public boolean f2382K = false;

    /* renamed from: K0 */
    public boolean f2383K0;

    /* renamed from: L */
    public boolean f2384L;

    /* renamed from: L0 */
    public boolean f2385L0;

    /* renamed from: M */
    public boolean f2386M = false;

    /* renamed from: M0 */
    public float[] f2387M0;

    /* renamed from: N */
    public int f2388N = 0;

    /* renamed from: N0 */
    public ConstraintWidget[] f2389N0;

    /* renamed from: O */
    public int f2390O = 0;

    /* renamed from: O0 */
    public ConstraintWidget[] f2391O0;

    /* renamed from: P */
    public ConstraintAnchor f2392P = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);

    /* renamed from: P0 */
    public ConstraintWidget f2393P0;

    /* renamed from: Q */
    public ConstraintAnchor f2394Q = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);

    /* renamed from: Q0 */
    public ConstraintWidget f2395Q0;

    /* renamed from: R */
    public ConstraintAnchor f2396R = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);

    /* renamed from: R0 */
    public int f2397R0;

    /* renamed from: S */
    public ConstraintAnchor f2398S = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);

    /* renamed from: S0 */
    public int f2399S0;

    /* renamed from: T */
    public ConstraintAnchor f2400T = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);

    /* renamed from: U */
    public ConstraintAnchor f2401U = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);

    /* renamed from: V */
    public ConstraintAnchor f2402V = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);

    /* renamed from: W */
    public ConstraintAnchor f2403W;

    /* renamed from: X */
    public ConstraintAnchor[] f2404X;

    /* renamed from: Y */
    public ArrayList<ConstraintAnchor> f2405Y;

    /* renamed from: Z */
    public boolean[] f2406Z;

    /* renamed from: a */
    public boolean f2407a = false;

    /* renamed from: a0 */
    public DimensionBehaviour[] f2408a0;

    /* renamed from: b */
    public WidgetRun[] f2409b = new WidgetRun[2];

    /* renamed from: b0 */
    public ConstraintWidget f2410b0;

    /* renamed from: c */
    public ad0 f2411c;

    /* renamed from: c0 */
    public int f2412c0;

    /* renamed from: d */
    public ad0 f2413d;

    /* renamed from: d0 */
    public int f2414d0;

    /* renamed from: e */
    public C0480c f2415e = null;

    /* renamed from: e0 */
    public float f2416e0;

    /* renamed from: f */
    public C0482d f2417f = null;

    /* renamed from: f0 */
    public int f2418f0;

    /* renamed from: g */
    public boolean[] f2419g = {true, true};

    /* renamed from: g0 */
    public int f2420g0;

    /* renamed from: h */
    public boolean f2421h = false;

    /* renamed from: h0 */
    public int f2422h0;

    /* renamed from: i */
    public boolean f2423i = true;

    /* renamed from: i0 */
    public int f2424i0;

    /* renamed from: j */
    public boolean f2425j = false;

    /* renamed from: j0 */
    public int f2426j0;

    /* renamed from: k */
    public boolean f2427k = true;

    /* renamed from: k0 */
    public int f2428k0;

    /* renamed from: l */
    public int f2429l = -1;

    /* renamed from: l0 */
    public int f2430l0;

    /* renamed from: m */
    public int f2431m = -1;

    /* renamed from: m0 */
    public int f2432m0;

    /* renamed from: n */
    public wk7 f2433n = new wk7(this);

    /* renamed from: n0 */
    public int f2434n0;

    /* renamed from: o */
    public boolean f2435o = false;

    /* renamed from: o0 */
    public int f2436o0;

    /* renamed from: p */
    public boolean f2437p = false;

    /* renamed from: p0 */
    public float f2438p0;

    /* renamed from: q */
    public boolean f2439q = false;

    /* renamed from: q0 */
    public float f2440q0;

    /* renamed from: r */
    public boolean f2441r = false;

    /* renamed from: r0 */
    public Object f2442r0;

    /* renamed from: s */
    public int f2443s = -1;

    /* renamed from: s0 */
    public int f2444s0;

    /* renamed from: t */
    public int f2445t = -1;

    /* renamed from: t0 */
    public int f2446t0;

    /* renamed from: u */
    public int f2447u = 0;

    /* renamed from: u0 */
    public boolean f2448u0;

    /* renamed from: v */
    public int f2449v = 0;

    /* renamed from: v0 */
    public String f2450v0;

    /* renamed from: w */
    public int f2451w = 0;

    /* renamed from: w0 */
    public String f2452w0;

    /* renamed from: x */
    public int[] f2453x = new int[2];

    /* renamed from: x0 */
    public int f2454x0;

    /* renamed from: y */
    public int f2455y = 0;

    /* renamed from: y0 */
    public int f2456y0;

    /* renamed from: z */
    public int f2457z = 0;

    /* renamed from: z0 */
    public int f2458z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$a */
    public static /* synthetic */ class C0475a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2460a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f2461b;

        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008f */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2461b = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2461b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2461b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f2461b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f2460a = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f2460a     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x0062 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x0083 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f2460a     // Catch:{ NoSuchFieldError -> 0x009b }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x009b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009b }
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.C0475a.<clinit>():void");
        }
    }

    public ConstraintWidget() {
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.f2403W = constraintAnchor;
        this.f2404X = new ConstraintAnchor[]{this.f2392P, this.f2396R, this.f2394Q, this.f2398S, this.f2400T, constraintAnchor};
        this.f2405Y = new ArrayList<>();
        this.f2406Z = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.f2408a0 = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.f2410b0 = null;
        this.f2412c0 = 0;
        this.f2414d0 = 0;
        this.f2416e0 = Utils.FLOAT_EPSILON;
        this.f2418f0 = -1;
        this.f2420g0 = 0;
        this.f2422h0 = 0;
        this.f2424i0 = 0;
        this.f2426j0 = 0;
        this.f2428k0 = 0;
        this.f2430l0 = 0;
        this.f2432m0 = 0;
        float f = f2361T0;
        this.f2438p0 = f;
        this.f2440q0 = f;
        this.f2444s0 = 0;
        this.f2446t0 = 0;
        this.f2448u0 = false;
        this.f2450v0 = null;
        this.f2452w0 = null;
        this.f2377H0 = false;
        this.f2379I0 = 0;
        this.f2381J0 = 0;
        this.f2387M0 = new float[]{-1.0f, -1.0f};
        this.f2389N0 = new ConstraintWidget[]{null, null};
        this.f2391O0 = new ConstraintWidget[]{null, null};
        this.f2393P0 = null;
        this.f2395Q0 = null;
        this.f2397R0 = -1;
        this.f2399S0 = -1;
        mo4385d();
    }

    /* renamed from: A */
    public float mo4327A() {
        return this.f2438p0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* renamed from: A0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4328A0(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x008e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000b
            goto L_0x008e
        L_0x000b:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L_0x0037
            int r6 = r2 + -1
            if (r3 >= r6) goto L_0x0037
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x002c
            r1 = r4
            goto L_0x0035
        L_0x002c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0035
            r1 = r5
        L_0x0035:
            int r4 = r3 + 1
        L_0x0037:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L_0x0075
            int r2 = r2 - r5
            if (r3 >= r2) goto L_0x0075
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L_0x0084
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x0084
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x0084
            if (r1 != r5) goto L_0x006f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x006f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0075:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L_0x0084
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0084 }
            goto L_0x0085
        L_0x0084:
            r9 = r0
        L_0x0085:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            r8.f2416e0 = r9
            r8.f2418f0 = r1
        L_0x008d:
            return
        L_0x008e:
            r8.f2416e0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4328A0(java.lang.String):void");
    }

    /* renamed from: B */
    public int mo4329B() {
        return this.f2379I0;
    }

    /* renamed from: B0 */
    public void mo4330B0(int i) {
        if (this.f2382K) {
            int i2 = i - this.f2432m0;
            int i3 = this.f2414d0 + i2;
            this.f2422h0 = i2;
            this.f2394Q.mo4324t(i2);
            this.f2398S.mo4324t(i3);
            this.f2400T.mo4324t(i);
            this.f2437p = true;
        }
    }

    /* renamed from: C */
    public DimensionBehaviour mo4331C() {
        return this.f2408a0[0];
    }

    /* renamed from: C0 */
    public void mo4332C0(int i, int i2) {
        if (!this.f2435o) {
            this.f2392P.mo4324t(i);
            this.f2396R.mo4324t(i2);
            this.f2420g0 = i;
            this.f2412c0 = i2 - i;
            this.f2435o = true;
        }
    }

    /* renamed from: D */
    public int mo4333D() {
        ConstraintAnchor constraintAnchor = this.f2392P;
        int i = 0;
        if (constraintAnchor != null) {
            i = 0 + constraintAnchor.f2356g;
        }
        ConstraintAnchor constraintAnchor2 = this.f2396R;
        if (constraintAnchor2 != null) {
            return i + constraintAnchor2.f2356g;
        }
        return i;
    }

    /* renamed from: D0 */
    public void mo4334D0(int i) {
        this.f2392P.mo4324t(i);
        this.f2420g0 = i;
    }

    /* renamed from: E */
    public int mo4335E() {
        return this.f2388N;
    }

    /* renamed from: E0 */
    public void mo4336E0(int i) {
        this.f2394Q.mo4324t(i);
        this.f2422h0 = i;
    }

    /* renamed from: F */
    public int mo4337F() {
        return this.f2390O;
    }

    /* renamed from: F0 */
    public void mo4338F0(int i, int i2) {
        if (!this.f2437p) {
            this.f2394Q.mo4324t(i);
            this.f2398S.mo4324t(i2);
            this.f2422h0 = i;
            this.f2414d0 = i2 - i;
            if (this.f2382K) {
                this.f2400T.mo4324t(i + this.f2432m0);
            }
            this.f2437p = true;
        }
    }

    /* renamed from: G */
    public int mo4339G(int i) {
        if (i == 0) {
            return mo4369V();
        }
        if (i == 1) {
            return mo4441z();
        }
        return 0;
    }

    /* renamed from: G0 */
    public void mo4340G0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.f2420g0 = i;
        this.f2422h0 = i2;
        if (this.f2446t0 == 8) {
            this.f2412c0 = 0;
            this.f2414d0 = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.f2408a0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i7 < (i6 = this.f2412c0)) {
            i7 = i6;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i8 < (i5 = this.f2414d0)) {
            i8 = i5;
        }
        this.f2412c0 = i7;
        this.f2414d0 = i8;
        int i9 = this.f2436o0;
        if (i8 < i9) {
            this.f2414d0 = i9;
        }
        int i10 = this.f2434n0;
        if (i7 < i10) {
            this.f2412c0 = i10;
        }
        int i11 = this.f2457z;
        if (i11 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f2412c0 = Math.min(this.f2412c0, i11);
        }
        int i12 = this.f2366C;
        if (i12 > 0 && this.f2408a0[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.f2414d0 = Math.min(this.f2414d0, i12);
        }
        int i13 = this.f2412c0;
        if (i7 != i13) {
            this.f2429l = i13;
        }
        int i14 = this.f2414d0;
        if (i8 != i14) {
            this.f2431m = i14;
        }
    }

    /* renamed from: H */
    public int mo4341H() {
        return this.f2378I[1];
    }

    /* renamed from: H0 */
    public void mo4342H0(boolean z) {
        this.f2382K = z;
    }

    /* renamed from: I */
    public int mo4343I() {
        return this.f2378I[0];
    }

    /* renamed from: I0 */
    public void mo4344I0(int i) {
        this.f2414d0 = i;
        int i2 = this.f2436o0;
        if (i < i2) {
            this.f2414d0 = i2;
        }
    }

    /* renamed from: J */
    public int mo4345J() {
        return this.f2436o0;
    }

    /* renamed from: J0 */
    public void mo4346J0(float f) {
        this.f2438p0 = f;
    }

    /* renamed from: K */
    public int mo4347K() {
        return this.f2434n0;
    }

    /* renamed from: K0 */
    public void mo4348K0(int i) {
        this.f2379I0 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f2398S;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget mo4349L(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2396R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2355f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2355f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2353d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2355f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2355f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2353d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4349L(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* renamed from: L0 */
    public void mo4350L0(int i, int i2) {
        this.f2420g0 = i;
        int i3 = i2 - i;
        this.f2412c0 = i3;
        int i4 = this.f2434n0;
        if (i3 < i4) {
            this.f2412c0 = i4;
        }
    }

    /* renamed from: M */
    public ConstraintWidget mo4351M() {
        return this.f2410b0;
    }

    /* renamed from: M0 */
    public void mo4352M0(DimensionBehaviour dimensionBehaviour) {
        this.f2408a0[0] = dimensionBehaviour;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.f2394Q;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget mo4353N(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2355f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2355f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2353d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f2355f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2355f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2353d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4353N(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* renamed from: N0 */
    public void mo4354N0(int i, int i2, int i3, float f) {
        this.f2449v = i;
        this.f2455y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2457z = i3;
        this.f2362A = f;
        if (f > Utils.FLOAT_EPSILON && f < 1.0f && i == 0) {
            this.f2449v = 2;
        }
    }

    /* renamed from: O */
    public int mo4355O() {
        return mo4371W() + this.f2412c0;
    }

    /* renamed from: O0 */
    public void mo4356O0(float f) {
        this.f2387M0[0] = f;
    }

    /* renamed from: P */
    public WidgetRun mo4357P(int i) {
        if (i == 0) {
            return this.f2415e;
        }
        if (i == 1) {
            return this.f2417f;
        }
        return null;
    }

    /* renamed from: P0 */
    public void mo4358P0(int i, boolean z) {
        this.f2406Z[i] = z;
    }

    /* renamed from: Q */
    public float mo4359Q() {
        return this.f2440q0;
    }

    /* renamed from: Q0 */
    public void mo4360Q0(boolean z) {
        this.f2384L = z;
    }

    /* renamed from: R */
    public int mo4361R() {
        return this.f2381J0;
    }

    /* renamed from: R0 */
    public void mo4362R0(boolean z) {
        this.f2386M = z;
    }

    /* renamed from: S */
    public DimensionBehaviour mo4363S() {
        return this.f2408a0[1];
    }

    /* renamed from: S0 */
    public void mo4364S0(int i, int i2) {
        this.f2388N = i;
        this.f2390O = i2;
        mo4370V0(false);
    }

    /* renamed from: T */
    public int mo4365T() {
        int i = 0;
        if (this.f2392P != null) {
            i = 0 + this.f2394Q.f2356g;
        }
        if (this.f2396R != null) {
            return i + this.f2398S.f2356g;
        }
        return i;
    }

    /* renamed from: T0 */
    public void mo4366T0(int i) {
        this.f2378I[1] = i;
    }

    /* renamed from: U */
    public int mo4367U() {
        return this.f2446t0;
    }

    /* renamed from: U0 */
    public void mo4368U0(int i) {
        this.f2378I[0] = i;
    }

    /* renamed from: V */
    public int mo4369V() {
        if (this.f2446t0 == 8) {
            return 0;
        }
        return this.f2412c0;
    }

    /* renamed from: V0 */
    public void mo4370V0(boolean z) {
        this.f2423i = z;
    }

    /* renamed from: W */
    public int mo4371W() {
        ConstraintWidget constraintWidget = this.f2410b0;
        if (constraintWidget == null || !(constraintWidget instanceof C0486d)) {
            return this.f2420g0;
        }
        return ((C0486d) constraintWidget).f2525b1 + this.f2420g0;
    }

    /* renamed from: W0 */
    public void mo4372W0(int i) {
        if (i < 0) {
            this.f2436o0 = 0;
        } else {
            this.f2436o0 = i;
        }
    }

    /* renamed from: X */
    public int mo4373X() {
        ConstraintWidget constraintWidget = this.f2410b0;
        if (constraintWidget == null || !(constraintWidget instanceof C0486d)) {
            return this.f2422h0;
        }
        return ((C0486d) constraintWidget).f2526c1 + this.f2422h0;
    }

    /* renamed from: X0 */
    public void mo4374X0(int i) {
        if (i < 0) {
            this.f2434n0 = 0;
        } else {
            this.f2434n0 = i;
        }
    }

    /* renamed from: Y */
    public boolean mo4375Y() {
        return this.f2382K;
    }

    /* renamed from: Y0 */
    public void mo4376Y0(int i, int i2) {
        this.f2420g0 = i;
        this.f2422h0 = i2;
    }

    /* renamed from: Z */
    public boolean mo4377Z(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.f2392P.f2355f != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.f2396R.f2355f != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.f2394Q.f2355f != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.f2398S.f2355f != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.f2400T.f2355f != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    /* renamed from: Z0 */
    public void mo4378Z0(ConstraintWidget constraintWidget) {
        this.f2410b0 = constraintWidget;
    }

    /* renamed from: a0 */
    public boolean mo4379a0() {
        int size = this.f2405Y.size();
        for (int i = 0; i < size; i++) {
            if (this.f2405Y.get(i).mo4317m()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a1 */
    public void mo4380a1(float f) {
        this.f2440q0 = f;
    }

    /* renamed from: b0 */
    public boolean mo4381b0() {
        if (this.f2429l == -1 && this.f2431m == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b1 */
    public void mo4382b1(int i) {
        this.f2381J0 = i;
    }

    /* renamed from: c0 */
    public boolean mo4383c0(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i == 0) {
            ConstraintAnchor constraintAnchor3 = this.f2392P.f2355f;
            if (constraintAnchor3 != null && constraintAnchor3.mo4318n() && (constraintAnchor2 = this.f2396R.f2355f) != null && constraintAnchor2.mo4318n()) {
                if ((this.f2396R.f2355f.mo4309e() - this.f2396R.mo4310f()) - (this.f2392P.f2355f.mo4309e() + this.f2392P.mo4310f()) >= i2) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.f2394Q.f2355f;
            if (constraintAnchor4 != null && constraintAnchor4.mo4318n() && (constraintAnchor = this.f2398S.f2355f) != null && constraintAnchor.mo4318n()) {
                if ((this.f2398S.f2355f.mo4309e() - this.f2398S.mo4310f()) - (this.f2394Q.f2355f.mo4309e() + this.f2394Q.mo4310f()) >= i2) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c1 */
    public void mo4384c1(int i, int i2) {
        this.f2422h0 = i;
        int i3 = i2 - i;
        this.f2414d0 = i3;
        int i4 = this.f2436o0;
        if (i3 < i4) {
            this.f2414d0 = i4;
        }
    }

    /* renamed from: d */
    public final void mo4385d() {
        this.f2405Y.add(this.f2392P);
        this.f2405Y.add(this.f2394Q);
        this.f2405Y.add(this.f2396R);
        this.f2405Y.add(this.f2398S);
        this.f2405Y.add(this.f2401U);
        this.f2405Y.add(this.f2402V);
        this.f2405Y.add(this.f2403W);
        this.f2405Y.add(this.f2400T);
    }

    /* renamed from: d0 */
    public void mo4386d0(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        mo4422q(type).mo4306b(constraintWidget.mo4422q(type2), i, i2, true);
    }

    /* renamed from: d1 */
    public void mo4387d1(DimensionBehaviour dimensionBehaviour) {
        this.f2408a0[1] = dimensionBehaviour;
    }

    /* renamed from: e */
    public void mo4388e(C0486d dVar, C0467c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (hashSet.contains(this)) {
                C0491g.m3745a(dVar, cVar, this);
                hashSet.remove(this);
                mo4394g(cVar, dVar.mo4489Q1(64));
            } else {
                return;
            }
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> d = this.f2392P.mo4308d();
            if (d != null) {
                Iterator<ConstraintAnchor> it = d.iterator();
                while (it.hasNext()) {
                    it.next().f2353d.mo4388e(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> d2 = this.f2396R.mo4308d();
            if (d2 != null) {
                Iterator<ConstraintAnchor> it2 = d2.iterator();
                while (it2.hasNext()) {
                    it2.next().f2353d.mo4388e(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> d3 = this.f2394Q.mo4308d();
        if (d3 != null) {
            Iterator<ConstraintAnchor> it3 = d3.iterator();
            while (it3.hasNext()) {
                it3.next().f2353d.mo4388e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> d4 = this.f2398S.mo4308d();
        if (d4 != null) {
            Iterator<ConstraintAnchor> it4 = d4.iterator();
            while (it4.hasNext()) {
                it4.next().f2353d.mo4388e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> d5 = this.f2400T.mo4308d();
        if (d5 != null) {
            Iterator<ConstraintAnchor> it5 = d5.iterator();
            while (it5.hasNext()) {
                it5.next().f2353d.mo4388e(dVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
     */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4389e0(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r4.f2404X
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.f2355f
            r3 = 1
            if (r2 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r5.f2355f
            if (r0 == 0) goto L_0x001b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2355f
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4389e0(int):boolean");
    }

    /* renamed from: e1 */
    public void mo4390e1(int i, int i2, int i3, float f) {
        this.f2451w = i;
        this.f2364B = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f2366C = i3;
        this.f2368D = f;
        if (f > Utils.FLOAT_EPSILON && f < 1.0f && i == 0) {
            this.f2451w = 2;
        }
    }

    /* renamed from: f */
    public boolean mo4391f() {
        if ((this instanceof C0493i) || (this instanceof C0489f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public boolean mo4392f0() {
        return this.f2439q;
    }

    /* renamed from: f1 */
    public void mo4393f1(float f) {
        this.f2387M0[1] = f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0487  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x04a4  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x053b  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0584  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x05b9  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4394g(androidx.constraintlayout.core.C0467c r54, boolean r55) {
        /*
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2392P
            androidx.constraintlayout.core.SolverVariable r13 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2396R
            androidx.constraintlayout.core.SolverVariable r12 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2394Q
            androidx.constraintlayout.core.SolverVariable r11 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2398S
            androidx.constraintlayout.core.SolverVariable r10 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2400T
            androidx.constraintlayout.core.SolverVariable r9 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0055
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.f2408a0
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.f2408a0
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.f2447u
            if (r3 == r7) goto L_0x0052
            if (r3 == r8) goto L_0x004f
            if (r3 == r1) goto L_0x0055
            r5 = r0
            r4 = r2
            goto L_0x0057
        L_0x004f:
            r5 = r0
            r4 = r6
            goto L_0x0057
        L_0x0052:
            r4 = r2
            r5 = r6
            goto L_0x0057
        L_0x0055:
            r4 = r6
            r5 = r4
        L_0x0057:
            int r0 = r15.f2446t0
            r3 = 8
            if (r0 != r3) goto L_0x0072
            boolean r0 = r15.f2448u0
            if (r0 != 0) goto L_0x0072
            boolean r0 = r53.mo4379a0()
            if (r0 != 0) goto L_0x0072
            boolean[] r0 = r15.f2406Z
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x0072
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            boolean r0 = r15.f2435o
            r2 = 5
            if (r0 != 0) goto L_0x007b
            boolean r8 = r15.f2437p
            if (r8 == 0) goto L_0x00f8
        L_0x007b:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f2420g0
            r14.mo4268f(r13, r0)
            int r0 = r15.f2420g0
            int r8 = r15.f2412c0
            int r0 = r0 + r8
            r14.mo4268f(r12, r0)
            if (r4 == 0) goto L_0x00aa
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x00aa
            boolean r8 = r15.f2427k
            if (r8 == 0) goto L_0x00a1
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0486d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f2392P
            r0.mo4502w1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f2396R
            r0.mo4501v1(r8)
            goto L_0x00aa
        L_0x00a1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396R
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r14.mo4270h(r0, r12, r6, r2)
        L_0x00aa:
            boolean r0 = r15.f2437p
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.f2422h0
            r14.mo4268f(r11, r0)
            int r0 = r15.f2422h0
            int r8 = r15.f2414d0
            int r0 = r0 + r8
            r14.mo4268f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2400T
            boolean r0 = r0.mo4317m()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f2422h0
            int r8 = r15.f2432m0
            int r0 = r0 + r8
            r14.mo4268f(r9, r0)
        L_0x00cb:
            if (r5 == 0) goto L_0x00eb
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r15.f2427k
            if (r8 == 0) goto L_0x00e2
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0486d) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f2394Q
            r0.mo4475B1(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.f2398S
            r0.mo4474A1(r8)
            goto L_0x00eb
        L_0x00e2:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2398S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r14.mo4270h(r0, r10, r6, r2)
        L_0x00eb:
            boolean r0 = r15.f2435o
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.f2437p
            if (r0 == 0) goto L_0x00f8
            r15.f2435o = r6
            r15.f2437p = r6
            return
        L_0x00f8:
            boolean r0 = androidx.constraintlayout.core.C0467c.f2300r
            if (r55 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2415e
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.d r8 = r15.f2417f
            if (r8 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f2486h
            boolean r1 = r2.f2475j
            if (r1 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2486h
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x0180
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r8.f2487i
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x0180
            int r0 = r2.f2472g
            r14.mo4268f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2415e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            int r0 = r0.f2472g
            r14.mo4268f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2486h
            int r0 = r0.f2472g
            r14.mo4268f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            int r0 = r0.f2472g
            r14.mo4268f(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2494k
            int r0 = r0.f2472g
            r14.mo4268f(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x017b
            if (r4 == 0) goto L_0x0162
            boolean[] r0 = r15.f2419g
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0162
            boolean r0 = r53.mo4398h0()
            if (r0 != 0) goto L_0x0162
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396R
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r14.mo4270h(r0, r12, r6, r3)
        L_0x0162:
            if (r5 == 0) goto L_0x017b
            boolean[] r0 = r15.f2419g
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x017b
            boolean r0 = r53.mo4404j0()
            if (r0 != 0) goto L_0x017b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2398S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r14.mo4270h(r0, r10, r6, r3)
        L_0x017b:
            r15.f2435o = r6
            r15.f2437p = r6
            return
        L_0x0180:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r15.mo4389e0(r6)
            if (r0 == 0) goto L_0x0193
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            androidx.constraintlayout.core.widgets.d r0 = (androidx.constraintlayout.core.widgets.C0486d) r0
            r0.mo4498s1(r15, r6)
            r0 = r7
            goto L_0x0197
        L_0x0193:
            boolean r0 = r53.mo4398h0()
        L_0x0197:
            boolean r1 = r15.mo4389e0(r7)
            if (r1 == 0) goto L_0x01a6
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r15.f2410b0
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.C0486d) r1
            r1.mo4498s1(r15, r7)
            r1 = r7
            goto L_0x01aa
        L_0x01a6:
            boolean r1 = r53.mo4404j0()
        L_0x01aa:
            if (r0 != 0) goto L_0x01c9
            if (r4 == 0) goto L_0x01c9
            int r2 = r15.f2446t0
            if (r2 == r3) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 != 0) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2396R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 != 0) goto L_0x01c9
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2396R
            androidx.constraintlayout.core.SolverVariable r2 = r14.mo4279q(r2)
            r14.mo4270h(r2, r12, r6, r7)
        L_0x01c9:
            if (r1 != 0) goto L_0x01ec
            if (r5 == 0) goto L_0x01ec
            int r2 = r15.f2446t0
            if (r2 == r3) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2398S
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2355f
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2400T
            if (r2 != 0) goto L_0x01ec
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.f2398S
            androidx.constraintlayout.core.SolverVariable r2 = r14.mo4279q(r2)
            r14.mo4270h(r2, r10, r6, r7)
        L_0x01ec:
            r29 = r0
            r28 = r1
            goto L_0x01f5
        L_0x01f1:
            r28 = r6
            r29 = r28
        L_0x01f5:
            int r0 = r15.f2412c0
            int r1 = r15.f2434n0
            if (r0 >= r1) goto L_0x01fc
            goto L_0x01fd
        L_0x01fc:
            r1 = r0
        L_0x01fd:
            int r2 = r15.f2414d0
            int r8 = r15.f2436o0
            if (r2 >= r8) goto L_0x0204
            goto L_0x0205
        L_0x0204:
            r8 = r2
        L_0x0205:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r15.f2408a0
            r7 = r3[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r7 == r6) goto L_0x0211
            r1 = 1
            goto L_0x0212
        L_0x0211:
            r1 = 0
        L_0x0212:
            r20 = 1
            r3 = r3[r20]
            r23 = r8
            r27 = r9
            if (r3 == r6) goto L_0x021e
            r8 = 1
            goto L_0x021f
        L_0x021e:
            r8 = 0
        L_0x021f:
            int r9 = r15.f2418f0
            r15.f2374G = r9
            r30 = r10
            float r10 = r15.f2416e0
            r15.f2376H = r10
            r31 = r11
            int r11 = r15.f2449v
            r32 = r12
            int r12 = r15.f2451w
            r24 = 0
            int r24 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
            r25 = 4
            r33 = r13
            if (r24 <= 0) goto L_0x029f
            int r13 = r15.f2446t0
            r14 = 8
            if (r13 == r14) goto L_0x029f
            if (r7 != r6) goto L_0x0246
            if (r11 != 0) goto L_0x0246
            r11 = 3
        L_0x0246:
            if (r3 != r6) goto L_0x024b
            if (r12 != 0) goto L_0x024b
            r12 = 3
        L_0x024b:
            if (r7 != r6) goto L_0x0258
            if (r3 != r6) goto L_0x0258
            r13 = 3
            if (r11 != r13) goto L_0x0259
            if (r12 != r13) goto L_0x0259
            r15.mo4411l1(r4, r5, r1, r8)
            goto L_0x0295
        L_0x0258:
            r13 = 3
        L_0x0259:
            if (r7 != r6) goto L_0x0271
            if (r11 != r13) goto L_0x0271
            r1 = 0
            r15.f2374G = r1
            float r0 = (float) r2
            float r10 = r10 * r0
            int r1 = (int) r10
            if (r3 == r6) goto L_0x026c
            r35 = r12
            r34 = r23
            r36 = r25
            goto L_0x02a7
        L_0x026c:
            r36 = r11
            r35 = r12
            goto L_0x029b
        L_0x0271:
            if (r3 != r6) goto L_0x0295
            if (r12 != r13) goto L_0x0295
            r1 = 1
            r15.f2374G = r1
            r1 = -1
            if (r9 != r1) goto L_0x0280
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r10
            r15.f2376H = r1
        L_0x0280:
            float r1 = r15.f2376H
            float r0 = (float) r0
            float r1 = r1 * r0
            int r8 = (int) r1
            r34 = r8
            r36 = r11
            if (r7 == r6) goto L_0x0290
            r1 = r22
            r35 = r25
            goto L_0x02a7
        L_0x0290:
            r35 = r12
            r1 = r22
            goto L_0x029d
        L_0x0295:
            r36 = r11
            r35 = r12
            r1 = r22
        L_0x029b:
            r34 = r23
        L_0x029d:
            r14 = 1
            goto L_0x02a8
        L_0x029f:
            r36 = r11
            r35 = r12
            r1 = r22
            r34 = r23
        L_0x02a7:
            r14 = 0
        L_0x02a8:
            int[] r0 = r15.f2453x
            r2 = 0
            r0[r2] = r36
            r2 = 1
            r0[r2] = r35
            r15.f2421h = r14
            if (r14 == 0) goto L_0x02be
            int r0 = r15.f2374G
            r2 = -1
            if (r0 == 0) goto L_0x02bb
            if (r0 != r2) goto L_0x02bf
        L_0x02bb:
            r18 = 1
            goto L_0x02c1
        L_0x02be:
            r2 = -1
        L_0x02bf:
            r18 = 0
        L_0x02c1:
            if (r14 == 0) goto L_0x02cd
            int r0 = r15.f2374G
            r3 = 1
            if (r0 == r3) goto L_0x02ca
            if (r0 != r2) goto L_0x02cd
        L_0x02ca:
            r37 = 1
            goto L_0x02cf
        L_0x02cd:
            r37 = 0
        L_0x02cf:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2408a0
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r13) goto L_0x02de
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.C0486d
            if (r0 == 0) goto L_0x02de
            r9 = 1
            goto L_0x02df
        L_0x02de:
            r9 = 0
        L_0x02df:
            if (r9 == 0) goto L_0x02e4
            r22 = 0
            goto L_0x02e6
        L_0x02e4:
            r22 = r1
        L_0x02e6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2403W
            boolean r0 = r0.mo4319o()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.f2406Z
            r2 = 0
            boolean r23 = r0[r2]
            boolean r39 = r0[r1]
            int r0 = r15.f2443s
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x040d
            boolean r0 = r15.f2435o
            if (r0 != 0) goto L_0x040d
            if (r55 == 0) goto L_0x0364
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2415e
            if (r0 == 0) goto L_0x0364
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2486h
            boolean r2 = r1.f2475j
            if (r2 == 0) goto L_0x0364
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            boolean r0 = r0.f2475j
            if (r0 != 0) goto L_0x0314
            goto L_0x0364
        L_0x0314:
            if (r55 == 0) goto L_0x0360
            int r0 = r1.f2472g
            r12 = r54
            r11 = r33
            r12.mo4268f(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.c r0 = r15.f2415e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            int r0 = r0.f2472g
            r10 = r32
            r12.mo4268f(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x034a
            if (r4 == 0) goto L_0x034a
            boolean[] r0 = r15.f2419g
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x034a
            boolean r0 = r53.mo4398h0()
            if (r0 != 0) goto L_0x034a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396R
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo4279q(r0)
            r3 = 8
            r12.mo4270h(r0, r10, r1, r3)
        L_0x034a:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r32 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L_0x0421
        L_0x0360:
            r12 = r54
            goto L_0x040d
        L_0x0364:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x0378
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2396R
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo4279q(r0)
            r7 = r0
            goto L_0x037a
        L_0x0378:
            r7 = r40
        L_0x037a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x0387
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2392P
            androidx.constraintlayout.core.SolverVariable r0 = r12.mo4279q(r0)
            r16 = r0
            goto L_0x0389
        L_0x0387:
            r16 = r40
        L_0x0389:
            boolean[] r0 = r15.f2419g
            r19 = 0
            boolean r21 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2408a0
            r32 = r0[r19]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.f2392P
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.f2396R
            r41 = r2
            int r2 = r15.f2420g0
            r42 = r2
            int r2 = r15.f2434n0
            int[] r3 = r15.f2378I
            r44 = r3[r19]
            float r3 = r15.f2438p0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r6) goto L_0x03ae
            r45 = r20
            goto L_0x03b0
        L_0x03ae:
            r45 = r19
        L_0x03b0:
            int r0 = r15.f2455y
            r24 = r0
            int r0 = r15.f2457z
            r25 = r0
            float r0 = r15.f2362A
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r17 = r41
            r33 = r42
            r41 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r21
            r48 = r6
            r6 = r16
            r8 = r32
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r19 = r11
            r51 = r31
            r11 = r17
            r30 = r16
            r12 = r33
            r52 = r13
            r31 = r19
            r13 = r22
            r32 = r14
            r14 = r41
            r15 = r44
            r16 = r42
            r17 = r18
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r23
            r22 = r36
            r23 = r35
            r27 = r38
            r0.mo4400i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0421
        L_0x040d:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r13
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
            r32 = r14
        L_0x0421:
            if (r55 == 0) goto L_0x0487
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            if (r0 == 0) goto L_0x047a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2486h
            boolean r2 = r1.f2475j
            if (r2 == 0) goto L_0x047a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            boolean r0 = r0.f2475j
            if (r0 == 0) goto L_0x047a
            int r0 = r1.f2472g
            r14 = r54
            r13 = r51
            r14.mo4268f(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2487i
            int r0 = r0.f2472g
            r12 = r50
            r14.mo4268f(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.d r0 = r15.f2417f
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.f2494k
            int r0 = r0.f2472g
            r1 = r49
            r14.mo4268f(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x0474
            if (r28 != 0) goto L_0x0474
            if (r47 == 0) goto L_0x0474
            boolean[] r2 = r15.f2419g
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0470
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2398S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r2 = 8
            r10 = 0
            r14.mo4270h(r0, r12, r10, r2)
            goto L_0x0478
        L_0x0470:
            r2 = 8
            r10 = 0
            goto L_0x0478
        L_0x0474:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x0478:
            r7 = r10
            goto L_0x0496
        L_0x047a:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0495
        L_0x0487:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L_0x0495:
            r7 = r11
        L_0x0496:
            int r0 = r15.f2445t
            r3 = 2
            if (r0 != r3) goto L_0x049d
            r6 = r10
            goto L_0x049e
        L_0x049d:
            r6 = r7
        L_0x049e:
            if (r6 == 0) goto L_0x057e
            boolean r0 = r15.f2437p
            if (r0 != 0) goto L_0x057e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2408a0
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L_0x04b2
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.C0486d
            if (r0 == 0) goto L_0x04b2
            r9 = r11
            goto L_0x04b3
        L_0x04b2:
            r9 = r10
        L_0x04b3:
            if (r9 == 0) goto L_0x04b7
            r34 = r10
        L_0x04b7:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x04c3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2398S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r7 = r0
            goto L_0x04c5
        L_0x04c3:
            r7 = r40
        L_0x04c5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.f2410b0
            if (r0 == 0) goto L_0x04d1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2394Q
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r6 = r0
            goto L_0x04d3
        L_0x04d1:
            r6 = r40
        L_0x04d3:
            int r0 = r15.f2432m0
            if (r0 > 0) goto L_0x04db
            int r0 = r15.f2446t0
            if (r0 != r2) goto L_0x051b
        L_0x04db:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2400T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.f2355f
            if (r3 == 0) goto L_0x0508
            int r0 = r53.mo4424r()
            r14.mo4267e(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2400T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f2355f
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2400T
            int r3 = r3.mo4310f()
            r14.mo4267e(r1, r0, r3, r2)
            if (r47 == 0) goto L_0x0505
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.f2398S
            androidx.constraintlayout.core.SolverVariable r0 = r14.mo4279q(r0)
            r1 = 5
            r14.mo4270h(r7, r0, r10, r1)
        L_0x0505:
            r27 = r10
            goto L_0x051d
        L_0x0508:
            int r3 = r15.f2446t0
            if (r3 != r2) goto L_0x0514
            int r0 = r0.mo4310f()
            r14.mo4267e(r1, r13, r0, r2)
            goto L_0x051b
        L_0x0514:
            int r0 = r53.mo4424r()
            r14.mo4267e(r1, r13, r0, r2)
        L_0x051b:
            r27 = r38
        L_0x051d:
            boolean[] r0 = r15.f2419g
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.f2408a0
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.f2394Q
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.f2398S
            int r1 = r15.f2422h0
            int r2 = r15.f2436o0
            int[] r10 = r15.f2378I
            r16 = r10[r11]
            float r10 = r15.f2440q0
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L_0x053e
            r18 = 1
            goto L_0x0540
        L_0x053e:
            r18 = r17
        L_0x0540:
            int r0 = r15.f2364B
            r24 = r0
            int r0 = r15.f2366C
            r25 = r0
            float r0 = r15.f2368D
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r33 = r12
            r12 = r19
            r38 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r28
            r20 = r29
            r21 = r39
            r22 = r35
            r23 = r36
            r0.mo4400i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0582
        L_0x057e:
            r33 = r12
            r38 = r13
        L_0x0582:
            if (r32 == 0) goto L_0x05af
            r6 = 8
            r7 = r53
            int r0 = r7.f2374G
            r1 = 1
            if (r0 != r1) goto L_0x059d
            float r5 = r7.f2376H
            r0 = r54
            r1 = r33
            r2 = r38
            r3 = r30
            r4 = r31
            r0.mo4273k(r1, r2, r3, r4, r5, r6)
            goto L_0x05b1
        L_0x059d:
            float r5 = r7.f2376H
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r38
            r0.mo4273k(r1, r2, r3, r4, r5, r6)
            goto L_0x05b1
        L_0x05af:
            r7 = r53
        L_0x05b1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f2403W
            boolean r0 = r0.mo4319o()
            if (r0 == 0) goto L_0x05d9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.f2403W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mo4314j()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mo4312h()
            float r1 = r7.f2380J
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.f2403W
            int r2 = r2.mo4310f()
            r3 = r54
            r3.mo4264b(r7, r0, r1, r2)
        L_0x05d9:
            r0 = 0
            r7.f2435o = r0
            r7.f2437p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4394g(androidx.constraintlayout.core.c, boolean):void");
    }

    /* renamed from: g0 */
    public boolean mo4395g0(int i) {
        return this.f2406Z[i];
    }

    /* renamed from: g1 */
    public void mo4396g1(int i) {
        this.f2446t0 = i;
    }

    /* renamed from: h */
    public boolean mo4397h() {
        if (this.f2446t0 != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public boolean mo4398h0() {
        ConstraintAnchor constraintAnchor = this.f2392P;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
        if (constraintAnchor2 != null && constraintAnchor2.f2355f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2396R;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2355f;
        if (constraintAnchor4 == null || constraintAnchor4.f2355f != constraintAnchor3) {
            return false;
        }
        return true;
    }

    /* renamed from: h1 */
    public void mo4399h1(int i) {
        this.f2412c0 = i;
        int i2 = this.f2434n0;
        if (i < i2) {
            this.f2412c0 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:260:0x049c, code lost:
        if ((r4 instanceof androidx.constraintlayout.core.widgets.C0476a) != false) goto L_0x04a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0469  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0487 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x055b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:375:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:379:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e8  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4400i(androidx.constraintlayout.core.C0467c r38, boolean r39, boolean r40, boolean r41, boolean r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.SolverVariable r44, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r45, boolean r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, androidx.constraintlayout.core.widgets.ConstraintAnchor r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            r37 = this;
            r0 = r37
            r10 = r38
            r11 = r43
            r12 = r44
            r13 = r47
            r14 = r48
            r15 = r51
            r1 = r52
            r2 = r60
            r3 = r61
            r4 = r62
            androidx.constraintlayout.core.SolverVariable r9 = r10.mo4279q(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.mo4279q(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r47.mo4314j()
            androidx.constraintlayout.core.SolverVariable r7 = r10.mo4279q(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r48.mo4314j()
            androidx.constraintlayout.core.SolverVariable r6 = r10.mo4279q(r5)
            androidx.constraintlayout.core.C0467c.m3377w()
            boolean r16 = r47.mo4319o()
            boolean r17 = r48.mo4319o()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.f2403W
            boolean r18 = r5.mo4319o()
            if (r17 == 0) goto L_0x0044
            int r5 = r16 + 1
            goto L_0x0046
        L_0x0044:
            r5 = r16
        L_0x0046:
            if (r18 == 0) goto L_0x004a
            int r5 = r5 + 1
        L_0x004a:
            if (r54 == 0) goto L_0x004f
            r19 = 3
            goto L_0x0051
        L_0x004f:
            r19 = r59
        L_0x0051:
            int[] r20 = androidx.constraintlayout.core.widgets.ConstraintWidget.C0475a.f2461b
            int r21 = r45.ordinal()
            r12 = r20[r21]
            r2 = 1
            if (r12 == r2) goto L_0x0065
            r2 = 2
            if (r12 == r2) goto L_0x0065
            r2 = 3
            if (r12 == r2) goto L_0x0065
            r2 = 4
            if (r12 == r2) goto L_0x006a
        L_0x0065:
            r12 = r19
        L_0x0067:
            r19 = 0
            goto L_0x0070
        L_0x006a:
            r12 = r19
            if (r12 == r2) goto L_0x0067
            r19 = 1
        L_0x0070:
            int r2 = r0.f2429l
            r14 = -1
            if (r2 == r14) goto L_0x007d
            if (r39 == 0) goto L_0x007d
            r0.f2429l = r14
            r50 = r2
            r19 = 0
        L_0x007d:
            int r2 = r0.f2431m
            if (r2 == r14) goto L_0x0088
            if (r39 != 0) goto L_0x0088
            r0.f2431m = r14
            r19 = 0
            goto L_0x008a
        L_0x0088:
            r2 = r50
        L_0x008a:
            int r14 = r0.f2446t0
            r50 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0096
            r14 = 0
            r19 = 0
            goto L_0x0098
        L_0x0096:
            r14 = r50
        L_0x0098:
            if (r64 == 0) goto L_0x00bb
            if (r16 != 0) goto L_0x00a6
            if (r17 != 0) goto L_0x00a6
            if (r18 != 0) goto L_0x00a6
            r2 = r49
            r10.mo4268f(r9, r2)
            goto L_0x00b6
        L_0x00a6:
            if (r16 == 0) goto L_0x00b6
            if (r17 != 0) goto L_0x00b6
            int r2 = r47.mo4310f()
            r24 = r6
            r6 = 8
            r10.mo4267e(r9, r7, r2, r6)
            goto L_0x00be
        L_0x00b6:
            r24 = r6
            r6 = 8
            goto L_0x00be
        L_0x00bb:
            r24 = r6
            r6 = r2
        L_0x00be:
            if (r19 != 0) goto L_0x00e8
            if (r46 == 0) goto L_0x00d7
            r2 = 3
            r6 = 0
            r10.mo4267e(r8, r9, r6, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00ce
            r10.mo4270h(r8, r9, r15, r2)
        L_0x00ce:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00db
            r10.mo4272j(r8, r9, r1, r2)
            goto L_0x00db
        L_0x00d7:
            r2 = r6
            r10.mo4267e(r8, r9, r14, r2)
        L_0x00db:
            r1 = r5
            r2 = r7
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
        L_0x00e4:
            r24 = r3
            goto L_0x01e6
        L_0x00e8:
            r1 = 2
            if (r5 == r1) goto L_0x010b
            if (r54 != 0) goto L_0x010b
            r1 = 1
            if (r12 == r1) goto L_0x00f2
            if (r12 != 0) goto L_0x010b
        L_0x00f2:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L_0x00fc
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00fc:
            r2 = 8
            r10.mo4267e(r8, r9, r1, r2)
            r19 = r42
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r25 = 0
            goto L_0x00e4
        L_0x010b:
            r1 = -2
            if (r3 != r1) goto L_0x0110
            r2 = r14
            goto L_0x0111
        L_0x0110:
            r2 = r3
        L_0x0111:
            if (r4 != r1) goto L_0x0115
            r1 = r14
            goto L_0x0116
        L_0x0115:
            r1 = r4
        L_0x0116:
            if (r14 <= 0) goto L_0x011c
            r3 = 1
            if (r12 == r3) goto L_0x011c
            r14 = 0
        L_0x011c:
            if (r2 <= 0) goto L_0x0127
            r3 = 8
            r10.mo4270h(r8, r9, r2, r3)
            int r14 = java.lang.Math.max(r14, r2)
        L_0x0127:
            if (r1 <= 0) goto L_0x0140
            if (r40 == 0) goto L_0x0130
            r3 = 1
            if (r12 != r3) goto L_0x0130
            r3 = 0
            goto L_0x0131
        L_0x0130:
            r3 = 1
        L_0x0131:
            if (r3 == 0) goto L_0x0139
            r3 = 8
            r10.mo4272j(r8, r9, r1, r3)
            goto L_0x013b
        L_0x0139:
            r3 = 8
        L_0x013b:
            int r14 = java.lang.Math.min(r14, r1)
            goto L_0x0142
        L_0x0140:
            r3 = 8
        L_0x0142:
            r4 = 1
            if (r12 != r4) goto L_0x016a
            if (r40 == 0) goto L_0x014b
            r10.mo4267e(r8, r9, r14, r3)
            goto L_0x015c
        L_0x014b:
            if (r56 == 0) goto L_0x0155
            r4 = 5
            r10.mo4267e(r8, r9, r14, r4)
            r10.mo4272j(r8, r9, r14, r3)
            goto L_0x015c
        L_0x0155:
            r4 = 5
            r10.mo4267e(r8, r9, r14, r4)
            r10.mo4272j(r8, r9, r14, r3)
        L_0x015c:
            r4 = r1
            r1 = r5
            r14 = r8
            r25 = r19
            r15 = r24
            r19 = r42
            r24 = r2
            r2 = r7
            goto L_0x01e6
        L_0x016a:
            r3 = 2
            if (r12 != r3) goto L_0x01d5
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r47.mo4315k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x0197
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r47.mo4315k()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r6) goto L_0x017e
            goto L_0x0197
        L_0x017e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mo4422q(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.mo4279q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mo4422q(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.mo4279q(r4)
            goto L_0x01ad
        L_0x0197:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mo4422q(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.mo4279q(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.f2410b0
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.mo4422q(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.mo4279q(r4)
        L_0x01ad:
            r14 = r3
            r6 = r4
            androidx.constraintlayout.core.b r3 = r38.mo4280r()
            r4 = r8
            r46 = r1
            r1 = r5
            r5 = r9
            r15 = r24
            r52 = r2
            r2 = r7
            r7 = r14
            r14 = r8
            r8 = r63
            androidx.constraintlayout.core.b r3 = r3.mo4242k(r4, r5, r6, r7, r8)
            r10.mo4266d(r3)
            if (r40 == 0) goto L_0x01cc
            r19 = 0
        L_0x01cc:
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = r42
            goto L_0x01e6
        L_0x01d5:
            r46 = r1
            r52 = r2
            r1 = r5
            r2 = r7
            r14 = r8
            r15 = r24
            r4 = r46
            r24 = r52
            r25 = r19
            r19 = 1
        L_0x01e6:
            if (r64 == 0) goto L_0x0587
            if (r56 == 0) goto L_0x01ec
            goto L_0x0587
        L_0x01ec:
            if (r16 != 0) goto L_0x01f7
            if (r17 != 0) goto L_0x01f7
            if (r18 != 0) goto L_0x01f7
        L_0x01f2:
            r2 = r15
            r1 = 5
            r3 = 0
            goto L_0x0557
        L_0x01f7:
            if (r16 == 0) goto L_0x0210
            if (r17 != 0) goto L_0x0210
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f2355f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2353d
            if (r40 == 0) goto L_0x0208
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r1 == 0) goto L_0x0208
            r2 = 8
            goto L_0x0209
        L_0x0208:
            r2 = 5
        L_0x0209:
            r20 = r40
            r1 = r2
        L_0x020c:
            r2 = r15
        L_0x020d:
            r3 = 0
            goto L_0x0559
        L_0x0210:
            if (r16 != 0) goto L_0x0240
            if (r17 == 0) goto L_0x0240
            int r1 = r48.mo4310f()
            int r1 = -r1
            r2 = 8
            r10.mo4267e(r14, r15, r1, r2)
            if (r40 == 0) goto L_0x01f2
            boolean r1 = r0.f2425j
            if (r1 == 0) goto L_0x0238
            boolean r1 = r9.f2278s
            if (r1 == 0) goto L_0x0238
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.f2410b0
            if (r1 == 0) goto L_0x0238
            androidx.constraintlayout.core.widgets.d r1 = (androidx.constraintlayout.core.widgets.C0486d) r1
            if (r39 == 0) goto L_0x0234
            r1.mo4502w1(r13)
            goto L_0x01f2
        L_0x0234:
            r1.mo4475B1(r13)
            goto L_0x01f2
        L_0x0238:
            r1 = 5
            r3 = 0
            r10.mo4270h(r9, r11, r3, r1)
            r2 = r15
            goto L_0x0557
        L_0x0240:
            r3 = 0
            if (r16 == 0) goto L_0x0555
            if (r17 == 0) goto L_0x0555
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f2355f
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r1.f2353d
            r6 = r48
            r7 = r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f2355f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r1.f2353d
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r37.mo4351M()
            r16 = 6
            if (r25 == 0) goto L_0x03bf
            if (r12 != 0) goto L_0x02c0
            if (r4 != 0) goto L_0x0284
            if (r24 != 0) goto L_0x0284
            boolean r1 = r2.f2278s
            if (r1 == 0) goto L_0x0278
            boolean r1 = r15.f2278s
            if (r1 == 0) goto L_0x0278
            int r1 = r47.mo4310f()
            r4 = 8
            r10.mo4267e(r9, r2, r1, r4)
            int r1 = r48.mo4310f()
            int r1 = -r1
            r10.mo4267e(r14, r15, r1, r4)
            return
        L_0x0278:
            r4 = 8
            r1 = r4
            r17 = r1
            r18 = r7
            r23 = r18
            r21 = 1
            goto L_0x028f
        L_0x0284:
            r4 = 8
            r21 = r7
            r1 = 5
            r17 = 5
            r18 = 1
            r23 = 1
        L_0x028f:
            boolean r4 = r8 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r4 != 0) goto L_0x02aa
            boolean r4 = r5 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r4 == 0) goto L_0x0298
            goto L_0x02aa
        L_0x0298:
            r4 = r44
            r20 = r16
            r22 = r17
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            goto L_0x02bb
        L_0x02aa:
            r4 = r44
            r20 = r16
            r27 = r18
            r28 = r21
            r26 = r23
            r7 = 1
            r17 = 8
            r18 = 5
            r22 = 4
        L_0x02bb:
            r23 = r1
            r1 = 3
            goto L_0x0413
        L_0x02c0:
            r1 = 2
            r17 = 8
            if (r12 != r1) goto L_0x02ea
            boolean r1 = r8 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r1 != 0) goto L_0x02db
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r1 == 0) goto L_0x02ce
            goto L_0x02db
        L_0x02ce:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 5
            goto L_0x02e7
        L_0x02db:
            r4 = r44
            r28 = r7
            r20 = r16
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
        L_0x02e7:
            r23 = 5
            goto L_0x02fb
        L_0x02ea:
            r1 = 1
            if (r12 != r1) goto L_0x0301
            r4 = r44
            r28 = r7
            r20 = r16
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            r22 = 4
        L_0x02fb:
            r26 = 1
            r27 = 1
            goto L_0x0413
        L_0x0301:
            r1 = 3
            if (r12 != r1) goto L_0x03af
            int r1 = r0.f2374G
            r7 = -1
            if (r1 != r7) goto L_0x032f
            if (r57 == 0) goto L_0x031b
            r4 = r44
            r23 = r17
            r1 = 3
            r7 = 1
            r18 = 5
            if (r40 == 0) goto L_0x0318
            r20 = 5
            goto L_0x0325
        L_0x0318:
            r20 = 4
            goto L_0x0325
        L_0x031b:
            r4 = r44
            r20 = r17
            r23 = r20
            r1 = 3
            r7 = 1
            r18 = 5
        L_0x0325:
            r22 = 5
            r26 = 1
            r27 = 1
            r28 = 1
            goto L_0x0413
        L_0x032f:
            if (r54 == 0) goto L_0x0359
            r1 = r60
            r7 = 2
            if (r1 == r7) goto L_0x033c
            r7 = 1
            if (r1 != r7) goto L_0x033a
            goto L_0x033d
        L_0x033a:
            r1 = 0
            goto L_0x033e
        L_0x033c:
            r7 = 1
        L_0x033d:
            r1 = r7
        L_0x033e:
            if (r1 != 0) goto L_0x0344
            r1 = r17
            r4 = 5
            goto L_0x0346
        L_0x0344:
            r1 = 5
            r4 = 4
        L_0x0346:
            r23 = r1
            r22 = r4
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r4 = r44
            goto L_0x0413
        L_0x0359:
            r7 = 1
            if (r4 <= 0) goto L_0x036c
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 5
            goto L_0x03ab
        L_0x036c:
            if (r4 != 0) goto L_0x039c
            if (r24 != 0) goto L_0x039c
            if (r57 != 0) goto L_0x0382
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r22 = r17
            r1 = 3
            r18 = 5
            goto L_0x03ab
        L_0x0382:
            if (r8 == r3) goto L_0x0388
            if (r5 == r3) goto L_0x0388
            r1 = 4
            goto L_0x0389
        L_0x0388:
            r1 = 5
        L_0x0389:
            r4 = r44
            r23 = r1
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
            goto L_0x0413
        L_0x039c:
            r4 = r44
            r26 = r7
            r27 = r26
            r28 = r27
            r20 = r16
            r1 = 3
            r18 = 5
            r22 = 4
        L_0x03ab:
            r23 = 5
            goto L_0x0413
        L_0x03af:
            r7 = 1
            r4 = r44
            r20 = r16
            r18 = 5
            r22 = 4
            r23 = 5
            r26 = 0
            r27 = 0
            goto L_0x0411
        L_0x03bf:
            r7 = 1
            r17 = 8
            boolean r1 = r2.f2278s
            if (r1 == 0) goto L_0x0402
            boolean r1 = r15.f2278s
            if (r1 == 0) goto L_0x0402
            int r1 = r47.mo4310f()
            int r3 = r48.mo4310f()
            r4 = 8
            r54 = r38
            r55 = r9
            r56 = r2
            r57 = r1
            r58 = r53
            r59 = r15
            r60 = r14
            r61 = r3
            r62 = r4
            r54.mo4265c(r55, r56, r57, r58, r59, r60, r61, r62)
            if (r40 == 0) goto L_0x0401
            if (r19 == 0) goto L_0x0401
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f2355f
            if (r1 == 0) goto L_0x03f8
            int r1 = r48.mo4310f()
            r4 = r44
            goto L_0x03fb
        L_0x03f8:
            r4 = r44
            r1 = 0
        L_0x03fb:
            if (r15 == r4) goto L_0x0401
            r2 = 5
            r10.mo4270h(r4, r14, r1, r2)
        L_0x0401:
            return
        L_0x0402:
            r4 = r44
            r1 = 3
            r18 = 5
            r26 = r7
            r27 = r26
            r20 = r16
            r23 = r18
            r22 = 4
        L_0x0411:
            r28 = 0
        L_0x0413:
            if (r26 == 0) goto L_0x041e
            if (r2 != r15) goto L_0x041e
            if (r8 == r3) goto L_0x041e
            r26 = 0
            r29 = 0
            goto L_0x0420
        L_0x041e:
            r29 = r7
        L_0x0420:
            if (r27 == 0) goto L_0x0469
            if (r25 != 0) goto L_0x0435
            if (r55 != 0) goto L_0x0435
            if (r57 != 0) goto L_0x0435
            if (r2 != r11) goto L_0x0435
            if (r15 != r4) goto L_0x0435
            r23 = r17
            r27 = r23
            r20 = 0
            r29 = 0
            goto L_0x0439
        L_0x0435:
            r27 = r20
            r20 = r40
        L_0x0439:
            int r30 = r47.mo4310f()
            int r31 = r48.mo4310f()
            r13 = r1
            r1 = r38
            r42 = r2
            r13 = r17
            r17 = 4
            r36 = r18
            r18 = r7
            r7 = r36
            r2 = r9
            r32 = r3
            r3 = r42
            r4 = r30
            r33 = r5
            r5 = r53
            r6 = r15
            r7 = r14
            r34 = r8
            r8 = r31
            r35 = r9
            r9 = r27
            r1.mo4265c(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x047b
        L_0x0469:
            r42 = r2
            r32 = r3
            r33 = r5
            r18 = r7
            r34 = r8
            r35 = r9
            r13 = r17
            r17 = 4
            r20 = r40
        L_0x047b:
            r2 = r29
            int r1 = r0.f2446t0
            if (r1 != r13) goto L_0x0488
            boolean r1 = r48.mo4317m()
            if (r1 != 0) goto L_0x0488
            return
        L_0x0488:
            r1 = r42
            if (r26 == 0) goto L_0x04be
            if (r20 == 0) goto L_0x04a4
            if (r1 == r15) goto L_0x04a4
            if (r25 != 0) goto L_0x04a4
            r3 = r34
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r4 != 0) goto L_0x049f
            r4 = r33
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r5 == 0) goto L_0x04a8
            goto L_0x04a1
        L_0x049f:
            r4 = r33
        L_0x04a1:
            r5 = r16
            goto L_0x04aa
        L_0x04a4:
            r4 = r33
            r3 = r34
        L_0x04a8:
            r5 = r23
        L_0x04aa:
            int r6 = r47.mo4310f()
            r8 = r35
            r10.mo4270h(r8, r1, r6, r5)
            int r6 = r48.mo4310f()
            int r6 = -r6
            r10.mo4272j(r14, r15, r6, r5)
            r23 = r5
            goto L_0x04c4
        L_0x04be:
            r4 = r33
            r3 = r34
            r8 = r35
        L_0x04c4:
            if (r20 == 0) goto L_0x04da
            if (r58 == 0) goto L_0x04da
            boolean r5 = r3 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r5 != 0) goto L_0x04da
            boolean r5 = r4 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r5 != 0) goto L_0x04da
            r5 = r32
            if (r4 == r5) goto L_0x04dc
            r6 = r16
            r7 = r6
            r2 = r18
            goto L_0x04e0
        L_0x04da:
            r5 = r32
        L_0x04dc:
            r6 = r22
            r7 = r23
        L_0x04e0:
            if (r2 == 0) goto L_0x052b
            if (r28 == 0) goto L_0x050b
            if (r57 == 0) goto L_0x04e8
            if (r41 == 0) goto L_0x050b
        L_0x04e8:
            if (r3 == r5) goto L_0x04ef
            if (r4 != r5) goto L_0x04ed
            goto L_0x04ef
        L_0x04ed:
            r2 = r6
            goto L_0x04f1
        L_0x04ef:
            r2 = r16
        L_0x04f1:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r9 != 0) goto L_0x04f9
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.C0489f
            if (r9 == 0) goto L_0x04fa
        L_0x04f9:
            r2 = 5
        L_0x04fa:
            boolean r9 = r3 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r9 != 0) goto L_0x0502
            boolean r9 = r4 instanceof androidx.constraintlayout.core.widgets.C0476a
            if (r9 == 0) goto L_0x0503
        L_0x0502:
            r2 = 5
        L_0x0503:
            if (r57 == 0) goto L_0x0506
            r2 = 5
        L_0x0506:
            int r2 = java.lang.Math.max(r2, r6)
            goto L_0x050c
        L_0x050b:
            r2 = r6
        L_0x050c:
            if (r20 == 0) goto L_0x051c
            int r2 = java.lang.Math.min(r7, r2)
            if (r54 == 0) goto L_0x051c
            if (r57 != 0) goto L_0x051c
            if (r3 == r5) goto L_0x051a
            if (r4 != r5) goto L_0x051c
        L_0x051a:
            r2 = r17
        L_0x051c:
            int r3 = r47.mo4310f()
            r10.mo4267e(r8, r1, r3, r2)
            int r3 = r48.mo4310f()
            int r3 = -r3
            r10.mo4267e(r14, r15, r3, r2)
        L_0x052b:
            if (r20 == 0) goto L_0x053c
            if (r11 != r1) goto L_0x0534
            int r2 = r47.mo4310f()
            goto L_0x0535
        L_0x0534:
            r2 = 0
        L_0x0535:
            if (r1 == r11) goto L_0x053c
            r1 = 5
            r10.mo4270h(r8, r11, r2, r1)
            goto L_0x053d
        L_0x053c:
            r1 = 5
        L_0x053d:
            if (r20 == 0) goto L_0x020c
            if (r25 == 0) goto L_0x020c
            r2 = r15
            if (r51 != 0) goto L_0x020d
            if (r24 != 0) goto L_0x020d
            if (r25 == 0) goto L_0x0550
            r3 = 3
            if (r12 != r3) goto L_0x0550
            r3 = 0
            r10.mo4270h(r14, r8, r3, r13)
            goto L_0x0559
        L_0x0550:
            r3 = 0
            r10.mo4270h(r14, r8, r3, r1)
            goto L_0x0559
        L_0x0555:
            r2 = r15
            r1 = 5
        L_0x0557:
            r20 = r40
        L_0x0559:
            if (r20 == 0) goto L_0x0586
            if (r19 == 0) goto L_0x0586
            r4 = r48
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f2355f
            if (r5 == 0) goto L_0x0567
            int r3 = r48.mo4310f()
        L_0x0567:
            r5 = r44
            if (r2 == r5) goto L_0x0586
            boolean r2 = r0.f2425j
            if (r2 == 0) goto L_0x0583
            boolean r2 = r14.f2278s
            if (r2 == 0) goto L_0x0583
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r0.f2410b0
            if (r2 == 0) goto L_0x0583
            androidx.constraintlayout.core.widgets.d r2 = (androidx.constraintlayout.core.widgets.C0486d) r2
            if (r39 == 0) goto L_0x057f
            r2.mo4501v1(r4)
            goto L_0x0582
        L_0x057f:
            r2.mo4474A1(r4)
        L_0x0582:
            return
        L_0x0583:
            r10.mo4270h(r5, r14, r3, r1)
        L_0x0586:
            return
        L_0x0587:
            r5 = r44
            r8 = r9
            r3 = 0
            r7 = 2
            r13 = 8
            r18 = 1
            if (r1 >= r7) goto L_0x05cc
            if (r40 == 0) goto L_0x05cc
            if (r19 == 0) goto L_0x05cc
            r10.mo4270h(r8, r11, r3, r13)
            if (r39 != 0) goto L_0x05a4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2400T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            if (r1 != 0) goto L_0x05a2
            goto L_0x05a4
        L_0x05a2:
            r2 = r3
            goto L_0x05a6
        L_0x05a4:
            r2 = r18
        L_0x05a6:
            if (r39 != 0) goto L_0x05c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f2400T
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f2355f
            if (r1 == 0) goto L_0x05c7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.f2353d
            float r2 = r1.f2416e0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x05c6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.f2408a0
            r2 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x05c6
            r1 = r1[r18]
            if (r1 != r4) goto L_0x05c6
            r2 = r18
            goto L_0x05c7
        L_0x05c6:
            r2 = r3
        L_0x05c7:
            if (r2 == 0) goto L_0x05cc
            r10.mo4270h(r5, r14, r3, r13)
        L_0x05cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.mo4400i(androidx.constraintlayout.core.c, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    /* renamed from: i0 */
    public boolean mo4401i0() {
        return this.f2384L;
    }

    /* renamed from: i1 */
    public void mo4402i1(int i) {
        if (i >= 0 && i <= 3) {
            this.f2447u = i;
        }
    }

    /* renamed from: j */
    public void mo4403j(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2) {
        mo4406k(type, constraintWidget, type2, 0);
    }

    /* renamed from: j0 */
    public boolean mo4404j0() {
        ConstraintAnchor constraintAnchor = this.f2394Q;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f2355f;
        if (constraintAnchor2 != null && constraintAnchor2.f2355f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f2398S;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f2355f;
        if (constraintAnchor4 == null || constraintAnchor4.f2355f != constraintAnchor3) {
            return false;
        }
        return true;
    }

    /* renamed from: j1 */
    public void mo4405j1(int i) {
        this.f2420g0 = i;
    }

    /* renamed from: k */
    public void mo4406k(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor q = mo4422q(type4);
                ConstraintAnchor q2 = constraintWidget.mo4422q(type2);
                ConstraintAnchor q3 = mo4422q(ConstraintAnchor.Type.RIGHT);
                q.mo4305a(q2, 0);
                q3.mo4305a(q2, 0);
                mo4422q(type6).mo4305a(q2, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor q4 = constraintWidget.mo4422q(type2);
                mo4422q(type3).mo4305a(q4, 0);
                mo4422q(ConstraintAnchor.Type.BOTTOM).mo4305a(q4, 0);
                mo4422q(type7).mo4305a(q4, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                mo4422q(type8).mo4305a(constraintWidget.mo4422q(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                mo4422q(type9).mo4305a(constraintWidget.mo4422q(type9), 0);
                mo4422q(type6).mo4305a(constraintWidget.mo4422q(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                mo4422q(type10).mo4305a(constraintWidget.mo4422q(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                mo4422q(type11).mo4305a(constraintWidget.mo4422q(type11), 0);
                mo4422q(type7).mo4305a(constraintWidget.mo4422q(type2), 0);
            } else {
                ConstraintAnchor q5 = mo4422q(type);
                ConstraintAnchor q6 = constraintWidget.mo4422q(type2);
                if (q5.mo4320p(q6)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor q7 = mo4422q(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor q8 = mo4422q(ConstraintAnchor.Type.BOTTOM);
                        if (q7 != null) {
                            q7.mo4321q();
                        }
                        if (q8 != null) {
                            q8.mo4321q();
                        }
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor q9 = mo4422q(type12);
                        if (q9 != null) {
                            q9.mo4321q();
                        }
                        ConstraintAnchor q10 = mo4422q(type5);
                        if (q10.mo4314j() != q6) {
                            q10.mo4321q();
                        }
                        ConstraintAnchor g = mo4422q(type).mo4311g();
                        ConstraintAnchor q11 = mo4422q(type7);
                        if (q11.mo4319o()) {
                            g.mo4321q();
                            q11.mo4321q();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor q12 = mo4422q(type5);
                        if (q12.mo4314j() != q6) {
                            q12.mo4321q();
                        }
                        ConstraintAnchor g2 = mo4422q(type).mo4311g();
                        ConstraintAnchor q13 = mo4422q(type6);
                        if (q13.mo4319o()) {
                            g2.mo4321q();
                            q13.mo4321q();
                        }
                    }
                    q5.mo4305a(q6, i);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor q14 = mo4422q(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor q15 = mo4422q(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor q16 = mo4422q(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor q17 = mo4422q(type16);
            boolean z2 = true;
            if ((q14 == null || !q14.mo4319o()) && (q15 == null || !q15.mo4319o())) {
                mo4406k(type13, constraintWidget, type13, 0);
                mo4406k(type14, constraintWidget, type14, 0);
                z = true;
            } else {
                z = false;
            }
            if ((q16 == null || !q16.mo4319o()) && (q17 == null || !q17.mo4319o())) {
                mo4406k(type15, constraintWidget, type15, 0);
                mo4406k(type16, constraintWidget, type16, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo4422q(type5).mo4305a(constraintWidget.mo4422q(type5), 0);
            } else if (z) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                mo4422q(type17).mo4305a(constraintWidget.mo4422q(type17), 0);
            } else if (z2) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                mo4422q(type18).mo4305a(constraintWidget.mo4422q(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                mo4406k(type19, constraintWidget, type2, 0);
                mo4406k(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                mo4422q(type5).mo4305a(constraintWidget.mo4422q(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                mo4406k(type20, constraintWidget, type2, 0);
                mo4406k(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                mo4422q(type5).mo4305a(constraintWidget.mo4422q(type2), 0);
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo4407k0() {
        return this.f2386M;
    }

    /* renamed from: k1 */
    public void mo4408k1(int i) {
        this.f2422h0 = i;
    }

    /* renamed from: l */
    public void mo4409l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.mo4312h() == this) {
            mo4406k(constraintAnchor.mo4315k(), constraintAnchor2.mo4312h(), constraintAnchor2.mo4315k(), i);
        }
    }

    /* renamed from: l0 */
    public boolean mo4410l0() {
        if (!this.f2423i || this.f2446t0 == 8) {
            return false;
        }
        return true;
    }

    /* renamed from: l1 */
    public void mo4411l1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f2374G == -1) {
            if (z3 && !z4) {
                this.f2374G = 0;
            } else if (!z3 && z4) {
                this.f2374G = 1;
                if (this.f2418f0 == -1) {
                    this.f2376H = 1.0f / this.f2376H;
                }
            }
        }
        if (this.f2374G == 0 && (!this.f2394Q.mo4319o() || !this.f2398S.mo4319o())) {
            this.f2374G = 1;
        } else if (this.f2374G == 1 && (!this.f2392P.mo4319o() || !this.f2396R.mo4319o())) {
            this.f2374G = 0;
        }
        if (this.f2374G == -1 && (!this.f2394Q.mo4319o() || !this.f2398S.mo4319o() || !this.f2392P.mo4319o() || !this.f2396R.mo4319o())) {
            if (this.f2394Q.mo4319o() && this.f2398S.mo4319o()) {
                this.f2374G = 0;
            } else if (this.f2392P.mo4319o() && this.f2396R.mo4319o()) {
                this.f2376H = 1.0f / this.f2376H;
                this.f2374G = 1;
            }
        }
        if (this.f2374G == -1) {
            int i = this.f2455y;
            if (i > 0 && this.f2364B == 0) {
                this.f2374G = 0;
            } else if (i == 0 && this.f2364B > 0) {
                this.f2376H = 1.0f / this.f2376H;
                this.f2374G = 1;
            }
        }
    }

    /* renamed from: m */
    public void mo4412m(ConstraintWidget constraintWidget, float f, int i) {
        ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
        mo4386d0(type, constraintWidget, type, i, 0);
        this.f2380J = f;
    }

    /* renamed from: m0 */
    public boolean mo4413m0() {
        if (this.f2435o || (this.f2392P.mo4318n() && this.f2396R.mo4318n())) {
            return true;
        }
        return false;
    }

    /* renamed from: m1 */
    public void mo4414m1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean k = z & this.f2415e.mo4461k();
        boolean k2 = z2 & this.f2417f.mo4461k();
        C0480c cVar = this.f2415e;
        int i3 = cVar.f2486h.f2472g;
        C0482d dVar = this.f2417f;
        int i4 = dVar.f2486h.f2472g;
        int i5 = cVar.f2487i.f2472g;
        int i6 = dVar.f2487i.f2472g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (k) {
            this.f2420g0 = i3;
        }
        if (k2) {
            this.f2422h0 = i4;
        }
        if (this.f2446t0 == 8) {
            this.f2412c0 = 0;
            this.f2414d0 = 0;
            return;
        }
        if (k) {
            if (this.f2408a0[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.f2412c0)) {
                i8 = i2;
            }
            this.f2412c0 = i8;
            int i10 = this.f2434n0;
            if (i8 < i10) {
                this.f2412c0 = i10;
            }
        }
        if (k2) {
            if (this.f2408a0[1] == DimensionBehaviour.FIXED && i9 < (i = this.f2414d0)) {
                i9 = i;
            }
            this.f2414d0 = i9;
            int i11 = this.f2436o0;
            if (i9 < i11) {
                this.f2414d0 = i11;
            }
        }
    }

    /* renamed from: n */
    public void mo4415n(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        this.f2443s = constraintWidget.f2443s;
        this.f2445t = constraintWidget.f2445t;
        this.f2449v = constraintWidget.f2449v;
        this.f2451w = constraintWidget.f2451w;
        int[] iArr = this.f2453x;
        int[] iArr2 = constraintWidget.f2453x;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f2455y = constraintWidget.f2455y;
        this.f2457z = constraintWidget.f2457z;
        this.f2364B = constraintWidget.f2364B;
        this.f2366C = constraintWidget.f2366C;
        this.f2368D = constraintWidget.f2368D;
        this.f2370E = constraintWidget.f2370E;
        this.f2372F = constraintWidget.f2372F;
        this.f2374G = constraintWidget.f2374G;
        this.f2376H = constraintWidget.f2376H;
        int[] iArr3 = constraintWidget.f2378I;
        this.f2378I = Arrays.copyOf(iArr3, iArr3.length);
        this.f2380J = constraintWidget.f2380J;
        this.f2382K = constraintWidget.f2382K;
        this.f2384L = constraintWidget.f2384L;
        this.f2392P.mo4321q();
        this.f2394Q.mo4321q();
        this.f2396R.mo4321q();
        this.f2398S.mo4321q();
        this.f2400T.mo4321q();
        this.f2401U.mo4321q();
        this.f2402V.mo4321q();
        this.f2403W.mo4321q();
        this.f2408a0 = (DimensionBehaviour[]) Arrays.copyOf(this.f2408a0, 2);
        ConstraintWidget constraintWidget4 = null;
        if (this.f2410b0 == null) {
            constraintWidget2 = null;
        } else {
            constraintWidget2 = hashMap.get(constraintWidget.f2410b0);
        }
        this.f2410b0 = constraintWidget2;
        this.f2412c0 = constraintWidget.f2412c0;
        this.f2414d0 = constraintWidget.f2414d0;
        this.f2416e0 = constraintWidget.f2416e0;
        this.f2418f0 = constraintWidget.f2418f0;
        this.f2420g0 = constraintWidget.f2420g0;
        this.f2422h0 = constraintWidget.f2422h0;
        this.f2424i0 = constraintWidget.f2424i0;
        this.f2426j0 = constraintWidget.f2426j0;
        this.f2428k0 = constraintWidget.f2428k0;
        this.f2430l0 = constraintWidget.f2430l0;
        this.f2432m0 = constraintWidget.f2432m0;
        this.f2434n0 = constraintWidget.f2434n0;
        this.f2436o0 = constraintWidget.f2436o0;
        this.f2438p0 = constraintWidget.f2438p0;
        this.f2440q0 = constraintWidget.f2440q0;
        this.f2442r0 = constraintWidget.f2442r0;
        this.f2444s0 = constraintWidget.f2444s0;
        this.f2446t0 = constraintWidget.f2446t0;
        this.f2448u0 = constraintWidget.f2448u0;
        this.f2450v0 = constraintWidget.f2450v0;
        this.f2452w0 = constraintWidget.f2452w0;
        this.f2454x0 = constraintWidget.f2454x0;
        this.f2456y0 = constraintWidget.f2456y0;
        this.f2458z0 = constraintWidget.f2458z0;
        this.f2363A0 = constraintWidget.f2363A0;
        this.f2365B0 = constraintWidget.f2365B0;
        this.f2367C0 = constraintWidget.f2367C0;
        this.f2369D0 = constraintWidget.f2369D0;
        this.f2371E0 = constraintWidget.f2371E0;
        this.f2373F0 = constraintWidget.f2373F0;
        this.f2375G0 = constraintWidget.f2375G0;
        this.f2379I0 = constraintWidget.f2379I0;
        this.f2381J0 = constraintWidget.f2381J0;
        this.f2383K0 = constraintWidget.f2383K0;
        this.f2385L0 = constraintWidget.f2385L0;
        float[] fArr = this.f2387M0;
        float[] fArr2 = constraintWidget.f2387M0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.f2389N0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.f2389N0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.f2391O0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.f2391O0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget5 = constraintWidget.f2393P0;
        if (constraintWidget5 == null) {
            constraintWidget3 = null;
        } else {
            constraintWidget3 = hashMap.get(constraintWidget5);
        }
        this.f2393P0 = constraintWidget3;
        ConstraintWidget constraintWidget6 = constraintWidget.f2395Q0;
        if (constraintWidget6 != null) {
            constraintWidget4 = hashMap.get(constraintWidget6);
        }
        this.f2395Q0 = constraintWidget4;
    }

    /* renamed from: n0 */
    public boolean mo4416n0() {
        if (this.f2437p || (this.f2394Q.mo4318n() && this.f2398S.mo4318n())) {
            return true;
        }
        return false;
    }

    /* renamed from: n1 */
    public void mo4417n1(C0467c cVar, boolean z) {
        C0482d dVar;
        C0480c cVar2;
        int x = cVar.mo4284x(this.f2392P);
        int x2 = cVar.mo4284x(this.f2394Q);
        int x3 = cVar.mo4284x(this.f2396R);
        int x4 = cVar.mo4284x(this.f2398S);
        if (z && (cVar2 = this.f2415e) != null) {
            DependencyNode dependencyNode = cVar2.f2486h;
            if (dependencyNode.f2475j) {
                DependencyNode dependencyNode2 = cVar2.f2487i;
                if (dependencyNode2.f2475j) {
                    x = dependencyNode.f2472g;
                    x3 = dependencyNode2.f2472g;
                }
            }
        }
        if (z && (dVar = this.f2417f) != null) {
            DependencyNode dependencyNode3 = dVar.f2486h;
            if (dependencyNode3.f2475j) {
                DependencyNode dependencyNode4 = dVar.f2487i;
                if (dependencyNode4.f2475j) {
                    x2 = dependencyNode3.f2472g;
                    x4 = dependencyNode4.f2472g;
                }
            }
        }
        int i = x4 - x2;
        if (x3 - x < 0 || i < 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE || x2 == Integer.MIN_VALUE || x2 == Integer.MAX_VALUE || x3 == Integer.MIN_VALUE || x3 == Integer.MAX_VALUE || x4 == Integer.MIN_VALUE || x4 == Integer.MAX_VALUE) {
            x4 = 0;
            x = 0;
            x2 = 0;
            x3 = 0;
        }
        mo4340G0(x, x2, x3, x4);
    }

    /* renamed from: o */
    public void mo4418o(C0467c cVar) {
        cVar.mo4279q(this.f2392P);
        cVar.mo4279q(this.f2394Q);
        cVar.mo4279q(this.f2396R);
        cVar.mo4279q(this.f2398S);
        if (this.f2432m0 > 0) {
            cVar.mo4279q(this.f2400T);
        }
    }

    /* renamed from: o0 */
    public boolean mo4419o0() {
        return this.f2441r;
    }

    /* renamed from: p */
    public void mo4420p() {
        if (this.f2415e == null) {
            this.f2415e = new C0480c(this);
        }
        if (this.f2417f == null) {
            this.f2417f = new C0482d(this);
        }
    }

    /* renamed from: p0 */
    public void mo4421p0() {
        this.f2439q = true;
    }

    /* renamed from: q */
    public ConstraintAnchor mo4422q(ConstraintAnchor.Type type) {
        switch (C0475a.f2460a[type.ordinal()]) {
            case 1:
                return this.f2392P;
            case 2:
                return this.f2394Q;
            case 3:
                return this.f2396R;
            case 4:
                return this.f2398S;
            case 5:
                return this.f2400T;
            case 6:
                return this.f2403W;
            case 7:
                return this.f2401U;
            case 8:
                return this.f2402V;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: q0 */
    public void mo4423q0() {
        this.f2441r = true;
    }

    /* renamed from: r */
    public int mo4424r() {
        return this.f2432m0;
    }

    /* renamed from: r0 */
    public boolean mo4425r0() {
        DimensionBehaviour[] dimensionBehaviourArr = this.f2408a0;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && dimensionBehaviourArr[1] == dimensionBehaviour2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public float mo4426s(int i) {
        if (i == 0) {
            return this.f2438p0;
        }
        if (i == 1) {
            return this.f2440q0;
        }
        return -1.0f;
    }

    /* renamed from: s0 */
    public void mo4427s0() {
        this.f2392P.mo4321q();
        this.f2394Q.mo4321q();
        this.f2396R.mo4321q();
        this.f2398S.mo4321q();
        this.f2400T.mo4321q();
        this.f2401U.mo4321q();
        this.f2402V.mo4321q();
        this.f2403W.mo4321q();
        this.f2410b0 = null;
        this.f2380J = Utils.FLOAT_EPSILON;
        this.f2412c0 = 0;
        this.f2414d0 = 0;
        this.f2416e0 = Utils.FLOAT_EPSILON;
        this.f2418f0 = -1;
        this.f2420g0 = 0;
        this.f2422h0 = 0;
        this.f2428k0 = 0;
        this.f2430l0 = 0;
        this.f2432m0 = 0;
        this.f2434n0 = 0;
        this.f2436o0 = 0;
        float f = f2361T0;
        this.f2438p0 = f;
        this.f2440q0 = f;
        DimensionBehaviour[] dimensionBehaviourArr = this.f2408a0;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f2442r0 = null;
        this.f2444s0 = 0;
        this.f2446t0 = 0;
        this.f2452w0 = null;
        this.f2373F0 = false;
        this.f2375G0 = false;
        this.f2379I0 = 0;
        this.f2381J0 = 0;
        this.f2383K0 = false;
        this.f2385L0 = false;
        float[] fArr = this.f2387M0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2443s = -1;
        this.f2445t = -1;
        int[] iArr = this.f2378I;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f2449v = 0;
        this.f2451w = 0;
        this.f2362A = 1.0f;
        this.f2368D = 1.0f;
        this.f2457z = Integer.MAX_VALUE;
        this.f2366C = Integer.MAX_VALUE;
        this.f2455y = 0;
        this.f2364B = 0;
        this.f2421h = false;
        this.f2374G = -1;
        this.f2376H = 1.0f;
        this.f2377H0 = false;
        boolean[] zArr = this.f2419g;
        zArr[0] = true;
        zArr[1] = true;
        this.f2386M = false;
        boolean[] zArr2 = this.f2406Z;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f2423i = true;
        int[] iArr2 = this.f2453x;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2429l = -1;
        this.f2431m = -1;
    }

    /* renamed from: t */
    public int mo4428t() {
        return mo4373X() + this.f2414d0;
    }

    /* renamed from: t0 */
    public void mo4429t0() {
        mo4432u0();
        mo4380a1(f2361T0);
        mo4346J0(f2361T0);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.f2452w0 != null) {
            str = "type: " + this.f2452w0 + " ";
        } else {
            str = str2;
        }
        sb.append(str);
        if (this.f2450v0 != null) {
            str2 = "id: " + this.f2450v0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f2420g0);
        sb.append(", ");
        sb.append(this.f2422h0);
        sb.append(") - (");
        sb.append(this.f2412c0);
        sb.append(" x ");
        sb.append(this.f2414d0);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public Object mo4431u() {
        return this.f2442r0;
    }

    /* renamed from: u0 */
    public void mo4432u0() {
        ConstraintWidget M = mo4351M();
        if (M == null || !(M instanceof C0486d) || !((C0486d) mo4351M()).mo4482I1()) {
            int size = this.f2405Y.size();
            for (int i = 0; i < size; i++) {
                this.f2405Y.get(i).mo4321q();
            }
        }
    }

    /* renamed from: v */
    public String mo4433v() {
        return this.f2450v0;
    }

    /* renamed from: v0 */
    public void mo4434v0() {
        this.f2435o = false;
        this.f2437p = false;
        this.f2439q = false;
        this.f2441r = false;
        int size = this.f2405Y.size();
        for (int i = 0; i < size; i++) {
            this.f2405Y.get(i).mo4322r();
        }
    }

    /* renamed from: w */
    public DimensionBehaviour mo4435w(int i) {
        if (i == 0) {
            return mo4331C();
        }
        if (i == 1) {
            return mo4363S();
        }
        return null;
    }

    /* renamed from: w0 */
    public void mo4436w0(d80 d80) {
        this.f2392P.mo4323s(d80);
        this.f2394Q.mo4323s(d80);
        this.f2396R.mo4323s(d80);
        this.f2398S.mo4323s(d80);
        this.f2400T.mo4323s(d80);
        this.f2403W.mo4323s(d80);
        this.f2401U.mo4323s(d80);
        this.f2402V.mo4323s(d80);
    }

    /* renamed from: x */
    public float mo4437x() {
        return this.f2416e0;
    }

    /* renamed from: x0 */
    public void mo4438x0(int i) {
        boolean z;
        this.f2432m0 = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2382K = z;
    }

    /* renamed from: y */
    public int mo4439y() {
        return this.f2418f0;
    }

    /* renamed from: y0 */
    public void mo4440y0(Object obj) {
        this.f2442r0 = obj;
    }

    /* renamed from: z */
    public int mo4441z() {
        if (this.f2446t0 == 8) {
            return 0;
        }
        return this.f2414d0;
    }

    /* renamed from: z0 */
    public void mo4442z0(String str) {
        this.f2450v0 = str;
    }
}
