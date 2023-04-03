package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.f */
/* compiled from: LifecycleRegistry */
public class C0716f extends Lifecycle {

    /* renamed from: b */
    public cz1<tg3, C0717a> f3954b;

    /* renamed from: c */
    public Lifecycle.State f3955c;

    /* renamed from: d */
    public final WeakReference<ug3> f3956d;

    /* renamed from: e */
    public int f3957e;

    /* renamed from: f */
    public boolean f3958f;

    /* renamed from: g */
    public boolean f3959g;

    /* renamed from: h */
    public ArrayList<Lifecycle.State> f3960h;

    /* renamed from: i */
    public final boolean f3961i;

    /* renamed from: androidx.lifecycle.f$a */
    /* compiled from: LifecycleRegistry */
    public static class C0717a {

        /* renamed from: a */
        public Lifecycle.State f3962a;

        /* renamed from: b */
        public C0715e f3963b;

        public C0717a(tg3 tg3, Lifecycle.State state) {
            this.f3963b = C0718g.m5121f(tg3);
            this.f3962a = state;
        }

        /* renamed from: a */
        public void mo6397a(ug3 ug3, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            this.f3962a = C0716f.m5099k(this.f3962a, targetState);
            this.f3963b.mo907f(ug3, event);
            this.f3962a = targetState;
        }
    }

    public C0716f(ug3 ug3) {
        this(ug3, true);
    }

    /* renamed from: k */
    public static Lifecycle.State m5099k(Lifecycle.State state, Lifecycle.State state2) {
        if (state2 == null || state2.compareTo(state) >= 0) {
            return state;
        }
        return state2;
    }

