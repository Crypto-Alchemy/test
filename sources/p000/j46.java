package p000;

import android.animation.ValueAnimator;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

/* renamed from: j46 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class j46 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SlideToActView f38592a;

    public /* synthetic */ j46(SlideToActView slideToActView) {
        this.f38592a = slideToActView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SlideToActView.m69707s(this.f38592a, valueAnimator);
    }
}
