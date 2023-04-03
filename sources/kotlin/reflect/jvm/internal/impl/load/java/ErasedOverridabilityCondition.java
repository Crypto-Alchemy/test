package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7428e;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.sequences.SequencesKt___SequencesKt;

/* compiled from: ErasedOverridabilityCondition.kt */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ErasedOverridabilityCondition$a */
    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class C7446a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39396a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            f39396a = iArr;
        }
    }

    /* renamed from: a */
    public ExternalOverridabilityCondition.Result mo52362a(C7420a aVar, C7420a aVar2, if0 if0) {
        OverridingUtil.OverrideCompatibilityInfo.Result result;
        xc3 xc3;
        boolean z;
        boolean z2;
        vx2.m53591g(aVar, "superDescriptor");
        vx2.m53591g(aVar2, "subDescriptor");
        if (aVar2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
            List<a17> typeParameters = javaMethodDescriptor.getTypeParameters();
            vx2.m53590f(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo w = OverridingUtil.m62385w(aVar, aVar2);
                if (w != null) {
                    result = w.mo55056c();
                } else {
                    result = null;
                }
                if (result != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<n87> f = javaMethodDescriptor.mo51763f();
                vx2.m53590f(f, "subDescriptor.valueParameters");
                hw5<R> x = SequencesKt___SequencesKt.m63034x(CollectionsKt___CollectionsKt.m47318Q(f), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.INSTANCE);
                xc3 returnType = javaMethodDescriptor.getReturnType();
                vx2.m53588d(returnType);
                hw5<R> A = SequencesKt___SequencesKt.m63017A(x, returnType);
                h85 J = javaMethodDescriptor.mo51315J();
                if (J != null) {
                    xc3 = J.getType();
                } else {
                    xc3 = null;
                }
                Iterator<R> it = SequencesKt___SequencesKt.m63036z(A, ck0.m33066n(xc3)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    xc3 xc32 = (xc3) it.next();
                    if (!(!xc32.mo51132F0().isEmpty()) || (xc32.mo64506K0() instanceof RawTypeImpl)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                C7420a aVar3 = (C7420a) aVar.mo50708c(new RawSubstitution((TypeParameterUpperBoundEraser) null, 1, (DefaultConstructorMarker) null).mo65206c());
                if (aVar3 == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (aVar3 instanceof C7428e) {
                    C7428e eVar = (C7428e) aVar3;
                    List<a17> typeParameters2 = eVar.getTypeParameters();
                    vx2.m53590f(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        aVar3 = eVar.mo50951s().mo50968o(ck0.m33062j()).build();
                        vx2.m53588d(aVar3);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.f40070f.mo55052F(aVar3, aVar2, false).mo55056c();
                vx2.m53590f(c, "DEFAULT.isOverridableByW…Descriptor, false).result");
                if (C7446a.f39396a[c.ordinal()] == 1) {
                    return ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }
}
