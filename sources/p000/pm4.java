package p000;

import android.net.Uri;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* renamed from: pm4 */
/* compiled from: PartialDiskCacheProducer */
public class pm4 implements vv4<gp1> {

    /* renamed from: a */
    public final t40 f16549a;

    /* renamed from: b */
    public final g80 f16550b;

    /* renamed from: c */
    public final qs4 f16551c;

    /* renamed from: d */
    public final j60 f16552d;

    /* renamed from: e */
    public final vv4<gp1> f16553e;

    /* renamed from: pm4$a */
    /* compiled from: PartialDiskCacheProducer */
    public class C3087a implements os0<gp1, Void> {

        /* renamed from: a */
        public final /* synthetic */ aw4 f16554a;

        /* renamed from: b */
        public final /* synthetic */ wv4 f16555b;

        /* renamed from: c */
        public final /* synthetic */ vq0 f16556c;

        /* renamed from: d */
        public final /* synthetic */ f80 f16557d;

        public C3087a(aw4 aw4, wv4 wv4, vq0 vq0, f80 f80) {
            this.f16554a = aw4;
            this.f16555b = wv4;
            this.f16556c = vq0;
            this.f16557d = f80;
        }

        /* renamed from: b */
        public Void mo24095a(sl6<gp1> sl6) throws Exception {
            if (pm4.m25050f(sl6)) {
                this.f16554a.mo11173g(this.f16555b, "PartialDiskCacheProducer", (Map<String, String>) null);
                this.f16556c.mo27292a();
            } else if (sl6.mo25860n()) {
                this.f16554a.mo11172f(this.f16555b, "PartialDiskCacheProducer", sl6.mo25856i(), (Map<String, String>) null);
                pm4.this.mo24653h(this.f16556c, this.f16555b, this.f16557d, (gp1) null);
            } else {
                gp1 j = sl6.mo25857j();
                if (j != null) {
                    aw4 aw4 = this.f16554a;
                    wv4 wv4 = this.f16555b;
                    aw4.mo11170a(wv4, "PartialDiskCacheProducer", pm4.m25049e(aw4, wv4, true, j.mo20756q()));
                    i70 c = i70.m19434c(j.mo20756q() - 1);
                    j.mo20735L(c);
                    int q = j.mo20756q();
                    ImageRequest i = this.f16555b.mo20286i();
                    if (c.mo21469a(i.mo13437c())) {
                        this.f16555b.mo20278d("disk", "partial");
                        this.f16554a.mo11171c(this.f16555b, "PartialDiskCacheProducer", true);
                        this.f16556c.mo27294c(j, 9);
                    } else {
                        this.f16556c.mo27294c(j, 8);
                        pm4.this.mo24653h(this.f16556c, new sy5(ImageRequestBuilder.m13666b(i).mo13497v(i70.m19433b(q - 1)).mo13478a(), this.f16555b), this.f16557d, j);
                    }
                } else {
                    aw4 aw42 = this.f16554a;
                    wv4 wv42 = this.f16555b;
                    aw42.mo11170a(wv42, "PartialDiskCacheProducer", pm4.m25049e(aw42, wv42, false, 0));
                    pm4.this.mo24653h(this.f16556c, this.f16555b, this.f16557d, j);
                }
            }
            return null;
        }
    }

    /* renamed from: pm4$b */
    /* compiled from: PartialDiskCacheProducer */
    public class C3088b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ AtomicBoolean f16559a;

