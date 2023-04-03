package androidx.paging;

import androidx.paging.SingleRunner;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, mo44877d2 = {"", "priority", "Ly23;", "job", "Lns0;", "", "continuation", "", "tryEnqueue"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.SingleRunner$Holder", mo48632f = "SingleRunner.kt", mo48633l = {129, 100}, mo48634m = "tryEnqueue")
/* compiled from: SingleRunner.kt */
public final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SingleRunner.Holder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, ns0 ns0) {
        super(ns0);
        this.this$0 = holder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8757b(0, (y23) null, this);
    }
}
