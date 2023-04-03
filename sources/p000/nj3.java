package p000;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.os.CancellationSignal;
import android.util.Size;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: nj3 */
/* compiled from: LocalThumbnailBitmapProducer */
public class nj3 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final Executor f15557a;

    /* renamed from: b */
    public final ContentResolver f15558b;

    /* renamed from: nj3$a */
    /* compiled from: LocalThumbnailBitmapProducer */
    public class C2899a extends f96<nh0<kh0>> {

        /* renamed from: r */
        public final /* synthetic */ aw4 f15560r;

        /* renamed from: s */
        public final /* synthetic */ wv4 f15561s;

        /* renamed from: x */
        public final /* synthetic */ ImageRequest f15562x;

        /* renamed from: y */
        public final /* synthetic */ CancellationSignal f15563y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2899a(vq0 vq0, aw4 aw4, wv4 wv4, String str, aw4 aw42, wv4 wv42, ImageRequest imageRequest, CancellationSignal cancellationSignal) {
            super(vq0, aw4, wv4, str);
            this.f15560r = aw42;
            this.f15561s = wv42;
            this.f15562x = imageRequest;
            this.f15563y = cancellationSignal;
        }

        /* renamed from: d */
        public void mo19821d() {
            super.mo19821d();
            this.f15563y.cancel();
        }

        /* renamed from: e */
        public void mo19822e(Exception exc) {
            super.mo19822e(exc);
            this.f15560r.mo11171c(this.f15561s, "LocalThumbnailBitmapProducer", false);
            this.f15561s.mo20280f("local");
        }

        /* renamed from: j */
        public void mo13406b(nh0<kh0> nh0) {
            nh0.m23178h(nh0);
        }

        /* renamed from: k */
        public Map<String, String> mo13408i(nh0<kh0> nh0) {
            boolean z;
            if (nh0 != null) {
                z = true;
            } else {
                z = false;
            }
            return ImmutableMap.m13301of("createdThumbnail", String.valueOf(z));
        }

        /* renamed from: l */
        public nh0<kh0> mo13407c() throws IOException {
            Bitmap a = nj3.this.f15558b.loadThumbnail(this.f15562x.mo13458u(), new Size(this.f15562x.mo13449m(), this.f15562x.mo13448l()), this.f15563y);
            if (a == null) {
                return null;
            }
            qh0 qh0 = new qh0(a, (rf5<Bitmap>) b26.m11034b(), ns2.f15676d, 0);
            this.f15561s.mo20276b("image_format", "thumbnail");
            qh0.mo22291e(this.f15561s.getExtras());
            return nh0.m23181v(qh0);
        }

        /* renamed from: m */
        public void mo19452f(nh0<kh0> nh0) {
            boolean z;
            super.mo19452f(nh0);
            aw4 aw4 = this.f15560r;
            wv4 wv4 = this.f15561s;
            if (nh0 != null) {
                z = true;
            } else {
                z = false;
            }
            aw4.mo11171c(wv4, "LocalThumbnailBitmapProducer", z);
            this.f15561s.mo20280f("local");
        }
    }

    /* renamed from: nj3$b */
    /* compiled from: LocalThumbnailBitmapProducer */
    public class C2900b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ f96 f15564a;

        public C2900b(f96 f96) {
            this.f15564a = f96;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f15564a.mo20438a();
        }
    }

    public nj3(Executor executor, ContentResolver contentResolver) {
        this.f15557a = executor;
        this.f15558b = contentResolver;
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        aw4 g = wv4.mo20281g();
        ImageRequest i = wv4.mo20286i();
        wv4.mo20278d("local", "thumbnail_bitmap");
        C2899a aVar = new C2899a(vq0, g, wv4, "LocalThumbnailBitmapProducer", g, wv4, i, new CancellationSignal());
        wv4.mo20292o(new C2900b(aVar));
        this.f15557a.execute(aVar);
    }
}
