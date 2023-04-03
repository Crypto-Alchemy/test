package p000;

import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: vl3 */
/* compiled from: LookupTableInterpolator */
public abstract class vl3 implements Interpolator {

    /* renamed from: a */
    public final float[] f18831a;

    /* renamed from: b */
    public final float f18832b;

    public vl3(float[] fArr) {
        this.f18831a = fArr;
        this.f18832b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        float[] fArr = this.f18831a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.f18832b;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.f18831a;
        float f4 = fArr2[min];
        return f4 + (f3 * (fArr2[min + 1] - f4));
    }
}
