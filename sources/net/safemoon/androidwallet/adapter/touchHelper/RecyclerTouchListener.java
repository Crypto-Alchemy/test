package net.safemoon.androidwallet.adapter.touchHelper;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class RecyclerTouchListener implements RecyclerView.C1250q, wg4 {

    /* renamed from: A */
    public int f41578A;

    /* renamed from: B */
    public View f41579B;

    /* renamed from: C */
    public boolean f41580C;

    /* renamed from: D */
    public int f41581D;

    /* renamed from: E */
    public int f41582E;

    /* renamed from: F */
    public boolean f41583F;

    /* renamed from: G */
    public View f41584G;

    /* renamed from: H */
    public View f41585H;

    /* renamed from: I */
    public int f41586I;

    /* renamed from: J */
    public int f41587J;

    /* renamed from: K */
    public ArrayList<Integer> f41588K;

    /* renamed from: L */
    public C8239g f41589L;

    /* renamed from: M */
    public C8240h f41590M;

    /* renamed from: N */
    public C8243k f41591N;

    /* renamed from: O */
    public boolean f41592O = false;

    /* renamed from: P */
    public boolean f41593P = false;

    /* renamed from: Q */
    public boolean f41594Q = false;

    /* renamed from: R */
    public boolean f41595R = false;

    /* renamed from: S */
    public int f41596S = 800;

    /* renamed from: T */
    public boolean f41597T;

    /* renamed from: U */
    public Runnable f41598U = new C8233a();

    /* renamed from: V */
    public C8242j f41599V;

    /* renamed from: W */
    public C8241i f41600W;

    /* renamed from: X */
    public int f41601X = 0;

    /* renamed from: a */
    public final Handler f41602a = new Handler();

    /* renamed from: b */
    public Activity f41603b;

    /* renamed from: c */
    public List<Integer> f41604c;

    /* renamed from: d */
    public List<Integer> f41605d;

    /* renamed from: e */
    public List<Integer> f41606e;

    /* renamed from: f */
    public List<Integer> f41607f;

    /* renamed from: g */
    public Set<Integer> f41608g;

    /* renamed from: h */
    public int f41609h;

    /* renamed from: i */
    public int f41610i;

    /* renamed from: j */
    public int f41611j;

    /* renamed from: k */
    public long f41612k = 300;

    /* renamed from: l */
    public long f41613l = 150;

    /* renamed from: m */
    public RecyclerView f41614m;

    /* renamed from: n */
    public int f41615n = 1;

    /* renamed from: o */
    public int f41616o = 1;

    /* renamed from: p */
    public int f41617p = 0;

    /* renamed from: q */
    public float f41618q;

    /* renamed from: r */
    public float f41619r;

    /* renamed from: s */
    public boolean f41620s;

    /* renamed from: t */
    public int f41621t;

    /* renamed from: u */
    public VelocityTracker f41622u;

    /* renamed from: v */
    public int f41623v;

    /* renamed from: w */
    public View f41624w;

    /* renamed from: x */
    public boolean f41625x;

    /* renamed from: y */
    public boolean f41626y;

    /* renamed from: z */
    public boolean f41627z;

    public enum Animation {
        OPEN,
        CLOSE
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$a */
    public class C8233a implements Runnable {
        public C8233a() {
        }

        public void run() {
            if (RecyclerTouchListener.this.f41593P) {
                RecyclerTouchListener.this.f41583F = true;
                if (!RecyclerTouchListener.this.f41626y && RecyclerTouchListener.this.f41623v >= 0) {
                    RecyclerTouchListener recyclerTouchListener = RecyclerTouchListener.this;
                    if (!recyclerTouchListener.f41606e.contains(Integer.valueOf(recyclerTouchListener.f41623v)) && !RecyclerTouchListener.this.f41580C) {
                        boolean unused = RecyclerTouchListener.this.f41597T;
                        RecyclerTouchListener.this.f41590M.mo57052a(RecyclerTouchListener.this.f41623v);
                    }
                }
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$b */
    public class C8234b extends RecyclerView.C1251r {
        public C8234b() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            boolean z;
            RecyclerTouchListener recyclerTouchListener = RecyclerTouchListener.this;
            boolean z2 = false;
            if (i != 1) {
                z = true;
            } else {
                z = false;
            }
            recyclerTouchListener.mo57035w(z);
            RecyclerTouchListener recyclerTouchListener2 = RecyclerTouchListener.this;
            if (i != 0) {
                z2 = true;
            }
            recyclerTouchListener2.f41580C = z2;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$c */
    public class C8235c implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C8242j f41631a;

        /* renamed from: d */
        public final /* synthetic */ ObjectAnimator f41632d;

        public C8235c(C8242j jVar, ObjectAnimator objectAnimator) {
            this.f41631a = jVar;
            this.f41632d = objectAnimator;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C8242j jVar = this.f41631a;
            if (jVar != null) {
                jVar.mo57049b();
            }
            this.f41632d.removeAllListeners();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$d */
    public class C8236d implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C8242j f41634a;

        /* renamed from: d */
        public final /* synthetic */ Animation f41635d;

        /* renamed from: e */
        public final /* synthetic */ ObjectAnimator f41636e;

        public C8236d(C8242j jVar, Animation animation, ObjectAnimator objectAnimator) {
            this.f41634a = jVar;
            this.f41635d = animation;
            this.f41636e = objectAnimator;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C8242j jVar = this.f41634a;
            if (jVar != null) {
                Animation animation = this.f41635d;
                if (animation == Animation.OPEN) {
                    jVar.mo57048a();
                } else if (animation == Animation.CLOSE) {
                    jVar.mo57049b();
                }
            }
            this.f41636e.removeAllListeners();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$e */
    public class C8237e implements C8242j {

        /* renamed from: a */
        public final /* synthetic */ View f41638a;

        public C8237e(View view) {
            this.f41638a = view;
        }

        /* renamed from: a */
        public void mo57048a() {
            if (RecyclerTouchListener.this.f41599V != null) {
                RecyclerTouchListener.this.f41599V.mo57048a();
            }
        }

        /* renamed from: b */
        public void mo57049b() {
            if (RecyclerTouchListener.this.f41599V != null) {
                RecyclerTouchListener.this.f41599V.mo57049b();
            }
            View view = this.f41638a;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$f */
    public class C8238f implements C8242j {

        /* renamed from: a */
        public final /* synthetic */ int f41640a;

        /* renamed from: b */
        public final /* synthetic */ int f41641b;

        public C8238f(int i, int i2) {
            this.f41640a = i;
            this.f41641b = i2;
        }

        /* renamed from: a */
        public void mo57048a() {
            if (RecyclerTouchListener.this.f41599V != null) {
                RecyclerTouchListener.this.f41599V.mo57048a();
            }
        }

        /* renamed from: b */
        public void mo57049b() {
            RecyclerTouchListener.this.f41591N.mo52882a(this.f41640a, this.f41641b);
            if (RecyclerTouchListener.this.f41599V != null) {
                RecyclerTouchListener.this.f41599V.mo57049b();
            }
        }
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$g */
    public interface C8239g {
        /* renamed from: a */
        void mo57050a(int i);

        /* renamed from: b */
        void mo57051b(int i, int i2);
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$h */
    public interface C8240h {
        /* renamed from: a */
        void mo57052a(int i);
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$i */
    public interface C8241i {
        /* renamed from: a */
        void mo57053a();

        /* renamed from: b */
        void mo57054b();
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$j */
    public interface C8242j {
        /* renamed from: a */
        void mo57048a();

        /* renamed from: b */
        void mo57049b();
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$k */
    public interface C8243k {
        /* renamed from: a */
        void mo52882a(int i, int i2);
    }

    /* renamed from: net.safemoon.androidwallet.adapter.touchHelper.RecyclerTouchListener$l */
    public interface C8244l {
        /* renamed from: a */
        void mo57055a(wg4 wg4);
    }

    public RecyclerTouchListener(Activity activity, RecyclerView recyclerView) {
        this.f41603b = activity;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        this.f41609h = viewConfiguration.getScaledTouchSlop();
        this.f41610i = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f41611j = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f41614m = recyclerView;
        this.f41626y = false;
        this.f41578A = -1;
        this.f41579B = null;
        this.f41627z = false;
        this.f41604c = new ArrayList();
        this.f41606e = new ArrayList();
        this.f41608g = new HashSet();
        this.f41605d = new ArrayList();
        this.f41607f = new ArrayList();
        this.f41588K = new ArrayList<>();
        this.f41580C = false;
        this.f41614m.mo9081l(new C8234b());
    }

    /* renamed from: A */
    public final boolean mo57025A(int i) {
        RecyclerView recyclerView = this.f41614m;
        if (recyclerView == null || this.f41608g.contains(Integer.valueOf(recyclerView.getAdapter().getItemViewType(i)))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo9441a(RecyclerView recyclerView, MotionEvent motionEvent) {
        mo57033u(motionEvent);
    }

    /* renamed from: c */
    public boolean mo9442c(RecyclerView recyclerView, MotionEvent motionEvent) {
        return mo57033u(motionEvent);
    }

    /* renamed from: e */
    public void mo9443e(boolean z) {
    }

    /* renamed from: n */
    public final void mo57026n(View view, Animation animation, long j) {
        if (animation == Animation.OPEN) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f41584G, View.TRANSLATION_X, new float[]{(float) (-this.f41615n)});
            ofFloat.setDuration(j);
            ofFloat.setInterpolator(new DecelerateInterpolator(1.5f));
            ofFloat.start();
            mo57028p(view, Utils.FLOAT_EPSILON, j);
        } else if (animation == Animation.CLOSE) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f41584G, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat2.setDuration(j);
            ofFloat2.setInterpolator(new DecelerateInterpolator(1.5f));
            ofFloat2.start();
            mo57028p(view, 1.0f, j);
        }
    }

    /* renamed from: o */
    public final void mo57027o(View view, Animation animation, long j, C8242j jVar) {
        ObjectAnimator objectAnimator;
        if (animation == Animation.OPEN) {
            objectAnimator = ObjectAnimator.ofFloat(this.f41584G, View.TRANSLATION_X, new float[]{(float) (-this.f41615n)});
            objectAnimator.setDuration(j);
            objectAnimator.setInterpolator(new DecelerateInterpolator(1.5f));
            objectAnimator.start();
            mo57028p(view, Utils.FLOAT_EPSILON, j);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.f41584G, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator.setDuration(j);
            objectAnimator.setInterpolator(new DecelerateInterpolator(1.5f));
            objectAnimator.start();
            mo57028p(view, 1.0f, j);
        }
        objectAnimator.addListener(new C8236d(jVar, animation, objectAnimator));
    }

    /* renamed from: p */
    public final void mo57028p(View view, float f, long j) {
        ArrayList<Integer> arrayList = this.f41588K;
        if (arrayList != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                view.findViewById(it.next().intValue()).animate().alpha(f).setDuration(j);
            }
        }
    }

    @Deprecated
    /* renamed from: q */
    public void mo57029q() {
        View view = this.f41579B;
        if (view != null) {
            view.animate().translationX(Utils.FLOAT_EPSILON).setDuration(this.f41613l).setListener((Animator.AnimatorListener) null);
            mo57028p(this.f41579B, 1.0f, this.f41613l);
            this.f41626y = false;
            this.f41579B = null;
            this.f41578A = -1;
        }
    }

    /* renamed from: r */
    public void mo57030r(C8242j jVar) {
        View view = this.f41579B;
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{0.0f});
            ofFloat.setDuration(this.f41613l);
            ofFloat.addListener(new C8235c(jVar, ofFloat));
            ofFloat.start();
            mo57028p(this.f41579B, 1.0f, this.f41613l);
            this.f41626y = false;
            this.f41579B = null;
            this.f41578A = -1;
        }
    }

    /* renamed from: s */
    public final int mo57031s(MotionEvent motionEvent) {
        for (int i = 0; i < this.f41605d.size(); i++) {
            if (this.f41624w != null) {
                Rect rect = new Rect();
                this.f41624w.findViewById(this.f41605d.get(i).intValue()).getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return this.f41605d.get(i).intValue();
                }
            }
        }
        return -1;
    }

    /* renamed from: t */
    public final int mo57032t(MotionEvent motionEvent) {
        for (int i = 0; i < this.f41607f.size(); i++) {
            if (this.f41624w != null) {
                Rect rect = new Rect();
                this.f41624w.findViewById(this.f41607f.get(i).intValue()).getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return this.f41607f.get(i).intValue();
                }
            }
        }
        return -1;
    }

    /* renamed from: u */
    public final boolean mo57033u(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int t;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        boolean z5;
        C8241i iVar;
        if (this.f41594Q && this.f41615n < 2) {
            if (this.f41603b.findViewById(this.f41587J) != null) {
                this.f41615n = this.f41603b.findViewById(this.f41587J).getWidth();
            }
            this.f41581D = this.f41582E - this.f41614m.getHeight();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f = Utils.FLOAT_EPSILON;
            if (actionMasked == 1) {
                C8241i iVar2 = this.f41600W;
                if (iVar2 != null) {
                    iVar2.mo57054b();
                }
                this.f41602a.removeCallbacks(this.f41598U);
                if (!this.f41583F && ((this.f41622u != null || !this.f41594Q) && this.f41623v >= 0)) {
                    float rawX = motionEvent.getRawX() - this.f41618q;
                    if (this.f41620s) {
                        z2 = rawX < Utils.FLOAT_EPSILON;
                        z = rawX > Utils.FLOAT_EPSILON;
                    } else {
                        z2 = false;
                        z = false;
                    }
                    if (Math.abs(rawX) <= ((float) (this.f41615n / 2)) || !this.f41620s) {
                        if (this.f41594Q) {
                            this.f41622u.addMovement(motionEvent);
                            this.f41622u.computeCurrentVelocity(1000);
                            float xVelocity = this.f41622u.getXVelocity();
                            float abs = Math.abs(xVelocity);
                            float abs2 = Math.abs(this.f41622u.getYVelocity());
                            if (((float) this.f41610i) <= abs && abs <= ((float) this.f41611j) && abs2 < abs && this.f41620s) {
                                boolean z6 = ((xVelocity > Utils.FLOAT_EPSILON ? 1 : (xVelocity == Utils.FLOAT_EPSILON ? 0 : -1)) < 0) == ((rawX > Utils.FLOAT_EPSILON ? 1 : (rawX == Utils.FLOAT_EPSILON ? 0 : -1)) < 0);
                                z4 = ((xVelocity > Utils.FLOAT_EPSILON ? 1 : (xVelocity == Utils.FLOAT_EPSILON ? 0 : -1)) > 0) == ((rawX > Utils.FLOAT_EPSILON ? 1 : (rawX == Utils.FLOAT_EPSILON ? 0 : -1)) > 0);
                                z3 = z6;
                            }
                        }
                        z4 = false;
                        z3 = false;
                    } else {
                        z3 = rawX < Utils.FLOAT_EPSILON;
                        z4 = rawX > Utils.FLOAT_EPSILON;
                    }
                    if (this.f41594Q && !z && z3 && (i5 = this.f41623v) != -1 && !this.f41604c.contains(Integer.valueOf(i5)) && !this.f41626y) {
                        View view = this.f41624w;
                        int i6 = this.f41623v;
                        this.f41617p++;
                        mo57026n(view, Animation.OPEN, this.f41612k);
                        this.f41626y = true;
                        this.f41579B = this.f41584G;
                        this.f41578A = i6;
                    } else if (!this.f41594Q || z2 || !z4 || (i4 = this.f41623v) == -1 || this.f41604c.contains(Integer.valueOf(i4)) || !this.f41626y) {
                        boolean z7 = this.f41594Q;
                        if (z7 && z2 && !this.f41626y) {
                            mo57027o(this.f41624w, Animation.CLOSE, this.f41612k, new C8237e(this.f41585H));
                            this.f41626y = false;
                            this.f41579B = null;
                            this.f41578A = -1;
                        } else if (z7 && z && this.f41626y) {
                            mo57026n(this.f41624w, Animation.OPEN, this.f41612k);
                            this.f41626y = true;
                            this.f41579B = this.f41584G;
                            this.f41578A = this.f41623v;
                        } else if (z7 && z && !this.f41626y) {
                            mo57026n(this.f41624w, Animation.CLOSE, this.f41612k);
                            this.f41626y = false;
                            this.f41579B = null;
                            this.f41578A = -1;
                        } else if (z7 && z2 && this.f41626y) {
                            mo57026n(this.f41624w, Animation.OPEN, this.f41612k);
                            this.f41626y = true;
                            this.f41579B = this.f41584G;
                            this.f41578A = this.f41623v;
                        } else if (!z && !z2) {
                            if (z7 && this.f41627z) {
                                mo57026n(this.f41624w, Animation.CLOSE, this.f41612k);
                                this.f41626y = false;
                                this.f41579B = null;
                                this.f41578A = -1;
                            } else if (this.f41592O && !this.f41626y && (i3 = this.f41623v) >= 0 && !this.f41606e.contains(Integer.valueOf(i3)) && mo57034v(motionEvent) && !this.f41580C) {
                                this.f41589L.mo57050a(this.f41623v);
                            } else if (this.f41592O && !this.f41626y && (i2 = this.f41623v) >= 0 && !this.f41606e.contains(Integer.valueOf(i2)) && !mo57034v(motionEvent) && !this.f41580C) {
                                int s = mo57031s(motionEvent);
                                if (s >= 0) {
                                    this.f41589L.mo57051b(s, this.f41623v);
                                }
                            } else if (this.f41594Q && this.f41626y && !this.f41627z && (t = mo57032t(motionEvent)) >= 0 && (i = this.f41623v) >= 0) {
                                mo57030r(new C8238f(t, i));
                            }
                        }
                    } else {
                        View view2 = this.f41624w;
                        this.f41617p++;
                        mo57026n(view2, Animation.CLOSE, this.f41612k);
                        this.f41626y = false;
                        this.f41579B = null;
                        this.f41578A = -1;
                    }
                    if (this.f41594Q) {
                        this.f41622u.recycle();
                        this.f41622u = null;
                    }
                    this.f41618q = Utils.FLOAT_EPSILON;
                    this.f41619r = Utils.FLOAT_EPSILON;
                    this.f41624w = null;
                    this.f41623v = -1;
                    this.f41620s = false;
                    this.f41585H = null;
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f41602a.removeCallbacks(this.f41598U);
                    if (!this.f41583F && this.f41622u != null) {
                        if (this.f41594Q) {
                            if (!(this.f41624w == null || !this.f41620s || this.f41623v == -1)) {
                                if (motionEvent.getRawX() - this.f41618q < Utils.FLOAT_EPSILON) {
                                    this.f41617p++;
                                    mo57026n(this.f41624w, Animation.OPEN, this.f41612k);
                                    this.f41626y = true;
                                    this.f41579B = this.f41584G;
                                    this.f41578A = this.f41623v;
                                }
                            }
                            View view3 = this.f41624w;
                            if (view3 != null && this.f41620s) {
                                mo57026n(view3, Animation.CLOSE, this.f41612k);
                            }
                            this.f41622u.recycle();
                            this.f41622u = null;
                            this.f41620s = false;
                            this.f41585H = null;
                        }
                        this.f41618q = Utils.FLOAT_EPSILON;
                        this.f41619r = Utils.FLOAT_EPSILON;
                        this.f41624w = null;
                        this.f41623v = -1;
                    }
                }
            } else if (!this.f41583F && (velocityTracker = this.f41622u) != null && !this.f41625x && this.f41594Q) {
                this.f41601X++;
                velocityTracker.addMovement(motionEvent);
                float rawX2 = motionEvent.getRawX() - this.f41618q;
                float rawY = motionEvent.getRawY() - this.f41619r;
                if (!this.f41620s && Math.abs(rawX2) > ((float) this.f41609h) && Math.abs(rawY) < Math.abs(rawX2) / 2.0f) {
                    this.f41602a.removeCallbacks(this.f41598U);
                    this.f41620s = true;
                    this.f41621t = rawX2 > Utils.FLOAT_EPSILON ? this.f41609h : -this.f41609h;
                }
                if (!this.f41620s && this.f41601X > 6 && (iVar = this.f41600W) != null) {
                    iVar.mo57054b();
                }
                if (this.f41594Q && this.f41620s && !this.f41604c.contains(Integer.valueOf(this.f41623v))) {
                    if (this.f41585H == null) {
                        View findViewById = this.f41624w.findViewById(this.f41587J);
                        this.f41585H = findViewById;
                        findViewById.setVisibility(0);
                    }
                    if (rawX2 < ((float) this.f41609h) && !this.f41626y) {
                        float f2 = rawX2 - ((float) this.f41621t);
                        View view4 = this.f41584G;
                        float abs3 = Math.abs(f2);
                        int i7 = this.f41615n;
                        view4.setTranslationX(abs3 > ((float) i7) ? (float) (-i7) : f2);
                        if (this.f41584G.getTranslationX() > Utils.FLOAT_EPSILON) {
                            this.f41584G.setTranslationX(Utils.FLOAT_EPSILON);
                        }
                        ArrayList<Integer> arrayList = this.f41588K;
                        if (arrayList != null) {
                            Iterator<Integer> it = arrayList.iterator();
                            while (it.hasNext()) {
                                this.f41624w.findViewById(it.next().intValue()).setAlpha(1.0f - (Math.abs(f2) / ((float) this.f41615n)));
                            }
                        }
                    } else if (rawX2 > Utils.FLOAT_EPSILON && (z5 = this.f41626y)) {
                        if (z5) {
                            float f3 = (rawX2 - ((float) this.f41621t)) - ((float) this.f41615n);
                            View view5 = this.f41584G;
                            if (f3 <= Utils.FLOAT_EPSILON) {
                                f = f3;
                            }
                            view5.setTranslationX(f);
                            ArrayList<Integer> arrayList2 = this.f41588K;
                            if (arrayList2 != null) {
                                Iterator<Integer> it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    this.f41624w.findViewById(it2.next().intValue()).setAlpha(1.0f - (Math.abs(f3) / ((float) this.f41615n)));
                                }
                            }
                        } else {
                            float f4 = (rawX2 - ((float) this.f41621t)) - ((float) this.f41615n);
                            View view6 = this.f41584G;
                            if (f4 <= Utils.FLOAT_EPSILON) {
                                f = f4;
                            }
                            view6.setTranslationX(f);
                            ArrayList<Integer> arrayList3 = this.f41588K;
                            if (arrayList3 != null) {
                                Iterator<Integer> it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    this.f41624w.findViewById(it3.next().intValue()).setAlpha(1.0f - (Math.abs(f4) / ((float) this.f41615n)));
                                }
                            }
                        }
                    }
                    return true;
                } else if (this.f41594Q && this.f41620s && this.f41604c.contains(Integer.valueOf(this.f41623v))) {
                    C8241i iVar3 = this.f41600W;
                    if (iVar3 != null) {
                        iVar3.mo57054b();
                    }
                    if (rawX2 < ((float) this.f41609h) && !this.f41626y) {
                        float f5 = rawX2 - ((float) this.f41621t);
                        if (this.f41585H == null) {
                            this.f41585H = this.f41624w.findViewById(this.f41587J);
                        }
                        View view7 = this.f41585H;
                        if (view7 != null) {
                            view7.setVisibility(8);
                        }
                        this.f41584G.setTranslationX(f5 / 5.0f);
                        if (this.f41584G.getTranslationX() > Utils.FLOAT_EPSILON) {
                            this.f41584G.setTranslationX(Utils.FLOAT_EPSILON);
                        }
                    }
                    return true;
                }
            }
        } else {
            this.f41601X = 0;
            if (!this.f41625x) {
                Rect rect = new Rect();
                int childCount = this.f41614m.getChildCount();
                int[] iArr = new int[2];
                this.f41614m.getLocationOnScreen(iArr);
                int rawX3 = ((int) motionEvent.getRawX()) - iArr[0];
                int rawY2 = ((int) motionEvent.getRawY()) - iArr[1];
                int i8 = 0;
                while (true) {
                    if (i8 >= childCount) {
                        break;
                    }
                    View childAt = this.f41614m.getChildAt(i8);
                    childAt.getHitRect(rect);
                    if (rect.contains(rawX3, rawY2)) {
                        this.f41624w = childAt;
                        break;
                    }
                    i8++;
                }
                if (this.f41624w != null) {
                    C8241i iVar4 = this.f41600W;
                    if (iVar4 != null) {
                        iVar4.mo57053a();
                    }
                    this.f41618q = motionEvent.getRawX();
                    this.f41619r = motionEvent.getRawY();
                    int f0 = this.f41614m.mo9041f0(this.f41624w);
                    this.f41623v = f0;
                    if (mo57025A(f0)) {
                        this.f41623v = -1;
                        return false;
                    }
                    if (this.f41593P) {
                        this.f41583F = false;
                        this.f41602a.postDelayed(this.f41598U, (long) this.f41596S);
                    }
                    if (this.f41594Q) {
                        VelocityTracker obtain = VelocityTracker.obtain();
                        this.f41622u = obtain;
                        obtain.addMovement(motionEvent);
                        this.f41584G = this.f41624w.findViewById(this.f41586I);
                        View findViewById2 = this.f41624w.findViewById(this.f41587J);
                        this.f41585H = findViewById2;
                        View view8 = this.f41584G;
                        if (view8 != null) {
                            findViewById2.setMinimumHeight(view8.getHeight());
                        }
                        if (!this.f41626y || this.f41584G == null) {
                            this.f41627z = false;
                        } else {
                            this.f41602a.removeCallbacks(this.f41598U);
                            this.f41584G.getGlobalVisibleRect(rect);
                            this.f41627z = rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        }
                    }
                }
                motionEvent.getRawX();
                motionEvent.getRawY();
                this.f41614m.getHitRect(rect);
                if (this.f41594Q && this.f41626y && this.f41623v != this.f41578A) {
                    this.f41602a.removeCallbacks(this.f41598U);
                    mo57030r((C8242j) null);
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public final boolean mo57034v(MotionEvent motionEvent) {
        for (int i = 0; i < this.f41605d.size(); i++) {
            if (this.f41624w != null) {
                Rect rect = new Rect();
                this.f41624w.findViewById(this.f41605d.get(i).intValue()).getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: w */
    public void mo57035w(boolean z) {
        this.f41625x = !z;
    }

    /* renamed from: x */
    public RecyclerTouchListener mo57036x(Integer... numArr) {
        this.f41607f = new ArrayList(Arrays.asList(numArr));
        return this;
    }

    /* renamed from: y */
    public RecyclerTouchListener mo57037y(int i, int i2, C8243k kVar) {
        this.f41594Q = true;
        int i3 = this.f41586I;
        if (i3 == 0 || i == i3) {
            this.f41586I = i;
            this.f41587J = i2;
            this.f41591N = kVar;
            Activity activity = this.f41603b;
            if (activity instanceof C8244l) {
                ((C8244l) activity).mo57055a(this);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f41603b.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            this.f41582E = displayMetrics.heightPixels;
            return this;
        }
        throw new IllegalArgumentException("foregroundID does not match previously set ID");
    }

    /* renamed from: z */
    public RecyclerTouchListener mo57038z(Integer... numArr) {
        this.f41604c = new ArrayList(Arrays.asList(numArr));
        return this;
    }
}
