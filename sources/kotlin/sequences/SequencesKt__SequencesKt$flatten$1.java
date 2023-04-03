package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "Lhw5;", "it", "", "invoke", "(Lhw5;)Ljava/util/Iterator;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Sequences.kt */
public final class SequencesKt__SequencesKt$flatten$1 extends Lambda implements rc2<hw5<? extends T>, Iterator<? extends T>> {
    public static final SequencesKt__SequencesKt$flatten$1 INSTANCE = new SequencesKt__SequencesKt$flatten$1();

    public SequencesKt__SequencesKt$flatten$1() {
        super(1);
    }

    public final Iterator<T> invoke(hw5<? extends T> hw5) {
        vx2.m53591g(hw5, "it");
        return hw5.iterator();
    }
}
