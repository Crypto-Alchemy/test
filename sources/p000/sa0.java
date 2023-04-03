package p000;

import android.os.CancellationSignal;

/* renamed from: sa0 */
/* compiled from: CancellationSignal */
public final class sa0 {

    /* renamed from: a */
    public boolean f17533a;

    /* renamed from: b */
    public C3256b f17534b;

    /* renamed from: c */
    public Object f17535c;

    /* renamed from: d */
    public boolean f17536d;

    /* renamed from: sa0$a */
    /* compiled from: CancellationSignal */
    public static class C3255a {
        /* renamed from: a */
        public static void m26755a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        /* renamed from: b */
        public static CancellationSignal m26756b() {
            return new CancellationSignal();
        }
    }

    /* renamed from: sa0$b */
    /* compiled from: CancellationSignal */
    public interface C3256b {
        void onCancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        p000.sa0.C3255a.m26755a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.f17536d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.f17536d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0031, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25692a() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f17533a     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            r0 = 1
            r3.f17533a = r0     // Catch:{ all -> 0x0036 }
            r3.f17536d = r0     // Catch:{ all -> 0x0036 }
            sa0$b r0 = r3.f17534b     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r3.f17535c     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0020
        L_0x001a:
            if (r1 == 0) goto L_0x002b
            p000.sa0.C3255a.m26755a(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x002b
        L_0x0020:
            monitor-enter(r3)
            r3.f17536d = r2     // Catch:{ all -> 0x0028 }
            r3.notifyAll()     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            monitor-enter(r3)
            r3.f17536d = r2     // Catch:{ all -> 0x0033 }
            r3.notifyAll()     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.sa0.mo25692a():void");
    }

    /* renamed from: b */
    public Object mo25693b() {
        Object obj;
        synchronized (this) {
            if (this.f17535c == null) {
                CancellationSignal b = C3255a.m26756b();
                this.f17535c = b;
                if (this.f17533a) {
                    C3255a.m26755a(b);
                }
            }
            obj = this.f17535c;
        }
        return obj;
    }

    /* renamed from: c */
    public void mo25694c(C3256b bVar) {
        synchronized (this) {
            mo25695d();
            if (this.f17534b != bVar) {
                this.f17534b = bVar;
                if (this.f17533a) {
                    if (bVar != null) {
                        bVar.onCancel();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo25695d() {
        while (this.f17536d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
