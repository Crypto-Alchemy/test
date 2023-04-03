package p000;

import com.facebook.common.references.SharedReference;
import p000.nh0;

/* renamed from: f71 */
/* compiled from: DefaultCloseableReference */
public class f71<T> extends nh0<T> {
    public f71(SharedReference<T> sharedReference, nh0.C2897c cVar, Throwable th) {
        super(sharedReference, cVar, th);
    }

    /* renamed from: b */
    public nh0<T> clone() {
        Throwable th;
        au4.m10794i(mo23686m());
        SharedReference<T> sharedReference = this.f15551d;
        nh0.C2897c cVar = this.f15552e;
        if (this.f15553g != null) {
            th = new Throwable(this.f15553g);
        } else {
            th = null;
        }
        return new f71(sharedReference, cVar, th);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0 = r6.f15551d.mo13174f();
        r3 = new java.lang.Object[3];
        r3[0] = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r6));
        r3[1] = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r6.f15551d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r3[2] = r0;
        p000.oy1.m24437x("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", r3);
        r6.f15552e.mo23688a(r6.f15551d, r6.f15553g);
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() throws java.lang.Throwable {
        /*
            r6 = this;
            monitor-enter(r6)     // Catch:{ all -> 0x0055 }
            boolean r0 = r6.f15550a     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            super.finalize()
            return
        L_0x000a:
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            com.facebook.common.references.SharedReference<T> r0 = r6.f15551d     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.mo13174f()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "DefaultCloseableReference"
            java.lang.String r2 = "Finalized without closing: %x %x (type = %s)"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0055 }
            r4 = 0
            int r5 = java.lang.System.identityHashCode(r6)     // Catch:{ all -> 0x0055 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0055 }
            r3[r4] = r5     // Catch:{ all -> 0x0055 }
            r4 = 1
            com.facebook.common.references.SharedReference<T> r5 = r6.f15551d     // Catch:{ all -> 0x0055 }
            int r5 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0055 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0055 }
            r3[r4] = r5     // Catch:{ all -> 0x0055 }
            r4 = 2
            if (r0 != 0) goto L_0x0035
            r0 = 0
            goto L_0x003d
        L_0x0035:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0055 }
        L_0x003d:
            r3[r4] = r0     // Catch:{ all -> 0x0055 }
            p000.oy1.m24437x(r1, r2, r3)     // Catch:{ all -> 0x0055 }
            nh0$c r0 = r6.f15552e     // Catch:{ all -> 0x0055 }
            com.facebook.common.references.SharedReference<T> r1 = r6.f15551d     // Catch:{ all -> 0x0055 }
            java.lang.Throwable r2 = r6.f15553g     // Catch:{ all -> 0x0055 }
            r0.mo23688a(r1, r2)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ all -> 0x0055 }
            super.finalize()
            return
        L_0x0052:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f71.finalize():void");
    }

    public f71(T t, rf5<T> rf5, nh0.C2897c cVar, Throwable th) {
        super(t, rf5, cVar, th);
    }
}
