package p000;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: ip1 */
/* compiled from: EncodedMemoryCacheProducer */
public class ip1 implements vv4<gp1> {

    /* renamed from: a */
    public final ys3<f80, PooledByteBuffer> f13360a;

    /* renamed from: b */
    public final g80 f13361b;

    /* renamed from: c */
    public final vv4<gp1> f13362c;

    /* renamed from: ip1$a */
    /* compiled from: EncodedMemoryCacheProducer */
    public static class C2565a extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final ys3<f80, PooledByteBuffer> f13363c;

        /* renamed from: d */
        public final f80 f13364d;

        /* renamed from: e */
        public final boolean f13365e;

        /* renamed from: f */
        public final boolean f13366f;

        public C2565a(vq0<gp1> vq0, ys3<f80, PooledByteBuffer> ys3, f80 f80, boolean z, boolean z2) {
            super(vq0);
            this.f13363c = ys3;
            this.f13364d = f80;
            this.f13365e = z;
            this.f13366f = z2;
        }

        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            nh0<PooledByteBuffer> e;
            nh0<PooledByteBuffer> nh0;
            gp1 gp12;
            try {
                if (lc2.m21369d()) {
                    lc2.m21366a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                if (!C3766zx.m31567f(i) && gp1 != null && !C3766zx.m31569m(i, 10)) {
                    if (gp1.mo20751k() != rq2.f17332c) {
                        e = gp1.mo20745e();
                        if (e != null) {
                            nh0 = null;
                            if (this.f13366f && this.f13365e) {
                                nh0 = this.f13363c.mo19973b(this.f13364d, e);
                            }
                            nh0.m23178h(e);
                            if (nh0 != null) {
                                gp12 = new gp1(nh0);
                                gp12.mo20744d(gp1);
                                nh0.m23178h(nh0);
                                mo25710p().mo27295d(1.0f);
                                mo25710p().mo27294c(gp12, i);
                                gp1.m18285c(gp12);
                                if (lc2.m21369d()) {
                                    lc2.m21367b();
                                    return;
                                }
                                return;
                            }
                        }
                        mo25710p().mo27294c(gp1, i);
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                            return;
                        }
                        return;
                    }
                }
                mo25710p().mo27294c(gp1, i);
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

    public ip1(ys3<f80, PooledByteBuffer> ys3, g80 g80, vv4<gp1> vv4) {
        this.f13360a = ys3;
        this.f13361b = g80;
        this.f13362c = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        nh0<PooledByteBuffer> nh0;
        Map map;
        gp1 gp1;
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("EncodedMemoryCacheProducer#produceResults");
            }
            aw4 g = wv4.mo20281g();
            g.mo11176k(wv4, "EncodedMemoryCacheProducer");
            f80 d = this.f13361b.mo74d(wv4.mo20286i(), wv4.mo20275a());
            Map map2 = null;
            if (wv4.mo20286i().mo13460x(4)) {
                nh0 = this.f13360a.get(d);
            } else {
                nh0 = null;
            }
            if (nh0 != null) {
                try {
                    gp1 = new gp1(nh0);
                    if (g.mo11175j(wv4, "EncodedMemoryCacheProducer")) {
                        map2 = ImmutableMap.m13301of("cached_value_found", "true");
                    }
                    g.mo11170a(wv4, "EncodedMemoryCacheProducer", map2);
                    g.mo11171c(wv4, "EncodedMemoryCacheProducer", true);
                    wv4.mo20280f("memory_encoded");
                    vq0.mo27295d(1.0f);
                    vq0.mo27294c(gp1, 1);
                    gp1.m18285c(gp1);
                    nh0.m23178h(nh0);
                } catch (Throwable th) {
                    nh0.m23178h(nh0);
                    throw th;
                }
            } else if (wv4.mo20291n().getValue() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue()) {
                if (g.mo11175j(wv4, "EncodedMemoryCacheProducer")) {
                    map = ImmutableMap.m13301of("cached_value_found", "false");
                } else {
                    map = null;
                }
                g.mo11170a(wv4, "EncodedMemoryCacheProducer", map);
                g.mo11171c(wv4, "EncodedMemoryCacheProducer", false);
                wv4.mo20278d("memory_encoded", "nil-result");
                vq0.mo27294c(null, 1);
                nh0.m23178h(nh0);
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            } else {
                C2565a aVar = new C2565a(vq0, this.f13360a, d, wv4.mo20286i().mo13460x(8), wv4.mo20277c().mo23322D().mo24071r());
                if (g.mo11175j(wv4, "EncodedMemoryCacheProducer")) {
                    map2 = ImmutableMap.m13301of("cached_value_found", "false");
                }
                g.mo11170a(wv4, "EncodedMemoryCacheProducer", map2);
                this.f13362c.mo11350a(aVar, wv4);
                nh0.m23178h(nh0);
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }
}
