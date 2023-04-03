package p000;

import android.animation.TypeEvaluator;

/* renamed from: p42 */
/* compiled from: FloatArrayEvaluator */
public class p42 implements TypeEvaluator<float[]> {

    /* renamed from: a */
    public float[] f16280a;

    public p42(float[] fArr) {
        this.f16280a = fArr;
    }

    /* renamed from: a */
    public float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = this.f16280a;
        if (fArr3 == null) {
            fArr3 = new float[fArr.length];
        }
        for (int i = 0; i < fArr3.length; i++) {
            float f2 = fArr[i];
            fArr3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return fArr3;
    }
}
