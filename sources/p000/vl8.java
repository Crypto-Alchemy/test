package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vl8 */
public final class vl8<E> extends k98<E> {

    /* renamed from: e */
    public static final vl8<Object> f34969e;

    /* renamed from: d */
    public final List<E> f34970d;

    static {
        vl8<Object> vl8 = new vl8<>();
        f34969e = vl8;
        vl8.mo43294z();
    }

    public vl8() {
        this(new ArrayList(10));
    }

    public vl8(List<E> list) {
        this.f34970d = list;
    }

    /* renamed from: j */
    public static <E> vl8<E> m53425j() {
        return f34969e;
    }

    public final void add(int i, E e) {
        mo44712e();
        this.f34970d.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f34970d.get(i);
    }

    /* renamed from: h0 */
    public final /* synthetic */ hg8 mo43292h0(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f34970d);
            return new vl8(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final E remove(int i) {
        mo44712e();
        E remove = this.f34970d.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo44712e();
        E e2 = this.f34970d.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f34970d.size();
    }
}
