package p000;

import android.graphics.drawable.Drawable;

/* renamed from: uj1 */
/* compiled from: DrawableUtils */
public class uj1 {
    /* renamed from: a */
    public static void m28301a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: b */
    public static int m28302b(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: c */
    public static int m28303c(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: d */
    public static void m28304d(Drawable drawable, Drawable.Callback callback, hw6 hw6) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof gw6) {
                ((gw6) drawable).mo20589f(hw6);
            }
        }
    }

    /* renamed from: e */
    public static void m28305e(Drawable drawable, oj1 oj1) {
        if (drawable != null && oj1 != null) {
            oj1.mo23960a(drawable);
        }
    }
}
