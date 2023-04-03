package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: pj3 */
/* compiled from: LocalVideoThumbnailProducer */
public class pj3 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final Executor f16500a;

    /* renamed from: b */
    public final ContentResolver f16501b;

    /* renamed from: pj3$a */
    /* compiled from: LocalVideoThumbnailProducer */
    public class C3076a extends f96<nh0<kh0>> {

        /* renamed from: r */
        public final /* synthetic */ aw4 f16502r;

        /* renamed from: s */
        public final /* synthetic */ wv4 f16503s;

        /* renamed from: x */
        public final /* synthetic */ ImageRequest f16504x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3076a(vq0 vq0, aw4 aw4, wv4 wv4, String str, aw4 aw42, wv4 wv42, ImageRequest imageRequest) {
            super(vq0, aw4, wv4, str);
            this.f16502r = aw42;
            this.f16503s = wv42;
            this.f16504x = imageRequest;
        }

        /* renamed from: e */
        public void mo19822e(Exception exc) {
            super.mo19822e(exc);
            this.f16502r.mo11171c(this.f16503s, "VideoThumbnailProducer", false);
            this.f16503s.mo20280f("local");
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
        public nh0<kh0> mo13407c() throws Exception {
            String str;
            Bitmap bitmap;
            try {
                str = pj3.this.mo24611h(this.f16504x);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                bitmap = ThumbnailUtils.createVideoThumbnail(str, pj3.m24979f(this.f16504x));
            } else {
                bitmap = pj3.m24980g(pj3.this.f16501b, this.f16504x.mo13458u());
            }
            if (bitmap == null) {
                return null;
            }
            qh0 qh0 = new qh0(bitmap, (rf5<Bitmap>) b26.m11034b(), ns2.f15676d, 0);
            this.f16503s.mo20276b("image_format", "thumbnail");
            qh0.mo22291e(this.f16503s.getExtras());
            return nh0.m23181v(qh0);
        }

        /* renamed from: m */
        public void mo19452f(nh0<kh0> nh0) {
            boolean z;
            super.mo19452f(nh0);
            aw4 aw4 = this.f16502r;
            wv4 wv4 = this.f16503s;
            if (nh0 != null) {
                z = true;
            } else {
                z = false;
            }
            aw4.mo11171c(wv4, "VideoThumbnailProducer", z);
            this.f16503s.mo20280f("local");
        }
    }

    /* renamed from: pj3$b */
    /* compiled from: LocalVideoThumbnailProducer */
    public class C3077b extends C2439gz {

        /* renamed from: a */
        public final /* synthetic */ f96 f16506a;

        public C3077b(f96 f96) {
            this.f16506a = f96;
        }

        /* renamed from: b */
        public void mo13412b() {
            this.f16506a.mo20438a();
        }
    }

    public pj3(Executor executor, ContentResolver contentResolver) {
        this.f16500a = executor;
        this.f16501b = contentResolver;
    }

    /* renamed from: f */
    public static int m24979f(ImageRequest imageRequest) {
        if (imageRequest.mo13449m() > 96 || imageRequest.mo13448l() > 96) {
            return 1;
        }
        return 3;
    }

    /* renamed from: g */
    public static Bitmap m24980g(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            au4.m10792g(openFileDescriptor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        aw4 g = wv4.mo20281g();
        ImageRequest i = wv4.mo20286i();
        wv4.mo20278d("local", "video");
        C3076a aVar = new C3076a(vq0, g, wv4, "VideoThumbnailProducer", g, wv4, i);
        wv4.mo20292o(new C3077b(aVar));
        this.f16500a.execute(aVar);
    }

    /* renamed from: h */
    public final String mo24611h(ImageRequest imageRequest) {
        String[] strArr;
        String str;
        Uri uri;
        Uri u = imageRequest.mo13458u();
        if (i57.m19427j(u)) {
            return imageRequest.mo13456t().getPath();
        }
        if (i57.m19426i(u)) {
            if ("com.android.providers.media.documents".equals(u.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(u);
                au4.m10792g(documentId);
                String[] strArr2 = {documentId.split(":")[1]};
                str = "_id=?";
                uri = (Uri) au4.m10792g(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
                strArr = strArr2;
            } else {
                uri = u;
                str = null;
                strArr = null;
            }
            Cursor query = this.f16501b.query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }
}
