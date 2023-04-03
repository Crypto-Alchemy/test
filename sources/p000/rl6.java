package p000;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: rl6 */
/* compiled from: TargetTracker */
public final class rl6 implements sg3 {

    /* renamed from: a */
    public final Set<pl6<?>> f17290a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public void mo19468b() {
        for (T b : p67.m24682j(this.f17290a)) {
            b.mo19468b();
        }
    }

    /* renamed from: c */
    public void mo20968c() {
        for (T c : p67.m24682j(this.f17290a)) {
            c.mo20968c();
        }
    }

    /* renamed from: d */
    public void mo25452d() {
        this.f17290a.clear();
    }

    /* renamed from: i */
    public List<pl6<?>> mo25453i() {
        return p67.m24682j(this.f17290a);
    }

    /* renamed from: l */
    public void mo25454l(pl6<?> pl6) {
        this.f17290a.add(pl6);
    }

    /* renamed from: n */
    public void mo19473n() {
        for (T n : p67.m24682j(this.f17290a)) {
            n.mo19473n();
        }
    }

    /* renamed from: o */
    public void mo25455o(pl6<?> pl6) {
        this.f17290a.remove(pl6);
    }
}
