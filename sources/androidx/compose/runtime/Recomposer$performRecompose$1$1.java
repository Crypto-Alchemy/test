package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer$performRecompose$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ kt0 $composition;
    public final /* synthetic */ fq2<Object> $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(fq2<Object> fq2, kt0 kt0) {
        super(0);
        this.$modifiedValues = fq2;
        this.$composition = kt0;
    }

    public final void invoke() {
        fq2<Object> fq2 = this.$modifiedValues;
        kt0 kt0 = this.$composition;
        int size = fq2.size();
        for (int i = 0; i < size; i++) {
            kt0.mo11759t(fq2.get(i));
        }
    }
}
