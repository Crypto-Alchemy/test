package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {

    /* renamed from: a */
    public HashSet<ConstraintAnchor> f2350a = null;

    /* renamed from: b */
    public int f2351b;

    /* renamed from: c */
    public boolean f2352c;

    /* renamed from: d */
    public final ConstraintWidget f2353d;

    /* renamed from: e */
    public final Type f2354e;

    /* renamed from: f */
    public ConstraintAnchor f2355f;

    /* renamed from: g */
    public int f2356g = 0;

    /* renamed from: h */
    public int f2357h = Integer.MIN_VALUE;

    /* renamed from: i */
    public SolverVariable f2358i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C0474a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2360a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2360a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2360a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.C0474a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f2353d = constraintWidget;
        this.f2354e = type;
    }

    /* renamed from: a */
    public boolean mo4305a(ConstraintAnchor constraintAnchor, int i) {
        return mo4306b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public boolean mo4306b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            mo4321q();
            return true;
        } else if (!z && !mo4320p(constraintAnchor)) {
            return false;
        } else {
            this.f2355f = constraintAnchor;
            if (constraintAnchor.f2350a == null) {
                constraintAnchor.f2350a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f2355f.f2350a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f2356g = i;
            this.f2357h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public void mo4307c(int i, ArrayList<xk7> arrayList, xk7 xk7) {
        HashSet<ConstraintAnchor> hashSet = this.f2350a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                vj2.m28825a(it.next().f2353d, i, arrayList, xk7);
            }
        }
    }

    /* renamed from: d */
    public HashSet<ConstraintAnchor> mo4308d() {
        return this.f2350a;
    }

    /* renamed from: e */
    public int mo4309e() {
        if (!this.f2352c) {
            return 0;
        }
        return this.f2351b;
    }

    /* renamed from: f */
    public int mo4310f() {
        ConstraintAnchor constraintAnchor;
        if (this.f2353d.mo4367U() == 8) {
            return 0;
        }
        if (this.f2357h == Integer.MIN_VALUE || (constraintAnchor = this.f2355f) == null || constraintAnchor.f2353d.mo4367U() != 8) {
            return this.f2356g;
        }
        return this.f2357h;
    }

    /* renamed from: g */
    public final ConstraintAnchor mo4311g() {
        switch (C0474a.f2360a[this.f2354e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2353d.f2396R;
            case 3:
                return this.f2353d.f2392P;
            case 4:
                return this.f2353d.f2398S;
            case 5:
                return this.f2353d.f2394Q;
            default:
                throw new AssertionError(this.f2354e.name());
        }
    }

    /* renamed from: h */
    public ConstraintWidget mo4312h() {
        return this.f2353d;
    }

    /* renamed from: i */
    public SolverVariable mo4313i() {
        return this.f2358i;
    }

    /* renamed from: j */
    public ConstraintAnchor mo4314j() {
        return this.f2355f;
    }

    /* renamed from: k */
    public Type mo4315k() {
        return this.f2354e;
    }

    /* renamed from: l */
    public boolean mo4316l() {
        HashSet<ConstraintAnchor> hashSet = this.f2350a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo4311g().mo4319o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo4317m() {
        HashSet<ConstraintAnchor> hashSet = this.f2350a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo4318n() {
        return this.f2352c;
    }

    /* renamed from: o */
    public boolean mo4319o() {
        if (this.f2355f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo4320p(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type k = constraintAnchor.mo4315k();
        Type type = this.f2354e;
        if (k != type) {
            switch (C0474a.f2360a[type.ordinal()]) {
                case 1:
                    if (k == Type.BASELINE || k == Type.CENTER_X || k == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (k == Type.LEFT || k == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(constraintAnchor.mo4312h() instanceof C0489f)) {
                        return z;
                    }
                    if (z || k == Type.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (k == Type.TOP || k == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(constraintAnchor.mo4312h() instanceof C0489f)) {
                        return z2;
                    }
                    if (z2 || k == Type.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                    if (k == Type.LEFT || k == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f2354e.name());
            }
        } else if (type != Type.BASELINE || (constraintAnchor.mo4312h().mo4375Y() && mo4312h().mo4375Y())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public void mo4321q() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f2355f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f2350a) == null)) {
            hashSet.remove(this);
            if (this.f2355f.f2350a.size() == 0) {
                this.f2355f.f2350a = null;
            }
        }
        this.f2350a = null;
        this.f2355f = null;
        this.f2356g = 0;
        this.f2357h = Integer.MIN_VALUE;
        this.f2352c = false;
        this.f2351b = 0;
    }

    /* renamed from: r */
    public void mo4322r() {
        this.f2352c = false;
        this.f2351b = 0;
    }

    /* renamed from: s */
    public void mo4323s(d80 d80) {
        SolverVariable solverVariable = this.f2358i;
        if (solverVariable == null) {
            this.f2358i = new SolverVariable(SolverVariable.Type.UNRESTRICTED, (String) null);
        } else {
            solverVariable.mo4207g();
        }
    }

    /* renamed from: t */
    public void mo4324t(int i) {
        this.f2351b = i;
        this.f2352c = true;
    }

    public String toString() {
        return this.f2353d.mo4433v() + ":" + this.f2354e.toString();
    }

    /* renamed from: u */
    public void mo4326u(int i) {
        if (mo4319o()) {
            this.f2357h = i;
        }
    }
}
