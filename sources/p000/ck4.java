package p000;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.PriorityQueue;
import sun.misc.Unsafe;

/* renamed from: ck4 */
/* compiled from: PQueueSpliterator */
public final class ck4<E> implements z66<E> {

    /* renamed from: e */
    public static final boolean f21795e;

    /* renamed from: f */
    public static final Unsafe f21796f;

    /* renamed from: g */
    public static final long f21797g;

    /* renamed from: h */
    public static final long f21798h;

    /* renamed from: i */
    public static final long f21799i;

    /* renamed from: a */
    public final PriorityQueue<E> f21800a;

    /* renamed from: b */
    public int f21801b;

    /* renamed from: c */
    public int f21802c;

    /* renamed from: d */
    public int f21803d;

    static {
        String str;
        boolean z = b76.f21142i;
        f21795e = z;
        Unsafe unsafe = o47.f32276a;
        f21796f = unsafe;
        try {
            f21797g = unsafe.objectFieldOffset(PriorityQueue.class.getDeclaredField("size"));
            if (!z) {
                f21798h = unsafe.objectFieldOffset(PriorityQueue.class.getDeclaredField("modCount"));
            } else {
                f21798h = 0;
            }
            if (z) {
                str = "elements";
            } else {
                str = "queue";
            }
            f21799i = unsafe.objectFieldOffset(PriorityQueue.class.getDeclaredField(str));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ck4(PriorityQueue<E> priorityQueue, int i, int i2, int i3) {
        this.f21800a = priorityQueue;
        this.f21801b = i;
        this.f21802c = i2;
        this.f21803d = i3;
    }

    /* renamed from: j */
    public static <T> int m33073j(PriorityQueue<T> priorityQueue) {
        if (f21795e) {
            return 0;
        }
        return f21796f.getInt(priorityQueue, f21798h);
    }

    /* renamed from: k */
    public static <T> Object[] m33074k(PriorityQueue<T> priorityQueue) {
        return (Object[]) f21796f.getObject(priorityQueue, f21799i);
    }

    /* renamed from: l */
    public static <T> int m33075l(PriorityQueue<T> priorityQueue) {
        return f21796f.getInt(priorityQueue, f21797g);
    }

    /* renamed from: m */
    public static <T> z66<T> m33076m(PriorityQueue<T> priorityQueue) {
        return new ck4(priorityQueue, 0, -1, 0);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        PriorityQueue<E> priorityQueue = this.f21800a;
        if (this.f21802c < 0) {
            this.f21802c = m33075l(priorityQueue);
            this.f21803d = m33073j(priorityQueue);
        }
        Object[] k = m33074k(priorityQueue);
        int i = this.f21802c;
        this.f21801b = i;
        for (int i2 = this.f21801b; i2 < i; i2++) {
            Object obj = k[i2];
            if (obj == null) {
                break;
            }
            xq0.accept(obj);
        }
        if (m33073j(priorityQueue) != this.f21803d) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        PriorityQueue<E> priorityQueue = this.f21800a;
        if (this.f21802c < 0) {
            this.f21802c = m33075l(priorityQueue);
            this.f21803d = m33073j(priorityQueue);
        }
        int i = this.f21801b;
        if (i >= this.f21802c) {
            return false;
        }
        this.f21801b = i + 1;
        Object obj = m33074k(priorityQueue)[i];
        if (obj == null || m33073j(priorityQueue) != this.f21803d) {
            throw new ConcurrentModificationException();
        }
        xq0.accept(obj);
        return true;
    }

    public int characteristics() {
        return 16704;
    }

    public long estimateSize() {
        return (long) (mo30026i() - this.f21801b);
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
    public final int mo30026i() {
        int i = this.f21802c;
        if (i >= 0) {
            return i;
        }
        this.f21803d = m33073j(this.f21800a);
        int l = m33075l(this.f21800a);
        this.f21802c = l;
        return l;
    }

    /* renamed from: n */
    public ck4<E> trySplit() {
        int i = mo30026i();
        int i2 = this.f21801b;
        int i3 = (i + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        PriorityQueue<E> priorityQueue = this.f21800a;
        this.f21801b = i3;
        return new ck4<>(priorityQueue, i2, i3, this.f21803d);
    }
}
