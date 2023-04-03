package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Set;

public abstract class BasePool<V> implements is4<V> {

    /* renamed from: a */
    public final Class<?> f9616a;

    /* renamed from: b */
    public final ht3 f9617b;

    /* renamed from: c */
    public final ms4 f9618c;

    /* renamed from: d */
    public final SparseArray<j40<V>> f9619d;

    /* renamed from: e */
    public final Set<V> f9620e;

    /* renamed from: f */
    public boolean f9621f;

    /* renamed from: g */
    public final C1945a f9622g;

    /* renamed from: h */
    public final C1945a f9623h;

    /* renamed from: i */
    public final ns4 f9624i;

    /* renamed from: j */
    public boolean f9625j;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.BasePool$a */
    public static class C1945a {

        /* renamed from: a */
        public int f9626a;

        /* renamed from: b */
        public int f9627b;

        /* renamed from: a */
        public void mo13351a(int i) {
            int i2;
            int i3 = this.f9627b;
            if (i3 < i || (i2 = this.f9626a) <= 0) {
                oy1.m24439z("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f9627b), Integer.valueOf(this.f9626a));
                return;
            }
            this.f9626a = i2 - 1;
            this.f9627b = i3 - i;
        }

        /* renamed from: b */
        public void mo13352b(int i) {
            this.f9626a++;
            this.f9627b += i;
        }
    }

    public BasePool(ht3 ht3, ms4 ms4, ns4 ns4) {
        this.f9616a = getClass();
        this.f9617b = (ht3) au4.m10792g(ht3);
        ms4 ms42 = (ms4) au4.m10792g(ms4);
        this.f9618c = ms42;
        this.f9624i = (ns4) au4.m10792g(ns4);
        this.f9619d = new SparseArray<>();
        if (ms42.f15246f) {
            mo13342q();
        } else {
            mo13346u(new SparseIntArray(0));
        }
        this.f9620e = ly5.m21895b();
        this.f9623h = new C1945a();
        this.f9622g = new C1945a();
    }

