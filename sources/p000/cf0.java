package p000;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: cf0 */
/* compiled from: CircularPropagation */
public class cf0 extends lf7 {

    /* renamed from: b */
    public float f8426b = 3.0f;

    /* renamed from: h */
    public static float m11848h(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }

    /* renamed from: c */
    public long mo12042c(ViewGroup viewGroup, Transition transition, bx6 bx6, bx6 bx62) {
        int i;
        int i2;
        int i3;
        if (bx6 == null && bx62 == null) {
            return 0;
        }
        if (bx62 == null || mo22758e(bx6) == 0) {
            i = -1;
        } else {
            bx6 = bx62;
            i = 1;
        }
        int f = mo22759f(bx6);
        int g = mo22760g(bx6);
        Rect y = transition.mo10544y();
        if (y != null) {
            i3 = y.centerX();
            i2 = y.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float h = m11848h((float) f, (float) g, (float) i3, (float) i2) / m11848h(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long x = transition.mo10543x();
        if (x < 0) {
            x = 300;
        }
        return (long) Math.round((((float) (x * ((long) i))) / this.f8426b) * h);
    }
}
