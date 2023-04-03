package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 */
/* compiled from: IntersectionType.kt */
public final class C7729x7a6103fb extends Lambda implements pc2<String> {
    public final /* synthetic */ Set<d36> $inputTypes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7729x7a6103fb(Set<? extends d36> set) {
        super(0);
        this.$inputTypes = set;
    }

    public final String invoke() {
        return "This collections cannot be empty! input types: " + CollectionsKt___CollectionsKt.m47338i0(this.$inputTypes, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 63, (Object) null);
    }
}