    /* renamed from: a */
    public void mo360a(V v) {
        au4.m10792g(v);
        int n = mo13339n(v);
        int o = mo13340o(n);
        synchronized (this) {
            j40 l = mo13337l(n);
            if (!this.f9620e.remove(v)) {
                oy1.m24419f(this.f9616a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                mo13335j(v);
                this.f9624i.mo23801b(o);
            } else {
                if (l != null && !l.mo21720f() && !mo13344s()) {
                    if (mo13345t(v)) {
                        l.mo21722h(v);
                        this.f9623h.mo13352b(o);
                        this.f9622g.mo13351a(o);
                        this.f9624i.mo23802c(o);
                        if (oy1.m24426m(2)) {
                            oy1.m24429p(this.f9616a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                        }
                    }
                }
                if (l != null) {
                    l.mo21716b();
                }
                if (oy1.m24426m(2)) {
                    oy1.m24429p(this.f9616a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(n));
                }
                mo13335j(v);
                this.f9622g.mo13351a(o);
                this.f9624i.mo23801b(o);
            }
            mo13347v();
        }
    }

    /* renamed from: f */
    public abstract V mo13330f(int i);

    /* renamed from: g */
    public synchronized boolean mo13332g(int i) {
        if (this.f9625j) {
            return true;
        }
        ms4 ms4 = this.f9618c;
        int i2 = ms4.f15241a;
        int i3 = this.f9622g.f9627b;
        if (i > i2 - i3) {
            this.f9624i.mo23806g();
            return false;
        }
        int i4 = ms4.f15242b;
        if (i > i4 - (i3 + this.f9623h.f9627b)) {
            mo13349x(i4 - i);
        }
        if (i <= i2 - (this.f9622g.f9627b + this.f9623h.f9627b)) {
            return true;
        }
        this.f9624i.mo23806g();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = mo13330f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.f9622g.mo13351a(r2);
        r4 = mo13336k(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r4 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        r4.mo21716b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        p000.pp6.m25129c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        p000.au4.m10794i(r5.f9620e.add(r0));
        mo13350y();
        r5.f9624i.mo23803d(r2);
        mo13347v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        if (p000.oy1.m24426m(2) == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        p000.oy1.m24429p(r5.f9616a, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(int r6) {
        /*
            r5 = this;
            r5.mo13333h()
            int r6 = r5.mo13338m(r6)
            monitor-enter(r5)
            j40 r0 = r5.mo13336k(r6)     // Catch:{ all -> 0x00ca }
            r1 = 2
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = r5.mo13341p(r0)     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0053
            java.util.Set<V> r6 = r5.f9620e     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00ca }
            p000.au4.m10794i(r6)     // Catch:{ all -> 0x00ca }
            int r6 = r5.mo13339n(r2)     // Catch:{ all -> 0x00ca }
            int r0 = r5.mo13340o(r6)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f9622g     // Catch:{ all -> 0x00ca }
            r3.mo13352b(r0)     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f9623h     // Catch:{ all -> 0x00ca }
            r3.mo13351a(r0)     // Catch:{ all -> 0x00ca }
            ns4 r3 = r5.f9624i     // Catch:{ all -> 0x00ca }
            r3.mo23804e(r0)     // Catch:{ all -> 0x00ca }
            r5.mo13347v()     // Catch:{ all -> 0x00ca }
            boolean r0 = p000.oy1.m24426m(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0051
            java.lang.Class<?> r0 = r5.f9616a     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ca }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ca }
            p000.oy1.m24429p(r0, r1, r3, r6)     // Catch:{ all -> 0x00ca }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            return r2
        L_0x0053:
            int r2 = r5.mo13340o(r6)     // Catch:{ all -> 0x00ca }
            boolean r3 = r5.mo13332g(r2)     // Catch:{ all -> 0x00ca }
            if (r3 == 0) goto L_0x00b8
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f9622g     // Catch:{ all -> 0x00ca }
            r3.mo13352b(r2)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0067
            r0.mo21719e()     // Catch:{ all -> 0x00ca }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            r0 = 0
            java.lang.Object r0 = r5.mo13330f(r6)     // Catch:{ all -> 0x006e }
            goto L_0x0082
        L_0x006e:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.BasePool$a r4 = r5.f9622g     // Catch:{ all -> 0x00b5 }
            r4.mo13351a(r2)     // Catch:{ all -> 0x00b5 }
            j40 r4 = r5.mo13336k(r6)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x007e
            r4.mo21716b()     // Catch:{ all -> 0x00b5 }
        L_0x007e:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            p000.pp6.m25129c(r3)
        L_0x0082:
            monitor-enter(r5)
            java.util.Set<V> r3 = r5.f9620e     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b2 }
            p000.au4.m10794i(r3)     // Catch:{ all -> 0x00b2 }
            r5.mo13350y()     // Catch:{ all -> 0x00b2 }
            ns4 r3 = r5.f9624i     // Catch:{ all -> 0x00b2 }
            r3.mo23803d(r2)     // Catch:{ all -> 0x00b2 }
            r5.mo13347v()     // Catch:{ all -> 0x00b2 }
            boolean r1 = p000.oy1.m24426m(r1)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Class<?> r1 = r5.f9616a     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b2 }
            p000.oy1.m24429p(r1, r2, r3, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            return r0
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b2 }
            throw r6
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r6
        L_0x00b8:
            com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException r6 = new com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException     // Catch:{ all -> 0x00ca }
            ms4 r0 = r5.f9618c     // Catch:{ all -> 0x00ca }
            int r0 = r0.f15241a     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r5.f9622g     // Catch:{ all -> 0x00ca }
            int r1 = r1.f9627b     // Catch:{ all -> 0x00ca }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r5.f9623h     // Catch:{ all -> 0x00ca }
            int r3 = r3.f9627b     // Catch:{ all -> 0x00ca }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00ca }
            throw r6     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ca }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.get(int):java.lang.Object");
    }

    /* renamed from: h */
    public final synchronized void mo13333h() {
        boolean z;
        if (mo13344s()) {
            if (this.f9623h.f9627b != 0) {
                z = false;
                au4.m10794i(z);
            }
        }
        z = true;
        au4.m10794i(z);
    }

    /* renamed from: i */
    public final void mo13334i(SparseIntArray sparseIntArray) {
        this.f9619d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int keyAt = sparseIntArray.keyAt(i);
            this.f9619d.put(keyAt, new j40(mo13340o(keyAt), sparseIntArray.valueAt(i), 0, this.f9618c.f15246f));
        }
    }

    /* renamed from: j */
    public abstract void mo13335j(V v);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p000.j40<V> mo13336k(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<j40<V>> r0 = r3.f9619d     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            j40 r0 = (p000.j40) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f9621f     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = p000.oy1.m24426m(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f9616a     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            p000.oy1.m24428o(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            j40 r0 = r3.mo13348w(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<j40<V>> r1 = r3.f9619d     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo13336k(int):j40");
    }

    /* renamed from: l */
    public final synchronized j40<V> mo13337l(int i) {
        return this.f9619d.get(i);
    }

    /* renamed from: m */
    public abstract int mo13338m(int i);

    /* renamed from: n */
    public abstract int mo13339n(V v);

    /* renamed from: o */
    public abstract int mo13340o(int i);

    /* renamed from: p */
    public synchronized V mo13341p(j40<V> j40) {
        return j40.mo21717c();
    }

    /* renamed from: q */
    public final synchronized void mo13342q() {
        SparseIntArray sparseIntArray = this.f9618c.f15243c;
        if (sparseIntArray != null) {
            mo13334i(sparseIntArray);
            this.f9621f = false;
        } else {
            this.f9621f = true;
        }
    }

    /* renamed from: r */
    public void mo13343r() {
        this.f9617b.mo21382a(this);
        this.f9624i.mo23805f(this);
    }

    /* renamed from: s */
    public synchronized boolean mo13344s() {
        boolean z;
        if (this.f9622g.f9627b + this.f9623h.f9627b > this.f9618c.f15242b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f9624i.mo23800a();
        }
        return z;
    }

    /* renamed from: t */
    public boolean mo13345t(V v) {
        au4.m10792g(v);
        return true;
    }

    /* renamed from: u */
    public final synchronized void mo13346u(SparseIntArray sparseIntArray) {
        au4.m10792g(sparseIntArray);
        this.f9619d.clear();
        SparseIntArray sparseIntArray2 = this.f9618c.f15243c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f9619d.put(keyAt, new j40(mo13340o(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f9618c.f15246f));
            }
            this.f9621f = false;
        } else {
            this.f9621f = true;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    /* renamed from: v */
    public final void mo13347v() {
        if (oy1.m24426m(2)) {
            oy1.m24431r(this.f9616a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f9622g.f9626a), Integer.valueOf(this.f9622g.f9627b), Integer.valueOf(this.f9623h.f9626a), Integer.valueOf(this.f9623h.f9627b));
        }
    }

    /* renamed from: w */
    public j40<V> mo13348w(int i) {
        return new j40<>(mo13340o(i), Integer.MAX_VALUE, 0, this.f9618c.f15246f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo13349x(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.BasePool$a r0 = r7.f9622g     // Catch:{ all -> 0x008c }
            int r0 = r0.f9627b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r1 = r7.f9623h     // Catch:{ all -> 0x008c }
            int r1 = r1.f9627b     // Catch:{ all -> 0x008c }
            int r0 = r0 + r1
            int r0 = r0 - r8
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 > 0) goto L_0x0013
            monitor-exit(r7)
            return
        L_0x0013:
            r1 = 2
            boolean r2 = p000.oy1.m24426m(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x0036
            java.lang.Class<?> r2 = r7.f9616a     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r5 = r7.f9622g     // Catch:{ all -> 0x008c }
            int r5 = r5.f9627b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r6 = r7.f9623h     // Catch:{ all -> 0x008c }
            int r6 = r6.f9627b     // Catch:{ all -> 0x008c }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            p000.oy1.m24430q(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008c }
        L_0x0036:
            r7.mo13347v()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x003a:
            android.util.SparseArray<j40<V>> r3 = r7.f9619d     // Catch:{ all -> 0x008c }
            int r3 = r3.size()     // Catch:{ all -> 0x008c }
            if (r2 >= r3) goto L_0x0069
            if (r0 > 0) goto L_0x0045
            goto L_0x0069
        L_0x0045:
            android.util.SparseArray<j40<V>> r3 = r7.f9619d     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = p000.au4.m10792g(r3)     // Catch:{ all -> 0x008c }
            j40 r3 = (p000.j40) r3     // Catch:{ all -> 0x008c }
        L_0x0051:
            if (r0 <= 0) goto L_0x0066
            java.lang.Object r4 = r3.mo21721g()     // Catch:{ all -> 0x008c }
            if (r4 != 0) goto L_0x005a
            goto L_0x0066
        L_0x005a:
            r7.mo13335j(r4)     // Catch:{ all -> 0x008c }
            int r4 = r3.f13505a     // Catch:{ all -> 0x008c }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.BasePool$a r5 = r7.f9623h     // Catch:{ all -> 0x008c }
            r5.mo13351a(r4)     // Catch:{ all -> 0x008c }
            goto L_0x0051
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003a
        L_0x0069:
            r7.mo13347v()     // Catch:{ all -> 0x008c }
            boolean r0 = p000.oy1.m24426m(r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Class<?> r0 = r7.f9616a     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r2 = r7.f9622g     // Catch:{ all -> 0x008c }
            int r2 = r2.f9627b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.BasePool$a r3 = r7.f9623h     // Catch:{ all -> 0x008c }
            int r3 = r3.f9627b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008c }
            p000.oy1.m24429p(r0, r1, r8, r2)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.BasePool.mo13349x(int):void");
    }

    /* renamed from: y */
    public synchronized void mo13350y() {
        if (mo13344s()) {
            mo13349x(this.f9618c.f15242b);
        }
    }

    public BasePool(ht3 ht3, ms4 ms4, ns4 ns4, boolean z) {
        this(ht3, ms4, ns4);
        this.f9625j = z;
    }
}
