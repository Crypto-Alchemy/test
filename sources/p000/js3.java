package p000;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import java.io.InputStream;
import p000.mw3;

/* renamed from: js3 */
/* compiled from: MediaStoreVideoThumbLoader */
public class js3 implements mw3<Uri, InputStream> {

    /* renamed from: a */
    public final Context f13841a;

    /* renamed from: js3$a */
    /* compiled from: MediaStoreVideoThumbLoader */
    public static class C2633a implements nw3<Uri, InputStream> {

        /* renamed from: a */
        public final Context f13842a;

        public C2633a(Context context) {
            this.f13842a = context;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Uri, InputStream> mo11938c(vz3 vz3) {
            return new js3(this.f13842a);
        }
    }

    public js3(Context context) {
        this.f13841a = context.getApplicationContext();
    }

    /* renamed from: c */
    public mw3.C2853a<InputStream> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        if (!is3.m19816d(i, i2) || !mo22085e(xi4)) {
            return null;
        }
        return new mw3.C2853a<>(new df4(uri), tp6.m27872g(this.f13841a, uri));
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        return is3.m19815c(uri);
    }

    /* renamed from: e */
    public final boolean mo22085e(xi4 xi4) {
        Long l = (Long) xi4.mo27760c(VideoDecoder.f8937d);
        if (l == null || l.longValue() != -1) {
            return false;
        }
        return true;
    }
}
