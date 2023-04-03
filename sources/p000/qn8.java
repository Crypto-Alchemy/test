package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qn8 */
public class qn8 extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ qm8 f33186a;

    public qn8(qm8 qm8) {
        this.f33186a = qm8;
    }

    public /* synthetic */ qn8(qm8 qm8, tm8 tm8) {
        this(qm8);
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f33186a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f33186a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f33186a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new nn8(this.f33186a, (tm8) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f33186a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f33186a.size();
    }
}
