package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import p000.yc3;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$areCallableDescriptorsEquivalent$overridingUtil$1 */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class C7650x10bda471 implements yc3.C9638a {

    /* renamed from: a */
    public final /* synthetic */ boolean f40062a;

    /* renamed from: b */
    public final /* synthetic */ C7420a f40063b;

    /* renamed from: c */
    public final /* synthetic */ C7420a f40064c;

    public C7650x10bda471(boolean z, C7420a aVar, C7420a aVar2) {
        this.f40062a = z;
        this.f40063b = aVar;
        this.f40064c = aVar2;
    }

    /* renamed from: a */
    public final boolean mo55047a(yz6 yz6, yz6 yz62) {
        vx2.m53591g(yz6, "c1");
        vx2.m53591g(yz62, "c2");
        if (vx2.m53586b(yz6, yz62)) {
            return true;
        }
        eg0 d = yz6.mo51180d();
        eg0 d2 = yz62.mo51180d();
        if (!(d instanceof a17) || !(d2 instanceof a17)) {
            return false;
        }
        boolean z = this.f40062a;
        final C7420a aVar = this.f40063b;
        final C7420a aVar2 = this.f40064c;
        return DescriptorEquivalenceForOverrides.f40061a.mo55043g((a17) d, (a17) d2, z, new fd2<d31, d31, Boolean>() {
            public final Boolean invoke(d31 d31, d31 d312) {
                return Boolean.valueOf(vx2.m53586b(d31, aVar) && vx2.m53586b(d312, aVar2));
            }
        });
    }
}
