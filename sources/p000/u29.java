package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: u29 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class u29<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a */
    public Iterator<Map.Entry<K, Object>> f34447a;

    public u29(Iterator<Map.Entry<K, Object>> it) {
        this.f34447a = it;
    }

    public final boolean hasNext() {
        return this.f34447a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f34447a.next();
        if (next.getValue() instanceof r29) {
            return new x29(next);
        }
        return next;
    }

    public final void remove() {
        this.f34447a.remove();
    }
}
