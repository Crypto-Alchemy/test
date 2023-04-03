package p000;

import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: jr2 */
/* compiled from: ImagePerfRequestListener */
public class jr2 extends C2640jz {

    /* renamed from: a */
    public final vx3 f13825a;

    /* renamed from: b */
    public final kr2 f13826b;

    public jr2(vx3 vx3, kr2 kr2) {
        this.f13825a = vx3;
        this.f13826b = kr2;
    }

    /* renamed from: a */
    public void mo21813a(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f13826b.mo22508s(this.f13825a.now());
        this.f13826b.mo22506q(imageRequest);
        this.f13826b.mo22493d(obj);
        this.f13826b.mo22513x(str);
        this.f13826b.mo22512w(z);
    }

    /* renamed from: c */
    public void mo21814c(ImageRequest imageRequest, String str, boolean z) {
        this.f13826b.mo22507r(this.f13825a.now());
        this.f13826b.mo22506q(imageRequest);
        this.f13826b.mo22513x(str);
        this.f13826b.mo22512w(z);
    }

    /* renamed from: i */
    public void mo21815i(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f13826b.mo22507r(this.f13825a.now());
        this.f13826b.mo22506q(imageRequest);
        this.f13826b.mo22513x(str);
        this.f13826b.mo22512w(z);
    }

    /* renamed from: k */
    public void mo21816k(String str) {
        this.f13826b.mo22507r(this.f13825a.now());
        this.f13826b.mo22513x(str);
    }
}
