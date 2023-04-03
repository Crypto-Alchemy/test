package p000;

import java.util.Map;

/* renamed from: px2 */
/* compiled from: InternalProducerListener */
public class px2 implements aw4 {

    /* renamed from: a */
    public final bw4 f16653a;

    /* renamed from: b */
    public final aw4 f16654b;

    public px2(bw4 bw4, aw4 aw4) {
        this.f16653a = bw4;
        this.f16654b = aw4;
    }

    /* renamed from: a */
    public void mo11170a(wv4 wv4, String str, Map<String, String> map) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11916e(wv4.getId(), str, map);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11170a(wv4, str, map);
        }
    }

    /* renamed from: c */
    public void mo11171c(wv4 wv4, String str, boolean z) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11786h(wv4.getId(), str, z);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11171c(wv4, str, z);
        }
    }

    /* renamed from: f */
    public void mo11172f(wv4 wv4, String str, Throwable th, Map<String, String> map) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11917f(wv4.getId(), str, th, map);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11172f(wv4, str, th, map);
        }
    }

    /* renamed from: g */
    public void mo11173g(wv4 wv4, String str, Map<String, String> map) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11918g(wv4.getId(), str, map);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11173g(wv4, str, map);
        }
    }

    /* renamed from: i */
    public void mo11174i(wv4 wv4, String str, String str2) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11919j(wv4.getId(), str, str2);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11174i(wv4, str, str2);
        }
    }

    /* renamed from: j */
    public boolean mo11175j(wv4 wv4, String str) {
        boolean z;
        aw4 aw4;
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            z = bw4.mo11915d(wv4.getId());
        } else {
            z = false;
        }
        if (z || (aw4 = this.f16654b) == null) {
            return z;
        }
        return aw4.mo11175j(wv4, str);
    }

    /* renamed from: k */
    public void mo11176k(wv4 wv4, String str) {
        bw4 bw4 = this.f16653a;
        if (bw4 != null) {
            bw4.mo11914b(wv4.getId(), str);
        }
        aw4 aw4 = this.f16654b;
        if (aw4 != null) {
            aw4.mo11176k(wv4, str);
        }
    }
}
