package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p000.pi4;

public class VideoDecoder<T> implements gf5<T, Bitmap> {

    /* renamed from: d */
    public static final pi4<Long> f8937d = pi4.m24959a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1789a());

    /* renamed from: e */
    public static final pi4<Integer> f8938e = pi4.m24959a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1790b());

    /* renamed from: f */
    public static final C1794e f8939f = new C1794e();

    /* renamed from: a */
    public final C1795f<T> f8940a;

    /* renamed from: b */
    public final t20 f8941b;

    /* renamed from: c */
    public final C1794e f8942c;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C1789a implements pi4.C3073b<Long> {

        /* renamed from: a */
        public final ByteBuffer f8943a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void mo12605a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f8943a) {
                this.f8943a.position(0);
                messageDigest.update(this.f8943a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C1790b implements pi4.C3073b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f8944a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void mo12605a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f8944a) {
                    this.f8944a.position(0);
                    messageDigest.update(this.f8944a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C1791c implements C1795f<AssetFileDescriptor> {
        public C1791c() {
        }

        public /* synthetic */ C1791c(C1789a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo12608a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C1792d implements C1795f<ByteBuffer> {

        /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d$a */
        public class C1793a extends MediaDataSource {

            /* renamed from: a */
            public final /* synthetic */ ByteBuffer f8945a;

            public C1793a(ByteBuffer byteBuffer) {
                this.f8945a = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.f8945a.limit();
            }

            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f8945a.limit())) {
                    return -1;
                }
                this.f8945a.position((int) j);
                int min = Math.min(i2, this.f8945a.remaining());
                this.f8945a.get(bArr, i, min);
                return min;
            }
        }

        /* renamed from: b */
        public void mo12608a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C1793a(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public static class C1794e {
        /* renamed from: a */
        public MediaMetadataRetriever mo12614a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public interface C1795f<T> {
        /* renamed from: a */
        void mo12608a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C1796g implements C1795f<ParcelFileDescriptor> {
        /* renamed from: b */
        public void mo12608a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(t20 t20, C1795f<T> fVar) {
        this(t20, fVar, f8939f);
    }

    /* renamed from: c */
    public static gf5<AssetFileDescriptor, Bitmap> m12517c(t20 t20) {
        return new VideoDecoder(t20, new C1791c((C1789a) null));
    }

    /* renamed from: d */
    public static gf5<ByteBuffer, Bitmap> m12518d(t20 t20) {
        return new VideoDecoder(t20, new C1792d());
    }

    /* renamed from: e */
    public static Bitmap m12519e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f8926f) {
            bitmap = null;
        } else {
            bitmap = m12521g(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        }
        if (bitmap == null) {
            bitmap = m12520f(mediaMetadataRetriever, j, i);
        }
        if (bitmap != null) {
            return bitmap;
        }
        throw new VideoDecoderException();
    }

    /* renamed from: f */
    public static Bitmap m12520f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: g */
    public static Bitmap m12521g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = downsampleStrategy.mo12593b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static gf5<ParcelFileDescriptor, Bitmap> m12522h(t20 t20) {
        return new VideoDecoder(t20, new C1796g());
    }

    /* renamed from: a */
    public boolean mo414a(T t, xi4 xi4) {
        return true;
    }

    /* renamed from: b */
    public bf5<Bitmap> mo415b(T t, int i, int i2, xi4 xi4) throws IOException {
        int i3;
        long longValue = ((Long) xi4.mo27760c(f8937d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) xi4.mo27760c(f8938e);
            if (num == null) {
                num = 2;
            }
            DownsampleStrategy downsampleStrategy = (DownsampleStrategy) xi4.mo27760c(DownsampleStrategy.f8928h);
            if (downsampleStrategy == null) {
                downsampleStrategy = DownsampleStrategy.f8927g;
            }
            DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
            MediaMetadataRetriever a = this.f8942c.mo12614a();
            try {
                this.f8940a.mo12608a(a, t);
                Bitmap e = m12519e(a, longValue, num.intValue(), i, i2, downsampleStrategy2);
                if (i3 < 29) {
                    a.release();
                }
                return y20.m30373e(e, this.f8941b);
            } finally {
                if (Build.VERSION.SDK_INT >= 29) {
                    a.close();
                } else {
                    a.release();
                }
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public VideoDecoder(t20 t20, C1795f<T> fVar, C1794e eVar) {
        this.f8941b = t20;
        this.f8940a = fVar;
        this.f8942c = eVar;
    }
}
