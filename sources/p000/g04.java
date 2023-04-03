package p000;

import android.util.Pair;
import b.b;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: g04 */
/* compiled from: MultiplexProducer */
public abstract class g04<K, T extends Closeable> implements vv4<T> {

    /* renamed from: a */
    public final Map<K, g04<K, T>.C1599b> f12143a;

    /* renamed from: b */
    public final vv4<T> f12144b;

    /* renamed from: c */
    public final boolean f12145c;

    /* renamed from: d */
    public final String f12146d;

    /* renamed from: e */
    public final String f12147e;

    /* renamed from: g04$b */
    /* compiled from: MultiplexProducer */
    public class C2338b {

        /* renamed from: a */
        public final K f12148a;

        /* renamed from: b */
        public final CopyOnWriteArraySet<Pair<vq0<T>, wv4>> f12149b = ly5.m21894a();

        /* renamed from: c */
        public T f12150c;

        /* renamed from: d */
        public float f12151d;

        /* renamed from: e */
        public int f12152e;

        /* renamed from: f */
        public C2336fz f12153f;

        /* renamed from: g */
        public g04<K, T>.b f12154g;

        /* renamed from: g04$b$a */
        /* compiled from: MultiplexProducer */
        public class C2339a extends C2439gz {

            /* renamed from: a */
            public final /* synthetic */ Pair f12156a;

            public C2339a(Pair pair) {
                this.f12156a = pair;
            }

            /* renamed from: a */
            public void mo13429a() {
                C2336fz.m17491q(C2338b.this.mo20322r());
            }

            /* renamed from: b */
            public void mo13412b() {
                boolean remove;
                List list;
                List list2;
                List list3;
                C2336fz fzVar;
                synchronized (C2338b.this) {
                    remove = C2338b.this.f12149b.remove(this.f12156a);
                    list = null;
                    if (!remove) {
                        fzVar = null;
                        list3 = null;
                    } else if (C2338b.this.f12149b.isEmpty()) {
                        fzVar = C2338b.this.f12153f;
                        list3 = null;
                    } else {
                        List d = C2338b.this.mo20323s();
                        list3 = C2338b.this.mo20324t();
                        list2 = C2338b.this.mo20322r();
                        List list4 = d;
                        fzVar = null;
                        list = list4;
                    }
                    list2 = list3;
                }
                C2336fz.m17492r(list);
                C2336fz.m17493s(list3);
                C2336fz.m17491q(list2);
                if (fzVar != null) {
                    if (!g04.this.f12145c || fzVar.mo20289l()) {
                        fzVar.mo20293t();
                    } else {
                        C2336fz.m17493s(fzVar.mo20297x(Priority.LOW));
                    }
                }
                if (remove) {
                    ((vq0) this.f12156a.first).mo27292a();
                }
            }

            /* renamed from: c */
            public void mo20325c() {
                C2336fz.m17493s(C2338b.this.mo20324t());
            }

            /* renamed from: d */
            public void mo20326d() {
                C2336fz.m17492r(C2338b.this.mo20323s());
            }
        }

        /* renamed from: g04$b$b */
        /* compiled from: MultiplexProducer */
        public class C2340b extends C3766zx<T> {
            public C2340b() {
            }

            /* renamed from: g */
            public void mo13424g() {
                try {
                    if (lc2.m21369d()) {
                        lc2.m21366a("MultiplexProducer#onCancellation");
                    }
                    C2338b.this.mo20317m(this);
                } finally {
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                }
            }

            /* renamed from: h */
            public void mo11351h(Throwable th) {
                try {
                    if (lc2.m21369d()) {
                        lc2.m21366a("MultiplexProducer#onFailure");
                    }
                    C2338b.this.mo20318n(this, th);
                } finally {
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                }
            }

            /* renamed from: j */
            public void mo13425j(float f) {
                try {
                    if (lc2.m21369d()) {
                        lc2.m21366a("MultiplexProducer#onProgressUpdate");
                    }
                    C2338b.this.mo20320p(this, f);
                } finally {
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                }
            }

            /* renamed from: p */
            public void mo11352i(T t, int i) {
                try {
                    if (lc2.m21369d()) {
                        lc2.m21366a("MultiplexProducer#onNewResult");
                    }
                    C2338b.this.mo20319o(this, t, i);
                } finally {
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                }
            }
        }

