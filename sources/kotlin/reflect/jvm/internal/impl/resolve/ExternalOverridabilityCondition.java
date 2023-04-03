package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;

public interface ExternalOverridabilityCondition {

    public enum Contract {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum Result {
        OVERRIDABLE,
        CONFLICT,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* renamed from: a */
    Result mo52362a(C7420a aVar, C7420a aVar2, if0 if0);

    Contract getContract();
}
