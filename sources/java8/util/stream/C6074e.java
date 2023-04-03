package java8.util.stream;

import java.util.Arrays;
import java8.util.stream.C6068d;
import p000.z66;

/* renamed from: java8.util.stream.e */
/* compiled from: Nodes */
public final class C6074e {

    /* renamed from: a */
    public static final C6068d f30437a = new C6077c.C6081d();

    /* renamed from: b */
    public static final C6068d.C6071c f30438b = new C6077c.C6079b();

    /* renamed from: c */
    public static final C6068d.C6072d f30439c = new C6077c.C6080c();

    /* renamed from: d */
    public static final C6068d.C6070b f30440d = new C6077c.C6078a();

    /* renamed from: e */
    public static final int[] f30441e = new int[0];

    /* renamed from: f */
    public static final long[] f30442f = new long[0];

    /* renamed from: g */
    public static final double[] f30443g = new double[0];

    /* renamed from: java8.util.stream.e$b */
    /* compiled from: Nodes */
    public static class C6076b<T> implements C6068d<T> {

        /* renamed from: a */
        public final T[] f30444a;

        /* renamed from: b */
        public int f30445b;

        public C6076b(long j, kw2<T[]> kw2) {
            if (j < 2147483639) {
                this.f30444a = (Object[]) kw2.apply((int) j);
                this.f30445b = 0;
                return;
            }
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }

        /* renamed from: c */
        public void mo44368c(xq0<? super T> xq0) {
            for (int i = 0; i < this.f30445b; i++) {
                xq0.accept(this.f30444a[i]);
            }
        }

        public z66<T> spliterator() {
            return rz2.m51438a(this.f30444a, 0, this.f30445b);
        }
    }

    /* renamed from: java8.util.stream.e$c */
    /* compiled from: Nodes */
    public static abstract class C6077c<T, T_ARR, T_CONS> implements C6068d<T> {

        /* renamed from: java8.util.stream.e$c$a */
        /* compiled from: Nodes */
        public static final class C6078a extends C6077c<Double, double[], ni1> implements C6068d.C6070b {
            /* renamed from: b */
            public z66.C6755a spliterator() {
                return b76.m32371c();
            }

            /* renamed from: c */
            public void mo44368c(xq0<? super Double> xq0) {
                C6083e.m46382a(this, xq0);
            }
        }

        /* renamed from: java8.util.stream.e$c$b */
        /* compiled from: Nodes */
        public static final class C6079b extends C6077c<Integer, int[], jw2> implements C6068d.C6071c {
            /* renamed from: b */
            public z66.C6756b spliterator() {
                return b76.m32372d();
            }

            /* renamed from: c */
            public void mo44368c(xq0<? super Integer> xq0) {
                C6084f.m46383a(this, xq0);
            }
        }

        /* renamed from: java8.util.stream.e$c$c */
        /* compiled from: Nodes */
        public static final class C6080c extends C6077c<Long, long[], dl3> implements C6068d.C6072d {
            /* renamed from: b */
            public z66.C6757c spliterator() {
                return b76.m32373e();
            }

            /* renamed from: c */
            public void mo44368c(xq0<? super Long> xq0) {
                C6085g.m46384a(this, xq0);
            }
        }

        /* renamed from: java8.util.stream.e$c$d */
        /* compiled from: Nodes */
        public static class C6081d<T> extends C6077c<T, T[], xq0<? super T>> {
            /* renamed from: c */
            public /* bridge */ /* synthetic */ void mo44368c(xq0 xq0) {
                super.mo44372a(xq0);
            }

            public z66<T> spliterator() {
                return b76.m32374f();
            }

            public C6081d() {
            }
        }

        /* renamed from: a */
        public void mo44372a(T_CONS t_cons) {
        }
    }

    /* renamed from: java8.util.stream.e$d */
    /* compiled from: Nodes */
    public static final class C6082d<T> extends C6076b<T> implements C6068d.C6069a<T> {
        public C6082d(long j, kw2<T[]> kw2) {
            super(j, kw2);
        }

        public void accept(T t) {
            int i = this.f30445b;
            T[] tArr = this.f30444a;
            if (i < tArr.length) {
                this.f30445b = i + 1;
                tArr[i] = t;
                return;
            }
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", new Object[]{Integer.valueOf(this.f30444a.length)}));
        }

        public C6068d<T> build() {
            if (this.f30445b >= this.f30444a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f30445b), Integer.valueOf(this.f30444a.length)}));
        }

        /* renamed from: e */
        public void mo44326e(long j) {
            if (j == ((long) this.f30444a.length)) {
                this.f30445b = 0;
            } else {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", new Object[]{Long.valueOf(j), Integer.valueOf(this.f30444a.length)}));
            }
        }

        public void end() {
            if (this.f30445b < this.f30444a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", new Object[]{Integer.valueOf(this.f30445b), Integer.valueOf(this.f30444a.length)}));
            }
        }

        /* renamed from: f */
        public boolean mo44328f() {
            return false;
        }

        public String toString() {
            return String.format("FixedNodeBuilder[%d][%s]", new Object[]{Integer.valueOf(this.f30444a.length - this.f30445b), Arrays.toString(this.f30444a)});
        }
    }

    /* renamed from: java8.util.stream.e$e */
    /* compiled from: Nodes */
    public static final class C6083e {
        /* renamed from: a */
        public static void m46382a(C6068d.C6070b bVar, xq0<? super Double> xq0) {
            if (xq0 instanceof ni1) {
                bVar.mo44371a((ni1) xq0);
            } else {
                ((z66.C6755a) bVar.spliterator()).mo29473a(xq0);
            }
        }
    }

    /* renamed from: java8.util.stream.e$f */
    /* compiled from: Nodes */
    public static final class C6084f {
        /* renamed from: a */
        public static void m46383a(C6068d.C6071c cVar, xq0<? super Integer> xq0) {
            if (xq0 instanceof jw2) {
                cVar.mo44371a((jw2) xq0);
            } else {
                ((z66.C6756b) cVar.spliterator()).mo29473a(xq0);
            }
        }
    }

    /* renamed from: java8.util.stream.e$g */
    /* compiled from: Nodes */
    public static final class C6085g {
        /* renamed from: a */
        public static void m46384a(C6068d.C6072d dVar, xq0<? super Long> xq0) {
            if (xq0 instanceof dl3) {
                dVar.mo44371a((dl3) xq0);
            } else {
                ((z66.C6757c) dVar.spliterator()).mo29473a(xq0);
            }
        }
    }

    /* renamed from: java8.util.stream.e$h */
    /* compiled from: Nodes */
    public static final class C6086h<T> extends t66<T> implements C6068d<T>, C6068d.C6069a<T> {
        public void accept(T t) {
            super.accept(t);
        }

        public C6068d<T> build() {
            return this;
        }

        /* renamed from: c */
        public void mo44368c(xq0<? super T> xq0) {
            super.mo44368c(xq0);
        }

        /* renamed from: e */
        public void mo44326e(long j) {
            mo48000h();
            mo48001i(j);
        }

        public void end() {
        }

        /* renamed from: f */
        public boolean mo44328f() {
            return false;
        }

        public z66<T> spliterator() {
            return super.spliterator();
        }
    }

    /* renamed from: a */
    public static <T> C6068d.C6069a<T> m46369a() {
        return new C6086h();
    }

    /* renamed from: b */
    public static <T> C6068d.C6069a<T> m46370b(long j, kw2<T[]> kw2) {
        if (j < 0 || j >= 2147483639) {
            return m46369a();
        }
        return new C6082d(j, kw2);
    }
}
