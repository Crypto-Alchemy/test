package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.ps0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H¤@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\bJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J)\u0010\u0012\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0004X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "La52;", "collector", "Lr37;", "r", "(La52;Lns0;)Ljava/lang/Object;", "Lcw4;", "scope", "i", "(Lcw4;Lns0;)Ljava/lang/Object;", "a", "", "toString", "Lkotlin/coroutines/CoroutineContext;", "newContext", "q", "(La52;Lkotlin/coroutines/CoroutineContext;Lns0;)Ljava/lang/Object;", "Lz42;", "g", "Lz42;", "flow", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lz42;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ChannelFlow.kt */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {

    /* renamed from: g */
    public final z42<S> f40455g;

    public ChannelFlowOperator(z42<? extends S> z42, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f40455g = z42;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m63452o(ChannelFlowOperator channelFlowOperator, a52 a52, ns0 ns0) {
        if (channelFlowOperator.f40453d == -3) {
            CoroutineContext context = ns0.getContext();
            CoroutineContext plus = context.plus(channelFlowOperator.f40452a);
            if (vx2.m53586b(plus, context)) {
                Object r = channelFlowOperator.mo55670r(a52, ns0);
                if (r == wx2.m54101d()) {
                    return r;
                }
                return r37.f33317a;
            }
            ps0.C6371b bVar = ps0.f32794h;
            if (vx2.m53586b(plus.get(bVar), context.get(bVar))) {
                Object q = channelFlowOperator.mo55669q(a52, plus, ns0);
                if (q == wx2.m54101d()) {
                    return q;
                }
                return r37.f33317a;
            }
        }
        Object a = super.mo8646a(a52, ns0);
        if (a == wx2.m54101d()) {
            return a;
        }
        return r37.f33317a;
    }

    /* renamed from: p */
    public static /* synthetic */ Object m63453p(ChannelFlowOperator channelFlowOperator, cw4 cw4, ns0 ns0) {
        Object r = channelFlowOperator.mo55670r(new gv5(cw4), ns0);
        if (r == wx2.m54101d()) {
            return r;
        }
        return r37.f33317a;
    }

    /* renamed from: a */
    public Object mo8646a(a52<? super T> a52, ns0<? super r37> ns0) {
        return m63452o(this, a52, ns0);
    }

    /* renamed from: i */
    public Object mo51899i(cw4<? super T> cw4, ns0<? super r37> ns0) {
        return m63453p(this, cw4, ns0);
    }

    /* renamed from: q */
    public final Object mo55669q(a52<? super T> a52, CoroutineContext coroutineContext, ns0<? super r37> ns0) {
        Object c = kd0.m59741c(coroutineContext, kd0.m59742d(a52, ns0.getContext()), (Object) null, new ChannelFlowOperator$collectWithContextUndispatched$2(this, (ns0<? super ChannelFlowOperator$collectWithContextUndispatched$2>) null), ns0, 4, (Object) null);
        if (c == wx2.m54101d()) {
            return c;
        }
        return r37.f33317a;
    }

    /* renamed from: r */
    public abstract Object mo55670r(a52<? super T> a52, ns0<? super r37> ns0);

    public String toString() {
        return this.f40455g + " -> " + super.toString();
    }
}
