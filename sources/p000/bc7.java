package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;

/* renamed from: bc7 */
/* compiled from: ViewDragHelper */
public class bc7 {

    /* renamed from: x */
    public static final Interpolator f8044x = new C1620a();

    /* renamed from: a */
    public int f8045a;

    /* renamed from: b */
    public int f8046b;

    /* renamed from: c */
    public int f8047c = -1;

    /* renamed from: d */
    public float[] f8048d;

    /* renamed from: e */
    public float[] f8049e;

    /* renamed from: f */
    public float[] f8050f;

    /* renamed from: g */
    public float[] f8051g;

    /* renamed from: h */
    public int[] f8052h;

    /* renamed from: i */
    public int[] f8053i;

    /* renamed from: j */
    public int[] f8054j;

    /* renamed from: k */
    public int f8055k;

    /* renamed from: l */
    public VelocityTracker f8056l;

    /* renamed from: m */
    public float f8057m;

    /* renamed from: n */
    public float f8058n;

    /* renamed from: o */
    public int f8059o;

    /* renamed from: p */
    public final int f8060p;

    /* renamed from: q */
    public int f8061q;

    /* renamed from: r */
    public OverScroller f8062r;

    /* renamed from: s */
    public final C1622c f8063s;

    /* renamed from: t */
    public View f8064t;

    /* renamed from: u */
    public boolean f8065u;

    /* renamed from: v */
    public final ViewGroup f8066v;

    /* renamed from: w */
    public final Runnable f8067w = new C1621b();

    /* renamed from: bc7$a */
    /* compiled from: ViewDragHelper */
    public class C1620a implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: bc7$b */
    /* compiled from: ViewDragHelper */
    public class C1621b implements Runnable {
        public C1621b() {
        }

        public void run() {
            bc7.this.mo11498L(0);
        }
    }

    /* renamed from: bc7$c */
    /* compiled from: ViewDragHelper */
    public static abstract class C1622c {
        /* renamed from: a */
        public abstract int mo5582a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo5583b(View view, int i, int i2);

        /* renamed from: c */
        public int mo11532c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo5584d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo11533e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo5585f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo5586g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo5587h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo5588i(View view, int i) {
        }

        /* renamed from: j */
        public void mo5589j(int i) {
        }

        /* renamed from: k */
        public void mo5590k(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: l */
        public abstract void mo5591l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo5592m(View view, int i);
    }

