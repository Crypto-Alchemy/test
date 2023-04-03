package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo44877d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lns0;", "", "Lju0;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "Lr37;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lns0;", "getCompletion", "()Lns0;", "getCallerFrame", "()Lju0;", "callerFrame", "<init>", "(Lns0;)V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ContinuationImpl.kt */
public abstract class BaseContinuationImpl implements ns0<Object>, ju0, Serializable {
    private final ns0<Object> completion;

    public BaseContinuationImpl(ns0<Object> ns0) {
        this.completion = ns0;
    }

    public ns0<r37> create(ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public ju0 getCallerFrame() {
        ns0<Object> ns0 = this.completion;
        if (ns0 instanceof ju0) {
            return (ju0) ns0;
        }
        return null;
    }

    public final ns0<Object> getCompletion() {
        return this.completion;
    }

    public abstract /* synthetic */ CoroutineContext getContext();

    public StackTraceElement getStackTraceElement() {
        return w21.m53675d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        ns0 ns0 = this;
        while (true) {
            a31.m31655b(ns0);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) ns0;
            ns0 ns02 = baseContinuationImpl.completion;
            vx2.m53588d(ns02);
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != wx2.m54101d()) {
                    obj = Result.m75635constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (ns02 instanceof BaseContinuationImpl) {
                        ns0 = ns02;
                    } else {
                        ns02.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.C6167a aVar = Result.Companion;
                obj = Result.m75635constructorimpl(hg5.m45198a(th));
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public ns0<r37> create(Object obj, ns0<?> ns0) {
        vx2.m53591g(ns0, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
