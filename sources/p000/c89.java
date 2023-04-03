package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public class c89 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ o79 f21627a;

    public c89(o79 o79) {
        this.f21627a = o79;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f21627a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f21627a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f21627a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value) {
            return true;
        }
        if (obj2 == null || !obj2.equals(value)) {
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new e89(this.f21627a, (m79) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f21627a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f21627a.size();
    }

    public /* synthetic */ c89(o79 o79, m79 m79) {
        this(o79);
    }
}
