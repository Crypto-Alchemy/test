package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.C6169a;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p000.a07;

/* compiled from: TypeParameterUpperBoundEraser.kt */
public final class TypeParameterUpperBoundEraser {

    /* renamed from: a */
    public final LockBasedStorageManager f39566a;

    /* renamed from: b */
    public final ef3 f39567b;

    /* renamed from: c */
    public final RawSubstitution f39568c;

    /* renamed from: d */
    public final vs3<C7470a, xc3> f39569d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$a */
    /* compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class C7470a {

        /* renamed from: a */
        public final a17 f39570a;

        /* renamed from: b */
        public final boolean f39571b;

        /* renamed from: c */
        public final f23 f39572c;

        public C7470a(a17 a17, boolean z, f23 f23) {
            vx2.m53591g(a17, "typeParameter");
            vx2.m53591g(f23, "typeAttr");
            this.f39570a = a17;
            this.f39571b = z;
            this.f39572c = f23;
        }

        /* renamed from: a */
        public final f23 mo53675a() {
            return this.f39572c;
        }

        /* renamed from: b */
        public final a17 mo53676b() {
            return this.f39570a;
        }

        /* renamed from: c */
        public final boolean mo53677c() {
            return this.f39571b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7470a)) {
                return false;
            }
            C7470a aVar = (C7470a) obj;
            if (vx2.m53586b(aVar.f39570a, this.f39570a) && aVar.f39571b == this.f39571b && aVar.f39572c.mo51581d() == this.f39572c.mo51581d() && aVar.f39572c.mo51582e() == this.f39572c.mo51582e() && aVar.f39572c.mo51585g() == this.f39572c.mo51585g() && vx2.m53586b(aVar.f39572c.mo51580c(), this.f39572c.mo51580c())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int hashCode = this.f39570a.hashCode();
            int i2 = hashCode + (hashCode * 31) + (this.f39571b ? 1 : 0);
            int hashCode2 = i2 + (i2 * 31) + this.f39572c.mo51581d().hashCode();
            int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f39572c.mo51582e().hashCode();
            int i3 = hashCode3 + (hashCode3 * 31) + (this.f39572c.mo51585g() ? 1 : 0);
            int i4 = i3 * 31;
            d36 c = this.f39572c.mo51580c();
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            return i3 + i4 + i;
        }

        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f39570a + ", isRaw=" + this.f39571b + ", typeAttr=" + this.f39572c + ')';
        }
    }

    public TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution) {
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasion results");
        this.f39566a = lockBasedStorageManager;
        this.f39567b = C6169a.m47232a(new TypeParameterUpperBoundEraser$erroneousErasedBound$2(this));
        this.f39568c = rawSubstitution == null ? new RawSubstitution(this) : rawSubstitution;
        vs3<C7470a, xc3> h = lockBasedStorageManager.mo51163h(new TypeParameterUpperBoundEraser$getErasedUpperBound$1(this));
        vx2.m53590f(h, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.f39569d = h;
    }

    /* renamed from: b */
    public final xc3 mo53671b(f23 f23) {
        xc3 w;
        d36 c = f23.mo51580c();
        if (c == null || (w = TypeUtilsKt.m62967w(c)) == null) {
            return mo53674e();
        }
        return w;
    }

    /* renamed from: c */
    public final xc3 mo53672c(a17 a17, boolean z, f23 f23) {
        vx2.m53591g(a17, "typeParameter");
        vx2.m53591g(f23, "typeAttr");
        return this.f39569d.invoke(new C7470a(a17, z, f23));
    }

    /* renamed from: d */
    public final xc3 mo53673d(a17 a17, boolean z, f23 f23) {
        f17 f17;
        f23 f232;
        Set<a17> f = f23.mo51584f();
        if (f != null && f.contains(a17.mo50045a())) {
            return mo53671b(f23);
        }
        d36 n = a17.mo51464n();
        vx2.m53590f(n, "typeParameter.defaultType");
        Set<a17> f2 = TypeUtilsKt.m62950f(n, f);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(f2, 10)), 16));
        for (a17 a172 : f2) {
            if (f == null || !f.contains(a172)) {
                RawSubstitution rawSubstitution = this.f39568c;
                if (z) {
                    f232 = f23;
                } else {
                    f232 = f23.mo51588i(JavaTypeFlexibility.INFLEXIBLE);
                }
                xc3 c = mo53672c(a172, z, f23.mo51589j(a17));
                vx2.m53590f(c, "getErasedUpperBound(it, …Parameter(typeParameter))");
                f17 = rawSubstitution.mo53662j(a172, f232, c);
            } else {
                f17 = l23.m63662b(a172, f23);
            }
            Pair a = wy6.m54142a(a172.mo50046g(), f17);
            linkedHashMap.put(a.getFirst(), a.getSecond());
        }
        TypeSubstitutor g = TypeSubstitutor.m62902g(a07.C6787a.m55340e(a07.f36338c, linkedHashMap, false, 2, (Object) null));
        vx2.m53590f(g, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<xc3> upperBounds = a17.getUpperBounds();
        vx2.m53590f(upperBounds, "typeParameter.upperBounds");
        xc3 xc3 = (xc3) CollectionsKt___CollectionsKt.m47329Z(upperBounds);
        if (xc3.mo51134H0().mo51180d() instanceof if0) {
            vx2.m53590f(xc3, "firstUpperBound");
            return TypeUtilsKt.m62966v(xc3, g, linkedHashMap, Variance.OUT_VARIANCE, f23.mo51584f());
        }
        Set<a17> f3 = f23.mo51584f();
        if (f3 == null) {
            f3 = my5.m48548d(this);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            a17 a173 = (a17) d;
            if (f3.contains(a173)) {
                return mo53671b(f23);
            }
            List<xc3> upperBounds2 = a173.getUpperBounds();
            vx2.m53590f(upperBounds2, "current.upperBounds");
            xc3 xc32 = (xc3) CollectionsKt___CollectionsKt.m47329Z(upperBounds2);
            if (xc32.mo51134H0().mo51180d() instanceof if0) {
                vx2.m53590f(xc32, "nextUpperBound");
                return TypeUtilsKt.m62966v(xc32, g, linkedHashMap, Variance.OUT_VARIANCE, f23.mo51584f());
            }
            d = xc32.mo51134H0().mo51180d();
            vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    /* renamed from: e */
    public final lr1 mo53674e() {
        return (lr1) this.f39567b.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rawSubstitution);
    }
}
