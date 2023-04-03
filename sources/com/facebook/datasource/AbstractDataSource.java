package com.facebook.datasource;

import android.util.Pair;
import com.github.mikephil.charting.utils.Utils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public abstract class AbstractDataSource<T> implements z11<T> {

    /* renamed from: h */
    public static volatile C1930c f9499h;

    /* renamed from: a */
    public Map<String, Object> f9500a;

    /* renamed from: b */
    public DataSourceStatus f9501b = DataSourceStatus.IN_PROGRESS;

    /* renamed from: c */
    public boolean f9502c = false;

    /* renamed from: d */
    public T f9503d = null;

    /* renamed from: e */
    public Throwable f9504e = null;

    /* renamed from: f */
    public float f9505f = Utils.FLOAT_EPSILON;

    /* renamed from: g */
    public final ConcurrentLinkedQueue<Pair<e21<T>, Executor>> f9506g = new ConcurrentLinkedQueue<>();

    public enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* renamed from: com.facebook.datasource.AbstractDataSource$a */
    public class C1928a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f9508a;

        /* renamed from: d */
        public final /* synthetic */ e21 f9509d;

        /* renamed from: e */
        public final /* synthetic */ boolean f9510e;

        public C1928a(boolean z, e21 e21, boolean z2) {
            this.f9508a = z;
            this.f9509d = e21;
            this.f9510e = z2;
        }

        public void run() {
            if (this.f9508a) {
                this.f9509d.mo18427b(AbstractDataSource.this);
            } else if (this.f9510e) {
                this.f9509d.mo18428c(AbstractDataSource.this);
            } else {
                this.f9509d.mo18429d(AbstractDataSource.this);
            }
        }
    }

    /* renamed from: com.facebook.datasource.AbstractDataSource$b */
    public class C1929b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ e21 f9512a;

        public C1929b(e21 e21) {
            this.f9512a = e21;
        }

        public void run() {
            this.f9512a.mo11417a(AbstractDataSource.this);
        }
    }

    /* renamed from: com.facebook.datasource.AbstractDataSource$c */
    public interface C1930c {
        /* renamed from: a */
        Runnable mo13215a(Runnable runnable, String str);
    }

    /* renamed from: h */
    public static C1930c m13329h() {
        return f9499h;
    }

    /* renamed from: a */
    public synchronized boolean mo13189a() {
        boolean z;
        if (this.f9503d != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public synchronized boolean mo13190b() {
        boolean z;
        if (this.f9501b != DataSourceStatus.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public synchronized Throwable mo13191c() {
        return this.f9504e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo13196g(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (mo13190b() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        mo13202l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f9506g.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f9502c     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f9502c = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f9503d     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f9503d = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo13196g(r1)
        L_0x0016:
            boolean r1 = r3.mo13190b()
            if (r1 != 0) goto L_0x001f
            r3.mo13202l()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<e21<T>, java.util.concurrent.Executor>> r1 = r3.f9506g     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.close():boolean");
    }

    /* renamed from: d */
    public synchronized float mo13193d() {
        return this.f9505f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        mo13201k(r3, r4, mo13199i(), mo13212v());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13194e(p000.e21<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            p000.au4.m10792g(r3)
            p000.au4.m10792g(r4)
            monitor-enter(r2)
            boolean r0 = r2.f9502c     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r2.f9501b     // Catch:{ all -> 0x0041 }
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<e21<T>, java.util.concurrent.Executor>> r0 = r2.f9506g     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.mo13189a()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo13190b()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.mo13212v()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.mo13199i()
            boolean r1 = r2.mo13212v()
            r2.mo13201k(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.mo13194e(e21, java.util.concurrent.Executor):void");
    }

    /* renamed from: f */
    public boolean mo13195f() {
        return false;
    }

    /* renamed from: g */
    public void mo13196g(T t) {
    }

    public Map<String, Object> getExtras() {
        return this.f9500a;
    }

    public synchronized T getResult() {
        return this.f9503d;
    }

    /* renamed from: i */
    public synchronized boolean mo13199i() {
        boolean z;
        if (this.f9501b == DataSourceStatus.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public synchronized boolean mo13200j() {
        return this.f9502c;
    }

    /* renamed from: k */
    public void mo13201k(e21<T> e21, Executor executor, boolean z, boolean z2) {
        Runnable aVar = new C1928a(z, e21, z2);
        C1930c h = m13329h();
        if (h != null) {
            aVar = h.mo13215a(aVar, "AbstractDataSource_notifyDataSubscriber");
        }
        executor.execute(aVar);
    }

    /* renamed from: l */
    public final void mo13202l() {
        boolean i = mo13199i();
        boolean v = mo13212v();
        Iterator<Pair<e21<T>, Executor>> it = this.f9506g.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            mo13201k((e21) next.first, (Executor) next.second, i, v);
        }
    }

    /* renamed from: m */
    public void mo13203m() {
        Iterator<Pair<e21<T>, Executor>> it = this.f9506g.iterator();
        while (it.hasNext()) {
            Pair next = it.next();
            ((Executor) next.second).execute(new C1929b((e21) next.first));
        }
    }

    /* renamed from: n */
    public void mo13204n(Map<String, Object> map) {
        this.f9500a = map;
    }

    /* renamed from: o */
    public boolean mo13205o(Throwable th) {
        return mo13206p(th, (Map<String, Object>) null);
    }

    /* renamed from: p */
    public boolean mo13206p(Throwable th, Map<String, Object> map) {
        boolean q = mo13207q(th, map);
        if (q) {
            mo13202l();
        }
        return q;
    }

    /* renamed from: q */
    public final synchronized boolean mo13207q(Throwable th, Map<String, Object> map) {
        if (!this.f9502c) {
            if (this.f9501b == DataSourceStatus.IN_PROGRESS) {
                this.f9501b = DataSourceStatus.FAILURE;
                this.f9504e = th;
                this.f9500a = map;
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo13208r(float f) {
        boolean s = mo13209s(f);
        if (s) {
            mo13203m();
        }
        return s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo13209s(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f9502c     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r3.f9501b     // Catch:{ all -> 0x001c }
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r2 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f9505f     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f9505f = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.mo13209s(float):boolean");
    }

    /* renamed from: t */
    public boolean mo13210t(T t, boolean z, Map<String, Object> map) {
        mo13204n(map);
        boolean u = mo13211u(t, z);
        if (u) {
            mo13202l();
        }
        return u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0025, code lost:
        if (r4 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        mo13196g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0032, code lost:
        return false;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13211u(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003a }
            boolean r1 = r3.f9502c     // Catch:{ all -> 0x0037 }
            if (r1 != 0) goto L_0x002b
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = r3.f9501b     // Catch:{ all -> 0x0037 }
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r2 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch:{ all -> 0x0037 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002b
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r5 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.SUCCESS     // Catch:{ all -> 0x0037 }
            r3.f9501b = r5     // Catch:{ all -> 0x0037 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f9505f = r5     // Catch:{ all -> 0x0037 }
        L_0x0017:
            T r5 = r3.f9503d     // Catch:{ all -> 0x0037 }
            if (r5 == r4) goto L_0x0022
            r3.f9503d = r4     // Catch:{ all -> 0x001f }
            r4 = r5
            goto L_0x0023
        L_0x001f:
            r4 = move-exception
            r0 = r5
            goto L_0x0038
        L_0x0022:
            r4 = r0
        L_0x0023:
            r5 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002a
            r3.mo13196g(r4)
        L_0x002a:
            return r5
        L_0x002b:
            r5 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x0032
            r3.mo13196g(r4)
        L_0x0032:
            return r5
        L_0x0033:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0040
            r3.mo13196g(r0)
        L_0x0040:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.mo13211u(java.lang.Object, boolean):boolean");
    }

    /* renamed from: v */
    public final synchronized boolean mo13212v() {
        boolean z;
        if (!mo13200j() || mo13190b()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }
}
