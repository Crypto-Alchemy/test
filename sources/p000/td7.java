package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: td7 */
/* compiled from: ViewPositionHolder */
public class td7 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final qd7 f18114a = qd7.m25607f();

    /* renamed from: d */
    public C3356b f18115d;

    /* renamed from: e */
    public View f18116e;

    /* renamed from: g */
    public View.OnAttachStateChangeListener f18117g;

    /* renamed from: k */
    public boolean f18118k;

    /* renamed from: td7$a */
    /* compiled from: ViewPositionHolder */
    public class C3355a implements View.OnAttachStateChangeListener {
        public C3355a() {
        }

        public void onViewAttachedToWindow(View view) {
            td7.this.mo26412f(view, true);
        }

        public void onViewDetachedFromWindow(View view) {
            td7.this.mo26412f(view, false);
        }
    }

    /* renamed from: td7$b */
    /* compiled from: ViewPositionHolder */
    public interface C3356b {
        /* renamed from: a */
        void mo25763a(qd7 qd7);
    }

    /* renamed from: d */
    public static boolean m27680d(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: e */
    public static boolean m27681e(View view) {
        return view.isLaidOut();
    }

    /* renamed from: b */
    public void mo26410b() {
        View view = this.f18116e;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.f18117g);
            mo26412f(this.f18116e, false);
        }
        this.f18114a.f16922a.setEmpty();
        this.f18114a.f16923b.setEmpty();
        this.f18114a.f16925d.setEmpty();
        this.f18116e = null;
        this.f18117g = null;
        this.f18115d = null;
        this.f18118k = false;
    }

    /* renamed from: c */
    public void mo26411c(View view, C3356b bVar) {
        mo26410b();
        this.f18116e = view;
        this.f18115d = bVar;
        C3355a aVar = new C3355a();
        this.f18117g = aVar;
        view.addOnAttachStateChangeListener(aVar);
        mo26412f(view, m27680d(view));
        if (m27681e(view)) {
            mo26414h();
        }
    }

    /* renamed from: f */
    public final void mo26412f(View view, boolean z) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        if (z) {
            view.getViewTreeObserver().addOnPreDrawListener(this);
        }
    }

    /* renamed from: g */
    public void mo26413g(boolean z) {
        if (this.f18118k != z) {
            this.f18118k = z;
            mo26414h();
        }
    }

    /* renamed from: h */
    public final void mo26414h() {
        View view = this.f18116e;
        if (view != null && this.f18115d != null && !this.f18118k && qd7.m25604b(this.f18114a, view)) {
            this.f18115d.mo25763a(this.f18114a);
        }
    }

    public boolean onPreDraw() {
        mo26414h();
        return true;
    }
}
