package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo44877d2 = {"", "priority", "Lkotlin/Function1;", "Lns0;", "Lr37;", "", "block", "continuation", "runInIsolation"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SingleRunner", mo48632f = "SingleRunner.kt", mo48633l = {49}, mo48634m = "runInIsolation")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleRunner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(SingleRunner singleRunner, ns0 ns0) {
        super(ns0);
        this.this$0 = singleRunner;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8754b(0, (rc2<? super ns0<? super r37>, ? extends Object>) null, this);
    }
}
