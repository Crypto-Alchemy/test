package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$generateSequence$2 extends Lambda implements pc2<T> {
    public final /* synthetic */ T $seed;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$generateSequence$2(T t) {
        super(0);
        this.$seed = t;
    }

    public final T invoke() {
        return this.$seed;
    }
}
