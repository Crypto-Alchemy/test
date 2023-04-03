package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlowImpl;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, mo44877d2 = {"T", "value", "Lu04;", "a", "(Ljava/lang/Object;)Lu04;", "Lt86;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lz42;", "d", "Lxj6;", "Lxj6;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: u86 */
/* compiled from: StateFlow.kt */
public final class u86 {

    /* renamed from: a */
    public static final xj6 f44929a = new xj6("NONE");

    /* renamed from: b */
    public static final xj6 f44930b = new xj6("PENDING");

    /* renamed from: a */
    public static final <T> u04<T> m72658a(T t) {
        if (t == null) {
            t = yb4.f46149a;
        }
        return new StateFlowImpl(t);
    }

    /* renamed from: d */
    public static final <T> z42<T> m72661d(t86<? extends T> t86, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return t86;
        }
        return yz5.m74706e(t86, coroutineContext, i, bufferOverflow);
    }
}
