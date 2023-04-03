package p000;

import p018io.reactivex.disposables.C5978a;

/* renamed from: rp3 */
/* compiled from: MaybeJust */
public final class rp3<T> extends op3<T> implements ml5<T> {

    /* renamed from: a */
    public final T f33559a;

    public rp3(T t) {
        this.f33559a = t;
    }

    public T call() {
        return this.f33559a;
    }

    /* renamed from: f */
    public void mo46449f(tp3<? super T> tp3) {
        tp3.onSubscribe(C5978a.m45831a());
        tp3.onSuccess(this.f33559a);
    }
}
