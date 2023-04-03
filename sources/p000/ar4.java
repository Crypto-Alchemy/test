package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.p005ui.DefaultTimeBar;
import androidx.media3.p005ui.PlayerControlView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ar4 */
/* compiled from: PlayerControlViewLayoutManager */
public final class ar4 {

    /* renamed from: A */
    public boolean f7688A;

    /* renamed from: B */
    public boolean f7689B;

    /* renamed from: C */
    public boolean f7690C = true;

    /* renamed from: a */
    public final PlayerControlView f7691a;

    /* renamed from: b */
    public final View f7692b;

    /* renamed from: c */
    public final ViewGroup f7693c;

    /* renamed from: d */
    public final ViewGroup f7694d;

    /* renamed from: e */
    public final ViewGroup f7695e;

    /* renamed from: f */
    public final ViewGroup f7696f;

    /* renamed from: g */
    public final ViewGroup f7697g;

    /* renamed from: h */
    public final ViewGroup f7698h;

    /* renamed from: i */
    public final ViewGroup f7699i;

    /* renamed from: j */
    public final View f7700j;

    /* renamed from: k */
    public final View f7701k;

    /* renamed from: l */
    public final AnimatorSet f7702l;

    /* renamed from: m */
    public final AnimatorSet f7703m;

    /* renamed from: n */
    public final AnimatorSet f7704n;

    /* renamed from: o */
    public final AnimatorSet f7705o;

    /* renamed from: p */
    public final AnimatorSet f7706p;

    /* renamed from: q */
    public final ValueAnimator f7707q;

    /* renamed from: r */
    public final ValueAnimator f7708r;

    /* renamed from: s */
    public final Runnable f7709s = new nq4(this);

    /* renamed from: t */
    public final Runnable f7710t = new tq4(this);

    /* renamed from: u */
    public final Runnable f7711u = new uq4(this);

    /* renamed from: v */
    public final Runnable f7712v = new vq4(this);

    /* renamed from: w */
    public final Runnable f7713w = new wq4(this);

    /* renamed from: x */
    public final View.OnLayoutChangeListener f7714x = new xq4(this);

    /* renamed from: y */
    public final List<View> f7715y = new ArrayList();

    /* renamed from: z */
    public int f7716z = 0;

    /* renamed from: ar4$a */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1569a extends AnimatorListenerAdapter {
        public C1569a() {
        }

        public void onAnimationEnd(Animator animator) {
            if (ar4.this.f7692b != null) {
                ar4.this.f7692b.setVisibility(4);
            }
            if (ar4.this.f7693c != null) {
                ar4.this.f7693c.setVisibility(4);
            }
            if (ar4.this.f7695e != null) {
                ar4.this.f7695e.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if ((ar4.this.f7700j instanceof DefaultTimeBar) && !ar4.this.f7688A) {
                ((DefaultTimeBar) ar4.this.f7700j).mo8106g(250);
            }
        }
    }

    /* renamed from: ar4$b */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1570b extends AnimatorListenerAdapter {
        public C1570b() {
        }

        public void onAnimationStart(Animator animator) {
            int i = 0;
            if (ar4.this.f7692b != null) {
                ar4.this.f7692b.setVisibility(0);
            }
            if (ar4.this.f7693c != null) {
                ar4.this.f7693c.setVisibility(0);
            }
            if (ar4.this.f7695e != null) {
                ViewGroup r = ar4.this.f7695e;
                if (!ar4.this.f7688A) {
                    i = 4;
                }
                r.setVisibility(i);
            }
            if ((ar4.this.f7700j instanceof DefaultTimeBar) && !ar4.this.f7688A) {
                ((DefaultTimeBar) ar4.this.f7700j).mo8140t(250);
            }
        }
    }

    /* renamed from: ar4$c */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1571c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f7719a;

        public C1571c(PlayerControlView playerControlView) {
            this.f7719a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            ar4.this.mo11098Z(1);
            if (ar4.this.f7689B) {
                this.f7719a.post(ar4.this.f7709s);
                boolean unused = ar4.this.f7689B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            ar4.this.mo11098Z(3);
        }
    }

    /* renamed from: ar4$d */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1572d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f7721a;

        public C1572d(PlayerControlView playerControlView) {
            this.f7721a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            ar4.this.mo11098Z(2);
            if (ar4.this.f7689B) {
                this.f7721a.post(ar4.this.f7709s);
                boolean unused = ar4.this.f7689B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            ar4.this.mo11098Z(3);
        }
    }

    /* renamed from: ar4$e */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1573e extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ PlayerControlView f7723a;

        public C1573e(PlayerControlView playerControlView) {
            this.f7723a = playerControlView;
        }

        public void onAnimationEnd(Animator animator) {
            ar4.this.mo11098Z(2);
            if (ar4.this.f7689B) {
                this.f7723a.post(ar4.this.f7709s);
                boolean unused = ar4.this.f7689B = false;
            }
        }

        public void onAnimationStart(Animator animator) {
            ar4.this.mo11098Z(3);
        }
    }

