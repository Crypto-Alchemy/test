package p000;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.facebook.imagepipeline.decoder.DecodeException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: p81 */
/* compiled from: DefaultImageDecoder */
public class p81 implements nq2 {

    /* renamed from: a */
    public final nq2 f16348a;

    /* renamed from: b */
    public final nq2 f16349b;

    /* renamed from: c */
    public final zo4 f16350c;

    /* renamed from: d */
    public final nq2 f16351d;

    /* renamed from: e */
    public final Map<rq2, nq2> f16352e;

    /* renamed from: p81$a */
    /* compiled from: DefaultImageDecoder */
    public class C3044a implements nq2 {
        public C3044a() {
        }

        /* renamed from: a */
        public kh0 mo13314a(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
            rq2 k = gp1.mo20751k();
            if (k == r81.f17197a) {
                return p81.this.mo24477d(gp1, i, qz4, lq2);
            }
            if (k == r81.f17199c) {
                return p81.this.mo24476c(gp1, i, qz4, lq2);
            }
            if (k == r81.f17206j) {
                return p81.this.mo24475b(gp1, i, qz4, lq2);
            }
            if (k != rq2.f17332c) {
                return p81.this.mo24478e(gp1, lq2);
            }
            throw new DecodeException("unknown image format", gp1);
        }
    }

    public p81(nq2 nq2, nq2 nq22, zo4 zo4) {
        this(nq2, nq22, zo4, (Map<rq2, nq2>) null);
    }

    /* renamed from: a */
    public kh0 mo13314a(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
        nq2 nq2;
        InputStream l;
        nq2 nq22 = lq2.f14647i;
        if (nq22 != null) {
            return nq22.mo13314a(gp1, i, qz4, lq2);
        }
        rq2 k = gp1.mo20751k();
        if ((k == null || k == rq2.f17332c) && (l = gp1.mo20752l()) != null) {
            k = sq2.m27065c(l);
            gp1.mo20738P(k);
        }
        Map<rq2, nq2> map = this.f16352e;
        if (map == null || (nq2 = map.get(k)) == null) {
            return this.f16351d.mo13314a(gp1, i, qz4, lq2);
        }
        return nq2.mo13314a(gp1, i, qz4, lq2);
    }

    /* renamed from: b */
    public kh0 mo24475b(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
        nq2 nq2 = this.f16349b;
        if (nq2 != null) {
            return nq2.mo13314a(gp1, i, qz4, lq2);
        }
        throw new DecodeException("Animated WebP support not set up!", gp1);
    }

    /* renamed from: c */
    public kh0 mo24476c(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
        nq2 nq2;
        if (gp1.mo20757s() == -1 || gp1.mo20750j() == -1) {
            throw new DecodeException("image width or height is incorrect", gp1);
        } else if (lq2.f14644f || (nq2 = this.f16348a) == null) {
            return mo24478e(gp1, lq2);
        } else {
            return nq2.mo13314a(gp1, i, qz4, lq2);
        }
    }

    /* renamed from: d */
    public qh0 mo24477d(gp1 gp1, int i, qz4 qz4, lq2 lq2) {
        nh0<Bitmap> b = this.f16350c.mo13373b(gp1, lq2.f14645g, (Rect) null, i, lq2.f14649k);
        try {
            boolean a = pw6.m25185a(lq2.f14648j, b);
            qh0 qh0 = new qh0(b, qz4, gp1.mo20754n(), gp1.mo20748h());
            qh0.mo22290d("is_rounded", false);
            return qh0;
        } finally {
            b.close();
        }
    }

    /* renamed from: e */
    public qh0 mo24478e(gp1 gp1, lq2 lq2) {
        nh0<Bitmap> a = this.f16350c.mo13372a(gp1, lq2.f14645g, (Rect) null, lq2.f14649k);
        try {
            boolean a2 = pw6.m25185a(lq2.f14648j, a);
            qh0 qh0 = new qh0(a, ns2.f15676d, gp1.mo20754n(), gp1.mo20748h());
            qh0.mo22290d("is_rounded", false);
            return qh0;
        } finally {
            a.close();
        }
    }

    public p81(nq2 nq2, nq2 nq22, zo4 zo4, Map<rq2, nq2> map) {
        this.f16351d = new C3044a();
        this.f16348a = nq2;
        this.f16349b = nq22;
        this.f16350c = zo4;
        this.f16352e = map;
    }
}
