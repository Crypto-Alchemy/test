package p000;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: zh4 */
/* compiled from: OneSignalAnimate */
public class zh4 {

    /* renamed from: zh4$a */
    /* compiled from: OneSignalAnimate */
    public class C6770a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f36161a;

        public C6770a(View view) {
            this.f36161a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f36161a.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: a */
    public static Animation m55121a(View view, float f, float f2, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2);
        translateAnimation.setDuration((long) i);
        translateAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            translateAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(translateAnimation);
        return translateAnimation;
    }

    /* renamed from: b */
    public static ValueAnimator m55122b(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) i);
        valueAnimator.setIntValues(new int[]{i2, i3});
        valueAnimator.setEvaluator(new ArgbEvaluator());
        valueAnimator.addUpdateListener(new C6770a(view));
        if (animatorListener != null) {
            valueAnimator.addListener(animatorListener);
        }
        return valueAnimator;
    }

    /* renamed from: c */
    public static Animation m55123c(View view, int i, Interpolator interpolator, Animation.AnimationListener animationListener) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(Utils.FLOAT_EPSILON, 1.0f, Utils.FLOAT_EPSILON, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration((long) i);
        scaleAnimation.setInterpolator(interpolator);
        if (animationListener != null) {
            scaleAnimation.setAnimationListener(animationListener);
        }
        view.setAnimation(scaleAnimation);
        return scaleAnimation;
    }
}