    /* renamed from: ar4$f */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1574f extends AnimatorListenerAdapter {
        public C1574f() {
        }

        public void onAnimationEnd(Animator animator) {
            ar4.this.mo11098Z(0);
        }

        public void onAnimationStart(Animator animator) {
            ar4.this.mo11098Z(4);
        }
    }

    /* renamed from: ar4$g */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1575g extends AnimatorListenerAdapter {
        public C1575g() {
        }

        public void onAnimationEnd(Animator animator) {
            ar4.this.mo11098Z(0);
        }

        public void onAnimationStart(Animator animator) {
            ar4.this.mo11098Z(4);
        }
    }

    /* renamed from: ar4$h */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1576h extends AnimatorListenerAdapter {
        public C1576h() {
        }

        public void onAnimationEnd(Animator animator) {
            if (ar4.this.f7696f != null) {
                ar4.this.f7696f.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ar4.this.f7698h != null) {
                ar4.this.f7698h.setVisibility(0);
                ar4.this.f7698h.setTranslationX((float) ar4.this.f7698h.getWidth());
                ar4.this.f7698h.scrollTo(ar4.this.f7698h.getWidth(), 0);
            }
        }
    }

    /* renamed from: ar4$i */
    /* compiled from: PlayerControlViewLayoutManager */
    public class C1577i extends AnimatorListenerAdapter {
        public C1577i() {
        }

        public void onAnimationEnd(Animator animator) {
            if (ar4.this.f7698h != null) {
                ar4.this.f7698h.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ar4.this.f7696f != null) {
                ar4.this.f7696f.setVisibility(0);
            }
        }
    }

