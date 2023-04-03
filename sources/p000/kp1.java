package p000;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: kp1 */
/* compiled from: EncodedProbeProducer */
public class kp1 implements vv4<gp1> {

    /* renamed from: a */
    public final t40 f14253a;

    /* renamed from: b */
    public final t40 f14254b;

    /* renamed from: c */
    public final g80 f14255c;

    /* renamed from: d */
    public final vv4<gp1> f14256d;

    /* renamed from: e */
    public final z30<f80> f14257e;

    /* renamed from: f */
    public final z30<f80> f14258f;

    /* renamed from: kp1$a */
    /* compiled from: EncodedProbeProducer */
    public static class C2723a extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final wv4 f14259c;

        /* renamed from: d */
        public final t40 f14260d;

        /* renamed from: e */
        public final t40 f14261e;

        /* renamed from: f */
        public final g80 f14262f;

        /* renamed from: g */
        public final z30<f80> f14263g;

        /* renamed from: h */
        public final z30<f80> f14264h;

        public C2723a(vq0<gp1> vq0, wv4 wv4, t40 t40, t40 t402, g80 g80, z30<f80> z30, z30<f80> z302) {
            super(vq0);
            this.f14259c = wv4;
            this.f14260d = t40;
            this.f14261e = t402;
            this.f14262f = g80;
            this.f14263g = z30;
            this.f14264h = z302;
        }

        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            boolean z;
            t40 t40;
            try {
                if (lc2.m21369d()) {
                    lc2.m21366a("EncodedProbeProducer#onNewResultImpl");
                }
                if (!C3766zx.m31567f(i) && gp1 != null && !C3766zx.m31569m(i, 10)) {
                    if (gp1.mo20751k() != rq2.f17332c) {
                        ImageRequest i2 = this.f14259c.mo20286i();
                        f80 d = this.f14262f.mo74d(i2, this.f14259c.mo20275a());
                        this.f14263g.mo28312a(d);
                        if ("memory_encoded".equals(this.f14259c.mo20290m("origin"))) {
                            if (!this.f14264h.mo28313b(d)) {
                                if (i2.mo13438d() == ImageRequest.CacheChoice.SMALL) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    t40 = this.f14261e;
                                } else {
                                    t40 = this.f14260d;
                                }
                                t40.mo26034h(d);
                                this.f14264h.mo28312a(d);
                            }
                        } else if ("disk".equals(this.f14259c.mo20290m("origin"))) {
                            this.f14264h.mo28312a(d);
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
            } finally {
                if (lc2.m21369d()) {
                    lc2.m21367b();
                }
            }
        }
    }

    public kp1(t40 t40, t40 t402, g80 g80, z30 z30, z30 z302, vv4<gp1> vv4) {
        this.f14253a = t40;
        this.f14254b = t402;
        this.f14255c = g80;
        this.f14257e = z30;
        this.f14258f = z302;
        this.f14256d = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        try {
            if (lc2.m21369d()) {
                lc2.m21366a("EncodedProbeProducer#produceResults");
            }
            aw4 g = wv4.mo20281g();
            g.mo11176k(wv4, mo22437b());
            C2723a aVar = new C2723a(vq0, wv4, this.f14253a, this.f14254b, this.f14255c, this.f14257e, this.f14258f);
            g.mo11170a(wv4, "EncodedProbeProducer", (Map<String, String>) null);
            if (lc2.m21369d()) {
                lc2.m21366a("mInputProducer.produceResult");
            }
            this.f14256d.mo11350a(aVar, wv4);
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
    public String mo22437b() {
        return "EncodedProbeProducer";
    }
}
