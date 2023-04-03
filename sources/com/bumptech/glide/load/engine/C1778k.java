package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1756c;
import java.io.IOException;
import java.util.List;
import p000.mw3;
import p000.r11;

/* renamed from: com.bumptech.glide.load.engine.k */
/* compiled from: SourceGenerator */
public class C1778k implements C1756c, C1756c.C1757a {

    /* renamed from: a */
    public final C1758d<?> f8907a;

    /* renamed from: d */
    public final C1756c.C1757a f8908d;

    /* renamed from: e */
    public volatile int f8909e;

    /* renamed from: g */
    public volatile C1755b f8910g;

    /* renamed from: k */
    public volatile Object f8911k;

    /* renamed from: r */
    public volatile mw3.C2853a<?> f8912r;

    /* renamed from: s */
    public volatile k11 f8913s;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    /* compiled from: SourceGenerator */
    public class C1779a implements r11.C3179a<Object> {

        /* renamed from: a */
        public final /* synthetic */ mw3.C2853a f8914a;

        public C1779a(mw3.C2853a aVar) {
            this.f8914a = aVar;
        }

        /* renamed from: c */
        public void mo12485c(Exception exc) {
            if (C1778k.this.mo12573d(this.f8914a)) {
                C1778k.this.mo12575i(this.f8914a, exc);
            }
        }

        /* renamed from: f */
        public void mo12487f(Object obj) {
            if (C1778k.this.mo12573d(this.f8914a)) {
                C1778k.this.mo12574h(this.f8914a, obj);
            }
        }
    }

    public C1778k(C1758d<?> dVar, C1756c.C1757a aVar) {
        this.f8907a = dVar;
        this.f8908d = aVar;
    }