    public ar4(PlayerControlView playerControlView) {
        this.f7691a = playerControlView;
        this.f7692b = playerControlView.findViewById(z25.exo_controls_background);
        this.f7693c = (ViewGroup) playerControlView.findViewById(z25.exo_center_controls);
        this.f7695e = (ViewGroup) playerControlView.findViewById(z25.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) playerControlView.findViewById(z25.exo_bottom_bar);
        this.f7694d = viewGroup;
        this.f7699i = (ViewGroup) playerControlView.findViewById(z25.exo_time);
        View findViewById = playerControlView.findViewById(z25.exo_progress);
        this.f7700j = findViewById;
        this.f7696f = (ViewGroup) playerControlView.findViewById(z25.exo_basic_controls);
        this.f7697g = (ViewGroup) playerControlView.findViewById(z25.exo_extra_controls);
        this.f7698h = (ViewGroup) playerControlView.findViewById(z25.exo_extra_controls_scroll_view);
        View findViewById2 = playerControlView.findViewById(z25.exo_overflow_show);
        this.f7701k = findViewById2;
        View findViewById3 = playerControlView.findViewById(z25.exo_overflow_hide);
        if (!(findViewById2 == null || findViewById3 == null)) {
            findViewById2.setOnClickListener(new yq4(this));
            findViewById3.setOnClickListener(new yq4(this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, Utils.FLOAT_EPSILON});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new zq4(this));
        ofFloat.addListener(new C1569a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new oq4(this));
        ofFloat2.addListener(new C1570b());
        Resources resources = playerControlView.getResources();
        int i = h25.exo_styled_bottom_bar_height;
        float dimension = resources.getDimension(i) - resources.getDimension(h25.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7702l = animatorSet;
        animatorSet.setDuration(250);
        animatorSet.addListener(new C1571c(playerControlView));
        animatorSet.play(ofFloat).with(m10706N(Utils.FLOAT_EPSILON, dimension, findViewById)).with(m10706N(Utils.FLOAT_EPSILON, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7703m = animatorSet2;
        animatorSet2.setDuration(250);
        animatorSet2.addListener(new C1572d(playerControlView));
        animatorSet2.play(m10706N(dimension, dimension2, findViewById)).with(m10706N(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f7704n = animatorSet3;
        animatorSet3.setDuration(250);
        animatorSet3.addListener(new C1573e(playerControlView));
        animatorSet3.play(ofFloat).with(m10706N(Utils.FLOAT_EPSILON, dimension2, findViewById)).with(m10706N(Utils.FLOAT_EPSILON, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f7705o = animatorSet4;
        animatorSet4.setDuration(250);
        animatorSet4.addListener(new C1574f());
        animatorSet4.play(ofFloat2).with(m10706N(dimension, Utils.FLOAT_EPSILON, findViewById)).with(m10706N(dimension, Utils.FLOAT_EPSILON, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f7706p = animatorSet5;
        animatorSet5.setDuration(250);
        animatorSet5.addListener(new C1575g());
        animatorSet5.play(ofFloat2).with(m10706N(dimension2, Utils.FLOAT_EPSILON, findViewById)).with(m10706N(dimension2, Utils.FLOAT_EPSILON, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f7707q = ofFloat3;
        ofFloat3.setDuration(250);
        ofFloat3.addUpdateListener(new rq4(this));
        ofFloat3.addListener(new C1576h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, Utils.FLOAT_EPSILON});
        this.f7708r = ofFloat4;
        ofFloat4.setDuration(250);
        ofFloat4.addUpdateListener(new sq4(this));
        ofFloat4.addListener(new C1577i());
    }

    /* renamed from: B */
    public static int m10701B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m10702J(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f7692b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f7693c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f7695e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m10703K(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.f7692b;
        if (view != null) {
            view.setAlpha(floatValue);
        }
        ViewGroup viewGroup = this.f7693c;
        if (viewGroup != null) {
            viewGroup.setAlpha(floatValue);
        }
        ViewGroup viewGroup2 = this.f7695e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(floatValue);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m10704L(ValueAnimator valueAnimator) {
        mo11104y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m10705M(ValueAnimator valueAnimator) {
        mo11104y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: N */
    public static ObjectAnimator m10706N(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", new float[]{f, f2});
    }

    /* renamed from: z */
    public static int m10731z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: A */
    public boolean mo11079A(View view) {
        if (view == null || !this.f7715y.contains(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public void mo11080C() {
        int i = this.f7716z;
        if (i != 3 && i != 2) {
            mo11094V();
            if (!this.f7690C) {
                mo11082E();
            } else if (this.f7716z == 1) {
                mo11085H();
            } else {
                mo11081D();
            }
        }
    }

    /* renamed from: D */
    public final void mo11081D() {
        this.f7704n.start();
    }

    /* renamed from: E */
    public final void mo11082E() {
        mo11098Z(2);
    }

    /* renamed from: F */
    public void mo11083F() {
        int i = this.f7716z;
        if (i != 3 && i != 2) {
            mo11094V();
            mo11082E();
        }
    }

    /* renamed from: G */
    public final void mo11084G() {
        this.f7702l.start();
        mo11093U(this.f7711u, 2000);
    }

    /* renamed from: H */
    public final void mo11085H() {
        this.f7703m.start();
    }

    /* renamed from: I */
    public boolean mo11086I() {
        if (this.f7716z != 0 || !this.f7691a.mo8220h0()) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public void mo11087O() {
        this.f7691a.addOnLayoutChangeListener(this.f7714x);
    }

    /* renamed from: P */
    public void mo11088P() {
        this.f7691a.removeOnLayoutChangeListener(this.f7714x);
    }

    /* renamed from: Q */
    public void mo11089Q(boolean z, int i, int i2, int i3, int i4) {
        View view = this.f7692b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* renamed from: R */
    public final void mo11090R(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean e0 = mo11103e0();
        if (this.f7688A != e0) {
            this.f7688A = e0;
            view.post(new pq4(this));
        }
        if (i3 - i != i7 - i5) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f7688A && z) {
            view.post(new qq4(this));
        }
    }

    /* renamed from: S */
    public final void mo11091S() {
        int i;
        if (this.f7696f != null && this.f7697g != null) {
            int width = (this.f7691a.getWidth() - this.f7691a.getPaddingLeft()) - this.f7691a.getPaddingRight();
            while (true) {
                if (this.f7697g.getChildCount() <= 1) {
                    break;
                }
                int childCount = this.f7697g.getChildCount() - 2;
                View childAt = this.f7697g.getChildAt(childCount);
                this.f7697g.removeViewAt(childCount);
                this.f7696f.addView(childAt, 0);
            }
            View view = this.f7701k;
            if (view != null) {
                view.setVisibility(8);
            }
            int B = m10701B(this.f7699i);
            int childCount2 = this.f7696f.getChildCount() - 1;
            for (int i2 = 0; i2 < childCount2; i2++) {
                B += m10701B(this.f7696f.getChildAt(i2));
            }
            if (B > width) {
                View view2 = this.f7701k;
                if (view2 != null) {
                    view2.setVisibility(0);
                    B += m10701B(this.f7701k);
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = this.f7696f.getChildAt(i3);
                    B -= m10701B(childAt2);
                    arrayList.add(childAt2);
                    if (B <= width) {
                        break;
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f7696f.removeViews(0, arrayList.size());
                    for (i = 0; i < arrayList.size(); i++) {
                        this.f7697g.addView((View) arrayList.get(i), this.f7697g.getChildCount() - 1);
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup = this.f7698h;
            if (viewGroup != null && viewGroup.getVisibility() == 0 && !this.f7708r.isStarted()) {
                this.f7707q.cancel();
                this.f7708r.start();
            }
        }
    }

    /* renamed from: T */
    public final void mo11092T(View view) {
        mo11095W();
        if (view.getId() == z25.exo_overflow_show) {
            this.f7707q.start();
        } else if (view.getId() == z25.exo_overflow_hide) {
            this.f7708r.start();
        }
    }

    /* renamed from: U */
    public final void mo11093U(Runnable runnable, long j) {
        if (j >= 0) {
            this.f7691a.postDelayed(runnable, j);
        }
    }

    /* renamed from: V */
    public void mo11094V() {
        this.f7691a.removeCallbacks(this.f7713w);
        this.f7691a.removeCallbacks(this.f7710t);
        this.f7691a.removeCallbacks(this.f7712v);
        this.f7691a.removeCallbacks(this.f7711u);
    }

    /* renamed from: W */
    public void mo11095W() {
        if (this.f7716z != 3) {
            mo11094V();
            int showTimeoutMs = this.f7691a.getShowTimeoutMs();
            if (showTimeoutMs <= 0) {
                return;
            }
            if (!this.f7690C) {
                mo11093U(this.f7713w, (long) showTimeoutMs);
            } else if (this.f7716z == 1) {
                mo11093U(this.f7711u, 2000);
            } else {
                mo11093U(this.f7712v, (long) showTimeoutMs);
            }
        }
    }

    /* renamed from: X */
    public void mo11096X(boolean z) {
        this.f7690C = z;
    }

    /* renamed from: Y */
    public void mo11097Y(View view, boolean z) {
        if (view != null) {
            if (!z) {
                view.setVisibility(8);
                this.f7715y.remove(view);
                return;
            }
            if (!this.f7688A || !mo11099a0(view)) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
            this.f7715y.add(view);
        }
    }

    /* renamed from: Z */
    public final void mo11098Z(int i) {
        int i2 = this.f7716z;
        this.f7716z = i;
        if (i == 2) {
            this.f7691a.setVisibility(8);
        } else if (i2 == 2) {
            this.f7691a.setVisibility(0);
        }
        if (i2 != i) {
            this.f7691a.mo8221i0();
        }
    }

    /* renamed from: a0 */
    public final boolean mo11099a0(View view) {
        int id = view.getId();
        if (id == z25.exo_bottom_bar || id == z25.exo_prev || id == z25.exo_next || id == z25.exo_rew || id == z25.exo_rew_with_amount || id == z25.exo_ffwd || id == z25.exo_ffwd_with_amount) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public void mo11100b0() {
        if (!this.f7691a.mo8220h0()) {
            this.f7691a.setVisibility(0);
            this.f7691a.mo8234s0();
            this.f7691a.mo8226n0();
        }
        mo11101c0();
    }

    /* renamed from: c0 */
    public final void mo11101c0() {
        if (!this.f7690C) {
            mo11098Z(0);
            mo11095W();
            return;
        }
        int i = this.f7716z;
        if (i == 1) {
            this.f7705o.start();
        } else if (i == 2) {
            this.f7706p.start();
        } else if (i == 3) {
            this.f7689B = true;
        } else if (i == 4) {
            return;
        }
        mo11095W();
    }

    /* renamed from: d0 */
    public final void mo11102d0() {
        int i;
        int i2;
        ViewGroup viewGroup = this.f7695e;
        if (viewGroup != null) {
            if (this.f7688A) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            viewGroup.setVisibility(i2);
        }
        if (this.f7700j != null) {
            int dimensionPixelSize = this.f7691a.getResources().getDimensionPixelSize(h25.exo_styled_progress_margin_bottom);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7700j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.f7688A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f7700j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f7700j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.f7688A) {
                    defaultTimeBar.mo8108h(true);
                } else {
                    int i3 = this.f7716z;
                    if (i3 == 1) {
                        defaultTimeBar.mo8108h(false);
                    } else if (i3 != 3) {
                        defaultTimeBar.mo8126s();
                    }
                }
            }
        }
        for (View next : this.f7715y) {
            if (!this.f7688A || !mo11099a0(next)) {
                i = 0;
            } else {
                i = 4;
            }
            next.setVisibility(i);
        }
    }

    /* renamed from: e0 */
    public final boolean mo11103e0() {
        int i;
        int i2;
        int width = (this.f7691a.getWidth() - this.f7691a.getPaddingLeft()) - this.f7691a.getPaddingRight();
        int height = (this.f7691a.getHeight() - this.f7691a.getPaddingBottom()) - this.f7691a.getPaddingTop();
        int B = m10701B(this.f7693c);
        ViewGroup viewGroup = this.f7693c;
        if (viewGroup != null) {
            i = viewGroup.getPaddingLeft() + this.f7693c.getPaddingRight();
        } else {
            i = 0;
        }
        int i3 = B - i;
        int z = m10731z(this.f7693c);
        ViewGroup viewGroup2 = this.f7693c;
        if (viewGroup2 != null) {
            i2 = viewGroup2.getPaddingTop() + this.f7693c.getPaddingBottom();
        } else {
            i2 = 0;
        }
        int max = Math.max(i3, m10701B(this.f7699i) + m10701B(this.f7701k));
        int z2 = (z - i2) + (m10731z(this.f7694d) * 2);
        if (width <= max || height <= z2) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final void mo11104y(float f) {
        ViewGroup viewGroup = this.f7698h;
        if (viewGroup != null) {
            this.f7698h.setTranslationX((float) ((int) (((float) viewGroup.getWidth()) * (1.0f - f))));
        }
        ViewGroup viewGroup2 = this.f7699i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f7696f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }
}
