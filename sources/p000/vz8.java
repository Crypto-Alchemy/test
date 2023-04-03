package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: vz8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public abstract class vz8<E> extends AbstractList<E> implements m59<E> {

    /* renamed from: a */
    public boolean f35219a = true;

    public boolean add(E e) {
        mo48873e();
        return super.add(e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo48873e();
        return super.addAll(i, collection);
    }

    public void clear() {
        mo48873e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo48873e() {
        if (!this.f35219a) {
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

    public final boolean remove(Object obj) {
        mo48873e();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        mo48873e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        mo48873e();
        return super.retainAll(collection);
    }

    public final boolean zza() {
        return this.f35219a;
    }

    public final void zzb() {
        this.f35219a = false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo48873e();
        return super.addAll(collection);
    }
}
