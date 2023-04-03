package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R9\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Lid0;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lcw4;", "scope", "Lr37;", "i", "(Lcw4;Lns0;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lns0;", "", "g", "Lfd2;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lfd2;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: id0 */
/* compiled from: Builders.kt */
public class id0<T> extends ChannelFlow<T> {

    /* renamed from: g */
    public final fd2<cw4<? super T>, ns0<? super r37>, Object> f38352g;

    public id0(fd2<? super cw4<? super T>, ? super ns0<? super r37>, ? extends Object> fd2, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f38352g = fd2;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m58900o(id0 id0, cw4 cw4, ns0 ns0) {
        Object invoke = id0.f38352g.invoke(cw4, ns0);
        if (invoke == wx2.m54101d()) {
            return invoke;
        }
        return r37.f33317a;
    }

    /* renamed from: i */
    public Object mo51899i(cw4<? super T> cw4, ns0<? super r37> ns0) {
        return m58900o(this, cw4, ns0);
    }

    public String toString() {
        return "block[" + this.f38352g + "] -> " + super.toString();
    }
}
