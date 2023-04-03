package p000;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: ip3 */
/* compiled from: MatrixEvaluator */
public class ip3 implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    public final float[] f30092a = new float[9];

    /* renamed from: b */
    public final float[] f30093b = new float[9];

    /* renamed from: c */
    public final Matrix f30094c = new Matrix();

    /* renamed from: a */
    public Matrix mo32876a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f30092a);
        matrix2.getValues(this.f30093b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f30093b;
            float f2 = fArr[i];
            float f3 = this.f30092a[i];
            fArr[i] = f3 + ((f2 - f3) * f);
        }
        this.f30094c.setValues(this.f30093b);
        return this.f30094c;
    }
}
