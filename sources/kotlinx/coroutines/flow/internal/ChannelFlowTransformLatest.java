package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.channels.BufferOverflow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bf\u0012.\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R?\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00118\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "j", "La52;", "collector", "Lr37;", "r", "(La52;Lns0;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lns0;", "", "k", "Lid2;", "transform", "Lz42;", "flow", "<init>", "(Lid2;Lz42;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {

    /* renamed from: k */
    public final id2<a52<? super R>, T, ns0<? super r37>, Object> f40456k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChannelFlowTransformLatest(id2 id2, z42 z42, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(id2, z42, (i2 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* renamed from: j */
    public ChannelFlow<R> mo51900j(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f40456k, this.f40455g, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: r */
    public Object mo55670r(a52<? super R> a52, ns0<? super r37> ns0) {
        Object e = iu0.m59115e(new ChannelFlowTransformLatest$flowCollect$3(this, a52, (ns0<? super ChannelFlowTransformLatest$flowCollect$3>) null), ns0);
        if (e == wx2.m54101d()) {
            return e;
        }
        return r37.f33317a;
    }

    public ChannelFlowTransformLatest(id2<? super a52<? super R>, ? super T, ? super ns0<? super r37>, ? extends Object> id2, z42<? extends T> z42, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(z42, coroutineContext, i, bufferOverflow);
        this.f40456k = id2;
    }
}
