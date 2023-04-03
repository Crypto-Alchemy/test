package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: _Sequences.kt */
public /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements rc2<hw5<? extends R>, Iterator<? extends R>> {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, hw5.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    public final Iterator<R> invoke(hw5<? extends R> hw5) {
        vx2.m53591g(hw5, "p0");
        return hw5.iterator();
    }
}
