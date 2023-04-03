package p000;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, mo44877d2 = {"Lu76;", "T", "Lns0;", "Lju0;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/Result;", "result", "Lr37;", "resumeWith", "(Ljava/lang/Object;)V", "a", "Lns0;", "uCont", "Lkotlin/coroutines/CoroutineContext;", "d", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "getCallerFrame", "()Lju0;", "callerFrame", "<init>", "(Lns0;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* renamed from: u76 */
/* compiled from: ChannelFlow.kt */
public final class u76<T> implements ns0<T>, ju0 {

    /* renamed from: a */
    public final ns0<T> f44923a;

    /* renamed from: d */
    public final CoroutineContext f44924d;

    public u76(ns0<? super T> ns0, CoroutineContext coroutineContext) {
        this.f44923a = ns0;
        this.f44924d = coroutineContext;
    }

    public ju0 getCallerFrame() {
        ns0<T> ns0 = this.f44923a;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public CoroutineContext getContext() {
        return this.f44924d;
    }

    public void resumeWith(Object obj) {
        this.f44923a.resumeWith(obj);
    }
}
