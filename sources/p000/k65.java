package p000;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: k65 */
/* compiled from: RASpliterator */
public final class k65<E> implements z66<E> {

    /* renamed from: f */
    public static final Unsafe f30718f;

    /* renamed from: g */
    public static final long f30719g;

    /* renamed from: a */
    public final List<E> f30720a;

    /* renamed from: b */
    public int f30721b;

    /* renamed from: c */
    public int f30722c;

    /* renamed from: d */
    public final AbstractList<E> f30723d;

    /* renamed from: e */
    public int f30724e;

    static {
        Unsafe unsafe = o47.f32276a;
        f30718f = unsafe;
        try {
            f30719g = unsafe.objectFieldOffset(AbstractList.class.getDeclaredField("modCount"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public k65(List<E> list, int i, int i2, int i3) {
        AbstractList<E> abstractList;
        this.f30720a = list;
        this.f30721b = i;
        this.f30722c = i2;
        if (list instanceof AbstractList) {
            abstractList = (AbstractList) list;
        } else {
            abstractList = null;
        }
        this.f30723d = abstractList;
        this.f30724e = i3;
    }

    /* renamed from: i */
    public static void m46877i(AbstractList<?> abstractList, int i) {
        if (abstractList != null && m46878k(abstractList) != i) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: k */
    public static <T> int m46878k(List<T> list) {
        return f30718f.getInt(list, f30719g);
    }

    /* renamed from: l */
    public static <T> z66<T> m46879l(List<T> list) {
        return new k65(list, 0, -1, 0);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        List<E> list = this.f30720a;
        int j = mo44670j();
        int i = this.f30721b;
        this.f30721b = j;
        while (i < j) {
            try {
                xq0.accept(list.get(i));
                i++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        m46877i(this.f30723d, this.f30724e);
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        int j = mo44670j();
        int i = this.f30721b;
        if (i >= j) {
            return false;
        }
        this.f30721b = i + 1;
        xq0.accept(this.f30720a.get(i));
        m46877i(this.f30723d, this.f30724e);
        return true;
    }

    public int characteristics() {
        return 16464;
    }

    public long estimateSize() {
        return (long) (mo44670j() - this.f30721b);
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
    public final int mo44670j() {
        List<E> list = this.f30720a;
        int i = this.f30722c;
        if (i >= 0) {
            return i;
        }
        AbstractList<E> abstractList = this.f30723d;
        if (abstractList != null) {
            this.f30724e = m46878k(abstractList);
        }
        int size = list.size();
        this.f30722c = size;
        return size;
    }

    public z66<E> trySplit() {
        int j = mo44670j();
        int i = this.f30721b;
        int i2 = (j + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        List<E> list = this.f30720a;
        this.f30721b = i2;
        return new k65(list, i, i2, this.f30724e);
    }
}
