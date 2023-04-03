package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;

/* renamed from: do6 */
/* compiled from: TextScale */
public class do6 extends Transition {

    /* renamed from: do6$a */
    /* compiled from: TextScale */
    public class C5740a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f28265a;

        public C5740a(TextView textView) {
            this.f28265a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f28265a.setScaleX(floatValue);
            this.f28265a.setScaleY(floatValue);
        }
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo41986u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo41986u0(bx6);
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        float f;
        if (bx6 == null || bx62 == null || !(bx6.f8292b instanceof TextView)) {
            return null;
        }
        View view = bx62.f8292b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = bx6.f8291a;
        Map<String, Object> map2 = bx62.f8291a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C5740a(textView));
        return ofFloat;
    }

    /* renamed from: u0 */
    public final void mo41986u0(bx6 bx6) {
        View view = bx6.f8292b;
        if (view instanceof TextView) {
            bx6.f8291a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }
}
