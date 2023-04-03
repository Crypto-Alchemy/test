package p000;

import android.animation.Animator;

/* renamed from: jl */
/* compiled from: AnimatorTracker */
public class C6109jl {

    /* renamed from: a */
    public Animator f30522a;

    /* renamed from: a */
    public void mo44504a() {
        Animator animator = this.f30522a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo44505b() {
        this.f30522a = null;
    }

    /* renamed from: c */
    public void mo44506c(Animator animator) {
        mo44504a();
        this.f30522a = animator;
    }
}
