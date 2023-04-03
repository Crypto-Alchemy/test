package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements rc2<T, T> {
    public final /* synthetic */ pc2<T> $nextFunction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$1(pc2<? extends T> pc2) {
        super(1);
        this.$nextFunction = pc2;
    }

    public final T invoke(T t) {
        vx2.m53591g(t, "it");
        return this.$nextFunction.invoke();
    }
}
