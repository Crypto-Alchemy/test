package p000;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p018io.reactivex.exceptions.CompositeException;
import p018io.reactivex.internal.util.ExceptionHelper;

/* renamed from: yh3 */
/* compiled from: ListCompositeDisposable */
public final class yh3 implements th1, uh1 {

    /* renamed from: a */
    public List<th1> f35888a;

    /* renamed from: d */
    public volatile boolean f35889d;

    /* renamed from: a */
    public boolean mo46787a(th1 th1) {
        af4.m31828d(th1, "d is null");
        if (!this.f35889d) {
            synchronized (this) {
                if (!this.f35889d) {
                    List list = this.f35888a;
                    if (list == null) {
                        list = new LinkedList();
                        this.f35888a = list;
                    }
                    list.add(th1);
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
            boolean r0 = r2.f35889d
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f35889d     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<th1> r0 = r2.f35888a     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.yh3.mo46789c(th1):boolean");
    }

    /* renamed from: d */
    public void mo49684d(List<th1> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (th1 dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    ou1.m49570a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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
        if (!this.f35889d) {
            synchronized (this) {
                if (!this.f35889d) {
                    this.f35889d = true;
                    List<th1> list = this.f35888a;
                    this.f35888a = null;
                    mo49684d(list);
                }
            }
        }
    }
}
