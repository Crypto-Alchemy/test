package p000;

import android.graphics.Bitmap;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p000.dx0;

/* renamed from: ko4 */
/* compiled from: PgsDecoder */
public final class ko4 extends z26 {

    /* renamed from: o */
    public final gm4 f14240o = new gm4();

    /* renamed from: p */
    public final gm4 f14241p = new gm4();

    /* renamed from: q */
    public final C2722a f14242q = new C2722a();

    /* renamed from: r */
    public Inflater f14243r;

    /* renamed from: ko4$a */
    /* compiled from: PgsDecoder */
    public static final class C2722a {

        /* renamed from: a */
        public final gm4 f14244a = new gm4();

        /* renamed from: b */
        public final int[] f14245b = new int[256];

        /* renamed from: c */
        public boolean f14246c;

        /* renamed from: d */
        public int f14247d;

        /* renamed from: e */
        public int f14248e;

        /* renamed from: f */
        public int f14249f;

        /* renamed from: g */
        public int f14250g;

        /* renamed from: h */
        public int f14251h;

        /* renamed from: i */
        public int f14252i;

        /* renamed from: d */
        public dx0 mo22428d() {
            int i;
            int i2;
            int i3;
            if (this.f14247d == 0 || this.f14248e == 0 || this.f14251h == 0 || this.f14252i == 0 || this.f14244a.mo20681f() == 0 || this.f14244a.mo20680e() != this.f14244a.mo20681f() || !this.f14246c) {
                return null;
            }
            this.f14244a.mo20674P(0);
            int i4 = this.f14251h * this.f14252i;
            int[] iArr = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int D = this.f14244a.mo20662D();
                if (D != 0) {
                    i3 = i5 + 1;
                    iArr[i5] = this.f14245b[D];
                } else {
                    int D2 = this.f14244a.mo20662D();
                    if (D2 != 0) {
                        if ((D2 & 64) == 0) {
                            i = D2 & 63;
                        } else {
                            i = ((D2 & 63) << 8) | this.f14244a.mo20662D();
                        }
                        if ((D2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f14245b[this.f14244a.mo20662D()];
                        }
                        i3 = i + i5;
                        Arrays.fill(iArr, i5, i3, i2);
                    }
                }
                i5 = i3;
            }
            return new dx0.C2206b().mo18984f(Bitmap.createBitmap(iArr, this.f14251h, this.f14252i, Bitmap.Config.ARGB_8888)).mo18989k(((float) this.f14249f) / ((float) this.f14247d)).mo18990l(0).mo18986h(((float) this.f14250g) / ((float) this.f14248e), 0).mo18987i(0).mo18992n(((float) this.f14251h) / ((float) this.f14247d)).mo18985g(((float) this.f14252i) / ((float) this.f14248e)).mo18979a();
        }

        /* renamed from: e */
        public final void mo22429e(gm4 gm4, int i) {
            boolean z;
            int G;
            if (i >= 4) {
                gm4.mo20675Q(3);
                if ((gm4.mo20662D() & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 4;
                if (z) {
                    if (i2 >= 7 && (G = gm4.mo20665G()) >= 4) {
                        this.f14251h = gm4.mo20668J();
                        this.f14252i = gm4.mo20668J();
                        this.f14244a.mo20670L(G - 4);
                        i2 -= 7;
                    } else {
                        return;
                    }
                }
                int e = this.f14244a.mo20680e();
                int f = this.f14244a.mo20681f();
                if (e < f && i2 > 0) {
                    int min = Math.min(i2, f - e);
                    gm4.mo20685j(this.f14244a.mo20679d(), e, min);
                    this.f14244a.mo20674P(e + min);
                }
            }
        }

        /* renamed from: f */
        public final void mo22430f(gm4 gm4, int i) {
            if (i >= 19) {
                this.f14247d = gm4.mo20668J();
                this.f14248e = gm4.mo20668J();
                gm4.mo20675Q(11);
                this.f14249f = gm4.mo20668J();
                this.f14250g = gm4.mo20668J();
            }
        }

        /* renamed from: g */
        public final void mo22431g(gm4 gm4, int i) {
            if (i % 5 == 2) {
                gm4.mo20675Q(2);
                Arrays.fill(this.f14245b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int D = gm4.mo20662D();
                    int D2 = gm4.mo20662D();
                    int D3 = gm4.mo20662D();
                    int D4 = gm4.mo20662D();
                    int D5 = gm4.mo20662D();
                    double d = (double) D2;
                    double d2 = (double) (D3 - 128);
                    int i4 = i3;
                    double d3 = (double) (D4 - 128);
                    this.f14245b[D] = w67.m29374q((int) (d + (d3 * 1.772d)), 0, 255) | (w67.m29374q((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (D5 << 24) | (w67.m29374q((int) ((1.402d * d2) + d), 0, 255) << 16);
                    i3 = i4 + 1;
                }
                this.f14246c = true;
            }
        }

        /* renamed from: h */
        public void mo22432h() {
            this.f14247d = 0;
            this.f14248e = 0;
            this.f14249f = 0;
            this.f14250g = 0;
            this.f14251h = 0;
            this.f14252i = 0;
            this.f14244a.mo20670L(0);
            this.f14246c = false;
        }
    }

    public ko4() {
        super("PgsDecoder");
    }

    /* renamed from: D */
    public static dx0 m20946D(gm4 gm4, C2722a aVar) {
        int f = gm4.mo20681f();
        int D = gm4.mo20662D();
        int J = gm4.mo20668J();
        int e = gm4.mo20680e() + J;
        dx0 dx0 = null;
        if (e > f) {
            gm4.mo20674P(f);
            return null;
        }
        if (D != 128) {
            switch (D) {
                case 20:
                    aVar.mo22431g(gm4, J);
                    break;
                case 21:
                    aVar.mo22429e(gm4, J);
                    break;
                case 22:
                    aVar.mo22430f(gm4, J);
                    break;
            }
        } else {
            dx0 = aVar.mo22428d();
            aVar.mo22432h();
        }
        gm4.mo20674P(e);
        return dx0;
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f14240o.mo20672N(bArr, i);
        mo22427C(this.f14240o);
        this.f14242q.mo22432h();
        ArrayList arrayList = new ArrayList();
        while (this.f14240o.mo20676a() >= 3) {
            dx0 D = m20946D(this.f14240o, this.f14242q);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new lo4(Collections.unmodifiableList(arrayList));
    }

    /* renamed from: C */
    public final void mo22427C(gm4 gm4) {
        if (gm4.mo20676a() > 0 && gm4.mo20683h() == 120) {
            if (this.f14243r == null) {
                this.f14243r = new Inflater();
            }
            if (w67.m29369n0(gm4, this.f14241p, this.f14243r)) {
                gm4.mo20672N(this.f14241p.mo20679d(), this.f14241p.mo20681f());
            }
        }
    }
}
