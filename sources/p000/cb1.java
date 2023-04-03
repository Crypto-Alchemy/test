package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.squareup.picasso.C5453l;
import java.lang.ref.WeakReference;

/* renamed from: cb1 */
/* compiled from: DeferredRequestCreator */
public class cb1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public final C5453l f21650a;

    /* renamed from: d */
    public final WeakReference<ImageView> f21651d;

    /* renamed from: e */
    public q90 f21652e;

    public cb1(C5453l lVar, ImageView imageView, q90 q90) {
        this.f21650a = lVar;
        this.f21651d = new WeakReference<>(imageView);
        this.f21652e = q90;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* renamed from: a */
    public void mo29909a() {
        this.f21650a.mo39581b();
        this.f21652e = null;
        ImageView imageView = this.f21651d.get();
        if (imageView != null) {
            this.f21651d.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.f21651d.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f21651d.clear();
            this.f21650a.mo39592m().mo39590k(width, height).mo39586g(imageView, this.f21652e);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
