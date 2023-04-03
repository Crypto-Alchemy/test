package p000;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import p000.e87;

/* renamed from: j12 */
/* compiled from: FillAnimation */
public class j12 extends vk0 {

    /* renamed from: g */
    public k12 f30198g = new k12();

    /* renamed from: h */
    public int f30199h;

    /* renamed from: i */
    public int f30200i;

    /* renamed from: j12$a */
    /* compiled from: FillAnimation */
    public class C6019a implements ValueAnimator.AnimatorUpdateListener {
        public C6019a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            j12.this.m46085j(valueAnimator);
        }
    }

    public j12(e87.C5755a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m46085j(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        this.f30198g.mo49219c(intValue);
        this.f30198g.mo49220d(intValue2);
        this.f30198g.mo44654i(intValue3);
        this.f30198g.mo44655j(intValue4);
        this.f30198g.mo44656k(intValue5);
        this.f30198g.mo44657l(intValue6);
        e87.C5755a aVar = this.f35462b;
        if (aVar != null) {
            aVar.mo39246a(this.f30198g);
        }
    }

    /* renamed from: g */
    public ValueAnimator mo28832a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new C6019a());
        return valueAnimator;
    }

    /* renamed from: n */
    public final PropertyValuesHolder mo43990n(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f30199h;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.f30199h;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i2, i});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: o */
    public final PropertyValuesHolder mo43991o(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f30199h;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.f30199h;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, new int[]{i, i2});
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    /* renamed from: p */
    public final boolean mo43992p(int i, int i2, int i3, int i4) {
        if (this.f34966e == i && this.f34967f == i2 && this.f30199h == i3 && this.f30200i == i4) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public j12 mo43993q(int i, int i2, int i3, int i4) {
        if (this.f35463c != null && mo43992p(i, i2, i3, i4)) {
            this.f34966e = i;
            this.f34967f = i2;
            this.f30199h = i3;
            this.f30200i = i4;
            ((ValueAnimator) this.f35463c).setValues(new PropertyValuesHolder[]{mo48754h(false), mo48754h(true), mo43990n(false), mo43990n(true), mo43991o(false), mo43991o(true)});
        }
        return this;
    }
}
