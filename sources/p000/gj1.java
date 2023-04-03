package p000;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: gj1 */
/* compiled from: DrawableAlphaProperty */
public class gj1 extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f29239b = new gj1();

    /* renamed from: a */
    public final WeakHashMap<Drawable, Integer> f29240a = new WeakHashMap<>();

    public gj1() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
