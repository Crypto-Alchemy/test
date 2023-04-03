package p000;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: qt4 */
/* compiled from: PostprocessedBitmapMemoryCacheProducer */
public class qt4 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final ys3<f80, kh0> f17064a;

    /* renamed from: b */
    public final g80 f17065b;

    /* renamed from: c */
    public final vv4<nh0<kh0>> f17066c;

    /* renamed from: qt4$a */
    /* compiled from: PostprocessedBitmapMemoryCacheProducer */
    public static class C3171a extends sb1<nh0<kh0>, nh0<kh0>> {

        /* renamed from: c */
        public final f80 f17067c;

        /* renamed from: d */
        public final boolean f17068d;

        /* renamed from: e */
        public final ys3<f80, kh0> f17069e;

        /* renamed from: f */
        public final boolean f17070f;

        public C3171a(vq0<nh0<kh0>> vq0, f80 f80, boolean z, ys3<f80, kh0> ys3, boolean z2) {
            super(vq0);
            this.f17067c = f80;
            this.f17068d = z;
            this.f17069e = ys3;
            this.f17070f = z2;
        }

        /* renamed from: q */
        public void mo11352i(nh0<kh0> nh0, int i) {
            nh0<kh0> nh02 = null;
            if (nh0 == null) {
                if (C3766zx.m31566e(i)) {
                    mo25710p().mo27294c(nh02, i);
                }
            } else if (!C3766zx.m31567f(i) || this.f17068d) {
                if (this.f17070f) {
                    nh02 = this.f17069e.mo19973b(this.f17067c, nh0);
                }
                try {
                    mo25710p().mo27295d(1.0f);
                    vq0 p = mo25710p();
                    if (nh02 != null) {
                        nh0 = nh02;
                    }
                    p.mo27294c(nh0, i);
                } finally {
                    nh0.m23178h(nh02);
                }
            }
        }
    }

    public qt4(ys3<f80, kh0> ys3, g80 g80, vv4<nh0<kh0>> vv4) {
        this.f17064a = ys3;
        this.f17065b = g80;
        this.f17066c = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        nh0<kh0> nh0;
        aw4 g = wv4.mo20281g();
        ImageRequest i = wv4.mo20286i();
        Object a = wv4.mo20275a();
        rt4 k = i.mo13447k();
        if (k == null || k.mo25540c() == null) {
            this.f17066c.mo11350a(vq0, wv4);
            return;
        }
        g.mo11176k(wv4, mo25271b());
        f80 c = this.f17065b.mo73c(i, a);
        Map map = null;
        if (wv4.mo20286i().mo13460x(1)) {
            nh0 = this.f17064a.get(c);
        } else {
            nh0 = null;
        }
        if (nh0 != null) {
            String b = mo25271b();
            if (g.mo11175j(wv4, mo25271b())) {
                map = ImmutableMap.m13301of("cached_value_found", "true");
            }
            g.mo11170a(wv4, b, map);
            g.mo11171c(wv4, "PostprocessedBitmapMemoryCacheProducer", true);
            wv4.mo20278d("memory_bitmap", "postprocessed");
            vq0.mo27295d(1.0f);
            vq0.mo27294c(nh0, 1);
            nh0.close();
            return;
        }
        C3171a aVar = new C3171a(vq0, c, k instanceof vd5, this.f17064a, wv4.mo20286i().mo13460x(2));
        String b2 = mo25271b();
        if (g.mo11175j(wv4, mo25271b())) {
            map = ImmutableMap.m13301of("cached_value_found", "false");
        }
        g.mo11170a(wv4, b2, map);
        this.f17066c.mo11350a(aVar, wv4);
    }

    /* renamed from: b */
    public String mo25271b() {
        return "PostprocessedBitmapMemoryCacheProducer";
    }
}
