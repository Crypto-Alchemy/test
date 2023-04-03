package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.kz6;

/* renamed from: iz6 */
/* compiled from: TypeAliasExpander.kt */
public final class iz6 {

    /* renamed from: c */
    public static final C7229a f38538c = new C7229a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final iz6 f38539d = new iz6(kz6.C7812a.f40548a, false);

    /* renamed from: a */
    public final kz6 f38540a;

    /* renamed from: b */
    public final boolean f38541b;

    /* renamed from: iz6$a */
    /* compiled from: TypeAliasExpander.kt */
    public static final class C7229a {
        public C7229a() {
        }

        public /* synthetic */ C7229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final void mo52570b(int i, hz6 hz6) {
            if (i > 100) {
                throw new AssertionError("Too deep recursion while expanding type alias " + hz6.getName());
            }
        }
    }

    public iz6(kz6 kz6, boolean z) {
        vx2.m53591g(kz6, "reportStrategy");
        this.f38540a = kz6;
        this.f38541b = z;
    }

    /* renamed from: a */
    public final void mo52557a(C6983dm dmVar, C6983dm dmVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = dmVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((C9460vl) it.next()).mo53263e());
        }
        Iterator it2 = dmVar2.iterator();
        while (it2.hasNext()) {
            C9460vl vlVar = (C9460vl) it2.next();
            if (hashSet.contains(vlVar.mo53263e())) {
                this.f38540a.mo55791a(vlVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo52558b(xc3 xc3, xc3 xc32) {
        TypeSubstitutor f = TypeSubstitutor.m62901f(xc32);
        vx2.m53590f(f, "create(substitutedType)");
        int i = 0;
        for (T next : xc32.mo51132F0()) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            f17 f17 = (f17) next;
            if (!f17.mo51408b()) {
                xc3 type = f17.getType();
                vx2.m53590f(type, "substitutedArgument.type");
                if (!TypeUtilsKt.m62948d(type)) {
                    f17 f172 = xc3.mo51132F0().get(i);
                    a17 a17 = xc3.mo51134H0().getParameters().get(i);
                    if (this.f38541b) {
                        kz6 kz6 = this.f38540a;
                        xc3 type2 = f172.getType();
                        vx2.m53590f(type2, "unsubstitutedArgument.type");
                        xc3 type3 = f17.getType();
                        vx2.m53590f(type3, "substitutedArgument.type");
                        vx2.m53590f(a17, "typeParameter");
                        kz6.mo55793c(f, type2, type3, a17);
                    }
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public final ol1 mo52559c(ol1 ol1, rz6 rz6) {
        return ol1.mo51139N0(mo52564h(ol1, rz6));
    }

    /* renamed from: d */
    public final d36 mo52560d(d36 d36, rz6 rz6) {
        if (zc3.m74855a(d36)) {
            return d36;
        }
        return q17.m71170f(d36, (List) null, mo52564h(d36, rz6), 1, (Object) null);
    }

    /* renamed from: e */
    public final d36 mo52561e(d36 d36, xc3 xc3) {
        d36 r = x17.m73834r(d36, xc3.mo51135I0());
        vx2.m53590f(r, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return r;
    }

    /* renamed from: f */
    public final d36 mo52562f(d36 d36, xc3 xc3) {
        return mo52560d(mo52561e(d36, xc3), xc3.mo51133G0());
    }

    /* renamed from: g */
    public final d36 mo52563g(jz6 jz6, rz6 rz6, boolean z) {
        yz6 g = jz6.mo52825b().mo50046g();
        vx2.m53590f(g, "descriptor.typeConstructor");
        return KotlinTypeFactory.m62854j(rz6, g, jz6.mo52824a(), z, MemberScope.C7667a.f40117b);
    }

    /* renamed from: h */
    public final rz6 mo52564h(xc3 xc3, rz6 rz6) {
        if (zc3.m74855a(xc3)) {
            return xc3.mo51133G0();
        }
        return rz6.mo65777q(xc3.mo51133G0());
    }

    /* renamed from: i */
    public final d36 mo52565i(jz6 jz6, rz6 rz6) {
        vx2.m53591g(jz6, "typeAliasExpansion");
        vx2.m53591g(rz6, "attributes");
        return mo52567k(jz6, rz6, false, 0, true);
    }

    /* renamed from: j */
    public final f17 mo52566j(f17 f17, jz6 jz6, int i) {
        w47 K0 = f17.getType().mo64506K0();
        if (ql1.m71288a(K0)) {
            return f17;
        }
        d36 a = q17.m71165a(K0);
        if (zc3.m74855a(a) || !TypeUtilsKt.m62968x(a)) {
            return f17;
        }
        yz6 H0 = a.mo51134H0();
        eg0 d = H0.mo51180d();
        H0.getParameters().size();
        a.mo51132F0().size();
        if (d instanceof a17) {
            return f17;
        }
        if (d instanceof hz6) {
            hz6 hz6 = (hz6) d;
            int i2 = 0;
            if (jz6.mo52827d(hz6)) {
                this.f38540a.mo55794d(hz6);
                Variance variance = Variance.INVARIANT;
                ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                String r24 = hz6.getName().toString();
                vx2.m53590f(r24, "typeDescriptor.name.toString()");
                return new h17(variance, nr1.m70033d(errorTypeKind, r24));
            }
            List<f17> F0 = a.mo51132F0();
            ArrayList arrayList = new ArrayList(dk0.m43495u(F0, 10));
            for (T next : F0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ck0.m33072t();
                }
                arrayList.add(mo52568l((f17) next, jz6, H0.getParameters().get(i2), i + 1));
                i2 = i3;
            }
            d36 k = mo52567k(jz6.f38818e.mo52828a(jz6, hz6, arrayList), a.mo51133G0(), a.mo51135I0(), i + 1, false);
            d36 m = mo52569m(a, jz6, i);
            if (!ql1.m71288a(k)) {
                k = o66.m70170j(k, m);
            }
            return new h17(f17.mo51409c(), k);
        }
        d36 m2 = mo52569m(a, jz6, i);
        mo52558b(a, m2);
        return new h17(f17.mo51409c(), m2);
    }

    /* renamed from: k */
    public final d36 mo52567k(jz6 jz6, rz6 rz6, boolean z, int i, boolean z2) {
        f17 l = mo52568l(new h17(Variance.INVARIANT, jz6.mo52825b().mo52332o0()), jz6, (a17) null, i);
        xc3 type = l.getType();
        vx2.m53590f(type, "expandedProjection.type");
        d36 a = q17.m71165a(type);
        if (zc3.m74855a(a)) {
            return a;
        }
        l.mo51409c();
        mo52557a(a.getAnnotations(), C7216im.m59001a(rz6));
        d36 r = x17.m73834r(mo52560d(a, rz6), z);
        vx2.m53590f(r, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z2) {
            return o66.m70170j(r, mo52563g(jz6, rz6, z));
        }
        return r;
    }

    /* renamed from: l */
    public final f17 mo52568l(f17 f17, jz6 jz6, a17 a17, int i) {
        Variance variance;
        xc3 xc3;
        Variance variance2;
        Variance variance3;
        f38538c.mo52570b(i, jz6.mo52825b());
        if (f17.mo51408b()) {
            vx2.m53588d(a17);
            f17 s = x17.m73835s(a17);
            vx2.m53590f(s, "makeStarProjection(typeParameterDescriptor!!)");
            return s;
        }
        xc3 type = f17.getType();
        vx2.m53590f(type, "underlyingProjection.type");
        f17 c = jz6.mo52826c(type.mo51134H0());
        if (c == null) {
            return mo52566j(f17, jz6, i);
        }
        if (c.mo51408b()) {
            vx2.m53588d(a17);
            f17 s2 = x17.m73835s(a17);
            vx2.m53590f(s2, "makeStarProjection(typeParameterDescriptor!!)");
            return s2;
        }
        w47 K0 = c.getType().mo64506K0();
        Variance c2 = c.mo51409c();
        vx2.m53590f(c2, "argument.projectionKind");
        Variance c3 = f17.mo51409c();
        vx2.m53590f(c3, "underlyingProjection.projectionKind");
        if (!(c3 == c2 || c3 == (variance3 = Variance.INVARIANT))) {
            if (c2 == variance3) {
                c2 = c3;
            } else {
                this.f38540a.mo55792b(jz6.mo52825b(), a17, K0);
            }
        }
        if (a17 == null || (variance = a17.mo50049j()) == null) {
            variance = Variance.INVARIANT;
        }
        vx2.m53590f(variance, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (!(variance == c2 || variance == (variance2 = Variance.INVARIANT))) {
            if (c2 == variance2) {
                c2 = variance2;
            } else {
                this.f38540a.mo55792b(jz6.mo52825b(), a17, K0);
            }
        }
        mo52557a(type.getAnnotations(), K0.getAnnotations());
        if (K0 instanceof ol1) {
            xc3 = mo52559c((ol1) K0, type.mo51133G0());
        } else {
            xc3 = mo52562f(q17.m71165a(K0), type);
        }
        return new h17(c2, xc3);
    }

    /* renamed from: m */
    public final d36 mo52569m(d36 d36, jz6 jz6, int i) {
        yz6 H0 = d36.mo51134H0();
        List<f17> F0 = d36.mo51132F0();
        ArrayList arrayList = new ArrayList(dk0.m43495u(F0, 10));
        int i2 = 0;
        for (T next : F0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ck0.m33072t();
            }
            f17 f17 = (f17) next;
            f17 l = mo52568l(f17, jz6, H0.getParameters().get(i2), i + 1);
            if (!l.mo51408b()) {
                l = new h17(l.mo51409c(), x17.m73833q(l.getType(), f17.getType().mo51135I0()));
            }
            arrayList.add(l);
            i2 = i3;
        }
        return q17.m71170f(d36, arrayList, (rz6) null, 2, (Object) null);
    }
}
