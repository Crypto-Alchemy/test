package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: g76 */
/* compiled from: SpreadBuilder */
public class g76 {

    /* renamed from: a */
    public final ArrayList<Object> f29108a;

    public g76(int i) {
        this.f29108a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo42841a(Object obj) {
        this.f29108a.add(obj);
    }

    /* renamed from: b */
    public void mo42842b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f29108a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f29108a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f29108a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f29108a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f29108a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    /* renamed from: c */
    public int mo42843c() {
        return this.f29108a.size();
    }

    /* renamed from: d */
    public Object[] mo42844d(Object[] objArr) {
        return this.f29108a.toArray(objArr);
    }
}
