package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1774h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p000.uy1;

/* renamed from: com.bumptech.glide.load.engine.g */
/* compiled from: EngineJob */
public class C1768g<R> implements DecodeJob.C1743b<R>, uy1.C3446f {

    /* renamed from: b1 */
    public static final C1771c f8853b1 = new C1771c();

    /* renamed from: A */
    public final wg2 f8854A;

    /* renamed from: B */
    public final AtomicInteger f8855B;

    /* renamed from: C */
    public z93 f8856C;

    /* renamed from: H */
    public boolean f8857H;

    /* renamed from: I */
    public boolean f8858I;

    /* renamed from: L */
    public boolean f8859L;

    /* renamed from: M */
    public boolean f8860M;

    /* renamed from: P */
    public bf5<?> f8861P;

    /* renamed from: Q */
    public DataSource f8862Q;

    /* renamed from: U */
    public boolean f8863U;

    /* renamed from: X */
    public GlideException f8864X;

    /* renamed from: Y */
    public boolean f8865Y;

    /* renamed from: Z */
    public C1774h<?> f8866Z;

    /* renamed from: a */
    public final C1773e f8867a;

    /* renamed from: d */
    public final d96 f8868d;

    /* renamed from: e */
    public final C1774h.C1775a f8869e;

    /* renamed from: e0 */
    public DecodeJob<R> f8870e0;

    /* renamed from: g */
    public final ys4<C1768g<?>> f8871g;

    /* renamed from: k */
    public final C1771c f8872k;

    /* renamed from: k0 */
    public volatile boolean f8873k0;

    /* renamed from: r */
    public final dq1 f8874r;

    /* renamed from: s */
    public final wg2 f8875s;

    /* renamed from: v0 */
    public boolean f8876v0;

    /* renamed from: x */
    public final wg2 f8877x;

    /* renamed from: y */
    public final wg2 f8878y;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    /* compiled from: EngineJob */
    public class C1769a implements Runnable {

        /* renamed from: a */
        public final ef5 f8879a;

        public C1769a(ef5 ef5) {
            this.f8879a = ef5;
        }

