package p000;

import p018io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: qp3 */
/* compiled from: MaybeFilter */
public final class qp3<T> extends C6234m6<T, T> {

    /* renamed from: d */
    public final iu4<? super T> f33211d;

    /* renamed from: qp3$a */
    /* compiled from: MaybeFilter */
    public static final class C6419a<T> implements tp3<T>, th1 {

        /* renamed from: a */
        public final tp3<? super T> f33212a;

        /* renamed from: d */
        public final iu4<? super T> f33213d;

        /* renamed from: e */
        public th1 f33214e;

        public C6419a(tp3<? super T> tp3, iu4<? super T> iu4) {
            this.f33212a = tp3;
            this.f33213d = iu4;
        }

        public void dispose() {
            th1 th1 = this.f33214e;
            this.f33214e = DisposableHelper.DISPOSED;
            th1.dispose();
        }

        public void onComplete() {
            this.f33212a.onComplete();
        }

        public void onError(Throwable th) {
            this.f33212a.onError(th);
        }

        public void onSubscribe(th1 th1) {
            if (DisposableHelper.validate(this.f33214e, th1)) {
                this.f33214e = th1;
                this.f33212a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.f33213d.test(t)) {
                    this.f33212a.onSuccess(t);
                } else {
                    this.f33212a.onComplete();
                }
            } catch (Throwable th) {
                ou1.m49570a(th);
                this.f33212a.onError(th);
            }
        }
    }

    public qp3(up3<T> up3, iu4<? super T> iu4) {
        super(up3);
        this.f33211d = iu4;
    }

    /* renamed from: f */
    public void mo46449f(tp3<? super T> tp3) {
        this.f31521a.mo46446a(new C6419a(tp3, this.f33211d));
    }
}
