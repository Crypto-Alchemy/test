package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: nn8 */
public final class nn8 implements Iterator {

    /* renamed from: a */
    public int f32159a;

    /* renamed from: d */
    public boolean f32160d;

    /* renamed from: e */
    public Iterator f32161e;

    /* renamed from: g */
    public final /* synthetic */ qm8 f32162g;

    public nn8(qm8 qm8) {
        this.f32162g = qm8;
        this.f32159a = -1;
    }

    public /* synthetic */ nn8(qm8 qm8, tm8 tm8) {
        this(qm8);
    }

    /* renamed from: a */
    public final Iterator mo46116a() {
        if (this.f32161e == null) {
            this.f32161e = this.f32162g.f33181e.entrySet().iterator();
        }
        return this.f32161e;
    }

    public final boolean hasNext() {
        return this.f32159a + 1 < this.f32162g.f33180d.size() || (!this.f32162g.f33181e.isEmpty() && mo46116a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f32160d = true;
        int i = this.f32159a + 1;
        this.f32159a = i;
        return (Map.Entry) (i < this.f32162g.f33180d.size() ? this.f32162g.f33180d.get(this.f32159a) : mo46116a().next());
    }

    public final void remove() {
        if (this.f32160d) {
            this.f32160d = false;
            this.f32162g.mo47146p();
            if (this.f32159a < this.f32162g.f33180d.size()) {
                qm8 qm8 = this.f32162g;
                int i = this.f32159a;
                this.f32159a = i - 1;
                Object unused = qm8.mo47141h(i);
                return;
            }
            mo46116a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
