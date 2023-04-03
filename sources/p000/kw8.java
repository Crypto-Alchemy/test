package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: kw8 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public abstract class kw8<E> extends AbstractList<E> implements h29<E> {

    /* renamed from: a */
    public boolean f31114a = true;

    public boolean add(E e) {
        mo45307e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo45307e();
        return super.addAll(collection);
    }

    public void clear() {
        mo45307e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo45307e() {
        if (!this.f31114a) {
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

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo45307e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo45307e();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo45307e();
        return super.retainAll(collection);
    }

    public boolean zza() {
        return this.f31114a;
    }

    public final void zzb() {
        this.f31114a = false;
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo45307e();
        return super.addAll(i, collection);
    }
}
