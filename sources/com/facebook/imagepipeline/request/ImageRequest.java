package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.common.Priority;
import java.io.File;

public class ImageRequest {

    /* renamed from: v */
    public static boolean f9722v;

    /* renamed from: w */
    public static boolean f9723w;

    /* renamed from: x */
    public static final g62<ImageRequest, Uri> f9724x = new C1966a();

    /* renamed from: a */
    public int f9725a;

    /* renamed from: b */
    public final CacheChoice f9726b;

    /* renamed from: c */
    public final Uri f9727c;

    /* renamed from: d */
    public final int f9728d;

    /* renamed from: e */
    public File f9729e;

    /* renamed from: f */
    public final boolean f9730f;

    /* renamed from: g */
    public final boolean f9731g;

    /* renamed from: h */
    public final boolean f9732h;

    /* renamed from: i */
    public final lq2 f9733i;

    /* renamed from: j */
    public final xh5 f9734j;

    /* renamed from: k */
    public final i70 f9735k;

    /* renamed from: l */
    public final Priority f9736l;

    /* renamed from: m */
    public final RequestLevel f9737m;

    /* renamed from: n */
    public final int f9738n;

    /* renamed from: o */
    public final boolean f9739o;

    /* renamed from: p */
    public final boolean f9740p;

    /* renamed from: q */
    public final Boolean f9741q;

    /* renamed from: r */
    public final rt4 f9742r;

    /* renamed from: s */
    public final je5 f9743s;

    /* renamed from: t */
    public final Boolean f9744t;

    /* renamed from: u */
    public final int f9745u;

    public enum CacheChoice {
        SMALL,
        DEFAULT
    }

    public enum RequestLevel {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        /* access modifiers changed from: public */
        RequestLevel(int i) {
            this.mValue = i;
        }

        public static RequestLevel getMax(RequestLevel requestLevel, RequestLevel requestLevel2) {
            if (requestLevel.getValue() > requestLevel2.getValue()) {
                return requestLevel;
            }
            return requestLevel2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    /* renamed from: com.facebook.imagepipeline.request.ImageRequest$a */
    public static class C1966a implements g62<ImageRequest, Uri> {
        /* renamed from: a */
        public Uri apply(ImageRequest imageRequest) {
            if (imageRequest != null) {
                return imageRequest.mo13458u();
            }
            return null;
        }
    }

    public ImageRequest(ImageRequestBuilder imageRequestBuilder) {
        xh5 xh5;
        this.f9726b = imageRequestBuilder.mo13480d();
        Uri p = imageRequestBuilder.mo13492p();
        this.f9727c = p;
        this.f9728d = m13642w(p);
        this.f9730f = imageRequestBuilder.mo13496t();
        this.f9731g = imageRequestBuilder.mo13494r();
        this.f9732h = imageRequestBuilder.mo13484h();
        this.f9733i = imageRequestBuilder.mo13483g();
        imageRequestBuilder.mo13489m();
        if (imageRequestBuilder.mo13491o() == null) {
            xh5 = xh5.m30104a();
        } else {
            xh5 = imageRequestBuilder.mo13491o();
        }
        this.f9734j = xh5;
        this.f9735k = imageRequestBuilder.mo13479c();
        this.f9736l = imageRequestBuilder.mo13488l();
        this.f9737m = imageRequestBuilder.mo13485i();
        this.f9738n = imageRequestBuilder.mo13481e();
        this.f9739o = imageRequestBuilder.mo13493q();
        this.f9740p = imageRequestBuilder.mo13495s();
        this.f9741q = imageRequestBuilder.mo13476L();
        this.f9742r = imageRequestBuilder.mo13486j();
        this.f9743s = imageRequestBuilder.mo13487k();
        this.f9744t = imageRequestBuilder.mo13490n();
        this.f9745u = imageRequestBuilder.mo13482f();
    }

    /* renamed from: a */
    public static ImageRequest m13640a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.m13667u(uri).mo13478a();
    }

    /* renamed from: b */
    public static ImageRequest m13641b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return m13640a(Uri.parse(str));
    }

    /* renamed from: w */
    public static int m13642w(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (i57.m19429l(uri)) {
            return 0;
        }
        if (i57.m19427j(uri)) {
            if (ks3.m21027c(ks3.m21026b(uri.getPath()))) {
                return 2;
            }
            return 3;
        } else if (i57.m19426i(uri)) {
            return 4;
        } else {
            if (i57.m19423f(uri)) {
                return 5;
            }
            if (i57.m19428k(uri)) {
                return 6;
            }
            if (i57.m19422e(uri)) {
                return 7;
            }
            if (i57.m19430m(uri)) {
                return 8;
            }
            return -1;
        }
    }

    /* renamed from: c */
    public i70 mo13437c() {
        return this.f9735k;
    }

    /* renamed from: d */
    public CacheChoice mo13438d() {
        return this.f9726b;
    }

    /* renamed from: e */
    public int mo13439e() {
        return this.f9738n;
    }

