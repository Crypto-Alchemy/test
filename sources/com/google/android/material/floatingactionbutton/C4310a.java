package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* compiled from: FloatingActionButtonImpl */
public class C4310a {

    /* renamed from: F */
    public static final TimeInterpolator f23899F = C5807el.f28630c;

    /* renamed from: G */
    public static final int[] f23900G = {16842919, 16842910};

    /* renamed from: H */
    public static final int[] f23901H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    public static final int[] f23902I = {16842908, 16842910};

    /* renamed from: J */
    public static final int[] f23903J = {16843623, 16842910};

    /* renamed from: K */
    public static final int[] f23904K = {16842910};

    /* renamed from: L */
    public static final int[] f23905L = new int[0];

    /* renamed from: A */
    public final Rect f23906A = new Rect();

    /* renamed from: B */
    public final RectF f23907B = new RectF();

    /* renamed from: C */
    public final RectF f23908C = new RectF();

    /* renamed from: D */
    public final Matrix f23909D = new Matrix();

    /* renamed from: E */
    public ViewTreeObserver.OnPreDrawListener f23910E;

    /* renamed from: a */
    public rz5 f23911a;

    /* renamed from: b */
    public uo3 f23912b;

    /* renamed from: c */
    public Drawable f23913c;

    /* renamed from: d */
    public t30 f23914d;

    /* renamed from: e */
    public Drawable f23915e;

    /* renamed from: f */
    public boolean f23916f;

    /* renamed from: g */
    public boolean f23917g = true;

    /* renamed from: h */
    public float f23918h;

    /* renamed from: i */
    public float f23919i;

    /* renamed from: j */
    public float f23920j;

    /* renamed from: k */
    public int f23921k;

    /* renamed from: l */
    public final w86 f23922l;

    /* renamed from: m */
    public vy3 f23923m;

    /* renamed from: n */
    public vy3 f23924n;

    /* renamed from: o */
    public Animator f23925o;

    /* renamed from: p */
    public vy3 f23926p;

    /* renamed from: q */
    public vy3 f23927q;

    /* renamed from: r */
    public float f23928r;

    /* renamed from: s */
    public float f23929s = 1.0f;

    /* renamed from: t */
    public int f23930t;

    /* renamed from: u */
    public int f23931u = 0;

    /* renamed from: v */
    public ArrayList<Animator.AnimatorListener> f23932v;

    /* renamed from: w */
    public ArrayList<Animator.AnimatorListener> f23933w;

    /* renamed from: x */
    public ArrayList<C4319i> f23934x;

    /* renamed from: y */
    public final FloatingActionButton f23935y;

    /* renamed from: z */
    public final pz5 f23936z;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a */
    /* compiled from: FloatingActionButtonImpl */
    public class C4311a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f23937a;

        /* renamed from: d */
        public final /* synthetic */ boolean f23938d;

        /* renamed from: e */
        public final /* synthetic */ C4320j f23939e;

