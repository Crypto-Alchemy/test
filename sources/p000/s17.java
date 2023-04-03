package p000;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* renamed from: s17 */
/* compiled from: TypeSystemContext.kt */
public interface s17 extends v17 {

    /* renamed from: s17$a */
    /* compiled from: TypeSystemContext.kt */
    public static final class C9299a {
        /* renamed from: a */
        public static List<f36> m71839a(s17 s17, f36 f36, zz6 zz6) {
            vx2.m53591g(f36, "$receiver");
            vx2.m53591g(zz6, "constructor");
            return null;
        }

        /* renamed from: b */
        public static nz6 m71840b(s17 s17, mz6 mz6, int i) {
            vx2.m53591g(mz6, "$receiver");
            if (mz6 instanceof f36) {
                return s17.mo51065S((ad3) mz6, i);
            }
            if (mz6 instanceof ArgumentList) {
                Object obj = ((ArgumentList) mz6).get(i);
                vx2.m53590f(obj, "get(index)");
                return (nz6) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + mz6 + ", " + ua5.m52727b(mz6.getClass())).toString());
        }

        /* renamed from: c */
        public static nz6 m71841c(s17 s17, f36 f36, int i) {
            vx2.m53591g(f36, "$receiver");
            boolean z = false;
            if (i >= 0 && i < s17.mo51070X(f36)) {
                z = true;
            }
            if (z) {
                return s17.mo51065S(f36, i);
            }
            return null;
        }

