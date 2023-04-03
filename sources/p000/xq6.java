package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: xq6 */
/* compiled from: TintResources */
public class xq6 extends zf5 {

    /* renamed from: b */
    public final WeakReference<Context> f19956b;

    public xq6(Context context, Resources resources) {
        super(resources);
        this.f19956b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = mo28428a(i);
        Context context = this.f19956b.get();
        if (!(a == null || context == null)) {
            pf5.m24867h().mo24569x(context, i, a);
        }
        return a;
    }
}
