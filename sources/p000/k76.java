package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: k76 */
/* compiled from: SpscLinkedArrayQueue */
public final class k76<T> implements r26<T> {

    /* renamed from: A */
    public static final Object f30729A = new Object();

    /* renamed from: y */
    public static final int f30730y = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: a */
    public final AtomicLong f30731a = new AtomicLong();

    /* renamed from: d */
    public int f30732d;

    /* renamed from: e */
    public long f30733e;

    /* renamed from: g */
    public final int f30734g;

    /* renamed from: k */
    public AtomicReferenceArray<Object> f30735k;

    /* renamed from: r */
    public final int f30736r;

    /* renamed from: s */
    public AtomicReferenceArray<Object> f30737s;

    /* renamed from: x */
    public final AtomicLong f30738x = new AtomicLong();

    public k76(int i) {
        int a = tt4.m52441a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f30735k = atomicReferenceArray;
        this.f30734g = i2;
        mo44686a(a);
        this.f30737s = atomicReferenceArray;
        this.f30736r = i2;
        this.f30733e = (long) (i2 - 1);
        mo44697p(0);
    }

    /* renamed from: b */
    public static int m46906b(int i) {
        return i;
    }

    /* renamed from: c */
    public static int m46907c(long j, int i) {
        return m46906b(((int) j) & i);
    }

    /* renamed from: g */
    public static <E> Object m46908g(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: n */
    public static void m46909n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    public final void mo44686a(int i) {
        this.f30732d = Math.min(i / 4, f30730y);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    public final long mo44687d() {
        return this.f30738x.get();
    }

    /* renamed from: e */
    public final long mo44688e() {
        return this.f30731a.get();
    }

    /* renamed from: f */
    public final long mo44689f() {
        return this.f30738x.get();
    }

    /* renamed from: h */
    public final AtomicReferenceArray<Object> mo44690h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        int b = m46906b(i);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m46908g(atomicReferenceArray, b);
        m46909n(atomicReferenceArray, b, (Object) null);
        return atomicReferenceArray2;
    }

    /* renamed from: i */
    public final long mo44691i() {
        return this.f30731a.get();
    }

    public boolean isEmpty() {
        if (mo44691i() == mo44689f()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final T mo44692j(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f30737s = atomicReferenceArray;
        int c = m46907c(j, i);
        T g = m46908g(atomicReferenceArray, c);
        if (g != null) {
            m46909n(atomicReferenceArray, c, (Object) null);
            mo44695m(j + 1);
        }
        return g;
    }

    /* renamed from: k */
    public boolean mo44693k(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f30735k;
        long i = mo44691i();
        int i2 = this.f30734g;
        long j = 2 + i;
        if (m46908g(atomicReferenceArray, m46907c(j, i2)) == null) {
            int c = m46907c(i, i2);
            m46909n(atomicReferenceArray, c + 1, t2);
            m46909n(atomicReferenceArray, c, t);
            mo44697p(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f30735k = atomicReferenceArray2;
        int c2 = m46907c(i, i2);
        m46909n(atomicReferenceArray2, c2 + 1, t2);
        m46909n(atomicReferenceArray2, c2, t);
        mo44696o(atomicReferenceArray, atomicReferenceArray2);
        m46909n(atomicReferenceArray, c2, f30729A);
        mo44697p(j);
        return true;
    }

    /* renamed from: l */
    public final void mo44694l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f30735k = atomicReferenceArray2;
        this.f30733e = (j2 + j) - 1;
        m46909n(atomicReferenceArray2, i, t);
        mo44696o(atomicReferenceArray, atomicReferenceArray2);
        m46909n(atomicReferenceArray, i, f30729A);
        mo44697p(j + 1);
    }

    /* renamed from: m */
    public final void mo44695m(long j) {
        this.f30738x.lazySet(j);
    }

    /* renamed from: o */
    public final void mo44696o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        m46909n(atomicReferenceArray, m46906b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f30735k;
            long e = mo44688e();
            int i = this.f30734g;
            int c = m46907c(e, i);
            if (e < this.f30733e) {
                return mo44698q(atomicReferenceArray, t, e, c);
            }
            long j = ((long) this.f30732d) + e;
            if (m46908g(atomicReferenceArray, m46907c(j, i)) == null) {
                this.f30733e = j - 1;
                return mo44698q(atomicReferenceArray, t, e, c);
            } else if (m46908g(atomicReferenceArray, m46907c(1 + e, i)) == null) {
                return mo44698q(atomicReferenceArray, t, e, c);
            } else {
                mo44694l(atomicReferenceArray, e, c, t, (long) i);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    /* renamed from: p */
    public final void mo44697p(long j) {
        this.f30731a.lazySet(j);
    }

    public T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f30737s;
        long d = mo44687d();
        int i = this.f30736r;
        int c = m46907c(d, i);
        T g = m46908g(atomicReferenceArray, c);
        if (g == f30729A) {
            z = true;
        } else {
            z = false;
        }
        if (g != null && !z) {
            m46909n(atomicReferenceArray, c, (Object) null);
            mo44695m(d + 1);
            return g;
        } else if (z) {
            return mo44692j(mo44690h(atomicReferenceArray, i + 1), d, i);
        } else {
            return null;
        }
    }

    /* renamed from: q */
    public final boolean mo44698q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m46909n(atomicReferenceArray, i, t);
        mo44697p(j + 1);
        return true;
    }
}
