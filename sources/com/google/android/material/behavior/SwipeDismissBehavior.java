package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import p000.C3335t8;
import p000.C3658y8;
import p000.bc7;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public bc7 f23382a;

    /* renamed from: b */
    public C4188c f23383b;

    /* renamed from: c */
    public boolean f23384c;

    /* renamed from: d */
    public float f23385d = Utils.FLOAT_EPSILON;

    /* renamed from: e */
    public boolean f23386e;

    /* renamed from: f */
    public int f23387f = 2;

    /* renamed from: g */
    public float f23388g = 0.5f;

    /* renamed from: h */
    public float f23389h = Utils.FLOAT_EPSILON;

    /* renamed from: i */
    public float f23390i = 0.5f;

    /* renamed from: j */
    public final bc7.C1622c f23391j = new C4186a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C4186a extends bc7.C1622c {

        /* renamed from: a */
        public int f23392a;

        /* renamed from: b */
        public int f23393b = -1;

        public C4186a() {
        }

        /* renamed from: a */
        public int mo5582a(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int width;
            if (ga7.m17715B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.f23387f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f23392a - view.getWidth();
                    i4 = view.getWidth() + this.f23392a;
                } else if (z) {
                    i3 = this.f23392a;
                    width = view.getWidth();
                } else {
                    i3 = this.f23392a - view.getWidth();
                    i4 = this.f23392a;
                }
                return SwipeDismissBehavior.m34707c(i3, i, i4);
            } else if (z) {
                i3 = this.f23392a - view.getWidth();
                i4 = this.f23392a;
                return SwipeDismissBehavior.m34707c(i3, i, i4);
            } else {
                i3 = this.f23392a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m34707c(i3, i, i4);
        }

        /* renamed from: b */
        public int mo5583b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo5584d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo5588i(View view, int i) {
            this.f23393b = i;
            this.f23392a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo5589j(int i) {
            C4188c cVar = SwipeDismissBehavior.this.f23383b;
            if (cVar != null) {
                cVar.mo31774b(i);
            }
        }

        /* renamed from: k */
        public void mo5590k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f23392a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f23389h);
            float width2 = ((float) this.f23392a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f23390i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(Utils.FLOAT_EPSILON);
            } else {
                view.setAlpha(SwipeDismissBehavior.m34706b(Utils.FLOAT_EPSILON, 1.0f - SwipeDismissBehavior.m34708e(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo5591l(View view, float f, float f2) {
            boolean z;
            int i;
            C4188c cVar;
            this.f23393b = -1;
            int width = view.getWidth();
            if (mo31772n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f23392a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f23392a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f23382a.mo11502P(i, view.getTop())) {
                ga7.m17769h0(view, new C4189d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f23383b) != null) {
                cVar.mo31773a(view);
            }
        }

        /* renamed from: m */
        public boolean mo5592m(View view, int i) {
            int i2 = this.f23393b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo31765a(view)) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final boolean mo31772n(View view, float f) {
            boolean z;
            int i = (f > Utils.FLOAT_EPSILON ? 1 : (f == Utils.FLOAT_EPSILON ? 0 : -1));
            if (i != 0) {
                if (ga7.m17715B(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f23387f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= Utils.FLOAT_EPSILON) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= Utils.FLOAT_EPSILON) {
                        return false;
                    }
                    return true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f23392a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f23388g)) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C4187b implements C3658y8 {
        public C4187b() {
        }

        /* renamed from: a */
        public boolean mo5572a(View view, C3658y8.C3659a aVar) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo31765a(view)) {
                return false;
            }
            if (ga7.m17715B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f23387f;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            ga7.m17753Z(view, width);
            view.setAlpha(Utils.FLOAT_EPSILON);
            C4188c cVar = SwipeDismissBehavior.this.f23383b;
            if (cVar != null) {
                cVar.mo31773a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C4188c {
        /* renamed from: a */
        void mo31773a(View view);

        /* renamed from: b */
        void mo31774b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    public class C4189d implements Runnable {

        /* renamed from: a */
        public final View f23396a;

        /* renamed from: d */
        public final boolean f23397d;

        public C4189d(View view, boolean z) {
            this.f23396a = view;
            this.f23397d = z;
        }

        public void run() {
            C4188c cVar;
            bc7 bc7 = SwipeDismissBehavior.this.f23382a;
            if (bc7 != null && bc7.mo11519n(true)) {
                ga7.m17769h0(this.f23396a, this);
            } else if (this.f23397d && (cVar = SwipeDismissBehavior.this.f23383b) != null) {
                cVar.mo31773a(this.f23396a);
            }
        }
    }

    /* renamed from: b */
    public static float m34706b(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: c */
    public static int m34707c(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: e */
    public static float m34708e(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo31765a(View view) {
        return true;
    }

    /* renamed from: d */
    public final void mo31766d(ViewGroup viewGroup) {
        bc7 bc7;
        if (this.f23382a == null) {
            if (this.f23386e) {
                bc7 = bc7.m11209o(viewGroup, this.f23385d, this.f23391j);
            } else {
                bc7 = bc7.m11210p(viewGroup, this.f23391j);
            }
            this.f23382a = bc7;
        }
    }

    /* renamed from: f */
    public void mo31767f(float f) {
        this.f23390i = m34706b(Utils.FLOAT_EPSILON, f, 1.0f);
    }

    /* renamed from: g */
    public void mo31768g(C4188c cVar) {
        this.f23383b = cVar;
    }

    /* renamed from: h */
    public void mo31769h(float f) {
        this.f23389h = m34706b(Utils.FLOAT_EPSILON, f, 1.0f);
    }

    /* renamed from: i */
    public void mo31770i(int i) {
        this.f23387f = i;
    }

    /* renamed from: j */
    public final void mo31771j(View view) {
        ga7.m17773j0(view, 1048576);
        if (mo31765a(view)) {
            ga7.m17777l0(view, C3335t8.C3336a.f18024y, (CharSequence) null, new C4187b());
        }
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f23384c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f23384c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f23384c = false;
        }
        if (!z) {
            return false;
        }
        mo31766d(coordinatorLayout);
        return this.f23382a.mo11503Q(motionEvent);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (ga7.m17804z(v) == 0) {
            ga7.m17714A0(v, 1);
            mo31771j(v);
        }
        return onLayoutChild;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        bc7 bc7 = this.f23382a;
        if (bc7 == null) {
            return false;
        }
        bc7.mo11493G(motionEvent);
        return true;
    }
}
