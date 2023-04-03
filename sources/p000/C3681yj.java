package p000;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: yj */
/* compiled from: Animatable2Compat */
public abstract class C3681yj {
    public Animatable2.AnimationCallback mPlatformCallback;

    /* renamed from: yj$a */
    /* compiled from: Animatable2Compat */
    public class C3682a extends Animatable2.AnimationCallback {
        public C3682a() {
        }

        public void onAnimationEnd(Drawable drawable) {
            C3681yj.this.onAnimationEnd(drawable);
        }

        public void onAnimationStart(Drawable drawable) {
            C3681yj.this.onAnimationStart(drawable);
        }
    }

    public Animatable2.AnimationCallback getPlatformCallback() {
        if (this.mPlatformCallback == null) {
            this.mPlatformCallback = new C3682a();
        }
        return this.mPlatformCallback;
    }

    public void onAnimationEnd(Drawable drawable) {
    }

    public void onAnimationStart(Drawable drawable) {
    }
}
