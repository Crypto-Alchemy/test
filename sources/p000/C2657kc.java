package p000;

/* renamed from: kc */
/* compiled from: AddImageTransformMetaDataProducer */
public class C2657kc implements vv4<gp1> {

    /* renamed from: a */
    public final vv4<gp1> f14034a;

    /* renamed from: kc$b */
    /* compiled from: AddImageTransformMetaDataProducer */
    public static class C2659b extends sb1<gp1, gp1> {
        /* renamed from: q */
        public void mo11352i(gp1 gp1, int i) {
            if (gp1 == null) {
                mo25710p().mo27294c(null, i);
                return;
            }
            if (!gp1.m18286z(gp1)) {
                gp1.mo20731G();
            }
            mo25710p().mo27294c(gp1, i);
        }

        public C2659b(vq0<gp1> vq0) {
            super(vq0);
        }
    }

    public C2657kc(vv4<gp1> vv4) {
        this.f14034a = vv4;
    }

    /* renamed from: a */
    public void mo11350a(vq0<gp1> vq0, wv4 wv4) {
        this.f14034a.mo11350a(new C2659b(vq0), wv4);
    }
}
