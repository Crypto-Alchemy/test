package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: p67 */
/* compiled from: Util */
public final class p67 {

    /* renamed from: a */
    public static final char[] f16325a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    public static final char[] f16326b = new char[64];

    /* renamed from: c */
    public static volatile Handler f16327c;

    /* renamed from: p67$a */
    /* compiled from: Util */
    public static /* synthetic */ class C3041a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16328a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16328a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16328a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16328a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16328a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16328a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.p67.C3041a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m24673a() {
        if (!m24689q()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m24674b() {
        if (!m24690r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m24675c(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        } else if (obj instanceof jw3) {
            return ((jw3) obj).mo22100a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: d */
    public static boolean m24676d(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static String m24677e(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f16325a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m24678f(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: g */
    public static int m24679g(int i, int i2, Bitmap.Config config) {
        return i * i2 * m24681i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m24680h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        } else {
            throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
    }

    /* renamed from: i */
    public static int m24681i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C3041a.f16328a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return 4;
        }
        return 8;
    }

    /* renamed from: j */
    public static <T> List<T> m24682j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static Handler m24683k() {
        if (f16327c == null) {
            synchronized (p67.class) {
                if (f16327c == null) {
                    f16327c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f16327c;
    }

    /* renamed from: l */
    public static int m24684l(float f) {
        return m24685m(f, 17);
    }

    /* renamed from: m */
    public static int m24685m(float f, int i) {
        return m24686n(Float.floatToIntBits(f), i);
    }

    /* renamed from: n */
    public static int m24686n(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: o */
    public static int m24687o(Object obj, int i) {
        int i2;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        return m24686n(i2, i);
    }

    /* renamed from: p */
    public static int m24688p(boolean z, int i) {
        return m24686n(z ? 1 : 0, i);
    }

    /* renamed from: q */
    public static boolean m24689q() {
        return !m24690r();
    }

    /* renamed from: r */
    public static boolean m24690r() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m24691s(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m24692t(int i, int i2) {
        if (!m24691s(i) || !m24691s(i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static void m24693u(Runnable runnable) {
        m24683k().post(runnable);
    }

    /* renamed from: v */
    public static void m24694v(Runnable runnable) {
        m24683k().removeCallbacks(runnable);
    }

    /* renamed from: w */
    public static String m24695w(byte[] bArr) {
        String e;
        char[] cArr = f16326b;
        synchronized (cArr) {
            e = m24677e(bArr, cArr);
        }
        return e;
    }
}
