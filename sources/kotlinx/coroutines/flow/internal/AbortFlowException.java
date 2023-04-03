package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, mo44877d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "fillInStackTrace", "La52;", "owner", "La52;", "<init>", "(La52;)V", "kotlinx-coroutines-core"}, mo44878k = 1, mo44879mv = {1, 6, 0})
/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {
    public final transient a52<?> owner;

    public AbortFlowException(a52<?> a52) {
        super("Flow was aborted, no more elements needed");
        this.owner = a52;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
