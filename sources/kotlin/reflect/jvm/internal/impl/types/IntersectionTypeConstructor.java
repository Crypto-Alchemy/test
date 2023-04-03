package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* compiled from: IntersectionTypeConstructor.kt */
public final class IntersectionTypeConstructor implements yz6, sx2 {

    /* renamed from: a */
    public xc3 f40259a;

    /* renamed from: b */
    public final LinkedHashSet<xc3> f40260b;

    /* renamed from: c */
    public final int f40261c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$a */
    /* compiled from: Comparisons.kt */
    public static final class C7716a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ rc2 f40262a;

        public C7716a(rc2 rc2) {
            this.f40262a = rc2;
        }

        public final int compare(T t, T t2) {
            xc3 xc3 = (xc3) t;
            rc2 rc2 = this.f40262a;
            vx2.m53590f(xc3, "it");
            String obj = rc2.invoke(xc3).toString();
            xc3 xc32 = (xc3) t2;
            rc2 rc22 = this.f40262a;
            vx2.m53590f(xc32, "it");
            return xl0.m54426a(obj, rc22.invoke(xc32).toString());
        }
    }

    public IntersectionTypeConstructor(Collection<? extends xc3> collection) {
        vx2.m53591g(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<xc3> linkedHashSet = new LinkedHashSet<>(collection);
        this.f40260b = linkedHashSet;
        this.f40261c = linkedHashSet.hashCode();
    }

    /* renamed from: l */
    public static /* synthetic */ String m62835l(IntersectionTypeConstructor intersectionTypeConstructor, rc2 rc2, int i, Object obj) {
        if ((i & 1) != 0) {
            rc2 = IntersectionTypeConstructor$makeDebugNameForIntersectionType$1.INSTANCE;
        }
        return intersectionTypeConstructor.mo55300j(rc2);
    }

    /* renamed from: d */
    public eg0 mo51180d() {
        return null;
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return vx2.m53586b(this.f40260b, ((IntersectionTypeConstructor) obj).f40260b);
    }

    /* renamed from: f */
    public final MemberScope mo55296f() {
        return TypeIntersectionScope.f40125d.mo55104a("member scope for intersection type", this.f40260b);
    }

    /* renamed from: g */
    public Collection<xc3> mo51811g() {
        return this.f40260b;
    }

    public List<a17> getParameters() {
        return ck0.m33062j();
    }

    /* renamed from: h */
    public final d36 mo55297h() {
        return KotlinTypeFactory.m62855k(rz6.f44504d.mo65783h(), this, ck0.m33062j(), false, mo55296f(), new IntersectionTypeConstructor$createType$1(this));
    }

    public int hashCode() {
        return this.f40261c;
    }

    /* renamed from: i */
    public final xc3 mo55299i() {
        return this.f40259a;
    }

    /* renamed from: j */
    public final String mo55300j(rc2<? super xc3, ? extends Object> rc2) {
        vx2.m53591g(rc2, "getProperTypeRelatedToStringify");
        return CollectionsKt___CollectionsKt.m47338i0(CollectionsKt___CollectionsKt.m47304D0(this.f40260b, new C7716a(rc2)), " & ", "{", "}", 0, (CharSequence) null, new IntersectionTypeConstructor$makeDebugNameForIntersectionType$3(rc2), 24, (Object) null);
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        C7389b k = this.f40260b.iterator().next().mo51134H0().mo51813k();
        vx2.m53590f(k, "intersectedTypes.iterato…xt().constructor.builtIns");
        return k;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [xc3] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor mo51808a(p000.bd3 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            p000.vx2.m53591g(r5, r0)
            java.util.Collection r0 = r4.mo51811g()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.dk0.m43495u(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002f
            java.lang.Object r2 = r0.next()
            xc3 r2 = (p000.xc3) r2
            xc3 r2 = r2.mo51136J0(r5)
            r3 = 1
            r1.add(r2)
            r2 = r3
            goto L_0x0019
        L_0x002f:
            r0 = 0
            if (r2 != 0) goto L_0x0033
            goto L_0x0046
        L_0x0033:
            xc3 r2 = r4.mo55299i()
            if (r2 == 0) goto L_0x003d
            xc3 r0 = r2.mo51136J0(r5)
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r5 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r5.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r0 = r5.mo55302n(r0)
        L_0x0046:
            if (r0 != 0) goto L_0x0049
            r0 = r4
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.mo51808a(bd3):kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor");
    }

    /* renamed from: n */
    public final IntersectionTypeConstructor mo55302n(xc3 xc3) {
        return new IntersectionTypeConstructor(this.f40260b, xc3);
    }

    public String toString() {
        return m62835l(this, (rc2) null, 1, (Object) null);
    }

    public IntersectionTypeConstructor(Collection<? extends xc3> collection, xc3 xc3) {
        this(collection);
        this.f40259a = xc3;
    }
}
