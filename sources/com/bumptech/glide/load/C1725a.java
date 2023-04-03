package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.a */
/* compiled from: ImageHeaderParserUtils */
public final class C1725a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* compiled from: ImageHeaderParserUtils */
    public class C1726a implements C1733h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f8717a;

        public C1726a(InputStream inputStream) {
            this.f8717a = inputStream;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo12395a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo12391c(this.f8717a);
            } finally {
                this.f8717a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* compiled from: ImageHeaderParserUtils */
    public class C1727b implements C1733h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f8718a;

        public C1727b(ByteBuffer byteBuffer) {
            this.f8718a = byteBuffer;
        }

        /* renamed from: a */
        public ImageHeaderParser.ImageType mo12395a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo12390b(this.f8718a);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* compiled from: ImageHeaderParserUtils */
    public class C1728c implements C1733h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f8719a;

        /* renamed from: b */
        public final /* synthetic */ C2982oq f8720b;

        public C1728c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C2982oq oqVar) {
            this.f8719a = parcelFileDescriptorRewinder;
            this.f8720b = oqVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType mo12395a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f8719a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.mo12397a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                oq r3 = r4.f8720b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.mo12391c(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f8719a
                r0.mo12397a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f8719a
                r0.mo12397a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1725a.C1728c.mo12395a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* compiled from: ImageHeaderParserUtils */
    public class C1729d implements C1732g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f8721a;

        /* renamed from: b */
        public final /* synthetic */ C2982oq f8722b;

        public C1729d(ByteBuffer byteBuffer, C2982oq oqVar) {
            this.f8721a = byteBuffer;
            this.f8722b = oqVar;
        }

        /* renamed from: a */
        public int mo12396a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.mo12392d(this.f8721a, this.f8722b);
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* compiled from: ImageHeaderParserUtils */
    public class C1730e implements C1732g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f8723a;

        /* renamed from: b */
        public final /* synthetic */ C2982oq f8724b;

        public C1730e(InputStream inputStream, C2982oq oqVar) {
            this.f8723a = inputStream;
            this.f8724b = oqVar;
        }

        /* renamed from: a */
        public int mo12396a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo12389a(this.f8723a, this.f8724b);
            } finally {
                this.f8723a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* compiled from: ImageHeaderParserUtils */
    public class C1731f implements C1732g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f8725a;

        /* renamed from: b */
        public final /* synthetic */ C2982oq f8726b;

        public C1731f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C2982oq oqVar) {
            this.f8725a = parcelFileDescriptorRewinder;
            this.f8726b = oqVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo12396a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream r1 = new com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f8725a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.mo12397a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                oq r3 = r4.f8726b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                oq r0 = r4.f8726b     // Catch:{ all -> 0x0026 }
                int r5 = r5.mo12389a(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f8725a
                r0.mo12397a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f8725a
                r0.mo12397a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.C1725a.C1731f.mo12396a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    /* compiled from: ImageHeaderParserUtils */
    public interface C1732g {
        /* renamed from: a */
        int mo12396a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    /* compiled from: ImageHeaderParserUtils */
    public interface C1733h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo12395a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: a */
    public static int m12268a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C2982oq oqVar) throws IOException {
        return m12271d(list, new C1731f(parcelFileDescriptorRewinder, oqVar));
    }

    /* renamed from: b */
    public static int m12269b(List<ImageHeaderParser> list, InputStream inputStream, C2982oq oqVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, oqVar);
        }
        inputStream.mark(5242880);
        return m12271d(list, new C1730e(inputStream, oqVar));
    }

    /* renamed from: c */
    public static int m12270c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, C2982oq oqVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m12271d(list, new C1729d(byteBuffer, oqVar));
    }

    /* renamed from: d */
    public static int m12271d(List<ImageHeaderParser> list, C1732g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = gVar.mo12396a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m12272e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, C2982oq oqVar) throws IOException {
        return m12275h(list, new C1728c(parcelFileDescriptorRewinder, oqVar));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m12273f(List<ImageHeaderParser> list, InputStream inputStream, C2982oq oqVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, oqVar);
        }
        inputStream.mark(5242880);
        return m12275h(list, new C1726a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m12274g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m12275h(list, new C1727b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m12275h(List<ImageHeaderParser> list, C1733h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = hVar.mo12395a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
