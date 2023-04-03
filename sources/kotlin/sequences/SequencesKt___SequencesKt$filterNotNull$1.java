package kotlin.sequences;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u0001H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"<anonymous>", "", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: _Sequences.kt */
public final class SequencesKt___SequencesKt$filterNotNull$1 extends Lambda implements rc2<T, Boolean> {
    public static final SequencesKt___SequencesKt$filterNotNull$1 INSTANCE = new SequencesKt___SequencesKt$filterNotNull$1();

    public SequencesKt___SequencesKt$filterNotNull$1() {
        super(1);
    }

    public final Boolean invoke(T t) {
        return Boolean.valueOf(t == null);
    }
}
