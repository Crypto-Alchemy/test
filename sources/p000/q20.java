package p000;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: q20 */
/* compiled from: BitmapMemoryCacheProducer */
public class q20 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final ys3<f80, kh0> f16713a;

    /* renamed from: b */
    public final g80 f16714b;

    /* renamed from: c */
    public final vv4<nh0<kh0>> f16715c;

    /* renamed from: q20$a */
    /* compiled from: BitmapMemoryCacheProducer */
    public class C3105a extends sb1<nh0<kh0>, nh0<kh0>> {

        /* renamed from: c */
        public final /* synthetic */ f80 f16716c;

        /* renamed from: d */
        public final /* synthetic */ boolean f16717d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3105a(vq0 vq0, f80 f80, boolean z) {
            super(vq0);
            this.f16716c = f80;
            this.f16717d = z;
        }

        /* renamed from: q */
        public void mo11352i(nh0<kh0> nh0, int i) {
            nh0<V> nh02;
            nh0 nh03;
            try {
                if (lc2.m21369d()) {
                    lc2.m21366a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean e = C3766zx.m31566e(i);
                nh02 = null;
                if (nh0 == null) {
                    if (e) {
                        mo25710p().mo27294c(null, i);
                    }
                    if (lc2.m21369d()) {
                        lc2.m21367b();
                        return;
                    }
                    return;
                }
                if (!nh0.mo23684j().mo21176c()) {
                    if (!C3766zx.m31570n(i, 8)) {
                        if (!e && (nh03 = q20.this.f16713a.get(this.f16716c)) != null) {
                            qz4 a = nh0.mo23684j().mo22289a();
                            qz4 a2 = ((kh0) nh03.mo23684j()).mo22289a();
                            if (a2.mo23795a() || a2.mo23797c() >= a.mo23797c()) {
                                mo25710p().mo27294c(nh03, i);
                                nh0.m23178h(nh03);
                                if (lc2.m21369d()) {
                                    lc2.m21367b();
                                    return;
                                }
                                return;
                            }
                            nh0.m23178h(nh03);
                        }
                        if (this.f16717d) {
                            nh02 = q20.this.f16713a.mo19973b(this.f16716c, nh0);
                        }
                        if (e) {
                            mo25710p().mo27295d(1.0f);
                        }
                        vq0 p = mo25710p();
                        if (nh02 != null) {
                            nh0 = nh02;
                        }
                        p.mo27294c(nh0, i);
                        nh0.m23178h(nh02);
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                            return;
                        }
                        return;
                    }
                }
                mo25710p().mo27294c(nh0, i);
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            } catch (Throwable th) {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
                throw th;
            }
        }
    }

    public q20(ys3<f80, kh0> ys3, g80 g80, vv4<nh0<kh0>> vv4) {
        this.f16713a = ys3;
        this.f16714b = g80;
        this.f16715c = vv4;
    }

    /* renamed from: e */
    public static void m25325e(il2 il2, wv4 wv4) {
        wv4.mo20288k(il2.getExtras());
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        nh0<kh0> nh0;
        Map map;
        boolean d;
        Map map2;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("BitmapMemoryCacheProducer#produceResults");
            }
            aw4 g = wv4.mo20281g();
            g.mo11176k(wv4, mo23474d());
            f80 a = this.f16714b.mo71a(wv4.mo20286i(), wv4.mo20275a());
            Map map3 = null;
            if (wv4.mo20286i().mo13460x(1)) {
                nh0 = this.f16713a.get(a);
            } else {
                nh0 = null;
            }
            if (nh0 != null) {
                m25325e(nh0.mo23684j(), wv4);
                boolean a2 = nh0.mo23684j().mo22289a().mo23795a();
                if (a2) {
                    String d2 = mo23474d();
                    if (g.mo11175j(wv4, mo23474d())) {
                        map2 = ImmutableMap.m13301of("cached_value_found", "true");
                    } else {
                        map2 = null;
                    }
                    g.mo11170a(wv4, d2, map2);
                    g.mo11171c(wv4, mo23474d(), true);
                    wv4.mo20278d("memory_bitmap", mo23473c());
                    vq0.mo27295d(1.0f);
                }
                vq0.mo27294c(nh0, C3766zx.m31568l(a2));
                nh0.close();
                if (a2) {
                    if (!d) {
                        return;
                    }
                    return;
                }
            }
            if (wv4.mo20291n().getValue() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.getValue()) {
                String d3 = mo23474d();
                if (g.mo11175j(wv4, mo23474d())) {
                    map = ImmutableMap.m13301of("cached_value_found", "false");
                } else {
                    map = null;
                }
                g.mo11170a(wv4, d3, map);
                g.mo11171c(wv4, mo23474d(), false);
                wv4.mo20278d("memory_bitmap", mo23473c());
                vq0.mo27294c(null, 1);
                if (lc2.m21369d()) {
                    lc2.m21367b();
                    return;
                }
                return;
            }
            vq0<nh0<kh0>> f = mo23475f(vq0, a, wv4.mo20286i().mo13460x(2));
            String d4 = mo23474d();
            if (g.mo11175j(wv4, mo23474d())) {
                map3 = ImmutableMap.m13301of("cached_value_found", "false");
            }
            g.mo11170a(wv4, d4, map3);
            if (lc2.m21369d()) {
                lc2.m21366a("mInputProducer.produceResult");
            }
            this.f16715c.mo11350a(f, wv4);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: c */
    public String mo23473c() {
        return "pipe_bg";
    }

    /* renamed from: d */
    public String mo23474d() {
        return "BitmapMemoryCacheProducer";
    }

    /* renamed from: f */
    public vq0<nh0<kh0>> mo23475f(vq0<nh0<kh0>> vq0, f80 f80, boolean z) {
        return new C3105a(vq0, f80, z);
    }
}
