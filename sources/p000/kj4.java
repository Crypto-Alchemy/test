package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p000.bg0;
import p000.yc3;

/* renamed from: kj4 */
/* compiled from: OverridingUtilTypeSystemContext.kt */
public final class kj4 implements bg0 {

    /* renamed from: a */
    public final Map<yz6, yz6> f38914a;

    /* renamed from: b */
    public final yc3.C9638a f38915b;

    /* renamed from: c */
    public final bd3 f38916c;

    /* renamed from: d */
    public final KotlinTypePreparator f38917d;

    /* renamed from: e */
    public final fd2<xc3, xc3, Boolean> f38918e;

    /* renamed from: kj4$a */
    /* compiled from: OverridingUtilTypeSystemContext.kt */
    public static final class C7350a extends TypeCheckerState {

        /* renamed from: k */
        public final /* synthetic */ kj4 f38919k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7350a(boolean z, boolean z2, kj4 kj4, KotlinTypePreparator kotlinTypePreparator, bd3 bd3) {
            super(z, z2, true, kj4, kotlinTypePreparator, bd3);
            this.f38919k = kj4;
        }

        /* renamed from: f */
        public boolean mo52960f(ad3 ad3, ad3 ad32) {
            vx2.m53591g(ad3, "subType");
            vx2.m53591g(ad32, "superType");
            if (!(ad3 instanceof xc3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (ad32 instanceof xc3) {
                return ((Boolean) this.f38919k.f38918e.invoke(ad3, ad32)).booleanValue();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
    }

    public kj4(Map<yz6, ? extends yz6> map, yc3.C9638a aVar, bd3 bd3, KotlinTypePreparator kotlinTypePreparator, fd2<? super xc3, ? super xc3, Boolean> fd2) {
        vx2.m53591g(aVar, "equalityAxioms");
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        vx2.m53591g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f38914a = map;
        this.f38915b = aVar;
        this.f38916c = bd3;
        this.f38917d = kotlinTypePreparator;
        this.f38918e = fd2;
    }

    /* renamed from: A */
    public List<nz6> mo51042A(ad3 ad3) {
        return bg0.C6861a.m55939r(this, ad3);
    }

    /* renamed from: A0 */
    public nz6 mo51043A0(mz6 mz6, int i) {
        return bg0.C6861a.m55933o(this, mz6, i);
    }

    /* renamed from: B */
    public boolean mo51044B(f36 f36) {
        return bg0.C6861a.m55899U(this, f36);
    }

    /* renamed from: B0 */
    public ad3 mo51045B0(ad3 ad3, boolean z) {
        return bg0.C6861a.m55883F0(this, ad3, z);
    }

    /* renamed from: C */
    public boolean mo51046C(f36 f36) {
        return bg0.C6861a.m55914e0(this, f36);
    }

    /* renamed from: C0 */
    public boolean mo51047C0(ad3 ad3) {
        return bg0.C6861a.m55902X(this, ad3);
    }

    /* renamed from: D */
    public int mo51048D(zz6 zz6) {
        return bg0.C6861a.m55946u0(this, zz6);
    }

    /* renamed from: D0 */
    public ad3 mo50567D0(f36 f36, f36 f362) {
        return bg0.C6861a.m55929m(this, f36, f362);
    }

    /* renamed from: E */
    public f36 mo51049E(ad3 ad3) {
        return bg0.C6861a.m55881E0(this, ad3);
    }

    /* renamed from: E0 */
    public fb1 mo51050E0(f36 f36) {
        return bg0.C6861a.m55913e(this, f36);
    }

    /* renamed from: F */
    public PrimitiveType mo51051F(zz6 zz6) {
        return bg0.C6861a.m55947v(this, zz6);
    }

    /* renamed from: G */
    public boolean mo51053G(ad3 ad3) {
        return bg0.C6861a.m55928l0(this, ad3);
    }

    /* renamed from: G0 */
    public final boolean mo52958G0(yz6 yz6, yz6 yz62) {
        if (this.f38915b.mo55047a(yz6, yz62)) {
            return true;
        }
        Map<yz6, yz6> map = this.f38914a;
        if (map == null) {
            return false;
        }
        yz6 yz63 = map.get(yz6);
        yz6 yz64 = this.f38914a.get(yz62);
        if (yz63 != null && vx2.m53586b(yz63, yz62)) {
            return true;
        }
        if (yz64 == null || !vx2.m53586b(yz64, yz6)) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public ad3 mo51054H(c17 c17) {
        return bg0.C6861a.m55951x(this, c17);
    }

    /* renamed from: H0 */
    public TypeCheckerState mo52959H0(boolean z, boolean z2) {
        if (this.f38918e == null) {
            return ag0.m55487a(z, z2, this, this.f38917d, this.f38916c);
        }
        return new C7350a(z, z2, this, this.f38917d, this.f38916c);
    }

    /* renamed from: I */
    public nz6 mo51055I(ad3 ad3) {
        return bg0.C6861a.m55923j(this, ad3);
    }

    /* renamed from: J */
    public nz6 mo51056J(mb0 mb0) {
        return bg0.C6861a.m55950w0(this, mb0);
    }

    /* renamed from: K */
    public c17 mo51057K(zz6 zz6, int i) {
        return bg0.C6861a.m55943t(this, zz6, i);
    }

    /* renamed from: L */
    public boolean mo51058L(f36 f36, f36 f362) {
        return bg0.C6861a.m55887I(this, f36, f362);
    }

    /* renamed from: M */
    public boolean mo51059M(ad3 ad3) {
        return bg0.C6861a.m55904Z(this, ad3);
    }

    /* renamed from: N */
    public boolean mo51060N(f36 f36) {
        return bg0.C6861a.m55903Y(this, f36);
    }

    /* renamed from: O */
    public nz6 mo51061O(f36 f36, int i) {
        return bg0.C6861a.m55937q(this, f36, i);
    }

    /* renamed from: P */
    public boolean mo51062P(zz6 zz6) {
        return bg0.C6861a.m55908b0(this, zz6);
    }

    /* renamed from: Q */
    public boolean mo51063Q(ad3 ad3, u82 u82) {
        return bg0.C6861a.m55882F(this, ad3, u82);
    }

    /* renamed from: R */
    public boolean mo51064R(zz6 zz6) {
        return bg0.C6861a.m55893O(this, zz6);
    }

    /* renamed from: S */
    public nz6 mo51065S(ad3 ad3, int i) {
        return bg0.C6861a.m55935p(this, ad3, i);
    }

    /* renamed from: T */
    public boolean mo51066T(ad3 ad3) {
        return bg0.C6861a.m55910c0(this, ad3);
    }

    /* renamed from: U */
    public List<f36> mo51067U(f36 f36, zz6 zz6) {
        return bg0.C6861a.m55931n(this, f36, zz6);
    }

    /* renamed from: V */
    public boolean mo51068V(ad3 ad3) {
        return bg0.C6861a.m55897S(this, ad3);
    }

    /* renamed from: W */
    public boolean mo51069W(c17 c17, zz6 zz6) {
        return bg0.C6861a.m55886H(this, c17, zz6);
    }

    /* renamed from: X */
    public int mo51070X(ad3 ad3) {
        return bg0.C6861a.m55907b(this, ad3);
    }

    /* renamed from: Y */
    public boolean mo51071Y(nz6 nz6) {
        return bg0.C6861a.m55922i0(this, nz6);
    }

    /* renamed from: Z */
    public TypeVariance mo51072Z(nz6 nz6) {
        return bg0.C6861a.m55878D(this, nz6);
    }

    /* renamed from: a */
    public f36 mo50568a(ad3 ad3) {
        return bg0.C6861a.m55921i(this, ad3);
    }

    /* renamed from: a0 */
    public mz6 mo51073a0(f36 f36) {
        return bg0.C6861a.m55909c(this, f36);
    }

    /* renamed from: b */
    public f36 mo50569b(f36 f36, boolean z) {
        return bg0.C6861a.m55885G0(this, f36, z);
    }

    /* renamed from: b0 */
    public boolean mo51074b0(f36 f36) {
        return bg0.C6861a.m55926k0(this, f36);
    }

    /* renamed from: c */
    public zz6 mo50570c(f36 f36) {
        return bg0.C6861a.m55877C0(this, f36);
    }

    /* renamed from: c0 */
    public mb0 mo51075c0(nb0 nb0) {
        return bg0.C6861a.m55873A0(this, nb0);
    }

    /* renamed from: d */
    public f36 mo50571d(l42 l42) {
        return bg0.C6861a.m55932n0(this, l42);
    }

    /* renamed from: d0 */
    public List<c17> mo51076d0(zz6 zz6) {
        return bg0.C6861a.m55945u(this, zz6);
    }

    /* renamed from: e */
    public boolean mo50572e(f36 f36) {
        return bg0.C6861a.m55918g0(this, f36);
    }

    /* renamed from: e0 */
    public boolean mo51077e0(f36 f36) {
        return bg0.C6861a.m55891M(this, f36);
    }

    /* renamed from: f */
    public nb0 mo50573f(f36 f36) {
        return bg0.C6861a.m55911d(this, f36);
    }

    /* renamed from: f0 */
    public f36 mo51078f0(ad3 ad3) {
        return bg0.C6861a.m55934o0(this, ad3);
    }

    /* renamed from: g */
    public f36 mo50574g(l42 l42) {
        return bg0.C6861a.m55879D0(this, l42);
    }

    /* renamed from: g0 */
    public Collection<ad3> mo51079g0(zz6 zz6) {
        return bg0.C6861a.m55956z0(this, zz6);
    }

    /* renamed from: h */
    public boolean mo51080h(nb0 nb0) {
        return bg0.C6861a.m55912d0(this, nb0);
    }

    /* renamed from: h0 */
    public boolean mo51081h0(zz6 zz6) {
        return bg0.C6861a.m55895Q(this, zz6);
    }

    /* renamed from: i */
    public int mo51082i(mz6 mz6) {
        return bg0.C6861a.m55952x0(this, mz6);
    }

    /* renamed from: i0 */
    public boolean mo51083i0(f36 f36) {
        return bg0.C6861a.m55924j0(this, f36);
    }

    /* renamed from: j */
    public List<ad3> mo51084j(c17 c17) {
        return bg0.C6861a.m55876C(this, c17);
    }

    /* renamed from: j0 */
    public boolean mo51085j0(ad3 ad3) {
        return bg0.C6861a.m55906a0(this, ad3);
    }

    /* renamed from: k */
    public boolean mo51086k(ad3 ad3) {
        return bg0.C6861a.m55896R(this, ad3);
    }

    /* renamed from: k0 */
    public ad3 mo51087k0(List<? extends ad3> list) {
        return bg0.C6861a.m55888J(this, list);
    }

    /* renamed from: l */
    public ad3 mo51088l(nz6 nz6) {
        return bg0.C6861a.m55953y(this, nz6);
    }

    /* renamed from: l0 */
    public boolean mo51089l0(ad3 ad3) {
        return bg0.C6861a.m55890L(this, ad3);
    }

    /* renamed from: m */
    public boolean mo51090m(zz6 zz6) {
        return bg0.C6861a.m55901W(this, zz6);
    }

    /* renamed from: m0 */
    public ad3 mo51091m0(ad3 ad3) {
        return bg0.C6861a.m55938q0(this, ad3);
    }

    /* renamed from: n */
    public f36 mo51092n(f36 f36, CaptureStatus captureStatus) {
        return bg0.C6861a.m55925k(this, f36, captureStatus);
    }

    /* renamed from: n0 */
    public boolean mo51093n0(zz6 zz6) {
        return bg0.C6861a.m55930m0(this, zz6);
    }

    /* renamed from: o */
    public boolean mo51094o(zz6 zz6) {
        return bg0.C6861a.m55898T(this, zz6);
    }

    /* renamed from: o0 */
    public pl1 mo51095o0(l42 l42) {
        return bg0.C6861a.m55915f(this, l42);
    }

    /* renamed from: p */
    public boolean mo51096p(zz6 zz6) {
        return bg0.C6861a.m55892N(this, zz6);
    }

    /* renamed from: p0 */
    public ad3 mo51097p0(ad3 ad3) {
        return bg0.C6861a.m55940r0(this, ad3);
    }

    /* renamed from: q */
    public TypeVariance mo51098q(c17 c17) {
        return bg0.C6861a.m55880E(this, c17);
    }

    /* renamed from: q0 */
    public ad3 mo51099q0(ad3 ad3) {
        return bg0.C6861a.m55874B(this, ad3);
    }

    /* renamed from: r */
    public ad3 mo51100r(nb0 nb0) {
        return bg0.C6861a.m55936p0(this, nb0);
    }

    /* renamed from: r0 */
    public v82 mo51101r0(zz6 zz6) {
        return bg0.C6861a.m55941s(this, zz6);
    }

    /* renamed from: s */
    public Collection<ad3> mo51102s(f36 f36) {
        return bg0.C6861a.m55948v0(this, f36);
    }

    /* renamed from: s0 */
    public boolean mo51103s0(zz6 zz6, zz6 zz62) {
        vx2.m53591g(zz6, "c1");
        vx2.m53591g(zz62, "c2");
        if (!(zz6 instanceof yz6)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!(zz62 instanceof yz6)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (bg0.C6861a.m55905a(this, zz6, zz62) || mo52958G0((yz6) zz6, (yz6) zz62)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: t */
    public CaptureStatus mo51104t(nb0 nb0) {
        return bg0.C6861a.m55927l(this, nb0);
    }

    /* renamed from: t0 */
    public l42 mo51105t0(ad3 ad3) {
        return bg0.C6861a.m55917g(this, ad3);
    }

    /* renamed from: u */
    public boolean mo51106u(ad3 ad3) {
        return bg0.C6861a.m55884G(this, ad3);
    }

    /* renamed from: u0 */
    public zz6 mo51107u0(ad3 ad3) {
        return bg0.C6861a.m55875B0(this, ad3);
    }

    /* renamed from: v */
    public boolean mo51108v(ad3 ad3) {
        return bg0.C6861a.m55894P(this, ad3);
    }

    /* renamed from: v0 */
    public PrimitiveType mo51109v0(zz6 zz6) {
        return bg0.C6861a.m55949w(this, zz6);
    }

    /* renamed from: w */
    public TypeCheckerState.C7720b mo51110w(f36 f36) {
        return bg0.C6861a.m55954y0(this, f36);
    }

    /* renamed from: w0 */
    public boolean mo51111w0(zz6 zz6) {
        return bg0.C6861a.m55900V(this, zz6);
    }

    /* renamed from: x */
    public c17 mo51112x(a27 a27) {
        return bg0.C6861a.m55955z(this, a27);
    }

    /* renamed from: x0 */
    public f36 mo51113x0(fb1 fb1) {
        return bg0.C6861a.m55944t0(this, fb1);
    }

    /* renamed from: y */
    public c17 mo51114y(zz6 zz6) {
        return bg0.C6861a.m55872A(this, zz6);
    }

    /* renamed from: y0 */
    public boolean mo51115y0(zz6 zz6) {
        return bg0.C6861a.m55889K(this, zz6);
    }

    /* renamed from: z */
    public k75 mo51116z(l42 l42) {
        return bg0.C6861a.m55919h(this, l42);
    }

    /* renamed from: z0 */
    public boolean mo51117z0(nb0 nb0) {
        return bg0.C6861a.m55916f0(this, nb0);
    }
}
