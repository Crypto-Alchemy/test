package p000;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* renamed from: ul0 */
/* compiled from: CompanionObjectMapping.kt */
public final class ul0 {

    /* renamed from: a */
    public static final ul0 f45107a = new ul0();

    /* renamed from: b */
    public static final Set<nf0> f45108b;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(dk0.m43495u(set, 10));
        for (PrimitiveType c : set) {
            arrayList.add(C7395c.m60202c(c));
        }
        u82 l = C7395c.C7396a.f39170h.mo66454l();
        vx2.m53590f(l, "string.toSafe()");
        List v0 = CollectionsKt___CollectionsKt.m47351v0(arrayList, l);
        u82 l2 = C7395c.C7396a.f39174j.mo66454l();
        vx2.m53590f(l2, "_boolean.toSafe()");
        List v02 = CollectionsKt___CollectionsKt.m47351v0(v0, l2);
        u82 l3 = C7395c.C7396a.f39192s.mo66454l();
        vx2.m53590f(l3, "_enum.toSafe()");
        List<u82> v03 = CollectionsKt___CollectionsKt.m47351v0(v02, l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (u82 m : v03) {
            linkedHashSet.add(nf0.m69751m(m));
        }
        f45108b = linkedHashSet;
    }

    /* renamed from: a */
    public final Set<nf0> mo66303a() {
        return f45108b;
    }

    /* renamed from: b */
    public final Set<nf0> mo66304b() {
        return f45108b;
    }
}
