package p000;

import java.io.InputStream;
import java.net.URL;
import p000.mw3;

/* renamed from: n57 */
/* compiled from: UrlLoader */
public class n57 implements mw3<URL, InputStream> {

    /* renamed from: a */
    public final mw3<dh2, InputStream> f15362a;

    /* renamed from: n57$a */
    /* compiled from: UrlLoader */
    public static class C2867a implements nw3<URL, InputStream> {
        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<URL, InputStream> mo11938c(vz3 vz3) {
            return new n57(vz3.mo27397d(dh2.class, InputStream.class));
        }
    }

    public n57(mw3<dh2, InputStream> mw3) {
        this.f15362a = mw3;
    }

    /* renamed from: c */
    public mw3.C2853a<InputStream> mo11934b(URL url, int i, int i2, xi4 xi4) {
        return this.f15362a.mo11934b(new dh2(url), i, i2, xi4);
    }

    /* renamed from: d */
    public boolean mo11933a(URL url) {
        return true;
    }
}
