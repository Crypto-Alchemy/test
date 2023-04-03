package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Ref$BooleanRef;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

/* renamed from: e46 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e46 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f37465a;

    /* renamed from: d */
    public final /* synthetic */ Drawable f37466d;

    /* renamed from: e */
    public final /* synthetic */ SlideToActView f37467e;

    public /* synthetic */ e46(Ref$BooleanRef ref$BooleanRef, Drawable drawable, SlideToActView slideToActView) {
        this.f37465a = ref$BooleanRef;
        this.f37466d = drawable;
        this.f37467e = slideToActView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        f46.m57598e(this.f37465a, this.f37466d, this.f37467e, valueAnimator);
    }
}
