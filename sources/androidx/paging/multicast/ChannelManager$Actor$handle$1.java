package androidx.paging.multicast;

import androidx.paging.multicast.ChannelManager;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, mo44877d2 = {"T", "Landroidx/paging/multicast/ChannelManager$b;", "msg", "Lns0;", "Lr37;", "continuation", "", "handle"}, mo44878k = 3, mo44879mv = {1, 4, 2})
@v21(mo48631c = "androidx.paging.multicast.ChannelManager$Actor", mo48632f = "ChannelManager.kt", mo48633l = {103, 104, 105}, mo48634m = "handle")
/* compiled from: ChannelManager.kt */
public final class ChannelManager$Actor$handle$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ChannelManager.Actor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelManager$Actor$handle$1(ChannelManager.Actor actor, ns0 ns0) {
        super(ns0);
        this.this$0 = actor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo8766e((ChannelManager.C1194b) null, this);
    }
}
