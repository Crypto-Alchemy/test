package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.github.mikephil.charting.utils.Utils;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    public class C1430a extends C1459b {

        /* renamed from: a */
        public final /* synthetic */ View f7153a;

        public C1430a(View view) {
            this.f7153a = view;
        }

        public void onTransitionEnd(Transition transition) {
            qe7.m25632h(this.f7153a, 1.0f);
            qe7.m25625a(this.f7153a);
            transition.mo10517e0(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    public static class C1431b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f7155a;

        /* renamed from: d */
        public boolean f7156d = false;

        public C1431b(View view) {
            this.f7155a = view;
        }

        public void onAnimationEnd(Animator animator) {
            qe7.m25632h(this.f7155a, 1.0f);
            if (this.f7156d) {
                this.f7155a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ga7.m17743P(this.f7155a) && this.f7155a.getLayerType() == 0) {
                this.f7156d = true;
                this.f7155a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i) {
        mo10566C0(i);
    }

    /* renamed from: G0 */
    public static float m10053G0(bx6 bx6, float f) {
        Float f2;
        if (bx6 == null || (f2 = (Float) bx6.f8291a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }

    /* renamed from: B0 */
    public Animator mo10482B0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        qe7.m25629e(view);
        return mo10485F0(view, m10053G0(bx6, 1.0f), Utils.FLOAT_EPSILON);
    }

    /* renamed from: F0 */
    public final Animator mo10485F0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        qe7.m25632h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, qe7.f16930b, new float[]{f2});
        ofFloat.addListener(new C1431b(view));
        mo10510a(new C1430a(view));
        return ofFloat;
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        super.mo10406m(bx6);
        bx6.f8291a.put("android:fade:transitionAlpha", Float.valueOf(qe7.m25627c(bx6.f8292b)));
    }

    /* renamed from: z0 */
    public Animator mo10484z0(ViewGroup viewGroup, View view, bx6 bx6, bx6 bx62) {
        float f = Utils.FLOAT_EPSILON;
        float G0 = m10053G0(bx6, Utils.FLOAT_EPSILON);
        if (G0 != 1.0f) {
            f = G0;
        }
        return mo10485F0(view, f, 1.0f);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fc6.f11769f);
        mo10566C0(e27.m15648g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo10568v0()));
        obtainStyledAttributes.recycle();
    }
}
