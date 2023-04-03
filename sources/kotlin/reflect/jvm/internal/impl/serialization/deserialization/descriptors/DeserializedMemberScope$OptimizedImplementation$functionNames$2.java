package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$OptimizedImplementation$functionNames$2 extends Lambda implements pc2<Set<? extends r24>> {
    public final /* synthetic */ DeserializedMemberScope.OptimizedImplementation this$0;
    public final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$OptimizedImplementation$functionNames$2(DeserializedMemberScope.OptimizedImplementation optimizedImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = optimizedImplementation;
        this.this$1 = deserializedMemberScope;
    }

    public final Set<r24> invoke() {
        return oy5.m49611k(this.this$0.f40211a.keySet(), this.this$1.mo55188t());
    }
}
