package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 6, 0}, mo44881xi = 48)
@v21(mo48631c = "kotlinx.coroutines.channels.AbstractChannel", mo48632f = "AbstractChannel.kt", mo48633l = {633}, mo48634m = "receiveCatching-JP2dKIU")
/* compiled from: AbstractChannel.kt */
public final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, ns0<? super AbstractChannel$receiveCatching$1> ns0) {
        super(ns0);
        this.this$0 = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object D = this.this$0.mo52175D(this);
        return D == wx2.m54101d() ? D : qd0.m71223b(D);
    }
}
