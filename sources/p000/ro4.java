package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p000.xl5;

/* renamed from: ro4 */
/* compiled from: PipelineDraweeController */
public class ro4 extends C1606b6<nh0<kh0>, vq2> {

    /* renamed from: P */
    public static final Class<?> f17308P = ro4.class;

    /* renamed from: A */
    public final Resources f17309A;

    /* renamed from: B */
    public final lj1 f17310B;

    /* renamed from: C */
    public final ImmutableList<lj1> f17311C;

    /* renamed from: D */
    public final ys3<f80, kh0> f17312D;

    /* renamed from: E */
    public f80 f17313E;

    /* renamed from: F */
    public td6<z11<nh0<kh0>>> f17314F;

    /* renamed from: G */
    public boolean f17315G;

    /* renamed from: H */
    public ImmutableList<lj1> f17316H;

    /* renamed from: I */
    public hr2 f17317I;

    /* renamed from: J */
    public Set<je5> f17318J;

    /* renamed from: K */
    public ar2 f17319K;

    /* renamed from: L */
    public z21 f17320L;

    /* renamed from: M */
    public ImageRequest f17321M;

    /* renamed from: N */
    public ImageRequest[] f17322N;

    /* renamed from: O */
    public ImageRequest f17323O;

    public ro4(Resources resources, ab1 ab1, lj1 lj1, Executor executor, ys3<f80, kh0> ys3, ImmutableList<lj1> immutableList) {
        super(ab1, executor, (String) null, (Object) null);
        this.f17309A = resources;
        this.f17310B = new m71(resources, lj1);
        this.f17311C = immutableList;
        this.f17312D = ys3;
    }

    /* renamed from: A0 */
    public void mo25471A0(ImmutableList<lj1> immutableList) {
        this.f17316H = immutableList;
    }

    /* renamed from: B */
    public Uri mo11364B() {
        return wz3.m29794a(this.f17321M, this.f17323O, this.f17322N, ImageRequest.f9724x);
    }

    /* renamed from: B0 */
    public void mo25472B0(boolean z) {
        this.f17315G = z;
    }

    /* renamed from: C0 */
    public void mo25473C0(kh0 kh0, u21 u21) {
        vl5 a;
        u21.mo26633i(mo11411x());
        bk1 g = mo346g();
        xl5.C3616b bVar = null;
        if (!(g == null || (a = xl5.m30190a(g.mo11692d())) == null)) {
            bVar = a.mo27214s();
        }
        u21.mo26637m(bVar);
        int b = this.f17320L.mo28307b();
        u21.mo26636l(cr2.m14389b(b), y21.m30378a(b));
        if (kh0 != null) {
            u21.mo26634j(kh0.getWidth(), kh0.getHeight());
            u21.mo26635k(kh0.mo21175b());
            return;
        }
        u21.mo26632h();
    }

    /* renamed from: P */
    public void mo11378P(Drawable drawable) {
        if (drawable instanceof xj1) {
            ((xj1) drawable).mo325a();
        }
    }

    /* renamed from: c */
    public void mo343c(bk1 bk1) {
        super.mo343c(bk1);
        mo25486u0((kh0) null);
    }

    /* renamed from: i0 */
    public synchronized void mo25474i0(ar2 ar2) {
        ar2 ar22 = this.f17319K;
        if (ar22 instanceof j82) {
            ((j82) ar22).mo21793b(ar2);
        } else if (ar22 != null) {
            this.f17319K = new j82(ar22, ar2);
        } else {
            this.f17319K = ar2;
        }
    }

    /* renamed from: j0 */
    public synchronized void mo25475j0(je5 je5) {
        if (this.f17318J == null) {
            this.f17318J = new HashSet();
        }
        this.f17318J.add(je5);
    }

    /* renamed from: k0 */
    public void mo25476k0() {
        synchronized (this) {
            this.f17319K = null;
        }
    }

