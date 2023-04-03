package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aq0 */
/* compiled from: ConsPStack */
public final class aq0<E> implements Iterable<E> {

    /* renamed from: g */
    public static final aq0<Object> f36538g = new aq0<>();

    /* renamed from: a */
    public final E f36539a;

    /* renamed from: d */
    public final aq0<E> f36540d;

    /* renamed from: e */
    public final int f36541e;

    /* renamed from: aq0$a */
    /* compiled from: ConsPStack */
    public static class C6836a<E> implements Iterator<E> {

        /* renamed from: a */
        public aq0<E> f36542a;

        public C6836a(aq0<E> aq0) {
            this.f36542a = aq0;
        }

        public boolean hasNext() {
            if (this.f36542a.f36541e > 0) {
                return true;
            }
            return false;
        }

        public E next() {
            aq0<E> aq0 = this.f36542a;
            E e = aq0.f36539a;
            this.f36542a = aq0.f36540d;
            return e;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public aq0() {
        this.f36541e = 0;
        this.f36539a = null;
        this.f36540d = null;
    }

    /* renamed from: j */
    public static <E> aq0<E> m55631j() {
        return f36538g;
    }

    public E get(int i) {
        if (i < 0 || i > this.f36541e) {
            throw new IndexOutOfBoundsException();
        }
        try {
            return mo50296k(i).next();
        } catch (NoSuchElementException unused) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
    }

    public Iterator<E> iterator() {
        return mo50296k(0);
    }

    /* renamed from: k */
    public final Iterator<E> mo50296k(int i) {
        return new C6836a(mo50300r(i));
    }

    /* renamed from: n */
    public aq0<E> mo50297n(int i) {
        return mo50298o(get(i));
    }

    /* renamed from: o */
    public final aq0<E> mo50298o(Object obj) {
        if (this.f36541e == 0) {
            return this;
        }
        if (this.f36539a.equals(obj)) {
            return this.f36540d;
        }
        aq0<E> o = this.f36540d.mo50298o(obj);
        if (o == this.f36540d) {
            return this;
        }
        return new aq0<>(this.f36539a, o);
    }

    /* renamed from: q */
    public aq0<E> mo50299q(E e) {
        return new aq0<>(e, this);
    }

    /* renamed from: r */
    public final aq0<E> mo50300r(int i) {
        if (i < 0 || i > this.f36541e) {
            throw new IndexOutOfBoundsException();
        } else if (i == 0) {
            return this;
        } else {
            return this.f36540d.mo50300r(i - 1);
        }
    }

    public int size() {
        return this.f36541e;
    }

    public aq0(E e, aq0<E> aq0) {
        this.f36539a = e;
        this.f36540d = aq0;
        this.f36541e = aq0.f36541e + 1;
    }
}
