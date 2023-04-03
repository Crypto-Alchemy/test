package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: s99 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class s99 extends AbstractSet<Map.Entry> {

    /* renamed from: a */
    public final /* synthetic */ u99 f33804a;

    public /* synthetic */ s99(u99 u99, s89 s89) {
        this.f33804a = u99;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f33804a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f33804a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f33804a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new p99(this.f33804a, (s89) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f33804a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f33804a.size();
    }
}
