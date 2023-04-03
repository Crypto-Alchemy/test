package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a */
    public Runnable f23327a;

    /* renamed from: b */
    public OverScroller f23328b;

    /* renamed from: c */
    public boolean f23329c;

    /* renamed from: d */
    public int f23330d = -1;

    /* renamed from: e */
    public int f23331e;

    /* renamed from: f */
    public int f23332f = -1;

    /* renamed from: g */
    public VelocityTracker f23333g;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    public class C4181a implements Runnable {

        /* renamed from: a */
        public final CoordinatorLayout f23334a;

        /* renamed from: d */
        public final V f23335d;

        public C4181a(CoordinatorLayout coordinatorLayout, V v) {
            this.f23334a = coordinatorLayout;
            this.f23335d = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f23335d != null && (overScroller = HeaderBehavior.this.f23328b) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo31699i(this.f23334a, this.f23335d, headerBehavior.f23328b.getCurrY());
                    ga7.m17769h0(this.f23335d, this);
                    return;
                }
                HeaderBehavior.this.mo31566g(this.f23334a, this.f23335d);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: a */
    public boolean mo31562a(V v) {
        return false;
    }

    /* renamed from: b */
    public final void mo31696b() {
        if (this.f23333g == null) {
            this.f23333g = VelocityTracker.obtain();
        }
    }

    /* renamed from: c */
    public final boolean mo31697c(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f23327a;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f23327a = null;
        }
        if (this.f23328b == null) {
            this.f23328b = new OverScroller(v.getContext());
        }
        this.f23328b.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f23328b.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C4181a aVar = new C4181a(coordinatorLayout, v);
            this.f23327a = aVar;
            ga7.m17769h0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo31566g(coordinatorLayout, v);
        return false;
    }

    /* renamed from: d */
    public int mo31563d(V v) {
        return -v.getHeight();
    }

    /* renamed from: e */
    public int mo31564e(V v) {
        return v.getHeight();
    }

    /* renamed from: f */
    public int mo31565f() {
        return getTopAndBottomOffset();
    }

    /* renamed from: g */
    public void mo31566g(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* renamed from: h */
    public final int mo31698h(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo31567j(coordinatorLayout, v, mo31565f() - i, i2, i3);
    }

    /* renamed from: i */
    public int mo31699i(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo31567j(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* renamed from: j */
    public int mo31567j(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i2 == 0 || topAndBottomOffset < i2 || topAndBottomOffset > i3 || topAndBottomOffset == (b = ep3.m16274b(i, i2, i3))) {
            return 0;
        }
        setTopAndBottomOffset(b);
        return topAndBottomOffset - b;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        int findPointerIndex;
        if (this.f23332f < 0) {
            this.f23332f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f23329c) {
            int i = this.f23330d;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f23331e) > this.f23332f) {
                this.f23331e = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f23330d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (!mo31562a(v) || !coordinatorLayout.isPointInChildBounds(v, x, y2)) {
                z = false;
            } else {
                z = true;
            }
            this.f23329c = z;
            if (z) {
                this.f23331e = y2;
                this.f23330d = motionEvent.getPointerId(0);
                mo31696b();
                OverScroller overScroller = this.f23328b;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f23328b.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f23333g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = r2
            goto L_0x001c
        L_0x001b:
            r12 = r3
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f23330d = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f23331e = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f23330d
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f23331e
            int r7 = r1 - r0
            r11.f23331e = r0
            int r8 = r11.mo31563d(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo31698h(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = r3
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f23333g
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f23333g
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f23333g
            int r4 = r11.f23330d
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo31564e(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo31697c(r6, r7, r8, r9, r10)
            r12 = r2
            goto L_0x0073
        L_0x0072:
            r12 = r3
        L_0x0073:
            r11.f23329c = r3
            r11.f23330d = r1
            android.view.VelocityTracker r13 = r11.f23333g
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f23333g = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f23333g
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f23329c
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = r3
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