    public bc7(Context context, ViewGroup viewGroup, C1622c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f8066v = viewGroup;
            this.f8063s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f8060p = i;
            this.f8059o = i;
            this.f8046b = viewConfiguration.getScaledTouchSlop();
            this.f8057m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f8058n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f8062r = new OverScroller(context, f8044x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: o */
    public static bc7 m11209o(ViewGroup viewGroup, float f, C1622c cVar) {
        bc7 p = m11210p(viewGroup, cVar);
        p.f8046b = (int) (((float) p.f8046b) * (1.0f / f));
        return p;
    }

    /* renamed from: p */
    public static bc7 m11210p(ViewGroup viewGroup, C1622c cVar) {
        return new bc7(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: A */
    public int mo11487A() {
        return this.f8046b;
    }

    /* renamed from: B */
    public int mo11488B() {
        return this.f8045a;
    }

    /* renamed from: C */
    public boolean mo11489C(int i, int i2) {
        return mo11492F(this.f8064t, i, i2);
    }

    /* renamed from: D */
    public boolean mo11490D(int i) {
        if (((1 << i) & this.f8055k) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public final boolean mo11491E(int i) {
        if (mo11490D(i)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Ignoring pointerId=");
        sb.append(i);
        sb.append(" because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    public boolean mo11492F(View view, int i, int i2) {
        if (view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public void mo11493G(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo11507b();
        }
        if (this.f8056l == null) {
            this.f8056l = VelocityTracker.obtain();
        }
        this.f8056l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View u = mo11524u((int) x, (int) y);
            mo11496J(x, y, pointerId);
            mo11505S(u, pointerId);
            int i3 = this.f8052h[pointerId];
            int i4 = this.f8061q;
            if ((i3 & i4) != 0) {
                this.f8063s.mo5587h(i3 & i4, pointerId);
            }
        } else if (actionMasked == 1) {
            if (this.f8045a == 1) {
                mo11494H();
            }
            mo11507b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f8045a == 1) {
                    mo11520q(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON);
                }
                mo11507b();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                mo11496J(x2, y2, pointerId2);
                if (this.f8045a == 0) {
                    mo11505S(mo11524u((int) x2, (int) y2), pointerId2);
                    int i5 = this.f8052h[pointerId2];
                    int i6 = this.f8061q;
                    if ((i5 & i6) != 0) {
                        this.f8063s.mo5587h(i5 & i6, pointerId2);
                    }
                } else if (mo11489C((int) x2, (int) y2)) {
                    mo11505S(this.f8064t, pointerId2);
                }
            } else if (actionMasked == 6) {
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                if (this.f8045a == 1 && pointerId3 == this.f8047c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount) {
                            i = -1;
                            break;
                        }
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if (pointerId4 != this.f8047c) {
                            View u2 = mo11524u((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                            View view = this.f8064t;
                            if (u2 == view && mo11505S(view, pointerId4)) {
                                i = this.f8047c;
                                break;
                            }
                        }
                        i2++;
                    }
                    if (i == -1) {
                        mo11494H();
                    }
                }
                mo11516k(pointerId3);
            }
        } else if (this.f8045a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i2 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i2);
                if (mo11491E(pointerId5)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.f8048d[pointerId5];
                    float f2 = y3 - this.f8049e[pointerId5];
                    mo11495I(f, f2, pointerId5);
                    if (this.f8045a != 1) {
                        View u3 = mo11524u((int) x3, (int) y3);
                        if (mo11512g(u3, f, f2) && mo11505S(u3, pointerId5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i2++;
            }
            mo11497K(motionEvent);
        } else if (mo11491E(this.f8047c)) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f8047c);
            float x4 = motionEvent.getX(findPointerIndex);
            float y4 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f8050f;
            int i7 = this.f8047c;
            int i8 = (int) (x4 - fArr[i7]);
            int i9 = (int) (y4 - this.f8051g[i7]);
            mo11522s(this.f8064t.getLeft() + i8, this.f8064t.getTop() + i9, i8, i9);
            mo11497K(motionEvent);
        }
    }

    /* renamed from: H */
    public final void mo11494H() {
        this.f8056l.computeCurrentVelocity(1000, this.f8057m);
        mo11520q(mo11513h(this.f8056l.getXVelocity(this.f8047c), this.f8058n, this.f8057m), mo11513h(this.f8056l.getYVelocity(this.f8047c), this.f8058n, this.f8057m));
    }

    /* renamed from: I */
    public final void mo11495I(float f, float f2, int i) {
        boolean d = mo11509d(f, f2, i, 1);
        if (mo11509d(f2, f, i, 4)) {
            d |= true;
        }
        if (mo11509d(f, f2, i, 2)) {
            d |= true;
        }
        if (mo11509d(f2, f, i, 8)) {
            d |= true;
        }
        if (d) {
            int[] iArr = this.f8053i;
            iArr[i] = iArr[i] | d;
            this.f8063s.mo5585f(d ? 1 : 0, i);
        }
    }

    /* renamed from: J */
    public final void mo11496J(float f, float f2, int i) {
        mo11523t(i);
        float[] fArr = this.f8048d;
        this.f8050f[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f8049e;
        this.f8051g[i] = f2;
        fArr2[i] = f2;
        this.f8052h[i] = mo11529z((int) f, (int) f2);
        this.f8055k |= 1 << i;
    }

    /* renamed from: K */
    public final void mo11497K(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (mo11491E(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f8050f[pointerId] = x;
                this.f8051g[pointerId] = y;
            }
        }
    }

    /* renamed from: L */
    public void mo11498L(int i) {
        this.f8066v.removeCallbacks(this.f8067w);
        if (this.f8045a != i) {
            this.f8045a = i;
            this.f8063s.mo5589j(i);
            if (this.f8045a == 0) {
                this.f8064t = null;
            }
        }
    }

    /* renamed from: M */
    public void mo11499M(int i) {
        this.f8059o = i;
    }

    /* renamed from: N */
    public void mo11500N(int i) {
        this.f8061q = i;
    }

    /* renamed from: O */
    public void mo11501O(float f) {
        this.f8058n = f;
    }

    /* renamed from: P */
    public boolean mo11502P(int i, int i2) {
        if (this.f8065u) {
            return mo11525v(i, i2, (int) this.f8056l.getXVelocity(this.f8047c), (int) this.f8056l.getYVelocity(this.f8047c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11503Q(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.mo11507b()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f8056l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f8056l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f8056l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.mo11516k(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.mo11496J(r7, r1, r2)
            int r3 = r0.f8045a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f8052h
            r1 = r1[r2]
            int r3 = r0.f8061q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            bc7$c r4 = r0.f8063s
            r1 = r1 & r3
            r4.mo5587h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.mo11524u(r3, r1)
            android.view.View r3 = r0.f8064t
            if (r1 != r3) goto L_0x0031
            r0.mo11505S(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f8048d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f8049e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.mo11491E(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f8048d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f8049e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.mo11524u(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.mo11512g(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            bc7$c r14 = r0.f8063s
            int r12 = r14.mo5582a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            bc7$c r5 = r0.f8063s
            int r5 = r5.mo5583b(r7, r15, r14)
            bc7$c r14 = r0.f8063s
            int r14 = r14.mo5584d(r7)
            bc7$c r15 = r0.f8063s
            int r15 = r15.mo11533e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.mo11495I(r9, r10, r4)
            int r5 = r0.f8045a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.mo11505S(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.mo11497K(r17)
            goto L_0x0031
        L_0x00ff:
            r16.mo11507b()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.mo11496J(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.mo11524u(r2, r3)
            android.view.View r3 = r0.f8064t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f8045a
            if (r3 != r4) goto L_0x0125
            r0.mo11505S(r2, r1)
        L_0x0125:
            int[] r2 = r0.f8052h
            r2 = r2[r1]
            int r3 = r0.f8061q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            bc7$c r4 = r0.f8063s
            r2 = r2 & r3
            r4.mo5587h(r2, r1)
        L_0x0135:
            int r1 = r0.f8045a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bc7.mo11503Q(android.view.MotionEvent):boolean");
    }

    /* renamed from: R */
    public boolean mo11504R(View view, int i, int i2) {
        this.f8064t = view;
        this.f8047c = -1;
        boolean v = mo11525v(i, i2, 0, 0);
        if (!v && this.f8045a == 0 && this.f8064t != null) {
            this.f8064t = null;
        }
        return v;
    }

    /* renamed from: S */
    public boolean mo11505S(View view, int i) {
        if (view == this.f8064t && this.f8047c == i) {
            return true;
        }
        if (view == null || !this.f8063s.mo5592m(view, i)) {
            return false;
        }
        this.f8047c = i;
        mo11508c(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo11506a() {
        mo11507b();
        if (this.f8045a == 2) {
            int currX = this.f8062r.getCurrX();
            int currY = this.f8062r.getCurrY();
            this.f8062r.abortAnimation();
            int currX2 = this.f8062r.getCurrX();
            int currY2 = this.f8062r.getCurrY();
            this.f8063s.mo5590k(this.f8064t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        mo11498L(0);
    }

    /* renamed from: b */
    public void mo11507b() {
        this.f8047c = -1;
        mo11515j();
        VelocityTracker velocityTracker = this.f8056l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8056l = null;
        }
    }

    /* renamed from: c */
    public void mo11508c(View view, int i) {
        if (view.getParent() == this.f8066v) {
            this.f8064t = view;
            this.f8047c = i;
            this.f8063s.mo5588i(view, i);
            mo11498L(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f8066v + ")");
    }

    /* renamed from: d */
    public final boolean mo11509d(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f8052h[i] & i2) != i2 || (this.f8061q & i2) == 0 || (this.f8054j[i] & i2) == i2 || (this.f8053i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f8046b;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs < abs2 * 0.5f && this.f8063s.mo5586g(i2)) {
            int[] iArr = this.f8054j;
            iArr[i] = iArr[i] | i2;
            return false;
        } else if ((this.f8053i[i] & i2) != 0 || abs <= ((float) this.f8046b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: e */
    public boolean mo11510e(int i) {
        int length = this.f8048d.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo11511f(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo11511f(int i, int i2) {
        boolean z;
        boolean z2;
        if (!mo11490D(i2)) {
            return false;
        }
        if ((i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f = this.f8050f[i2] - this.f8048d[i2];
        float f2 = this.f8051g[i2] - this.f8049e[i2];
        if (z && z2) {
            int i3 = this.f8046b;
            if ((f * f) + (f2 * f2) > ((float) (i3 * i3))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f8046b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f8046b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: g */
    public final boolean mo11512g(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.f8063s.mo5584d(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f8063s.mo11533e(view) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            int i = this.f8046b;
            if ((f * f) + (f2 * f2) > ((float) (i * i))) {
                return true;
            }
            return false;
        } else if (z) {
            if (Math.abs(f) > ((float) this.f8046b)) {
                return true;
            }
            return false;
        } else if (!z2 || Math.abs(f2) <= ((float) this.f8046b)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: h */
    public final float mo11513h(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return Utils.FLOAT_EPSILON;
        }
        if (abs <= f3) {
            return f;
        }
        if (f > Utils.FLOAT_EPSILON) {
            return f3;
        }
        return -f3;
    }

    /* renamed from: i */
    public final int mo11514i(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        if (abs <= i3) {
            return i;
        }
        if (i > 0) {
            return i3;
        }
        return -i3;
    }

    /* renamed from: j */
    public final void mo11515j() {
        float[] fArr = this.f8048d;
        if (fArr != null) {
            Arrays.fill(fArr, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f8049e, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f8050f, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f8051g, Utils.FLOAT_EPSILON);
            Arrays.fill(this.f8052h, 0);
            Arrays.fill(this.f8053i, 0);
            Arrays.fill(this.f8054j, 0);
            this.f8055k = 0;
        }
    }

    /* renamed from: k */
    public final void mo11516k(int i) {
        if (this.f8048d != null && mo11490D(i)) {
            this.f8048d[i] = 0.0f;
            this.f8049e[i] = 0.0f;
            this.f8050f[i] = 0.0f;
            this.f8051g[i] = 0.0f;
            this.f8052h[i] = 0;
            this.f8053i[i] = 0;
            this.f8054j[i] = 0;
            this.f8055k = (~(1 << i)) & this.f8055k;
        }
    }

    /* renamed from: l */
    public final int mo11517l(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        int width = this.f8066v.getWidth();
        float f = (float) (width / 2);
        float r = f + (mo11521r(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        if (abs > 0) {
            i4 = Math.round(Math.abs(r / ((float) abs)) * 1000.0f) * 4;
        } else {
            i4 = (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f);
        }
        return Math.min(i4, 600);
    }

    /* renamed from: m */
    public final int mo11518m(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = mo11514i(i3, (int) this.f8058n, (int) this.f8057m);
        int i6 = mo11514i(i4, (int) this.f8058n, (int) this.f8057m);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (i5 != 0) {
            f2 = (float) abs3;
            f = (float) i7;
        } else {
            f2 = (float) abs;
            f = (float) i8;
        }
        float f5 = f2 / f;
        if (i6 != 0) {
            f4 = (float) abs4;
            f3 = (float) i7;
        } else {
            f4 = (float) abs2;
            f3 = (float) i8;
        }
        float f6 = f4 / f3;
        return (int) ((((float) mo11517l(i, i5, this.f8063s.mo5584d(view))) * f5) + (((float) mo11517l(i2, i6, this.f8063s.mo11533e(view))) * f6));
    }

    /* renamed from: n */
    public boolean mo11519n(boolean z) {
        if (this.f8045a == 2) {
            boolean computeScrollOffset = this.f8062r.computeScrollOffset();
            int currX = this.f8062r.getCurrX();
            int currY = this.f8062r.getCurrY();
            int left = currX - this.f8064t.getLeft();
            int top = currY - this.f8064t.getTop();
            if (left != 0) {
                ga7.m17753Z(this.f8064t, left);
            }
            if (top != 0) {
                ga7.m17755a0(this.f8064t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f8063s.mo5590k(this.f8064t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f8062r.getFinalX() && currY == this.f8062r.getFinalY()) {
                this.f8062r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f8066v.post(this.f8067w);
                } else {
                    mo11498L(0);
                }
            }
        }
        if (this.f8045a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final void mo11520q(float f, float f2) {
        this.f8065u = true;
        this.f8063s.mo5591l(this.f8064t, f, f2);
        this.f8065u = false;
        if (this.f8045a == 1) {
            mo11498L(0);
        }
    }

    /* renamed from: r */
    public final float mo11521r(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: s */
    public final void mo11522s(int i, int i2, int i3, int i4) {
        int left = this.f8064t.getLeft();
        int top = this.f8064t.getTop();
        if (i3 != 0) {
            i = this.f8063s.mo5582a(this.f8064t, i, i3);
            ga7.m17753Z(this.f8064t, i - left);
        }
        int i5 = i;
        if (i4 != 0) {
            i2 = this.f8063s.mo5583b(this.f8064t, i2, i4);
            ga7.m17755a0(this.f8064t, i2 - top);
        }
        int i6 = i2;
        if (i3 != 0 || i4 != 0) {
            this.f8063s.mo5590k(this.f8064t, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: t */
    public final void mo11523t(int i) {
        float[] fArr = this.f8048d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f8049e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f8050f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f8051g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f8052h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f8053i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8054j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8048d = fArr2;
            this.f8049e = fArr3;
            this.f8050f = fArr4;
            this.f8051g = fArr5;
            this.f8052h = iArr;
            this.f8053i = iArr2;
            this.f8054j = iArr3;
        }
    }

    /* renamed from: u */
    public View mo11524u(int i, int i2) {
        for (int childCount = this.f8066v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f8066v.getChildAt(this.f8063s.mo11532c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public final boolean mo11525v(int i, int i2, int i3, int i4) {
        int left = this.f8064t.getLeft();
        int top = this.f8064t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f8062r.abortAnimation();
            mo11498L(0);
            return false;
        }
        this.f8062r.startScroll(left, top, i5, i6, mo11518m(this.f8064t, i5, i6, i3, i4));
        mo11498L(2);
        return true;
    }

    /* renamed from: w */
    public View mo11526w() {
        return this.f8064t;
    }

    /* renamed from: x */
    public int mo11527x() {
        return this.f8060p;
    }

    /* renamed from: y */
    public int mo11528y() {
        return this.f8059o;
    }

    /* renamed from: z */
    public final int mo11529z(int i, int i2) {
        int i3;
        if (i < this.f8066v.getLeft() + this.f8059o) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 < this.f8066v.getTop() + this.f8059o) {
            i3 |= 4;
        }
        if (i > this.f8066v.getRight() - this.f8059o) {
            i3 |= 2;
        }
        if (i2 > this.f8066v.getBottom() - this.f8059o) {
            return i3 | 8;
        }
        return i3;
    }
}
