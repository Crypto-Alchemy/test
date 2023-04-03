package p000;

import java.io.InputStream;
import p000.mw3;

/* renamed from: dn2 */
/* compiled from: HttpGlideUrlLoader */
public class dn2 implements mw3<dh2, InputStream> {

    /* renamed from: b */
    public static final pi4<Integer> f10797b = pi4.m24962f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a */
    public final kw3<dh2, dh2> f10798a;

    /* renamed from: dn2$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C2184a implements nw3<dh2, InputStream> {

        /* renamed from: a */
        public final kw3<dh2, dh2> f10799a = new kw3<>(500);

        /* renamed from: a */
        public void mo11937a() {
        }

        /* renamed from: c */
        public mw3<dh2, InputStream> mo11938c(vz3 vz3) {
            return new dn2(this.f10799a);
        }
    }

    public dn2(kw3<dh2, dh2> kw3) {
        this.f10798a = kw3;
    }

    /* renamed from: c */
    public mw3.C2853a<InputStream> mo11934b(dh2 dh2, int i, int i2, xi4 xi4) {
        kw3<dh2, dh2> kw3 = this.f10798a;
        if (kw3 != null) {
            dh2 a = kw3.mo22532a(dh2, 0, 0);
            if (a == null) {
                this.f10798a.mo22533b(dh2, 0, 0, dh2);
            } else {
                dh2 = a;
            }
        }
        return new mw3.C2853a<>(dh2, new kn2(dh2, ((Integer) xi4.mo27760c(f10797b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo11933a(dh2 dh2) {
        return true;
    }
}
