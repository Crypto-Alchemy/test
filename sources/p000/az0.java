package p000;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: az0 */
/* compiled from: CutCornerTreatment */
public class az0 extends eu0 {

    /* renamed from: a */
    public float f21093a = -1.0f;

    /* renamed from: a */
    public void mo29401a(uz5 uz5, float f, float f2, float f3) {
        uz5.mo48567o(Utils.FLOAT_EPSILON, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        uz5.mo48565m((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
