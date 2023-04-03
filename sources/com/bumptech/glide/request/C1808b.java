package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* renamed from: com.bumptech.glide.request.b */
/* compiled from: ThumbnailRequestCoordinator */
public class C1808b implements RequestCoordinator, ae5 {

    /* renamed from: a */
    public final RequestCoordinator f9020a;

    /* renamed from: b */
    public final Object f9021b;

    /* renamed from: c */
    public volatile ae5 f9022c;

    /* renamed from: d */
    public volatile ae5 f9023d;

    /* renamed from: e */
    public RequestCoordinator.RequestState f9024e;

    /* renamed from: f */
    public RequestCoordinator.RequestState f9025f;

    /* renamed from: g */
    public boolean f9026g;

    public C1808b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f9024e = requestState;
        this.f9025f = requestState;
        this.f9021b = obj;
        this.f9020a = requestCoordinator;
    }

    /* renamed from: a */
    public boolean mo12654a(ae5 ae5) {
        boolean z;
        synchronized (this.f9021b) {
            if (!mo12689l() || !ae5.equals(this.f9022c) || this.f9024e == RequestCoordinator.RequestState.PAUSED) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12655b(p000.ae5 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9021b
            monitor-enter(r0)
            ae5 r1 = r2.f9022c     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f9025f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x001e }
            r2.f9024e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f9020a     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo12655b(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C1808b.mo12655b(ae5):void");
    }

    /* renamed from: c */
    public void mo171c() {
        synchronized (this.f9021b) {
            if (!this.f9025f.isComplete()) {
                this.f9025f = RequestCoordinator.RequestState.PAUSED;
                this.f9023d.mo171c();
            }
            if (!this.f9024e.isComplete()) {
                this.f9024e = RequestCoordinator.RequestState.PAUSED;
                this.f9022c.mo171c();
            }
        }
    }

    public void clear() {
        synchronized (this.f9021b) {
            this.f9026g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f9024e = requestState;
            this.f9025f = requestState;
            this.f9023d.clear();
            this.f9022c.clear();
        }
    }

    /* renamed from: d */
    public boolean mo12656d() {
        boolean z;
        synchronized (this.f9021b) {
            if (!this.f9023d.mo173d()) {
                if (!this.f9022c.mo173d()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12657e(p000.ae5 r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f9021b
            monitor-enter(r0)
            ae5 r1 = r2.f9023d     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f9025f = r3     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002b }
            r2.f9024e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f9020a     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x001c
            r3.mo12657e(r2)     // Catch:{ all -> 0x002b }
        L_0x001c:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.f9025f     // Catch:{ all -> 0x002b }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0029
            ae5 r3 = r2.f9023d     // Catch:{ all -> 0x002b }
            r3.clear()     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C1808b.mo12657e(ae5):void");
    }

    /* renamed from: f */
    public boolean mo174f() {
        boolean z;
        synchronized (this.f9021b) {
            if (this.f9024e == RequestCoordinator.RequestState.CLEARED) {
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
        synchronized (this.f9021b) {
            if (this.f9024e == RequestCoordinator.RequestState.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public RequestCoordinator getRoot() {
        RequestCoordinator requestCoordinator;
        synchronized (this.f9021b) {
            RequestCoordinator requestCoordinator2 = this.f9020a;
            if (requestCoordinator2 != null) {
                requestCoordinator = requestCoordinator2.getRoot();
            } else {
                requestCoordinator = this;
            }
        }
        return requestCoordinator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo176h(p000.ae5 r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.request.C1808b
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.request.b r4 = (com.bumptech.glide.request.C1808b) r4
            ae5 r0 = r3.f9022c
            if (r0 != 0) goto L_0x0010
            ae5 r0 = r4.f9022c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            ae5 r0 = r3.f9022c
            ae5 r2 = r4.f9022c
            boolean r0 = r0.mo176h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            ae5 r0 = r3.f9023d
            if (r0 != 0) goto L_0x0023
            ae5 r4 = r4.f9023d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            ae5 r0 = r3.f9023d
            ae5 r4 = r4.f9023d
            boolean r4 = r0.mo176h(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C1808b.mo176h(ae5):boolean");
    }

    /* renamed from: i */
    public boolean mo12659i(ae5 ae5) {
        boolean z;
        synchronized (this.f9021b) {
            if (!mo12690m() || !ae5.equals(this.f9022c) || mo12656d()) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f9021b) {
            if (this.f9024e == RequestCoordinator.RequestState.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo12660j(ae5 ae5) {
        boolean z;
        synchronized (this.f9021b) {
            if (!mo12691n() || (!ae5.equals(this.f9022c) && this.f9024e == RequestCoordinator.RequestState.SUCCESS)) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: k */
    public void mo178k() {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2;
        synchronized (this.f9021b) {
            this.f9026g = true;
            try {
                if (!(this.f9024e == RequestCoordinator.RequestState.SUCCESS || this.f9025f == (requestState2 = RequestCoordinator.RequestState.RUNNING))) {
                    this.f9025f = requestState2;
                    this.f9023d.mo178k();
                }
                if (this.f9026g && this.f9024e != (requestState = RequestCoordinator.RequestState.RUNNING)) {
                    this.f9024e = requestState;
                    this.f9022c.mo178k();
                }
            } finally {
                this.f9026g = false;
            }
        }
    }

    /* renamed from: l */
    public final boolean mo12689l() {
        RequestCoordinator requestCoordinator = this.f9020a;
        if (requestCoordinator == null || requestCoordinator.mo12654a(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo12690m() {
        RequestCoordinator requestCoordinator = this.f9020a;
        if (requestCoordinator == null || requestCoordinator.mo12659i(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo12691n() {
        RequestCoordinator requestCoordinator = this.f9020a;
        if (requestCoordinator == null || requestCoordinator.mo12660j(this)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public void mo12692o(ae5 ae5, ae5 ae52) {
        this.f9022c = ae5;
        this.f9023d = ae52;
    }
}
