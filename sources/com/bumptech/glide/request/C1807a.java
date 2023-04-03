package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.a */
/* compiled from: ErrorRequestCoordinator */
public final class C1807a implements RequestCoordinator, ae5 {

    /* renamed from: a */
    public final Object f9014a;

    /* renamed from: b */
    public final RequestCoordinator f9015b;

    /* renamed from: c */
    public volatile ae5 f9016c;

    /* renamed from: d */
    public volatile ae5 f9017d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f9018e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f9019f;

    public C1807a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f9018e = requestState;
        this.f9019f = requestState;
        this.f9014a = obj;
        this.f9015b = requestCoordinator;
    }

    /* renamed from: a */
    public boolean mo12654a(ae5 ae5) {
        boolean z;
        synchronized (this.f9014a) {
            if (!mo12685m() || !mo12684l(ae5)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12655b(p000.ae5 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9014a
            monitor-enter(r0)
            ae5 r1 = r2.f9017d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f9018e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f9019f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f9019f = r1     // Catch:{ all -> 0x002b }
            ae5 r3 = r2.f9017d     // Catch:{ all -> 0x002b }
            r3.mo178k()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002b }
            r2.f9019f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f9015b     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo12655b(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C1807a.mo12655b(ae5):void");
    }

    /* renamed from: c */
    public void mo171c() {
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = this.f9018e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f9018e = RequestCoordinator.RequestState.PAUSED;
                this.f9016c.mo171c();
            }
            if (this.f9019f == requestState2) {
                this.f9019f = RequestCoordinator.RequestState.PAUSED;
                this.f9017d.mo171c();
            }
        }
    }

    public void clear() {
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f9018e = requestState;
            this.f9016c.clear();
            if (this.f9019f != requestState) {
                this.f9019f = requestState;
                this.f9017d.clear();
            }
        }
    }

    /* renamed from: d */
    public boolean mo12656d() {
        boolean z;
        synchronized (this.f9014a) {
            if (!this.f9016c.mo173d()) {
                if (!this.f9017d.mo173d()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    public void mo12657e(ae5 ae5) {
        synchronized (this.f9014a) {
            if (ae5.equals(this.f9016c)) {
                this.f9018e = RequestCoordinator.RequestState.SUCCESS;
            } else if (ae5.equals(this.f9017d)) {
                this.f9019f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.f9015b;
            if (requestCoordinator != null) {
                requestCoordinator.mo12657e(this);
            }
        }
    }

    /* renamed from: f */
    public boolean mo174f() {
        boolean z;
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = this.f9018e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            if (requestState == requestState2 && this.f9019f == requestState2) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public boolean mo175g() {
        boolean z;
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = this.f9018e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            if (requestState != requestState2) {
                if (this.f9019f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f9014a) {
            RequestCoordinator requestCoordinator2 = this.f9015b;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    /* renamed from: h */
    public boolean mo176h(ae5 ae5) {
        if (!(ae5 instanceof C1807a)) {
            return false;
        }
        C1807a aVar = (C1807a) ae5;
        if (!this.f9016c.mo176h(aVar.f9016c) || !this.f9017d.mo176h(aVar.f9017d)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo12659i(ae5 ae5) {
        boolean z;
        synchronized (this.f9014a) {
            if (!mo12686n() || !mo12684l(ae5)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = this.f9018e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                if (this.f9019f != requestState2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo12660j(ae5 ae5) {
        boolean z;
        synchronized (this.f9014a) {
            if (!mo12687o() || !mo12684l(ae5)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public void mo178k() {
        synchronized (this.f9014a) {
            RequestCoordinator.RequestState requestState = this.f9018e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f9018e = requestState2;
                this.f9016c.mo178k();
            }
        }
    }

    /* renamed from: l */
    public final boolean mo12684l(ae5 ae5) {
        if (ae5.equals(this.f9016c) || (this.f9018e == RequestCoordinator.RequestState.FAILED && ae5.equals(this.f9017d))) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo12685m() {
        RequestCoordinator requestCoordinator = this.f9015b;
        if (requestCoordinator == null || requestCoordinator.mo12654a(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo12686n() {
        RequestCoordinator requestCoordinator = this.f9015b;
        if (requestCoordinator == null || requestCoordinator.mo12659i(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final boolean mo12687o() {
        RequestCoordinator requestCoordinator = this.f9015b;
        if (requestCoordinator == null || requestCoordinator.mo12660j(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public void mo12688p(ae5 ae5, ae5 ae52) {
        this.f9016c = ae5;
        this.f9017d = ae52;
    }
}
