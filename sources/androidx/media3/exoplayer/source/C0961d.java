package androidx.media3.exoplayer.source;

import android.content.Context;
import androidx.media3.common.C0792h;
import androidx.media3.common.C0798k;
import androidx.media3.exoplayer.source.C0973i;
import androidx.media3.exoplayer.source.C0992n;
import androidx.media3.exoplayer.source.C1008s;
import androidx.media3.exoplayer.upstream.C1019b;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p000.j71;
import p000.x11;
import p000.xs5;

/* renamed from: androidx.media3.exoplayer.source.d */
/* compiled from: DefaultMediaSourceFactory */
public final class C0961d implements C0973i.C0974a {

    /* renamed from: a */
    public final C0962a f5215a;

    /* renamed from: b */
    public x11.C3565a f5216b;

    /* renamed from: c */
    public C0973i.C0974a f5217c;

    /* renamed from: d */
    public C1019b f5218d;

    /* renamed from: e */
    public long f5219e;

    /* renamed from: f */
    public long f5220f;

    /* renamed from: g */
    public long f5221g;

    /* renamed from: h */
    public float f5222h;

    /* renamed from: i */
    public float f5223i;

    /* renamed from: j */
    public boolean f5224j;

    /* renamed from: androidx.media3.exoplayer.source.d$a */
    /* compiled from: DefaultMediaSourceFactory */
    public static final class C0962a {

        /* renamed from: a */
        public final ny1 f5225a;

        /* renamed from: b */
        public final Map<Integer, rd6<C0973i.C0974a>> f5226b = new HashMap();

        /* renamed from: c */
        public final Set<Integer> f5227c = new HashSet();

        /* renamed from: d */
        public final Map<Integer, C0973i.C0974a> f5228d = new HashMap();

        /* renamed from: e */
        public x11.C3565a f5229e;

        /* renamed from: f */
        public rk1 f5230f;

        /* renamed from: g */
        public C1019b f5231g;

