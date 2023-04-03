package p000;

import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;

/* renamed from: r03 */
/* compiled from: JavaClassDataFinder.kt */
public final class r03 implements hf0 {

    /* renamed from: a */
    public final nc3 f44271a;

    /* renamed from: b */
    public final DeserializedDescriptorResolver f44272b;

    public r03(nc3 nc3, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        vx2.m53591g(nc3, "kotlinClassFinder");
        vx2.m53591g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f44271a = nc3;
        this.f44272b = deserializedDescriptorResolver;
    }

    /* renamed from: a */
    public gf0 mo52195a(nf0 nf0) {
        vx2.m53591g(nf0, "classId");
        tc3 a = oc3.m70233a(this.f44271a, nf0);
        if (a == null) {
            return null;
        }
        vx2.m53586b(a.mo65268i(), nf0);
        return this.f44272b.mo53803i(a);
    }
}
