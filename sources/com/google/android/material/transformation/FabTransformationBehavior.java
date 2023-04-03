package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.circularreveal.C4243a;
import com.google.android.material.circularreveal.C4245b;
import com.google.android.material.circularreveal.C4247c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f24669c = new Rect();

    /* renamed from: d */
    public final RectF f24670d = new RectF();

    /* renamed from: e */
    public final RectF f24671e = new RectF();

    /* renamed from: f */
    public final int[] f24672f = new int[2];

    /* renamed from: g */
    public float f24673g;

    /* renamed from: h */
    public float f24674h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C4461a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f24675a;

        /* renamed from: d */
        public final /* synthetic */ View f24676d;

        /* renamed from: e */
        public final /* synthetic */ View f24677e;

        public C4461a(boolean z, View view, View view2) {
            this.f24675a = z;
            this.f24676d = view;
            this.f24677e = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24675a) {
                this.f24676d.setVisibility(4);
                this.f24677e.setAlpha(1.0f);
                this.f24677e.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24675a) {
                this.f24676d.setVisibility(0);
                this.f24677e.setAlpha(Utils.FLOAT_EPSILON);
                this.f24677e.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C4462b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f24679a;

        public C4462b(View view) {
            this.f24679a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24679a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C4463c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4247c f24681a;

        /* renamed from: d */
        public final /* synthetic */ Drawable f24682d;

        public C4463c(C4247c cVar, Drawable drawable) {
            this.f24681a = cVar;
            this.f24682d = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f24681a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f24681a.setCircularRevealOverlayDrawable(this.f24682d);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C4464d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C4247c f24684a;

        public C4464d(C4247c cVar) {
            this.f24684a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            C4247c.C4252e revealInfo = this.f24684a.getRevealInfo();
            revealInfo.f23707c = Float.MAX_VALUE;
            this.f24684a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C4465e {

        /* renamed from: a */
        public vy3 f24686a;

        /* renamed from: b */
        public nt4 f24687b;
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: A */
    public abstract C4465e mo34103A(Context context, boolean z);

    /* renamed from: B */
    public final ViewGroup mo34104B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* renamed from: f */
    public AnimatorSet mo34101f(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C4465e A = mo34103A(view2.getContext(), z3);
        if (z3) {
            this.f24673g = view.getTranslationX();
            this.f24674h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mo34118t(view, view2, z, z2, A, arrayList, arrayList2);
        RectF rectF = this.f24670d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        mo34123y(view3, view4, z4, z2, A, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        mo34117s(view3, view4, z4, A, arrayList);
        boolean z5 = z2;
        C4465e eVar = A;
        mo34120v(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        mo34119u(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        mo34116r(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        mo34115q(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C5968il.m45767a(animatorSet, arrayList);
        animatorSet.addListener(new C4461a(z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: g */
    public final ViewGroup mo34105g(View view) {
        View findViewById = view.findViewById(g35.mtrl_child_content_container);
        if (findViewById != null) {
            return mo34104B(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return mo34104B(((ViewGroup) view).getChildAt(0));
        }
        return mo34104B(view);
    }

    /* renamed from: h */
    public final void mo34106h(View view, C4465e eVar, wy3 wy3, wy3 wy32, float f, float f2, float f3, float f4, RectF rectF) {
        float o = mo34113o(eVar, wy3, f, f3);
        float o2 = mo34113o(eVar, wy32, f2, f4);
        Rect rect = this.f24669c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f24670d;
        rectF2.set(rect);
        RectF rectF3 = this.f24671e;
        mo34114p(view, rectF3);
        rectF3.offset(o, o2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: i */
    public final void mo34107i(View view, RectF rectF) {
        mo34114p(view, rectF);
        rectF.offset(this.f24673g, this.f24674h);
    }

    /* renamed from: j */
    public final Pair<wy3, wy3> mo34108j(float f, float f2, boolean z, C4465e eVar) {
        wy3 wy3;
        wy3 wy32;
        int i;
        if (f == Utils.FLOAT_EPSILON || f2 == Utils.FLOAT_EPSILON) {
            wy32 = eVar.f24686a.mo48852h("translationXLinear");
            wy3 = eVar.f24686a.mo48852h("translationYLinear");
        } else if ((!z || f2 >= Utils.FLOAT_EPSILON) && (z || i <= 0)) {
            wy32 = eVar.f24686a.mo48852h("translationXCurveDownwards");
            wy3 = eVar.f24686a.mo48852h("translationYCurveDownwards");
        } else {
            wy32 = eVar.f24686a.mo48852h("translationXCurveUpwards");
            wy3 = eVar.f24686a.mo48852h("translationYCurveUpwards");
        }
        return new Pair<>(wy32, wy3);
    }

    /* renamed from: k */
    public final float mo34109k(View view, View view2, nt4 nt4) {
        RectF rectF = this.f24670d;
        RectF rectF2 = this.f24671e;
        mo34107i(view, rectF);
        mo34114p(view2, rectF2);
        rectF2.offset(-mo34111m(view, view2, nt4), Utils.FLOAT_EPSILON);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: l */
    public final float mo34110l(View view, View view2, nt4 nt4) {
        RectF rectF = this.f24670d;
        RectF rectF2 = this.f24671e;
        mo34107i(view, rectF);
        mo34114p(view2, rectF2);
        rectF2.offset(Utils.FLOAT_EPSILON, -mo34112n(view, view2, nt4));
        return rectF.centerY() - rectF2.top;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: m */
    public final float mo34111m(View view, View view2, nt4 nt4) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24670d;
        RectF rectF2 = this.f24671e;
        mo34107i(view, rectF);
        mo34114p(view2, rectF2);
        int i = nt4.f32175a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = Utils.FLOAT_EPSILON;
            return f + nt4.f32176b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + nt4.f32176b;
    }

    /* renamed from: n */
    public final float mo34112n(View view, View view2, nt4 nt4) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f24670d;
        RectF rectF2 = this.f24671e;
        mo34107i(view, rectF);
        mo34114p(view2, rectF2);
        int i = nt4.f32175a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = Utils.FLOAT_EPSILON;
            return f + nt4.f32177c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + nt4.f32177c;
    }

    /* renamed from: o */
    public final float mo34113o(C4465e eVar, wy3 wy3, float f, float f2) {
        long c = wy3.mo49321c();
        long d = wy3.mo49322d();
        wy3 h = eVar.f24686a.mo48852h("expansion");
        return C5807el.m43986a(f, f2, wy3.mo49323e().getInterpolation(((float) (((h.mo49321c() + h.mo49322d()) + 17) - c)) / ((float) d)));
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.C0546e eVar) {
        if (eVar.f3356h == 0) {
            eVar.f3356h = 80;
        }
    }

    /* renamed from: p */
    public final void mo34114p(View view, RectF rectF) {
        rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f24672f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: q */
    public final void mo34115q(View view, View view2, boolean z, boolean z2, C4465e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup g;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C4247c) || C4245b.f23691j != 0) && (g = mo34105g(view2)) != null) {
                if (z) {
                    if (!z2) {
                        ke0.f30853a.set(g, Float.valueOf(Utils.FLOAT_EPSILON));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(g, ke0.f30853a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(g, ke0.f30853a, new float[]{0.0f});
                }
                eVar.f24686a.mo48852h("contentFade").mo49320a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: r */
    public final void mo34116r(View view, View view2, boolean z, boolean z2, C4465e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C4247c) {
            C4247c cVar = (C4247c) view2;
            int z3 = mo34124z(view);
            int i = 16777215 & z3;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(z3);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, C4247c.C4251d.f23704a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, C4247c.C4251d.f23704a, new int[]{z3});
            }
            objectAnimator.setEvaluator(C6774zp.m55170b());
            eVar.f24686a.mo48852h("color").mo49320a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: s */
    public final void mo34117s(View view, View view2, boolean z, C4465e eVar, List<Animator> list) {
        float m = mo34111m(view, view2, eVar.f24687b);
        float n = mo34112n(view, view2, eVar.f24687b);
        Pair<wy3, wy3> j = mo34108j(m, n, z, eVar);
        wy3 wy3 = (wy3) j.first;
        wy3 wy32 = (wy3) j.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            m = this.f24673g;
        }
        fArr[0] = m;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            n = this.f24674h;
        }
        fArr2[0] = n;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        wy3.mo49320a(ofFloat);
        wy32.mo49320a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: t */
    public final void mo34118t(View view, View view2, boolean z, boolean z2, C4465e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w = ga7.m17798w(view2) - ga7.m17798w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-w);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-w});
        }
        eVar.f24686a.mo48852h("elevation").mo49320a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: u */
    public final void mo34119u(View view, View view2, boolean z, boolean z2, C4465e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C4465e eVar2 = eVar;
        if (view4 instanceof C4247c) {
            C4247c cVar = (C4247c) view4;
            float k = mo34109k(view3, view4, eVar2.f24687b);
            float l = mo34110l(view3, view4, eVar2.f24687b);
            ((FloatingActionButton) view3).mo32742i(this.f24669c);
            float width = ((float) this.f24669c.width()) / 2.0f;
            wy3 h = eVar2.f24686a.mo48852h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new C4247c.C4252e(k, l, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f23707c;
                }
                animator = C4243a.m35162a(cVar, k, l, dp3.m43581b(k, l, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, f, f2));
                animator.addListener(new C4464d(cVar));
                mo34122x(view2, h.mo49321c(), (int) k, (int) l, width, list);
            } else {
                float f3 = cVar.getRevealInfo().f23707c;
                Animator a = C4243a.m35162a(cVar, k, l, width);
                int i = (int) k;
                int i2 = (int) l;
                View view5 = view2;
                mo34122x(view5, h.mo49321c(), i, i2, f3, list);
                long c = h.mo49321c();
                long d = h.mo49322d();
                long i3 = eVar2.f24686a.mo48854i();
                mo34121w(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo49320a(animator);
            list.add(animator);
            list2.add(C4243a.m35163b(cVar));
        }
    }

    /* renamed from: v */
    public final void mo34120v(View view, View view2, boolean z, boolean z2, C4465e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C4247c) && (view instanceof ImageView)) {
            C4247c cVar = (C4247c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, gj1.f29239b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, gj1.f29239b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C4462b(view2));
                eVar.f24686a.mo48852h("iconFade").mo49320a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C4463c(cVar, drawable));
            }
        }
    }

    /* renamed from: w */
    public final void mo34121w(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        long j4 = j + j2;
        if (j4 < j3) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(j4);
            createCircularReveal.setDuration(j3 - j4);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: x */
    public final void mo34122x(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: y */
    public final void mo34123y(View view, View view2, boolean z, boolean z2, C4465e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C4465e eVar2 = eVar;
        List<Animator> list3 = list;
        float m = mo34111m(view3, view4, eVar2.f24687b);
        float n = mo34112n(view3, view4, eVar2.f24687b);
        Pair<wy3, wy3> j = mo34108j(m, n, z3, eVar2);
        wy3 wy3 = (wy3) j.first;
        wy3 wy32 = (wy3) j.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-m);
                view4.setTranslationY(-n);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            mo34106h(view2, eVar, wy3, wy32, -m, -n, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-m});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-n});
        }
        wy3.mo49320a(objectAnimator2);
        wy32.mo49320a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: z */
    public final int mo34124z(View view) {
        ColorStateList s = ga7.m17790s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
