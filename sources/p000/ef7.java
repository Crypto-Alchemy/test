package p000;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: ef7 */
/* compiled from: ViewUtilsLollipop */
public class ef7 {

    /* renamed from: a */
    public static final int[] f28620a = {16843848};

    /* renamed from: a */
    public static void m43964a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m43965b(View view, float f) {
        int integer = view.getResources().getInteger(w35.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, j15.state_liftable, -j15.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m43966c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray h = wo6.m54004h(context, attributeSet, f28620a, i, i2, new int[0]);
        try {
            if (h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h.getResourceId(0, 0)));
            }
        } finally {
            h.recycle();
        }
    }
}
