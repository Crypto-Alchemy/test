package p000;

import java.util.ArrayList;
import p018io.reactivex.exceptions.CompositeException;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: pn0 */
/* compiled from: CompositeDisposable */
public final class pn0 implements th1, uh1 {

    /* renamed from: a */
    public ki4<th1> f32747a;

    /* renamed from: d */
    public volatile boolean f32748d;

    /* renamed from: a */
    public boolean mo46787a(th1 th1) {
        af4.m31828d(th1, "d is null");
        if (!this.f32748d) {
            synchronized (this) {
                if (!this.f32748d) {
                    ki4<th1> ki4 = this.f32747a;
                    if (ki4 == null) {
                        ki4 = new ki4<>();
                        this.f32747a = ki4;
                    }
                    ki4.mo44801a(th1);
                    return true;
                }
            }
        }
        th1.dispose();
        return false;
    }

    /* renamed from: b */
    public boolean mo46788b(th1 th1) {
        if (!mo46789c(th1)) {
            return false;
        }
        th1.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo46789c(p000.th1 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p000.af4.m31828d(r3, r0)
            boolean r0 = r2.f32748d
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f32748d     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            ki4<th1> r0 = r2.f32747a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo44804e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.pn0.mo46789c(th1):boolean");
    }

    /* renamed from: d */
    public void mo46790d(ki4<th1> ki4) {
        if (ki4 != null) {
            ArrayList arrayList = null;
            for (Object obj : ki4.mo44802b()) {
                if (obj instanceof th1) {
                    try {
                        ((th1) obj).dispose();
                    } catch (Throwable th) {
                        ou1.m49570a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw ExceptionHelper.m45877d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    public void dispose() {
        if (!this.f32748d) {
            synchronized (this) {
                if (!this.f32748d) {
                    this.f32748d = true;
                    ki4<th1> ki4 = this.f32747a;
                    this.f32747a = null;
                    mo46790d(ki4);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo46791e() {
        return this.f32748d;
    }
}
