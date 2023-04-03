package p000;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.r17;
import p000.u17;

/* renamed from: bg0 */
/* compiled from: ClassicTypeSystemContext.kt */
public interface bg0 extends r17, u17 {

    /* renamed from: bg0$a */
    /* compiled from: ClassicTypeSystemContext.kt */
    public static final class C6861a {

        /* renamed from: bg0$a$a */
        /* compiled from: ClassicTypeSystemContext.kt */
        public static final class C6862a extends TypeCheckerState.C7720b.C7721a {

            /* renamed from: a */
            public final /* synthetic */ bg0 f36801a;

            /* renamed from: b */
            public final /* synthetic */ TypeSubstitutor f36802b;

            public C6862a(bg0 bg0, TypeSubstitutor typeSubstitutor) {
                this.f36801a = bg0;
                this.f36802b = typeSubstitutor;
            }

            /* renamed from: a */
            public f36 mo50575a(TypeCheckerState typeCheckerState, ad3 ad3) {
                vx2.m53591g(typeCheckerState, "state");
                vx2.m53591g(ad3, "type");
                bg0 bg0 = this.f36801a;
                TypeSubstitutor typeSubstitutor = this.f36802b;
                f36 f0 = bg0.mo51078f0(ad3);
                vx2.m53589e(f0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                xc3 n = typeSubstitutor.mo55338n((xc3) f0, Variance.INVARIANT);
                vx2.m53590f(n, "substitutor.safeSubstitu…VARIANT\n                )");
                f36 a = bg0.mo50568a(n);
                vx2.m53588d(a);
                return a;
            }
        }

        /* renamed from: A */
        public static c17 m55872A(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                if (d instanceof a17) {
                    return (a17) d;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: A0 */
        public static mb0 m55873A0(bg0 bg0, nb0 nb0) {
            vx2.m53591g(nb0, "$receiver");
            if (nb0 instanceof d64) {
                return ((d64) nb0).mo51134H0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nb0 + ", " + ua5.m52727b(nb0.getClass())).toString());
        }

        /* renamed from: B */
        public static ad3 m55874B(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return nu2.m70093e((xc3) ad3);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: B0 */
        public static zz6 m55875B0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72554n(bg0, ad3);
        }

        /* renamed from: C */
        public static List<ad3> m55876C(bg0 bg0, c17 c17) {
            vx2.m53591g(c17, "$receiver");
            if (c17 instanceof a17) {
                List<xc3> upperBounds = ((a17) c17).getUpperBounds();
                vx2.m53590f(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + ua5.m52727b(c17.getClass())).toString());
        }

        /* renamed from: C0 */
        public static zz6 m55877C0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return ((d36) f36).mo51134H0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: D */
        public static TypeVariance m55878D(bg0 bg0, nz6 nz6) {
            vx2.m53591g(nz6, "$receiver");
            if (nz6 instanceof f17) {
                Variance c = ((f17) nz6).mo51409c();
                vx2.m53590f(c, "this.projectionKind");
                return t17.m72145a(c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nz6 + ", " + ua5.m52727b(nz6.getClass())).toString());
        }

        /* renamed from: D0 */
        public static f36 m55879D0(bg0 bg0, l42 l42) {
            vx2.m53591g(l42, "$receiver");
            if (l42 instanceof i42) {
                return ((i42) l42).mo52400Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l42 + ", " + ua5.m52727b(l42.getClass())).toString());
        }

        /* renamed from: E */
        public static TypeVariance m55880E(bg0 bg0, c17 c17) {
            vx2.m53591g(c17, "$receiver");
            if (c17 instanceof a17) {
                Variance j = ((a17) c17).mo50049j();
                vx2.m53590f(j, "this.variance");
                return t17.m72145a(j);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + ua5.m52727b(c17.getClass())).toString());
        }

        /* renamed from: E0 */
        public static f36 m55881E0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72555o(bg0, ad3);
        }

