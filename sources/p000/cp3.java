package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: cp3 */
/* compiled from: MathUtils */
public class cp3 {

    /* renamed from: a */
    public static final Matrix f10202a = new Matrix();

    /* renamed from: b */
    public static final Matrix f10203b = new Matrix();

    /* renamed from: c */
    public static final RectF f10204c = new RectF();

    /* renamed from: a */
    public static void m14352a(float[] fArr, p86 p86, p86 p862) {
        Matrix matrix = f10202a;
        p86.mo24480d(matrix);
        Matrix matrix2 = f10203b;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        p862.mo24480d(matrix);
        matrix.mapPoints(fArr);
    }

    /* renamed from: b */
    public static float m14353b(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: c */
    public static void m14354c(p86 p86, p86 p862, float f, float f2, p86 p863, float f3, float f4, float f5) {
        p86.mo24490m(p862);
        if (!p86.m24755c(p862.mo24485h(), p863.mo24485h())) {
            p86.mo24495r(m14353b(p862.mo24485h(), p863.mo24485h(), f5), f, f2);
        }
        float e = p862.mo24481e();
        float e2 = p863.mo24481e();
        float f6 = Float.NaN;
        if (Math.abs(e - e2) > 180.0f) {
            if (e < Utils.FLOAT_EPSILON) {
                e += 360.0f;
            }
            if (e2 < Utils.FLOAT_EPSILON) {
                e2 += 360.0f;
            }
            if (!p86.m24755c(e, e2)) {
                f6 = m14353b(e, e2, f5);
            }
        } else if (!p86.m24755c(e, e2)) {
            f6 = m14353b(e, e2, f5);
        }
        if (!Float.isNaN(f6)) {
            p86.mo24488k(f6, f, f2);
        }
        p86.mo24491n(m14353b(Utils.FLOAT_EPSILON, f3 - f, f5), m14353b(Utils.FLOAT_EPSILON, f4 - f2, f5));
    }

    /* renamed from: d */
    public static void m14355d(RectF rectF, RectF rectF2, RectF rectF3, float f) {
        rectF.left = m14353b(rectF2.left, rectF3.left, f);
        rectF.top = m14353b(rectF2.top, rectF3.top, f);
        rectF.right = m14353b(rectF2.right, rectF3.right, f);
        rectF.bottom = m14353b(rectF2.bottom, rectF3.bottom, f);
    }

    /* renamed from: e */
    public static void m14356e(Matrix matrix, Rect rect) {
        RectF rectF = f10204c;
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* renamed from: f */
    public static float m14357f(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }
}
