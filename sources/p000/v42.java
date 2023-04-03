package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.floatingactionbutton.C4310a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* renamed from: v42 */
/* compiled from: FloatingActionButtonImplLollipop */
public class v42 extends C4310a {

    /* renamed from: v42$a */
    /* compiled from: FloatingActionButtonImplLollipop */
    public static class C6597a extends uo3 {
        public C6597a(rz5 rz5) {
            super(rz5);
        }

        public boolean isStateful() {
            return true;
        }
    }

    public v42(FloatingActionButton floatingActionButton, pz5 pz5) {
        super(floatingActionButton, pz5);
    }

    /* renamed from: B */
    public void mo32816B() {
        mo32847e0();
    }

    /* renamed from: D */
    public void mo32818D(int[] iArr) {
    }

    /* renamed from: E */
    public void mo32819E(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C4310a.f23900G, mo48658i0(f, f3));
        stateListAnimator.addState(C4310a.f23901H, mo48658i0(f, f2));
        stateListAnimator.addState(C4310a.f23902I, mo48658i0(f, f2));
        stateListAnimator.addState(C4310a.f23903J, mo48658i0(f, f2));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f23935y, "elevation", new float[]{f}).setDuration(0));
        if (i <= 24) {
            FloatingActionButton floatingActionButton = this.f23935y;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f23935y, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C4310a.f23899F);
        stateListAnimator.addState(C4310a.f23904K, animatorSet);
        stateListAnimator.addState(C4310a.f23905L, mo48658i0(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON));
        this.f23935y.setStateListAnimator(stateListAnimator);
        if (mo32839Y()) {
            mo32847e0();
        }
    }

    /* renamed from: J */
    public boolean mo32824J() {
        return false;
    }

    /* renamed from: U */
    public void mo32835U(ColorStateList colorStateList) {
        Drawable drawable = this.f23913c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(bh5.m32533d(colorStateList));
        } else {
            super.mo32835U(colorStateList);
        }
    }

    /* renamed from: Y */
    public boolean mo32839Y() {
        if (this.f23936z.mo32810c() || !mo32841a0()) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public void mo32843c0() {
    }

    /* renamed from: h0 */
    public t30 mo48657h0(int i, ColorStateList colorStateList) {
        Context context = this.f23935y.getContext();
        t30 t30 = new t30((rz5) gu4.m18428f(this.f23911a));
        t30.mo47966e(zr0.m31440c(context, w15.design_fab_stroke_top_outer_color), zr0.m31440c(context, w15.design_fab_stroke_top_inner_color), zr0.m31440c(context, w15.design_fab_stroke_end_inner_color), zr0.m31440c(context, w15.design_fab_stroke_end_outer_color));
        t30.mo47964d((float) i);
        t30.mo47963c(colorStateList);
        return t30;
    }

    /* renamed from: i0 */
    public final Animator mo48658i0(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f23935y, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f23935y, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C4310a.f23899F);
        return animatorSet;
    }

    /* renamed from: j0 */
    public uo3 mo48659j0() {
        return new C6597a((rz5) gu4.m18428f(this.f23911a));
    }

    /* renamed from: m */
    public float mo32857m() {
        return this.f23935y.getElevation();
    }

    /* renamed from: r */
    public void mo32862r(Rect rect) {
        if (this.f23936z.mo32810c()) {
            super.mo32862r(rect);
        } else if (!mo32841a0()) {
            int sizeDimension = (this.f23921k - this.f23935y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: w */
    public void mo32867w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        uo3 j0 = mo48659j0();
        this.f23912b = j0;
        j0.setTintList(colorStateList);
        if (mode != null) {
            this.f23912b.setTintMode(mode);
        }
        this.f23912b.mo48430P(this.f23935y.getContext());
        if (i > 0) {
            this.f23914d = mo48657h0(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{(Drawable) gu4.m18428f(this.f23914d), (Drawable) gu4.m18428f(this.f23912b)});
        } else {
            this.f23914d = null;
            drawable = this.f23912b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(bh5.m32533d(colorStateList2), drawable, (Drawable) null);
        this.f23913c = rippleDrawable;
        this.f23915e = rippleDrawable;
    }

    /* renamed from: z */
    public void mo32870z() {
    }
}
