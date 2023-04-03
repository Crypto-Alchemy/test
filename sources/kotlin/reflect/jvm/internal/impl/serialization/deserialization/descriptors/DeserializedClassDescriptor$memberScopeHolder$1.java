package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* compiled from: DeserializedClassDescriptor.kt */
public /* synthetic */ class DeserializedClassDescriptor$memberScopeHolder$1 extends FunctionReference implements rc2<bd3, DeserializedClassDescriptor.DeserializedClassMemberScope> {
    public DeserializedClassDescriptor$memberScopeHolder$1(Object obj) {
        super(1, obj);
    }

    public final String getName() {
        return "<init>";
    }

    public final y83 getOwner() {
        return ua5.m52727b(DeserializedClassDescriptor.DeserializedClassMemberScope.class);
    }

    public final String getSignature() {
        return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
    }

    public final DeserializedClassDescriptor.DeserializedClassMemberScope invoke(bd3 bd3) {
        vx2.m53591g(bd3, "p0");
        return new DeserializedClassDescriptor.DeserializedClassMemberScope((DeserializedClassDescriptor) this.receiver, bd3);
    }
}
