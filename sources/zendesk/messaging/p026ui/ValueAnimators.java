package zendesk.messaging.p026ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: zendesk.messaging.ui.ValueAnimators */
class ValueAnimators {
    public static ValueAnimator topMarginAnimator(final View view, int i, int i2, long j) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration(j);
        return ofInt;
    }

    public static ValueAnimator topPaddingAnimator(View view, int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, ofInt) {
            public final int paddingBottom;
            public final int paddingLeft;
            public final int paddingRight;
            public final /* synthetic */ ValueAnimator val$valueAnimator;
            public final /* synthetic */ View val$view;

            {
                this.val$view = r1;
                this.val$valueAnimator = r2;
                this.paddingLeft = r1.getPaddingLeft();
                this.paddingRight = r1.getPaddingRight();
                this.paddingBottom = r1.getPaddingBottom();
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.val$view.setPadding(this.paddingLeft, ((Integer) this.val$valueAnimator.getAnimatedValue()).intValue(), this.paddingRight, this.paddingBottom);
            }
        });
        ofInt.setDuration(j);
        return ofInt;
    }
}
