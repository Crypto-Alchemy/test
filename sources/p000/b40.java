package p000;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: b40 */
/* compiled from: BranchOnSeparateImagesProducer */
public class b40 implements vv4<gp1> {

    /* renamed from: a */
    public final vv4<gp1> f7936a;

    /* renamed from: b */
    public final vv4<gp1> f7937b;

    /* renamed from: b40$b */
    /* compiled from: BranchOnSeparateImagesProducer */
    public class C1602b extends sb1<gp1, gp1> {

        /* renamed from: c */
        public wv4 f7938c;

        /* renamed from: h */
        public void mo11351h(Throwable th) {
            b40.this.f7937b.mo11350a(mo25710p(), this.f7938c);
        }

        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            ImageRequest i2 = this.f7938c.mo20286i();
            boolean e = C3766zx.m31566e(i);
            i2.mo13453q();
            boolean c = yp6.m30729c(gp1, (te5) null);
            if (gp1 != null && (c || i2.mo13445i())) {
                if (!e || !c) {
                    mo25710p().mo27294c(gp1, C3766zx.m31571o(i, 1));
                } else {
                    mo25710p().mo27294c(gp1, i);
                }
            }
            if (e && !c && !i2.mo13443h()) {
                gp1.m18285c(gp1);
                b40.this.f7937b.mo11350a(mo25710p(), this.f7938c);
            }
        }

        public C1602b(vq0<gp1> vq0, wv4 wv4) {
            super(vq0);
            this.f7938c = wv4;
        }
    }

    public b40(vv4<gp1> vv4, vv4<gp1> vv42) {
        this.f7936a = vv4;
        this.f7937b = vv42;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        this.f7936a.mo11350a(new C1602b(vq0, wv4), wv4);
    }
}
