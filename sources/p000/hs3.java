package p000;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p000.mw3;

/* renamed from: hs3 */
/* compiled from: MediaStoreImageThumbLoader */
public class hs3 implements mw3<Uri, InputStream> {

    /* renamed from: a */
    public final Context f13060a;

    /* renamed from: hs3$a */
    /* compiled from: MediaStoreImageThumbLoader */
    public static class C2512a implements nw3<Uri, InputStream> {

        /* renamed from: a */
        public final Context f13061a;

        public C2512a(Context context) {
            this.f13061a = context;
        }

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Uri, InputStream> mo11938c(vz3 vz3) {
            return new hs3(this.f13061a);
        }
    }

    public hs3(Context context) {
        this.f13060a = context.getApplicationContext();
    }

    /* renamed from: c */
    public mw3.C2853a<InputStream> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        if (is3.m19816d(i, i2)) {
            return new mw3.C2853a<>(new df4(uri), tp6.m27871f(this.f13060a, uri));
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        return is3.m19813a(uri);
    }
}
