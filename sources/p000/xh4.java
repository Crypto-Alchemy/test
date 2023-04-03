package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: xh4 */
/* compiled from: OneShotPreDrawListener */
public final class xh4 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final View f19835a;

    /* renamed from: d */
    public ViewTreeObserver f19836d;

    /* renamed from: e */
    public final Runnable f19837e;

    public xh4(View view, Runnable runnable) {
        this.f19835a = view;
        this.f19836d = view.getViewTreeObserver();
        this.f19837e = runnable;
    }

    /* renamed from: a */
    public static xh4 m30102a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            xh4 xh4 = new xh4(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(xh4);
            view.addOnAttachStateChangeListener(xh4);
            return xh4;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo27735b() {
        if (this.f19836d.isAlive()) {
            this.f19836d.removeOnPreDrawListener(this);
        } else {
            this.f19835a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f19835a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo27735b();
        this.f19837e.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f19836d = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo27735b();
    }
}
