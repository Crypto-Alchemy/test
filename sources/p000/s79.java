package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: s79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class s79 implements Iterator {

    /* renamed from: a */
    public int f33759a;

    /* renamed from: d */
    public Iterator f33760d;

    /* renamed from: e */
    public final /* synthetic */ o79 f33761e;

    public s79(o79 o79) {
        this.f33761e = o79;
        this.f33759a = o79.f32292d.size();
    }

    /* renamed from: a */
    public final Iterator mo47697a() {
        if (this.f33760d == null) {
            this.f33760d = this.f33761e.f32296r.entrySet().iterator();
        }
        return this.f33760d;
    }

    public final boolean hasNext() {
        int i = this.f33759a;
        if ((i <= 0 || i > this.f33761e.f32292d.size()) && !mo47697a().hasNext()) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object next() {
        if (mo47697a().hasNext()) {
            return (Map.Entry) mo47697a().next();
        }
        List g = this.f33761e.f32292d;
        int i = this.f33759a - 1;
        this.f33759a = i;
        return (Map.Entry) g.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ s79(o79 o79, m79 m79) {
        this(o79);
    }
}
