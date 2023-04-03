package p000;

import java.util.Queue;

/* renamed from: kw3 */
/* compiled from: ModelCache */
public class kw3<A, B> {

    /* renamed from: a */
    public final dm3<C2732b<A>, B> f14332a;

    /* renamed from: kw3$a */
    /* compiled from: ModelCache */
    public class C2731a extends dm3<C2732b<A>, B> {
        public C2731a(long j) {
            super(j);
        }

        /* renamed from: n */
        public void mo18847j(C2732b<A> bVar, B b) {
            bVar.mo22536c();
        }
    }

    /* renamed from: kw3$b */
    /* compiled from: ModelCache */
    public static final class C2732b<A> {

        /* renamed from: d */
        public static final Queue<C2732b<?>> f14334d = p67.m24678f(0);

        /* renamed from: a */
        public int f14335a;

        /* renamed from: b */
        public int f14336b;

        /* renamed from: c */
        public A f14337c;

        /* renamed from: a */
        public static <A> C2732b<A> m21087a(A a, int i, int i2) {
            C2732b<A> poll;
            Queue<C2732b<?>> queue = f14334d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C2732b<>();
            }
            poll.mo22535b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        public final void mo22535b(A a, int i, int i2) {
            this.f14337c = a;
            this.f14336b = i;
            this.f14335a = i2;
        }

        /* renamed from: c */
        public void mo22536c() {
            Queue<C2732b<?>> queue = f14334d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2732b)) {
                return false;
            }
            C2732b bVar = (C2732b) obj;
            if (this.f14336b == bVar.f14336b && this.f14335a == bVar.f14335a && this.f14337c.equals(bVar.f14337c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f14335a * 31) + this.f14336b) * 31) + this.f14337c.hashCode();
        }
    }

    public kw3(long j) {
        this.f14332a = new C2731a(j);
    }

    /* renamed from: a */
    public B mo22532a(A a, int i, int i2) {
        C2732b a2 = C2732b.m21087a(a, i, i2);
        B g = this.f14332a.mo18844g(a2);
        a2.mo22536c();
        return g;
    }

    /* renamed from: b */
    public void mo22533b(A a, int i, int i2, B b) {
        this.f14332a.mo18848k(C2732b.m21087a(a, i, i2), b);
    }
}
