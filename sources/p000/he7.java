package p000;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: he7 */
/* compiled from: ViewTarget */
public abstract class he7<T extends View, Z> extends C2796lz<Z> {

    /* renamed from: r */
    public static boolean f12835r;

    /* renamed from: s */
    public static int f12836s = f35.glide_custom_view_target_tag;

    /* renamed from: a */
    public final T f12837a;

    /* renamed from: d */
    public final C2466a f12838d;

    /* renamed from: e */
    public View.OnAttachStateChangeListener f12839e;

    /* renamed from: g */
    public boolean f12840g;

    /* renamed from: k */
    public boolean f12841k;

    /* renamed from: he7$a */
    /* compiled from: ViewTarget */
    public static final class C2466a {

        /* renamed from: e */
        public static Integer f12842e;

        /* renamed from: a */
        public final View f12843a;

        /* renamed from: b */
        public final List<x36> f12844b = new ArrayList();

        /* renamed from: c */
        public boolean f12845c;

        /* renamed from: d */
        public C2467a f12846d;

        /* renamed from: he7$a$a */
        /* compiled from: ViewTarget */
        public static final class C2467a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C2466a> f12847a;

            public C2467a(C2466a aVar) {
                this.f12847a = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C2466a aVar = this.f12847a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo21110a();
                return true;
            }
        }

        public C2466a(View view) {
            this.f12843a = view;
        }

        /* renamed from: c */
        public static int m18813c(Context context) {
            if (f12842e == null) {
                Display defaultDisplay = ((WindowManager) zt4.m31500d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f12842e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f12842e.intValue();
        }

        /* renamed from: a */
        public void mo21110a() {
            if (!this.f12844b.isEmpty()) {
                int g = mo21115g();
                int f = mo21114f();
                if (mo21117i(g, f)) {
                    mo21118j(g, f);
                    mo21111b();
                }
            }
        }

        /* renamed from: b */
        public void mo21111b() {
            ViewTreeObserver viewTreeObserver = this.f12843a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f12846d);
            }
            this.f12846d = null;
            this.f12844b.clear();
        }

        /* renamed from: d */
        public void mo21112d(x36 x36) {
            int g = mo21115g();
            int f = mo21114f();
            if (mo21117i(g, f)) {
                x36.mo12666e(g, f);
                return;
            }
            if (!this.f12844b.contains(x36)) {
                this.f12844b.add(x36);
            }
            if (this.f12846d == null) {
                ViewTreeObserver viewTreeObserver = this.f12843a.getViewTreeObserver();
                C2467a aVar = new C2467a(this);
                this.f12846d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo21113e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f12845c && this.f12843a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f12843a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return m18813c(this.f12843a.getContext());
        }

        /* renamed from: f */
        public final int mo21114f() {
            int i;
            int paddingTop = this.f12843a.getPaddingTop() + this.f12843a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f12843a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return mo21113e(this.f12843a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int mo21115g() {
            int i;
            int paddingLeft = this.f12843a.getPaddingLeft() + this.f12843a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f12843a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return mo21113e(this.f12843a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo21116h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo21117i(int i, int i2) {
            if (!mo21116h(i) || !mo21116h(i2)) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public final void mo21118j(int i, int i2) {
            Iterator it = new ArrayList(this.f12844b).iterator();
            while (it.hasNext()) {
                ((x36) it.next()).mo12666e(i, i2);
            }
        }

        /* renamed from: k */
        public void mo21119k(x36 x36) {
            this.f12844b.remove(x36);
        }
    }

    public he7(T t) {
        this.f12837a = (View) zt4.m31500d(t);
        this.f12838d = new C2466a(t);
    }

    /* renamed from: a */
    public void mo21090a(x36 x36) {
        this.f12838d.mo21112d(x36);
    }

    /* renamed from: d */
    public final Object mo21105d() {
        return this.f12837a.getTag(f12836s);
    }

    /* renamed from: f */
    public void mo19470f(Drawable drawable) {
        super.mo19470f(drawable);
        mo21106i();
    }

    /* renamed from: g */
    public ae5 mo21093g() {
        Object d = mo21105d();
        if (d == null) {
            return null;
        }
        if (d instanceof ae5) {
            return (ae5) d;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: h */
    public void mo19471h(Drawable drawable) {
        super.mo19471h(drawable);
        this.f12838d.mo21111b();
        if (!this.f12840g) {
            mo21107l();
        }
    }

    /* renamed from: i */
    public final void mo21106i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12839e;
        if (onAttachStateChangeListener != null && !this.f12841k) {
            this.f12837a.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f12841k = true;
        }
    }

    /* renamed from: j */
    public void mo21099j(ae5 ae5) {
        mo21108o(ae5);
    }

    /* renamed from: k */
    public void mo21100k(x36 x36) {
        this.f12838d.mo21119k(x36);
    }

    /* renamed from: l */
    public final void mo21107l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f12839e;
        if (onAttachStateChangeListener != null && this.f12841k) {
            this.f12837a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f12841k = false;
        }
    }

    /* renamed from: o */
    public final void mo21108o(Object obj) {
        f12835r = true;
        this.f12837a.setTag(f12836s, obj);
    }

    public String toString() {
        return "Target for: " + this.f12837a;
    }
}
