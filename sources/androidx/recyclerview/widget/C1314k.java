package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.k */
/* compiled from: ItemTouchHelper */
public class C1314k extends RecyclerView.C1247n implements RecyclerView.C1248o {

    /* renamed from: A */
    public C1322f f6754A;

    /* renamed from: B */
    public final RecyclerView.C1250q f6755B = new C1316b();

    /* renamed from: C */
    public Rect f6756C;

    /* renamed from: D */
    public long f6757D;

    /* renamed from: a */
    public final List<View> f6758a = new ArrayList();

    /* renamed from: b */
    public final float[] f6759b = new float[2];

    /* renamed from: c */
    public RecyclerView.C1231a0 f6760c = null;

    /* renamed from: d */
    public float f6761d;

    /* renamed from: e */
    public float f6762e;

    /* renamed from: f */
    public float f6763f;

    /* renamed from: g */
    public float f6764g;

    /* renamed from: h */
    public float f6765h;

    /* renamed from: i */
    public float f6766i;

    /* renamed from: j */
    public float f6767j;

    /* renamed from: k */
    public float f6768k;

    /* renamed from: l */
    public int f6769l = -1;

    /* renamed from: m */
    public C1319e f6770m;

    /* renamed from: n */
    public int f6771n = 0;

    /* renamed from: o */
    public int f6772o;

    /* renamed from: p */
    public List<C1323g> f6773p = new ArrayList();

    /* renamed from: q */
    public int f6774q;

    /* renamed from: r */
    public RecyclerView f6775r;

    /* renamed from: s */
    public final Runnable f6776s = new C1315a();

    /* renamed from: t */
    public VelocityTracker f6777t;

    /* renamed from: u */
    public List<RecyclerView.C1231a0> f6778u;

    /* renamed from: v */
    public List<Integer> f6779v;

    /* renamed from: w */
    public RecyclerView.C1240j f6780w = null;

    /* renamed from: x */
    public View f6781x = null;

    /* renamed from: y */
    public int f6782y = -1;

    /* renamed from: z */
    public qf2 f6783z;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* compiled from: ItemTouchHelper */
    public class C1315a implements Runnable {
        public C1315a() {
        }

