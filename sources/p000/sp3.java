package p000;

import p018io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: sp3 */
/* compiled from: MaybeMap */
public final class sp3<T, R> extends C6234m6<T, R> {

    /* renamed from: d */
    public final jd2<? super T, ? extends R> f33979d;

    /* renamed from: sp3$a */
    /* compiled from: MaybeMap */
    public static final class C6498a<T, R> implements tp3<T>, th1 {

        /* renamed from: a */
        public final tp3<? super R> f33980a;

        /* renamed from: d */
        public final jd2<? super T, ? extends R> f33981d;

        /* renamed from: e */
        public th1 f33982e;

        public C6498a(tp3<? super R> tp3, jd2<? super T, ? extends R> jd2) {
            this.f33980a = tp3;
            this.f33981d = jd2;
        }

        public void dispose() {
            th1 th1 = this.f33982e;
            this.f33982e = DisposableHelper.DISPOSED;
            th1.dispose();
        }

        public void onComplete() {
            this.f33980a.onComplete();
        }

        public void onError(Throwable th) {
            this.f33980a.onError(th);
        }

        public void onSubscribe(th1 th1) {
            if (DisposableHelper.validate(this.f33982e, th1)) {
                this.f33982e = th1;
                this.f33980a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                this.f33980a.onSuccess(af4.m31828d(this.f33981d.apply(t), "The mapper returned a null item"));
            } catch (Throwable th) {
                ou1.m49570a(th);
                this.f33980a.onError(th);
            }
        }
    }

    public sp3(up3<T> up3, jd2<? super T, ? extends R> jd2) {
        super(up3);
        this.f33979d = jd2;
    }

    /* renamed from: f */
    public void mo46449f(tp3<? super R> tp3) {
        this.f31521a.mo46446a(new C6498a(tp3, this.f33979d));
    }
}
