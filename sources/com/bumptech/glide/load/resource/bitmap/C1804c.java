package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C1797a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
/* compiled from: StreamBitmapDecoder */
public class C1804c implements gf5<InputStream, Bitmap> {

    /* renamed from: a */
    public final C1797a f8970a;

    /* renamed from: b */
    public final C2982oq f8971b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    /* compiled from: StreamBitmapDecoder */
    public static class C1805a implements C1797a.C1799b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f8972a;

        /* renamed from: b */
        public final mu1 f8973b;

        public C1805a(RecyclableBufferedInputStream recyclableBufferedInputStream, mu1 mu1) {
            this.f8972a = recyclableBufferedInputStream;
            this.f8973b = mu1;
        }

        /* renamed from: a */
        public void mo12626a() {
            this.f8972a.mo12596b();
        }

        /* renamed from: b */
        public void mo12627b(t20 t20, Bitmap bitmap) throws IOException {
            IOException a = this.f8973b.mo23394a();
            if (a != null) {
                if (bitmap != null) {
                    t20.mo25118c(bitmap);
                }
                throw a;
            }
        }
    }

    public C1804c(C1797a aVar, C2982oq oqVar) {
        this.f8970a = aVar;
        this.f8971b = oqVar;
    }

    /* renamed from: c */
    public bf5<Bitmap> mo415b(InputStream inputStream, int i, int i2, xi4 xi4) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            z = true;
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f8971b);
        }
        mu1 b = mu1.m22646b(recyclableBufferedInputStream);
        try {
            return this.f8970a.mo12619f(new eo3(b), i, i2, xi4, new C1805a(recyclableBufferedInputStream, b));
        } finally {
            b.mo23396c();
            if (z) {
                recyclableBufferedInputStream.mo12597c();
            }
        }
    }

    /* renamed from: d */
    public boolean mo414a(InputStream inputStream, xi4 xi4) {
        return this.f8970a.mo12623p(inputStream);
    }
}
