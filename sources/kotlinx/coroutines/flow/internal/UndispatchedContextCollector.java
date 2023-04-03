package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR3\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", "T", "La52;", "value", "Lr37;", "emit", "(Ljava/lang/Object;Lns0;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "emitContext", "", "d", "Ljava/lang/Object;", "countOrElement", "Lkotlin/Function2;", "Lns0;", "e", "Lfd2;", "emitRef", "downstream", "<init>", "(La52;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: ChannelFlow.kt */
public final class UndispatchedContextCollector<T> implements a52<T> {

    /* renamed from: a */
    public final CoroutineContext f40466a;

    /* renamed from: d */
    public final Object f40467d;

    /* renamed from: e */
    public final fd2<T, ns0<? super r37>, Object> f40468e;

    public UndispatchedContextCollector(a52<? super T> a52, CoroutineContext coroutineContext) {
        this.f40466a = coroutineContext;
        this.f40467d = ThreadContextKt.m63496b(coroutineContext);
        this.f40468e = new UndispatchedContextCollector$emitRef$1(a52, (ns0<? super UndispatchedContextCollector$emitRef$1>) null);
    }

    public Object emit(T t, ns0<? super r37> ns0) {
        Object b = kd0.m59740b(this.f40466a, t, this.f40467d, this.f40468e, ns0);
        if (b == wx2.m54101d()) {
            return b;
        }
        return r37.f33317a;
    }
}
