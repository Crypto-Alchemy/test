package p018io.reactivex.internal.disposables;

/* renamed from: io.reactivex.internal.disposables.EmptyDisposable */
public enum EmptyDisposable implements q05, th1 {
    INSTANCE,
    NEVER;

    public static void complete(of4<?> of4) {
        of4.onSubscribe(INSTANCE);
        of4.onComplete();
    }

    public static void error(Throwable th, of4<?> of4) {
        of4.onSubscribe(INSTANCE);
        of4.onError(th);
    }

    public void clear() {
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public Object poll() throws Exception {
        return null;
    }

    public int requestFusion(int i) {
        return i & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(tp3<?> tp3) {
        tp3.onSubscribe(INSTANCE);
        tp3.onComplete();
    }

    public static void error(Throwable th, im0 im0) {
        im0.onSubscribe(INSTANCE);
        im0.onError(th);
    }

    public static void complete(im0 im0) {
        im0.onSubscribe(INSTANCE);
        im0.onComplete();
    }

    public static void error(Throwable th, l36<?> l36) {
        l36.onSubscribe(INSTANCE);
        l36.onError(th);
    }

    public static void error(Throwable th, tp3<?> tp3) {
        tp3.onSubscribe(INSTANCE);
        tp3.onError(th);
    }
}