    /* renamed from: a */
    public void mo6295a(tg3 tg3) {
        ug3 ug3;
        boolean z;
        mo6387f("addObserver");
        Lifecycle.State state = this.f3955c;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        C0717a aVar = new C0717a(tg3, state2);
        if (this.f3954b.mo18386q(tg3, aVar) == null && (ug3 = this.f3956d.get()) != null) {
            if (this.f3957e != 0 || this.f3958f) {
                z = true;
            } else {
                z = false;
            }
            Lifecycle.State e = mo6386e(tg3);
            this.f3957e++;
            while (aVar.f3962a.compareTo(e) < 0 && this.f3954b.contains(tg3)) {
                mo6394n(aVar.f3962a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f3962a);
                if (upFrom != null) {
                    aVar.mo6397a(ug3, upFrom);
                    mo6393m();
                    e = mo6386e(tg3);
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3962a);
                }
            }
            if (!z) {
                mo6396p();
            }
            this.f3957e--;
        }
    }

    /* renamed from: b */
    public Lifecycle.State mo6296b() {
        return this.f3955c;
    }

    /* renamed from: c */
    public void mo6297c(tg3 tg3) {
        mo6387f("removeObserver");
        this.f3954b.mo18387r(tg3);
    }

    /* renamed from: d */
    public final void mo6385d(ug3 ug3) {
        Iterator<Map.Entry<tg3, C0717a>> descendingIterator = this.f3954b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f3959g) {
            Map.Entry next = descendingIterator.next();
            C0717a aVar = (C0717a) next.getValue();
            while (aVar.f3962a.compareTo(this.f3955c) > 0 && !this.f3959g && this.f3954b.contains((tg3) next.getKey())) {
                Lifecycle.Event downFrom = Lifecycle.Event.downFrom(aVar.f3962a);
                if (downFrom != null) {
                    mo6394n(downFrom.getTargetState());
                    aVar.mo6397a(ug3, downFrom);
                    mo6393m();
                } else {
                    throw new IllegalStateException("no event down from " + aVar.f3962a);
                }
            }
        }
    }

    /* renamed from: e */
    public final Lifecycle.State mo6386e(tg3 tg3) {
        Lifecycle.State state;
        Map.Entry<tg3, C0717a> s = this.f3954b.mo18388s(tg3);
        Lifecycle.State state2 = null;
        if (s != null) {
            state = s.getValue().f3962a;
        } else {
            state = null;
        }
        if (!this.f3960h.isEmpty()) {
            ArrayList<Lifecycle.State> arrayList = this.f3960h;
            state2 = arrayList.get(arrayList.size() - 1);
        }
        return m5099k(m5099k(this.f3955c, state), state2);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    public final void mo6387f(String str) {
        if (this.f3961i && !C3634xp.m30269f().mo134c()) {
            throw new IllegalStateException("Method " + str + " must be called on the main thread");
        }
    }

    /* renamed from: g */
    public final void mo6388g(ug3 ug3) {
        ok5<K, V>.C6956d k = this.f3954b.mo23970k();
        while (k.hasNext() && !this.f3959g) {
            Map.Entry entry = (Map.Entry) k.next();
            C0717a aVar = (C0717a) entry.getValue();
            while (aVar.f3962a.compareTo(this.f3955c) < 0 && !this.f3959g && this.f3954b.contains((tg3) entry.getKey())) {
                mo6394n(aVar.f3962a);
                Lifecycle.Event upFrom = Lifecycle.Event.upFrom(aVar.f3962a);
                if (upFrom != null) {
                    aVar.mo6397a(ug3, upFrom);
                    mo6393m();
                } else {
                    throw new IllegalStateException("no event up from " + aVar.f3962a);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo6389h(Lifecycle.Event event) {
        mo6387f("handleLifecycleEvent");
        mo6392l(event.getTargetState());
    }

    /* renamed from: i */
    public final boolean mo6390i() {
        if (this.f3954b.size() == 0) {
            return true;
        }
        Lifecycle.State state = this.f3954b.mo23966e().getValue().f3962a;
        Lifecycle.State state2 = this.f3954b.mo23971n().getValue().f3962a;
        if (state == state2 && this.f3955c == state2) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: j */
    public void mo6391j(Lifecycle.State state) {
        mo6387f("markState");
        mo6395o(state);
    }

    /* renamed from: l */
    public final void mo6392l(Lifecycle.State state) {
        Lifecycle.State state2 = this.f3955c;
        if (state2 != state) {
            if (state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) {
                throw new IllegalStateException("no event down from " + this.f3955c);
            }
            this.f3955c = state;
            if (this.f3958f || this.f3957e != 0) {
                this.f3959g = true;
                return;
            }
            this.f3958f = true;
            mo6396p();
            this.f3958f = false;
            if (this.f3955c == Lifecycle.State.DESTROYED) {
                this.f3954b = new cz1<>();
            }
        }
    }

    /* renamed from: m */
    public final void mo6393m() {
        ArrayList<Lifecycle.State> arrayList = this.f3960h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: n */
    public final void mo6394n(Lifecycle.State state) {
        this.f3960h.add(state);
    }

    /* renamed from: o */
    public void mo6395o(Lifecycle.State state) {
        mo6387f("setCurrentState");
        mo6392l(state);
    }

    /* renamed from: p */
    public final void mo6396p() {
        ug3 ug3 = this.f3956d.get();
        if (ug3 != null) {
            while (!mo6390i()) {
                this.f3959g = false;
                if (this.f3955c.compareTo(this.f3954b.mo23966e().getValue().f3962a) < 0) {
                    mo6385d(ug3);
                }
                Map.Entry<tg3, C0717a> n = this.f3954b.mo23971n();
                if (!this.f3959g && n != null && this.f3955c.compareTo(n.getValue().f3962a) > 0) {
                    mo6388g(ug3);
                }
            }
            this.f3959g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public C0716f(ug3 ug3, boolean z) {
        this.f3954b = new cz1<>();
        this.f3957e = 0;
        this.f3958f = false;
        this.f3959g = false;
        this.f3960h = new ArrayList<>();
        this.f3956d = new WeakReference<>(ug3);
        this.f3955c = Lifecycle.State.INITIALIZED;
        this.f3961i = z;
    }
}
