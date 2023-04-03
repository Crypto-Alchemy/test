package p000;

import java.util.concurrent.atomic.AtomicInteger;
import p018io.reactivex.internal.util.AtomicThrowable;

/* renamed from: qk2 */
/* compiled from: HalfSerializer */
public final class qk2 {
    /* renamed from: a */
    public static void m50613a(nc6<?> nc6, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate != null) {
                nc6.onError(terminate);
            } else {
                nc6.onComplete();
            }
        }
    }

    /* renamed from: b */
    public static void m50614b(nc6<?> nc6, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (!atomicThrowable.addThrowable(th)) {
            ti5.m52312m(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            nc6.onError(atomicThrowable.terminate());
        }
    }

    /* renamed from: c */
    public static <T> void m50615c(nc6<? super T> nc6, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            nc6.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = atomicThrowable.terminate();
                if (terminate != null) {
                    nc6.onError(terminate);
                } else {
                    nc6.onComplete();
                }
            }
        }
    }
}
