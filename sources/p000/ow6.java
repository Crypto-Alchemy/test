package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ow6 */
/* compiled from: TransformationUtils */
public final class ow6 {

    /* renamed from: a */
    public static final Paint f16170a = new Paint(6);

    /* renamed from: b */
    public static final Paint f16171b = new Paint(7);

    /* renamed from: c */
    public static final Paint f16172c;

    /* renamed from: d */
    public static final Set<String> f16173d;

    /* renamed from: e */
    public static final Lock f16174e;

    /* renamed from: ow6$a */
    /* compiled from: TransformationUtils */
    public static final class C3004a implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        Lock lock;
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f16173d = hashSet;
        if (hashSet.contains(Build.MODEL)) {
            lock = new ReentrantLock();
        } else {
            lock = new C3004a();
        }
        f16174e = lock;
        Paint paint = new Paint(7);
        f16172c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    public static void m24305a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f16174e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f16170a);
            m24309e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f16174e.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public static Bitmap m24306b(t20 t20, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth() * i2;
        int height = bitmap.getHeight() * i;
        float f3 = Utils.FLOAT_EPSILON;
        if (width > height) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d = t20.mo26025d(i, i2, m24315k(bitmap));
        m24319o(bitmap, d);
        m24305a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: c */
    public static Bitmap m24307c(t20 t20, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            return m24310f(t20, bitmap, i, i2);
        }
        return bitmap;
    }

    /* renamed from: d */
    public static Bitmap m24308d(t20 t20, Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap g = m24311g(t20, bitmap);
        Bitmap d = t20.mo26025d(min, min, m24312h(bitmap));
        d.setHasAlpha(true);
        Lock lock = f16174e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d);
            canvas.drawCircle(f2, f2, f2, f16171b);
            canvas.drawBitmap(g, (Rect) null, rectF, f16172c);
            m24309e(canvas);
            lock.unlock();
            if (!g.equals(bitmap)) {
                t20.mo25118c(g);
            }
            return d;
        } catch (Throwable th) {
            f16174e.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public static void m24309e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    /* renamed from: f */
    public static Bitmap m24310f(t20 t20, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            return bitmap;
        }
        Bitmap d = t20.mo26025d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), m24315k(bitmap));
        m24319o(bitmap, d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("request: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("toFit:   ");
            sb2.append(bitmap.getWidth());
            sb2.append("x");
            sb2.append(bitmap.getHeight());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toReuse: ");
            sb3.append(d.getWidth());
            sb3.append("x");
            sb3.append(d.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("minPct:   ");
            sb4.append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m24305a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: g */
    public static Bitmap m24311g(t20 t20, Bitmap bitmap) {
        Bitmap.Config h = m24312h(bitmap);
        if (h.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d = t20.mo26025d(bitmap.getWidth(), bitmap.getHeight(), h);
        new Canvas(d).drawBitmap(bitmap, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (Paint) null);
        return d;
    }

    /* renamed from: h */
    public static Bitmap.Config m24312h(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    /* renamed from: i */
    public static Lock m24313i() {
        return f16174e;
    }

    /* renamed from: j */
    public static int m24314j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: k */
    public static Bitmap.Config m24315k(Bitmap bitmap) {
        if (bitmap.getConfig() != null) {
            return bitmap.getConfig();
        }
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: l */
    public static void m24316l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    /* renamed from: m */
    public static boolean m24317m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: n */
    public static Bitmap m24318n(t20 t20, Bitmap bitmap, int i) {
        if (!m24317m(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m24316l(i, matrix);
        RectF rectF = new RectF(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d = t20.mo26025d(Math.round(rectF.width()), Math.round(rectF.height()), m24315k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d.setHasAlpha(bitmap.hasAlpha());
        m24305a(bitmap, d, matrix);
        return d;
    }

    /* renamed from: o */
    public static void m24319o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
