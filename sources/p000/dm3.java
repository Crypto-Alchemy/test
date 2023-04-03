package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dm3 */
/* compiled from: LruCache */
public class dm3<T, Y> {

    /* renamed from: a */
    public final Map<T, C2182a<Y>> f10786a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    public final long f10787b;

    /* renamed from: c */
    public long f10788c;

    /* renamed from: d */
    public long f10789d;

    /* renamed from: dm3$a */
    /* compiled from: LruCache */
    public static final class C2182a<Y> {

        /* renamed from: a */
        public final Y f10790a;

        /* renamed from: b */
        public final int f10791b;

        public C2182a(Y y, int i) {
            this.f10790a = y;
            this.f10791b = i;
        }
    }

    public dm3(long j) {
        this.f10787b = j;
        this.f10788c = j;
    }

    /* renamed from: b */
    public void mo18842b() {
        mo18850m(0);
    }

    /* renamed from: f */
    public final void mo18843f() {
        mo18850m(this.f10788c);
    }

    /* renamed from: g */
    public synchronized Y mo18844g(T t) {
        Y y;
        C2182a aVar = this.f10786a.get(t);
        if (aVar != null) {
            y = aVar.f10790a;
        } else {
            y = null;
        }
        return y;
    }

    /* renamed from: h */
    public synchronized long mo18845h() {
        return this.f10788c;
    }

    /* renamed from: i */
    public int mo18846i(Y y) {
        return 1;
    }

    /* renamed from: j */
    public void mo18847j(T t, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r4;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y mo18848k(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo18846i(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f10788c     // Catch:{ all -> 0x004a }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0012
            r7.mo18847j(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r4
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r5 = r7.f10789d     // Catch:{ all -> 0x004a }
            long r5 = r5 + r1
            r7.f10789d = r5     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map<T, dm3$a<Y>> r1 = r7.f10786a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r4
            goto L_0x0024
        L_0x001f:
            dm3$a r2 = new dm3$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            dm3$a r0 = (p000.dm3.C2182a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f10789d     // Catch:{ all -> 0x004a }
            int r3 = r0.f10791b     // Catch:{ all -> 0x004a }
            long r5 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r5
            r7.f10789d = r1     // Catch:{ all -> 0x004a }
            Y r1 = r0.f10790a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f10790a     // Catch:{ all -> 0x004a }
            r7.mo18847j(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.mo18843f()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            Y r4 = r0.f10790a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r4
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dm3.mo18848k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: l */
    public synchronized Y mo18849l(T t) {
        C2182a remove = this.f10786a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f10789d -= (long) remove.f10791b;
        return remove.f10790a;
    }

    /* renamed from: m */
    public synchronized void mo18850m(long j) {
        while (this.f10789d > j) {
            Iterator<Map.Entry<T, C2182a<Y>>> it = this.f10786a.entrySet().iterator();
            Map.Entry next = it.next();
            C2182a aVar = (C2182a) next.getValue();
            this.f10789d -= (long) aVar.f10791b;
            Object key = next.getKey();
            it.remove();
            mo18847j(key, aVar.f10790a);
        }
    }
}
