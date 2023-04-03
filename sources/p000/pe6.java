package p000;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;

/* renamed from: pe6 */
/* compiled from: SwapAnimation */
public class pe6 extends C6678wx<ValueAnimator> {

    /* renamed from: d */
    public int f32673d = -1;

    /* renamed from: e */
    public int f32674e = -1;

    /* renamed from: f */
    public qe6 f32675f = new qe6();

    /* renamed from: pe6$a */
    /* compiled from: SwapAnimation */
    public class C6350a implements ValueAnimator.AnimatorUpdateListener {
        public C6350a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            pe6.this.mo46714j(valueAnimator);
        }
    }

    public pe6(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public ValueAnimator mo28832a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C6350a());
        return valueAnimator;
    }

    /* renamed from: h */
    public final PropertyValuesHolder mo46712h(String str, int i, int i2) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: i */
    public final boolean mo46713i(int i, int i2) {
        if (this.f32673d == i && this.f32674e == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo46714j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        this.f32675f.mo47091c(intValue);
        this.f32675f.mo47092d(intValue2);
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f32675f);
        }
    }

    /* renamed from: k */
    public pe6 mo28833d(float f) {
        T t = this.f35463c;
        if (t != null) {
            long j = (long) (f * ((float) this.f35461a));
            if (((ValueAnimator) t).getValues() != null && ((ValueAnimator) this.f35463c).getValues().length > 0) {
                ((ValueAnimator) this.f35463c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    /* renamed from: l */
    public pe6 mo46716l(int i, int i2) {
        if (this.f35463c != null && mo46713i(i, i2)) {
            this.f32673d = i;
            this.f32674e = i2;
            ((ValueAnimator) this.f35463c).setValues(new PropertyValuesHolder[]{mo46712h("ANIMATION_COORDINATE", i, i2), mo46712h("ANIMATION_COORDINATE_REVERSE", i2, i)});
        }
        return this;
    }
}
