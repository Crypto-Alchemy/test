package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements pc2<List<? extends w47>> {
    public final /* synthetic */ List<w47> $supertypes;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$initializeSupertypes$2(List<? extends w47> list) {
        super(0);
        this.$supertypes = list;
    }

    public final List<w47> invoke() {
        return this.$supertypes;
    }
}
