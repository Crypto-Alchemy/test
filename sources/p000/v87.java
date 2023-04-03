package p000;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Vector;
import sun.misc.Unsafe;

/* renamed from: v87 */
/* compiled from: VectorSpliterator */
public final class v87<E> implements z66<E> {

    /* renamed from: f */
    public static final Unsafe f34864f;

    /* renamed from: g */
    public static final long f34865g;

    /* renamed from: h */
    public static final long f34866h;

    /* renamed from: i */
    public static final long f34867i;

    /* renamed from: a */
    public final Vector<E> f34868a;

    /* renamed from: b */
    public Object[] f34869b;

    /* renamed from: c */
    public int f34870c;

    /* renamed from: d */
    public int f34871d;

    /* renamed from: e */
    public int f34872e;

    static {
        Unsafe unsafe = o47.f32276a;
        f34864f = unsafe;
        try {
            f34866h = unsafe.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            f34865g = unsafe.objectFieldOffset(Vector.class.getDeclaredField("elementCount"));
            f34867i = unsafe.objectFieldOffset(Vector.class.getDeclaredField("elementData"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public v87(Vector<E> vector, Object[] objArr, int i, int i2, int i3) {
        this.f34868a = vector;
        this.f34869b = objArr;
        this.f34870c = i;
        this.f34871d = i2;
        this.f34872e = i3;
    }

    /* renamed from: i */
    public static <T> Object[] m53300i(Vector<T> vector) {
        return (Object[]) f34864f.getObject(vector, f34867i);
    }

    /* renamed from: k */
    public static <T> int m53301k(Vector<T> vector) {
        return f34864f.getInt(vector, f34866h);
    }

    /* renamed from: l */
    public static <T> int m53302l(Vector<T> vector) {
        return f34864f.getInt(vector, f34865g);
    }

    /* renamed from: m */
    public static <T> z66<T> m53303m(Vector<T> vector) {
        return new v87(vector, (Object[]) null, 0, -1, 0);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int j = mo48689j();
        Object[] objArr = this.f34869b;
        this.f34870c = j;
        for (int i = this.f34870c; i < j; i++) {
            xq0.accept(objArr[i]);
        }
        if (m53301k(this.f34868a) != this.f34872e) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int j = mo48689j();
        int i = this.f34870c;
        if (j <= i) {
            return false;
        }
        this.f34870c = i + 1;
        xq0.accept(this.f34869b[i]);
        if (this.f34872e == m53301k(this.f34868a)) {
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public int characteristics() {
        return 16464;
    }

    public long estimateSize() {
        return (long) (mo48689j() - this.f34870c);
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

    /* renamed from: j */
    public final int mo48689j() {
        int i = this.f34871d;
        if (i < 0) {
            synchronized (this.f34868a) {
                this.f34869b = m53300i(this.f34868a);
                this.f34872e = m53301k(this.f34868a);
                i = m53302l(this.f34868a);
                this.f34871d = i;
            }
        }
        return i;
    }

    public z66<E> trySplit() {
        int j = mo48689j();
        int i = this.f34870c;
        int i2 = (j + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        Vector<E> vector = this.f34868a;
        Object[] objArr = this.f34869b;
        this.f34870c = i2;
        return new v87(vector, objArr, i, i2, this.f34872e);
    }
}
