package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.ek7;

@ii1
public class WebpBitmapFactoryImpl implements ek7 {

    /* renamed from: a */
    public static final boolean f9785a = true;

    /* renamed from: b */
    public static ek7.C2235a f9786b;

    /* renamed from: c */
    public static a20 f9787c;

    @ii1
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        if (!f9785a || options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) {
            return f9787c.mo11a(i, i2, Bitmap.Config.ARGB_8888);
        }
        return options.inBitmap;
    }

    /* renamed from: d */
    public static byte[] m13748d(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m13749e(String str) {
        ek7.C2235a aVar = f9786b;
        if (aVar != null) {
            aVar.mo19289a(str, "decoding_failure");
        }
    }

    /* renamed from: f */
    public static void m13750f(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null && options != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i2);
                }
            } else if (f9785a && options.inBitmap != null) {
                bitmap.setDensity(160);
            }
        }
    }

    /* renamed from: g */
    public static void m13751g(Bitmap bitmap, BitmapFactory.Options options) {
        m13750f(bitmap, options);
        if (options != null) {
            options.outMimeType = "image/webp";
        }
    }

    @ii1
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        if (options == null || (bArr = options.inTempStorage) == null) {
            return new byte[8192];
        }
        return bArr;
    }

    @ii1
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        int i4 = options.inScreenDensity;
        if (i2 == 0 || i3 == 0 || i2 == i4) {
            return f;
        }
        return ((float) i3) / ((float) i2);
    }

    /* renamed from: h */
    public static InputStream m13752h(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            return new BufferedInputStream(inputStream, 20);
        }
        return inputStream;
    }

    @ii1
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        l96.m21339a();
        if (!fk7.f11898a || !fk7.m17058h(bArr, i, i2)) {
            bitmap = originalDecodeByteArray(bArr, i, i2, options);
            if (bitmap == null) {
                m13749e("webp_direct_decode_array_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                m13749e("webp_direct_decode_array");
            }
            m13751g(bitmap, options);
        }
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        throw r3;
     */
    @p000.ii1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeFile(java.lang.String r2, android.graphics.BitmapFactory.Options r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001a }
            android.graphics.Bitmap r0 = hookDecodeStream(r1, r0, r3)     // Catch:{ all -> 0x000e }
            r1.close()     // Catch:{ Exception -> 0x001a }
            goto L_0x001a
        L_0x000e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x0015 }
            goto L_0x0019
        L_0x0015:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch:{ Exception -> 0x001a }
        L_0x0019:
            throw r3     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @ii1
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        l96.m21339a();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream h = m13752h(new FileInputStream(fileDescriptor));
            try {
                byte[] d = m13748d(h, options);
                if (!fk7.f11898a || d == null || !fk7.m17058h(d, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = originalDecodeFileDescriptor(fileDescriptor, rect, options);
                    if (bitmap == null) {
                        m13749e("webp_direct_decode_fd_failed_on_no_webp");
                    }
                } else {
                    bitmap = nativeDecodeStream(h, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    if (bitmap == null) {
                        m13749e("webp_direct_decode_fd");
                    }
                    setPaddingDefaultValues(rect);
                    m13751g(bitmap, options);
                }
                try {
                    h.close();
                    return bitmap;
                } catch (Throwable unused) {
                    return bitmap;
                }
            } catch (Throwable unused2) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r3 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        throw r0;
     */
    @p000.ii1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResource(android.content.res.Resources r2, int r3, android.graphics.BitmapFactory.Options r4) {
        /*
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 0
            java.io.InputStream r3 = r2.openRawResource(r3, r0)     // Catch:{ Exception -> 0x0022 }
            android.graphics.Bitmap r1 = hookDecodeResourceStream(r2, r0, r3, r1, r4)     // Catch:{ all -> 0x0014 }
            if (r3 == 0) goto L_0x0022
            r3.close()     // Catch:{ Exception -> 0x0022 }
            goto L_0x0022
        L_0x0014:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            if (r3 == 0) goto L_0x0021
            r3.close()     // Catch:{ all -> 0x001d }
            goto L_0x0021
        L_0x001d:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch:{ Exception -> 0x0022 }
        L_0x0021:
            throw r0     // Catch:{ Exception -> 0x0022 }
        L_0x0022:
            boolean r2 = f9785a
            if (r2 == 0) goto L_0x0037
            if (r1 != 0) goto L_0x0037
            if (r4 == 0) goto L_0x0037
            android.graphics.Bitmap r2 = r4.inBitmap
            if (r2 != 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Problem decoding into existing bitmap"
            r2.<init>(r3)
            throw r2
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    @ii1
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @ii1
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap bitmap;
        l96.m21339a();
        InputStream h = m13752h(inputStream);
        byte[] d = m13748d(h, options);
        if (!fk7.f11898a || d == null || !fk7.m17058h(d, 0, 20)) {
            bitmap = originalDecodeStream(h, rect, options);
            if (bitmap == null) {
                m13749e("webp_direct_decode_stream_failed_on_no_webp");
            }
        } else {
            bitmap = nativeDecodeStream(h, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (bitmap == null) {
                m13749e("webp_direct_decode_stream");
            }
            m13751g(bitmap, options);
            setPaddingDefaultValues(rect);
        }
        return bitmap;
    }

    @ii1
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    @ii1
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    @ii1
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @ii1
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @ii1
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @ii1
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @ii1
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @ii1
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @ii1
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @ii1
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @ii1
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @ii1
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @ii1
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    /* renamed from: a */
    public void mo13508a(a20 a20) {
        f9787c = a20;
    }

    /* renamed from: b */
    public void mo13509b(ek7.C2235a aVar) {
        f9786b = aVar;
    }

    /* renamed from: c */
    public Bitmap mo13510c(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, rect, options);
    }

    @ii1
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @ii1
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @ii1
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @ii1
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @ii1
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @ii1
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, (BitmapFactory.Options) null);
    }

    @ii1
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, (BitmapFactory.Options) null);
    }

    @ii1
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, (BitmapFactory.Options) null);
    }

    @ii1
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, (Rect) null, (BitmapFactory.Options) null);
    }

    @ii1
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, (Rect) null, (BitmapFactory.Options) null);
    }
}