        public C4311a(boolean z, C4320j jVar) {
            this.f23938d = z;
            this.f23939e = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f23937a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int i;
            int unused = C4310a.this.f23931u = 0;
            Animator unused2 = C4310a.this.f23925o = null;
            if (!this.f23937a) {
                FloatingActionButton floatingActionButton = C4310a.this.f23935y;
                boolean z = this.f23938d;
                if (z) {
                    i = 8;
                } else {
                    i = 4;
                }
                floatingActionButton.mo33013b(i, z);
                C4320j jVar = this.f23939e;
                if (jVar != null) {
                    jVar.mo32807b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C4310a.this.f23935y.mo33013b(0, this.f23938d);
            int unused = C4310a.this.f23931u = 1;
            Animator unused2 = C4310a.this.f23925o = animator;
            this.f23937a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$b */
    /* compiled from: FloatingActionButtonImpl */
    public class C4312b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f23941a;

        /* renamed from: d */
        public final /* synthetic */ C4320j f23942d;

        public C4312b(boolean z, C4320j jVar) {
            this.f23941a = z;
            this.f23942d = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C4310a.this.f23931u = 0;
            Animator unused2 = C4310a.this.f23925o = null;
            C4320j jVar = this.f23942d;
            if (jVar != null) {
                jVar.mo32806a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C4310a.this.f23935y.mo33013b(0, this.f23941a);
            int unused = C4310a.this.f23931u = 2;
            Animator unused2 = C4310a.this.f23925o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$c */
    /* compiled from: FloatingActionButtonImpl */
    public class C4313c extends ip3 {
        public C4313c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            float unused = C4310a.this.f23929s = f;
            return super.mo32876a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$d */
    /* compiled from: FloatingActionButtonImpl */
    public class C4314d implements TypeEvaluator<Float> {

        /* renamed from: a */
        public FloatEvaluator f23945a = new FloatEvaluator();

        public C4314d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f23945a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = Utils.FLOAT_EPSILON;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$e */
    /* compiled from: FloatingActionButtonImpl */
    public class C4315e implements ViewTreeObserver.OnPreDrawListener {
        public C4315e() {
        }

        public boolean onPreDraw() {
            C4310a.this.mo32821G();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$f */
    /* compiled from: FloatingActionButtonImpl */
    public class C4316f extends C4322l {
        public C4316f() {
            super(C4310a.this, (C4311a) null);
        }

        /* renamed from: a */
        public float mo32881a() {
            return Utils.FLOAT_EPSILON;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$g */
    /* compiled from: FloatingActionButtonImpl */
    public class C4317g extends C4322l {
        public C4317g() {
            super(C4310a.this, (C4311a) null);
        }

        /* renamed from: a */
        public float mo32881a() {
            C4310a aVar = C4310a.this;
            return aVar.f23918h + aVar.f23919i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$h */
    /* compiled from: FloatingActionButtonImpl */
    public class C4318h extends C4322l {
        public C4318h() {
            super(C4310a.this, (C4311a) null);
        }

        /* renamed from: a */
        public float mo32881a() {
            C4310a aVar = C4310a.this;
            return aVar.f23918h + aVar.f23920j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$i */
    /* compiled from: FloatingActionButtonImpl */
    public interface C4319i {
        /* renamed from: a */
        void mo32811a();

        /* renamed from: b */
        void mo32812b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$j */
    /* compiled from: FloatingActionButtonImpl */
    public interface C4320j {
        /* renamed from: a */
        void mo32806a();

        /* renamed from: b */
        void mo32807b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$k */
    /* compiled from: FloatingActionButtonImpl */
    public class C4321k extends C4322l {
        public C4321k() {
            super(C4310a.this, (C4311a) null);
        }

        /* renamed from: a */
        public float mo32881a() {
            return C4310a.this.f23918h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.a$l */
    /* compiled from: FloatingActionButtonImpl */
    public abstract class C4322l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public boolean f23952a;

        /* renamed from: d */
        public float f23953d;

        /* renamed from: e */
        public float f23954e;

        public C4322l() {
        }

        /* renamed from: a */
        public abstract float mo32881a();

        public void onAnimationEnd(Animator animator) {
            C4310a.this.mo32849f0((float) ((int) this.f23954e));
            this.f23952a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f;
            if (!this.f23952a) {
                uo3 uo3 = C4310a.this.f23912b;
                if (uo3 == null) {
                    f = Utils.FLOAT_EPSILON;
                } else {
                    f = uo3.mo48477w();
                }
                this.f23953d = f;
                this.f23954e = mo32881a();
                this.f23952a = true;
            }
            C4310a aVar = C4310a.this;
            float f2 = this.f23953d;
            aVar.mo32849f0((float) ((int) (f2 + ((this.f23954e - f2) * valueAnimator.getAnimatedFraction()))));
        }

        public /* synthetic */ C4322l(C4310a aVar, C4311a aVar2) {
            this();
        }
    }

    public C4310a(FloatingActionButton floatingActionButton, pz5 pz5) {
        this.f23935y = floatingActionButton;
        this.f23936z = pz5;
        w86 w86 = new w86();
        this.f23922l = w86;
        w86.mo48912a(f23900G, mo32853i(new C4318h()));
        w86.mo48912a(f23901H, mo32853i(new C4317g()));
        w86.mo48912a(f23902I, mo32853i(new C4317g()));
        w86.mo48912a(f23903J, mo32853i(new C4317g()));
        w86.mo48912a(f23904K, mo32853i(new C4321k()));
        w86.mo48912a(f23905L, mo32853i(new C4316f()));
        this.f23928r = floatingActionButton.getRotation();
    }

    /* renamed from: A */
    public void mo32815A() {
        uo3 uo3 = this.f23912b;
        if (uo3 != null) {
            vo3.m53444f(this.f23935y, uo3);
        }
        if (mo32824J()) {
            this.f23935y.getViewTreeObserver().addOnPreDrawListener(mo32861q());
        }
    }

    /* renamed from: B */
    public void mo32816B() {
        throw null;
    }

    /* renamed from: C */
    public void mo32817C() {
        ViewTreeObserver viewTreeObserver = this.f23935y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f23910E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f23910E = null;
        }
    }

    /* renamed from: D */
    public void mo32818D(int[] iArr) {
        throw null;
    }

    /* renamed from: E */
    public void mo32819E(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: F */
    public void mo32820F(Rect rect) {
        gu4.m18429g(this.f23915e, "Didn't initialize content background");
        if (mo32839Y()) {
            this.f23936z.mo32809b(new InsetDrawable(this.f23915e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f23936z.mo32809b(this.f23915e);
    }

    /* renamed from: G */
    public void mo32821G() {
        float rotation = this.f23935y.getRotation();
        if (this.f23928r != rotation) {
            this.f23928r = rotation;
            mo32843c0();
        }
    }

    /* renamed from: H */
    public void mo32822H() {
        ArrayList<C4319i> arrayList = this.f23934x;
        if (arrayList != null) {
            Iterator<C4319i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo32812b();
            }
        }
    }

    /* renamed from: I */
    public void mo32823I() {
        ArrayList<C4319i> arrayList = this.f23934x;
        if (arrayList != null) {
            Iterator<C4319i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo32811a();
            }
        }
    }

    /* renamed from: J */
    public boolean mo32824J() {
        throw null;
    }

    /* renamed from: K */
    public void mo32825K(ColorStateList colorStateList) {
        uo3 uo3 = this.f23912b;
        if (uo3 != null) {
            uo3.setTintList(colorStateList);
        }
        t30 t30 = this.f23914d;
        if (t30 != null) {
            t30.mo47963c(colorStateList);
        }
    }

    /* renamed from: L */
    public void mo32826L(PorterDuff.Mode mode) {
        uo3 uo3 = this.f23912b;
        if (uo3 != null) {
            uo3.setTintMode(mode);
        }
    }

    /* renamed from: M */
    public final void mo32827M(float f) {
        if (this.f23918h != f) {
            this.f23918h = f;
            mo32819E(f, this.f23919i, this.f23920j);
        }
    }

    /* renamed from: N */
    public void mo32828N(boolean z) {
        this.f23916f = z;
    }

    /* renamed from: O */
    public final void mo32829O(vy3 vy3) {
        this.f23927q = vy3;
    }

    /* renamed from: P */
    public final void mo32830P(float f) {
        if (this.f23919i != f) {
            this.f23919i = f;
            mo32819E(this.f23918h, f, this.f23920j);
        }
    }

    /* renamed from: Q */
    public final void mo32831Q(float f) {
        this.f23929s = f;
        Matrix matrix = this.f23909D;
        mo32850g(f, matrix);
        this.f23935y.setImageMatrix(matrix);
    }

    /* renamed from: R */
    public final void mo32832R(int i) {
        if (this.f23930t != i) {
            this.f23930t = i;
            mo32845d0();
        }
    }

    /* renamed from: S */
    public void mo32833S(int i) {
        this.f23921k = i;
    }

    /* renamed from: T */
    public final void mo32834T(float f) {
        if (this.f23920j != f) {
            this.f23920j = f;
            mo32819E(this.f23918h, this.f23919i, f);
        }
    }

    /* renamed from: U */
    public void mo32835U(ColorStateList colorStateList) {
        Drawable drawable = this.f23913c;
        if (drawable != null) {
            ij1.m19656o(drawable, bh5.m32533d(colorStateList));
        }
    }

    /* renamed from: V */
    public void mo32836V(boolean z) {
        this.f23917g = z;
        mo32847e0();
    }

    /* renamed from: W */
    public final void mo32837W(rz5 rz5) {
        this.f23911a = rz5;
        uo3 uo3 = this.f23912b;
        if (uo3 != null) {
            uo3.setShapeAppearanceModel(rz5);
        }
        Drawable drawable = this.f23913c;
        if (drawable instanceof vz5) {
            ((vz5) drawable).setShapeAppearanceModel(rz5);
        }
        t30 t30 = this.f23914d;
        if (t30 != null) {
            t30.mo47967f(rz5);
        }
    }

    /* renamed from: X */
    public final void mo32838X(vy3 vy3) {
        this.f23926p = vy3;
    }

    /* renamed from: Y */
    public boolean mo32839Y() {
        throw null;
    }

    /* renamed from: Z */
    public final boolean mo32840Z() {
        if (!ga7.m17747T(this.f23935y) || this.f23935y.isInEditMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public final boolean mo32841a0() {
        if (!this.f23916f || this.f23935y.getSizeDimension() >= this.f23921k) {
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    public void mo32842b0(C4320j jVar, boolean z) {
        if (!mo32869y()) {
            Animator animator = this.f23925o;
            if (animator != null) {
                animator.cancel();
            }
            if (mo32840Z()) {
                if (this.f23935y.getVisibility() != 0) {
                    this.f23935y.setAlpha(Utils.FLOAT_EPSILON);
                    this.f23935y.setScaleY(Utils.FLOAT_EPSILON);
                    this.f23935y.setScaleX(Utils.FLOAT_EPSILON);
                    mo32831Q(Utils.FLOAT_EPSILON);
                }
                vy3 vy3 = this.f23926p;
                if (vy3 == null) {
                    vy3 = mo32856l();
                }
                AnimatorSet h = mo32852h(vy3, 1.0f, 1.0f, 1.0f);
                h.addListener(new C4312b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f23932v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f23935y.mo33013b(0, z);
            this.f23935y.setAlpha(1.0f);
            this.f23935y.setScaleY(1.0f);
            this.f23935y.setScaleX(1.0f);
            mo32831Q(1.0f);
            if (jVar != null) {
                jVar.mo32806a();
            }
        }
    }

    /* renamed from: c0 */
    public void mo32843c0() {
        throw null;
    }

    /* renamed from: d */
    public void mo32844d(Animator.AnimatorListener animatorListener) {
        if (this.f23933w == null) {
            this.f23933w = new ArrayList<>();
        }
        this.f23933w.add(animatorListener);
    }

    /* renamed from: d0 */
    public final void mo32845d0() {
        mo32831Q(this.f23929s);
    }

    /* renamed from: e */
    public void mo32846e(Animator.AnimatorListener animatorListener) {
        if (this.f23932v == null) {
            this.f23932v = new ArrayList<>();
        }
        this.f23932v.add(animatorListener);
    }

    /* renamed from: e0 */
    public final void mo32847e0() {
        Rect rect = this.f23906A;
        mo32862r(rect);
        mo32820F(rect);
        this.f23936z.mo32808a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: f */
    public void mo32848f(C4319i iVar) {
        if (this.f23934x == null) {
            this.f23934x = new ArrayList<>();
        }
        this.f23934x.add(iVar);
    }

    /* renamed from: f0 */
    public void mo32849f0(float f) {
        uo3 uo3 = this.f23912b;
        if (uo3 != null) {
            uo3.mo48439Z(f);
        }
    }

    /* renamed from: g */
    public final void mo32850g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f23935y.getDrawable();
        if (drawable != null && this.f23930t != 0) {
            RectF rectF = this.f23907B;
            RectF rectF2 = this.f23908C;
            rectF.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f23930t;
            rectF2.set(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f23930t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: g0 */
    public final void mo32851g0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C4314d());
        }
    }

    /* renamed from: h */
    public final AnimatorSet mo32852h(vy3 vy3, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f23935y, View.ALPHA, new float[]{f});
        vy3.mo48852h("opacity").mo49320a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f23935y, View.SCALE_X, new float[]{f2});
        vy3.mo48852h("scale").mo49320a(ofFloat2);
        mo32851g0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f23935y, View.SCALE_Y, new float[]{f2});
        vy3.mo48852h("scale").mo49320a(ofFloat3);
        mo32851g0(ofFloat3);
        arrayList.add(ofFloat3);
        mo32850g(f3, this.f23909D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f23935y, new yq2(), new C4313c(), new Matrix[]{new Matrix(this.f23909D)});
        vy3.mo48852h("iconScale").mo49320a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C5968il.m45767a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    public final ValueAnimator mo32853i(C4322l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f23899F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        return valueAnimator;
    }

    /* renamed from: j */
    public final Drawable mo32854j() {
        return this.f23915e;
    }

    /* renamed from: k */
    public final vy3 mo32855k() {
        if (this.f23924n == null) {
            this.f23924n = vy3.m53611d(this.f23935y.getContext(), y05.design_fab_hide_motion_spec);
        }
        return (vy3) gu4.m18428f(this.f23924n);
    }

    /* renamed from: l */
    public final vy3 mo32856l() {
        if (this.f23923m == null) {
            this.f23923m = vy3.m53611d(this.f23935y.getContext(), y05.design_fab_show_motion_spec);
        }
        return (vy3) gu4.m18428f(this.f23923m);
    }

    /* renamed from: m */
    public float mo32857m() {
        throw null;
    }

    /* renamed from: n */
    public boolean mo32858n() {
        return this.f23916f;
    }

    /* renamed from: o */
    public final vy3 mo32859o() {
        return this.f23927q;
    }

    /* renamed from: p */
    public float mo32860p() {
        return this.f23919i;
    }

    /* renamed from: q */
    public final ViewTreeObserver.OnPreDrawListener mo32861q() {
        if (this.f23910E == null) {
            this.f23910E = new C4315e();
        }
        return this.f23910E;
    }

    /* renamed from: r */
    public void mo32862r(Rect rect) {
        int i;
        float f;
        if (this.f23916f) {
            i = (this.f23921k - this.f23935y.getSizeDimension()) / 2;
        } else {
            i = 0;
        }
        if (this.f23917g) {
            f = mo32857m() + this.f23920j;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        int max = Math.max(i, (int) Math.ceil((double) f));
        int max2 = Math.max(i, (int) Math.ceil((double) (f * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: s */
    public float mo32863s() {
        return this.f23920j;
    }

    /* renamed from: t */
    public final rz5 mo32864t() {
        return this.f23911a;
    }

    /* renamed from: u */
    public final vy3 mo32865u() {
        return this.f23926p;
    }

    /* renamed from: v */
    public void mo32866v(C4320j jVar, boolean z) {
        int i;
        if (!mo32868x()) {
            Animator animator = this.f23925o;
            if (animator != null) {
                animator.cancel();
            }
            if (mo32840Z()) {
                vy3 vy3 = this.f23927q;
                if (vy3 == null) {
                    vy3 = mo32855k();
                }
                AnimatorSet h = mo32852h(vy3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                h.addListener(new C4311a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f23933w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            FloatingActionButton floatingActionButton = this.f23935y;
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            floatingActionButton.mo33013b(i, z);
            if (jVar != null) {
                jVar.mo32807b();
            }
        }
    }

    /* renamed from: w */
    public void mo32867w(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* renamed from: x */
    public boolean mo32868x() {
        if (this.f23935y.getVisibility() == 0) {
            if (this.f23931u == 1) {
                return true;
            }
            return false;
        } else if (this.f23931u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: y */
    public boolean mo32869y() {
        if (this.f23935y.getVisibility() != 0) {
            if (this.f23931u == 2) {
                return true;
            }
            return false;
        } else if (this.f23931u != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: z */
    public void mo32870z() {
        throw null;
    }
}
