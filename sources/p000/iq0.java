package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iq0 */
/* compiled from: ConstraintController */
public abstract class iq0<T> implements kq0<T> {

    /* renamed from: a */
    public final List<String> f13369a = new ArrayList();

    /* renamed from: b */
    public T f13370b;

    /* renamed from: c */
    public lq0<T> f13371c;

    /* renamed from: d */
    public C2567a f13372d;

    /* renamed from: iq0$a */
    /* compiled from: ConstraintController */
    public interface C2567a {
        /* renamed from: a */
        void mo12125a(List<String> list);

        /* renamed from: b */
        void mo12126b(List<String> list);
    }

    public iq0(lq0<T> lq0) {
        this.f13371c = lq0;
    }

    /* renamed from: a */
    public void mo21613a(T t) {
        this.f13370b = t;
        mo21618h(this.f13372d, t);
    }

    /* renamed from: b */
    public abstract boolean mo11420b(an7 an7);

    /* renamed from: c */
    public abstract boolean mo11421c(T t);

    /* renamed from: d */
    public boolean mo21614d(String str) {
        T t = this.f13370b;
        if (t == null || !mo11421c(t) || !this.f13369a.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo21615e(Iterable<an7> iterable) {
        this.f13369a.clear();
        for (an7 next : iterable) {
            if (mo11420b(next)) {
                this.f13369a.add(next.f204a);
            }
        }
        if (this.f13369a.isEmpty()) {
            this.f13371c.mo22922c(this);
        } else {
            this.f13371c.mo22921a(this);
        }
        mo21618h(this.f13372d, this.f13370b);
    }

    /* renamed from: f */
    public void mo21616f() {
        if (!this.f13369a.isEmpty()) {
            this.f13369a.clear();
            this.f13371c.mo22922c(this);
        }
    }

    /* renamed from: g */
    public void mo21617g(C2567a aVar) {
        if (this.f13372d != aVar) {
            this.f13372d = aVar;
            mo21618h(aVar, this.f13370b);
        }
    }

    /* renamed from: h */
    public final void mo21618h(C2567a aVar, T t) {
        if (!this.f13369a.isEmpty() && aVar != null) {
            if (t == null || mo11421c(t)) {
                aVar.mo12126b(this.f13369a);
            } else {
                aVar.mo12125a(this.f13369a);
            }
        }
    }
}
