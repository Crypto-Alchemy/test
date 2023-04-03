package p000;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.mw3;

/* renamed from: p57 */
/* compiled from: UrlUriLoader */
public class p57<Data> implements mw3<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f16320b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a */
    public final mw3<dh2, Data> f16321a;

    /* renamed from: p57$a */
    /* compiled from: UrlUriLoader */
    public static class C3038a implements nw3<Uri, InputStream> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<Uri, InputStream> mo11938c(vz3 vz3) {
            return new p57(vz3.mo27397d(dh2.class, InputStream.class));
        }
    }

    public p57(mw3<dh2, Data> mw3) {
        this.f16321a = mw3;
    }

    /* renamed from: c */
    public mw3.C2853a<Data> mo11934b(Uri uri, int i, int i2, xi4 xi4) {
        return this.f16321a.mo11934b(new dh2(uri.toString()), i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo11933a(Uri uri) {
        return f16320b.contains(uri.getScheme());
    }
}
