package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wj1 */
/* compiled from: DrawableWithAnimatedVisibilityChange */
public abstract class wj1 extends Drawable implements Animatable {

    /* renamed from: L */
    public static final Property<wj1, Float> f35346L = new C6664c(Float.class, "growFraction");

    /* renamed from: A */
    public C3681yj f35347A;

    /* renamed from: B */
    public boolean f35348B;

    /* renamed from: C */
    public float f35349C;

    /* renamed from: H */
    public final Paint f35350H = new Paint();

    /* renamed from: I */
    public int f35351I;

    /* renamed from: a */
    public final Context f35352a;

    /* renamed from: d */
    public final C5943hz f35353d;

    /* renamed from: e */
    public C5865gl f35354e;

    /* renamed from: g */
    public ValueAnimator f35355g;

    /* renamed from: k */
    public ValueAnimator f35356k;

    /* renamed from: r */
    public boolean f35357r;

    /* renamed from: s */
    public boolean f35358s;

    /* renamed from: x */
    public float f35359x;

    /* renamed from: y */
    public List<C3681yj> f35360y;

    /* renamed from: wj1$a */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    public class C6662a extends AnimatorListenerAdapter {
        public C6662a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            wj1.this.mo49203e();
        }
    }

    /* renamed from: wj1$b */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    public class C6663b extends AnimatorListenerAdapter {
        public C6663b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = wj1.super.setVisible(false, false);
            wj1.this.mo49202d();
        }
    }

    /* renamed from: wj1$c */
    /* compiled from: DrawableWithAnimatedVisibilityChange */
    public static class C6664c extends Property<wj1, Float> {
        public C6664c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(wj1 wj1) {
            return Float.valueOf(wj1.mo49205g());
        }

        /* renamed from: b */
        public void set(wj1 wj1, Float f) {
            wj1.mo49207m(f.floatValue());
        }
    }

    public wj1(Context context, C5943hz hzVar) {
        this.f35352a = context;
        this.f35353d = hzVar;
        this.f35354e = new C5865gl();
        setAlpha(255);
    }

    /* renamed from: d */
    public final void mo49202d() {
        C3681yj yjVar = this.f35347A;
        if (yjVar != null) {
            yjVar.onAnimationEnd(this);
        }
        List<C3681yj> list = this.f35360y;
        if (list != null && !this.f35348B) {
            for (C3681yj onAnimationEnd : list) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: e */
    public final void mo49203e() {
        C3681yj yjVar = this.f35347A;
        if (yjVar != null) {
            yjVar.onAnimationStart(this);
        }
        List<C3681yj> list = this.f35360y;
        if (list != null && !this.f35348B) {
            for (C3681yj onAnimationStart : list) {
                onAnimationStart.onAnimationStart(this);
            }
        }
    }

    /* renamed from: f */
    public final void mo49204f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f35348B;
        this.f35348B = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f35348B = z;
    }

    /* renamed from: g */
    public float mo49205g() {
        if (!this.f35353d.mo43429b() && !this.f35353d.mo43428a()) {
            return 1.0f;
        }
        if (this.f35358s || this.f35357r) {
            return this.f35359x;
        }
        return this.f35349C;
    }

    public int getAlpha() {
        return this.f35351I;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo42564h() {
        return mo42571p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo42565i() {
        ValueAnimator valueAnimator = this.f35356k;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && !this.f35358s) {
            return false;
        }
        return true;
    }

    public boolean isRunning() {
        if (mo42567j() || mo42565i()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo42567j() {
        ValueAnimator valueAnimator = this.f35355g;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && !this.f35357r) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo49206k() {
        if (this.f35355g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f35346L, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f35355g = ofFloat;
            ofFloat.setDuration(500);
            this.f35355g.setInterpolator(C5807el.f28629b);
            mo49209o(this.f35355g);
        }
        if (this.f35356k == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f35346L, new float[]{1.0f, Utils.FLOAT_EPSILON});
            this.f35356k = ofFloat2;
            ofFloat2.setDuration(500);
            this.f35356k.setInterpolator(C5807el.f28629b);
            mo49208n(this.f35356k);
        }
    }

    /* renamed from: l */
    public void mo42569l(C3681yj yjVar) {
        if (this.f35360y == null) {
            this.f35360y = new ArrayList();
        }
        if (!this.f35360y.contains(yjVar)) {
            this.f35360y.add(yjVar);
        }
    }

    /* renamed from: m */
    public void mo49207m(float f) {
        if (this.f35349C != f) {
            this.f35349C = f;
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public final void mo49208n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35356k;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f35356k = valueAnimator;
            valueAnimator.addListener(new C6663b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: o */
    public final void mo49209o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f35355g;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f35355g = valueAnimator;
            valueAnimator.addListener(new C6662a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* renamed from: p */
    public boolean mo42571p(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a = this.f35354e.mo42905a(this.f35352a.getContentResolver());
        if (!z3 || a <= Utils.FLOAT_EPSILON) {
            z4 = false;
        } else {
            z4 = true;
        }
        return mo42572q(z, z2, z4);
    }

    /* renamed from: q */
    public boolean mo42572q(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean z5;
        mo49206k();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f35355g;
        } else {
            valueAnimator = this.f35356k;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                mo49204f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z || super.setVisible(z, false)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z) {
                z5 = this.f35353d.mo43429b();
            } else {
                z5 = this.f35353d.mo43428a();
            }
            if (!z5) {
                mo49204f(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo42573r(C3681yj yjVar) {
        List<C3681yj> list = this.f35360y;
        if (list == null || !list.contains(yjVar)) {
            return false;
        }
        this.f35360y.remove(yjVar);
        if (!this.f35360y.isEmpty()) {
            return true;
        }
        this.f35360y = null;
        return true;
    }

    public void setAlpha(int i) {
        this.f35351I = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35350H.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo42571p(z, z2, true);
    }

    public void start() {
        mo42572q(true, true, false);
    }

    public void stop() {
        mo42572q(false, true, false);
    }
}
