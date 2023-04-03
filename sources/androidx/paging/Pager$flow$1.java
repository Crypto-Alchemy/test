package androidx.paging;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "Key", "Value", "Ldl4;", "invoke", "(Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* compiled from: Pager.kt */
public final /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements rc2<ns0<? super dl4<Key, Value>>, Object> {
    public Pager$flow$1(pc2 pc2) {
        super(1, pc2, SuspendingPagingSourceFactory.class, "create", "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(ns0<? super dl4<Key, Value>> ns0) {
        return ((SuspendingPagingSourceFactory) ((pc2) this.receiver)).mo8758b(ns0);
    }
}
