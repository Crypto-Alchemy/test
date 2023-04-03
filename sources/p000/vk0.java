package p000;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;

/* renamed from: vk0 */
/* compiled from: ColorAnimation */
public class vk0 extends C6678wx<ValueAnimator> {

    /* renamed from: d */
    public wk0 f34965d = new wk0();

    /* renamed from: e */
    public int f34966e;

    /* renamed from: f */
    public int f34967f;

    /* renamed from: vk0$a */
    /* compiled from: ColorAnimation */
    public class C6603a implements ValueAnimator.AnimatorUpdateListener {
        public C6603a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            vk0.this.mo48756j(valueAnimator);
        }
    }

    public vk0(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public ValueAnimator mo28832a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C6603a());
        return valueAnimator;
    }

    /* renamed from: h */
    public PropertyValuesHolder mo48754h(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f34967f;
            i2 = this.f34966e;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.f34966e;
            i2 = this.f34967f;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new ArgbEvaluator());
        return ofInt;
    }

    /* renamed from: i */
    public final boolean mo48755i(int i, int i2) {
        if (this.f34966e == i && this.f34967f == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo48756j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        this.f34965d.mo49219c(intValue);
        this.f34965d.mo49220d(intValue2);
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f34965d);
        }
    }

    /* renamed from: k */
    public vk0 mo28833d(float f) {
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
    public vk0 mo48758l(int i, int i2) {
        if (this.f35463c != null && mo48755i(i, i2)) {
            this.f34966e = i;
            this.f34967f = i2;
            ((ValueAnimator) this.f35463c).setValues(new PropertyValuesHolder[]{mo48754h(false), mo48754h(true)});
        }
        return this;
    }
}
