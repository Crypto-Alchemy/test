package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: k82 */
/* compiled from: ForwardingListener */
public abstract class k82 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final float f13992a;

    /* renamed from: d */
    public final int f13993d;

    /* renamed from: e */
    public final int f13994e;

    /* renamed from: g */
    public final View f13995g;

    /* renamed from: k */
    public Runnable f13996k;

    /* renamed from: r */
    public Runnable f13997r;

    /* renamed from: s */
    public boolean f13998s;

    /* renamed from: x */
    public int f13999x;

    /* renamed from: y */
    public final int[] f14000y = new int[2];

    /* renamed from: k82$a */
    /* compiled from: ForwardingListener */
    public class C2647a implements Runnable {
        public C2647a() {
        }

        public void run() {
            ViewParent parent = k82.this.f13995g.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: k82$b */
    /* compiled from: ForwardingListener */
    public class C2648b implements Runnable {
        public C2648b() {
        }

        public void run() {
            k82.this.mo22215e();
        }
    }

    public k82(View view) {
        this.f13995g = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f13992a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f13993d = tapTimeout;
        this.f13994e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: h */
    public static boolean m20561h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo22214a() {
        Runnable runnable = this.f13997r;
        if (runnable != null) {
            this.f13995g.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f13996k;
        if (runnable2 != null) {
            this.f13995g.removeCallbacks(runnable2);
        }
    }

    /* renamed from: b */
    public abstract w06 mo1281b();

    /* renamed from: c */
    public abstract boolean mo1282c();

    /* renamed from: d */
    public boolean mo1713d() {
        w06 b = mo1281b();
        if (b == null || !b.mo1328a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* renamed from: e */
    public void mo22215e() {
        mo22214a();
        View view = this.f13995g;
        if (view.isEnabled() && !view.isLongClickable() && mo1282c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f13998s = true;
        }
    }

    /* renamed from: f */
    public final boolean mo22216f(MotionEvent motionEvent) {
        tk1 tk1;
        boolean z;
        View view = this.f13995g;
        w06 b = mo1281b();
        if (b == null || !b.mo1328a() || (tk1 = (tk1) b.mo1338p()) == null || !tk1.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        mo22218i(view, obtainNoHistory);
        mo22219j(tk1, obtainNoHistory);
        boolean e = tk1.mo2224e(obtainNoHistory, this.f13999x);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22217g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f13995g
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f13999x
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f13992a
            boolean r6 = m20561h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.mo22214a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.mo22214a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f13999x = r6
            java.lang.Runnable r6 = r5.f13996k
            if (r6 != 0) goto L_0x0052
            k82$a r6 = new k82$a
            r6.<init>()
            r5.f13996k = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f13996k
            int r1 = r5.f13993d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f13997r
            if (r6 != 0) goto L_0x0065
            k82$b r6 = new k82$b
            r6.<init>()
            r5.f13997r = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f13997r
            int r1 = r5.f13994e
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k82.mo22217g(android.view.MotionEvent):boolean");
    }

    /* renamed from: i */
    public final boolean mo22218i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f14000y;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    public final boolean mo22219j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f14000y;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f13998s;
        if (!z2) {
            if (!mo22217g(motionEvent) || !mo1282c()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, 0);
                this.f13995g.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else if (mo22216f(motionEvent) || !mo1713d()) {
            z = true;
        } else {
            z = false;
        }
        this.f13998s = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f13998s = false;
        this.f13999x = -1;
        Runnable runnable = this.f13996k;
        if (runnable != null) {
            this.f13995g.removeCallbacks(runnable);
        }
    }
}
