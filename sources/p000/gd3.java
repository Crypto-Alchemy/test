package p000;

import java.util.Comparator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* renamed from: gd3 */
/* compiled from: LBDSpliterator */
public final class gd3<E> implements z66<E> {

    /* renamed from: g */
    public static final Unsafe f29171g;

    /* renamed from: h */
    public static final long f29172h;

    /* renamed from: i */
    public static final long f29173i;

    /* renamed from: j */
    public static final long f29174j;

    /* renamed from: k */
    public static final long f29175k;

    /* renamed from: a */
    public final LinkedBlockingDeque<E> f29176a;

    /* renamed from: b */
    public final ReentrantLock f29177b;

    /* renamed from: c */
    public Object f29178c;

    /* renamed from: d */
    public int f29179d;

    /* renamed from: e */
    public boolean f29180e;

    /* renamed from: f */
    public long f29181f;

    static {
        Unsafe unsafe = o47.f32276a;
        f29171g = unsafe;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.LinkedBlockingDeque$Node");
            f29172h = unsafe.objectFieldOffset(LinkedBlockingDeque.class.getDeclaredField("first"));
            f29173i = unsafe.objectFieldOffset(LinkedBlockingDeque.class.getDeclaredField("lock"));
            f29174j = unsafe.objectFieldOffset(cls.getDeclaredField("item"));
            f29175k = unsafe.objectFieldOffset(cls.getDeclaredField("next"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public gd3(LinkedBlockingDeque<E> linkedBlockingDeque) {
        this.f29176a = linkedBlockingDeque;
        this.f29181f = (long) linkedBlockingDeque.size();
        this.f29177b = m44685m(linkedBlockingDeque);
    }

    /* renamed from: j */
    public static Object m44682j(Object obj) {
        return f29171g.getObject(obj, f29175k);
    }

    /* renamed from: k */
    public static <T> T m44683k(Object obj) {
        return f29171g.getObject(obj, f29174j);
    }

    /* renamed from: l */
    public static Object m44684l(LinkedBlockingDeque<?> linkedBlockingDeque) {
        return f29171g.getObject(linkedBlockingDeque, f29172h);
    }

    /* renamed from: m */
    public static ReentrantLock m44685m(LinkedBlockingDeque<?> linkedBlockingDeque) {
        return (ReentrantLock) f29171g.getObject(linkedBlockingDeque, f29173i);
    }

    /* renamed from: n */
    public static <T> z66<T> m44686n(LinkedBlockingDeque<T> linkedBlockingDeque) {
        return new gd3(linkedBlockingDeque);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        if (!this.f29180e) {
            this.f29180e = true;
            Object obj = this.f29178c;
            this.f29178c = null;
            mo42869i(xq0, obj);
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        if (this.f29180e) {
            return false;
        }
        Object obj = null;
        ReentrantLock reentrantLock = this.f29177b;
        reentrantLock.lock();
        try {
            Object obj2 = this.f29178c;
            if (obj2 != null || (obj2 = m44684l(this.f29176a)) != null) {
                do {
                    obj = m44683k(obj2);
                    obj2 = mo42870o(obj2);
                    if (obj != null) {
                        break;
                    }
                } while (obj2 != null);
            }
            this.f29178c = obj2;
            if (obj2 == null) {
                this.f29180e = true;
            }
            if (obj == null) {
                return false;
            }
            xq0.accept(obj);
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int characteristics() {
        return 4368;
    }

    public long estimateSize() {
        return this.f29181f;
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
    public void mo42869i(xq0<? super E> xq0, Object obj) {
        ReentrantLock reentrantLock = this.f29177b;
        Object[] objArr = null;
        int i = 0;
        do {
            reentrantLock.lock();
            if (objArr == null) {
                if (obj == null) {
                    try {
                        obj = m44684l(this.f29176a);
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                Object obj2 = obj;
                while (true) {
                    if (obj2 != null) {
                        if (m44683k(obj2) != null && (i = i + 1) == 64) {
                            break;
                        }
                        obj2 = mo42870o(obj2);
                    } else {
                        break;
                    }
                }
                objArr = new Object[i];
            }
            int i2 = 0;
            while (obj != null && i2 < i) {
                Object k = m44683k(obj);
                objArr[i2] = k;
                if (k != null) {
                    i2++;
                }
                obj = mo42870o(obj);
            }
            reentrantLock.unlock();
            for (int i3 = 0; i3 < i2; i3++) {
                xq0.accept(objArr[i3]);
            }
            if (i2 <= 0) {
                return;
            }
        } while (obj != null);
    }

    /* renamed from: o */
    public Object mo42870o(Object obj) {
        Object j = m44682j(obj);
        if (obj == j) {
            return m44684l(this.f29176a);
        }
        return j;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.z66<E> trySplit() {
        /*
            r9 = this;
            java.util.concurrent.LinkedBlockingDeque<E> r0 = r9.f29176a
            boolean r1 = r9.f29180e
            if (r1 != 0) goto L_0x0074
            java.lang.Object r1 = r9.f29178c
            if (r1 != 0) goto L_0x0010
            java.lang.Object r1 = m44684l(r0)
            if (r1 == 0) goto L_0x0074
        L_0x0010:
            java.lang.Object r1 = m44682j(r1)
            if (r1 == 0) goto L_0x0074
            int r1 = r9.f29179d
            r2 = 1
            int r1 = r1 + r2
            r3 = 33554432(0x2000000, float:9.403955E-38)
            int r1 = java.lang.Math.min(r1, r3)
            r9.f29179d = r1
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.util.concurrent.locks.ReentrantLock r4 = r9.f29177b
            java.lang.Object r5 = r9.f29178c
            r4.lock()
            r6 = 0
            if (r5 != 0) goto L_0x0039
            java.lang.Object r5 = m44684l(r0)     // Catch:{ all -> 0x0037 }
            if (r5 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            r0 = r6
            goto L_0x0051
        L_0x0037:
            r0 = move-exception
            goto L_0x004d
        L_0x0039:
            r0 = r6
        L_0x003a:
            if (r5 == 0) goto L_0x0051
            if (r0 >= r1) goto L_0x0051
            java.lang.Object r7 = m44683k(r5)     // Catch:{ all -> 0x0037 }
            r3[r0] = r7     // Catch:{ all -> 0x0037 }
            if (r7 == 0) goto L_0x0048
            int r0 = r0 + 1
        L_0x0048:
            java.lang.Object r5 = r9.mo42870o(r5)     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x004d:
            r4.unlock()
            throw r0
        L_0x0051:
            r4.unlock()
            r9.f29178c = r5
            r7 = 0
            if (r5 != 0) goto L_0x005f
            r9.f29181f = r7
            r9.f29180e = r2
            goto L_0x006b
        L_0x005f:
            long r1 = r9.f29181f
            long r4 = (long) r0
            long r1 = r1 - r4
            r9.f29181f = r1
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x006b
            r9.f29181f = r7
        L_0x006b:
            if (r0 <= 0) goto L_0x0074
            r1 = 4368(0x1110, float:6.121E-42)
            z66 r0 = p000.b76.m32393y(r3, r6, r0, r1)
            return r0
        L_0x0074:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.gd3.trySplit():z66");
    }
}
