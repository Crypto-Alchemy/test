package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: pj1 */
/* compiled from: DrawableResource */
public abstract class pj1<T extends Drawable> implements bf5<T>, cu2 {

    /* renamed from: a */
    public final T f16499a;

    public pj1(T t) {
        this.f16499a = (Drawable) zt4.m31500d(t);
    }

    /* renamed from: b */
    public void mo18287b() {
        T t = this.f16499a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof jg2) {
            ((jg2) t).mo21829e().prepareToDraw();
        }
    }

    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.f16499a.getConstantState();
        if (constantState == null) {
            return this.f16499a;
        }
        return constantState.newDrawable();
    }
}
