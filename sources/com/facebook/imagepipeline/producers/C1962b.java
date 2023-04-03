package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.b */
/* compiled from: ResizeAndRotateProducer */
public class C1962b implements vv4<gp1> {

    /* renamed from: a */
    public final Executor f9706a;

    /* renamed from: b */
    public final qs4 f9707b;

    /* renamed from: c */
    public final vv4<gp1> f9708c;

    /* renamed from: d */
    public final boolean f9709d;

    /* renamed from: e */
    public final zr2 f9710e;

    /* renamed from: com.facebook.imagepipeline.producers.b$a */
    /* compiled from: ResizeAndRotateProducer */
    public class C1963a extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final boolean f9711c;

        /* renamed from: d */
        public final zr2 f9712d;

        /* renamed from: e */
        public final wv4 f9713e;

        /* renamed from: f */
        public boolean f9714f = false;

        /* renamed from: g */
        public final JobScheduler f9715g;

        /* renamed from: com.facebook.imagepipeline.producers.b$a$a */
        /* compiled from: ResizeAndRotateProducer */
        public class C1964a implements JobScheduler.C1952d {

            /* renamed from: a */
            public final /* synthetic */ C1962b f9717a;

            public C1964a(C1962b bVar) {
                this.f9717a = bVar;
            }

