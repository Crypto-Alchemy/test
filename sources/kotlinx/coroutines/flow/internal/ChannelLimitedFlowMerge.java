package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "j", "Lhu0;", "scope", "Lz75;", "n", "Lcw4;", "Lr37;", "i", "(Lcw4;Lns0;)Ljava/lang/Object;", "", "Lz42;", "g", "Ljava/lang/Iterable;", "flows", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Merge.kt */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {

    /* renamed from: g */
    public final Iterable<z42<T>> f40461g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: i */
    public Object mo51899i(cw4<? super T> cw4, ns0<? super r37> ns0) {
        gv5 gv5 = new gv5(cw4);
        for (z42<T> channelLimitedFlowMerge$collectTo$2$1 : this.f40461g) {
            y23 unused = d50.m56748b(cw4, (CoroutineContext) null, (CoroutineStart) null, new ChannelLimitedFlowMerge$collectTo$2$1(channelLimitedFlowMerge$collectTo$2$1, gv5, (ns0<? super ChannelLimitedFlowMerge$collectTo$2$1>) null), 3, (Object) null);
        }
        return r37.f33317a;
    }

    /* renamed from: j */
    public ChannelFlow<T> mo51900j(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.f40461g, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: n */
    public z75<T> mo51902n(hu0 hu0) {
        return uv4.m72983a(hu0, this.f40452a, this.f40453d, mo55665l());
    }

    public ChannelLimitedFlowMerge(Iterable<? extends z42<? extends T>> iterable, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f40461g = iterable;
    }
}
