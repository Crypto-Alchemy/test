package p000;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: x76 */
/* compiled from: StagingArea */
public class x76 {

    /* renamed from: b */
    public static final Class<?> f19463b = x76.class;

    /* renamed from: a */
    public Map<f80, gp1> f19464a = new HashMap();

    /* renamed from: b */
    public static x76 m29921b() {
        return new x76();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p000.gp1 mo27689a(p000.f80 r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            p000.au4.m10792g(r7)     // Catch:{ all -> 0x0051 }
            java.util.Map<f80, gp1> r0 = r6.f19464a     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x0051 }
            gp1 r0 = (p000.gp1) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004f
            monitor-enter(r0)     // Catch:{ all -> 0x0051 }
            boolean r1 = p000.gp1.m18283C(r0)     // Catch:{ all -> 0x004c }
            if (r1 != 0) goto L_0x0045
            java.util.Map<f80, gp1> r1 = r6.f19464a     // Catch:{ all -> 0x004c }
            r1.remove(r7)     // Catch:{ all -> 0x004c }
            java.lang.Class<?> r1 = f19463b     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "Found closed reference %d for key %s (%d)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x004c }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x004c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004c }
            r3[r4] = r5     // Catch:{ all -> 0x004c }
            r4 = 1
            java.lang.String r5 = r7.mo11960a()     // Catch:{ all -> 0x004c }
            r3[r4] = r5     // Catch:{ all -> 0x004c }
            r4 = 2
            int r7 = java.lang.System.identityHashCode(r7)     // Catch:{ all -> 0x004c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x004c }
            r3[r4] = r7     // Catch:{ all -> 0x004c }
            p000.oy1.m24435v(r1, r2, r3)     // Catch:{ all -> 0x004c }
            r7 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r6)
            return r7
        L_0x0045:
            gp1 r7 = p000.gp1.m18284b(r0)     // Catch:{ all -> 0x004c }
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            r0 = r7
            goto L_0x004f
        L_0x004c:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004c }
            throw r7     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r6)
            return r0
        L_0x0051:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x76.mo27689a(f80):gp1");
    }

    /* renamed from: c */
    public final synchronized void mo27690c() {
        oy1.m24428o(f19463b, "Count = %d", Integer.valueOf(this.f19464a.size()));
    }

    /* renamed from: d */
    public synchronized void mo27691d(f80 f80, gp1 gp1) {
        au4.m10792g(f80);
        au4.m10787b(Boolean.valueOf(gp1.m18283C(gp1)));
        gp1.m18285c(this.f19464a.put(f80, gp1.m18284b(gp1)));
        mo27690c();
    }

    /* renamed from: e */
    public boolean mo27692e(f80 f80) {
        gp1 remove;
        au4.m10792g(f80);
        synchronized (this) {
            remove = this.f19464a.remove(f80);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.mo20730A();
        } finally {
            remove.close();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public synchronized boolean mo27693f(f80 f80, gp1 gp1) {
        au4.m10792g(f80);
        au4.m10792g(gp1);
        au4.m10787b(Boolean.valueOf(gp1.m18283C(gp1)));
        gp1 gp12 = this.f19464a.get(f80);
        if (gp12 == null) {
            return false;
        }
        nh0<PooledByteBuffer> e = gp12.mo20745e();
        nh0<PooledByteBuffer> e2 = gp1.mo20745e();
        if (!(e == null || e2 == null)) {
            try {
                if (e.mo23684j() == e2.mo23684j()) {
                    this.f19464a.remove(f80);
                    nh0.m23178h(e2);
                    nh0.m23178h(e);
                    gp1.m18285c(gp12);
                    mo27690c();
                    return true;
                }
            } catch (Throwable th) {
                nh0.m23178h(e2);
                nh0.m23178h(e);
                gp1.m18285c(gp12);
                throw th;
            }
        }
        nh0.m23178h(e2);
        nh0.m23178h(e);
        gp1.m18285c(gp12);
        return false;
    }
}
