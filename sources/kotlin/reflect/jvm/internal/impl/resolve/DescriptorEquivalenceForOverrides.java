package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p000.bd3;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
public final class DescriptorEquivalenceForOverrides {

    /* renamed from: a */
    public static final DescriptorEquivalenceForOverrides f40061a = new DescriptorEquivalenceForOverrides();

    /* renamed from: b */
    public static /* synthetic */ boolean m62345b(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, C7420a aVar, C7420a aVar2, boolean z, boolean z2, boolean z3, bd3 bd3, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.mo55039a(aVar, aVar2, z, z4, z3, bd3);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m62346e(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, d31 d31, d31 d312, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.mo55041d(d31, d312, z, z2);
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m62347h(DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, a17 a17, a17 a172, boolean z, fd2 fd2, int i, Object obj) {
        if ((i & 8) != 0) {
            fd2 = DescriptorEquivalenceForOverrides$areTypeParametersEquivalent$1.INSTANCE;
        }
        return descriptorEquivalenceForOverrides.mo55043g(a17, a172, z, fd2);
    }

    /* renamed from: a */
    public final boolean mo55039a(C7420a aVar, C7420a aVar2, boolean z, boolean z2, boolean z3, bd3 bd3) {
        vx2.m53591g(aVar, "a");
        vx2.m53591g(aVar2, "b");
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        if (vx2.m53586b(aVar, aVar2)) {
            return true;
        }
        if (!vx2.m53586b(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z2 && (aVar instanceof ns3) && (aVar2 instanceof ns3) && ((ns3) aVar).mo51319d0() != ((ns3) aVar2).mo51319d0()) {
            return false;
        }
        if ((vx2.m53586b(aVar.mo51119b(), aVar2.mo51119b()) && (!z || !vx2.m53586b(mo55045j(aVar), mo55045j(aVar2)))) || dd1.m56800E(aVar) || dd1.m56800E(aVar2) || !mo55044i(aVar, aVar2, C7649xc15c0bd8.INSTANCE, z)) {
            return false;
        }
        OverridingUtil i = OverridingUtil.m62374i(bd3, new C7650x10bda471(z, aVar, aVar2));
        vx2.m53590f(i, "a: CallableDescriptor,\n …= a && y == b }\n        }");
        OverridingUtil.OverrideCompatibilityInfo.Result c = i.mo55051E(aVar, aVar2, (if0) null, !z3).mo55056c();
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c == result && i.mo55051E(aVar2, aVar, (if0) null, !z3).mo55056c() == result) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo55040c(if0 if0, if0 if02) {
        return vx2.m53586b(if0.mo50046g(), if02.mo50046g());
    }

    /* renamed from: d */
    public final boolean mo55041d(d31 d31, d31 d312, boolean z, boolean z2) {
        if ((d31 instanceof if0) && (d312 instanceof if0)) {
            return mo55040c((if0) d31, (if0) d312);
        }
        if ((d31 instanceof a17) && (d312 instanceof a17)) {
            return m62347h(this, (a17) d31, (a17) d312, z, (fd2) null, 8, (Object) null);
        } else if ((d31 instanceof C7420a) && (d312 instanceof C7420a)) {
            return m62345b(this, (C7420a) d31, (C7420a) d312, z, z2, false, bd3.C6859a.f36799a, 16, (Object) null);
        } else if (!(d31 instanceof fk4) || !(d312 instanceof fk4)) {
            return vx2.m53586b(d31, d312);
        } else {
            return vx2.m53586b(((fk4) d31).mo51711e(), ((fk4) d312).mo51711e());
        }
    }

    /* renamed from: f */
    public final boolean mo55042f(a17 a17, a17 a172, boolean z) {
        vx2.m53591g(a17, "a");
        vx2.m53591g(a172, "b");
        return m62347h(this, a17, a172, z, (fd2) null, 8, (Object) null);
    }

    /* renamed from: g */
    public final boolean mo55043g(a17 a17, a17 a172, boolean z, fd2<? super d31, ? super d31, Boolean> fd2) {
        vx2.m53591g(a17, "a");
        vx2.m53591g(a172, "b");
        vx2.m53591g(fd2, "equivalentCallables");
        if (vx2.m53586b(a17, a172)) {
            return true;
        }
        if (vx2.m53586b(a17.mo51119b(), a172.mo51119b()) || !mo55044i(a17, a172, fd2, z)) {
            return false;
        }
        if (a17.getIndex() == a172.getIndex()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo55044i(d31 d31, d31 d312, fd2<? super d31, ? super d31, Boolean> fd2, boolean z) {
        d31 b = d31.mo51119b();
        d31 b2 = d312.mo51119b();
        if ((b instanceof CallableMemberDescriptor) || (b2 instanceof CallableMemberDescriptor)) {
            return fd2.invoke(b, b2).booleanValue();
        }
        return m62346e(this, b, b2, z, false, 8, (Object) null);
    }

    /* renamed from: j */
    public final a66 mo55045j(C7420a aVar) {
        while (aVar instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) aVar;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo51659d();
            vx2.m53590f(d, "overriddenDescriptors");
            aVar = (CallableMemberDescriptor) CollectionsKt___CollectionsKt.m47301A0(d);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }
}
