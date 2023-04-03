package p000;

import java.util.Comparator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* renamed from: hd3 */
/* compiled from: LBQSpliterator */
public final class hd3<E> implements z66<E> {

    /* renamed from: h */
    public static final Unsafe f29540h;

    /* renamed from: i */
    public static final long f29541i;

    /* renamed from: j */
    public static final long f29542j;

    /* renamed from: k */
    public static final long f29543k;

    /* renamed from: l */
    public static final long f29544l;

    /* renamed from: m */
    public static final long f29545m;

    /* renamed from: a */
    public final LinkedBlockingQueue<E> f29546a;

    /* renamed from: b */
    public final ReentrantLock f29547b;

    /* renamed from: c */
    public final ReentrantLock f29548c;

    /* renamed from: d */
    public Object f29549d;

    /* renamed from: e */
    public int f29550e;

    /* renamed from: f */
    public boolean f29551f;

    /* renamed from: g */
    public long f29552g;

    static {
        Unsafe unsafe = o47.f32276a;
        f29540h = unsafe;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.LinkedBlockingQueue$Node");
            f29541i = unsafe.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("head"));
            f29542j = unsafe.objectFieldOffset(cls.getDeclaredField("item"));
            f29543k = unsafe.objectFieldOffset(cls.getDeclaredField("next"));
            f29544l = unsafe.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("putLock"));
            f29545m = unsafe.objectFieldOffset(LinkedBlockingQueue.class.getDeclaredField("takeLock"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public hd3(LinkedBlockingQueue<E> linkedBlockingQueue) {
        this.f29546a = linkedBlockingQueue;
        this.f29552g = (long) linkedBlockingQueue.size();
        this.f29547b = m45143o(linkedBlockingQueue);
        this.f29548c = m45144p(linkedBlockingQueue);
    }

    /* renamed from: l */
    public static <T> Object m45140l(LinkedBlockingQueue<T> linkedBlockingQueue) {
        return m45141m(f29540h.getObject(linkedBlockingQueue, f29541i));
    }

    /* renamed from: m */
    public static Object m45141m(Object obj) {
        return f29540h.getObject(obj, f29543k);
    }

    /* renamed from: n */
    public static <T> T m45142n(Object obj) {
        return f29540h.getObject(obj, f29542j);
    }

    /* renamed from: o */
    public static ReentrantLock m45143o(LinkedBlockingQueue<?> linkedBlockingQueue) {
        return (ReentrantLock) f29540h.getObject(linkedBlockingQueue, f29544l);
    }

    /* renamed from: p */
    public static ReentrantLock m45144p(LinkedBlockingQueue<?> linkedBlockingQueue) {
        return (ReentrantLock) f29540h.getObject(linkedBlockingQueue, f29545m);
    }

    /* renamed from: q */
    public static <T> z66<T> m45145q(LinkedBlockingQueue<T> linkedBlockingQueue) {
        return new hd3(linkedBlockingQueue);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        if (!this.f29551f) {
            this.f29551f = true;
            Object obj = this.f29549d;
            this.f29549d = null;
            mo43148i(xq0, obj);
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        if (this.f29551f) {
            return false;
        }
        Object obj = null;
        mo43149j();
        try {
            Object obj2 = this.f29549d;
            if (obj2 != null || (obj2 = m45140l(this.f29546a)) != null) {
                do {
                    obj = m45142n(obj2);
                    obj2 = mo43151r(obj2);
                    if (obj != null) {
                        break;
                    }
                } while (obj2 != null);
            }
            this.f29549d = obj2;
            if (obj2 == null) {
                this.f29551f = true;
            }
            if (obj == null) {
                return false;
            }
            xq0.accept(obj);
            return true;
        } finally {
            mo43150k();
        }
    }

    public int characteristics() {
        return 4368;
    }

    public long estimateSize() {
        return this.f29552g;
    }

    public Comparator<? super E> getComparator() {
        return b76.m32376h(this);
    }

    public long getExactSizeIfKnown() {
        return b76.m32377i(this);
    }

    public boolean hasCharacteristics(int i) {
        return b76.m32379k(this, i);
    }

    /* renamed from: i */
    public void mo43148i(xq0<? super E> xq0, Object obj) {
        Object[] objArr = null;
        int i = 0;
        do {
            mo43149j();
            if (objArr == null) {
                if (obj == null) {
                    try {
                        obj = m45140l(this.f29546a);
                    } catch (Throwable th) {
                        mo43150k();
                        throw th;
                    }
                }
                Object obj2 = obj;
                while (true) {
                    if (obj2 != null) {
                        if (m45142n(obj2) != null && (i = i + 1) == 64) {
                            break;
                        }
                        obj2 = mo43151r(obj2);
                    } else {
                        break;
                    }
                }
                objArr = new Object[i];
            }
            int i2 = 0;
            while (obj != null && i2 < i) {
                Object n = m45142n(obj);
                objArr[i2] = n;
                if (n != null) {
                    i2++;
                }
                obj = mo43151r(obj);
            }
            mo43150k();
            for (int i3 = 0; i3 < i2; i3++) {
                xq0.accept(objArr[i3]);
            }
            if (i2 <= 0) {
                return;
            }
        } while (obj != null);
    }

    /* renamed from: j */
    public final void mo43149j() {
        this.f29547b.lock();
        this.f29548c.lock();
    }

    /* renamed from: k */
    public final void mo43150k() {
        this.f29548c.unlock();
        this.f29547b.unlock();
    }

    /* renamed from: r */
    public Object mo43151r(Object obj) {
        Object m = m45141m(obj);
        if (obj == m) {
            return m45140l(this.f29546a);
        }
        return m;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.z66<E> trySplit() {
        /*
            r10 = this;
            java.util.concurrent.LinkedBlockingQueue<E> r0 = r10.f29546a
            boolean r1 = r10.f29551f
            if (r1 != 0) goto L_0x0072
            java.lang.Object r1 = r10.f29549d
            if (r1 != 0) goto L_0x0010
            java.lang.Object r1 = m45140l(r0)
            if (r1 == 0) goto L_0x0072
        L_0x0010:
            java.lang.Object r1 = m45141m(r1)
            if (r1 == 0) goto L_0x0072
            int r1 = r10.f29550e
            r2 = 1
            int r1 = r1 + r2
            r3 = 33554432(0x2000000, float:9.403955E-38)
            int r1 = java.lang.Math.min(r1, r3)
            r10.f29550e = r1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r4 = r10.f29549d
            r10.mo43149j()
            r5 = 0
            if (r4 != 0) goto L_0x0037
            java.lang.Object r4 = m45140l(r0)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0033
            goto L_0x0037
        L_0x0033:
            r0 = r5
            goto L_0x004f
        L_0x0035:
            r0 = move-exception
            goto L_0x004b
        L_0x0037:
            r0 = r5
        L_0x0038:
            if (r4 == 0) goto L_0x004f
            if (r0 >= r1) goto L_0x004f
            java.lang.Object r6 = m45142n(r4)     // Catch:{ all -> 0x0035 }
            r3[r0] = r6     // Catch:{ all -> 0x0035 }
            if (r6 == 0) goto L_0x0046
            int r0 = r0 + 1
        L_0x0046:
            java.lang.Object r4 = r10.mo43151r(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x0038
        L_0x004b:
            r10.mo43150k()
            throw r0
        L_0x004f:
            r10.mo43150k()
            r10.f29549d = r4
            r6 = 0
            if (r4 != 0) goto L_0x005d
            r10.f29552g = r6
            r10.f29551f = r2
            goto L_0x0069
        L_0x005d:
            long r1 = r10.f29552g
            long r8 = (long) r0
            long r1 = r1 - r8
            r10.f29552g = r1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0069
            r10.f29552g = r6
        L_0x0069:
            if (r0 <= 0) goto L_0x0072
            r1 = 4368(0x1110, float:6.121E-42)
            z66 r0 = p000.b76.m32393y(r3, r5, r0, r1)
            return r0
        L_0x0072:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.hd3.trySplit():z66");
    }
}