        public void run() {
            C1314k kVar = C1314k.this;
            if (kVar.f6760c != null && kVar.mo9853y()) {
                C1314k kVar2 = C1314k.this;
                RecyclerView.C1231a0 a0Var = kVar2.f6760c;
                if (a0Var != null) {
                    kVar2.mo9848t(a0Var);
                }
                C1314k kVar3 = C1314k.this;
                kVar3.f6775r.removeCallbacks(kVar3.f6776s);
                ga7.m17769h0(C1314k.this.f6775r, this);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$b */
    /* compiled from: ItemTouchHelper */
    public class C1316b implements RecyclerView.C1250q {
        public C1316b() {
        }

        /* renamed from: a */
        public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1314k.this.f6783z.mo25090a(motionEvent);
            VelocityTracker velocityTracker = C1314k.this.f6777t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1314k.this.f6769l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(C1314k.this.f6769l);
                if (findPointerIndex >= 0) {
                    C1314k.this.mo9838i(actionMasked, motionEvent, findPointerIndex);
                }
                C1314k kVar = C1314k.this;
                RecyclerView.C1231a0 a0Var = kVar.f6760c;
                if (a0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = kVar.f6777t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                C1314k kVar2 = C1314k.this;
                                if (pointerId == kVar2.f6769l) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    kVar2.f6769l = motionEvent.getPointerId(i);
                                    C1314k kVar3 = C1314k.this;
                                    kVar3.mo9834E(motionEvent, kVar3.f6772o, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            kVar.mo9834E(motionEvent, kVar.f6772o, findPointerIndex);
                            C1314k.this.mo9848t(a0Var);
                            C1314k kVar4 = C1314k.this;
                            kVar4.f6775r.removeCallbacks(kVar4.f6776s);
                            C1314k.this.f6776s.run();
                            C1314k.this.f6775r.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    C1314k.this.mo9854z((RecyclerView.C1231a0) null, 0);
                    C1314k.this.f6769l = -1;
                }
            }
        }

        /* renamed from: c */
        public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1323g m;
            C1314k.this.f6783z.mo25090a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1314k.this.f6769l = motionEvent.getPointerId(0);
                C1314k.this.f6761d = motionEvent.getX();
                C1314k.this.f6762e = motionEvent.getY();
                C1314k.this.mo9849u();
                C1314k kVar = C1314k.this;
                if (kVar.f6760c == null && (m = kVar.mo9842m(motionEvent)) != null) {
                    C1314k kVar2 = C1314k.this;
                    kVar2.f6761d -= m.f6797A;
                    kVar2.f6762e -= m.f6798B;
                    kVar2.mo9841l(m.f6806k, true);
                    if (C1314k.this.f6758a.remove(m.f6806k.itemView)) {
                        C1314k kVar3 = C1314k.this;
                        kVar3.f6770m.mo9862c(kVar3.f6775r, m.f6806k);
                    }
                    C1314k.this.mo9854z(m.f6806k, m.f6807r);
                    C1314k kVar4 = C1314k.this;
                    kVar4.mo9834E(motionEvent, kVar4.f6772o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1314k kVar5 = C1314k.this;
                kVar5.f6769l = -1;
                kVar5.mo9854z((RecyclerView.C1231a0) null, 0);
            } else {
                int i = C1314k.this.f6769l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C1314k.this.mo9838i(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C1314k.this.f6777t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1314k.this.f6760c != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public void mo9443e(boolean z) {
            if (z) {
                C1314k.this.mo9854z((RecyclerView.C1231a0) null, 0);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    /* compiled from: ItemTouchHelper */
    public class C1317c extends C1323g {

        /* renamed from: L */
        public final /* synthetic */ int f6786L;

        /* renamed from: M */
        public final /* synthetic */ RecyclerView.C1231a0 f6787M;

        /* renamed from: P */
        public final /* synthetic */ C1314k f6788P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1317c(C1314k kVar, RecyclerView.C1231a0 a0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.C1231a0 a0Var2) {
            super(a0Var, i, i2, f, f2, f3, f4);
            this.f6788P = kVar;
            this.f6786L = i3;
            this.f6787M = a0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (!this.f6799C) {
                if (this.f6786L <= 0) {
                    C1314k kVar = this.f6788P;
                    kVar.f6770m.mo9862c(kVar.f6775r, this.f6787M);
                } else {
                    this.f6788P.f6758a.add(this.f6787M.itemView);
                    this.f6810y = true;
                    int i = this.f6786L;
                    if (i > 0) {
                        this.f6788P.mo9850v(this, i);
                    }
                }
                C1314k kVar2 = this.f6788P;
                View view = kVar2.f6781x;
                View view2 = this.f6787M.itemView;
                if (view == view2) {
                    kVar2.mo9852x(view2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$d */
    /* compiled from: ItemTouchHelper */
    public class C1318d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C1323g f6789a;

        /* renamed from: d */
        public final /* synthetic */ int f6790d;

        public C1318d(C1323g gVar, int i) {
            this.f6789a = gVar;
            this.f6790d = i;
        }

        public void run() {
            RecyclerView recyclerView = C1314k.this.f6775r;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C1323g gVar = this.f6789a;
                if (!gVar.f6799C && gVar.f6806k.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.C1242l itemAnimator = C1314k.this.f6775r.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning((RecyclerView.C1242l.C1243a) null)) && !C1314k.this.mo9847r()) {
                        C1314k.this.f6770m.mo9859B(this.f6789a.f6806k, this.f6790d);
                    } else {
                        C1314k.this.f6775r.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$e */
    /* compiled from: ItemTouchHelper */
    public static abstract class C1319e {

        /* renamed from: b */
        public static final Interpolator f6792b = new C1320a();

        /* renamed from: c */
        public static final Interpolator f6793c = new C1321b();

        /* renamed from: a */
        public int f6794a = -1;

        /* renamed from: androidx.recyclerview.widget.k$e$a */
        /* compiled from: ItemTouchHelper */
        public class C1320a implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.k$e$b */
        /* compiled from: ItemTouchHelper */
        public class C1321b implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* renamed from: e */
        public static int m9584e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* renamed from: s */
        public static int m9585s(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: t */
        public static int m9586t(int i, int i2) {
            int s = m9585s(0, i2 | i);
            return m9585s(2, i) | m9585s(1, i2) | s;
        }

        /* renamed from: A */
        public void mo9858A(RecyclerView.C1231a0 a0Var, int i) {
            if (a0Var != null) {
                mz2.f15293a.mo22988b(a0Var.itemView);
            }
        }

        /* renamed from: B */
        public abstract void mo9859B(RecyclerView.C1231a0 a0Var, int i);

        /* renamed from: a */
        public boolean mo9860a(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2) {
            return true;
        }

        /* renamed from: b */
        public RecyclerView.C1231a0 mo9861b(RecyclerView.C1231a0 a0Var, List<RecyclerView.C1231a0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.C1231a0 a0Var2 = a0Var;
            int width = i + a0Var2.itemView.getWidth();
            int height = i2 + a0Var2.itemView.getHeight();
            int left2 = i - a0Var2.itemView.getLeft();
            int top2 = i2 - a0Var2.itemView.getTop();
            int size = list.size();
            RecyclerView.C1231a0 a0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.C1231a0 a0Var4 = list.get(i4);
                if (left2 > 0 && (right = a0Var4.itemView.getRight() - width) < 0 && a0Var4.itemView.getRight() > a0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = a0Var4.itemView.getLeft() - i) > 0 && a0Var4.itemView.getLeft() < a0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = a0Var4.itemView.getTop() - i2) > 0 && a0Var4.itemView.getTop() < a0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = a0Var4.itemView.getBottom() - height) < 0 && a0Var4.itemView.getBottom() > a0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    a0Var3 = a0Var4;
                    i3 = abs;
                }
            }
            return a0Var3;
        }

        /* renamed from: c */
        public void mo9862c(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            mz2.f15293a.mo22987a(a0Var.itemView);
        }

        /* renamed from: d */
        public int mo9863d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        /* renamed from: f */
        public final int mo9864f(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            return mo9863d(mo9869k(recyclerView, a0Var), ga7.m17715B(recyclerView));
        }

        /* renamed from: g */
        public long mo9865g(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.C1242l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200;
                }
                return 250;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        /* renamed from: h */
        public int mo9866h() {
            return 0;
        }

        /* renamed from: i */
        public final int mo9867i(RecyclerView recyclerView) {
            if (this.f6794a == -1) {
                this.f6794a = recyclerView.getResources().getDimensionPixelSize(i25.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f6794a;
        }

        /* renamed from: j */
        public float mo9868j(RecyclerView.C1231a0 a0Var) {
            return 0.5f;
        }

        /* renamed from: k */
        public abstract int mo9869k(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var);

        /* renamed from: l */
        public float mo9870l(float f) {
            return f;
        }

        /* renamed from: m */
        public float mo9871m(RecyclerView.C1231a0 a0Var) {
            return 0.5f;
        }

        /* renamed from: n */
        public float mo9872n(float f) {
            return f;
        }

        /* renamed from: o */
        public boolean mo9873o(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            if ((mo9864f(recyclerView, a0Var) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: p */
        public int mo9874p(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((float) (((int) Math.signum((float) i2)) * mo9867i(recyclerView))) * f6793c.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (((float) signum) * f6792b.getInterpolation(f));
            if (interpolation != 0) {
                return interpolation;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        }

        /* renamed from: q */
        public boolean mo9875q() {
            return true;
        }

        /* renamed from: r */
        public boolean mo9876r() {
            return true;
        }

        /* renamed from: u */
        public void mo9877u(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, float f, float f2, int i, boolean z) {
            mz2.f15293a.mo22989c(canvas, recyclerView, a0Var.itemView, f, f2, i, z);
        }

        /* renamed from: v */
        public void mo9878v(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, float f, float f2, int i, boolean z) {
            mz2.f15293a.mo22990d(canvas, recyclerView, a0Var.itemView, f, f2, i, z);
        }

        /* renamed from: w */
        public void mo9879w(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, List<C1323g> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1323g gVar = list.get(i2);
                gVar.mo9892e();
                int save = canvas.save();
                mo9877u(canvas, recyclerView, gVar.f6806k, gVar.f6797A, gVar.f6798B, gVar.f6807r, false);
                canvas.restoreToCount(save);
            }
            if (a0Var != null) {
                int save2 = canvas.save();
                mo9877u(canvas, recyclerView, a0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: x */
        public void mo9880x(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, List<C1323g> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<C1323g> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1323g gVar = list2.get(i2);
                int save = canvas.save();
                mo9878v(canvas, recyclerView, gVar.f6806k, gVar.f6797A, gVar.f6798B, gVar.f6807r, false);
                canvas.restoreToCount(save);
            }
            if (a0Var != null) {
                int save2 = canvas.save();
                mo9878v(canvas, recyclerView, a0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1323g gVar2 = list2.get(i3);
                boolean z2 = gVar2.f6800H;
                if (z2 && !gVar2.f6810y) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* renamed from: y */
        public abstract boolean mo9881y(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, RecyclerView.C1231a0 a0Var2);

        /* renamed from: z */
        public void mo9882z(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var, int i, RecyclerView.C1231a0 a0Var2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof C1326i) {
                ((C1326i) layoutManager).mo8908d(a0Var.itemView, a0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo8929v()) {
                if (layoutManager.mo9243b0(a0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.mo9092o1(i2);
                }
                if (layoutManager.mo9247e0(a0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.mo9092o1(i2);
                }
            }
            if (layoutManager.mo8931w()) {
                if (layoutManager.mo9248f0(a0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.mo9092o1(i2);
                }
                if (layoutManager.mo9241Z(a0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.mo9092o1(i2);
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$f */
    /* compiled from: ItemTouchHelper */
    public class C1322f extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        public boolean f6795a = true;

        public C1322f() {
        }

        /* renamed from: a */
        public void mo9885a() {
            this.f6795a = false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View n;
            RecyclerView.C1231a0 h0;
            int i;
            if (this.f6795a && (n = C1314k.this.mo9843n(motionEvent)) != null && (h0 = C1314k.this.f6775r.mo9068h0(n)) != null) {
                C1314k kVar = C1314k.this;
                if (kVar.f6770m.mo9873o(kVar.f6775r, h0) && motionEvent.getPointerId(0) == (i = C1314k.this.f6769l)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    C1314k kVar2 = C1314k.this;
                    kVar2.f6761d = x;
                    kVar2.f6762e = y;
                    kVar2.f6766i = Utils.FLOAT_EPSILON;
                    kVar2.f6765h = Utils.FLOAT_EPSILON;
                    if (kVar2.f6770m.mo9876r()) {
                        C1314k.this.mo9854z(h0, 2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$g */
    /* compiled from: ItemTouchHelper */
    public static class C1323g implements Animator.AnimatorListener {

        /* renamed from: A */
        public float f6797A;

        /* renamed from: B */
        public float f6798B;

        /* renamed from: C */
        public boolean f6799C = false;

        /* renamed from: H */
        public boolean f6800H = false;

        /* renamed from: I */
        public float f6801I;

        /* renamed from: a */
        public final float f6802a;

        /* renamed from: d */
        public final float f6803d;

        /* renamed from: e */
        public final float f6804e;

        /* renamed from: g */
        public final float f6805g;

        /* renamed from: k */
        public final RecyclerView.C1231a0 f6806k;

        /* renamed from: r */
        public final int f6807r;

        /* renamed from: s */
        public final ValueAnimator f6808s;

        /* renamed from: x */
        public final int f6809x;

        /* renamed from: y */
        public boolean f6810y;

        /* renamed from: androidx.recyclerview.widget.k$g$a */
        /* compiled from: ItemTouchHelper */
        public class C1324a implements ValueAnimator.AnimatorUpdateListener {
            public C1324a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1323g.this.mo9890c(valueAnimator.getAnimatedFraction());
            }
        }

        public C1323g(RecyclerView.C1231a0 a0Var, int i, int i2, float f, float f2, float f3, float f4) {
            this.f6807r = i2;
            this.f6809x = i;
            this.f6806k = a0Var;
            this.f6802a = f;
            this.f6803d = f2;
            this.f6804e = f3;
            this.f6805g = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f6808s = ofFloat;
            ofFloat.addUpdateListener(new C1324a());
            ofFloat.setTarget(a0Var.itemView);
            ofFloat.addListener(this);
            mo9890c(Utils.FLOAT_EPSILON);
        }

        /* renamed from: a */
        public void mo9888a() {
            this.f6808s.cancel();
        }

        /* renamed from: b */
        public void mo9889b(long j) {
            this.f6808s.setDuration(j);
        }

        /* renamed from: c */
        public void mo9890c(float f) {
            this.f6801I = f;
        }

        /* renamed from: d */
        public void mo9891d() {
            this.f6806k.setIsRecyclable(false);
            this.f6808s.start();
        }

        /* renamed from: e */
        public void mo9892e() {
            float f = this.f6802a;
            float f2 = this.f6804e;
            if (f == f2) {
                this.f6797A = this.f6806k.itemView.getTranslationX();
            } else {
                this.f6797A = f + (this.f6801I * (f2 - f));
            }
            float f3 = this.f6803d;
            float f4 = this.f6805g;
            if (f3 == f4) {
                this.f6798B = this.f6806k.itemView.getTranslationY();
            } else {
                this.f6798B = f3 + (this.f6801I * (f4 - f3));
            }
        }

        public void onAnimationCancel(Animator animator) {
            mo9890c(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6800H) {
                this.f6806k.setIsRecyclable(true);
            }
            this.f6800H = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$h */
    /* compiled from: ItemTouchHelper */
    public static abstract class C1325h extends C1319e {

        /* renamed from: d */
        public int f6812d;

        /* renamed from: e */
        public int f6813e;

        public C1325h(int i, int i2) {
            this.f6812d = i2;
            this.f6813e = i;
        }

        /* renamed from: C */
        public int mo9897C(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            return this.f6813e;
        }

        /* renamed from: D */
        public int mo9898D(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            return this.f6812d;
        }

        /* renamed from: k */
        public int mo9869k(RecyclerView recyclerView, RecyclerView.C1231a0 a0Var) {
            return C1319e.m9586t(mo9897C(recyclerView, a0Var), mo9898D(recyclerView, a0Var));
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$i */
    /* compiled from: ItemTouchHelper */
    public interface C1326i {
        /* renamed from: d */
        void mo8908d(View view, View view2, int i, int i2);
    }

    public C1314k(C1319e eVar) {
        this.f6770m = eVar;
    }

    /* renamed from: s */
    public static boolean m9553s(View view, float f, float f2, float f3, float f4) {
        if (f < f3 || f > f3 + ((float) view.getWidth()) || f2 < f4 || f2 > f4 + ((float) view.getHeight())) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public final void mo9830A() {
        this.f6774q = ViewConfiguration.get(this.f6775r.getContext()).getScaledTouchSlop();
        this.f6775r.mo9067h(this);
        this.f6775r.mo9079k(this.f6755B);
        this.f6775r.mo9076j(this);
        mo9831B();
    }

    /* renamed from: B */
    public final void mo9831B() {
        this.f6754A = new C1322f();
        this.f6783z = new qf2(this.f6775r.getContext(), this.f6754A);
    }

    /* renamed from: C */
    public final void mo9832C() {
        C1322f fVar = this.f6754A;
        if (fVar != null) {
            fVar.mo9885a();
            this.f6754A = null;
        }
        if (this.f6783z != null) {
            this.f6783z = null;
        }
    }

    /* renamed from: D */
    public final int mo9833D(RecyclerView.C1231a0 a0Var) {
        if (this.f6771n == 2) {
            return 0;
        }
        int k = this.f6770m.mo9869k(this.f6775r, a0Var);
        int d = (this.f6770m.mo9863d(k, ga7.m17715B(this.f6775r)) & 65280) >> 8;
        if (d == 0) {
            return 0;
        }
        int i = (k & 65280) >> 8;
        if (Math.abs(this.f6765h) > Math.abs(this.f6766i)) {
            int h = mo9837h(a0Var, d);
            if (h <= 0) {
                int j = mo9839j(a0Var, d);
                if (j > 0) {
                    return j;
                }
            } else if ((i & h) == 0) {
                return C1319e.m9584e(h, ga7.m17715B(this.f6775r));
            } else {
                return h;
            }
        } else {
            int j2 = mo9839j(a0Var, d);
            if (j2 > 0) {
                return j2;
            }
            int h2 = mo9837h(a0Var, d);
            if (h2 > 0) {
                if ((i & h2) == 0) {
                    return C1319e.m9584e(h2, ga7.m17715B(this.f6775r));
                }
                return h2;
            }
        }
        return 0;
    }

    /* renamed from: E */
    public void mo9834E(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f6761d;
        this.f6765h = f;
        this.f6766i = y - this.f6762e;
        if ((i & 4) == 0) {
            this.f6765h = Math.max(Utils.FLOAT_EPSILON, f);
        }
        if ((i & 8) == 0) {
            this.f6765h = Math.min(Utils.FLOAT_EPSILON, this.f6765h);
        }
        if ((i & 1) == 0) {
            this.f6766i = Math.max(Utils.FLOAT_EPSILON, this.f6766i);
        }
        if ((i & 2) == 0) {
            this.f6766i = Math.min(Utils.FLOAT_EPSILON, this.f6766i);
        }
    }

    /* renamed from: b */
    public void mo9438b(View view) {
        mo9852x(view);
        RecyclerView.C1231a0 h0 = this.f6775r.mo9068h0(view);
        if (h0 != null) {
            RecyclerView.C1231a0 a0Var = this.f6760c;
            if (a0Var == null || h0 != a0Var) {
                mo9841l(h0, false);
                if (this.f6758a.remove(h0.itemView)) {
                    this.f6770m.mo9862c(this.f6775r, h0);
                    return;
                }
                return;
            }
            mo9854z((RecyclerView.C1231a0) null, 0);
        }
    }

    /* renamed from: d */
    public void mo9439d(View view) {
    }

    /* renamed from: f */
    public final void mo9835f() {
    }

    /* renamed from: g */
    public void mo9836g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f6775r;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                mo9840k();
            }
            this.f6775r = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                this.f6763f = resources.getDimension(i25.item_touch_helper_swipe_escape_velocity);
                this.f6764g = resources.getDimension(i25.item_touch_helper_swipe_escape_max_velocity);
                mo9830A();
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        rect.setEmpty();
    }

    /* renamed from: h */
    public final int mo9837h(RecyclerView.C1231a0 a0Var, int i) {
        int i2;
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        if (this.f6765h > Utils.FLOAT_EPSILON) {
            i2 = 8;
        } else {
            i2 = 4;
        }
        VelocityTracker velocityTracker = this.f6777t;
        if (velocityTracker != null && this.f6769l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f6770m.mo9872n(this.f6764g));
            float xVelocity = this.f6777t.getXVelocity(this.f6769l);
            float yVelocity = this.f6777t.getYVelocity(this.f6769l);
            if (xVelocity <= Utils.FLOAT_EPSILON) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && abs >= this.f6770m.mo9870l(this.f6763f) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = ((float) this.f6775r.getWidth()) * this.f6770m.mo9871m(a0Var);
        if ((i & i2) == 0 || Math.abs(this.f6765h) <= width) {
            return 0;
        }
        return i2;
    }

    /* renamed from: i */
    public void mo9838i(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.C1231a0 p;
        int f;
        if (this.f6760c == null && i == 2 && this.f6771n != 2 && this.f6770m.mo9875q() && this.f6775r.getScrollState() != 1 && (p = mo9845p(motionEvent)) != null && (f = (this.f6770m.mo9864f(this.f6775r, p) & 65280) >> 8) != 0) {
            float x = motionEvent.getX(i2);
            float y = motionEvent.getY(i2);
            float f2 = x - this.f6761d;
            float f3 = y - this.f6762e;
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f3);
            int i3 = this.f6774q;
            if (abs >= ((float) i3) || abs2 >= ((float) i3)) {
                if (abs > abs2) {
                    if (f2 < Utils.FLOAT_EPSILON && (f & 4) == 0) {
                        return;
                    }
                    if (f2 > Utils.FLOAT_EPSILON && (f & 8) == 0) {
                        return;
                    }
                } else if (f3 < Utils.FLOAT_EPSILON && (f & 1) == 0) {
                    return;
                } else {
                    if (f3 > Utils.FLOAT_EPSILON && (f & 2) == 0) {
                        return;
                    }
                }
                this.f6766i = Utils.FLOAT_EPSILON;
                this.f6765h = Utils.FLOAT_EPSILON;
                this.f6769l = motionEvent.getPointerId(0);
                mo9854z(p, 1);
            }
        }
    }

    /* renamed from: j */
    public final int mo9839j(RecyclerView.C1231a0 a0Var, int i) {
        int i2;
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        if (this.f6766i > Utils.FLOAT_EPSILON) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        VelocityTracker velocityTracker = this.f6777t;
        if (velocityTracker != null && this.f6769l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f6770m.mo9872n(this.f6764g));
            float xVelocity = this.f6777t.getXVelocity(this.f6769l);
            float yVelocity = this.f6777t.getYVelocity(this.f6769l);
            if (yVelocity <= Utils.FLOAT_EPSILON) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && abs >= this.f6770m.mo9870l(this.f6763f) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = ((float) this.f6775r.getHeight()) * this.f6770m.mo9871m(a0Var);
        if ((i & i2) == 0 || Math.abs(this.f6766i) <= height) {
            return 0;
        }
        return i2;
    }

    /* renamed from: k */
    public final void mo9840k() {
        this.f6775r.mo9018b1(this);
        this.f6775r.mo9040e1(this.f6755B);
        this.f6775r.mo9029d1(this);
        for (int size = this.f6773p.size() - 1; size >= 0; size--) {
            C1323g gVar = this.f6773p.get(0);
            gVar.mo9888a();
            this.f6770m.mo9862c(this.f6775r, gVar.f6806k);
        }
        this.f6773p.clear();
        this.f6781x = null;
        this.f6782y = -1;
        mo9851w();
        mo9832C();
    }

    /* renamed from: l */
    public void mo9841l(RecyclerView.C1231a0 a0Var, boolean z) {
        for (int size = this.f6773p.size() - 1; size >= 0; size--) {
            C1323g gVar = this.f6773p.get(size);
            if (gVar.f6806k == a0Var) {
                gVar.f6799C |= z;
                if (!gVar.f6800H) {
                    gVar.mo9888a();
                }
                this.f6773p.remove(size);
                return;
            }
        }
    }

    /* renamed from: m */
    public C1323g mo9842m(MotionEvent motionEvent) {
        if (this.f6773p.isEmpty()) {
            return null;
        }
        View n = mo9843n(motionEvent);
        for (int size = this.f6773p.size() - 1; size >= 0; size--) {
            C1323g gVar = this.f6773p.get(size);
            if (gVar.f6806k.itemView == n) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: n */
    public View mo9843n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.C1231a0 a0Var = this.f6760c;
        if (a0Var != null) {
            View view = a0Var.itemView;
            if (m9553s(view, x, y, this.f6767j + this.f6765h, this.f6768k + this.f6766i)) {
                return view;
            }
        }
        for (int size = this.f6773p.size() - 1; size >= 0; size--) {
            C1323g gVar = this.f6773p.get(size);
            View view2 = gVar.f6806k.itemView;
            if (m9553s(view2, x, y, gVar.f6797A, gVar.f6798B)) {
                return view2;
            }
        }
        return this.f6775r.mo8998S(x, y);
    }

    /* renamed from: o */
    public final List<RecyclerView.C1231a0> mo9844o(RecyclerView.C1231a0 a0Var) {
        RecyclerView.C1231a0 a0Var2 = a0Var;
        List<RecyclerView.C1231a0> list = this.f6778u;
        if (list == null) {
            this.f6778u = new ArrayList();
            this.f6779v = new ArrayList();
        } else {
            list.clear();
            this.f6779v.clear();
        }
        int h = this.f6770m.mo9866h();
        int round = Math.round(this.f6767j + this.f6765h) - h;
        int round2 = Math.round(this.f6768k + this.f6766i) - h;
        int i = h * 2;
        int width = a0Var2.itemView.getWidth() + round + i;
        int height = a0Var2.itemView.getHeight() + round2 + i;
        int i2 = (round + width) / 2;
        int i3 = (round2 + height) / 2;
        RecyclerView.LayoutManager layoutManager = this.f6775r.getLayoutManager();
        int U = layoutManager.mo9234U();
        int i4 = 0;
        while (i4 < U) {
            View T = layoutManager.mo9231T(i4);
            if (T != a0Var2.itemView && T.getBottom() >= round2 && T.getTop() <= height && T.getRight() >= round && T.getLeft() <= width) {
                RecyclerView.C1231a0 h0 = this.f6775r.mo9068h0(T);
                if (this.f6770m.mo9860a(this.f6775r, this.f6760c, h0)) {
                    int abs = Math.abs(i2 - ((T.getLeft() + T.getRight()) / 2));
                    int abs2 = Math.abs(i3 - ((T.getTop() + T.getBottom()) / 2));
                    int i5 = (abs * abs) + (abs2 * abs2);
                    int size = this.f6778u.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i5 > this.f6779v.get(i6).intValue()) {
                        i7++;
                        i6++;
                        RecyclerView.C1231a0 a0Var3 = a0Var;
                    }
                    this.f6778u.add(i7, h0);
                    this.f6779v.add(i7, Integer.valueOf(i5));
                }
            }
            i4++;
            a0Var2 = a0Var;
        }
        return this.f6778u;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        float f;
        float f2;
        this.f6782y = -1;
        if (this.f6760c != null) {
            mo9846q(this.f6759b);
            float[] fArr = this.f6759b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f6770m.mo9879w(canvas, recyclerView, this.f6760c, this.f6773p, this.f6771n, f2, f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1260x xVar) {
        float f;
        float f2;
        if (this.f6760c != null) {
            mo9846q(this.f6759b);
            float[] fArr = this.f6759b;
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f2 = 0.0f;
            f = 0.0f;
        }
        this.f6770m.mo9880x(canvas, recyclerView, this.f6760c, this.f6773p, this.f6771n, f2, f);
    }

    /* renamed from: p */
    public final RecyclerView.C1231a0 mo9845p(MotionEvent motionEvent) {
        View n;
        RecyclerView.LayoutManager layoutManager = this.f6775r.getLayoutManager();
        int i = this.f6769l;
        if (i == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f6761d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f6762e);
        int i2 = this.f6774q;
        if (abs < ((float) i2) && abs2 < ((float) i2)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo8929v()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo8931w()) && (n = mo9843n(motionEvent)) != null) {
            return this.f6775r.mo9068h0(n);
        }
        return null;
    }

    /* renamed from: q */
    public final void mo9846q(float[] fArr) {
        if ((this.f6772o & 12) != 0) {
            fArr[0] = (this.f6767j + this.f6765h) - ((float) this.f6760c.itemView.getLeft());
        } else {
            fArr[0] = this.f6760c.itemView.getTranslationX();
        }
        if ((this.f6772o & 3) != 0) {
            fArr[1] = (this.f6768k + this.f6766i) - ((float) this.f6760c.itemView.getTop());
        } else {
            fArr[1] = this.f6760c.itemView.getTranslationY();
        }
    }

    /* renamed from: r */
    public boolean mo9847r() {
        int size = this.f6773p.size();
        for (int i = 0; i < size; i++) {
            if (!this.f6773p.get(i).f6800H) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public void mo9848t(RecyclerView.C1231a0 a0Var) {
        if (!this.f6775r.isLayoutRequested() && this.f6771n == 2) {
            float j = this.f6770m.mo9868j(a0Var);
            int i = (int) (this.f6767j + this.f6765h);
            int i2 = (int) (this.f6768k + this.f6766i);
            if (((float) Math.abs(i2 - a0Var.itemView.getTop())) >= ((float) a0Var.itemView.getHeight()) * j || ((float) Math.abs(i - a0Var.itemView.getLeft())) >= ((float) a0Var.itemView.getWidth()) * j) {
                List<RecyclerView.C1231a0> o = mo9844o(a0Var);
                if (o.size() != 0) {
                    RecyclerView.C1231a0 b = this.f6770m.mo9861b(a0Var, o, i, i2);
                    if (b == null) {
                        this.f6778u.clear();
                        this.f6779v.clear();
                        return;
                    }
                    int absoluteAdapterPosition = b.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = a0Var.getAbsoluteAdapterPosition();
                    if (this.f6770m.mo9881y(this.f6775r, a0Var, b)) {
                        this.f6770m.mo9882z(this.f6775r, a0Var, absoluteAdapterPosition2, b, absoluteAdapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public void mo9849u() {
        VelocityTracker velocityTracker = this.f6777t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f6777t = VelocityTracker.obtain();
    }

    /* renamed from: v */
    public void mo9850v(C1323g gVar, int i) {
        this.f6775r.post(new C1318d(gVar, i));
    }

    /* renamed from: w */
    public final void mo9851w() {
        VelocityTracker velocityTracker = this.f6777t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6777t = null;
        }
    }

    /* renamed from: x */
    public void mo9852x(View view) {
        if (view == this.f6781x) {
            this.f6781x = null;
            if (this.f6780w != null) {
                this.f6775r.setChildDrawingOrderCallback((RecyclerView.C1240j) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r1 > 0) goto L_0x00c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9853y() {
        /*
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r0.f6760c
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto L_0x000c
            r0.f6757D = r3
            return r2
        L_0x000c:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f6757D
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0019
            r7 = 0
            goto L_0x001b
        L_0x0019:
            long r7 = r5 - r7
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.f6775r
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.f6756C
            if (r9 != 0) goto L_0x002c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.f6756C = r9
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$a0 r9 = r0.f6760c
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.f6756C
            r1.mo9285u(r9, r10)
            boolean r9 = r1.mo8929v()
            r10 = 0
            if (r9 == 0) goto L_0x007d
            float r9 = r0.f6767j
            float r11 = r0.f6765h
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.f6756C
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6775r
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.f6765h
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x0059
            if (r11 >= 0) goto L_0x0059
            r12 = r11
            goto L_0x007e
        L_0x0059:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x007d
            androidx.recyclerview.widget.RecyclerView$a0 r11 = r0.f6760c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.f6756C
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.f6775r
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6775r
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L_0x007d
            r12 = r9
            goto L_0x007e
        L_0x007d:
            r12 = r2
        L_0x007e:
            boolean r1 = r1.mo8931w()
            if (r1 == 0) goto L_0x00c4
            float r1 = r0.f6768k
            float r9 = r0.f6766i
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.f6756C
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.f6775r
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.f6766i
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto L_0x00a1
            if (r9 >= 0) goto L_0x00a1
            r1 = r9
            goto L_0x00c5
        L_0x00a1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c4
            androidx.recyclerview.widget.RecyclerView$a0 r9 = r0.f6760c
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.f6756C
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.f6775r
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6775r
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            androidx.recyclerview.widget.k$e r9 = r0.f6770m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6775r
            androidx.recyclerview.widget.RecyclerView$a0 r11 = r0.f6760c
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.f6775r
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.mo9874p(r10, r11, r12, r13, r14)
        L_0x00de:
            r14 = r12
            if (r1 == 0) goto L_0x00fd
            androidx.recyclerview.widget.k$e r9 = r0.f6770m
            androidx.recyclerview.widget.RecyclerView r10 = r0.f6775r
            androidx.recyclerview.widget.RecyclerView$a0 r11 = r0.f6760c
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.f6775r
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.mo9874p(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto L_0x00fe
        L_0x00fd:
            r12 = r14
        L_0x00fe:
            if (r12 != 0) goto L_0x0106
            if (r1 == 0) goto L_0x0103
            goto L_0x0106
        L_0x0103:
            r0.f6757D = r3
            return r2
        L_0x0106:
            long r7 = r0.f6757D
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x010e
            r0.f6757D = r5
        L_0x010e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f6775r
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1314k.mo9853y():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9854z(androidx.recyclerview.widget.RecyclerView.C1231a0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$a0 r0 = r11.f6760c
            if (r12 != r0) goto L_0x000f
            int r0 = r11.f6771n
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.f6757D = r0
            int r4 = r11.f6771n
            r14 = 1
            r11.mo9841l(r12, r14)
            r11.f6771n = r13
            r15 = 2
            if (r13 != r15) goto L_0x0030
            if (r12 == 0) goto L_0x0028
            android.view.View r0 = r12.itemView
            r11.f6781x = r0
            r23.mo9835f()
            goto L_0x0030
        L_0x0028:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x0030:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$a0 r9 = r11.f6760c
            r8 = 0
            if (r9 == 0) goto L_0x00ed
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x00d9
            if (r4 != r15) goto L_0x004a
            r7 = r8
            goto L_0x004f
        L_0x004a:
            int r0 = r11.mo9833D(r9)
            r7 = r0
        L_0x004f:
            r23.mo9851w()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L_0x007c
            if (r7 == r15) goto L_0x007c
            if (r7 == r0) goto L_0x0069
            if (r7 == r10) goto L_0x0069
            r2 = 16
            if (r7 == r2) goto L_0x0069
            r2 = 32
            if (r7 == r2) goto L_0x0069
            r17 = r1
            r18 = r17
            goto L_0x008e
        L_0x0069:
            float r2 = r11.f6765h
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f6775r
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x008e
        L_0x007c:
            float r2 = r11.f6766i
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.f6775r
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x008e:
            if (r4 != r15) goto L_0x0092
            r6 = r10
            goto L_0x0097
        L_0x0092:
            if (r7 <= 0) goto L_0x0096
            r6 = r15
            goto L_0x0097
        L_0x0096:
            r6 = r0
        L_0x0097:
            float[] r0 = r11.f6759b
            r11.mo9846q(r0)
            float[] r0 = r11.f6759b
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.k$c r5 = new androidx.recyclerview.widget.k$c
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.k$e r0 = r11.f6770m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6775r
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.mo9865g(r1, r15, r2, r3)
            r14.mo9889b(r0)
            java.util.List<androidx.recyclerview.widget.k$g> r0 = r11.f6773p
            r0.add(r14)
            r14.mo9891d()
            r8 = 1
            goto L_0x00e9
        L_0x00d9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.mo9852x(r1)
            androidx.recyclerview.widget.k$e r1 = r11.f6770m
            androidx.recyclerview.widget.RecyclerView r2 = r11.f6775r
            r1.mo9862c(r2, r0)
            r8 = 0
        L_0x00e9:
            r0 = 0
            r11.f6760c = r0
            goto L_0x00f0
        L_0x00ed:
            r21 = r10
            r8 = 0
        L_0x00f0:
            if (r12 == 0) goto L_0x0121
            androidx.recyclerview.widget.k$e r0 = r11.f6770m
            androidx.recyclerview.widget.RecyclerView r1 = r11.f6775r
            int r0 = r0.mo9864f(r1, r12)
            r0 = r0 & r16
            int r1 = r11.f6771n
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.f6772o = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.f6767j = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.f6768k = r0
            r11.f6760c = r12
            r0 = 2
            if (r13 != r0) goto L_0x0121
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L_0x0122
        L_0x0121:
            r1 = 0
        L_0x0122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6775r
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x0134
            androidx.recyclerview.widget.RecyclerView$a0 r2 = r11.f6760c
            if (r2 == 0) goto L_0x0130
            r14 = 1
            goto L_0x0131
        L_0x0130:
            r14 = r1
        L_0x0131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x0134:
            if (r8 != 0) goto L_0x013f
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6775r
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.mo9202D1()
        L_0x013f:
            androidx.recyclerview.widget.k$e r0 = r11.f6770m
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r11.f6760c
            int r2 = r11.f6771n
            r0.mo9858A(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.f6775r
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1314k.mo9854z(androidx.recyclerview.widget.RecyclerView$a0, int):void");
    }
}
