package com.google.common.collect;

import com.google.common.collect.C4623d;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AbstractMapBasedMultiset<E> extends C4618b<E> implements Serializable {
    private static final long serialVersionUID = 0;
    public transient C4625e<E> backingMap;
    public transient long size;

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$a */
    public class C4520a extends AbstractMapBasedMultiset<E>.C6913c<E> {
        public C4520a() {
            super();
        }

        /* renamed from: b */
        public E mo34509b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.mo35192i(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$b */
    public class C4521b extends AbstractMapBasedMultiset<E>.C6913c<C4623d.C4624a<E>> {
        public C4521b() {
            super();
        }

        /* renamed from: c */
        public C4623d.C4624a<E> mo34509b(int i) {
            return AbstractMapBasedMultiset.this.backingMap.mo35191g(i);
        }
    }

    /* renamed from: com.google.common.collect.AbstractMapBasedMultiset$c */
    public abstract class C4522c<T> implements Iterator<T> {

        /* renamed from: a */
        public int f24827a;

        /* renamed from: d */
        public int f24828d = -1;

        /* renamed from: e */
        public int f24829e;

        public C4522c() {
            this.f24827a = AbstractMapBasedMultiset.this.backingMap.mo35189e();
            this.f24829e = AbstractMapBasedMultiset.this.backingMap.f25012d;
        }

        /* renamed from: a */
        public final void mo34511a() {
            if (AbstractMapBasedMultiset.this.backingMap.f25012d != this.f24829e) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public abstract T mo34509b(int i);

        public boolean hasNext() {
            mo34511a();
            if (this.f24827a >= 0) {
                return true;
            }
            return false;
        }

        public T next() {
            if (hasNext()) {
                T b = mo34509b(this.f24827a);
                int i = this.f24827a;
                this.f24828d = i;
                this.f24827a = AbstractMapBasedMultiset.this.backingMap.mo35199s(i);
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            boolean z;
            mo34511a();
            if (this.f24828d != -1) {
                z = true;
            } else {
                z = false;
            }
            ki0.m47102d(z);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.size -= (long) abstractMapBasedMultiset.backingMap.mo35204x(this.f24828d);
            this.f24827a = AbstractMapBasedMultiset.this.backingMap.mo35200t(this.f24827a, this.f24828d);
            this.f24828d = -1;
            this.f24829e = AbstractMapBasedMultiset.this.backingMap.f25012d;
        }
    }

    public AbstractMapBasedMultiset(int i) {
        this.backingMap = newBackingMap(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int c = C4628g.m37025c(objectInputStream);
        this.backingMap = newBackingMap(3);
        C4628g.m37024b(this, objectInputStream, c);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        C4628g.m37027e(this, objectOutputStream);
    }

    @CanIgnoreReturnValue
    public final int add(E e, int i) {
        boolean z;
        if (i == 0) {
            return count(e);
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43686f(z, "occurrences cannot be negative: %s", i);
        int m = this.backingMap.mo35195m(e);
        if (m == -1) {
            this.backingMap.mo35201u(e, i);
            this.size += (long) i;
            return 0;
        }
        int k = this.backingMap.mo35193k(m);
        long j = (long) i;
        long j2 = ((long) k) + j;
        if (j2 > 2147483647L) {
            z2 = false;
        }
        du4.m43688h(z2, "too many occurrences: %s", j2);
        this.backingMap.mo35185B(m, (int) j2);
        this.size += j;
        return k;
    }

    public void addTo(C4623d<? super E> dVar) {
        du4.m43691k(dVar);
        int e = this.backingMap.mo35189e();
        while (e >= 0) {
            dVar.add(this.backingMap.mo35192i(e), this.backingMap.mo35193k(e));
            e = this.backingMap.mo35199s(e);
        }
    }

    public final void clear() {
        this.backingMap.mo35187a();
        this.size = 0;
    }

    public final int count(Object obj) {
        return this.backingMap.mo35190f(obj);
    }

    public final int distinctElements() {
        return this.backingMap.mo35186C();
    }

    public final Iterator<E> elementIterator() {
        return new C4520a();
    }

    public final Iterator<C4623d.C4624a<E>> entryIterator() {
        return new C4521b();
    }

    public final Iterator<E> iterator() {
        return Multisets.m36969h(this);
    }

    public abstract C4625e<E> newBackingMap(int i);

    @CanIgnoreReturnValue
    public final int remove(Object obj, int i) {
        boolean z;
        if (i == 0) {
            return count(obj);
        }
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        du4.m43686f(z, "occurrences cannot be negative: %s", i);
        int m = this.backingMap.mo35195m(obj);
        if (m == -1) {
            return 0;
        }
        int k = this.backingMap.mo35193k(m);
        if (k > i) {
            this.backingMap.mo35185B(m, k - i);
        } else {
            this.backingMap.mo35204x(m);
            i = k;
        }
        this.size -= (long) i;
        return k;
    }

    @CanIgnoreReturnValue
    public final int setCount(E e, int i) {
        ki0.m47100b(i, "count");
        C4625e<E> eVar = this.backingMap;
        int v = i == 0 ? eVar.mo35202v(e) : eVar.mo35201u(e, i);
        this.size += (long) (i - v);
        return v;
    }

    public final int size() {
        return Ints.m37051j(this.size);
    }

    public final boolean setCount(E e, int i, int i2) {
        ki0.m47100b(i, "oldCount");
        ki0.m47100b(i2, "newCount");
        int m = this.backingMap.mo35195m(e);
        if (m == -1) {
            if (i != 0) {
                return false;
            }
            if (i2 > 0) {
                this.backingMap.mo35201u(e, i2);
                this.size += (long) i2;
            }
            return true;
        } else if (this.backingMap.mo35193k(m) != i) {
            return false;
        } else {
            if (i2 == 0) {
                this.backingMap.mo35204x(m);
                this.size -= (long) i;
            } else {
                this.backingMap.mo35185B(m, i2);
                this.size += (long) (i2 - i);
            }
            return true;
        }
    }
}