        /* renamed from: d */
        public static boolean m71842d(s17 s17, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (s17.mo51060N(s17.mo51078f0(ad3)) != s17.mo51060N(s17.mo51049E(ad3))) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public static boolean m71843e(s17 s17, ad3 ad3) {
            nb0 nb0;
            vx2.m53591g(ad3, "$receiver");
            f36 a = s17.mo50568a(ad3);
            if (a != null) {
                nb0 = s17.mo50573f(a);
            } else {
                nb0 = null;
            }
            if (nb0 != null) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public static boolean m71844f(s17 s17, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            return s17.mo51096p(s17.mo50570c(f36));
        }

        /* renamed from: g */
        public static boolean m71845g(s17 s17, ad3 ad3) {
            fb1 fb1;
            vx2.m53591g(ad3, "$receiver");
            f36 a = s17.mo50568a(ad3);
            if (a != null) {
                fb1 = s17.mo51050E0(a);
            } else {
                fb1 = null;
            }
            if (fb1 != null) {
                return true;
            }
            return false;
        }

        /* renamed from: h */
        public static boolean m71846h(s17 s17, ad3 ad3) {
            pl1 pl1;
            vx2.m53591g(ad3, "$receiver");
            l42 t0 = s17.mo51105t0(ad3);
            if (t0 != null) {
                pl1 = s17.mo51095o0(t0);
            } else {
                pl1 = null;
            }
            if (pl1 != null) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public static boolean m71847i(s17 s17, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            return s17.mo51111w0(s17.mo50570c(f36));
        }

        /* renamed from: j */
        public static boolean m71848j(s17 s17, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (!(ad3 instanceof f36) || !s17.mo51060N((f36) ad3)) {
                return false;
            }
            return true;
        }

        /* renamed from: k */
        public static boolean m71849k(s17 s17, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (!s17.mo51062P(s17.mo51107u0(ad3)) || s17.mo51066T(ad3)) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public static f36 m71850l(s17 s17, ad3 ad3) {
            f36 d;
            vx2.m53591g(ad3, "$receiver");
            l42 t0 = s17.mo51105t0(ad3);
            if (t0 != null && (d = s17.mo50571d(t0)) != null) {
                return d;
            }
            f36 a = s17.mo50568a(ad3);
            vx2.m53588d(a);
            return a;
        }

        /* renamed from: m */
        public static int m71851m(s17 s17, mz6 mz6) {
            vx2.m53591g(mz6, "$receiver");
            if (mz6 instanceof f36) {
                return s17.mo51070X((ad3) mz6);
            }
            if (mz6 instanceof ArgumentList) {
                return ((ArgumentList) mz6).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + mz6 + ", " + ua5.m52727b(mz6.getClass())).toString());
        }

        /* renamed from: n */
        public static zz6 m71852n(s17 s17, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            f36 a = s17.mo50568a(ad3);
            if (a == null) {
                a = s17.mo51078f0(ad3);
            }
            return s17.mo50570c(a);
        }

        /* renamed from: o */
        public static f36 m71853o(s17 s17, ad3 ad3) {
            f36 g;
            vx2.m53591g(ad3, "$receiver");
            l42 t0 = s17.mo51105t0(ad3);
            if (t0 != null && (g = s17.mo50574g(t0)) != null) {
                return g;
            }
            f36 a = s17.mo50568a(ad3);
            vx2.m53588d(a);
            return a;
        }
    }

    /* renamed from: A */
    List<nz6> mo51042A(ad3 ad3);

    /* renamed from: A0 */
    nz6 mo51043A0(mz6 mz6, int i);

    /* renamed from: B */
    boolean mo51044B(f36 f36);

    /* renamed from: B0 */
    ad3 mo51045B0(ad3 ad3, boolean z);

    /* renamed from: C */
    boolean mo51046C(f36 f36);

    /* renamed from: C0 */
    boolean mo51047C0(ad3 ad3);

    /* renamed from: D */
    int mo51048D(zz6 zz6);

    /* renamed from: E */
    f36 mo51049E(ad3 ad3);

    /* renamed from: E0 */
    fb1 mo51050E0(f36 f36);

    /* renamed from: G */
    boolean mo51053G(ad3 ad3);

    /* renamed from: I */
    nz6 mo51055I(ad3 ad3);

    /* renamed from: J */
    nz6 mo51056J(mb0 mb0);

    /* renamed from: K */
    c17 mo51057K(zz6 zz6, int i);

    /* renamed from: M */
    boolean mo51059M(ad3 ad3);

    /* renamed from: N */
    boolean mo51060N(f36 f36);

    /* renamed from: O */
    nz6 mo51061O(f36 f36, int i);

    /* renamed from: P */
    boolean mo51062P(zz6 zz6);

    /* renamed from: R */
    boolean mo51064R(zz6 zz6);

    /* renamed from: S */
    nz6 mo51065S(ad3 ad3, int i);

    /* renamed from: T */
    boolean mo51066T(ad3 ad3);

    /* renamed from: U */
    List<f36> mo51067U(f36 f36, zz6 zz6);

    /* renamed from: V */
    boolean mo51068V(ad3 ad3);

    /* renamed from: W */
    boolean mo51069W(c17 c17, zz6 zz6);

    /* renamed from: X */
    int mo51070X(ad3 ad3);

    /* renamed from: Y */
    boolean mo51071Y(nz6 nz6);

    /* renamed from: Z */
    TypeVariance mo51072Z(nz6 nz6);

    /* renamed from: a */
    f36 mo50568a(ad3 ad3);

    /* renamed from: a0 */
    mz6 mo51073a0(f36 f36);

    /* renamed from: b */
    f36 mo50569b(f36 f36, boolean z);

    /* renamed from: b0 */
    boolean mo51074b0(f36 f36);

    /* renamed from: c */
    zz6 mo50570c(f36 f36);

    /* renamed from: c0 */
    mb0 mo51075c0(nb0 nb0);

    /* renamed from: d */
    f36 mo50571d(l42 l42);

    /* renamed from: d0 */
    List<c17> mo51076d0(zz6 zz6);

    /* renamed from: e */
    boolean mo50572e(f36 f36);

    /* renamed from: e0 */
    boolean mo51077e0(f36 f36);

    /* renamed from: f */
    nb0 mo50573f(f36 f36);

    /* renamed from: f0 */
    f36 mo51078f0(ad3 ad3);

    /* renamed from: g */
    f36 mo50574g(l42 l42);

    /* renamed from: g0 */
    Collection<ad3> mo51079g0(zz6 zz6);

    /* renamed from: h */
    boolean mo51080h(nb0 nb0);

    /* renamed from: h0 */
    boolean mo51081h0(zz6 zz6);

    /* renamed from: i */
    int mo51082i(mz6 mz6);

    /* renamed from: i0 */
    boolean mo51083i0(f36 f36);

    /* renamed from: j */
    List<ad3> mo51084j(c17 c17);

    /* renamed from: j0 */
    boolean mo51085j0(ad3 ad3);

    /* renamed from: k */
    boolean mo51086k(ad3 ad3);

    /* renamed from: k0 */
    ad3 mo51087k0(List<? extends ad3> list);

    /* renamed from: l */
    ad3 mo51088l(nz6 nz6);

    /* renamed from: l0 */
    boolean mo51089l0(ad3 ad3);

    /* renamed from: m */
    boolean mo51090m(zz6 zz6);

    /* renamed from: m0 */
    ad3 mo51091m0(ad3 ad3);

    /* renamed from: n */
    f36 mo51092n(f36 f36, CaptureStatus captureStatus);

    /* renamed from: o0 */
    pl1 mo51095o0(l42 l42);

    /* renamed from: p */
    boolean mo51096p(zz6 zz6);

    /* renamed from: q */
    TypeVariance mo51098q(c17 c17);

    /* renamed from: r */
    ad3 mo51100r(nb0 nb0);

    /* renamed from: s */
    Collection<ad3> mo51102s(f36 f36);

    /* renamed from: s0 */
    boolean mo51103s0(zz6 zz6, zz6 zz62);

    /* renamed from: t */
    CaptureStatus mo51104t(nb0 nb0);

    /* renamed from: t0 */
    l42 mo51105t0(ad3 ad3);

    /* renamed from: u */
    boolean mo51106u(ad3 ad3);

    /* renamed from: u0 */
    zz6 mo51107u0(ad3 ad3);

    /* renamed from: v */
    boolean mo51108v(ad3 ad3);

    /* renamed from: w */
    TypeCheckerState.C7720b mo51110w(f36 f36);

    /* renamed from: w0 */
    boolean mo51111w0(zz6 zz6);

    /* renamed from: x */
    c17 mo51112x(a27 a27);

    /* renamed from: x0 */
    f36 mo51113x0(fb1 fb1);

    /* renamed from: y */
    c17 mo51114y(zz6 zz6);

    /* renamed from: y0 */
    boolean mo51115y0(zz6 zz6);

    /* renamed from: z */
    k75 mo51116z(l42 l42);

    /* renamed from: z0 */
    boolean mo51117z0(nb0 nb0);
}
