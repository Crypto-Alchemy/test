package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@"}, mo44877d2 = {"Ly23;", "job", "Lns0;", "Lr37;", "continuation", "", "onFinish"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SingleRunner$Holder", mo48632f = "SingleRunner.kt", mo48633l = {140}, mo48634m = "onFinish")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleRunner.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$onFinish$1(SingleRunner.Holder holder, ns0 ns0) {
        super(ns0);
        this.this$0 = holder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8756a((y23) null, this);
    }
}
