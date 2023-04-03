package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;

@TargetApi(11)
/* renamed from: com.facebook.imagepipeline.platform.a */
/* compiled from: DefaultDecoder */
public abstract class C1948a implements zo4 {

    /* renamed from: d */
    public static final Class<?> f9647d = C1948a.class;

    /* renamed from: e */
    public static final byte[] f9648e = {-1, -39};

    /* renamed from: a */
    public final s20 f9649a;

    /* renamed from: b */
    public final PreverificationHelper f9650b;

    /* renamed from: c */
    public final ct4<ByteBuffer> f9651c;

    public C1948a(s20 s20, int i, ct4 ct4) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.f9650b = preverificationHelper;
        this.f9649a = s20;
        this.f9651c = ct4;
        for (int i2 = 0; i2 < i; i2++) {
            this.f9651c.mo11138a(ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE));
        }
    }

    /* renamed from: e */
    public static BitmapFactory.Options m13543e(gp1 gp1, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = gp1.mo20755p();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(gp1.mo20752l(), (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    /* renamed from: a */
    public nh0<Bitmap> mo13372a(gp1 gp1, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        boolean z;
        BitmapFactory.Options e = m13543e(gp1, config);
        if (e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            return mo13389c((InputStream) au4.m10792g(gp1.mo20752l()), e, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return mo13372a(gp1, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    /* renamed from: b */
    public nh0<Bitmap> mo13373b(gp1 gp1, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean z;
        boolean y = gp1.mo20760y(i);
        BitmapFactory.Options e = m13543e(gp1, config);
        nl6 l = gp1.mo20752l();
        au4.m10792g(l);
        if (gp1.mo20756q() > i) {
            l = new gh3(l, i);
        }
        if (!y) {
            l = new nl6(l, f9648e);
        }
        if (e.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z = true;
        } else {
            z = false;
        }
        try {
            nh0<Bitmap> c = mo13389c(l, e, rect, colorSpace);
            try {
                l.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return c;
        } catch (RuntimeException e3) {
            if (z) {
                nh0<Bitmap> b = mo13373b(gp1, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
                try {
                    l.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return b;
            }
            throw e3;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        p000.oy1.m24419f(f9647d, "Could not decode region %s, decoding full bitmap instead.", r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        if (r0 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0089 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x00f3 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca, all -> 0x00c8, IOException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5 A[Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca, all -> 0x00c8, IOException -> 0x00f3 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.nh0<android.graphics.Bitmap> mo13389c(java.io.InputStream r10, android.graphics.BitmapFactory.Options r11, android.graphics.Rect r12, android.graphics.ColorSpace r13) {
        /*
            r9 = this;
            p000.au4.m10792g(r10)
            int r0 = r11.outWidth
            int r1 = r11.outHeight
            if (r12 == 0) goto L_0x0017
            int r0 = r12.width()
            int r1 = r11.inSampleSize
            int r0 = r0 / r1
            int r1 = r12.height()
            int r2 = r11.inSampleSize
            int r1 = r1 / r2
        L_0x0017:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            r5 = 0
            if (r2 < r3) goto L_0x002d
            com.facebook.imagepipeline.platform.PreverificationHelper r6 = r9.f9650b
            if (r6 == 0) goto L_0x002d
            android.graphics.Bitmap$Config r7 = r11.inPreferredConfig
            boolean r6 = r6.shouldUseHardwareBitmapConfig(r7)
            if (r6 == 0) goto L_0x002d
            r6 = r4
            goto L_0x002e
        L_0x002d:
            r6 = r5
        L_0x002e:
            r7 = 0
            if (r12 != 0) goto L_0x0037
            if (r6 == 0) goto L_0x0037
            r11.inMutable = r5
            r6 = r7
            goto L_0x004d
        L_0x0037:
            if (r12 == 0) goto L_0x003f
            if (r6 == 0) goto L_0x003f
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            r11.inPreferredConfig = r6
        L_0x003f:
            int r6 = r9.mo324d(r0, r1, r11)
            s20 r8 = r9.f9649a
            java.lang.Object r6 = r8.get(r6)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L_0x00fa
        L_0x004d:
            r11.inBitmap = r6
            if (r2 < r3) goto L_0x005b
            if (r13 != 0) goto L_0x0059
            android.graphics.ColorSpace$Named r13 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r13 = android.graphics.ColorSpace.get(r13)
        L_0x0059:
            r11.inPreferredColorSpace = r13
        L_0x005b:
            ct4<java.nio.ByteBuffer> r13 = r9.f9651c
            java.lang.Object r13 = r13.mo11139b()
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            if (r13 != 0) goto L_0x006b
            r13 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r13 = java.nio.ByteBuffer.allocate(r13)
        L_0x006b:
            byte[] r2 = r13.array()     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
            r11.inTempStorage = r2     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
            if (r12 == 0) goto L_0x00a2
            if (r6 == 0) goto L_0x00a2
            android.graphics.Bitmap$Config r2 = r11.inPreferredConfig     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            r6.reconfigure(r0, r1, r2)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r10, r4)     // Catch:{ IOException -> 0x0088, all -> 0x0086 }
            android.graphics.Bitmap r12 = r0.decodeRegion(r12, r11)     // Catch:{ IOException -> 0x0089 }
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
            goto L_0x00a3
        L_0x0086:
            r11 = move-exception
            goto L_0x009c
        L_0x0088:
            r0 = r7
        L_0x0089:
            java.lang.Class<?> r1 = f9647d     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Could not decode region %s, decoding full bitmap instead."
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x009a }
            r3[r5] = r12     // Catch:{ all -> 0x009a }
            p000.oy1.m24419f(r1, r2, r3)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x00a2
            r0.recycle()     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
            goto L_0x00a2
        L_0x009a:
            r11 = move-exception
            r7 = r0
        L_0x009c:
            if (r7 == 0) goto L_0x00a1
            r7.recycle()     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
        L_0x00a1:
            throw r11     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
        L_0x00a2:
            r12 = r7
        L_0x00a3:
            if (r12 != 0) goto L_0x00a9
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeStream(r10, r7, r11)     // Catch:{ IllegalArgumentException -> 0x00d3, RuntimeException -> 0x00ca }
        L_0x00a9:
            ct4<java.nio.ByteBuffer> r10 = r9.f9651c
            r10.mo11138a(r13)
            if (r6 == 0) goto L_0x00c1
            if (r6 != r12) goto L_0x00b3
            goto L_0x00c1
        L_0x00b3:
            s20 r10 = r9.f9649a
            r10.mo360a(r6)
            r12.recycle()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L_0x00c1:
            s20 r10 = r9.f9649a
            nh0 r10 = p000.nh0.m23183y(r12, r10)
            return r10
        L_0x00c8:
            r10 = move-exception
            goto L_0x00f4
        L_0x00ca:
            r10 = move-exception
            if (r6 == 0) goto L_0x00d2
            s20 r11 = r9.f9649a     // Catch:{ all -> 0x00c8 }
            r11.mo360a(r6)     // Catch:{ all -> 0x00c8 }
        L_0x00d2:
            throw r10     // Catch:{ all -> 0x00c8 }
        L_0x00d3:
            r11 = move-exception
            if (r6 == 0) goto L_0x00db
            s20 r12 = r9.f9649a     // Catch:{ all -> 0x00c8 }
            r12.mo360a(r6)     // Catch:{ all -> 0x00c8 }
        L_0x00db:
            r10.reset()     // Catch:{ IOException -> 0x00f3 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x00f3 }
            if (r10 == 0) goto L_0x00f2
            b26 r12 = p000.b26.m11034b()     // Catch:{ IOException -> 0x00f3 }
            nh0 r10 = p000.nh0.m23183y(r10, r12)     // Catch:{ IOException -> 0x00f3 }
            ct4<java.nio.ByteBuffer> r11 = r9.f9651c
            r11.mo11138a(r13)
            return r10
        L_0x00f2:
            throw r11     // Catch:{ IOException -> 0x00f3 }
        L_0x00f3:
            throw r11     // Catch:{ all -> 0x00c8 }
        L_0x00f4:
            ct4<java.nio.ByteBuffer> r11 = r9.f9651c
            r11.mo11138a(r13)
            throw r10
        L_0x00fa:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "BitmapPool.get returned null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.C1948a.mo13389c(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):nh0");
    }

    /* renamed from: d */
    public abstract int mo324d(int i, int i2, BitmapFactory.Options options);
}
