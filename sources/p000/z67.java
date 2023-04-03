package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* renamed from: z67 */
/* compiled from: util.kt */
public final class z67 {
    /* renamed from: a */
    public static final List<n87> m74801a(Collection<? extends xc3> collection, Collection<? extends n87> collection2, C7420a aVar) {
        xc3 xc3;
        vx2.m53591g(collection, "newValueParameterTypes");
        vx2.m53591g(collection2, "oldValueParameters");
        vx2.m53591g(aVar, "newOwner");
        collection.size();
        collection2.size();
        List<Pair<T, R>> R0 = CollectionsKt___CollectionsKt.m47321R0(collection, collection2);
        ArrayList arrayList = new ArrayList(dk0.m43495u(R0, 10));
        for (Pair pair : R0) {
            xc3 xc32 = (xc3) pair.component1();
            n87 n87 = (n87) pair.component2();
            int index = n87.getIndex();
            C6983dm annotations = n87.getAnnotations();
            r24 name = n87.getName();
            vx2.m53590f(name, "oldParameter.name");
            boolean v0 = n87.mo53318v0();
            boolean m0 = n87.mo53316m0();
            boolean k0 = n87.mo53315k0();
            if (n87.mo53317q0() != null) {
                xc3 = DescriptorUtilsKt.m62451l(aVar).mo51535k().mo53171k(xc32);
            } else {
                xc3 = null;
            }
            a66 source = n87.getSource();
            vx2.m53590f(source, "oldParameter.source");
            arrayList.add(new ValueParameterDescriptorImpl(aVar, (n87) null, index, annotations, name, xc32, v0, m0, k0, xc3, source));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope m74802b(p000.if0 r3) {
        /*
            java.lang.String r0 = "<this>"
            p000.vx2.m53591g(r3, r0)
            if0 r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62455p(r3)
            r0 = 0
            if (r3 != 0) goto L_0x000d
            return r0
        L_0x000d:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r1 = r3.mo52347g0()
            boolean r2 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope
            if (r2 == 0) goto L_0x0018
            r0 = r1
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope) r0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope r0 = m74802b(r3)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z67.m74802b(if0):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope");
    }
}
