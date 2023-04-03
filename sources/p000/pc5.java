package p000;

import java.util.concurrent.Callable;
import java8.util.concurrent.CompletableFuture;

/* renamed from: pc5 */
/* compiled from: RemoteCall */
public class pc5<T> {
    private Callable<T> callable;

    public pc5(Callable<T> callable2) {
        this.callable = callable2;
    }

    public g52<T> flowable() {
        return g52.m44524B(new oc5(this));
    }

    public T send() throws Exception {
        return this.callable.call();
    }

    public CompletableFuture<T> sendAsync() {
        return C9649yr.run(new oc5(this));
    }
}
