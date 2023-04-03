package p000;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: tj4 */
/* compiled from: PBQueueSpliterator */
public final class tj4<E> implements z66<E> {

    /* renamed from: a */
    public final PriorityBlockingQueue<E> f34284a;

    /* renamed from: b */
    public Object[] f34285b;

    /* renamed from: c */
    public int f34286c;

    /* renamed from: d */
    public int f34287d;

    public tj4(PriorityBlockingQueue<E> priorityBlockingQueue, Object[] objArr, int i, int i2) {
        this.f34284a = priorityBlockingQueue;
        this.f34285b = objArr;
        this.f34286c = i;
        this.f34287d = i2;
    }

    /* renamed from: j */
    public static <T> z66<T> m52322j(PriorityBlockingQueue<T> priorityBlockingQueue) {
        return new tj4(priorityBlockingQueue, (Object[]) null, 0, -1);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int i = mo48125i();
        Object[] objArr = this.f34285b;
        this.f34286c = i;
        for (int i2 = this.f34286c; i2 < i; i2++) {
            xq0.accept(objArr[i2]);
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int i = mo48125i();
        int i2 = this.f34286c;
        if (i <= i2 || i2 < 0) {
            return false;
        }
        Object[] objArr = this.f34285b;
        this.f34286c = i2 + 1;
        xq0.accept(objArr[i2]);
        return true;
    }

    public int characteristics() {
        return 16704;
    }

    public long estimateSize() {
        return (long) (mo48125i() - this.f34286c);
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
    public final int mo48125i() {
        if (this.f34285b == null) {
            Object[] array = this.f34284a.toArray();
            this.f34285b = array;
            this.f34287d = array.length;
        }
        return this.f34287d;
    }

    /* renamed from: k */
    public tj4<E> trySplit() {
        int i = mo48125i();
        int i2 = this.f34286c;
        int i3 = (i + i2) >>> 1;
        if (i2 >= i3) {
            return null;
        }
        PriorityBlockingQueue<E> priorityBlockingQueue = this.f34284a;
        Object[] objArr = this.f34285b;
        this.f34286c = i3;
        return new tj4<>(priorityBlockingQueue, objArr, i2, i3);
    }
}
