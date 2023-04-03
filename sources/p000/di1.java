package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: di1 */
/* compiled from: DisposeOnCancel */
public final class di1 implements Future<Object> {

    /* renamed from: a */
    public final th1 f28193a;

    public di1(th1 th1) {
        this.f28193a = th1;
    }

    public boolean cancel(boolean z) {
        this.f28193a.dispose();
        return false;
    }

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }
}
