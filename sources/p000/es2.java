package p000;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p000.ww6;

/* renamed from: es2 */
/* compiled from: ImageViewTarget */
public abstract class es2<Z> extends he7<ImageView, Z> implements ww6.C3561a {

    /* renamed from: x */
    public Animatable f11356x;

    public es2(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: b */
    public void mo19468b() {
        Animatable animatable = this.f11356x;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: e */
    public void mo19469e(Z z, ww6<? super Z> ww6) {
        if (ww6 == null || !ww6.mo27614a(z, this)) {
            mo19477s(z);
        } else {
            mo19474p(z);
        }
    }

    /* renamed from: f */
    public void mo19470f(Drawable drawable) {
        super.mo19470f(drawable);
        mo19477s((Object) null);
        mo19475q(drawable);
    }

    /* renamed from: h */
    public void mo19471h(Drawable drawable) {
        super.mo19471h(drawable);
        Animatable animatable = this.f11356x;
        if (animatable != null) {
            animatable.stop();
        }
        mo19477s((Object) null);
        mo19475q(drawable);
    }

    /* renamed from: m */
    public void mo19472m(Drawable drawable) {
        super.mo19472m(drawable);
        mo19477s((Object) null);
        mo19475q(drawable);
    }

    /* renamed from: n */
    public void mo19473n() {
        Animatable animatable = this.f11356x;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: p */
    public final void mo19474p(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f11356x = animatable;
            animatable.start();
            return;
        }
        this.f11356x = null;
    }

    /* renamed from: q */
    public void mo19475q(Drawable drawable) {
        ((ImageView) this.f12837a).setImageDrawable(drawable);
    }

    /* renamed from: r */
    public abstract void mo19476r(Z z);

    /* renamed from: s */
    public final void mo19477s(Z z) {
        mo19476r(z);
        mo19474p(z);
    }
}
