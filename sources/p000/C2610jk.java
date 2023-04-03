package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.nu0;

/* renamed from: jk */
/* compiled from: AnimatedFrameCache */
public class C2610jk {

    /* renamed from: a */
    public final f80 f13677a;

    /* renamed from: b */
    public final nu0<f80, kh0> f13678b;

    /* renamed from: c */
    public final nu0.C2921b<f80> f13679c = new C2611a();

    /* renamed from: d */
    public final LinkedHashSet<f80> f13680d = new LinkedHashSet<>();

    /* renamed from: jk$a */
    /* compiled from: AnimatedFrameCache */
    public class C2611a implements nu0.C2921b<f80> {
        public C2611a() {
        }

        /* renamed from: b */
        public void mo21947a(f80 f80, boolean z) {
            C2610jk.this.mo21945f(f80, z);
        }
    }

    /* renamed from: jk$b */
    /* compiled from: AnimatedFrameCache */
    public static class C2612b implements f80 {

        /* renamed from: a */
        public final f80 f13682a;

        /* renamed from: b */
        public final int f13683b;

        public C2612b(f80 f80, int i) {
            this.f13682a = f80;
            this.f13683b = i;
        }

        /* renamed from: a */
        public String mo11960a() {
            return null;
        }

        /* renamed from: b */
        public boolean mo11961b() {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2612b)) {
                return false;
            }
            C2612b bVar = (C2612b) obj;
            if (this.f13683b != bVar.f13683b || !this.f13682a.equals(bVar.f13682a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f13682a.hashCode() * 1013) + this.f13683b;
        }

        public String toString() {
            return hf4.m18862c(this).mo21158b("imageCacheKey", this.f13682a).mo21157a("frameIndex", this.f13683b).toString();
        }
    }

    public C2610jk(f80 f80, nu0<f80, kh0> nu0) {
        this.f13677a = f80;
        this.f13678b = nu0;
    }

    /* renamed from: a */
    public nh0<kh0> mo21940a(int i, nh0<kh0> nh0) {
        return this.f13678b.mo19976d(mo21944e(i), nh0, this.f13679c);
    }

    /* renamed from: b */
    public boolean mo21941b(int i) {
        return this.f13678b.contains(mo21944e(i));
    }

    /* renamed from: c */
    public nh0<kh0> mo21942c(int i) {
        return this.f13678b.get(mo21944e(i));
    }

    /* renamed from: d */
    public nh0<kh0> mo21943d() {
        nh0<kh0> e;
        do {
            f80 g = mo21946g();
            if (g == null) {
                return null;
            }
            e = this.f13678b.mo19977e(g);
        } while (e == null);
        return e;
    }

    /* renamed from: e */
    public final C2612b mo21944e(int i) {
        return new C2612b(this.f13677a, i);
    }

    /* renamed from: f */
    public synchronized void mo21945f(f80 f80, boolean z) {
        if (z) {
            this.f13680d.add(f80);
        } else {
            this.f13680d.remove(f80);
        }
    }

    /* renamed from: g */
    public final synchronized f80 mo21946g() {
        f80 f80;
        f80 = null;
        Iterator<f80> it = this.f13680d.iterator();
        if (it.hasNext()) {
            f80 = it.next();
            it.remove();
        }
        return f80;
    }
}
