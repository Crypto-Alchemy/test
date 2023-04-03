package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: eb1 */
/* compiled from: SpecialTypes.kt */
public final class eb1 extends ub1 implements zy0, fb1 {

    /* renamed from: g */
    public static final C7028a f37495g = new C7028a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public final d36 f37496d;

    /* renamed from: e */
    public final boolean f37497e;

    /* renamed from: eb1$a */
    /* compiled from: SpecialTypes.kt */
    public static final class C7028a {
        public C7028a() {
        }

        public /* synthetic */ C7028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ eb1 m57265c(C7028a aVar, w47 w47, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo51437b(w47, z);
        }

        /* renamed from: a */
        public final boolean mo51436a(w47 w47) {
            if ((w47.mo51134H0() instanceof n64) || (w47.mo51134H0().mo51180d() instanceof a17) || (w47 instanceof d64) || (w47 instanceof ec6)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final eb1 mo51437b(w47 w47, boolean z) {
            vx2.m53591g(w47, "type");
            if (w47 instanceof eb1) {
                return (eb1) w47;
            }
            if (!mo51438d(w47, z)) {
                return null;
            }
            if (w47 instanceof i42) {
                i42 i42 = (i42) w47;
                vx2.m53586b(i42.mo52399P0().mo51134H0(), i42.mo52400Q0().mo51134H0());
            }
            return new eb1(n42.m64517c(w47).mo51121O0(false), z, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public final boolean mo51438d(w47 w47, boolean z) {
            b17 b17;
            boolean z2 = false;
            if (!mo51436a(w47)) {
                return false;
            }
            if (w47 instanceof ec6) {
                return x17.m73828l(w47);
            }
            eg0 d = w47.mo51134H0().mo51180d();
            if (d instanceof b17) {
                b17 = (b17) d;
            } else {
                b17 = null;
            }
            if (b17 != null && !b17.mo50456N0()) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            if (!z || !(w47.mo51134H0().mo51180d() instanceof a17)) {
                return !dc4.f37271a.mo51172a(w47);
            }
            return x17.m73828l(w47);
        }
    }

    public eb1(d36 d36, boolean z) {
        this.f37496d = d36;
        this.f37497e = z;
    }

    public /* synthetic */ eb1(d36 d36, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(d36, z);
    }

    /* renamed from: I0 */
    public boolean mo51135I0() {
        return false;
    }

    /* renamed from: O0 */
    public d36 mo51137L0(boolean z) {
        if (z) {
            return mo51431Q0().mo51121O0(z);
        }
        return this;
    }

    /* renamed from: P0 */
    public d36 mo51139N0(rz6 rz6) {
        vx2.m53591g(rz6, "newAttributes");
        return new eb1(mo51431Q0().mo51122P0(rz6), this.f37497e);
    }

    /* renamed from: Q */
    public xc3 mo51430Q(xc3 xc3) {
        vx2.m53591g(xc3, "replacement");
        return o66.m70164d(xc3.mo64506K0(), this.f37497e);
    }

    /* renamed from: Q0 */
    public d36 mo51431Q0() {
        return this.f37496d;
    }

    /* renamed from: T0 */
    public final d36 mo51433T0() {
        return this.f37496d;
    }

    /* renamed from: U0 */
    public eb1 mo51432S0(d36 d36) {
        vx2.m53591g(d36, "delegate");
        return new eb1(d36, this.f37497e);
    }

    public String toString() {
        return mo51431Q0() + " & Any";
    }

    /* renamed from: y0 */
    public boolean mo51435y0() {
        if ((mo51431Q0().mo51134H0() instanceof n64) || (mo51431Q0().mo51134H0().mo51180d() instanceof a17)) {
            return true;
        }
        return false;
    }
}
