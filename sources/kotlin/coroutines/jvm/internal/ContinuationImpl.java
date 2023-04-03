package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lns0;", "", "intercepted", "Lr37;", "releaseIntercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lns0;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "completion", "<init>", "(Lns0;Lkotlin/coroutines/CoroutineContext;)V", "(Lns0;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ContinuationImpl.kt */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final CoroutineContext _context;
    private transient ns0<Object> intercepted;

    public ContinuationImpl(ns0<Object> ns0, CoroutineContext coroutineContext) {
        super(ns0);
        this._context = coroutineContext;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        vx2.m53588d(coroutineContext);
        return coroutineContext;
    }

    public final ns0<Object> intercepted() {
        ns0<Object> ns0 = this.intercepted;
        if (ns0 == null) {
            ps0 ps0 = (ps0) getContext().get(ps0.f32794h);
            if (ps0 == null || (ns0 = ps0.mo46864x(this)) == null) {
                ns0 = this;
            }
            this.intercepted = ns0;
        }
        return ns0;
    }

    public void releaseIntercepted() {
        ns0<Object> ns0 = this.intercepted;
        if (!(ns0 == null || ns0 == this)) {
            CoroutineContext.C6188a aVar = getContext().get(ps0.f32794h);
            vx2.m53588d(aVar);
            ((ps0) aVar).mo46863s(ns0);
        }
        this.intercepted = km0.f30925a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(ns0<Object> ns0) {
        this(ns0, ns0 != null ? ns0.getContext() : null);
    }
}
