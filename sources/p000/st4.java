package p000;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: st4 */
/* compiled from: PostprocessorProducer */
public class st4 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final vv4<nh0<kh0>> f17782a;

    /* renamed from: b */
    public final xo4 f17783b;

    /* renamed from: c */
    public final Executor f17784c;

    /* renamed from: st4$b */
    /* compiled from: PostprocessorProducer */
    public class C3299b extends sb1<nh0<kh0>, nh0<kh0>> {

        /* renamed from: c */
        public final aw4 f17785c;

        /* renamed from: d */
        public final wv4 f17786d;

        /* renamed from: e */
        public final rt4 f17787e;

        /* renamed from: f */
        public boolean f17788f;

        /* renamed from: g */
        public nh0<kh0> f17789g = null;

        /* renamed from: h */
        public int f17790h = 0;

        /* renamed from: i */
        public boolean f17791i = false;

        /* renamed from: j */
        public boolean f17792j = false;

        /* renamed from: st4$b$a */
        /* compiled from: PostprocessorProducer */
        public class C3300a extends C2439gz {

            /* renamed from: a */
            public final /* synthetic */ st4 f17794a;

            public C3300a(st4 st4) {
                this.f17794a = st4;
            }

            /* renamed from: b */
            public void mo13412b() {
                C3299b.this.mo25946C();
            }
        }

        /* renamed from: st4$b$b */
        /* compiled from: PostprocessorProducer */
        public class C3301b implements Runnable {
            public C3301b() {
            }

            public void run() {
                nh0 r;
                int t;
                synchronized (C3299b.this) {
                    r = C3299b.this.f17789g;
                    t = C3299b.this.f17790h;
                    nh0 unused = C3299b.this.f17789g = null;
                    boolean unused2 = C3299b.this.f17791i = false;
                }
                if (nh0.m23180p(r)) {
                    try {
                        C3299b.this.mo25957z(r, t);
                    } finally {
                        nh0.m23178h(r);
                    }
                }
                C3299b.this.mo25955x();
            }
        }

        public C3299b(vq0<nh0<kh0>> vq0, aw4 aw4, rt4 rt4, wv4 wv4) {
            super(vq0);
            this.f17785c = aw4;
            this.f17787e = rt4;
            this.f17786d = wv4;
            wv4.mo20292o(new C3300a(st4.this));
        }

        /* renamed from: A */
        public final Map<String, String> mo25944A(aw4 aw4, wv4 wv4, rt4 rt4) {
            if (!aw4.mo11175j(wv4, "PostprocessorProducer")) {
                return null;
            }
            return ImmutableMap.m13301of("Postprocessor", rt4.getName());
        }

        /* renamed from: B */
        public final synchronized boolean mo25945B() {
            return this.f17788f;
        }

        /* renamed from: C */
        public final void mo25946C() {
            if (mo25956y()) {
                mo25710p().mo27292a();
            }
        }

        /* renamed from: D */
        public final void mo25947D(Throwable th) {
            if (mo25956y()) {
                mo25710p().mo27293b(th);
            }
        }

        /* renamed from: E */
        public final void mo25948E(nh0<kh0> nh0, int i) {
            boolean e = C3766zx.m31566e(i);
            if ((!e && !mo25945B()) || (e && mo25956y())) {
                mo25710p().mo27294c(nh0, i);
            }
        }

        /* renamed from: F */
        public void mo11352i(nh0<kh0> nh0, int i) {
            if (nh0.m23180p(nh0)) {
                mo25954K(nh0, i);
            } else if (C3766zx.m31566e(i)) {
                mo25948E((nh0<kh0>) null, i);
            }
        }

        /* renamed from: G */
        public final nh0<kh0> mo25950G(kh0 kh0) {
            qh0 qh0 = (qh0) kh0;
            nh0<Bitmap> b = this.f17787e.mo25539b(qh0.mo21538f(), st4.this.f17783b);
            try {
                qh0 qh02 = new qh0(b, kh0.mo22289a(), qh0.mo25111l(), qh0.mo25110k());
                qh02.mo22291e(qh0.getExtras());
                return nh0.m23181v(qh02);
            } finally {
                nh0.m23178h(b);
            }
        }

        /* renamed from: H */
        public final synchronized boolean mo25951H() {
            if (this.f17788f || !this.f17791i || this.f17792j || !nh0.m23180p(this.f17789g)) {
                return false;
            }
            this.f17792j = true;
            return true;
        }

        /* renamed from: I */
        public final boolean mo25952I(kh0 kh0) {
            return kh0 instanceof qh0;
        }

        /* renamed from: J */
        public final void mo25953J() {
            st4.this.f17784c.execute(new C3301b());
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
            mo25953J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
            p000.nh0.m23178h(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
            if (r2 == false) goto L_?;
         */
        /* renamed from: K */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo25954K(p000.nh0<p000.kh0> r2, int r3) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.f17788f     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                return
            L_0x0007:
                nh0<kh0> r0 = r1.f17789g     // Catch:{ all -> 0x0022 }
                nh0 r2 = p000.nh0.m23176f(r2)     // Catch:{ all -> 0x0022 }
                r1.f17789g = r2     // Catch:{ all -> 0x0022 }
                r1.f17790h = r3     // Catch:{ all -> 0x0022 }
                r2 = 1
                r1.f17791i = r2     // Catch:{ all -> 0x0022 }
                boolean r2 = r1.mo25951H()     // Catch:{ all -> 0x0022 }
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                p000.nh0.m23178h(r0)
                if (r2 == 0) goto L_0x0021
                r1.mo25953J()
            L_0x0021:
                return
            L_0x0022:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0022 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.st4.C3299b.mo25954K(nh0, int):void");
        }

        /* renamed from: g */
        public void mo13424g() {
            mo25946C();
        }

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            mo25947D(th);
        }

        /* renamed from: x */
        public final void mo25955x() {
            boolean H;
            synchronized (this) {
                this.f17792j = false;
                H = mo25951H();
            }
            if (H) {
                mo25953J();
            }
        }

        /* renamed from: y */
        public final boolean mo25956y() {
            synchronized (this) {
                if (this.f17788f) {
                    return false;
                }
                nh0<kh0> nh0 = this.f17789g;
                this.f17789g = null;
                this.f17788f = true;
                nh0.m23178h(nh0);
                return true;
            }
        }

        /* renamed from: z */
        public final void mo25957z(nh0<kh0> nh0, int i) {
            au4.m10787b(Boolean.valueOf(nh0.m23180p(nh0)));
            if (!mo25952I(nh0.mo23684j())) {
                mo25948E(nh0, i);
                return;
            }
            this.f17785c.mo11176k(this.f17786d, "PostprocessorProducer");
            nh0<kh0> nh02 = null;
            try {
                nh02 = mo25950G(nh0.mo23684j());
                aw4 aw4 = this.f17785c;
                wv4 wv4 = this.f17786d;
                aw4.mo11170a(wv4, "PostprocessorProducer", mo25944A(aw4, wv4, this.f17787e));
                mo25948E(nh02, i);
            } catch (Exception e) {
                aw4 aw42 = this.f17785c;
                wv4 wv42 = this.f17786d;
                aw42.mo11172f(wv42, "PostprocessorProducer", e, mo25944A(aw42, wv42, this.f17787e));
                mo25947D(e);
            } finally {
                nh0.m23178h(nh02);
            }
        }
    }

    /* renamed from: st4$c */
    /* compiled from: PostprocessorProducer */
    public class C3302c extends sb1<nh0<kh0>, nh0<kh0>> implements wd5 {

        /* renamed from: c */
        public boolean f17797c;

        /* renamed from: d */
        public nh0<kh0> f17798d;

        /* renamed from: st4$c$a */
        /* compiled from: PostprocessorProducer */
        public class C3303a extends C2439gz {

            /* renamed from: a */
            public final /* synthetic */ st4 f17800a;

            public C3303a(st4 st4) {
                this.f17800a = st4;
            }

            /* renamed from: b */
            public void mo13412b() {
                if (C3302c.this.mo25959r()) {
                    C3302c.this.mo25710p().mo27292a();
                }
            }
        }

        /* renamed from: g */
        public void mo13424g() {
            if (mo25959r()) {
                mo25710p().mo27292a();
            }
        }

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            if (mo25959r()) {
                mo25710p().mo27293b(th);
            }
        }

        /* renamed from: r */
        public final boolean mo25959r() {
            synchronized (this) {
                if (this.f17797c) {
                    return false;
                }
                nh0<kh0> nh0 = this.f17798d;
                this.f17798d = null;
                this.f17797c = true;
                nh0.m23178h(nh0);
                return true;
            }
        }

        /* renamed from: s */
        public void mo11352i(nh0<kh0> nh0, int i) {
            if (!C3766zx.m31567f(i)) {
                mo25961t(nh0);
                mo25962u();
            }
        }

        /* renamed from: t */
        public final void mo25961t(nh0<kh0> nh0) {
            synchronized (this) {
                if (!this.f17797c) {
                    nh0<kh0> nh02 = this.f17798d;
                    this.f17798d = nh0.m23176f(nh0);
                    nh0.m23178h(nh02);
                }
            }
        }

        /* renamed from: u */
        public final void mo25962u() {
            synchronized (this) {
                if (!this.f17797c) {
                    nh0<kh0> f = nh0.m23176f(this.f17798d);
                    try {
                        mo25710p().mo27294c(f, 0);
                    } finally {
                        nh0.m23178h(f);
                    }
                }
            }
        }

        public C3302c(C3299b bVar, vd5 vd5, wv4 wv4) {
            super(bVar);
            this.f17797c = false;
            this.f17798d = null;
            vd5.mo27095a(this);
            wv4.mo20292o(new C3303a(st4.this));
        }
    }

    /* renamed from: st4$d */
    /* compiled from: PostprocessorProducer */
    public class C3304d extends sb1<nh0<kh0>, nh0<kh0>> {
        /* renamed from: q */
        public void mo11352i(nh0<kh0> nh0, int i) {
            if (!C3766zx.m31567f(i)) {
                mo25710p().mo27294c(nh0, i);
            }
        }

        public C3304d(C3299b bVar) {
            super(bVar);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [vv4<nh0<kh0>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public st4(p000.vv4<p000.nh0<p000.kh0>> r1, p000.xo4 r2, java.util.concurrent.Executor r3) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            vv4 r1 = (p000.vv4) r1
            r0.f17782a = r1
            r0.f17783b = r2
            java.lang.Object r1 = p000.au4.m10792g(r3)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f17784c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.st4.<init>(vv4, xo4, java.util.concurrent.Executor):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: st4$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: st4$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: st4$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: st4$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11350a(p000.vq0<p000.nh0<p000.kh0>> r14, p000.wv4 r15) {
        /*
            r13 = this;
            aw4 r3 = r15.mo20281g()
            com.facebook.imagepipeline.request.ImageRequest r0 = r15.mo20286i()
            rt4 r6 = r0.mo13447k()
            p000.au4.m10792g(r6)
            st4$b r9 = new st4$b
            r0 = r9
            r1 = r13
            r2 = r14
            r4 = r6
            r5 = r15
            r0.<init>(r2, r3, r4, r5)
            boolean r14 = r6 instanceof p000.vd5
            if (r14 == 0) goto L_0x002a
            st4$c r14 = new st4$c
            r10 = r6
            vd5 r10 = (p000.vd5) r10
            r12 = 0
            r7 = r14
            r8 = r13
            r11 = r15
            r7.<init>(r9, r10, r11)
            goto L_0x0030
        L_0x002a:
            st4$d r14 = new st4$d
            r0 = 0
            r14.<init>(r9)
        L_0x0030:
            vv4<nh0<kh0>> r0 = r13.f17782a
            r0.mo11350a(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.st4.mo11350a(vq0, wv4):void");
    }
}
