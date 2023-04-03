package p000;

import p018io.reactivex.internal.util.NotificationLite;

/* renamed from: tw5 */
/* compiled from: SerializedProcessor */
public final class tw5<T> extends v52<T> {

    /* renamed from: d */
    public final v52<T> f34395d;

    /* renamed from: e */
    public boolean f34396e;

    /* renamed from: g */
    public C5927ho<Object> f34397g;

    /* renamed from: k */
    public volatile boolean f34398k;

    public tw5(v52<T> v52) {
        this.f34395d = v52;
    }

    /* renamed from: K */
    public void mo42760K(nc6<? super T> nc6) {
        this.f34395d.mo40232a(nc6);
    }

    /* renamed from: S */
    public void mo48238S() {
        C5927ho<Object> hoVar;
        while (true) {
            synchronized (this) {
                hoVar = this.f34397g;
                if (hoVar == null) {
                    this.f34396e = false;
                    return;
                }
                this.f34397g = null;
            }
            hoVar.mo43335a(this.f34395d);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f34398k) {
            synchronized (this) {
                if (!this.f34398k) {
                    this.f34398k = true;
                    if (this.f34396e) {
                        C5927ho<Object> hoVar = this.f34397g;
                        if (hoVar == null) {
                            hoVar = new C5927ho<>(4);
                            this.f34397g = hoVar;
                        }
                        hoVar.mo43336b(NotificationLite.complete());
                        return;
                    }
                    this.f34396e = true;
                    this.f34395d.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p000.ti5.m52312m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f34395d.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f34398k
            if (r0 == 0) goto L_0x0008
            p000.ti5.m52312m(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f34398k     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x002e
        L_0x000f:
            r2.f34398k = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f34396e     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            ho<java.lang.Object> r0 = r2.f34397g     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0021
            ho r0 = new ho     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f34397g = r0     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.lang.Object r3 = p018io.reactivex.internal.util.NotificationLite.error(r3)     // Catch:{ all -> 0x003b }
            r0.mo43338d(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002a:
            r0 = 0
            r2.f34396e = r1     // Catch:{ all -> 0x003b }
            r1 = r0
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0035
            p000.ti5.m52312m(r3)
            return
        L_0x0035:
            v52<T> r0 = r2.f34395d
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tw5.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f34398k) {
            synchronized (this) {
                if (!this.f34398k) {
                    if (this.f34396e) {
                        C5927ho<Object> hoVar = this.f34397g;
                        if (hoVar == null) {
                            hoVar = new C5927ho<>(4);
                            this.f34397g = hoVar;
                        }
                        hoVar.mo43336b(NotificationLite.next(t));
                        return;
                    }
                    this.f34396e = true;
                    this.f34395d.onNext(t);
                    mo48238S();
                }
            }
        }
    }

    public void onSubscribe(pc6 pc6) {
        boolean z = true;
        if (!this.f34398k) {
            synchronized (this) {
                if (!this.f34398k) {
                    if (this.f34396e) {
                        C5927ho<Object> hoVar = this.f34397g;
                        if (hoVar == null) {
                            hoVar = new C5927ho<>(4);
                            this.f34397g = hoVar;
                        }
                        hoVar.mo43336b(NotificationLite.subscription(pc6));
                        return;
                    }
                    this.f34396e = true;
                    z = false;
                }
            }
        }
        if (z) {
            pc6.cancel();
            return;
        }
        this.f34395d.onSubscribe(pc6);
        mo48238S();
    }
}
