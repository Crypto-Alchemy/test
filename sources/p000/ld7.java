package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: ld7 */
/* compiled from: ViewOverlayApi18 */
public class ld7 implements nd7 {

    /* renamed from: a */
    public final ViewOverlay f31289a;

    public ld7(View view) {
        this.f31289a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo45422a(Drawable drawable) {
        this.f31289a.add(drawable);
    }

    /* renamed from: b */
    public void mo45423b(Drawable drawable) {
        this.f31289a.remove(drawable);
    }
}
