package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: FastScroller */
public class C1305i extends RecyclerView.C1247n implements RecyclerView.C1250q {

    /* renamed from: D */
    public static final int[] f6703D = {16842919};

    /* renamed from: E */
    public static final int[] f6704E = new int[0];

    /* renamed from: A */
    public int f6705A;

    /* renamed from: B */
    public final Runnable f6706B;

    /* renamed from: C */
    public final RecyclerView.C1251r f6707C;

    /* renamed from: a */
    public final int f6708a;

    /* renamed from: b */
    public final int f6709b;

    /* renamed from: c */
    public final StateListDrawable f6710c;

    /* renamed from: d */
    public final Drawable f6711d;

    /* renamed from: e */
    public final int f6712e;

    /* renamed from: f */
    public final int f6713f;

    /* renamed from: g */
    public final StateListDrawable f6714g;

    /* renamed from: h */
    public final Drawable f6715h;

    /* renamed from: i */
    public final int f6716i;

    /* renamed from: j */
    public final int f6717j;

    /* renamed from: k */
    public int f6718k;

    /* renamed from: l */
    public int f6719l;

    /* renamed from: m */
    public float f6720m;

    /* renamed from: n */
    public int f6721n;

    /* renamed from: o */
    public int f6722o;

    /* renamed from: p */
    public float f6723p;

    /* renamed from: q */
    public int f6724q = 0;

    /* renamed from: r */
    public int f6725r = 0;

    /* renamed from: s */
    public RecyclerView f6726s;

    /* renamed from: t */
    public boolean f6727t = false;

    /* renamed from: u */
    public boolean f6728u = false;

    /* renamed from: v */
    public int f6729v = 0;

    /* renamed from: w */
    public int f6730w = 0;

    /* renamed from: x */
    public final int[] f6731x = new int[2];

    /* renamed from: y */
    public final int[] f6732y = new int[2];

    /* renamed from: z */
    public final ValueAnimator f6733z;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: FastScroller */
    public class C1306a implements Runnable {
        public C1306a() {
        }

