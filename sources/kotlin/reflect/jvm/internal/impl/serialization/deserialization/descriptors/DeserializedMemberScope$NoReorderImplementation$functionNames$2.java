package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$NoReorderImplementation$functionNames$2 extends Lambda implements pc2<Set<? extends r24>> {
    public final /* synthetic */ DeserializedMemberScope.NoReorderImplementation this$0;
    public final /* synthetic */ DeserializedMemberScope this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$NoReorderImplementation$functionNames$2(DeserializedMemberScope.NoReorderImplementation noReorderImplementation, DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = noReorderImplementation;
        this.this$1 = deserializedMemberScope;
    }

    public final Set<r24> invoke() {
        DeserializedMemberScope.NoReorderImplementation noReorderImplementation = this.this$0;
        List<C7628h> r = noReorderImplementation.f40196a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DeserializedMemberScope deserializedMemberScope = noReorderImplementation.f40209n;
        for (C7628h hVar : r) {
            linkedHashSet.add(v24.m73044b(deserializedMemberScope.mo55201p().mo56230g(), ((ProtoBuf$Function) hVar).getName()));
        }
        return oy5.m49611k(linkedHashSet, this.this$1.mo55188t());
    }
}
