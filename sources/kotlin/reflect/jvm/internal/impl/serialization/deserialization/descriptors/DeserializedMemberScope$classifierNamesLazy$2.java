package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$classifierNamesLazy$2 extends Lambda implements pc2<Set<? extends r24>> {
    public final /* synthetic */ DeserializedMemberScope this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classifierNamesLazy$2(DeserializedMemberScope deserializedMemberScope) {
        super(0);
        this.this$0 = deserializedMemberScope;
    }

    public final Set<r24> invoke() {
        Set<r24> s = this.this$0.mo55187s();
        if (s == null) {
            return null;
        }
        return oy5.m49611k(oy5.m49611k(this.this$0.mo55202q(), this.this$0.f40192c.mo55220g()), s);
    }
}
