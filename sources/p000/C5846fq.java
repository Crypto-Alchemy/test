package p000;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import sun.misc.Unsafe;

/* renamed from: fq */
/* compiled from: ArrayDequeSpliterator */
public final class C5846fq<E> implements z66<E> {

    /* renamed from: d */
    public static final Unsafe f28932d;

    /* renamed from: e */
    public static final long f28933e;

    /* renamed from: f */
    public static final long f28934f;

    /* renamed from: g */
    public static final long f28935g;

    /* renamed from: a */
    public final ArrayDeque<E> f28936a;

    /* renamed from: b */
    public int f28937b;

    /* renamed from: c */
    public int f28938c;

    static {
        Unsafe unsafe = o47.f32276a;
        f28932d = unsafe;
        try {
            f28933e = unsafe.objectFieldOffset(ArrayDeque.class.getDeclaredField("tail"));
            f28934f = unsafe.objectFieldOffset(ArrayDeque.class.getDeclaredField("head"));
            f28935g = unsafe.objectFieldOffset(ArrayDeque.class.getDeclaredField("elements"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public C5846fq(ArrayDeque<E> arrayDeque, int i, int i2) {
        this.f28936a = arrayDeque;
        this.f28938c = i;
        this.f28937b = i2;
    }

    /* renamed from: i */
    public static <T> Object[] m44361i(ArrayDeque<T> arrayDeque) {
        return (Object[]) f28932d.getObject(arrayDeque, f28935g);
    }

    /* renamed from: k */
    public static <T> int m44362k(ArrayDeque<T> arrayDeque) {
        return f28932d.getInt(arrayDeque, f28934f);
    }

    /* renamed from: l */
    public static <T> int m44363l(ArrayDeque<T> arrayDeque) {
        return f28932d.getInt(arrayDeque, f28933e);
    }

    /* renamed from: m */
    public static <T> z66<T> m44364m(ArrayDeque<T> arrayDeque) {
        return new C5846fq(arrayDeque, -1, -1);
    }

    /* renamed from: a */
    public void mo29473a(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        Object[] i = m44361i(this.f28936a);
        int length = i.length - 1;
        int j = mo42642j();
        int i2 = this.f28938c;
        this.f28938c = j;
        while (i2 != j) {
            Object obj = i[i2];
            i2 = (i2 + 1) & length;
            if (obj != null) {
                xq0.accept(obj);
            } else {
                throw new ConcurrentModificationException();
            }
        }
    }

    /* renamed from: c */
    public boolean mo29474c(xq0<? super E> xq0) {
        kf4.m47057e(xq0);
        Object[] i = m44361i(this.f28936a);
        int length = i.length - 1;
        mo42642j();
        int i2 = this.f28938c;
        if (i2 == this.f28937b) {
            return false;
        }
        Object obj = i[i2];
        this.f28938c = length & (i2 + 1);
        if (obj != null) {
            xq0.accept(obj);
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public int characteristics() {
        return 16720;
    }

    public long estimateSize() {
        int j = mo42642j() - this.f28938c;
        if (j < 0) {
            j += m44361i(this.f28936a).length;
        }
        return (long) j;
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
    public final int mo42642j() {
        int i = this.f28937b;
        if (i >= 0) {
            return i;
        }
        int l = m44363l(this.f28936a);
        this.f28937b = l;
        this.f28938c = m44362k(this.f28936a);
        return l;
    }

    /* renamed from: n */
    public C5846fq<E> trySplit() {
        int j = mo42642j();
        int i = this.f28938c;
        int length = m44361i(this.f28936a).length;
        if (i == j) {
            return null;
        }
        int i2 = length - 1;
        if (((i + 1) & i2) == j) {
            return null;
        }
        if (i > j) {
            j += length;
        }
        int i3 = ((j + i) >>> 1) & i2;
        ArrayDeque<E> arrayDeque = this.f28936a;
        this.f28938c = i3;
        return new C5846fq<>(arrayDeque, i, i3);
    }
}
