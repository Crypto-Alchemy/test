package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.imagepipeline.producers.JobScheduler;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.a */
/* compiled from: DecodeProducer */
public class C1956a implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final j60 f9675a;

    /* renamed from: b */
    public final Executor f9676b;

    /* renamed from: c */
    public final nq2 f9677c;

    /* renamed from: d */
    public final qw4 f9678d;

    /* renamed from: e */
    public final vv4<gp1> f9679e;

    /* renamed from: f */
    public final boolean f9680f;

    /* renamed from: g */
    public final boolean f9681g;

    /* renamed from: h */
    public final boolean f9682h;

    /* renamed from: i */
    public final int f9683i;

    /* renamed from: j */
    public final oh0 f9684j;

    /* renamed from: k */
    public final Runnable f9685k;

    /* renamed from: l */
    public final td6<Boolean> f9686l;

    /* renamed from: com.facebook.imagepipeline.producers.a$a */
    /* compiled from: DecodeProducer */
    public class C1957a extends C1959c {
        public C1957a(vq0<nh0<kh0>> vq0, wv4 wv4, boolean z, int i) {
            super(vq0, wv4, z, i);
        }

        /* renamed from: I */
        public synchronized boolean mo13413I(gp1 gp1, int i) {
            if (C3766zx.m31567f(i)) {
                return false;
            }
            return super.mo13413I(gp1, i);
        }

        /* renamed from: x */
        public int mo13414x(gp1 gp1) {
            return gp1.mo20756q();
        }

        /* renamed from: y */
        public qz4 mo13415y() {
            return ns2.m23450d(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a$b */
    /* compiled from: DecodeProducer */
    public class C1958b extends C1959c {

        /* renamed from: j */
        public final rw4 f9688j;

        /* renamed from: k */
        public final qw4 f9689k;

        /* renamed from: l */
        public int f9690l = 0;

        public C1958b(vq0<nh0<kh0>> vq0, wv4 wv4, rw4 rw4, qw4 qw4, boolean z, int i) {
            super(vq0, wv4, z, i);
            this.f9688j = (rw4) au4.m10792g(rw4);
            this.f9689k = (qw4) au4.m10792g(qw4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
            return r0;
         */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo13413I(p000.gp1 r4, int r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                boolean r0 = super.mo13413I(r4, r5)     // Catch:{ all -> 0x0055 }
                boolean r1 = p000.C3766zx.m31567f(r5)     // Catch:{ all -> 0x0055 }
                if (r1 != 0) goto L_0x0013
                r1 = 8
                boolean r1 = p000.C3766zx.m31570n(r5, r1)     // Catch:{ all -> 0x0055 }
                if (r1 == 0) goto L_0x0053
            L_0x0013:
                r1 = 4
                boolean r5 = p000.C3766zx.m31570n(r5, r1)     // Catch:{ all -> 0x0055 }
                if (r5 != 0) goto L_0x0053
                boolean r5 = p000.gp1.m18283C(r4)     // Catch:{ all -> 0x0055 }
                if (r5 == 0) goto L_0x0053
                rq2 r5 = r4.mo20751k()     // Catch:{ all -> 0x0055 }
                rq2 r1 = p000.r81.f17197a     // Catch:{ all -> 0x0055 }
                if (r5 != r1) goto L_0x0053
                rw4 r5 = r3.f9688j     // Catch:{ all -> 0x0055 }
                boolean r4 = r5.mo25558g(r4)     // Catch:{ all -> 0x0055 }
                r5 = 0
                if (r4 != 0) goto L_0x0033
                monitor-exit(r3)
                return r5
            L_0x0033:
                rw4 r4 = r3.f9688j     // Catch:{ all -> 0x0055 }
                int r4 = r4.mo25555d()     // Catch:{ all -> 0x0055 }
                int r1 = r3.f9690l     // Catch:{ all -> 0x0055 }
                if (r4 > r1) goto L_0x003f
                monitor-exit(r3)
                return r5
            L_0x003f:
                qw4 r2 = r3.f9689k     // Catch:{ all -> 0x0055 }
                int r1 = r2.mo25279a(r1)     // Catch:{ all -> 0x0055 }
                if (r4 >= r1) goto L_0x0051
                rw4 r1 = r3.f9688j     // Catch:{ all -> 0x0055 }
                boolean r1 = r1.mo25556e()     // Catch:{ all -> 0x0055 }
                if (r1 != 0) goto L_0x0051
                monitor-exit(r3)
                return r5
            L_0x0051:
                r3.f9690l = r4     // Catch:{ all -> 0x0055 }
            L_0x0053:
                monitor-exit(r3)
                return r0
            L_0x0055:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C1956a.C1958b.mo13413I(gp1, int):boolean");
        }

        /* renamed from: x */
        public int mo13414x(gp1 gp1) {
            return this.f9688j.mo25554c();
        }

        /* renamed from: y */
        public qz4 mo13415y() {
            return this.f9689k.mo25280b(this.f9688j.mo25555d());
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.a$c */
    /* compiled from: DecodeProducer */
    public abstract class C1959c extends sb1<gp1, nh0<kh0>> {

        /* renamed from: c */
        public final String f9692c = "ProgressiveDecoder";

        /* renamed from: d */
        public final wv4 f9693d;

        /* renamed from: e */
        public final aw4 f9694e;

        /* renamed from: f */
        public final lq2 f9695f;

        /* renamed from: g */
        public boolean f9696g;

        /* renamed from: h */
        public final JobScheduler f9697h;

        /* renamed from: com.facebook.imagepipeline.producers.a$c$a */
        /* compiled from: DecodeProducer */
        public class C1960a implements JobScheduler.C1952d {

            /* renamed from: a */
            public final /* synthetic */ C1956a f9699a;

            /* renamed from: b */
            public final /* synthetic */ wv4 f9700b;

            /* renamed from: c */
            public final /* synthetic */ int f9701c;

            public C1960a(C1956a aVar, wv4 wv4, int i) {
                this.f9699a = aVar;
                this.f9700b = wv4;
                this.f9701c = i;
            }

            /* renamed from: a */
            public void mo13400a(gp1 gp1, int i) {
                if (gp1 != null) {
                    C1959c.this.f9693d.mo20276b("image_format", gp1.mo20751k().mo25497a());
                    if (C1956a.this.f9680f || !C3766zx.m31570n(i, 16)) {
                        ImageRequest i2 = this.f9700b.mo20286i();
                        if (C1956a.this.f9681g || !i57.m19429l(i2.mo13458u())) {
                            xh5 s = i2.mo13455s();
                            i2.mo13453q();
                            gp1.mo20740S(ti1.m27754b(s, (te5) null, gp1, this.f9701c));
                        }
                    }
                    if (this.f9700b.mo20277c().mo23322D().mo24049A()) {
                        C1959c.this.mo13421F(gp1);
                    }
                    C1959c.this.mo13426v(gp1, i);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.producers.a$c$b */
        /* compiled from: DecodeProducer */
        public class C1961b extends C2439gz {

            /* renamed from: a */
            public final /* synthetic */ C1956a f9703a;

            /* renamed from: b */
            public final /* synthetic */ boolean f9704b;

            public C1961b(C1956a aVar, boolean z) {
                this.f9703a = aVar;
                this.f9704b = z;
            }

            /* renamed from: a */
            public void mo13429a() {
                if (C1959c.this.f9693d.mo20285h()) {
                    C1959c.this.f9697h.mo13395h();
                }
            }

            /* renamed from: b */
            public void mo13412b() {
                if (this.f9704b) {
                    C1959c.this.mo13428z();
                }
            }
        }

        public C1959c(vq0<nh0<kh0>> vq0, wv4 wv4, boolean z, int i) {
            super(vq0);
            this.f9693d = wv4;
            this.f9694e = wv4.mo20281g();
            lq2 g = wv4.mo20286i().mo13442g();
            this.f9695f = g;
            this.f9696g = false;
            this.f9697h = new JobScheduler(C1956a.this.f9676b, new C1960a(C1956a.this, wv4, i), g.f14639a);
            wv4.mo20292o(new C1961b(C1956a.this, z));
        }

        /* renamed from: A */
        public final void mo13416A(Throwable th) {
            mo13420E(true);
            mo25710p().mo27293b(th);
        }

        /* renamed from: B */
        public final void mo13417B(kh0 kh0, int i) {
            nh0 b = C1956a.this.f9684j.mo23950b(kh0);
            try {
                mo13420E(C3766zx.m31566e(i));
                mo25710p().mo27294c(b, i);
            } finally {
                nh0.m23178h(b);
            }
        }

        /* renamed from: C */
        public final kh0 mo13418C(gp1 gp1, int i, qz4 qz4) {
            boolean z;
            if (C1956a.this.f9685k == null || !((Boolean) C1956a.this.f9686l.get()).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            try {
                return C1956a.this.f9677c.mo13314a(gp1, i, qz4, this.f9695f);
            } catch (OutOfMemoryError e) {
                if (z) {
                    C1956a.this.f9685k.run();
                    System.gc();
                    return C1956a.this.f9677c.mo13314a(gp1, i, qz4, this.f9695f);
                }
                throw e;
            }
        }

        /* renamed from: D */
        public final synchronized boolean mo13419D() {
            return this.f9696g;
        }

        /* renamed from: E */
        public final void mo13420E(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f9696g) {
                        mo25710p().mo27295d(1.0f);
                        this.f9696g = true;
                        this.f9697h.mo13390c();
                    }
                }
            }
        }

        /* renamed from: F */
        public final void mo13421F(gp1 gp1) {
            if (gp1.mo20751k() == r81.f17197a) {
                gp1.mo20740S(ti1.m27755c(gp1, b30.m11039c(this.f9695f.f14645g), 104857600));
            }
        }

        /* renamed from: G */
        public void mo11352i(gp1 gp1, int i) {
            boolean d;
            try {
                if (lc2.m21369d()) {
                    lc2.m21366a("DecodeProducer#onNewResultImpl");
                }
                boolean e = C3766zx.m31566e(i);
                if (e) {
                    if (gp1 == null) {
                        mo13416A(new ExceptionWithNoStacktrace("Encoded image is null."));
                        if (!d) {
                            return;
                        }
                        return;
                    } else if (!gp1.mo20730A()) {
                        mo13416A(new ExceptionWithNoStacktrace("Encoded image is not valid."));
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                            return;
                        }
                        return;
                    }
                }
                if (mo13413I(gp1, i)) {
                    boolean n = C3766zx.m31570n(i, 4);
                    if (e || n || this.f9693d.mo20285h()) {
                        this.f9697h.mo13395h();
                    }
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                    }
                } else if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            } finally {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        }

        /* renamed from: H */
        public final void mo13423H(gp1 gp1, kh0 kh0) {
            Bitmap.Config config;
            this.f9693d.mo20276b("encoded_width", Integer.valueOf(gp1.mo20757s()));
            this.f9693d.mo20276b("encoded_height", Integer.valueOf(gp1.mo20750j()));
            this.f9693d.mo20276b("encoded_size", Integer.valueOf(gp1.mo20756q()));
            if (kh0 instanceof ih0) {
                Bitmap f = ((ih0) kh0).mo21538f();
                if (f == null) {
                    config = null;
                } else {
                    config = f.getConfig();
                }
                this.f9693d.mo20276b("bitmap_config", String.valueOf(config));
            }
            if (kh0 != null) {
                kh0.mo22291e(this.f9693d.getExtras());
            }
        }

        /* renamed from: I */
        public boolean mo13413I(gp1 gp1, int i) {
            return this.f9697h.mo13397k(gp1, i);
        }

        /* renamed from: g */
        public void mo13424g() {
            mo13428z();
        }

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            mo13416A(th);
        }

        /* renamed from: j */
        public void mo13425j(float f) {
            super.mo13425j(f * 0.99f);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x009e A[Catch:{ all -> 0x0128 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
        /* renamed from: v */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo13426v(p000.gp1 r21, int r22) {
            /*
                r20 = this;
                r11 = r20
                r12 = r21
                r0 = r22
                java.lang.String r13 = "DecodeProducer"
                rq2 r1 = r21.mo20751k()
                rq2 r2 = p000.r81.f17197a
                if (r1 == r2) goto L_0x0017
                boolean r1 = p000.C3766zx.m31567f(r22)
                if (r1 == 0) goto L_0x0017
                return
            L_0x0017:
                boolean r1 = r20.mo13419D()
                if (r1 != 0) goto L_0x012d
                boolean r1 = p000.gp1.m18283C(r21)
                if (r1 != 0) goto L_0x0025
                goto L_0x012d
            L_0x0025:
                rq2 r1 = r21.mo20751k()
                if (r1 == 0) goto L_0x0030
                java.lang.String r1 = r1.mo25497a()
                goto L_0x0032
            L_0x0030:
                java.lang.String r1 = "unknown"
            L_0x0032:
                r7 = r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                int r2 = r21.mo20757s()
                r1.append(r2)
                java.lang.String r2 = "x"
                r1.append(r2)
                int r2 = r21.mo20750j()
                r1.append(r2)
                java.lang.String r8 = r1.toString()
                int r1 = r21.mo20755p()
                java.lang.String r10 = java.lang.String.valueOf(r1)
                boolean r6 = p000.C3766zx.m31566e(r22)
                if (r6 == 0) goto L_0x0067
                r3 = 8
                boolean r3 = p000.C3766zx.m31570n(r0, r3)
                if (r3 != 0) goto L_0x0067
                r3 = 1
                goto L_0x0068
            L_0x0067:
                r3 = 0
            L_0x0068:
                r4 = 4
                boolean r5 = p000.C3766zx.m31570n(r0, r4)
                wv4 r9 = r11.f9693d
                com.facebook.imagepipeline.request.ImageRequest r9 = r9.mo20286i()
                r9.mo13453q()
                java.lang.String r9 = "unknown"
                com.facebook.imagepipeline.producers.JobScheduler r14 = r11.f9697h     // Catch:{ all -> 0x0128 }
                long r14 = r14.mo13393f()     // Catch:{ all -> 0x0128 }
                wv4 r1 = r11.f9693d     // Catch:{ all -> 0x0128 }
                com.facebook.imagepipeline.request.ImageRequest r1 = r1.mo20286i()     // Catch:{ all -> 0x0128 }
                android.net.Uri r1 = r1.mo13458u()     // Catch:{ all -> 0x0128 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0128 }
                if (r3 != 0) goto L_0x0096
                if (r5 == 0) goto L_0x0091
                goto L_0x0096
            L_0x0091:
                int r17 = r20.mo13414x(r21)     // Catch:{ all -> 0x0128 }
                goto L_0x009a
            L_0x0096:
                int r17 = r21.mo20756q()     // Catch:{ all -> 0x0128 }
            L_0x009a:
                r4 = r17
                if (r3 != 0) goto L_0x00a6
                if (r5 == 0) goto L_0x00a1
                goto L_0x00a6
            L_0x00a1:
                qz4 r3 = r20.mo13415y()     // Catch:{ all -> 0x0128 }
                goto L_0x00a8
            L_0x00a6:
                qz4 r3 = p000.ns2.f15676d     // Catch:{ all -> 0x0128 }
            L_0x00a8:
                r5 = r3
                aw4 r3 = r11.f9694e     // Catch:{ all -> 0x0128 }
                wv4 r2 = r11.f9693d     // Catch:{ all -> 0x0128 }
                r3.mo11176k(r2, r13)     // Catch:{ all -> 0x0128 }
                kh0 r3 = r11.mo13418C(r12, r4, r5)     // Catch:{ DecodeException -> 0x00e1 }
                int r1 = r21.mo20755p()     // Catch:{ Exception -> 0x00da }
                r2 = 1
                if (r1 == r2) goto L_0x00bd
                r0 = r0 | 16
            L_0x00bd:
                r1 = r20
                r2 = r3
                r19 = r3
                r3 = r14
                java.util.Map r1 = r1.mo13427w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0128 }
                aw4 r2 = r11.f9694e     // Catch:{ all -> 0x0128 }
                wv4 r3 = r11.f9693d     // Catch:{ all -> 0x0128 }
                r2.mo11170a(r3, r13, r1)     // Catch:{ all -> 0x0128 }
                r1 = r19
                r11.mo13423H(r12, r1)     // Catch:{ all -> 0x0128 }
                r11.mo13417B(r1, r0)     // Catch:{ all -> 0x0128 }
                p000.gp1.m18285c(r21)
                return
            L_0x00da:
                r0 = move-exception
                r1 = r3
                r2 = r1
                goto L_0x0113
            L_0x00de:
                r0 = move-exception
                r2 = 0
                goto L_0x0113
            L_0x00e1:
                r0 = move-exception
                r3 = r0
                gp1 r0 = r3.getEncodedImage()     // Catch:{ Exception -> 0x00de }
                java.lang.String r4 = "ProgressiveDecoder"
                java.lang.String r2 = "%s, {uri: %s, firstEncodedBytes: %s, length: %d}"
                r12 = 4
                java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x00de }
                java.lang.String r18 = r3.getMessage()     // Catch:{ Exception -> 0x00de }
                r16 = 0
                r12[r16] = r18     // Catch:{ Exception -> 0x00de }
                r16 = 1
                r12[r16] = r1     // Catch:{ Exception -> 0x00de }
                r1 = 10
                java.lang.String r1 = r0.mo20749i(r1)     // Catch:{ Exception -> 0x00de }
                r16 = 2
                r12[r16] = r1     // Catch:{ Exception -> 0x00de }
                r1 = 3
                int r0 = r0.mo20756q()     // Catch:{ Exception -> 0x00de }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00de }
                r12[r1] = r0     // Catch:{ Exception -> 0x00de }
                p000.oy1.m24437x(r4, r2, r12)     // Catch:{ Exception -> 0x00de }
                throw r3     // Catch:{ Exception -> 0x00de }
            L_0x0113:
                r1 = r20
                r3 = r14
                java.util.Map r1 = r1.mo13427w(r2, r3, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0128 }
                aw4 r2 = r11.f9694e     // Catch:{ all -> 0x0128 }
                wv4 r3 = r11.f9693d     // Catch:{ all -> 0x0128 }
                r2.mo11172f(r3, r13, r0, r1)     // Catch:{ all -> 0x0128 }
                r11.mo13416A(r0)     // Catch:{ all -> 0x0128 }
                p000.gp1.m18285c(r21)
                return
            L_0x0128:
                r0 = move-exception
                p000.gp1.m18285c(r21)
                throw r0
            L_0x012d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C1956a.C1959c.mo13426v(gp1, int):void");
        }

        /* renamed from: w */
        public final Map<String, String> mo13427w(kh0 kh0, long j, qz4 qz4, boolean z, String str, String str2, String str3, String str4) {
            kh0 kh02 = kh0;
            String str5 = str;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if (!this.f9694e.mo11175j(this.f9693d, "DecodeProducer")) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(qz4.mo23796b());
            String valueOf3 = String.valueOf(z);
            if (kh02 instanceof qh0) {
                Bitmap f = ((qh0) kh02).mo21538f();
                au4.m10792g(f);
                HashMap hashMap = new HashMap(8);
                hashMap.put("bitmapSize", f.getWidth() + "x" + f.getHeight());
                hashMap.put("queueTime", valueOf);
                hashMap.put("hasGoodQuality", valueOf2);
                hashMap.put("isFinal", valueOf3);
                hashMap.put("encodedImageSize", str6);
                hashMap.put("imageFormat", str5);
                hashMap.put("requestedImageSize", str7);
                hashMap.put("sampleSize", str4);
                hashMap.put("byteCount", f.getByteCount() + "");
                return ImmutableMap.copyOf(hashMap);
            }
            String str9 = str8;
            HashMap hashMap2 = new HashMap(7);
            hashMap2.put("queueTime", valueOf);
            hashMap2.put("hasGoodQuality", valueOf2);
            hashMap2.put("isFinal", valueOf3);
            hashMap2.put("encodedImageSize", str6);
            hashMap2.put("imageFormat", str5);
            hashMap2.put("requestedImageSize", str7);
            hashMap2.put("sampleSize", str9);
            return ImmutableMap.copyOf(hashMap2);
        }

        /* renamed from: x */
        public abstract int mo13414x(gp1 gp1);

        /* renamed from: y */
        public abstract qz4 mo13415y();

        /* renamed from: z */
        public final void mo13428z() {
            mo13420E(true);
            mo25710p().mo27292a();
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, vv4<gp1>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1956a(p000.j60 r1, java.util.concurrent.Executor r2, p000.nq2 r3, p000.qw4 r4, boolean r5, boolean r6, boolean r7, p000.vv4<p000.gp1> r8, int r9, p000.oh0 r10, java.lang.Runnable r11, p000.td6<java.lang.Boolean> r12) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = p000.au4.m10792g(r1)
            j60 r1 = (p000.j60) r1
            r0.f9675a = r1
            java.lang.Object r1 = p000.au4.m10792g(r2)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.f9676b = r1
            java.lang.Object r1 = p000.au4.m10792g(r3)
            nq2 r1 = (p000.nq2) r1
            r0.f9677c = r1
            java.lang.Object r1 = p000.au4.m10792g(r4)
            qw4 r1 = (p000.qw4) r1
            r0.f9678d = r1
            r0.f9680f = r5
            r0.f9681g = r6
            java.lang.Object r1 = p000.au4.m10792g(r8)
            vv4 r1 = (p000.vv4) r1
            r0.f9679e = r1
            r0.f9682h = r7
            r0.f9683i = r9
            r0.f9684j = r10
            r0.f9685k = r11
            r0.f9686l = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C1956a.<init>(j60, java.util.concurrent.Executor, nq2, qw4, boolean, boolean, boolean, vv4, int, oh0, java.lang.Runnable, td6):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.facebook.imagepipeline.producers.a$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.facebook.imagepipeline.producers.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.facebook.imagepipeline.producers.a$a} */
    /* JADX WARNING: type inference failed for: r0v4, types: [vq0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11350a(p000.vq0<p000.nh0<p000.kh0>> r10, p000.wv4 r11) {
        /*
            r9 = this;
            boolean r0 = p000.lc2.m21369d()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "DecodeProducer#produceResults"
            p000.lc2.m21366a(r0)     // Catch:{ all -> 0x004d }
        L_0x000b:
            com.facebook.imagepipeline.request.ImageRequest r0 = r11.mo20286i()     // Catch:{ all -> 0x004d }
            android.net.Uri r0 = r0.mo13458u()     // Catch:{ all -> 0x004d }
            boolean r0 = p000.i57.m19429l(r0)     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0027
            com.facebook.imagepipeline.producers.a$a r0 = new com.facebook.imagepipeline.producers.a$a     // Catch:{ all -> 0x004d }
            boolean r5 = r9.f9682h     // Catch:{ all -> 0x004d }
            int r6 = r9.f9683i     // Catch:{ all -> 0x004d }
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x004d }
            goto L_0x003e
        L_0x0027:
            rw4 r4 = new rw4     // Catch:{ all -> 0x004d }
            j60 r0 = r9.f9675a     // Catch:{ all -> 0x004d }
            r4.<init>(r0)     // Catch:{ all -> 0x004d }
            com.facebook.imagepipeline.producers.a$b r8 = new com.facebook.imagepipeline.producers.a$b     // Catch:{ all -> 0x004d }
            qw4 r5 = r9.f9678d     // Catch:{ all -> 0x004d }
            boolean r6 = r9.f9682h     // Catch:{ all -> 0x004d }
            int r7 = r9.f9683i     // Catch:{ all -> 0x004d }
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004d }
            r0 = r8
        L_0x003e:
            vv4<gp1> r10 = r9.f9679e     // Catch:{ all -> 0x004d }
            r10.mo11350a(r0, r11)     // Catch:{ all -> 0x004d }
            boolean r10 = p000.lc2.m21369d()
            if (r10 == 0) goto L_0x004c
            p000.lc2.m21367b()
        L_0x004c:
            return
        L_0x004d:
            r10 = move-exception
            boolean r11 = p000.lc2.m21369d()
            if (r11 == 0) goto L_0x0057
            p000.lc2.m21367b()
        L_0x0057:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C1956a.mo11350a(vq0, wv4):void");
    }
}
