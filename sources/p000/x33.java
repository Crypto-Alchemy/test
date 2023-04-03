package p000;

import android.graphics.Matrix;
import com.facebook.common.internal.ImmutableList;

/* renamed from: x33 */
/* compiled from: JpegTranscoderUtils */
public class x33 {

    /* renamed from: a */
    public static final ImmutableList<Integer> f19311a = ImmutableList.m13299of(2, 7, 4, 5);

    /* renamed from: a */
    public static int m29860a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: b */
    public static int m29861b(gp1 gp1) {
        int n = gp1.mo20754n();
        if (n == 90 || n == 180 || n == 270) {
            return gp1.mo20754n();
        }
        return 0;
    }

    /* renamed from: c */
    public static int m29862c(xh5 xh5, gp1 gp1) {
        int h = gp1.mo20748h();
        ImmutableList<Integer> immutableList = f19311a;
        int indexOf = immutableList.indexOf(Integer.valueOf(h));
        if (indexOf >= 0) {
            int i = 0;
            if (!xh5.mo27743f()) {
                i = xh5.mo27740d();
            }
            return immutableList.get((indexOf + (i / 90)) % immutableList.size()).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: d */
    public static int m29863d(xh5 xh5, gp1 gp1) {
        if (!xh5.mo27741e()) {
            return 0;
        }
        int b = m29861b(gp1);
        if (xh5.mo27743f()) {
            return b;
        }
        return (b + xh5.mo27740d()) % 360;
    }

    /* renamed from: e */
    public static int m29864e(xh5 xh5, te5 te5, gp1 gp1, boolean z) {
        return 8;
    }

    /* renamed from: f */
    public static Matrix m29865f(gp1 gp1, xh5 xh5) {
        if (f19311a.contains(Integer.valueOf(gp1.mo20748h()))) {
            return m29866g(m29862c(xh5, gp1));
        }
        int d = m29863d(xh5, gp1);
        if (d == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) d);
        return matrix;
    }

    /* renamed from: g */
    public static Matrix m29866g(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: h */
    public static boolean m29867h(int i) {
        switch (i) {
            case 1:
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

    /* renamed from: i */
    public static boolean m29868i(int i) {
        if (i < 0 || i > 270 || i % 90 != 0) {
            return false;
        }
        return true;
    }
}
