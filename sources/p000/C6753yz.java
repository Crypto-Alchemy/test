package p000;

import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: yz */
/* compiled from: BasicFuseableConditionalSubscriber */
public abstract class C6753yz<T, R> implements mo0<T>, r05<R> {

    /* renamed from: a */
    public final mo0<? super R> f35963a;

    /* renamed from: d */
    public pc6 f35964d;

    /* renamed from: e */
    public r05<T> f35965e;

    /* renamed from: g */
    public boolean f35966g;

    /* renamed from: k */
    public int f35967k;

    public C6753yz(mo0<? super R> mo0) {
        this.f35963a = mo0;
    }

    /* renamed from: a */
    public void mo49762a() {
    }

    /* renamed from: c */
    public boolean mo49763c() {
        return true;
    }

    public void cancel() {
        this.f35964d.cancel();
    }

    public void clear() {
        this.f35965e.clear();
    }

    /* renamed from: d */
    public final void mo49764d(Throwable th) {
        ou1.m49570a(th);
        this.f35964d.cancel();
        onError(th);
    }

    /* renamed from: e */
    public final int mo49765e(int i) {
        r05<T> r05 = this.f35965e;
        if (r05 == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = r05.requestFusion(i);
        if (requestFusion != 0) {
            this.f35967k = requestFusion;
        }
        return requestFusion;
    }

    public boolean isEmpty() {
        return this.f35965e.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f35966g) {
            this.f35966g = true;
            this.f35963a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f35966g) {
            ti5.m52312m(th);
            return;
        }
        this.f35966g = true;
        this.f35963a.onError(th);
    }

    public final void onSubscribe(pc6 pc6) {
        if (SubscriptionHelper.validate(this.f35964d, pc6)) {
            this.f35964d = pc6;
            if (pc6 instanceof r05) {
                this.f35965e = (r05) pc6;
            }
            if (mo49763c()) {
                this.f35963a.onSubscribe(this);
                mo49762a();
            }
        }
    }

    public void request(long j) {
        this.f35964d.request(j);
    }
}
