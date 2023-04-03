package p000;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$BooleanRef;
import net.safemoon.androidwallet.views.slidetoact.SlideToActView;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0006H\u0002¨\u0006\u0019"}, mo44877d2 = {"Lf46;", "", "Landroid/content/Context;", "context", "", "value", "Landroid/graphics/drawable/Drawable;", "g", "(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;", "icon", "color", "Lr37;", "i", "(Landroid/graphics/drawable/Drawable;I)V", "Lnet/safemoon/androidwallet/views/slidetoact/SlideToActView;", "view", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "listener", "Landroid/animation/ValueAnimator;", "c", "h", "", "f", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f46 */
/* compiled from: SlideToActIconUtil.kt */
public final class f46 {

    /* renamed from: a */
    public static final f46 f37724a = new f46();

    /* renamed from: d */
    public static final void m57597d(Drawable drawable, SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(drawable, "$icon");
        vx2.m53591g(slideToActView, "$view");
        vx2.m53591g(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        vx2.m53589e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        drawable.setAlpha(((Integer) animatedValue).intValue());
        slideToActView.invalidate();
    }

    /* renamed from: e */
    public static final void m57598e(Ref$BooleanRef ref$BooleanRef, Drawable drawable, SlideToActView slideToActView, ValueAnimator valueAnimator) {
        vx2.m53591g(ref$BooleanRef, "$startedOnce");
        vx2.m53591g(drawable, "$icon");
        vx2.m53591g(slideToActView, "$view");
        vx2.m53591g(valueAnimator, "it");
        if (!ref$BooleanRef.element) {
            f37724a.mo51598h(drawable);
            slideToActView.invalidate();
            ref$BooleanRef.element = true;
        }
    }

    /* renamed from: c */
    public final ValueAnimator mo51595c(SlideToActView slideToActView, Drawable drawable, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        vx2.m53591g(slideToActView, "view");
        vx2.m53591g(drawable, "icon");
        vx2.m53591g(animatorUpdateListener, "listener");
        if (mo51596f(drawable)) {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 255});
            ofInt.addUpdateListener(animatorUpdateListener);
            ofInt.addUpdateListener(new d46(drawable, slideToActView));
            vx2.m53590f(ofInt, "tickAnimator");
            return ofInt;
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0});
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ofInt2.addUpdateListener(animatorUpdateListener);
        ofInt2.addUpdateListener(new e46(ref$BooleanRef, drawable, slideToActView));
        vx2.m53590f(ofInt2, "tickAnimator");
        return ofInt2;
    }

    /* renamed from: f */
    public final boolean mo51596f(Drawable drawable) {
        if (Build.VERSION.SDK_INT > 24 && (drawable instanceof AnimatedVectorDrawable)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Drawable mo51597g(Context context, int i) {
        vx2.m53591g(context, "context");
        Drawable drawable = context.getResources().getDrawable(i, context.getTheme());
        vx2.m53590f(drawable, "{\n            context.re… context.theme)\n        }");
        return drawable;
    }

    /* renamed from: h */
    public final void mo51598h(Drawable drawable) {
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (drawable instanceof C3273sk) {
            ((C3273sk) drawable).start();
        }
    }

    /* renamed from: i */
    public final void mo51599i(Drawable drawable, int i) {
        vx2.m53591g(drawable, "icon");
        drawable.setTint(i);
    }
}
