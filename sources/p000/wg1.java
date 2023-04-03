package p000;

import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wg1 */
/* compiled from: DiskCacheReadProducer */
public class wg1 implements vv4<gp1> {

    /* renamed from: a */
    public final t40 f19096a;

    /* renamed from: b */
    public final t40 f19097b;

    /* renamed from: c */
    public final g80 f19098c;

    /* renamed from: d */
    public final vv4<gp1> f19099d;

    /* renamed from: wg1$a */
    /* compiled from: DiskCacheReadProducer */
    public class C3537a implements os0<gp1, Void> {

        /* renamed from: a */
        public final /* synthetic */ aw4 f19100a;

        /* renamed from: b */
        public final /* synthetic */ wv4 f19101b;

        /* renamed from: c */
        public final /* synthetic */ vq0 f19102c;

        public C3537a(aw4 aw4, wv4 wv4, vq0 vq0) {
            this.f19100a = aw4;
            this.f19101b = wv4;
            this.f19102c = vq0;
        }

        /* renamed from: b */
        public Void mo24095a(sl6<gp1> sl6) throws Exception {
            if (wg1.m29562e(sl6)) {
                this.f19100a.mo11173g(this.f19101b, "DiskCacheProducer", (Map<String, String>) null);
                this.f19102c.mo27292a();
            } else if (sl6.mo25860n()) {
                this.f19100a.mo11172f(this.f19101b, "DiskCacheProducer", sl6.mo25856i(), (Map<String, String>) null);
                wg1.this.f19099d.mo11350a(this.f19102c, this.f19101b);
            } else {
                gp1 j = sl6.mo25857j();
                if (j != null) {
                    aw4 aw4 = this.f19100a;
                    wv4 wv4 = this.f19101b;
                    aw4.mo11170a(wv4, "DiskCacheProducer", wg1.m29561d(aw4, wv4, true, j.mo20756q()));
                    this.f19100a.mo11171c(this.f19101b, "DiskCacheProducer", true);
                    this.f19101b.mo20280f("disk");
                    this.f19102c.mo27295d(1.0f);
                    this.f19102c.mo27294c(j, 1);
                    j.close();
                } else {
                    aw4 aw42 = this.f19100a;
                    wv4 wv42 = this.f19101b;
                    aw42.mo11170a(wv42, "DiskCacheProducer", wg1.m29561d(aw42, wv42, false, 0));
                    wg1.this.f19099d.mo11350a(this.f19102c, this.f19101b);
                }
            }
            return null;
        }
    }

    /* renamed from: wg1$b */
    /* compiled from: DiskCacheReadProducer */
    public class C3538b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f19104a;

        public C3538b(AtomicBoolean atomicBoolean) {
            this.f19104a = atomicBoolean;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f19104a.set(true);
        }
    }

    public wg1(t40 t40, t40 t402, g80 g80, vv4<gp1> vv4) {
        this.f19096a = t40;
        this.f19097b = t402;
        this.f19098c = g80;
        this.f19099d = vv4;
    }

    /* renamed from: d */
    public static Map<String, String> m29561d(aw4 aw4, wv4 wv4, boolean z, int i) {
        if (!aw4.mo11175j(wv4, "DiskCacheProducer")) {
            return null;
        }
        if (z) {
            return ImmutableMap.m13302of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return ImmutableMap.m13301of("cached_value_found", String.valueOf(z));
    }

    /* renamed from: e */
    public static boolean m29562e(sl6<?> sl6) {
        if (sl6.mo25858l() || (sl6.mo25860n() && (sl6.mo25856i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        boolean z;
        t40 t40;
        ImageRequest i = wv4.mo20286i();
        if (!wv4.mo20286i().mo13460x(16)) {
            mo27511f(vq0, wv4);
            return;
        }
        wv4.mo20281g().mo11176k(wv4, "DiskCacheProducer");
        f80 d = this.f19098c.mo74d(i, wv4.mo20275a());
        if (i.mo13438d() == ImageRequest.CacheChoice.SMALL) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            t40 = this.f19097b;
        } else {
            t40 = this.f19096a;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        t40.mo26036j(d, atomicBoolean).mo25854e(mo27512g(vq0, wv4));
        mo27513h(atomicBoolean, wv4);
    }

    /* renamed from: f */
    public final void mo27511f(vq0<gp1> vq0, wv4 wv4) {
        if (wv4.mo20291n().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue()) {
            wv4.mo20278d("disk", "nil-result_read");
            vq0.mo27294c(null, 1);
            return;
        }
        this.f19099d.mo11350a(vq0, wv4);
    }

    /* renamed from: g */
    public final os0<gp1, Void> mo27512g(vq0<gp1> vq0, wv4 wv4) {
        return new C3537a(wv4.mo20281g(), wv4, vq0);
    }

    /* renamed from: h */
    public final void mo27513h(AtomicBoolean atomicBoolean, wv4 wv4) {
        wv4.mo20292o(new C3538b(atomicBoolean));
    }
}
