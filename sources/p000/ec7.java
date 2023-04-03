package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: ec7 */
/* compiled from: ViewGroupOverlayApi18 */
public class ec7 implements fc7 {

    /* renamed from: a */
    public final ViewGroupOverlay f11130a;

    public ec7(ViewGroup viewGroup) {
        this.f11130a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo19230a(Drawable drawable) {
        this.f11130a.add(drawable);
    }

    /* renamed from: b */
    public void mo19231b(Drawable drawable) {
        this.f11130a.remove(drawable);
    }

    /* renamed from: c */
    public void mo19232c(View view) {
        this.f11130a.add(view);
    }

    /* renamed from: d */
    public void mo19233d(View view) {
        this.f11130a.remove(view);
    }
}
