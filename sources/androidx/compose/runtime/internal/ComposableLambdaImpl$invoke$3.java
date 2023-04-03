package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"Lnn0;", "nc", "", "<anonymous parameter 1>", "Lr37;", "invoke", "(Lnn0;I)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ComposableLambda.jvm.kt */
public final class ComposableLambdaImpl$invoke$3 extends Lambda implements fd2<nn0, Integer, r37> {
    public final /* synthetic */ int $changed;
    public final /* synthetic */ Object $p1;
    public final /* synthetic */ Object $p2;
    public final /* synthetic */ Object $p3;
    public final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$3(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((nn0) obj, ((Number) obj2).intValue());
        return r37.f33317a;
    }

    public final void invoke(nn0 nn0, int i) {
        vx2.m53591g(nn0, "nc");
        this.this$0.mo3134d(this.$p1, this.$p2, this.$p3, nn0, this.$changed | 1);
    }
}
