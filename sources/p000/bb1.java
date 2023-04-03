package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p000.ab1;

/* renamed from: bb1 */
/* compiled from: DeferredReleaserConcurrentImpl */
public class bb1 extends ab1 {

    /* renamed from: b */
    public final Object f8030b = new Object();

    /* renamed from: c */
    public final Handler f8031c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public ArrayList<ab1.C0017a> f8032d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<ab1.C0017a> f8033e = new ArrayList<>();

    /* renamed from: f */
    public final Runnable f8034f = new C1618a();

    /* renamed from: bb1$a */
    /* compiled from: DeferredReleaserConcurrentImpl */
    public class C1618a implements Runnable {
        public C1618a() {
        }

        public void run() {
            synchronized (bb1.this.f8030b) {
                ArrayList f = bb1.this.f8033e;
                bb1 bb1 = bb1.this;
                ArrayList unused = bb1.f8033e = bb1.f8032d;
                ArrayList unused2 = bb1.this.f8032d = f;
            }
            int size = bb1.this.f8033e.size();
            for (int i = 0; i < size; i++) {
                ((ab1.C0017a) bb1.this.f8033e.get(i)).mo140a();
            }
            bb1.this.f8033e.clear();
        }
    }

    /* renamed from: a */
    public void mo138a(ab1.C0017a aVar) {
        synchronized (this.f8030b) {
            this.f8032d.remove(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r2.f8031c.post(r2.f8034f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo139d(p000.ab1.C0017a r3) {
        /*
            r2 = this;
            boolean r0 = p000.ab1.m176c()
            if (r0 != 0) goto L_0x000a
            r3.mo140a()
            return
        L_0x000a:
            java.lang.Object r0 = r2.f8030b
            monitor-enter(r0)
            java.util.ArrayList<ab1$a> r1 = r2.f8032d     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0017:
            java.util.ArrayList<ab1$a> r1 = r2.f8032d     // Catch:{ all -> 0x0032 }
            r1.add(r3)     // Catch:{ all -> 0x0032 }
            java.util.ArrayList<ab1$a> r3 = r2.f8032d     // Catch:{ all -> 0x0032 }
            int r3 = r3.size()     // Catch:{ all -> 0x0032 }
            r1 = 1
            if (r3 != r1) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0031
            android.os.Handler r3 = r2.f8031c
            java.lang.Runnable r0 = r2.f8034f
            r3.post(r0)
        L_0x0031:
            return
        L_0x0032:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bb1.mo139d(ab1$a):void");
    }
}
