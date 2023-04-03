package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: md7 */
/* compiled from: ViewOverlayApi18 */
public class md7 implements od7 {

    /* renamed from: a */
    public final ViewOverlay f14942a;

    public md7(View view) {
        this.f14942a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo19230a(Drawable drawable) {
        this.f14942a.add(drawable);
    }

    /* renamed from: b */
    public void mo19231b(Drawable drawable) {
        this.f14942a.remove(drawable);
    }
}
