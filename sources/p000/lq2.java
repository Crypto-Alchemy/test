package p000;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import p000.hf4;

/* renamed from: lq2 */
/* compiled from: ImageDecodeOptions */
public class lq2 {

    /* renamed from: m */
    public static final lq2 f14638m = m21716b().mo23286a();

    /* renamed from: a */
    public final int f14639a;

    /* renamed from: b */
    public final int f14640b;

    /* renamed from: c */
    public final boolean f14641c;

    /* renamed from: d */
    public final boolean f14642d;

    /* renamed from: e */
    public final boolean f14643e;

    /* renamed from: f */
    public final boolean f14644f;

    /* renamed from: g */
    public final Bitmap.Config f14645g;

    /* renamed from: h */
    public final Bitmap.Config f14646h;

    /* renamed from: i */
    public final nq2 f14647i;

    /* renamed from: j */
    public final z20 f14648j;

    /* renamed from: k */
    public final ColorSpace f14649k;

    /* renamed from: l */
    public final boolean f14650l;

    public lq2(mq2 mq2) {
        this.f14639a = mq2.mo23297l();
        this.f14640b = mq2.mo23296k();
        this.f14641c = mq2.mo23293h();
        this.f14642d = mq2.mo23298m();
        this.f14643e = mq2.mo23292g();
        this.f14644f = mq2.mo23295j();
        this.f14645g = mq2.mo23288c();
        this.f14646h = mq2.mo23287b();
        this.f14647i = mq2.mo23291f();
        this.f14648j = mq2.mo23289d();
        this.f14649k = mq2.mo23290e();
        this.f14650l = mq2.mo23294i();
    }

    /* renamed from: a */
    public static lq2 m21715a() {
        return f14638m;
    }

    /* renamed from: b */
    public static mq2 m21716b() {
        return new mq2();
    }

    /* renamed from: c */
    public hf4.C2469b mo22925c() {
        return hf4.m18862c(this).mo21157a("minDecodeIntervalMs", this.f14639a).mo21157a("maxDimensionPx", this.f14640b).mo21159c("decodePreviewFrame", this.f14641c).mo21159c("useLastFrameForPreview", this.f14642d).mo21159c("decodeAllFrames", this.f14643e).mo21159c("forceStaticImage", this.f14644f).mo21158b("bitmapConfigName", this.f14645g.name()).mo21158b("animatedBitmapConfigName", this.f14646h.name()).mo21158b("customImageDecoder", this.f14647i).mo21158b("bitmapTransformation", this.f14648j).mo21158b("colorSpace", this.f14649k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lq2 lq2 = (lq2) obj;
        if (this.f14639a != lq2.f14639a || this.f14640b != lq2.f14640b || this.f14641c != lq2.f14641c || this.f14642d != lq2.f14642d || this.f14643e != lq2.f14643e || this.f14644f != lq2.f14644f) {
            return false;
        }
        boolean z = this.f14650l;
        if (!z && this.f14645g != lq2.f14645g) {
            return false;
        }
        if ((z || this.f14646h == lq2.f14646h) && this.f14647i == lq2.f14647i && this.f14648j == lq2.f14648j && this.f14649k == lq2.f14649k) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (((((((((this.f14639a * 31) + this.f14640b) * 31) + (this.f14641c ? 1 : 0)) * 31) + (this.f14642d ? 1 : 0)) * 31) + (this.f14643e ? 1 : 0)) * 31) + (this.f14644f ? 1 : 0);
        if (!this.f14650l) {
            i4 = (i4 * 31) + this.f14645g.ordinal();
        }
        int i5 = 0;
        if (!this.f14650l) {
            int i6 = i4 * 31;
            Bitmap.Config config = this.f14646h;
            if (config != null) {
                i3 = config.ordinal();
            } else {
                i3 = 0;
            }
            i4 = i6 + i3;
        }
        int i7 = i4 * 31;
        nq2 nq2 = this.f14647i;
        if (nq2 != null) {
            i = nq2.hashCode();
        } else {
            i = 0;
        }
        int i8 = (i7 + i) * 31;
        z20 z20 = this.f14648j;
        if (z20 != null) {
            i2 = z20.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        ColorSpace colorSpace = this.f14649k;
        if (colorSpace != null) {
            i5 = colorSpace.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "ImageDecodeOptions{" + mo22925c().toString() + "}";
    }
}
