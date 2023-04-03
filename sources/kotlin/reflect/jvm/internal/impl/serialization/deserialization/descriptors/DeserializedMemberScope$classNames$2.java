package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

/* compiled from: DeserializedMemberScope.kt */
public final class DeserializedMemberScope$classNames$2 extends Lambda implements pc2<Set<? extends r24>> {
    public final /* synthetic */ pc2<Collection<r24>> $classNames;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedMemberScope$classNames$2(pc2<? extends Collection<r24>> pc2) {
        super(0);
        this.$classNames = pc2;
    }

    public final Set<r24> invoke() {
        return CollectionsKt___CollectionsKt.m47315O0(this.$classNames.invoke());
    }
}
