package androidx.compose.runtime;

import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lpa3;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke", "()Ljava/util/HashMap;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Composer.kt */
public final class Pending$keyMap$2 extends Lambda implements pc2<HashMap<Object, LinkedHashSet<pa3>>> {
    public final /* synthetic */ Pending this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(Pending pending) {
        super(0);
        this.this$0 = pending;
    }

    public final HashMap<Object, LinkedHashSet<pa3>> invoke() {
        HashMap<Object, LinkedHashSet<pa3>> n = ComposerKt.m1998P();
        Pending pending = this.this$0;
        int size = pending.mo3045b().size();
        for (int i = 0; i < size; i++) {
            pa3 pa3 = pending.mo3045b().get(i);
            boolean unused = ComposerKt.m2001S(n, ComposerKt.m1990H(pa3), pa3);
        }
        return n;
    }
}
