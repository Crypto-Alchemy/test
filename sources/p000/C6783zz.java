package p000;

import p018io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: zz */
/* compiled from: BasicFuseableSubscriber */
public abstract class C6783zz<T, R> implements y52<T>, r05<R> {

    /* renamed from: a */
    public final nc6<? super R> f36319a;

    /* renamed from: d */
    public pc6 f36320d;

    /* renamed from: e */
    public r05<T> f36321e;

    /* renamed from: g */
    public boolean f36322g;

    /* renamed from: k */
    public int f36323k;

    public C6783zz(nc6<? super R> nc6) {
        this.f36319a = nc6;
    }

    /* renamed from: a */
    public void mo50006a() {
    }

    /* renamed from: c */
    public boolean mo50007c() {
        return true;
    }

    public void cancel() {
        this.f36320d.cancel();
    }

    public void clear() {
        this.f36321e.clear();
    }

    /* renamed from: d */
    public final void mo50008d(Throwable th) {
        ou1.m49570a(th);
        this.f36320d.cancel();
        onError(th);
    }

    /* renamed from: e */
    public final int mo50009e(int i) {
        r05<T> r05 = this.f36321e;
        if (r05 == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = r05.requestFusion(i);
        if (requestFusion != 0) {
            this.f36323k = requestFusion;
        }
        return requestFusion;
    }

    public boolean isEmpty() {
        return this.f36321e.isEmpty();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onComplete() {
        if (!this.f36322g) {
            this.f36322g = true;
            this.f36319a.onComplete();
        }
    }

    public void onError(Throwable th) {
        if (this.f36322g) {
            ti5.m52312m(th);
            return;
        }
        this.f36322g = true;
        this.f36319a.onError(th);
    }

    public final void onSubscribe(pc6 pc6) {
        if (SubscriptionHelper.validate(this.f36320d, pc6)) {
            this.f36320d = pc6;
            if (pc6 instanceof r05) {
                this.f36321e = (r05) pc6;
            }
            if (mo50007c()) {
                this.f36319a.onSubscribe(this);
                mo50006a();
            }
        }
    }

    public void request(long j) {
        this.f36320d.request(j);
    }
}
