package p000;

/* renamed from: tp3 */
/* compiled from: MaybeObserver */
public interface tp3<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(th1 th1);

    void onSuccess(T t);
}
