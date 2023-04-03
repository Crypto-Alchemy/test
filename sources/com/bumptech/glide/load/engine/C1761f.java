package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.C1718c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1774h;
import com.bumptech.glide.load.engine.DecodeJob;
import java.util.Map;
import java.util.concurrent.Executor;
import p000.tg1;
import p000.uy1;
import p000.xs3;

/* renamed from: com.bumptech.glide.load.engine.f */
/* compiled from: Engine */
public class C1761f implements dq1, xs3.C3640a, C1774h.C1775a {

    /* renamed from: i */
    public static final boolean f8827i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    public final l33 f8828a;

    /* renamed from: b */
    public final fq1 f8829b;

    /* renamed from: c */
    public final xs3 f8830c;

    /* renamed from: d */
    public final C1764b f8831d;

    /* renamed from: e */
    public final qf5 f8832e;

    /* renamed from: f */
    public final C1766c f8833f;

    /* renamed from: g */
    public final C1762a f8834g;

    /* renamed from: h */
    public final C1749a f8835h;

    /* renamed from: com.bumptech.glide.load.engine.f$a */
    /* compiled from: Engine */
    public static class C1762a {

        /* renamed from: a */
        public final DecodeJob.C1746e f8836a;

        /* renamed from: b */
        public final ys4<DecodeJob<?>> f8837b = uy1.m28526d(150, new C1763a());

        /* renamed from: c */
        public int f8838c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a */
        /* compiled from: Engine */
        public class C1763a implements uy1.C3444d<DecodeJob<?>> {
            public C1763a() {
            }

            /* renamed from: b */
            public DecodeJob<?> mo12529a() {
                C1762a aVar = C1762a.this;
                return new DecodeJob<>(aVar.f8836a, aVar.f8837b);
            }
        }

        public C1762a(DecodeJob.C1746e eVar) {
            this.f8836a = eVar;
        }

