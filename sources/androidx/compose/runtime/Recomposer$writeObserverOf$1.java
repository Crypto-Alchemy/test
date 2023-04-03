package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "value", "Lr37;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: Recomposer.kt */
public final class Recomposer$writeObserverOf$1 extends Lambda implements rc2<Object, r37> {
    public final /* synthetic */ kt0 $composition;
    public final /* synthetic */ fq2<Object> $modifiedValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(kt0 kt0, fq2<Object> fq2) {
        super(1);
        this.$composition = kt0;
        this.$modifiedValues = fq2;
    }

    public final void invoke(Object obj) {
        vx2.m53591g(obj, "value");
        this.$composition.mo11759t(obj);
        fq2<Object> fq2 = this.$modifiedValues;
        if (fq2 != null) {
            fq2.add(obj);
        }
    }
}
