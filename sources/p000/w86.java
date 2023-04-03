package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: w86 */
/* compiled from: StateListAnimator */
public final class w86 {

    /* renamed from: a */
    public final ArrayList<C6646b> f35250a = new ArrayList<>();

    /* renamed from: b */
    public C6646b f35251b = null;

    /* renamed from: c */
    public ValueAnimator f35252c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f35253d = new C6645a();

    /* renamed from: w86$a */
    /* compiled from: StateListAnimator */
    public class C6645a extends AnimatorListenerAdapter {
        public C6645a() {
        }

        public void onAnimationEnd(Animator animator) {
            w86 w86 = w86.this;
            if (w86.f35252c == animator) {
                w86.f35252c = null;
            }
        }
    }

    /* renamed from: w86$b */
    /* compiled from: StateListAnimator */
    public static class C6646b {

        /* renamed from: a */
        public final int[] f35255a;

        /* renamed from: b */
        public final ValueAnimator f35256b;

        public C6646b(int[] iArr, ValueAnimator valueAnimator) {
            this.f35255a = iArr;
            this.f35256b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo48912a(int[] iArr, ValueAnimator valueAnimator) {
        C6646b bVar = new C6646b(iArr, valueAnimator);
        valueAnimator.addListener(this.f35253d);
        this.f35250a.add(bVar);
    }
}