        public C3088b(AtomicBoolean atomicBoolean) {
            this.f16559a = atomicBoolean;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f16559a.set(true);
        }
    }

    /* renamed from: pm4$c */
    /* compiled from: PartialDiskCacheProducer */
    public static class C3089c extends sb1<gp1, gp1> {

        /* renamed from: c */
        public final t40 f16561c;

        /* renamed from: d */
        public final f80 f16562d;

        /* renamed from: e */
        public final qs4 f16563e;

        /* renamed from: f */
        public final j60 f16564f;

        /* renamed from: g */
        public final gp1 f16565g;

        /* renamed from: h */
        public final boolean f16566h;

        public /* synthetic */ C3089c(vq0 vq0, t40 t40, f80 f80, qs4 qs4, j60 j60, gp1 gp1, boolean z, C3087a aVar) {
            this(vq0, t40, f80, qs4, j60, gp1, z);
        }

        /* renamed from: q */
        public final void mo24656q(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
            byte[] bArr = (byte[]) this.f16564f.get(Http2.INITIAL_MAX_FRAME_SIZE);
            int i2 = i;
            while (i2 > 0) {
                try {
                    int read = inputStream.read(bArr, 0, Math.min(Http2.INITIAL_MAX_FRAME_SIZE, i2));
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        i2 -= read;
                    }
                } catch (Throwable th) {
                    this.f16564f.mo360a(bArr);
                    throw th;
                }
            }
            this.f16564f.mo360a(bArr);
            if (i2 > 0) {
                throw new IOException(String.format((Locale) null, "Failed to read %d bytes - finished %d short", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
        }

        /* renamed from: r */
        public final ss4 mo24657r(gp1 gp1, gp1 gp12) throws IOException {
            int i = ((i70) au4.m10792g(gp12.mo20746f())).f13171a;
            ss4 e = this.f16563e.mo19483e(gp12.mo20756q() + i);
            mo24656q(gp1.mo20753m(), e, i);
            mo24656q(gp12.mo20753m(), e, gp12.mo20756q());
            return e;
        }

        /* renamed from: s */
        public void mo11352i(gp1 gp1, int i) {
            if (!C3766zx.m31567f(i)) {
                if (this.f16565g != null && gp1 != null && gp1.mo20746f() != null) {
                    try {
                        mo24659t(mo24657r(this.f16565g, gp1));
                    } catch (IOException e) {
                        oy1.m24422i("PartialDiskCacheProducer", "Error while merging image data", e);
                        mo25710p().mo27293b(e);
                    } catch (Throwable th) {
                        gp1.close();
                        this.f16565g.close();
                        throw th;
                    }
                    gp1.close();
                    this.f16565g.close();
                    this.f16561c.mo26040n(this.f16562d);
                } else if (!this.f16566h || !C3766zx.m31570n(i, 8) || !C3766zx.m31566e(i) || gp1 == null || gp1.mo20751k() == rq2.f17332c) {
                    mo25710p().mo27294c(gp1, i);
                } else {
                    this.f16561c.mo26038l(this.f16562d, gp1);
                    mo25710p().mo27294c(gp1, i);
                }
            }
        }

        /* renamed from: t */
        public final void mo24659t(ss4 ss4) {
            gp1 gp1;
            Throwable th;
            nh0 v = nh0.m23181v(ss4.mo13354a());
            try {
                gp1 = new gp1((nh0<PooledByteBuffer>) v);
                try {
                    gp1.mo20731G();
                    mo25710p().mo27294c(gp1, 1);
                    gp1.m18285c(gp1);
                    nh0.m23178h(v);
                } catch (Throwable th2) {
                    th = th2;
                    gp1.m18285c(gp1);
                    nh0.m23178h(v);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                gp1 = null;
                th = th4;
                gp1.m18285c(gp1);
                nh0.m23178h(v);
                throw th;
            }
        }

        public C3089c(vq0<gp1> vq0, t40 t40, f80 f80, qs4 qs4, j60 j60, gp1 gp1, boolean z) {
            super(vq0);
            this.f16561c = t40;
            this.f16562d = f80;
            this.f16563e = qs4;
            this.f16564f = j60;
            this.f16565g = gp1;
            this.f16566h = z;
        }
    }

    public pm4(t40 t40, g80 g80, qs4 qs4, j60 j60, vv4<gp1> vv4) {
        this.f16549a = t40;
        this.f16550b = g80;
        this.f16551c = qs4;
        this.f16552d = j60;
        this.f16553e = vv4;
    }

    /* renamed from: d */
    public static Uri m25048d(ImageRequest imageRequest) {
        return imageRequest.mo13458u().buildUpon().appendQueryParameter("fresco_partial", "true").build();
    }

    /* renamed from: e */
    public static Map<String, String> m25049e(aw4 aw4, wv4 wv4, boolean z, int i) {
        if (!aw4.mo11175j(wv4, "PartialDiskCacheProducer")) {
            return null;
        }
        if (z) {
            return ImmutableMap.m13302of("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i));
        }
        return ImmutableMap.m13301of("cached_value_found", String.valueOf(z));
    }

    /* renamed from: f */
    public static boolean m25050f(sl6<?> sl6) {
        if (sl6.mo25858l() || (sl6.mo25860n() && (sl6.mo25856i() instanceof CancellationException))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        ImageRequest i = wv4.mo20286i();
        boolean x = wv4.mo20286i().mo13460x(16);
        aw4 g = wv4.mo20281g();
        g.mo11176k(wv4, "PartialDiskCacheProducer");
        f80 b = this.f16550b.mo72b(i, m25048d(i), wv4.mo20275a());
        if (!x) {
            g.mo11170a(wv4, "PartialDiskCacheProducer", m25049e(g, wv4, false, 0));
            mo24653h(vq0, wv4, b, (gp1) null);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f16549a.mo26036j(b, atomicBoolean).mo25854e(mo24652g(vq0, wv4, b));
        mo24654i(atomicBoolean, wv4);
    }

    /* renamed from: g */
    public final os0<gp1, Void> mo24652g(vq0<gp1> vq0, wv4 wv4, f80 f80) {
        return new C3087a(wv4.mo20281g(), wv4, vq0, f80);
    }

    /* renamed from: h */
    public final void mo24653h(vq0<gp1> vq0, wv4 wv4, f80 f80, gp1 gp1) {
        this.f16553e.mo11350a(new C3089c(vq0, this.f16549a, f80, this.f16551c, this.f16552d, gp1, wv4.mo20286i().mo13460x(32), (C3087a) null), wv4);
    }

    /* renamed from: i */
    public final void mo24654i(AtomicBoolean atomicBoolean, wv4 wv4) {
        wv4.mo20292o(new C3088b(atomicBoolean));
    }
}
