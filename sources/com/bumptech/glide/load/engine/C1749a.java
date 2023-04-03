package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C1774h;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
/* compiled from: ActiveResources */
public final class C1749a {

    /* renamed from: a */
    public final boolean f8782a;

    /* renamed from: b */
    public final Executor f8783b;

    /* renamed from: c */
    public final Map<z93, C1754d> f8784c;

    /* renamed from: d */
    public final ReferenceQueue<C1774h<?>> f8785d;

    /* renamed from: e */
    public C1774h.C1775a f8786e;

    /* renamed from: f */
    public volatile boolean f8787f;

    /* renamed from: g */
    public volatile C1753c f8788g;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    /* compiled from: ActiveResources */
    public class C1750a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        /* compiled from: ActiveResources */
        public class C1751a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f8789a;

            public C1751a(Runnable runnable) {
                this.f8789a = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f8789a.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C1751a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    /* compiled from: ActiveResources */
    public class C1752b implements Runnable {
        public C1752b() {
        }

        public void run() {
            C1749a.this.mo12473b();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    /* compiled from: ActiveResources */
    public interface C1753c {
        /* renamed from: a */
        void mo12481a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$d */
    /* compiled from: ActiveResources */
    public static final class C1754d extends WeakReference<C1774h<?>> {

        /* renamed from: a */
        public final z93 f8792a;

        /* renamed from: b */
        public final boolean f8793b;

        /* renamed from: c */
        public bf5<?> f8794c;

        public C1754d(z93 z93, C1774h<?> hVar, ReferenceQueue<? super C1774h<?>> referenceQueue, boolean z) {
            super(hVar, referenceQueue);
            bf5<?> bf5;
            this.f8792a = (z93) zt4.m31500d(z93);
            if (!hVar.mo12564e() || !z) {
                bf5 = null;
            } else {
                bf5 = (bf5) zt4.m31500d(hVar.mo12563d());
            }
            this.f8794c = bf5;
            this.f8793b = hVar.mo12564e();
        }

        /* renamed from: a */
        public void mo12482a() {
            this.f8794c = null;
            clear();
        }
    }

    public C1749a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C1750a()));
    }

    /* renamed from: a */
    public synchronized void mo12472a(z93 z93, C1774h<?> hVar) {
        C1754d put = this.f8784c.put(z93, new C1754d(z93, hVar, this.f8785d, this.f8782a));
        if (put != null) {
            put.mo12482a();
        }
    }

    /* renamed from: b */
    public void mo12473b() {
        while (!this.f8787f) {
            try {
                mo12474c((C1754d) this.f8785d.remove());
                C1753c cVar = this.f8788g;
                if (cVar != null) {
                    cVar.mo12481a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public void mo12474c(C1754d dVar) {
        synchronized (this) {
            this.f8784c.remove(dVar.f8792a);
            if (dVar.f8793b) {
                bf5<?> bf5 = dVar.f8794c;
                if (bf5 != null) {
                    this.f8786e.mo12519c(dVar.f8792a, new C1774h(bf5, true, false, dVar.f8792a, this.f8786e));
                }
            }
        }
    }

    /* renamed from: d */
    public synchronized void mo12475d(z93 z93) {
        C1754d remove = this.f8784c.remove(z93);
        if (remove != null) {
            remove.mo12482a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C1774h<?> mo12476e(p000.z93 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<z93, com.bumptech.glide.load.engine.a$d> r0 = r1.f8784c     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.C1749a.C1754d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.h r0 = (com.bumptech.glide.load.engine.C1774h) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo12474c(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C1749a.mo12476e(z93):com.bumptech.glide.load.engine.h");
    }

    /* renamed from: f */
    public void mo12477f(C1774h.C1775a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f8786e = aVar;
            }
        }
    }

    public C1749a(boolean z, Executor executor) {
        this.f8784c = new HashMap();
        this.f8785d = new ReferenceQueue<>();
        this.f8782a = z;
        this.f8783b = executor;
        executor.execute(new C1752b());
    }
}
