package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {

    /* renamed from: x1 */
    public static final String[] f7119x1 = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    /* renamed from: M */
    public String[] mo10404M() {
        return f7119x1;
    }

    /* renamed from: i */
    public void mo10405i(bx6 bx6) {
        mo10456u0(bx6);
    }

    /* renamed from: m */
    public void mo10406m(bx6 bx6) {
        mo10456u0(bx6);
    }

    /* renamed from: t */
    public Animator mo10407t(ViewGroup viewGroup, bx6 bx6, bx6 bx62) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (bx6 == null || bx62 == null) {
            return null;
        }
        View view = bx62.f8292b;
        int intValue = ((Integer) bx6.f8291a.get("android:changeScroll:x")).intValue();
        int intValue2 = ((Integer) bx62.f8291a.get("android:changeScroll:x")).intValue();
        int intValue3 = ((Integer) bx6.f8291a.get("android:changeScroll:y")).intValue();
        int intValue4 = ((Integer) bx62.f8291a.get("android:changeScroll:y")).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", new int[]{intValue, intValue2});
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", new int[]{intValue3, intValue4});
        }
        return C1463d.m10221c(objectAnimator, objectAnimator2);
    }

    /* renamed from: u0 */
    public final void mo10456u0(bx6 bx6) {
        bx6.f8291a.put("android:changeScroll:x", Integer.valueOf(bx6.f8292b.getScrollX()));
        bx6.f8291a.put("android:changeScroll:y", Integer.valueOf(bx6.f8292b.getScrollY()));
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
