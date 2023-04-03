package p000;

import android.animation.ValueAnimator;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

/* renamed from: i46 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i46 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ SlideToActView f38333a;

    public /* synthetic */ i46(SlideToActView slideToActView) {
        this.f38333a = slideToActView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SlideToActView.m69706r(this.f38333a, valueAnimator);
    }
}
