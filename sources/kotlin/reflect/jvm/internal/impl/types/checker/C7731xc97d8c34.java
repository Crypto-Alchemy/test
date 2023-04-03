package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* compiled from: IntersectionType.kt */
public /* synthetic */ class C7731xc97d8c34 extends FunctionReference implements fd2<xc3, xc3, Boolean> {
    public C7731xc97d8c34(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final y83 getOwner() {
        return ua5.m52727b(l64.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final Boolean invoke(xc3 xc3, xc3 xc32) {
        vx2.m53591g(xc3, "p0");
        vx2.m53591g(xc32, "p1");
        return Boolean.valueOf(((l64) this.receiver).mo55822b(xc3, xc32));
    }
}