        public void run() {
            synchronized (this.f8879a.getLock()) {
                synchronized (C1768g.this) {
                    if (C1768g.this.f8867a.mo12558j(this.f8879a)) {
                        C1768g.this.mo12535f(this.f8879a);
                    }
                    C1768g.this.mo12538i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$b */
    /* compiled from: EngineJob */
    public class C1770b implements Runnable {

        /* renamed from: a */
        public final ef5 f8881a;

        public C1770b(ef5 ef5) {
            this.f8881a = ef5;
        }

        public void run() {
            synchronized (this.f8881a.getLock()) {
                synchronized (C1768g.this) {
                    if (C1768g.this.f8867a.mo12558j(this.f8881a)) {
                        C1768g.this.f8866Z.mo12562b();
                        C1768g.this.mo12536g(this.f8881a);
                        C1768g.this.mo12547r(this.f8881a);
                    }
                    C1768g.this.mo12538i();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$c */
    /* compiled from: EngineJob */
    public static class C1771c {
        /* renamed from: a */
        public <R> C1774h<R> mo12551a(bf5<R> bf5, boolean z, z93 z93, C1774h.C1775a aVar) {
            return new C1774h(bf5, z, true, z93, aVar);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    /* compiled from: EngineJob */
    public static final class C1772d {

        /* renamed from: a */
        public final ef5 f8883a;

        /* renamed from: b */
        public final Executor f8884b;

        public C1772d(ef5 ef5, Executor executor) {
            this.f8883a = ef5;
            this.f8884b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1772d) {
                return this.f8883a.equals(((C1772d) obj).f8883a);
            }
            return false;
        }

        public int hashCode() {
            return this.f8883a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    /* compiled from: EngineJob */
    public static final class C1773e implements Iterable<C1772d> {

        /* renamed from: a */
        public final List<C1772d> f8885a;

        public C1773e() {
            this(new ArrayList(2));
        }

        /* renamed from: n */
        public static C1772d m12442n(ef5 ef5) {
            return new C1772d(ef5, av1.m10809a());
        }

        public void clear() {
            this.f8885a.clear();
        }

        /* renamed from: e */
        public void mo12555e(ef5 ef5, Executor executor) {
            this.f8885a.add(new C1772d(ef5, executor));
        }

        public boolean isEmpty() {
            return this.f8885a.isEmpty();
        }

        public Iterator<C1772d> iterator() {
            return this.f8885a.iterator();
        }

        /* renamed from: j */
        public boolean mo12558j(ef5 ef5) {
            return this.f8885a.contains(m12442n(ef5));
        }

        /* renamed from: k */
        public C1773e mo12559k() {
            return new C1773e(new ArrayList(this.f8885a));
        }

        /* renamed from: o */
        public void mo12560o(ef5 ef5) {
            this.f8885a.remove(m12442n(ef5));
        }

        public int size() {
            return this.f8885a.size();
        }

        public C1773e(List<C1772d> list) {
            this.f8885a = list;
        }
    }

    public C1768g(wg2 wg2, wg2 wg22, wg2 wg23, wg2 wg24, dq1 dq1, C1774h.C1775a aVar, ys4<C1768g<?>> ys4) {
        this(wg2, wg22, wg23, wg24, dq1, aVar, ys4, f8853b1);
    }

    /* renamed from: a */
    public void mo12440a(bf5<R> bf5, DataSource dataSource, boolean z) {
        synchronized (this) {
            this.f8861P = bf5;
            this.f8862Q = dataSource;
            this.f8876v0 = z;
        }
        mo12544o();
    }

    /* renamed from: b */
    public void mo12441b(GlideException glideException) {
        synchronized (this) {
            this.f8864X = glideException;
        }
        mo12543n();
    }

    /* renamed from: c */
    public void mo12442c(DecodeJob<?> decodeJob) {
        mo12539j().execute(decodeJob);
    }

    /* renamed from: d */
    public d96 mo12421d() {
        return this.f8868d;
    }

    /* renamed from: e */
    public synchronized void mo12534e(ef5 ef5, Executor executor) {
        this.f8868d.mo18594c();
        this.f8867a.mo12555e(ef5, executor);
        boolean z = true;
        if (this.f8863U) {
            mo12540k(1);
            executor.execute(new C1770b(ef5));
        } else if (this.f8865Y) {
            mo12540k(1);
            executor.execute(new C1769a(ef5));
        } else {
            if (this.f8873k0) {
                z = false;
            }
            zt4.m31497a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* renamed from: f */
    public void mo12535f(ef5 ef5) {
        try {
            ef5.mo12665b(this.f8864X);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: g */
    public void mo12536g(ef5 ef5) {
        try {
            ef5.mo12664a(this.f8866Z, this.f8862Q, this.f8876v0);
        } catch (Throwable th) {
            throw new CallbackException(th);
        }
    }

    /* renamed from: h */
    public void mo12537h() {
        if (!mo12542m()) {
            this.f8873k0 = true;
            this.f8870e0.mo12419a();
            this.f8874r.mo12518b(this, this.f8856C);
        }
    }

    /* renamed from: i */
    public void mo12538i() {
        boolean z;
        C1774h<?> hVar;
        synchronized (this) {
            this.f8868d.mo18594c();
            zt4.m31497a(mo12542m(), "Not yet complete!");
            int decrementAndGet = this.f8855B.decrementAndGet();
            if (decrementAndGet >= 0) {
                z = true;
            } else {
                z = false;
            }
            zt4.m31497a(z, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                hVar = this.f8866Z;
                mo12546q();
            } else {
                hVar = null;
            }
        }
        if (hVar != null) {
            hVar.mo12565f();
        }
    }

    /* renamed from: j */
    public final wg2 mo12539j() {
        if (this.f8858I) {
            return this.f8878y;
        }
        if (this.f8859L) {
            return this.f8854A;
        }
        return this.f8877x;
    }

    /* renamed from: k */
    public synchronized void mo12540k(int i) {
        C1774h<?> hVar;
        zt4.m31497a(mo12542m(), "Not yet complete!");
        if (this.f8855B.getAndAdd(i) == 0 && (hVar = this.f8866Z) != null) {
            hVar.mo12562b();
        }
    }

    /* renamed from: l */
    public synchronized C1768g<R> mo12541l(z93 z93, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f8856C = z93;
        this.f8857H = z;
        this.f8858I = z2;
        this.f8859L = z3;
        this.f8860M = z4;
        return this;
    }

    /* renamed from: m */
    public final boolean mo12542m() {
        if (this.f8865Y || this.f8863U || this.f8873k0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f8874r.mo12517a(r4, r1, (com.bumptech.glide.load.engine.C1774h<?>) null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = r0.next();
        r1.f8884b.execute(new com.bumptech.glide.load.engine.C1768g.C1769a(r4, r1.f8883a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo12538i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12543n() {
        /*
            r4 = this;
            monitor-enter(r4)
            d96 r0 = r4.f8868d     // Catch:{ all -> 0x0066 }
            r0.mo18594c()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f8873k0     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.mo12546q()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.g$e r0 = r4.f8867a     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f8865Y     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f8865Y = r0     // Catch:{ all -> 0x0066 }
            z93 r1 = r4.f8856C     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.g$e r2 = r4.f8867a     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.g$e r2 = r2.mo12559k()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo12540k(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            dq1 r0 = r4.f8874r
            r3 = 0
            r0.mo12517a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.g$d r1 = (com.bumptech.glide.load.engine.C1768g.C1772d) r1
            java.util.concurrent.Executor r2 = r1.f8884b
            com.bumptech.glide.load.engine.g$a r3 = new com.bumptech.glide.load.engine.g$a
            ef5 r1 = r1.f8883a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo12538i()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C1768g.mo12543n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f8874r.mo12517a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = r0.next();
        r1.f8884b.execute(new com.bumptech.glide.load.engine.C1768g.C1770b(r5, r1.f8883a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo12538i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12544o() {
        /*
            r5 = this;
            monitor-enter(r5)
            d96 r0 = r5.f8868d     // Catch:{ all -> 0x007c }
            r0.mo18594c()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f8873k0     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            bf5<?> r0 = r5.f8861P     // Catch:{ all -> 0x007c }
            r0.mo11634a()     // Catch:{ all -> 0x007c }
            r5.mo12546q()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.g$e r0 = r5.f8867a     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f8863U     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.g$c r0 = r5.f8872k     // Catch:{ all -> 0x007c }
            bf5<?> r1 = r5.f8861P     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f8857H     // Catch:{ all -> 0x007c }
            z93 r3 = r5.f8856C     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.h$a r4 = r5.f8869e     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.h r0 = r0.mo12551a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f8866Z = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f8863U = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.g$e r1 = r5.f8867a     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.g$e r1 = r1.mo12559k()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo12540k(r2)     // Catch:{ all -> 0x007c }
            z93 r0 = r5.f8856C     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.h<?> r2 = r5.f8866Z     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            dq1 r3 = r5.f8874r
            r3.mo12517a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.g$d r1 = (com.bumptech.glide.load.engine.C1768g.C1772d) r1
            java.util.concurrent.Executor r2 = r1.f8884b
            com.bumptech.glide.load.engine.g$b r3 = new com.bumptech.glide.load.engine.g$b
            ef5 r1 = r1.f8883a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo12538i()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C1768g.mo12544o():void");
    }

    /* renamed from: p */
    public boolean mo12545p() {
        return this.f8860M;
    }

    /* renamed from: q */
    public final synchronized void mo12546q() {
        if (this.f8856C != null) {
            this.f8867a.clear();
            this.f8856C = null;
            this.f8866Z = null;
            this.f8861P = null;
            this.f8865Y = false;
            this.f8873k0 = false;
            this.f8863U = false;
            this.f8876v0 = false;
            this.f8870e0.mo12412E(false);
            this.f8870e0 = null;
            this.f8864X = null;
            this.f8862Q = null;
            this.f8871g.mo11138a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: r */
    public synchronized void mo12547r(ef5 ef5) {
        boolean z;
        this.f8868d.mo18594c();
        this.f8867a.mo12560o(ef5);
        if (this.f8867a.isEmpty()) {
            mo12537h();
            if (!this.f8863U) {
                if (!this.f8865Y) {
                    z = false;
                    if (z && this.f8855B.get() == 0) {
                        mo12546q();
                    }
                }
            }
            z = true;
            mo12546q();
        }
    }

    /* renamed from: s */
    public synchronized void mo12548s(DecodeJob<R> decodeJob) {
        wg2 wg2;
        this.f8870e0 = decodeJob;
        if (decodeJob.mo12418K()) {
            wg2 = this.f8875s;
        } else {
            wg2 = mo12539j();
        }
        wg2.execute(decodeJob);
    }

    public C1768g(wg2 wg2, wg2 wg22, wg2 wg23, wg2 wg24, dq1 dq1, C1774h.C1775a aVar, ys4<C1768g<?>> ys4, C1771c cVar) {
        this.f8867a = new C1773e();
        this.f8868d = d96.m14869a();
        this.f8855B = new AtomicInteger();
        this.f8875s = wg2;
        this.f8877x = wg22;
        this.f8878y = wg23;
        this.f8854A = wg24;
        this.f8874r = dq1;
        this.f8869e = aVar;
        this.f8871g = ys4;
        this.f8872k = cVar;
    }
}
