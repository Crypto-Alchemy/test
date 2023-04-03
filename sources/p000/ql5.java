package p000;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import p000.e87;

/* renamed from: ql5 */
/* compiled from: ScaleDownAnimation */
public class ql5 extends ol5 {
    public ql5(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: n */
    public PropertyValuesHolder mo46422n(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f32395g;
            i2 = (int) (((float) i) * this.f32396h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.f32395g;
            i = (int) (((float) i2) * this.f32396h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }
}
