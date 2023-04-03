package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p000.we5;

/* renamed from: kg0 */
/* compiled from: SealedClassInheritorsProvider.kt */
public final class kg0 extends tn5 {

    /* renamed from: a */
    public static final kg0 f38896a = new kg0();

    /* renamed from: kg0$a */
    /* compiled from: Comparisons.kt */
    public static final class C7344a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(DescriptorUtilsKt.m62447h((if0) t).mo66195b(), DescriptorUtilsKt.m62447h((if0) t2).mo66195b());
        }
    }

    /* renamed from: b */
    public static final void m59758b(if0 if0, LinkedHashSet<if0> linkedHashSet, MemberScope memberScope, boolean z) {
        for (d31 d31 : we5.C9516a.m73584a(memberScope, yc1.f46182t, (rc2) null, 2, (Object) null)) {
            if (d31 instanceof if0) {
                if0 if02 = (if0) d31;
                if (if02.mo51319d0()) {
                    r24 name = if02.getName();
                    vx2.m53590f(name, "descriptor.name");
                    eg0 e = memberScope.mo50864e(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (e instanceof if0) {
                        if02 = (if0) e;
                    } else if (e instanceof hz6) {
                        if02 = ((hz6) e).mo52333r();
                    } else {
                        if02 = null;
                    }
                }
                if (if02 != null) {
                    if (dd1.m56834z(if02, if0)) {
                        linkedHashSet.add(if02);
                    }
                    if (z) {
                        MemberScope O = if02.mo52461O();
                        vx2.m53590f(O, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        m59758b(if0, linkedHashSet, O, z);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Collection<if0> mo52902a(if0 if0, boolean z) {
        d31 d31;
        d31 d312;
        vx2.m53591g(if0, "sealedClass");
        if (if0.mo51326p() != Modality.SEALED) {
            return ck0.m33062j();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z) {
            d31 = if0.mo51119b();
        } else {
            Iterator<d31> it = DescriptorUtilsKt.m62452m(if0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    d312 = null;
                    break;
                }
                d312 = it.next();
                if (d312 instanceof fk4) {
                    break;
                }
            }
            d31 = d312;
        }
        if (d31 instanceof fk4) {
            m59758b(if0, linkedHashSet, ((fk4) d31).mo51712m(), z);
        }
        MemberScope O = if0.mo52461O();
        vx2.m53590f(O, "sealedClass.unsubstitutedInnerClassesScope");
        m59758b(if0, linkedHashSet, O, true);
        return CollectionsKt___CollectionsKt.m47304D0(linkedHashSet, new C7344a());
    }
}
