package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C1725a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C1740c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.bitmap.b */
/* compiled from: ImageReader */
public interface C1800b {

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$a */
    /* compiled from: ImageReader */
    public static final class C1801a implements C1800b {

        /* renamed from: a */
        public final ByteBuffer f8961a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f8962b;

        /* renamed from: c */
        public final C2982oq f8963c;

        public C1801a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, C2982oq oqVar) {
            this.f8961a = byteBuffer;
            this.f8962b = list;
            this.f8963c = oqVar;
        }

        /* renamed from: a */
        public Bitmap mo12628a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(mo12632e(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo12629b() {
        }

        /* renamed from: c */
        public int mo12630c() throws IOException {
            return C1725a.m12270c(this.f8962b, s60.m26656d(this.f8961a), this.f8963c);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo12631d() throws IOException {
            return C1725a.m12274g(this.f8962b, s60.m26656d(this.f8961a));
        }

        /* renamed from: e */
        public final InputStream mo12632e() {
            return s60.m26659g(s60.m26656d(this.f8961a));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$b */
    /* compiled from: ImageReader */
    public static final class C1802b implements C1800b {

        /* renamed from: a */
        public final C1740c f8964a;

        /* renamed from: b */
        public final C2982oq f8965b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f8966c;

        public C1802b(InputStream inputStream, List<ImageHeaderParser> list, C2982oq oqVar) {
            this.f8965b = (C2982oq) zt4.m31500d(oqVar);
            this.f8966c = (List) zt4.m31500d(list);
            this.f8964a = new C1740c(inputStream, oqVar);
        }

        /* renamed from: a */
        public Bitmap mo12628a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f8964a.mo12397a(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo12629b() {
            this.f8964a.mo12406c();
        }

        /* renamed from: c */
        public int mo12630c() throws IOException {
            return C1725a.m12269b(this.f8966c, this.f8964a.mo12397a(), this.f8965b);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo12631d() throws IOException {
            return C1725a.m12273f(this.f8966c, this.f8964a.mo12397a(), this.f8965b);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.b$c */
    /* compiled from: ImageReader */
    public static final class C1803c implements C1800b {

        /* renamed from: a */
        public final C2982oq f8967a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f8968b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f8969c;

        public C1803c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, C2982oq oqVar) {
            this.f8967a = (C2982oq) zt4.m31500d(oqVar);
            this.f8968b = (List) zt4.m31500d(list);
            this.f8969c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        /* renamed from: a */
        public Bitmap mo12628a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f8969c.mo12397a().getFileDescriptor(), (Rect) null, options);
        }

        /* renamed from: b */
        public void mo12629b() {
        }

        /* renamed from: c */
        public int mo12630c() throws IOException {
            return C1725a.m12268a(this.f8968b, this.f8969c, this.f8967a);
        }

        /* renamed from: d */
        public ImageHeaderParser.ImageType mo12631d() throws IOException {
            return C1725a.m12272e(this.f8968b, this.f8969c, this.f8967a);
        }
    }

    /* renamed from: a */
    Bitmap mo12628a(BitmapFactory.Options options) throws IOException;

    /* renamed from: b */
    void mo12629b();

    /* renamed from: c */
    int mo12630c() throws IOException;

    /* renamed from: d */
    ImageHeaderParser.ImageType mo12631d() throws IOException;
}