    /* renamed from: a */
    public boolean mo12483a() {
        if (this.f8911k != null) {
            Object obj = this.f8911k;
            this.f8911k = null;
            try {
                if (!mo12571b(obj)) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f8910g != null && this.f8910g.mo12483a()) {
            return true;
        }
        this.f8910g = null;
        this.f8912r = null;
        boolean z = false;
        while (!z && mo12572c()) {
            List<mw3.C2853a<?>> g = this.f8907a.mo12494g();
            int i = this.f8909e;
            this.f8909e = i + 1;
            this.f8912r = g.get(i);
            if (this.f8912r != null && (this.f8907a.mo12492e().mo27731c(this.f8912r.f15262c.mo11944e()) || this.f8907a.mo12508u(this.f8912r.f15262c.mo11939a()))) {
                mo12576j(this.f8912r);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12571b(java.lang.Object r13) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "SourceGenerator"
            long r1 = p000.ok3.m23850b()
            r3 = 1
            r4 = 0
            com.bumptech.glide.load.engine.d<?> r5 = r12.f8907a     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.data.a r5 = r5.mo12502o(r13)     // Catch:{ all -> 0x00ce }
            java.lang.Object r6 = r5.mo12397a()     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.d<?> r7 = r12.f8907a     // Catch:{ all -> 0x00ce }
            np1 r7 = r7.mo12504q(r6)     // Catch:{ all -> 0x00ce }
            l11 r8 = new l11     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.d<?> r9 = r12.f8907a     // Catch:{ all -> 0x00ce }
            xi4 r9 = r9.mo12498k()     // Catch:{ all -> 0x00ce }
            r8.<init>(r7, r6, r9)     // Catch:{ all -> 0x00ce }
            k11 r6 = new k11     // Catch:{ all -> 0x00ce }
            mw3$a<?> r9 = r12.f8912r     // Catch:{ all -> 0x00ce }
            z93 r9 = r9.f15260a     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.d<?> r10 = r12.f8907a     // Catch:{ all -> 0x00ce }
            z93 r10 = r10.mo12503p()     // Catch:{ all -> 0x00ce }
            r6.<init>(r9, r10)     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.d<?> r9 = r12.f8907a     // Catch:{ all -> 0x00ce }
            tg1 r9 = r9.mo12491d()     // Catch:{ all -> 0x00ce }
            r9.mo19244b(r6, r8)     // Catch:{ all -> 0x00ce }
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x00ce }
            java.lang.String r10 = ", data: "
            if (r8 == 0) goto L_0x006b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r8.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r11 = "Finished encoding source to cache, key: "
            r8.append(r11)     // Catch:{ all -> 0x00ce }
            r8.append(r6)     // Catch:{ all -> 0x00ce }
            r8.append(r10)     // Catch:{ all -> 0x00ce }
            r8.append(r13)     // Catch:{ all -> 0x00ce }
            java.lang.String r11 = ", encoder: "
            r8.append(r11)     // Catch:{ all -> 0x00ce }
            r8.append(r7)     // Catch:{ all -> 0x00ce }
            java.lang.String r7 = ", duration: "
            r8.append(r7)     // Catch:{ all -> 0x00ce }
            double r1 = p000.ok3.m23849a(r1)     // Catch:{ all -> 0x00ce }
            r8.append(r1)     // Catch:{ all -> 0x00ce }
        L_0x006b:
            java.io.File r1 = r9.mo19243a(r6)     // Catch:{ all -> 0x00ce }
            if (r1 == 0) goto L_0x008c
            r12.f8913s = r6     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.b r13 = new com.bumptech.glide.load.engine.b     // Catch:{ all -> 0x00ce }
            mw3$a<?> r0 = r12.f8912r     // Catch:{ all -> 0x00ce }
            z93 r0 = r0.f15260a     // Catch:{ all -> 0x00ce }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00ce }
            com.bumptech.glide.load.engine.d<?> r1 = r12.f8907a     // Catch:{ all -> 0x00ce }
            r13.<init>(r0, r1, r12)     // Catch:{ all -> 0x00ce }
            r12.f8910g = r13     // Catch:{ all -> 0x00ce }
            mw3$a<?> r13 = r12.f8912r
            r11<Data> r13 = r13.f15262c
            r13.mo11940b()
            return r3
        L_0x008c:
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00ad
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r0.<init>()     // Catch:{ all -> 0x00ce }
            java.lang.String r1 = "Attempt to write: "
            r0.append(r1)     // Catch:{ all -> 0x00ce }
            k11 r1 = r12.f8913s     // Catch:{ all -> 0x00ce }
            r0.append(r1)     // Catch:{ all -> 0x00ce }
            r0.append(r10)     // Catch:{ all -> 0x00ce }
            r0.append(r13)     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."
            r0.append(r13)     // Catch:{ all -> 0x00ce }
        L_0x00ad:
            com.bumptech.glide.load.engine.c$a r13 = r12.f8908d     // Catch:{ all -> 0x00cc }
            mw3$a<?> r0 = r12.f8912r     // Catch:{ all -> 0x00cc }
            z93 r6 = r0.f15260a     // Catch:{ all -> 0x00cc }
            java.lang.Object r7 = r5.mo12397a()     // Catch:{ all -> 0x00cc }
            mw3$a<?> r0 = r12.f8912r     // Catch:{ all -> 0x00cc }
            r11<Data> r8 = r0.f15262c     // Catch:{ all -> 0x00cc }
            mw3$a<?> r0 = r12.f8912r     // Catch:{ all -> 0x00cc }
            r11<Data> r0 = r0.f15262c     // Catch:{ all -> 0x00cc }
            com.bumptech.glide.load.DataSource r9 = r0.mo11944e()     // Catch:{ all -> 0x00cc }
            mw3$a<?> r0 = r12.f8912r     // Catch:{ all -> 0x00cc }
            z93 r10 = r0.f15260a     // Catch:{ all -> 0x00cc }
            r5 = r13
            r5.mo12422e(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00cc }
            return r4
        L_0x00cc:
            r13 = move-exception
            goto L_0x00d0
        L_0x00ce:
            r13 = move-exception
            r3 = r4
        L_0x00d0:
            if (r3 != 0) goto L_0x00d9
            mw3$a<?> r0 = r12.f8912r
            r11<Data> r0 = r0.f15262c
            r0.mo11940b()
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C1778k.mo12571b(java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final boolean mo12572c() {
        if (this.f8909e < this.f8907a.mo12494g().size()) {
            return true;
        }
        return false;
    }

    public void cancel() {
        mw3.C2853a<?> aVar = this.f8912r;
        if (aVar != null) {
            aVar.f15262c.cancel();
        }
    }

    /* renamed from: d */
    public boolean mo12573d(mw3.C2853a<?> aVar) {
        mw3.C2853a<?> aVar2 = this.f8912r;
        if (aVar2 == null || aVar2 != aVar) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo12422e(z93 z93, Object obj, r11<?> r11, DataSource dataSource, z93 z932) {
        this.f8908d.mo12422e(z93, obj, r11, this.f8912r.f15262c.mo11944e(), z93);
    }

    /* renamed from: f */
    public void mo12423f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public void mo12424g(z93 z93, Exception exc, r11<?> r11, DataSource dataSource) {
        this.f8908d.mo12424g(z93, exc, r11, this.f8912r.f15262c.mo11944e());
    }

    /* renamed from: h */
    public void mo12574h(mw3.C2853a<?> aVar, Object obj) {
        xg1 e = this.f8907a.mo12492e();
        if (obj == null || !e.mo27731c(aVar.f15262c.mo11944e())) {
            C1756c.C1757a aVar2 = this.f8908d;
            z93 z93 = aVar.f15260a;
            r11<Data> r11 = aVar.f15262c;
            aVar2.mo12422e(z93, obj, r11, r11.mo11944e(), this.f8913s);
            return;
        }
        this.f8911k = obj;
        this.f8908d.mo12423f();
    }

    /* renamed from: i */
    public void mo12575i(mw3.C2853a<?> aVar, Exception exc) {
        C1756c.C1757a aVar2 = this.f8908d;
        k11 k11 = this.f8913s;
        r11<Data> r11 = aVar.f15262c;
        aVar2.mo12424g(k11, exc, r11, r11.mo11944e());
    }

    /* renamed from: j */
    public final void mo12576j(mw3.C2853a<?> aVar) {
        this.f8912r.f15262c.mo11943d(this.f8907a.mo12499l(), new C1779a(aVar));
    }
}