        /* renamed from: F */
        public static boolean m55882F(bg0 bg0, ad3 ad3, u82 u82) {
            vx2.m53591g(ad3, "$receiver");
            vx2.m53591g(u82, "fqName");
            if (ad3 instanceof xc3) {
                return ((xc3) ad3).getAnnotations().mo51224C0(u82);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: F0 */
        public static ad3 m55883F0(bg0 bg0, ad3 ad3, boolean z) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof f36) {
                return bg0.mo50569b((f36) ad3, z);
            }
            if (ad3 instanceof l42) {
                l42 l42 = (l42) ad3;
                return bg0.mo50567D0(bg0.mo50569b(bg0.mo50571d(l42), z), bg0.mo50569b(bg0.mo50574g(l42), z));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: G */
        public static boolean m55884G(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72544d(bg0, ad3);
        }

        /* renamed from: G0 */
        public static f36 m55885G0(bg0 bg0, f36 f36, boolean z) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return ((d36) f36).mo51121O0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: H */
        public static boolean m55886H(bg0 bg0, c17 c17, zz6 zz6) {
            boolean z;
            vx2.m53591g(c17, "$receiver");
            if (c17 instanceof a17) {
                if (zz6 == null) {
                    z = true;
                } else {
                    z = zz6 instanceof yz6;
                }
                if (z) {
                    return TypeUtilsKt.m62956l((a17) c17, (yz6) zz6, (Set) null, 4, (Object) null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + ua5.m52727b(c17.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + ua5.m52727b(c17.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m55887I(bg0 bg0, f36 f36, f36 f362) {
            vx2.m53591g(f36, "a");
            vx2.m53591g(f362, "b");
            if (!(f36 instanceof d36)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
            } else if (!(f362 instanceof d36)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f362 + ", " + ua5.m52727b(f362.getClass())).toString());
            } else if (((d36) f36).mo51132F0() == ((d36) f362).mo51132F0()) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: J */
        public static ad3 m55888J(bg0 bg0, List<? extends ad3> list) {
            vx2.m53591g(list, "types");
            return tx2.m72478a(list);
        }

        /* renamed from: K */
        public static boolean m55889K(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return C7389b.m60146v0((yz6) zz6, C7395c.C7396a.f39158b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: L */
        public static boolean m55890L(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72545e(bg0, ad3);
        }

        /* renamed from: M */
        public static boolean m55891M(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            return u17.C9381a.m72546f(bg0, f36);
        }

        /* renamed from: N */
        public static boolean m55892N(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return ((yz6) zz6).mo51180d() instanceof if0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: O */
        public static boolean m55893O(bg0 bg0, zz6 zz6) {
            if0 if0;
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                if (d instanceof if0) {
                    if0 = (if0) d;
                } else {
                    if0 = null;
                }
                if (if0 == null || !iw3.m59127a(if0) || if0.getKind() == ClassKind.ENUM_ENTRY || if0.getKind() == ClassKind.ANNOTATION_CLASS) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: P */
        public static boolean m55894P(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72547g(bg0, ad3);
        }

        /* renamed from: Q */
        public static boolean m55895Q(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return ((yz6) zz6).mo51809e();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m55896R(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72548h(bg0, ad3);
        }

        /* renamed from: S */
        public static boolean m55897S(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return zc3.m74855a((xc3) ad3);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: T */
        public static boolean m55898T(bg0 bg0, zz6 zz6) {
            if0 if0;
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                d87<d36> d87 = null;
                if (d instanceof if0) {
                    if0 = (if0) d;
                } else {
                    if0 = null;
                }
                if (if0 != null) {
                    d87 = if0.mo52344P();
                }
                return d87 instanceof mu2;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m55899U(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            return u17.C9381a.m72549i(bg0, f36);
        }

        /* renamed from: V */
        public static boolean m55900V(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return zz6 instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: W */
        public static boolean m55901W(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return zz6 instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: X */
        public static boolean m55902X(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72550j(bg0, ad3);
        }

        /* renamed from: Y */
        public static boolean m55903Y(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return ((d36) f36).mo51135I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: Z */
        public static boolean m55904Z(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return ad3 instanceof s84;
        }

        /* renamed from: a */
        public static boolean m55905a(bg0 bg0, zz6 zz6, zz6 zz62) {
            vx2.m53591g(zz6, "c1");
            vx2.m53591g(zz62, "c2");
            if (!(zz6 instanceof yz6)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
            } else if (zz62 instanceof yz6) {
                return vx2.m53586b(zz6, zz62);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz62 + ", " + ua5.m52727b(zz62.getClass())).toString());
            }
        }

        /* renamed from: a0 */
        public static boolean m55906a0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72551k(bg0, ad3);
        }

        /* renamed from: b */
        public static int m55907b(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return ((xc3) ad3).mo51132F0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: b0 */
        public static boolean m55908b0(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return C7389b.m60146v0((yz6) zz6, C7395c.C7396a.f39160c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: c */
        public static mz6 m55909c(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return (mz6) f36;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: c0 */
        public static boolean m55910c0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return x17.m73828l((xc3) ad3);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: d */
        public static nb0 m55911d(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (!(f36 instanceof d36)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
            } else if (f36 instanceof h36) {
                return bg0.mo50573f(((h36) f36).mo50462A0());
            } else {
                if (f36 instanceof d64) {
                    return (d64) f36;
                }
                return null;
            }
        }

        /* renamed from: d0 */
        public static boolean m55912d0(bg0 bg0, nb0 nb0) {
            vx2.m53591g(nb0, "$receiver");
            return nb0 instanceof jb0;
        }

        /* renamed from: e */
        public static fb1 m55913e(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (!(f36 instanceof d36)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
            } else if (f36 instanceof eb1) {
                return (eb1) f36;
            } else {
                return null;
            }
        }

        /* renamed from: e0 */
        public static boolean m55914e0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof xc3) {
                return C7389b.m60142r0((xc3) f36);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: f */
        public static pl1 m55915f(bg0 bg0, l42 l42) {
            vx2.m53591g(l42, "$receiver");
            if (!(l42 instanceof i42)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l42 + ", " + ua5.m52727b(l42.getClass())).toString());
            } else if (l42 instanceof ol1) {
                return (ol1) l42;
            } else {
                return null;
            }
        }

        /* renamed from: f0 */
        public static boolean m55916f0(bg0 bg0, nb0 nb0) {
            vx2.m53591g(nb0, "$receiver");
            if (nb0 instanceof d64) {
                return ((d64) nb0).mo51143T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nb0 + ", " + ua5.m52727b(nb0.getClass())).toString());
        }

        /* renamed from: g */
        public static l42 m55917g(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                w47 K0 = ((xc3) ad3).mo64506K0();
                if (K0 instanceof i42) {
                    return (i42) K0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: g0 */
        public static boolean m55918g0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                if (!zc3.m74855a((xc3) f36)) {
                    d36 d36 = (d36) f36;
                    if ((d36.mo51134H0().mo51180d() instanceof hz6) || (d36.mo51134H0().mo51180d() == null && !(f36 instanceof jb0) && !(f36 instanceof d64) && !(f36 instanceof eb1) && !(d36.mo51134H0() instanceof IntegerLiteralTypeConstructor) && !m55920h0(bg0, f36))) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: h */
        public static k75 m55919h(bg0 bg0, l42 l42) {
            vx2.m53591g(l42, "$receiver");
            if (!(l42 instanceof i42)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l42 + ", " + ua5.m52727b(l42.getClass())).toString());
            } else if (l42 instanceof j75) {
                return (j75) l42;
            } else {
                return null;
            }
        }

        /* renamed from: h0 */
        public static boolean m55920h0(bg0 bg0, f36 f36) {
            if (!(f36 instanceof h36) || !bg0.mo50572e(((h36) f36).mo50462A0())) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public static f36 m55921i(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                w47 K0 = ((xc3) ad3).mo64506K0();
                if (K0 instanceof d36) {
                    return (d36) K0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: i0 */
        public static boolean m55922i0(bg0 bg0, nz6 nz6) {
            vx2.m53591g(nz6, "$receiver");
            if (nz6 instanceof f17) {
                return ((f17) nz6).mo51408b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nz6 + ", " + ua5.m52727b(nz6.getClass())).toString());
        }

        /* renamed from: j */
        public static nz6 m55923j(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return TypeUtilsKt.m62945a((xc3) ad3);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: j0 */
        public static boolean m55924j0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return TypeUtilsKt.m62957m((xc3) f36);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: k */
        public static f36 m55925k(bg0 bg0, f36 f36, CaptureStatus captureStatus) {
            vx2.m53591g(f36, "type");
            vx2.m53591g(captureStatus, "status");
            if (f36 instanceof d36) {
                return e64.m57236b((d36) f36, captureStatus);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: k0 */
        public static boolean m55926k0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            if (f36 instanceof d36) {
                return TypeUtilsKt.m62958n((xc3) f36);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: l */
        public static CaptureStatus m55927l(bg0 bg0, nb0 nb0) {
            vx2.m53591g(nb0, "$receiver");
            if (nb0 instanceof d64) {
                return ((d64) nb0).mo51140Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nb0 + ", " + ua5.m52727b(nb0.getClass())).toString());
        }

        /* renamed from: l0 */
        public static boolean m55928l0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (!(ad3 instanceof w47) || !(((w47) ad3).mo51134H0() instanceof n64)) {
                return false;
            }
            return true;
        }

        /* renamed from: m */
        public static ad3 m55929m(bg0 bg0, f36 f36, f36 f362) {
            vx2.m53591g(f36, "lowerBound");
            vx2.m53591g(f362, "upperBound");
            if (!(f36 instanceof d36)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bg0 + ", " + ua5.m52727b(bg0.getClass())).toString());
            } else if (f362 instanceof d36) {
                return KotlinTypeFactory.m62849d((d36) f36, (d36) f362);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bg0 + ", " + ua5.m52727b(bg0.getClass())).toString());
            }
        }

        /* renamed from: m0 */
        public static boolean m55930m0(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                if (d == null || !C7389b.m60114A0(d)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: n */
        public static List<f36> m55931n(bg0 bg0, f36 f36, zz6 zz6) {
            vx2.m53591g(f36, "$receiver");
            vx2.m53591g(zz6, "constructor");
            return u17.C9381a.m72541a(bg0, f36, zz6);
        }

        /* renamed from: n0 */
        public static f36 m55932n0(bg0 bg0, l42 l42) {
            vx2.m53591g(l42, "$receiver");
            if (l42 instanceof i42) {
                return ((i42) l42).mo52399P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + l42 + ", " + ua5.m52727b(l42.getClass())).toString());
        }

        /* renamed from: o */
        public static nz6 m55933o(bg0 bg0, mz6 mz6, int i) {
            vx2.m53591g(mz6, "$receiver");
            return u17.C9381a.m72542b(bg0, mz6, i);
        }

        /* renamed from: o0 */
        public static f36 m55934o0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return u17.C9381a.m72552l(bg0, ad3);
        }

        /* renamed from: p */
        public static nz6 m55935p(bg0 bg0, ad3 ad3, int i) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return ((xc3) ad3).mo51132F0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: p0 */
        public static ad3 m55936p0(bg0 bg0, nb0 nb0) {
            vx2.m53591g(nb0, "$receiver");
            if (nb0 instanceof d64) {
                return ((d64) nb0).mo51142S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nb0 + ", " + ua5.m52727b(nb0.getClass())).toString());
        }

        /* renamed from: q */
        public static nz6 m55937q(bg0 bg0, f36 f36, int i) {
            vx2.m53591g(f36, "$receiver");
            return u17.C9381a.m72543c(bg0, f36, i);
        }

        /* renamed from: q0 */
        public static ad3 m55938q0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof w47) {
                return cg0.m56429b((w47) ad3);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: r */
        public static List<nz6> m55939r(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            if (ad3 instanceof xc3) {
                return ((xc3) ad3).mo51132F0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + ad3 + ", " + ua5.m52727b(ad3.getClass())).toString());
        }

        /* renamed from: r0 */
        public static ad3 m55940r0(bg0 bg0, ad3 ad3) {
            vx2.m53591g(ad3, "$receiver");
            return r17.C9230a.m71439a(bg0, ad3);
        }

        /* renamed from: s */
        public static v82 m55941s(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.m62448i((if0) d);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: s0 */
        public static TypeCheckerState m55942s0(bg0 bg0, boolean z, boolean z2) {
            return ag0.m55488b(z, z2, bg0, (KotlinTypePreparator) null, (bd3) null, 24, (Object) null);
        }

        /* renamed from: t */
        public static c17 m55943t(bg0 bg0, zz6 zz6, int i) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                a17 a17 = ((yz6) zz6).getParameters().get(i);
                vx2.m53590f(a17, "this.parameters[index]");
                return a17;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: t0 */
        public static f36 m55944t0(bg0 bg0, fb1 fb1) {
            vx2.m53591g(fb1, "$receiver");
            if (fb1 instanceof eb1) {
                return ((eb1) fb1).mo51433T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + fb1 + ", " + ua5.m52727b(fb1.getClass())).toString());
        }

        /* renamed from: u */
        public static List<c17> m55945u(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                List<a17> parameters = ((yz6) zz6).getParameters();
                vx2.m53590f(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: u0 */
        public static int m55946u0(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                return ((yz6) zz6).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: v */
        public static PrimitiveType m55947v(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C7389b.m60118P((if0) d);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: v0 */
        public static Collection<ad3> m55948v0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "$receiver");
            zz6 c = bg0.mo50570c(f36);
            if (c instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) c).mo55069l();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: w */
        public static PrimitiveType m55949w(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                eg0 d = ((yz6) zz6).mo51180d();
                vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C7389b.m60119S((if0) d);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }

        /* renamed from: w0 */
        public static nz6 m55950w0(bg0 bg0, mb0 mb0) {
            vx2.m53591g(mb0, "$receiver");
            if (mb0 instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) mb0).mo52887c();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mb0 + ", " + ua5.m52727b(mb0.getClass())).toString());
        }

        /* renamed from: x */
        public static ad3 m55951x(bg0 bg0, c17 c17) {
            vx2.m53591g(c17, "$receiver");
            if (c17 instanceof a17) {
                return TypeUtilsKt.m62953i((a17) c17);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c17 + ", " + ua5.m52727b(c17.getClass())).toString());
        }

        /* renamed from: x0 */
        public static int m55952x0(bg0 bg0, mz6 mz6) {
            vx2.m53591g(mz6, "$receiver");
            return u17.C9381a.m72553m(bg0, mz6);
        }

        /* renamed from: y */
        public static ad3 m55953y(bg0 bg0, nz6 nz6) {
            vx2.m53591g(nz6, "$receiver");
            if (nz6 instanceof f17) {
                return ((f17) nz6).getType().mo64506K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nz6 + ", " + ua5.m52727b(nz6.getClass())).toString());
        }

        /* renamed from: y0 */
        public static TypeCheckerState.C7720b m55954y0(bg0 bg0, f36 f36) {
            vx2.m53591g(f36, "type");
            if (f36 instanceof d36) {
                return new C6862a(bg0, a07.f36338c.mo50026a((xc3) f36).mo65206c());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + f36 + ", " + ua5.m52727b(f36.getClass())).toString());
        }

        /* renamed from: z */
        public static c17 m55955z(bg0 bg0, a27 a27) {
            vx2.m53591g(a27, "$receiver");
            if (a27 instanceof n64) {
                return ((n64) a27).mo56374b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a27 + ", " + ua5.m52727b(a27.getClass())).toString());
        }

        /* renamed from: z0 */
        public static Collection<ad3> m55956z0(bg0 bg0, zz6 zz6) {
            vx2.m53591g(zz6, "$receiver");
            if (zz6 instanceof yz6) {
                Collection<xc3> g = ((yz6) zz6).mo51811g();
                vx2.m53590f(g, "this.supertypes");
                return g;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + zz6 + ", " + ua5.m52727b(zz6.getClass())).toString());
        }
    }

    /* renamed from: D0 */
    ad3 mo50567D0(f36 f36, f36 f362);

    /* renamed from: a */
    f36 mo50568a(ad3 ad3);

    /* renamed from: b */
    f36 mo50569b(f36 f36, boolean z);

    /* renamed from: c */
    zz6 mo50570c(f36 f36);

    /* renamed from: d */
    f36 mo50571d(l42 l42);

    /* renamed from: e */
    boolean mo50572e(f36 f36);

    /* renamed from: f */
    nb0 mo50573f(f36 f36);

    /* renamed from: g */
    f36 mo50574g(l42 l42);
}
