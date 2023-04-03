package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.C1800b;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* compiled from: Downsampler */
public final class C1797a {

    /* renamed from: f */
    public static final pi4<DecodeFormat> f8947f = pi4.m24962f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* renamed from: g */
    public static final pi4<PreferredColorSpace> f8948g = pi4.m24961e("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated

    /* renamed from: h */
    public static final pi4<DownsampleStrategy> f8949h = DownsampleStrategy.f8928h;

    /* renamed from: i */
    public static final pi4<Boolean> f8950i;

    /* renamed from: j */
    public static final pi4<Boolean> f8951j;

    /* renamed from: k */
    public static final Set<String> f8952k = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));

    /* renamed from: l */
    public static final C1799b f8953l = new C1798a();

    /* renamed from: m */
    public static final Set<ImageHeaderParser.ImageType> f8954m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: n */
    public static final Queue<BitmapFactory.Options> f8955n = p67.m24678f(0);

    /* renamed from: a */
    public final t20 f8956a;

    /* renamed from: b */
    public final DisplayMetrics f8957b;

    /* renamed from: c */
    public final C2982oq f8958c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f8959d;

    /* renamed from: e */
    public final el2 f8960e = el2.m16178b();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    /* compiled from: Downsampler */
    public class C1798a implements C1799b {
        /* renamed from: a */
        public void mo12626a() {
        }

        /* renamed from: b */
        public void mo12627b(t20 t20, Bitmap bitmap) {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    /* compiled from: Downsampler */
    public interface C1799b {
        /* renamed from: a */
        void mo12626a();

        /* renamed from: b */
        void mo12627b(t20 t20, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        f8950i = pi4.m24962f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f8951j = pi4.m24962f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C1797a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, t20 t20, C2982oq oqVar) {
        this.f8959d = list;
        this.f8957b = (DisplayMetrics) zt4.m31500d(displayMetrics);
        this.f8956a = (t20) zt4.m31500d(t20);
        this.f8958c = (C2982oq) zt4.m31500d(oqVar);
    }

    /* renamed from: a */
    public static int m12537a(double d) {
        int l = m12542l(d);
        int x = m12551x(((double) l) * d);
        return m12551x((d / ((double) (((float) x) / ((float) l)))) * ((double) x));
    }

    /* renamed from: c */
    public static void m12538c(ImageHeaderParser.ImageType imageType, C1800b bVar, C1799b bVar2, t20 t20, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        double d;
        ImageHeaderParser.ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i12 = i2;
        int i13 = i3;
        int i14 = i4;
        int i15 = i5;
        BitmapFactory.Options options2 = options;
        if (i12 <= 0 || i13 <= 0) {
            String str = "x";
            if (Log.isLoggable("Downsampler", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to determine dimensions for: ");
                sb.append(imageType2);
                sb.append(" with target [");
                sb.append(i14);
                sb.append(str);
                sb.append(i15);
                sb.append("]");
                return;
            }
            return;
        }
        if (m12545r(i)) {
            i6 = i12;
            i7 = i13;
        } else {
            i7 = i12;
            i6 = i13;
        }
        float b = downsampleStrategy2.mo12593b(i7, i6, i14, i15);
        if (b > Utils.FLOAT_EPSILON) {
            DownsampleStrategy.SampleSizeRounding a = downsampleStrategy2.mo12592a(i7, i6, i14, i15);
            if (a != null) {
                float f = (float) i7;
                float f2 = (float) i6;
                int x = i7 / m12551x((double) (b * f));
                int x2 = i6 / m12551x((double) (b * f2));
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                if (a == sampleSizeRounding) {
                    i8 = Math.max(x, x2);
                } else {
                    i8 = Math.min(x, x2);
                }
                int i16 = Build.VERSION.SDK_INT;
                String str2 = "x";
                String str3 = "Downsampler";
                if (i16 > 23 || !f8952k.contains(options2.outMimeType)) {
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == sampleSizeRounding && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    i9 = max;
                } else {
                    i9 = 1;
                }
                options2.inSampleSize = i9;
                if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                    float min = (float) Math.min(i9, 8);
                    i10 = (int) Math.ceil((double) (f / min));
                    i11 = (int) Math.ceil((double) (f2 / min));
                    int i17 = i9 / 8;
                    if (i17 > 0) {
                        i10 /= i17;
                        i11 /= i17;
                    }
                } else {
                    if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) i9;
                        i10 = (int) Math.floor((double) (f / f3));
                        d = Math.floor((double) (f2 / f3));
                    } else if (imageType.isWebp()) {
                        if (i16 >= 24) {
                            float f4 = (float) i9;
                            i10 = Math.round(f / f4);
                            i11 = Math.round(f2 / f4);
                        } else {
                            float f5 = (float) i9;
                            i10 = (int) Math.floor((double) (f / f5));
                            d = Math.floor((double) (f2 / f5));
                        }
                    } else if (i7 % i9 == 0 && i6 % i9 == 0) {
                        i10 = i7 / i9;
                        i11 = i6 / i9;
                    } else {
                        int[] m = m12543m(bVar, options2, bVar2, t20);
                        i10 = m[0];
                        i11 = m[1];
                    }
                    i11 = (int) d;
                }
                double b2 = (double) downsampleStrategy2.mo12593b(i10, i11, i14, i15);
                options2.inTargetDensity = m12537a(b2);
                options2.inDensity = m12542l(b2);
                if (m12546s(options)) {
                    options2.inScaled = true;
                } else {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                }
                if (Log.isLoggable(str3, 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calculate scaling, source: [");
                    sb2.append(i2);
                    String str4 = str2;
                    sb2.append(str4);
                    sb2.append(i3);
                    sb2.append("], degreesToRotate: ");
                    sb2.append(i);
                    sb2.append(", target: [");
                    sb2.append(i14);
                    sb2.append(str4);
                    sb2.append(i15);
                    sb2.append("], power of two scaled: [");
                    sb2.append(i10);
                    sb2.append(str4);
                    sb2.append(i11);
                    sb2.append("], exact scale factor: ");
                    sb2.append(b);
                    sb2.append(", power of 2 sample size: ");
                    sb2.append(i9);
                    sb2.append(", adjusted scale factor: ");
                    sb2.append(b2);
                    sb2.append(", target density: ");
                    sb2.append(options2.inTargetDensity);
                    sb2.append(", density: ");
                    sb2.append(options2.inDensity);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i18 = i13;
        String str5 = "x";
        int i19 = i12;
        throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + downsampleStrategy2 + ", source: [" + i19 + str5 + i18 + "], target: [" + i14 + str5 + i15 + "]");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m12539i(com.bumptech.glide.load.resource.bitmap.C1800b r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C1797a.C1799b r6, p000.t20 r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.mo12626a()
            r4.mo12629b()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = p000.ow6.m24313i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo12628a(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = p000.ow6.m24313i()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0049
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = m12548u(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0048
            r7.mo25118c(r1)     // Catch:{ IOException -> 0x0047 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0047 }
            android.graphics.Bitmap r4 = m12539i(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0047 }
            java.util.concurrent.locks.Lock r5 = p000.ow6.m24313i()
            r5.unlock()
            return r4
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0049:
            java.util.concurrent.locks.Lock r5 = p000.ow6.m24313i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C1797a.m12539i(com.bumptech.glide.load.resource.bitmap.b, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.a$b, t20):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: j */
    public static String m12540j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: k */
    public static synchronized BitmapFactory.Options m12541k() {
        BitmapFactory.Options poll;
        synchronized (C1797a.class) {
            Queue<BitmapFactory.Options> queue = f8955n;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m12550w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    public static int m12542l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    public static int[] m12543m(C1800b bVar, BitmapFactory.Options options, C1799b bVar2, t20 t20) throws IOException {
        options.inJustDecodeBounds = true;
        m12539i(bVar, options, bVar2, t20);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    public static String m12544n(BitmapFactory.Options options) {
        return m12540j(options.inBitmap);
    }

    /* renamed from: r */
    public static boolean m12545r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    public static boolean m12546s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        if (i2 <= 0 || (i = options.inDensity) <= 0 || i2 == i) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static void m12547t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m12540j(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m12544n(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(ok3.m23849a(j));
    }

    /* renamed from: u */
    public static IOException m12548u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m12544n(options), illegalArgumentException);
    }

    /* renamed from: v */
    public static void m12549v(BitmapFactory.Options options) {
        m12550w(options);
        Queue<BitmapFactory.Options> queue = f8955n;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    public static void m12550w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    public static int m12551x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    public static void m12552y(BitmapFactory.Options options, t20 t20, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = t20.mo26026e(i, i2, config);
    }

    /* renamed from: b */
    public final void mo12616b(C1800b bVar, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        Bitmap.Config config;
        if (!this.f8960e.mo19298i(i, i2, options, z, z2)) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                boolean z3 = false;
                try {
                    z3 = bVar.mo12631d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable("Downsampler", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine whether the image has alpha or not from header, format ");
                        sb.append(decodeFormat);
                    }
                }
                if (z3) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    /* renamed from: d */
    public bf5<Bitmap> mo12617d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, xi4 xi4) throws IOException {
        return mo12618e(new C1800b.C1803c(parcelFileDescriptor, this.f8959d, this.f8958c), i, i2, xi4, f8953l);
    }

    /* renamed from: e */
    public final bf5<Bitmap> mo12618e(C1800b bVar, int i, int i2, xi4 xi4, C1799b bVar2) throws IOException {
        boolean z;
        xi4 xi42 = xi4;
        byte[] bArr = (byte[]) this.f8958c.mo24041c(65536, byte[].class);
        BitmapFactory.Options k = m12541k();
        k.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) xi42.mo27760c(f8947f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) xi42.mo27760c(f8948g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) xi42.mo27760c(DownsampleStrategy.f8928h);
        boolean booleanValue = ((Boolean) xi42.mo27760c(f8950i)).booleanValue();
        pi4 pi4 = f8951j;
        if (xi42.mo27760c(pi4) == null || !((Boolean) xi42.mo27760c(pi4)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return y20.m30373e(mo12621h(bVar, k, downsampleStrategy, decodeFormat, preferredColorSpace, z, i, i2, booleanValue, bVar2), this.f8956a);
        } finally {
            m12549v(k);
            this.f8958c.put(bArr);
        }
    }

    /* renamed from: f */
    public bf5<Bitmap> mo12619f(InputStream inputStream, int i, int i2, xi4 xi4, C1799b bVar) throws IOException {
        return mo12618e(new C1800b.C1802b(inputStream, this.f8959d, this.f8958c), i, i2, xi4, bVar);
    }

    /* renamed from: g */
    public bf5<Bitmap> mo12620g(ByteBuffer byteBuffer, int i, int i2, xi4 xi4) throws IOException {
        return mo12618e(new C1800b.C1801a(byteBuffer, this.f8959d, this.f8958c), i, i2, xi4, f8953l);
    }

    /* renamed from: h */
    public final Bitmap mo12621h(C1800b bVar, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, C1799b bVar2) throws IOException {
        boolean z3;
        int i3;
        int i4;
        int i5;
        String str;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        int i6;
        int i7;
        float f;
        BitmapFactory.Options options2 = options;
        PreferredColorSpace preferredColorSpace2 = preferredColorSpace;
        C1799b bVar3 = bVar2;
        long b = ok3.m23850b();
        int[] m = m12543m(bVar, options2, bVar3, this.f8956a);
        boolean z4 = false;
        int i8 = m[0];
        int i9 = m[1];
        String str2 = options2.outMimeType;
        if (i8 == -1 || i9 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int c = bVar.mo12630c();
        int j = ow6.m24314j(c);
        boolean m2 = ow6.m24317m(c);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            if (m12545r(j)) {
                i3 = i9;
            } else {
                i3 = i8;
            }
        } else {
            i4 = i2;
            i3 = i10;
        }
        if (i4 != Integer.MIN_VALUE) {
            i5 = i4;
        } else if (m12545r(j)) {
            i5 = i8;
        } else {
            i5 = i9;
        }
        ImageHeaderParser.ImageType d = bVar.mo12631d();
        ImageHeaderParser.ImageType imageType = d;
        int i11 = c;
        m12538c(d, bVar, bVar2, this.f8956a, downsampleStrategy, j, i8, i9, i3, i5, options);
        String str3 = str2;
        int i12 = i9;
        int i13 = i8;
        C1799b bVar4 = bVar3;
        PreferredColorSpace preferredColorSpace3 = preferredColorSpace2;
        BitmapFactory.Options options3 = options2;
        mo12616b(bVar, decodeFormat, z3, m2, options, i3, i5);
        int i14 = Build.VERSION.SDK_INT;
        int i15 = options3.inSampleSize;
        if (mo12625z(imageType)) {
            if (i13 < 0 || i12 < 0 || !z2) {
                if (m12546s(options)) {
                    f = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f = 1.0f;
                }
                int i16 = options3.inSampleSize;
                float f2 = (float) i16;
                i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                i6 = Math.round(((float) ((int) Math.ceil((double) (((float) i12) / f2)))) * f);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(i7);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] for source [");
                    sb.append(i13);
                    sb.append("x");
                    sb.append(i12);
                    sb.append("], sampleSize: ");
                    sb.append(i16);
                    sb.append(", targetDensity: ");
                    sb.append(options3.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options3.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                }
            } else {
                str = "Downsampler";
                i7 = i3;
                i6 = i5;
            }
            if (i7 > 0 && i6 > 0) {
                m12552y(options3, this.f8956a, i7, i6);
            }
        } else {
            str = "Downsampler";
        }
        if (preferredColorSpace3 != null) {
            if (i14 >= 28) {
                if (preferredColorSpace3 == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options3.outColorSpace) != null && colorSpace.isWideGamut()) {
                    z4 = true;
                }
                if (z4) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options3.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i14 >= 26) {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap i17 = m12539i(bVar, options3, bVar4, this.f8956a);
        bVar4.mo12627b(this.f8956a, i17);
        if (Log.isLoggable(str, 2)) {
            m12547t(i13, i12, str3, options, i17, i, i2, b);
        }
        Bitmap bitmap = null;
        if (i17 != null) {
            i17.setDensity(this.f8957b.densityDpi);
            bitmap = ow6.m24318n(this.f8956a, i17, i11);
            if (!i17.equals(bitmap)) {
                this.f8956a.mo25118c(i17);
            }
        }
        return bitmap;
    }

    /* renamed from: o */
    public boolean mo12622o(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m12284c();
    }

    /* renamed from: p */
    public boolean mo12623p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo12624q(ByteBuffer byteBuffer) {
        return true;
    }

    /* renamed from: z */
    public final boolean mo12625z(ImageHeaderParser.ImageType imageType) {
        return true;
    }
}
