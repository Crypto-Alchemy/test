package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;

public class ImageRequestBuilder {

    /* renamed from: a */
    public Uri f9748a = null;

    /* renamed from: b */
    public ImageRequest.RequestLevel f9749b = ImageRequest.RequestLevel.FULL_FETCH;

    /* renamed from: c */
    public int f9750c = 0;

    /* renamed from: d */
    public xh5 f9751d = null;

    /* renamed from: e */
    public lq2 f9752e = lq2.m21715a();

    /* renamed from: f */
    public ImageRequest.CacheChoice f9753f = ImageRequest.CacheChoice.DEFAULT;

    /* renamed from: g */
    public boolean f9754g = mr2.m22517F().mo23353a();

    /* renamed from: h */
    public boolean f9755h = false;

    /* renamed from: i */
    public boolean f9756i = false;

    /* renamed from: j */
    public Priority f9757j = Priority.HIGH;

    /* renamed from: k */
    public rt4 f9758k = null;

    /* renamed from: l */
    public Boolean f9759l = null;

    /* renamed from: m */
    public je5 f9760m;

    /* renamed from: n */
    public i70 f9761n = null;

    /* renamed from: o */
    public Boolean f9762o = null;

    /* renamed from: p */
    public int f9763p;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    /* renamed from: b */
    public static ImageRequestBuilder m13666b(ImageRequest imageRequest) {
        ImageRequestBuilder G = m13667u(imageRequest.mo13458u()).mo13501z(imageRequest.mo13442g()).mo13497v(imageRequest.mo13437c()).mo13498w(imageRequest.mo13438d()).mo13466B(imageRequest.mo13445i()).mo13465A(imageRequest.mo13443h()).mo13467C(imageRequest.mo13446j()).mo13499x(imageRequest.mo13439e()).mo13468D(imageRequest.mo13447k()).mo13469E(imageRequest.mo13451o()).mo13471G(imageRequest.mo13450n());
        imageRequest.mo13453q();
        return G.mo13472H((te5) null).mo13470F(imageRequest.mo13452p()).mo13473I(imageRequest.mo13455s()).mo13474J(imageRequest.mo13461y()).mo13500y(imageRequest.mo13441f());
    }

    /* renamed from: u */
    public static ImageRequestBuilder m13667u(Uri uri) {
        return new ImageRequestBuilder().mo13475K(uri);
    }

    /* renamed from: A */
    public ImageRequestBuilder mo13465A(boolean z) {
        this.f9756i = z;
        return this;
    }

    /* renamed from: B */
    public ImageRequestBuilder mo13466B(boolean z) {
        this.f9755h = z;
        return this;
    }

    /* renamed from: C */
    public ImageRequestBuilder mo13467C(ImageRequest.RequestLevel requestLevel) {
        this.f9749b = requestLevel;
        return this;
    }

    /* renamed from: D */
    public ImageRequestBuilder mo13468D(rt4 rt4) {
        this.f9758k = rt4;
        return this;
    }

    /* renamed from: E */
    public ImageRequestBuilder mo13469E(boolean z) {
        this.f9754g = z;
        return this;
    }

    /* renamed from: F */
    public ImageRequestBuilder mo13470F(je5 je5) {
        this.f9760m = je5;
        return this;
    }

    /* renamed from: G */
    public ImageRequestBuilder mo13471G(Priority priority) {
        this.f9757j = priority;
        return this;
    }

    /* renamed from: H */
    public ImageRequestBuilder mo13472H(te5 te5) {
        return this;
    }

    /* renamed from: I */
    public ImageRequestBuilder mo13473I(xh5 xh5) {
        this.f9751d = xh5;
        return this;
    }

    /* renamed from: J */
    public ImageRequestBuilder mo13474J(Boolean bool) {
        this.f9759l = bool;
        return this;
    }

    /* renamed from: K */
    public ImageRequestBuilder mo13475K(Uri uri) {
        au4.m10792g(uri);
        this.f9748a = uri;
        return this;
    }

    /* renamed from: L */
    public Boolean mo13476L() {
        return this.f9759l;
    }

    /* renamed from: M */
    public void mo13477M() {
        Uri uri = this.f9748a;
        if (uri != null) {
            if (i57.m19428k(uri)) {
                if (!this.f9748a.isAbsolute()) {
                    throw new BuilderException("Resource URI path must be absolute.");
                } else if (!this.f9748a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f9748a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new BuilderException("Resource URI must not be empty");
                }
            }
            if (i57.m19423f(this.f9748a) && !this.f9748a.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }

    /* renamed from: a */
    public ImageRequest mo13478a() {
        mo13477M();
        return new ImageRequest(this);
    }

    /* renamed from: c */
    public i70 mo13479c() {
        return this.f9761n;
    }

    /* renamed from: d */
    public ImageRequest.CacheChoice mo13480d() {
        return this.f9753f;
    }

    /* renamed from: e */
    public int mo13481e() {
        return this.f9750c;
    }

    /* renamed from: f */
    public int mo13482f() {
        return this.f9763p;
    }

    /* renamed from: g */
    public lq2 mo13483g() {
        return this.f9752e;
    }

    /* renamed from: h */
    public boolean mo13484h() {
        return this.f9756i;
    }

    /* renamed from: i */
    public ImageRequest.RequestLevel mo13485i() {
        return this.f9749b;
    }

    /* renamed from: j */
    public rt4 mo13486j() {
        return this.f9758k;
    }

    /* renamed from: k */
    public je5 mo13487k() {
        return this.f9760m;
    }

    /* renamed from: l */
    public Priority mo13488l() {
        return this.f9757j;
    }

    /* renamed from: m */
    public te5 mo13489m() {
        return null;
    }

    /* renamed from: n */
    public Boolean mo13490n() {
        return this.f9762o;
    }

    /* renamed from: o */
    public xh5 mo13491o() {
        return this.f9751d;
    }

    /* renamed from: p */
    public Uri mo13492p() {
        return this.f9748a;
    }

    /* renamed from: q */
    public boolean mo13493q() {
        if ((this.f9750c & 48) != 0 || !i57.m19429l(this.f9748a)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public boolean mo13494r() {
        return this.f9755h;
    }

    /* renamed from: s */
    public boolean mo13495s() {
        if ((this.f9750c & 15) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean mo13496t() {
        return this.f9754g;
    }

    /* renamed from: v */
    public ImageRequestBuilder mo13497v(i70 i70) {
        this.f9761n = i70;
        return this;
    }

    /* renamed from: w */
    public ImageRequestBuilder mo13498w(ImageRequest.CacheChoice cacheChoice) {
        this.f9753f = cacheChoice;
        return this;
    }

    /* renamed from: x */
    public final ImageRequestBuilder mo13499x(int i) {
        this.f9750c = i;
        return this;
    }

    /* renamed from: y */
    public ImageRequestBuilder mo13500y(int i) {
        this.f9763p = i;
        return this;
    }

    /* renamed from: z */
    public ImageRequestBuilder mo13501z(lq2 lq2) {
        this.f9752e = lq2;
        return this;
    }
}
