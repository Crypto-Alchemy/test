package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e89 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class e89 implements Iterator {

    /* renamed from: a */
    public int f28429a;

    /* renamed from: d */
    public boolean f28430d;

    /* renamed from: e */
    public Iterator f28431e;

    /* renamed from: g */
    public final /* synthetic */ o79 f28432g;

    public e89(o79 o79) {
        this.f28432g = o79;
        this.f28429a = -1;
    }

    /* renamed from: a */
    public final Iterator mo42165a() {
        if (this.f28431e == null) {
            this.f28431e = this.f28432g.f32293e.entrySet().iterator();
        }
        return this.f28431e;
    }

    public final boolean hasNext() {
        if (this.f28429a + 1 < this.f28432g.f32292d.size() || (!this.f28432g.f32293e.isEmpty() && mo42165a().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.f28430d = true;
        int i = this.f28429a + 1;
        this.f28429a = i;
        if (i < this.f28432g.f32292d.size()) {
            return (Map.Entry) this.f28432g.f32292d.get(this.f28429a);
        }
        return (Map.Entry) mo42165a().next();
    }

    public final void remove() {
        if (this.f28430d) {
            this.f28430d = false;
            this.f28432g.mo46339q();
            if (this.f28429a < this.f28432g.f32292d.size()) {
                o79 o79 = this.f28432g;
                int i = this.f28429a;
                this.f28429a = i - 1;
                Object unused = o79.mo46335k(i);
                return;
            }
            mo42165a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ e89(o79 o79, m79 m79) {
        this(o79);
    }
}
