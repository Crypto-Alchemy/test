package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016J!\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lld0;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "j", "Lz42;", "k", "La52;", "collector", "Lr37;", "r", "(La52;Lns0;)Ljava/lang/Object;", "flow", "<init>", "(Lz42;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: ld0 */
/* compiled from: ChannelFlow.kt */
public final class ld0<T> extends ChannelFlowOperator<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ld0(z42 z42, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z42, (i2 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: j */
    public ChannelFlow<T> mo51900j(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ld0(this.f40455g, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: k */
    public z42<T> mo51901k() {
        return this.f40455g;
    }

    /* renamed from: r */
    public Object mo55670r(a52<? super T> a52, ns0<? super r37> ns0) {
        Object a = this.f40455g.mo8646a(a52, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }

    public ld0(z42<? extends T> z42, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(z42, coroutineContext, i, bufferOverflow);
    }
}
