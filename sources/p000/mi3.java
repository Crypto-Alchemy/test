package p000;

import android.os.Looper;
import android.os.Message;
import androidx.media3.common.C0789g;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: mi3 */
/* compiled from: ListenerSet */
public final class mi3<T> {

    /* renamed from: a */
    public final dh0 f14979a;

    /* renamed from: b */
    public final xk2 f14980b;

    /* renamed from: c */
    public final C2832b<T> f14981c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C2833c<T>> f14982d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f14983e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f14984f;

    /* renamed from: g */
    public boolean f14985g;

    /* renamed from: mi3$a */
    /* compiled from: ListenerSet */
    public interface C2831a<T> {
        void invoke(T t);
    }

    /* renamed from: mi3$b */
    /* compiled from: ListenerSet */
    public interface C2832b<T> {
        /* renamed from: a */
        void mo22638a(T t, C0789g gVar);
    }

    /* renamed from: mi3$c */
    /* compiled from: ListenerSet */
    public static final class C2833c<T> {

        /* renamed from: a */
        public final T f14986a;

        /* renamed from: b */
        public C0789g.C0791b f14987b = new C0789g.C0791b();

        /* renamed from: c */
        public boolean f14988c;

        /* renamed from: d */
        public boolean f14989d;

        public C2833c(T t) {
            this.f14986a = t;
        }

        /* renamed from: a */
        public void mo23195a(int i, C2831a<T> aVar) {
            if (!this.f14989d) {
                if (i != -1) {
                    this.f14987b.mo6631a(i);
                }
                this.f14988c = true;
                aVar.invoke(this.f14986a);
            }
        }

        /* renamed from: b */
        public void mo23196b(C2832b<T> bVar) {
            if (!this.f14989d && this.f14988c) {
                C0789g e = this.f14987b.mo6635e();
                this.f14987b = new C0789g.C0791b();
                this.f14988c = false;
                bVar.mo22638a(this.f14986a, e);
            }
        }

        /* renamed from: c */
        public void mo23197c(C2832b<T> bVar) {
            this.f14989d = true;
            if (this.f14988c) {
                bVar.mo22638a(this.f14986a, this.f14987b.mo6635e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2833c.class != obj.getClass()) {
                return false;
            }
            return this.f14986a.equals(((C2833c) obj).f14986a);
        }

        public int hashCode() {
            return this.f14986a.hashCode();
        }
    }

    public mi3(Looper looper, dh0 dh0, C2832b<T> bVar) {
        this(new CopyOnWriteArraySet(), looper, dh0, bVar);
    }

    /* renamed from: h */
    public static /* synthetic */ void m22305h(CopyOnWriteArraySet copyOnWriteArraySet, int i, C2831a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C2833c) it.next()).mo23195a(i, aVar);
        }
    }

    /* renamed from: c */
    public void mo23186c(T t) {
        if (!this.f14985g) {
            C2725kr.m20985e(t);
            this.f14982d.add(new C2833c(t));
        }
    }

    /* renamed from: d */
    public mi3<T> mo23187d(Looper looper, dh0 dh0, C2832b<T> bVar) {
        return new mi3<>(this.f14982d, looper, dh0, bVar);
    }

    /* renamed from: e */
    public mi3<T> mo23188e(Looper looper, C2832b<T> bVar) {
        return mo23187d(looper, this.f14979a, bVar);
    }

    /* renamed from: f */
    public void mo23189f() {
        if (!this.f14984f.isEmpty()) {
            if (!this.f14980b.mo22774b(0)) {
                xk2 xk2 = this.f14980b;
                xk2.mo22779g(xk2.mo22773a(0));
            }
            boolean z = !this.f14983e.isEmpty();
            this.f14983e.addAll(this.f14984f);
            this.f14984f.clear();
            if (!z) {
                while (!this.f14983e.isEmpty()) {
                    this.f14983e.peekFirst().run();
                    this.f14983e.removeFirst();
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo23190g(Message message) {
        Iterator<C2833c<T>> it = this.f14982d.iterator();
        while (it.hasNext()) {
            it.next().mo23196b(this.f14981c);
            if (this.f14980b.mo22774b(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: i */
    public void mo23191i(int i, C2831a<T> aVar) {
        this.f14984f.add(new li3(new CopyOnWriteArraySet(this.f14982d), i, aVar));
    }

    /* renamed from: j */
    public void mo23192j() {
        Iterator<C2833c<T>> it = this.f14982d.iterator();
        while (it.hasNext()) {
            it.next().mo23197c(this.f14981c);
        }
        this.f14982d.clear();
        this.f14985g = true;
    }

    /* renamed from: k */
    public void mo23193k(T t) {
        Iterator<C2833c<T>> it = this.f14982d.iterator();
        while (it.hasNext()) {
            C2833c next = it.next();
            if (next.f14986a.equals(t)) {
                next.mo23197c(this.f14981c);
                this.f14982d.remove(next);
            }
        }
    }

    /* renamed from: l */
    public void mo23194l(int i, C2831a<T> aVar) {
        mo23191i(i, aVar);
        mo23189f();
    }

    public mi3(CopyOnWriteArraySet<C2833c<T>> copyOnWriteArraySet, Looper looper, dh0 dh0, C2832b<T> bVar) {
        this.f14979a = dh0;
        this.f14982d = copyOnWriteArraySet;
        this.f14981c = bVar;
        this.f14983e = new ArrayDeque<>();
        this.f14984f = new ArrayDeque<>();
        this.f14980b = dh0.mo18771c(looper, new ki3(this));
    }
}
