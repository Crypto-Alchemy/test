package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: wm8 */
public final class wm8 implements Iterator {

    /* renamed from: a */
    public int f35388a;

    /* renamed from: d */
    public Iterator f35389d;

    /* renamed from: e */
    public final /* synthetic */ qm8 f35390e;

    public wm8(qm8 qm8) {
        this.f35390e = qm8;
        this.f35388a = qm8.f33180d.size();
    }

    public /* synthetic */ wm8(qm8 qm8, tm8 tm8) {
        this(qm8);
    }

    /* renamed from: a */
    public final Iterator mo49242a() {
        if (this.f35389d == null) {
            this.f35389d = this.f35390e.f33184r.entrySet().iterator();
        }
        return this.f35389d;
    }

    public final boolean hasNext() {
        int i = this.f35388a;
        return (i > 0 && i <= this.f35390e.f33180d.size()) || mo49242a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (mo49242a().hasNext()) {
            obj = mo49242a().next();
        } else {
            List i = this.f35390e.f33180d;
            int i2 = this.f35388a - 1;
            this.f35388a = i2;
            obj = i.get(i2);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
