package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: TypeParameterUpperBoundEraser.kt */
public final class TypeParameterUpperBoundEraser$erroneousErasedBound$2 extends Lambda implements pc2<lr1> {
    public final /* synthetic */ TypeParameterUpperBoundEraser this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeParameterUpperBoundEraser$erroneousErasedBound$2(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        super(0);
        this.this$0 = typeParameterUpperBoundEraser;
    }

    public final lr1 invoke() {
        return nr1.m70033d(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.this$0.toString());
    }
}
