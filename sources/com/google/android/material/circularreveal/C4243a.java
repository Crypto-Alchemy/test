package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.C4247c;

/* renamed from: com.google.android.material.circularreveal.a */
/* compiled from: CircularRevealCompat */
public final class C4243a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    /* compiled from: CircularRevealCompat */
    public static class C4244a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4247c f23690a;

        public C4244a(C4247c cVar) {
            this.f23690a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f23690a.mo32426b();
        }

        public void onAnimationStart(Animator animator) {
            this.f23690a.mo32425a();
        }
    }

    /* renamed from: a */
    public static Animator m35162a(C4247c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C4247c.C4250c.f23703a, C4247c.C4249b.f23701b, new C4247c.C4252e[]{new C4247c.C4252e(f, f2, f3)});
        C4247c.C4252e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f23707c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m35163b(C4247c cVar) {
        return new C4244a(cVar);
    }
}
