package p018io.reactivex.internal.subscriptions;

/* renamed from: io.reactivex.internal.subscriptions.EmptySubscription */
public enum EmptySubscription implements r05<Object> {
    INSTANCE;

    public static void complete(nc6<?> nc6) {
        nc6.onSubscribe(INSTANCE);
        nc6.onComplete();
    }

    public static void error(Throwable th, nc6<?> nc6) {
        nc6.onSubscribe(INSTANCE);
        nc6.onError(th);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() {
        return null;
    }

    public void request(long j) {
        SubscriptionHelper.validate(j);
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
