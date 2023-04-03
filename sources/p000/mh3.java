package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* renamed from: mh3 */
/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
public final class mh3 extends rt2<ObjectAnimator> {

    /* renamed from: j */
    public static final Property<mh3, Float> f31698j = new C6250b(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f31699d;

    /* renamed from: e */
    public bz1 f31700e;

    /* renamed from: f */
    public final C5943hz f31701f;

    /* renamed from: g */
    public int f31702g = 1;

    /* renamed from: h */
    public boolean f31703h;

    /* renamed from: i */
    public float f31704i;

    /* renamed from: mh3$a */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    public class C6249a extends AnimatorListenerAdapter {
        public C6249a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            mh3 mh3 = mh3.this;
            int unused = mh3.f31702g = (mh3.f31702g + 1) % mh3.this.f31701f.f29760c.length;
            boolean unused2 = mh3.this.f31703h = true;
        }
    }

    /* renamed from: mh3$b */
    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    public static class C6250b extends Property<mh3, Float> {
        public C6250b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(mh3 mh3) {
            return Float.valueOf(mh3.mo45790n());
        }

        /* renamed from: b */
        public void set(mh3 mh3, Float f) {
            mh3.mo45794r(f.floatValue());
        }
    }

    public mh3(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f31701f = linearProgressIndicatorSpec;
        this.f31700e = new bz1();
    }

    /* renamed from: a */
    public void mo28932a() {
        ObjectAnimator objectAnimator = this.f31699d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo28933c() {
        mo45793q();
    }

    /* renamed from: d */
    public void mo28934d(C3681yj yjVar) {
    }

    /* renamed from: f */
    public void mo28935f() {
    }

    /* renamed from: g */
    public void mo28936g() {
        mo45791o();
        mo45793q();
        this.f31699d.start();
    }

    /* renamed from: h */
    public void mo28937h() {
    }

    /* renamed from: n */
    public final float mo45790n() {
        return this.f31704i;
    }

    /* renamed from: o */
    public final void mo45791o() {
        if (this.f31699d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f31698j, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f31699d = ofFloat;
            ofFloat.setDuration(333);
            this.f31699d.setInterpolator((TimeInterpolator) null);
            this.f31699d.setRepeatCount(-1);
            this.f31699d.addListener(new C6249a());
        }
    }

    /* renamed from: p */
    public final void mo45792p() {
        if (this.f31703h && this.f33577b[3] < 1.0f) {
            int[] iArr = this.f33578c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = ro3.m51195a(this.f31701f.f29760c[this.f31702g], this.f33576a.getAlpha());
            this.f31703h = false;
        }
    }

    /* renamed from: q */
    public void mo45793q() {
        this.f31703h = true;
        this.f31702g = 1;
        Arrays.fill(this.f33578c, ro3.m51195a(this.f31701f.f29760c[0], this.f33576a.getAlpha()));
    }

    /* renamed from: r */
    public void mo45794r(float f) {
        this.f31704i = f;
        mo45795s((int) (f * 333.0f));
        mo45792p();
        this.f33576a.invalidateSelf();
    }

    /* renamed from: s */
    public final void mo45795s(int i) {
        this.f33577b[0] = 0.0f;
        float b = mo47484b(i, 0, 667);
        float[] fArr = this.f33577b;
        float interpolation = this.f31700e.getInterpolation(b);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f33577b;
        float interpolation2 = this.f31700e.getInterpolation(b + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f33577b[5] = 1.0f;
    }
}