    /* renamed from: l0 */
    public Drawable mo11400n(nh0<kh0> nh0) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("PipelineDraweeController#createDrawable");
            }
            au4.m10794i(nh0.m23180p(nh0));
            kh0 j = nh0.mo23684j();
            mo25486u0(j);
            Drawable t0 = mo25485t0(this.f17316H, j);
            if (t0 != null) {
                return t0;
            }
            Drawable t02 = mo25485t0(this.f17311C, j);
            if (t02 != null) {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
                return t02;
            }
            Drawable a = this.f17310B.mo21646a(j);
            if (a != null) {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
                return a;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + j);
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: m0 */
    public nh0<kh0> mo11402p() {
        if (lc2.m21369d()) {
            lc2.m21366a("PipelineDraweeController#getCachedImage");
        }
        try {
            ys3<f80, kh0> ys3 = this.f17312D;
            if (ys3 != null) {
                f80 f80 = this.f17313E;
                if (f80 != null) {
                    nh0<kh0> nh0 = ys3.get(f80);
                    if (nh0 == null || nh0.mo23684j().mo22289a().mo23795a()) {
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                        }
                        return nh0;
                    }
                    nh0.close();
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: n0 */
    public int mo11413z(nh0<kh0> nh0) {
        if (nh0 != null) {
            return nh0.mo23685l();
        }
        return 0;
    }

    /* renamed from: o0 */
    public vq2 mo11363A(nh0<kh0> nh0) {
        au4.m10794i(nh0.m23180p(nh0));
        return nh0.mo23684j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return r2;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p000.je5 mo25481p0() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            ar2 r1 = r3.f17319K     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0011
            br2 r0 = new br2     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = r3.mo11411x()     // Catch:{ all -> 0x0023 }
            ar2 r2 = r3.f17319K     // Catch:{ all -> 0x0023 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0023 }
        L_0x0011:
            java.util.Set<je5> r1 = r3.f17318J     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0021
            o82 r2 = new o82     // Catch:{ all -> 0x0023 }
            r2.<init>((java.util.Set<p000.je5>) r1)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x001f
            r2.mo23915l(r0)     // Catch:{ all -> 0x0023 }
        L_0x001f:
            monitor-exit(r3)
            return r2
        L_0x0021:
            monitor-exit(r3)
            return r0
        L_0x0023:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ro4.mo25481p0():je5");
    }

    /* renamed from: q0 */
    public final void mo25482q0(td6<z11<nh0<kh0>>> td6) {
        this.f17314F = td6;
        mo25486u0((kh0) null);
    }

    /* renamed from: r0 */
    public void mo25483r0(td6<z11<nh0<kh0>>> td6, String str, f80 f80, Object obj, ImmutableList<lj1> immutableList, ar2 ar2) {
        if (lc2.m21369d()) {
            lc2.m21366a("PipelineDraweeController#initialize");
        }
        super.mo11367E(str, obj);
        mo25482q0(td6);
        this.f17313E = f80;
        mo25471A0(immutableList);
        mo25476k0();
        mo25486u0((kh0) null);
        mo25474i0(ar2);
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
    }

    /* renamed from: s0 */
    public synchronized void mo25484s0(fr2 fr2, AbstractDraweeControllerBuilder<so4, ImageRequest, nh0<kh0>, vq2> abstractDraweeControllerBuilder, td6<Boolean> td6) {
        hr2 hr2 = this.f17317I;
        if (hr2 != null) {
            hr2.mo21342f();
        }
        if (fr2 != null) {
            if (this.f17317I == null) {
                this.f17317I = new hr2(AwakeTimeSinceBootClock.get(), this, td6);
            }
            this.f17317I.mo21339c(fr2);
            this.f17317I.mo21343g(true);
            this.f17317I.mo21345i(abstractDraweeControllerBuilder);
        }
        this.f17321M = abstractDraweeControllerBuilder.mo13234n();
        this.f17322N = (ImageRequest[]) abstractDraweeControllerBuilder.mo13233m();
        this.f17323O = abstractDraweeControllerBuilder.mo13235o();
    }

    /* renamed from: t0 */
    public final Drawable mo25485t0(ImmutableList<lj1> immutableList, kh0 kh0) {
        Drawable a;
        if (immutableList == null) {
            return null;
        }
        Iterator<lj1> it = immutableList.iterator();
        while (it.hasNext()) {
            lj1 next = it.next();
            if (next.mo21647b(kh0) && (a = next.mo21646a(kh0)) != null) {
                return a;
            }
        }
        return null;
    }

    public String toString() {
        return hf4.m18862c(this).mo21158b("super", super.toString()).mo21158b("dataSourceSupplier", this.f17314F).toString();
    }

    /* renamed from: u */
    public z11<nh0<kh0>> mo11408u() {
        if (lc2.m21369d()) {
            lc2.m21366a("PipelineDraweeController#getDataSource");
        }
        if (oy1.m24426m(2)) {
            oy1.m24428o(f17308P, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        z11<nh0<kh0>> z11 = this.f17314F.get();
        if (lc2.m21369d()) {
            lc2.m21367b();
        }
        return z11;
    }

    /* renamed from: u0 */
    public final void mo25486u0(kh0 kh0) {
        if (this.f17315G) {
            if (mo11406t() == null) {
                u21 u21 = new u21();
                wq2 wq2 = new wq2(u21);
                this.f17320L = new z21();
                mo11398l(wq2);
                mo11389a0(u21);
            }
            if (this.f17319K == null) {
                mo25474i0(this.f17320L);
            }
            if (mo11406t() instanceof u21) {
                mo25473C0(kh0, (u21) mo11406t());
            }
        }
    }

    /* renamed from: v0 */
    public Map<String, Object> mo11373K(vq2 vq2) {
        if (vq2 == null) {
            return null;
        }
        return vq2.getExtras();
    }

    /* renamed from: w0 */
    public void mo11375M(String str, nh0<kh0> nh0) {
        super.mo11375M(str, nh0);
        synchronized (this) {
            ar2 ar2 = this.f17319K;
            if (ar2 != null) {
                ar2.mo11078a(str, 6, true, "PipelineDraweeController");
            }
        }
    }

    /* renamed from: x0 */
    public void mo11380R(nh0<kh0> nh0) {
        nh0.m23178h(nh0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        return;
     */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo25490y0(p000.ar2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            ar2 r0 = r2.f17319K     // Catch:{ all -> 0x0015 }
            boolean r1 = r0 instanceof p000.j82     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x000e
            j82 r0 = (p000.j82) r0     // Catch:{ all -> 0x0015 }
            r0.mo21794c(r3)     // Catch:{ all -> 0x0015 }
            monitor-exit(r2)
            return
        L_0x000e:
            if (r0 != r3) goto L_0x0013
            r3 = 0
            r2.f17319K = r3     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)
            return
        L_0x0015:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ro4.mo25490y0(ar2):void");
    }

    /* renamed from: z0 */
    public synchronized void mo25491z0(je5 je5) {
        Set<je5> set = this.f17318J;
        if (set != null) {
            set.remove(je5);
        }
    }
}
