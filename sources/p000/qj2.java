package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Gravity;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: qj2 */
/* compiled from: GravityUtils */
public class qj2 {

    /* renamed from: a */
    public static final Matrix f16949a = new Matrix();

    /* renamed from: b */
    public static final RectF f16950b = new RectF();

    /* renamed from: c */
    public static final Rect f16951c = new Rect();

    /* renamed from: d */
    public static final Rect f16952d = new Rect();

    /* renamed from: a */
    public static void m25708a(Settings settings, Point point) {
        Rect rect = f16952d;
        m25711d(settings, rect);
        int j = settings.mo12259j();
        Rect rect2 = f16951c;
        Gravity.apply(j, 0, 0, rect, rect2);
        point.set(rect2.left, rect2.top);
    }

    /* renamed from: b */
    public static void m25709b(p86 p86, Settings settings, Rect rect) {
        Matrix matrix = f16949a;
        p86.mo24480d(matrix);
        m25710c(matrix, settings, rect);
    }

    /* renamed from: c */
    public static void m25710c(Matrix matrix, Settings settings, Rect rect) {
        RectF rectF = f16950b;
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) settings.mo12261l(), (float) settings.mo12260k());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        Rect rect2 = f16951c;
        rect2.set(0, 0, settings.mo12270u(), settings.mo12269t());
        Gravity.apply(settings.mo12259j(), round, round2, rect2, rect);
    }

    /* renamed from: d */
    public static void m25711d(Settings settings, Rect rect) {
        Rect rect2 = f16951c;
        rect2.set(0, 0, settings.mo12270u(), settings.mo12269t());
        Gravity.apply(settings.mo12259j(), settings.mo12265p(), settings.mo12264o(), rect2, rect);
    }
}
