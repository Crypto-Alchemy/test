package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: k98 */
public abstract class k98<E> extends AbstractList<E> implements hg8<E> {

    /* renamed from: a */
    public boolean f30753a = true;

    public boolean add(E e) {
        mo44712e();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo44712e();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo44712e();
        return super.addAll(collection);
    }

    public void clear() {
        mo44712e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo44712e() {
        if (!this.f30753a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean remove(Object obj) {
        mo44712e();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        mo44712e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo44712e();
        return super.retainAll(collection);
    }

    /* renamed from: y */
    public boolean mo43293y() {
        return this.f30753a;
    }

    /* renamed from: z */
    public final void mo43294z() {
        this.f30753a = false;
    }
}
