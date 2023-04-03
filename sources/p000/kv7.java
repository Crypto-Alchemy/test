package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: kv7 */
public final class kv7<ResultT> {

    /* renamed from: a */
    public final Object f31102a = new Object();

    /* renamed from: b */
    public Queue<hv7<ResultT>> f31103b;

    /* renamed from: c */
    public boolean f31104c;

    /* renamed from: a */
    public final void mo45301a(hv7<ResultT> hv7) {
        synchronized (this.f31102a) {
            if (this.f31103b == null) {
                this.f31103b = new ArrayDeque();
            }
            this.f31103b.add(hv7);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f31102a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f31103b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f31104c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo42075a(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45302b(p000.ul6<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f31102a
            monitor-enter(r0)
            java.util.Queue<hv7<ResultT>> r1 = r2.f31103b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f31104c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f31104c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f31102a
            monitor-enter(r1)
            java.util.Queue<hv7<ResultT>> r0 = r2.f31103b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            hv7 r0 = (p000.hv7) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f31104c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo42075a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.kv7.mo45302b(ul6):void");
    }
}
