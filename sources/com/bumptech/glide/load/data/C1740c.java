package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C1735a;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.c */
/* compiled from: InputStreamRewinder */
public final class C1740c implements C1735a<InputStream> {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f8732a;

    /* renamed from: com.bumptech.glide.load.data.c$a */
    /* compiled from: InputStreamRewinder */
    public static final class C1741a implements C1735a.C1736a<InputStream> {

        /* renamed from: a */
        public final C2982oq f8733a;

        public C1741a(C2982oq oqVar) {
            this.f8733a = oqVar;
        }

        /* renamed from: a */
        public Class<InputStream> mo12401a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public C1735a<InputStream> mo12402b(InputStream inputStream) {
            return new C1740c(inputStream, this.f8733a);
        }
    }

    public C1740c(InputStream inputStream, C2982oq oqVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, oqVar);
        this.f8732a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* renamed from: b */
    public void mo12398b() {
        this.f8732a.mo12597c();
    }

    /* renamed from: c */
    public void mo12406c() {
        this.f8732a.mo12596b();
    }

    /* renamed from: d */
    public InputStream mo12397a() throws IOException {
        this.f8732a.reset();
        return this.f8732a;
    }
}
