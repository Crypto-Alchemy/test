package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: re5 */
/* compiled from: RequestTracker */
public class re5 {

    /* renamed from: a */
    public final Set<ae5> f17227a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set<ae5> f17228b = new HashSet();

    /* renamed from: c */
    public boolean f17229c;

    /* renamed from: a */
    public boolean mo25361a(ae5 ae5) {
        boolean z = true;
        if (ae5 == null) {
            return true;
        }
        boolean remove = this.f17227a.remove(ae5);
        if (!this.f17228b.remove(ae5) && !remove) {
            z = false;
        }
        if (z) {
            ae5.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo25362b() {
        for (T a : p67.m24682j(this.f17227a)) {
            mo25361a(a);
        }
        this.f17228b.clear();
    }

    /* renamed from: c */
    public void mo25363c() {
        this.f17229c = true;
        for (T t : p67.m24682j(this.f17227a)) {
            if (t.isRunning() || t.mo175g()) {
                t.clear();
                this.f17228b.add(t);
            }
        }
    }

    /* renamed from: d */
    public void mo25364d() {
        this.f17229c = true;
        for (T t : p67.m24682j(this.f17227a)) {
            if (t.isRunning()) {
                t.mo171c();
                this.f17228b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo25365e() {
        for (T t : p67.m24682j(this.f17227a)) {
            if (!t.mo175g() && !t.mo174f()) {
                t.clear();
                if (!this.f17229c) {
                    t.mo178k();
                } else {
                    this.f17228b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo25366f() {
        this.f17229c = false;
        for (T t : p67.m24682j(this.f17227a)) {
            if (!t.mo175g() && !t.isRunning()) {
                t.mo178k();
            }
        }
        this.f17228b.clear();
    }

    /* renamed from: g */
    public void mo25367g(ae5 ae5) {
        this.f17227a.add(ae5);
        if (!this.f17229c) {
            ae5.mo178k();
            return;
        }
        ae5.clear();
        this.f17228b.add(ae5);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f17227a.size() + ", isPaused=" + this.f17229c + "}";
    }
}