            /* renamed from: a */
            public void mo13400a(gp1 gp1, int i) {
                C1963a aVar = C1963a.this;
                aVar.mo13433w(gp1, i, (yr2) au4.m10792g(aVar.f9712d.createImageTranscoder(gp1.mo20751k(), C1963a.this.f9711c)));
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.b$a$b */
        /* compiled from: ResizeAndRotateProducer */
        public class C1965b extends C2439gz {

            /* renamed from: a */
            public final /* synthetic */ C1962b f9719a;

            /* renamed from: b */
            public final /* synthetic */ vq0 f9720b;

            public C1965b(C1962b bVar, vq0 vq0) {
                this.f9719a = bVar;
                this.f9720b = vq0;
            }

            /* renamed from: a */
            public void mo13429a() {
                if (C1963a.this.f9713e.mo20285h()) {
                    C1963a.this.f9715g.mo13395h();
                }
            }

            /* renamed from: b */
            public void mo13412b() {
                C1963a.this.f9715g.mo13390c();
                boolean unused = C1963a.this.f9714f = true;
                this.f9720b.mo27292a();
            }
        }

        public C1963a(vq0<gp1> vq0, wv4 wv4, boolean z, zr2 zr2) {
            super(vq0);
            this.f9713e = wv4;
            Boolean r = wv4.mo20286i().mo13454r();
            this.f9711c = r != null ? r.booleanValue() : z;
            this.f9712d = zr2;
            this.f9715g = new JobScheduler(C1962b.this.f9706a, new C1964a(C1962b.this), 100);
            wv4.mo20292o(new C1965b(C1962b.this, vq0));
        }

        /* renamed from: A */
        public final gp1 mo13430A(gp1 gp1) {
            xh5 s = this.f9713e.mo20286i().mo13455s();
            if (s.mo27743f() || !s.mo27741e()) {
                return gp1;
            }
            return mo13435y(gp1, s.mo27740d());
        }

        /* renamed from: B */
        public final gp1 mo13431B(gp1 gp1) {
            if (this.f9713e.mo20286i().mo13455s().mo27739c() || gp1.mo20754n() == 0 || gp1.mo20754n() == -1) {
                return gp1;
            }
            return mo13435y(gp1, 0);
        }

        /* renamed from: C */
        public void mo11352i(gp1 gp1, int i) {
            if (!this.f9714f) {
                boolean e = C3766zx.m31566e(i);
                if (gp1 != null) {
                    rq2 k = gp1.mo20751k();
                    TriState c = C1962b.m13621g(this.f9713e.mo20286i(), gp1, (yr2) au4.m10792g(this.f9712d.createImageTranscoder(k, this.f9711c)));
                    if (!e && c == TriState.UNSET) {
                        return;
                    }
                    if (c != TriState.YES) {
                        mo13434x(gp1, i, k);
                    } else if (this.f9715g.mo13397k(gp1, i)) {
                        if (e || this.f9713e.mo20285h()) {
                            this.f9715g.mo13395h();
                        }
                    }
                } else if (e) {
                    mo25710p().mo27294c(null, 1);
                }
            }
        }

        /* renamed from: w */
        public final void mo13433w(gp1 gp1, int i, yr2 yr2) {
            gp1 gp12;
            this.f9713e.mo20281g().mo11176k(this.f9713e, "ResizeAndRotateProducer");
            ImageRequest i2 = this.f9713e.mo20286i();
            ss4 c = C1962b.this.f9707b.mo19481c();
            Map<String, String> map = null;
            try {
                xh5 s = i2.mo13455s();
                i2.mo13453q();
                xr2 d = yr2.mo13380d(gp1, c, s, (te5) null, (rq2) null, 85);
                if (d.mo27864a() != 2) {
                    i2.mo13453q();
                    map = mo13436z(gp1, (te5) null, d, yr2.mo13377a());
                    nh0 v = nh0.m23181v(c.mo13354a());
                    try {
                        gp12 = new gp1((nh0<PooledByteBuffer>) v);
                        gp12.mo20738P(r81.f17197a);
                        gp12.mo20731G();
                        this.f9713e.mo20281g().mo11170a(this.f9713e, "ResizeAndRotateProducer", map);
                        if (d.mo27864a() != 1) {
                            i |= 16;
                        }
                        mo25710p().mo27294c(gp12, i);
                        gp1.m18285c(gp12);
                        nh0.m23178h(v);
                        c.close();
                    } catch (Throwable th) {
                        nh0.m23178h(v);
                        throw th;
                    }
                } else {
                    throw new RuntimeException("Error while transcoding the image");
                }
            } catch (Exception e) {
                try {
                    this.f9713e.mo20281g().mo11172f(this.f9713e, "ResizeAndRotateProducer", e, map);
                    if (C3766zx.m31566e(i)) {
                        mo25710p().mo27293b(e);
                    }
                } finally {
                    c.close();
                }
            }
        }

        /* renamed from: x */
        public final void mo13434x(gp1 gp1, int i, rq2 rq2) {
            gp1 gp12;
            if (rq2 == r81.f17197a || rq2 == r81.f17207k) {
                gp12 = mo13431B(gp1);
            } else {
                gp12 = mo13430A(gp1);
            }
            mo25710p().mo27294c(gp12, i);
        }

        /* renamed from: y */
        public final gp1 mo13435y(gp1 gp1, int i) {
            gp1 b = gp1.m18284b(gp1);
            if (b != null) {
                b.mo20739Q(i);
            }
            return b;
        }

        /* renamed from: z */
        public final Map<String, String> mo13436z(gp1 gp1, te5 te5, xr2 xr2, String str) {
            if (!this.f9713e.mo20281g().mo11175j(this.f9713e, "ResizeAndRotateProducer")) {
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(gp1.mo20751k()));
            hashMap.put("Original size", gp1.mo20757s() + "x" + gp1.mo20750j());
            hashMap.put("Requested size", "Unspecified");
            hashMap.put("queueTime", String.valueOf(this.f9715g.mo13393f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(xr2));
            return ImmutableMap.copyOf(hashMap);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, vv4<gp1>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1962b(java.util.concurrent.Executor r1, p000.qs4 r2, p000.vv4<p000.gp1> r3, boolean r4, p000.zr2 r5) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f9706a = r1
            java.lang.Object r1 = p000.au4.m10792g(r2)
            qs4 r1 = (p000.qs4) r1
            r0.f9707b = r1
            java.lang.Object r1 = p000.au4.m10792g(r3)
            vv4 r1 = (p000.vv4) r1
            r0.f9708c = r1
            java.lang.Object r1 = p000.au4.m10792g(r5)
            zr2 r1 = (p000.zr2) r1
            r0.f9710e = r1
            r0.f9709d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C1962b.<init>(java.util.concurrent.Executor, qs4, vv4, boolean, zr2):void");
    }

    /* renamed from: e */
    public static boolean m13619e(xh5 xh5, gp1 gp1) {
        if (xh5.mo27739c() || (x33.m29863d(xh5, gp1) == 0 && !m13620f(xh5, gp1))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m13620f(xh5 xh5, gp1 gp1) {
        if (xh5.mo27741e() && !xh5.mo27739c()) {
            return x33.f19311a.contains(Integer.valueOf(gp1.mo20748h()));
        }
        gp1.mo20736N(0);
        return false;
    }

    /* renamed from: g */
    public static TriState m13621g(ImageRequest imageRequest, gp1 gp1, yr2 yr2) {
        boolean z;
        if (gp1 == null || gp1.mo20751k() == rq2.f17332c) {
            return TriState.UNSET;
        }
        if (!yr2.mo13379c(gp1.mo20751k())) {
            return TriState.NO;
        }
        if (!m13619e(imageRequest.mo13455s(), gp1)) {
            xh5 s = imageRequest.mo13455s();
            imageRequest.mo13453q();
            if (!yr2.mo13378b(gp1, s, (te5) null)) {
                z = false;
                return TriState.valueOf(z);
            }
        }
        z = true;
        return TriState.valueOf(z);
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        this.f9708c.mo11350a(new C1963a(vq0, wv4, this.f9709d, this.f9710e), wv4);
    }
}
