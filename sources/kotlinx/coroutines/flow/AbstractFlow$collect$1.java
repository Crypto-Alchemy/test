package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.flow.AbstractFlow", mo48632f = "Flow.kt", mo48633l = {230}, mo48634m = "collect")
/* compiled from: Flow.kt */
public final class AbstractFlow$collect$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, ns0<? super AbstractFlow$collect$1> ns0) {
        super(ns0);
        this.this$0 = abstractFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8646a((a52) null, this);
    }
}