    public boolean equals(Object obj) {
        f80 f80;
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (f9722v) {
            int i = this.f9725a;
            int i2 = imageRequest.f9725a;
            if (!(i == 0 || i2 == 0 || i == i2)) {
                return false;
            }
        }
        if (this.f9731g != imageRequest.f9731g || this.f9739o != imageRequest.f9739o || this.f9740p != imageRequest.f9740p || !hf4.m18860a(this.f9727c, imageRequest.f9727c) || !hf4.m18860a(this.f9726b, imageRequest.f9726b) || !hf4.m18860a(this.f9729e, imageRequest.f9729e) || !hf4.m18860a(this.f9735k, imageRequest.f9735k) || !hf4.m18860a(this.f9733i, imageRequest.f9733i)) {
            return false;
        }
        f80 f802 = null;
        if (!hf4.m18860a((Object) null, (Object) null) || !hf4.m18860a(this.f9736l, imageRequest.f9736l) || !hf4.m18860a(this.f9737m, imageRequest.f9737m) || !hf4.m18860a(Integer.valueOf(this.f9738n), Integer.valueOf(imageRequest.f9738n)) || !hf4.m18860a(this.f9741q, imageRequest.f9741q) || !hf4.m18860a(this.f9744t, imageRequest.f9744t) || !hf4.m18860a(this.f9734j, imageRequest.f9734j) || this.f9732h != imageRequest.f9732h) {
            return false;
        }
        rt4 rt4 = this.f9742r;
        if (rt4 != null) {
            f80 = rt4.mo25540c();
        } else {
            f80 = null;
        }
        rt4 rt42 = imageRequest.f9742r;
        if (rt42 != null) {
            f802 = rt42.mo25540c();
        }
        if (hf4.m18860a(f80, f802) && this.f9745u == imageRequest.f9745u) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo13441f() {
        return this.f9745u;
    }

    /* renamed from: g */
    public lq2 mo13442g() {
        return this.f9733i;
    }

    /* renamed from: h */
    public boolean mo13443h() {
        return this.f9732h;
    }

    public int hashCode() {
        int i;
        f80 f80;
        boolean z = f9723w;
        if (z) {
            i = this.f9725a;
        } else {
            i = 0;
        }
        if (i == 0) {
            rt4 rt4 = this.f9742r;
            if (rt4 != null) {
                f80 = rt4.mo25540c();
            } else {
                f80 = null;
            }
            i = hf4.m18861b(this.f9726b, this.f9727c, Boolean.valueOf(this.f9731g), this.f9735k, this.f9736l, this.f9737m, Integer.valueOf(this.f9738n), Boolean.valueOf(this.f9739o), Boolean.valueOf(this.f9740p), this.f9733i, this.f9741q, null, this.f9734j, f80, this.f9744t, Integer.valueOf(this.f9745u), Boolean.valueOf(this.f9732h));
            if (z) {
                this.f9725a = i;
            }
        }
        return i;
    }

    /* renamed from: i */
    public boolean mo13445i() {
        return this.f9731g;
    }

    /* renamed from: j */
    public RequestLevel mo13446j() {
        return this.f9737m;
    }

    /* renamed from: k */
    public rt4 mo13447k() {
        return this.f9742r;
    }

    /* renamed from: l */
    public int mo13448l() {
        return 2048;
    }

    /* renamed from: m */
    public int mo13449m() {
        return 2048;
    }

    /* renamed from: n */
    public Priority mo13450n() {
        return this.f9736l;
    }

    /* renamed from: o */
    public boolean mo13451o() {
        return this.f9730f;
    }

    /* renamed from: p */
    public je5 mo13452p() {
        return this.f9743s;
    }

    /* renamed from: q */
    public te5 mo13453q() {
        return null;
    }

    /* renamed from: r */
    public Boolean mo13454r() {
        return this.f9744t;
    }

    /* renamed from: s */
    public xh5 mo13455s() {
        return this.f9734j;
    }

    /* renamed from: t */
    public synchronized File mo13456t() {
        if (this.f9729e == null) {
            this.f9729e = new File(this.f9727c.getPath());
        }
        return this.f9729e;
    }

    public String toString() {
        return hf4.m18862c(this).mo21158b("uri", this.f9727c).mo21158b("cacheChoice", this.f9726b).mo21158b("decodeOptions", this.f9733i).mo21158b("postprocessor", this.f9742r).mo21158b("priority", this.f9736l).mo21158b("resizeOptions", (Object) null).mo21158b("rotationOptions", this.f9734j).mo21158b("bytesRange", this.f9735k).mo21158b("resizingAllowedOverride", this.f9744t).mo21159c("progressiveRenderingEnabled", this.f9730f).mo21159c("localThumbnailPreviewsEnabled", this.f9731g).mo21159c("loadThumbnailOnly", this.f9732h).mo21158b("lowestPermittedRequestLevel", this.f9737m).mo21157a("cachesDisabled", this.f9738n).mo21159c("isDiskCacheEnabled", this.f9739o).mo21159c("isMemoryCacheEnabled", this.f9740p).mo21158b("decodePrefetches", this.f9741q).mo21157a("delayMs", this.f9745u).toString();
    }

    /* renamed from: u */
    public Uri mo13458u() {
        return this.f9727c;
    }

    /* renamed from: v */
    public int mo13459v() {
        return this.f9728d;
    }

    /* renamed from: x */
    public boolean mo13460x(int i) {
        if ((i & mo13439e()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public Boolean mo13461y() {
        return this.f9741q;
    }
}
