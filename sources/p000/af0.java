package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* renamed from: af0 */
/* compiled from: CircularIndeterminateAnimatorDelegate */
public final class af0 extends rt2<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f20920l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    public static final int[] f20921m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    public static final int[] f20922n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    public static final Property<af0, Float> f20923o;

    /* renamed from: p */
    public static final Property<af0, Float> f20924p;

    /* renamed from: d */
    public ObjectAnimator f20925d;

    /* renamed from: e */
    public ObjectAnimator f20926e;

    /* renamed from: f */
    public final bz1 f20927f;

    /* renamed from: g */
    public final C5943hz f20928g;

    /* renamed from: h */
    public int f20929h = 0;

    /* renamed from: i */
    public float f20930i;

    /* renamed from: j */
    public float f20931j;

    /* renamed from: k */
    public C3681yj f20932k = null;

    /* renamed from: af0$a */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public class C3810a extends AnimatorListenerAdapter {
        public C3810a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            af0 af0 = af0.this;
            int unused = af0.f20929h = (af0.f20929h + 4) % af0.this.f20928g.f29760c.length;
        }
    }

    /* renamed from: af0$b */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public class C3811b extends AnimatorListenerAdapter {
        public C3811b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            af0.this.mo28932a();
            af0 af0 = af0.this;
            af0.f20932k.onAnimationEnd(af0.f33576a);
        }
    }

    /* renamed from: af0$c */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public static class C3812c extends Property<af0, Float> {
        public C3812c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(af0 af0) {
            return Float.valueOf(af0.mo28938o());
        }

        /* renamed from: b */
        public void set(af0 af0, Float f) {
            af0.mo28943t(f.floatValue());
        }
    }

    /* renamed from: af0$d */
    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public static class C3813d extends Property<af0, Float> {
        public C3813d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(af0 af0) {
            return Float.valueOf(af0.mo28939p());
        }

        /* renamed from: b */
        public void set(af0 af0, Float f) {
            af0.mo28944u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f20923o = new C3812c(cls, "animationFraction");
        f20924p = new C3813d(cls, "completeEndFraction");
    }

    public af0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f20928g = circularProgressIndicatorSpec;
        this.f20927f = new bz1();
    }

    /* renamed from: a */
    public void mo28932a() {
        ObjectAnimator objectAnimator = this.f20925d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo28933c() {
        mo28942s();
    }

    /* renamed from: d */
    public void mo28934d(C3681yj yjVar) {
        this.f20932k = yjVar;
    }

    /* renamed from: f */
    public void mo28935f() {
        if (!this.f20926e.isRunning()) {
            if (this.f33576a.isVisible()) {
                this.f20926e.start();
            } else {
                mo28932a();
            }
        }
    }

    /* renamed from: g */
    public void mo28936g() {
        mo28940q();
        mo28942s();
        this.f20925d.start();
    }

    /* renamed from: h */
    public void mo28937h() {
        this.f20932k = null;
    }

    /* renamed from: o */
    public final float mo28938o() {
        return this.f20930i;
    }

    /* renamed from: p */
    public final float mo28939p() {
        return this.f20931j;
    }

    /* renamed from: q */
    public final void mo28940q() {
        if (this.f20925d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f20923o, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f20925d = ofFloat;
            ofFloat.setDuration(5400);
            this.f20925d.setInterpolator((TimeInterpolator) null);
            this.f20925d.setRepeatCount(-1);
            this.f20925d.addListener(new C3810a());
        }
        if (this.f20926e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f20924p, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f20926e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f20926e.setInterpolator(this.f20927f);
            this.f20926e.addListener(new C3811b());
        }
    }

    /* renamed from: r */
    public final void mo28941r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo47484b(i, f20922n[i2], 333);
            if (b < Utils.FLOAT_EPSILON || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f20929h;
                int[] iArr = this.f20928g.f29760c;
                int length = i3 % iArr.length;
                this.f33578c[0] = C6774zp.m55170b().evaluate(this.f20927f.getInterpolation(b), Integer.valueOf(ro3.m51195a(iArr[length], this.f33576a.getAlpha())), Integer.valueOf(ro3.m51195a(this.f20928g.f29760c[(length + 1) % iArr.length], this.f33576a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* renamed from: s */
    public void mo28942s() {
        this.f20929h = 0;
        this.f33578c[0] = ro3.m51195a(this.f20928g.f29760c[0], this.f33576a.getAlpha());
        this.f20931j = Utils.FLOAT_EPSILON;
    }

    /* renamed from: t */
    public void mo28943t(float f) {
        this.f20930i = f;
        int i = (int) (f * 5400.0f);
        mo28945v(i);
        mo28941r(i);
        this.f33576a.invalidateSelf();
    }

    /* renamed from: u */
    public final void mo28944u(float f) {
        this.f20931j = f;
    }

    /* renamed from: v */
    public final void mo28945v(int i) {
        float[] fArr = this.f33577b;
        float f = this.f20930i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo47484b(i, f20920l[i2], 667);
            float[] fArr2 = this.f33577b;
            fArr2[1] = fArr2[1] + (this.f20927f.getInterpolation(b) * 250.0f);
            float b2 = mo47484b(i, f20921m[i2], 667);
            float[] fArr3 = this.f33577b;
            fArr3[0] = fArr3[0] + (this.f20927f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f33577b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f20931j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }
}
