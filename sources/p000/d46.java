package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

/* renamed from: d46 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d46 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ Drawable f37243a;

    /* renamed from: d */
    public final /* synthetic */ SlideToActView f37244d;

    public /* synthetic */ d46(Drawable drawable, SlideToActView slideToActView) {
        this.f37243a = drawable;
        this.f37244d = slideToActView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f46.m57597d(this.f37243a, this.f37244d, valueAnimator);
    }
}
