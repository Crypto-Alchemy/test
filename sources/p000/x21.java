package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import com.alexvasilkov.gestures.GestureController;
import com.alexvasilkov.gestures.Settings;
import com.github.mikephil.charting.utils.Utils;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: x21 */
/* compiled from: DebugOverlay */
public class x21 {

    /* renamed from: a */
    public static final Paint f19291a = new Paint();

    /* renamed from: b */
    public static final RectF f19292b = new RectF();

    /* renamed from: c */
    public static final Rect f19293c = new Rect();

    /* renamed from: d */
    public static final Matrix f19294d = new Matrix();

    /* renamed from: e */
    public static Field f19295e;

    /* renamed from: a */
    public static void m29838a(View view, Canvas canvas) {
        int i;
        String str;
        GestureController controller = ((rf2) view).getController();
        sd7 positionAnimator = ((C2764ll) view).getPositionAnimator();
        Settings n = controller.mo12196n();
        Context context = view.getContext();
        float a = x37.m29870a(context, 2.0f);
        float a2 = x37.m29870a(context, 16.0f);
        canvas.save();
        canvas.translate((float) view.getPaddingLeft(), (float) view.getPaddingTop());
        RectF rectF = f19292b;
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) n.mo12270u(), (float) n.mo12269t());
        m29839b(canvas, rectF, -7829368, a);
        Rect rect = f19293c;
        qj2.m25711d(n, rect);
        rectF.set(rect);
        m29839b(canvas, rectF, -16711936, a);
        p86 o = controller.mo12197o();
        Matrix matrix = f19294d;
        o.mo24480d(matrix);
        canvas.save();
        canvas.concat(matrix);
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) n.mo12261l(), (float) n.mo12260k());
        m29839b(canvas, rectF, -256, a / controller.mo12197o().mo24485h());
        canvas.restore();
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) n.mo12261l(), (float) n.mo12260k());
        controller.mo12197o().mo24480d(matrix);
        matrix.mapRect(rectF);
        m29839b(canvas, rectF, -65536, a);
        float u = positionAnimator.mo25757u();
        if (u == 1.0f || (u == Utils.FLOAT_EPSILON && positionAnimator.mo25760x())) {
            GestureController.StateSource d = m29841d(controller);
            m29840c(canvas, n, d.name(), -16711681, a2);
            if (d != GestureController.StateSource.NONE) {
                view.invalidate();
            }
        } else if (i > 0) {
            if (positionAnimator.mo25760x()) {
                str = "EXIT";
            } else {
                str = "ENTER";
            }
            m29840c(canvas, n, String.format(Locale.US, "%s %.0f%%", new Object[]{str, Float.valueOf(u * 100.0f)}), -65281, a2);
        }
        canvas.restore();
    }

    /* renamed from: b */
    public static void m29839b(Canvas canvas, RectF rectF, int i, float f) {
        Paint paint = f19291a;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        float f2 = f * 0.5f;
        f19292b.inset(f2, f2);
        paint.setColor(i);
        canvas.drawRect(rectF, paint);
    }

    /* renamed from: c */
    public static void m29840c(Canvas canvas, Settings settings, String str, int i, float f) {
        Paint paint = f19291a;
        paint.setTextSize(f);
        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextAlign(Paint.Align.CENTER);
        float f2 = f * 0.5f;
        int length = str.length();
        Rect rect = f19293c;
        paint.getTextBounds(str, 0, length, rect);
        RectF rectF = f19292b;
        rectF.set(rect);
        rectF.offset(-rectF.centerX(), -rectF.centerY());
        qj2.m25711d(settings, rect);
        rectF.offset((float) rect.centerX(), (float) rect.centerY());
        float f3 = -f2;
        rectF.inset(f3, f3);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-7829368);
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        canvas.drawText(str, rectF.centerX(), rectF.bottom - f2, paint);
    }

    /* renamed from: d */
    public static GestureController.StateSource m29841d(GestureController gestureController) {
        if (f19295e == null) {
            try {
                Field declaredField = GestureController.class.getDeclaredField("k0");
                f19295e = declaredField;
                declaredField.setAccessible(true);
            } catch (Exception unused) {
            }
        }
        Field field = f19295e;
        if (field != null) {
            try {
                return (GestureController.StateSource) field.get(gestureController);
            } catch (Exception unused2) {
            }
        }
        return GestureController.StateSource.NONE;
    }
}
