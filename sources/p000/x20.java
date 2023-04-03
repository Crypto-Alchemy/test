package p000;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: x20 */
/* compiled from: BitmapProbeProducer */
public class x20 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final ys3<f80, PooledByteBuffer> f19277a;

    /* renamed from: b */
    public final t40 f19278b;

    /* renamed from: c */
    public final t40 f19279c;

    /* renamed from: d */
    public final g80 f19280d;

    /* renamed from: e */
    public final vv4<nh0<kh0>> f19281e;

    /* renamed from: f */
    public final z30<f80> f19282f;

    /* renamed from: g */
    public final z30<f80> f19283g;

    /* renamed from: x20$a */
    /* compiled from: BitmapProbeProducer */
    public static class C3566a extends sb1<nh0<kh0>, nh0<kh0>> {

        /* renamed from: c */
        public final wv4 f19284c;

        /* renamed from: d */
        public final ys3<f80, PooledByteBuffer> f19285d;

        /* renamed from: e */
        public final t40 f19286e;

        /* renamed from: f */
        public final t40 f19287f;

        /* renamed from: g */
        public final g80 f19288g;

        /* renamed from: h */
        public final z30<f80> f19289h;

        /* renamed from: i */
        public final z30<f80> f19290i;

        public C3566a(vq0<nh0<kh0>> vq0, wv4 wv4, ys3<f80, PooledByteBuffer> ys3, t40 t40, t40 t402, g80 g80, z30<f80> z30, z30<f80> z302) {
            super(vq0);
            this.f19284c = wv4;
            this.f19285d = ys3;
            this.f19286e = t40;
            this.f19287f = t402;
            this.f19288g = g80;
            this.f19289h = z30;
            this.f19290i = z302;
        }

        /* renamed from: q */
        public void mo11352i(nh0<kh0> nh0, int i) {
            boolean z;
            t40 t40;
            try {
                if (lc2.m21369d()) {
                    lc2.m21366a("BitmapProbeProducer#onNewResultImpl");
                }
                if (!C3766zx.m31567f(i) && nh0 != null) {
                    if (!C3766zx.m31569m(i, 8)) {
                        ImageRequest i2 = this.f19284c.mo20286i();
                        f80 d = this.f19288g.mo74d(i2, this.f19284c.mo20275a());
                        String str = (String) this.f19284c.mo20290m("origin");
                        if (str != null && str.equals("memory_bitmap")) {
                            if (this.f19284c.mo20277c().mo23322D().mo24072s() && !this.f19289h.mo28313b(d)) {
                                this.f19285d.mo19974c(d);
                                this.f19289h.mo28312a(d);
                            }
                            if (this.f19284c.mo20277c().mo23322D().mo24070q() && !this.f19290i.mo28313b(d)) {
                                if (i2.mo13438d() == ImageRequest.CacheChoice.SMALL) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    t40 = this.f19287f;
                                } else {
                                    t40 = this.f19286e;
                                }
                                t40.mo26034h(d);
                                this.f19290i.mo28312a(d);
                            }
                        }
                        mo25710p().mo27294c(nh0, i);
                        if (lc2.m21369d()) {
                            lc2.m21367b();
                            return;
                        }
                        return;
                    }
                }
                mo25710p().mo27294c(nh0, i);
            } finally {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        }
    }

    public x20(ys3<f80, PooledByteBuffer> ys3, t40 t40, t40 t402, g80 g80, z30<f80> z30, z30<f80> z302, vv4<nh0<kh0>> vv4) {
        this.f19277a = ys3;
        this.f19278b = t40;
        this.f19279c = t402;
        this.f19280d = g80;
        this.f19282f = z30;
        this.f19283g = z302;
        this.f19281e = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("BitmapProbeProducer#produceResults");
            }
            aw4 g = wv4.mo20281g();
            g.mo11176k(wv4, mo27660b());
            C3566a aVar = new C3566a(vq0, wv4, this.f19277a, this.f19278b, this.f19279c, this.f19280d, this.f19282f, this.f19283g);
            g.mo11170a(wv4, "BitmapProbeProducer", (Map<String, String>) null);
            if (lc2.m21369d()) {
                lc2.m21366a("mInputProducer.produceResult");
            }
            this.f19281e.mo11350a(aVar, wv4);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        } finally {
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    /* renamed from: b */
    public String mo27660b() {
        return "BitmapProbeProducer";
    }
}