        public C2338b(K k) {
            this.f12148a = k;
        }

        /* renamed from: g */
        public final void mo20311g(Pair<vq0<T>, wv4> pair, wv4 wv4) {
            wv4.mo20292o(new C2339a(pair));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            p000.C2336fz.m17492r(r1);
            p000.C2336fz.m17493s(r2);
            p000.C2336fz.m17491q(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.f12150c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.f12155h.mo18868f(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= com.github.mikephil.charting.utils.Utils.FLOAT_EPSILON) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            r8.mo27295d(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
            r8.mo27294c(r4, r6);
            mo20313i(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
            mo20311g(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
            return true;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo20312h(p000.vq0<T> r8, p000.wv4 r9) {
            /*
                r7 = this;
                android.util.Pair r0 = android.util.Pair.create(r8, r9)
                monitor-enter(r7)
                g04 r1 = p000.g04.this     // Catch:{ all -> 0x0060 }
                K r2 = r7.f12148a     // Catch:{ all -> 0x0060 }
                g04$b r1 = r1.mo20309h(r2)     // Catch:{ all -> 0x0060 }
                if (r1 == r7) goto L_0x0012
                r8 = 0
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                return r8
            L_0x0012:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r1 = r7.f12149b     // Catch:{ all -> 0x0060 }
                r1.add(r0)     // Catch:{ all -> 0x0060 }
                java.util.List r1 = r7.mo20323s()     // Catch:{ all -> 0x0060 }
                java.util.List r2 = r7.mo20324t()     // Catch:{ all -> 0x0060 }
                java.util.List r3 = r7.mo20322r()     // Catch:{ all -> 0x0060 }
                T r4 = r7.f12150c     // Catch:{ all -> 0x0060 }
                float r5 = r7.f12151d     // Catch:{ all -> 0x0060 }
                int r6 = r7.f12152e     // Catch:{ all -> 0x0060 }
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                p000.C2336fz.m17492r(r1)
                p000.C2336fz.m17493s(r2)
                p000.C2336fz.m17491q(r3)
                monitor-enter(r0)
                monitor-enter(r7)     // Catch:{ all -> 0x005d }
                T r1 = r7.f12150c     // Catch:{ all -> 0x005a }
                if (r4 == r1) goto L_0x003b
                r4 = 0
                goto L_0x0043
            L_0x003b:
                if (r4 == 0) goto L_0x0043
                g04 r1 = p000.g04.this     // Catch:{ all -> 0x005a }
                java.io.Closeable r4 = r1.mo18868f(r4)     // Catch:{ all -> 0x005a }
            L_0x0043:
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                if (r4 == 0) goto L_0x0054
                r1 = 0
                int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r1 <= 0) goto L_0x004e
                r8.mo27295d(r5)     // Catch:{ all -> 0x005d }
            L_0x004e:
                r8.mo27294c(r4, r6)     // Catch:{ all -> 0x005d }
                r7.mo20313i(r4)     // Catch:{ all -> 0x005d }
            L_0x0054:
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                r7.mo20311g(r0, r9)
                r8 = 1
                return r8
            L_0x005a:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x005a }
                throw r8     // Catch:{ all -> 0x005d }
            L_0x005d:
                r8 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x005d }
                throw r8
            L_0x0060:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0060 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g04.C2338b.mo20312h(vq0, wv4):boolean");
        }

        /* renamed from: i */
        public final void mo20313i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: j */
        public final synchronized boolean mo20314j() {
            Iterator<Pair<vq0<T>, wv4>> it = this.f12149b.iterator();
            while (it.hasNext()) {
                if (((wv4) it.next().second).mo20285h()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: k */
        public final synchronized boolean mo20315k() {
            Iterator<Pair<vq0<T>, wv4>> it = this.f12149b.iterator();
            while (it.hasNext()) {
                if (!((wv4) it.next().second).mo20289l()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: l */
        public final synchronized Priority mo20316l() {
            Priority priority;
            priority = Priority.LOW;
            Iterator<Pair<vq0<T>, wv4>> it = this.f12149b.iterator();
            while (it.hasNext()) {
                priority = Priority.getHigherPriority(priority, ((wv4) it.next().second).getPriority());
            }
            return priority;
        }

        /* renamed from: m */
        public void mo20317m(g04<K, T>.b bVar) {
            synchronized (this) {
                if (this.f12154g == bVar) {
                    this.f12154g = null;
                    this.f12153f = null;
                    mo20313i(this.f12150c);
                    this.f12150c = null;
                    mo20321q(TriState.UNSET);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r1 = r6.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((p000.wv4) r1.second).mo20281g().mo11172f((p000.wv4) r1.second, p000.g04.m17526e(r5.f12155h), r7, (java.util.Map<java.lang.String, java.lang.String>) null);
            ((p000.vq0) r1.first).mo27293b(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r6.hasNext() == false) goto L_0x0050;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20318n(p000.g04<K, T>.b.b r6, java.lang.Throwable r7) {
            /*
                r5 = this;
                monitor-enter(r5)
                g04<K, T>$b.b r0 = r5.f12154g     // Catch:{ all -> 0x0051 }
                if (r0 == r6) goto L_0x0007
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
                return
            L_0x0007:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r6 = r5.f12149b     // Catch:{ all -> 0x0051 }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0051 }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r0 = r5.f12149b     // Catch:{ all -> 0x0051 }
                r0.clear()     // Catch:{ all -> 0x0051 }
                g04 r0 = p000.g04.this     // Catch:{ all -> 0x0051 }
                K r1 = r5.f12148a     // Catch:{ all -> 0x0051 }
                r0.mo20310j(r1, r5)     // Catch:{ all -> 0x0051 }
                T r0 = r5.f12150c     // Catch:{ all -> 0x0051 }
                r5.mo20313i(r0)     // Catch:{ all -> 0x0051 }
                r0 = 0
                r5.f12150c = r0     // Catch:{ all -> 0x0051 }
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            L_0x0022:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0050
                java.lang.Object r1 = r6.next()
                android.util.Pair r1 = (android.util.Pair) r1
                monitor-enter(r1)
                java.lang.Object r2 = r1.second     // Catch:{ all -> 0x004d }
                wv4 r2 = (p000.wv4) r2     // Catch:{ all -> 0x004d }
                aw4 r2 = r2.mo20281g()     // Catch:{ all -> 0x004d }
                java.lang.Object r3 = r1.second     // Catch:{ all -> 0x004d }
                wv4 r3 = (p000.wv4) r3     // Catch:{ all -> 0x004d }
                g04 r4 = p000.g04.this     // Catch:{ all -> 0x004d }
                java.lang.String r4 = r4.f12146d     // Catch:{ all -> 0x004d }
                r2.mo11172f(r3, r4, r7, r0)     // Catch:{ all -> 0x004d }
                java.lang.Object r2 = r1.first     // Catch:{ all -> 0x004d }
                vq0 r2 = (p000.vq0) r2     // Catch:{ all -> 0x004d }
                r2.mo27293b(r7)     // Catch:{ all -> 0x004d }
                monitor-exit(r1)     // Catch:{ all -> 0x004d }
                goto L_0x0022
            L_0x004d:
                r6 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x004d }
                throw r6
            L_0x0050:
                return
            L_0x0051:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x0051 }
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g04.C2338b.mo20318n(g04$b$b, java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r0.hasNext() == false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
            r2 = r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
            if (p000.C3766zx.m31566e(r9) == false) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
            ((p000.wv4) r2.second).mo20281g().mo11170a((p000.wv4) r2.second, p000.g04.m17526e(r6.f12155h), (java.util.Map<java.lang.String, java.lang.String>) null);
            r3 = r6.f12153f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
            if (r3 == null) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
            ((p000.wv4) r2.second).mo20288k(r3.getExtras());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
            ((p000.wv4) r2.second).mo20276b(p000.g04.m17523b(r6.f12155h), java.lang.Integer.valueOf(r1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
            ((p000.vq0) r2.first).mo27294c(r8, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0088, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
            return;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20319o(p000.g04<K, T>.b.b r7, T r8, int r9) {
            /*
                r6 = this;
                monitor-enter(r6)
                g04<K, T>$b.b r0 = r6.f12154g     // Catch:{ all -> 0x008e }
                if (r0 == r7) goto L_0x0007
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
                return
            L_0x0007:
                T r7 = r6.f12150c     // Catch:{ all -> 0x008e }
                r6.mo20313i(r7)     // Catch:{ all -> 0x008e }
                r7 = 0
                r6.f12150c = r7     // Catch:{ all -> 0x008e }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r0 = r6.f12149b     // Catch:{ all -> 0x008e }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008e }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r1 = r6.f12149b     // Catch:{ all -> 0x008e }
                int r1 = r1.size()     // Catch:{ all -> 0x008e }
                boolean r2 = p000.C3766zx.m31567f(r9)     // Catch:{ all -> 0x008e }
                if (r2 == 0) goto L_0x002c
                g04 r2 = p000.g04.this     // Catch:{ all -> 0x008e }
                java.io.Closeable r2 = r2.mo18868f(r8)     // Catch:{ all -> 0x008e }
                r6.f12150c = r2     // Catch:{ all -> 0x008e }
                r6.f12152e = r9     // Catch:{ all -> 0x008e }
                goto L_0x0038
            L_0x002c:
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r2 = r6.f12149b     // Catch:{ all -> 0x008e }
                r2.clear()     // Catch:{ all -> 0x008e }
                g04 r2 = p000.g04.this     // Catch:{ all -> 0x008e }
                K r3 = r6.f12148a     // Catch:{ all -> 0x008e }
                r2.mo20310j(r3, r6)     // Catch:{ all -> 0x008e }
            L_0x0038:
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
            L_0x0039:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x008d
                java.lang.Object r2 = r0.next()
                android.util.Pair r2 = (android.util.Pair) r2
                monitor-enter(r2)
                boolean r3 = p000.C3766zx.m31566e(r9)     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0081
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x008a }
                wv4 r3 = (p000.wv4) r3     // Catch:{ all -> 0x008a }
                aw4 r3 = r3.mo20281g()     // Catch:{ all -> 0x008a }
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x008a }
                wv4 r4 = (p000.wv4) r4     // Catch:{ all -> 0x008a }
                g04 r5 = p000.g04.this     // Catch:{ all -> 0x008a }
                java.lang.String r5 = r5.f12146d     // Catch:{ all -> 0x008a }
                r3.mo11170a(r4, r5, r7)     // Catch:{ all -> 0x008a }
                fz r3 = r6.f12153f     // Catch:{ all -> 0x008a }
                if (r3 == 0) goto L_0x0070
                java.lang.Object r4 = r2.second     // Catch:{ all -> 0x008a }
                wv4 r4 = (p000.wv4) r4     // Catch:{ all -> 0x008a }
                java.util.Map r3 = r3.getExtras()     // Catch:{ all -> 0x008a }
                r4.mo20288k(r3)     // Catch:{ all -> 0x008a }
            L_0x0070:
                java.lang.Object r3 = r2.second     // Catch:{ all -> 0x008a }
                wv4 r3 = (p000.wv4) r3     // Catch:{ all -> 0x008a }
                g04 r4 = p000.g04.this     // Catch:{ all -> 0x008a }
                java.lang.String r4 = r4.f12147e     // Catch:{ all -> 0x008a }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x008a }
                r3.mo20276b(r4, r5)     // Catch:{ all -> 0x008a }
            L_0x0081:
                java.lang.Object r3 = r2.first     // Catch:{ all -> 0x008a }
                vq0 r3 = (p000.vq0) r3     // Catch:{ all -> 0x008a }
                r3.mo27294c(r8, r9)     // Catch:{ all -> 0x008a }
                monitor-exit(r2)     // Catch:{ all -> 0x008a }
                goto L_0x0039
            L_0x008a:
                r7 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x008a }
                throw r7
            L_0x008d:
                return
            L_0x008e:
                r7 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x008e }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g04.C2338b.mo20319o(g04$b$b, java.io.Closeable, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((p000.vq0) r0.first).mo27295d(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo20320p(p000.g04<K, T>.b.b r3, float r4) {
            /*
                r2 = this;
                monitor-enter(r2)
                g04<K, T>$b.b r0 = r2.f12154g     // Catch:{ all -> 0x002a }
                if (r0 == r3) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                r2.f12151d = r4     // Catch:{ all -> 0x002a }
                java.util.concurrent.CopyOnWriteArraySet<android.util.Pair<vq0<T>, wv4>> r3 = r2.f12149b     // Catch:{ all -> 0x002a }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x002a }
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
            L_0x0010:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0029
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                monitor-enter(r0)
                java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0026 }
                vq0 r1 = (p000.vq0) r1     // Catch:{ all -> 0x0026 }
                r1.mo27295d(r4)     // Catch:{ all -> 0x0026 }
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0010
            L_0x0026:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0026 }
                throw r3
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g04.C2338b.mo20320p(g04$b$b, float):void");
        }

        /* renamed from: q */
        public final void mo20321q(TriState triState) {
            boolean z;
            synchronized (this) {
                boolean z2 = true;
                if (this.f12153f == null) {
                    z = true;
                } else {
                    z = false;
                }
                au4.m10787b(Boolean.valueOf(z));
                if (this.f12154g != null) {
                    z2 = false;
                }
                au4.m10787b(Boolean.valueOf(z2));
                if (this.f12149b.isEmpty()) {
                    g04.this.mo20310j(this.f12148a, this);
                    return;
                }
                wv4 wv4 = (wv4) this.f12149b.iterator().next().second;
                C2336fz fzVar = new C2336fz(wv4.mo20286i(), wv4.getId(), wv4.mo20281g(), wv4.mo20275a(), wv4.mo20291n(), mo20315k(), mo20314j(), mo20316l(), wv4.mo20277c());
                this.f12153f = fzVar;
                fzVar.mo20288k(wv4.getExtras());
                if (triState.isSet()) {
                    this.f12153f.mo20276b("started_as_prefetch", Boolean.valueOf(triState.asBoolean()));
                }
                C2340b bVar = new C2340b();
                this.f12154g = bVar;
                C2336fz fzVar2 = this.f12153f;
                g04.this.f12144b.mo11350a(bVar, fzVar2);
            }
        }

        /* renamed from: r */
        public final synchronized List<xv4> mo20322r() {
            C2336fz fzVar = this.f12153f;
            if (fzVar == null) {
                return null;
            }
            return fzVar.mo20295v(mo20314j());
        }

        /* renamed from: s */
        public final synchronized List<xv4> mo20323s() {
            C2336fz fzVar = this.f12153f;
            if (fzVar == null) {
                return null;
            }
            return fzVar.mo20296w(mo20315k());
        }

        /* renamed from: t */
        public final synchronized List<xv4> mo20324t() {
            C2336fz fzVar = this.f12153f;
            if (fzVar == null) {
                return null;
            }
            return fzVar.mo20297x(mo20316l());
        }
    }

    public g04(vv4<T> vv4, String str, String str2) {
        this(vv4, str, str2, false);
    }

    /* renamed from: a */
    public void mo11350a(vq0<T> vq0, wv4 wv4) {
        boolean z;
        g04<K, T>.C1599b h;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("MultiplexProducer#produceResults");
            }
            wv4.mo20281g().mo11176k(wv4, this.f12146d);
            Object i = mo18869i(wv4);
            do {
                z = false;
                synchronized (this) {
                    h = mo20309h(i);
                    if (h == null) {
                        h = mo20308g(i);
                        z = true;
                    }
                }
            } while (!h.mo20312h(vq0, wv4));
            if (z) {
                h.mo20321q(TriState.valueOf(wv4.mo20289l()));
            }
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        } catch (Throwable th) {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            throw th;
        }
    }

    /* renamed from: f */
    public abstract T mo18868f(T t);

    /* renamed from: g */
    public final synchronized g04<K, T>.C1599b mo20308g(K k) {
        g04<K, T>.C1599b bVar;
        bVar = new C2338b(k);
        this.f12143a.put(k, bVar);
        return bVar;
    }

    /* renamed from: h */
    public synchronized g04<K, T>.C1599b mo20309h(K k) {
        return this.f12143a.get(k);
    }

    /* renamed from: i */
    public abstract K mo18869i(wv4 wv4);

    /* renamed from: j */
    public synchronized void mo20310j(K k, g04<K, T>.C1599b bVar) {
        if (this.f12143a.get(k) == bVar) {
            this.f12143a.remove(k);
        }
    }

    public g04(vv4<T> vv4, String str, String str2, boolean z) {
        this.f12144b = vv4;
        this.f12143a = new HashMap();
        this.f12145c = z;
        this.f12146d = str;
        this.f12147e = str2;
    }
}
