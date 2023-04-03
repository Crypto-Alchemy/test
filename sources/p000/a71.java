package p000;

import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: a71 */
/* compiled from: DefaultCacheKeyFactory */
public class a71 implements g80 {

    /* renamed from: a */
    public static a71 f53a;

    /* renamed from: f */
    public static synchronized a71 m87f() {
        a71 a71;
        synchronized (a71.class) {
            if (f53a == null) {
                f53a = new a71();
            }
            a71 = f53a;
        }
        return a71;
    }

    /* renamed from: a */
    public f80 mo71a(ImageRequest imageRequest, Object obj) {
        String uri = mo75e(imageRequest.mo13458u()).toString();
        imageRequest.mo13453q();
        return new o20(uri, (te5) null, imageRequest.mo13455s(), imageRequest.mo13442g(), (f80) null, (String) null, obj);
    }

    /* renamed from: b */
    public f80 mo72b(ImageRequest imageRequest, Uri uri, Object obj) {
        return new c26(mo75e(uri).toString());
    }

    /* renamed from: c */
    public f80 mo73c(ImageRequest imageRequest, Object obj) {
        String str;
        f80 f80;
        rt4 k = imageRequest.mo13447k();
        if (k != null) {
            f80 c = k.mo25540c();
            str = k.getClass().getName();
            f80 = c;
        } else {
            f80 = null;
            str = null;
        }
        String uri = mo75e(imageRequest.mo13458u()).toString();
        imageRequest.mo13453q();
        return new o20(uri, (te5) null, imageRequest.mo13455s(), imageRequest.mo13442g(), f80, str, obj);
    }

    /* renamed from: d */
    public f80 mo74d(ImageRequest imageRequest, Object obj) {
        return mo72b(imageRequest, imageRequest.mo13458u(), obj);
    }

    /* renamed from: e */
    public Uri mo75e(Uri uri) {
        return uri;
    }
}