        public void run() {
            C1305i.this.mo9796m(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* compiled from: FastScroller */
    public class C1307b extends RecyclerView.C1251r {
        public C1307b() {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1305i.this.mo9807x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    /* compiled from: FastScroller */
    public class C1308c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f6736a = false;

        public C1308c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f6736a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f6736a) {
                this.f6736a = false;
            } else if (((Float) C1305i.this.f6733z.getAnimatedValue()).floatValue() == Utils.FLOAT_EPSILON) {
                C1305i iVar = C1305i.this;
                iVar.f6705A = 0;
                iVar.mo9804u(0);
            } else {
                C1305i iVar2 = C1305i.this;
                iVar2.f6705A = 2;
                iVar2.mo9801r();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    /* compiled from: FastScroller */
    public class C1309d implements ValueAnimator.AnimatorUpdateListener {
        public C1309d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1305i.this.f6710c.setAlpha(floatValue);
            C1305i.this.f6711d.setAlpha(floatValue);
            C1305i.this.mo9801r();
        }
    }

    public C1305i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        this.f6733z = ofFloat;
        this.f6705A = 0;
        this.f6706B = new C1306a();
        this.f6707C = new C1307b();
        this.f6710c = stateListDrawable;
        this.f6711d = drawable;
        this.f6714g = stateListDrawable2;
        this.f6715h = drawable2;
        this.f6712e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f6713f = Math.max(i, drawable.getIntrinsicWidth());
        this.f6716i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f6717j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f6708a = i2;
        this.f6709b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1308c());
        ofFloat.addUpdateListener(new C1309d());
        mo9789f(recyclerView);
    }

    /* renamed from: a */
    public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f6729v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean q = mo9800q(motionEvent.getX(), motionEvent.getY());
                boolean p = mo9799p(motionEvent.getX(), motionEvent.getY());
                if (q || p) {
                    if (p) {
                        this.f6730w = 1;
                        this.f6723p = (float) ((int) motionEvent.getX());
                    } else if (q) {
                        this.f6730w = 2;
                        this.f6720m = (float) ((int) motionEvent.getY());
                    }
                    mo9804u(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f6729v == 2) {
                this.f6720m = Utils.FLOAT_EPSILON;
                this.f6723p = Utils.FLOAT_EPSILON;
                mo9804u(1);
                this.f6730w = 0;
            } else if (motionEvent.getAction() == 2 && this.f6729v == 2) {
                mo9806w();
                if (this.f6730w == 1) {
                    mo9797n(motionEvent.getX());
                }
                if (this.f6730w == 2) {
                    mo9808y(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f6729v;
        if (i == 1) {
            boolean q = mo9800q(motionEvent.getX(), motionEvent.getY());
            boolean p = mo9799p(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!q && !p) {
                return false;
            }
            if (p) {
                this.f6730w = 1;
                this.f6723p = (float) ((int) motionEvent.getX());
            } else if (q) {
                this.f6730w = 2;
                this.f6720m = (float) ((int) motionEvent.getY());
            }
            mo9804u(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo9443e(boolean z) {
    }

    /* renamed from: f */
    public void mo9789f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6726s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo9791h();
            }
            this.f6726s = recyclerView;
            if (recyclerView != null) {
                mo9805v();
            }
        }
    }

    /* renamed from: g */
    public final void mo9790g() {
        this.f6726s.removeCallbacks(this.f6706B);
    }

    /* renamed from: h */
    public final void mo9791h() {
        this.f6726s.mo9018b1(this);
        this.f6726s.mo9040e1(this);
        this.f6726s.mo9042f1(this.f6707C);
        mo9790g();
    }

    /* renamed from: i */
    public final void mo9792i(Canvas canvas) {
        int i = this.f6725r;
        int i2 = this.f6716i;
        int i3 = i - i2;
        int i4 = this.f6722o;
        int i5 = this.f6721n;
        int i6 = i4 - (i5 / 2);
        this.f6714g.setBounds(0, 0, i5, i2);
        this.f6715h.setBounds(0, 0, this.f6724q, this.f6717j);
        canvas.translate(Utils.FLOAT_EPSILON, (float) i3);
        this.f6715h.draw(canvas);
        canvas.translate((float) i6, Utils.FLOAT_EPSILON);
        this.f6714g.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: j */
    public final void mo9793j(Canvas canvas) {
        int i = this.f6724q;
        int i2 = this.f6712e;
        int i3 = i - i2;
        int i4 = this.f6719l;
        int i5 = this.f6718k;
        int i6 = i4 - (i5 / 2);
        this.f6710c.setBounds(0, 0, i2, i5);
        this.f6711d.setBounds(0, 0, this.f6713f, this.f6725r);
        if (mo9798o()) {
            this.f6711d.draw(canvas);
            canvas.translate((float) this.f6712e, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f6710c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate((float) (-this.f6712e), (float) (-i6));
            return;
        }
        canvas.translate((float) i3, Utils.FLOAT_EPSILON);
        this.f6711d.draw(canvas);
        canvas.translate(Utils.FLOAT_EPSILON, (float) i6);
        this.f6710c.draw(canvas);
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: k */
    public final int[] mo9794k() {
        int[] iArr = this.f6732y;
        int i = this.f6709b;
        iArr[0] = i;
        iArr[1] = this.f6724q - i;
        return iArr;
    }

    /* renamed from: l */
    public final int[] mo9795l() {
        int[] iArr = this.f6731x;
        int i = this.f6709b;
        iArr[0] = i;
        iArr[1] = this.f6725r - i;
        return iArr;
    }

    /* renamed from: m */
    public void mo9796m(int i) {
        int i2 = this.f6705A;
        if (i2 == 1) {
            this.f6733z.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f6705A = 3;
        ValueAnimator valueAnimator = this.f6733z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f6733z.setDuration((long) i);
        this.f6733z.start();
    }

    /* renamed from: n */
    public final void mo9797n(float f) {
        int[] k = mo9794k();
        float max = Math.max((float) k[0], Math.min((float) k[1], f));
        if (Math.abs(((float) this.f6722o) - max) >= 2.0f) {
            int t = mo9803t(this.f6723p, max, k, this.f6726s.computeHorizontalScrollRange(), this.f6726s.computeHorizontalScrollOffset(), this.f6724q);
            if (t != 0) {
                this.f6726s.scrollBy(t, 0);
            }
            this.f6723p = max;
        }
    }

    /* renamed from: o */
    public final boolean mo9798o() {
        if (ga7.m17715B(this.f6726s) == 1) {
            return true;
        }
        return false;
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        if (this.f6724q != this.f6726s.getWidth() || this.f6725r != this.f6726s.getHeight()) {
            this.f6724q = this.f6726s.getWidth();
            this.f6725r = this.f6726s.getHeight();
            mo9804u(0);
        } else if (this.f6705A != 0) {
            if (this.f6727t) {
                mo9793j(canvas);
            }
            if (this.f6728u) {
                mo9792i(canvas);
            }
        }
    }

    /* renamed from: p */
    public boolean mo9799p(float f, float f2) {
        if (f2 >= ((float) (this.f6725r - this.f6716i))) {
            int i = this.f6722o;
            int i2 = this.f6721n;
            if (f < ((float) (i - (i2 / 2))) || f > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public boolean mo9800q(float f, float f2) {
        if (!mo9798o() ? f >= ((float) (this.f6724q - this.f6712e)) : f <= ((float) this.f6712e)) {
            int i = this.f6719l;
            int i2 = this.f6718k;
            if (f2 < ((float) (i - (i2 / 2))) || f2 > ((float) (i + (i2 / 2)))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public void mo9801r() {
        this.f6726s.invalidate();
    }

    /* renamed from: s */
    public final void mo9802s(int i) {
        mo9790g();
        this.f6726s.postDelayed(this.f6706B, (long) i);
    }

    /* renamed from: t */
    public final int mo9803t(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: u */
    public void mo9804u(int i) {
        if (i == 2 && this.f6729v != 2) {
            this.f6710c.setState(f6703D);
            mo9790g();
        }
        if (i == 0) {
            mo9801r();
        } else {
            mo9806w();
        }
        if (this.f6729v == 2 && i != 2) {
            this.f6710c.setState(f6704E);
            mo9802s(1200);
        } else if (i == 1) {
            mo9802s(1500);
        }
        this.f6729v = i;
    }

    /* renamed from: v */
    public final void mo9805v() {
        this.f6726s.mo9067h(this);
        this.f6726s.mo9079k(this);
        this.f6726s.mo9081l(this.f6707C);
    }

    /* renamed from: w */
    public void mo9806w() {
        int i = this.f6705A;
        if (i != 0) {
            if (i == 3) {
                this.f6733z.cancel();
            } else {
                return;
            }
        }
        this.f6705A = 1;
        ValueAnimator valueAnimator = this.f6733z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f6733z.setDuration(500);
        this.f6733z.setStartDelay(0);
        this.f6733z.start();
    }

    /* renamed from: x */
    public void mo9807x(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f6726s.computeVerticalScrollRange();
        int i3 = this.f6725r;
        if (computeVerticalScrollRange - i3 <= 0 || i3 < this.f6708a) {
            z = false;
        } else {
            z = true;
        }
        this.f6727t = z;
        int computeHorizontalScrollRange = this.f6726s.computeHorizontalScrollRange();
        int i4 = this.f6724q;
        if (computeHorizontalScrollRange - i4 <= 0 || i4 < this.f6708a) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f6728u = z2;
        boolean z3 = this.f6727t;
        if (z3 || z2) {
            if (z3) {
                float f = (float) i3;
                this.f6719l = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f6718k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f6728u) {
                float f2 = (float) i4;
                this.f6722o = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f6721n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f6729v;
            if (i5 == 0 || i5 == 1) {
                mo9804u(1);
            }
        } else if (this.f6729v != 0) {
            mo9804u(0);
        }
    }

    /* renamed from: y */
    public final void mo9808y(float f) {
        int[] l = mo9795l();
        float max = Math.max((float) l[0], Math.min((float) l[1], f));
        if (Math.abs(((float) this.f6719l) - max) >= 2.0f) {
            int t = mo9803t(this.f6720m, max, l, this.f6726s.computeVerticalScrollRange(), this.f6726s.computeVerticalScrollOffset(), this.f6725r);
            if (t != 0) {
                this.f6726s.scrollBy(0, t);
            }
            this.f6720m = max;
        }
    }
}
