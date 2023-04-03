package p000;

/* renamed from: nc6 */
/* compiled from: Subscriber */
public interface nc6<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(pc6 pc6);
}
