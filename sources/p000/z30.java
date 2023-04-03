package p000;

import java.util.LinkedHashSet;

/* renamed from: z30 */
/* compiled from: BoundedLinkedHashSet */
public class z30<E> {

    /* renamed from: a */
    public int f20448a;

    /* renamed from: b */
    public LinkedHashSet<E> f20449b;

    public z30(int i) {
        this.f20449b = new LinkedHashSet<>(i);
        this.f20448a = i;
    }

    /* renamed from: a */
    public synchronized boolean mo28312a(E e) {
        if (this.f20449b.size() == this.f20448a) {
            LinkedHashSet<E> linkedHashSet = this.f20449b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f20449b.remove(e);
        return this.f20449b.add(e);
    }

    /* renamed from: b */
    public synchronized boolean mo28313b(E e) {
        return this.f20449b.contains(e);
    }
}
