package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: vg8 */
public final class vg8<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    public Iterator<Map.Entry<K, Object>> f34948a;

    public vg8(Iterator<Map.Entry<K, Object>> it) {
        this.f34948a = it;
    }

    public final boolean hasNext() {
        return this.f34948a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f34948a.next();
        return next.getValue() instanceof pg8 ? new tg8(next) : next;
    }

    public final void remove() {
        this.f34948a.remove();
    }
}
