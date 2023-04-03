package p000;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;

/* renamed from: ol5 */
/* compiled from: ScaleAnimation */
public class ol5 extends vk0 {

    /* renamed from: g */
    public int f32395g;

    /* renamed from: h */
    public float f32396h;

    /* renamed from: i */
    public pl5 f32397i = new pl5();

    /* renamed from: ol5$a */
    /* compiled from: ScaleAnimation */
    public class C6318a implements ValueAnimator.AnimatorUpdateListener {
        public C6318a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ol5.this.m49347j(valueAnimator);
        }
    }

    public ol5(e87.C5755a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m49347j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        this.f32397i.mo49219c(intValue);
        this.f32397i.mo49220d(intValue2);
        this.f32397i.mo46773g(intValue3);
        this.f32397i.mo46774h(intValue4);
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f32397i);
        }
    }

    /* renamed from: g */
    public ValueAnimator mo28832a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C6318a());
        return valueAnimator;
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
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: o */
    public final boolean mo46423o(int i, int i2, int i3, float f) {
        if (this.f34966e == i && this.f34967f == i2 && this.f32395g == i3 && this.f32396h == f) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public ol5 mo46424p(int i, int i2, int i3, float f) {
        if (this.f35463c != null && mo46423o(i, i2, i3, f)) {
            this.f34966e = i;
            this.f34967f = i2;
            this.f32395g = i3;
            this.f32396h = f;
            ((ValueAnimator) this.f35463c).setValues(new PropertyValuesHolder[]{mo48754h(false), mo48754h(true), mo46422n(false), mo46422n(true)});
        }
        return this;
    }
}
