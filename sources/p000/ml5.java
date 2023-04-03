package p000;

import java.util.concurrent.Callable;

/* renamed from: ml5 */
/* compiled from: ScalarCallable */
public interface ml5<T> extends Callable<T> {
    T call();
}
