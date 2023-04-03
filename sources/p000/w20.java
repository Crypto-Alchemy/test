package p000;

import android.graphics.Bitmap;

/* renamed from: w20 */
/* compiled from: BitmapPrepareProducer */
public class w20 implements vv4<nh0<kh0>> {

    /* renamed from: a */
    public final vv4<nh0<kh0>> f18969a;

    /* renamed from: b */
    public final int f18970b;

    /* renamed from: c */
    public final int f18971c;

    /* renamed from: d */
    public final boolean f18972d;

    /* renamed from: w20$a */
    /* compiled from: BitmapPrepareProducer */
    public static class C3520a extends sb1<nh0<kh0>, nh0<kh0>> {

        /* renamed from: c */
        public final int f18973c;

        /* renamed from: d */
        public final int f18974d;

        public C3520a(vq0<nh0<kh0>> vq0, int i, int i2) {
            super(vq0);
            this.f18973c = i;
            this.f18974d = i2;
        }

        /* renamed from: q */
        public final void mo27415q(nh0<kh0> nh0) {
            kh0 j;
            Bitmap f;
            int rowBytes;
            if (nh0 != null && nh0.mo23686m() && (j = nh0.mo23684j()) != null && !j.isClosed() && (j instanceof qh0) && (f = ((qh0) j).mo21538f()) != null && (rowBytes = f.getRowBytes() * f.getHeight()) >= this.f18973c && rowBytes <= this.f18974d) {
                f.prepareToDraw();
            }
        }

        /* renamed from: r */
        public void mo11352i(nh0<kh0> nh0, int i) {
            mo27415q(nh0);
            mo25710p().mo27294c(nh0, i);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [vv4<nh0<kh0>>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w20(p000.vv4<p000.nh0<p000.kh0>> r2, int r3, int r4, boolean r5) {
        /*
            r1 = this;
            r1.<init>()
            if (r3 > r4) goto L_0x0007
            r0 = 1
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            p000.au4.m10787b(r0)
            java.lang.Object r2 = p000.au4.m10792g(r2)
            vv4 r2 = (p000.vv4) r2
            r1.f18969a = r2
            r1.f18970b = r3
            r1.f18971c = r4
            r1.f18972d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w20.<init>(vv4, int, int, boolean):void");
    }

    /* renamed from: a */
    public void mo11350a(vq0<nh0<kh0>> vq0, wv4 wv4) {
        if (!wv4.mo20289l() || this.f18972d) {
            this.f18969a.mo11350a(new C3520a(vq0, this.f18970b, this.f18971c), wv4);
        } else {
            this.f18969a.mo11350a(vq0, wv4);
        }
    }
}
