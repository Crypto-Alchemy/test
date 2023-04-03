package p000;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: yg4 */
/* compiled from: OnBackPressedCallback */
public abstract class yg4 {

    /* renamed from: a */
    public boolean f20212a;

    /* renamed from: b */
    public CopyOnWriteArrayList<la0> f20213b = new CopyOnWriteArrayList<>();

    public yg4(boolean z) {
        this.f20212a = z;
    }

    /* renamed from: a */
    public void mo28060a(la0 la0) {
        this.f20213b.add(la0);
    }

    /* renamed from: b */
    public abstract void mo6034b();

    /* renamed from: c */
    public final boolean mo28061c() {
        return this.f20212a;
    }

    /* renamed from: d */
    public final void mo28062d() {
        Iterator<la0> it = this.f20213b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* renamed from: e */
    public void mo28063e(la0 la0) {
        this.f20213b.remove(la0);
    }

    /* renamed from: f */
    public final void mo28064f(boolean z) {
        this.f20212a = z;
    }
}
