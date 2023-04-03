package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cs8 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class cs8 {

    /* renamed from: A */
    public long f27918A;

    /* renamed from: B */
    public long f27919B;

    /* renamed from: C */
    public String f27920C;

    /* renamed from: D */
    public boolean f27921D;

    /* renamed from: E */
    public long f27922E;

    /* renamed from: F */
    public long f27923F;

    /* renamed from: a */
    public final kr8 f27924a;

    /* renamed from: b */
    public final String f27925b;

    /* renamed from: c */
    public String f27926c;

    /* renamed from: d */
    public String f27927d;

    /* renamed from: e */
    public String f27928e;

    /* renamed from: f */
    public String f27929f;

    /* renamed from: g */
    public long f27930g;

    /* renamed from: h */
    public long f27931h;

    /* renamed from: i */
    public long f27932i;

    /* renamed from: j */
    public String f27933j;

    /* renamed from: k */
    public long f27934k;

    /* renamed from: l */
    public String f27935l;

    /* renamed from: m */
    public long f27936m;

    /* renamed from: n */
    public long f27937n;

    /* renamed from: o */
    public boolean f27938o;

    /* renamed from: p */
    public long f27939p;

    /* renamed from: q */
    public boolean f27940q;

    /* renamed from: r */
    public String f27941r;

    /* renamed from: s */
    public Boolean f27942s;

    /* renamed from: t */
    public long f27943t;

    /* renamed from: u */
    public List<String> f27944u;

    /* renamed from: v */
    public String f27945v;

    /* renamed from: w */
    public long f27946w;

    /* renamed from: x */
    public long f27947x;

    /* renamed from: y */
    public long f27948y;

    /* renamed from: z */
    public long f27949z;

    public cs8(kr8 kr8, String str) {
        cu4.m43221k(kr8);
        cu4.m43217g(str);
        this.f27924a = kr8;
        this.f27925b = str;
        kr8.mo45272s().mo29006e();
    }

    /* renamed from: A */
    public final boolean mo41650A() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27921D;
    }

    /* renamed from: B */
    public final String mo41651B() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27920C;
    }

    /* renamed from: C */
    public final String mo41652C() {
        this.f27924a.mo45272s().mo29006e();
        String str = this.f27920C;
        mo41653D((String) null);
        return str;
    }

    /* renamed from: D */
    public final void mo41653D(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27920C, str);
        this.f27920C = str;
    }

    /* renamed from: E */
    public final long mo41654E() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27939p;
    }

    /* renamed from: F */
    public final void mo41655F(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27939p != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27939p = j;
    }

    /* renamed from: G */
    public final boolean mo41656G() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27940q;
    }

    /* renamed from: H */
    public final void mo41657H(boolean z) {
        boolean z2;
        this.f27924a.mo45272s().mo29006e();
        boolean z3 = this.f27921D;
        if (this.f27940q != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f27921D = z3 | z2;
        this.f27940q = z;
    }

    /* renamed from: I */
    public final Boolean mo41658I() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27942s;
    }

    /* renamed from: J */
    public final void mo41659J(Boolean bool) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        Boolean bool2 = this.f27942s;
        String[] strArr = g69.f29098g;
        if (bool2 == null && bool == null) {
            z = true;
        } else if (bool2 == null) {
            z = false;
        } else {
            z = bool2.equals(bool);
        }
        this.f27921D = z2 | (!z);
        this.f27942s = bool;
    }

    /* renamed from: K */
    public final List<String> mo41660K() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27944u;
    }

    /* renamed from: L */
    public final void mo41661L(List<String> list) {
        ArrayList arrayList;
        this.f27924a.mo45272s().mo29006e();
        List<String> list2 = this.f27944u;
        String[] strArr = g69.f29098g;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.f27921D = true;
                if (list != null) {
                    arrayList = new ArrayList(list);
                } else {
                    arrayList = null;
                }
                this.f27944u = arrayList;
            }
        }
    }

    /* renamed from: M */
    public final void mo41662M() {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D = false;
    }

    /* renamed from: N */
    public final String mo41663N() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27925b;
    }

    /* renamed from: O */
    public final String mo41664O() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27926c;
    }

    /* renamed from: P */
    public final void mo41665P(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27926c, str);
        this.f27926c = str;
    }

    /* renamed from: Q */
    public final String mo41666Q() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27927d;
    }

    /* renamed from: R */
    public final void mo41667R(String str) {
        this.f27924a.mo45272s().mo29006e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f27921D |= true ^ g69.m44578G(this.f27927d, str);
        this.f27927d = str;
    }

    /* renamed from: S */
    public final String mo41668S() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27941r;
    }

    /* renamed from: T */
    public final void mo41669T(String str) {
        this.f27924a.mo45272s().mo29006e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f27921D |= true ^ g69.m44578G(this.f27941r, str);
        this.f27941r = str;
    }

    /* renamed from: U */
    public final String mo41670U() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27945v;
    }

    /* renamed from: V */
    public final void mo41671V(String str) {
        this.f27924a.mo45272s().mo29006e();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f27921D |= true ^ g69.m44578G(this.f27945v, str);
        this.f27945v = str;
    }

    /* renamed from: W */
    public final String mo41672W() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27928e;
    }

    /* renamed from: X */
    public final void mo41673X(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27928e, str);
        this.f27928e = str;
    }

    /* renamed from: Y */
    public final String mo41674Y() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27929f;
    }

    /* renamed from: Z */
    public final void mo41675Z(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27929f, str);
        this.f27929f = str;
    }

    /* renamed from: a */
    public final void mo41676a(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27936m != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27936m = j;
    }

    /* renamed from: a0 */
    public final long mo41677a0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27931h;
    }

    /* renamed from: b */
    public final long mo41678b() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27937n;
    }

    /* renamed from: b0 */
    public final void mo41679b0(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27931h != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27931h = j;
    }

    /* renamed from: c */
    public final void mo41680c(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27937n != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27937n = j;
    }

    /* renamed from: c0 */
    public final long mo41681c0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27932i;
    }

    /* renamed from: d */
    public final long mo41682d() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27943t;
    }

    /* renamed from: d0 */
    public final void mo41683d0(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27932i != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27932i = j;
    }

    /* renamed from: e */
    public final void mo41684e(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27943t != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27943t = j;
    }

    /* renamed from: e0 */
    public final String mo41685e0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27933j;
    }

    /* renamed from: f */
    public final boolean mo41686f() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27938o;
    }

    /* renamed from: f0 */
    public final void mo41687f0(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27933j, str);
        this.f27933j = str;
    }

    /* renamed from: g */
    public final void mo41688g(boolean z) {
        boolean z2;
        this.f27924a.mo45272s().mo29006e();
        boolean z3 = this.f27921D;
        if (this.f27938o != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f27921D = z3 | z2;
        this.f27938o = z;
    }

    /* renamed from: g0 */
    public final long mo41689g0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27934k;
    }

    /* renamed from: h */
    public final void mo41690h(long j) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        cu4.m43211a(z);
        this.f27924a.mo45272s().mo29006e();
        boolean z3 = this.f27921D;
        if (this.f27930g == j) {
            z2 = false;
        }
        this.f27921D = z3 | z2;
        this.f27930g = j;
    }

    /* renamed from: h0 */
    public final void mo41691h0(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27934k != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27934k = j;
    }

    /* renamed from: i */
    public final long mo41692i() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27930g;
    }

    /* renamed from: i0 */
    public final String mo41693i0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27935l;
    }

    /* renamed from: j */
    public final long mo41694j() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27922E;
    }

    /* renamed from: j0 */
    public final void mo41695j0(String str) {
        this.f27924a.mo45272s().mo29006e();
        this.f27921D |= !g69.m44578G(this.f27935l, str);
        this.f27935l = str;
    }

    /* renamed from: k */
    public final void mo41696k(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27922E != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27922E = j;
    }

    /* renamed from: k0 */
    public final long mo41697k0() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27936m;
    }

    /* renamed from: l */
    public final long mo41698l() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27923F;
    }

    /* renamed from: m */
    public final void mo41699m(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27923F != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27923F = j;
    }

    /* renamed from: n */
    public final void mo41700n() {
        this.f27924a.mo45272s().mo29006e();
        long j = this.f27930g + 1;
        if (j > 2147483647L) {
            this.f27924a.mo45237A().mo29673o().mo48770b("Bundle index overflow. appId", bn8.m32664w(this.f27925b));
            j = 0;
        }
        this.f27921D = true;
        this.f27930g = j;
    }

    /* renamed from: o */
    public final long mo41701o() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27946w;
    }

    /* renamed from: p */
    public final void mo41702p(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27946w != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27946w = j;
    }

    /* renamed from: q */
    public final long mo41703q() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27947x;
    }

    /* renamed from: r */
    public final void mo41704r(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27947x != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27947x = j;
    }

    /* renamed from: s */
    public final long mo41705s() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27948y;
    }

    /* renamed from: t */
    public final void mo41706t(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27948y != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27948y = j;
    }

    /* renamed from: u */
    public final long mo41707u() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27949z;
    }

    /* renamed from: v */
    public final void mo41708v(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27949z != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27949z = j;
    }

    /* renamed from: w */
    public final long mo41709w() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27919B;
    }

    /* renamed from: x */
    public final void mo41710x(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27919B != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27919B = j;
    }

    /* renamed from: y */
    public final long mo41711y() {
        this.f27924a.mo45272s().mo29006e();
        return this.f27918A;
    }

    /* renamed from: z */
    public final void mo41712z(long j) {
        boolean z;
        this.f27924a.mo45272s().mo29006e();
        boolean z2 = this.f27921D;
        if (this.f27918A != j) {
            z = true;
        } else {
            z = false;
        }
        this.f27921D = z2 | z;
        this.f27918A = j;
    }
}
