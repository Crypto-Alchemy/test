package p000;

import android.os.SystemClock;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.image.EncodedImageOrigin;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import p000.q54;

/* renamed from: p54 */
/* compiled from: NetworkFetchProducer */
public class p54 implements vv4<gp1> {

    /* renamed from: a */
    public final qs4 f16313a;

    /* renamed from: b */
    public final j60 f16314b;

    /* renamed from: c */
    public final q54 f16315c;

    /* renamed from: p54$a */
    /* compiled from: NetworkFetchProducer */
    public class C3037a implements q54.C3123a {

        /* renamed from: a */
        public final /* synthetic */ qz1 f16316a;

        public C3037a(qz1 qz1) {
            this.f16316a = qz1;
        }

        /* renamed from: a */
        public void mo24447a() {
            p54.this.mo24443j(this.f16316a);
        }

        /* renamed from: b */
        public void mo24448b(Throwable th) {
            p54.this.mo24444k(this.f16316a, th);
        }

        /* renamed from: c */
        public void mo24449c(InputStream inputStream, int i) throws IOException {
            if (lc2.m21369d()) {
                lc2.m21366a("NetworkFetcher->onResponse");
            }
            p54.this.mo24445l(this.f16316a, inputStream, i);
            if (lc2.m21369d()) {
                lc2.m21367b();
            }
        }
    }

    public p54(qs4 qs4, j60 j60, q54 q54) {
        this.f16313a = qs4;
        this.f16314b = j60;
        this.f16315c = q54;
    }

    /* renamed from: d */
    public static float m24639d(int i, int i2) {
        if (i2 > 0) {
            return ((float) i) / ((float) i2);
        }
        return 1.0f - ((float) Math.exp(((double) (-i)) / 50000.0d));
    }

    /* renamed from: i */
    public static void m24640i(ss4 ss4, int i, i70 i70, vq0<gp1> vq0, wv4 wv4) {
        nh0 v = nh0.m23181v(ss4.mo13354a());
        gp1 gp1 = null;
        try {
            gp1 gp12 = new gp1((nh0<PooledByteBuffer>) v);
            try {
                gp12.mo20735L(i70);
                gp12.mo20731G();
                wv4.mo20287j(EncodedImageOrigin.NETWORK);
                vq0.mo27294c(gp12, i);
                gp1.m18285c(gp12);
                nh0.m23178h(v);
            } catch (Throwable th) {
                th = th;
                gp1 = gp12;
                gp1.m18285c(gp1);
                nh0.m23178h(v);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gp1.m18285c(gp1);
            nh0.m23178h(v);
            throw th;
        }
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        wv4.mo20281g().mo11176k(wv4, "NetworkFetchProducer");
        qz1 a = this.f16315c.mo21974a(vq0, wv4);
        this.f16315c.mo21976d(a, new C3037a(a));
    }

    /* renamed from: e */
    public final Map<String, String> mo24439e(qz1 qz1, int i) {
        if (!qz1.mo25291d().mo11175j(qz1.mo25289b(), "NetworkFetchProducer")) {
            return null;
        }
        return this.f16315c.mo21975c(qz1, i);
    }

    /* renamed from: f */
    public long mo24440f() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: g */
    public void mo24441g(ss4 ss4, qz1 qz1) {
        Map<String, String> e = mo24439e(qz1, ss4.size());
        aw4 d = qz1.mo25291d();
        d.mo11170a(qz1.mo25289b(), "NetworkFetchProducer", e);
        d.mo11171c(qz1.mo25289b(), "NetworkFetchProducer", true);
        qz1.mo25289b().mo20280f("network");
        m24640i(ss4, qz1.mo25292e() | 1, qz1.mo25293f(), qz1.mo25288a(), qz1.mo25289b());
    }

    /* renamed from: h */
    public void mo24442h(ss4 ss4, qz1 qz1) {
        long f = mo24440f();
        if (mo24446m(qz1) && f - qz1.mo25290c() >= 100) {
            qz1.mo25295h(f);
            qz1.mo25291d().mo11174i(qz1.mo25289b(), "NetworkFetchProducer", "intermediate_result");
            m24640i(ss4, qz1.mo25292e(), qz1.mo25293f(), qz1.mo25288a(), qz1.mo25289b());
        }
    }

    /* renamed from: j */
    public final void mo24443j(qz1 qz1) {
        qz1.mo25291d().mo11173g(qz1.mo25289b(), "NetworkFetchProducer", (Map<String, String>) null);
        qz1.mo25288a().mo27292a();
    }

    /* renamed from: k */
    public final void mo24444k(qz1 qz1, Throwable th) {
        qz1.mo25291d().mo11172f(qz1.mo25289b(), "NetworkFetchProducer", th, (Map<String, String>) null);
        qz1.mo25291d().mo11171c(qz1.mo25289b(), "NetworkFetchProducer", false);
        qz1.mo25289b().mo20280f("network");
        qz1.mo25288a().mo27293b(th);
    }

    /* renamed from: l */
    public void mo24445l(qz1 qz1, InputStream inputStream, int i) throws IOException {
        ss4 ss4;
        if (i > 0) {
            ss4 = this.f16313a.mo19483e(i);
        } else {
            ss4 = this.f16313a.mo19481c();
        }
        byte[] bArr = (byte[]) this.f16314b.get(Http2.INITIAL_MAX_FRAME_SIZE);
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    this.f16315c.mo21977e(qz1, ss4.size());
                    mo24441g(ss4, qz1);
                    return;
                } else if (read > 0) {
                    ss4.write(bArr, 0, read);
                    mo24442h(ss4, qz1);
                    qz1.mo25288a().mo27295d(m24639d(ss4.size(), i));
                }
            } finally {
                this.f16314b.mo360a(bArr);
                ss4.close();
            }
        }
    }

    /* renamed from: m */
    public final boolean mo24446m(qz1 qz1) {
        if (!qz1.mo25289b().mo20285h()) {
            return false;
        }
        return this.f16315c.mo18383b(qz1);
    }
}
