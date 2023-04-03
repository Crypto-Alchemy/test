package p000;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import android.util.Pair;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;

/* renamed from: b30 */
/* compiled from: BitmapUtil */
public final class b30 {

    /* renamed from: a */
    public static final ct4<ByteBuffer> f7923a = new ct4<>(12);

    /* renamed from: b30$a */
    /* compiled from: BitmapUtil */
    public static /* synthetic */ class C1600a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7924a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7924a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7924a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7924a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.b30.C1600a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m11037a(InputStream inputStream) {
        au4.m10792g(inputStream);
        ct4<ByteBuffer> ct4 = f7923a;
        ByteBuffer b = ct4.mo11139b();
        if (b == null) {
            b = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            if (options.outWidth != -1) {
                if (options.outHeight != -1) {
                    pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                }
            }
            ct4.mo11138a(b);
            return pair;
        } catch (Throwable th) {
            f7923a.mo11138a(b);
            throw th;
        }
    }

    /* renamed from: b */
    public static zq2 m11038b(InputStream inputStream) {
        au4.m10792g(inputStream);
        ct4<ByteBuffer> ct4 = f7923a;
        ByteBuffer b = ct4.mo11139b();
        if (b == null) {
            b = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = b.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, (Rect) null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            zq2 zq2 = new zq2(options.outWidth, options.outHeight, colorSpace);
            ct4.mo11138a(b);
            return zq2;
        } catch (Throwable th) {
            f7923a.mo11138a(b);
            throw th;
        }
    }

    /* renamed from: c */
    public static int m11039c(Bitmap.Config config) {
        switch (C1600a.f7924a[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    /* renamed from: d */
    public static int m11040d(int i, int i2, Bitmap.Config config) {
        return i * i2 * m11039c(config);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public static int m11041e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
