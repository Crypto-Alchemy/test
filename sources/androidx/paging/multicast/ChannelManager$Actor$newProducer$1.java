package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"T", "Landroidx/paging/multicast/ChannelManager$b;", "p1", "Lr37;", "invoke", "(Landroidx/paging/multicast/ChannelManager$b;Lns0;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 4, 2})
/* compiled from: ChannelManager.kt */
public final /* synthetic */ class ChannelManager$Actor$newProducer$1 extends FunctionReferenceImpl implements fd2<ChannelManager.C1194b<T>, ns0<? super r37>, Object> {
    public ChannelManager$Actor$newProducer$1(ChannelManager.Actor actor) {
        super(2, actor, ChannelManager.Actor.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(ChannelManager.C1194b<T> bVar, ns0<? super r37> ns0) {
        return ((ChannelManager.Actor) this.receiver).mo8803g(bVar, ns0);
    }
}
