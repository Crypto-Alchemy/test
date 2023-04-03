package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p000.kz6;

/* compiled from: KotlinTypeFactory.kt */
public final class KotlinTypeFactory {

    /* renamed from: a */
    public static final KotlinTypeFactory f40263a = new KotlinTypeFactory();

    /* renamed from: b */
    public static final rc2<bd3, d36> f40264b = KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1.INSTANCE;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$a */
    /* compiled from: KotlinTypeFactory.kt */
    public static final class C7717a {

        /* renamed from: a */
        public final d36 f40265a;

        /* renamed from: b */
        public final yz6 f40266b;

        public C7717a(d36 d36, yz6 yz6) {
            this.f40265a = d36;
            this.f40266b = yz6;
        }

        /* renamed from: a */
        public final d36 mo55310a() {
            return this.f40265a;
        }

        /* renamed from: b */
        public final yz6 mo55311b() {
            return this.f40266b;
        }
    }

    /* renamed from: b */
    public static final d36 m62848b(hz6 hz6, List<? extends f17> list) {
        vx2.m53591g(hz6, "<this>");
        vx2.m53591g(list, "arguments");
        return new iz6(kz6.C7812a.f40548a, false).mo52565i(jz6.f38818e.mo52828a((jz6) null, hz6, list), rz6.f44504d.mo65783h());
    }

    /* renamed from: d */
    public static final w47 m62849d(d36 d36, d36 d362) {
        vx2.m53591g(d36, "lowerBound");
        vx2.m53591g(d362, "upperBound");
        if (vx2.m53586b(d36, d362)) {
            return d36;
        }
        return new k42(d36, d362);
    }

    /* renamed from: e */
    public static final d36 m62850e(rz6 rz6, IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        vx2.m53591g(rz6, "attributes");
        vx2.m53591g(integerLiteralTypeConstructor, "constructor");
        return m62854j(rz6, integerLiteralTypeConstructor, ck0.m33062j(), z, nr1.m70031a(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    /* renamed from: g */
    public static final d36 m62851g(rz6 rz6, if0 if0, List<? extends f17> list) {
        vx2.m53591g(rz6, "attributes");
        vx2.m53591g(if0, "descriptor");
        vx2.m53591g(list, "arguments");
        yz6 g = if0.mo50046g();
        vx2.m53590f(g, "descriptor.typeConstructor");
        return m62853i(rz6, g, list, false, (bd3) null, 16, (Object) null);
    }

    /* renamed from: h */
    public static final d36 m62852h(rz6 rz6, yz6 yz6, List<? extends f17> list, boolean z, bd3 bd3) {
        vx2.m53591g(rz6, "attributes");
        vx2.m53591g(yz6, "constructor");
        vx2.m53591g(list, "arguments");
        if (!rz6.isEmpty() || !list.isEmpty() || z || yz6.mo51180d() == null) {
            return m62855k(rz6, yz6, list, z, f40263a.mo55308c(yz6, list, bd3), new KotlinTypeFactory$simpleType$1(yz6, list, rz6, z));
        }
        eg0 d = yz6.mo51180d();
        vx2.m53588d(d);
        d36 n = d.mo51464n();
        vx2.m53590f(n, "constructor.declarationDescriptor!!.defaultType");
        return n;
    }

    /* renamed from: i */
    public static /* synthetic */ d36 m62853i(rz6 rz6, yz6 yz6, List list, boolean z, bd3 bd3, int i, Object obj) {
        if ((i & 16) != 0) {
            bd3 = null;
        }
        return m62852h(rz6, yz6, list, z, bd3);
    }

    /* renamed from: j */
    public static final d36 m62854j(rz6 rz6, yz6 yz6, List<? extends f17> list, boolean z, MemberScope memberScope) {
        vx2.m53591g(rz6, "attributes");
        vx2.m53591g(yz6, "constructor");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(memberScope, "memberScope");
        yz6 yz62 = yz6;
        List<? extends f17> list2 = list;
        e36 e36 = new e36(yz62, list2, z, memberScope, new KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1(yz62, list2, rz6, z, memberScope));
        if (rz6.isEmpty()) {
            return e36;
        }
        return new g36(e36, rz6);
    }

    /* renamed from: k */
    public static final d36 m62855k(rz6 rz6, yz6 yz6, List<? extends f17> list, boolean z, MemberScope memberScope, rc2<? super bd3, ? extends d36> rc2) {
        vx2.m53591g(rz6, "attributes");
        vx2.m53591g(yz6, "constructor");
        vx2.m53591g(list, "arguments");
        vx2.m53591g(memberScope, "memberScope");
        vx2.m53591g(rc2, "refinedTypeFactory");
        e36 e36 = new e36(yz6, list, z, memberScope, rc2);
        if (rz6.isEmpty()) {
            return e36;
        }
        return new g36(e36, rz6);
    }

    /* renamed from: c */
    public final MemberScope mo55308c(yz6 yz6, List<? extends f17> list, bd3 bd3) {
        eg0 d = yz6.mo51180d();
        if (d instanceof a17) {
            return ((a17) d).mo51464n().mo51146m();
        }
        if (d instanceof if0) {
            if (bd3 == null) {
                bd3 = DescriptorUtilsKt.m62450k(DescriptorUtilsKt.m62451l(d));
            }
            if (list.isEmpty()) {
                return fx3.m57946b((if0) d, bd3);
            }
            return fx3.m57945a((if0) d, a07.f36338c.mo50027b(yz6, list), bd3);
        } else if (d instanceof hz6) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String r24 = ((hz6) d).getName().toString();
            vx2.m53590f(r24, "descriptor.name.toString()");
            return nr1.m70031a(errorScopeKind, true, r24);
        } else if (yz6 instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) yz6).mo55296f();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + d + " for constructor: " + yz6);
        }
    }

    /* renamed from: f */
    public final C7717a mo55309f(yz6 yz6, bd3 bd3, List<? extends f17> list) {
        eg0 f;
        eg0 d = yz6.mo51180d();
        if (d == null || (f = bd3.mo50560f(d)) == null) {
            return null;
        }
        if (f instanceof hz6) {
            return new C7717a(m62848b((hz6) f, list), (yz6) null);
        }
        yz6 a = f.mo50046g().mo51808a(bd3);
        vx2.m53590f(a, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new C7717a((d36) null, a);
    }
}
