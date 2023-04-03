package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* renamed from: f86 */
/* compiled from: StarProjectionImpl.kt */
public final class f86 {

    /* renamed from: f86$a */
    /* compiled from: StarProjectionImpl.kt */
    public static final class C7072a extends a07 {

        /* renamed from: d */
        public final /* synthetic */ List<yz6> f37735d;

        public C7072a(List<? extends yz6> list) {
            this.f37735d = list;
        }

        /* renamed from: k */
        public f17 mo50025k(yz6 yz6) {
            vx2.m53591g(yz6, "key");
            if (!this.f37735d.contains(yz6)) {
                return null;
            }
            eg0 d = yz6.mo51180d();
            vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return x17.m73835s((a17) d);
        }
    }

    /* renamed from: a */
    public static final xc3 m57641a(List<? extends yz6> list, List<? extends xc3> list2, C7389b bVar) {
        xc3 p = TypeSubstitutor.m62902g(new C7072a(list)).mo55339p((xc3) CollectionsKt___CollectionsKt.m47329Z(list2), Variance.OUT_VARIANCE);
        if (p == null) {
            p = bVar.mo53185y();
        }
        vx2.m53590f(p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p;
    }

    /* renamed from: b */
    public static final xc3 m57642b(a17 a17) {
        vx2.m53591g(a17, "<this>");
        d31 b = a17.mo51119b();
        vx2.m53590f(b, "this.containingDeclaration");
        if (b instanceof fg0) {
            List<a17> parameters = ((fg0) b).mo50046g().getParameters();
            vx2.m53590f(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
            for (a17 g : parameters) {
                yz6 g2 = g.mo50046g();
                vx2.m53590f(g2, "it.typeConstructor");
                arrayList.add(g2);
            }
            List<xc3> upperBounds = a17.getUpperBounds();
            vx2.m53590f(upperBounds, "upperBounds");
            return m57641a(arrayList, upperBounds, DescriptorUtilsKt.m62445f(a17));
        } else if (b instanceof C7425c) {
            List<a17> typeParameters = ((C7425c) b).getTypeParameters();
            vx2.m53590f(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(typeParameters, 10));
            for (a17 g3 : typeParameters) {
                yz6 g4 = g3.mo50046g();
                vx2.m53590f(g4, "it.typeConstructor");
                arrayList2.add(g4);
            }
            List<xc3> upperBounds2 = a17.getUpperBounds();
            vx2.m53590f(upperBounds2, "upperBounds");
            return m57641a(arrayList2, upperBounds2, DescriptorUtilsKt.m62445f(a17));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }
}