        /* renamed from: a */
        public <R> DecodeJob<R> mo12528a(C1718c cVar, Object obj, eq1 eq1, z93 z93, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, xg1 xg1, Map<Class<?>, mw6<?>> map, boolean z, boolean z2, boolean z3, xi4 xi4, DecodeJob.C1743b<R> bVar) {
            DecodeJob decodeJob = (DecodeJob) zt4.m31500d(this.f8837b.mo11139b());
            int i3 = this.f8838c;
            int i4 = i3;
            this.f8838c = i3 + 1;
            return decodeJob.mo12434u(cVar, obj, eq1, z93, i, i2, cls, cls2, priority, xg1, map, z, z2, z3, xi4, bVar, i4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$b */
    /* compiled from: Engine */
    public static class C1764b {

        /* renamed from: a */
        public final wg2 f8840a;

        /* renamed from: b */
        public final wg2 f8841b;

        /* renamed from: c */
        public final wg2 f8842c;

        /* renamed from: d */
        public final wg2 f8843d;

        /* renamed from: e */
        public final dq1 f8844e;

        /* renamed from: f */
        public final C1774h.C1775a f8845f;

        /* renamed from: g */
        public final ys4<C1768g<?>> f8846g = uy1.m28526d(150, new C1765a());

        /* renamed from: com.bumptech.glide.load.engine.f$b$a */
        /* compiled from: Engine */
        public class C1765a implements uy1.C3444d<C1768g<?>> {
            public C1765a() {
            }

            /* renamed from: b */
            public C1768g<?> mo12529a() {
                C1764b bVar = C1764b.this;
                return new C1768g(bVar.f8840a, bVar.f8841b, bVar.f8842c, bVar.f8843d, bVar.f8844e, bVar.f8845f, bVar.f8846g);
            }
        }

        public C1764b(wg2 wg2, wg2 wg22, wg2 wg23, wg2 wg24, dq1 dq1, C1774h.C1775a aVar) {
            this.f8840a = wg2;
            this.f8841b = wg22;
            this.f8842c = wg23;
            this.f8843d = wg24;
            this.f8844e = dq1;
            this.f8845f = aVar;
        }

        /* renamed from: a */
        public <R> C1768g<R> mo12531a(z93 z93, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C1768g) zt4.m31500d(this.f8846g.mo11139b())).mo12541l(z93, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$c */
    /* compiled from: Engine */
    public static class C1766c implements DecodeJob.C1746e {

        /* renamed from: a */
        public final tg1.C3362a f8848a;

        /* renamed from: b */
        public volatile tg1 f8849b;

        public C1766c(tg1.C3362a aVar) {
            this.f8848a = aVar;
        }

        /* renamed from: a */
        public tg1 mo12448a() {
            if (this.f8849b == null) {
                synchronized (this) {
                    if (this.f8849b == null) {
                        this.f8849b = this.f8848a.build();
                    }
                    if (this.f8849b == null) {
                        this.f8849b = new ug1();
                    }
                }
            }
            return this.f8849b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.f$d */
    /* compiled from: Engine */
    public class C1767d {

        /* renamed from: a */
        public final C1768g<?> f8850a;

        /* renamed from: b */
        public final ef5 f8851b;

        public C1767d(ef5 ef5, C1768g<?> gVar) {
            this.f8851b = ef5;
            this.f8850a = gVar;
        }

        /* renamed from: a */
        public void mo12533a() {
            synchronized (C1761f.this) {
                this.f8850a.mo12547r(this.f8851b);
            }
        }
    }

    public C1761f(xs3 xs3, tg1.C3362a aVar, wg2 wg2, wg2 wg22, wg2 wg23, wg2 wg24, boolean z) {
        this(xs3, aVar, wg2, wg22, wg23, wg24, (l33) null, (fq1) null, (C1749a) null, (C1764b) null, (C1762a) null, (qf5) null, z);
    }

    /* renamed from: j */
    public static void m12402j(String str, long j, z93 z93) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(ok3.m23849a(j));
        sb.append("ms, key: ");
        sb.append(z93);
    }

    /* renamed from: a */
    public synchronized void mo12517a(C1768g<?> gVar, z93 z93, C1774h<?> hVar) {
        if (hVar != null) {
            if (hVar.mo12564e()) {
                this.f8835h.mo12472a(z93, hVar);
            }
        }
        this.f8828a.mo22632d(z93, gVar);
    }

    /* renamed from: b */
    public synchronized void mo12518b(C1768g<?> gVar, z93 z93) {
        this.f8828a.mo22632d(z93, gVar);
    }

    /* renamed from: c */
    public void mo12519c(z93 z93, C1774h<?> hVar) {
        this.f8835h.mo12475d(z93);
        if (hVar.mo12564e()) {
            this.f8830c.mo21284d(z93, hVar);
        } else {
            this.f8832e.mo25092a(hVar, false);
        }
    }

    /* renamed from: d */
    public void mo12520d(bf5<?> bf5) {
        this.f8832e.mo25092a(bf5, true);
    }

    /* renamed from: e */
    public final C1774h<?> mo12521e(z93 z93) {
        bf5<?> e = this.f8830c.mo21285e(z93);
        if (e == null) {
            return null;
        }
        if (e instanceof C1774h) {
            return (C1774h) e;
        }
        return new C1774h<>(e, true, true, z93, this);
    }

    /* renamed from: f */
    public <R> C1767d mo12522f(C1718c cVar, Object obj, z93 z93, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, xg1 xg1, Map<Class<?>, mw6<?>> map, boolean z, boolean z2, xi4 xi4, boolean z3, boolean z4, boolean z5, boolean z6, ef5 ef5, Executor executor) {
        long b = f8827i ? ok3.m23850b() : 0;
        eq1 a = this.f8829b.mo20040a(obj, z93, i, i2, map, cls, cls2, xi4);
        synchronized (this) {
            C1774h<?> i3 = mo12525i(a, z3, b);
            if (i3 == null) {
                C1767d l = mo12527l(cVar, obj, z93, i, i2, cls, cls2, priority, xg1, map, z, z2, xi4, z3, z4, z5, z6, ef5, executor, a, b);
                return l;
            }
            ef5.mo12664a(i3, DataSource.MEMORY_CACHE, false);
            return null;
        }
    }

    /* renamed from: g */
    public final C1774h<?> mo12523g(z93 z93) {
        C1774h<?> e = this.f8835h.mo12476e(z93);
        if (e != null) {
            e.mo12562b();
        }
        return e;
    }

    /* renamed from: h */
    public final C1774h<?> mo12524h(z93 z93) {
        C1774h<?> e = mo12521e(z93);
        if (e != null) {
            e.mo12562b();
            this.f8835h.mo12472a(z93, e);
        }
        return e;
    }

    /* renamed from: i */
    public final C1774h<?> mo12525i(eq1 eq1, boolean z, long j) {
        if (!z) {
            return null;
        }
        C1774h<?> g = mo12523g(eq1);
        if (g != null) {
            if (f8827i) {
                m12402j("Loaded resource from active resources", j, eq1);
            }
            return g;
        }
        C1774h<?> h = mo12524h(eq1);
        if (h == null) {
            return null;
        }
        if (f8827i) {
            m12402j("Loaded resource from cache", j, eq1);
        }
        return h;
    }

    /* renamed from: k */
    public void mo12526k(bf5<?> bf5) {
        if (bf5 instanceof C1774h) {
            ((C1774h) bf5).mo12565f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: l */
    public final <R> C1767d mo12527l(C1718c cVar, Object obj, z93 z93, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, xg1 xg1, Map<Class<?>, mw6<?>> map, boolean z, boolean z2, xi4 xi4, boolean z3, boolean z4, boolean z5, boolean z6, ef5 ef5, Executor executor, eq1 eq1, long j) {
        ef5 ef52 = ef5;
        Executor executor2 = executor;
        eq1 eq12 = eq1;
        long j2 = j;
        C1768g<?> a = this.f8828a.mo22629a(eq12, z6);
        if (a != null) {
            a.mo12534e(ef52, executor2);
            if (f8827i) {
                m12402j("Added to existing load", j2, eq12);
            }
            return new C1767d(ef52, a);
        }
        C1768g a2 = this.f8831d.mo12531a(eq1, z3, z4, z5, z6);
        C1768g gVar = a2;
        eq1 eq13 = eq12;
        DecodeJob<R> a3 = this.f8834g.mo12528a(cVar, obj, eq1, z93, i, i2, cls, cls2, priority, xg1, map, z, z2, z6, xi4, a2);
        this.f8828a.mo22631c(eq13, gVar);
        C1768g gVar2 = gVar;
        eq1 eq14 = eq13;
        ef5 ef53 = ef5;
        gVar2.mo12534e(ef53, executor);
        gVar2.mo12548s(a3);
        if (f8827i) {
            m12402j("Started new load", j, eq14);
        }
        return new C1767d(ef53, gVar2);
    }

    public C1761f(xs3 xs3, tg1.C3362a aVar, wg2 wg2, wg2 wg22, wg2 wg23, wg2 wg24, l33 l33, fq1 fq1, C1749a aVar2, C1764b bVar, C1762a aVar3, qf5 qf5, boolean z) {
        this.f8830c = xs3;
        tg1.C3362a aVar4 = aVar;
        C1766c cVar = new C1766c(aVar);
        this.f8833f = cVar;
        C1749a aVar5 = aVar2 == null ? new C1749a(z) : aVar2;
        this.f8835h = aVar5;
        aVar5.mo12477f(this);
        this.f8829b = fq1 == null ? new fq1() : fq1;
        this.f8828a = l33 == null ? new l33() : l33;
        this.f8831d = bVar == null ? new C1764b(wg2, wg22, wg23, wg24, this, this) : bVar;
        this.f8834g = aVar3 == null ? new C1762a(cVar) : aVar3;
        this.f8832e = qf5 == null ? new qf5() : qf5;
        xs3.mo21283c(this);
    }
}
