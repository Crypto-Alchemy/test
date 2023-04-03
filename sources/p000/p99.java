package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: p99 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
public final class p99 implements Iterator<Map.Entry> {

    /* renamed from: a */
    public int f32614a = -1;

    /* renamed from: d */
    public boolean f32615d;

    /* renamed from: e */
    public Iterator<Map.Entry> f32616e;

    /* renamed from: g */
    public final /* synthetic */ u99 f32617g;

    public /* synthetic */ p99(u99 u99, s89 s89) {
        this.f32617g = u99;
    }

    /* renamed from: a */
    public final Iterator<Map.Entry> mo46670a() {
        if (this.f32616e == null) {
            this.f32616e = this.f32617g.f34494e.entrySet().iterator();
        }
        return this.f32616e;
    }

    public final boolean hasNext() {
        if (this.f32614a + 1 < this.f32617g.f34493d.size()) {
            return true;
        }
        if (this.f32617g.f34494e.isEmpty()) {
            return false;
        }
        if (mo46670a().hasNext()) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.f32615d = true;
        int i = this.f32614a + 1;
        this.f32614a = i;
        if (i < this.f32617g.f34493d.size()) {
            return (Map.Entry) this.f32617g.f34493d.get(this.f32614a);
        }
        return mo46670a().next();
    }

    public final void remove() {
        if (this.f32615d) {
            this.f32615d = false;
            this.f32617g.mo48363m();
            if (this.f32614a < this.f32617g.f34493d.size()) {
                u99 u99 = this.f32617g;
                int i = this.f32614a;
                this.f32614a = i - 1;
                Object unused = u99.mo48361k(i);
                return;
            }
            mo46670a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
