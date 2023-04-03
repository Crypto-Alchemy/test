package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import java.util.Locale;

@ii1
public abstract class DalvikPurgeableDecoder implements zo4 {

    /* renamed from: b */
    public static final byte[] f9636b = {-1, -39};

    /* renamed from: a */
    public final y10 f9637a = z10.m30905a();

    @hi1
    public static class OreoUtils {
        private OreoUtils() {
        }

        @TargetApi(26)
        /* renamed from: a */
        public static void m13524a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        qr2.m25860a();
    }

    /* renamed from: e */
    public static boolean m13517e(nh0<PooledByteBuffer> nh0, int i) {
        PooledByteBuffer j = nh0.mo23684j();
        if (i >= 2 && j.mo13169w(i - 2) == -1 && j.mo13169w(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static BitmapFactory.Options m13518f(int i, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        return options;
    }

    @ii1
    private static native void nativePinBitmap(Bitmap bitmap);

    /* renamed from: a */
    public nh0<Bitmap> mo13372a(gp1 gp1, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f = m13518f(gp1.mo20755p(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m13524a(f, colorSpace);
        }
        nh0<PooledByteBuffer> e = gp1.mo20745e();
        au4.m10792g(e);
        try {
            return mo13376g(mo13374c(e, f));
        } finally {
            nh0.m23178h(e);
        }
    }

    /* renamed from: b */
    public nh0<Bitmap> mo13373b(gp1 gp1, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        BitmapFactory.Options f = m13518f(gp1.mo20755p(), config);
        if (Build.VERSION.SDK_INT >= 26) {
            OreoUtils.m13524a(f, colorSpace);
        }
        nh0<PooledByteBuffer> e = gp1.mo20745e();
        au4.m10792g(e);
        try {
            return mo13376g(mo13375d(e, i, f));
        } finally {
            nh0.m23178h(e);
        }
    }

    /* renamed from: c */
    public abstract Bitmap mo13374c(nh0<PooledByteBuffer> nh0, BitmapFactory.Options options);

    /* renamed from: d */
    public abstract Bitmap mo13375d(nh0<PooledByteBuffer> nh0, int i, BitmapFactory.Options options);

    /* renamed from: g */
    public nh0<Bitmap> mo13376g(Bitmap bitmap) {
        au4.m10792g(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.f9637a.mo27902g(bitmap)) {
                return nh0.m23183y(bitmap, this.f9637a.mo27900e());
            }
            int e = b30.m11041e(bitmap);
            bitmap.recycle();
            throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[]{Integer.valueOf(e), Integer.valueOf(this.f9637a.mo27897b()), Long.valueOf(this.f9637a.mo27901f()), Integer.valueOf(this.f9637a.mo27898c()), Integer.valueOf(this.f9637a.mo27899d())}));
        } catch (Exception e2) {
            bitmap.recycle();
            throw pp6.m25127a(e2);
        }
    }
}
