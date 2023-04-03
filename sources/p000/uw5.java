package p000;

import p018io.reactivex.internal.subscriptions.SubscriptionHelper;
import p018io.reactivex.internal.util.NotificationLite;

/* renamed from: uw5 */
/* compiled from: SerializedSubscriber */
public final class uw5<T> implements y52<T>, pc6 {

    /* renamed from: a */
    public final nc6<? super T> f34733a;

    /* renamed from: d */
    public final boolean f34734d;

    /* renamed from: e */
    public pc6 f34735e;

    /* renamed from: g */
    public boolean f34736g;

    /* renamed from: k */
    public C5927ho<Object> f34737k;

    /* renamed from: r */
    public volatile boolean f34738r;

    public uw5(nc6<? super T> nc6) {
        this(nc6, false);
    }

    /* renamed from: a */
    public void mo48535a() {
        C5927ho<Object> hoVar;
        do {
            synchronized (this) {
                hoVar = this.f34737k;
                if (hoVar == null) {
                    this.f34736g = false;
                    return;
                }
                this.f34737k = null;
            }
        } while (!hoVar.mo43335a(this.f34733a));
    }

    public void cancel() {
        this.f34735e.cancel();
    }

    public void onComplete() {
        if (!this.f34738r) {
            synchronized (this) {
                if (!this.f34738r) {
                    if (this.f34736g) {
                        C5927ho<Object> hoVar = this.f34737k;
                        if (hoVar == null) {
                            hoVar = new C5927ho<>(4);
                            this.f34737k = hoVar;
                        }
                        hoVar.mo43336b(NotificationLite.complete());
                        return;
                    }
                    this.f34738r = true;
                    this.f34736g = true;
                    this.f34733a.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p000.ti5.m52312m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f34733a.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f34738r
            if (r0 == 0) goto L_0x0008
            p000.ti5.m52312m(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f34738r     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f34736g     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f34738r = r1     // Catch:{ all -> 0x0044 }
            ho<java.lang.Object> r0 = r2.f34737k     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            ho r0 = new ho     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f34737k = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p018io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f34734d     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo43336b(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo43338d(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f34738r = r1     // Catch:{ all -> 0x0044 }
            r2.f34736g = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p000.ti5.m52312m(r3)
            return
        L_0x003e:
            nc6<? super T> r0 = r2.f34733a
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.uw5.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f34738r) {
            if (t == null) {
                this.f34735e.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f34738r) {
                    if (this.f34736g) {
                        C5927ho<Object> hoVar = this.f34737k;
                        if (hoVar == null) {
                            hoVar = new C5927ho<>(4);
                            this.f34737k = hoVar;
                        }
                        hoVar.mo43336b(NotificationLite.next(t));
                        return;
                    }
                    this.f34736g = true;
                    this.f34733a.onNext(t);
                    mo48535a();
                }
            }
        }
    }

    public void onSubscribe(pc6 pc6) {
        if (SubscriptionHelper.validate(this.f34735e, pc6)) {
            this.f34735e = pc6;
            this.f34733a.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.f34735e.request(j);
    }

    public uw5(nc6<? super T> nc6, boolean z) {
        this.f34733a = nc6;
        this.f34734d = z;
    }
}
