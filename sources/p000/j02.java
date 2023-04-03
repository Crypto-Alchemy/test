package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* renamed from: j02 */
/* compiled from: FieldOverridabilityCondition.kt */
public final class j02 implements ExternalOverridabilityCondition {
    /* renamed from: a */
    public ExternalOverridabilityCondition.Result mo52362a(C7420a aVar, C7420a aVar2, if0 if0) {
        vx2.m53591g(aVar, "superDescriptor");
        vx2.m53591g(aVar2, "subDescriptor");
        if (!(aVar2 instanceof fx4) || !(aVar instanceof fx4)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        fx4 fx4 = (fx4) aVar2;
        fx4 fx42 = (fx4) aVar;
        if (!vx2.m53586b(fx4.getName(), fx42.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (b13.m55700a(fx4) && b13.m55700a(fx42)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        if (b13.m55700a(fx4) || b13.m55700a(fx42)) {
            return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }

    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }
}
