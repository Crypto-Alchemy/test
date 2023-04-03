package p000;

import android.view.View;

/* renamed from: yk */
/* compiled from: AnimationEngine */
public abstract class C3683yk implements Runnable {

    /* renamed from: a */
    public final View f20246a;

    /* renamed from: d */
    public final t82 f20247d;

    public C3683yk(View view) {
        t82 t82;
        this.f20246a = view;
        if (of2.m23786b()) {
            t82 = new t82();
        } else {
            t82 = null;
        }
        this.f20247d = t82;
    }

    /* renamed from: a */
    public abstract boolean mo12225a();

    /* renamed from: b */
    public final void mo28136b() {
        this.f20246a.removeCallbacks(this);
        this.f20246a.postOnAnimationDelayed(this, 10);
    }

    /* renamed from: c */
    public void mo28137c() {
        t82 t82 = this.f20247d;
        if (t82 != null) {
            t82.mo26286a();
        }
        mo28136b();
    }

    public final void run() {
        boolean a = mo12225a();
        t82 t82 = this.f20247d;
        if (t82 != null) {
            t82.mo26287b();
            if (!a) {
                this.f20247d.mo26288c();
            }
        }
        if (a) {
            mo28136b();
        }
    }
}
