package p000;

/* renamed from: of4 */
/* compiled from: Observer */
public interface of4<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(th1 th1);
}
