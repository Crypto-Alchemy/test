package p000;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;

/* renamed from: a46 */
/* compiled from: SlideAnimation */
public class a46 extends C6678wx<ValueAnimator> {

    /* renamed from: d */
    public b46 f20809d = new b46();

    /* renamed from: e */
    public int f20810e = -1;

    /* renamed from: f */
    public int f20811f = -1;

    /* renamed from: a46$a */
    /* compiled from: SlideAnimation */
    public class C3799a implements ValueAnimator.AnimatorUpdateListener {
        public C3799a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a46.this.mo28837j(valueAnimator);
        }
    }

    public a46(e87.C5755a aVar) {
        super(aVar);
    }

    /* renamed from: g */
    public ValueAnimator mo28832a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C3799a());
        return valueAnimator;
    }

    /* renamed from: h */
    public final PropertyValuesHolder mo28835h() {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.f20810e, this.f20811f});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: i */
    public final boolean mo28836i(int i, int i2) {
        if (this.f20810e == i && this.f20811f == i2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo28837j(ValueAnimator valueAnimator) {
        this.f20809d.mo29454b(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f20809d);
        }
    }

    /* renamed from: k */
    public a46 mo28833d(float f) {
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
    public a46 mo28839l(int i, int i2) {
        if (this.f35463c != null && mo28836i(i, i2)) {
            this.f20810e = i;
            this.f20811f = i2;
            ((ValueAnimator) this.f35463c).setValues(new PropertyValuesHolder[]{mo28835h()});
        }
        return this;
    }
}
