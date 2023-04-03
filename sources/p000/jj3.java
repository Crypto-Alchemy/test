package p000;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: jj3 */
/* compiled from: LocalFetchProducer */
public abstract class jj3 implements vv4<gp1> {

    /* renamed from: a */
    public final Executor f13669a;

    /* renamed from: b */
    public final qs4 f13670b;

    /* renamed from: jj3$a */
    /* compiled from: LocalFetchProducer */
    public class C2608a extends f96<gp1> {

        /* renamed from: r */
        public final /* synthetic */ ImageRequest f13671r;

        /* renamed from: s */
        public final /* synthetic */ aw4 f13672s;

        /* renamed from: x */
        public final /* synthetic */ wv4 f13673x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2608a(vq0 vq0, aw4 aw4, wv4 wv4, String str, ImageRequest imageRequest, aw4 aw42, wv4 wv42) {
            super(vq0, aw4, wv4, str);
            this.f13671r = imageRequest;
            this.f13672s = aw42;
            this.f13673x = wv42;
        }

        /* renamed from: j */
        public void mo13406b(gp1 gp1) {
            gp1.m18285c(gp1);
        }

        /* renamed from: k */
        public gp1 mo13407c() throws Exception {
            gp1 c = jj3.this.mo19919c(this.f13671r);
            if (c == null) {
                this.f13672s.mo11171c(this.f13673x, jj3.this.mo19920e(), false);
                this.f13673x.mo20280f("local");
                return null;
            }
            c.mo20731G();
            this.f13672s.mo11171c(this.f13673x, jj3.this.mo19920e(), true);
            this.f13673x.mo20280f("local");
            return c;
        }
    }

    /* renamed from: jj3$b */
    /* compiled from: LocalFetchProducer */
    public class C2609b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ f96 f13675a;

        public C2609b(f96 f96) {
            this.f13675a = f96;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f13675a.mo20438a();
        }
    }

    public jj3(Executor executor, qs4 qs4) {
        this.f13669a = executor;
        this.f13670b = qs4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        aw4 g = wv4.mo20281g();
        ImageRequest i = wv4.mo20286i();
        wv4.mo20278d("local", "fetch");
        C2608a aVar = new C2608a(vq0, g, wv4, mo19920e(), i, g, wv4);
        wv4.mo20292o(new C2609b(aVar));
        this.f13669a.execute(aVar);
    }

    /* renamed from: b */
    public gp1 mo21936b(InputStream inputStream, int i) throws IOException {
        nh0 nh0;
        if (i <= 0) {
            try {
                nh0 = nh0.m23181v(this.f13670b.mo19479a(inputStream));
            } catch (Throwable th) {
                rh0.m26191b(inputStream);
                nh0.m23178h((nh0<?>) null);
                throw th;
            }
        } else {
            nh0 = nh0.m23181v(this.f13670b.mo19480b(inputStream, i));
        }
        nh0 nh02 = nh0;
        gp1 gp1 = new gp1((nh0<PooledByteBuffer>) nh02);
        rh0.m26191b(inputStream);
        nh0.m23178h(nh02);
        return gp1;
    }

    /* renamed from: c */
    public abstract gp1 mo19919c(ImageRequest imageRequest) throws IOException;

    /* renamed from: d */
    public gp1 mo21937d(InputStream inputStream, int i) throws IOException {
        return mo21936b(inputStream, i);
    }

    /* renamed from: e */
    public abstract String mo19920e();
}
