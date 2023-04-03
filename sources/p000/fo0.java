package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: fo0 */
/* compiled from: CompoundButtonCompat */
public final class fo0 {

    /* renamed from: fo0$a */
    /* compiled from: CompoundButtonCompat */
    public static class C2311a {
        /* renamed from: a */
        public static ColorStateList m17156a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m17157b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        /* renamed from: c */
        public static void m17158c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m17159d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: fo0$b */
    /* compiled from: CompoundButtonCompat */
    public static class C2312b {
        /* renamed from: a */
        public static Drawable m17160a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: a */
    public static Drawable m17152a(CompoundButton compoundButton) {
        return C2312b.m17160a(compoundButton);
    }

    /* renamed from: b */
    public static ColorStateList m17153b(CompoundButton compoundButton) {
        return C2311a.m17156a(compoundButton);
    }

    /* renamed from: c */
    public static void m17154c(CompoundButton compoundButton, ColorStateList colorStateList) {
        C2311a.m17158c(compoundButton, colorStateList);
    }

    /* renamed from: d */
    public static void m17155d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        C2311a.m17159d(compoundButton, mode);
    }
}
