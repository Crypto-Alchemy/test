package p000;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: yt */
/* compiled from: AutoScrollHelper */
public abstract class C3692yt implements View.OnTouchListener {

    /* renamed from: Q */
    public static final int f20338Q = ViewConfiguration.getTapTimeout();

    /* renamed from: A */
    public float[] f20339A = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: B */
    public float[] f20340B = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: C */
    public boolean f20341C;

    /* renamed from: H */
    public boolean f20342H;

    /* renamed from: I */
    public boolean f20343I;

    /* renamed from: L */
    public boolean f20344L;

    /* renamed from: M */
    public boolean f20345M;

    /* renamed from: P */
    public boolean f20346P;

    /* renamed from: a */
    public final C3693a f20347a = new C3693a();

    /* renamed from: d */
    public final Interpolator f20348d = new AccelerateInterpolator();

    /* renamed from: e */
    public final View f20349e;

    /* renamed from: g */
    public Runnable f20350g;

    /* renamed from: k */
    public float[] f20351k = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: r */
    public float[] f20352r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s */
    public int f20353s;

    /* renamed from: x */
    public int f20354x;

    /* renamed from: y */
    public float[] f20355y = {Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON};

    /* renamed from: yt$a */
    /* compiled from: AutoScrollHelper */
    public static class C3693a {

        /* renamed from: a */
        public int f20356a;

        /* renamed from: b */
        public int f20357b;

        /* renamed from: c */
        public float f20358c;

        /* renamed from: d */
        public float f20359d;

        /* renamed from: e */
        public long f20360e = Long.MIN_VALUE;

        /* renamed from: f */
        public long f20361f = 0;

        /* renamed from: g */
        public int f20362g = 0;

        /* renamed from: h */
        public int f20363h = 0;

        /* renamed from: i */
        public long f20364i = -1;

        /* renamed from: j */
        public float f20365j;

        /* renamed from: k */
        public int f20366k;

