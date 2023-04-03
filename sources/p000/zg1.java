package p000;

import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

/* renamed from: zg1 */
/* compiled from: DiskCacheWriteProducer */
public class zg1 implements vv4<gp1> {

    /* renamed from: a */
    public final t40 f20537a;

    /* renamed from: b */
    public final t40 f20538b;

    /* renamed from: c */
    public final g80 f20539c;

    /* renamed from: d */
    public final vv4<gp1> f20540d;

    /* renamed from: zg1$b */
    /* compiled from: DiskCacheWriteProducer */
    public static class C3727b extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final wv4 f20541c;

        /* renamed from: d */
        public final t40 f20542d;

        /* renamed from: e */
        public final t40 f20543e;

        /* renamed from: f */
        public final g80 f20544f;

        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            this.f20541c.mo20281g().mo11176k(this.f20541c, "DiskCacheWriteProducer");
            if (C3766zx.m31567f(i) || gp1 == null || C3766zx.m31569m(i, 10) || gp1.mo20751k() == rq2.f17332c) {
                this.f20541c.mo20281g().mo11170a(this.f20541c, "DiskCacheWriteProducer", (Map<String, String>) null);
                mo25710p().mo27294c(gp1, i);
                return;
            }
            ImageRequest i2 = this.f20541c.mo20286i();
            f80 d = this.f20544f.mo74d(i2, this.f20541c.mo20275a());
            if (i2.mo13438d() == ImageRequest.CacheChoice.SMALL) {
                this.f20543e.mo26038l(d, gp1);
            } else {
                this.f20542d.mo26038l(d, gp1);
            }
            this.f20541c.mo20281g().mo11170a(this.f20541c, "DiskCacheWriteProducer", (Map<String, String>) null);
            mo25710p().mo27294c(gp1, i);
        }

        public C3727b(vq0<gp1> vq0, wv4 wv4, t40 t40, t40 t402, g80 g80) {
            super(vq0);
            this.f20541c = wv4;
            this.f20542d = t40;
            this.f20543e = t402;
            this.f20544f = g80;
        }
    }

    public zg1(t40 t40, t40 t402, g80 g80, vv4<gp1> vv4) {
        this.f20537a = t40;
        this.f20538b = t402;
        this.f20539c = g80;
        this.f20540d = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        mo28429b(vq0, wv4);
    }

    /* renamed from: b */
    public final void mo28429b(vq0<gp1> vq0, wv4 wv4) {
        if (wv4.mo20291n().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            wv4.mo20278d("disk", "nil-result_write");
            vq0.mo27294c(null, 1);
            return;
        }
        if (wv4.mo20286i().mo13460x(32)) {
            vq0 = new C3727b(vq0, wv4, this.f20537a, this.f20538b, this.f20539c);
        }
        this.f20540d.mo11350a(vq0, wv4);
    }
}
