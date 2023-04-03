package p000;

import java.util.concurrent.BlockingQueue;

/* renamed from: zq8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class zq8 extends Thread {

    /* renamed from: a */
    public final Object f36216a;

    /* renamed from: d */
    public final BlockingQueue<xq8<?>> f36217d;

    /* renamed from: e */
    public boolean f36218e = false;

    /* renamed from: g */
    public final /* synthetic */ cr8 f36219g;

    public zq8(cr8 cr8, String str, BlockingQueue<xq8<?>> blockingQueue) {
        this.f36219g = cr8;
        cu4.m43221k(str);
        cu4.m43221k(blockingQueue);
        this.f36216a = new Object();
        this.f36217d = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    public final void mo49906a() {
        synchronized (this.f36216a) {
            this.f36216a.notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo49907b() {
        synchronized (this.f36219g.f27900i) {
            if (!this.f36218e) {
                this.f36219g.f27901j.release();
                this.f36219g.f27900i.notifyAll();
                if (this == this.f36219g.f27894c) {
                    zq8 unused = this.f36219g.f27894c = null;
                } else if (this == this.f36219g.f27895d) {
                    zq8 unused2 = this.f36219g.f27895d = null;
                } else {
                    this.f36219g.f34342a.mo45237A().mo29670l().mo48769a("Current scheduler thread is neither worker nor network");
                }
                this.f36218e = true;
            }
        }
    }

    /* renamed from: c */
    public final void mo49908c(InterruptedException interruptedException) {
        this.f36219g.f34342a.mo45237A().mo29673o().mo48770b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        mo49907b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0079, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x0014
            cr8 r2 = r6.f36219g     // Catch:{ InterruptedException -> 0x000f }
            java.util.concurrent.Semaphore r2 = r2.f27901j     // Catch:{ InterruptedException -> 0x000f }
            r2.acquire()     // Catch:{ InterruptedException -> 0x000f }
            r1 = r0
            goto L_0x0002
        L_0x000f:
            r2 = move-exception
            r6.mo49908c(r2)
            goto L_0x0002
        L_0x0014:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0082 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0082 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<xq8<?>> r2 = r6.f36217d     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0082 }
            xq8 r2 = (p000.xq8) r2     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f35677d     // Catch:{ all -> 0x0082 }
            if (r0 == r3) goto L_0x002d
            r3 = 10
            goto L_0x002e
        L_0x002d:
            r3 = r1
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x0082 }
            r2.run()     // Catch:{ all -> 0x0082 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f36216a     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue<xq8<?>> r3 = r6.f36217d     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007f }
            if (r3 != 0) goto L_0x0051
            cr8 r3 = r6.f36219g     // Catch:{ all -> 0x007f }
            boolean unused = r3.f27902k     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.f36216a     // Catch:{ InterruptedException -> 0x004d }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6.mo49908c(r3)     // Catch:{ all -> 0x007f }
        L_0x0051:
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            cr8 r2 = r6.f36219g     // Catch:{ all -> 0x0082 }
            java.lang.Object r2 = r2.f27900i     // Catch:{ all -> 0x0082 }
            monitor-enter(r2)     // Catch:{ all -> 0x0082 }
            java.util.concurrent.BlockingQueue<xq8<?>> r3 = r6.f36217d     // Catch:{ all -> 0x007c }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x007c }
            if (r3 != 0) goto L_0x007a
            cr8 r0 = r6.f36219g     // Catch:{ all -> 0x007c }
            kr8 r0 = r0.f34342a     // Catch:{ all -> 0x007c }
            n68 r0 = r0.mo45274y()     // Catch:{ all -> 0x007c }
            uk8<java.lang.Boolean> r1 = p000.rl8.f33517q0     // Catch:{ all -> 0x007c }
            r3 = 0
            boolean r0 = r0.mo45997v(r3, r1)     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            r6.mo49907b()     // Catch:{ all -> 0x007c }
        L_0x0075:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            r6.mo49907b()
            return
        L_0x007a:
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            goto L_0x001c
        L_0x007c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r6.mo49907b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.zq8.run():void");
    }
}