        /* renamed from: a */
        public void mo28224a() {
            if (this.f20361f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = mo28230g(mo28228e(currentAnimationTimeMillis));
                this.f20361f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f20361f)) * g;
                this.f20362g = (int) (this.f20358c * f);
                this.f20363h = (int) (f * this.f20359d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo28225b() {
            return this.f20362g;
        }

        /* renamed from: c */
        public int mo28226c() {
            return this.f20363h;
        }

        /* renamed from: d */
        public int mo28227d() {
            float f = this.f20358c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: e */
        public final float mo28228e(long j) {
            long j2 = this.f20360e;
            if (j < j2) {
                return Utils.FLOAT_EPSILON;
            }
            long j3 = this.f20364i;
            if (j3 < 0 || j < j3) {
                return C3692yt.m30780e(((float) (j - j2)) / ((float) this.f20356a), Utils.FLOAT_EPSILON, 1.0f) * 0.5f;
            }
            float f = this.f20365j;
            return (1.0f - f) + (f * C3692yt.m30780e(((float) (j - j3)) / ((float) this.f20366k), Utils.FLOAT_EPSILON, 1.0f));
        }

        /* renamed from: f */
        public int mo28229f() {
            float f = this.f20359d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: g */
        public final float mo28230g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: h */
        public boolean mo28231h() {
            if (this.f20364i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= this.f20364i + ((long) this.f20366k)) {
                return false;
            }
            return true;
        }

        /* renamed from: i */
        public void mo28232i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f20366k = C3692yt.m30781f((int) (currentAnimationTimeMillis - this.f20360e), 0, this.f20357b);
            this.f20365j = mo28228e(currentAnimationTimeMillis);
            this.f20364i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo28233j(int i) {
            this.f20357b = i;
        }

        /* renamed from: k */
        public void mo28234k(int i) {
            this.f20356a = i;
        }

        /* renamed from: l */
        public void mo28235l(float f, float f2) {
            this.f20358c = f;
            this.f20359d = f2;
        }

        /* renamed from: m */
        public void mo28236m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f20360e = currentAnimationTimeMillis;
            this.f20364i = -1;
            this.f20361f = currentAnimationTimeMillis;
            this.f20365j = 0.5f;
            this.f20362g = 0;
            this.f20363h = 0;
        }
    }

    /* renamed from: yt$b */
    /* compiled from: AutoScrollHelper */
    public class C3694b implements Runnable {
        public C3694b() {
        }

        public void run() {
            C3692yt ytVar = C3692yt.this;
            if (ytVar.f20344L) {
                if (ytVar.f20342H) {
                    ytVar.f20342H = false;
                    ytVar.f20347a.mo28236m();
                }
                C3693a aVar = C3692yt.this.f20347a;
                if (aVar.mo28231h() || !C3692yt.this.mo28222u()) {
                    C3692yt.this.f20344L = false;
                    return;
                }
                C3692yt ytVar2 = C3692yt.this;
                if (ytVar2.f20343I) {
                    ytVar2.f20343I = false;
                    ytVar2.mo28206c();
                }
                aVar.mo28224a();
                C3692yt.this.mo19918j(aVar.mo28225b(), aVar.mo28226c());
                ga7.m17769h0(C3692yt.this.f20349e, this);
            }
        }
    }

    public C3692yt(View view) {
        this.f20349e = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo28215o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo28217p(f3, f3);
        mo28212l(1);
        mo28214n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo28220s(0.2f, 0.2f);
        mo28221t(1.0f, 1.0f);
        mo28211k(f20338Q);
        mo28219r(500);
        mo28218q(500);
    }

    /* renamed from: e */
    public static float m30780e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    public static int m30781f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public abstract boolean mo19916a(int i);

    /* renamed from: b */
    public abstract boolean mo19917b(int i);

    /* renamed from: c */
    public void mo28206c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
        this.f20349e.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float mo28207d(int i, float f, float f2, float f3) {
        float h = mo28209h(this.f20351k[i], f2, this.f20352r[i], f);
        int i2 = (h > Utils.FLOAT_EPSILON ? 1 : (h == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i2 == 0) {
            return Utils.FLOAT_EPSILON;
        }
        float f4 = this.f20355y[i];
        float f5 = this.f20339A[i];
        float f6 = this.f20340B[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return m30780e(h * f7, f5, f6);
        }
        return -m30780e((-h) * f7, f5, f6);
    }

    /* renamed from: g */
    public final float mo28208g(float f, float f2) {
        if (f2 == Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        }
        int i = this.f20353s;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= Utils.FLOAT_EPSILON) {
                    return 1.0f - (f / f2);
                }
                if (!this.f20344L || i != 1) {
                    return Utils.FLOAT_EPSILON;
                }
                return 1.0f;
            }
        } else if (i == 2 && f < Utils.FLOAT_EPSILON) {
            return f / (-f2);
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    public final float mo28209h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m30780e(f * f2, Utils.FLOAT_EPSILON, f3);
        float g = mo28208g(f2 - f4, e) - mo28208g(f4, e);
        if (g < Utils.FLOAT_EPSILON) {
            f5 = -this.f20348d.getInterpolation(-g);
        } else if (g <= Utils.FLOAT_EPSILON) {
            return Utils.FLOAT_EPSILON;
        } else {
            f5 = this.f20348d.getInterpolation(g);
        }
        return m30780e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void mo28210i() {
        if (this.f20342H) {
            this.f20344L = false;
        } else {
            this.f20347a.mo28232i();
        }
    }

    /* renamed from: j */
    public abstract void mo19918j(int i, int i2);

    /* renamed from: k */
    public C3692yt mo28211k(int i) {
        this.f20354x = i;
        return this;
    }

    /* renamed from: l */
    public C3692yt mo28212l(int i) {
        this.f20353s = i;
        return this;
    }

    /* renamed from: m */
    public C3692yt mo28213m(boolean z) {
        if (this.f20345M && !z) {
            mo28210i();
        }
        this.f20345M = z;
        return this;
    }

    /* renamed from: n */
    public C3692yt mo28214n(float f, float f2) {
        float[] fArr = this.f20352r;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public C3692yt mo28215o(float f, float f2) {
        float[] fArr = this.f20340B;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f20345M
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.mo28210i()
            goto L_0x0058
        L_0x001a:
            r5.f20343I = r2
            r5.f20341C = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f20349e
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.mo28207d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f20349e
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.mo28207d(r2, r7, r6, r3)
            yt$a r7 = r5.f20347a
            r7.mo28235l(r0, r6)
            boolean r6 = r5.f20344L
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo28222u()
            if (r6 == 0) goto L_0x0058
            r5.mo28223v()
        L_0x0058:
            boolean r6 = r5.f20346P
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f20344L
            if (r6 == 0) goto L_0x0061
            r1 = r2
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C3692yt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public C3692yt mo28217p(float f, float f2) {
        float[] fArr = this.f20339A;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public C3692yt mo28218q(int i) {
        this.f20347a.mo28233j(i);
        return this;
    }

    /* renamed from: r */
    public C3692yt mo28219r(int i) {
        this.f20347a.mo28234k(i);
        return this;
    }

    /* renamed from: s */
    public C3692yt mo28220s(float f, float f2) {
        float[] fArr = this.f20351k;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public C3692yt mo28221t(float f, float f2) {
        float[] fArr = this.f20355y;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean mo28222u() {
        C3693a aVar = this.f20347a;
        int f = aVar.mo28229f();
        int d = aVar.mo28227d();
        if ((f == 0 || !mo19917b(f)) && (d == 0 || !mo19916a(d))) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void mo28223v() {
        int i;
        if (this.f20350g == null) {
            this.f20350g = new C3694b();
        }
        this.f20344L = true;
        this.f20342H = true;
        if (this.f20341C || (i = this.f20354x) <= 0) {
            this.f20350g.run();
        } else {
            ga7.m17771i0(this.f20349e, this.f20350g, (long) i);
        }
        this.f20341C = true;
    }
}
