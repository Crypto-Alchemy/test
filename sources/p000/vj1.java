package p000;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: vj1 */
/* compiled from: DrawableUtils */
public final class vj1 {
    @TargetApi(21)
    /* renamed from: a */
    public static void m53413a(RippleDrawable rippleDrawable, int i) {
        rippleDrawable.setRadius(i);
    }

    /* renamed from: b */
    public static PorterDuffColorFilter m53414b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
