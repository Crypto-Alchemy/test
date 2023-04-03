package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 */
/* compiled from: IntersectionType.kt */
public /* synthetic */ class C7730x702eebb8 extends FunctionReference implements fd2<xc3, xc3, Boolean> {
    public C7730x702eebb8(Object obj) {
        super(2, obj);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final y83 getOwner() {
        return ua5.m52727b(TypeIntersector.class);
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public final Boolean invoke(xc3 xc3, xc3 xc32) {
        vx2.m53591g(xc3, "p0");
        vx2.m53591g(xc32, "p1");
        return Boolean.valueOf(((TypeIntersector) this.receiver).mo55362e(xc3, xc32));
    }
}
