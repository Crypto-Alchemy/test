package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$allDescriptors$1 */
/* compiled from: DeserializedClassDescriptor.kt */
public final class C7678xb586494b extends Lambda implements pc2<Collection<? extends d31>> {
    public final /* synthetic */ DeserializedClassDescriptor.DeserializedClassMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7678xb586494b(DeserializedClassDescriptor.DeserializedClassMemberScope deserializedClassMemberScope) {
        super(0);
        this.this$0 = deserializedClassMemberScope;
    }

    public final Collection<d31> invoke() {
        return this.this$0.mo55198j(yc1.f46177o, MemberScope.f40114a.mo55095a(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
    }
}
