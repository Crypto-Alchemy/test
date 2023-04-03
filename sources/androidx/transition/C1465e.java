package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

/* renamed from: androidx.transition.e */
/* compiled from: TranslationAnimationCreator */
public class C1465e {

    /* renamed from: androidx.transition.e$a */
    /* compiled from: TranslationAnimationCreator */
    public static class C1466a extends AnimatorListenerAdapter implements Transition.C1446f {

        /* renamed from: a */
        public final View f7271a;

        /* renamed from: d */
        public final View f7272d;

        /* renamed from: e */
        public final int f7273e;

        /* renamed from: g */
        public final int f7274g;

        /* renamed from: k */
        public int[] f7275k;

        /* renamed from: r */
        public float f7276r;

        /* renamed from: s */
        public float f7277s;

        /* renamed from: x */
        public final float f7278x;

        /* renamed from: y */
        public final float f7279y;

        public C1466a(View view, View view2, int i, int i2, float f, float f2) {
            this.f7272d = view;
            this.f7271a = view2;
            this.f7273e = i - Math.round(view.getTranslationX());
            this.f7274g = i2 - Math.round(view.getTranslationY());
            this.f7278x = f;
            this.f7279y = f2;
            int i3 = e35.transition_position;
            int[] iArr = (int[]) view2.getTag(i3);
            this.f7275k = iArr;
            if (iArr != null) {
                view2.setTag(i3, (Object) null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f7275k == null) {
                this.f7275k = new int[2];
            }
            this.f7275k[0] = Math.round(((float) this.f7273e) + this.f7272d.getTranslationX());
            this.f7275k[1] = Math.round(((float) this.f7274g) + this.f7272d.getTranslationY());
            this.f7271a.setTag(e35.transition_position, this.f7275k);
        }

        public void onAnimationPause(Animator animator) {
            this.f7276r = this.f7272d.getTranslationX();
            this.f7277s = this.f7272d.getTranslationY();
            this.f7272d.setTranslationX(this.f7278x);
            this.f7272d.setTranslationY(this.f7279y);
        }

        public void onAnimationResume(Animator animator) {
            this.f7272d.setTranslationX(this.f7276r);
            this.f7272d.setTranslationY(this.f7277s);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f7272d.setTranslationX(this.f7278x);
            this.f7272d.setTranslationY(this.f7279y);
            transition.mo10517e0(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    public static Animator m10223a(View view, bx6 bx6, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        View view2 = view;
        bx6 bx62 = bx6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) bx62.f8292b.getTag(e35.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C1466a aVar = new C1466a(view, bx62.f8292b, round, round2, translationX, translationY);
        transition.mo10510a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C2688kl.m20816a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