        public C0962a(ny1 ny1) {
            this.f5225a = ny1;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ C0973i.C0974a m7097k(x11.C3565a aVar) {
            return new C0992n.C0994b(aVar, this.f5225a);
        }

        /* renamed from: f */
        public C0973i.C0974a mo7611f(int i) {
            C0973i.C0974a aVar = this.f5228d.get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            rd6<C0973i.C0974a> l = mo7612l(i);
            if (l == null) {
                return null;
            }
            C0973i.C0974a aVar2 = l.get();
            rk1 rk1 = this.f5230f;
            if (rk1 != null) {
                aVar2.mo7207b(rk1);
            }
            C1019b bVar = this.f5231g;
            if (bVar != null) {
                aVar2.mo7208c(bVar);
            }
            this.f5228d.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p000.rd6<androidx.media3.exoplayer.source.C0973i.C0974a> mo7612l(int r5) {
            /*
                r4 = this;
                java.lang.Class<androidx.media3.exoplayer.source.i$a> r0 = androidx.media3.exoplayer.source.C0973i.C0974a.class
                java.util.Map<java.lang.Integer, rd6<androidx.media3.exoplayer.source.i$a>> r1 = r4.f5226b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L_0x001b
                java.util.Map<java.lang.Integer, rd6<androidx.media3.exoplayer.source.i$a>> r0 = r4.f5226b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r0.get(r5)
                rd6 r5 = (p000.rd6) r5
                return r5
            L_0x001b:
                r1 = 0
                x11$a r2 = r4.f5229e
                java.lang.Object r2 = p000.C2725kr.m20985e(r2)
                x11$a r2 = (p000.x11.C3565a) r2
                if (r5 == 0) goto L_0x006b
                r3 = 1
                if (r5 == r3) goto L_0x005b
                r3 = 2
                if (r5 == r3) goto L_0x004b
                r3 = 3
                if (r5 == r3) goto L_0x003a
                r0 = 4
                if (r5 == r0) goto L_0x0033
                goto L_0x0077
            L_0x0033:
                f91 r0 = new f91     // Catch:{ ClassNotFoundException -> 0x0077 }
                r0.<init>(r4, r2)     // Catch:{ ClassNotFoundException -> 0x0077 }
                r1 = r0
                goto L_0x0077
            L_0x003a:
                java.lang.String r2 = "androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0077 }
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0077 }
                e91 r2 = new e91     // Catch:{ ClassNotFoundException -> 0x0077 }
                r2.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0077 }
                r1 = r2
                goto L_0x0077
            L_0x004b:
                java.lang.String r3 = "androidx.media3.exoplayer.hls.HlsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0077 }
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0077 }
                d91 r3 = new d91     // Catch:{ ClassNotFoundException -> 0x0077 }
                r3.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0077 }
                goto L_0x0076
            L_0x005b:
                java.lang.String r3 = "androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x0077 }
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0077 }
                c91 r3 = new c91     // Catch:{ ClassNotFoundException -> 0x0077 }
                r3.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0077 }
                goto L_0x0076
            L_0x006b:
                java.lang.Class<androidx.media3.exoplayer.dash.DashMediaSource$Factory> r3 = androidx.media3.exoplayer.dash.DashMediaSource.Factory.class
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch:{ ClassNotFoundException -> 0x0077 }
                b91 r3 = new b91     // Catch:{ ClassNotFoundException -> 0x0077 }
                r3.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0077 }
            L_0x0076:
                r1 = r3
            L_0x0077:
                java.util.Map<java.lang.Integer, rd6<androidx.media3.exoplayer.source.i$a>> r0 = r4.f5226b
                java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
                r0.put(r2, r1)
                if (r1 == 0) goto L_0x008b
                java.util.Set<java.lang.Integer> r0 = r4.f5227c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.add(r5)
            L_0x008b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C0961d.C0962a.mo7612l(int):rd6");
        }

        /* renamed from: m */
        public void mo7613m(x11.C3565a aVar) {
            if (aVar != this.f5229e) {
                this.f5229e = aVar;
                this.f5226b.clear();
                this.f5228d.clear();
            }
        }

        /* renamed from: n */
        public void mo7614n(rk1 rk1) {
            this.f5230f = rk1;
            for (C0973i.C0974a b : this.f5228d.values()) {
                b.mo7207b(rk1);
            }
        }

        /* renamed from: o */
        public void mo7615o(C1019b bVar) {
            this.f5231g = bVar;
            for (C0973i.C0974a c : this.f5228d.values()) {
                c.mo7208c(bVar);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.source.d$b */
    /* compiled from: DefaultMediaSourceFactory */
    public static final class C0963b implements hy1 {

        /* renamed from: a */
        public final C0792h f5232a;

        public C0963b(C0792h hVar) {
            this.f5232a = hVar;
        }

        /* renamed from: a */
        public void mo151a() {
        }

        /* renamed from: b */
        public void mo152b(long j, long j2) {
        }

        /* renamed from: d */
        public int mo154d(iy1 iy1, mt4 mt4) throws IOException {
            if (iy1.mo83a(Integer.MAX_VALUE) == -1) {
                return -1;
            }
            return 0;
        }

        /* renamed from: e */
        public boolean mo155e(iy1 iy1) {
            return true;
        }

        /* renamed from: j */
        public void mo159j(jy1 jy1) {
            zs6 f = jy1.mo7713f(0, 3);
            jy1.mo7715g(new xs5.C3642b(CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED));
            jy1.mo7722p();
            f.mo7303d(this.f5232a.mo6636b().mo6670e0("text/x-unknown").mo6648I(this.f5232a.f4175C).mo6644E());
        }
    }

    public C0961d(Context context, ny1 ny1) {
        this((x11.C3565a) new j71.C2584a(context), ny1);
    }

    /* renamed from: g */
    public static /* synthetic */ hy1[] m7078g(C0792h hVar) {
        hy1 hy1;
        hy1[] hy1Arr = new hy1[1];
        zc6 zc6 = zc6.f20528a;
        if (zc6.mo28419a(hVar)) {
            hy1 = new ad6(zc6.mo28420b(hVar), hVar);
        } else {
            hy1 = new C0963b(hVar);
        }
        hy1Arr[0] = hy1;
        return hy1Arr;
    }

    /* renamed from: h */
    public static C0973i m7079h(C0798k kVar, C0973i iVar) {
        C0798k.C0802d dVar = kVar.f4248r;
        long j = dVar.f4265a;
        if (j == 0 && dVar.f4266d == Long.MIN_VALUE && !dVar.f4268g) {
            return iVar;
        }
        long y0 = w67.m29391y0(j);
        long y02 = w67.m29391y0(kVar.f4248r.f4266d);
        C0798k.C0802d dVar2 = kVar.f4248r;
        return new ClippingMediaSource(iVar, y0, y02, !dVar2.f4269k, dVar2.f4267e, dVar2.f4268g);
    }

    /* renamed from: j */
    public static C0973i.C0974a m7080j(Class<? extends C0973i.C0974a> cls) {
        try {
            return (C0973i.C0974a) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static C0973i.C0974a m7081k(Class<? extends C0973i.C0974a> cls, x11.C3565a aVar) {
        try {
            return (C0973i.C0974a) cls.getConstructor(new Class[]{x11.C3565a.class}).newInstance(new Object[]{aVar});
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    public C0973i mo7206a(C0798k kVar) {
        C2725kr.m20985e(kVar.f4244d);
        String scheme = kVar.f4244d.f4307a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((C0973i.C0974a) C2725kr.m20985e(this.f5217c)).mo7206a(kVar);
        }
        C0798k.C0809h hVar = kVar.f4244d;
        int m0 = w67.m29367m0(hVar.f4307a, hVar.f4308b);
        C0973i.C0974a f = this.f5215a.mo7611f(m0);
        C2725kr.m20990j(f, "No suitable media source factory found for content type: " + m0);
        C0798k.C0807g.C0808a b = kVar.f4246g.mo6776b();
        if (kVar.f4246g.f4297a == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            b.mo6784k(this.f5219e);
        }
        if (kVar.f4246g.f4300g == -3.4028235E38f) {
            b.mo6783j(this.f5222h);
        }
        if (kVar.f4246g.f4301k == -3.4028235E38f) {
            b.mo6781h(this.f5223i);
        }
        if (kVar.f4246g.f4298d == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            b.mo6782i(this.f5220f);
        }
        if (kVar.f4246g.f4299e == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            b.mo6780g(this.f5221g);
        }
        C0798k.C0807g f2 = b.mo6779f();
        if (!f2.equals(kVar.f4246g)) {
            kVar = kVar.mo6750b().mo6755c(f2).mo6753a();
        }
        C0973i a = f.mo7206a(kVar);
        ImmutableList<C0798k.C0814l> immutableList = ((C0798k.C0809h) w67.m29360j(kVar.f4244d)).f4312f;
        if (!immutableList.isEmpty()) {
            C0973i[] iVarArr = new C0973i[(immutableList.size() + 1)];
            iVarArr[0] = a;
            for (int i = 0; i < immutableList.size(); i++) {
                if (this.f5224j) {
                    C0992n.C0994b bVar = new C0992n.C0994b(this.f5216b, (ny1) new a91(new C0792h.C0794b().mo6670e0(immutableList.get(i).f4324b).mo6661V(immutableList.get(i).f4325c).mo6672g0(immutableList.get(i).f4326d).mo6668c0(immutableList.get(i).f4327e).mo6660U(immutableList.get(i).f4328f).mo6658S(immutableList.get(i).f4329g).mo6644E()));
                    C1019b bVar2 = this.f5218d;
                    if (bVar2 != null) {
                        bVar.mo7208c(bVar2);
                    }
                    iVarArr[i + 1] = bVar.mo7206a(C0798k.m5506e(immutableList.get(i).f4323a.toString()));
                } else {
                    C1008s.C1010b bVar3 = new C1008s.C1010b(this.f5216b);
                    C1019b bVar4 = this.f5218d;
                    if (bVar4 != null) {
                        bVar3.mo7805b(bVar4);
                    }
                    iVarArr[i + 1] = bVar3.mo7804a(immutableList.get(i), CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                }
            }
            a = new MergingMediaSource(iVarArr);
        }
        return mo7608i(kVar, m7079h(kVar, a));
    }

    /* renamed from: i */
    public final C0973i mo7608i(C0798k kVar, C0973i iVar) {
        C2725kr.m20985e(kVar.f4244d);
        kVar.f4244d.getClass();
        return iVar;
    }

    /* renamed from: l */
    public C0961d mo7207b(rk1 rk1) {
        this.f5215a.mo7614n((rk1) C2725kr.m20986f(rk1, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    /* renamed from: m */
    public C0961d mo7208c(C1019b bVar) {
        this.f5218d = (C1019b) C2725kr.m20986f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f5215a.mo7615o(bVar);
        return this;
    }

    public C0961d(x11.C3565a aVar, ny1 ny1) {
        this.f5216b = aVar;
        C0962a aVar2 = new C0962a(ny1);
        this.f5215a = aVar2;
        aVar2.mo7613m(aVar);
        this.f5219e = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5220f = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5221g = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        this.f5222h = -3.4028235E38f;
        this.f5223i = -3.4028235E38f;
    }
}
