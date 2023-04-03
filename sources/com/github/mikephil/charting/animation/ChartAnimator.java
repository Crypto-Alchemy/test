package com.github.mikephil.charting.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.utils.Utils;

public class ChartAnimator {
    private ValueAnimator.AnimatorUpdateListener mListener;
    public float mPhaseX = 1.0f;
    public float mPhaseY = 1.0f;

    public ChartAnimator() {
    }

    private ObjectAnimator xAnimator(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    private ObjectAnimator yAnimator(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat.setInterpolator(easingFunction);
        ofFloat.setDuration((long) i);
        return ofFloat;
    }

    public void animateX(int i) {
        animateX(i, Easing.Linear);
    }

    public void animateXY(int i, int i2) {
        Easing.EasingFunction easingFunction = Easing.Linear;
        animateXY(i, i2, easingFunction, easingFunction);
    }

    public void animateY(int i) {
        animateY(i, Easing.Linear);
    }

    public float getPhaseX() {
        return this.mPhaseX;
    }

    public float getPhaseY() {
        return this.mPhaseY;
    }

    public void setPhaseX(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        this.mPhaseX = f;
    }

    public void setPhaseY(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < Utils.FLOAT_EPSILON) {
            f = 0.0f;
        }
        this.mPhaseY = f;
    }

    public void animateX(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        xAnimator.addUpdateListener(this.mListener);
        xAnimator.start();
    }

    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        ObjectAnimator yAnimator = yAnimator(i2, easingFunction);
        if (i > i2) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }

    public void animateY(int i, Easing.EasingFunction easingFunction) {
        ObjectAnimator yAnimator = yAnimator(i, easingFunction);
        yAnimator.addUpdateListener(this.mListener);
        yAnimator.start();
    }

    public ChartAnimator(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mListener = animatorUpdateListener;
    }

    public void animateXY(int i, int i2, Easing.EasingFunction easingFunction, Easing.EasingFunction easingFunction2) {
        ObjectAnimator xAnimator = xAnimator(i, easingFunction);
        ObjectAnimator yAnimator = yAnimator(i2, easingFunction2);
        if (i > i2) {
            xAnimator.addUpdateListener(this.mListener);
        } else {
            yAnimator.addUpdateListener(this.mListener);
        }
        xAnimator.start();
        yAnimator.start();
    }
}
