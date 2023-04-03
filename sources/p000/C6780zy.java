package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.floatingactionbutton.C4323b;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zy */
/* compiled from: BaseMotionStrategy */
public abstract class C6780zy implements C4323b {

    /* renamed from: a */
    public final Context f36297a;

    /* renamed from: b */
    public final ExtendedFloatingActionButton f36298b;

    /* renamed from: c */
    public final ArrayList<Animator.AnimatorListener> f36299c = new ArrayList<>();

    /* renamed from: d */
    public final C6109jl f36300d;

    /* renamed from: e */
    public vy3 f36301e;

    /* renamed from: f */
    public vy3 f36302f;

    /* renamed from: zy$a */
    /* compiled from: BaseMotionStrategy */
    public class C6781a extends Property<ExtendedFloatingActionButton, Float> {
        public C6781a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C5807el.m43986a(Utils.FLOAT_EPSILON, 1.0f, (((float) Color.alpha(extendedFloatingActionButton.getCurrentTextColor())) / 255.0f) / ((float) Color.alpha(extendedFloatingActionButton.f23859w1.getColorForState(extendedFloatingActionButton.getDrawableState(), C6780zy.this.f36298b.f23859w1.getDefaultColor())))));
        }

        /* renamed from: b */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            int colorForState = extendedFloatingActionButton.f23859w1.getColorForState(extendedFloatingActionButton.getDrawableState(), C6780zy.this.f36298b.f23859w1.getDefaultColor());
            ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (C5807el.m43986a(Utils.FLOAT_EPSILON, ((float) Color.alpha(colorForState)) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f.floatValue() == 1.0f) {
                extendedFloatingActionButton.mo32653D(extendedFloatingActionButton.f23859w1);
            } else {
                extendedFloatingActionButton.mo32653D(valueOf);
            }
        }
    }

    public C6780zy(ExtendedFloatingActionButton extendedFloatingActionButton, C6109jl jlVar) {
        this.f36298b = extendedFloatingActionButton;
        this.f36297a = extendedFloatingActionButton.getContext();
        this.f36300d = jlVar;
    }

    /* renamed from: b */
    public vy3 mo32884b() {
        return this.f36302f;
    }

    /* renamed from: d */
    public final void mo32885d(vy3 vy3) {
        this.f36302f = vy3;
    }

    /* renamed from: e */
    public void mo32715e() {
        this.f36300d.mo44505b();
    }

    /* renamed from: g */
    public void mo32711g() {
        this.f36300d.mo44505b();
    }

    /* renamed from: h */
    public AnimatorSet mo32712h() {
        return mo49991l(mo49992m());
    }

    /* renamed from: i */
    public final List<Animator.AnimatorListener> mo32886i() {
        return this.f36299c;
    }

    /* renamed from: l */
    public AnimatorSet mo49991l(vy3 vy3) {
        ArrayList arrayList = new ArrayList();
        if (vy3.mo48855j("opacity")) {
            arrayList.add(vy3.mo48850f("opacity", this.f36298b, View.ALPHA));
        }
        if (vy3.mo48855j("scale")) {
            arrayList.add(vy3.mo48850f("scale", this.f36298b, View.SCALE_Y));
            arrayList.add(vy3.mo48850f("scale", this.f36298b, View.SCALE_X));
        }
        if (vy3.mo48855j("width")) {
            arrayList.add(vy3.mo48850f("width", this.f36298b, ExtendedFloatingActionButton.f23844y1));
        }
        if (vy3.mo48855j("height")) {
            arrayList.add(vy3.mo48850f("height", this.f36298b, ExtendedFloatingActionButton.f23845z1));
        }
        if (vy3.mo48855j("paddingStart")) {
            arrayList.add(vy3.mo48850f("paddingStart", this.f36298b, ExtendedFloatingActionButton.f23841A1));
        }
        if (vy3.mo48855j("paddingEnd")) {
            arrayList.add(vy3.mo48850f("paddingEnd", this.f36298b, ExtendedFloatingActionButton.f23842B1));
        }
        if (vy3.mo48855j("labelOpacity")) {
            arrayList.add(vy3.mo48850f("labelOpacity", this.f36298b, new C6781a(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        C5968il.m45767a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: m */
    public final vy3 mo49992m() {
        vy3 vy3 = this.f36302f;
        if (vy3 != null) {
            return vy3;
        }
        if (this.f36301e == null) {
            this.f36301e = vy3.m53611d(this.f36297a, mo32710f());
        }
        return (vy3) gu4.m18428f(this.f36301e);
    }

    public void onAnimationStart(Animator animator) {
        this.f36300d.mo44506c(animator);
    }
}
