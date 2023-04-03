package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* compiled from: AbstractTypeChecker.kt */
public final class AbstractTypeChecker {

    /* renamed from: a */
    public static final AbstractTypeChecker f40248a = new AbstractTypeChecker();

    /* renamed from: b */
    public static boolean f40249b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$a */
    /* compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class C7710a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40250a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40251b;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            iArr[TypeVariance.INV.ordinal()] = 1;
            iArr[TypeVariance.OUT.ordinal()] = 2;
            iArr[TypeVariance.IN.ordinal()] = 3;
            f40250a = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            f40251b = iArr2;
        }
    }

    /* renamed from: b */
    public static final boolean m62788b(s17 s17, f36 f36) {
        if (!(f36 instanceof nb0)) {
            return false;
        }
        nz6 J = s17.mo51056J(s17.mo51075c0((nb0) f36));
        if (s17.mo51071Y(J) || !s17.mo51044B(s17.mo51049E(s17.mo51088l(J)))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m62789c(p000.s17 r3, p000.f36 r4) {
        /*
            zz6 r4 = r3.mo50570c(r4)
            boolean r0 = r4 instanceof p000.sx2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            java.util.Collection r4 = r3.mo51079g0(r4)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x0018:
            r3 = r2
            goto L_0x003c
        L_0x001a:
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r4.next()
            ad3 r0 = (p000.ad3) r0
            f36 r0 = r3.mo50568a(r0)
            if (r0 == 0) goto L_0x0038
            boolean r0 = r3.mo51044B(r0)
            if (r0 != r1) goto L_0x0038
            r0 = r1
            goto L_0x0039
        L_0x0038:
            r0 = r2
        L_0x0039:
            if (r0 == 0) goto L_0x001e
            r3 = r1
        L_0x003c:
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.m62789c(s17, f36):boolean");
    }

    /* renamed from: d */
    public static final boolean m62790d(s17 s17, f36 f36) {
        if (s17.mo51044B(f36) || m62788b(s17, f36)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m62791e(s17 s17, TypeCheckerState typeCheckerState, f36 f36, f36 f362, boolean z) {
        boolean z2;
        Collection<ad3> s = s17.mo51102s(f36);
        if (!(s instanceof Collection) || !s.isEmpty()) {
            for (ad3 ad3 : s) {
                if (vx2.m53586b(s17.mo51107u0(ad3), s17.mo50570c(f362)) || (z && m62792t(f40248a, typeCheckerState, f362, ad3, false, 8, (Object) null))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m62792t(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.mo55271s(typeCheckerState, ad3, ad32, z);
    }

    /* renamed from: a */
    public final Boolean mo55257a(TypeCheckerState typeCheckerState, f36 f36, f36 f362) {
        s17 j = typeCheckerState.mo55324j();
        if (!j.mo51044B(f36) && !j.mo51044B(f362)) {
            return null;
        }
        if (m62790d(j, f36) && m62790d(j, f362)) {
            return Boolean.TRUE;
        }
        if (j.mo51044B(f36)) {
            if (m62791e(j, typeCheckerState, f36, f362, false)) {
                return Boolean.TRUE;
            }
        } else if (j.mo51044B(f362) && (m62789c(j, f36) || m62791e(j, typeCheckerState, f362, f36, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0127, code lost:
        if (r10 != false) goto L_0x0129;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean mo55258f(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r15, p000.f36 r16, p000.f36 r17) {
        /*
            r14 = this;
            r7 = r16
            r8 = r17
            s17 r9 = r15.mo55324j()
            boolean r0 = r9.mo51068V(r7)
            r10 = 0
            if (r0 != 0) goto L_0x014d
            boolean r0 = r9.mo51068V(r8)
            if (r0 == 0) goto L_0x0017
            goto L_0x014d
        L_0x0017:
            boolean r0 = r9.mo51074b0(r7)
            r11 = 1
            if (r0 == 0) goto L_0x0038
            boolean r0 = r9.mo51074b0(r8)
            if (r0 == 0) goto L_0x0038
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = f40248a
            boolean r0 = r0.mo55268p(r9, r7, r8)
            if (r0 != 0) goto L_0x0032
            boolean r0 = r15.mo55328n()
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r10 = r11
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x0038:
            boolean r0 = r9.mo51083i0(r7)
            if (r0 != 0) goto L_0x0143
            boolean r0 = r9.mo51083i0(r8)
            if (r0 == 0) goto L_0x0046
            goto L_0x0143
        L_0x0046:
            fb1 r0 = r9.mo51050E0(r8)
            if (r0 == 0) goto L_0x0052
            f36 r0 = r9.mo51113x0(r0)
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r0 = r8
        L_0x0053:
            nb0 r0 = r9.mo50573f(r0)
            r12 = 0
            if (r0 == 0) goto L_0x005f
            ad3 r1 = r9.mo51100r(r0)
            goto L_0x0060
        L_0x005f:
            r1 = r12
        L_0x0060:
            if (r0 == 0) goto L_0x00b2
            if (r1 == 0) goto L_0x00b2
            boolean r2 = r9.mo51060N(r8)
            if (r2 == 0) goto L_0x0071
            ad3 r1 = r9.mo51045B0(r1, r11)
        L_0x006e:
            r13 = r15
            r3 = r1
            goto L_0x007c
        L_0x0071:
            boolean r2 = r9.mo51108v(r8)
            if (r2 == 0) goto L_0x006e
            ad3 r1 = r9.mo51091m0(r1)
            goto L_0x006e
        L_0x007c:
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$LowerCapturedTypePolicy r0 = r15.mo55321g(r7, r0)
            int[] r1 = kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.C7710a.f40251b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r11) goto L_0x00a0
            r1 = 2
            if (r0 == r1) goto L_0x008e
            goto L_0x00b3
        L_0x008e:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = f40248a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m62792t(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00a0:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = f40248a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m62792t(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x00b2:
            r13 = r15
        L_0x00b3:
            zz6 r0 = r9.mo50570c(r8)
            boolean r1 = r9.mo51090m(r0)
            if (r1 == 0) goto L_0x00f5
            r9.mo51060N(r8)
            java.util.Collection r0 = r9.mo51079g0(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x00d0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x00d0
        L_0x00ce:
            r10 = r11
            goto L_0x00f0
        L_0x00d0:
            java.util.Iterator r8 = r0.iterator()
        L_0x00d4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r8.next()
            r3 = r0
            ad3 r3 = (p000.ad3) r3
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = f40248a
            r4 = 0
            r5 = 8
            r6 = 0
            r1 = r15
            r2 = r16
            boolean r0 = m62792t(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x00d4
        L_0x00f0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L_0x00f5:
            zz6 r0 = r9.mo50570c(r7)
            boolean r1 = r7 instanceof p000.nb0
            if (r1 != 0) goto L_0x0129
            boolean r1 = r9.mo51090m(r0)
            if (r1 == 0) goto L_0x0142
            java.util.Collection r0 = r9.mo51079g0(r0)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0113
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0113
        L_0x0111:
            r10 = r11
            goto L_0x0127
        L_0x0113:
            java.util.Iterator r0 = r0.iterator()
        L_0x0117:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r0.next()
            ad3 r1 = (p000.ad3) r1
            boolean r1 = r1 instanceof p000.nb0
            if (r1 != 0) goto L_0x0117
        L_0x0127:
            if (r10 == 0) goto L_0x0142
        L_0x0129:
            kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker r0 = f40248a
            s17 r1 = r15.mo55324j()
            c17 r0 = r0.mo55265m(r1, r8, r7)
            if (r0 == 0) goto L_0x0142
            zz6 r1 = r9.mo50570c(r8)
            boolean r0 = r9.mo51069W(r0, r1)
            if (r0 == 0) goto L_0x0142
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0142:
            return r12
        L_0x0143:
            r13 = r15
            boolean r0 = r15.mo55328n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x014d:
            r13 = r15
            boolean r0 = r15.mo55327m()
            if (r0 == 0) goto L_0x0157
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0157:
            boolean r0 = r9.mo51060N(r7)
            if (r0 == 0) goto L_0x0166
            boolean r0 = r9.mo51060N(r8)
            if (r0 != 0) goto L_0x0166
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0166:
            f7 r0 = p000.C7069f7.f37732a
            f36 r1 = r9.mo50569b(r7, r10)
            f36 r2 = r9.mo50569b(r8, r10)
            boolean r0 = r0.mo51607b(r9, r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.mo55258f(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState, f36, f36):java.lang.Boolean");
    }

    /* renamed from: g */
    public final List<f36> mo55259g(TypeCheckerState typeCheckerState, f36 f36, zz6 zz6) {
        TypeCheckerState.C7720b bVar;
        s17 j = typeCheckerState.mo55324j();
        List<f36> U = j.mo51067U(f36, zz6);
        if (U != null) {
            return U;
        }
        if (!j.mo51096p(zz6) && j.mo51077e0(f36)) {
            return ck0.m33062j();
        }
        if (!j.mo51064R(zz6)) {
            v46 v46 = new v46();
            typeCheckerState.mo55325k();
            ArrayDeque<f36> h = typeCheckerState.mo55322h();
            vx2.m53588d(h);
            Set<f36> i = typeCheckerState.mo55323i();
            vx2.m53588d(i);
            h.push(f36);
            while (!h.isEmpty()) {
                if (i.size() <= 1000) {
                    f36 pop = h.pop();
                    vx2.m53590f(pop, "current");
                    if (i.add(pop)) {
                        f36 n = j.mo51092n(pop, CaptureStatus.FOR_SUBTYPING);
                        if (n == null) {
                            n = pop;
                        }
                        if (j.mo51103s0(j.mo50570c(n), zz6)) {
                            v46.add(n);
                            bVar = TypeCheckerState.C7720b.C7723c.f40285a;
                        } else if (j.mo51070X(n) == 0) {
                            bVar = TypeCheckerState.C7720b.C7722b.f40284a;
                        } else {
                            bVar = typeCheckerState.mo55324j().mo51110w(n);
                        }
                        if (!(!vx2.m53586b(bVar, TypeCheckerState.C7720b.C7723c.f40285a))) {
                            bVar = null;
                        }
                        if (bVar != null) {
                            s17 j2 = typeCheckerState.mo55324j();
                            for (ad3 a : j2.mo51079g0(j2.mo50570c(pop))) {
                                h.add(bVar.mo50575a(typeCheckerState, a));
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(("Too many supertypes for type: " + f36 + ". Supertypes = " + CollectionsKt___CollectionsKt.m47338i0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null)).toString());
                }
            }
            typeCheckerState.mo55320e();
            return v46;
        } else if (!j.mo51103s0(j.mo50570c(f36), zz6)) {
            return ck0.m33062j();
        } else {
            f36 n2 = j.mo51092n(f36, CaptureStatus.FOR_SUBTYPING);
            if (n2 != null) {
                f36 = n2;
            }
            return bk0.m32598e(f36);
        }
    }

    /* renamed from: h */
    public final List<f36> mo55260h(TypeCheckerState typeCheckerState, f36 f36, zz6 zz6) {
        return mo55274w(typeCheckerState, mo55259g(typeCheckerState, f36, zz6));
    }

    /* renamed from: i */
    public final boolean mo55261i(TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32, boolean z) {
        s17 j = typeCheckerState.mo55324j();
        ad3 o = typeCheckerState.mo55329o(typeCheckerState.mo55330p(ad3));
        ad3 o2 = typeCheckerState.mo55329o(typeCheckerState.mo55330p(ad32));
        AbstractTypeChecker abstractTypeChecker = f40248a;
        Boolean f = abstractTypeChecker.mo55258f(typeCheckerState, j.mo51078f0(o), j.mo51049E(o2));
        if (f != null) {
            boolean booleanValue = f.booleanValue();
            typeCheckerState.mo55319c(o, o2, z);
            return booleanValue;
        }
        Boolean c = typeCheckerState.mo55319c(o, o2, z);
        if (c != null) {
            return c.booleanValue();
        }
        return abstractTypeChecker.mo55272u(typeCheckerState, j.mo51078f0(o), j.mo51049E(o2));
    }

    /* renamed from: j */
    public final TypeVariance mo55262j(TypeVariance typeVariance, TypeVariance typeVariance2) {
        vx2.m53591g(typeVariance, "declared");
        vx2.m53591g(typeVariance2, "useSite");
        TypeVariance typeVariance3 = TypeVariance.INV;
        if (typeVariance == typeVariance3) {
            return typeVariance2;
        }
        if (typeVariance2 == typeVariance3 || typeVariance == typeVariance2) {
            return typeVariance;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean mo55263k(TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32) {
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(ad3, "a");
        vx2.m53591g(ad32, "b");
        s17 j = typeCheckerState.mo55324j();
        if (ad3 == ad32) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = f40248a;
        if (abstractTypeChecker.mo55267o(j, ad3) && abstractTypeChecker.mo55267o(j, ad32)) {
            ad3 o = typeCheckerState.mo55329o(typeCheckerState.mo55330p(ad3));
            ad3 o2 = typeCheckerState.mo55329o(typeCheckerState.mo55330p(ad32));
            f36 f0 = j.mo51078f0(o);
            if (!j.mo51103s0(j.mo51107u0(o), j.mo51107u0(o2))) {
                return false;
            }
            if (j.mo51070X(f0) == 0) {
                if (j.mo51106u(o) || j.mo51106u(o2) || j.mo51060N(f0) == j.mo51060N(j.mo51078f0(o2))) {
                    return true;
                }
                return false;
            }
        }
        if (!m62792t(abstractTypeChecker, typeCheckerState, ad3, ad32, false, 8, (Object) null) || !m62792t(abstractTypeChecker, typeCheckerState, ad32, ad3, false, 8, (Object) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final List<f36> mo55264l(TypeCheckerState typeCheckerState, f36 f36, zz6 zz6) {
        TypeCheckerState.C7720b bVar;
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(f36, "subType");
        vx2.m53591g(zz6, "superConstructor");
        s17 j = typeCheckerState.mo55324j();
        if (j.mo51077e0(f36)) {
            return f40248a.mo55260h(typeCheckerState, f36, zz6);
        }
        if (!j.mo51096p(zz6) && !j.mo51111w0(zz6)) {
            return f40248a.mo55259g(typeCheckerState, f36, zz6);
        }
        v46<f36> v46 = new v46<>();
        typeCheckerState.mo55325k();
        ArrayDeque<f36> h = typeCheckerState.mo55322h();
        vx2.m53588d(h);
        Set<f36> i = typeCheckerState.mo55323i();
        vx2.m53588d(i);
        h.push(f36);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                f36 pop = h.pop();
                vx2.m53590f(pop, "current");
                if (i.add(pop)) {
                    if (j.mo51077e0(pop)) {
                        v46.add(pop);
                        bVar = TypeCheckerState.C7720b.C7723c.f40285a;
                    } else {
                        bVar = TypeCheckerState.C7720b.C7722b.f40284a;
                    }
                    if (!(!vx2.m53586b(bVar, TypeCheckerState.C7720b.C7723c.f40285a))) {
                        bVar = null;
                    }
                    if (bVar != null) {
                        s17 j2 = typeCheckerState.mo55324j();
                        for (ad3 a : j2.mo51079g0(j2.mo50570c(pop))) {
                            h.add(bVar.mo50575a(typeCheckerState, a));
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + f36 + ". Supertypes = " + CollectionsKt___CollectionsKt.m47338i0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null)).toString());
            }
        }
        typeCheckerState.mo55320e();
        ArrayList arrayList = new ArrayList();
        for (f36 f362 : v46) {
            AbstractTypeChecker abstractTypeChecker = f40248a;
            vx2.m53590f(f362, "it");
            hk0.m45275z(arrayList, abstractTypeChecker.mo55260h(typeCheckerState, f362, zz6));
        }
        return arrayList;
    }

    /* renamed from: m */
    public final c17 mo55265m(s17 s17, ad3 ad3, ad3 ad32) {
        ad3 l;
        int X = s17.mo51070X(ad3);
        int i = 0;
        while (true) {
            nz6 nz6 = null;
            if (i >= X) {
                return null;
            }
            nz6 S = s17.mo51065S(ad3, i);
            boolean z = true;
            if (!s17.mo51071Y(S)) {
                nz6 = S;
            }
            if (!(nz6 == null || (l = s17.mo51088l(nz6)) == null)) {
                if (!s17.mo51089l0(s17.mo51078f0(l)) || !s17.mo51089l0(s17.mo51078f0(ad32))) {
                    z = false;
                }
                if (!vx2.m53586b(l, ad32) && (!z || !vx2.m53586b(s17.mo51107u0(l), s17.mo51107u0(ad32)))) {
                    c17 m = mo55265m(s17, l, ad32);
                    if (m != null) {
                        return m;
                    }
                }
            }
            i++;
        }
        return s17.mo51057K(s17.mo51107u0(ad3), i);
    }

    /* renamed from: n */
    public final boolean mo55266n(TypeCheckerState typeCheckerState, f36 f36) {
        TypeCheckerState.C7720b bVar;
        s17 j = typeCheckerState.mo55324j();
        zz6 c = j.mo50570c(f36);
        if (j.mo51096p(c)) {
            return j.mo51062P(c);
        }
        if (j.mo51062P(j.mo50570c(f36))) {
            return true;
        }
        typeCheckerState.mo55325k();
        ArrayDeque<f36> h = typeCheckerState.mo55322h();
        vx2.m53588d(h);
        Set<f36> i = typeCheckerState.mo55323i();
        vx2.m53588d(i);
        h.push(f36);
        while (!h.isEmpty()) {
            if (i.size() <= 1000) {
                f36 pop = h.pop();
                vx2.m53590f(pop, "current");
                if (i.add(pop)) {
                    if (j.mo51077e0(pop)) {
                        bVar = TypeCheckerState.C7720b.C7723c.f40285a;
                    } else {
                        bVar = TypeCheckerState.C7720b.C7722b.f40284a;
                    }
                    if (!(!vx2.m53586b(bVar, TypeCheckerState.C7720b.C7723c.f40285a))) {
                        bVar = null;
                    }
                    if (bVar == null) {
                        continue;
                    } else {
                        s17 j2 = typeCheckerState.mo55324j();
                        for (ad3 a : j2.mo51079g0(j2.mo50570c(pop))) {
                            f36 a2 = bVar.mo50575a(typeCheckerState, a);
                            if (j.mo51062P(j.mo50570c(a2))) {
                                typeCheckerState.mo55320e();
                                return true;
                            }
                            h.add(a2);
                        }
                        continue;
                    }
                }
            } else {
                throw new IllegalStateException(("Too many supertypes for type: " + f36 + ". Supertypes = " + CollectionsKt___CollectionsKt.m47338i0(i, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null)).toString());
            }
        }
        typeCheckerState.mo55320e();
        return false;
    }

    /* renamed from: o */
    public final boolean mo55267o(s17 s17, ad3 ad3) {
        if (!s17.mo51081h0(s17.mo51107u0(ad3)) || s17.mo51086k(ad3) || s17.mo51108v(ad3) || s17.mo51059M(ad3) || !vx2.m53586b(s17.mo50570c(s17.mo51078f0(ad3)), s17.mo50570c(s17.mo51049E(ad3)))) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo55268p(s17 s17, f36 f36, f36 f362) {
        f36 f363;
        f36 f364;
        fb1 E0 = s17.mo51050E0(f36);
        if (E0 == null || (f363 = s17.mo51113x0(E0)) == null) {
            f363 = f36;
        }
        fb1 E02 = s17.mo51050E0(f362);
        if (E02 == null || (f364 = s17.mo51113x0(E02)) == null) {
            f364 = f362;
        }
        if (s17.mo50570c(f363) != s17.mo50570c(f364)) {
            return false;
        }
        if (!s17.mo51108v(f36) && s17.mo51108v(f362)) {
            return false;
        }
        if (!s17.mo51060N(f36) || s17.mo51060N(f362)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean mo55269q(TypeCheckerState typeCheckerState, mz6 mz6, f36 f36) {
        boolean z;
        boolean z2;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        mz6 mz62 = mz6;
        f36 f362 = f36;
        vx2.m53591g(typeCheckerState2, "<this>");
        vx2.m53591g(mz62, "capturedSubArguments");
        vx2.m53591g(f362, "superType");
        s17 j = typeCheckerState.mo55324j();
        zz6 c = j.mo50570c(f362);
        int i = j.mo51082i(mz62);
        int D = j.mo51048D(c);
        if (i != D || i != j.mo51070X(f362)) {
            return false;
        }
        for (int i2 = 0; i2 < D; i2++) {
            nz6 S = j.mo51065S(f362, i2);
            if (!j.mo51071Y(S)) {
                ad3 l = j.mo51088l(S);
                nz6 A0 = j.mo51043A0(mz62, i2);
                j.mo51072Z(A0);
                TypeVariance typeVariance = TypeVariance.INV;
                ad3 l2 = j.mo51088l(A0);
                AbstractTypeChecker abstractTypeChecker = f40248a;
                TypeVariance j2 = abstractTypeChecker.mo55262j(j.mo51098q(j.mo51057K(c, i2)), j.mo51072Z(S));
                if (j2 == null) {
                    return typeCheckerState.mo55327m();
                }
                if (j2 != typeVariance || (!abstractTypeChecker.mo55273v(j, l2, l, c) && !abstractTypeChecker.mo55273v(j, l, l2, c))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    continue;
                } else if (typeCheckerState.f40278g <= 100) {
                    typeCheckerState2.f40278g = typeCheckerState.f40278g + 1;
                    int i3 = C7710a.f40250a[j2.ordinal()];
                    if (i3 == 1) {
                        z2 = abstractTypeChecker.mo55263k(typeCheckerState2, l2, l);
                    } else if (i3 == 2) {
                        z2 = m62792t(abstractTypeChecker, typeCheckerState, l2, l, false, 8, (Object) null);
                    } else if (i3 == 3) {
                        z2 = m62792t(abstractTypeChecker, typeCheckerState, l, l2, false, 8, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    typeCheckerState2.f40278g = typeCheckerState.f40278g - 1;
                    if (!z2) {
                        return false;
                    }
                } else {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + l2).toString());
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean mo55270r(TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32) {
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(ad3, "subType");
        vx2.m53591g(ad32, "superType");
        return m62792t(this, typeCheckerState, ad3, ad32, false, 8, (Object) null);
    }

    /* renamed from: s */
    public final boolean mo55271s(TypeCheckerState typeCheckerState, ad3 ad3, ad3 ad32, boolean z) {
        vx2.m53591g(typeCheckerState, "state");
        vx2.m53591g(ad3, "subType");
        vx2.m53591g(ad32, "superType");
        if (ad3 == ad32) {
            return true;
        }
        if (!typeCheckerState.mo52960f(ad3, ad32)) {
            return false;
        }
        return mo55261i(typeCheckerState, ad3, ad32, z);
    }

    /* renamed from: u */
    public final boolean mo55272u(TypeCheckerState typeCheckerState, f36 f36, f36 f362) {
        boolean z;
        ad3 l;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        f36 f363 = f36;
        f36 f364 = f362;
        s17 j = typeCheckerState.mo55324j();
        if (f40249b) {
            if (!j.mo50572e(f363) && !j.mo51090m(j.mo50570c(f363))) {
                boolean l2 = typeCheckerState.mo55326l(f36);
            }
            if (!j.mo50572e(f364)) {
                boolean l3 = typeCheckerState2.mo55326l(f364);
            }
        }
        boolean z2 = false;
        if (!C9305s6.f44534a.mo65827d(typeCheckerState2, f363, f364)) {
            return false;
        }
        AbstractTypeChecker abstractTypeChecker = f40248a;
        Boolean a = abstractTypeChecker.mo55257a(typeCheckerState2, j.mo51078f0(f363), j.mo51049E(f364));
        if (a != null) {
            boolean booleanValue = a.booleanValue();
            TypeCheckerState.m62872d(typeCheckerState, f36, f362, false, 4, (Object) null);
            return booleanValue;
        }
        zz6 c = j.mo50570c(f364);
        boolean z3 = true;
        if ((j.mo51103s0(j.mo50570c(f363), c) && j.mo51048D(c) == 0) || j.mo51115y0(j.mo50570c(f364))) {
            return true;
        }
        List<f36> l4 = abstractTypeChecker.mo55264l(typeCheckerState2, f363, c);
        int i = 10;
        ArrayList<f36> arrayList = new ArrayList<>(dk0.m43495u(l4, 10));
        for (f36 f365 : l4) {
            f36 a2 = j.mo50568a(typeCheckerState2.mo55329o(f365));
            if (a2 != null) {
                f365 = a2;
            }
            arrayList.add(f365);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f40248a.mo55266n(typeCheckerState2, f363);
        }
        if (size == 1) {
            return f40248a.mo55269q(typeCheckerState2, j.mo51073a0((f36) CollectionsKt___CollectionsKt.m47329Z(arrayList)), f364);
        }
        ArgumentList argumentList = new ArgumentList(j.mo51048D(c));
        int D = j.mo51048D(c);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < D) {
            if (z4 || j.mo51098q(j.mo51057K(c, i2)) != TypeVariance.OUT) {
                z4 = z3;
            } else {
                z4 = z2;
            }
            if (!z4) {
                ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, i));
                for (f36 f366 : arrayList) {
                    nz6 O = j.mo51061O(f366, i2);
                    if (O != null) {
                        if (j.mo51072Z(O) == TypeVariance.INV) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            O = null;
                        }
                        if (!(O == null || (l = j.mo51088l(O)) == null)) {
                            arrayList2.add(l);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + f366 + ", subType: " + f363 + ", superType: " + f364).toString());
                }
                argumentList.add(j.mo51055I(j.mo51087k0(arrayList2)));
            }
            i2++;
            z2 = false;
            z3 = true;
            i = 10;
        }
        if (z4 || !f40248a.mo55269q(typeCheckerState2, argumentList, f364)) {
            return typeCheckerState2.mo55331q(new AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(arrayList, typeCheckerState2, j, f364));
        }
        return true;
    }

    /* renamed from: v */
    public final boolean mo55273v(s17 s17, ad3 ad3, ad3 ad32, zz6 zz6) {
        a27 a27;
        c17 x;
        f36 a = s17.mo50568a(ad3);
        if (!(a instanceof nb0)) {
            return false;
        }
        nb0 nb0 = (nb0) a;
        if (s17.mo51080h(nb0) || !s17.mo51071Y(s17.mo51056J(s17.mo51075c0(nb0))) || s17.mo51104t(nb0) != CaptureStatus.FOR_SUBTYPING) {
            return false;
        }
        zz6 u0 = s17.mo51107u0(ad32);
        if (u0 instanceof a27) {
            a27 = (a27) u0;
        } else {
            a27 = null;
        }
        if (a27 == null || (x = s17.mo51112x(a27)) == null || !s17.mo51069W(x, zz6)) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final List<f36> mo55274w(TypeCheckerState typeCheckerState, List<? extends f36> list) {
        boolean z;
        s17 j = typeCheckerState.mo55324j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            mz6 a0 = j.mo51073a0((f36) next);
            int i = j.mo51082i(a0);
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                if (j.mo51105t0(j.mo51088l(j.mo51043A0(a0, i2))) == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
                i2++;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }
}
