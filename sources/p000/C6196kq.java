package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import sun.misc.Unsafe;

/* renamed from: kq */
/* compiled from: ArrayListSpliterator */
public final class C6196kq<E> implements z66<E> {

    /* renamed from: e */
    public static final Unsafe f30992e;

    /* renamed from: f */
    public static final long f30993f;

    /* renamed from: g */
    public static final long f30994g;

    /* renamed from: h */
    public static final long f30995h;

    /* renamed from: a */
    public final ArrayList<E> f30996a;

    /* renamed from: b */
    public int f30997b;

    /* renamed from: c */
    public int f30998c;

    /* renamed from: d */
    public int f30999d;

    static {
        String str;
        Unsafe unsafe = o47.f32276a;
        f30992e = unsafe;
        try {
            f30994g = unsafe.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
            f30993f = unsafe.objectFieldOffset(ArrayList.class.getDeclaredField("size"));
            if (b76.f21142i) {
                str = "array";
            } else {
                str = "elementData";
            }
            f30995h = unsafe.objectFieldOffset(ArrayList.class.getDeclaredField(str));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public C6196kq(ArrayList<E> arrayList, int i, int i2, int i3) {
        this.f30996a = arrayList;
        this.f30997b = i;
        this.f30998c = i2;
        this.f30999d = i3;
    }

    /* renamed from: i */
    public static <T> Object[] m47455i(ArrayList<T> arrayList) {
        return (Object[]) f30992e.getObject(arrayList, f30995h);
    }

    /* renamed from: k */
    public static <T> int m47456k(ArrayList<T> arrayList) {
        return f30992e.getInt(arrayList, f30994g);
    }

    /* renamed from: l */
    public static <T> int m47457l(ArrayList<T> arrayList) {
        return f30992e.getInt(arrayList, f30993f);
    }

    /* renamed from: m */
    public static <T> z66<T> m47458m(ArrayList<T> arrayList) {
        return new C6196kq(arrayList, 0, -1, 0);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        int i;
        kf4.m47057e(xq0);
        ArrayList<E> arrayList = this.f30996a;
        Object[] i2 = m47455i(arrayList);
        if (i2 != null) {
            int i3 = this.f30998c;
            if (i3 < 0) {
                int k = m47456k(arrayList);
                i = k;
                i3 = m47457l(arrayList);
            } else {
                i = this.f30999d;
            }
            int i4 = this.f30997b;
            if (i4 >= 0) {
                this.f30997b = i3;
                if (i3 <= i2.length) {
                    while (i4 < i3) {
                        xq0.accept(i2[i4]);
                        i4++;
                    }
                    if (i == m47456k(arrayList)) {
                        return;
                    }
                }
            }
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int j = mo45230j();
        int i = this.f30997b;
        if (i >= j) {
            return false;
        }
        this.f30997b = i + 1;
        xq0.accept(m47455i(this.f30996a)[i]);
        if (this.f30999d == m47456k(this.f30996a)) {
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public int characteristics() {
        return 16464;
    }

    public long estimateSize() {
        return (long) (mo45230j() - this.f30997b);
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
    public final int mo45230j() {
        int i = this.f30998c;
        if (i >= 0) {
            return i;
        }
        ArrayList<E> arrayList = this.f30996a;
        this.f30999d = m47456k(arrayList);
        int l = m47457l(arrayList);
        this.f30998c = l;
        return l;
    }

    /* renamed from: n */
    public C6196kq<E> trySplit() {
        int j = mo45230j();
        int i = this.f30997b;
        int i2 = (j + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        ArrayList<E> arrayList = this.f30996a;
        this.f30997b = i2;
        return new C6196kq<>(arrayList, i, i2, this.f30999d);
    }
}
