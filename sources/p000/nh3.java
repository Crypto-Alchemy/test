package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* renamed from: nh3 */
/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public final class nh3 extends rt2<ObjectAnimator> {

    /* renamed from: l */
    public static final int[] f32120l = {533, 567, 850, 750};

    /* renamed from: m */
    public static final int[] f32121m = {1267, 1000, 333, 0};

    /* renamed from: n */
    public static final Property<nh3, Float> f32122n = new C6284b(Float.class, "animationFraction");

    /* renamed from: d */
    public ObjectAnimator f32123d;

    /* renamed from: e */
    public final Interpolator[] f32124e;

    /* renamed from: f */
    public final C5943hz f32125f;

    /* renamed from: g */
    public int f32126g = 0;

    /* renamed from: h */
    public boolean f32127h;

    /* renamed from: i */
    public float f32128i;

    /* renamed from: j */
    public boolean f32129j;

    /* renamed from: k */
    public C3681yj f32130k = null;

    /* renamed from: nh3$a */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    public class C6283a extends AnimatorListenerAdapter {
        public C6283a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (nh3.this.f32129j) {
                nh3.this.f32123d.setRepeatCount(-1);
                nh3 nh3 = nh3.this;
                nh3.f32130k.onAnimationEnd(nh3.f33576a);
                boolean unused = nh3.this.f32129j = false;
            }
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            nh3 nh3 = nh3.this;
            int unused = nh3.f32126g = (nh3.f32126g + 1) % nh3.this.f32125f.f29760c.length;
            boolean unused2 = nh3.this.f32127h = true;
        }
    }

    /* renamed from: nh3$b */
    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    public static class C6284b extends Property<nh3, Float> {
        public C6284b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(nh3 nh3) {
            return Float.valueOf(nh3.mo46083q());
        }

        /* renamed from: b */
        public void set(nh3 nh3, Float f) {
            nh3.mo46087u(f.floatValue());
        }
    }

    public nh3(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f32125f = linearProgressIndicatorSpec;
        this.f32124e = new Interpolator[]{C2302fl.m17061a(context, y05.linear_indeterminate_line1_head_interpolator), C2302fl.m17061a(context, y05.linear_indeterminate_line1_tail_interpolator), C2302fl.m17061a(context, y05.linear_indeterminate_line2_head_interpolator), C2302fl.m17061a(context, y05.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: a */
    public void mo28932a() {
        ObjectAnimator objectAnimator = this.f32123d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo28933c() {
        mo46086t();
    }

    /* renamed from: d */
    public void mo28934d(C3681yj yjVar) {
        this.f32130k = yjVar;
    }

    /* renamed from: f */
    public void mo28935f() {
        if (this.f33576a.isVisible()) {
            this.f32129j = true;
            this.f32123d.setRepeatCount(0);
            return;
        }
        mo28932a();
    }

    /* renamed from: g */
    public void mo28936g() {
        mo46084r();
        mo46086t();
        this.f32123d.start();
    }

    /* renamed from: h */
    public void mo28937h() {
        this.f32130k = null;
    }

    /* renamed from: q */
    public final float mo46083q() {
        return this.f32128i;
    }

    /* renamed from: r */
    public final void mo46084r() {
        if (this.f32123d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f32122n, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f32123d = ofFloat;
            ofFloat.setDuration(1800);
            this.f32123d.setInterpolator((TimeInterpolator) null);
            this.f32123d.setRepeatCount(-1);
            this.f32123d.addListener(new C6283a());
        }
    }

    /* renamed from: s */
    public final void mo46085s() {
        if (this.f32127h) {
            Arrays.fill(this.f33578c, ro3.m51195a(this.f32125f.f29760c[this.f32126g], this.f33576a.getAlpha()));
            this.f32127h = false;
        }
    }

    /* renamed from: t */
    public void mo46086t() {
        this.f32126g = 0;
        int a = ro3.m51195a(this.f32125f.f29760c[0], this.f33576a.getAlpha());
        int[] iArr = this.f33578c;
        iArr[0] = a;
        iArr[1] = a;
    }

    /* renamed from: u */
    public void mo46087u(float f) {
        this.f32128i = f;
        mo46088v((int) (f * 1800.0f));
        mo46085s();
        this.f33576a.invalidateSelf();
    }

    /* renamed from: v */
    public final void mo46088v(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f33577b[i2] = Math.max(Utils.FLOAT_EPSILON, Math.min(1.0f, this.f32124e[i2].getInterpolation(mo47484b(i, f32121m[i2], f32120l[i2]))));
        }
    }
}
